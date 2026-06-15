package me.mapacheee.lib;

import com.google.common.base.Preconditions;

public interface MapacheeeLibPluginAPI {
    final class Provider {
        private static MapacheeeLibPluginAPI instance;

        private Provider() {}

        public static MapacheeeLibPluginAPI getInstance() {
            Preconditions.checkNotNull(instance, "MapacheeeLibPluginAPI instance has not been set yet");
            return instance;
        }

        public static void setInstance(final MapacheeeLibPluginAPI newInstance) {
            Preconditions.checkNotNull(newInstance, "MapacheeeLibPluginAPI instance cannot be null");
            Preconditions.checkArgument(instance == null, "MapacheeeLibPluginAPI instance has already been set");
            Provider.instance = newInstance;
        }
    }
}
