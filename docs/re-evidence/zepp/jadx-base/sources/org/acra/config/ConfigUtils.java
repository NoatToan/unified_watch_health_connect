package org.acra.config;

import androidx.annotation.NonNull;
import java.util.Iterator;
import org.acra.ACRA;

/* JADX INFO: loaded from: classes23.dex */
public final class ConfigUtils {
    @NonNull
    public static <T extends Configuration> T getPluginConfiguration(@NonNull CoreConfiguration coreConfiguration, @NonNull Class<T> cls) {
        if (ACRA.DEV_LOGGING) {
            ACRA.log.d(ACRA.LOG_TAG, "Checking plugin Configurations : " + coreConfiguration.pluginConfigurations() + " for class : " + cls);
        }
        Iterator<Configuration> it2 = coreConfiguration.pluginConfigurations().iterator();
        while (it2.hasNext()) {
            T t = (T) it2.next();
            if (ACRA.DEV_LOGGING) {
                ACRA.log.d(ACRA.LOG_TAG, "Checking plugin Configuration : " + t + " against plugin class : " + cls);
            }
            if (cls.isAssignableFrom(t.getClass())) {
                return t;
            }
        }
        throw new IllegalArgumentException(cls.getName() + " is no registered configuration");
    }
}
