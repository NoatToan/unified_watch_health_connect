package com.xiaomi.fitness.feedback.bugreport;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.feedback.bugreport.FeedBackDumpLogReceiver;
import com.xiaomi.fitness.feedback.util.FeedbackFileUtils;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/FeedBackDumpLogReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "ACTION_DUMP_CACHED_LOG", "", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "copyLogFile", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FeedBackDumpLogReceiver extends BroadcastReceiver {

    @NotNull
    private final String ACTION_DUMP_CACHED_LOG = "com.miui.core.intent.ACTION_DUMP_CACHED_LOG";

    private final void copyLogFile(final Context context) {
        File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir("");
        Intrinsics.checkNotNull(externalFilesDir);
        final String str = externalFilesDir.getAbsolutePath() + "/MIUI/debug_log/" + context.getPackageName() + "/dump/";
        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNull(executorServiceNewSingleThreadExecutor);
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: sh9
            @Override // java.lang.Runnable
            public final void run() {
                FeedBackDumpLogReceiver.copyLogFile$lambda$1(context, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copyLogFile$lambda$1(Context context, String targetFilePath) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(targetFilePath, "$targetFilePath");
        try {
            FeedbackFileUtils feedbackFileUtils = FeedbackFileUtils.INSTANCE;
            String externalFilesDirPath = feedbackFileUtils.getExternalFilesDirPath(context, feedbackFileUtils.getLOG_DIR());
            if (externalFilesDirPath != null) {
                feedbackFileUtils.copyDirOrFile(context, externalFilesDirPath, targetFilePath);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        TextUtils.equals(intent.getAction(), this.ACTION_DUMP_CACHED_LOG);
    }
}
