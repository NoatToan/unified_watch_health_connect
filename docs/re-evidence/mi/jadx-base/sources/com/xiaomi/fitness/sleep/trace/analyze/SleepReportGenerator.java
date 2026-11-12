package com.xiaomi.fitness.sleep.trace.analyze;

import android.content.Context;
import android.os.Handler;
import androidx.collection.ArrayMap;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.handler.IJobHandler;
import com.xiaomi.fitness.sleep.behavior.collection.ICollectionTaskManager;
import com.xiaomi.fitness.sleep.trace.OnResult;
import com.xiaomi.fitness.sleep.trace.analyze.SleepReportGenerator;
import com.xiaomi.fitness.sleep.trace.db.SleepReport;
import com.xiaomi.fitness.sleep.trace.db.SleepReportProfile;
import com.xiaomi.fitness.sleep.trace.extensions.LogExtKt;
import com.xiaomi.fitness.sleep.trace.extensions.TraceInternalExtKt;
import com.xiaomi.fitness.sleep.trace.util.DateNumHelper;
import com.xiaomi.fitness.sleep.trace.util.SleepTraceUtil;
import defpackage.jrd;
import defpackage.njh;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 32\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b1\u00102J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0011\u001a\u00020\b2\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\nJE\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00062\u0010\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u001e\u0010\"J\u0017\u0010#\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R<\u0010/\u001a*\u0012\u0004\u0012\u00020\u0006\u0012 \u0012\u001e\u0012\u0018\u0012\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\u0004\u0012\u00020\u000e0.\u0018\u00010-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/analyze/SleepReportGenerator;", "Ljrd;", "Landroid/content/Context;", "appContext", "", "aName", "", "dateNum", "", "onGenerateReport", "(Landroid/content/Context;Ljava/lang/String;J)V", "Lcom/xiaomi/fitness/sleep/trace/OnResult;", "Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;", "cb", "Landroid/os/Handler;", "handler", "result", "performOnResult", "(Lcom/xiaomi/fitness/sleep/trace/OnResult;Landroid/os/Handler;Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;)V", "analyzerName", "performGenerateReport", "(Landroid/content/Context;Ljava/lang/String;J)Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;", "name", "requireAnalyzerName", "(Ljava/lang/String;)Ljava/lang/String;", "dateTimeMillis", "", "isGenerating", "(J)Z", "ctx", "startGenerateReport", "context", "onResult", "callbackHandler", "(Landroid/content/Context;Ljava/lang/String;JLcom/xiaomi/fitness/sleep/trace/OnResult;Landroid/os/Handler;)V", "generateSnoreReport", "(Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;)V", "", "analyzerVersion", "canCompatibleUpgrade", "(Ljava/lang/String;I)Z", "Lcom/xiaomi/fitness/sleep/trace/analyze/AnalyzerProvider;", "mAnalyzerProvider", "Lcom/xiaomi/fitness/sleep/trace/analyze/AnalyzerProvider;", "", "", "Lnjh;", "mGeneratingReports", "Ljava/util/Map;", "<init>", "(Lcom/xiaomi/fitness/sleep/trace/analyze/AnalyzerProvider;)V", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepReportGenerator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepReportGenerator.kt\ncom/xiaomi/fitness/sleep/trace/analyze/SleepReportGenerator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,149:1\n1#2:150\n108#3:151\n80#3,22:152\n*S KotlinDebug\n*F\n+ 1 SleepReportGenerator.kt\ncom/xiaomi/fitness/sleep/trace/analyze/SleepReportGenerator\n*L\n131#1:151\n131#1:152,22\n*E\n"})
public final class SleepReportGenerator implements jrd {

    @NotNull
    private static final String TAG = "SleepReportGenerator";

    @NotNull
    private final AnalyzerProvider mAnalyzerProvider;

    @NotNull
    private final Map<Long, List<njh<OnResult<SleepReport>, Handler>>> mGeneratingReports;

    public SleepReportGenerator(@NotNull AnalyzerProvider mAnalyzerProvider) {
        Intrinsics.checkNotNullParameter(mAnalyzerProvider, "mAnalyzerProvider");
        this.mAnalyzerProvider = mAnalyzerProvider;
        this.mGeneratingReports = new ArrayMap();
    }

