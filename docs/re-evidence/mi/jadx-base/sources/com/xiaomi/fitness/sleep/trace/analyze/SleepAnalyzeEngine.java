package com.xiaomi.fitness.sleep.trace.analyze;

import android.content.Context;
import androidx.collection.ArrayMap;
import androidx.lifecycle.LiveData;
import com.xiaomi.fitness.sleep.trace.OnResult;
import com.xiaomi.fitness.sleep.trace.db.SleepReport;
import defpackage.l0d;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\r\b&\u0018\u0000 ,2\u00020\u0001:\u0002-,B\t\b\u0000¢\u0006\u0004\b*\u0010+J)\u0010\b\u001a\u00020\u00072\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H$¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001c\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH'¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010 R&\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00038$X¤\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/analyze/SleepAnalyzeEngine;", "", "", "", "Ll0d;", "Lcom/xiaomi/fitness/sleep/trace/analyze/SleepAnalyzer;", "m", "", "onInitializeAnalyze", "(Ljava/util/Map;)V", "Landroid/content/Context;", "context", "", "dateTimeMillis", "", "generateIfNeed", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;", "getAnalysisReport", "(Landroid/content/Context;JZ)Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fitness/sleep/trace/OnResult;", "onResult", "startGenerateReport", "(Landroid/content/Context;JLcom/xiaomi/fitness/sleep/trace/OnResult;)V", "isGenerating", "(J)Z", "sleepTime", "wakeTime", "updateSleepDuration", "(Landroid/content/Context;JJJ)V", "name", "getSleepAnalyzer", "(Ljava/lang/String;)Lcom/xiaomi/fitness/sleep/trace/analyze/SleepAnalyzer;", "", "mAnalyzers", "Ljava/util/Map;", "getCurrentAnalyzer", "()Lcom/xiaomi/fitness/sleep/trace/analyze/SleepAnalyzer;", "currentAnalyzer", "getCurrentAnalyzerName", "()Ljava/lang/String;", "currentAnalyzerName", "<init>", "()V", "Companion", "Holder", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class SleepAnalyzeEngine {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Map<String, l0d<SleepAnalyzer>> mAnalyzers;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/analyze/SleepAnalyzeEngine$Companion;", "", "<init>", "()V", "get", "Lcom/xiaomi/fitness/sleep/trace/analyze/SleepAnalyzeEngine;", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SleepAnalyzeEngine get() {
            return Holder.INSTANCE.getINSTANCE();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\b\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/analyze/SleepAnalyzeEngine$Holder;", "", "<init>", "()V", "INSTANCE", "Lcom/xiaomi/fitness/sleep/trace/analyze/SleepAnalyzeEngine;", "getINSTANCE", "()Lcom/xiaomi/fitness/sleep/trace/analyze/SleepAnalyzeEngine;", "INSTANCE$1", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Holder {

        @NotNull
        public static final Holder INSTANCE = new Holder();

        /* JADX INFO: renamed from: INSTANCE$1, reason: from kotlin metadata */
        @NotNull
        private static final SleepAnalyzeEngine INSTANCE = new SleepAnalyzeEngineImpl();

        private Holder() {
        }

        @NotNull
        public final SleepAnalyzeEngine getINSTANCE() {
            return INSTANCE;
        }
    }

    public SleepAnalyzeEngine() {
        ArrayMap arrayMap = new ArrayMap();
        this.mAnalyzers = Collections.unmodifiableMap(arrayMap);
        onInitializeAnalyze(arrayMap);
    }

    @NotNull
    public abstract LiveData<SleepReport> getAnalysisReport(@NotNull Context context, long dateTimeMillis, boolean generateIfNeed);

    @NotNull
    public final SleepAnalyzer getCurrentAnalyzer() {
        String currentAnalyzerName = getCurrentAnalyzerName();
        l0d<SleepAnalyzer> l0dVar = this.mAnalyzers.get(currentAnalyzerName);
        if (l0dVar == null) {
            throw new AnalyzerNotFoundException(currentAnalyzerName);
        }
        SleepAnalyzer sleepAnalyzer = l0dVar.get();
        if (sleepAnalyzer != null) {
            return sleepAnalyzer;
        }
        throw new IllegalStateException("Initialize analyzer failure, " + currentAnalyzerName);
    }

    @NotNull
    public abstract String getCurrentAnalyzerName();

    @NotNull
    public final SleepAnalyzer getSleepAnalyzer(@NotNull String name) {
        SleepAnalyzer sleepAnalyzer;
        Intrinsics.checkNotNullParameter(name, "name");
        l0d<SleepAnalyzer> l0dVar = this.mAnalyzers.get(name);
        if (l0dVar == null || (sleepAnalyzer = l0dVar.get()) == null) {
            throw new AnalyzerNotFoundException(name);
        }
        return sleepAnalyzer;
    }

    public abstract boolean isGenerating(long dateTimeMillis);

    public abstract void onInitializeAnalyze(@NotNull Map<String, l0d<SleepAnalyzer>> m);

    public abstract void startGenerateReport(@NotNull Context context, long dateTimeMillis, @Nullable OnResult<SleepReport> onResult);

    public abstract void updateSleepDuration(@Nullable Context context, long dateTimeMillis, long sleepTime, long wakeTime);
}
