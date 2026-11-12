package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
final class c2<K, V> extends ImmutableMap<K, V> {
    private static final int i = -1;
    public static final ImmutableMap<Object, Object> j = new c2(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    private final transient int[] f;

    @VisibleForTesting
    public final transient Object[] g;
    private final transient int h;

    public static class a<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        private final transient ImmutableMap<K, V> f;
        private final transient Object[] g;
        private final transient int h;
        private final transient int i;

        /* JADX INFO: renamed from: com.google.common.collect.c2$a$a, reason: collision with other inner class name */
        public class C0194a extends ImmutableList<Map.Entry<K, V>> {
            public C0194a() {
            }

            @Override // com.google.common.collect.ImmutableCollection
            public boolean f() {
                return true;
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int i) {
                Preconditions.checkElementIndex(i, a.this.i);
                int i2 = i * 2;
                return new AbstractMap.SimpleImmutableEntry(a.this.g[a.this.h + i2], a.this.g[i2 + (a.this.h ^ 1)]);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.i;
            }
        }

        public a(ImmutableMap<K, V> immutableMap, Object[] objArr, int i, int i2) {
            this.f = immutableMap;
            this.g = objArr;
            this.h = i;
            this.i = i2;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int a(Object[] objArr, int i) {
            return asList().a(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f.get(key));
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean f() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet
        public ImmutableList<Map.Entry<K, V>> k() {
            return new C0194a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.i;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }
    }

    public static final class b<K> extends ImmutableSet<K> {
        private final transient ImmutableMap<K, ?> f;
        private final transient ImmutableList<K> g;

        public b(ImmutableMap<K, ?> immutableMap, ImmutableList<K> immutableList) {
            this.f = immutableMap;
            this.g = immutableList;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int a(Object[] objArr, int i) {
            return asList().a(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public ImmutableList<K> asList() {
            return this.g;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return this.f.get(obj) != null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean f() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public UnmodifiableIterator<K> iterator() {
            return asList().iterator();
        }
    }

    public static final class c extends ImmutableList<Object> {
        private final transient Object[] c;
        private final transient int d;
        private final transient int e;

        public c(Object[] objArr, int i, int i2) {
            this.c = objArr;
            this.d = i;
            this.e = i2;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean f() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i) {
            Preconditions.checkElementIndex(i, this.e);
            return this.c[(i * 2) + this.d];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.e;
        }
    }

    private c2(int[] iArr, Object[] objArr, int i2) {
        this.f = iArr;
        this.g = objArr;
        this.h = i2;
    }

    public static <K, V> c2<K, V> m(int i2, Object[] objArr) {
        if (i2 == 0) {
            return (c2) j;
        }
        if (i2 == 1) {
            u.a(objArr[0], objArr[1]);
            return new c2<>(null, objArr, 1);
        }
        Preconditions.checkPositionIndex(i2, objArr.length >> 1);
        return new c2<>(n(objArr, i2, ImmutableSet.i(i2), 0), objArr, i2);
    }

    public static int[] n(Object[] objArr, int i2, int i3, int i4) {
        int i5;
        if (i2 == 1) {
            u.a(objArr[i4], objArr[i4 ^ 1]);
            return null;
        }
        int i6 = i3 - 1;
        int[] iArr = new int[i3];
        Arrays.fill(iArr, -1);
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = i7 * 2;
            int i9 = i8 + i4;
            Object obj = objArr[i9];
            Object obj2 = objArr[i8 + (i4 ^ 1)];
            u.a(obj, obj2);
            int iC = b1.c(obj.hashCode());
            while (true) {
                i5 = iC & i6;
                int i10 = iArr[i5];
                if (i10 == -1) {
                    break;
                }
                if (objArr[i10].equals(obj)) {
                    throw new IllegalArgumentException("Multiple entries with same key: " + obj + SearchCriteria.EQ + obj2 + " and " + objArr[i10] + SearchCriteria.EQ + objArr[i10 ^ 1]);
                }
                iC = i5 + 1;
            }
            iArr[i5] = i9;
        }
        return iArr;
    }

    public static Object o(@NullableDecl int[] iArr, @NullableDecl Object[] objArr, int i2, int i3, @NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        if (i2 == 1) {
            if (objArr[i3].equals(obj)) {
                return objArr[i3 ^ 1];
            }
            return null;
        }
        if (iArr == null) {
            return null;
        }
        int length = iArr.length - 1;
        int iC = b1.c(obj.hashCode());
        while (true) {
            int i4 = iC & length;
            int i5 = iArr[i4];
            if (i5 == -1) {
                return null;
            }
            if (objArr[i5].equals(obj)) {
                return objArr[i5 ^ 1];
            }
            iC = i4 + 1;
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> e() {
        return new a(this, this.g, 0, this.h);
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<K> f() {
        return new b(this, new c(this.g, 0, this.h));
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableCollection<V> g() {
        return new c(this.g, 1, this.h);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @NullableDecl
    public V get(@NullableDecl Object obj) {
        return (V) o(this.f, this.g, this.h, 0, obj);
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean j() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.h;
    }
}
