package ka0;

import c2.j;
import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import da0.p;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import o4.m1;
import p005kotlin.Unit;
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

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public static final void a(int i14, r rVar, String str, m mVar) {
        o0 o0VarE = mVar.E(-275733688);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(rVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            j.f22691a.getClass();
            j.C0343j c0343j = j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVar, o0VarE);
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
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            g6.f.a aVar3 = g6.f.f75994b;
            q.a(u1.n.e(l4.k.b(x2.q(l.C(aVar2, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), 7), k2.i.f102406a), com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), m1.f128891a), o0VarE, 0);
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
            bVar2.getClass();
            mh.c(str, l.C(aVar2, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, i15 & 14, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq.g(str, rVar, i14, 2);
        }
    }

    public static final void b(e23.a<Unit> aVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        aVar.getClass();
        o0 o0VarE = mVar.E(416466901);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.lbl_help);
            h.f103744a.getClass();
            o0Var = o0VarE;
            p.b("choose_activity_profiles_help_screen", strQ, null, null, null, null, null, false, null, null, false, null, null, false, false, aVar, null, null, null, null, null, h.f103745b, o0Var, 6, (i15 << 15) & 458752, 384, 4161532);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.c(aVar, i14, 6);
        }
    }
}
