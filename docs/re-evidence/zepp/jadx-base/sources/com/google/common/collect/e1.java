package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
final class e1<K extends Enum<K>, V> extends ImmutableMap.b<K, V> {
    private final transient EnumMap<K, V> f;

    public static class b<K extends Enum<K>, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final EnumMap<K, V> a;

        public b(EnumMap<K, V> enumMap) {
            this.a = enumMap;
        }

        public Object readResolve() {
            return new e1(this.a);
        }
    }

    public static <K extends Enum<K>, V> ImmutableMap<K, V> n(EnumMap<K, V> enumMap) {
        int size = enumMap.size();
        if (size == 0) {
            return ImmutableMap.of();
        }
        if (size != 1) {
            return new e1(enumMap);
        }
        Map.Entry entry = (Map.Entry) Iterables.getOnlyElement(enumMap.entrySet());
        return ImmutableMap.of(entry.getKey(), entry.getValue());
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return this.f.containsKey(obj);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e1) {
            obj = ((e1) obj).f;
        }
        return this.f.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(Object obj) {
        return this.f.get(obj);
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean j() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableMap
    public UnmodifiableIterator<K> k() {
        return Iterators.unmodifiableIterator(this.f.keySet().iterator());
    }

    @Override // com.google.common.collect.ImmutableMap.b
    public UnmodifiableIterator<Map.Entry<K, V>> m() {
        return Maps.L(this.f.entrySet().iterator());
    }

    @Override // java.util.Map
    public int size() {
        return this.f.size();
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new b(this.f);
    }

    private e1(EnumMap<K, V> enumMap) {
        this.f = enumMap;
        Preconditions.checkArgument(!enumMap.isEmpty());
    }
}
