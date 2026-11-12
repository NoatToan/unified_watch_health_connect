package z50;

import c2.b0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import gl1.y;
import h4.r;
import h5.e0;
import i3.i7;
import i3.u;
import java.util.List;
import l72.p2;
import o4.m1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.w;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import ya0.f0;
import yg2.l0;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public static final void a(w20.b bVar, l<? super w20.b, Unit> lVar, m mVar, int i14) {
        o0 o0Var;
        lVar.getClass();
        o0 o0VarE = mVar.E(1309654490);
        int i15 = (o0VarE.k(bVar.ordinal()) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            p2 p2Var = p2.f111205a;
            String strQ = y.Q(o0VarE, R.string.lbl_direction);
            String strT = gl1.d.T(bVar.f181490a, o0VarE, 0);
            z3.e eVarC = z3.f.c(1574874253, new xk1.e(bVar, 27, lVar, p1Var), o0VarE);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new l0(p1Var, 26);
                o0VarE.K(objQ2);
            }
            o0Var = o0VarE;
            p2Var.h(strQ, strT, null, null, null, false, false, null, eVarC, null, (e23.a) objQ2, o0Var, 100663296, 6, 764);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xm0.h(bVar, lVar, i14, 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    public static final void b(boolean z14, l<? super Boolean, Unit> lVar, w20.b bVar, l<? super w20.b, Unit> lVar2, m mVar, int i14) {
        q13.b bVarB;
        o0 o0VarE = mVar.E(700236997);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.k(bVar.ordinal()) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            boolean zC = ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).c();
            boolean zH = o0VarE.h(zC);
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (zH) {
                bVarB = w.b();
                if (zC) {
                    bVarB.add(w20.b.TAILWIND);
                }
                bVarB.add(w20.b.NORTH);
                bVarB.add(w20.b.EAST);
                bVarB.add(w20.b.SOUTH);
                bVarB.add(w20.b.WEST);
                bVarB.add(w20.b.RANDOM);
                objQ = w.a(bVarB);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    bVarB = w.b();
                    if (zC) {
                        bVarB.add(w20.b.TAILWIND);
                    }
                    bVarB.add(w20.b.NORTH);
                    bVarB.add(w20.b.EAST);
                    bVarB.add(w20.b.SOUTH);
                    bVarB.add(w20.b.WEST);
                    bVarB.add(w20.b.RANDOM);
                    objQ = w.a(bVarB);
                    o0VarE.K(objQ);
                }
            }
            List list = (List) objQ;
            r.a aVar2 = r.S;
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new f0(lVar, 24);
                o0VarE.K(objQ2);
            }
            r rVarD = u1.w.d(aVar2, false, null, null, (e23.a) objQ2, 15);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            b3.b.a aVar4 = b3.b.a.f15503a;
            u4.d dVarA = d3.c.a();
            String strQ = y.Q(o0VarE, R.string.lbl_more);
            long jD = ds.e0.d(d92.b.f58623a, o0VarE);
            d92.b.f58625c.getClass();
            i7.b(dVarA, strQ, x2.q(aVar2, j92.b.f97901d.f97905d), jD, o0VarE, 0, 0);
            Object objQ3 = o0VarE.q();
            aVar.getClass();
            if (objQ3 == c2565a) {
                objQ3 = new f0(lVar, 25);
                o0VarE.K(objQ3);
            }
            o0VarE = o0VarE;
            u.a(z14, (e23.a) objQ3, u1.n.e(aVar2, v.h.t(o0VarE), m1.f128891a), 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(1093297098, new vd0.f0(list, bVar, lVar, lVar2, 12), o0VarE), o0VarE, i15 & 14, 48, 2040);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x72.m(z14, lVar, bVar, lVar2, i14);
        }
    }
}
