package org.acra;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.acra.scheduler.SenderScheduler;

/* JADX INFO: loaded from: classes23.dex */
public interface ErrorReporter {
    void clearCustomData();

    String getCustomData(@NonNull String str);

    SenderScheduler getReportScheduler();

    void handleException(@Nullable Throwable th);

    void handleException(@Nullable Throwable th, boolean z);

    void handleSilentException(@Nullable Throwable th);

    String putCustomData(@NonNull String str, String str2);

    String removeCustomData(@NonNull String str);

    void setEnabled(boolean z);
}
