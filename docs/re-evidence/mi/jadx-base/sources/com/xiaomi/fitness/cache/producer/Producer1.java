package com.xiaomi.fitness.cache.producer;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/cache/producer/Producer1;", "T", "A", "", "produce", PluginDeviceInfo.FMODEL, "(Ljava/lang/Object;)Ljava/lang/Object;", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Producer1<T, A> {
    T produce(A a2);
}
