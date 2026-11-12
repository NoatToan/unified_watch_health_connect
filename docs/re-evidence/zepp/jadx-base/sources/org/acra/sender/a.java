package org.acra.sender;

import android.content.Context;
import androidx.annotation.NonNull;
import org.acra.ACRA;
import org.acra.data.CrashReportData;
import org.acra.util.BundleWrapper;

/* JADX INFO: loaded from: classes23.dex */
final class a implements ReportSender {
    @Override // org.acra.sender.ReportSender
    public /* synthetic */ boolean requiresForeground() {
        return c.a(this);
    }

    @Override // org.acra.sender.ReportSender
    public void send(@NonNull Context context, @NonNull CrashReportData crashReportData) {
        ACRA.log.w(ACRA.LOG_TAG, context.getPackageName() + " reports will NOT be sent - no valid ReportSender was found!");
    }

    @Override // org.acra.sender.ReportSender
    public /* synthetic */ void send(Context context, CrashReportData crashReportData, BundleWrapper bundleWrapper) throws ReportSenderException {
        c.c(this, context, crashReportData, bundleWrapper);
    }
}
