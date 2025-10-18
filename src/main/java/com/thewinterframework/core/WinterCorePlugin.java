package com.thewinterframework.core;

import com.thewinterframework.paper.PaperWinterPlugin;
import com.thewinterframework.plugin.WinterBootPlugin;

@WinterBootPlugin
public class WinterCorePlugin extends PaperWinterPlugin {

    @Override
    public void onPluginEnable() {
        getLogger().info("WinterCore enabled");
    }

    @Override
    public void onPluginDisable() {
        getLogger().info("WinterCore enabled disabled");
    }
}
