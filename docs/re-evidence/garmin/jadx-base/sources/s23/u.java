package s23;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lc.u0;
import n43.h0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.i0;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.a1;
import p13.j0;
import p13.l0;
import p43.a2;
import p43.n0;
import p43.v0;
import q33.b0;
import q33.e0;
import t23.c0;
import t23.j1;
import t23.x0;
import t23.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements v23.a, v23.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ k23.l<Object>[] f156289i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f156290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f156291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o43.j f156292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v0 f156293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o43.j f156294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o43.a<x33.c, t23.e> f156295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o43.j f156296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o43.h<o13.p<String, String>, u23.h> f156297h;

    public enum a {
        HIDDEN,
        VISIBLE,
        DEPRECATED_LIST_METHODS,
        NOT_CONSIDERED,
        DROP
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f156304a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.DEPRECATED_LIST_METHODS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.NOT_CONSIDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.DROP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.VISIBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f156304a = iArr;
        }
    }

    static {
        i0 i0Var = new i0(u.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0);
        t0 t0Var = s0.f105811a;
        f156289i = new k23.l[]{t0Var.h(i0Var), n23.j.l(u.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, t0Var), n23.j.l(u.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0, t0Var)};
    }

    public u(c0 c0Var, o43.n nVar, e23.a<k.b> aVar) {
        c0Var.getClass();
        nVar.getClass();
        aVar.getClass();
        this.f156290a = c0Var;
        this.f156291b = d.f156251a;
        this.f156292c = nVar.g(aVar);
        w23.m mVar = new w23.m(new v(c0Var, new x33.c("java.io")), x33.f.e("Serializable"), t23.a0.ABSTRACT, t23.f.INTERFACE, p13.w.c(new p43.s0(nVar, new o(this))), y0.f162076a, false, nVar);
        mVar.E0(i43.l.b.f91061b, l0.f134950a, null);
        v0 v0VarP = mVar.p();
        v0VarP.getClass();
        this.f156293d = v0VarP;
        this.f156294e = nVar.g(new l(this, nVar));
        this.f156295f = nVar.c();
        this.f156296g = nVar.g(new m(this));
        this.f156297h = nVar.e(new n(this));
    }

    @Override // v23.c
    public final boolean a(t23.e eVar, h0 h0Var) {
        eVar.getClass();
        l33.m mVarF = f(eVar);
        if (mVarF == null || !h0Var.getAnnotations().I3(v23.d.f175353a)) {
            return true;
        }
        if (!g().f156276b) {
            return false;
        }
        String strA = b0.a(h0Var, 3);
        l33.a0 a0VarE0 = mVarF.E0();
        x33.f name = h0Var.getName();
        name.getClass();
        Collection<x0> collectionC = a0VarE0.c(name, b33.b.FROM_BUILTINS);
        if ((collectionC instanceof Collection) && collectionC.isEmpty()) {
            return false;
        }
        Iterator<T> it = collectionC.iterator();
        while (it.hasNext()) {
            if (b0.a((x0) it.next(), 3).equals(strA)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:103:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:105:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:108:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:109:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:110:0x030b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0319  */
    /* JADX WARN: Code duplicated, block: B:113:0x0331  */
    /* JADX WARN: Code duplicated, block: B:115:0x0339  */
    /* JADX WARN: Code duplicated, block: B:119:0x035e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0370  */
    /* JADX WARN: Code duplicated, block: B:127:0x0374  */
    /* JADX WARN: Code duplicated, block: B:137:0x0382 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0354 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x012e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0283  */
    /* JADX WARN: Code duplicated, block: B:99:0x02e7 A[DONT_INVERT] */
    @Override // v23.a
    public final Collection<x0> b(x33.f fVar, t23.e eVar) throws Throwable {
        Set setK;
        Object objC;
        Collection<x0> collection;
        Iterable<x0> iterable;
        Collection<x0> collection2;
        boolean zBooleanValue;
        ArrayList arrayList;
        t23.v.a<? extends t23.v> aVarJ0;
        int i14;
        boolean z14;
        Object obj;
        x33.f name;
        boolean zG;
        o43.h<o13.p<String, String>, u23.h> hVar;
        u23.h hVar2;
        fVar.getClass();
        eVar.getClass();
        s23.a.f156228e.getClass();
        boolean zEquals = fVar.equals(s23.a.f156229f);
        k23.l<Object>[] lVarArr = f156289i;
        if (zEquals && (eVar instanceof n43.n)) {
            x33.f fVar2 = p005kotlin.reflect.jvm.internal.impl.builtins.d.f105832e;
            if (p005kotlin.reflect.jvm.internal.impl.builtins.d.b(eVar, kotlin.reflect.jvm.internal.impl.builtins.f.a.f105881h) || p005kotlin.reflect.jvm.internal.impl.builtins.d.s(eVar) != null) {
                n43.n nVar = (n43.n) eVar;
                List<s33.j> list = nVar.f123654f.f156538q;
                list.getClass();
                if (!list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        x33.f fVarD = x33.f.d(nVar.f123661m.f110086b.getString(((s33.j) it.next()).f156685f));
                        s23.a.f156228e.getClass();
                        if (fVarD.equals(s23.a.f156229f)) {
                            return j0.f134944a;
                        }
                    }
                }
                t23.v.a<? extends t23.v> aVarJ1 = ((x0) p13.h0.H0(((v0) gl1.d.B(this.f156294e, lVarArr[1])).i().c(fVar, b33.b.FROM_BUILTINS))).j0();
                aVarJ1.n(nVar);
                aVarJ1.f(t23.q.f162050e);
                aVarJ1.o(nVar.p());
                aVarJ1.p(nVar.k0());
                t23.v vVarBuild = aVarJ1.build();
                vVarBuild.getClass();
                return p13.w.c((x0) vVarBuild);
            }
        }
        if (!g().f156276b) {
            return j0.f134944a;
        }
        p pVar = new p(fVar);
        l33.m mVarF = f(eVar);
        boolean z15 = false;
        Collection<x0> collection3 = null;
        if (mVarF != null) {
            x33.c cVarG = f43.e.g(mVarF);
            s23.b.f156230f.getClass();
            s23.b bVar = s23.b.f156231g;
            d dVar = this.f156291b;
            dVar.getClass();
            bVar.getClass();
            t23.e eVarC = d.c(dVar, cVarG, bVar);
            if (eVarC == null) {
                setK = l0.f134950a;
            } else {
                c cVar = c.f156232a;
                x33.d dVarF = b43.i.f(eVarC);
                dVarF.getClass();
                cVar.getClass();
                x33.c cVar2 = c.f156243l.get(dVarF);
                if (cVar2 == null) {
                    setK = a1.b(eVarC);
                } else {
                    t23.e eVarJ = bVar.j(cVar2);
                    eVarJ.getClass();
                    setK = p13.x.k(eVarC, eVarJ);
                }
            }
            Iterable iterable2 = setK;
            iterable2.getClass();
            if (iterable2 instanceof List) {
                List list2 = (List) iterable2;
                if (list2.isEmpty()) {
                    objC = null;
                } else {
                    objC = com.airbnb.lottie.animation.keyframe.a.c(1, list2);
                }
            } else {
                Iterator it3 = iterable2.iterator();
                if (it3.hasNext()) {
                    Object next = it3.next();
                    while (it3.hasNext()) {
                        next = it3.next();
                    }
                    objC = next;
                } else {
                    objC = null;
                }
            }
            t23.e eVar2 = (t23.e) objC;
            if (eVar2 == null) {
                iterable = j0.f134944a;
            } else {
                z43.j.b bVar2 = z43.j.f202430c;
                ArrayList arrayList2 = new ArrayList(p13.y.r(iterable2, 10));
                Iterator it4 = iterable2.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(f43.e.g((t23.e) it4.next()));
                }
                bVar2.getClass();
                z43.j jVar = new z43.j(null);
                jVar.addAll(arrayList2);
                boolean zB = d.b(eVar);
                x33.c cVarG2 = f43.e.g(mVarF);
                q qVar = new q(mVarF, eVar2);
                o43.e.b bVar3 = (o43.e.b) this.f156295f;
                bVar3.getClass();
                V vInvoke = bVar3.invoke(new o43.e.C2474e(cVarG2, qVar));
                if (vInvoke == 0) {
                    o43.e.b.a(3);
                    throw null;
                }
                i43.l lVarC0 = ((t23.e) vInvoke).c0();
                lVarC0.getClass();
                Iterable iterable3 = (Iterable) pVar.invoke(lVarC0);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : iterable3) {
                    x0 x0Var = (x0) obj2;
                    if (x0Var.getKind() == t23.b.a.DECLARATION && x0Var.getVisibility().a().f162041b && !p005kotlin.reflect.jvm.internal.impl.builtins.d.D(x0Var)) {
                        Collection<? extends t23.b> collectionO = x0Var.o();
                        collectionO.getClass();
                        Collection<? extends t23.b> collection4 = collectionO;
                        if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                            Iterator<T> it5 = collection4.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    t23.l lVarD = ((t23.v) it5.next()).d();
                                    lVarD.getClass();
                                    if (jVar.contains(f43.e.g(lVarD))) {
                                        collection2 = collection3;
                                    }
                                }
                            }
                        }
                        t23.l lVarD2 = x0Var.d();
                        lVarD2.getClass();
                        String strA = b0.a(x0Var, 3);
                        z.f156309a.getClass();
                        collection2 = collection3;
                        if (z.f156314f.contains(oc.b.I(e0.f142457a, (t23.e) lVarD2, strA)) ^ zB) {
                            zBooleanValue = true;
                        } else {
                            Boolean boolD = z43.b.d(p13.w.c(x0Var), r.f156286a, new s(this));
                            boolD.getClass();
                            zBooleanValue = boolD.booleanValue();
                        }
                        z15 = !zBooleanValue;
                    } else {
                        collection2 = collection3;
                    }
                    if (z15) {
                        arrayList3.add(obj2);
                    }
                    collection3 = collection2;
                    z15 = false;
                }
                collection = collection3;
                iterable = arrayList3;
            }
            arrayList = new ArrayList();
            for (x0 x0Var2 : iterable) {
                t23.l lVarD3 = x0Var2.d();
                lVarD3.getClass();
                t23.v vVarB = x0Var2.b(a2.e(a0.a((t23.e) lVarD3, eVar)));
                vVarB.getClass();
                aVarJ0 = ((x0) vVarB).j0();
                aVarJ0.n(eVar);
                aVarJ0.p(eVar.k0());
                aVarJ0.h();
                t23.l lVarD4 = x0Var2.d();
                lVarD4.getClass();
                Object objB = z43.b.b(p13.w.c((t23.e) lVarD4), new t(this), new w(b0.a(x0Var2, 3), new r0()));
                objB.getClass();
                i14 = b.f156304a[((a) objB).ordinal()];
                if (i14 != 1) {
                    if (i14 != 2) {
                        name = x0Var2.getName();
                        zG = p005kotlin.jvm.internal.s.g(name, x.f156307a);
                        hVar = this.f156297h;
                        if (zG) {
                            hVar2 = (u23.h) ((o43.e.k) hVar).invoke(new o13.p(x0Var2.getName().b(), "first"));
                        } else {
                            if (p005kotlin.jvm.internal.s.g(name, x.f156308b)) {
                                androidx.core.view.j.x(x0Var2.getName(), "Unexpected name: ");
                                return collection;
                            }
                            hVar2 = (u23.h) ((o43.e.k) hVar).invoke(new o13.p(x0Var2.getName().b(), "last"));
                        }
                        aVarJ0.i(hVar2);
                    } else if (i14 != 3) {
                        aVarJ0.i((u23.h) gl1.d.B(this.f156296g, lVarArr[2]));
                    } else if (i14 != 4) {
                        obj = collection;
                    } else {
                        if (i14 == 5) {
                            u0.r();
                            return collection;
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    Object objBuild = aVarJ0.build();
                    objBuild.getClass();
                    obj = (x0) objBuild;
                } else {
                    if (eVar.g() == t23.a0.FINAL || eVar.getKind() == t23.f.ENUM_CLASS) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (z14) {
                        obj = collection;
                    } else {
                        aVarJ0.m();
                        Object objBuild2 = aVarJ0.build();
                        objBuild2.getClass();
                        obj = (x0) objBuild2;
                    }
                }
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        iterable = j0.f134944a;
        collection = null;
        arrayList = new ArrayList();
        while (r1.hasNext()) {
            t23.l lVarD5 = x0Var2.d();
            lVarD5.getClass();
            t23.v vVarB2 = x0Var2.b(a2.e(a0.a((t23.e) lVarD5, eVar)));
            vVarB2.getClass();
            aVarJ0 = ((x0) vVarB2).j0();
            aVarJ0.n(eVar);
            aVarJ0.p(eVar.k0());
            aVarJ0.h();
            t23.l lVarD6 = x0Var2.d();
            lVarD6.getClass();
            Object objB2 = z43.b.b(p13.w.c((t23.e) lVarD6), new t(this), new w(b0.a(x0Var2, 3), new r0()));
            objB2.getClass();
            i14 = b.f156304a[((a) objB2).ordinal()];
            if (i14 != 1) {
                if (i14 != 2) {
                    name = x0Var2.getName();
                    zG = p005kotlin.jvm.internal.s.g(name, x.f156307a);
                    hVar = this.f156297h;
                    if (zG) {
                        hVar2 = (u23.h) ((o43.e.k) hVar).invoke(new o13.p(x0Var2.getName().b(), "first"));
                    } else {
                        if (p005kotlin.jvm.internal.s.g(name, x.f156308b)) {
                            androidx.core.view.j.x(x0Var2.getName(), "Unexpected name: ");
                            return collection;
                        }
                        hVar2 = (u23.h) ((o43.e.k) hVar).invoke(new o13.p(x0Var2.getName().b(), "last"));
                    }
                    aVarJ0.i(hVar2);
                } else if (i14 != 3) {
                    aVarJ0.i((u23.h) gl1.d.B(this.f156296g, lVarArr[2]));
                } else if (i14 != 4) {
                    obj = collection;
                } else {
                    if (i14 == 5) {
                        u0.r();
                        return collection;
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
                Object objBuild3 = aVarJ0.build();
                objBuild3.getClass();
                obj = (x0) objBuild3;
            } else {
                if (eVar.g() == t23.a0.FINAL) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                if (z14) {
                    obj = collection;
                } else {
                    aVarJ0.m();
                    Object objBuild4 = aVarJ0.build();
                    objBuild4.getClass();
                    obj = (x0) objBuild4;
                }
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // v23.a
    public final Collection<n0> c(t23.e eVar) {
        eVar.getClass();
        int i14 = f43.e.f68881a;
        x33.d dVarF = b43.i.f(eVar);
        dVarF.getClass();
        z.f156309a.getClass();
        x33.d dVar = kotlin.reflect.jvm.internal.impl.builtins.f.a.f105881h;
        boolean zEquals = dVarF.equals(dVar);
        boolean zIsAssignableFrom = false;
        v0 v0Var = this.f156293d;
        if (!zEquals) {
            HashMap map = kotlin.reflect.jvm.internal.impl.builtins.f.a.f105882h0;
            if (map.get(dVarF) == null) {
                if (dVarF.equals(dVar) || map.get(dVarF) != null) {
                    zIsAssignableFrom = true;
                } else {
                    c.f156232a.getClass();
                    x33.b bVarF = c.f(dVarF);
                    if (bVarF != null) {
                        try {
                            zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(bVarF.a().f188596a.f188600a));
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                }
                return zIsAssignableFrom ? p13.w.c(v0Var) : j0.f134944a;
            }
        }
        return p13.x.k((v0) gl1.d.B(this.f156294e, f156289i[1]), v0Var);
    }

    @Override // v23.a
    public final Collection<t23.d> d(t23.e eVar) {
        x33.d dVarF;
        eVar.getClass();
        if (eVar.getKind() != t23.f.CLASS || !g().f156276b) {
            return j0.f134944a;
        }
        l33.m mVarF = f(eVar);
        if (mVarF == null) {
            return j0.f134944a;
        }
        x33.c cVarG = f43.e.g(mVarF);
        s23.b.f156230f.getClass();
        t23.e eVarC = d.c(this.f156291b, cVarG, s23.b.f156231g);
        if (eVarC == null) {
            return j0.f134944a;
        }
        a2 a2VarE = a2.e(a0.a(eVarC, mVarF));
        List<t23.d> listInvoke = mVarF.f109781t.f109697q.invoke();
        ArrayList<t23.d> arrayList = new ArrayList();
        for (Object obj : listInvoke) {
            t23.d dVar = (t23.d) obj;
            if (dVar.getVisibility().a().f162041b) {
                Collection<t23.d> collectionN = eVarC.n();
                collectionN.getClass();
                Collection<t23.d> collection = collectionN;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            t23.d dVar2 = (t23.d) it.next();
                            dVar2.getClass();
                            if (p005kotlin.reflect.jvm.internal.impl.resolve.b.l(dVar2, dVar.b(a2VarE)) == kotlin.reflect.jvm.internal.impl.resolve.b.c.a.OVERRIDABLE) {
                            }
                        }
                    }
                }
                if (dVar.f().size() == 1) {
                    List<j1> listF = dVar.f();
                    listF.getClass();
                    t23.h hVarT = ((j1) p13.h0.I0(listF)).getType().F0().t();
                    if (hVarT != null) {
                        int i14 = f43.e.f68881a;
                        dVarF = b43.i.f(hVarT);
                        dVarF.getClass();
                    } else {
                        dVarF = null;
                    }
                    x33.d dVarF2 = b43.i.f(eVar);
                    dVarF2.getClass();
                    if (p005kotlin.jvm.internal.s.g(dVarF, dVarF2)) {
                    }
                }
                if (!p005kotlin.reflect.jvm.internal.impl.builtins.d.D(dVar)) {
                    z.f156309a.getClass();
                    if (!z.f156315g.contains(oc.b.I(e0.f142457a, mVarF, b0.a(dVar, 3)))) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        for (t23.d dVar3 : arrayList) {
            t23.v.a<? extends t23.v> aVarJ0 = dVar3.j0();
            aVarJ0.n(eVar);
            aVarJ0.o(eVar.p());
            aVarJ0.h();
            aVarJ0.k(a2VarE.g());
            z.f156309a.getClass();
            if (!z.f156316h.contains(oc.b.I(e0.f142457a, mVarF, b0.a(dVar3, 3)))) {
                aVarJ0.i((u23.h) gl1.d.B(this.f156296g, f156289i[2]));
            }
            t23.v vVarBuild = aVarJ0.build();
            vVarBuild.getClass();
            arrayList2.add((t23.d) vVarBuild);
        }
        return arrayList2;
    }

    @Override // v23.a
    public final Collection e(t23.e eVar) {
        l33.m mVarF;
        Set<x33.f> setB;
        eVar.getClass();
        if (!g().f156276b || (mVarF = f(eVar)) == null || (setB = mVarF.E0().b()) == null) {
            setB = l0.f134950a;
        }
        return setB;
    }

    public final l33.m f(t23.e eVar) {
        x33.c cVarA;
        if (eVar == null) {
            p005kotlin.reflect.jvm.internal.impl.builtins.d.a(108);
            throw null;
        }
        x33.f fVar = p005kotlin.reflect.jvm.internal.impl.builtins.d.f105832e;
        if (!p005kotlin.reflect.jvm.internal.impl.builtins.d.b(eVar, kotlin.reflect.jvm.internal.impl.builtins.f.a.f105869b) && p005kotlin.reflect.jvm.internal.impl.builtins.d.K(eVar)) {
            int i14 = f43.e.f68881a;
            x33.d dVarF = b43.i.f(eVar);
            dVarF.getClass();
            if (dVarF.d()) {
                c.f156232a.getClass();
                x33.b bVarF = c.f(dVarF);
                if (bVarF != null && (cVarA = bVarF.a()) != null) {
                    t23.e eVarD = og2.k.D(g().f156275a, cVarA, b33.b.FROM_BUILTINS);
                    if (eVarD instanceof l33.m) {
                        return (l33.m) eVarD;
                    }
                }
            }
        }
        return null;
    }

    public final k.b g() {
        return (k.b) gl1.d.B(this.f156292c, f156289i[0]);
    }
}
