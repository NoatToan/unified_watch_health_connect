package com.xiaomi.fitness.cache.producer;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\r\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/fitness/cache/producer/Producer;", "T", "", "produce", "()Ljava/lang/Object;", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Producer<T> {
    T produce();
}
