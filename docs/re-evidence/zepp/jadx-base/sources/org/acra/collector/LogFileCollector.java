package org.acra.collector;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.IOException;
import org.acra.ReportField;
import org.acra.builder.ReportBuilder;
import org.acra.config.CoreConfiguration;
import org.acra.data.CrashReportData;
import org.acra.util.StreamReader;

/* JADX INFO: loaded from: classes23.dex */
public final class LogFileCollector extends BaseReportFieldCollector {
    public LogFileCollector() {
        super(ReportField.APPLICATION_LOG, new ReportField[0]);
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(@NonNull ReportField reportField, @NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportBuilder reportBuilder, @NonNull CrashReportData crashReportData) throws IOException {
        crashReportData.put(ReportField.APPLICATION_LOG, new StreamReader(coreConfiguration.applicationLogFileDir().getFile(context, coreConfiguration.applicationLogFile())).setLimit(coreConfiguration.applicationLogFileLines()).read());
    }

    @Override // org.acra.collector.BaseReportFieldCollector, org.acra.collector.Collector
    @NonNull
    public Collector.Order getOrder() {
        return Collector.Order.LATE;
    }
}
