package sg0;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import java.util.List;
import l72.p2;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.x1;
import u1.a2;
import v62.p9;

/* JADX INFO: loaded from: classes8.dex */
public final class y0 {
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    public static final void a(ue0.l lVar, e23.l<? super ue0.l, Unit> lVar2, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1932971593);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(lVar) : o0VarE.r(lVar) ? 4 : 2) | i14 | (o0VarE.r(lVar2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            z3.e eVarC = z3.f.c(-1061980196, new u0(lVar, 0), o0VarE);
            p2 p2Var = p2.f111205a;
            String fullName = lVar.getFullName();
            if (fullName == null) {
                fullName = "";
            }
            boolean z14 = ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.r(lVar))) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new v0(lVar2, lVar, 0);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new v0(lVar2, lVar, 0);
                    o0VarE.K(objQ);
                }
            }
            p2Var.g(fullName, null, null, eVarC, null, false, false, (e23.a) objQ, o0VarE, 3072, 246);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(lVar, lVar2, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x015d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0293  */
    public static final void b(List list, o0 o0Var, o0 o0Var2, nw0.n nVar, p3.m mVar, int i14) {
        boolean z14;
        Object obj = nVar;
        p3.o0 o0VarE = mVar.E(926256916);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.r(o0Var) ? 32 : 16) | (o0VarE.r(obj) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1043) != 1042)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(x2.d(aVar, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            c2.z zVarA = c2.y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            h4.r rVarB = a2.b(c2.b0.f22601a.a(x2.f(aVar, 1.0f), 1.0f, true), a2.a(o0VarE), true);
            d92.b.f58625c.getClass();
            h4.r rVarA = c2.l.A(rVarB, 0.0f, j92.b.f97899b.f97920e, 1);
            c2.z zVarA2 = c2.y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarA, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            p3.m.a aVar4 = p3.m.f135153a;
            if (list == null) {
                o0VarE.C(-1364751721);
                z14 = false;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1364751720);
                int size = list.size();
                for (int i16 = 0; i16 < size; i16++) {
                    ue0.l lVar = (ue0.l) list.get(i16);
                    boolean z15 = (i15 & 112) == 32;
                    Object objQ = o0VarE.q();
                    if (z15) {
                        objQ = new s70.b0(o0Var, 8);
                        o0VarE.K(objQ);
                    } else {
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new s70.b0(o0Var, 8);
                            o0VarE.K(objQ);
                        }
                    }
                    a(lVar, (e23.l) objQ, o0VarE, ue0.l.f170195n);
                }
                z14 = false;
                o0VarE.g0(false);
                Unit unit = Unit.INSTANCE;
            }
            h4.r.a aVar5 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97916a;
            float f15 = eVar2.f97920e;
            h4.r rVarC3 = c2.l.C(aVar5, 0.0f, f14, 0.0f, 0.0f, 13);
            bVar2.getClass();
            h4.r rVarA2 = c2.l.A(rVarC3, f15, 0.0f, 2);
            String strQ = gl1.y.Q(o0VarE, R.string.msg_manage_family);
            d92.b.f58624b.getClass();
            mh.c(strQ, rVarA2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            h4.r rVarE2 = u1.n.e(x2.f(aVar5, 1.0f), p6.b.b(o0VarE), m1.f128891a);
            bVar2.getClass();
            h4.r rVarY = c2.l.y(rVarE2, f15);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC4 = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar6 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA2, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC4, o0VarE);
            c2.u uVar = c2.u.f22885a;
            l72.f0 f0Var = l72.f0.f110999a;
            h4.r rVarF = x2.f(aVar5, 1.0f);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_add_child_account);
            boolean z16 = (i15 & 7168) == 2048;
            Object objQ2 = o0VarE.q();
            if (z16) {
                obj = nVar;
                objQ2 = new ro0.g(obj, 28);
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    obj = nVar;
                    objQ2 = new ro0.g(obj, 28);
                    o0VarE.K(objQ2);
                } else {
                    obj = nVar;
                }
            }
            f0Var.d(384, 9, (e23.a) objQ2, rVarF, strQ2, o0VarE, null, false);
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new qy0.d(list, o0Var, o0Var2, obj, i14, 26);
        }
    }

    public static final void c(nw0.n nVar, String str, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1459618754);
        int i15 = (o0VarE.r(nVar) ? 4 : 2) | i14 | (o0VarE.B(str) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            s62.a.f157643a.getClass();
            b82.y0.c(2131230997, p9.a(t62.b.f162798a), gl1.y.Q(o0VarE, R.string.lbl_no_accounts_added), gl1.y.P(R.string.msg_no_accounts_added, new Object[]{str}, o0VarE), gl1.y.Q(o0VarE, R.string.lbl_add_child_account), nVar, null, o0VarE, (i15 << 15) & 458752, 64);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rk0.a1(nVar, str, false, i14, 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(e1 e1Var, rk0.y yVar, o0 o0Var, nw0.n nVar, o0 o0Var2, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1541214212);
        int i15 = i14 | (o0VarE.r(e1Var) ? 4 : 2) | (o0VarE.r(yVar) ? 32 : 16) | (o0VarE.r(o0Var) ? 256 : 128) | (o0VarE.r(nVar) ? 2048 : 1024) | (o0VarE.r(o0Var2) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(r53.s.d(e1Var.f159076d), o0VarE);
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(e1Var);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new x0(e1Var, null);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new x0(e1Var, null);
                    o0VarE.K(objQ);
                }
            }
            p3.l0.e((e23.p) objQ, unit, o0VarE);
            z02.d.a(((z0) p1VarC.getF182175a()).f159186b, z3.f.c(1576520735, new s5.a(yVar, 12), o0VarE), null, null, null, z3.f.c(-344491877, new ob0.e(e1Var, nVar, o0Var, o0Var2, p1VarC, 28), o0VarE), o0VarE, 196656, 28);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ob0.e((Object) e1Var, (Object) yVar, (Object) o0Var, (Object) nVar, (Object) o0Var2, i14, 29);
        }
    }
}
