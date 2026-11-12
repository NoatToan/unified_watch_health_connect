package org.acra.sender;

import android.content.Context;
import androidx.annotation.NonNull;
import org.acra.data.CrashReportData;
import org.acra.util.BundleWrapper;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class c {
    public static boolean a(ReportSender reportSender) {
        return false;
    }

    public static void b(@NonNull ReportSender reportSender, @NonNull Context context, CrashReportData crashReportData) throws ReportSenderException {
    }

    public static void c(@NonNull ReportSender _this, @NonNull Context context, @NonNull CrashReportData crashReportData, BundleWrapper bundleWrapper) throws ReportSenderException {
        _this.send(context, crashReportData);
    }
}
