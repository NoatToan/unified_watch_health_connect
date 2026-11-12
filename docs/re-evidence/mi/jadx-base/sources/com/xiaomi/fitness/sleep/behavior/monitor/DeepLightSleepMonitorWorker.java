package com.xiaomi.fitness.sleep.behavior.monitor;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.a;
import com.xiaomi.fitness.sleep.behavior.BehaviorConfiguration;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/monitor/DeepLightSleepMonitorWorker;", "Landroidx/work/Worker;", "Landroidx/work/a$a;", "doWork", "()Landroidx/work/a$a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeepLightSleepMonitorWorker extends Worker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String EVENT_KEY = "deep_light_sleep_monitor";

    @NotNull
    private static final String ID_MONITOR_WORK = "snailsleep:id:monitor";

    @NotNull
    private static final String KEY_DATA_PATH = "data_path";

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/monitor/DeepLightSleepMonitorWorker$Companion;", "", "<init>", "()V", "ID_MONITOR_WORK", "", "KEY_DATA_PATH", "EVENT_KEY", "startSleepDetectionMonitorWorker", "", "context", "Landroid/content/Context;", "dataPath", "cancelSleepDetectionMonitorWorker", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void cancelSleepDetectionMonitorWorker(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            WorkManager.INSTANCE.getInstance(context).cancelUniqueWork(DeepLightSleepMonitorWorker.ID_MONITOR_WORK);
        }

        public final void startSleepDetectionMonitorWorker(@NotNull Context context, @Nullable String dataPath) {
            Intrinsics.checkNotNullParameter(context, "context");
            long scheduleGetUpTime = BehaviorConfiguration.INSTANCE.getScheduleGetUpTime();
            if (scheduleGetUpTime < System.currentTimeMillis()) {
                scheduleGetUpTime += TimeUnit.DAYS.toMillis(1L);
            }
            WorkManager.INSTANCE.getInstance(context).enqueueUniqueWork(DeepLightSleepMonitorWorker.ID_MONITOR_WORK, ExistingWorkPolicy.REPLACE, new OneTimeWorkRequest.Builder((Class<? extends a>) DeepLightSleepMonitorWorker.class).setInitialDelay((scheduleGetUpTime + TimeUnit.HOURS.toMillis(2L)) - System.currentTimeMillis(), TimeUnit.MILLISECONDS).setInputData(new Data.Builder().putString(DeepLightSleepMonitorWorker.KEY_DATA_PATH, dataPath).build()).build());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeepLightSleepMonitorWorker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    @Override // androidx.work.Worker
    @NotNull
    public a.AbstractC0080a doWork() {
        Data inputData = getInputData();
        Intrinsics.checkNotNullExpressionValue(inputData, "getInputData(...)");
        String string = inputData.getString(KEY_DATA_PATH);
        if (TextUtils.isEmpty(string)) {
            a.AbstractC0080a abstractC0080aC = a.AbstractC0080a.c();
            Intrinsics.checkNotNullExpressionValue(abstractC0080aC, "success(...)");
            return abstractC0080aC;
        }
        File file = new File(string);
        if (file.exists()) {
            file.delete();
        }
        a.AbstractC0080a abstractC0080aC2 = a.AbstractC0080a.c();
        Intrinsics.checkNotNullExpressionValue(abstractC0080aC2, "success(...)");
        return abstractC0080aC2;
    }
}
