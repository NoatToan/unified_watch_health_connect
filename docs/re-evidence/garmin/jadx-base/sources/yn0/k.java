package yn0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.o;
import c2.b0;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import l72.x0;
import o13.p;
import org.joda.time.LocalDate;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.w;
import vd0.f0;
import vd0.s0;

/* JADX INFO: loaded from: classes8.dex */
public final class k {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(i53.d<o, Double> dVar, i53.d<o, ? extends j23.g<Double>> dVar2, j23.g<o> gVar, un0.a aVar, p3.m mVar, int i14) {
        int i15;
        j23.g<o> gVar2;
        o0 o0Var;
        o0 o0VarE = mVar.E(-1473844874);
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
            p pVarB = ao0.c.b(20.0f, 120.0f, cVarE);
            float fFloatValue = ((Number) pVarB.f128594a).floatValue();
            float fFloatValue2 = ((Number) pVarB.f128595b).floatValue();
            i53.c cVarE2 = i53.a.e(ao0.c.d(dVar2, (o) gVar2.getStart()));
            p pVarA = ao0.c.a(20.0f, 120.0f, cVarE2);
            p pVar = new p(Float.valueOf(Math.min(fFloatValue, ((Number) pVarA.f128594a).floatValue())), Float.valueOf(Math.max(fFloatValue2, ((Number) pVarA.f128595b).floatValue())));
            float fFloatValue3 = ((Number) pVar.f128594a).floatValue();
            float fFloatValue4 = ((Number) pVar.f128595b).floatValue();
            int i16 = i15;
            o0Var = o0VarE;
            xn0.f.a(null, cVarE, cVarE2, gVar2, null, aVar, in0.m.HRV, fFloatValue3, fFloatValue4, y.Q(o0VarE, R.string.lbl_avg_overnight_hrv), aVar.q(), y.Q(o0VarE, R.string.lbl_avg_overnight_hrv), false, o0Var, 1572864 | ((i16 << 3) & 7168) | (un0.a.f172042b << 15) | ((i16 << 6) & 458752), 0, 4113);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(dVar, dVar2, gVar, aVar, i14, 1);
        }
    }

    public static final void b(in0.j jVar, un0.a aVar, p3.m mVar, int i14) {
        int i15;
        i41.f fVar;
        List<i41.f> listB;
        Object next;
        LocalDate localDateF;
        o0 o0VarE = mVar.E(2066884848);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(jVar) : o0VarE.r(jVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = 16;
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            in0.h.b bVar = jVar.f94474d;
            if (bVar == null || (listB = bVar.f94462a.b()) == null) {
                fVar = null;
            } else {
                Iterator<T> it = listB.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        localDateF = ((i41.f) next).f();
                    }
                } while (!s.g(localDateF != null ? g22.k.t(localDateF) : null, jVar.f94472b.b()));
                fVar = (i41.f) next;
            }
            i41.a baseline = fVar != null ? fVar.getBaseline() : null;
            x0 x0Var = x0.f111346a;
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarA = c2.l.A(aVar2, 0.0f, eVar.f97920e, 1);
            z3.e eVarC = z3.f.c(1139119799, new s0(jVar, i16, aVar, baseline), o0VarE);
            int i17 = (x0.f111348c << 6) | 48;
            x0Var.e(rVarA, eVarC, o0VarE, i17, 0);
            bVar2.getClass();
            x0Var.e(c2.l.A(aVar2, 0.0f, eVar.f97920e, 1), z3.f.c(52341024, new f0(jVar, aVar, context, fVar, 9), o0VarE), o0VarE, i17, 0);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(jVar, aVar, i14, 1);
        }
    }

    public static final void c(in0.j jVar, un0.a aVar, nk0.l lVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(-678681607);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(jVar) : o0VarE.r(jVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarA = c2.l.A(aVar2, eVar.f97920e, 0.0f, 2);
            bVar.getClass();
            r rVarC = c2.l.C(rVarA, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            String strQ = y.Q(o0VarE, R.string.lbl_overnight_hrv_vs_hrv_status);
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarE);
            bVar.getClass();
            int i16 = i15;
            mh.c(strQ, c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            d(lVar, o0Var, (i16 >> 6) & 14);
            b(jVar, aVar, o0Var, (i16 & 14) | 8 | (un0.a.f172042b << 3) | (i16 & 112));
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(jVar, aVar, lVar, i14, 1);
        }
    }

    public static final void d(nk0.l lVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(-497334838);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(lVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarC = c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            String strQ = y.Q(o0VarE, R.string.msg_health_status_overnight_hrv_vs_hrv);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            s5.x0 x0Var = j92.f.f97931h;
            s5.x0 x0VarF = d92.c.f(x0Var, o0VarE);
            bVar.getClass();
            mh.c(strQ, c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            r rVarD = w.d(aVar, false, null, null, lVar, 15);
            String strQ2 = y.Q(o0VarE, R.string.common_learn_more);
            fVar.getClass();
            mh.c(strQ2, rVarD, d92.b.a(o0VarE).k().a(), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 131064);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w52.n(lVar, i14, 14);
        }
    }

    public static final void e(in0.j jVar, un0.a aVar, nk0.l lVar, p3.m mVar, int i14) {
        int i15;
        jVar.getClass();
        o0 o0VarE = mVar.E(18402306);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(jVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            in0.h.a aVar2 = jVar.f94473c;
            z3.e eVarC = z3.f.c(-351136855, new b(aVar2, aVar, 2), o0VarE);
            z3.e eVarC2 = z3.f.c(-745540694, new c(aVar2, 1), o0VarE);
            a.f198136a.getClass();
            xn0.b.a(eVarC, eVarC2, a.f198137b, z3.f.c(-1534348372, new d(jVar, aVar, 1), o0VarE), z3.f.c(-1928752211, new xk1.e(jVar, 17, aVar, lVar), o0VarE), o0VarE, 28086, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(jVar, aVar, lVar, i14, 0);
        }
    }

    public static final void f(in0.h.a aVar, un0.a aVar2, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-751759352);
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
            xn0.i.a(ao0.d.a(false, null, o0VarE, 0, 3), ao0.d.b(c1802a.f94455c, c1802a.f94454b, true), un0.a.c(aVar2, Double.valueOf(aVar.f94450a), false, 6), y.Q(o0VarE, R.string.lbl_overnight_avg), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(aVar, aVar2, i14, 1);
        }
    }
}
