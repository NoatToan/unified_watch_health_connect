package v02;

import b63.v;
import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import h4.d;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import v.h;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static final void a(boolean z14, v vVar, String str, String str2, boolean z15, v vVar2, String str3, String str4, l<? super Boolean, Unit> lVar, l<? super v, Unit> lVar2, l<? super Boolean, Unit> lVar3, l<? super v, Unit> lVar4, m mVar, int i14, int i15) {
        int i16;
        v vVar3;
        String str5;
        String str6;
        boolean z16;
        v vVar4;
        String str7;
        String str8;
        l<? super Boolean, Unit> lVar5;
        int i17;
        vVar.getClass();
        str.getClass();
        str2.getClass();
        vVar2.getClass();
        str3.getClass();
        str4.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        o0 o0VarE = mVar.E(-89819633);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            vVar3 = vVar;
            i16 |= o0VarE.r(vVar3) ? 32 : 16;
        } else {
            vVar3 = vVar;
        }
        if ((i14 & 384) == 0) {
            str5 = str;
            i16 |= o0VarE.B(str5) ? 256 : 128;
        } else {
            str5 = str;
        }
        if ((i14 & 3072) == 0) {
            str6 = str2;
            i16 |= o0VarE.B(str6) ? 2048 : 1024;
        } else {
            str6 = str2;
        }
        if ((i14 & 24576) == 0) {
            z16 = z15;
            i16 |= o0VarE.h(z16) ? 16384 : 8192;
        } else {
            z16 = z15;
        }
        if ((196608 & i14) == 0) {
            vVar4 = vVar2;
            i16 |= o0VarE.r(vVar4) ? 131072 : 65536;
        } else {
            vVar4 = vVar2;
        }
        if ((1572864 & i14) == 0) {
            str7 = str3;
            i16 |= o0VarE.B(str7) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            str7 = str3;
        }
        if ((12582912 & i14) == 0) {
            str8 = str4;
            i16 |= o0VarE.B(str8) ? 8388608 : 4194304;
        } else {
            str8 = str4;
        }
        if ((100663296 & i14) == 0) {
            lVar5 = lVar;
            i16 |= o0VarE.r(lVar5) ? 67108864 : 33554432;
        } else {
            lVar5 = lVar;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i16 |= o0VarE.r(lVar2) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i17 = i15 | (o0VarE.r(lVar3) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.r(lVar4) ? 32 : 16;
        }
        int i18 = i17;
        if (o0VarE.n(i16 & 1, ((i16 & 306783379) == 306783378 && (i18 & 19) == 18) ? false : true)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            d.f81522a.getClass();
            z zVarA = y.a(kVar, d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
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
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            int i19 = i16 >> 6;
            int i24 = i16 << 6;
            int i25 = (i19 & 126) | (i24 & 896) | (i24 & 7168);
            int i26 = i16 >> 12;
            b(str5, str6, z14, vVar3, lVar5, lVar2, o0VarE, i25 | (i26 & 57344) | (i26 & 458752));
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(x2.h(aVar, j92.b.f97899b.f97921f), o0VarE);
            int i27 = i18 << 12;
            b(str7, str8, z16, vVar4, lVar3, lVar4, o0VarE, (i19 & 7168) | ((i16 >> 18) & 126) | (i19 & 896) | (i27 & 57344) | (i27 & 458752));
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(z14, vVar, str, str2, z15, vVar2, str3, str4, lVar, lVar2, lVar3, lVar4, i14, i15);
        }
    }

    public static final void b(String str, String str2, boolean z14, v vVar, l<? super Boolean, Unit> lVar, l<? super v, Unit> lVar2, m mVar, int i14) {
        int i15;
        String str3;
        o0 o0Var;
        o0 o0VarE = mVar.E(452644147);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            str3 = str2;
            i15 |= o0VarE.B(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(vVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar2) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            d.f81522a.getClass();
            z zVarA = y.a(kVar, d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
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
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            int i16 = i15;
            l72.p2 p2Var = l72.p2.f111205a;
            p2Var.h(str, str3, null, null, null, false, false, null, f.c(-1838279914, new c21.a(z14, lVar, 7), o0VarE), null, null, o0VarE, (i16 & 14) | 100663296 | (i16 & 112), 0, 1788);
            o0Var = o0VarE;
            if (z14) {
                o0Var.C(-2130877710);
                Object objQ = o0Var.q();
                m.f135153a.getClass();
                m.a.C2565a c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p0.n(Boolean.FALSE);
                    o0Var.K(objQ);
                }
                p1 p1Var = (p1) objQ;
                String strQ = gl1.y.Q(o0Var, R.string.lbl_alarm_time);
                j0 j0Var = j0.f23099a;
                int hour = vVar.f16219a.getHour();
                int minute = vVar.f16219a.getMinute();
                j0Var.getClass();
                String strC = j0.C(hour, minute);
                e eVarC = f.c(1929366321, new c21.b(vVar, strQ, lVar2, p1Var, 1), o0Var);
                Object objQ2 = o0Var.q();
                if (objQ2 == c2565a) {
                    objQ2 = new tn.h(p1Var, 25);
                    o0Var.K(objQ2);
                }
                p2Var.h(strQ, strC, null, null, null, false, false, null, eVarC, null, (e23.a) objQ2, o0Var, 100663296, 6, 764);
                o0Var = o0Var;
                o0Var.g0(false);
            } else {
                o0Var.C(-2129271879);
                o0Var.g0(false);
            }
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ux1.e(str, str2, z14, vVar, lVar, lVar2, i14);
        }
    }
}