    private final void onGenerateReport(Context appContext, String aName, long dateNum) {
        LogExtKt.logi("onGenerateReport " + aName + ", " + dateNum);
        SleepReport sleepReportPerformGenerateReport = performGenerateReport(appContext, aName, dateNum);
        generateSnoreReport(sleepReportPerformGenerateReport);
        synchronized (this.mGeneratingReports) {
            try {
                List<njh<OnResult<SleepReport>, Handler>> listRemove = this.mGeneratingReports.remove(Long.valueOf(dateNum));
                if (listRemove != null && !listRemove.isEmpty()) {
                    for (njh<OnResult<SleepReport>, Handler> njhVar : listRemove) {
                        performOnResult(njhVar.f27979a, njhVar.f27980b, sleepReportPerformGenerateReport);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final SleepReport performGenerateReport(Context appContext, String analyzerName, long dateNum) {
        SleepReport sleepReport;
        String strRequireAnalyzerName = requireAnalyzerName(analyzerName);
        try {
            SleepAnalyzer sleepAnalyzer = this.mAnalyzerProvider.get(strRequireAnalyzerName);
            try {
                sleepReport = sleepAnalyzer.analyzeSleep(appContext, dateNum);
            } catch (Exception e) {
                SleepTraceUtil.INSTANCE.throwIfDebug(e, "Generate sleep report failure.", new Object[0]);
                sleepReport = null;
            }
            if (sleepReport == null) {
                sleepReport = new SleepReport(dateNum);
                sleepReport.getProfile().setReportCode(-1);
            }
            SleepReportProfile profile = sleepReport.getProfile();
            if (profile == SleepReportProfile.INSTANCE.empty()) {
                SleepTraceUtil.INSTANCE.throwIfDebug(null, "illegal state sleep profile is empty.", new Object[0]);
                return null;
            }
            profile.setAnalyzerName(strRequireAnalyzerName);
            profile.setAnalyzerVersion(sleepAnalyzer.getVersion());
            return sleepReport;
        } catch (AnalyzerNotFoundException e2) {
            SleepTraceUtil.INSTANCE.throwIfDebug(e2, "Generate report failure.", new Object[0]);
            return null;
        }
    }

    private final void performOnResult(final OnResult<SleepReport> cb, Handler handler, final SleepReport result) {
        if (cb == null) {
            return;
        }
        if (handler != null) {
            handler.post(new Runnable() { // from class: irm
                @Override // java.lang.Runnable
                public final void run() {
                    cb.onResult(result);
                }
            });
        } else {
            cb.onResult(result);
        }
    }

    private final String requireAnalyzerName(String name) {
        int length = name.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) name.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String lowerCase = name.subSequence(i, length + 1).toString().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (lowerCase.length() > 0) {
            return lowerCase;
        }
        throw new IllegalStateException("Invalidate analyzer name.".toString());
    }

    public static /* synthetic */ void startGenerateReport$default(SleepReportGenerator sleepReportGenerator, Context context, String str, long j, OnResult onResult, Handler handler, int i, Object obj) {
        if ((i & 16) != 0) {
            handler = null;
        }
        sleepReportGenerator.startGenerateReport(context, str, j, onResult, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startGenerateReport$lambda$2(SleepReportGenerator this$0, Context context, String aName, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(aName, "$aName");
        this$0.onGenerateReport(ApplicationExtKt.getSafeContext(context), aName, j);
    }

    public final boolean canCompatibleUpgrade(@NotNull String analyzerName, int analyzerVersion) {
        Intrinsics.checkNotNullParameter(analyzerName, "analyzerName");
        try {
            AnalyzerProvider analyzerProvider = this.mAnalyzerProvider;
            Objects.requireNonNull(analyzerName);
            Intrinsics.checkNotNullExpressionValue(analyzerName, "requireNonNull(...)");
            return analyzerProvider.get(analyzerName).getVersion() > analyzerVersion;
        } catch (AnalyzerNotFoundException unused) {
            return false;
        }
    }

    public final void generateSnoreReport(@Nullable SleepReport result) {
        TraceInternalExtKt.getInstance(ICollectionTaskManager.INSTANCE).finishCollecting(ApplicationExtKt.getApplication(), 0, result);
    }

    @Override // defpackage.jrd
    public /* bridge */ /* synthetic */ IJobHandler getJobHandler(Handler.Callback... callbackArr) {
        return super.getJobHandler(callbackArr);
    }

    public final boolean isGenerating(long dateTimeMillis) {
        boolean z;
        long jCalcDateNum = DateNumHelper.INSTANCE.calcDateNum(dateTimeMillis);
        synchronized (this.mGeneratingReports) {
            z = this.mGeneratingReports.get(Long.valueOf(jCalcDateNum)) != null;
        }
        return z;
    }

    @JvmOverloads
    public final void startGenerateReport(@NotNull Context context, @NotNull String aName, long j, @Nullable OnResult<SleepReport> onResult) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aName, "aName");
        startGenerateReport$default(this, context, aName, j, onResult, null, 16, null);
    }

    public final void startGenerateReport(@NotNull Context ctx, @NotNull String aName, long dateTimeMillis) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(aName, "aName");
        startGenerateReport$default(this, ctx, aName, dateTimeMillis, null, null, 16, null);
    }

    @JvmOverloads
    public final void startGenerateReport(@NotNull final Context context, @NotNull final String aName, long dateTimeMillis, @Nullable OnResult<SleepReport> onResult, @Nullable Handler callbackHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aName, "aName");
        final long jCalcDateNum = DateNumHelper.INSTANCE.calcDateNum(dateTimeMillis);
        synchronized (this.mGeneratingReports) {
            try {
                List<njh<OnResult<SleepReport>, Handler>> linkedList = this.mGeneratingReports.get(Long.valueOf(jCalcDateNum));
                boolean z = linkedList != null;
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                    this.mGeneratingReports.put(Long.valueOf(jCalcDateNum), linkedList);
                }
                if (onResult != null) {
                    njh<OnResult<SleepReport>, Handler> njhVar = new njh<>(onResult, callbackHandler);
                    if (!linkedList.contains(njhVar)) {
                        linkedList.add(njhVar);
                    }
                }
                if (z) {
                    return;
                }
                Unit unit = Unit.INSTANCE;
                getJobHandler(new Handler.Callback[0]).newJob().post(new Runnable() { // from class: hrm
                    @Override // java.lang.Runnable
                    public final void run() {
                        SleepReportGenerator.startGenerateReport$lambda$2(this.f20379a, context, aName, jCalcDateNum);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
