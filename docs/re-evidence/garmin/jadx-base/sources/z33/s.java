package z33;

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
import v.e0;

/* JADX INFO: loaded from: classes3.dex */
public class s<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f202229f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f202230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<s<K, V>.b> f202231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<K, V> f202232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f202233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile s<K, V>.d f202234e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3768a f202235a = new C3768a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f202236b = new b();

        /* JADX INFO: renamed from: z33.s$a$a, reason: collision with other inner class name */
        public static class C3768a implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return a.f202235a;
            }
        }
    }

    private s(int i14) {
        this.f202230a = i14;
        this.f202231b = Collections.EMPTY_LIST;
        this.f202232c = Collections.EMPTY_MAP;
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
        int size = this.f202231b.size();
        int i17 = size - 1;
        if (i17 < 0) {
            i14 = 0;
            while (i14 <= i17) {
                i16 = (i14 + i17) / 2;
                iCompareTo = k14.compareTo(this.f202231b.get(i16).f202237a);
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
            int iCompareTo2 = k14.compareTo(this.f202231b.get(i17).f202237a);
            if (iCompareTo2 > 0) {
                i15 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i17;
                }
                i14 = 0;
                while (i14 <= i17) {
                    i16 = (i14 + i17) / 2;
                    iCompareTo = k14.compareTo(this.f202231b.get(i16).f202237a);
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
        if (this.f202233d) {
            com.google.protobuf.a.m();
        }
    }

    public final Iterable<Map.Entry<K, V>> c() {
        return this.f202232c.isEmpty() ? a.f202236b : this.f202232c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f202231b.isEmpty()) {
            this.f202231b.clear();
        }
        if (this.f202232c.isEmpty()) {
            return;
        }
        this.f202232c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f202232c.containsKey(comparable);
    }

    public final SortedMap<K, V> d() {
        b();
        if (this.f202232c.isEmpty() && !(this.f202232c instanceof TreeMap)) {
            this.f202232c = new TreeMap();
        }
        return (SortedMap) this.f202232c;
    }

    public void e() {
        if (this.f202233d) {
            return;
        }
        this.f202232c = this.f202232c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f202232c);
        this.f202233d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f202234e == null) {
            this.f202234e = new d(this, null);
        }
        return this.f202234e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final V put(K k14, V v14) {
        b();
        int iA = a(k14);
        if (iA >= 0) {
            return this.f202231b.get(iA).setValue(v14);
        }
        b();
        boolean zIsEmpty = this.f202231b.isEmpty();
        int i14 = this.f202230a;
        if (zIsEmpty && !(this.f202231b instanceof ArrayList)) {
            this.f202231b = new ArrayList(i14);
        }
        int i15 = -(iA + 1);
        if (i15 >= i14) {
            return d().put(k14, v14);
        }
        if (this.f202231b.size() == i14) {
            s<K, V>.b bVarRemove = this.f202231b.remove(i14 - 1);
            d().put(bVarRemove.f202237a, bVarRemove.f202238b);
        }
        this.f202231b.add(i15, new b(k14, v14));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? this.f202231b.get(iA).f202238b : this.f202232c.get(comparable);
    }

    public final V h(int i14) {
        b();
        V v14 = this.f202231b.remove(i14).f202238b;
        if (!this.f202232c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = d().entrySet().iterator();
            this.f202231b.add(new b(this, it.next()));
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
            return h(iA);
        }
        if (this.f202232c.isEmpty()) {
            return null;
        }
        return this.f202232c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f202232c.size() + this.f202231b.size();
    }

    public class d extends AbstractSet<Map.Entry<K, V>> {
        private d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            s.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            s.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = s.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new c(s.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            s.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return s.this.size();
        }

        public /* synthetic */ d(s sVar, r rVar) {
            this();
        }
    }

    public class c implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f202240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f202241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f202242c;

        private c() {
            this.f202240a = -1;
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f202242c == null) {
                this.f202242c = s.this.f202232c.entrySet().iterator();
            }
            return this.f202242c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f202240a + 1 < s.this.f202231b.size() || a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f202241b = true;
            int i14 = this.f202240a + 1;
            this.f202240a = i14;
            s sVar = s.this;
            return i14 < sVar.f202231b.size() ? sVar.f202231b.get(this.f202240a) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f202241b) {
                vb.h.z("remove() was called before next()");
                return;
            }
            this.f202241b = false;
            int i14 = s.f202229f;
            s sVar = s.this;
            sVar.b();
            if (this.f202240a >= sVar.f202231b.size()) {
                a().remove();
                return;
            }
            int i15 = this.f202240a;
            this.f202240a = i15 - 1;
            sVar.h(i15);
        }

        public /* synthetic */ c(s sVar, r rVar) {
            this();
        }
    }

    public class b implements Comparable<s<K, V>.b>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f202237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public V f202238b;

        public b(s sVar, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f202237a.compareTo(((b) obj).f202237a);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean zEquals;
            boolean zEquals2;
            if (obj != this) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    K k14 = this.f202237a;
                    if (k14 == null) {
                        zEquals = key == null;
                    } else {
                        zEquals = k14.equals(key);
                    }
                    if (zEquals) {
                        V v14 = this.f202238b;
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
            return this.f202237a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f202238b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k14 = this.f202237a;
            int iHashCode = k14 == null ? 0 : k14.hashCode();
            V v14 = this.f202238b;
            return (v14 != null ? v14.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v14) {
            int i14 = s.f202229f;
            s.this.b();
            V v15 = this.f202238b;
            this.f202238b = v14;
            return v15;
        }

        public final String toString() {
            String strValueOf = String.valueOf(this.f202237a);
            String strValueOf2 = String.valueOf(this.f202238b);
            return e0.h(new StringBuilder(strValueOf2.length() + strValueOf.length() + 1), strValueOf, "=", strValueOf2);
        }

        public b(K k14, V v14) {
            this.f202237a = k14;
            this.f202238b = v14;
        }
    }

    public /* synthetic */ s(int i14, r rVar) {
        this(i14);
    }
}
