package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Predicate;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
interface r0<K, V> extends Multimap<K, V> {
    Multimap<K, V> a();

    Predicate<? super Map.Entry<K, V>> c();
}
