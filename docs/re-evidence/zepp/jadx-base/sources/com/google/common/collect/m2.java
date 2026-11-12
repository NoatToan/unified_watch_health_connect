package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
class m2<R, C, V> extends ImmutableTable<R, C, V> {
    public final R c;
    public final C d;
    public final V e;

    public m2(R r, C c, V v) {
        this.c = (R) Preconditions.checkNotNull(r);
        this.d = (C) Preconditions.checkNotNull(c);
        this.e = (V) Preconditions.checkNotNull(v);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.o
    /* JADX INFO: renamed from: i */
    public ImmutableSet<Table.Cell<R, C, V>> b() {
        return ImmutableSet.of(ImmutableTable.g(this.c, this.d, this.e));
    }

    @Override // com.google.common.collect.ImmutableTable
    public ImmutableTable.a j() {
        return ImmutableTable.a.a(this, new int[]{0}, new int[]{0});
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.o
    /* JADX INFO: renamed from: k */
    public ImmutableCollection<V> c() {
        return ImmutableSet.of(this.e);
    }

    @Override // com.google.common.collect.Table
    public int size() {
        return 1;
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<R, V> column(C c) {
        Preconditions.checkNotNull(c);
        return containsColumn(c) ? ImmutableMap.of(this.c, (Object) this.e) : ImmutableMap.of();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.of(this.d, ImmutableMap.of(this.c, (Object) this.e));
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.of(this.c, ImmutableMap.of(this.d, (Object) this.e));
    }

    public m2(Table.Cell<R, C, V> cell) {
        this(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
    }
}
