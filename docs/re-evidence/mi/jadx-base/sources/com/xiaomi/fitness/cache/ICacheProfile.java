package com.xiaomi.fitness.cache;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H&¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/cache/ICacheProfile;", "K", "V", "", "sizeOf", "", "key", "value", "(Ljava/lang/Object;Ljava/lang/Object;)I", "maxSize", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ICacheProfile<K, V> {
    int maxSize();

    int sizeOf(K key, V value);
}
