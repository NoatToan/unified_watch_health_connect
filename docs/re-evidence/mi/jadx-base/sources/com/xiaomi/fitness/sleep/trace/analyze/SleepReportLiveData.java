package com.xiaomi.fitness.sleep.trace.analyze;

import android.content.Context;
import androidx.lifecycle.Observer;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.sleep.trace.OnResult;
import com.xiaomi.fitness.sleep.trace.db.SleepReport;
import com.xiaomi.fitness.sleep.trace.util.DateNumHelper;
import defpackage.gmf;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0018B)\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/analyze/SleepReportLiveData;", "Lgmf;", "Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;", "", "startGenerateIfNeed", "()V", "", "mDateTimeMillis", "J", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "Lcom/xiaomi/fitness/sleep/trace/analyze/SleepReportGenerator;", "mReportGenerator", "Lcom/xiaomi/fitness/sleep/trace/analyze/SleepReportGenerator;", "", "mAnalyzerName", "Ljava/lang/String;", "context", "analyzerName", "generator", "dateTimeMillis", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/xiaomi/fitness/sleep/trace/analyze/SleepReportGenerator;J)V", "SleepReportObserver", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepReportLiveData extends gmf<SleepReport> {

    @NotNull
    private final String mAnalyzerName;

    @NotNull
    private final Context mContext;
    private final long mDateTimeMillis;

    @Nullable
    private final SleepReportGenerator mReportGenerator;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/analyze/SleepReportLiveData$SleepReportObserver;", "Landroidx/lifecycle/Observer;", "Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;", "<init>", "(Lcom/xiaomi/fitness/sleep/trace/analyze/SleepReportLiveData;)V", "onChanged", "", "sleepReport", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SleepReportObserver implements Observer<SleepReport> {
        public SleepReportObserver() {
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(@Nullable SleepReport sleepReport) {
            if (sleepReport != null) {
                SleepReportLiveData.this.setValue(sleepReport);
            } else {
                SleepReportLiveData.this.startGenerateIfNeed();
            }
        }
    }

    public SleepReportLiveData(@NotNull Context context, @NotNull String analyzerName, @Nullable SleepReportGenerator sleepReportGenerator, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(analyzerName, "analyzerName");
        this.mDateTimeMillis = j;
        this.mContext = ApplicationExtKt.getSafeContext(context);
        this.mReportGenerator = sleepReportGenerator;
        Objects.requireNonNull(analyzerName);
        Intrinsics.checkNotNullExpressionValue(analyzerName, "requireNonNull(...)");
        this.mAnalyzerName = analyzerName;
        DateNumHelper.INSTANCE.calcDateNum(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startGenerateIfNeed() {
        if (this.mReportGenerator == null) {
            setValue(SleepReport.INSTANCE.empty());
        } else {
            SleepReportGenerator.startGenerateReport$default(this.mReportGenerator, this.mContext, this.mAnalyzerName, this.mDateTimeMillis, new OnResult<SleepReport>() { // from class: com.xiaomi.fitness.sleep.trace.analyze.SleepReportLiveData$startGenerateIfNeed$onResult$1
                @Override // com.xiaomi.fitness.sleep.trace.OnResult
                public void onResult(SleepReport sleepReport) {
                    SleepReportLiveData sleepReportLiveData = this.this$0;
                    if (sleepReport == null) {
                        sleepReport = SleepReport.INSTANCE.empty();
                    }
                    sleepReportLiveData.postValue(sleepReport);
                }
            }, null, 16, null);
        }
    }
}
