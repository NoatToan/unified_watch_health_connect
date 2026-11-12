package org.acra.plugins;

import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.List;
import org.acra.config.CoreConfiguration;

/* JADX INFO: loaded from: classes23.dex */
public interface PluginLoader extends Serializable {
    <T extends Plugin> List<T> load(@NonNull Class<T> cls);

    <T extends Plugin> List<T> loadEnabled(@NonNull CoreConfiguration coreConfiguration, @NonNull Class<T> cls);
}
