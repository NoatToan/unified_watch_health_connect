package com.airbnb.lottie.parser.moshi;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator<Comparable> h = new Comparator<Comparable>() { // from class: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f1953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a<K, V> f1954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f1955c;
    Comparator<? super K> d;
    a<K, V>[] e;
    private LinkedHashTreeMap<K, V>.b f;
    int i;
    private LinkedHashTreeMap<K, V>.c j;

    private static int d(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 ^ (i2 >>> 7)) ^ (i2 >>> 4);
    }

    LinkedHashTreeMap() {
        this(null);
    }

    LinkedHashTreeMap(Comparator<? super K> comparator) {
        this.f1953a = 0;
        this.f1955c = 0;
        this.d = comparator == null ? h : comparator;
        this.f1954b = new a<>();
        this.e = new a[16];
        this.i = 12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f1953a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        a<K, V> aVarA = a(obj);
        if (aVarA != null) {
            return aVarA.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return a(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        a<K, V> aVarD = d(k, true);
        V v2 = aVarD.h;
        aVarD.h = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.e, (Object) null);
        this.f1953a = 0;
        this.f1955c++;
        a<K, V> aVar = this.f1954b;
        a<K, V> aVar2 = aVar.f1958c;
        while (aVar2 != aVar) {
            a<K, V> aVar3 = aVar2.f1958c;
            aVar2.f = null;
            aVar2.f1958c = null;
            aVar2 = aVar3;
        }
        aVar.f = aVar;
        aVar.f1958c = aVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        a<K, V> aVarD = d(obj);
        if (aVarD != null) {
            return aVarD.h;
        }
        return null;
    }

    a<K, V> d(K k, boolean z) {
        int iCompare;
        a<K, V> aVar;
        Comparator<? super K> comparator = this.d;
        a<K, V>[] aVarArr = this.e;
        int iD = d(k.hashCode());
        int length = (aVarArr.length - 1) & iD;
        a<K, V> aVar2 = aVarArr[length];
        if (aVar2 != null) {
            Comparable comparable = comparator == h ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    iCompare = comparable.compareTo(aVar2.e);
                } else {
                    iCompare = comparator.compare(k, aVar2.e);
                }
                if (iCompare == 0) {
                    return aVar2;
                }
                a<K, V> aVar3 = iCompare < 0 ? aVar2.f1957b : aVar2.i;
                if (aVar3 == null) {
                    break;
                }
                aVar2 = aVar3;
            }
        } else {
            iCompare = 0;
        }
        a<K, V> aVar4 = aVar2;
        int i = iCompare;
        if (!z) {
            return null;
        }
        a<K, V> aVar5 = this.f1954b;
        if (aVar4 == null) {
            if (comparator == h && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            aVar = new a<>(aVar4, k, iD, aVar5, aVar5.f);
            aVarArr[length] = aVar;
        } else {
            aVar = new a<>(aVar4, k, iD, aVar5, aVar5.f);
            if (i < 0) {
                aVar4.f1957b = aVar;
            } else {
                aVar4.i = aVar;
            }
            b(aVar4, true);
        }
        int i2 = this.f1953a;
        this.f1953a = i2 + 1;
        if (i2 > this.i) {
            c();
        }
        this.f1955c++;
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    a<K, V> a(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return d(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    a<K, V> d(Map.Entry<?, ?> entry) {
        a<K, V> aVarA = a(entry.getKey());
        if (aVarA == null || !c(aVarA.h, entry.getValue())) {
            return null;
        }
        return aVarA;
    }

    private boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    void a(a<K, V> aVar, boolean z) {
        int i;
        if (z) {
            aVar.f.f1958c = aVar.f1958c;
            aVar.f1958c.f = aVar.f;
            aVar.f = null;
            aVar.f1958c = null;
        }
        a<K, V> aVar2 = aVar.f1957b;
        a<K, V> aVar3 = aVar.i;
        a<K, V> aVar4 = aVar.j;
        int i2 = 0;
        if (aVar2 != null && aVar3 != null) {
            a<K, V> aVarC = aVar2.d > aVar3.d ? aVar2.c() : aVar3.b();
            a(aVarC, false);
            a<K, V> aVar5 = aVar.f1957b;
            if (aVar5 != null) {
                i = aVar5.d;
                aVarC.f1957b = aVar5;
                aVar5.j = aVarC;
                aVar.f1957b = null;
            } else {
                i = 0;
            }
            a<K, V> aVar6 = aVar.i;
            if (aVar6 != null) {
                i2 = aVar6.d;
                aVarC.i = aVar6;
                aVar6.j = aVarC;
                aVar.i = null;
            }
            aVarC.d = Math.max(i, i2) + 1;
            c((a) aVar, (a) aVarC);
            return;
        }
        if (aVar2 != null) {
            c((a) aVar, (a) aVar2);
            aVar.f1957b = null;
        } else if (aVar3 != null) {
            c((a) aVar, (a) aVar3);
            aVar.i = null;
        } else {
            c((a) aVar, (a) null);
        }
        b(aVar4, false);
        this.f1953a--;
        this.f1955c++;
    }

    a<K, V> d(Object obj) {
        a<K, V> aVarA = a(obj);
        if (aVarA != null) {
            a(aVarA, true);
        }
        return aVarA;
    }

    private void c(a<K, V> aVar, a<K, V> aVar2) {
        a<K, V> aVar3 = aVar.j;
        aVar.j = null;
        if (aVar2 != null) {
            aVar2.j = aVar3;
        }
        if (aVar3 != null) {
            if (aVar3.f1957b == aVar) {
                aVar3.f1957b = aVar2;
                return;
            } else {
                aVar3.i = aVar2;
                return;
            }
        }
        int i = aVar.f1956a;
        a<K, V>[] aVarArr = this.e;
        aVarArr[i & (aVarArr.length - 1)] = aVar2;
    }

    private void b(a<K, V> aVar, boolean z) {
        while (aVar != null) {
            a<K, V> aVar2 = aVar.f1957b;
            a<K, V> aVar3 = aVar.i;
            int i = aVar2 != null ? aVar2.d : 0;
            int i2 = aVar3 != null ? aVar3.d : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                a<K, V> aVar4 = aVar3.f1957b;
                a<K, V> aVar5 = aVar3.i;
                int i4 = (aVar4 != null ? aVar4.d : 0) - (aVar5 != null ? aVar5.d : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    d((a) aVar);
                } else {
                    b(aVar3);
                    d((a) aVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                a<K, V> aVar6 = aVar2.f1957b;
                a<K, V> aVar7 = aVar2.i;
                int i5 = (aVar6 != null ? aVar6.d : 0) - (aVar7 != null ? aVar7.d : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    b(aVar);
                } else {
                    d((a) aVar2);
                    b(aVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                aVar.d = i + 1;
                if (z) {
                    return;
                }
            } else {
                aVar.d = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            aVar = aVar.j;
        }
    }

    private void d(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f1957b;
        a<K, V> aVar3 = aVar.i;
        a<K, V> aVar4 = aVar3.f1957b;
        a<K, V> aVar5 = aVar3.i;
        aVar.i = aVar4;
        if (aVar4 != null) {
            aVar4.j = aVar;
        }
        c((a) aVar, (a) aVar3);
        aVar3.f1957b = aVar;
        aVar.j = aVar3;
        aVar.d = Math.max(aVar2 != null ? aVar2.d : 0, aVar4 != null ? aVar4.d : 0) + 1;
        aVar3.d = Math.max(aVar.d, aVar5 != null ? aVar5.d : 0) + 1;
    }

    private void b(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f1957b;
        a<K, V> aVar3 = aVar.i;
        a<K, V> aVar4 = aVar2.f1957b;
        a<K, V> aVar5 = aVar2.i;
        aVar.f1957b = aVar5;
        if (aVar5 != null) {
            aVar5.j = aVar;
        }
        c((a) aVar, (a) aVar2);
        aVar2.i = aVar;
        aVar.j = aVar2;
        aVar.d = Math.max(aVar3 != null ? aVar3.d : 0, aVar5 != null ? aVar5.d : 0) + 1;
        aVar2.d = Math.max(aVar.d, aVar4 != null ? aVar4.d : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.c cVar = this.j;
        if (cVar != null) {
            return cVar;
        }
        LinkedHashTreeMap<K, V>.c cVar2 = new c();
        this.j = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.b bVar = this.f;
        if (bVar != null) {
            return bVar;
        }
        LinkedHashTreeMap<K, V>.b bVar2 = new b();
        this.f = bVar2;
        return bVar2;
    }

    static final class a<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f1956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        a<K, V> f1957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        a<K, V> f1958c;
        int d;
        final K e;
        a<K, V> f;
        V h;
        a<K, V> i;
        a<K, V> j;

        a() {
            this.e = null;
            this.f1956a = -1;
            this.f = this;
            this.f1958c = this;
        }

        a(a<K, V> aVar, K k, int i, a<K, V> aVar2, a<K, V> aVar3) {
            this.j = aVar;
            this.e = k;
            this.f1956a = i;
            this.d = 1;
            this.f1958c = aVar2;
            this.f = aVar3;
            aVar3.f1958c = this;
            aVar2.f = this;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.e;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.h;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.h;
            this.h = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.e;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.h;
            if (v == null) {
                return entry.getValue() == null;
            }
            return v.equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.e;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.h;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        public String toString() {
            return this.e + "=" + this.h;
        }

        public a<K, V> b() {
            a<K, V> aVar = this;
            for (a<K, V> aVar2 = this.f1957b; aVar2 != null; aVar2 = aVar2.f1957b) {
                aVar = aVar2;
            }
            return aVar;
        }

        public a<K, V> c() {
            a<K, V> aVar = this;
            for (a<K, V> aVar2 = this.i; aVar2 != null; aVar2 = aVar2.i) {
                aVar = aVar2;
            }
            return aVar;
        }
    }

    private void c() {
        a<K, V>[] aVarArrD = d((a[]) this.e);
        this.e = aVarArrD;
        this.i = (aVarArrD.length / 2) + (aVarArrD.length / 4);
    }

    static <K, V> a<K, V>[] d(a<K, V>[] aVarArr) {
        int length = aVarArr.length;
        a<K, V>[] aVarArr2 = new a[length * 2];
        d dVar = new d();
        e eVar = new e();
        e eVar2 = new e();
        for (int i = 0; i < length; i++) {
            a<K, V> aVar = aVarArr[i];
            if (aVar != null) {
                dVar.e(aVar);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    a<K, V> aVarC = dVar.c();
                    if (aVarC == null) {
                        break;
                    }
                    if ((aVarC.f1956a & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                eVar.a(i2);
                eVar2.a(i3);
                dVar.e(aVar);
                while (true) {
                    a<K, V> aVarC2 = dVar.c();
                    if (aVarC2 == null) {
                        break;
                    }
                    if ((aVarC2.f1956a & length) == 0) {
                        eVar.b(aVarC2);
                    } else {
                        eVar2.b(aVarC2);
                    }
                }
                aVarArr2[i] = i2 > 0 ? eVar.c() : null;
                aVarArr2[i + length] = i3 > 0 ? eVar2.c() : null;
            }
        }
        return aVarArr2;
    }

    static class d<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a<K, V> f1961a;

        d() {
        }

        void e(a<K, V> aVar) {
            a<K, V> aVar2 = null;
            while (aVar != null) {
                aVar.j = aVar2;
                aVar2 = aVar;
                aVar = aVar.f1957b;
            }
            this.f1961a = aVar2;
        }

        public a<K, V> c() {
            a<K, V> aVar = this.f1961a;
            if (aVar == null) {
                return null;
            }
            a<K, V> aVar2 = aVar.j;
            aVar.j = null;
            for (a<K, V> aVar3 = aVar.i; aVar3 != null; aVar3 = aVar3.f1957b) {
                aVar3.j = aVar2;
                aVar2 = aVar3;
            }
            this.f1961a = aVar2;
            return aVar;
        }
    }

    static final class e<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a<K, V> f1963c;
        private int d;
        private int e;

        e() {
        }

        void a(int i) {
            this.e = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.d = 0;
            this.f1962b = 0;
            this.f1963c = null;
        }

        void b(a<K, V> aVar) {
            aVar.i = null;
            aVar.j = null;
            aVar.f1957b = null;
            aVar.d = 1;
            int i = this.e;
            if (i > 0) {
                int i2 = this.d;
                if ((i2 & 1) == 0) {
                    this.d = i2 + 1;
                    this.e = i - 1;
                    this.f1962b++;
                }
            }
            aVar.j = this.f1963c;
            this.f1963c = aVar;
            int i3 = this.d;
            int i4 = i3 + 1;
            this.d = i4;
            int i5 = this.e;
            if (i5 > 0 && (i4 & 1) == 0) {
                this.d = i3 + 2;
                this.e = i5 - 1;
                this.f1962b++;
            }
            int i6 = 4;
            while (true) {
                int i7 = i6 - 1;
                if ((this.d & i7) != i7) {
                    return;
                }
                int i8 = this.f1962b;
                if (i8 == 0) {
                    a<K, V> aVar2 = this.f1963c;
                    a<K, V> aVar3 = aVar2.j;
                    a<K, V> aVar4 = aVar3.j;
                    aVar3.j = aVar4.j;
                    this.f1963c = aVar3;
                    aVar3.f1957b = aVar4;
                    aVar3.i = aVar2;
                    aVar3.d = aVar2.d + 1;
                    aVar4.j = aVar3;
                    aVar2.j = aVar3;
                } else if (i8 == 1) {
                    a<K, V> aVar5 = this.f1963c;
                    a<K, V> aVar6 = aVar5.j;
                    this.f1963c = aVar6;
                    aVar6.i = aVar5;
                    aVar6.d = aVar5.d + 1;
                    aVar5.j = aVar6;
                    this.f1962b = 0;
                } else if (i8 == 2) {
                    this.f1962b = 0;
                }
                i6 *= 2;
            }
        }

        a<K, V> c() {
            a<K, V> aVar = this.f1963c;
            if (aVar.j == null) {
                return aVar;
            }
            throw new IllegalStateException();
        }
    }

    abstract class LinkedTreeMapIterator<T> implements Iterator<T> {
        int expectedModCount;
        a<K, V> lastReturned = null;
        a<K, V> next;

        LinkedTreeMapIterator() {
            this.next = LinkedHashTreeMap.this.f1954b.f1958c;
            this.expectedModCount = LinkedHashTreeMap.this.f1955c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.next != LinkedHashTreeMap.this.f1954b;
        }

        final a<K, V> nextNode() {
            a<K, V> aVar = this.next;
            if (aVar == LinkedHashTreeMap.this.f1954b) {
                throw new NoSuchElementException();
            }
            if (LinkedHashTreeMap.this.f1955c != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
            this.next = aVar.f1958c;
            this.lastReturned = aVar;
            return aVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            a<K, V> aVar = this.lastReturned;
            if (aVar == null) {
                throw new IllegalStateException();
            }
            LinkedHashTreeMap.this.a(aVar, true);
            this.lastReturned = null;
            this.expectedModCount = LinkedHashTreeMap.this.f1955c;
        }
    }

    final class c extends AbstractSet<Map.Entry<K, V>> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.f1953a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new LinkedHashTreeMap<K, V>.LinkedTreeMapIterator<Map.Entry<K, V>>() { // from class: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.c.5
                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }

                @Override // java.util.Iterator
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, V> next() {
                    return nextNode();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedHashTreeMap.this.d((Map.Entry<?, ?>) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            a<K, V> aVarD;
            if (!(obj instanceof Map.Entry) || (aVarD = LinkedHashTreeMap.this.d((Map.Entry<?, ?>) obj)) == null) {
                return false;
            }
            LinkedHashTreeMap.this.a(aVarD, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }
    }

    final class b extends AbstractSet<K> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.f1953a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new LinkedHashTreeMap<K, V>.LinkedTreeMapIterator<K>() { // from class: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.b.3
                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }

                @Override // java.util.Iterator
                public K next() {
                    return nextNode().e;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return LinkedHashTreeMap.this.d(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }
}
