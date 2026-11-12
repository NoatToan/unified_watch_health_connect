package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c<K, V> f128467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c<K, V> f128468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap<f<K, V>, Boolean> f128469c = new WeakHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f128470d = 0;

    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // o.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f128474d;
        }

        @Override // o.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f128473c;
        }
    }

    /* JADX INFO: renamed from: o.b$b, reason: collision with other inner class name */
    public static class C2464b<K, V> extends e<K, V> {
        public C2464b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // o.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f128473c;
        }

        @Override // o.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f128474d;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f128471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final V f128472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c<K, V> f128473c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c<K, V> f128474d;

        public c(K k14, V v14) {
            this.f128471a = k14;
            this.f128472b = v14;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f128471a.equals(cVar.f128471a) && this.f128472b.equals(cVar.f128472b);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f128471a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f128472b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f128471a.hashCode() ^ this.f128472b.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v14) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f128471a + "=" + this.f128472b;
        }
    }

    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c<K, V> f128475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f128476b = true;

        public d() {
        }

        @Override // o.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f128475a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f128474d;
                this.f128475a = cVar3;
                this.f128476b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f128476b) {
                return b.this.f128467a != null;
            }
            c<K, V> cVar = this.f128475a;
            return (cVar == null || cVar.f128473c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f128476b) {
                this.f128476b = false;
                this.f128475a = b.this.f128467a;
            } else {
                c<K, V> cVar = this.f128475a;
                this.f128475a = cVar != null ? cVar.f128473c : null;
            }
            return this.f128475a;
        }
    }

    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c<K, V> f128478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c<K, V> f128479b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f128478a = cVar2;
            this.f128479b = cVar;
        }

        @Override // o.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVarC = null;
            if (this.f128478a == cVar && cVar == this.f128479b) {
                this.f128479b = null;
                this.f128478a = null;
            }
            c<K, V> cVar2 = this.f128478a;
            if (cVar2 == cVar) {
                this.f128478a = b(cVar2);
            }
            c<K, V> cVar3 = this.f128479b;
            if (cVar3 == cVar) {
                c<K, V> cVar4 = this.f128478a;
                if (cVar3 != cVar4 && cVar4 != null) {
                    cVarC = c(cVar3);
                }
                this.f128479b = cVarC;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f128479b != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar = this.f128479b;
            c<K, V> cVar2 = this.f128478a;
            this.f128479b = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    public static abstract class f<K, V> {
        public abstract void a(c<K, V> cVar);
    }

    public c<K, V> a(K k14) {
        c<K, V> cVar = this.f128467a;
        while (cVar != null && !cVar.f128471a.equals(k14)) {
            cVar = cVar.f128473c;
        }
        return cVar;
    }

    public V b(K k14) {
        c<K, V> cVarA = a(k14);
        if (cVarA == null) {
            return null;
        }
        this.f128470d--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.f128469c;
        if (!weakHashMap.isEmpty()) {
            Iterator<f<K, V>> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarA);
            }
        }
        c<K, V> cVar = cVarA.f128474d;
        c<K, V> cVar2 = cVarA.f128473c;
        if (cVar != null) {
            cVar.f128473c = cVar2;
        } else {
            this.f128467a = cVar2;
        }
        c<K, V> cVar3 = cVarA.f128473c;
        if (cVar3 != null) {
            cVar3.f128474d = cVar;
        } else {
            this.f128468b = cVar;
        }
        cVarA.f128473c = null;
        cVarA.f128474d = null;
        return cVarA.f128472b;
    }

    public final boolean equals(Object obj) {
        e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f128470d != bVar.f128470d) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it3 = bVar.iterator();
        while (true) {
            eVar = (e) it;
            if (!eVar.hasNext()) {
                break;
            }
            e eVar2 = (e) it3;
            if (!eVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            Object next = eVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (eVar.hasNext() || ((e) it3).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f128467a, this.f128468b);
        this.f128469c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sb3.append("]");
                return sb3.toString();
            }
            sb3.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sb3.append(", ");
            }
        }
    }
}
