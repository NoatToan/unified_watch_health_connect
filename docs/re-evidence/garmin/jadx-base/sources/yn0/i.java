package yn0;

import b63.o;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import o13.p;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class i {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(i53.d<o, Double> dVar, i53.d<o, ? extends j23.g<Double>> dVar2, j23.g<o> gVar, un0.a aVar, p3.m mVar, int i14) {
        int i15;
        j23.g<o> gVar2;
        o0 o0Var;
        o0 o0VarE = mVar.E(1389066064);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(dVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            gVar2 = gVar;
            i15 |= o0VarE.r(gVar2) ? 256 : 128;
        } else {
            gVar2 = gVar;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            i53.c cVarE = i53.a.e(ao0.c.c(dVar, (o) gVar2.getStart()));
            p pVarB = ao0.c.b(10.0f, 200.0f, cVarE);
            float fFloatValue = ((Number) pVarB.f128594a).floatValue();
            float fFloatValue2 = ((Number) pVarB.f128595b).floatValue();
            i53.c cVarE2 = i53.a.e(ao0.c.d(dVar2, (o) gVar2.getStart()));
            p pVarA = ao0.c.a(10.0f, 200.0f, cVarE2);
            p pVar = new p(Float.valueOf(Math.min(fFloatValue, ((Number) pVarA.f128594a).floatValue())), Float.valueOf(Math.max(fFloatValue2, ((Number) pVarA.f128595b).floatValue())));
            o0Var = o0VarE;
            xn0.f.a(null, cVarE, cVarE2, gVar2, null, aVar, in0.m.HEART_RATE, ((Number) pVar.f128594a).floatValue(), ((Number) pVar.f128595b).floatValue(), y.Q(o0VarE, R.string.lbl_avg_overnight_hr), aVar.f172043a.getString(R.string.lbl_bpm), y.Q(o0VarE, R.string.lbl_avg_overnight_heart_rate), false, o0Var, 1572864 | ((i15 << 3) & 7168) | (un0.a.f172042b << 15) | ((i15 << 6) & 458752), 0, 4113);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(dVar, dVar2, gVar, aVar, i14, 0);
        }
    }

    public static final void b(in0.j jVar, un0.a aVar, p3.m mVar, int i14) {
        int i15;
        jVar.getClass();
        o0 o0VarE = mVar.E(-1990401418);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(jVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            in0.h.a aVar2 = jVar.f94473c;
            xn0.b.a(z3.f.c(-635249571, new b(aVar2, aVar, 0), o0VarE), z3.f.c(-1700216802, new c(aVar2, 0), o0VarE), z3.f.c(1529783263, new b(aVar2, aVar, 1), o0VarE), z3.f.c(464816032, new d(jVar, aVar, 0), o0VarE), null, o0VarE, 3510, 16);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(jVar, aVar, i14, 0);
        }
    }

    public static final void c(j23.g<Double> gVar, un0.a aVar, p3.m mVar, int i14) {
        int i15;
        l22.a aVar2 = aVar.f172043a;
        o0 o0VarE = mVar.E(-2082231121);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(gVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            xn0.h.a(aVar.e(gVar, false), y.Q(o0VarE, R.string.lbl_typical_range), aVar2.getString(R.string.lbl_bpm), aVar.i(un0.a.f(aVar, (Double) gVar.getStart(), 4), un0.a.f(aVar, (Double) gVar.b(), 4), aVar2.getString(R.string.lbl_bpm)), o0VarE, 0, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(gVar, aVar, i14, 0);
        }
    }

    public static final void d(in0.h.a aVar, un0.a aVar2, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-428939166);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar2) : o0VarE.r(aVar2) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            in0.h.a.C1802a c1802a = aVar.f94451b;
            xn0.i.a(ao0.d.a(false, null, o0VarE, 0, 3), ao0.d.b(c1802a.f94455c, c1802a.f94454b, true), un0.a.f(aVar2, Double.valueOf(aVar.f94450a), 6), y.Q(o0VarE, R.string.lbl_avg_overnight_hr), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(aVar, aVar2, i14, 0);
        }
    }
}
