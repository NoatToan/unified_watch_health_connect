package com.huami.feedback.autowork;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import com.huami.tools.log.HMLog;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\"\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0016\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroid/content/Context;", "appContext", "", "enableAutoUpload", "cancelAutoUpload", "", "a", "Ljava/lang/String;", "FEEDBACK_WORK_NAME", "", "b", "J", "FEEDBACK_DELAY_DURATION", "c", "FEEDBACK_REPEAT_INTERVAL", "feedback-impl_release"}, k = 2, mv = {1, 5, 1})
public final class AutoUploadAppLogConfigKt {

    @NotNull
    private static final String a = "autoUploadAppLogWork";
    private static final long b = 10;
    private static final long c = 24;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "取消每天上传日志的任务";
        }
    }

    public static final void cancelAutoUpload(@NotNull Context context) {
        WorkManager.getInstance(context).cancelUniqueWork(a);
        HMLog.info("feedback", a.a);
    }

    public static final void enableAutoUpload(@NotNull Context context) {
        WorkManager.getInstance(context).enqueueUniquePeriodicWork(a, ExistingPeriodicWorkPolicy.KEEP, new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) UploadLogWork.class, c, TimeUnit.HOURS).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.UNMETERED).build()).setInitialDelay(10L, TimeUnit.MINUTES).build());
    }
}
