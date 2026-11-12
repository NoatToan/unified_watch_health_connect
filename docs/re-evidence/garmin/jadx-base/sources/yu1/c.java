package yu1;

import c2.j;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.w;
import w51.n0;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:33:0x0149  */
    public static final void a(e23.a aVar, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(398540556);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarF = x2.f(l.y(aVar2, eVar.f97920e), 1.0f);
            j.f22691a.getClass();
            j.g gVar = j.f22698h;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(gVar, h4.d.a.f81533k, o0VarE, 6);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarF, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            String strQ = y.Q(o0VarE, R.string.lbl_goal);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, 0, 0, 131070);
            o0Var = o0VarE;
            if (aVar != null) {
                o0Var.C(-292705185);
                String strQ2 = y.Q(o0Var, R.string.lbl_edit);
                fVar.getClass();
                x0 x0Var = j92.f.f97932i;
                long jA = d92.b.a(o0Var).k().a();
                bVar.getClass();
                r rVarC2 = l.C(aVar2, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                boolean z14 = (i15 & 14) == 4;
                Object objQ = o0Var.q();
                if (z14) {
                    objQ = new ya0.l(aVar, 27);
                    o0Var.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new ya0.l(aVar, 27);
                        o0Var.K(objQ);
                    }
                }
                mh.c(strQ2, w.d(rVarC2, false, null, null, (e23.a) objQ, 15), jA, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0Var, 0, 0, 131064);
                o0Var = o0Var;
                o0Var.g0(false);
            } else {
                o0Var.C(-292392550);
                o0Var.g0(false);
            }
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n0(aVar, i14, 23);
        }
    }
}
