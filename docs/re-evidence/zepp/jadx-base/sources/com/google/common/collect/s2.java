package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.Immutable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Immutable(containerOf = {"R", "C", "V"})
@GwtCompatible
final class s2<R, C, V> extends h2<R, C, V> {
    public static final ImmutableTable<Object, Object, Object> g = new s2(ImmutableList.of(), ImmutableSet.of(), ImmutableSet.of());
    private final ImmutableMap<R, ImmutableMap<C, V>> c;
    private final ImmutableMap<C, ImmutableMap<R, V>> d;
    private final int[] e;
    private final int[] f;

    public s2(ImmutableList<Table.Cell<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        ImmutableMap immutableMapU = Maps.u(immutableSet);
        LinkedHashMap linkedHashMapNewLinkedHashMap = Maps.newLinkedHashMap();
        UnmodifiableIterator<R> it2 = immutableSet.iterator();
        while (it2.hasNext()) {
            linkedHashMapNewLinkedHashMap.put(it2.next(), new LinkedHashMap());
        }
        LinkedHashMap linkedHashMapNewLinkedHashMap2 = Maps.newLinkedHashMap();
        UnmodifiableIterator<C> it3 = immutableSet2.iterator();
        while (it3.hasNext()) {
            linkedHashMapNewLinkedHashMap2.put(it3.next(), new LinkedHashMap());
        }
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i = 0; i < immutableList.size(); i++) {
            Table.Cell<R, C, V> cell = immutableList.get(i);
            R rowKey = cell.getRowKey();
            C columnKey = cell.getColumnKey();
            V value = cell.getValue();
            iArr[i] = ((Integer) immutableMapU.get(rowKey)).intValue();
            Map map = (Map) linkedHashMapNewLinkedHashMap.get(rowKey);
            iArr2[i] = map.size();
            Object objPut = map.put(columnKey, value);
            if (objPut != null) {
                throw new IllegalArgumentException("Duplicate value for row=" + rowKey + ", column=" + columnKey + ": " + value + ", " + objPut);
            }
            ((Map) linkedHashMapNewLinkedHashMap2.get(columnKey)).put(rowKey, value);
        }
        this.e = iArr;
        this.f = iArr2;
        ImmutableMap.Builder builder = new ImmutableMap.Builder(linkedHashMapNewLinkedHashMap.size());
        for (Map.Entry entry : linkedHashMapNewLinkedHashMap.entrySet()) {
            builder.put(entry.getKey(), ImmutableMap.copyOf((Map) entry.getValue()));
        }
        this.c = builder.build();
        ImmutableMap.Builder builder2 = new ImmutableMap.Builder(linkedHashMapNewLinkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMapNewLinkedHashMap2.entrySet()) {
            builder2.put(entry2.getKey(), ImmutableMap.copyOf((Map) entry2.getValue()));
        }
        this.d = builder2.build();
    }

    @Override // com.google.common.collect.ImmutableTable
    public ImmutableTable.a j() {
        ImmutableMap immutableMapU = Maps.u(columnKeySet());
        int[] iArr = new int[cellSet().size()];
        UnmodifiableIterator<Table.Cell<R, C, V>> it2 = cellSet().iterator();
        int i = 0;
        while (it2.hasNext()) {
            iArr[i] = ((Integer) immutableMapU.get(it2.next().getColumnKey())).intValue();
            i++;
        }
        return ImmutableTable.a.a(this, this.e, iArr);
    }

    @Override // com.google.common.collect.h2
    public Table.Cell<R, C, V> q(int i) {
        Map.Entry<R, ImmutableMap<C, V>> entry = this.c.entrySet().asList().get(this.e[i]);
        ImmutableMap<C, V> value = entry.getValue();
        Map.Entry<C, V> entry2 = value.entrySet().asList().get(this.f[i]);
        return ImmutableTable.g(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override // com.google.common.collect.h2
    public V r(int i) {
        ImmutableMap<C, V> immutableMap = this.c.values().asList().get(this.e[i]);
        return immutableMap.values().asList().get(this.f[i]);
    }

    @Override // com.google.common.collect.Table
    public int size() {
        return this.e.length;
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.copyOf((Map) this.d);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.copyOf((Map) this.c);
    }
}
