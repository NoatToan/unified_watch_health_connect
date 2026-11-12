package ta0;

import c2.x2;
import ca0.t1;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 {
    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ec  */
    public static final void a(x xVar, String str, l90.k kVar, t1 t1Var, e23.a aVar, e23.l lVar, p3.m mVar, int i14) {
        t4.d dVarA;
        xVar.getClass();
        str.getClass();
        kVar.getClass();
        aVar.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(-1363411435);
        int i15 = i14 | (o0VarE.r(xVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(kVar) ? 256 : 128) | (o0VarE.r(t1Var) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Integer num = kVar.f111582f.f111531p.f58437c.f58412a;
            if (num == null) {
                o0VarE.C(116069124);
                o0VarE.g0(false);
                dVarA = null;
            } else {
                o0VarE.C(116069125);
                dVarA = n5.c.a(num.intValue(), o0VarE, 0);
                o0VarE.g0(false);
            }
            boolean zR = ((i15 & 7168) == 2048) | o0VarE.r(xVar) | o0VarE.r(kVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new sg0.j(xVar, 17, kVar, t1Var);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new sg0.j(xVar, 17, kVar, t1Var);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            boolean zR2 = o0VarE.r(xVar) | ((57344 & i15) == 16384);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new s(aVar, xVar);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new s(aVar, xVar);
                    o0VarE.K(objQ2);
                }
            }
            b(str, dVarA, lVar, aVar3, (e23.a) objQ2, o0VarE, ((i15 >> 3) & 14) | ((i15 >> 9) & 896));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0(xVar, str, kVar, t1Var, aVar, lVar, i14, 0);
        }
    }

    public static final void b(String str, t4.d dVar, e23.l lVar, e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-250751630);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            o0Var = o0VarE;
            da0.p.a("device_discovery_device_passkey_confirm_screen", gl1.y.Q(o0VarE, R.string.lbl_yes), aVar, false, gl1.y.Q(o0VarE, R.string.lbl_no), aVar2, false, false, null, null, z3.f.c(-922876821, new ng2.i(dVar, 26, str, lVar), o0VarE), o0Var, ((i15 >> 3) & 896) | 6 | ((i15 << 3) & 458752), 100663296, 262088);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e(str, dVar, lVar, aVar, aVar2, i14, 19);
        }
    }

    public static final void c(String str, t4.d dVar, h4.r rVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(165168147);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(dVar) ? 32 : 16) | (o0VarE.B(rVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarY = x2.y(x2.f(rVar, 1.0f), null, 3);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            u1.y0.a(dVar, gl1.y.Q(o0VarE, R.string.default_image_view_content_description), null, null, null, 0.0f, null, o0VarE, (i15 >> 3) & 14, 124);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarA = s5.x0.a(j92.f.f97931h, d92.b.a(o0VarE).k().c(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
            d6.h.f57752b.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarA, o0VarE, i15 & 14, 0, 130046);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rx1.u(str, dVar, rVar, i14, 26);
        }
    }
}
