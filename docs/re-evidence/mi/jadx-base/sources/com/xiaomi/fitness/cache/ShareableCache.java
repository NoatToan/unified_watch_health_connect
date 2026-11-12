package com.xiaomi.fitness.cache;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/cache/ShareableCache;", "K", "V", "", "<init>", "()V", "mCache", "", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShareableCache<K, V> {

    @NotNull
    private Map<K, ? extends V> mCache = MapsKt__MapsKt.emptyMap();
}
