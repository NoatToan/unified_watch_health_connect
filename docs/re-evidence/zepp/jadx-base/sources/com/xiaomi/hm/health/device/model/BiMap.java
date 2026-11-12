package com.xiaomi.hm.health.device.model;

import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\b\u0007\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00058&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u00008&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/model/BiMap;", "", "K", "V", "", "", "getValues", "()Ljava/util/Set;", "values", "getInverse", "()Lcom/xiaomi/hm/health/device/model/BiMap;", "inverse", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface BiMap<K, V> extends Map<K, V>, KMappedMarker {
    @NotNull
    BiMap<V, K> getInverse();

    @NotNull
    Set<V> getValues();
}
