package com.google.common.collect;

import defpackage.ahd;
import defpackage.b10;
import defpackage.c6i;
import defpackage.cpd;
import defpackage.d44;
import defpackage.epd;
import defpackage.gcd;
import defpackage.m44;
import defpackage.p1a;
import defpackage.w1a;
import defpackage.xhe;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class ConcurrentHashMultiset<E> extends com.google.common.collect.e<E> implements Serializable {
    private static final long serialVersionUID = 1;
    private final transient ConcurrentMap<E, AtomicInteger> countMap;

    public class b extends b10<u.a<E>> {
        public final Iterator<Map.Entry<E, AtomicInteger>> c;

        public b() {
            this.c = ConcurrentHashMultiset.this.countMap.entrySet().iterator();
        }

        @Override // defpackage.b10
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public u.a<E> a() {
            while (this.c.hasNext()) {
                Map.Entry<E, AtomicInteger> next = this.c.next();
                int i = next.getValue().get();
                if (i != 0) {
                    return v.g(next.getKey(), i);
                }
            }
            return b();
        }
    }

    public class c extends p1a<u.a<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public u.a<E> f8999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterator f9000b;

        public c(Iterator it) {
            this.f9000b = it;
        }

        @Override // defpackage.t1a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Iterator<u.a<E>> delegate() {
            return this.f9000b;
        }

        @Override // defpackage.p1a, java.util.Iterator
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public u.a<E> next() {
            u.a<E> aVar = (u.a) super.next();
            this.f8999a = aVar;
            return aVar;
        }

        @Override // java.util.Iterator
        public void remove() {
            c6i.u(this.f8999a != null, "no calls to next() since the last call to remove()");
            ConcurrentHashMultiset.this.setCount(this.f8999a.getElement(), 0);
            this.f8999a = null;
        }
    }

    public class d extends com.google.common.collect.e<E>.b {
        public d() {
            super();
        }

        @Override // com.google.common.collect.e.b, com.google.common.collect.v.d
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public ConcurrentHashMultiset<E> i() {
            return ConcurrentHashMultiset.this;
        }

        public final List<u.a<E>> k() {
            ArrayList arrayListK = xhe.k(size());
            epd.a(arrayListK, iterator());
            return arrayListK;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return k().toArray();
        }

        public /* synthetic */ d(ConcurrentHashMultiset concurrentHashMultiset, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) k().toArray(tArr);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g0.b<ConcurrentHashMultiset> f9002a = g0.a(ConcurrentHashMultiset.class, "countMap");
    }

    public ConcurrentHashMultiset(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        c6i.j(concurrentMap.isEmpty(), "the backing map (%s) must be empty", concurrentMap);
        this.countMap = concurrentMap;
    }

    public static <E> ConcurrentHashMultiset<E> create() {
        return new ConcurrentHashMultiset<>(new ConcurrentHashMap());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        e.f9002a.b(this, (ConcurrentMap) objectInputStream.readObject());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List<E> snapshot() {
        ArrayList arrayListK = xhe.k(size());
        for (u.a aVar : entrySet()) {
            Object element = aVar.getElement();
            for (int count = aVar.getCount(); count > 0; count--) {
                arrayListK.add(element);
            }
        }
        return arrayListK;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.countMap);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.u
    public int add(E e2, int i) {
        AtomicInteger atomicIntegerPutIfAbsent;
        int i2;
        AtomicInteger atomicInteger;
        c6i.o(e2);
        if (i == 0) {
            return count(e2);
        }
        d44.d(i, "occurrences");
        do {
            atomicIntegerPutIfAbsent = (AtomicInteger) s.v(this.countMap, e2);
            if (atomicIntegerPutIfAbsent == null && (atomicIntegerPutIfAbsent = this.countMap.putIfAbsent(e2, new AtomicInteger(i))) == null) {
                return 0;
            }
            do {
                i2 = atomicIntegerPutIfAbsent.get();
                if (i2 == 0) {
                    atomicInteger = new AtomicInteger(i);
                    if (this.countMap.putIfAbsent(e2, atomicInteger) == null) {
                        break;
                    }
                } else {
                    try {
                    } catch (ArithmeticException unused) {
                        StringBuilder sb = new StringBuilder(65);
                        sb.append("Overflow adding ");
                        sb.append(i);
                        sb.append(" occurrences to a count of ");
                        sb.append(i2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            } while (!atomicIntegerPutIfAbsent.compareAndSet(i2, gcd.a(i2, i)));
            return i2;
        } while (!this.countMap.replace(e2, atomicIntegerPutIfAbsent, atomicInteger));
        return 0;
    }

    @Override // com.google.common.collect.e, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.countMap.clear();
    }

    @Override // com.google.common.collect.e, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.u
    public int count(Object obj) {
        AtomicInteger atomicInteger = (AtomicInteger) s.v(this.countMap, obj);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    @Override // com.google.common.collect.e
    public Set<E> createElementSet() {
        return new a(this, this.countMap.keySet());
    }

    @Override // com.google.common.collect.e
    @Deprecated
    public Set<u.a<E>> createEntrySet() {
        return new d(this, null);
    }

    @Override // com.google.common.collect.e
    public int distinctElements() {
        return this.countMap.size();
    }

    @Override // com.google.common.collect.e
    public Iterator<E> elementIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.e, com.google.common.collect.u
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.e
    public Iterator<u.a<E>> entryIterator() {
        return new c(new b());
    }

    @Override // com.google.common.collect.e, com.google.common.collect.u
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.e, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.countMap.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return v.i(this);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.u
    public int remove(Object obj, int i) {
        int i2;
        int iMax;
        if (i == 0) {
            return count(obj);
        }
        d44.d(i, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) s.v(this.countMap, obj);
        if (atomicInteger == null) {
            return 0;
        }
        do {
            i2 = atomicInteger.get();
            if (i2 == 0) {
                return 0;
            }
            iMax = Math.max(0, i2 - i);
        } while (!atomicInteger.compareAndSet(i2, iMax));
        if (iMax == 0) {
            this.countMap.remove(obj, atomicInteger);
        }
        return i2;
    }

    public boolean removeExactly(Object obj, int i) {
        int i2;
        int i3;
        if (i == 0) {
            return true;
        }
        d44.d(i, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) s.v(this.countMap, obj);
        if (atomicInteger == null) {
            return false;
        }
        do {
            i2 = atomicInteger.get();
            if (i2 < i) {
                return false;
            }
            i3 = i2 - i;
        } while (!atomicInteger.compareAndSet(i2, i3));
        if (i3 == 0) {
            this.countMap.remove(obj, atomicInteger);
        }
        return true;
    }

    @Override // com.google.common.collect.e, com.google.common.collect.u
    public int setCount(E e2, int i) {
        AtomicInteger atomicIntegerPutIfAbsent;
        AtomicInteger atomicInteger;
        c6i.o(e2);
        d44.b(i, "count");
        do {
            atomicIntegerPutIfAbsent = (AtomicInteger) s.v(this.countMap, e2);
            if (atomicIntegerPutIfAbsent != null || (i != 0 && (atomicIntegerPutIfAbsent = this.countMap.putIfAbsent(e2, new AtomicInteger(i))) != null)) {
                while (true) {
                    int i2 = atomicIntegerPutIfAbsent.get();
                    if (i2 == 0) {
                        break;
                    }
                    if (atomicIntegerPutIfAbsent.compareAndSet(i2, i)) {
                        if (i == 0) {
                            this.countMap.remove(e2, atomicIntegerPutIfAbsent);
                        }
                        return i2;
                    }
                }
                if (i != 0) {
                    atomicInteger = new AtomicInteger(i);
                    if (this.countMap.putIfAbsent(e2, atomicInteger) == null) {
                        break;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } while (!this.countMap.replace(e2, atomicIntegerPutIfAbsent, atomicInteger));
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u
    public int size() {
        Iterator<AtomicInteger> it = this.countMap.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            j += (long) it.next().get();
        }
        return ahd.j(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return snapshot().toArray();
    }

    public class a extends w1a<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f8998a;

        public a(ConcurrentHashMultiset concurrentHashMultiset, Set set) {
            this.f8998a = set;
        }

        @Override // defpackage.i1a, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return obj != null && m44.c(this.f8998a, obj);
        }

        @Override // defpackage.i1a, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return standardContainsAll(collection);
        }

        @Override // defpackage.i1a, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return obj != null && m44.d(this.f8998a, obj);
        }

        @Override // defpackage.i1a, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        @Override // defpackage.w1a, defpackage.i1a, defpackage.t1a
        public Set<E> delegate() {
            return this.f8998a;
        }
    }

    public static <E> ConcurrentHashMultiset<E> create(Iterable<? extends E> iterable) {
        ConcurrentHashMultiset<E> concurrentHashMultisetCreate = create();
        cpd.a(concurrentHashMultisetCreate, iterable);
        return concurrentHashMultisetCreate;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) snapshot().toArray(tArr);
    }

    public static <E> ConcurrentHashMultiset<E> create(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        return new ConcurrentHashMultiset<>(concurrentMap);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.u
    public boolean setCount(E e2, int i, int i2) {
        c6i.o(e2);
        d44.b(i, "oldCount");
        d44.b(i2, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger) s.v(this.countMap, e2);
        if (atomicInteger == null) {
            if (i != 0) {
                return false;
            }
            return i2 == 0 || this.countMap.putIfAbsent(e2, new AtomicInteger(i2)) == null;
        }
        int i3 = atomicInteger.get();
        if (i3 == i) {
            if (i3 == 0) {
                if (i2 == 0) {
                    this.countMap.remove(e2, atomicInteger);
                    return true;
                }
                AtomicInteger atomicInteger2 = new AtomicInteger(i2);
                return this.countMap.putIfAbsent(e2, atomicInteger2) == null || this.countMap.replace(e2, atomicInteger, atomicInteger2);
            }
            if (atomicInteger.compareAndSet(i3, i2)) {
                if (i2 == 0) {
                    this.countMap.remove(e2, atomicInteger);
                }
                return true;
            }
        }
        return false;
    }
}
