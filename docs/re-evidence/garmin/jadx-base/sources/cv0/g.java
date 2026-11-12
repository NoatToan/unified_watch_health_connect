package cv0;

import am.i1;
import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import h4.k;
import h4.r;
import h5.e0;
import i3.e5;
import l72.p2;
import lc.u0;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.x1;
import p5.v;

/* JADX INFO: loaded from: classes9.dex */
public final class g {
    public static final void a(ge2.b bVar, boolean z14, l lVar, m mVar, int i14) {
        o0 o0Var;
        Object next;
        String strQ;
        char c14;
        int i15;
        String strQ2;
        lVar.getClass();
        o0 o0VarE = mVar.E(959304269);
        int i16 = i14 | (o0VarE.k(bVar == null ? -1 : bVar.ordinal()) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        boolean z15 = false;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            w13.c cVar = ge2.b.f77015f;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (((ge2.b) next) != bVar);
            ge2.b bVar2 = (ge2.b) next;
            int iIndexOf = bVar2 != null ? cVar.indexOf(bVar2) : -1;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = e5.o(iIndexOf, o0VarE);
            }
            n1 n1Var = (n1) objQ;
            boolean zR = ((i16 & 896) == 256) | o0VarE.r(cVar);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new ci0.b(lVar, 3, cVar, n1Var);
                o0VarE.K(objQ2);
            }
            l lVar2 = (l) objQ2;
            r.a aVar = r.S;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(449379632);
            p13.c.b bVar4 = new p13.c.b();
            int i17 = 0;
            while (bVar4.hasNext()) {
                Object next2 = bVar4.next();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    x.q();
                    throw null;
                }
                ge2.b bVar5 = (ge2.b) next2;
                boolean z16 = n1Var.getIntValue() == i17 ? true : z15;
                n1 n1Var2 = n1Var;
                p2 p2Var = p2.f111205a;
                r rVarF = x2.f(r.S, 1.0f);
                boolean zH = o0VarE.h(z16);
                Object objQ3 = o0VarE.q();
                if (zH || objQ3 == m.a.f135155b) {
                    objQ3 = new a81.j(z16, 11);
                    o0VarE.K(objQ3);
                }
                r rVarC2 = v.c((l) objQ3, rVarF, z15);
                ge2.b bVar6 = ge2.b.Everyone;
                if (bVar5 == bVar6 && z14) {
                    strQ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -2023344137, R.string.lbl_anyone_with_access_code, o0VarE, z15);
                } else {
                    o0VarE.C(-2023342297);
                    strQ = gl1.y.Q(o0VarE, lv0.c.a(bVar5));
                    o0VarE.g0(z15);
                }
                if (bVar5 == bVar6 && z14) {
                    strQ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -2023338206, R.string.lbl_visible_to_anyone_with_access_code, o0VarE, z15);
                    c14 = 2;
                } else {
                    o0VarE.C(-2023336026);
                    bVar5.getClass();
                    int i19 = lv0.c.a.f115045a[bVar5.ordinal()];
                    if (i19 != 1) {
                        c14 = 2;
                        if (i19 != 2) {
                            u0.r();
                            return;
                        }
                        i15 = R.string.lbl_visible_to_public_add_access_code;
                    } else {
                        c14 = 2;
                        i15 = R.string.privacy_only_me_description;
                    }
                    strQ2 = gl1.y.Q(o0VarE, i15);
                    o0VarE.g0(z15);
                }
                z3.e eVarC = z3.f.c(-73930442, new an1.i(z16, 10), o0VarE);
                boolean zB = o0VarE.B(lVar2) | o0VarE.k(i17);
                Object objQ4 = o0VarE.q();
                if (zB || objQ4 == m.a.f135155b) {
                    objQ4 = new au0.m(lVar2, i17, 5);
                    o0VarE.K(objQ4);
                }
                o0 o0Var2 = o0VarE;
                p2Var.h(strQ, strQ2, null, rVarC2, null, false, false, null, eVarC, null, (e23.a) objQ4, o0Var2, 100663296, 0, 756);
                z15 = false;
                o0VarE = o0Var2;
                i17 = i18;
                lVar2 = lVar2;
                bVar4 = bVar4;
                n1Var = n1Var2;
            }
            o0Var = o0VarE;
            o0Var.g0(z15);
            o0Var.g0(true);
            x1 x1Var3 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i1(bVar, z14, lVar, i14, 8);
        }
    }
}
