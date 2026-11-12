package cv1;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import h5.e0;
import i3.mh;
import l72.f0;
import o4.m1;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class f {
    public static final void a(int i14, e23.a aVar, String str, p3.m mVar, boolean z14) {
        boolean z15 = z14;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1700943662);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.h(z15) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar2 = r.S;
            r rVarE = u1.n.e(x2.f(aVar2, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarY = c2.l.y(rVarE, eVar.f97920e);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarY, o0VarE);
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
            r rVarF = x2.f(aVar2, 1.0f);
            String strP = gl1.y.P(R.string.msg_resume_plan, new Object[]{str}, o0VarE);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(strP, rVarF, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 48, 0, 130044);
            r rVarF2 = x2.f(aVar2, 1.0f);
            bVar.getClass();
            r rVarC2 = c2.l.C(rVarF2, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
            String strQ = gl1.y.Q(o0VarE, z14 ? R.string.plan_requires_gc_plus : R.string.msg_resume_plan_info);
            fVar.getClass();
            mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 130044);
            o0VarE = o0VarE;
            f0 f0Var = f0.f110999a;
            r rVarF3 = x2.f(aVar2, 1.0f);
            bVar.getClass();
            z15 = z14;
            f0Var.e(z3.f.c(-1854760155, new an1.i(z15, 11), o0VarE), gl1.y.Q(o0VarE, R.string.lbl_resume_plan), c2.l.C(rVarF3, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), false, aVar, o0VarE, (57344 & (i15 << 6)) | 6, 8);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new af1.g(str, z15, aVar, i14, 4);
        }
    }
}
