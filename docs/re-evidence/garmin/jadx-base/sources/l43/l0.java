package l43;

import java.util.ArrayList;
import java.util.List;
import t23.d1;
import t23.j1;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f110046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f110047b;

    public l0(p pVar) {
        pVar.getClass();
        this.f110046a = pVar;
        n nVar = pVar.f110085a;
        this.f110047b = new g(nVar.f110052b, nVar.f110062l);
    }

    public final o0 a(t23.l lVar) {
        if (lVar instanceof t23.h0) {
            x33.c cVarC = ((t23.h0) lVar).c();
            p pVar = this.f110046a;
            return new o0.b(cVarC, pVar.f110086b, pVar.f110088d, pVar.f110091g);
        }
        if (lVar instanceof n43.n) {
            return ((n43.n) lVar).f123671y;
        }
        return null;
    }

    public final ArrayList b(List list, List list2, z33.g.d dVar, d dVar2) {
        u23.h l0Var;
        l0 l0Var2 = this;
        p pVar = l0Var2.f110046a;
        t23.a aVar = (t23.a) pVar.f110087c;
        t23.l lVarD = aVar.d();
        lVarD.getClass();
        o0 o0VarA = l0Var2.a(lVarD);
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            s33.s sVar = (s33.s) obj;
            s33.w wVar = (s33.w) p13.h0.e0(i14, list2);
            int i16 = (wVar == null || (wVar.f156974c & 1) != 1) ? 0 : wVar.f156975d;
            if (o0VarA == null || !u33.b.f168297c.d(i16).booleanValue()) {
                u23.h.f168226x0.getClass();
                l0Var = u23.h.a.f168228b;
            } else {
                l0Var = new n43.l0(pVar.f110085a.f110051a, new i0(l0Var2, o0VarA, dVar, dVar2, i14, wVar));
            }
            w23.q0 q0VarB = b43.h.b(aVar, pVar.f110092h.g(sVar), null, l0Var, i14);
            if (q0VarB != null) {
                arrayList.add(q0VarB);
            }
            l0Var2 = this;
            i14 = i15;
        }
        return arrayList;
    }

    public final u23.h c(z33.g.d dVar, int i14, d dVar2) {
        if (u33.b.f168297c.d(i14).booleanValue()) {
            return new n43.l0(this.f110046a.f110085a.f110051a, new e0(this, dVar, dVar2));
        }
        u23.h.f168226x0.getClass();
        return u23.h.a.f168228b;
    }

    public final u23.h d(s33.o oVar, boolean z14) {
        if (u33.b.f168297c.d(oVar.f156769d).booleanValue()) {
            return new n43.l0(this.f110046a.f110085a.f110051a, new f0(this, z14, oVar));
        }
        u23.h.f168226x0.getClass();
        return u23.h.a.f168228b;
    }

    public final n43.c e(s33.e eVar, boolean z14) {
        p pVar = this.f110046a;
        t23.e eVar2 = (t23.e) pVar.f110087c;
        int i14 = eVar.f156591d;
        d dVar = d.FUNCTION;
        n43.c cVar = new n43.c(eVar2, null, c(eVar, i14, dVar), z14, t23.b.a.DECLARATION, eVar, pVar.f110086b, pVar.f110088d, pVar.f110089e, pVar.f110091g, null, 1024, null);
        l0 l0Var = pVar.a(cVar, p13.j0.f134944a, pVar.f110086b, pVar.f110088d, pVar.f110089e, pVar.f110090f).f110093i;
        List<s33.w> list = eVar.f156592e;
        list.getClass();
        cVar.P0(l0Var.h(list, eVar, dVar), q0.a(p0.f110094a, (s33.z) u33.b.f168298d.d(eVar.f156591d)));
        cVar.M0(eVar2.p());
        cVar.f181736r = eVar2.O();
        cVar.f181741y = !u33.b.f168309o.d(eVar.f156591d).booleanValue();
        return cVar;
    }

    public final n43.h0 f(s33.j jVar) {
        int i14;
        u23.h aVar;
        u33.j jVar2;
        p43.n0 n0VarG;
        p pVar = this.f110046a;
        t23.l lVar = pVar.f110087c;
        u33.d dVar = pVar.f110086b;
        u33.h hVar = pVar.f110088d;
        jVar.getClass();
        if ((jVar.f156682c & 1) == 1) {
            i14 = jVar.f156683d;
        } else {
            int i15 = jVar.f156684e;
            i14 = ((i15 >> 8) << 6) + (i15 & 63);
        }
        d dVar2 = d.FUNCTION;
        u23.h hVarC = c(jVar, i14, dVar2);
        int i16 = jVar.f156682c;
        if ((i16 & 32) == 32 || (i16 & 64) == 64) {
            aVar = new n43.a(pVar.f110085a.f110051a, new g0(this, jVar, dVar2));
        } else {
            u23.h.f168226x0.getClass();
            aVar = u23.h.a.f168228b;
        }
        if (f43.e.g(lVar).a(x33.f.d(dVar.getString(jVar.f156685f))).equals(r0.f110102a)) {
            u33.j.f168343b.getClass();
            jVar2 = u33.j.f168344c;
        } else {
            jVar2 = pVar.f110089e;
        }
        x33.f fVarD = x33.f.d(dVar.getString(jVar.f156685f));
        p0 p0Var = p0.f110094a;
        u23.h hVar2 = aVar;
        int i17 = i14;
        n43.h0 h0Var = new n43.h0(lVar, null, hVarC, fVarD, q0.b(p0Var, (s33.k) u33.b.f168310p.d(i14)), jVar, dVar, hVar, jVar2, pVar.f110091g, null, 1024, null);
        List<s33.u> list = jVar.f156688i;
        list.getClass();
        p pVarA = pVar.a(h0Var, list, pVar.f110086b, pVar.f110088d, pVar.f110089e, pVar.f110090f);
        l0 l0Var = pVarA.f110093i;
        x0 x0Var = pVarA.f110092h;
        s33.s sVarF = u33.g.f(jVar, hVar);
        w23.q0 q0VarH = (sVarF == null || (n0VarG = x0Var.g(sVarF)) == null) ? null : b43.h.h(h0Var, n0VarG, hVar2);
        t23.l lVar2 = pVar.f110087c;
        t23.e eVar = lVar2 instanceof t23.e ? (t23.e) lVar2 : null;
        t23.u0 u0VarK0 = eVar != null ? eVar.k0() : null;
        List listB = u33.g.b(jVar, hVar);
        List list2 = jVar.f156694o;
        list2.getClass();
        ArrayList arrayListB = l0Var.b(listB, list2, jVar, dVar2);
        List<d1> listB2 = x0Var.b();
        List list3 = jVar.f156695p;
        list3.getClass();
        List listH = l0Var.h(list3, jVar, dVar2);
        p43.n0 n0VarG2 = x0Var.g(u33.g.h(jVar, hVar));
        t23.a0 a0VarA = p0.a((s33.l) u33.b.f168299e.d(i17));
        t23.p pVarA2 = q0.a(p0Var, (s33.z) u33.b.f168298d.d(i17));
        p13.k0 k0Var = p13.k0.f134949a;
        k0Var.getClass();
        h0Var.R0(q0VarH, u0VarK0, arrayListB, listB2, listH, n0VarG2, a0VarA, pVarA2, k0Var);
        h0Var.f181731m = u33.b.f168311q.d(i17).booleanValue();
        h0Var.f181732n = u33.b.f168312r.d(i17).booleanValue();
        h0Var.f181733o = u33.b.f168315u.d(i17).booleanValue();
        h0Var.f181734p = u33.b.f168313s.d(i17).booleanValue();
        h0Var.f181735q = u33.b.f168314t.d(i17).booleanValue();
        h0Var.f181740x = u33.b.f168316v.d(i17).booleanValue();
        h0Var.f181736r = u33.b.f168317w.d(i17).booleanValue();
        h0Var.f181741y = !u33.b.f168318x.d(i17).booleanValue();
        pVar.f110085a.f110063m.a(jVar, h0Var, hVar, x0Var);
        return h0Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0153  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [t23.e] */
    public final n43.g0 g(s33.o oVar, boolean z14) {
        int i14;
        u23.h hVarC;
        l0 l0Var;
        u23.h aVar;
        p0 p0Var;
        boolean z15;
        w23.o0 o0VarC;
        w23.o0 o0Var;
        o43.k<d43.g<?>> kVar;
        w23.p0 p0VarD;
        ?? r14;
        Object kind;
        t23.e eVar;
        p43.n0 n0VarG;
        p pVar = this.f110046a;
        t23.l lVar = pVar.f110087c;
        u33.d dVar = pVar.f110086b;
        u33.h hVar = pVar.f110088d;
        oVar.getClass();
        if ((oVar.f156768c & 1) == 1) {
            i14 = oVar.f156769d;
        } else {
            int i15 = oVar.f156770e;
            i14 = ((i15 >> 8) << 6) + (i15 & 63);
        }
        if (z14) {
            u23.h.a aVar2 = u23.h.f168226x0;
            List<s33.b> list = oVar.f156786w;
            list.getClass();
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            for (s33.b bVar : list) {
                bVar.getClass();
                arrayList.add(this.f110047b.a(bVar, dVar));
            }
            aVar2.getClass();
            hVarC = u23.h.a.a(arrayList);
        } else {
            hVarC = null;
        }
        if (hVarC == null) {
            hVarC = c(oVar, i14, d.PROPERTY);
        }
        p0 p0Var2 = p0.f110094a;
        u33.b.c cVar = u33.b.f168299e;
        s33.l lVar2 = (s33.l) cVar.d(i14);
        p0Var2.getClass();
        t23.a0 a0VarA = p0.a(lVar2);
        u33.b.c cVar2 = u33.b.f168298d;
        int i16 = i14;
        n43.g0 g0Var = new n43.g0(lVar, null, hVarC, a0VarA, q0.a(p0Var2, (s33.z) cVar2.d(i14)), u33.b.f168319y.d(i14).booleanValue(), x33.f.d(dVar.getString(oVar.f156771f)), q0.b(p0Var2, (s33.k) u33.b.f168310p.d(i14)), u33.b.C.d(i14).booleanValue(), u33.b.B.d(i14).booleanValue(), u33.b.E.d(i14).booleanValue(), u33.b.F.d(i14).booleanValue(), u33.b.G.d(i14).booleanValue(), oVar, dVar, hVar, pVar.f110089e, pVar.f110091g);
        List<s33.u> list2 = oVar.f156774i;
        list2.getClass();
        p pVarA = pVar.a(g0Var, list2, pVar.f110086b, pVar.f110088d, pVar.f110089e, pVar.f110090f);
        x0 x0Var = pVarA.f110092h;
        boolean zBooleanValue = u33.b.f168320z.d(i16).booleanValue();
        if (zBooleanValue) {
            int i17 = oVar.f156768c;
            if ((i17 & 32) == 32 || (i17 & 64) == 64) {
                l0Var = this;
                aVar = new n43.a(pVar.f110085a.f110051a, new g0(l0Var, oVar, d.PROPERTY_GETTER));
            } else {
                l0Var = this;
                u23.h.f168226x0.getClass();
                aVar = u23.h.a.f168228b;
            }
        } else {
            l0Var = this;
            u23.h.f168226x0.getClass();
            aVar = u23.h.a.f168228b;
        }
        p43.n0 n0VarG2 = x0Var.g(u33.g.i(oVar, hVar));
        List<d1> listB = x0Var.b();
        t23.l lVar3 = pVar.f110087c;
        t23.e eVar2 = lVar3 instanceof t23.e ? (t23.e) lVar3 : null;
        t23.u0 u0VarK0 = eVar2 != null ? eVar2.k0() : null;
        s33.s sVarG = u33.g.g(oVar, hVar);
        w23.q0 q0VarH = (sVarG == null || (n0VarG = x0Var.g(sVarG)) == null) ? null : b43.h.h(g0Var, n0VarG, aVar);
        l0 l0Var2 = pVarA.f110093i;
        List<s33.s> listC = u33.g.c(oVar, hVar);
        List<s33.w> list3 = oVar.f156780o;
        list3.getClass();
        d dVar2 = d.PROPERTY_GETTER;
        g0Var.K0(n0VarG2, listB, u0VarK0, q0VarH, l0Var2.b(listC, list3, oVar, dVar2));
        u33.b.c cVar3 = cVar;
        int iB = u33.b.b(u33.b.f168297c.d(i16).booleanValue(), (s33.z) cVar2.d(i16), (s33.l) cVar3.d(i16));
        if (zBooleanValue) {
            int i18 = (oVar.f156768c & 256) == 256 ? oVar.f156782q : iB;
            boolean zBooleanValue2 = u33.b.K.d(i18).booleanValue();
            boolean zBooleanValue3 = u33.b.L.d(i18).booleanValue();
            boolean zBooleanValue4 = u33.b.M.d(i18).booleanValue();
            u23.h hVarC2 = l0Var.c(oVar, i18, dVar2);
            if (zBooleanValue2) {
                p0Var = p0Var2;
                z15 = true;
                o0VarC = new w23.o0(g0Var, hVarC2, p0.a((s33.l) cVar3.d(i18)), q0.a(p0Var2, (s33.z) cVar2.d(i18)), !zBooleanValue2, zBooleanValue3, zBooleanValue4, g0Var.getKind(), null, t23.y0.f162076a);
            } else {
                p0Var = p0Var2;
                z15 = true;
                o0VarC = b43.h.c(hVarC2, g0Var);
            }
            o0VarC.G0(g0Var.getReturnType());
        } else {
            cVar3 = cVar3;
            l0Var = l0Var;
            p0Var = p0Var2;
            z15 = true;
            o0VarC = null;
        }
        if (u33.b.A.d(i16).booleanValue()) {
            if ((oVar.f156768c & 512) == 512) {
                iB = oVar.f156783r;
            }
            boolean zBooleanValue5 = u33.b.K.d(iB).booleanValue();
            boolean zBooleanValue6 = u33.b.L.d(iB).booleanValue();
            boolean zBooleanValue7 = u33.b.M.d(iB).booleanValue();
            d dVar3 = d.PROPERTY_SETTER;
            u23.h hVarC3 = l0Var.c(oVar, iB, dVar3);
            if (zBooleanValue5) {
                o0Var = o0VarC;
                w23.p0 p0Var3 = new w23.p0(g0Var, hVarC3, p0.a((s33.l) cVar3.d(iB)), q0.a(p0Var, (s33.z) cVar2.d(iB)), !zBooleanValue5, zBooleanValue6, zBooleanValue7, g0Var.getKind(), null, t23.y0.f162076a);
                j1 j1Var = (j1) p13.h0.I0(pVarA.a(p0Var3, p13.j0.f134944a, pVarA.f110086b, pVarA.f110088d, pVarA.f110089e, pVarA.f110090f).f110093i.h(p13.w.c(oVar.f156781p), oVar, dVar3));
                if (j1Var == null) {
                    w23.p0.y(6);
                    throw null;
                }
                p0Var3.f181696m = j1Var;
                p0VarD = p0Var3;
                kVar = null;
            } else {
                o0Var = o0VarC;
                kVar = null;
                u23.h.f168226x0.getClass();
                p0VarD = b43.h.d(g0Var, hVarC3, u23.h.a.f168228b);
            }
        } else {
            o0Var = o0VarC;
            kVar = null;
            p0VarD = null;
        }
        if (u33.b.D.d(i16).booleanValue()) {
            g0Var.E0(kVar, new c0(l0Var, oVar, g0Var));
        }
        if (lVar instanceof t23.e) {
            eVar = (t23.e) lVar;
        } else {
            r14 = kVar;
        }
        if (r14 != 0) {
            r14 = eVar;
            kind = r14.getKind();
        } else {
            r14 = eVar;
            kind = kVar;
        }
        if (kind == t23.f.ANNOTATION_CLASS) {
            g0Var.E0(kVar, new d0(l0Var, oVar, g0Var));
        }
        g0Var.I0(o0Var, p0VarD, new w23.u(l0Var.d(oVar, false), g0Var), new w23.u(l0Var.d(oVar, z15), g0Var));
        return g0Var;
    }

    public final List h(List list, z33.g.d dVar, d dVar2) {
        int i14;
        u23.h l0Var;
        l0 l0Var2 = this;
        p pVar = l0Var2.f110046a;
        u33.h hVar = pVar.f110088d;
        x0 x0Var = pVar.f110092h;
        t23.a aVar = (t23.a) pVar.f110087c;
        t23.l lVarD = aVar.d();
        lVarD.getClass();
        o0 o0VarA = l0Var2.a(lVarD);
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            p43.n0 n0VarG = null;
            if (i15 < 0) {
                p13.x.q();
                throw null;
            }
            s33.w wVar = (s33.w) obj;
            int i17 = (wVar.f156974c & 1) == 1 ? wVar.f156975d : 0;
            if (o0VarA == null || !u33.b.f168297c.d(i17).booleanValue()) {
                i14 = i15;
                u23.h.f168226x0.getClass();
                l0Var = u23.h.a.f168228b;
            } else {
                i14 = i15;
                l0Var = new n43.l0(pVar.f110085a.f110051a, new h0(l0Var2, o0VarA, dVar, dVar2, i14, wVar));
            }
            x33.f fVarD = x33.f.d(pVar.f110086b.getString(wVar.f156976e));
            p43.n0 n0VarG2 = x0Var.g(u33.g.k(wVar, hVar));
            boolean zBooleanValue = u33.b.H.d(i17).booleanValue();
            boolean zBooleanValue2 = u33.b.I.d(i17).booleanValue();
            boolean zBooleanValue3 = u33.b.J.d(i17).booleanValue();
            int i18 = wVar.f156974c;
            s33.s sVarA = (i18 & 16) == 16 ? wVar.f156979h : (i18 & 32) == 32 ? hVar.a(wVar.f156980i) : null;
            if (sVarA != null) {
                n0VarG = x0Var.g(sVarA);
            }
            t23.y0.a aVar2 = t23.y0.f162076a;
            aVar2.getClass();
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new w23.x0(aVar, null, i14, l0Var, fVarD, n0VarG2, zBooleanValue, zBooleanValue2, zBooleanValue3, n0VarG, aVar2));
            arrayList = arrayList2;
            i15 = i16;
            l0Var2 = this;
        }
        return p13.h0.b1(arrayList);
    }
}
