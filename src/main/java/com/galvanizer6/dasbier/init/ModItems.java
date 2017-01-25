package com.galvanizer6.dasbier.init;

import com.galvanizer6.dasbier.References;
import com.galvanizer6.dasbier.items.ItemBeerBottle;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	
	public static Item beer_bottle;
	
	public static void init() {
		beer_bottle = new ItemBeerBottle();
	}
	
	public static void register() {
		GameRegistry.register(beer_bottle);
	}
	
	public static void registerRenders() {
		registerRender(beer_bottle);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(References.RESOURCE_PREFIX + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
