package com.huami.chart.util;

import androidx.annotation.Nullable;
import com.huami.tools.crashreport.HuamiCrashReport;
import java.lang.reflect.Field;
import org.acra.ACRA;
import org.acra.builder.ReportExecutor;
import org.acra.reporter.ErrorReporterImpl;

/* JADX INFO: loaded from: classes6.dex */
public class ReportChartError {
    public static final String IS_CHART_MANUAL_REPORT = "IS_CHART_MANUAL_REPORT";

    private static void a(@Nullable Throwable th) {
        ACRA.getErrorReporter().putCustomData(IS_CHART_MANUAL_REPORT, "true");
        ACRA.getErrorReporter().handleSilentException(th);
        ACRA.getErrorReporter().removeCustomData(IS_CHART_MANUAL_REPORT);
    }

    private static boolean b() {
        if (ACRA.getErrorReporter() instanceof ErrorReporterImpl) {
            ErrorReporterImpl errorReporterImpl = (ErrorReporterImpl) ACRA.getErrorReporter();
            try {
                Field declaredField = errorReporterImpl.getClass().getDeclaredField("reportExecutor");
                declaredField.setAccessible(true);
                return ((ReportExecutor) declaredField.get(errorReporterImpl)).isEnabled();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static synchronized void manualReportError(Throwable th) {
        if (ACRA.isInitialised()) {
            if (b()) {
                a(th);
            } else {
                HuamiCrashReport huamiCrashReport = HuamiCrashReport.INSTANCE;
                huamiCrashReport.setEnable(true);
                a(th);
                huamiCrashReport.setEnable(false);
            }
        }
    }
}
