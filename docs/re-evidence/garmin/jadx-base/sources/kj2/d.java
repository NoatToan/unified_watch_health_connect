package kj2;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import d53.u;
import e23.l;
import e23.p;
import h4.r;
import h5.e0;
import i3.e5;
import i3.h6;
import i3.mh;
import java.util.List;
import java.util.Locale;
import kotlin.m3;
import kotlin.t1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p006l2.a2;
import p006l2.z1;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import u1.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:101:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:104:0x036d  */
    /* JADX WARN: Code duplicated, block: B:106:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:108:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:109:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:114:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:117:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:118:0x0409  */
    /* JADX WARN: Code duplicated, block: B:121:0x041d  */
    /* JADX WARN: Code duplicated, block: B:123:0x043b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0499  */
    /* JADX WARN: Code duplicated, block: B:127:0x049d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r rVar, String str, z1 z1Var, a2 a2Var, List list, l lVar, l lVar2, p pVar, o13.p pVar2, nj2.a.b bVar, m mVar, int i14) {
        o0 o0Var;
        z1 z1Var2;
        z1 z1Var3;
        p1 p1Var;
        h5.g.a.f fVar;
        String strQ;
        r.a aVar;
        boolean z14;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        String strJ;
        Number number;
        String strQ2;
        rVar.getClass();
        list.getClass();
        bVar.getClass();
        int i15 = bVar.f126290c;
        o0 o0VarE = mVar.E(-1650038421);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.B(str) ? 32 : 16) | 384 | (o0VarE.r(list) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536) | (o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(pVar) ? 8388608 : 4194304) | (o0VarE.B(pVar2) ? 67108864 : 33554432);
        if (o0VarE.n(i16 & 1, (306783379 & i16) != 306783378)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                z1.f108930g.getClass();
                z1Var3 = z1.f108931h;
            } else {
                o0VarE.e();
                z1Var3 = z1Var;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            boolean z15 = (i16 & 112) == 32;
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (z15) {
                objQ = p0.n(str);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = p0.n(str);
                    o0VarE.K(objQ);
                }
            }
            p1 p1Var2 = (p1) objQ;
            A a14 = pVar2.f128594a;
            B b14 = pVar2.f128595b;
            boolean zH = o0VarE.h(!((Boolean) a14).booleanValue());
            Object objQ2 = o0VarE.q();
            if (zH) {
                objQ2 = hb.a.n(!((Boolean) a14).booleanValue(), o0VarE);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = hb.a.n(!((Boolean) a14).booleanValue(), o0VarE);
                }
            }
            p1 p1Var3 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            aVar2.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var4 = (p1) objQ3;
            boolean zBooleanValue = ((Boolean) p1Var4.z()).booleanValue();
            l lVarY = p1Var4.y();
            boolean z16 = zBooleanValue && !list.isEmpty();
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = e5.o(0, o0VarE);
            }
            n1 n1Var = (n1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p0.n(Boolean.TRUE);
                o0VarE.K(objQ5);
            }
            p1 p1Var5 = (p1) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ6);
            }
            p1 p1Var6 = (p1) objQ6;
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                n4.g.f123559b.getClass();
                objQ7 = p0.n(n4.g.a(0L));
                o0VarE.K(objQ7);
            }
            p1 p1Var7 = (p1) objQ7;
            Object objQ8 = o0VarE.q();
            if (objQ8 == c2565a) {
                objQ8 = p0.n("");
                o0VarE.K(objQ8);
            }
            p1 p1Var8 = (p1) objQ8;
            Object objQ9 = o0VarE.q();
            if (objQ9 == c2565a) {
                objQ9 = p0.n("");
                o0VarE.K(objQ9);
            }
            p1 p1Var9 = (p1) objQ9;
            m3 m3Var = (m3) o0VarE.A(t1.f91499q);
            int i17 = ((Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a)).screenHeightDp;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Integer numValueOf = Integer.valueOf(n1Var.getIntValue());
            boolean zR = o0VarE.r(context) | o0VarE.k(i17);
            Object objQ10 = o0VarE.q();
            if (zR || objQ10 == c2565a) {
                objQ10 = new c(context, i17, n1Var, p1Var5, null);
                o0VarE.K(objQ10);
            }
            l0.e((p) objQ10, numValueOf, o0VarE);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar2.getClass();
            float f15 = eVar.f97920e;
            bVar2.getClass();
            r rVarC2 = c2.l.C(rVar, f14, eVar.f97920e, f15, 0.0f, 8);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC3 = h4.k.c(rVarC2, o0VarE);
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
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T) {
                p1Var = p1Var2;
            } else {
                p1Var = p1Var2;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                b0 b0Var = b0.f22601a;
                o0VarE.C(215572153);
                strQ = gl1.y.Q(o0VarE, i15);
                aVar = r.S;
                r rVarF = x2.f(aVar, 1.0f);
                bVar2.getClass();
                r rVarC4 = c2.l.C(rVarF, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
                if (bVar.f126288a) {
                    strQ = tn.k.g(strQ, " *");
                }
                j92.f.f97924a.getClass();
                mh.c(strQ, rVarC4, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, o0VarE, 0, 0, 131064);
                Unit unit = Unit.INSTANCE;
                o0VarE.g0(false);
                boolean z17 = z16;
                h6.a(z17, lVarY, aVar, z3.f.c(1723474271, new b(z17, lVarY, p1Var, lVar2, a2Var, z1Var3, list, m3Var, lVar, pVar, p1Var6, p1Var8, p1Var9, n1Var, p1Var7, p1Var3), o0VarE), o0VarE, 3456, 0);
                o0Var = o0VarE;
                if (((Boolean) a14).booleanValue()) {
                    z14 = true;
                    o0Var.C(-1899010003);
                    o0Var.g0(false);
                } else {
                    o0Var.C(-1900253847);
                    h4.g.b bVar4 = h4.d.a.f81534l;
                    bVar2.getClass();
                    r rVarF2 = x2.f(c2.l.C(aVar, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), 1.0f);
                    s2VarA = q2.a(c2.j.f22692b, bVar4, o0Var, 48);
                    iHashCode = Long.hashCode(o0Var.U);
                    i2VarA0 = o0Var.a0();
                    rVarC = h4.k.c(rVarF2, o0Var);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar3);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar2, s2VarA, o0Var);
                    b4.c(c1623g, i2VarA0, o0Var);
                    if (o0Var.T || !s.g(o0Var.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0Var, iHashCode, bVar3);
                    }
                    b4.c(fVar, rVarC, o0Var);
                    u2 u2Var = u2.f22900a;
                    t4.d dVarA = n5.c.a(R.drawable.icon_danger, o0Var, 0);
                    bVar2.getClass();
                    y0.a(dVarA, "", x2.q(aVar, j92.b.f97901d.f97903b), null, null, 0.0f, null, o0Var, 48, 120);
                    if (bVar == nj2.a.b.ADDRESS_LINE_1) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0Var, -1021545951, R.string.cm_address, o0Var, false);
                    } else {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0Var, 244144120, i15, o0Var, false);
                    }
                    number = (Number) b14;
                    if (number.intValue() == R.string.cm_please_enter_a_valid) {
                        o0Var.C(-1021334283);
                        String strQ3 = gl1.y.Q(o0Var, R.string.cm_please_enter_a_valid);
                        String lowerCase = strJ.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        strQ2 = u.v(strQ3, "{0}", lowerCase, false);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(244153307);
                        strQ2 = gl1.y.Q(o0Var, number.intValue());
                        o0Var.g0(false);
                    }
                    String str2 = strQ2;
                    bVar2.getClass();
                    mh.c(str2, c2.l.C(aVar, eVar.f97917b, 0.0f, 0.0f, 0.0f, 14), d92.b.a(o0Var).k().e(), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, o0Var, 0, 0, 262136);
                    z14 = true;
                    o0Var.g0(true);
                    o0Var.g0(false);
                }
                o0Var.g0(z14);
                z1Var2 = z1Var3;
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var2 = b0.f22601a;
            o0VarE.C(215572153);
            strQ = gl1.y.Q(o0VarE, i15);
            aVar = r.S;
            r rVarF3 = x2.f(aVar, 1.0f);
            bVar2.getClass();
            r rVarC5 = c2.l.C(rVarF3, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
            if (bVar.f126288a) {
                strQ = tn.k.g(strQ, " *");
            }
            j92.f.f97924a.getClass();
            mh.c(strQ, rVarC5, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, o0VarE, 0, 0, 131064);
            Unit unit2 = Unit.INSTANCE;
            o0VarE.g0(false);
            boolean z18 = z16;
            h6.a(z18, lVarY, aVar, z3.f.c(1723474271, new b(z18, lVarY, p1Var, lVar2, a2Var, z1Var3, list, m3Var, lVar, pVar, p1Var6, p1Var8, p1Var9, n1Var, p1Var7, p1Var3), o0VarE), o0VarE, 3456, 0);
            o0Var = o0VarE;
            if (((Boolean) a14).booleanValue()) {
                o0Var.C(-1900253847);
                h4.g.b bVar5 = h4.d.a.f81534l;
                bVar2.getClass();
                r rVarF4 = x2.f(c2.l.C(aVar, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), 1.0f);
                s2VarA = q2.a(c2.j.f22692b, bVar5, o0Var, 48);
                iHashCode = Long.hashCode(o0Var.U);
                i2VarA0 = o0Var.a0();
                rVarC = h4.k.c(rVarF4, o0Var);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar3);
                } else {
                    o0Var.c();
                }
                b4.c(eVar2, s2VarA, o0Var);
                b4.c(c1623g, i2VarA0, o0Var);
                if (o0Var.T) {
                    v.h.A(iHashCode, o0Var, iHashCode, bVar3);
                } else {
                    v.h.A(iHashCode, o0Var, iHashCode, bVar3);
                }
                b4.c(fVar, rVarC, o0Var);
                u2 u2Var2 = u2.f22900a;
                t4.d dVarA2 = n5.c.a(R.drawable.icon_danger, o0Var, 0);
                bVar2.getClass();
                y0.a(dVarA2, "", x2.q(aVar, j92.b.f97901d.f97903b), null, null, 0.0f, null, o0Var, 48, 120);
                if (bVar == nj2.a.b.ADDRESS_LINE_1) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0Var, -1021545951, R.string.cm_address, o0Var, false);
                } else {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0Var, 244144120, i15, o0Var, false);
                }
                number = (Number) b14;
                if (number.intValue() == R.string.cm_please_enter_a_valid) {
                    o0Var.C(-1021334283);
                    String strQ4 = gl1.y.Q(o0Var, R.string.cm_please_enter_a_valid);
                    String lowerCase2 = strJ.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    strQ2 = u.v(strQ4, "{0}", lowerCase2, false);
                    o0Var.g0(false);
                } else {
                    o0Var.C(244153307);
                    strQ2 = gl1.y.Q(o0Var, number.intValue());
                    o0Var.g0(false);
                }
                String str3 = strQ2;
                bVar2.getClass();
                mh.c(str3, c2.l.C(aVar, eVar.f97917b, 0.0f, 0.0f, 0.0f, 14), d92.b.a(o0Var).k().e(), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, o0Var, 0, 0, 262136);
                z14 = true;
                o0Var.g0(true);
                o0Var.g0(false);
            } else {
                z14 = true;
                o0Var.C(-1899010003);
                o0Var.g0(false);
            }
            o0Var.g0(z14);
            z1Var2 = z1Var3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z1Var2 = z1Var;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.j(rVar, str, z1Var2, a2Var, list, lVar, lVar2, pVar, pVar2, bVar, i14);
        }
    }
}
