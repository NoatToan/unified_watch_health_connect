package yn0;

import b63.o;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class l {
    public static final void a(i53.d<o, Double> dVar, i53.d<o, ? extends j23.g<Double>> dVar2, j23.g<o> gVar, un0.a aVar, p3.m mVar, int i14) {
        int i15;
        j23.g<o> gVar2;
        o0 o0Var;
        o0 o0VarE = mVar.E(668803500);
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
            o0Var = o0VarE;
            xn0.f.a(null, i53.a.e(ao0.c.c(dVar, (o) gVar2.getStart())), i53.a.e(ao0.c.d(dVar2, (o) gVar2.getStart())), gVar2, null, aVar, in0.m.PULSE_OX, 60.0f, 100.0f, y.Q(o0VarE, R.string.pulse_ox_avg_spo2), aVar.f172043a.getString(R.string.percent_sign), y.Q(o0VarE, R.string.pulse_ox_avg_spo2), false, o0Var, ((i15 << 3) & 7168) | 1572864 | (un0.a.f172042b << 15) | ((i15 << 6) & 458752), 0, 4113);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(dVar, dVar2, gVar, aVar, i14, 2);
        }
    }

    public static final void b(in0.j jVar, un0.a aVar, p3.m mVar, int i14) {
        int i15;
        jVar.getClass();
        o0 o0VarE = mVar.E(1793007798);
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
            xn0.b.a(z3.f.c(-1979439587, new b(aVar2, aVar, 3), o0VarE), z3.f.c(80482910, new c(aVar2, 2), o0VarE), z3.f.c(2140405407, new b(aVar2, aVar, 4), o0VarE), z3.f.c(-94639392, new d(jVar, aVar, 2), o0VarE), null, o0VarE, 3510, 16);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(jVar, aVar, i14, 2);
        }
    }

    public static final void c(j23.g<Double> gVar, un0.a aVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1913576757);
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
            int i16 = un0.a.f172042b;
            xn0.h.a(aVar.j(gVar, true), y.Q(o0VarE, R.string.lbl_typical_range), null, aVar.i(aVar.k((Double) gVar.getStart(), true), aVar.k((Double) gVar.b(), true), ""), o0VarE, 0, 4);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(gVar, aVar, i14, 1);
        }
    }

    public static final void d(in0.h.a aVar, un0.a aVar2, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-580014274);
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
            i53.c<z72.l> cVarA = ao0.d.a(false, null, o0VarE, 6, 2);
            float fB = ao0.d.b(c1802a.f94455c, c1802a.f94454b, false);
            Double dValueOf = Double.valueOf(aVar.f94450a);
            int i16 = un0.a.f172042b;
            xn0.i.a(cVarA, fB, aVar2.k(dValueOf, true), y.Q(o0VarE, R.string.pulse_ox_avg_spo2), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(aVar, aVar2, i14, 2);
        }
    }
}
