package com.google.common.collect;

import defpackage.c6i;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class j0<R, C, V> extends ImmutableTable<R, C, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R f9185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f9186b;
    public final V c;

    public j0(R r2, C c, V v) {
        this.f9185a = (R) c6i.o(r2);
        this.f9186b = (C) c6i.o(c);
        this.c = (V) c6i.o(v);
    }

    @Override // com.google.common.collect.ImmutableTable
    public ImmutableTable.b createSerializedForm() {
        return ImmutableTable.b.a(this, new int[]{0}, new int[]{0});
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.q0
    public int size() {
        return 1;
    }

    @Override // com.google.common.collect.ImmutableTable
    /* JADX INFO: renamed from: column, reason: merged with bridge method [inline-methods] */
    public ImmutableMap<R, V> mo139column(C c) {
        c6i.o(c);
        return containsColumn(c) ? ImmutableMap.of(this.f9185a, (Object) this.c) : ImmutableMap.of();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.q0
    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.of(this.f9186b, ImmutableMap.of(this.f9185a, (Object) this.c));
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.j
    public ImmutableSet<q0.a<R, C, V>> createCellSet() {
        return ImmutableSet.of(ImmutableTable.cellOf(this.f9185a, this.f9186b, this.c));
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.j
    public ImmutableCollection<V> createValues() {
        return ImmutableSet.of(this.c);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.q0
    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.of(this.f9185a, ImmutableMap.of(this.f9186b, (Object) this.c));
    }

    public j0(q0.a<R, C, V> aVar) {
        this(aVar.a(), aVar.getColumnKey(), aVar.getValue());
    }
}
