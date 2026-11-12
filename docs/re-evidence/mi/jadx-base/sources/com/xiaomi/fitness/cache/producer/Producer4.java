package com.xiaomi.fitness.cache.producer;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.api.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u0004*\u0004\b\u0004\u0010\u00052\u00020\u0006J-\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u00022\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u000b\u001a\u00028\u0004H&¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/cache/producer/Producer4;", "T", "A", c.f13755a, "C", "D", "", "produce", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONON, PluginDeviceInfo.FICONOFF, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Producer4<T, A, B, C, D> {
    T produce(A a2, B b2, C c, D d);
}
