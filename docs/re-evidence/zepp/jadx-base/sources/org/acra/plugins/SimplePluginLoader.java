package org.acra.plugins;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.acra.ACRA;
import org.acra.config.CoreConfiguration;

/* JADX INFO: loaded from: classes23.dex */
public class SimplePluginLoader implements PluginLoader {
    private final Class<? extends Plugin>[] a;

    @SafeVarargs
    public SimplePluginLoader(@NonNull Class<? extends Plugin>... clsArr) {
        this.a = clsArr;
    }

    @Override // org.acra.plugins.PluginLoader
    public <T extends Plugin> List<T> load(@NonNull Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        if (ACRA.DEV_LOGGING) {
            ACRA.log.d(ACRA.LOG_TAG, "SimplePluginLoader loading services from plugin classes : " + this.a);
        }
        for (Class<? extends Plugin> cls2 : this.a) {
            if (cls.isAssignableFrom(cls2)) {
                try {
                    arrayList.add(cls2.newInstance());
                    if (ACRA.DEV_LOGGING) {
                        ACRA.log.d(ACRA.LOG_TAG, "Loaded plugin from class : " + cls2);
                    }
                } catch (Exception e) {
                    if (ACRA.DEV_LOGGING) {
                        ACRA.log.w(ACRA.LOG_TAG, "Could not load plugin from class : " + cls2, e);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // org.acra.plugins.PluginLoader
    public <T extends Plugin> List<T> loadEnabled(@NonNull CoreConfiguration coreConfiguration, @NonNull Class<T> cls) {
        List<T> listLoad = load(cls);
        Iterator<T> it2 = listLoad.iterator();
        while (it2.hasNext()) {
            T next = it2.next();
            if (!next.enabled(coreConfiguration)) {
                if (ACRA.DEV_LOGGING) {
                    ACRA.log.d(ACRA.LOG_TAG, "Removing disabled plugin : " + next);
                }
                it2.remove();
            }
        }
        return listLoad;
    }
}
