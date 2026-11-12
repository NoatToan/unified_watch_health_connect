package jy0;

import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import l72.r1;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.a2;

/* JADX INFO: loaded from: classes9.dex */
public final class k {
    /* JADX WARN: Code duplicated, block: B:52:0x0110  */
    public static final void a(k30.n nVar, e23.l<? super k30.m, Unit> lVar, e23.l<? super i53.c<k30.o>, Unit> lVar2, p3.m mVar, int i14) {
        int i15;
        nVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-894508864);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(nVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar2) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarB = a2.b(h4.r.S, a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            r1.b(gl1.y.Q(o0VarE, R.string.title_sort_by), z3.f.c(1519051279, new j30.f(nVar, lVar, 2), o0VarE), o0VarE, 48, 0);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_filter_by);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_select_all);
            boolean z14 = ((i15 & 14) == 4) | ((i15 & 896) == 256);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new j30.g(nVar, lVar2, 1);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new j30.g(nVar, lVar2, 1);
                    o0VarE.K(objQ);
                }
            }
            r1.c(strQ, strQ2, (e23.a) objQ, false, null, z3.f.c(-528477708, new j30.f(nVar, lVar2, 3), o0VarE), o0VarE, 196608, 24);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h82.p(nVar, lVar, lVar2, i14, 24);
        }
    }

    public static final void b(int i14, e23.a aVar, String str, p3.m mVar, boolean z14) {
        String str2;
        o0 o0VarE = mVar.E(1608418157);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        byte b14 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (z14) {
                o0VarE.C(1730299800);
                str2 = str + StringUtils.SPACE + gl1.y.Q(o0VarE, R.string.selected);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1730365024);
                o0VarE.g0(false);
                str2 = str;
            }
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, str2);
            b92.a aVarB = c0235a.b();
            l72.p2 p2Var = l72.p2.f111205a;
            z3.e eVarC = z3.f.c(-3074302, new j30.d(z14, 3, b14), o0VarE);
            int i16 = b92.a.f16960b;
            p2Var.g(str, null, aVarB, null, eVarC, false, false, aVar, o0VarE, (i15 & 14) | 24576 | ((i15 << 18) & 234881024), 234);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new af1.g(str, z14, aVar, i14, 10);
        }
    }
}
