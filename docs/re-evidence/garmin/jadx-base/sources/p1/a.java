package p1;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends k1<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a<K, V>.C2557a f134653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a<K, V>.c f134654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a<K, V>.e f134655f;

    /* JADX INFO: renamed from: p1.a$a, reason: collision with other inner class name */
    public final class C2557a extends AbstractSet<Map.Entry<K, V>> {
        public C2557a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return a.this.f134761c;
        }
    }

    public final class b extends h<K> {
        public b() {
            super(a.this.f134761c);
        }

        @Override // p1.h
        public final K a(int i14) {
            return a.this.g(i14);
        }

        @Override // p1.h
        public final void b(int i14) {
            a.this.i(i14);
        }
    }

    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f134659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f134660b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f134661c;

        public d() {
            this.f134659a = a.this.f134761c - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.f134661c) {
                vb.h.z("This container does not support retaining Map.Entry objects");
                return false;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i14 = this.f134660b;
            a aVar = a.this;
            return p005kotlin.jvm.internal.s.g(key, aVar.g(i14)) && p005kotlin.jvm.internal.s.g(entry.getValue(), aVar.k(this.f134660b));
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.f134661c) {
                return a.this.g(this.f134660b);
            }
            vb.h.z("This container does not support retaining Map.Entry objects");
            return null;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.f134661c) {
                return a.this.k(this.f134660b);
            }
            vb.h.z("This container does not support retaining Map.Entry objects");
            return null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f134660b < this.f134659a;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.f134661c) {
                vb.h.z("This container does not support retaining Map.Entry objects");
                return 0;
            }
            int i14 = this.f134660b;
            a aVar = a.this;
            K kG = aVar.g(i14);
            V vK = aVar.k(this.f134660b);
            return (kG == null ? 0 : kG.hashCode()) ^ (vK != null ? vK.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                c22.t.g();
                return null;
            }
            this.f134660b++;
            this.f134661c = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f134661c) {
                j20.x.h();
                return;
            }
            a.this.i(this.f134660b);
            this.f134660b--;
            this.f134659a--;
            this.f134661c = false;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v14) {
            if (this.f134661c) {
                return a.this.j(this.f134660b, v14);
            }
            vb.h.z("This container does not support retaining Map.Entry objects");
            return null;
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class f extends h<V> {
        public f() {
            super(a.this.f134761c);
        }

        @Override // p1.h
        public final V a(int i14) {
            return a.this.k(i14);
        }

        @Override // p1.h
        public final void b(int i14) {
            a.this.i(i14);
        }
    }

    public a() {
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        a<K, V>.C2557a c2557a = this.f134653d;
        if (c2557a != null) {
            return c2557a;
        }
        a<K, V>.C2557a c2557a2 = new C2557a();
        this.f134653d = c2557a2;
        return c2557a2;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        a<K, V>.c cVar = this.f134654e;
        if (cVar != null) {
            return cVar;
        }
        a<K, V>.c cVar2 = new c();
        this.f134654e = cVar2;
        return cVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean l(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean m(Collection<?> collection) {
        int i14 = this.f134761c;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i14 != this.f134761c;
    }

    public final boolean n(Collection<?> collection) {
        int i14 = this.f134761c;
        for (int i15 = i14 - 1; i15 >= 0; i15--) {
            if (!collection.contains(g(i15))) {
                i(i15);
            }
        }
        return i14 != this.f134761c;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.f134761c);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        a<K, V>.e eVar = this.f134655f;
        if (eVar != null) {
            return eVar;
        }
        a<K, V>.e eVar2 = new e();
        this.f134655f = eVar2;
        return eVar2;
    }

    public a(int i14) {
        super(i14);
    }

    public a(k1 k1Var) {
        super(k1Var);
    }

    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k14) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            return a.this.l(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            a aVar = a.this;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            try {
                return aVar.f134761c == set.size() && aVar.l(set);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            a aVar = a.this;
            int iHashCode = 0;
            for (int i14 = aVar.f134761c - 1; i14 >= 0; i14--) {
                K kG = aVar.g(i14);
                iHashCode += kG == null ? 0 : kG.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            a aVar = a.this;
            int iD = aVar.d(obj);
            if (iD < 0) {
                return false;
            }
            aVar.i(iD);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            return a.this.m(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return a.this.n(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return a.this.f134761c;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            a aVar = a.this;
            int i14 = aVar.f134761c;
            if (tArr.length < i14) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i14));
            }
            for (int i15 = 0; i15 < i14; i15++) {
                tArr[i15] = aVar.g(i15);
            }
            if (tArr.length > i14) {
                tArr[i14] = null;
            }
            return tArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            a aVar = a.this;
            int i14 = aVar.f134761c;
            Object[] objArr = new Object[i14];
            for (int i15 = 0; i15 < i14; i15++) {
                objArr[i15] = aVar.g(i15);
            }
            return objArr;
        }
    }

    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v14) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            a.this.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return a.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            a aVar = a.this;
            int iA = aVar.a(obj);
            if (iA < 0) {
                return false;
            }
            aVar.i(iA);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            a aVar = a.this;
            int i14 = aVar.f134761c;
            int i15 = 0;
            boolean z14 = false;
            while (i15 < i14) {
                if (collection.contains(aVar.k(i15))) {
                    aVar.i(i15);
                    i15--;
                    i14--;
                    z14 = true;
                }
                i15++;
            }
            return z14;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            a aVar = a.this;
            int i14 = aVar.f134761c;
            int i15 = 0;
            boolean z14 = false;
            while (i15 < i14) {
                if (!collection.contains(aVar.k(i15))) {
                    aVar.i(i15);
                    i15--;
                    i14--;
                    z14 = true;
                }
                i15++;
            }
            return z14;
        }

        @Override // java.util.Collection
        public final int size() {
            return a.this.f134761c;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            a aVar = a.this;
            int i14 = aVar.f134761c;
            if (tArr.length < i14) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i14));
            }
            for (int i15 = 0; i15 < i14; i15++) {
                tArr[i15] = aVar.k(i15);
            }
            if (tArr.length > i14) {
                tArr[i14] = null;
            }
            return tArr;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            a aVar = a.this;
            int i14 = aVar.f134761c;
            Object[] objArr = new Object[i14];
            for (int i15 = 0; i15 < i14; i15++) {
                objArr[i15] = aVar.k(i15);
            }
            return objArr;
        }
    }
}
