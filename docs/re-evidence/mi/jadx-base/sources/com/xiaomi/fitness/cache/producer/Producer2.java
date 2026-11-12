package com.xiaomi.fitness.cache.producer;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.api.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004J\u001d\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0002H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/cache/producer/Producer2;", "T", "A", c.f13755a, "", "produce", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Producer2<T, A, B> {
    T produce(A a2, B b2);
}
