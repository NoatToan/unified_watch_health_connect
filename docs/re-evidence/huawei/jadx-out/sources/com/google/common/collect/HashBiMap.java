package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;
import defpackage.ale;
import defpackage.aly;
import defpackage.ams;
import defpackage.ann;
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
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements BiMap<K, V>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @LazyInit
    private transient Set<Map.Entry<K, V>> f4339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient int f4340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient V[] f4341c;
    transient int d;
    transient K[] e;
    private transient int[] f;
    private transient int g;
    private transient int[] h;

    @LazyInit
    private transient Set<K> i;

    @CheckForNull
    @LazyInit
    private transient BiMap<V, K> j;
    private transient int[] k;
    private transient int[] l;
    private transient int[] m;
    private transient int n;
    private transient int[] o;

    @LazyInit
    private transient Set<V> s;

    void c(int i2) {
        ale.b(i2, "expectedSize");
        int iA = aly.a(i2, 1.0d);
        this.f4340b = 0;
        this.e = (K[]) new Object[i2];
        this.f4341c = (V[]) new Object[i2];
        this.f = e(iA);
        this.h = e(iA);
        this.o = e(i2);
        this.k = e(i2);
        this.g = -2;
        this.n = -2;
        this.l = e(i2);
        this.m = e(i2);
    }

    private static int[] e(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private static int[] b(int[] iArr, int i2) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, i2);
        Arrays.fill(iArrCopyOf, length, i2, -1);
        return iArrCopyOf;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f4340b;
    }

    private void d(int i2) {
        int[] iArr = this.o;
        if (iArr.length < i2) {
            int iExpandedCapacity = ImmutableCollection.Builder.expandedCapacity(iArr.length, i2);
            this.e = (K[]) Arrays.copyOf(this.e, iExpandedCapacity);
            this.f4341c = (V[]) Arrays.copyOf(this.f4341c, iExpandedCapacity);
            this.o = b(this.o, iExpandedCapacity);
            this.k = b(this.k, iExpandedCapacity);
            this.l = b(this.l, iExpandedCapacity);
            this.m = b(this.m, iExpandedCapacity);
        }
        if (this.f.length < i2) {
            int iA = aly.a(i2, 1.0d);
            this.f = e(iA);
            this.h = e(iA);
            for (int i3 = 0; i3 < this.f4340b; i3++) {
                int iA2 = a(aly.c(this.e[i3]));
                int[] iArr2 = this.o;
                int[] iArr3 = this.f;
                iArr2[i3] = iArr3[iA2];
                iArr3[iA2] = i3;
                int iA3 = a(aly.c(this.f4341c[i3]));
                int[] iArr4 = this.k;
                int[] iArr5 = this.h;
                iArr4[i3] = iArr5[iA3];
                iArr5[iA3] = i3;
            }
        }
    }

    private int a(int i2) {
        return i2 & (this.f.length - 1);
    }

    int d(@CheckForNull Object obj) {
        return e(obj, aly.c(obj));
    }

    int e(@CheckForNull Object obj, int i2) {
        return d(obj, i2, this.f, this.o, this.e);
    }

    int c(@CheckForNull Object obj) {
        return a(obj, aly.c(obj));
    }

    int a(@CheckForNull Object obj, int i2) {
        return d(obj, i2, this.h, this.k, this.f4341c);
    }

    int d(@CheckForNull Object obj, int i2, int[] iArr, int[] iArr2, Object[] objArr) {
        int i3 = iArr[a(i2)];
        while (i3 != -1) {
            if (Objects.equal(objArr[i3], obj)) {
                return i3;
            }
            i3 = iArr2[i3];
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        return d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        return c(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        int iD = d(obj);
        if (iD == -1) {
            return null;
        }
        return this.f4341c[iD];
    }

    @CheckForNull
    K b(@CheckForNull Object obj) {
        int iC = c(obj);
        if (iC == -1) {
            return null;
        }
        return this.e[iC];
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    @CheckForNull
    public V put(@ParametricNullness K k, @ParametricNullness V v) {
        return c(k, v, false);
    }

    @CheckForNull
    V c(@ParametricNullness K k, @ParametricNullness V v, boolean z) {
        int iC = aly.c(k);
        int iE = e(k, iC);
        if (iE != -1) {
            V v2 = this.f4341c[iE];
            if (Objects.equal(v2, v)) {
                return v;
            }
            e(iE, v, z);
            return v2;
        }
        int iC2 = aly.c(v);
        int iA = a(v, iC2);
        if (!z) {
            Preconditions.checkArgument(iA == -1, "Value already present: %s", v);
        } else if (iA != -1) {
            d(iA, iC2);
        }
        d(this.f4340b + 1);
        K[] kArr = this.e;
        int i2 = this.f4340b;
        kArr[i2] = k;
        this.f4341c[i2] = v;
        e(i2, iC);
        j(this.f4340b, iC2);
        i(this.n, this.f4340b);
        i(this.f4340b, -2);
        this.f4340b++;
        this.d++;
        return null;
    }

    @Override // com.google.common.collect.BiMap
    @CheckForNull
    public V forcePut(@ParametricNullness K k, @ParametricNullness V v) {
        return c(k, v, true);
    }

    @CheckForNull
    K d(@ParametricNullness V v, @ParametricNullness K k, boolean z) {
        int iC = aly.c(v);
        int iA = a(v, iC);
        if (iA != -1) {
            K k2 = this.e[iA];
            if (Objects.equal(k2, k)) {
                return k;
            }
            a(iA, k, z);
            return k2;
        }
        int i2 = this.n;
        int iC2 = aly.c(k);
        int iE = e(k, iC2);
        if (!z) {
            Preconditions.checkArgument(iE == -1, "Key already present: %s", k);
        } else if (iE != -1) {
            i2 = this.l[iE];
            b(iE, iC2);
        }
        d(this.f4340b + 1);
        K[] kArr = this.e;
        int i3 = this.f4340b;
        kArr[i3] = k;
        this.f4341c[i3] = v;
        e(i3, iC2);
        j(this.f4340b, iC);
        int i4 = i2 == -2 ? this.g : this.m[i2];
        i(i2, this.f4340b);
        i(this.f4340b, i4);
        this.f4340b++;
        this.d++;
        return null;
    }

    private void i(int i2, int i3) {
        if (i2 == -2) {
            this.g = i3;
        } else {
            this.m[i2] = i3;
        }
        if (i3 == -2) {
            this.n = i2;
        } else {
            this.l[i3] = i2;
        }
    }

    private void e(int i2, int i3) {
        Preconditions.checkArgument(i2 != -1);
        int iA = a(i3);
        int[] iArr = this.o;
        int[] iArr2 = this.f;
        iArr[i2] = iArr2[iA];
        iArr2[iA] = i2;
    }

    private void j(int i2, int i3) {
        Preconditions.checkArgument(i2 != -1);
        int iA = a(i3);
        int[] iArr = this.k;
        int[] iArr2 = this.h;
        iArr[i2] = iArr2[iA];
        iArr2[iA] = i2;
    }

    private void a(int i2, int i3) {
        Preconditions.checkArgument(i2 != -1);
        int iA = a(i3);
        int[] iArr = this.f;
        int i4 = iArr[iA];
        if (i4 == i2) {
            int[] iArr2 = this.o;
            iArr[iA] = iArr2[i2];
            iArr2[i2] = -1;
            return;
        }
        int i5 = this.o[i4];
        while (true) {
            int i6 = i4;
            i4 = i5;
            if (i4 == -1) {
                throw new AssertionError("Expected to find entry with key " + this.e[i2]);
            }
            if (i4 != i2) {
                i5 = this.o[i4];
            } else {
                int[] iArr3 = this.o;
                iArr3[i6] = iArr3[i2];
                iArr3[i2] = -1;
                return;
            }
        }
    }

    private void c(int i2, int i3) {
        Preconditions.checkArgument(i2 != -1);
        int iA = a(i3);
        int[] iArr = this.h;
        int i4 = iArr[iA];
        if (i4 == i2) {
            int[] iArr2 = this.k;
            iArr[iA] = iArr2[i2];
            iArr2[i2] = -1;
            return;
        }
        int i5 = this.k[i4];
        while (true) {
            int i6 = i4;
            i4 = i5;
            if (i4 == -1) {
                throw new AssertionError("Expected to find entry with value " + this.f4341c[i2]);
            }
            if (i4 != i2) {
                i5 = this.k[i4];
            } else {
                int[] iArr3 = this.k;
                iArr3[i6] = iArr3[i2];
                iArr3[i2] = -1;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i2, @ParametricNullness V v, boolean z) {
        Preconditions.checkArgument(i2 != -1);
        int iC = aly.c(v);
        int iA = a(v, iC);
        if (iA != -1) {
            if (z) {
                d(iA, iC);
                if (i2 == this.f4340b) {
                    i2 = iA;
                }
            } else {
                throw new IllegalArgumentException("Value already present in map: " + v);
            }
        }
        c(i2, aly.c(this.f4341c[i2]));
        this.f4341c[i2] = v;
        j(i2, iC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, @ParametricNullness K k, boolean z) {
        int i3;
        Preconditions.checkArgument(i2 != -1);
        int iC = aly.c(k);
        int iE = e(k, iC);
        int i4 = this.n;
        if (iE == -1) {
            i3 = -2;
        } else if (z) {
            i4 = this.l[iE];
            i3 = this.m[iE];
            b(iE, iC);
            if (i2 == this.f4340b) {
                i2 = iE;
            }
        } else {
            throw new IllegalArgumentException("Key already present in map: " + k);
        }
        if (i4 == i2) {
            i4 = this.l[i2];
        } else if (i4 == this.f4340b) {
            i4 = iE;
        }
        if (i3 == i2) {
            iE = this.m[i2];
        } else if (i3 != this.f4340b) {
            iE = i3;
        }
        i(this.l[i2], this.m[i2]);
        a(i2, aly.c(this.e[i2]));
        this.e[i2] = k;
        e(i2, aly.c(k));
        i(i4, i2);
        i(i2, iE);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V remove(@CheckForNull Object obj) {
        int iC = aly.c(obj);
        int iE = e(obj, iC);
        if (iE == -1) {
            return null;
        }
        V v = this.f4341c[iE];
        b(iE, iC);
        return v;
    }

    @CheckForNull
    K e(@CheckForNull Object obj) {
        int iC = aly.c(obj);
        int iA = a(obj, iC);
        if (iA == -1) {
            return null;
        }
        K k = this.e[iA];
        d(iA, iC);
        return k;
    }

    void b(int i2) {
        b(i2, aly.c(this.e[i2]));
    }

    private void e(int i2, int i3, int i4) {
        Preconditions.checkArgument(i2 != -1);
        a(i2, i3);
        c(i2, i4);
        i(this.l[i2], this.m[i2]);
        h(this.f4340b - 1, i2);
        K[] kArr = this.e;
        int i5 = this.f4340b - 1;
        kArr[i5] = null;
        this.f4341c[i5] = null;
        this.f4340b = i5;
        this.d++;
    }

    void b(int i2, int i3) {
        e(i2, i3, aly.c(this.f4341c[i2]));
    }

    void d(int i2, int i3) {
        e(i2, aly.c(this.e[i2]), i3);
    }

    private void h(int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        int i4 = this.l[i2];
        int i5 = this.m[i2];
        i(i4, i3);
        i(i3, i5);
        K[] kArr = this.e;
        K k = kArr[i2];
        V[] vArr = this.f4341c;
        V v = vArr[i2];
        kArr[i3] = k;
        vArr[i3] = v;
        int iA = a(aly.c(k));
        int[] iArr = this.f;
        int i6 = iArr[iA];
        if (i6 == i2) {
            iArr[iA] = i3;
        } else {
            int i7 = this.o[i6];
            while (i7 != i2) {
                i6 = i7;
                i7 = this.o[i7];
            }
            this.o[i6] = i3;
        }
        int[] iArr2 = this.o;
        iArr2[i3] = iArr2[i2];
        iArr2[i2] = -1;
        int iA2 = a(aly.c(v));
        int[] iArr3 = this.h;
        int i8 = iArr3[iA2];
        if (i8 == i2) {
            iArr3[iA2] = i3;
        } else {
            int i9 = this.k[i8];
            while (i9 != i2) {
                i8 = i9;
                i9 = this.k[i9];
            }
            this.k[i8] = i3;
        }
        int[] iArr4 = this.k;
        iArr4[i3] = iArr4[i2];
        iArr4[i2] = -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.e, 0, this.f4340b, (Object) null);
        Arrays.fill(this.f4341c, 0, this.f4340b, (Object) null);
        Arrays.fill(this.f, -1);
        Arrays.fill(this.h, -1);
        Arrays.fill(this.o, 0, this.f4340b, -1);
        Arrays.fill(this.k, 0, this.f4340b, -1);
        Arrays.fill(this.l, 0, this.f4340b, -1);
        Arrays.fill(this.m, 0, this.f4340b, -1);
        this.f4340b = 0;
        this.g = -2;
        this.n = -2;
        this.d++;
    }

    static abstract class View<K, V, T> extends AbstractSet<T> {
        final HashBiMap<K, V> biMap;

        @ParametricNullness
        abstract T forEntry(int i);

        View(HashBiMap<K, V> hashBiMap) {
            this.biMap = hashBiMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new Iterator<T>() { // from class: com.google.common.collect.HashBiMap.View.5

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f4342a = -1;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f4343b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f4344c;
                private int e;

                {
                    this.e = ((HashBiMap) View.this.biMap).g;
                    this.f4343b = View.this.biMap.d;
                    this.f4344c = View.this.biMap.f4340b;
                }

                private void a() {
                    if (View.this.biMap.d != this.f4343b) {
                        throw new ConcurrentModificationException();
                    }
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    a();
                    return this.e != -2 && this.f4344c > 0;
                }

                @Override // java.util.Iterator
                @ParametricNullness
                public T next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    T t = (T) View.this.forEntry(this.e);
                    this.f4342a = this.e;
                    this.e = ((HashBiMap) View.this.biMap).m[this.e];
                    this.f4344c--;
                    return t;
                }

                @Override // java.util.Iterator
                public void remove() {
                    a();
                    ale.b(this.f4342a != -1);
                    View.this.biMap.b(this.f4342a);
                    if (this.e == View.this.biMap.f4340b) {
                        this.e = this.f4342a;
                    }
                    this.f4342a = -1;
                    this.f4343b = View.this.biMap.d;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.biMap.f4340b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.biMap.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.i;
        if (set != null) {
            return set;
        }
        i iVar = new i();
        this.i = iVar;
        return iVar;
    }

    final class i extends View<K, V, K> {
        i() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.View
        @ParametricNullness
        K forEntry(int i) {
            return (K) ams.e(HashBiMap.this.e[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            int iC = aly.c(obj);
            int iE = HashBiMap.this.e(obj, iC);
            if (iE == -1) {
                return false;
            }
            HashBiMap.this.b(iE, iC);
            return true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    public Set<V> values() {
        Set<V> set = this.s;
        if (set != null) {
            return set;
        }
        h hVar = new h();
        this.s = hVar;
        return hVar;
    }

    final class h extends View<K, V, V> {
        h() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.View
        @ParametricNullness
        V forEntry(int i) {
            return (V) ams.e(HashBiMap.this.f4341c[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            int iC = aly.c(obj);
            int iA = HashBiMap.this.a(obj, iC);
            if (iA == -1) {
                return false;
            }
            HashBiMap.this.d(iA, iC);
            return true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f4339a;
        if (set != null) {
            return set;
        }
        e eVar = new e();
        this.f4339a = eVar;
        return eVar;
    }

    final class e extends View<K, V, Map.Entry<K, V>> {
        e() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iD = HashBiMap.this.d(key);
            return iD != -1 && Objects.equal(value, HashBiMap.this.f4341c[iD]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iC = aly.c(key);
            int iE = HashBiMap.this.e(key, iC);
            if (iE == -1 || !Objects.equal(value, HashBiMap.this.f4341c[iE])) {
                return false;
            }
            HashBiMap.this.b(iE, iC);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.HashBiMap.View
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> forEntry(int i) {
            return new d(i);
        }
    }

    final class d extends AbstractMapEntry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @ParametricNullness
        final K f4349a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f4351c;

        d(int i) {
            this.f4349a = (K) ams.e(HashBiMap.this.e[i]);
            this.f4351c = i;
        }

        void c() {
            int i = this.f4351c;
            if (i == -1 || i > HashBiMap.this.f4340b || !Objects.equal(HashBiMap.this.e[this.f4351c], this.f4349a)) {
                this.f4351c = HashBiMap.this.d(this.f4349a);
            }
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getKey() {
            return this.f4349a;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getValue() {
            c();
            return this.f4351c == -1 ? (V) ams.c() : (V) ams.e(HashBiMap.this.f4341c[this.f4351c]);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V setValue(@ParametricNullness V v) {
            c();
            if (this.f4351c == -1) {
                HashBiMap.this.put(this.f4349a, v);
                return (V) ams.c();
            }
            V v2 = (V) ams.e(HashBiMap.this.f4341c[this.f4351c]);
            if (Objects.equal(v2, v)) {
                return v;
            }
            HashBiMap.this.e(this.f4351c, (Object) v, false);
            return v2;
        }
    }

    @Override // com.google.common.collect.BiMap
    public BiMap<V, K> inverse() {
        BiMap<V, K> biMap = this.j;
        if (biMap != null) {
            return biMap;
        }
        a aVar = new a(this);
        this.j = aVar;
        return aVar;
    }

    static class a<K, V> extends AbstractMap<V, K> implements BiMap<V, K>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private transient Set<Map.Entry<V, K>> f4345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HashBiMap<K, V> f4346c;

        a(HashBiMap<K, V> hashBiMap) {
            this.f4346c = hashBiMap;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f4346c.f4340b;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return this.f4346c.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public K get(@CheckForNull Object obj) {
            return this.f4346c.b(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(@CheckForNull Object obj) {
            return this.f4346c.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        @CheckForNull
        public K put(@ParametricNullness V v, @ParametricNullness K k) {
            return this.f4346c.d(v, k, false);
        }

        @Override // com.google.common.collect.BiMap
        @CheckForNull
        public K forcePut(@ParametricNullness V v, @ParametricNullness K k) {
            return this.f4346c.d(v, k, true);
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<K, V> inverse() {
            return this.f4346c;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public K remove(@CheckForNull Object obj) {
            return this.f4346c.e(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f4346c.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.f4346c.values();
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public Set<K> values() {
            return this.f4346c.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.f4345b;
            if (set != null) {
                return set;
            }
            c cVar = new c(this.f4346c);
            this.f4345b = cVar;
            return cVar;
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            ((HashBiMap) this.f4346c).j = this;
        }
    }

    static class c<K, V> extends View<K, V, Map.Entry<V, K>> {
        c(HashBiMap<K, V> hashBiMap) {
            super(hashBiMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iC = this.biMap.c(key);
            return iC != -1 && Objects.equal(this.biMap.e[iC], value);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iC = aly.c(key);
            int iA = this.biMap.a(key, iC);
            if (iA == -1 || !Objects.equal(this.biMap.e[iA], value)) {
                return false;
            }
            this.biMap.d(iA, iC);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.HashBiMap.View
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<V, K> forEntry(int i) {
            return new b(this.biMap, i);
        }
    }

    static final class b<K, V> extends AbstractMapEntry<V, K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f4347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @ParametricNullness
        final V f4348b;
        final HashBiMap<K, V> d;

        b(HashBiMap<K, V> hashBiMap, int i) {
            this.d = hashBiMap;
            this.f4348b = (V) ams.e(hashBiMap.f4341c[i]);
            this.f4347a = i;
        }

        private void a() {
            int i = this.f4347a;
            if (i == -1 || i > this.d.f4340b || !Objects.equal(this.f4348b, this.d.f4341c[this.f4347a])) {
                this.f4347a = this.d.c(this.f4348b);
            }
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getKey() {
            return this.f4348b;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getValue() {
            a();
            return this.f4347a == -1 ? (K) ams.c() : (K) ams.e(this.d.e[this.f4347a]);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K setValue(@ParametricNullness K k) {
            a();
            if (this.f4347a == -1) {
                this.d.d(this.f4348b, k, false);
                return (K) ams.c();
            }
            K k2 = (K) ams.e(this.d.e[this.f4347a]);
            if (Objects.equal(k2, k)) {
                return k;
            }
            this.d.a(this.f4347a, k, false);
            return k2;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        ann.c(this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int iE = ann.e(objectInputStream);
        c(16);
        ann.e(this, objectInputStream, iE);
    }
}
