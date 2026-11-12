package com.google.common.collect;

import defpackage.uaq;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class n0<R, C, V> extends f0<R, C, V> {
    public static final ImmutableTable<Object, Object, Object> e = new n0(ImmutableList.of(), ImmutableSet.of(), ImmutableSet.of());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableMap<R, ImmutableMap<C, V>> f9204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableMap<C, ImmutableMap<R, V>> f9205b;
    public final int[] c;
    public final int[] d;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(ImmutableList<q0.a<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        ImmutableMap immutableMapJ = s.j(immutableSet);
        LinkedHashMap linkedHashMapR = s.r();
        uaq<R> it = immutableSet.iterator();
        while (it.hasNext()) {
            linkedHashMapR.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap linkedHashMapR2 = s.r();
        uaq<C> it2 = immutableSet2.iterator();
        while (it2.hasNext()) {
            linkedHashMapR2.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i = 0; i < immutableList.size(); i++) {
            q0.a<R, C, V> aVar = immutableList.get(i);
            R rA = aVar.a();
            C columnKey = aVar.getColumnKey();
            V value = aVar.getValue();
            Integer num = (Integer) immutableMapJ.get(rA);
            Objects.requireNonNull(num);
            iArr[i] = num.intValue();
            Map map = (Map) linkedHashMapR.get(rA);
            Objects.requireNonNull(map);
            Map map2 = map;
            iArr2[i] = map2.size();
            b(rA, columnKey, map2.put(columnKey, value), value);
            Map map3 = (Map) linkedHashMapR2.get(columnKey);
            Objects.requireNonNull(map3);
            map3.put(rA, value);
        }
        this.c = iArr;
        this.d = iArr2;
        ImmutableMap.b bVar = new ImmutableMap.b(linkedHashMapR.size());
        for (Map.Entry entry : linkedHashMapR.entrySet()) {
            bVar.g(entry.getKey(), ImmutableMap.copyOf((Map) entry.getValue()));
        }
        this.f9204a = bVar.d();
        ImmutableMap.b bVar2 = new ImmutableMap.b(linkedHashMapR2.size());
        for (Map.Entry entry2 : linkedHashMapR2.entrySet()) {
            bVar2.g(entry2.getKey(), ImmutableMap.copyOf((Map) entry2.getValue()));
        }
        this.f9205b = bVar2.d();
    }

    @Override // com.google.common.collect.ImmutableTable
    public ImmutableTable.b createSerializedForm() {
        ImmutableMap immutableMapJ = s.j(columnKeySet());
        int[] iArr = new int[cellSet().size()];
        uaq<q0.a<R, C, V>> it = cellSet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Integer num = (Integer) immutableMapJ.get(it.next().getColumnKey());
            Objects.requireNonNull(num);
            iArr[i] = num.intValue();
            i++;
        }
        return ImmutableTable.b.a(this, this.c, iArr);
    }

    @Override // com.google.common.collect.f0
    public q0.a<R, C, V> getCell(int i) {
        Map.Entry<R, ImmutableMap<C, V>> entry = this.f9204a.entrySet().asList().get(this.c[i]);
        ImmutableMap<C, V> value = entry.getValue();
        Map.Entry<C, V> entry2 = value.entrySet().asList().get(this.d[i]);
        return ImmutableTable.cellOf(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override // com.google.common.collect.f0
    public V getValue(int i) {
        ImmutableMap<C, V> immutableMap = this.f9204a.values().asList().get(this.c[i]);
        return immutableMap.values().asList().get(this.d[i]);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.q0
    public int size() {
        return this.c.length;
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.q0
    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.copyOf((Map) this.f9205b);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.q0
    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.copyOf((Map) this.f9204a);
    }
}
