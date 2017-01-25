package com.galvanizer6.dasbier;

public class References {
	
	 public static final String MOD_ID = "das_bier";
	 public	static final String MOD_NAME = "Das Bier";
	 public static final String VERSION = "1.0-1.11";
	 public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":";
	 public static final String CLIENT_SIDE = "com.galvanizer6.dasbier.proxy.ClientProxy";
	 public static final String SERVER_SIDE = "com.galvanizer6.dasbier.proxy.CommonProxy";
	 public static enum DasBierItems {
		 BEERBOTTLE("beer_bottle", "ItemBeerBottle");
		 
		 private String unlocalizedName;
		 private String registryName;
		 
		 DasBierItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
		 	this.registryName = registryName;
		 }

		public String getUnlocalizedName() {
			return unlocalizedName;
		}

		public String getRegistryName() {
			return registryName;
		}
		 
		 
	 }

}
