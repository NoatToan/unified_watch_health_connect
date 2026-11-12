package org.acra.sender;

import android.content.Context;
import androidx.annotation.NonNull;
import org.acra.data.CrashReportData;
import org.acra.util.BundleWrapper;

/* JADX INFO: loaded from: classes23.dex */
public interface ReportSender {
    boolean requiresForeground();

    void send(@NonNull Context context, @NonNull CrashReportData crashReportData) throws ReportSenderException;

    void send(@NonNull Context context, @NonNull CrashReportData crashReportData, @NonNull BundleWrapper bundleWrapper) throws ReportSenderException;
}
