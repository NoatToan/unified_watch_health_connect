package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
abstract class q<K, V> extends c<K, V> {
    public q(Map<K, Collection<V>> map) {
        super(map);
    }
}
