package com.google.common.collect;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public interface q0<R, C, V> {

    public interface a<R, C, V> {
        R a();

        C getColumnKey();

        V getValue();
    }

    Set<a<R, C, V>> cellSet();

    Set<C> columnKeySet();

    Map<C, Map<R, V>> columnMap();

    Map<C, V> row(R r2);

    Set<R> rowKeySet();

    Map<R, Map<C, V>> rowMap();

    int size();
}
