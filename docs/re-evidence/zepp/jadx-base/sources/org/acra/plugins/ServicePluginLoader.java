package org.acra.plugins;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import org.acra.ACRA;
import org.acra.config.CoreConfiguration;
import org.acra.plugins.Plugin;
import org.acra.plugins.ServicePluginLoader;
import org.acra.util.Predicate;

/* JADX INFO: loaded from: classes23.dex */
public class ServicePluginLoader implements PluginLoader {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean c(Plugin plugin) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean e(CoreConfiguration coreConfiguration, Plugin plugin) {
        return plugin.enabled(coreConfiguration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T extends Plugin> List<T> f(@NonNull Class<T> cls, Predicate<T> predicate) {
        ArrayList arrayList = new ArrayList();
        ServiceLoader<Plugin> serviceLoaderLoad = ServiceLoader.load(cls, getClass().getClassLoader());
        if (ACRA.DEV_LOGGING) {
            ACRA.log.d(ACRA.LOG_TAG, "ServicePluginLoader loading services from ServiceLoader : " + serviceLoaderLoad);
        }
        for (Plugin plugin : serviceLoaderLoad) {
            try {
                try {
                    if (predicate.apply(plugin)) {
                        if (ACRA.DEV_LOGGING) {
                            ACRA.log.d(ACRA.LOG_TAG, "Loaded " + cls.getSimpleName() + " of type " + plugin.getClass().getName());
                        }
                        arrayList.add(plugin);
                    } else if (ACRA.DEV_LOGGING) {
                        ACRA.log.d(ACRA.LOG_TAG, "Ignoring disabled " + cls.getSimpleName() + " of type " + plugin.getClass().getSimpleName());
                    }
                } catch (ServiceConfigurationError e) {
                    ACRA.log.e(ACRA.LOG_TAG, "Unable to load " + cls.getSimpleName(), e);
                }
            } catch (ServiceConfigurationError e2) {
                ACRA.log.e(ACRA.LOG_TAG, "Broken ServiceLoader for " + cls.getSimpleName(), e2);
            }
        }
        return arrayList;
    }

    @Override // org.acra.plugins.PluginLoader
    public <T extends Plugin> List<T> load(@NonNull Class<T> cls) {
        return f(cls, new Predicate() { // from class: ko6
            @Override // org.acra.util.Predicate
            public final boolean apply(Object obj) {
                return ServicePluginLoader.c((Plugin) obj);
            }
        });
    }

    @Override // org.acra.plugins.PluginLoader
    public <T extends Plugin> List<T> loadEnabled(@NonNull final CoreConfiguration coreConfiguration, @NonNull Class<T> cls) {
        return f(cls, new Predicate() { // from class: jo6
            @Override // org.acra.util.Predicate
            public final boolean apply(Object obj) {
                return ServicePluginLoader.e(coreConfiguration, (Plugin) obj);
            }
        });
    }
}
