package i53;

import j53.j;
import j53.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import o13.p;
import p13.d0;
import p13.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final <E> f<E> a(E... eArr) {
        j jVarB = l.b();
        List listAsList = Arrays.asList(eArr);
        listAsList.getClass();
        return jVarB.b(listAsList);
    }

    public static final <K, V> g<K, V> b(p<? extends K, ? extends V>... pVarArr) {
        l53.c.f110400e.getClass();
        l53.c cVar = l53.c.f110401f;
        cVar.getClass();
        l53.d dVar = new l53.d(cVar);
        u0.k(dVar, pVarArr);
        return dVar.build();
    }

    public static final l53.c c() {
        l53.c.f110400e.getClass();
        l53.c cVar = l53.c.f110401f;
        cVar.getClass();
        return cVar;
    }

    public static final m53.b d() {
        m53.b.f116784e.getClass();
        return m53.b.f116785f;
    }

    public static final <T> c<T> e(Iterable<? extends T> iterable) {
        iterable.getClass();
        c<T> cVar = iterable instanceof c ? (c) iterable : null;
        return cVar == null ? j(iterable) : cVar;
    }

    public static final f f(Object[] objArr) {
        objArr.getClass();
        j jVarB = l.b();
        jVarB.getClass();
        j53.f fVarC = jVarB.c();
        d0.w(fVarC, objArr);
        return fVarC.build();
    }

    public static final <K, V> d<K, V> g(Map<K, ? extends V> map) {
        map.getClass();
        d<K, V> dVar = map instanceof d ? (d) map : null;
        if (dVar != null) {
            return dVar;
        }
        g.a aVar = map instanceof g.a ? (g.a) map : null;
        g<K, V> gVarBuild = aVar != null ? aVar.build() : null;
        if (gVarBuild != null) {
            return gVarBuild;
        }
        l53.c cVarC = c();
        if (map.isEmpty()) {
            return cVarC;
        }
        l53.d dVar2 = new l53.d(cVarC);
        dVar2.putAll(map);
        return dVar2.build();
    }

    public static final <T> e<T> h(Iterable<? extends T> iterable) {
        iterable.getClass();
        e<T> eVar = iterable instanceof e ? (e) iterable : null;
        if (eVar != null) {
            return eVar;
        }
        h.a aVar = iterable instanceof h.a ? (h.a) iterable : null;
        m53.b bVarBuild = aVar != null ? aVar.build() : null;
        if (bVarBuild != null) {
            return bVarBuild;
        }
        m53.b bVarD = d();
        bVarD.getClass();
        if (iterable instanceof Collection) {
            return bVarD.b((Collection) iterable);
        }
        m53.c cVarC = bVarD.c();
        d0.v(cVarC, iterable);
        return cVarC.build();
    }

    public static final <T> f<T> i(c53.j<? extends T> jVar) {
        j jVarB = l.b();
        jVarB.getClass();
        j53.f fVarC = jVarB.c();
        d0.x(fVarC, jVar);
        return fVarC.build();
    }

    public static final <T> f<T> j(Iterable<? extends T> iterable) {
        iterable.getClass();
        f<T> fVar = iterable instanceof f ? (f) iterable : null;
        if (fVar != null) {
            return fVar;
        }
        f.a aVar = iterable instanceof f.a ? (f.a) iterable : null;
        f<T> fVarBuild = aVar != null ? aVar.build() : null;
        if (fVarBuild != null) {
            return fVarBuild;
        }
        j jVarB = l.b();
        jVarB.getClass();
        if (iterable instanceof Collection) {
            return jVarB.b((Collection) iterable);
        }
        j53.f fVarC = jVarB.c();
        d0.v(fVarC, iterable);
        return fVarC.build();
    }

    public static final <K, V> g<K, V> k(Map<K, ? extends V> map) {
        map.getClass();
        l53.c cVar = map instanceof l53.c ? (l53.c) map : null;
        if (cVar != null) {
            return cVar;
        }
        l53.d dVar = map instanceof l53.d ? (l53.d) map : null;
        g<K, V> gVarBuild = dVar != null ? dVar.build() : null;
        if (gVarBuild != null) {
            return gVarBuild;
        }
        l53.c.f110400e.getClass();
        l53.c cVar2 = l53.c.f110401f;
        cVar2.getClass();
        if (map.isEmpty()) {
            return cVar2;
        }
        l53.d dVar2 = new l53.d(cVar2);
        dVar2.putAll(map);
        return dVar2.build();
    }

    public static final <T> h<T> l(Iterable<? extends T> iterable) {
        iterable.getClass();
        m53.b bVar = iterable instanceof m53.b ? (m53.b) iterable : null;
        if (bVar != null) {
            return bVar;
        }
        m53.c cVar = iterable instanceof m53.c ? (m53.c) iterable : null;
        m53.b bVarBuild = cVar != null ? cVar.build() : null;
        if (bVarBuild != null) {
            return bVarBuild;
        }
        m53.b.f116784e.getClass();
        m53.b bVar2 = m53.b.f116785f;
        bVar2.getClass();
        if (iterable instanceof Collection) {
            return bVar2.b((Collection) iterable);
        }
        m53.c cVarC = bVar2.c();
        d0.v(cVarC, iterable);
        return cVarC.build();
    }
}
