package org.acra.collector;

import android.content.Context;
import androidx.annotation.NonNull;
import org.acra.config.CoreConfiguration;

/* JADX INFO: loaded from: classes23.dex */
public interface ApplicationStartupCollector extends Collector {
    void collectApplicationStartUp(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration);
}
