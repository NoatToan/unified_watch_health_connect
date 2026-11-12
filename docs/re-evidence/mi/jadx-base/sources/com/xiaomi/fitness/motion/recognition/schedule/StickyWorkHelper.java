package com.xiaomi.fitness.motion.recognition.schedule;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.a;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.motion.recognition.schedule.StickyWorkHelper;
import com.xiaomi.fitness.motion.recognition.utils.SceneUtils;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/schedule/StickyWorkHelper;", "", "<init>", "()V", "SCENE_STICKY", "", "KEY_ACTION", "startStickyWork", "", "context", "Landroid/content/Context;", "action", "StickyWorker", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StickyWorkHelper {

    @NotNull
    public static final StickyWorkHelper INSTANCE = new StickyWorkHelper();

    @NotNull
    private static final String KEY_ACTION = "action";

    @NotNull
    private static final String SCENE_STICKY = "scene:sticky";

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/schedule/StickyWorkHelper$StickyWorker;", "Landroidx/work/Worker;", "Landroidx/work/a$a;", "doWork", "()Landroidx/work/a$a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class StickyWorker extends Worker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StickyWorker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
            super(context, workerParams);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        }

        @Override // androidx.work.Worker
        @NotNull
        public a.AbstractC0080a doWork() {
            SceneUtils.INSTANCE.sceneRecoTrace("sticky worker start");
            Data inputData = getInputData();
            Intrinsics.checkNotNullExpressionValue(inputData, "getInputData(...)");
            String string = inputData.getString("action");
            if (TextUtils.isEmpty(string) || string == null) {
                a.AbstractC0080a abstractC0080aC = a.AbstractC0080a.c();
                Intrinsics.checkNotNullExpressionValue(abstractC0080aC, "success(...)");
                return abstractC0080aC;
            }
            try {
                SceneRecognitionScheduler sceneRecognitionScheduler = SceneRecognitionScheduler.INSTANCE;
                Context applicationContext = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                sceneRecognitionScheduler.onHandleAction(applicationContext, string);
                a.AbstractC0080a abstractC0080aC2 = a.AbstractC0080a.c();
                Intrinsics.checkNotNullExpressionValue(abstractC0080aC2, "success(...)");
                return abstractC0080aC2;
            } catch (Exception e) {
                Logger.e(SceneUtils.TAG, "stick work error " + e);
                a.AbstractC0080a abstractC0080aB = a.AbstractC0080a.b();
                Intrinsics.checkNotNullExpressionValue(abstractC0080aB, "retry(...)");
                return abstractC0080aB;
            }
        }
    }

    private StickyWorkHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startStickyWork$lambda$0(Context context, String action) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(action, "$action");
        SceneRecognitionScheduler.INSTANCE.onHandleAction(context, action);
        WorkManager.INSTANCE.getInstance(context).cancelUniqueWork(SCENE_STICKY);
        SceneUtils.INSTANCE.sceneRecoTrace("sticky work done");
    }

    public final void startStickyWork(@NotNull final Context context, @NotNull final String action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        Data.Builder builder = new Data.Builder();
        Objects.requireNonNull(action);
        WorkManager.INSTANCE.getInstance(context).enqueueUniqueWork(SCENE_STICKY, ExistingWorkPolicy.REPLACE, new OneTimeWorkRequest.Builder((Class<? extends a>) StickyWorker.class).setInputData(builder.putString("action", action).build()).setInitialDelay(1L, TimeUnit.MINUTES).build());
        ExecutorHelper.runInBackground(new Runnable() { // from class: ufo
            @Override // java.lang.Runnable
            public final void run() {
                StickyWorkHelper.startStickyWork$lambda$0(context, action);
            }
        });
    }
}
