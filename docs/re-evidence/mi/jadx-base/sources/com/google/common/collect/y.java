package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class y<K, V> extends ImmutableBiMap<K, V> {
    public static final y<Object, Object> f = new y<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient Object f9265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient Object[] f9266b;
    public final transient int c;
    public final transient int d;
    public final transient y<V, K> e;

    /* JADX WARN: Multi-variable type inference failed */
    public y() {
        this.f9265a = null;
        this.f9266b = new Object[0];
        this.c = 0;
        this.d = 0;
        this.e = this;
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return new a0.a(this, this.f9266b, this.c, this.d);
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<K> createKeySet() {
        return new a0.b(this, new a0.c(this.f9266b, this.c, this.d));
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(Object obj) {
        V v = (V) a0.f(this.f9265a, this.f9266b, this.d, this.c, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.d;
    }

    @Override // com.google.common.collect.ImmutableBiMap, defpackage.ri2
    public ImmutableBiMap<V, K> inverse() {
        return this.e;
    }

    public y(Object[] objArr, int i) {
        this.f9266b = objArr;
        this.d = i;
        this.c = 0;
        int iChooseTableSize = i >= 2 ? ImmutableSet.chooseTableSize(i) : 0;
        this.f9265a = a0.d(objArr, i, iChooseTableSize, 0);
        this.e = new y<>(a0.d(objArr, i, iChooseTableSize, 1), objArr, i, this);
    }

    public y(Object obj, Object[] objArr, int i, y<V, K> yVar) {
        this.f9265a = obj;
        this.f9266b = objArr;
        this.c = 1;
        this.d = i;
        this.e = yVar;
    }
}
