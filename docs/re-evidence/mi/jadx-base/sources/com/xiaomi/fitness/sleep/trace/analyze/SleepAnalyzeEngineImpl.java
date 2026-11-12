package com.xiaomi.fitness.sleep.trace.analyze;

import android.content.Context;
import androidx.collection.ArrayMap;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.sleep.trace.OnResult;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzeEngineImpl;
import com.xiaomi.fitness.sleep.trace.db.SleepReport;
import com.xiaomi.fitness.sleep.trace.db.SleepReportProfile;
import com.xiaomi.fitness.sleep.trace.util.DateNumHelper;
import defpackage.l0d;
import defpackage.tee;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b)\u0010*J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0007\u0010\nJ)\u0010\u0010\u001a\u00020\u00062\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0010\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010!\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0017¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/analyze/SleepAnalyzeEngineImpl;", "Lcom/xiaomi/fitness/sleep/trace/analyze/SleepAnalyzeEngine;", "Landroid/content/Context;", "context", "Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;", "input", "", "asyncUpgradeReportIfNeed", "(Landroid/content/Context;Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;)V", "", "(Landroid/content/Context;Ljava/util/List;)V", "", "", "Ll0d;", "Lcom/xiaomi/fitness/sleep/trace/analyze/SleepAnalyzer;", "m", "onInitializeAnalyze", "(Ljava/util/Map;)V", "", "dateTimeMillis", "", "generateIfNeed", "Landroidx/lifecycle/LiveData;", "getAnalysisReport", "(Landroid/content/Context;JZ)Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fitness/sleep/trace/OnResult;", "onResult", "startGenerateReport", "(Landroid/content/Context;JLcom/xiaomi/fitness/sleep/trace/OnResult;)V", "isGenerating", "(J)Z", "sleepTime", "wakeTime", "updateSleepDuration", "(Landroid/content/Context;JJJ)V", "Lcom/xiaomi/fitness/sleep/trace/analyze/SleepReportGenerator;", "mGenerator", "Lcom/xiaomi/fitness/sleep/trace/analyze/SleepReportGenerator;", "getCurrentAnalyzerName", "()Ljava/lang/String;", "currentAnalyzerName", "<init>", "()V", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepAnalyzeEngineImpl extends SleepAnalyzeEngine {
    private static final int UPGRADE_OFFSET_TIME_OF_DAY = 30;

    @NotNull
    private final SleepReportGenerator mGenerator = new SleepReportGenerator(new AnalyzerProvider() { // from class: com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzeEngineImpl$mGenerator$1
        @Override // com.xiaomi.fitness.sleep.trace.analyze.AnalyzerProvider
        public SleepAnalyzer get(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.this$0.getSleepAnalyzer(name);
        }
    });

    private final void asyncUpgradeReportIfNeed(Context context, SleepReport input) {
        if (input == null || input == SleepReport.INSTANCE.empty()) {
            return;
        }
        asyncUpgradeReportIfNeed(context, CollectionsKt__CollectionsJVMKt.listOf(input));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asyncUpgradeReportIfNeed$lambda$0(Map mp, SleepAnalyzeEngineImpl this$0, Context appContext) {
        Intrinsics.checkNotNullParameter(mp, "$mp");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(appContext, "$appContext");
        for (Map.Entry entry : mp.entrySet()) {
            long jLongValue = ((Number) entry.getKey()).longValue();
            this$0.mGenerator.startGenerateReport(appContext, (String) entry.getValue(), DateNumHelper.INSTANCE.calcTimestamp(jLongValue));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepReport getAnalysisReport$lambda$1(SleepAnalyzeEngineImpl this$0, Context context, SleepReport sleepReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        if (sleepReport == null) {
            return SleepReport.INSTANCE.empty();
        }
        this$0.asyncUpgradeReportIfNeed(context, sleepReport);
        return sleepReport;
    }

    @Override // com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzeEngine
    @NotNull
    public LiveData<SleepReport> getAnalysisReport(@NotNull final Context context, long dateTimeMillis, boolean generateIfNeed) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Transformations.map(new SleepReportLiveData(context, getCurrentAnalyzerName(), generateIfNeed ? this.mGenerator : null, dateTimeMillis), new Function1() { // from class: qfm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepAnalyzeEngineImpl.getAnalysisReport$lambda$1(this.f31482a, context, (SleepReport) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzeEngine
    @NotNull
    public String getCurrentAnalyzerName() {
        return SleepAnalyzerBeta.NAME_BETA;
    }

    @Override // com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzeEngine
    public boolean isGenerating(long dateTimeMillis) {
        return this.mGenerator.isGenerating(dateTimeMillis);
    }

    @Override // com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzeEngine
    public void onInitializeAnalyze(@NotNull Map<String, l0d<SleepAnalyzer>> m) {
        Intrinsics.checkNotNullParameter(m, "m");
        m.put(SleepAnalyzerAlpha.NAME_ALPHA, new tee<SleepAnalyzer>() { // from class: com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzeEngineImpl.onInitializeAnalyze.1
            @Override // defpackage.unq
            public SleepAnalyzer constructor() {
                return new SleepAnalyzerAlpha();
            }
        });
        m.put(SleepAnalyzerBeta.NAME_BETA, new tee<SleepAnalyzer>() { // from class: com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzeEngineImpl.onInitializeAnalyze.2
            @Override // defpackage.unq
            public SleepAnalyzer constructor() {
                return new SleepAnalyzerBeta();
            }
        });
    }

    @Override // com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzeEngine
    public void startGenerateReport(@NotNull Context context, long dateTimeMillis, @Nullable OnResult<SleepReport> onResult) {
        Intrinsics.checkNotNullParameter(context, "context");
        SleepReportGenerator.startGenerateReport$default(this.mGenerator, context, getCurrentAnalyzerName(), dateTimeMillis, onResult, null, 16, null);
    }

    @Override // com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzeEngine
    public void updateSleepDuration(@Nullable Context context, long dateTimeMillis, long sleepTime, long wakeTime) {
    }

    private final void asyncUpgradeReportIfNeed(Context context, List<SleepReport> input) {
        if (input == null || input.isEmpty()) {
            return;
        }
        final ArrayMap arrayMap = new ArrayMap();
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -30);
        long timeInMillis = calendar.getTimeInMillis();
        for (SleepReport sleepReport : input) {
            if (sleepReport != null && sleepReport != SleepReport.INSTANCE.empty()) {
                SleepReportProfile profile = sleepReport.getProfile();
                if (!sleepReport.hasManualAdjustSleepWakeTime() && sleepReport.getSleepTime() >= timeInMillis) {
                    SleepReportGenerator sleepReportGenerator = this.mGenerator;
                    String analyzerName = profile.getAnalyzerName();
                    Intrinsics.checkNotNull(analyzerName);
                    if (sleepReportGenerator.canCompatibleUpgrade(analyzerName, profile.getAnalyzerVersion())) {
                        Long lValueOf = Long.valueOf(profile.getDateNum());
                        String analyzerName2 = profile.getAnalyzerName();
                        Intrinsics.checkNotNull(analyzerName2);
                        arrayMap.put(lValueOf, analyzerName2);
                    }
                }
            }
        }
        if (arrayMap.isEmpty()) {
            return;
        }
        final Context safeContext = ApplicationExtKt.getSafeContext(context);
        ExecutorHelper.runInBackground(new Runnable() { // from class: rfm
            @Override // java.lang.Runnable
            public final void run() {
                SleepAnalyzeEngineImpl.asyncUpgradeReportIfNeed$lambda$0(arrayMap, this, safeContext);
            }
        });
    }
}
