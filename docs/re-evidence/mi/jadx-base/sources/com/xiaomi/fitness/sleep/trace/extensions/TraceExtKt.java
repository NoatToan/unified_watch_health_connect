package com.xiaomi.fitness.sleep.trace.extensions;

import com.xiaomi.fitness.instance.InstanceExtKt;
import com.xiaomi.fitness.sleep.trace.SleepTracer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"instance", "Lcom/xiaomi/fitness/sleep/trace/SleepTracer;", "Lcom/xiaomi/fitness/sleep/trace/SleepTracer$Companion;", "getInstance", "(Lcom/xiaomi/fitness/sleep/trace/SleepTracer$Companion;)Lcom/xiaomi/fitness/sleep/trace/SleepTracer;", "sleep-trace_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TraceExtKt {
    @NotNull
    public static final SleepTracer getInstance(@NotNull SleepTracer.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        SleepTracer sleepTracer = (SleepTracer) InstanceExtKt.getInstance(Reflection.getOrCreateKotlinClass(SleepTracer.class));
        return sleepTracer == null ? new TraceExtKt$instance$1() : sleepTracer;
    }
}
