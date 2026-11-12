package defpackage;

import androidx.annotation.RestrictTo;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class d9l<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c<K, V> f15265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c<K, V> f15266b;
    public final WeakHashMap<f<K, V>, Boolean> c = new WeakHashMap<>();
    public int d = 0;

    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // d9l.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.d;
        }

        @Override // d9l.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.c;
        }
    }

    public static class b<K, V> extends e<K, V> {
        public b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // d9l.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.c;
        }

        @Override // d9l.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.d;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f15267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final V f15268b;
        public c<K, V> c;
        public c<K, V> d;

        public c(K k2, V v) {
            this.f15267a = k2;
            this.f15268b = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f15267a.equals(cVar.f15267a) && this.f15268b.equals(cVar.f15268b);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f15267a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f15268b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f15267a.hashCode() ^ this.f15268b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f15267a + "=" + this.f15268b;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c<K, V> f15269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f15270b = true;

        public d() {
        }

        @Override // d9l.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f15269a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.d;
                this.f15269a = cVar3;
                this.f15270b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f15270b) {
                this.f15270b = false;
                this.f15269a = d9l.this.f15265a;
            } else {
                c<K, V> cVar = this.f15269a;
                this.f15269a = cVar != null ? cVar.c : null;
            }
            return this.f15269a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f15270b) {
                return d9l.this.f15265a != null;
            }
            c<K, V> cVar = this.f15269a;
            return (cVar == null || cVar.c == null) ? false : true;
        }
    }

    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c<K, V> f15271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c<K, V> f15272b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f15271a = cVar2;
            this.f15272b = cVar;
        }

        @Override // d9l.f
        public void a(c<K, V> cVar) {
            if (this.f15271a == cVar && cVar == this.f15272b) {
                this.f15272b = null;
                this.f15271a = null;
            }
            c<K, V> cVar2 = this.f15271a;
            if (cVar2 == cVar) {
                this.f15271a = b(cVar2);
            }
            if (this.f15272b == cVar) {
                this.f15272b = e();
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f15272b;
            this.f15272b = e();
            return cVar;
        }

        public final c<K, V> e() {
            c<K, V> cVar = this.f15272b;
            c<K, V> cVar2 = this.f15271a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15272b != null;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static abstract class f<K, V> {
        public abstract void a(c<K, V> cVar);
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        b bVar = new b(this.f15266b, this.f15265a);
        this.c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public Map.Entry<K, V> e() {
        return this.f15265a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d9l)) {
            return false;
        }
        d9l d9lVar = (d9l) obj;
        if (size() != d9lVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = d9lVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public c<K, V> f(K k2) {
        c<K, V> cVar = this.f15265a;
        while (cVar != null && !cVar.f15267a.equals(k2)) {
            cVar = cVar.c;
        }
        return cVar;
    }

    public d9l<K, V>.d g() {
        d9l<K, V>.d dVar = new d();
        this.c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> h() {
        return this.f15266b;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    public c<K, V> i(K k2, V v) {
        c<K, V> cVar = new c<>(k2, v);
        this.d++;
        c<K, V> cVar2 = this.f15266b;
        if (cVar2 == null) {
            this.f15265a = cVar;
            this.f15266b = cVar;
            return cVar;
        }
        cVar2.c = cVar;
        cVar.d = cVar2;
        this.f15266b = cVar;
        return cVar;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f15265a, this.f15266b);
        this.c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V j(K k2, V v) {
        c<K, V> cVarF = f(k2);
        if (cVarF != null) {
            return cVarF.f15268b;
        }
        i(k2, v);
        return null;
    }

    public V k(K k2) {
        c<K, V> cVarF = f(k2);
        if (cVarF == null) {
            return null;
        }
        this.d--;
        if (!this.c.isEmpty()) {
            Iterator<f<K, V>> it = this.c.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarF);
            }
        }
        c<K, V> cVar = cVarF.d;
        if (cVar != null) {
            cVar.c = cVarF.c;
        } else {
            this.f15265a = cVarF.c;
        }
        c<K, V> cVar2 = cVarF.c;
        if (cVar2 != null) {
            cVar2.d = cVar;
        } else {
            this.f15266b = cVar;
        }
        cVarF.c = null;
        cVarF.d = null;
        return cVarF.f15268b;
    }

    public int size() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
