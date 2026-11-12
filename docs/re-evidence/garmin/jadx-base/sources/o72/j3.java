package o72;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.common.net.HttpHeaders;
import i3.dd;
import i3.mh;
import i3.uc;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class j3 {
    public static final void a(String str, p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(1231378747);
        boolean z14 = false;
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0Var = j92.f.f97931h;
            h4.r.a aVar = h4.r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            o0Var = o0VarE;
            mh.c(str, c2.l.C(aVar, f14, f14, 0.0f, 8, 4), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0Var, 6, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h3(str, i14, z14);
        }
    }

    public static final void b(p3.m mVar, int i14) {
        long j8;
        p3.o0 o0VarE = mVar.E(-1361060631);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = n23.j.o(0.0f, o0VarE);
            }
            p3.m1 m1Var = (p3.m1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = n23.j.o(0.0f, o0VarE);
            }
            p3.m1 m1Var2 = (p3.m1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = n23.j.o(0.0f, o0VarE);
            }
            p3.m1 m1Var3 = (p3.m1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p3.p0.n(new j23.e(0.0f, 100.0f));
                o0VarE.K(objQ4);
            }
            p3.p1 p1Var = (p3.p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p3.p0.n(new j23.e(0.0f, 100.0f));
                o0VarE.K(objQ5);
            }
            p3.p1 p1Var2 = (p3.p1) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = p3.p0.n(new j23.e(0.0f, 100.0f));
                o0VarE.K(objQ6);
            }
            p3.p1 p1Var3 = (p3.p1) objQ6;
            int i15 = 6;
            a("Slider", o0VarE, 6);
            c(String.valueOf(m1Var.getFloatValue()), o0VarE, 0);
            l72.c3 c3Var = l72.c3.f110949a;
            float floatValue = m1Var.getFloatValue();
            j23.e eVar = new j23.e(0.0f, 100.0f);
            h4.r.a aVar = h4.r.S;
            float f14 = 24;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarA = c2.l.A(aVar, f14, 0.0f, 2);
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = new ca0.q1(m1Var, i15);
                o0VarE.K(objQ7);
            }
            e23.l<? super Float, Unit> lVar = (e23.l) objQ7;
            Object objQ8 = o0VarE.q();
            if (objQ8 == c2565a) {
                objQ8 = new i2(19);
                o0VarE.K(objQ8);
            }
            c3Var.a(floatValue, lVar, rVarA, false, eVar, 0, null, (e23.a) objQ8, o0VarE, 12583344, 104);
            a("Slider Steps", o0VarE, 6);
            c(String.valueOf(m1Var2.getFloatValue()), o0VarE, 0);
            float floatValue2 = m1Var2.getFloatValue();
            j23.e eVar2 = new j23.e(0.0f, 100.0f);
            h4.r rVarA2 = c2.l.A(aVar, f14, 0.0f, 2);
            Object objQ9 = o0VarE.q();
            if (objQ9 == c2565a) {
                objQ9 = new ca0.q1(m1Var2, 8);
                o0VarE.K(objQ9);
            }
            e23.l<? super Float, Unit> lVar2 = (e23.l) objQ9;
            Object objQ10 = o0VarE.q();
            if (objQ10 == c2565a) {
                objQ10 = new i2(20);
                o0VarE.K(objQ10);
            }
            c3Var.a(floatValue2, lVar2, rVarA2, false, eVar2, 5, null, (e23.a) objQ10, o0VarE, 12779952, 72);
            a("Slider Steps without dots", o0VarE, 6);
            c(String.valueOf(m1Var3.getFloatValue()), o0VarE, 0);
            float floatValue3 = m1Var3.getFloatValue();
            j23.e eVar3 = new j23.e(0.0f, 100.0f);
            h4.r rVarA3 = c2.l.A(aVar, f14, 0.0f, 2);
            dd ddVar = dd.f87874a;
            long jD = hb.a.d(d92.b.f58623a, o0VarE);
            if (d92.b.d(o0VarE)) {
                o4.d0.f128823b.getClass();
                j8 = o4.d0.f128826e;
            } else {
                o4.d0.f128823b.getClass();
                j8 = o4.d0.f128824c;
            }
            o4.d0.f128823b.getClass();
            long j14 = o4.d0.f128831j;
            long jG = d92.b.a(o0VarE).e().g();
            ddVar.getClass();
            uc ucVarG = dd.g(jD, j8, j14, jG, j14, o0VarE, 992);
            Object objQ11 = o0VarE.q();
            if (objQ11 == c2565a) {
                objQ11 = new ca0.q1(m1Var3, 9);
                o0VarE.K(objQ11);
            }
            e23.l<? super Float, Unit> lVar3 = (e23.l) objQ11;
            Object objQ12 = o0VarE.q();
            if (objQ12 == c2565a) {
                objQ12 = new i2(21);
                o0VarE.K(objQ12);
            }
            c3Var.a(floatValue3, lVar3, rVarA3, false, eVar3, 5, ucVarG, (e23.a) objQ12, o0VarE, 12779952, 8);
            o0VarE = o0VarE;
            a(HttpHeaders.RANGE, o0VarE, 6);
            c(((j23.f) p1Var.getF182175a()).toString(), o0VarE, 0);
            j23.f<Float> fVar = (j23.f) p1Var.getF182175a();
            j23.e eVar4 = new j23.e(0.0f, 100.0f);
            h4.r rVarA4 = c2.l.A(aVar, f14, 0.0f, 2);
            Object objQ13 = o0VarE.q();
            if (objQ13 == c2565a) {
                objQ13 = new v1(p1Var, 28);
                o0VarE.K(objQ13);
            }
            e23.l<? super j23.f<Float>, Unit> lVar4 = (e23.l) objQ13;
            Object objQ14 = o0VarE.q();
            if (objQ14 == c2565a) {
                objQ14 = new i2(15);
                o0VarE.K(objQ14);
            }
            c3Var.b(fVar, lVar4, rVarA4, false, eVar4, 0, null, null, (e23.a) objQ14, o0VarE, 100663728, 232);
            a("Range Steps", o0VarE, 6);
            c(((j23.f) p1Var2.getF182175a()).toString(), o0VarE, 0);
            j23.f<Float> fVar2 = (j23.f) p1Var2.getF182175a();
            j23.e eVar5 = new j23.e(0.0f, 100.0f);
            h4.r rVarA5 = c2.l.A(aVar, f14, 0.0f, 2);
            Object objQ15 = o0VarE.q();
            if (objQ15 == c2565a) {
                objQ15 = new v1(p1Var2, 29);
                o0VarE.K(objQ15);
            }
            e23.l<? super j23.f<Float>, Unit> lVar5 = (e23.l) objQ15;
            Object objQ16 = o0VarE.q();
            if (objQ16 == c2565a) {
                objQ16 = new i2(16);
                o0VarE.K(objQ16);
            }
            c3Var.b(fVar2, lVar5, rVarA5, false, eVar5, 5, null, null, (e23.a) objQ16, o0VarE, 100860336, 200);
            a("Range Step without dots", o0VarE, 6);
            c(((j23.f) p1Var3.getF182175a()).toString(), o0VarE, 0);
            j23.f<Float> fVar3 = (j23.f) p1Var3.getF182175a();
            j23.e eVar6 = new j23.e(0.0f, 100.0f);
            h4.r rVarA6 = c2.l.A(aVar, f14, 0.0f, 2);
            uc ucVarG2 = dd.g(am.j.d(o0VarE), d92.b.d(o0VarE) ? o4.d0.f128826e : o4.d0.f128824c, j14, d92.b.a(o0VarE).e().g(), j14, o0VarE, 992);
            Object objQ17 = o0VarE.q();
            if (objQ17 == c2565a) {
                objQ17 = new i3(p1Var3, 0);
                o0VarE.K(objQ17);
            }
            e23.l<? super j23.f<Float>, Unit> lVar6 = (e23.l) objQ17;
            Object objQ18 = o0VarE.q();
            int i16 = 18;
            if (objQ18 == c2565a) {
                objQ18 = new i2(18);
                o0VarE.K(objQ18);
            }
            c3Var.b(fVar3, lVar6, rVarA6, false, eVar6, 5, ucVarG2, null, (e23.a) objQ18, o0VarE, 100860336, SyslogConstants.LOG_LOCAL1);
            a("Slider Input", o0VarE, 6);
            h4.r rVarE = u1.n.e(aVar, d92.b.a(o0VarE).c().e(), o4.m1.f128891a);
            e1.f130368a.getClass();
            z82.a.a(rVarE, e1.f130369b, z3.f.c(-857656475, new m92.f(m1Var, i16), o0VarE), e1.f130370c, o0VarE, 3504);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z1(i14, 26);
        }
    }

    public static final void c(String str, p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-1464311121);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0Var = j92.f.f97932i;
            g6.f.a aVar = g6.f.f75994b;
            o0Var = o0VarE;
            mh.c(str, c2.l.A(h4.r.S, 16, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0Var, (i15 & 14) | 48, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fv1.b(str, i14, 29);
        }
    }
}
