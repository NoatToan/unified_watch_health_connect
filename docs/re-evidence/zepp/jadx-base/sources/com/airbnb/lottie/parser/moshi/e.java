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
import java.util.Objects;
import java.util.Set;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes2.dex */
final class e<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator<Comparable> i = new a();
    public static final /* synthetic */ boolean j = false;
    public Comparator<? super K> a;
    public g<K, V>[] b;
    public final g<K, V> c;
    public int d;
    public int e;
    public int f;
    private e<K, V>.d g;
    private e<K, V>.C0077e h;

    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public static final class b<K, V> {
        private g<K, V> a;
        private int b;
        private int c;
        private int d;

        public void a(g<K, V> gVar) {
            gVar.c = null;
            gVar.a = null;
            gVar.b = null;
            gVar.i = 1;
            int i = this.b;
            if (i > 0) {
                int i2 = this.d;
                if ((i2 & 1) == 0) {
                    this.d = i2 + 1;
                    this.b = i - 1;
                    this.c++;
                }
            }
            gVar.a = this.a;
            this.a = gVar;
            int i3 = this.d + 1;
            this.d = i3;
            int i4 = this.b;
            if (i4 > 0 && (i3 & 1) == 0) {
                this.d = i3 + 1;
                this.b = i4 - 1;
                this.c++;
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.d & i6) != i6) {
                    return;
                }
                int i7 = this.c;
                if (i7 == 0) {
                    g<K, V> gVar2 = this.a;
                    g<K, V> gVar3 = gVar2.a;
                    g<K, V> gVar4 = gVar3.a;
                    gVar3.a = gVar4.a;
                    this.a = gVar3;
                    gVar3.b = gVar4;
                    gVar3.c = gVar2;
                    gVar3.i = gVar2.i + 1;
                    gVar4.a = gVar3;
                    gVar2.a = gVar3;
                } else if (i7 == 1) {
                    g<K, V> gVar5 = this.a;
                    g<K, V> gVar6 = gVar5.a;
                    this.a = gVar6;
                    gVar6.c = gVar5;
                    gVar6.i = gVar5.i + 1;
                    gVar5.a = gVar6;
                    this.c = 0;
                } else if (i7 == 2) {
                    this.c = 0;
                }
                i5 *= 2;
            }
        }

        public void b(int i) {
            this.b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.d = 0;
            this.c = 0;
            this.a = null;
        }

        public g<K, V> c() {
            g<K, V> gVar = this.a;
            if (gVar.a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    public static class c<K, V> {
        private g<K, V> a;

        public g<K, V> a() {
            g<K, V> gVar = this.a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.a;
            gVar.a = null;
            g<K, V> gVar3 = gVar.c;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 == null) {
                    this.a = gVar4;
                    return gVar;
                }
                gVar2.a = gVar4;
                gVar3 = gVar2.b;
            }
        }

        public void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.a = gVar2;
                gVar2 = gVar;
                gVar = gVar.b;
            }
            this.a = gVar2;
        }
    }

    public final class d extends AbstractSet<Map.Entry<K, V>> {

        public class a extends e<K, V>.f<Map.Entry<K, V>> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            e.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && e.this.g((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g<K, V> gVarG;
            if (!(obj instanceof Map.Entry) || (gVarG = e.this.g((Map.Entry) obj)) == null) {
                return false;
            }
            e.this.j(gVarG, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return e.this.d;
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.e$e, reason: collision with other inner class name */
    public final class C0077e extends AbstractSet<K> {

        /* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.e$e$a */
        public class a extends e<K, V>.f<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f;
            }
        }

        public C0077e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            e.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return e.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return e.this.k(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return e.this.d;
        }
    }

    public abstract class f<T> implements Iterator<T> {
        public g<K, V> a;
        public g<K, V> b = null;
        public int c;

        public f() {
            this.a = e.this.c.d;
            this.c = e.this.e;
        }

        public final g<K, V> a() {
            g<K, V> gVar = this.a;
            e eVar = e.this;
            if (gVar == eVar.c) {
                throw new NoSuchElementException();
            }
            if (eVar.e != this.c) {
                throw new ConcurrentModificationException();
            }
            this.a = gVar.d;
            this.b = gVar;
            return gVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a != e.this.c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.b;
            if (gVar == null) {
                throw new IllegalStateException();
            }
            e.this.j(gVar, true);
            this.b = null;
            this.c = e.this.e;
        }
    }

    public e() {
        this(null);
    }

    private void a() {
        g<K, V>[] gVarArrC = c(this.b);
        this.b = gVarArrC;
        this.f = (gVarArrC.length / 2) + (gVarArrC.length / 4);
    }

    public static <K, V> g<K, V>[] c(g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        g<K, V>[] gVarArr2 = new g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i2 = 0; i2 < length; i2++) {
            g<K, V> gVar = gVarArr[i2];
            if (gVar != null) {
                cVar.b(gVar);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    g<K, V> gVarA = cVar.a();
                    if (gVarA == null) {
                        break;
                    }
                    if ((gVarA.g & length) == 0) {
                        i3++;
                    } else {
                        i4++;
                    }
                }
                bVar.b(i3);
                bVar2.b(i4);
                cVar.b(gVar);
                while (true) {
                    g<K, V> gVarA2 = cVar.a();
                    if (gVarA2 == null) {
                        break;
                    }
                    if ((gVarA2.g & length) == 0) {
                        bVar.a(gVarA2);
                    } else {
                        bVar2.a(gVarA2);
                    }
                }
                gVarArr2[i2] = i3 > 0 ? bVar.c() : null;
                gVarArr2[i2 + length] = i4 > 0 ? bVar2.c() : null;
            }
        }
        return gVarArr2;
    }

    private boolean e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void i(g<K, V> gVar, boolean z) {
        while (gVar != null) {
            g<K, V> gVar2 = gVar.b;
            g<K, V> gVar3 = gVar.c;
            int i2 = gVar2 != null ? gVar2.i : 0;
            int i3 = gVar3 != null ? gVar3.i : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                g<K, V> gVar4 = gVar3.b;
                g<K, V> gVar5 = gVar3.c;
                int i5 = (gVar4 != null ? gVar4.i : 0) - (gVar5 != null ? gVar5.i : 0);
                if (i5 == -1 || (i5 == 0 && !z)) {
                    n(gVar);
                } else {
                    o(gVar3);
                    n(gVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                g<K, V> gVar6 = gVar2.b;
                g<K, V> gVar7 = gVar2.c;
                int i6 = (gVar6 != null ? gVar6.i : 0) - (gVar7 != null ? gVar7.i : 0);
                if (i6 == 1 || (i6 == 0 && !z)) {
                    o(gVar);
                } else {
                    n(gVar2);
                    o(gVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                gVar.i = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                gVar.i = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            gVar = gVar.a;
        }
    }

    private void m(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.a;
        gVar.a = null;
        if (gVar2 != null) {
            gVar2.a = gVar3;
        }
        if (gVar3 == null) {
            int i2 = gVar.g;
            g<K, V>[] gVarArr = this.b;
            gVarArr[i2 & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.b == gVar) {
            gVar3.b = gVar2;
        } else {
            gVar3.c = gVar2;
        }
    }

    private void n(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.b;
        g<K, V> gVar3 = gVar.c;
        g<K, V> gVar4 = gVar3.b;
        g<K, V> gVar5 = gVar3.c;
        gVar.c = gVar4;
        if (gVar4 != null) {
            gVar4.a = gVar;
        }
        m(gVar, gVar3);
        gVar3.b = gVar;
        gVar.a = gVar3;
        int iMax = Math.max(gVar2 != null ? gVar2.i : 0, gVar4 != null ? gVar4.i : 0) + 1;
        gVar.i = iMax;
        gVar3.i = Math.max(iMax, gVar5 != null ? gVar5.i : 0) + 1;
    }

    private void o(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.b;
        g<K, V> gVar3 = gVar.c;
        g<K, V> gVar4 = gVar2.b;
        g<K, V> gVar5 = gVar2.c;
        gVar.b = gVar5;
        if (gVar5 != null) {
            gVar5.a = gVar;
        }
        m(gVar, gVar2);
        gVar2.c = gVar;
        gVar.a = gVar2;
        int iMax = Math.max(gVar3 != null ? gVar3.i : 0, gVar5 != null ? gVar5.i : 0) + 1;
        gVar.i = iMax;
        gVar2.i = Math.max(iMax, gVar4 != null ? gVar4.i : 0) + 1;
    }

    private static int p(int i2) {
        int i3 = i2 ^ ((i2 >>> 20) ^ (i2 >>> 12));
        return (i3 >>> 4) ^ ((i3 >>> 7) ^ i3);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.b, (Object) null);
        this.d = 0;
        this.e++;
        g<K, V> gVar = this.c;
        g<K, V> gVar2 = gVar.d;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.d;
            gVar2.e = null;
            gVar2.d = null;
            gVar2 = gVar3;
        }
        gVar.e = gVar;
        gVar.d = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return h(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        e<K, V>.d dVar = this.g;
        if (dVar != null) {
            return dVar;
        }
        e<K, V>.d dVar2 = new d();
        this.g = dVar2;
        return dVar2;
    }

    public g<K, V> f(K k, boolean z) {
        g<K, V> gVar;
        int i2;
        g<K, V> gVar2;
        Comparator<? super K> comparator = this.a;
        g<K, V>[] gVarArr = this.b;
        int iP = p(k.hashCode());
        int length = (gVarArr.length - 1) & iP;
        g<K, V> gVar3 = gVarArr[length];
        if (gVar3 != null) {
            Comparable comparable = comparator == i ? (Comparable) k : null;
            while (true) {
                int iCompareTo = comparable != null ? comparable.compareTo(gVar3.f) : comparator.compare(k, gVar3.f);
                if (iCompareTo == 0) {
                    return gVar3;
                }
                g<K, V> gVar4 = iCompareTo < 0 ? gVar3.b : gVar3.c;
                if (gVar4 == null) {
                    gVar = gVar3;
                    i2 = iCompareTo;
                    break;
                }
                gVar3 = gVar4;
            }
        } else {
            gVar = gVar3;
            i2 = 0;
        }
        if (!z) {
            return null;
        }
        g<K, V> gVar5 = this.c;
        if (gVar != null) {
            gVar2 = new g<>(gVar, k, iP, gVar5, gVar5.e);
            if (i2 < 0) {
                gVar.b = gVar2;
            } else {
                gVar.c = gVar2;
            }
            i(gVar, true);
        } else {
            if (comparator == i && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            gVar2 = new g<>(gVar, k, iP, gVar5, gVar5.e);
            gVarArr[length] = gVar2;
        }
        int i3 = this.d;
        this.d = i3 + 1;
        if (i3 > this.f) {
            a();
        }
        this.e++;
        return gVar2;
    }

    public g<K, V> g(Map.Entry<?, ?> entry) {
        g<K, V> gVarH = h(entry.getKey());
        if (gVarH != null && e(gVarH.h, entry.getValue())) {
            return gVarH;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        g<K, V> gVarH = h(obj);
        if (gVarH != null) {
            return gVarH.h;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g<K, V> h(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return f(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public void j(g<K, V> gVar, boolean z) {
        int i2;
        if (z) {
            g<K, V> gVar2 = gVar.e;
            gVar2.d = gVar.d;
            gVar.d.e = gVar2;
            gVar.e = null;
            gVar.d = null;
        }
        g<K, V> gVar3 = gVar.b;
        g<K, V> gVar4 = gVar.c;
        g<K, V> gVar5 = gVar.a;
        int i3 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                m(gVar, gVar3);
                gVar.b = null;
            } else if (gVar4 != null) {
                m(gVar, gVar4);
                gVar.c = null;
            } else {
                m(gVar, null);
            }
            i(gVar5, false);
            this.d--;
            this.e++;
            return;
        }
        g<K, V> gVarB = gVar3.i > gVar4.i ? gVar3.b() : gVar4.a();
        j(gVarB, false);
        g<K, V> gVar6 = gVar.b;
        if (gVar6 != null) {
            i2 = gVar6.i;
            gVarB.b = gVar6;
            gVar6.a = gVarB;
            gVar.b = null;
        } else {
            i2 = 0;
        }
        g<K, V> gVar7 = gVar.c;
        if (gVar7 != null) {
            i3 = gVar7.i;
            gVarB.c = gVar7;
            gVar7.a = gVarB;
            gVar.c = null;
        }
        gVarB.i = Math.max(i2, i3) + 1;
        m(gVar, gVarB);
    }

    public g<K, V> k(Object obj) {
        g<K, V> gVarH = h(obj);
        if (gVarH != null) {
            j(gVarH, true);
        }
        return gVarH;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        e<K, V>.C0077e c0077e = this.h;
        if (c0077e != null) {
            return c0077e;
        }
        e<K, V>.C0077e c0077e2 = new C0077e();
        this.h = c0077e2;
        return c0077e2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        g<K, V> gVarF = f(k, true);
        V v2 = gVarF.h;
        gVarF.h = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> gVarK = k(obj);
        if (gVarK != null) {
            return gVarK.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.d;
    }

    public e(Comparator<? super K> comparator) {
        this.d = 0;
        this.e = 0;
        this.a = comparator == null ? i : comparator;
        this.c = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.b = gVarArr;
        this.f = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    public static final class g<K, V> implements Map.Entry<K, V> {
        public g<K, V> a;
        public g<K, V> b;
        public g<K, V> c;
        public g<K, V> d;
        public g<K, V> e;
        public final K f;
        public final int g;
        public V h;
        public int i;

        public g() {
            this.f = null;
            this.g = -1;
            this.e = this;
            this.d = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.b; gVar2 != null; gVar2 = gVar2.b) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g<K, V> b() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.c; gVar2 != null; gVar2 = gVar2.c) {
                gVar = gVar2;
            }
            return gVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.h;
            if (v == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.h;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.h;
            this.h = v;
            return v2;
        }

        public String toString() {
            return this.f + SearchCriteria.EQ + this.h;
        }

        public g(g<K, V> gVar, K k, int i, g<K, V> gVar2, g<K, V> gVar3) {
            this.a = gVar;
            this.f = k;
            this.g = i;
            this.i = 1;
            this.d = gVar2;
            this.e = gVar3;
            gVar3.d = this;
            gVar2.e = this;
        }
    }
}
