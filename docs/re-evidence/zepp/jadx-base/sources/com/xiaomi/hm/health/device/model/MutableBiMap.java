package com.xiaomi.hm.health.device.model;

import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0007\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005J!\u0010\b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H&¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\n8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u00008&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/model/MutableBiMap;", "", "K", "V", "Lcom/xiaomi/hm/health/device/model/BiMap;", "", "key", "value", "forcePut", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "getValues", "()Ljava/util/Set;", "values", "getInverse", "()Lcom/xiaomi/hm/health/device/model/MutableBiMap;", "inverse", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface MutableBiMap<K, V> extends BiMap<K, V>, Map<K, V>, KMutableMap {
    @Nullable
    V forcePut(@NotNull K key, @NotNull V value);

    @Override // com.xiaomi.hm.health.device.model.BiMap
    @NotNull
    MutableBiMap<V, K> getInverse();

    @Override // com.xiaomi.hm.health.device.model.BiMap
    @NotNull
    Set<V> getValues();
}
