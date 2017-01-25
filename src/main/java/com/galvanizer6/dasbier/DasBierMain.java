package com.galvanizer6.dasbier;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MOD_ID, name=References.MOD_NAME, version = References.VERSION, acceptedMinecraftVersions= "[1.11, 1.11.2]")
public class DasBierMain
{   
    
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		
	}
	
	
    @EventHandler
    public void init(FMLInitializationEvent event) {
      
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }
}
