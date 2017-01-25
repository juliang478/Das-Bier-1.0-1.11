package com.galvanizer6.dasbier;

import org.apache.logging.log4j.Logger;

import com.galvanizer6.dasbier.init.ModItems;
import com.galvanizer6.dasbier.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MOD_ID, name=References.MOD_NAME, version = References.VERSION, acceptedMinecraftVersions= "[1.11, 1.11.2]")
public class DasBierMain
{   
	@SidedProxy(clientSide = References.CLIENT_SIDE, serverSide = References.SERVER_SIDE)
    public static CommonProxy proxy;
	
	@Instance(References.MOD_ID)
	public static DasBierMain instance;
	
	public static Logger logger;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
		ModItems.init();
		ModItems.register();
	}	
	
    @EventHandler
    public void init(FMLInitializationEvent event) {
      proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	proxy.postInit(event);
    }
}
