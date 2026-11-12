package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.concurrent.LazyInit;
import defpackage.ale;
import defpackage.alk;
import defpackage.aly;
import defpackage.ams;
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
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f4306b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @CheckForNull
    transient Object[] f4307a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    @LazyInit
    private transient Set<Map.Entry<K, V>> f4308c;

    @CheckForNull
    transient Object[] d;

    @CheckForNull
    transient int[] e;

    @CheckForNull
    @LazyInit
    private transient Collection<V> f;

    @CheckForNull
    private transient Object g;
    private transient int h;
    private transient int i;

    @CheckForNull
    @LazyInit
    private transient Set<K> j;

    protected void b(int i) {
    }

    protected int e(int i, int i2) {
        return i - 1;
    }

    static /* synthetic */ int a(CompactHashMap compactHashMap) {
        int i = compactHashMap.i;
        compactHashMap.i = i - 1;
        return i;
    }

    public static <K, V> CompactHashMap<K, V> b() {
        return new CompactHashMap<>();
    }

    public static <K, V> CompactHashMap<K, V> d(int i) {
        return new CompactHashMap<>(i);
    }

    CompactHashMap() {
        a(3);
    }

    public CompactHashMap(int i) {
        a(i);
    }

    public void a(int i) {
        Preconditions.checkArgument(i >= 0, "Expected size must be >= 0");
        this.h = Ints.d(i, 1, 1073741823);
    }

    protected boolean o() {
        return this.g == null;
    }

    public int c() {
        Preconditions.checkState(o(), "Arrays already allocated");
        int i = this.h;
        int iA = alk.a(i);
        this.g = alk.c(iA);
        j(iA - 1);
        this.e = new int[i];
        this.f4307a = new Object[i];
        this.d = new Object[i];
        return i;
    }

    @CheckForNull
    Map<K, V> i() {
        Object obj = this.g;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    protected Map<K, V> c(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    public Map<K, V> a() {
        Map<K, V> mapC = c(l() + 1);
        int iH = h();
        while (iH >= 0) {
            mapC.put(i(iH), l(iH));
            iH = e(iH);
        }
        this.g = mapC;
        this.e = null;
        this.f4307a = null;
        this.d = null;
        n();
        return mapC;
    }

    private void j(int i) {
        this.h = alk.a(this.h, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int l() {
        return (1 << (this.h & 31)) - 1;
    }

    protected void n() {
        this.h += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V put(@ParametricNullness K k, @ParametricNullness V v) {
        int iC;
        int i;
        if (o()) {
            c();
        }
        Map<K, V> mapI = i();
        if (mapI != null) {
            return mapI.put(k, v);
        }
        int[] iArrP = p();
        Object[] objArrS = s();
        Object[] objArrR = r();
        int i2 = this.i;
        int i3 = i2 + 1;
        int iC2 = aly.c(k);
        int iL = l();
        int i4 = iC2 & iL;
        int iB = alk.b(t(), i4);
        if (iB != 0) {
            int iC3 = alk.c(iC2, iL);
            int i5 = 0;
            while (true) {
                int i6 = iB - 1;
                int i7 = iArrP[i6];
                if (alk.c(i7, iL) == iC3 && Objects.equal(k, objArrS[i6])) {
                    V v2 = (V) objArrR[i6];
                    objArrR[i6] = v;
                    b(i6);
                    return v2;
                }
                int iB2 = alk.b(i7, iL);
                i5++;
                if (iB2 != 0) {
                    iB = iB2;
                } else {
                    if (i5 >= 9) {
                        return a().put(k, v);
                    }
                    if (i3 > iL) {
                        iC = c(iL, alk.b(iL), iC2, i2);
                        i = iC;
                    } else {
                        iArrP[i6] = alk.a(i7, i3, iL);
                        i = iL;
                    }
                }
            }
        } else if (i3 > iL) {
            iC = c(iL, alk.b(iL), iC2, i2);
            i = iC;
        } else {
            alk.e(t(), i4, i3);
            i = iL;
        }
        g(i3);
        c(i2, k, v, iC2, i);
        this.i = i3;
        n();
        return null;
    }

    public void c(int i, @ParametricNullness K k, @ParametricNullness V v, int i2, int i3) {
        a(i, alk.a(i2, 0, i3));
        c(i, k);
        e(i, v);
    }

    private void g(int i) {
        int iMin;
        int length = p().length;
        if (i <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        h(iMin);
    }

    public void h(int i) {
        this.e = Arrays.copyOf(p(), i);
        this.f4307a = Arrays.copyOf(s(), i);
        this.d = Arrays.copyOf(r(), i);
    }

    private int c(int i, int i2, int i3, int i4) {
        Object objC = alk.c(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            alk.e(objC, i3 & i5, i4 + 1);
        }
        Object objT = t();
        int[] iArrP = p();
        for (int i6 = 0; i6 <= i; i6++) {
            int iB = alk.b(objT, i6);
            while (iB != 0) {
                int i7 = iB - 1;
                int i8 = iArrP[i7];
                int iC = alk.c(i8, i) | i6;
                int i9 = iC & i5;
                int iB2 = alk.b(objC, i9);
                alk.e(objC, i9, iB);
                iArrP[i7] = alk.a(iC, iB2, i5);
                iB = alk.b(i8, i);
            }
        }
        this.g = objC;
        j(i5);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(@CheckForNull Object obj) {
        if (o()) {
            return -1;
        }
        int iC = aly.c(obj);
        int iL = l();
        int iB = alk.b(t(), iC & iL);
        if (iB == 0) {
            return -1;
        }
        int iC2 = alk.c(iC, iL);
        do {
            int i = iB - 1;
            int iF = f(i);
            if (alk.c(iF, iL) == iC2 && Objects.equal(obj, i(i))) {
                return i;
            }
            iB = alk.b(iF, iL);
        } while (iB != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        Map<K, V> mapI = i();
        if (mapI != null) {
            return mapI.containsKey(obj);
        }
        return a(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        Map<K, V> mapI = i();
        if (mapI != null) {
            return mapI.get(obj);
        }
        int iA = a(obj);
        if (iA == -1) {
            return null;
        }
        b(iA);
        return l(iA);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V remove(@CheckForNull Object obj) {
        Map<K, V> mapI = i();
        if (mapI != null) {
            return mapI.remove(obj);
        }
        V v = (V) e(obj);
        if (v == f4306b) {
            return null;
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object e(@CheckForNull Object obj) {
        if (o()) {
            return f4306b;
        }
        int iL = l();
        int iB = alk.b(obj, null, iL, t(), p(), s(), null);
        if (iB == -1) {
            return f4306b;
        }
        V vL = l(iB);
        c(iB, iL);
        this.i--;
        n();
        return vL;
    }

    public void c(int i, int i2) {
        Object objT = t();
        int[] iArrP = p();
        Object[] objArrS = s();
        Object[] objArrR = r();
        int size = size();
        int i3 = size - 1;
        if (i < i3) {
            Object obj = objArrS[i3];
            objArrS[i] = obj;
            objArrR[i] = objArrR[i3];
            objArrS[i3] = null;
            objArrR[i3] = null;
            iArrP[i] = iArrP[i3];
            iArrP[i3] = 0;
            int iC = aly.c(obj) & i2;
            int iB = alk.b(objT, iC);
            if (iB == size) {
                alk.e(objT, iC, i + 1);
                return;
            }
            while (true) {
                int i4 = iB - 1;
                int i5 = iArrP[i4];
                int iB2 = alk.b(i5, i2);
                if (iB2 == size) {
                    iArrP[i4] = alk.a(i5, i + 1, i2);
                    return;
                }
                iB = iB2;
            }
        } else {
            objArrS[i] = null;
            objArrR[i] = null;
            iArrP[i] = 0;
        }
    }

    protected int h() {
        return isEmpty() ? -1 : 0;
    }

    protected int e(int i) {
        int i2 = i + 1;
        if (i2 < this.i) {
            return i2;
        }
        return -1;
    }

    abstract class Itr<T> implements Iterator<T> {
        int currentIndex;
        int expectedMetadata;
        int indexToRemove;

        @ParametricNullness
        abstract T getOutput(int i);

        private Itr() {
            this.expectedMetadata = CompactHashMap.this.h;
            this.currentIndex = CompactHashMap.this.h();
            this.indexToRemove = -1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.currentIndex >= 0;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            checkForConcurrentModification();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.currentIndex;
            this.indexToRemove = i;
            T output = getOutput(i);
            this.currentIndex = CompactHashMap.this.e(this.currentIndex);
            return output;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForConcurrentModification();
            ale.b(this.indexToRemove >= 0);
            incrementExpectedModCount();
            CompactHashMap compactHashMap = CompactHashMap.this;
            compactHashMap.remove(compactHashMap.i(this.indexToRemove));
            this.currentIndex = CompactHashMap.this.e(this.currentIndex, this.indexToRemove);
            this.indexToRemove = -1;
        }

        void incrementExpectedModCount() {
            this.expectedMetadata += 32;
        }

        private void checkForConcurrentModification() {
            if (CompactHashMap.this.h != this.expectedMetadata) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.j;
        if (set != null) {
            return set;
        }
        Set<K> setG = g();
        this.j = setG;
        return setG;
    }

    Set<K> g() {
        return new e();
    }

    class e extends AbstractSet<K> {
        e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            Map<K, V> mapI = CompactHashMap.this.i();
            if (mapI != null) {
                return mapI.keySet().remove(obj);
            }
            return CompactHashMap.this.e(obj) != CompactHashMap.f4306b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return CompactHashMap.this.m();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }
    }

    Iterator<K> m() {
        Map<K, V> mapI = i();
        if (mapI != null) {
            return mapI.keySet().iterator();
        }
        return new CompactHashMap<K, V>.Itr<K>() { // from class: com.google.common.collect.CompactHashMap.5
            @Override // com.google.common.collect.CompactHashMap.Itr
            @ParametricNullness
            K getOutput(int i) {
                return (K) CompactHashMap.this.i(i);
            }
        };
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f4308c;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setD = d();
        this.f4308c = setD;
        return setD;
    }

    Set<Map.Entry<K, V>> d() {
        return new b();
    }

    class b extends AbstractSet<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return CompactHashMap.this.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            Map<K, V> mapI = CompactHashMap.this.i();
            if (mapI != null) {
                return mapI.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iA = CompactHashMap.this.a(entry.getKey());
            return iA != -1 && Objects.equal(CompactHashMap.this.l(iA), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            Map<K, V> mapI = CompactHashMap.this.i();
            if (mapI != null) {
                return mapI.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (CompactHashMap.this.o()) {
                return false;
            }
            int iL = CompactHashMap.this.l();
            int iB = alk.b(entry.getKey(), entry.getValue(), iL, CompactHashMap.this.t(), CompactHashMap.this.p(), CompactHashMap.this.s(), CompactHashMap.this.r());
            if (iB == -1) {
                return false;
            }
            CompactHashMap.this.c(iB, iL);
            CompactHashMap.a(CompactHashMap.this);
            CompactHashMap.this.n();
            return true;
        }
    }

    Iterator<Map.Entry<K, V>> j() {
        Map<K, V> mapI = i();
        if (mapI != null) {
            return mapI.entrySet().iterator();
        }
        return new CompactHashMap<K, V>.Itr<Map.Entry<K, V>>() { // from class: com.google.common.collect.CompactHashMap.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.CompactHashMap.Itr
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> getOutput(int i) {
                return new a(i);
            }
        };
    }

    final class a extends AbstractMapEntry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @ParametricNullness
        private final K f4310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f4311c;

        a(int i) {
            this.f4310b = (K) CompactHashMap.this.i(i);
            this.f4311c = i;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getKey() {
            return this.f4310b;
        }

        private void c() {
            int i = this.f4311c;
            if (i == -1 || i >= CompactHashMap.this.size() || !Objects.equal(this.f4310b, CompactHashMap.this.i(this.f4311c))) {
                this.f4311c = CompactHashMap.this.a(this.f4310b);
            }
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getValue() {
            Map<K, V> mapI = CompactHashMap.this.i();
            if (mapI != null) {
                return (V) ams.e(mapI.get(this.f4310b));
            }
            c();
            int i = this.f4311c;
            return i == -1 ? (V) ams.c() : (V) CompactHashMap.this.l(i);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V setValue(@ParametricNullness V v) {
            Map<K, V> mapI = CompactHashMap.this.i();
            if (mapI != null) {
                return (V) ams.e(mapI.put(this.f4310b, v));
            }
            c();
            int i = this.f4311c;
            if (i != -1) {
                V v2 = (V) CompactHashMap.this.l(i);
                CompactHashMap.this.e(this.f4311c, v);
                return v2;
            }
            CompactHashMap.this.put(this.f4310b, v);
            return (V) ams.c();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> mapI = i();
        return mapI != null ? mapI.size() : this.i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        Map<K, V> mapI = i();
        if (mapI != null) {
            return mapI.containsValue(obj);
        }
        for (int i = 0; i < this.i; i++) {
            if (Objects.equal(obj, l(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionF = f();
        this.f = collectionF;
        return collectionF;
    }

    Collection<V> f() {
        return new d();
    }

    class d extends AbstractCollection<V> {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return CompactHashMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return CompactHashMap.this.k();
        }
    }

    Iterator<V> k() {
        Map<K, V> mapI = i();
        if (mapI != null) {
            return mapI.values().iterator();
        }
        return new CompactHashMap<K, V>.Itr<V>() { // from class: com.google.common.collect.CompactHashMap.1
            @Override // com.google.common.collect.CompactHashMap.Itr
            @ParametricNullness
            V getOutput(int i) {
                return (V) CompactHashMap.this.l(i);
            }
        };
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (o()) {
            return;
        }
        n();
        Map<K, V> mapI = i();
        if (mapI != null) {
            this.h = Ints.d(size(), 3, 1073741823);
            mapI.clear();
            this.g = null;
            this.i = 0;
            return;
        }
        Arrays.fill(s(), 0, this.i, (Object) null);
        Arrays.fill(r(), 0, this.i, (Object) null);
        alk.b(t());
        Arrays.fill(p(), 0, this.i, 0);
        this.i = 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<K, V>> itJ = j();
        while (itJ.hasNext()) {
            Map.Entry<K, V> next = itJ.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException("Invalid size: " + i);
        }
        a(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object t() {
        return java.util.Objects.requireNonNull(this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] p() {
        return (int[]) java.util.Objects.requireNonNull(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] s() {
        return (Object[]) java.util.Objects.requireNonNull(this.f4307a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] r() {
        return (Object[]) java.util.Objects.requireNonNull(this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public K i(int i) {
        return (K) s()[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V l(int i) {
        return (V) r()[i];
    }

    private int f(int i) {
        return p()[i];
    }

    private void c(int i, K k) {
        s()[i] = k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, V v) {
        r()[i] = v;
    }

    private void a(int i, int i2) {
        p()[i] = i2;
    }
}
