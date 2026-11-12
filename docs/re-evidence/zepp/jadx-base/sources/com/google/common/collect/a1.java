package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
abstract class a1<K, V> extends k<K, V> {
    public a1(Map<K, Collection<V>> map) {
        super(map);
    }
}
