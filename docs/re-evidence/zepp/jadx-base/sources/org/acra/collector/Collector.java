package org.acra.collector;

import android.content.Context;
import androidx.annotation.NonNull;
import org.acra.builder.ReportBuilder;
import org.acra.config.CoreConfiguration;
import org.acra.data.CrashReportData;
import org.acra.plugins.Plugin;

/* JADX INFO: loaded from: classes23.dex */
public interface Collector extends Plugin {

    public enum Order {
        FIRST,
        EARLY,
        NORMAL,
        LATE,
        LAST
    }

    void collect(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportBuilder reportBuilder, @NonNull CrashReportData crashReportData) throws CollectorException;

    @NonNull
    Order getOrder();
}
