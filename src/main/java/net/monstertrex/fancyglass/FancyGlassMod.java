package net.monstertrex.fancyglass;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FancyGlassMod implements ModInitializer {
	public static final String MOD_ID = "fancyglass";
    public static final Logger LOGGER = LoggerFactory.getLogger("fancyglass");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}