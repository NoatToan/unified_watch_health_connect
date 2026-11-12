package androidx.datastore.preferences.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class j1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f6755g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<j1<K, V>.c> f6756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<K, V> f6757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile j1<K, V>.e f6759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<K, V> f6760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile j1<K, V>.b f6761f;

    private j1() {
        this.f6756a = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f6757b = map;
        this.f6760e = map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(K k14) {
        int i14;
        int i15;
        int i16;
        int iCompareTo;
        int size = this.f6756a.size();
        int i17 = size - 1;
        if (i17 < 0) {
            i14 = 0;
            while (i14 <= i17) {
                i16 = (i14 + i17) / 2;
                iCompareTo = k14.compareTo(this.f6756a.get(i16).f6766a);
                if (iCompareTo < 0) {
                    i17 = i16 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i16;
                    }
                    i14 = i16 + 1;
                }
            }
            i15 = i14 + 1;
        } else {
            int iCompareTo2 = k14.compareTo(this.f6756a.get(i17).f6766a);
            if (iCompareTo2 > 0) {
                i15 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i17;
                }
                i14 = 0;
                while (i14 <= i17) {
                    i16 = (i14 + i17) / 2;
                    iCompareTo = k14.compareTo(this.f6756a.get(i16).f6766a);
                    if (iCompareTo < 0) {
                        i17 = i16 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i16;
                        }
                        i14 = i16 + 1;
                    }
                }
                i15 = i14 + 1;
            }
        }
        return -i15;
    }

    public final void b() {
        if (this.f6758c) {
            com.google.protobuf.a.m();
        }
    }

    public final Map.Entry<K, V> c(int i14) {
        return this.f6756a.get(i14);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f6756a.isEmpty()) {
            this.f6756a.clear();
        }
        if (this.f6757b.isEmpty()) {
            return;
        }
        this.f6757b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f6757b.containsKey(comparable);
    }

    public final Set d() {
        return this.f6757b.isEmpty() ? Collections.EMPTY_SET : this.f6757b.entrySet();
    }

    public final SortedMap<K, V> e() {
        b();
        if (this.f6757b.isEmpty() && !(this.f6757b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f6757b = treeMap;
            this.f6760e = treeMap.descendingMap();
        }
        return (SortedMap) this.f6757b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f6759d == null) {
            this.f6759d = new e(this, null);
        }
        return this.f6759d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return super.equals(obj);
        }
        j1 j1Var = (j1) obj;
        int size = size();
        if (size != j1Var.size()) {
            return false;
        }
        int size2 = this.f6756a.size();
        if (size2 != j1Var.f6756a.size()) {
            return entrySet().equals(j1Var.entrySet());
        }
        for (int i14 = 0; i14 < size2; i14++) {
            if (!c(i14).equals(j1Var.c(i14))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f6757b.equals(j1Var.f6757b);
        }
        return true;
    }

    public void g() {
        if (this.f6758c) {
            return;
        }
        this.f6757b = this.f6757b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f6757b);
        this.f6760e = this.f6760e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f6760e);
        this.f6758c = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? this.f6756a.get(iA).f6767b : this.f6757b.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final V put(K k14, V v14) {
        b();
        int iA = a(k14);
        if (iA >= 0) {
            return this.f6756a.get(iA).setValue(v14);
        }
        b();
        if (this.f6756a.isEmpty() && !(this.f6756a instanceof ArrayList)) {
            this.f6756a = new ArrayList(16);
        }
        int i14 = -(iA + 1);
        if (i14 >= 16) {
            return e().put(k14, v14);
        }
        if (this.f6756a.size() == 16) {
            j1<K, V>.c cVarRemove = this.f6756a.remove(15);
            e().put(cVarRemove.f6766a, cVarRemove.f6767b);
        }
        this.f6756a.add(i14, new c(k14, v14));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f6756a.size();
        int iHashCode = 0;
        for (int i14 = 0; i14 < size; i14++) {
            iHashCode += this.f6756a.get(i14).hashCode();
        }
        return this.f6757b.size() > 0 ? this.f6757b.hashCode() + iHashCode : iHashCode;
    }

    public final V i(int i14) {
        b();
        V v14 = this.f6756a.remove(i14).f6767b;
        if (!this.f6757b.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = e().entrySet().iterator();
            this.f6756a.add(new c(this, it.next()));
            it.remove();
        }
        return v14;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return i(iA);
        }
        if (this.f6757b.isEmpty()) {
            return null;
        }
        return this.f6757b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f6757b.size() + this.f6756a.size();
    }

    public class e extends AbstractSet<Map.Entry<K, V>> {
        private e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            j1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            j1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = j1.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d(j1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            j1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return j1.this.size();
        }

        public /* synthetic */ e(j1 j1Var, i1 i1Var) {
            this();
        }
    }

    public class b extends j1<K, V>.e {
        private b() {
            super(j1.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.j1.e, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a(j1.this, null);
        }

        public /* synthetic */ b(j1 j1Var, i1 i1Var) {
            this();
        }
    }

    public class d implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f6770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f6771c;

        private d() {
            this.f6769a = -1;
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f6771c == null) {
                this.f6771c = j1.this.f6757b.entrySet().iterator();
            }
            return this.f6771c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i14 = this.f6769a + 1;
            j1 j1Var = j1.this;
            return i14 < j1Var.f6756a.size() || (!j1Var.f6757b.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f6770b = true;
            int i14 = this.f6769a + 1;
            this.f6769a = i14;
            j1 j1Var = j1.this;
            return i14 < j1Var.f6756a.size() ? j1Var.f6756a.get(this.f6769a) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f6770b) {
                vb.h.z("remove() was called before next()");
                return;
            }
            this.f6770b = false;
            int i14 = j1.f6755g;
            j1 j1Var = j1.this;
            j1Var.b();
            if (this.f6769a >= j1Var.f6756a.size()) {
                a().remove();
                return;
            }
            int i15 = this.f6769a;
            this.f6769a = i15 - 1;
            j1Var.i(i15);
        }

        public /* synthetic */ d(j1 j1Var, i1 i1Var) {
            this();
        }
    }

    public class a implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f6763b;

        private a() {
            this.f6762a = j1.this.f6756a.size();
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f6763b == null) {
                this.f6763b = j1.this.f6760e.entrySet().iterator();
            }
            return this.f6763b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i14 = this.f6762a;
            return (i14 > 0 && i14 <= j1.this.f6756a.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (a().hasNext()) {
                return a().next();
            }
            List<j1<K, V>.c> list = j1.this.f6756a;
            int i14 = this.f6762a - 1;
            this.f6762a = i14;
            return list.get(i14);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ a(j1 j1Var, i1 i1Var) {
            this();
        }
    }

    public class c implements Map.Entry<K, V>, Comparable<j1<K, V>.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f6766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public V f6767b;

        public c(j1 j1Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f6766a.compareTo(((c) obj).f6766a);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean zEquals;
            boolean zEquals2;
            if (obj != this) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    K k14 = this.f6766a;
                    if (k14 == null) {
                        zEquals = key == null;
                    } else {
                        zEquals = k14.equals(key);
                    }
                    if (zEquals) {
                        V v14 = this.f6767b;
                        Object value = entry.getValue();
                        if (v14 == null) {
                            zEquals2 = value == null;
                        } else {
                            zEquals2 = v14.equals(value);
                        }
                        if (zEquals2) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f6766a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f6767b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k14 = this.f6766a;
            int iHashCode = k14 == null ? 0 : k14.hashCode();
            V v14 = this.f6767b;
            return (v14 != null ? v14.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v14) {
            int i14 = j1.f6755g;
            j1.this.b();
            V v15 = this.f6767b;
            this.f6767b = v14;
            return v15;
        }

        public final String toString() {
            return this.f6766a + "=" + this.f6767b;
        }

        public c(K k14, V v14) {
            this.f6766a = k14;
            this.f6767b = v14;
        }
    }

    public /* synthetic */ j1(i1 i1Var) {
        this();
    }
}
