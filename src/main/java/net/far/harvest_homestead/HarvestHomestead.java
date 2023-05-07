package net.far.harvest_homestead;

import net.fabricmc.api.ModInitializer;
import net.far.harvest_homestead.item.ModItemGroups;
import net.far.harvest_homestead.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HarvestHomestead implements ModInitializer {
	public static final String MOD_ID = "harvest_homestead";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}