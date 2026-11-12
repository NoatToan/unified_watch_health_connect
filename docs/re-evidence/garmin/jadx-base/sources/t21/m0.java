package t21;

import b21.n9;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.c3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCancellationBehavior;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import ew1.o1;
import i3.i7;
import i3.mh;
import java.util.List;
import l72.r1;
import l72.v2;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class m0 {
    /* JADX WARN: Code duplicated, block: B:100:0x0278  */
    /* JADX WARN: Code duplicated, block: B:103:0x028c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0313  */
    /* JADX WARN: Code duplicated, block: B:108:0x0325  */
    /* JADX WARN: Code duplicated, block: B:109:0x0373  */
    /* JADX WARN: Code duplicated, block: B:111:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:113:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:115:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:117:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:119:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:122:0x0407  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:43:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    /* JADX WARN: Code duplicated, block: B:45:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:52:0x0100  */
    /* JADX WARN: Code duplicated, block: B:55:0x010a  */
    /* JADX WARN: Code duplicated, block: B:56:0x010d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0143  */
    /* JADX WARN: Code duplicated, block: B:61:0x014a  */
    /* JADX WARN: Code duplicated, block: B:62:0x014e  */
    /* JADX WARN: Code duplicated, block: B:67:0x016f  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x01be  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x0201  */
    /* JADX WARN: Code duplicated, block: B:83:0x020a  */
    /* JADX WARN: Code duplicated, block: B:84:0x020e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0229  */
    /* JADX WARN: Code duplicated, block: B:92:0x0250  */
    /* JADX WARN: Code duplicated, block: B:94:0x0259  */
    /* JADX WARN: Code duplicated, block: B:95:0x025d  */
    public static final void a(final String str, final String str2, final boolean z14, final int i14, final e23.a<Unit> aVar, final int i15, final h4.r rVar, boolean z15, p3.m mVar, final int i16, final int i17) {
        boolean z16;
        boolean z17;
        final boolean z18;
        p2 p2VarI0;
        boolean z19;
        j92.b bVar;
        String strQ;
        String strQ2;
        int i18;
        int i19;
        boolean z24;
        boolean zB;
        Object objQ;
        h4.g gVar;
        f5.z0 z0VarD;
        int i24;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar2;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar2;
        h5.g.a.f fVar;
        c2.u uVar;
        h4.r.a aVar3;
        j92.e eVar2;
        float f14;
        c2.z zVarA;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        h4.g.b bVar3;
        s2 s2VarA;
        int iHashCode3;
        i2 i2VarA2;
        h4.r rVarC3;
        u2 u2Var;
        f5.z0 z0VarD2;
        int iHashCode4;
        i2 i2VarA3;
        h4.r rVarC4;
        float f15;
        boolean z25;
        boolean z26;
        float f16;
        j92.e eVar3;
        p3.o0 o0VarE = mVar.E(2014767952);
        p3.c<?> cVar = o0VarE.f135177b;
        int i25 = i16 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.k(i14) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.B(rVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        int i26 = i17 & 128;
        if (i26 == 0) {
            if ((i16 & 12582912) == 0) {
                z16 = z15;
                i25 |= o0VarE.h(z16) ? 8388608 : 4194304;
            }
            if ((4793491 & i25) != 4793490) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i25 & 1, z17)) {
                if (i26 != 0) {
                    z19 = false;
                } else {
                    z19 = z16;
                }
                x1 x1Var = p3.n.f135158a;
                d92.b.f58623a.getClass();
                bVar = d92.b.f58625c;
                bVar.getClass();
                k2.h hVarA = k2.i.a(j92.b.f97900c.f97911c);
                strQ = gl1.y.Q(o0VarE, R.string.lbl_selected);
                strQ2 = gl1.y.Q(o0VarE, R.string.lbl_not_selected);
                i18 = i25 >> 3;
                h4.r rVarA = v2.a(v2.a(u1.n.e(rVar, d92.b.a(o0VarE).c().a(), hVarA), z14, new o62.s0(hVarA, 29), o0VarE, i18 & 112), !z14, new ak0.p(aVar, 19), o0VarE, 0);
                i19 = i25 & 896;
                if (i19 == 256) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                zB = z24 | o0VarE.B(strQ) | o0VarE.B(strQ2);
                objQ = o0VarE.q();
                if (zB) {
                    objQ = new bg2.e(i15, strQ, strQ2, z14);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new bg2.e(i15, strQ, strQ2, z14);
                        o0VarE.K(objQ);
                    }
                }
                h4.r rVarC5 = p5.v.c((e23.l) objQ, rVarA, true);
                h4.d.f81522a.getClass();
                gVar = h4.d.a.f81524b;
                z0VarD = c2.q.d(gVar, false);
                i24 = i25;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarC5, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, z0VarD, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                uVar = c2.u.f22885a;
                aVar3 = h4.r.S;
                h4.r rVarF = x2.f(aVar3, 1.0f);
                bVar.getClass();
                eVar2 = j92.b.f97899b;
                float f17 = eVar2.f97920e;
                f14 = eVar2.f97919d;
                h4.r rVarY = c2.l.y(rVarF, f17);
                c2.j.f22691a.getClass();
                zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarY, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                h4.r rVarF2 = x2.f(aVar3, 1.0f);
                c2.j.g gVar2 = c2.j.f22698h;
                bVar3 = h4.d.a.f81533k;
                s2VarA = q2.a(gVar2, bVar3, o0VarE, 6);
                iHashCode3 = Long.hashCode(o0VarE.U);
                i2VarA2 = o0VarE.a0();
                rVarC3 = h4.k.c(rVarF2, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
                }
                b4.c(fVar, rVarC3, o0VarE);
                u2Var = u2.f22900a;
                h4.r rVarA2 = u2Var.a(aVar3, 1.0f, true);
                z0VarD2 = c2.q.d(gVar, false);
                iHashCode4 = Long.hashCode(o0VarE.U);
                i2VarA3 = o0VarE.a0();
                rVarC4 = h4.k.c(rVarA2, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD2, o0VarE);
                b4.c(c1623g, i2VarA3, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                    v.h.A(iHashCode4, o0VarE, iHashCode4, bVar2);
                }
                b4.c(fVar, rVarC4, o0VarE);
                b(null, i14, z14, o0VarE, ((i24 >> 6) & 112) | i19);
                if (z19) {
                    o0VarE.C(-811156261);
                    long jC = o4.d0.c(0.9f, d92.b.a(o0VarE).c().a(), 14);
                    o4.w.a aVar4 = o4.w.f129023a;
                    o4.d0 d0VarA = o4.d0.a(jC);
                    o4.d0.f128823b.getClass();
                    long j8 = o4.d0.f128831j;
                    o4.z0 z0VarI = o4.w.a.i(aVar4, p13.x.k(d0VarA, o4.d0.a(j8)), 0.0f, 14);
                    o4.z0 z0VarI2 = o4.w.a.i(aVar4, p13.x.k(o4.d0.a(j8), o4.d0.a(jC)), 0.0f, 14);
                    h4.r rVarF3 = x2.f(uVar.c(aVar3, h4.d.a.f81525c), 1.0f);
                    bVar.getClass();
                    f15 = f14;
                    h4.r rVarD = u1.n.d(x2.h(rVarF3, f15), z0VarI, null, 6);
                    z25 = false;
                    c2.q.a(rVarD, o0VarE, 0);
                    h4.r rVarF4 = x2.f(uVar.c(aVar3, h4.d.a.f81531i), 1.0f);
                    bVar.getClass();
                    c2.q.a(u1.n.d(x2.h(rVarF4, f15), z0VarI2, null, 6), o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    f15 = f14;
                    z25 = false;
                    o0VarE.C(-810144328);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                if (z14) {
                    o0VarE.C(667805131);
                    b3.b.f15502a.getClass();
                    u4.d dVarA = d3.f.a();
                    long jA = d92.b.a(o0VarE).f().a();
                    bVar.getClass();
                    eVar3 = eVar2;
                    h4.r rVarC6 = u2Var.c(c2.l.C(aVar3, eVar3.f97919d, 0.0f, 0.0f, 0.0f, 14), bVar3);
                    z26 = true;
                    f16 = f15;
                    i7.b(dVarA, null, rVarC6, jA, o0VarE, 48, 0);
                    o0VarE.g0(z25);
                } else {
                    z26 = true;
                    f16 = f15;
                    eVar3 = eVar2;
                    o0VarE.C(668167986);
                    o0VarE.g0(z25);
                }
                o0VarE.g0(z26);
                bVar.getClass();
                c2.l.f(x2.h(aVar3, eVar3.f97920e), o0VarE);
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, i24 & 14, 0, 131070);
                bVar.getClass();
                c2.l.f(x2.h(aVar3, f16), o0VarE);
                fVar2.getClass();
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, i18 & 14, 0, 131070);
                o0VarE = o0VarE;
                o0VarE.g0(z26);
                o0VarE.g0(z26);
                z18 = z19;
            } else {
                o0VarE.e();
                z18 = z16;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: t21.k0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        m0.a(str, str2, z14, i14, aVar, i15, rVar, z18, (p3.m) obj, p3.p0.t(i16 | 1), i17);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i25 |= 12582912;
        z16 = z15;
        if ((4793491 & i25) != 4793490) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (o0VarE.n(i25 & 1, z17)) {
            if (i26 != 0) {
                z19 = false;
            } else {
                z19 = z16;
            }
            x1 x1Var2 = p3.n.f135158a;
            d92.b.f58623a.getClass();
            bVar = d92.b.f58625c;
            bVar.getClass();
            k2.h hVarA2 = k2.i.a(j92.b.f97900c.f97911c);
            strQ = gl1.y.Q(o0VarE, R.string.lbl_selected);
            strQ2 = gl1.y.Q(o0VarE, R.string.lbl_not_selected);
            i18 = i25 >> 3;
            h4.r rVarA3 = v2.a(v2.a(u1.n.e(rVar, d92.b.a(o0VarE).c().a(), hVarA2), z14, new o62.s0(hVarA2, 29), o0VarE, i18 & 112), !z14, new ak0.p(aVar, 19), o0VarE, 0);
            i19 = i25 & 896;
            if (i19 == 256) {
                z24 = true;
            } else {
                z24 = false;
            }
            zB = z24 | o0VarE.B(strQ) | o0VarE.B(strQ2);
            objQ = o0VarE.q();
            if (zB) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new bg2.e(i15, strQ, strQ2, z14);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new bg2.e(i15, strQ, strQ2, z14);
                o0VarE.K(objQ);
            }
            h4.r rVarC7 = p5.v.c((e23.l) objQ, rVarA3, true);
            h4.d.f81522a.getClass();
            gVar = h4.d.a.f81524b;
            z0VarD = c2.q.d(gVar, false);
            i24 = i25;
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarC7, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            uVar = c2.u.f22885a;
            aVar3 = h4.r.S;
            h4.r rVarF5 = x2.f(aVar3, 1.0f);
            bVar.getClass();
            eVar2 = j92.b.f97899b;
            float f18 = eVar2.f97920e;
            f14 = eVar2.f97919d;
            h4.r rVarY2 = c2.l.y(rVarF5, f18);
            c2.j.f22691a.getClass();
            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarY2, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            h4.r rVarF6 = x2.f(aVar3, 1.0f);
            c2.j.g gVar3 = c2.j.f22698h;
            bVar3 = h4.d.a.f81533k;
            s2VarA = q2.a(gVar3, bVar3, o0VarE, 6);
            iHashCode3 = Long.hashCode(o0VarE.U);
            i2VarA2 = o0VarE.a0();
            rVarC3 = h4.k.c(rVarF6, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            } else {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            }
            b4.c(fVar, rVarC3, o0VarE);
            u2Var = u2.f22900a;
            h4.r rVarA4 = u2Var.a(aVar3, 1.0f, true);
            z0VarD2 = c2.q.d(gVar, false);
            iHashCode4 = Long.hashCode(o0VarE.U);
            i2VarA3 = o0VarE.a0();
            rVarC4 = h4.k.c(rVarA4, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD2, o0VarE);
            b4.c(c1623g, i2VarA3, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode4, o0VarE, iHashCode4, bVar2);
            } else {
                v.h.A(iHashCode4, o0VarE, iHashCode4, bVar2);
            }
            b4.c(fVar, rVarC4, o0VarE);
            b(null, i14, z14, o0VarE, ((i24 >> 6) & 112) | i19);
            if (z19) {
                o0VarE.C(-811156261);
                long jC2 = o4.d0.c(0.9f, d92.b.a(o0VarE).c().a(), 14);
                o4.w.a aVar5 = o4.w.f129023a;
                o4.d0 d0VarA2 = o4.d0.a(jC2);
                o4.d0.f128823b.getClass();
                long j14 = o4.d0.f128831j;
                o4.z0 z0VarI3 = o4.w.a.i(aVar5, p13.x.k(d0VarA2, o4.d0.a(j14)), 0.0f, 14);
                o4.z0 z0VarI4 = o4.w.a.i(aVar5, p13.x.k(o4.d0.a(j14), o4.d0.a(jC2)), 0.0f, 14);
                h4.r rVarF7 = x2.f(uVar.c(aVar3, h4.d.a.f81525c), 1.0f);
                bVar.getClass();
                f15 = f14;
                h4.r rVarD2 = u1.n.d(x2.h(rVarF7, f15), z0VarI3, null, 6);
                z25 = false;
                c2.q.a(rVarD2, o0VarE, 0);
                h4.r rVarF8 = x2.f(uVar.c(aVar3, h4.d.a.f81531i), 1.0f);
                bVar.getClass();
                c2.q.a(u1.n.d(x2.h(rVarF8, f15), z0VarI4, null, 6), o0VarE, 0);
                o0VarE.g0(false);
            } else {
                f15 = f14;
                z25 = false;
                o0VarE.C(-810144328);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            if (z14) {
                o0VarE.C(667805131);
                b3.b.f15502a.getClass();
                u4.d dVarA2 = d3.f.a();
                long jA2 = d92.b.a(o0VarE).f().a();
                bVar.getClass();
                eVar3 = eVar2;
                h4.r rVarC8 = u2Var.c(c2.l.C(aVar3, eVar3.f97919d, 0.0f, 0.0f, 0.0f, 14), bVar3);
                z26 = true;
                f16 = f15;
                i7.b(dVarA2, null, rVarC8, jA2, o0VarE, 48, 0);
                o0VarE.g0(z25);
            } else {
                z26 = true;
                f16 = f15;
                eVar3 = eVar2;
                o0VarE.C(668167986);
                o0VarE.g0(z25);
            }
            o0VarE.g0(z26);
            bVar.getClass();
            c2.l.f(x2.h(aVar3, eVar3.f97920e), o0VarE);
            j92.f fVar3 = d92.b.f58624b;
            fVar3.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, i24 & 14, 0, 131070);
            bVar.getClass();
            c2.l.f(x2.h(aVar3, f16), o0VarE);
            fVar3.getClass();
            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, i18 & 14, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(z26);
            o0VarE.g0(z26);
            z18 = z19;
        } else {
            o0VarE.e();
            z18 = z16;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: t21.k0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m0.a(str, str2, z14, i14, aVar, i15, rVar, z18, (p3.m) obj, p3.p0.t(i16 | 1), i17);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    public static final void b(h4.r rVar, int i14, boolean z14, p3.m mVar, int i15) {
        p3.o0 o0Var;
        h4.r rVar2;
        p3.o0 o0VarE = mVar.E(-1314208468);
        int i16 = i15 | 6;
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.k(i14) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.h(z14) ? 256 : 128;
        }
        int i17 = i16;
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            h4.r.a aVar = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m40boximpl(LottieCompositionSpec.RawRes.m41constructorimpl(i14)), null, null, null, null, null, o0VarE, 0, 62);
            LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState(lottieCompositionResultRememberLottieComposition.getF182175a(), z14, true, false, null, 0.0f, Integer.MAX_VALUE, LottieCancellationBehavior.OnIterationFinish, false, false, o0VarE, ((i17 >> 3) & 112) | 14156160, 824);
            LottieComposition f182175a = lottieCompositionResultRememberLottieComposition.getF182175a();
            boolean zB = o0VarE.B(lottieAnimationStateAnimateLottieCompositionAsState);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new fx0.e(lottieAnimationStateAnimateLottieCompositionAsState, 2);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new fx0.e(lottieAnimationStateAnimateLottieCompositionAsState, 2);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            LottieAnimationKt.LottieAnimation(f182175a, (e23.a) objQ, aVar, false, false, false, null, false, null, null, null, false, false, null, null, false, o0Var, (i17 << 6) & 896, 0, 65528);
            rVar2 = aVar;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o1(rVar2, i14, z14, i15);
        }
    }

    public static final void c(s21.c cVar, e23.l lVar, h4.r rVar, p3.m mVar, int i14) {
        int i15;
        s21.c cVar2;
        p3.o0 o0VarE = mVar.E(1245740052);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(cVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(rVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            c22.x0.f23314a.getClass();
            r1.b(gl1.d.W(c22.x0.Pd), null, o0VarE, 0, 2);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(rVarF, eVar.f97920e, 0.0f, 2);
            bVar2.getClass();
            h4.r rVarC2 = c2.l.C(rVarA, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new u(5);
                o0VarE.K(objQ);
            }
            h4.r rVarC3 = p5.v.c((e23.l) objQ, rVarC2, false);
            bVar2.getClass();
            float f14 = eVar.f97920e;
            cVar2 = cVar;
            r21.f.a(rVarC3, f14, z3.f.c(60645368, new rx1.u(cVar2, 20, b0Var, lVar), o0VarE), o0VarE, 384);
            o0VarE.g0(true);
        } else {
            cVar2 = cVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(cVar2, lVar, rVar, i14, 0);
        }
    }

    public static final void d(p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(2075699713);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarC = c2.l.C(rVarF, 0.0f, f14, 0.0f, eVar.f97919d, 5);
            bVar.getClass();
            h4.r rVarA = c2.l.A(rVarC, eVar.f97920e, 0.0f, 2);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarF2 = x2.f(aVar, 1.0f);
            h4.g.a aVar3 = h4.d.a.f81537o;
            h4.r rVarB = b0Var.b(rVarF2, aVar3);
            c22.x0.f23314a.getClass();
            String strW = gl1.d.W(c22.x0.Ee);
            d6.h.f57752b.getClass();
            int i15 = d6.h.f57755e;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(strW, rVarB, 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 130044);
            h4.r rVarB2 = b0Var.b(x2.f(aVar, 1.0f), aVar3);
            bVar.getClass();
            h4.r rVarC3 = c2.l.C(rVarB2, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
            String strW2 = gl1.d.W(c22.x0.Cd);
            fVar.getClass();
            mh.c(strW2, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 130044);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(i14);
        }
    }

    public static final void e(int i14, e23.a aVar, String str, String str2, String str3, p3.m mVar, boolean z14) {
        p3.o0 o0Var;
        int i15;
        h4.r.a aVar2;
        boolean z15;
        p3.o0 o0VarE = mVar.E(1862609675);
        int i16 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.B(str3) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            i.f161891a.getClass();
            z3.e eVar = i.f161892b;
            h4.r.a aVar3 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar3, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if (g22.n.d(str2)) {
                o0VarE.C(-331170210);
                o0Var = o0VarE;
                int i17 = i16 & 126;
                int i18 = (i16 >> 6) & 14;
                i15 = i16;
                z15 = false;
                aVar2 = aVar3;
                l72.p2.f111205a.h(str, str2, null, null, null, false, false, null, z14 ? eVar : null, null, aVar, o0Var, i17, i18, 764);
                o0Var.g0(false);
            } else {
                i15 = i16;
                aVar2 = aVar3;
                z15 = false;
                o0Var = o0VarE;
                o0Var.C(-330928503);
                l72.p2.f111205a.g(str, null, null, null, z14 ? eVar : null, false, false, aVar, o0Var, (i15 & 14) | ((i15 << 18) & 234881024), 238);
                o0Var.g0(false);
            }
            if (str3 != null) {
                o0Var.C(-330677031);
                h4.r rVarF = x2.f(aVar2, 1.0f);
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f14 = eVar2.f97920e;
                bVar2.getClass();
                h4.r rVarZ = c2.l.z(rVarF, f14, eVar2.f97917b);
                d6.h.f57752b.getClass();
                int i19 = d6.h.f57757g;
                d92.b.f58624b.getClass();
                p3.o0 o0Var2 = o0Var;
                mh.c(str3, rVarZ, 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0Var), o0Var2, (i15 >> 12) & 14, 0, 130044);
                o0Var = o0Var2;
                o0Var.g0(false);
            } else {
                o0Var.C(-330340371);
                o0Var.g0(z15);
            }
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p21.f(str, str2, aVar, z14, str3, i14);
        }
    }

    public static final void f(u21.s sVar, v21.e eVar, e23.l<? super s21.c, Unit> lVar, e23.a<Unit> aVar, e23.l<? super s21.k, Unit> lVar2, e23.l<? super b63.v, Unit> lVar3, e23.l<? super b63.v, Unit> lVar4, e23.a<Unit> aVar2, p3.m mVar, int i14, int i15) {
        e23.l<? super s21.c, Unit> lVar5;
        int i16;
        e23.a<Unit> aVar3;
        int i17;
        e23.l<? super s21.k, Unit> lVar6;
        int i18;
        e23.l<? super b63.v, Unit> lVar7;
        int i19;
        int i24;
        int i25;
        e23.a<Unit> aVar4;
        e23.l<? super b63.v, Unit> lVar8;
        e23.l<? super s21.c, Unit> lVar9;
        e23.l<? super s21.k, Unit> lVar10;
        e23.l<? super b63.v, Unit> lVar11;
        int i26;
        e23.l<? super b63.v, Unit> lVar12;
        e23.l<? super b63.v, Unit> lVar13;
        e23.l<? super b63.v, Unit> lVar14;
        boolean z14;
        sVar.getClass();
        s21.c cVar = sVar.f168114c;
        boolean z15 = sVar.f168115d;
        eVar.getClass();
        p3.o0 o0VarE = mVar.E(1765695774);
        int i27 = i14 | (o0VarE.r(sVar) ? 4 : 2) | (o0VarE.r(eVar) ? 32 : 16);
        int i28 = i15 & 4;
        if (i28 != 0) {
            i16 = i27 | 384;
            lVar5 = lVar;
        } else {
            lVar5 = lVar;
            i16 = i27 | (o0VarE.r(lVar5) ? 256 : 128);
        }
        int i29 = i15 & 8;
        if (i29 != 0) {
            i17 = i16 | 3072;
            aVar3 = aVar;
        } else {
            aVar3 = aVar;
            i17 = i16 | (o0VarE.r(aVar3) ? 2048 : 1024);
        }
        int i30 = i15 & 16;
        if (i30 != 0) {
            i18 = i17 | 24576;
            lVar6 = lVar2;
        } else {
            lVar6 = lVar2;
            i18 = i17 | (o0VarE.r(lVar6) ? 16384 : 8192);
        }
        int i34 = i15 & 32;
        if (i34 != 0) {
            i19 = i18 | 196608;
            lVar7 = lVar3;
        } else {
            lVar7 = lVar3;
            i19 = i18 | (o0VarE.r(lVar7) ? 131072 : 65536);
        }
        int i35 = i15 & 64;
        if (i35 != 0) {
            i24 = i19 | 1572864;
        } else {
            i24 = i19 | (o0VarE.r(lVar4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        int i36 = i15 & 128;
        if (i36 != 0) {
            i25 = i24 | 12582912;
        } else {
            i25 = i24 | (o0VarE.r(aVar2) ? 8388608 : 4194304);
        }
        int i37 = i25;
        if (o0VarE.n(i37 & 1, (i25 & 4793491) != 4793490)) {
            p3.m.a aVar5 = p3.m.f135153a;
            if (i28 != 0) {
                Object objQ = o0VarE.q();
                aVar5.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new u(1);
                    o0VarE.K(objQ);
                }
                lVar5 = (e23.l) objQ;
            }
            if (i29 != 0) {
                Object objQ2 = o0VarE.q();
                aVar5.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new f(8);
                    o0VarE.K(objQ2);
                }
                aVar3 = (e23.a) objQ2;
            }
            if (i30 != 0) {
                Object objQ3 = o0VarE.q();
                aVar5.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new u(2);
                    o0VarE.K(objQ3);
                }
                lVar10 = (e23.l) objQ3;
                i26 = i34;
            } else {
                i26 = i34;
                lVar10 = lVar6;
            }
            if (i26 != 0) {
                Object objQ4 = o0VarE.q();
                aVar5.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new u(3);
                    o0VarE.K(objQ4);
                }
                lVar7 = (e23.l) objQ4;
            }
            if (i35 != 0) {
                Object objQ5 = o0VarE.q();
                aVar5.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new u(4);
                    o0VarE.K(objQ5);
                }
                lVar12 = (e23.l) objQ5;
            } else {
                lVar12 = lVar4;
            }
            if (i36 != 0) {
                Object objQ6 = o0VarE.q();
                aVar5.getClass();
                if (objQ6 == p3.m.a.f135155b) {
                    objQ6 = new f(9);
                    o0VarE.K(objQ6);
                }
                aVar4 = (e23.a) objQ6;
            } else {
                aVar4 = aVar2;
            }
            x1 x1Var = p3.n.f135158a;
            if (sVar.f168116e) {
                o0VarE.C(1378793535);
                y01.s.a(null, aVar4, o0VarE, (i37 >> 18) & 112, 1);
                o0VarE.g0(false);
                lVar13 = lVar12;
                lVar14 = lVar7;
            } else if (sVar.f168117f) {
                o0VarE.C(1378970204);
                h4.r.a aVar6 = h4.r.S;
                h4.r rVarD = x2.d(aVar6, 1.0f);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                e23.l<? super b63.v, Unit> lVar15 = lVar12;
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarD, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar7 = h5.g.a.f81805b;
                e23.l<? super b63.v, Unit> lVar16 = lVar7;
                if (o0VarE.f135177b == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar7);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                if (z15) {
                    o0VarE.C(624578573);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(624525718);
                    d(o0VarE, 0);
                    o0VarE.g0(false);
                }
                int i38 = i37 >> 3;
                c(cVar, lVar5, x2.f(aVar6, 1.0f), o0VarE, (i38 & 112) | 384);
                int i39 = i37 << 3;
                g(sVar.f168115d, sVar.f168118g, eVar, lVar10, aVar3, x2.f(aVar6, 1.0f), o0VarE, (i39 & 896) | 196608 | (i38 & 7168) | (i39 & 57344));
                o0VarE = o0VarE;
                if (cVar == s21.c.TIMELINE && z15) {
                    o0VarE.C(625294022);
                    int i44 = ((i37 << 6) & 7168) | 1572864 | (57344 & i38) | (458752 & i38);
                    lVar13 = lVar15;
                    lVar14 = lVar16;
                    h(i44, lVar14, lVar13, x2.f(aVar6, 1.0f), o0VarE, sVar.f168119h, sVar.f168120i, eVar, sVar.f168113b);
                    z14 = false;
                    o0VarE.g0(false);
                } else {
                    lVar13 = lVar15;
                    lVar14 = lVar16;
                    z14 = false;
                    o0VarE.C(625792781);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                o0VarE.g0(z14);
            } else {
                lVar13 = lVar12;
                lVar14 = lVar7;
                o0VarE.C(1380367684);
                o0VarE.g0(false);
            }
            lVar9 = lVar5;
            lVar8 = lVar14;
            lVar11 = lVar13;
        } else {
            o0VarE.e();
            aVar4 = aVar2;
            lVar8 = lVar7;
            lVar9 = lVar5;
            lVar10 = lVar6;
            lVar11 = lVar4;
        }
        e23.a<Unit> aVar8 = aVar3;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bt1.o(sVar, eVar, (e23.l) lVar9, (e23.a) aVar8, (e23.l) lVar10, (e23.l) lVar8, (e23.l) lVar11, (e23.a) aVar4, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0180  */
    /* JADX WARN: Code duplicated, block: B:77:0x018c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0198  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:91:0x01cf  */
    public static final void g(boolean z14, List list, v21.e eVar, e23.l lVar, e23.a aVar, h4.r rVar, p3.m mVar, int i14) {
        List<s21.k> list2;
        boolean z15;
        String str;
        String strZ;
        Integer num;
        String strL;
        boolean z16;
        e23.a aVar2;
        boolean z17;
        boolean zR;
        Object objQ;
        p3.o0 o0VarE = mVar.E(1511314822);
        int i15 = (i14 & 6) == 0 ? (o0VarE.h(z14) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            list2 = list;
            i15 |= o0VarE.r(list2) ? 32 : 16;
        } else {
            list2 = list;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(eVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(rVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            c22.x0.f23314a.getClass();
            boolean z18 = false;
            r1.c(gl1.d.W(c22.x0.f23530me), gl1.d.W(c22.x0.Ad), aVar, false, null, null, o0VarE, (i15 >> 6) & 896, 56);
            o0VarE = o0VarE;
            o0VarE.C(405163637);
            for (s21.k kVar2 : list2) {
                l22.a aVarS = w2.a0.s(o0VarE);
                kVar2.getClass();
                s21.l lVar2 = kVar2.f156141e;
                c3 c3Var = kVar2.f156143g;
                b11.c.a aVar4 = b11.c.f14245d;
                String str2 = kVar2.f156138b;
                boolean z19 = kVar2.f156139c;
                aVar4.getClass();
                String strB = b11.c.a.b(str2, aVarS, z19);
                if (c3Var != null) {
                    o0VarE.C(-483664283);
                    z15 = false;
                    strZ = gl1.d.T(c3Var, o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    z15 = false;
                    if (lVar2 != null) {
                        o0VarE.C(-483660951);
                        o0VarE.g0(false);
                        strZ = eVar.z(lVar2.f156145a, lVar2.f156146b);
                    } else {
                        o0VarE.C(-2108489508);
                        o0VarE.g0(false);
                        str = null;
                    }
                    boolean z24 = kVar2.f156140d;
                    num = kVar2.f156144h;
                    if (num == null) {
                        o0VarE.C(-2108357882);
                        o0VarE.g0(z15);
                        strL = null;
                    } else {
                        strL = lc.u0.l(o0VarE, -2108357881, num, o0VarE, z15);
                    }
                    if (kVar2.f156142f) {
                        o0VarE.C(-2108281001);
                        if ((i15 & 7168) == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zR = z17 | o0VarE.r(kVar2);
                        objQ = o0VarE.q();
                        if (zR) {
                            objQ = new s70.j1(15, lVar, kVar2);
                            o0VarE.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new s70.j1(15, lVar, kVar2);
                                o0VarE.K(objQ);
                            }
                        }
                        aVar2 = (e23.a) objQ;
                        z16 = false;
                        o0VarE.g0(false);
                    } else {
                        z16 = false;
                        o0VarE.C(-2108202571);
                        o0VarE.g0(false);
                        aVar2 = null;
                    }
                    z18 = z16;
                    e(0, aVar2, strB, str, strL, o0VarE, z24);
                }
                str = strZ;
                boolean z25 = kVar2.f156140d;
                num = kVar2.f156144h;
                if (num == null) {
                    o0VarE.C(-2108357882);
                    o0VarE.g0(z15);
                    strL = null;
                } else {
                    strL = lc.u0.l(o0VarE, -2108357881, num, o0VarE, z15);
                }
                if (kVar2.f156142f) {
                    o0VarE.C(-2108281001);
                    if ((i15 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zR = z17 | o0VarE.r(kVar2);
                    objQ = o0VarE.q();
                    if (zR) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new s70.j1(15, lVar, kVar2);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new s70.j1(15, lVar, kVar2);
                        o0VarE.K(objQ);
                    }
                    aVar2 = (e23.a) objQ;
                    z16 = false;
                    o0VarE.g0(false);
                } else {
                    z16 = false;
                    o0VarE.C(-2108202571);
                    o0VarE.g0(false);
                    aVar2 = null;
                }
                z18 = z16;
                e(0, aVar2, strB, str, strL, o0VarE, z25);
            }
            o0VarE.g0(z18);
            if (z14) {
                o0VarE.C(-324042204);
                h4.r rVarF = x2.f(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f14 = eVar2.f97920e;
                bVar2.getClass();
                h4.r rVarZ = c2.l.z(rVarF, f14, eVar2.f97917b);
                String strQ = gl1.y.Q(o0VarE, R.string.msg_updating_your_meal_windows_info);
                d6.h.f57752b.getClass();
                int i16 = d6.h.f57757g;
                d92.b.f58624b.getClass();
                mh.c(strQ, rVarZ, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 130044);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-323661338);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(z14, list2, eVar, lVar, aVar, rVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:87:0x019c  */
    /* JADX WARN: Code duplicated, block: B:88:0x019f  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:91:0x01af  */
    /* JADX WARN: Code duplicated, block: B:97:0x01bf  */
    public static final void h(int i14, e23.l lVar, e23.l lVar2, h4.r rVar, p3.m mVar, s21.e0 e0Var, s21.e0 e0Var2, v21.e eVar, boolean z14) {
        int i15;
        p3.o0 o0Var;
        boolean z15;
        String strL;
        boolean z16;
        boolean z17;
        o21.a aVar;
        Integer num;
        String strL2;
        boolean z18;
        p3.o0 o0VarE = mVar.E(-1918076511);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(e0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(e0Var2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(eVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.B(rVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            r1.b(gl1.y.Q(o0VarE, R.string.lbl_timeline_segment_title), null, o0VarE, 0, 2);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_start_time);
            b63.v vVar = e0Var.f156100a;
            o21.a aVar3 = e0Var.f156103d;
            String strK = eVar.K(vVar, z14);
            Integer num2 = aVar3 != null ? aVar3.f128641b : null;
            if (num2 == null) {
                o0VarE.C(-841546736);
                z15 = false;
                o0VarE.g0(false);
                strL = null;
            } else {
                z15 = false;
                strL = lc.u0.l(o0VarE, -841546735, num2, o0VarE, false);
            }
            b63.v vVar2 = e0Var.f156100a;
            if (aVar3 != null) {
                z16 = true;
                if (aVar3.f128640a) {
                    z15 = true;
                }
                boolean z19 = z16;
                z17 = z15;
                a11.d0.a(false, strQ, strK, z15, strL, vVar2, gl1.y.Q(o0VarE, R.string.lbl_start_time), null, null, null, null, lVar, null, null, o0VarE, 6, (i15 >> 9) & 112, 14208);
                String strQ2 = gl1.y.Q(o0VarE, R.string.pregnancy_end_time);
                b63.v vVar3 = e0Var2.f156100a;
                aVar = e0Var2.f156103d;
                String strK2 = eVar.K(vVar3, z14);
                if (aVar != null) {
                    num = aVar.f128641b;
                } else {
                    num = null;
                }
                if (num == null) {
                    o0VarE.C(-841012048);
                    o0VarE.g0(z17);
                    strL2 = null;
                } else {
                    strL2 = lc.u0.l(o0VarE, -841012047, num, o0VarE, z17);
                }
                if (aVar == null && aVar.f128640a == z19) {
                    z18 = z19;
                } else {
                    z18 = z17;
                }
                a11.d0.a(false, strQ2, strK2, z18, strL2, e0Var2.f156100a, gl1.y.Q(o0VarE, R.string.pregnancy_end_time), e0Var2.f156101b, e0Var2.f156102c, null, null, lVar2, null, null, o0VarE, 6, (i15 >> 12) & 112, 13824);
                o0Var = o0VarE;
                o0Var.g0(true);
            } else {
                z16 = true;
            }
            boolean z110 = z16;
            z17 = z15;
            a11.d0.a(false, strQ, strK, z15, strL, vVar2, gl1.y.Q(o0VarE, R.string.lbl_start_time), null, null, null, null, lVar, null, null, o0VarE, 6, (i15 >> 9) & 112, 14208);
            String strQ3 = gl1.y.Q(o0VarE, R.string.pregnancy_end_time);
            b63.v vVar4 = e0Var2.f156100a;
            aVar = e0Var2.f156103d;
            String strK3 = eVar.K(vVar4, z14);
            if (aVar != null) {
                num = aVar.f128641b;
            } else {
                num = null;
            }
            if (num == null) {
                o0VarE.C(-841012048);
                o0VarE.g0(z17);
                strL2 = null;
            } else {
                strL2 = lc.u0.l(o0VarE, -841012047, num, o0VarE, z17);
            }
            if (aVar == null) {
                z18 = z17;
            } else {
                z18 = z17;
            }
            a11.d0.a(false, strQ3, strK3, z18, strL2, e0Var2.f156100a, gl1.y.Q(o0VarE, R.string.pregnancy_end_time), e0Var2.f156101b, e0Var2.f156102c, null, null, lVar2, null, null, o0VarE, 6, (i15 >> 12) & 112, 13824);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n9(i14, lVar, lVar2, rVar, e0Var, e0Var2, eVar, z14);
        }
    }
}
