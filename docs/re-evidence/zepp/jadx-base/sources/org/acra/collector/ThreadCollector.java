package org.acra.collector;

import android.content.Context;
import androidx.annotation.NonNull;
import org.acra.ReportField;
import org.acra.builder.ReportBuilder;
import org.acra.config.CoreConfiguration;
import org.acra.data.CrashReportData;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public final class ThreadCollector extends BaseReportFieldCollector {
    public ThreadCollector() {
        super(ReportField.THREAD_DETAILS, new ReportField[0]);
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(@NonNull ReportField reportField, @NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportBuilder reportBuilder, @NonNull CrashReportData crashReportData) throws Exception {
        Thread uncaughtExceptionThread = reportBuilder.getUncaughtExceptionThread();
        if (uncaughtExceptionThread == null) {
            crashReportData.put(ReportField.THREAD_DETAILS, (String) null);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uncaughtExceptionThread.getId());
        jSONObject.put("name", uncaughtExceptionThread.getName());
        jSONObject.put("priority", uncaughtExceptionThread.getPriority());
        if (uncaughtExceptionThread.getThreadGroup() != null) {
            jSONObject.put("groupName", uncaughtExceptionThread.getThreadGroup().getName());
        }
        crashReportData.put(ReportField.THREAD_DETAILS, jSONObject);
    }

    @Override // org.acra.collector.BaseReportFieldCollector, org.acra.collector.Collector
    @NonNull
    public Collector.Order getOrder() {
        return Collector.Order.LATE;
    }
}
