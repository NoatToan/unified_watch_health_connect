package org.acra.collector;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.acra.ReportField;
import org.acra.builder.ReportBuilder;
import org.acra.config.CoreConfiguration;
import org.acra.data.CrashReportData;

/* JADX INFO: loaded from: classes23.dex */
public final class StacktraceCollector extends BaseReportFieldCollector {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReportField.values().length];
            a = iArr;
            try {
                iArr[ReportField.STACK_TRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ReportField.STACK_TRACE_HASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public StacktraceCollector() {
        super(ReportField.STACK_TRACE, ReportField.STACK_TRACE_HASH);
    }

    @NonNull
    private String getStackTrace(@Nullable String str, @Nullable Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    printWriter.println(str);
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        printWriter.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        }
        if (th != null) {
            th.printStackTrace(printWriter);
        }
        String string = stringWriter.toString();
        printWriter.close();
        return string;
    }

    @NonNull
    private String getStackTraceHash(@Nullable Throwable th) {
        StringBuilder sb = new StringBuilder();
        while (th != null) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                sb.append(stackTraceElement.getClassName());
                sb.append(stackTraceElement.getMethodName());
            }
            th = th.getCause();
        }
        return Integer.toHexString(sb.toString().hashCode());
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(@NonNull ReportField reportField, @NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportBuilder reportBuilder, @NonNull CrashReportData crashReportData) {
        int i = a.a[reportField.ordinal()];
        if (i == 1) {
            crashReportData.put(ReportField.STACK_TRACE, getStackTrace(reportBuilder.getMessage(), reportBuilder.getException()));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            crashReportData.put(ReportField.STACK_TRACE_HASH, getStackTraceHash(reportBuilder.getException()));
        }
    }

    @Override // org.acra.collector.BaseReportFieldCollector, org.acra.collector.Collector
    @NonNull
    public Collector.Order getOrder() {
        return Collector.Order.FIRST;
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public boolean shouldCollect(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportField reportField, @NonNull ReportBuilder reportBuilder) {
        return reportField == ReportField.STACK_TRACE || super.shouldCollect(context, coreConfiguration, reportField, reportBuilder);
    }
}
