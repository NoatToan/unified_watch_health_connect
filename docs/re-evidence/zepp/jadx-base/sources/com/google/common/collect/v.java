package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
class v<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final int l = 1073741824;
    public static final float m = 1.0f;
    private static final long n = 4294967295L;
    private static final long o = -4294967296L;
    public static final int p = 3;
    public static final int q = -1;

    @MonotonicNonNullDecl
    private transient int[] a;

    @VisibleForTesting
    @MonotonicNonNullDecl
    public transient long[] b;

    @VisibleForTesting
    @MonotonicNonNullDecl
    public transient Object[] c;

    @VisibleForTesting
    @MonotonicNonNullDecl
    public transient Object[] d;
    public transient float e;
    public transient int f;
    private transient int g;
    private transient int h;

    @MonotonicNonNullDecl
    private transient Set<K> i;

    @MonotonicNonNullDecl
    private transient Set<Map.Entry<K, V>> j;

    @MonotonicNonNullDecl
    private transient Collection<V> k;

    public class a extends v<K, V>.e<K> {
        public a() {
            super(v.this, null);
        }

        @Override // com.google.common.collect.v.e
        public K b(int i) {
            return (K) v.this.c[i];
        }
    }

    public class b extends v<K, V>.e<Map.Entry<K, V>> {
        public b() {
            super(v.this, null);
        }

        @Override // com.google.common.collect.v.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> b(int i) {
            return new g(i);
        }
    }

    public class c extends v<K, V>.e<V> {
        public c() {
            super(v.this, null);
        }

        @Override // com.google.common.collect.v.e
        public V b(int i) {
            return (V) v.this.d[i];
        }
    }

    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            v.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iT = v.this.t(entry.getKey());
            return iT != -1 && Objects.equal(v.this.d[iT], entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return v.this.n();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iT = v.this.t(entry.getKey());
            if (iT == -1 || !Objects.equal(v.this.d[iT], entry.getValue())) {
                return false;
            }
            v.this.B(iT);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return v.this.h;
        }
    }

    public class f extends AbstractSet<K> {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            v.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return v.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return v.this.w();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            int iT = v.this.t(obj);
            if (iT == -1) {
                return false;
            }
            v.this.B(iT);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return v.this.h;
        }
    }

    public final class g extends com.google.common.collect.f<K, V> {

        @NullableDecl
        private final K a;
        private int b;

        public g(int i) {
            this.a = (K) v.this.c[i];
            this.b = i;
        }

        private void f() {
            int i = this.b;
            if (i == -1 || i >= v.this.size() || !Objects.equal(this.a, v.this.c[this.b])) {
                this.b = v.this.t(this.a);
            }
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public K getKey() {
            return this.a;
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public V getValue() {
            f();
            int i = this.b;
            if (i == -1) {
                return null;
            }
            return (V) v.this.d[i];
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public V setValue(V v) {
            f();
            int i = this.b;
            if (i == -1) {
                v.this.put(this.a, v);
                return null;
            }
            Object[] objArr = v.this.d;
            V v2 = (V) objArr[i];
            objArr[i] = v;
            return v2;
        }
    }

    public class h extends AbstractCollection<V> {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            v.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return v.this.H();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return v.this.h;
        }
    }

    public v() {
        u(3, 1.0f);
    }

    @NullableDecl
    private V A(@NullableDecl Object obj, int i) {
        int iS = s() & i;
        int i2 = this.a[iS];
        if (i2 == -1) {
            return null;
        }
        int i3 = -1;
        while (true) {
            if (p(this.b[i2]) == i && Objects.equal(obj, this.c[i2])) {
                V v = (V) this.d[i2];
                if (i3 == -1) {
                    this.a[iS] = q(this.b[i2]);
                } else {
                    long[] jArr = this.b;
                    jArr[i3] = F(jArr[i3], q(jArr[i2]));
                }
                x(i2);
                this.h--;
                this.f++;
                return v;
            }
            int iQ = q(this.b[i2]);
            if (iQ == -1) {
                return null;
            }
            i3 = i2;
            i2 = iQ;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CanIgnoreReturnValue
    public V B(int i) {
        return A(this.c[i], p(this.b[i]));
    }

    private void D(int i) {
        int length = this.b.length;
        if (i > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                C(iMax);
            }
        }
    }

    private void E(int i) {
        if (this.a.length >= 1073741824) {
            this.g = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (i * this.e)) + 1;
        int[] iArrZ = z(i);
        long[] jArr = this.b;
        int length = iArrZ.length - 1;
        for (int i3 = 0; i3 < this.h; i3++) {
            int iP = p(jArr[i3]);
            int i4 = iP & length;
            int i5 = iArrZ[i4];
            iArrZ[i4] = i3;
            jArr[i3] = (((long) iP) << 32) | (((long) i5) & 4294967295L);
        }
        this.g = i2;
        this.a = iArrZ;
    }

    private static long F(long j, int i) {
        return (j & o) | (((long) i) & 4294967295L);
    }

    public static <K, V> v<K, V> h() {
        return new v<>();
    }

    public static <K, V> v<K, V> m(int i) {
        return new v<>(i);
    }

    private static int p(long j) {
        return (int) (j >>> 32);
    }

    private static int q(long j) {
        return (int) j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        u(3, 1.0f);
        int i = objectInputStream.readInt();
        while (true) {
            i--;
            if (i < 0) {
                return;
            } else {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
        }
    }

    private int s() {
        return this.a.length - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int t(@NullableDecl Object obj) {
        int iD = b1.d(obj);
        int iQ = this.a[s() & iD];
        while (iQ != -1) {
            long j = this.b[iQ];
            if (p(j) == iD && Objects.equal(obj, this.c[iQ])) {
                return iQ;
            }
            iQ = q(j);
        }
        return -1;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.h);
        for (int i = 0; i < this.h; i++) {
            objectOutputStream.writeObject(this.c[i]);
            objectOutputStream.writeObject(this.d[i]);
        }
    }

    private static long[] y(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private static int[] z(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public void C(int i) {
        this.c = Arrays.copyOf(this.c, i);
        this.d = Arrays.copyOf(this.d, i);
        long[] jArr = this.b;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(jArrCopyOf, length, i, -1L);
        }
        this.b = jArrCopyOf;
    }

    public void G() {
        int i = this.h;
        if (i < this.b.length) {
            C(i);
        }
        int iMax = Math.max(1, Integer.highestOneBit((int) (i / this.e)));
        if (iMax < 1073741824 && ((double) i) / ((double) iMax) > this.e) {
            iMax <<= 1;
        }
        if (iMax < this.a.length) {
            E(iMax);
        }
    }

    public Iterator<V> H() {
        return new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f++;
        Arrays.fill(this.c, 0, this.h, (Object) null);
        Arrays.fill(this.d, 0, this.h, (Object) null);
        Arrays.fill(this.a, -1);
        Arrays.fill(this.b, -1L);
        this.h = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return t(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        for (int i = 0; i < this.h; i++) {
            if (Objects.equal(obj, this.d[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.j;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setI = i();
        this.j = setI;
        return setI;
    }

    public void f(int i) {
    }

    public int g(int i, int i2) {
        return i - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(@NullableDecl Object obj) {
        int iT = t(obj);
        f(iT);
        if (iT == -1) {
            return null;
        }
        return (V) this.d[iT];
    }

    public Set<Map.Entry<K, V>> i() {
        return new d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.h == 0;
    }

    public Set<K> j() {
        return new f();
    }

    public Collection<V> k() {
        return new h();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.i;
        if (set != null) {
            return set;
        }
        Set<K> setJ = j();
        this.i = setJ;
        return setJ;
    }

    public Iterator<Map.Entry<K, V>> n() {
        return new b();
    }

    public int o() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public V put(@NullableDecl K k, @NullableDecl V v) {
        long[] jArr = this.b;
        Object[] objArr = this.c;
        Object[] objArr2 = this.d;
        int iD = b1.d(k);
        int iS = s() & iD;
        int i = this.h;
        int[] iArr = this.a;
        int i2 = iArr[iS];
        if (i2 == -1) {
            iArr[iS] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (p(j) == iD && Objects.equal(k, objArr[i2])) {
                    V v2 = (V) objArr2[i2];
                    objArr2[i2] = v;
                    f(i2);
                    return v2;
                }
                int iQ = q(j);
                if (iQ == -1) {
                    jArr[i2] = F(j, i);
                    break;
                }
                i2 = iQ;
            }
        }
        if (i == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i3 = i + 1;
        D(i3);
        v(i, k, v, iD);
        this.h = i3;
        if (i >= this.g) {
            E(this.a.length * 2);
        }
        this.f++;
        return null;
    }

    public int r(int i) {
        int i2 = i + 1;
        if (i2 < this.h) {
            return i2;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public V remove(@NullableDecl Object obj) {
        return A(obj, b1.d(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.h;
    }

    public void u(int i, float f2) {
        Preconditions.checkArgument(i >= 0, "Initial capacity must be non-negative");
        Preconditions.checkArgument(f2 > 0.0f, "Illegal load factor");
        int iA = b1.a(i, f2);
        this.a = z(iA);
        this.e = f2;
        this.c = new Object[i];
        this.d = new Object[i];
        this.b = y(i);
        this.g = Math.max(1, (int) (iA * f2));
    }

    public void v(int i, @NullableDecl K k, @NullableDecl V v, int i2) {
        this.b[i] = (((long) i2) << 32) | 4294967295L;
        this.c[i] = k;
        this.d[i] = v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.k;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionK = k();
        this.k = collectionK;
        return collectionK;
    }

    public Iterator<K> w() {
        return new a();
    }

    public void x(int i) {
        int size = size() - 1;
        if (i >= size) {
            this.c[i] = null;
            this.d[i] = null;
            this.b[i] = -1;
            return;
        }
        Object[] objArr = this.c;
        objArr[i] = objArr[size];
        Object[] objArr2 = this.d;
        objArr2[i] = objArr2[size];
        objArr[size] = null;
        objArr2[size] = null;
        long[] jArr = this.b;
        long j = jArr[size];
        jArr[i] = j;
        jArr[size] = -1;
        int iP = p(j) & s();
        int[] iArr = this.a;
        int i2 = iArr[iP];
        if (i2 == size) {
            iArr[iP] = i;
            return;
        }
        while (true) {
            long j2 = this.b[i2];
            int iQ = q(j2);
            if (iQ == size) {
                this.b[i2] = F(j2, i);
                return;
            }
            i2 = iQ;
        }
    }

    public v(int i) {
        this(i, 1.0f);
    }

    public abstract class e<T> implements Iterator<T> {
        public int a;
        public int b;
        public int c;

        private e() {
            this.a = v.this.f;
            this.b = v.this.o();
            this.c = -1;
        }

        private void a() {
            if (v.this.f != this.a) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract T b(int i);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.b;
            this.c = i;
            T tB = b(i);
            this.b = v.this.r(this.b);
            return tB;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            u.e(this.c >= 0);
            this.a++;
            v.this.B(this.c);
            this.b = v.this.g(this.b, this.c);
            this.c = -1;
        }

        public /* synthetic */ e(v vVar, a aVar) {
            this();
        }
    }

    public v(int i, float f2) {
        u(i, f2);
    }
}
