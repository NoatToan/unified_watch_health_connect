package jt1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import o4.f0;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.w;

/* JADX INFO: loaded from: classes10.dex */
public final class g {
    /* JADX WARN: Code duplicated, block: B:33:0x0165  */
    public static final void a(r rVar, String str, ro0.l lVar, p3.m mVar, int i14) {
        rVar.getClass();
        str.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(1773372272);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            t4.d dVarA = n5.c.a(R.drawable.warning, o0VarE, 0);
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            r rVarA = u2Var.a(x2.q(aVar2, j92.b.f97901d.f97906e), 0.2f, true);
            h4.g.b bVar3 = h4.d.a.f81534l;
            i7.a(dVarA, null, u2Var.c(rVarA, bVar3), f0.d(4294295338L), o0VarE, 3120, 0);
            r rVarA2 = u2Var.a(aVar2, 1.25f, true);
            bVar2.getClass();
            r rVarC2 = u2Var.c(c2.l.y(rVarA2, j92.b.f97899b.f97918c), bVar3);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97932i;
            mh.c(str, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 2, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, (i15 >> 3) & 14, 24576, 114684);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new i91.c(24, context, lVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new i91.c(24, context, lVar);
                    o0VarE.K(objQ);
                }
            }
            r rVarC3 = u2Var.c(u2Var.a(w.d(aVar2, false, null, null, (e23.a) objQ, 15), 0.2f, true), bVar3);
            String strQ = y.Q(o0VarE, R.string.lbl_help);
            fVar.getClass();
            mh.c(strQ, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(x0Var, d92.b.a(o0VarE).k().a(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gw1.c(rVar, str, lVar, i14, 28);
        }
    }
}
