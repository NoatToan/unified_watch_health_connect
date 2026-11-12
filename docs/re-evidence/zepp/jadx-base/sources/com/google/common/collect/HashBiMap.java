package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements BiMap<K, V>, Serializable {
    private static final int q = -1;
    private static final int r = -2;
    public transient K[] a;
    public transient V[] b;
    public transient int c;
    public transient int d;
    private transient int[] e;
    private transient int[] f;
    private transient int[] g;
    private transient int[] h;

    @NullableDecl
    private transient int i;

    @NullableDecl
    private transient int j;
    private transient int[] k;
    private transient int[] l;
    private transient Set<K> m;
    private transient Set<V> n;
    private transient Set<Map.Entry<K, V>> o;

    @RetainedWith
    @MonotonicNonNullDecl
    private transient BiMap<V, K> p;

    public final class a extends com.google.common.collect.f<K, V> {

        @NullableDecl
        public final K a;
        public int b;

        public a(int i) {
            this.a = HashBiMap.this.a[i];
            this.b = i;
        }

        public void f() {
            int i = this.b;
            if (i != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i <= hashBiMap.c && Objects.equal(hashBiMap.a[i], this.a)) {
                    return;
                }
            }
            this.b = HashBiMap.this.p(this.a);
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public K getKey() {
            return this.a;
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        @NullableDecl
        public V getValue() {
            f();
            int i = this.b;
            if (i == -1) {
                return null;
            }
            return HashBiMap.this.b[i];
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public V setValue(V v) {
            f();
            int i = this.b;
            if (i == -1) {
                return (V) HashBiMap.this.put(this.a, v);
            }
            V v2 = HashBiMap.this.b[i];
            if (Objects.equal(v2, v)) {
                return v;
            }
            HashBiMap.this.G(this.b, v, false);
            return v2;
        }
    }

    public static final class b<K, V> extends com.google.common.collect.f<V, K> {
        public final HashBiMap<K, V> a;
        public final V b;
        public int c;

        public b(HashBiMap<K, V> hashBiMap, int i) {
            this.a = hashBiMap;
            this.b = hashBiMap.b[i];
            this.c = i;
        }

        private void f() {
            int i = this.c;
            if (i != -1) {
                HashBiMap<K, V> hashBiMap = this.a;
                if (i <= hashBiMap.c && Objects.equal(this.b, hashBiMap.b[i])) {
                    return;
                }
            }
            this.c = this.a.r(this.b);
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public V getKey() {
            return this.b;
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public K getValue() {
            f();
            int i = this.c;
            if (i == -1) {
                return null;
            }
            return this.a.a[i];
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public K setValue(K k) {
            f();
            int i = this.c;
            if (i == -1) {
                return this.a.z(this.b, k, false);
            }
            K k2 = this.a.a[i];
            if (Objects.equal(k2, k)) {
                return k;
            }
            this.a.F(this.c, k, false);
            return k2;
        }
    }

    public final class c extends h<K, V, Map.Entry<K, V>> {
        public c() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(int i) {
            return new a(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iP = HashBiMap.this.p(key);
            return iP != -1 && Objects.equal(value, HashBiMap.this.b[iP]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iD = b1.d(key);
            int iQ = HashBiMap.this.q(key, iD);
            if (iQ == -1 || !Objects.equal(value, HashBiMap.this.b[iQ])) {
                return false;
            }
            HashBiMap.this.C(iQ, iD);
            return true;
        }
    }

    public static class d<K, V> extends AbstractMap<V, K> implements BiMap<V, K>, Serializable {
        private final HashBiMap<K, V> a;
        private transient Set<Map.Entry<V, K>> b;

        public d(HashBiMap<K, V> hashBiMap) {
            this.a = hashBiMap;
        }

        @GwtIncompatible("serialization")
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            ((HashBiMap) this.a).p = this;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.a.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return this.a.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(@NullableDecl Object obj) {
            return this.a.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.b;
            if (set != null) {
                return set;
            }
            e eVar = new e(this.a);
            this.b = eVar;
            return eVar;
        }

        @Override // com.google.common.collect.BiMap
        @CanIgnoreReturnValue
        @NullableDecl
        public K forcePut(@NullableDecl V v, @NullableDecl K k) {
            return this.a.z(v, k, true);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @NullableDecl
        public K get(@NullableDecl Object obj) {
            return this.a.t(obj);
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<K, V> inverse() {
            return this.a;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.a.values();
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        @CanIgnoreReturnValue
        @NullableDecl
        public K put(@NullableDecl V v, @NullableDecl K k) {
            return this.a.z(v, k, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CanIgnoreReturnValue
        @NullableDecl
        public K remove(@NullableDecl Object obj) {
            return this.a.E(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.a.c;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> values() {
            return this.a.keySet();
        }
    }

    public static class e<K, V> extends h<K, V, Map.Entry<V, K>> {
        public e(HashBiMap<K, V> hashBiMap) {
            super(hashBiMap);
        }

        @Override // com.google.common.collect.HashBiMap.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<V, K> a(int i) {
            return new b(this.a, i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iR = this.a.r(key);
            return iR != -1 && Objects.equal(this.a.a[iR], value);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iD = b1.d(key);
            int iS = this.a.s(key, iD);
            if (iS == -1 || !Objects.equal(this.a.a[iS], value)) {
                return false;
            }
            this.a.D(iS, iD);
            return true;
        }
    }

    public final class f extends h<K, V, K> {
        public f() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.h
        public K a(int i) {
            return HashBiMap.this.a[i];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            int iD = b1.d(obj);
            int iQ = HashBiMap.this.q(obj, iD);
            if (iQ == -1) {
                return false;
            }
            HashBiMap.this.C(iQ, iD);
            return true;
        }
    }

    public final class g extends h<K, V, V> {
        public g() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.h
        public V a(int i) {
            return HashBiMap.this.b[i];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            int iD = b1.d(obj);
            int iS = HashBiMap.this.s(obj, iD);
            if (iS == -1) {
                return false;
            }
            HashBiMap.this.D(iS, iD);
            return true;
        }
    }

    public static abstract class h<K, V, T> extends AbstractSet<T> {
        public final HashBiMap<K, V> a;

        public class a implements Iterator<T> {
            private int a;
            private int b = -1;
            private int c;
            private int d;

            public a() {
                this.a = ((HashBiMap) h.this.a).i;
                HashBiMap<K, V> hashBiMap = h.this.a;
                this.c = hashBiMap.d;
                this.d = hashBiMap.c;
            }

            private void a() {
                if (h.this.a.d != this.c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                a();
                return this.a != -2 && this.d > 0;
            }

            @Override // java.util.Iterator
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T t = (T) h.this.a(this.a);
                this.b = this.a;
                this.a = ((HashBiMap) h.this.a).l[this.a];
                this.d--;
                return t;
            }

            @Override // java.util.Iterator
            public void remove() {
                a();
                u.e(this.b != -1);
                h.this.a.A(this.b);
                int i = this.a;
                HashBiMap<K, V> hashBiMap = h.this.a;
                if (i == hashBiMap.c) {
                    this.a = this.b;
                }
                this.b = -1;
                this.c = hashBiMap.d;
            }
        }

        public h(HashBiMap<K, V> hashBiMap) {
            this.a = hashBiMap;
        }

        public abstract T a(int i);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.a.c;
        }
    }

    private HashBiMap(int i) {
        u(i);
    }

    private void B(int i, int i2, int i3) {
        Preconditions.checkArgument(i != -1);
        j(i, i2);
        k(i, i3);
        H(this.k[i], this.l[i]);
        x(this.c - 1, i);
        K[] kArr = this.a;
        int i4 = this.c;
        kArr[i4 - 1] = null;
        this.b[i4 - 1] = null;
        this.c = i4 - 1;
        this.d++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(int i, @NullableDecl K k, boolean z) {
        Preconditions.checkArgument(i != -1);
        int iD = b1.d(k);
        int iQ = q(k, iD);
        int i2 = this.j;
        int i3 = -2;
        if (iQ != -1) {
            if (!z) {
                throw new IllegalArgumentException("Key already present in map: " + k);
            }
            i2 = this.k[iQ];
            i3 = this.l[iQ];
            C(iQ, iD);
            if (i == this.c) {
                i = iQ;
            }
        }
        if (i2 == i) {
            i2 = this.k[i];
        } else if (i2 == this.c) {
            i2 = iQ;
        }
        if (i3 == i) {
            iQ = this.l[i];
        } else if (i3 != this.c) {
            iQ = i3;
        }
        H(this.k[i], this.l[i]);
        j(i, b1.d(this.a[i]));
        this.a[i] = k;
        v(i, b1.d(k));
        H(i2, i);
        H(i, iQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(int i, @NullableDecl V v, boolean z) {
        Preconditions.checkArgument(i != -1);
        int iD = b1.d(v);
        int iS = s(v, iD);
        if (iS != -1) {
            if (!z) {
                throw new IllegalArgumentException("Value already present in map: " + v);
            }
            D(iS, iD);
            if (i == this.c) {
                i = iS;
            }
        }
        k(i, b1.d(this.b[i]));
        this.b[i] = v;
        w(i, iD);
    }

    private void H(int i, int i2) {
        if (i == -2) {
            this.i = i2;
        } else {
            this.l[i] = i2;
        }
        if (i2 == -2) {
            this.j = i;
        } else {
            this.k[i2] = i;
        }
    }

    public static <K, V> HashBiMap<K, V> create() {
        return create(16);
    }

    private int h(int i) {
        return i & (this.e.length - 1);
    }

    private static int[] i(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void j(int i, int i2) {
        Preconditions.checkArgument(i != -1);
        int iH = h(i2);
        int[] iArr = this.e;
        if (iArr[iH] == i) {
            int[] iArr2 = this.g;
            iArr[iH] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i3 = iArr[iH];
        int i4 = this.g[i3];
        while (true) {
            int i5 = i4;
            int i6 = i3;
            i3 = i5;
            if (i3 == -1) {
                throw new AssertionError("Expected to find entry with key " + this.a[i]);
            }
            if (i3 == i) {
                int[] iArr3 = this.g;
                iArr3[i6] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = this.g[i3];
        }
    }

    private void k(int i, int i2) {
        Preconditions.checkArgument(i != -1);
        int iH = h(i2);
        int[] iArr = this.f;
        if (iArr[iH] == i) {
            int[] iArr2 = this.h;
            iArr[iH] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i3 = iArr[iH];
        int i4 = this.h[i3];
        while (true) {
            int i5 = i4;
            int i6 = i3;
            i3 = i5;
            if (i3 == -1) {
                throw new AssertionError("Expected to find entry with value " + this.b[i]);
            }
            if (i3 == i) {
                int[] iArr3 = this.h;
                iArr3[i6] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = this.h[i3];
        }
    }

    private void m(int i) {
        int[] iArr = this.g;
        if (iArr.length < i) {
            int iA = ImmutableCollection.Builder.a(iArr.length, i);
            this.a = (K[]) Arrays.copyOf(this.a, iA);
            this.b = (V[]) Arrays.copyOf(this.b, iA);
            this.g = n(this.g, iA);
            this.h = n(this.h, iA);
            this.k = n(this.k, iA);
            this.l = n(this.l, iA);
        }
        if (this.e.length < i) {
            int iA2 = b1.a(i, 1.0d);
            this.e = i(iA2);
            this.f = i(iA2);
            for (int i2 = 0; i2 < this.c; i2++) {
                int iH = h(b1.d(this.a[i2]));
                int[] iArr2 = this.g;
                int[] iArr3 = this.e;
                iArr2[i2] = iArr3[iH];
                iArr3[iH] = i2;
                int iH2 = h(b1.d(this.b[i2]));
                int[] iArr4 = this.h;
                int[] iArr5 = this.f;
                iArr4[i2] = iArr5[iH2];
                iArr5[iH2] = i2;
            }
        }
    }

    private static int[] n(int[] iArr, int i) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(iArrCopyOf, length, i, -1);
        return iArrCopyOf;
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int iH = k2.h(objectInputStream);
        u(16);
        k2.c(this, objectInputStream, iH);
    }

    private void v(int i, int i2) {
        Preconditions.checkArgument(i != -1);
        int iH = h(i2);
        int[] iArr = this.g;
        int[] iArr2 = this.e;
        iArr[i] = iArr2[iH];
        iArr2[iH] = i;
    }

    private void w(int i, int i2) {
        Preconditions.checkArgument(i != -1);
        int iH = h(i2);
        int[] iArr = this.h;
        int[] iArr2 = this.f;
        iArr[i] = iArr2[iH];
        iArr2[iH] = i;
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        k2.i(this, objectOutputStream);
    }

    private void x(int i, int i2) {
        int i3;
        int i4;
        if (i == i2) {
            return;
        }
        int i5 = this.k[i];
        int i6 = this.l[i];
        H(i5, i2);
        H(i2, i6);
        K[] kArr = this.a;
        K k = kArr[i];
        V[] vArr = this.b;
        V v = vArr[i];
        kArr[i2] = k;
        vArr[i2] = v;
        int iH = h(b1.d(k));
        int[] iArr = this.e;
        if (iArr[iH] == i) {
            iArr[iH] = i2;
        } else {
            int i7 = iArr[iH];
            int i8 = this.g[i7];
            while (true) {
                int i9 = i8;
                i3 = i7;
                i7 = i9;
                if (i7 == i) {
                    break;
                } else {
                    i8 = this.g[i7];
                }
            }
            this.g[i3] = i2;
        }
        int[] iArr2 = this.g;
        iArr2[i2] = iArr2[i];
        iArr2[i] = -1;
        int iH2 = h(b1.d(v));
        int[] iArr3 = this.f;
        if (iArr3[iH2] == i) {
            iArr3[iH2] = i2;
        } else {
            int i10 = iArr3[iH2];
            int i11 = this.h[i10];
            while (true) {
                int i12 = i11;
                i4 = i10;
                i10 = i12;
                if (i10 == i) {
                    break;
                } else {
                    i11 = this.h[i10];
                }
            }
            this.h[i4] = i2;
        }
        int[] iArr4 = this.h;
        iArr4[i2] = iArr4[i];
        iArr4[i] = -1;
    }

    public void A(int i) {
        C(i, b1.d(this.a[i]));
    }

    public void C(int i, int i2) {
        B(i, i2, b1.d(this.b[i]));
    }

    public void D(int i, int i2) {
        B(i, b1.d(this.a[i]), i2);
    }

    @NullableDecl
    public K E(@NullableDecl Object obj) {
        int iD = b1.d(obj);
        int iS = s(obj, iD);
        if (iS == -1) {
            return null;
        }
        K k = this.a[iS];
        D(iS, iD);
        return k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.a, 0, this.c, (Object) null);
        Arrays.fill(this.b, 0, this.c, (Object) null);
        Arrays.fill(this.e, -1);
        Arrays.fill(this.f, -1);
        Arrays.fill(this.g, 0, this.c, -1);
        Arrays.fill(this.h, 0, this.c, -1);
        Arrays.fill(this.k, 0, this.c, -1);
        Arrays.fill(this.l, 0, this.c, -1);
        this.c = 0;
        this.i = -2;
        this.j = -2;
        this.d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return p(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return r(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.o;
        if (set != null) {
            return set;
        }
        c cVar = new c();
        this.o = cVar;
        return cVar;
    }

    @Override // com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    @NullableDecl
    public V forcePut(@NullableDecl K k, @NullableDecl V v) {
        return y(k, v, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public V get(@NullableDecl Object obj) {
        int iP = p(obj);
        if (iP == -1) {
            return null;
        }
        return this.b[iP];
    }

    @Override // com.google.common.collect.BiMap
    public BiMap<V, K> inverse() {
        BiMap<V, K> biMap = this.p;
        if (biMap != null) {
            return biMap;
        }
        d dVar = new d(this);
        this.p = dVar;
        return dVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.m;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.m = fVar;
        return fVar;
    }

    public int o(@NullableDecl Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[h(i)];
        while (i2 != -1) {
            if (Objects.equal(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    public int p(@NullableDecl Object obj) {
        return q(obj, b1.d(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    public V put(@NullableDecl K k, @NullableDecl V v) {
        return y(k, v, false);
    }

    public int q(@NullableDecl Object obj, int i) {
        return o(obj, i, this.e, this.g, this.a);
    }

    public int r(@NullableDecl Object obj) {
        return s(obj, b1.d(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public V remove(@NullableDecl Object obj) {
        int iD = b1.d(obj);
        int iQ = q(obj, iD);
        if (iQ == -1) {
            return null;
        }
        V v = this.b[iQ];
        C(iQ, iD);
        return v;
    }

    public int s(@NullableDecl Object obj, int i) {
        return o(obj, i, this.f, this.h, this.b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.c;
    }

    @NullableDecl
    public K t(@NullableDecl Object obj) {
        int iR = r(obj);
        if (iR == -1) {
            return null;
        }
        return this.a[iR];
    }

    public void u(int i) {
        u.b(i, "expectedSize");
        int iA = b1.a(i, 1.0d);
        this.c = 0;
        this.a = (K[]) new Object[i];
        this.b = (V[]) new Object[i];
        this.e = i(iA);
        this.f = i(iA);
        this.g = i(i);
        this.h = i(i);
        this.i = -2;
        this.j = -2;
        this.k = i(i);
        this.l = i(i);
    }

    @NullableDecl
    public V y(@NullableDecl K k, @NullableDecl V v, boolean z) {
        int iD = b1.d(k);
        int iQ = q(k, iD);
        if (iQ != -1) {
            V v2 = this.b[iQ];
            if (Objects.equal(v2, v)) {
                return v;
            }
            G(iQ, v, z);
            return v2;
        }
        int iD2 = b1.d(v);
        int iS = s(v, iD2);
        if (!z) {
            Preconditions.checkArgument(iS == -1, "Value already present: %s", v);
        } else if (iS != -1) {
            D(iS, iD2);
        }
        m(this.c + 1);
        K[] kArr = this.a;
        int i = this.c;
        kArr[i] = k;
        this.b[i] = v;
        v(i, iD);
        w(this.c, iD2);
        H(this.j, this.c);
        H(this.c, -2);
        this.c++;
        this.d++;
        return null;
    }

    @NullableDecl
    public K z(@NullableDecl V v, @NullableDecl K k, boolean z) {
        int iD = b1.d(v);
        int iS = s(v, iD);
        if (iS != -1) {
            K k2 = this.a[iS];
            if (Objects.equal(k2, k)) {
                return k;
            }
            F(iS, k, z);
            return k2;
        }
        int i = this.j;
        int iD2 = b1.d(k);
        int iQ = q(k, iD2);
        if (!z) {
            Preconditions.checkArgument(iQ == -1, "Key already present: %s", k);
        } else if (iQ != -1) {
            i = this.k[iQ];
            C(iQ, iD2);
        }
        m(this.c + 1);
        K[] kArr = this.a;
        int i2 = this.c;
        kArr[i2] = k;
        this.b[i2] = v;
        v(i2, iD2);
        w(this.c, iD);
        int i3 = i == -2 ? this.i : this.l[i];
        H(i, this.c);
        H(this.c, i3);
        this.c++;
        this.d++;
        return null;
    }

    public static <K, V> HashBiMap<K, V> create(int i) {
        return new HashBiMap<>(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<V> values() {
        Set<V> set = this.n;
        if (set != null) {
            return set;
        }
        g gVar = new g();
        this.n = gVar;
        return gVar;
    }

    public static <K, V> HashBiMap<K, V> create(Map<? extends K, ? extends V> map) {
        HashBiMap<K, V> hashBiMapCreate = create(map.size());
        hashBiMapCreate.putAll(map);
        return hashBiMapCreate;
    }
}
