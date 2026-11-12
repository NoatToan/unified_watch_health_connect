package com.xiaomi.fitness.sleep.behavior.collection.acc;

import android.content.Context;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sleep.behavior.BehaviorConfiguration;
import com.xiaomi.fitness.sleep.behavior.BehaviorReportGenerator;
import com.xiaomi.fitness.sleep.behavior.collection.CollectionTask;
import com.xiaomi.fitness.sleep.behavior.collection.acc.AccCollectionTask;
import com.xiaomi.fitness.sleep.behavior.monitor.DeepLightSleepSession;
import com.xiaomi.fitness.sleep.trace.SleepTraceConfiguration;
import com.xiaomi.fitness.sleep.trace.db.SleepReport;
import com.xiaomi.fitness.sleep.trace.extensions.LogExtKt;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0014J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0014J\u001a\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/collection/acc/AccCollectionTask;", "Lcom/xiaomi/fitness/sleep/behavior/collection/CollectionTask;", "mContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mAccCollector", "Lcom/xiaomi/fitness/sleep/behavior/collection/acc/AccCollector;", "mAccDataStorageHelper", "Lcom/xiaomi/fitness/sleep/behavior/collection/acc/AccDataStorageHelper;", "mDeepLightSleepSession", "Lcom/xiaomi/fitness/sleep/behavior/monitor/DeepLightSleepSession;", "isActive", "", "()Z", "isGeneratorReport", "Ljava/util/concurrent/atomic/AtomicBoolean;", "performStartTask", "", "context", "performPauseTask", "performCancelTask", "performFinishTask", "result", "Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;", "performGenerateReport", "report", "getName", "", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccCollectionTask extends CollectionTask {

    @NotNull
    public static final String DEEP_LIGHT_COLLECT_FAIL = "deep_light_collect_fail";

    @NotNull
    public static final String DEEP_LIGHT_GENERATOR_SUCCESSFUL = "deep_light_sleep_report_successful";

    @NotNull
    public static final String NO_FALL_SLEEP = "deep_light_no_fall_sleep";

    @NotNull
    private static final String TAG = "AccCollectionTask";

    @NotNull
    private final AtomicBoolean isGeneratorReport;

    @NotNull
    private final AccCollector mAccCollector;

    @NotNull
    private final AccDataStorageHelper mAccDataStorageHelper;

    @NotNull
    private final Context mContext;

    @NotNull
    private final DeepLightSleepSession mDeepLightSleepSession;

    public AccCollectionTask(@NotNull Context mContext) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        this.mAccCollector = new AccCollector(mContext, 0, 2, null);
        this.mAccDataStorageHelper = new AccDataStorageHelper();
        this.mDeepLightSleepSession = new DeepLightSleepSession(mContext);
        this.isGeneratorReport = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performStartTask$lambda$0(AccCollectionTask this$0, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mAccDataStorageHelper.writeAccData(f, f2, f3);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sleep.behavior.collection.CollectionTask
    @NotNull
    public String getName() {
        return TAG;
    }

    @Override // com.xiaomi.fitness.sleep.behavior.collection.CollectionTask
    public boolean isActive() {
        boolean z = SleepTraceConfiguration.INSTANCE.isEnable(this.mContext) && BehaviorConfiguration.INSTANCE.isDeepLightSleepDetectionEnable();
        LogExtKt.logi("acc collect task' active is " + z);
        return z;
    }

    @Override // com.xiaomi.fitness.sleep.behavior.collection.CollectionTask
    public void performCancelTask(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BehaviorConfiguration.INSTANCE.cleanSleepDetectionStartTime();
        this.mAccCollector.stopCollect();
        this.mAccDataStorageHelper.clearAccOutputData(context);
        this.mDeepLightSleepSession.recordState(DeepLightSleepSession.DEEP_LIGHT_DETECTION_CANCEL);
    }

    @Override // com.xiaomi.fitness.sleep.behavior.collection.CollectionTask
    public void performFinishTask(@NotNull Context context, @Nullable SleepReport result) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.mDeepLightSleepSession.recordState(DeepLightSleepSession.DEEP_LIGHT_DETECTION_FINISH);
        this.mAccCollector.stopCollect();
        performGenerateReport(result);
    }

    public final void performGenerateReport(@Nullable SleepReport report) {
        long sleepTime;
        long wakeTime;
        try {
            if (this.isGeneratorReport.compareAndSet(false, true)) {
                BehaviorConfiguration behaviorConfiguration = BehaviorConfiguration.INSTANCE;
                long snailSleepDetectionStartTime = behaviorConfiguration.getSnailSleepDetectionStartTime();
                List<File> listStopAccDataStorage = this.mAccDataStorageHelper.stopAccDataStorage(this.mContext);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (report != null) {
                    sleepTime = report.getSleepTime();
                    wakeTime = report.getWakeTime();
                } else {
                    sleepTime = snailSleepDetectionStartTime;
                    wakeTime = jCurrentTimeMillis;
                }
                Logger.i("onReceiveGeneratorEvent: " + jCurrentTimeMillis, new Object[0]);
                BehaviorReportGenerator.Builder builder = new BehaviorReportGenerator.Builder();
                builder.setContext(this.mContext).setDetectionStartTime(snailSleepDetectionStartTime).setDetectionEndTime(jCurrentTimeMillis).setSleepTime(sleepTime).setWakeupTime(wakeTime).setFiles(listStopAccDataStorage);
                if (builder.build().startGenerateSnailAccSleepReport(report) == 2) {
                    this.mDeepLightSleepSession.closeSession(this.mContext);
                }
                behaviorConfiguration.cleanSleepDetectionStartTime();
                this.mAccDataStorageHelper.clearAccOutputData(this.mContext);
                this.isGeneratorReport.set(false);
            }
        } catch (Exception e) {
            Logger.w(TAG, "generate deep light fail, insert empty report :" + e);
        }
    }

    @Override // com.xiaomi.fitness.sleep.behavior.collection.CollectionTask
    public void performPauseTask(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.xiaomi.fitness.sleep.behavior.collection.CollectionTask
    public void performStartTask(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BehaviorConfiguration behaviorConfiguration = BehaviorConfiguration.INSTANCE;
        if (!behaviorConfiguration.hasSleepDetectionStartTime()) {
            this.mDeepLightSleepSession.openSession(context);
            this.mAccDataStorageHelper.clearAccOutputData(context);
            behaviorConfiguration.updateSleepDetectionStartTime(System.currentTimeMillis());
            behaviorConfiguration.cleanLastWriteDataTimeStamp();
        }
        LogExtKt.logi("start to collect acc");
        this.mAccDataStorageHelper.initAccConfig(context);
        this.mDeepLightSleepSession.recordState(DeepLightSleepSession.DEEP_LIGHT_DETECTION_START);
        this.mAccCollector.startCollect(new Function3() { // from class: j20
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AccCollectionTask.performStartTask$lambda$0(this.f22343a, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
            }
        });
    }
}
