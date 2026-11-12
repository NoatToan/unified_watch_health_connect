package org.acra.scheduler;

import android.content.Context;
import androidx.annotation.NonNull;
import org.acra.config.CoreConfiguration;
import org.acra.plugins.Plugin;

/* JADX INFO: loaded from: classes23.dex */
public interface SenderSchedulerFactory extends Plugin {
    @NonNull
    SenderScheduler create(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration);
}
