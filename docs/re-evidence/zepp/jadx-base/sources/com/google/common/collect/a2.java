package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
final class a2<K, V> extends ImmutableBiMap<K, V> {
    public static final a2<Object, Object> k = new a2<>();
    private final transient int[] f;

    @VisibleForTesting
    public final transient Object[] g;
    private final transient int h;
    private final transient int i;
    private final transient a2<V, K> j;

    /* JADX WARN: Multi-variable type inference failed */
    private a2() {
        this.f = null;
        this.g = new Object[0];
        this.h = 0;
        this.i = 0;
        this.j = this;
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> e() {
        return new c2.a(this, this.g, this.h, this.i);
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<K> f() {
        return new c2.b(this, new c2.c(this.g, this.h, this.i));
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(@NullableDecl Object obj) {
        return (V) c2.o(this.f, this.g, this.i, this.h, obj);
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean j() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.i;
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.BiMap
    public ImmutableBiMap<V, K> inverse() {
        return this.j;
    }

    public a2(Object[] objArr, int i) {
        this.g = objArr;
        this.i = i;
        this.h = 0;
        int i2 = i >= 2 ? ImmutableSet.i(i) : 0;
        this.f = c2.n(objArr, i, i2, 0);
        this.j = new a2<>(c2.n(objArr, i, i2, 1), objArr, i, this);
    }

    private a2(int[] iArr, Object[] objArr, int i, a2<V, K> a2Var) {
        this.f = iArr;
        this.g = objArr;
        this.h = 1;
        this.i = i;
        this.j = a2Var;
    }
}
