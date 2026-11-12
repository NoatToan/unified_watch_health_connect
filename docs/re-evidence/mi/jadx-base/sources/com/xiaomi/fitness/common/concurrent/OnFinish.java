package com.xiaomi.fitness.common.concurrent;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/common/concurrent/OnFinish;", "V", "", "onFinish", "", "v", "(Ljava/lang/Object;)V", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface OnFinish<V> {
    void onFinish(@Nullable V v);
}
