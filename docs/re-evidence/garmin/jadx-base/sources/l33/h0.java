package l33;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends c1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f109741r = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o33.r f109742n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e0 f109743o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o43.k<Set<String>> f109744p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o43.i<a, t23.e> f109745q;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x33.f f109746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o33.f f109747b;

        public a(x33.f fVar, o33.f fVar2) {
            fVar.getClass();
            this.f109746a = fVar;
            this.f109747b = fVar2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.f109746a.equals(((a) obj).f109746a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f109746a.hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(k33.i iVar, o33.r rVar, e0 e0Var) {
        super(iVar);
        iVar.getClass();
        rVar.getClass();
        e0Var.getClass();
        this.f109742n = rVar;
        this.f109743o = e0Var;
        o43.n nVar = iVar.f102785a.f102751a;
        this.f109744p = nVar.a(new f0(iVar, this));
        this.f109745q = nVar.h(new g0(this, iVar));
    }

    @Override // l33.u0, i43.m, i43.l
    public final Collection<t23.r0> a(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        return p13.j0.f134944a;
    }

    @Override // i43.m, i43.o
    public final t23.h f(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        return v(fVar, null);
    }

    @Override // l33.u0, i43.m, i43.o
    public final Collection<t23.l> g(i43.d dVar, e23.l<? super x33.f, Boolean> lVar) {
        dVar.getClass();
        lVar.getClass();
        i43.d.a aVar = i43.d.f91028c;
        aVar.getClass();
        int i14 = i43.d.f91036k;
        aVar.getClass();
        if (!dVar.a(i43.d.f91029d | i14)) {
            return p13.j0.f134944a;
        }
        Collection<t23.l> collectionInvoke = this.f109812d.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionInvoke) {
            t23.l lVar2 = (t23.l) obj;
            if (lVar2 instanceof t23.e) {
                x33.f name = ((t23.e) lVar2).getName();
                name.getClass();
                if (lVar.invoke(name).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // l33.u0
    public final Set<x33.f> h(i43.d dVar, e23.l<? super x33.f, Boolean> lVar) {
        dVar.getClass();
        i43.d.f91028c.getClass();
        if (!dVar.a(i43.d.f91029d)) {
            return p13.l0.f134950a;
        }
        Set<String> setInvoke = this.f109744p.invoke();
        if (setInvoke != null) {
            HashSet hashSet = new HashSet();
            Iterator<T> it = setInvoke.iterator();
            while (it.hasNext()) {
                hashSet.add(x33.f.e((String) it.next()));
            }
            return hashSet;
        }
        if (lVar == null) {
            lVar = z43.h.f202421a;
        }
        p13.j0<o33.f> j0VarS = this.f109742n.s(lVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (o33.f fVar : j0VarS) {
            fVar.getClass();
            x33.f name = o33.y.SOURCE == null ? null : fVar.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // l33.u0
    public final Set<x33.f> i(i43.d dVar, e23.l<? super x33.f, Boolean> lVar) {
        dVar.getClass();
        return p13.l0.f134950a;
    }

    @Override // l33.u0
    public final c k() {
        return c.a.f109715a;
    }

    @Override // l33.u0
    public final void m(LinkedHashSet linkedHashSet, x33.f fVar) {
        fVar.getClass();
    }

    @Override // l33.u0
    public final Set o(i43.d dVar) {
        dVar.getClass();
        return p13.l0.f134950a;
    }

    @Override // l33.u0
    public final t23.l q() {
        return this.f109743o;
    }

    public final t23.e v(x33.f fVar, o33.f fVar2) {
        x33.h.f188609a.getClass();
        fVar.getClass();
        String strB = fVar.b();
        strB.getClass();
        if (strB.length() <= 0 || fVar.f188606b) {
            return null;
        }
        Set<String> setInvoke = this.f109744p.invoke();
        if (fVar2 == null && setInvoke != null && !setInvoke.contains(fVar.b())) {
            return null;
        }
        return this.f109745q.invoke(new a(fVar, fVar2));
    }

    public final u33.c w() {
        return this.f109810b.f102785a.f102754d.c().f110053c.a();
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final t23.e f109748a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(t23.e eVar) {
                super(null);
                eVar.getClass();
                this.f109748a = eVar;
            }
        }

        /* JADX INFO: renamed from: l33.h0$b$b, reason: collision with other inner class name */
        public static final class C2099b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2099b f109749a = new C2099b();

            private C2099b() {
                super(null);
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f109750a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
