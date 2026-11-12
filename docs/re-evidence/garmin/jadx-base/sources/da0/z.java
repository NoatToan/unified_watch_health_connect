package da0;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mc;
import i3.mh;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import u1.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class z {
    public static final void a(int i14, p3.m mVar, int i15) {
        o0 o0VarE = mVar.E(-1065600477);
        int i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            t4.d dVarA = n5.c.a(i14, o0VarE, i16 & 14);
            h4.r rVarY = x2.y(h4.r.S, null, 3);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97921f;
            bVar.getClass();
            y0.a(dVarA, null, c2.l.C(rVarY, 0.0f, f14, 0.0f, eVar.f97921f, 5), null, null, 0.0f, null, o0VarE, 48, 120);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.e(i14, i15, 2);
        }
    }

    public static final void b(String str, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(2060019829);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(str, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0Var, i15 & 14, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new as.p(str, i14, 12);
        }
    }

    public static final void c(String str, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(1603824326);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(str, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, o0VarE), o0Var, i15 & 14, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new as.p(str, i14, 11);
        }
    }

    public static final void d(i53.f<? extends pv.a> fVar, mc mcVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        fVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1074841528);
        int i15 = i14 | (o0VarE.B(fVar) ? 4 : 2) | (o0VarE.B(mcVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            l72.w.f111301a.f(gl1.y.Q(o0VarE, R.string.common_learn_more), null, null, z3.f.c(451962007, new cq0.p(aVar, 12), o0VarE), aVar, mcVar, false, null, z3.f.c(-1028679487, new a71.n(fVar, 23), o0VarE), o0VarE, (57344 & (i15 << 6)) | 806882304 | ((i15 << 12) & 458752), 390);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c50.f(fVar, mcVar, aVar, i14, 23);
        }
    }
}
