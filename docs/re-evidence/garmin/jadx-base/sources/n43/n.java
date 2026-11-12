package n43;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import l43.o0;
import l43.p0;
import l43.q0;
import p13.t0;
import p43.m1;
import p43.n0;
import p43.v0;
import t23.b1;
import t23.d1;
import t23.h1;
import t23.r0;
import t23.u0;
import t23.w0;
import t23.x0;
import t23.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends w23.b implements t23.l {
    public static final /* synthetic */ int A = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s33.c f123654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u33.a f123655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0 f123656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x33.b f123657i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t23.a0 f123658j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t23.p f123659k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t23.f f123660l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l43.p f123661m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i43.m f123662n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f123663o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w0<a> f123664p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f123665q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t23.l f123666r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o43.k<t23.d> f123667t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o43.j<Collection<t23.d>> f123668v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o43.k<t23.e> f123669w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o43.k<h1<v0>> f123670x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o0.a f123671y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final u23.h f123672z;

    public final class a extends z {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ int f123673k = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final q43.f f123674g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final o43.j<Collection<t23.l>> f123675h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final o43.j<Collection<n0>> f123676i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ n f123677j;

        public a(n nVar, q43.f fVar) {
            fVar.getClass();
            this.f123677j = nVar;
            l43.p pVar = nVar.f123661m;
            s33.c cVar = nVar.f123654f;
            List<s33.j> list = cVar.f156538q;
            list.getClass();
            List<s33.o> list2 = cVar.f156539r;
            list2.getClass();
            List<s33.t> list3 = cVar.f156540t;
            list3.getClass();
            List<Integer> list4 = cVar.f156532k;
            list4.getClass();
            u33.d dVar = nVar.f123661m.f110086b;
            ArrayList arrayList = new ArrayList(p13.y.r(list4, 10));
            Iterator<T> it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(x33.f.d(dVar.getString(((Number) it.next()).intValue())));
            }
            super(pVar, list, list2, list3, new j(arrayList));
            this.f123674g = fVar;
            this.f123675h = this.f123696b.f110085a.f110051a.g(new k(this));
            this.f123676i = this.f123696b.f110085a.f110051a.g(new l(this));
        }

        @Override // n43.z, i43.m, i43.l
        public final Collection<r0> a(x33.f fVar, b33.b bVar) {
            fVar.getClass();
            bVar.getClass();
            s(fVar, bVar);
            return super.a(fVar, bVar);
        }

        @Override // n43.z, i43.m, i43.l
        public final Collection<x0> c(x33.f fVar, b33.b bVar) {
            fVar.getClass();
            bVar.getClass();
            s(fVar, bVar);
            return super.c(fVar, bVar);
        }

        @Override // n43.z, i43.m, i43.o
        public final t23.h f(x33.f fVar, b33.b bVar) {
            t23.e eVarInvoke;
            fVar.getClass();
            bVar.getClass();
            s(fVar, bVar);
            c cVar = this.f123677j.f123665q;
            return (cVar == null || (eVarInvoke = cVar.f123681b.invoke(fVar)) == null) ? super.f(fVar, bVar) : eVarInvoke;
        }

        @Override // i43.m, i43.o
        public final Collection<t23.l> g(i43.d dVar, e23.l<? super x33.f, Boolean> lVar) {
            dVar.getClass();
            lVar.getClass();
            return this.f123675h.invoke();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r1v3, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
        @Override // n43.z
        public final void h(e23.l lVar, ArrayList arrayList) {
            ?? arrayList2;
            lVar.getClass();
            c cVar = this.f123677j.f123665q;
            if (cVar != null) {
                Set<x33.f> setKeySet = cVar.f123680a.keySet();
                arrayList2 = new ArrayList();
                for (x33.f fVar : setKeySet) {
                    fVar.getClass();
                    t23.e eVarInvoke = cVar.f123681b.invoke(fVar);
                    if (eVarInvoke != null) {
                        arrayList2.add(eVarInvoke);
                    }
                }
            } else {
                arrayList2 = 0;
            }
            if (arrayList2 == 0) {
                arrayList2 = p13.j0.f134944a;
            }
            arrayList.addAll(arrayList2);
        }

        @Override // n43.z
        public final void j(ArrayList arrayList, x33.f fVar) {
            fVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            Iterator<n0> it = this.f123676i.invoke().iterator();
            while (it.hasNext()) {
                arrayList2.addAll(it.next().i().c(fVar, b33.b.FOR_ALREADY_TRACKED));
            }
            l43.p pVar = this.f123696b;
            arrayList.addAll(pVar.f110085a.f110064n.b(fVar, this.f123677j));
            ArrayList arrayList3 = new ArrayList(arrayList);
            pVar.f110085a.f110067q.c().j(fVar, arrayList2, arrayList3, this.f123677j, new m(arrayList));
        }

        @Override // n43.z
        public final void k(ArrayList arrayList, x33.f fVar) {
            fVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            Iterator<n0> it = this.f123676i.invoke().iterator();
            while (it.hasNext()) {
                arrayList2.addAll(it.next().i().a(fVar, b33.b.FOR_ALREADY_TRACKED));
            }
            ArrayList arrayList3 = new ArrayList(arrayList);
            this.f123696b.f110085a.f110067q.c().j(fVar, arrayList2, arrayList3, this.f123677j, new m(arrayList));
        }

        @Override // n43.z
        public final x33.b l(x33.f fVar) {
            fVar.getClass();
            return this.f123677j.f123657i.d(fVar);
        }

        @Override // n43.z
        public final Set<x33.f> n() {
            List<n0> listB = this.f123677j.f123663o.b();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                Set<x33.f> setE = ((n0) it.next()).i().e();
                if (setE == null) {
                    return null;
                }
                p13.d0.v(linkedHashSet, setE);
            }
            return linkedHashSet;
        }

        @Override // n43.z
        public final Set<x33.f> o() {
            n nVar = this.f123677j;
            List<n0> listB = nVar.f123663o.b();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                p13.d0.v(linkedHashSet, ((n0) it.next()).i().b());
            }
            linkedHashSet.addAll(this.f123696b.f110085a.f110064n.e(nVar));
            return linkedHashSet;
        }

        @Override // n43.z
        public final Set<x33.f> p() {
            List<n0> listB = this.f123677j.f123663o.b();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                p13.d0.v(linkedHashSet, ((n0) it.next()).i().d());
            }
            return linkedHashSet;
        }

        @Override // n43.z
        public final boolean r(h0 h0Var) {
            return this.f123696b.f110085a.f110065o.a(this.f123677j, h0Var);
        }

        public final void s(x33.f fVar, b33.b bVar) {
            fVar.getClass();
            bVar.getClass();
            this.f123696b.f110085a.f110059i.getClass();
            this.f123677j.getClass();
            b33.a.C0220a c0220a = b33.a.C0220a.f15678a;
        }
    }

    public final class b extends p43.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o43.j<List<d1>> f123678c;

        public b() {
            super(n.this.f123661m.f110085a.f110051a);
            this.f123678c = n.this.f123661m.f110085a.f110051a.g(new o(n.this));
        }

        @Override // p43.m1
        public final boolean C() {
            return true;
        }

        @Override // p43.n
        public final Collection<n0> d() {
            String strB;
            x33.c cVarA;
            n nVar = n.this;
            s33.c cVar = nVar.f123654f;
            l43.p pVar = nVar.f123661m;
            List<s33.s> listJ = u33.g.j(cVar, pVar.f110088d);
            ArrayList arrayList = new ArrayList(p13.y.r(listJ, 10));
            Iterator<T> it = listJ.iterator();
            while (it.hasNext()) {
                arrayList.add(pVar.f110092h.g((s33.s) it.next()));
            }
            ArrayList arrayListC0 = p13.h0.C0(arrayList, pVar.f110085a.f110064n.c(nVar));
            ArrayList<t23.g0.b> arrayList2 = new ArrayList();
            Iterator it3 = arrayListC0.iterator();
            while (it3.hasNext()) {
                t23.h hVarT = ((n0) it3.next()).F0().t();
                t23.g0.b bVar = hVarT instanceof t23.g0.b ? (t23.g0.b) hVarT : null;
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                l43.w wVar = pVar.f110085a.f110058h;
                ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList2, 10));
                for (t23.g0.b bVar2 : arrayList2) {
                    x33.b bVarF = f43.e.f(bVar2);
                    if (bVarF == null || (cVarA = bVarF.a()) == null || (strB = cVarA.f188596a.f188600a) == null) {
                        strB = bVar2.getName().b();
                        strB.getClass();
                    }
                    arrayList3.add(strB);
                }
                wVar.a(nVar, arrayList3);
            }
            return p13.h0.b1(arrayListC0);
        }

        @Override // p43.m1
        public final List<d1> getParameters() {
            return this.f123678c.invoke();
        }

        @Override // p43.n
        public final b1 h() {
            return b1.a.f161998a;
        }

        @Override // p43.b
        /* JADX INFO: renamed from: m */
        public final t23.e t() {
            return n.this;
        }

        @Override // p43.b, p43.m1
        public final t23.h t() {
            return n.this;
        }

        public final String toString() {
            String str = n.this.getName().f188605a;
            str.getClass();
            return str;
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f123680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o43.i<x33.f, t23.e> f123681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o43.j<Set<x33.f>> f123682c;

        public c() {
            List<s33.h> list = n.this.f123654f.f156541v;
            list.getClass();
            int iA = t0.a(p13.y.r(list, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
            for (Object obj : list) {
                linkedHashMap.put(x33.f.d(n.this.f123661m.f110086b.getString(((s33.h) obj).f156648d)), obj);
            }
            this.f123680a = linkedHashMap;
            n nVar = n.this;
            this.f123681b = nVar.f123661m.f110085a.f110051a.h(new p(this, nVar));
            this.f123682c = n.this.f123661m.f110085a.f110051a.g(new q(this));
        }
    }

    public static final /* synthetic */ class d extends p005kotlin.jvm.internal.q implements e23.l<q43.f, a> {
        public d(Object obj) {
            super(1, obj, a.class, "<init>", "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V", 0);
        }

        @Override // e23.l
        public final a invoke(q43.f fVar) {
            q43.f fVar2 = fVar;
            fVar2.getClass();
            return new a((n) this.receiver, fVar2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l43.p pVar, s33.c cVar, u33.d dVar, u33.a aVar, y0 y0Var) {
        t23.f fVar;
        i43.m rVar;
        u23.h l0Var;
        super(pVar.f110085a.f110051a, l43.m0.a(dVar, cVar.f156526e).f());
        pVar.getClass();
        cVar.getClass();
        dVar.getClass();
        aVar.getClass();
        y0Var.getClass();
        this.f123654f = cVar;
        this.f123655g = aVar;
        this.f123656h = y0Var;
        this.f123657i = l43.m0.a(dVar, cVar.f156526e);
        p0 p0Var = p0.f110094a;
        s33.l lVar = (s33.l) u33.b.f168299e.d(cVar.f156525d);
        p0Var.getClass();
        this.f123658j = p0.a(lVar);
        this.f123659k = q0.a(p0Var, (s33.z) u33.b.f168298d.d(cVar.f156525d));
        s33.c.EnumC2957c enumC2957c = (s33.c.EnumC2957c) u33.b.f168300f.d(cVar.f156525d);
        switch (enumC2957c == null ? -1 : p0.a.f110096b[enumC2957c.ordinal()]) {
            case 1:
                fVar = t23.f.CLASS;
                break;
            case 2:
                fVar = t23.f.INTERFACE;
                break;
            case 3:
                fVar = t23.f.ENUM_CLASS;
                break;
            case 4:
                fVar = t23.f.ENUM_ENTRY;
                break;
            case 5:
                fVar = t23.f.ANNOTATION_CLASS;
                break;
            case 6:
            case 7:
                fVar = t23.f.OBJECT;
                break;
            default:
                fVar = t23.f.CLASS;
                break;
        }
        this.f123660l = fVar;
        List<s33.u> list = cVar.f156528g;
        list.getClass();
        s33.v vVar = cVar.C;
        vVar.getClass();
        u33.h hVar = new u33.h(vVar);
        u33.j.a aVar2 = u33.j.f168343b;
        s33.y yVar = cVar.E;
        yVar.getClass();
        aVar2.getClass();
        l43.p pVarA = pVar.a(this, list, dVar, hVar, u33.j.a.a(yVar), aVar);
        l43.n nVar = pVarA.f110085a;
        o43.n nVar2 = nVar.f110051a;
        this.f123661m = pVarA;
        boolean zBooleanValue = u33.b.f168307m.d(cVar.f156525d).booleanValue();
        t23.f fVar2 = t23.f.ENUM_CLASS;
        if (fVar == fVar2) {
            rVar = new i43.r(nVar2, this, zBooleanValue || p005kotlin.jvm.internal.s.g(nVar.f110069s.a(), Boolean.TRUE));
        } else {
            rVar = i43.l.b.f91061b;
        }
        this.f123662n = rVar;
        this.f123663o = new b();
        w0.a aVar3 = w0.f162069e;
        q43.f fVarB = nVar.f110067q.b();
        d dVar2 = new d(this);
        aVar3.getClass();
        nVar2.getClass();
        fVarB.getClass();
        this.f123664p = new w0<>(this, nVar2, dVar2, fVarB, null);
        this.f123665q = fVar == fVar2 ? new c() : null;
        t23.l lVar2 = pVar.f110087c;
        this.f123666r = lVar2;
        this.f123667t = nVar2.a(new n43.d(this));
        this.f123668v = nVar2.g(new e(this));
        this.f123669w = nVar2.a(new f(this));
        nVar2.g(new g(this));
        this.f123670x = nVar2.a(new h(this));
        u33.d dVar3 = pVarA.f110086b;
        u33.h hVar2 = pVarA.f110088d;
        n nVar3 = lVar2 instanceof n ? (n) lVar2 : null;
        this.f123671y = new o0.a(cVar, dVar3, hVar2, y0Var, nVar3 != null ? nVar3.f123671y : null);
        if (u33.b.f168297c.d(cVar.f156525d).booleanValue()) {
            l0Var = new l0(nVar2, new i(this));
        } else {
            u23.h.f168226x0.getClass();
            l0Var = u23.h.a.f168228b;
        }
        this.f123672z = l0Var;
    }

    public final a E0() {
        return (a) this.f123664p.a(this.f123661m.f110085a.f110067q.b());
    }

    public final v0 F0(x33.f fVar) {
        Iterator<T> it = E0().a(fVar, b33.b.FROM_DESERIALIZATION).iterator();
        boolean z14 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z14) {
                    break;
                }
                break;
            }
            Object next = it.next();
            if (((r0) next).I() == null) {
                if (!z14) {
                    z14 = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        r0 r0Var = (r0) obj;
        return (v0) (r0Var != null ? r0Var.getType() : null);
    }

    @Override // t23.e
    public final h1<v0> J() {
        return this.f123670x.invoke();
    }

    @Override // w23.e0
    public final i43.l N(q43.f fVar) {
        fVar.getClass();
        return this.f123664p.a(fVar);
    }

    @Override // t23.z
    public final boolean O() {
        return u33.b.f168304j.d(this.f123654f.f156525d).booleanValue();
    }

    @Override // t23.e
    public final i43.l P() {
        return this.f123662n;
    }

    @Override // t23.e
    public final boolean U() {
        return u33.b.f168302h.d(this.f123654f.f156525d).booleanValue();
    }

    @Override // t23.l
    public final t23.l d() {
        return this.f123666r;
    }

    @Override // t23.e, t23.z
    public final t23.a0 g() {
        return this.f123658j;
    }

    @Override // u23.a
    public final u23.h getAnnotations() {
        return this.f123672z;
    }

    @Override // t23.e
    public final t23.f getKind() {
        return this.f123660l;
    }

    @Override // t23.m
    public final y0 getSource() {
        return this.f123656h;
    }

    @Override // t23.e, t23.z, t23.o
    public final t23.r getVisibility() {
        return this.f123659k;
    }

    @Override // t23.h
    public final m1 h() {
        return this.f123663o;
    }

    @Override // t23.z
    public final boolean isExternal() {
        return u33.b.f168303i.d(this.f123654f.f156525d).booleanValue();
    }

    @Override // t23.e
    public final boolean isInline() {
        if (!u33.b.f168305k.d(this.f123654f.f156525d).booleanValue()) {
            return false;
        }
        u33.a aVar = this.f123655g;
        int i14 = aVar.f168291b;
        if (i14 >= 1) {
            if (i14 > 1) {
                return false;
            }
            int i15 = aVar.f168292c;
            if (i15 >= 4 && (i15 > 4 || aVar.f168293d > 1)) {
                return false;
            }
        }
        return true;
    }

    @Override // t23.e
    public final boolean k() {
        return u33.b.f168305k.d(this.f123654f.f156525d).booleanValue() && this.f123655g.a(1, 4, 2);
    }

    @Override // t23.i
    public final boolean l() {
        return u33.b.f168301g.d(this.f123654f.f156525d).booleanValue();
    }

    @Override // t23.e
    public final Collection<t23.d> n() {
        return this.f123668v.invoke();
    }

    @Override // t23.e, t23.i
    public final List<d1> q() {
        return this.f123661m.f110092h.b();
    }

    @Override // t23.z
    public final boolean q0() {
        return false;
    }

    @Override // w23.b, t23.e
    public final List<u0> r0() {
        l43.p pVar = this.f123661m;
        List<s33.s> listA = u33.g.a(this.f123654f, pVar.f110088d);
        ArrayList arrayList = new ArrayList(p13.y.r(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            n0 n0VarG = pVar.f110092h.g((s33.s) it.next());
            u0 u0VarK0 = k0();
            j43.b bVar = new j43.b(this, n0VarG, null, null);
            u23.h.f168226x0.getClass();
            arrayList.add(new w23.q0(u0VarK0, bVar, u23.h.a.f168228b));
        }
        return arrayList;
    }

    @Override // t23.e
    public final t23.d s() {
        return this.f123667t.invoke();
    }

    @Override // t23.e
    public final boolean s0() {
        return u33.b.f168300f.d(this.f123654f.f156525d) == s33.c.EnumC2957c.COMPANION_OBJECT;
    }

    @Override // t23.e
    public final boolean t0() {
        return u33.b.f168306l.d(this.f123654f.f156525d).booleanValue();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("deserialized ");
        sb3.append(O() ? "expect " : "");
        sb3.append("class ");
        sb3.append(getName());
        return sb3.toString();
    }

    @Override // t23.e
    public final t23.e u0() {
        return this.f123669w.invoke();
    }
}
