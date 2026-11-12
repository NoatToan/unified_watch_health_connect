package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@DoNotMock("Use ImmutableTable, HashBasedTable, or another implementation")
@ElementTypesAreNonnullByDefault
public interface Table<R, C, V> {

    public interface Cell<R, C, V> {
        boolean equals(Object obj);

        @ParametricNullness
        C getColumnKey();

        @ParametricNullness
        R getRowKey();

        @ParametricNullness
        V getValue();

        int hashCode();
    }

    Set<Cell<R, C, V>> cellSet();

    void clear();

    Map<R, V> column(@ParametricNullness C c14);

    Set<C> columnKeySet();

    Map<C, Map<R, V>> columnMap();

    boolean contains(@CompatibleWith("R") Object obj, @CompatibleWith("C") Object obj2);

    boolean containsColumn(@CompatibleWith("C") Object obj);

    boolean containsRow(@CompatibleWith("R") Object obj);

    boolean containsValue(@CompatibleWith("V") Object obj);

    boolean equals(Object obj);

    V get(@CompatibleWith("R") Object obj, @CompatibleWith("C") Object obj2);

    int hashCode();

    boolean isEmpty();

    @CanIgnoreReturnValue
    V put(@ParametricNullness R r14, @ParametricNullness C c14, @ParametricNullness V v14);

    void putAll(Table<? extends R, ? extends C, ? extends V> table);

    @CanIgnoreReturnValue
    V remove(@CompatibleWith("R") Object obj, @CompatibleWith("C") Object obj2);

    Map<C, V> row(@ParametricNullness R r14);

    Set<R> rowKeySet();

    Map<R, Map<C, V>> rowMap();

    int size();

    Collection<V> values();
}
