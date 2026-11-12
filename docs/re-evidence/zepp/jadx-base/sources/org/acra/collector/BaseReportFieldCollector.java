package org.acra.collector;

import android.content.Context;
import androidx.annotation.NonNull;
import defpackage.l16;
import defpackage.yw0;
import org.acra.ReportField;
import org.acra.builder.ReportBuilder;
import org.acra.config.CoreConfiguration;
import org.acra.data.CrashReportData;

/* JADX INFO: loaded from: classes23.dex */
abstract class BaseReportFieldCollector implements Collector {
    private final ReportField[] reportFields;

    public BaseReportFieldCollector(@NonNull ReportField reportField, @NonNull ReportField... reportFieldArr) {
        ReportField[] reportFieldArr2 = new ReportField[reportFieldArr.length + 1];
        this.reportFields = reportFieldArr2;
        reportFieldArr2[0] = reportField;
        if (reportFieldArr.length > 0) {
            System.arraycopy(reportFieldArr, 0, reportFieldArr2, 1, reportFieldArr.length);
        }
    }

    @Override // org.acra.collector.Collector
    public final void collect(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportBuilder reportBuilder, @NonNull CrashReportData crashReportData) throws CollectorException {
        for (ReportField reportField : this.reportFields) {
            try {
                if (shouldCollect(context, coreConfiguration, reportField, reportBuilder)) {
                    collect(reportField, context, coreConfiguration, reportBuilder, crashReportData);
                }
            } catch (Exception e) {
                crashReportData.put(reportField, (String) null);
                throw new CollectorException("Error while retrieving " + reportField.name() + " data:" + e.getMessage(), e);
            }
        }
    }

    public abstract void collect(@NonNull ReportField reportField, @NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportBuilder reportBuilder, @NonNull CrashReportData crashReportData) throws Exception;

    @Override // org.acra.plugins.Plugin
    public /* synthetic */ boolean enabled(CoreConfiguration coreConfiguration) {
        return l16.a(this, coreConfiguration);
    }

    @Override // org.acra.collector.Collector
    public /* synthetic */ Collector.Order getOrder() {
        return yw0.a(this);
    }

    public boolean shouldCollect(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportField reportField, @NonNull ReportBuilder reportBuilder) {
        return coreConfiguration.reportContent().contains(reportField);
    }
}
