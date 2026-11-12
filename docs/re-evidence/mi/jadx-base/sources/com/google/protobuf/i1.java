package com.google.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
public class i1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<i1<K, V>.e> f9655b;
    public Map<K, V> c;
    public boolean d;
    public volatile i1<K, V>.g e;
    public Map<K, V> f;
    public volatile i1<K, V>.c g;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    public static class a<FieldDescriptorType> extends i1<FieldDescriptorType, Object> {
        public a(int i) {
            super(i, null);
        }

        @Override // com.google.protobuf.i1, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((a0.c) obj, obj2);
        }

        @Override // com.google.protobuf.i1
        public void v() {
            if (!t()) {
                for (int i = 0; i < o(); i++) {
                    Map.Entry<FieldDescriptorType, Object> entryN = n(i);
                    if (((a0.c) entryN.getKey()).isRepeated()) {
                        entryN.setValue(Collections.unmodifiableList((List) entryN.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : q()) {
                    if (((a0.c) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.v();
        }
    }

    public class c extends i1<K, V>.g {
        public c() {
            super(i1.this, null);
        }

        @Override // com.google.protobuf.i1.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(i1.this, null);
        }

        public /* synthetic */ c(i1 i1Var, a aVar) {
            this();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Iterator<Object> f9659a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Iterable<Object> f9660b = new b();

        public static class a implements Iterator<Object> {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f9659a;
            }
        }

        public static <T> Iterable<T> b() {
            return (Iterable<T>) f9660b;
        }
    }

    public class e implements Map.Entry<K, V>, Comparable<i1<K, V>.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f9661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public V f9662b;

        public e(i1 i1Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(i1<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        public final boolean b(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f9661a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f9661a, entry.getKey()) && b(this.f9662b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f9662b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k2 = this.f9661a;
            int iHashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f9662b;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            i1.this.j();
            V v2 = this.f9662b;
            this.f9662b = v;
            return v2;
        }

        public String toString() {
            return this.f9661a + "=" + this.f9662b;
        }

        public e(K k2, V v) {
            this.f9661a = k2;
            this.f9662b = v;
        }
    }

    public class g extends AbstractSet<Map.Entry<K, V>> {
        public g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = i1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            i1.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(i1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            i1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i1.this.size();
        }

        public /* synthetic */ g(i1 i1Var, a aVar) {
            this();
        }
    }

    public /* synthetic */ i1(int i, a aVar) {
        this(i);
    }

    public static <FieldDescriptorType extends a0.c<FieldDescriptorType>> i1<FieldDescriptorType, Object> w(int i) {
        return new a(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        j();
        if (!this.f9655b.isEmpty()) {
            this.f9655b.clear();
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return g(comparable) >= 0 || this.c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new g(this, null);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return super.equals(obj);
        }
        i1 i1Var = (i1) obj;
        int size = size();
        if (size != i1Var.size()) {
            return false;
        }
        int iO = o();
        if (iO != i1Var.o()) {
            return entrySet().equals(i1Var.entrySet());
        }
        for (int i = 0; i < iO; i++) {
            if (!n(i).equals(i1Var.n(i))) {
                return false;
            }
        }
        if (iO != size) {
            return this.c.equals(i1Var.c);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    public final int g(K k2) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.f9655b.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = k2.compareTo(this.f9655b.get(i3).getKey());
                if (iCompareTo < 0) {
                    i4 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = k2.compareTo(this.f9655b.get(i4).getKey());
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = k2.compareTo(this.f9655b.get(i3).getKey());
                    if (iCompareTo < 0) {
                        i4 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        return iG >= 0 ? this.f9655b.get(iG).getValue() : this.c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iO = o();
        int iHashCode = 0;
        for (int i = 0; i < iO; i++) {
            iHashCode += this.f9655b.get(i).hashCode();
        }
        return p() > 0 ? iHashCode + this.c.hashCode() : iHashCode;
    }

    public final void j() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    public Set<Map.Entry<K, V>> l() {
        if (this.g == null) {
            this.g = new c(this, null);
        }
        return this.g;
    }

    public final void m() {
        j();
        if (!this.f9655b.isEmpty() || (this.f9655b instanceof ArrayList)) {
            return;
        }
        this.f9655b = new ArrayList(this.f9654a);
    }

    public Map.Entry<K, V> n(int i) {
        return this.f9655b.get(i);
    }

    public int o() {
        return this.f9655b.size();
    }

    public int p() {
        return this.c.size();
    }

    public Iterable<Map.Entry<K, V>> q() {
        return this.c.isEmpty() ? d.b() : this.c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        j();
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        if (iG >= 0) {
            return y(iG);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    public final SortedMap<K, V> s() {
        j();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f9655b.size() + this.c.size();
    }

    public boolean t() {
        return this.d;
    }

    public void v() {
        if (this.d) {
            return;
        }
        this.c = this.c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.c);
        this.f = this.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f);
        this.d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public V put(K k2, V v) {
        j();
        int iG = g(k2);
        if (iG >= 0) {
            return this.f9655b.get(iG).setValue(v);
        }
        m();
        int i = -(iG + 1);
        if (i >= this.f9654a) {
            return s().put(k2, v);
        }
        int size = this.f9655b.size();
        int i2 = this.f9654a;
        if (size == i2) {
            i1<K, V>.e eVarRemove = this.f9655b.remove(i2 - 1);
            s().put(eVarRemove.getKey(), eVarRemove.getValue());
        }
        this.f9655b.add(i, new e(k2, v));
        return null;
    }

    public final V y(int i) {
        j();
        V value = this.f9655b.remove(i).getValue();
        if (!this.c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = s().entrySet().iterator();
            this.f9655b.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    public class b implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f9657b;

        public b() {
            this.f9656a = i1.this.f9655b.size();
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f9657b == null) {
                this.f9657b = i1.this.f.entrySet().iterator();
            }
            return this.f9657b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (a().hasNext()) {
                return a().next();
            }
            List list = i1.this.f9655b;
            int i = this.f9656a - 1;
            this.f9656a = i;
            return (Map.Entry) list.get(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.f9656a;
            return (i > 0 && i <= i1.this.f9655b.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(i1 i1Var, a aVar) {
            this();
        }
    }

    public class f implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f9664b;
        public Iterator<Map.Entry<K, V>> c;

        public f() {
            this.f9663a = -1;
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.c == null) {
                this.c = i1.this.c.entrySet().iterator();
            }
            return this.c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f9664b = true;
            int i = this.f9663a + 1;
            this.f9663a = i;
            return i < i1.this.f9655b.size() ? (Map.Entry) i1.this.f9655b.get(this.f9663a) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f9663a + 1 >= i1.this.f9655b.size()) {
                return !i1.this.c.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f9664b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f9664b = false;
            i1.this.j();
            if (this.f9663a >= i1.this.f9655b.size()) {
                a().remove();
                return;
            }
            i1 i1Var = i1.this;
            int i = this.f9663a;
            this.f9663a = i - 1;
            i1Var.y(i);
        }

        public /* synthetic */ f(i1 i1Var, a aVar) {
            this();
        }
    }

    public i1(int i) {
        this.f9654a = i;
        this.f9655b = Collections.emptyList();
        this.c = Collections.emptyMap();
        this.f = Collections.emptyMap();
    }
}
