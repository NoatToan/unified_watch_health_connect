package nv;

import c2.b0;
import c2.j;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
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
import u1.w;
import v.h;

/* JADX INFO: loaded from: classes7.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:81:0x0281  */
    public static final void a(r rVar, int i14, String str, String str2, e23.a<Unit> aVar, m mVar, int i15, int i16) {
        String str3;
        int i17;
        e23.a<Unit> aVar2;
        int i18;
        o0 o0Var;
        String str4;
        e23.a<Unit> aVar3;
        e23.a<Unit> aVar4;
        e23.a<Unit> aVar5;
        String str5;
        rVar.getClass();
        str.getClass();
        o0 o0VarE = mVar.E(1815657158);
        p3.c<?> cVar = o0VarE.f135177b;
        int i19 = i15 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128);
        int i24 = i16 & 8;
        if (i24 != 0) {
            i17 = i19 | 3072;
            str3 = str2;
        } else {
            str3 = str2;
            i17 = i19 | (o0VarE.B(str3) ? 2048 : 1024);
        }
        int i25 = i16 & 16;
        if (i25 != 0) {
            i18 = i17 | 24576;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i18 = i17 | (o0VarE.r(aVar2) ? 16384 : 8192);
        }
        if (o0VarE.n(i18 & 1, (i18 & 9363) != 9362)) {
            String str6 = i24 != 0 ? null : str3;
            if (i25 != 0) {
                aVar2 = null;
            }
            x1 x1Var = n.f135158a;
            j.f22691a.getClass();
            j.C0343j c0343j = j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            String strP = y.P(R.string.string_dot_space_string_pattern, new Object[]{String.valueOf(i14), y.Q(o0VarE, R.string.lbl_empty_string)}, o0VarE);
            d92.b.f58623a.getClass();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var = j92.f.f97932i;
            int i26 = i18;
            e23.a<Unit> aVar7 = aVar2;
            mh.c(strP, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131070);
            r.a aVar8 = r.S;
            r rVarA = u2Var.a(aVar8, 1.0f, true);
            z zVarA = c2.y.a(j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarA, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            fVar2.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, (i26 >> 6) & 14, 0, 131070);
            o0Var = o0VarE;
            if (str6 == null) {
                o0Var.C(2065799870);
                o0Var.g0(false);
                str5 = str6;
                aVar5 = aVar7;
            } else {
                o0Var.C(2065799871);
                fVar2.getClass();
                x0 x0VarA = x0.a(x0Var, d92.b.a(o0Var).k().a(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                d92.b.f58625c.getClass();
                r rVarC3 = l.C(aVar8, 0.0f, j92.b.f97899b.f97916a, 0.0f, 0.0f, 13);
                boolean z14 = (i26 & 57344) == 16384;
                Object objQ = o0Var.q();
                if (z14) {
                    aVar4 = aVar7;
                    objQ = new ll0.a(aVar4, 28);
                    o0Var.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        aVar4 = aVar7;
                        objQ = new ll0.a(aVar4, 28);
                        o0Var.K(objQ);
                    } else {
                        aVar4 = aVar7;
                    }
                }
                aVar5 = aVar4;
                String str7 = str6;
                mh.c(str7, w.d(rVarC3, false, null, null, (e23.a) objQ, 15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, o0Var, 0, 0, 131068);
                str5 = str7;
                o0Var = o0Var;
                Unit unit = Unit.INSTANCE;
                o0Var.g0(false);
            }
            o0Var.g0(true);
            o0Var.g0(true);
            str4 = str5;
            aVar3 = aVar5;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            str4 = str3;
            aVar3 = aVar2;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(rVar, i14, str, str4, aVar3, i15, i16);
        }
    }
}
