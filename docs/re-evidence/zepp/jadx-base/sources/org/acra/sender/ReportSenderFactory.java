package org.acra.sender;

import android.content.Context;
import androidx.annotation.NonNull;
import org.acra.config.CoreConfiguration;
import org.acra.plugins.Plugin;

/* JADX INFO: loaded from: classes23.dex */
public interface ReportSenderFactory extends Plugin {
    @NonNull
    ReportSender create(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration);
}
