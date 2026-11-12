package com.google.common.collect;

import defpackage.d44;
import defpackage.spo;
import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class HashBasedTable<R, C, V> extends p0<R, C, V> {
    private static final long serialVersionUID = 0;

    public static class a<C, V> implements spo<Map<C, V>>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9007a;

        public a(int i) {
            this.f9007a = i;
        }

        @Override // defpackage.spo
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<C, V> get() {
            return s.s(this.f9007a);
        }
    }

    public HashBasedTable(Map<R, Map<C, V>> map, a<C, V> aVar) {
        super(map, aVar);
    }

    public static <R, C, V> HashBasedTable<R, C, V> create() {
        return new HashBasedTable<>(new LinkedHashMap(), new a(0));
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.j, com.google.common.collect.q0
    public /* bridge */ /* synthetic */ Set cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.j
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.p0
    public /* bridge */ /* synthetic */ Map column(Object obj) {
        return super.column(obj);
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.j, com.google.common.collect.q0
    public /* bridge */ /* synthetic */ Set columnKeySet() {
        return super.columnKeySet();
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.q0
    public /* bridge */ /* synthetic */ Map columnMap() {
        return super.columnMap();
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.j
    public /* bridge */ /* synthetic */ boolean contains(Object obj, Object obj2) {
        return super.contains(obj, obj2);
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.j
    public /* bridge */ /* synthetic */ boolean containsColumn(Object obj) {
        return super.containsColumn(obj);
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.j
    public /* bridge */ /* synthetic */ boolean containsRow(Object obj) {
        return super.containsRow(obj);
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.j
    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.j
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.j
    public /* bridge */ /* synthetic */ Object get(Object obj, Object obj2) {
        return super.get(obj, obj2);
    }

    @Override // com.google.common.collect.j
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.j
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.p0, com.google.common.collect.j
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2, Object obj3) {
        return super.put(obj, obj2, obj3);
    }

    @Override // com.google.common.collect.j
    public /* bridge */ /* synthetic */ void putAll(q0 q0Var) {
        super.putAll(q0Var);
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.j
    public /* bridge */ /* synthetic */ Object remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.p0, com.google.common.collect.q0
    public /* bridge */ /* synthetic */ Map row(Object obj) {
        return super.row(obj);
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.j, com.google.common.collect.q0
    public /* bridge */ /* synthetic */ Set rowKeySet() {
        return super.rowKeySet();
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.q0
    public /* bridge */ /* synthetic */ Map rowMap() {
        return super.rowMap();
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.q0
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.j
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.j
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <R, C, V> HashBasedTable<R, C, V> create(int i, int i2) {
        d44.b(i2, "expectedCellsPerRow");
        return new HashBasedTable<>(s.s(i), new a(i2));
    }

    public static <R, C, V> HashBasedTable<R, C, V> create(q0<? extends R, ? extends C, ? extends V> q0Var) {
        HashBasedTable<R, C, V> hashBasedTableCreate = create();
        hashBasedTableCreate.putAll(q0Var);
        return hashBasedTableCreate;
    }
}
