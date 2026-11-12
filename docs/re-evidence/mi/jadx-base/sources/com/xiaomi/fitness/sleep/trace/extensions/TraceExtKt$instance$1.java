package com.xiaomi.fitness.sleep.trace.extensions;

import android.os.Bundle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.sleep.trace.SleepTracer;
import com.xiaomi.fitness.sleep.trace.db.SleepReport;
import com.xiaomi.fitness.sleep.trace.extensions.TraceExtKt$instance$1;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\u001c\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001c\u0010\u001b\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J@\u0010\u001c\u001a\u00020\u001426\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00140\u001eH\u0016J-\u0010#\u001a\u00020\u00142#\u0010\u001d\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010%¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00140$H\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0004\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0004\"\u0004\b\n\u0010\bR$\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0(X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,RP\u0010-\u001a8\u0012\u0013\u0012\u00110.¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(/\u0012\u0013\u0012\u00110.¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(0\u0012\n\u0012\b\u0012\u0004\u0012\u00020.010\u001eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00106\u001a\u00020.2\u0006\u0010\u0005\u001a\u00020.8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006;"}, d2 = {"com/xiaomi/fitness/sleep/trace/extensions/TraceExtKt$instance$1", "Lcom/xiaomi/fitness/sleep/trace/SleepTracer;", "isSupport", "", "()Z", "value", "isEnable", "setEnable", "(Z)V", "isDeepLightSleepDetectionEnable", "setDeepLightSleepDetectionEnable", "", "snoreDetectionStatus", "getSnoreDetectionStatus", "()I", "setSnoreDetectionStatus", "(I)V", "getEnable", "isSleepTracing", "initSleepTrace", "", "isMaybeSleeping", "scheduleBegin", "arg", "", "extras", "Landroid/os/Bundle;", "scheduleEnd", "addSleepTraceObserver", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "matchCondition", "state", "addSleepReportObserver", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;", "report", "userAge", "Lkotlin/Function0;", "getUserAge", "()Lkotlin/jvm/functions/Function0;", "setUserAge", "(Lkotlin/jvm/functions/Function0;)V", "stepTimes", "", "begin", StatConstants.PARAM_END, "", "getStepTimes", "()Lkotlin/jvm/functions/Function2;", "setStepTimes", "(Lkotlin/jvm/functions/Function2;)V", "snoreRequestTime", "getSnoreRequestTime", "()J", "setSnoreRequestTime", "(J)V", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TraceExtKt$instance$1 implements SleepTracer {
    private Function0<Integer> userAge = new Function0() { // from class: gkp
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(TraceExtKt$instance$1.userAge$lambda$0());
        }
    };
    private Function2<? super Long, ? super Long, ? extends List<Long>> stepTimes = new Function2() { // from class: hkp
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return TraceExtKt$instance$1.stepTimes$lambda$1(((Long) obj).longValue(), ((Long) obj2).longValue());
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final List stepTimes$lambda$1(long j, long j2) {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int userAge$lambda$0() {
        return 0;
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public void addSleepReportObserver(Function1<? super SleepReport, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public void addSleepTraceObserver(Function2<? super Boolean, ? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public int getEnable() {
        return 0;
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public int getSnoreDetectionStatus() {
        return 0;
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public long getSnoreRequestTime() {
        return 0L;
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public Function2<Long, Long, List<Long>> getStepTimes() {
        return this.stepTimes;
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public Function0<Integer> getUserAge() {
        return this.userAge;
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public void initSleepTrace() {
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public boolean isDeepLightSleepDetectionEnable() {
        return false;
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public boolean isEnable() {
        return false;
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public boolean isMaybeSleeping() {
        return false;
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public boolean isSleepTracing() {
        return false;
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public boolean isSupport() {
        return false;
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public void scheduleBegin(String arg, Bundle extras) {
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public void scheduleEnd(String arg, Bundle extras) {
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public void setDeepLightSleepDetectionEnable(boolean z) {
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public void setEnable(boolean z) {
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public void setSnoreDetectionStatus(int i) {
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public void setSnoreRequestTime(long j) {
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public void setStepTimes(Function2<? super Long, ? super Long, ? extends List<Long>> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.stepTimes = function2;
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepTracer
    public void setUserAge(Function0<Integer> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.userAge = function0;
    }
}
