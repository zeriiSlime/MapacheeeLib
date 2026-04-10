package me.mapacheee.lib;

import com.thewinterframework.paper.PaperWinterPlugin;
import com.thewinterframework.plugin.WinterBootPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WinterBootPlugin
public class MapacheeeLibsPlugin extends PaperWinterPlugin {

    private static Logger LOGGER = LoggerFactory.getLogger(MapacheeeLibsPlugin.class);

    @Override
    public void onPluginEnable() {
        LOGGER.info("MapacheeeLibsPlugin is enabled!");
    }

    @Override
    public void onPluginDisable() {
        LOGGER.info("MapacheeeLibsPlugin is disabled!");
    }
}
