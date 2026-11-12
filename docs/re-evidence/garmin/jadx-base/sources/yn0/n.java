package yn0;

import b63.o;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import m92.h0;
import o13.p;
import p13.y;
import p3.o0;
import p3.p2;
import p3.x1;
import w52.j0;

/* JADX INFO: loaded from: classes8.dex */
public final class n {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(i53.d<o, Double> dVar, i53.d<o, ? extends j23.g<Double>> dVar2, j23.g<o> gVar, un0.a aVar, in0.m mVar, p3.m mVar2, int i14) {
        int i15;
        j23.g<o> gVar2;
        o0 o0Var;
        o0 o0VarE = mVar2.E(203125129);
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
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.k(mVar.ordinal()) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            i53.c cVarE = i53.a.e(ao0.c.c(dVar, (o) gVar2.getStart()));
            em1.b bVar = em1.b.f64618a;
            ArrayList arrayList = new ArrayList(y.r(cVarE, 10));
            Iterator<E> it = cVarE.iterator();
            while (it.hasNext()) {
                arrayList.add(Double.valueOf(((h0.e.a) it.next()).f117347b));
            }
            bVar.getClass();
            float fA = em1.b.a(arrayList);
            p pVar = new p(Float.valueOf(-fA), Float.valueOf(fA));
            float fFloatValue = ((Number) pVar.f128594a).floatValue();
            float fFloatValue2 = ((Number) pVar.f128595b).floatValue();
            i53.c cVarE2 = i53.a.e(ao0.c.d(dVar2, (o) gVar2.getStart()));
            ArrayList arrayList2 = new ArrayList(y.r(cVarE2, 10));
            Iterator<E> it3 = cVarE2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Float.valueOf(((h0.d.b) it3.next()).f117345c));
            }
            em1.b bVar2 = em1.b.f64618a;
            ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                arrayList3.add(Double.valueOf(((Number) it4.next()).floatValue()));
            }
            bVar2.getClass();
            float fA2 = em1.b.a(arrayList3);
            p pVar2 = new p(Float.valueOf(-fA2), Float.valueOf(fA2));
            p pVar3 = new p(Float.valueOf(Math.min(fFloatValue, ((Number) pVar2.f128594a).floatValue())), Float.valueOf(Math.max(fFloatValue2, ((Number) pVar2.f128595b).floatValue())));
            float fFloatValue3 = ((Number) pVar3.f128594a).floatValue();
            float fFloatValue4 = ((Number) pVar3.f128595b).floatValue();
            d02.f fVar = new d02.f();
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_avg_skin_temp_change);
            String string = aVar.f172043a.getString(R.string.lbl_degree_sign);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_avg_skin_temp_change);
            int i16 = ((i15 << 3) & 7168) | (un0.a.f172042b << 15);
            int i17 = i15 << 6;
            o0Var = o0VarE;
            xn0.f.a(null, cVarE, cVarE2, gVar2, fVar, aVar, mVar, fFloatValue3, fFloatValue4, strQ, string, strQ2, false, o0Var, i16 | (458752 & i17) | (i17 & 3670016), 384, 1);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j0(dVar, dVar2, gVar, aVar, mVar, i14, 8);
        }
    }

    public static final void b(in0.j jVar, un0.a aVar, p3.m mVar, int i14) {
        int i15;
        jVar.getClass();
        o0 o0VarE = mVar.E(1292592398);
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
            xn0.b.a(z3.f.c(923053237, new b(aVar2, aVar, 7), o0VarE), z3.f.c(528649398, new c(aVar2, 4), o0VarE), z3.f.c(134245559, new b(aVar2, aVar, 8), o0VarE), z3.f.c(-260158280, new d(jVar, aVar, 4), o0VarE), null, o0VarE, 3510, 16);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(jVar, aVar, i14, 4);
        }
    }

    public static final void c(j23.g<Double> gVar, un0.a aVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(434483986);
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
            xn0.h.a(aVar.n(gVar), gl1.y.Q(o0VarE, R.string.lbl_typical_range), null, aVar.i(aVar.o((Double) gVar.getStart()), aVar.o((Double) gVar.b()), aVar.f172043a.getString(R.string.lbl_degree_sign)), o0VarE, 0, 4);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(gVar, aVar, i14, 3);
        }
    }

    public static final void d(in0.h.a aVar, un0.a aVar2, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1174752001);
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
            i53.c<z72.l> cVarA = ao0.d.a(false, null, o0VarE, 0, 3);
            float fB = ao0.d.b(c1802a.f94455c, c1802a.f94454b, true);
            Double dValueOf = Double.valueOf(aVar.f94450a);
            int i16 = un0.a.f172042b;
            xn0.i.a(cVarA, fB, aVar2.o(dValueOf), gl1.y.Q(o0VarE, R.string.lbl_avg_change), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(aVar, aVar2, i14, 4);
        }
    }
}
