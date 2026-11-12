package com.xiaomi.fitness.sleep.trace.sampling;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/sampling/SamplingCallback;", "T", "", "onCallback", "", "type", "", "data", "(Ljava/lang/String;Ljava/lang/Object;)V", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SamplingCallback<T> {
    void onCallback(@NotNull String type, @Nullable T data);
}
