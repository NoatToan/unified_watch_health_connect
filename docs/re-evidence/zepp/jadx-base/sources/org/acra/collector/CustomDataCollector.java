package org.acra.collector;

import android.content.Context;
import androidx.annotation.NonNull;
import org.acra.ReportField;
import org.acra.builder.ReportBuilder;
import org.acra.config.CoreConfiguration;
import org.acra.data.CrashReportData;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public final class CustomDataCollector extends BaseReportFieldCollector {
    public CustomDataCollector() {
        super(ReportField.CUSTOM_DATA, new ReportField[0]);
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(@NonNull ReportField reportField, @NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportBuilder reportBuilder, @NonNull CrashReportData crashReportData) {
        crashReportData.put(ReportField.CUSTOM_DATA, new JSONObject(reportBuilder.getCustomData()));
    }
}
