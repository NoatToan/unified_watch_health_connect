package l33;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p43.c2;
import p43.f2;
import t23.j1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u0 extends i43.m {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ k23.l<Object>[] f109809m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k33.i f109810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f109811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o43.j<Collection<t23.l>> f109812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o43.j<c> f109813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o43.h<x33.f, Collection<t23.x0>> f109814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o43.i<x33.f, t23.r0> f109815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o43.h<x33.f, Collection<t23.x0>> f109816h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o43.j f109817i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o43.j f109818j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o43.j f109819k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o43.h<x33.f, List<t23.r0>> f109820l;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p43.n0 f109821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p43.n0 f109822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<j1> f109823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<t23.d1> f109824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f109825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<String> f109826f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(p43.n0 n0Var, p43.n0 n0Var2, List<? extends j1> list, List<? extends t23.d1> list2, boolean z14, List<String> list3) {
            n0Var.getClass();
            list.getClass();
            list2.getClass();
            list3.getClass();
            this.f109821a = n0Var;
            this.f109822b = n0Var2;
            this.f109823c = list;
            this.f109824d = list2;
            this.f109825e = z14;
            this.f109826f = list3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f109821a.equals(aVar.f109821a) && p005kotlin.jvm.internal.s.g(this.f109822b, aVar.f109822b) && this.f109823c.equals(aVar.f109823c) && this.f109824d.equals(aVar.f109824d) && this.f109825e == aVar.f109825e && this.f109826f.equals(aVar.f109826f);
        }

        public final int hashCode() {
            int iHashCode = this.f109821a.hashCode() * 31;
            p43.n0 n0Var = this.f109822b;
            return this.f109826f.hashCode() + q6.f.g(lc.u0.b(lc.u0.b((iHashCode + (n0Var == null ? 0 : n0Var.hashCode())) * 31, 31, this.f109823c), 31, this.f109824d), 31, this.f109825e);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("MethodSignatureData(returnType=");
            sb3.append(this.f109821a);
            sb3.append(", receiverType=");
            sb3.append(this.f109822b);
            sb3.append(", valueParameters=");
            sb3.append(this.f109823c);
            sb3.append(", typeParameters=");
            sb3.append(this.f109824d);
            sb3.append(", hasStableParameterNames=");
            sb3.append(this.f109825e);
            sb3.append(", errors=");
            return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f109826f, sb3);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<j1> f109827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f109828b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends j1> list, boolean z14) {
            list.getClass();
            this.f109827a = list;
            this.f109828b = z14;
        }
    }

    static {
        p005kotlin.jvm.internal.i0 i0Var = new p005kotlin.jvm.internal.i0(u0.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0);
        p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        f109809m = new k23.l[]{t0Var.h(i0Var), n23.j.l(u0.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0, t0Var), n23.j.l(u0.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0, t0Var)};
    }

    public u0(k33.i iVar, u0 u0Var) {
        iVar.getClass();
        this.f109810b = iVar;
        this.f109811c = u0Var;
        o43.n nVar = iVar.f102785a.f102751a;
        this.f109812d = nVar.i(new i0(this), p13.j0.f134944a);
        this.f109813e = nVar.g(new l0(this));
        this.f109814f = nVar.e(new m0(this));
        this.f109815g = nVar.h(new n0(this));
        this.f109816h = nVar.e(new o0(this));
        this.f109817i = nVar.g(new p0(this));
        this.f109818j = nVar.g(new q0(this));
        this.f109819k = nVar.g(new r0(this));
        this.f109820l = nVar.e(new s0(this));
    }

    public static p43.n0 l(o33.o oVar, k33.i iVar) {
        oVar.getClass();
        return iVar.f102788d.d(oVar.D(), gg.b.P(c2.COMMON, oVar.w().f202070a.isAnnotation(), null, 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b u(k33.i iVar, w23.x xVar, List list) {
        o13.p pVar;
        x33.f name;
        m33.d dVar = iVar.f102788d;
        k33.c cVar = iVar.f102785a;
        t23.c0 c0Var = cVar.f102765o;
        list.getClass();
        p13.n0 n0VarJ1 = p13.h0.j1(list);
        ArrayList arrayList = new ArrayList(p13.y.r(n0VarJ1, 10));
        Iterator it = n0VarJ1.iterator();
        boolean z14 = false;
        while (true) {
            p13.o0 o0Var = (p13.o0) it;
            if (!o0Var.f134956a.hasNext()) {
                return new b(p13.h0.b1(arrayList), z14);
            }
            p13.m0 m0Var = (p13.m0) o0Var.next();
            int i14 = m0Var.f134951a;
            o33.w wVar = (o33.w) m0Var.f134952b;
            k33.f fVarN = gg.b.N(iVar, wVar);
            m33.a aVarP = gg.b.P(c2.COMMON, false, null, 7);
            if (wVar.a()) {
                o33.t type = wVar.getType();
                o33.e eVar = type instanceof o33.e ? (o33.e) type : null;
                if (eVar == null) {
                    com.nimbusds.jose.shaded.gson.internal.a.y(wVar, "Vararg parameter should be an array: ");
                    return null;
                }
                f2 f2VarC = dVar.c(eVar, aVarP, true);
                pVar = new o13.p(f2VarC, c0Var.e().f(f2VarC));
            } else {
                pVar = new o13.p(dVar.d(wVar.getType(), aVarP), null);
            }
            p43.n0 n0Var = (p43.n0) pVar.f128594a;
            p43.n0 n0Var2 = (p43.n0) pVar.f128595b;
            if (p005kotlin.jvm.internal.s.g(xVar.getName().b(), "equals") && list.size() == 1 && c0Var.e().p().equals(n0Var)) {
                name = x33.f.e("other");
            } else {
                name = wVar.getName();
                if (name == null) {
                    z14 = true;
                }
                if (name == null) {
                    name = x33.f.e("p" + i14);
                }
            }
            arrayList.add(new w23.x0(xVar, null, i14, fVarN, name, n0Var, false, false, false, n0Var2, cVar.f102760j.a(wVar)));
        }
    }

    @Override // i43.m, i43.l
    public Collection<t23.r0> a(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        return !d().contains(fVar) ? p13.j0.f134944a : (Collection) ((o43.e.k) this.f109820l).invoke(fVar);
    }

    @Override // i43.m, i43.l
    public final Set<x33.f> b() {
        return (Set) gl1.d.B(this.f109817i, f109809m[0]);
    }

    @Override // i43.m, i43.l
    public Collection<t23.x0> c(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        return !b().contains(fVar) ? p13.j0.f134944a : (Collection) ((o43.e.k) this.f109816h).invoke(fVar);
    }

    @Override // i43.m, i43.l
    public final Set<x33.f> d() {
        return (Set) gl1.d.B(this.f109818j, f109809m[1]);
    }

    @Override // i43.m, i43.l
    public final Set<x33.f> e() {
        return (Set) gl1.d.B(this.f109819k, f109809m[2]);
    }

    @Override // i43.m, i43.o
    public Collection<t23.l> g(i43.d dVar, e23.l<? super x33.f, Boolean> lVar) {
        dVar.getClass();
        lVar.getClass();
        return this.f109812d.invoke();
    }

    public abstract Set<x33.f> h(i43.d dVar, e23.l<? super x33.f, Boolean> lVar);

    public abstract Set<x33.f> i(i43.d dVar, e23.l<? super x33.f, Boolean> lVar);

    public void j(ArrayList arrayList, x33.f fVar) {
        fVar.getClass();
    }

    public abstract c k();

    public abstract void m(LinkedHashSet linkedHashSet, x33.f fVar);

    public abstract void n(ArrayList arrayList, x33.f fVar);

    public abstract Set o(i43.d dVar);

    public abstract t23.u0 p();

    public abstract t23.l q();

    public boolean r(j33.e eVar) {
        return true;
    }

    public abstract a s(o33.o oVar, ArrayList arrayList, p43.n0 n0Var, List list);

    public final j33.e t(o33.o oVar) {
        w23.q0 q0VarH;
        t23.a0 a0Var;
        Map<? extends t23.a.InterfaceC3056a<?>, ?> mapB;
        oVar.getClass();
        k33.i iVar = this.f109810b;
        j33.e eVarS0 = j33.e.S0(q(), gg.b.N(iVar, oVar), oVar.getName(), iVar.f102785a.f102760j.a(oVar), this.f109813e.invoke().a(oVar.getName()) != null && ((ArrayList) oVar.f()).isEmpty());
        iVar.getClass();
        k33.i iVar2 = new k33.i(iVar.f102785a, new k33.k(iVar, eVarS0, oVar, 0), iVar.f102787c);
        ArrayList typeParameters = oVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(p13.y.r(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            t23.d1 d1VarA = iVar2.f102786b.a((o33.u) it.next());
            d1VarA.getClass();
            arrayList.add(d1VarA);
        }
        b bVarU = u(iVar2, eVarS0, oVar.f());
        List<j1> list = bVarU.f109827a;
        a aVarS = s(oVar, arrayList, l(oVar, iVar2), list);
        p43.n0 n0Var = aVarS.f109822b;
        List<String> list2 = aVarS.f109826f;
        if (n0Var != null) {
            u23.h.f168226x0.getClass();
            q0VarH = b43.h.h(eVarS0, n0Var, u23.h.a.f168228b);
        } else {
            q0VarH = null;
        }
        w23.q0 q0Var = q0VarH;
        t23.u0 u0VarP = p();
        p13.j0 j0Var = p13.j0.f134944a;
        List<t23.d1> list3 = aVarS.f109824d;
        List<j1> list4 = aVarS.f109823c;
        p43.n0 n0Var2 = aVarS.f109821a;
        t23.a0.a aVar = t23.a0.f161986a;
        boolean zIsAbstract = oVar.isAbstract();
        boolean zIsFinal = oVar.isFinal();
        aVar.getClass();
        if (zIsAbstract) {
            a0Var = t23.a0.ABSTRACT;
        } else {
            a0Var = !zIsFinal ? t23.a0.OPEN : t23.a0.FINAL;
        }
        t23.a0 a0Var2 = a0Var;
        t23.r rVarA = h33.l0.a(oVar.getVisibility());
        if (n0Var != null) {
            mapB = p13.t0.b(new o13.p(j33.e.T, p13.h0.b0(list)));
        } else {
            mapB = p13.k0.f134949a;
            mapB.getClass();
        }
        eVarS0.R0(q0Var, u0VarP, j0Var, list3, list4, n0Var2, a0Var2, rVarA, mapB);
        eVarS0.T0(aVarS.f109825e, bVarU.f109828b);
        if (list2.isEmpty()) {
            return eVarS0;
        }
        ((i33.o.a) iVar2.f102785a.f102755e).getClass();
        org.apache.commons.lang3.e.w("Should not be called");
        return null;
    }

    public String toString() {
        return "Lazy scope for " + q();
    }

    public /* synthetic */ u0(k33.i iVar, u0 u0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(iVar, (i14 & 2) != 0 ? null : u0Var);
    }
}
