package au0;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import i3.ba;
import i3.kb;
import i3.mh;
import i3.na;
import i3.sg;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import kotlin.m3;
import kotlin.t1;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.a2;
import u1.y0;
import v62.s9;

/* JADX INFO: loaded from: classes9.dex */
public final class p {
    public static final void a(int i14, e23.a aVar, e23.a aVar2, h4.r rVar, String str, String str2, p3.m mVar, boolean z14) {
        o0 o0VarE = mVar.E(-493250831);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192) | (o0VarE.B(rVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarE = u1.n.e(x2.f(rVar, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarE, eVar.f97920e);
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            float f14 = eVar.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            l72.f0 f0Var = l72.f0.f110999a;
            h4.r.a aVar4 = h4.r.S;
            f0Var.i(str, x2.f(aVar4, 1.0f), false, aVar, o0VarE, (i15 & 7168) | (i15 & 14) | 48, 4);
            f0Var.d((i15 & 112) | 384 | ((i15 << 3) & 7168) | (i15 & 57344), 1, aVar2, x2.f(aVar4, 1.0f), str2, o0VarE, null, z14);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(str, str2, z14, aVar, aVar2, rVar, i14, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(String str, String str2, boolean z14, boolean z15, boolean z16, String str3, boolean z17, boolean z18, boolean z19, e23.l lVar, e23.l lVar2, e23.a aVar, p3.m mVar, int i14) {
        h4.r.a aVar2;
        j92.e eVar;
        int i15;
        float f14;
        int i16;
        o0 o0VarE = mVar.E(1205817787);
        int i17 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.h(z15) ? 2048 : 1024) | (o0VarE.h(z16) ? 16384 : 8192) | (o0VarE.h(z17) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.h(z18) ? 8388608 : 4194304);
        int i18 = (o0VarE.r(lVar2) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i17 & 1, ((273228947 & i17) == 273228946 && (i18 & 19) == 18) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarB = a2.b(x2.d(aVar3, 1.0f), a2.a(o0VarE), true);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f15 = eVar2.f97920e;
            float f16 = eVar2.f97920e;
            h4.r rVarY = c2.l.y(rVarB, f15);
            bVar.getClass();
            h4.r rVarC = c2.l.C(rVarY, 0.0f, 0.0f, 0.0f, eVar2.f97923h, 7);
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar4, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if (z17) {
                aVar2 = aVar3;
                eVar = eVar2;
                i15 = 0;
                o0VarE.C(-427389199);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-427747962);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_enter_distance);
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
                bVar.getClass();
                float f17 = eVar2.f97920e;
                bVar.getClass();
                h4.r rVarC3 = c2.l.C(aVar3, 0.0f, eVar2.f97921f, 0.0f, f17, 5);
                aVar2 = aVar3;
                eVar = eVar2;
                i15 = 0;
                mh.c(strQ, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                o0VarE.g0(false);
            }
            if (z17) {
                bVar.getClass();
                f14 = f16;
            } else {
                g6.f.a aVar6 = g6.f.f75994b;
                f14 = i15;
            }
            if (z17) {
                o0VarE = o0VarE;
                o0VarE = o0VarE;
                i16 = R.string.msg_enter_treadmill_distance;
            } else {
                o0VarE = o0VarE;
                o0VarE = o0VarE;
                i16 = R.string.msg_enter_distance;
            }
            String strQ2 = gl1.y.Q(o0VarE, i16);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            bVar.getClass();
            o0 o0Var = o0VarE;
            mh.c(strQ2, c2.l.C(aVar2, 0.0f, f14, 0.0f, eVar.f97921f, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 131068);
            int i19 = (i17 >> 9) & 112;
            int i24 = i18 << 9;
            d(str, z16, lVar, lVar2, aVar, o0Var, (i17 & 14) | i19 | 384 | (i24 & 7168) | (i24 & 57344));
            bVar.getClass();
            h4.r rVarC4 = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, z15 ? eVar.f97922g : f16, 7);
            fVar.getClass();
            mh.c(str2, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97931h, o0Var, (i17 >> 3) & 14, 0, 131068);
            boolean z24 = (z18 && z17) ? 1 : i15;
            a.f12847a.getClass();
            r1.c0.c(b0Var, z24, null, null, null, null, a.f12848b, o0Var, 1572870, 30);
            r1.c0.c(b0Var, z16, null, null, null, null, z3.f.c(-258453120, new c(str, str2, z14, lVar, str3, 0), o0Var), o0Var, 1572870 | i19, 30);
            o0VarE = o0Var;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(str, str2, z14, z15, z16, str3, z17, z18, z19, lVar, lVar2, aVar, i14, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(boolean z14, boolean z15, boolean z16, int i14, boolean z17, e23.l lVar, p3.m mVar, int i15) {
        o0 o0Var;
        double d14;
        double d15;
        double d16;
        String str;
        Object objV;
        p1 p1Var;
        p1 p1Var2;
        boolean z18;
        int i16;
        int i17;
        int iF;
        lVar.getClass();
        o0 o0VarE = mVar.E(-14973115);
        int i18 = i15 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.h(z15) ? 32 : 16) | (o0VarE.h(z16) ? 256 : 128) | (o0VarE.k(i14) ? 2048 : 1024) | (o0VarE.h(z17) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536);
        if (o0VarE.n(i18 & 1, (74899 & i18) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = String.valueOf(DecimalFormatSymbols.getInstance(Locale.getDefault()).getDecimalSeparator());
                o0VarE.K(objQ);
            }
            String str2 = (String) objQ;
            int i19 = i18 & 7168;
            int i24 = i18 & 14;
            int i25 = i18 & 57344;
            boolean z19 = (i19 == 2048) | (i24 == 4) | (i25 == 16384);
            Object objQ2 = o0VarE.q();
            if (z19 || objQ2 == c2565a) {
                if (z17 && z14) {
                    d16 = i14;
                } else {
                    if (z14) {
                        d14 = i14;
                        d15 = 1000.0d;
                    } else {
                        d14 = i14;
                        d15 = 1609.344d;
                    }
                    d16 = d14 / d15;
                }
                str = str2;
                objV = d53.u.v(String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d16)}, 1)), ".", str, false);
                o0VarE.K(objV);
            } else {
                objV = objQ2;
                str = str2;
            }
            String str3 = (String) objV;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(str3);
                o0VarE.K(objQ3);
            }
            p1 p1Var3 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ4);
            }
            p1 p1Var4 = (p1) objQ4;
            m3 m3Var = (m3) o0VarE.A(t1.f91499q);
            m4.q qVar = (m4.q) o0VarE.A(t1.f91491i);
            if (z17 && z14) {
                i16 = -1504230557;
                p1Var = p1Var4;
                i17 = R.string.lbl_m;
                p1Var2 = p1Var3;
                z18 = false;
            } else {
                p1Var = p1Var4;
                p1Var2 = p1Var3;
                z18 = false;
                if (z14) {
                    i16 = -1504228732;
                    i17 = R.string.lbl_km;
                } else {
                    i16 = -1504227194;
                    i17 = R.string.lbl_mile;
                }
            }
            String strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i16, i17, o0VarE, z18);
            boolean z24 = (z15 || !((Boolean) p1Var.getF182175a()).booleanValue()) ? z18 : true;
            boolean zB = (i19 == 2048) | o0VarE.B((String) p1Var2.getF182175a()) | (i24 == 4) | (i25 == 16384);
            Object objQ5 = o0VarE.q();
            if (zB || objQ5 == c2565a) {
                objQ5 = Boolean.valueOf(i14 > 0 && ((iF = f((String) p1Var2.getF182175a(), z14, z17)) < i14 / 2 || iF > i14 * 2));
                o0VarE.K(objQ5);
            }
            boolean zBooleanValue = ((Boolean) objQ5).booleanValue();
            z3.e eVarC = z3.f.c(1157810185, new an1.i(z16, 1), o0VarE);
            h hVar = new h(qVar, strJ, z14, z15, z24, str, z16, zBooleanValue, z17, m3Var, lVar, i14, p1Var2, p1Var, 0);
            o0Var = o0VarE;
            kb.a(null, eVarC, null, null, null, 0, 0L, 0L, null, z3.f.c(-539377708, hVar, o0Var), o0Var, 805306416, 509);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(z14, z15, z16, i14, z17, lVar, i15, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(String str, boolean z14, e23.l<? super String, Unit> lVar, e23.l<? super Boolean, Unit> lVar2, e23.a<Unit> aVar, p3.m mVar, int i14) {
        e23.a<Unit> aVar2;
        long jA;
        boolean z15;
        o0 o0VarE = mVar.E(2065713590);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = Character.valueOf(DecimalFormatSymbols.getInstance(Locale.getDefault()).getDecimalSeparator());
                o0VarE.K(objQ);
            }
            char cCharValue = ((Character) objQ).charValue();
            boolean z16 = (i15 & 14) == 4;
            Object objQ2 = o0VarE.q();
            if (z16 || objQ2 == c2565a) {
                objQ2 = p0.n(str);
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) objQ2;
            h4.r.a aVar3 = h4.r.S;
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar3, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            String str2 = (String) p1Var.getF182175a();
            h4.r rVarX = x2.x(aVar3, null, 3);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarW = x2.w(rVarX, eVar.f97922g, 0.0f, 2);
            bVar2.getClass();
            h4.r rVarC2 = c2.l.C(rVarW, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
            boolean z17 = (i15 & 7168) == 2048;
            Object objQ3 = o0VarE.q();
            if (z17 || objQ3 == c2565a) {
                objQ3 = new a12.a(lVar2, 9);
                o0VarE.K(objQ3);
            }
            h4.r rVarB = m4.e.b(rVarC2, (e23.l) objQ3);
            x5.v.f188954b.getClass();
            int i16 = x5.v.f188957e;
            x5.p.f188918b.getClass();
            p006l2.a2 a2Var = new p006l2.a2(0, (Boolean) null, i16, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
            d92.b.f58624b.getClass();
            x0 x0Var = j92.f.f97929f;
            d6.h.f57752b.getClass();
            x0 x0VarA = x0.a(x0Var, 0L, 0L, null, null, 0L, null, null, d6.h.f57755e, 0L, null, null, 16744447);
            m1.a aVar5 = m1.f128891a;
            ba baVar = ba.f87580a;
            long jA2 = d92.b.a(o0VarE).j().a();
            long jY = sn.a.y(o0VarE);
            if (z14) {
                o0VarE.C(2047400455);
                o0VarE.g0(false);
                o4.d0.f128823b.getClass();
                jA = o4.d0.f128831j;
            } else {
                o0VarE.C(2047401570);
                jA = d92.b.a(o0VarE).j().a();
                o0VarE.g0(false);
            }
            baVar.getClass();
            int i17 = i15;
            sg sgVarC = ba.c(0L, 0L, 0L, 0L, 0L, jA, null, jA2, jY, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, o0VarE, 2147477247);
            o0VarE = o0VarE;
            boolean zB = ((i17 & 896) == 256) | o0VarE.B(p1Var);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a) {
                z15 = false;
                objQ4 = new e(lVar, cCharValue, p1Var, 0);
                o0VarE.K(objQ4);
            } else {
                z15 = false;
            }
            na.a(str2, (e23.l) objQ4, rVarB, false, z14, x0VarA, null, null, a2Var, null, true, 0, 0, aVar5, sgVarC, o0VarE, (i17 << 9) & 57344, 12779520, 48, 1933256);
            if (z14) {
                o0VarE.C(-954992537);
                h4.r rVarD = uVar.d(aVar3);
                Object objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    objQ5 = kg.f.b(o0VarE);
                }
                a2.j jVar = (a2.j) objQ5;
                boolean z18 = (i17 & 57344) == 16384;
                Object objQ6 = o0VarE.q();
                if (z18 || objQ6 == c2565a) {
                    aVar2 = aVar;
                    objQ6 = new as.n(aVar2, 11);
                    o0VarE.K(objQ6);
                } else {
                    aVar2 = aVar;
                }
                c2.q.a(u1.w.b(rVarD, jVar, null, false, null, null, (e23.a) objQ6, 28), o0VarE, 0);
                o0VarE.g0(false);
            } else {
                aVar2 = aVar;
                o0VarE.C(-954685978);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(str, z14, lVar, lVar2, aVar2, i14, 0);
        }
    }

    public static final void e(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1004259765);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(aVar, eVar.f97918c, 0.0f, 2);
            bVar.getClass();
            h4.r rVarC = c2.l.C(rVarA, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            s62.a.f157643a.getClass();
            u4.d dVarA = s9.a(t62.b.f162798a);
            bVar.getClass();
            y0.b(dVarA, "", x2.q(aVar, j92.b.f97901d.f97904c), null, o0VarE, 48, 120);
            String strQ = gl1.y.Q(o0VarE, R.string.msg_treadmill_distance_error);
            d92.b.f58624b.getClass();
            x0 x0VarA = x0.a(j92.f.f97933j, d92.b.a(o0VarE).k().e(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
            bVar.getClass();
            mh.c(strQ, c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new as0.b(i14);
        }
    }

    public static final int f(String str, boolean z14, boolean z15) {
        Double dF = d53.s.f(d53.u.v(str, ",", ".", false));
        double dDoubleValue = dF != null ? dF.doubleValue() : 0.0d;
        if (z15 && z14) {
            return (int) dDoubleValue;
        }
        return (int) (dDoubleValue * (z14 ? 1000.0d : 1609.344d));
    }
}
