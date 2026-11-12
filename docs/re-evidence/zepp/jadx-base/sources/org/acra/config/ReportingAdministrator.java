package org.acra.config;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.acra.builder.LastActivityManager;
import org.acra.builder.ReportBuilder;
import org.acra.data.CrashReportData;
import org.acra.plugins.Plugin;

/* JADX INFO: loaded from: classes23.dex */
public interface ReportingAdministrator extends Plugin {
    void notifyReportDropped(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration);

    boolean shouldFinishActivity(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration, LastActivityManager lastActivityManager);

    boolean shouldKillApplication(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportBuilder reportBuilder, @Nullable CrashReportData crashReportData);

    boolean shouldSendReport(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull CrashReportData crashReportData);

    boolean shouldStartCollecting(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportBuilder reportBuilder);
}
