package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes5.dex */
public class x84<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object f38828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int[] f38829b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e;
    public transient int f;
    public transient Set<K> g;
    public transient Set<Map.Entry<K, V>> h;
    public transient Collection<V> i;

    public class a extends x84<K, V>.e<K> {
        public a() {
            super(x84.this, null);
        }

        @Override // x84.e
        public K b(int i) {
            return (K) x84.this.O(i);
        }
    }

    public class b extends x84<K, V>.e<Map.Entry<K, V>> {
        public b() {
            super(x84.this, null);
        }

        @Override // x84.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> b(int i) {
            return new g(i);
        }
    }

    public class c extends x84<K, V>.e<V> {
        public c() {
            super(x84.this, null);
        }

        @Override // x84.e
        public V b(int i) {
            return (V) x84.this.f0(i);
        }
    }

    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            x84.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> mapE = x84.this.E();
            if (mapE != null) {
                return mapE.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iL = x84.this.L(entry.getKey());
            return iL != -1 && j4h.a(x84.this.f0(iL), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return x84.this.G();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> mapE = x84.this.E();
            if (mapE != null) {
                return mapE.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (x84.this.S()) {
                return false;
            }
            int iJ = x84.this.J();
            int iF = z84.f(entry.getKey(), entry.getValue(), iJ, x84.this.W(), x84.this.U(), x84.this.V(), x84.this.X());
            if (iF == -1) {
                return false;
            }
            x84.this.Q(iF, iJ);
            x84.f(x84.this);
            x84.this.K();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return x84.this.size();
        }
    }

    public class f extends AbstractSet<K> {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            x84.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return x84.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return x84.this.P();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> mapE = x84.this.E();
            if (mapE != null) {
                return mapE.keySet().remove(obj);
            }
            return x84.this.T(obj) != x84.j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return x84.this.size();
        }
    }

    public final class g extends f10<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f38834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f38835b;

        public g(int i) {
            this.f38834a = (K) x84.this.O(i);
            this.f38835b = i;
        }

        public final void a() {
            int i = this.f38835b;
            if (i == -1 || i >= x84.this.size() || !j4h.a(this.f38834a, x84.this.O(this.f38835b))) {
                this.f38835b = x84.this.L(this.f38834a);
            }
        }

        @Override // defpackage.f10, java.util.Map.Entry
        public K getKey() {
            return this.f38834a;
        }

        @Override // defpackage.f10, java.util.Map.Entry
        public V getValue() {
            Map<K, V> mapE = x84.this.E();
            if (mapE != null) {
                return (V) d2h.a(mapE.get(this.f38834a));
            }
            a();
            int i = this.f38835b;
            return i == -1 ? (V) d2h.b() : (V) x84.this.f0(i);
        }

        @Override // defpackage.f10, java.util.Map.Entry
        public V setValue(V v) {
            Map<K, V> mapE = x84.this.E();
            if (mapE != null) {
                return (V) d2h.a(mapE.put(this.f38834a, v));
            }
            a();
            int i = this.f38835b;
            if (i == -1) {
                x84.this.put(this.f38834a, v);
                return (V) d2h.b();
            }
            V v2 = (V) x84.this.f0(i);
            x84.this.e0(this.f38835b, v);
            return v2;
        }
    }

    public class h extends AbstractCollection<V> {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            x84.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return x84.this.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return x84.this.size();
        }
    }

    public x84() {
        M(3);
    }

    public static <K, V> x84<K, V> D(int i) {
        return new x84<>(i);
    }

    public static /* synthetic */ int f(x84 x84Var) {
        int i = x84Var.f;
        x84Var.f = i - 1;
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Invalid size: ");
            sb.append(i);
            throw new InvalidObjectException(sb.toString());
        }
        M(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<K, V>> itG = G();
        while (itG.hasNext()) {
            Map.Entry<K, V> next = itG.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public static <K, V> x84<K, V> y() {
        return new x84<>();
    }

    public Map<K, V> A(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    public Set<K> B() {
        return new f();
    }

    public Collection<V> C() {
        return new h();
    }

    public Map<K, V> E() {
        Object obj = this.f38828a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int F(int i) {
        return U()[i];
    }

    public Iterator<Map.Entry<K, V>> G() {
        Map<K, V> mapE = E();
        return mapE != null ? mapE.entrySet().iterator() : new b();
    }

    public int H() {
        return isEmpty() ? -1 : 0;
    }

    public int I(int i) {
        int i2 = i + 1;
        if (i2 < this.f) {
            return i2;
        }
        return -1;
    }

    public final int J() {
        return (1 << (this.e & 31)) - 1;
    }

    public void K() {
        this.e += 32;
    }

    public final int L(Object obj) {
        if (S()) {
            return -1;
        }
        int iD = qlb.d(obj);
        int iJ = J();
        int iH = z84.h(W(), iD & iJ);
        if (iH == 0) {
            return -1;
        }
        int iB = z84.b(iD, iJ);
        do {
            int i = iH - 1;
            int iF = F(i);
            if (z84.b(iF, iJ) == iB && j4h.a(obj, O(i))) {
                return i;
            }
            iH = z84.c(iF, iJ);
        } while (iH != 0);
        return -1;
    }

    public void M(int i) {
        c6i.e(i >= 0, "Expected size must be >= 0");
        this.e = ahd.e(i, 1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    public void N(int i, K k2, V v, int i2, int i3) {
        b0(i, z84.d(i2, 0, i3));
        d0(i, k2);
        e0(i, v);
    }

    public final K O(int i) {
        return (K) V()[i];
    }

    public Iterator<K> P() {
        Map<K, V> mapE = E();
        return mapE != null ? mapE.keySet().iterator() : new a();
    }

    public void Q(int i, int i2) {
        Object objW = W();
        int[] iArrU = U();
        Object[] objArrV = V();
        Object[] objArrX = X();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrV[i] = null;
            objArrX[i] = null;
            iArrU[i] = 0;
            return;
        }
        Object obj = objArrV[i3];
        objArrV[i] = obj;
        objArrX[i] = objArrX[i3];
        objArrV[i3] = null;
        objArrX[i3] = null;
        iArrU[i] = iArrU[i3];
        iArrU[i3] = 0;
        int iD = qlb.d(obj) & i2;
        int iH = z84.h(objW, iD);
        if (iH == size) {
            z84.i(objW, iD, i + 1);
            return;
        }
        while (true) {
            int i4 = iH - 1;
            int i5 = iArrU[i4];
            int iC = z84.c(i5, i2);
            if (iC == size) {
                iArrU[i4] = z84.d(i5, i + 1, i2);
                return;
            }
            iH = iC;
        }
    }

    public boolean S() {
        return this.f38828a == null;
    }

    public final Object T(Object obj) {
        if (S()) {
            return j;
        }
        int iJ = J();
        int iF = z84.f(obj, null, iJ, W(), U(), V(), null);
        if (iF == -1) {
            return j;
        }
        V vF0 = f0(iF);
        Q(iF, iJ);
        this.f--;
        K();
        return vF0;
    }

    public final int[] U() {
        int[] iArr = this.f38829b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] V() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object W() {
        Object obj = this.f38828a;
        Objects.requireNonNull(obj);
        return obj;
    }

    public final Object[] X() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public void Y(int i) {
        this.f38829b = Arrays.copyOf(U(), i);
        this.c = Arrays.copyOf(V(), i);
        this.d = Arrays.copyOf(X(), i);
    }

    public final void Z(int i) {
        int iMin;
        int length = U().length;
        if (i <= length || (iMin = Math.min(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        Y(iMin);
    }

    public final int a0(int i, int i2, int i3, int i4) {
        Object objA = z84.a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            z84.i(objA, i3 & i5, i4 + 1);
        }
        Object objW = W();
        int[] iArrU = U();
        for (int i6 = 0; i6 <= i; i6++) {
            int iH = z84.h(objW, i6);
            while (iH != 0) {
                int i7 = iH - 1;
                int i8 = iArrU[i7];
                int iB = z84.b(i8, i) | i6;
                int i9 = iB & i5;
                int iH2 = z84.h(objA, i9);
                z84.i(objA, i9, iH);
                iArrU[i7] = z84.d(iB, iH2, i5);
                iH = z84.c(i8, i);
            }
        }
        this.f38828a = objA;
        c0(i5);
        return i5;
    }

    public final void b0(int i, int i2) {
        U()[i] = i2;
    }

    public final void c0(int i) {
        this.e = z84.d(this.e, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (S()) {
            return;
        }
        K();
        Map<K, V> mapE = E();
        if (mapE != null) {
            this.e = ahd.e(size(), 3, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            mapE.clear();
            this.f38828a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(V(), 0, this.f, (Object) null);
        Arrays.fill(X(), 0, this.f, (Object) null);
        z84.g(W());
        Arrays.fill(U(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> mapE = E();
        if (mapE != null) {
            return mapE.containsKey(obj);
        }
        return L(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> mapE = E();
        if (mapE != null) {
            return mapE.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (j4h.a(obj, f0(i))) {
                return true;
            }
        }
        return false;
    }

    public final void d0(int i, K k2) {
        V()[i] = k2;
    }

    public final void e0(int i, V v) {
        X()[i] = v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.h;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setZ = z();
        this.h = setZ;
        return setZ;
    }

    public final V f0(int i) {
        return (V) X()[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> mapE = E();
        if (mapE != null) {
            return mapE.get(obj);
        }
        int iL = L(obj);
        if (iL == -1) {
            return null;
        }
        t(iL);
        return f0(iL);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public Iterator<V> k() {
        Map<K, V> mapE = E();
        return mapE != null ? mapE.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.g;
        if (set != null) {
            return set;
        }
        Set<K> setB = B();
        this.g = setB;
        return setB;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        int iA0;
        int i;
        if (S()) {
            w();
        }
        Map<K, V> mapE = E();
        if (mapE != null) {
            return mapE.put(k2, v);
        }
        int[] iArrU = U();
        Object[] objArrV = V();
        Object[] objArrX = X();
        int i2 = this.f;
        int i3 = i2 + 1;
        int iD = qlb.d(k2);
        int iJ = J();
        int i4 = iD & iJ;
        int iH = z84.h(W(), i4);
        if (iH != 0) {
            int iB = z84.b(iD, iJ);
            int i5 = 0;
            while (true) {
                int i6 = iH - 1;
                int i7 = iArrU[i6];
                if (z84.b(i7, iJ) == iB && j4h.a(k2, objArrV[i6])) {
                    V v2 = (V) objArrX[i6];
                    objArrX[i6] = v;
                    t(i6);
                    return v2;
                }
                int iC = z84.c(i7, iJ);
                i5++;
                if (iC != 0) {
                    iH = iC;
                } else {
                    if (i5 >= 9) {
                        return x().put(k2, v);
                    }
                    if (i3 > iJ) {
                        iA0 = a0(iJ, z84.e(iJ), iD, i2);
                        i = iA0;
                    } else {
                        iArrU[i6] = z84.d(i7, i3, iJ);
                        i = iJ;
                    }
                }
            }
        } else if (i3 > iJ) {
            iA0 = a0(iJ, z84.e(iJ), iD, i2);
            i = iA0;
        } else {
            z84.i(W(), i4, i3);
            i = iJ;
        }
        Z(i3);
        N(i2, k2, v, iD, i);
        this.f = i3;
        K();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> mapE = E();
        if (mapE != null) {
            return mapE.remove(obj);
        }
        V v = (V) T(obj);
        if (v == j) {
            return null;
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> mapE = E();
        return mapE != null ? mapE.size() : this.f;
    }

    public void t(int i) {
    }

    public int v(int i, int i2) {
        return i - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.i;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionC = C();
        this.i = collectionC;
        return collectionC;
    }

    public int w() {
        c6i.u(S(), "Arrays already allocated");
        int i = this.e;
        int iJ = z84.j(i);
        this.f38828a = z84.a(iJ);
        c0(iJ - 1);
        this.f38829b = new int[i];
        this.c = new Object[i];
        this.d = new Object[i];
        return i;
    }

    public Map<K, V> x() {
        Map<K, V> mapA = A(J() + 1);
        int iH = H();
        while (iH >= 0) {
            mapA.put(O(iH), f0(iH));
            iH = I(iH);
        }
        this.f38828a = mapA;
        this.f38829b = null;
        this.c = null;
        this.d = null;
        K();
        return mapA;
    }

    public Set<Map.Entry<K, V>> z() {
        return new d();
    }

    public x84(int i) {
        M(i);
    }

    public abstract class e<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f38831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f38832b;
        public int c;

        public e() {
            this.f38831a = x84.this.e;
            this.f38832b = x84.this.H();
            this.c = -1;
        }

        public final void a() {
            if (x84.this.e != this.f38831a) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract T b(int i);

        public void c() {
            this.f38831a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f38832b >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.f38832b;
            this.c = i;
            T tB = b(i);
            this.f38832b = x84.this.I(this.f38832b);
            return tB;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            d44.e(this.c >= 0);
            c();
            x84 x84Var = x84.this;
            x84Var.remove(x84Var.O(this.c));
            this.f38832b = x84.this.v(this.f38832b, this.c);
            this.c = -1;
        }

        public /* synthetic */ e(x84 x84Var, a aVar) {
            this();
        }
    }
}
