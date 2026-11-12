package i3;

import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class kc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f88702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s1.b2 f88703b;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f88702a = 22;
        f88703b = s1.l.d(300, 0, s1.e0.f155560a, 2);
    }

    public static final void a(c2.a0 a0Var, z3.e eVar, p3.m mVar, int i14) {
        z3.e eVar2;
        p3.o0 o0VarE = mVar.E(1033612924);
        if (o0VarE.n(i14 & 1, (i14 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i15 = l3.n1.f109367b;
            String strH = l3.k.h(o0VarE, R.string.m3c_bottom_sheet_drag_handle_description);
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            h4.r rVarB = a0Var.b(aVar, h4.d.a.f81537o);
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            p3.b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            vi viVar = vi.f90035a;
            ti.f89828b.getClass();
            int i16 = ti.f89829c;
            viVar.getClass();
            eVar2 = eVar;
            ej.b(vi.a(i16, o0VarE, 390), z3.f.c(2059851063, new jc(strH), o0VarE), ej.d(0, 7, o0VarE, false), null, false, eVar2, o0VarE, 100663344, 248);
            o0VarE.g0(true);
        } else {
            eVar2 = eVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fn1.o(a0Var, eVar2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    /* JADX WARN: Code duplicated, block: B:56:0x0103  */
    public static final mc b(boolean z14, e23.l lVar, pc pcVar, boolean z15, p3.m mVar, int i14, int i15) {
        Object obj;
        Object obj2;
        final int i16 = 0;
        boolean z16 = (i15 & 1) != 0 ? false : z14;
        boolean z17 = (i15 & 8) != 0 ? false : z15;
        f0 f0Var = f0.f88041a;
        f0Var.getClass();
        final float f14 = f0.f88044d;
        f0Var.getClass();
        final float f15 = f0.f88045e;
        p3.x1 x1Var = p3.n.f135158a;
        final g6.c cVar = (g6.c) mVar.A(kotlin.t1.f91490h);
        boolean zB = mVar.B(cVar) | mVar.i(f14);
        Object objQ = mVar.q();
        p3.m.a aVar = p3.m.f135153a;
        if (zB) {
            obj = objQ;
            Object obj3 = new e23.a() { // from class: i3.gc
                @Override // e23.a
                public final Object invoke() {
                    float fS0;
                    switch (i16) {
                        case 0:
                            fS0 = cVar.s0(f14);
                            break;
                        default:
                            fS0 = cVar.s0(f14);
                            break;
                    }
                    return Float.valueOf(fS0);
                }
            };
            mVar.K(obj3);
            obj = obj3;
        } else {
            aVar.getClass();
            if (objQ == p3.m.a.f135155b) {
                obj = objQ;
                Object obj4 = new e23.a() { // from class: i3.gc
                    @Override // e23.a
                    public final Object invoke() {
                        float fS0;
                        switch (i16) {
                            case 0:
                                fS0 = cVar.s0(f14);
                                break;
                            default:
                                fS0 = cVar.s0(f14);
                                break;
                        }
                        return Float.valueOf(fS0);
                    }
                };
                mVar.K(obj4);
                obj = obj4;
            }
        }
        obj = objQ;
        e23.a aVar2 = (e23.a) obj;
        boolean zB2 = mVar.B(cVar) | mVar.i(f15);
        Object objQ2 = mVar.q();
        final int i17 = 1;
        if (zB2) {
            obj2 = objQ2;
            Object obj5 = new e23.a() { // from class: i3.gc
                @Override // e23.a
                public final Object invoke() {
                    float fS0;
                    switch (i17) {
                        case 0:
                            fS0 = cVar.s0(f15);
                            break;
                        default:
                            fS0 = cVar.s0(f15);
                            break;
                    }
                    return Float.valueOf(fS0);
                }
            };
            mVar.K(obj5);
            obj2 = obj5;
        } else {
            aVar.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                obj2 = objQ2;
                Object obj6 = new e23.a() { // from class: i3.gc
                    @Override // e23.a
                    public final Object invoke() {
                        float fS0;
                        switch (i17) {
                            case 0:
                                fS0 = cVar.s0(f15);
                                break;
                            default:
                                fS0 = cVar.s0(f15);
                                break;
                        }
                        return Float.valueOf(fS0);
                    }
                };
                mVar.K(obj6);
                obj2 = obj6;
            }
        }
        obj2 = objQ2;
        e23.a aVar3 = (e23.a) obj2;
        Object[] objArr = {Boolean.valueOf(z16), lVar, Boolean.valueOf(z17)};
        mc.f88991h.getClass();
        ho2.o oVar = new ho2.o(19);
        bm.f fVar = new bm.f(z16, aVar2, aVar3, lVar, z17);
        d4.l lVar2 = d4.m.f57455a;
        d4.l lVar3 = new d4.l(oVar, fVar);
        int i18 = (((((i14 & 14) ^ 6) <= 4 || !mVar.h(z16)) && (i14 & 6) != 4) ? 0 : 1) | (mVar.B(aVar2) ? 1 : 0) | (mVar.B(aVar3) ? 1 : 0) | (((((i14 & 896) ^ 384) <= 256 || !mVar.k(pcVar.ordinal())) && (i14 & 384) != 256) ? 0 : 1) | (((((i14 & 112) ^ 48) <= 32 || !mVar.B(lVar)) && (i14 & 48) != 32) ? 0 : 1);
        if ((((i14 & 7168) ^ 3072) <= 2048 || !mVar.h(z17)) && (i14 & 3072) != 2048) {
            i17 = 0;
        }
        int i19 = i18 | i17;
        Object objQ3 = mVar.q();
        if (i19 == 0) {
            aVar.getClass();
            if (objQ3 == p3.m.a.f135155b) {
                Object wVar = new a11.w(z16, aVar2, aVar3, pcVar, lVar, z17);
                mVar.K(wVar);
                objQ3 = wVar;
            }
        } else {
            Object wVar2 = new a11.w(z16, aVar2, aVar3, pcVar, lVar, z17);
            mVar.K(wVar2);
            objQ3 = wVar2;
        }
        return (mc) d4.a.c(objArr, lVar3, (e23.a) objQ3, mVar, 0);
    }
}
