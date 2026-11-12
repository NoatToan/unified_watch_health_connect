package gs;

import android.annotation.SuppressLint;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.y;
import c2.z;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import h5.e0;
import i3.mh;
import i3.v5;
import kotlin.t1;
import lc.u0;
import o4.f0;
import org.apache.commons.lang3.StringUtils;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.y3;
import p5.v;
import s5.x0;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78636a;

        static {
            int[] iArr = new int[jr.t.values().length];
            try {
                iArr[jr.t.YOGA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jr.t.CARDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jr.t.SWIMMING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[jr.t.ESPORTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[jr.t.STRENGTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[jr.t.TRACK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[jr.t.WINTER_SPORTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[jr.t.WALKING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[jr.t.CYCLING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[jr.t.HIKING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[jr.t.OTHER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[jr.t.RUNNING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f78636a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00e7  */
    public static final void a(t2 t2Var, z3.e eVar, String str, @SuppressLint({"ModifierParameter"}) h4.r rVar, long j8, b92.a aVar, p3.m mVar, int i14) {
        int i15;
        String str2;
        o0 o0VarE = mVar.E(-1841379463);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(null) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(rVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.l(j8) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= (2097152 & i14) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            if (aVar == null || (str2 = aVar.f16961a.get("merge")) == null) {
                str2 = "";
            }
            boolean zB = o0VarE.B(str2);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new gp.j(str2, 2);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gp.j(str2, 2);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarB = v.b(rVar, (e23.l) objQ);
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarThen = rVarB.then(t2Var.a(aVar2, 0.5f, true));
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarThen, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            int i16 = i15;
            v5.a(0.0f, (i15 >> 9) & 896, 3, j8, null, o0VarE);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC2 = c2.l.C(aVar2, 0.0f, j92.b.f97899b.f97917b, 0.0f, 0.0f, 13);
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            eVar.invoke(u2.f22900a, o0VarE, Integer.valueOf((i16 & 112) | 6));
            o0VarE.g0(true);
            o0VarE.C(-940174750);
            String str3 = str == null ? "" : str;
            d92.b.f58624b.getClass();
            mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(false);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(t2Var, eVar, str, rVar, j8, aVar, i14);
        }
    }

    public static final void b(t2 t2Var, String str, String str2, String str3, @SuppressLint({"ModifierParameter"}) h4.r rVar, long j8, p3.m mVar, int i14) {
        t2 t2Var2;
        int i15;
        h4.r rVar2;
        h4.r rVar3;
        o0 o0VarE = mVar.E(1332528939);
        if ((i14 & 6) == 0) {
            t2Var2 = t2Var;
            i15 = (o0VarE.B(t2Var2) ? 4 : 2) | i14;
        } else {
            t2Var2 = t2Var;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str2) ? 256 : 128;
        }
        int i16 = i15 | 3072;
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.B(str3) ? 16384 : 8192;
        }
        int i17 = i16 | 1769472;
        if ((12582912 & i14) == 0) {
            i17 |= o0VarE.l(j8) ? 8388608 : 4194304;
        }
        int i18 = i17 | 100663296;
        if (o0VarE.n(i18 & 1, (38347923 & i18) != 38347922)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar3 = h4.r.S;
            } else {
                o0VarE.e();
                rVar3 = rVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            StringBuilder sb3 = new StringBuilder();
            if (str2 != null) {
                sb3.append(str2);
                sb3.append(", ");
            }
            sb3.append(str);
            sb3.append(StringUtils.SPACE);
            if (str3 != null) {
                sb3.append(str3);
            }
            String string = sb3.toString();
            z3.e eVarC = z3.f.c(23997383, new c40.i(str, str3, 5), o0VarE);
            b92.a.C0235a c0235a = new b92.a.C0235a(null);
            c0235a.f16962a.put("merge", string);
            b92.a aVarB = c0235a.b();
            int i19 = (i18 & 14) | 48 | (i18 & 896) | (i18 & 7168);
            int i24 = i18 >> 6;
            int i25 = (i24 & 458752) | i19 | (57344 & i24);
            int i26 = b92.a.f16960b;
            a(t2Var2, eVarC, str2, rVar3, j8, aVarB, o0VarE, i25);
            rVar2 = rVar3;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(t2Var, str, str2, str3, rVar2, j8, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00a9  */
    public static final void c(t2 t2Var, String str, String str2, String str3, @SuppressLint({"ModifierParameter"}) h4.r rVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        h4.r rVar2;
        boolean z14;
        o0 o0VarE = mVar.E(1660178110);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str2) ? 256 : 128;
        }
        int i16 = i15 | 3072;
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.B(str3) ? 16384 : 8192;
        }
        int i17 = i16 | 1769472;
        if (o0VarE.n(i17 & 1, (i17 & 599187) != 599186)) {
            h4.r.a aVar = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            StringBuilder sb3 = new StringBuilder();
            if (str2 != null) {
                sb3.append(str2);
                sb3.append(", ");
            }
            sb3.append(str);
            sb3.append(StringUtils.SPACE);
            if (str3 != null) {
                sb3.append(str3);
            }
            String string = sb3.toString();
            boolean zB = o0VarE.B(string);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new gp.j(string, 3);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gp.j(string, 3);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarThen = v.b(aVar, (e23.l) objQ).then(t2Var.a(aVar, 0.5f, true));
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarThen, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(aVar, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            d92.b.f58623a.getClass();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97928e), o0VarE);
            u2Var.getClass();
            f5.p pVar = f5.b.f68892a;
            mh.c(str, u2Var.d(aVar, pVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, (i17 >> 3) & 14, 0, 131068);
            o0Var = o0VarE;
            if (str3 != null) {
                o0Var.C(-617606144);
                fVar2.getClass();
                x0 x0VarB2 = d92.c.b(j92.f.f97932i, o0Var);
                h4.r rVarD = u2Var.d(aVar, pVar);
                d92.b.f58625c.getClass();
                mh.c(str3, c2.l.C(rVarD, j92.b.f97899b.f97917b, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0Var, (i17 >> 12) & 14, 0, 131068);
                o0Var = o0Var;
                z14 = false;
                o0Var.g0(false);
            } else {
                z14 = false;
                o0Var.C(-617336630);
                o0Var.g0(false);
            }
            o0Var.g0(true);
            o0Var.C(180039761);
            String str4 = str2 == null ? "" : str2;
            fVar2.getClass();
            mh.c(str4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0Var), o0Var, 0, 0, 131070);
            o0Var.g0(z14);
            o0Var.g0(true);
            rVar2 = aVar;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.n(t2Var, str, str2, str3, rVar2, i14, 22);
        }
    }

    public static final void d(h4.r rVar, nr.p0 p0Var, float f14, ds.n nVar, p3.m mVar, int i14) {
        p0Var.getClass();
        o0 o0VarE = mVar.E(-1854739169);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.r(p0Var) ? 32 : 16) | (o0VarE.i(f14) ? 256 : 128) | (o0VarE.k(nVar == null ? -1 : nVar.ordinal()) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            nr.p0.a aVar = p0Var.f127286e;
            nr.p0.a.g gVar = aVar instanceof nr.p0.a.g ? (nr.p0.a.g) aVar : null;
            jr.t tVar = gVar != null ? gVar.f127300a : null;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            y3 y3Var = t1.f91490h;
            p3.v.a(y3Var.c(new is.n(((g6.c) o0VarE.A(y3Var)).getF94881a() * f14, 1.0f)), z3.f.c(863645791, new et.p(rVar, (p1) objQ, tVar, nVar, p0Var, 11), o0VarE), o0VarE, 56);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gs.a(rVar, p0Var, f14, nVar, i14, 4);
        }
    }

    public static final long e(jr.t tVar) {
        x1 x1Var = p3.n.f135158a;
        switch (a.f78636a[tVar.ordinal()]) {
            case 1:
                return f0.d(4294945535L);
            case 2:
                return f0.d(4289352960L);
            case 3:
                return f0.d(4283804330L);
            case 4:
                return f0.d(4289331285L);
            case 5:
                return f0.d(4289374890L);
            case 6:
                return f0.d(4294945365L);
            case 7:
                return f0.d(4289396735L);
            case 8:
            case 9:
            case 10:
            case 11:
                return f0.d(4294967295L);
            case 12:
                return f0.d(4278233855L);
            default:
                u0.r();
                return 0L;
        }
    }
}
