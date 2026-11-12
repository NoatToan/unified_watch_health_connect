package jt1;

import androidx.room.a0;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import h5.e0;
import l72.f0;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class n {
    /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:48:0x0133  */
    public static final void a(r rVar, e23.l lVar, e23.a aVar, p3.m mVar, int i14) {
        o0 o0VarP = a0.p(lVar, aVar, mVar, -1769694420);
        int i15 = i14 | (o0VarP.B(rVar) ? 4 : 2) | (o0VarP.r(lVar) ? 32 : 16) | (o0VarP.r(aVar) ? 256 : 128);
        if (o0VarP.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97920e;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            z zVarA = y.a(iVarI, h4.d.a.f81536n, o0VarP, 0);
            int iHashCode = Long.hashCode(o0VarP.U);
            i2 i2VarA0 = o0VarP.a0();
            r rVarC = h4.k.c(rVar, o0VarP);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarP.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarP.z();
            if (o0VarP.T) {
                o0VarP.M(aVar2);
            } else {
                o0VarP.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarP);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarP);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarP.T || !s.g(o0VarP.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarP, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarP);
            b0 b0Var = b0.f22601a;
            f0 f0Var = f0.f110999a;
            String strQ = gl1.y.Q(o0VarP, R.string.trail_detail_add_trail_review_button);
            r.a aVar3 = r.S;
            r rVarF = x2.f(aVar3, 1.0f);
            h4.g.a aVar4 = h4.d.a.f81537o;
            r rVarB = b0Var.b(rVarF, aVar4);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarP.q();
            p3.m.a aVar5 = p3.m.f135153a;
            if (z14) {
                objQ = new gt1.k(lVar, 10);
                o0VarP.K(objQ);
            } else {
                aVar5.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gt1.k(lVar, 10);
                    o0VarP.K(objQ);
                }
            }
            f0Var.d(0, 9, (e23.a) objQ, rVarB, strQ, o0VarP, null, false);
            o0VarP = o0VarP;
            String strQ2 = gl1.y.Q(o0VarP, R.string.trail_detail_report_issue_button);
            r rVarB2 = b0Var.b(x2.f(aVar3, 1.0f), aVar4);
            boolean z15 = (i15 & 896) == 256;
            Object objQ2 = o0VarP.q();
            if (z15) {
                objQ2 = new j22.d(aVar, 11);
                o0VarP.K(objQ2);
            } else {
                aVar5.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new j22.d(aVar, 11);
                    o0VarP.K(objQ2);
                }
            }
            f0Var.k(strQ2, rVarB2, false, (e23.a) objQ2, o0VarP, 0, 4);
            o0VarP.g0(true);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(rVar, lVar, aVar, i14, 0);
        }
    }
}
