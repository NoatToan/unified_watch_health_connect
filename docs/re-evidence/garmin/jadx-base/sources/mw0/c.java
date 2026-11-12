package mw0;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.mh;
import l72.x0;
import o4.m1;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import w2.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public static final void a(kw0.c cVar, String str, p3.m mVar, int i14) {
        int i15;
        int i16;
        h4.r.a aVar;
        String str2;
        String str3;
        String str4;
        String str5;
        aw0.a aVar2;
        int i17;
        String str6 = str;
        o0 o0VarE = mVar.E(509619489);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(cVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str6) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            aw0.a aVar3 = new aw0.a(a0.s(o0VarE));
            Integer num = cVar.f106907a;
            Integer num2 = cVar.f106910d;
            Integer num3 = cVar.f106909c;
            Integer num4 = cVar.f106908b;
            String strC = aVar3.c(num);
            String strC2 = aVar3.c(num4);
            String strC3 = aVar3.c(num3);
            String strC4 = aVar3.c(num2);
            h4.r.a aVar4 = h4.r.S;
            h4.r rVarF = x2.f(u1.n.e(aVar4, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a), 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int i18 = i15;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            if (cVar.f106907a == null && num4 == null && num3 == null && num2 == null) {
                o0VarE.C(1436867575);
                o0VarE.g0(false);
                i17 = 0;
                str3 = strC;
                str4 = strC2;
                str5 = strC3;
                str2 = strC4;
                aVar = aVar4;
                aVar2 = aVar3;
                i16 = 2;
                str6 = str;
            } else {
                o0VarE.C(1436278482);
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                bVar2.getClass();
                h4.r rVarC2 = c2.l.C(aVar4, f14, 0.0f, 0.0f, eVar.f97920e, 6);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_overall_impact);
                j92.f fVar = d92.b.f58624b;
                fVar.getClass();
                i16 = 2;
                mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, 0, 0, 131068);
                bVar2.getClass();
                h4.r rVarA = c2.l.A(aVar4, eVar.f97920e, 0.0f, 2);
                bVar2.getClass();
                h4.r rVarC3 = c2.l.C(rVarA, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
                fVar.getClass();
                aVar = aVar4;
                str2 = strC4;
                str3 = strC;
                str4 = strC2;
                str5 = strC3;
                aVar2 = aVar3;
                str6 = str;
                mh.c(str6, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, (i18 >> 3) & 14, 0, 131068);
                o0VarE = o0VarE;
                i17 = 0;
                o0VarE.g0(false);
            }
            x0 x0Var = x0.f111346a;
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r.a aVar6 = aVar;
            h4.r rVarA2 = c2.l.A(aVar6, eVar2.f97920e, 0.0f, i16);
            bVar3.getClass();
            h4.r rVarC4 = c2.l.C(rVarA2, 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7);
            aw0.a aVar7 = aVar2;
            z3.e eVarC = z3.f.c(-349814286, new b(str3, aVar7, str4, i17), o0VarE);
            int i19 = (x0.f111348c << 6) | 48;
            x0Var.e(rVarC4, eVarC, o0VarE, i19, 0);
            bVar3.getClass();
            x0Var.e(c2.l.y(aVar6, eVar2.f97920e), z3.f.c(-628313317, new b(str5, aVar7, str2, 1), o0VarE), o0VarE, i19, 0);
            o0VarE.g0(true);
        } else {
            i16 = 2;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mg2.o(cVar, str6, i14, i16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(kw0.c cVar, String str, String str2, h4.r rVar, boolean z14, p3.m mVar, int i14) {
        cVar.getClass();
        str.getClass();
        str2.getClass();
        o0 o0VarE = mVar.E(-1978966758);
        int i15 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.B(rVar) ? 2048 : 1024) | (o0VarE.h(z14) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            String strB = new aw0.a(a0.s(o0VarE)).b(cVar.f106913g, str2, str);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            a(cVar, strB, o0VarE, i15 & 14);
            if (z14) {
                o0VarE.C(-1765410867);
                o13.p pVar = new o13.p(cVar.f106912f, cVar.f106911e);
                Integer num = (Integer) pVar.f128594a;
                Integer num2 = (Integer) pVar.f128595b;
                if (num == null || num2 == null) {
                    o0VarE.C(-1765139214);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1765229548);
                    c(num.intValue(), num2.intValue(), 0, o0VarE);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1765129294);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bt1.m(cVar, str, str2, rVar, z14, i14);
        }
    }

    public static final void c(int i14, int i15, int i16, p3.m mVar) {
        int iA;
        o0 o0VarE = mVar.E(1186613339);
        int i17 = (o0VarE.k(i14) ? 4 : 2) | i16 | (o0VarE.k(i15) ? 32 : 16);
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            int iA2 = R.string.no_value_card;
            if (i15 == 0) {
                iA = R.string.no_value_card;
            } else {
                wd1.a.f184362c.getClass();
                iA = wd1.a.C3418a.a(wd1.a.C3418a.b(i15));
            }
            if (i14 != 0) {
                wd1.a.f184362c.getClass();
                iA2 = wd1.a.C3418a.a(wd1.a.C3418a.b(i14));
            }
            k.a(gl1.y.Q(o0VarE, iA), gl1.y.Q(o0VarE, R.string.lbl_highest_logging_rate), gl1.y.Q(o0VarE, iA2), gl1.y.Q(o0VarE, R.string.lbl_lowest_logging_rate), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a71.l(i14, i15, i16, 7);
        }
    }
}
