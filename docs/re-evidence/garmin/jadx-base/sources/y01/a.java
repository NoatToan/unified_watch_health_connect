package y01;

import c2.q2;
import c2.s2;
import c2.u2;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.h7;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:87:0x01de  */
    public static final void a(h4.r rVar, String str, boolean z14, h4.r rVar2, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        h4.r rVar3;
        int i16;
        String str2;
        h4.r rVar4;
        h4.r rVar5;
        h4.r rVar6;
        h4.r rVarA;
        h4.r rVar7;
        int i17;
        str.getClass();
        o0 o0VarE = mVar.E(-140808927);
        int i18 = i15 & 1;
        if (i18 != 0) {
            i16 = i14 | 6;
            rVar3 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar3 = rVar;
            i16 = (o0VarE.B(rVar3) ? 4 : 2) | i14;
        } else {
            rVar3 = rVar;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            str2 = str;
            i16 |= o0VarE.B(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            if ((i15 & 8) == 0) {
                rVar4 = rVar2;
                int i19 = o0VarE.B(rVar4) ? 2048 : 1024;
                i16 |= i19;
            } else {
                rVar4 = rVar2;
            }
            i16 |= i19;
        } else {
            rVar4 = rVar2;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                h4.r rVar8 = i18 != 0 ? h4.r.S : rVar3;
                if ((i15 & 8) != 0) {
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    rVarA = c2.l.A(aVar2, 0.0f, j92.b.f97899b.f97919d, 1);
                    i16 &= -7169;
                } else {
                    rVarA = rVar4;
                }
                rVar7 = rVar8;
                i17 = i16;
            } else {
                o0VarE.e();
                if ((i15 & 8) != 0) {
                    i16 &= -7169;
                }
                rVar7 = rVar3;
                i17 = i16;
                rVarA = rVar4;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarC = c2.l.C(rVar7, f14, 0.0f, eVar.f97917b, 0.0f, 10);
            h4.r rVar9 = rVar7;
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            h4.r rVarA2 = u2.f22900a.a(rVarA, 1.0f, true);
            d6.h.f57752b.getClass();
            d6.h hVarA = d6.h.a(d6.h.f57757g);
            d92.b.f58624b.getClass();
            mh.c(str2, rVarA2, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, (i17 >> 3) & 14, 0, 130044);
            o0VarE = o0VarE;
            if (!z14 || aVar == null) {
                o0VarE.C(-538243579);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-538836516);
                String strQ = gl1.y.Q(o0VarE, R.string.calories_edit_button);
                h4.r.a aVar4 = h4.r.S;
                boolean zB = o0VarE.B(strQ);
                Object objQ = o0VarE.q();
                if (zB) {
                    objQ = new u91.c(strQ, 28);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new u91.c(strQ, 28);
                        o0VarE.K(objQ);
                    }
                }
                h4.r rVarC3 = p5.v.c((e23.l) objQ, aVar4, false);
                b.f192985a.getClass();
                h7.a(aVar, rVarC3, false, null, null, b.f192986b, o0VarE, ((i17 >> 12) & 14) | 1572864, 60);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            rVar6 = rVarA;
            rVar5 = rVar9;
        } else {
            o0VarE.e();
            rVar5 = rVar3;
            rVar6 = rVar4;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.a(rVar5, str, z14, rVar6, aVar, i14, i15);
        }
    }
}
