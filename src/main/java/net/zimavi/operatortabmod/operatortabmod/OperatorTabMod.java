package net.zimavi.operatortabmod.operatortabmod;

import net.fabricmc.api.ModInitializer;
import net.zimavi.operatortabmod.operatortabmod.items.OperatorItemGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class OperatorTabMod implements ModInitializer {

    public static final String MOD_ID = "operatortabmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Starting Operator Tab mod init!");
        OperatorItemGroup.register();
        LOGGER.info("Operator Tab mod initialized!");
        LOGGER.debug("This log made for github testing");
    }
}
