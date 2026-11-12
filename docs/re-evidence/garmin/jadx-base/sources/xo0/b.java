package xo0;

import am.x0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import f02.h;
import g02.i;
import g6.c;
import h4.d;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.i7;
import i3.mh;
import j92.e;
import kotlin.t1;
import l72.l;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import u1.w;
import ug2.p;
import v62.g5;
import w3.x;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cb  */
    public static final void a(wo0.a aVar, boolean z14, e23.a aVar2, e23.a aVar3, r rVar, m mVar, int i14) {
        Object obj = aVar.f186421g;
        String str = aVar.f186418d;
        aVar2.getClass();
        o0 o0VarE = mVar.E(724331969);
        int i15 = (o0VarE.B(aVar) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar3) ? 2048 : 1024;
        }
        int i16 = i15 | (o0VarE.B(rVar) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            float f69051c = ((c) o0VarE.A(t1.f91490h)).getF69051c();
            boolean zB = o0VarE.B(str);
            Object objQ = o0VarE.q();
            m.a aVar4 = m.f135153a;
            if (zB) {
                objQ = x.j(context, str);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = x.j(context, str);
                    o0VarE.K(objQ);
                }
            }
            String str2 = (String) objQ;
            boolean zB2 = o0VarE.B(str);
            Object objQ2 = o0VarE.q();
            if (zB2) {
                objQ2 = x.k(context, str);
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = x.k(context, str);
                    o0VarE.K(objQ2);
                }
            }
            String str3 = (String) objQ2;
            boolean zB3 = o0VarE.B(obj);
            Object objQ3 = o0VarE.q();
            if (zB3) {
                o0VarE.K(obj);
            } else {
                aVar4.getClass();
                if (objQ3 == m.a.f135155b) {
                    o0VarE.K(obj);
                } else {
                    obj = objQ3;
                }
            }
            l.f(f.c(-2115912228, new w21.c(f69051c, aVar, z14, (String) obj, str2, str3), o0VarE), w.f(239, aVar3, aVar2, rVar, null, false), false, null, o0VarE, 6, 28);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.l(i14, 24, aVar2, aVar3, aVar, rVar, z14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x016e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0175  */
    /* JADX WARN: Code duplicated, block: B:47:0x017d  */
    /* JADX WARN: Code duplicated, block: B:52:0x019d  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:62:0x0203  */
    /* JADX WARN: Code duplicated, block: B:64:0x0247  */
    /* JADX WARN: Code duplicated, block: B:67:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:69:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:71:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:76:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:79:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:89:0x033f  */
    /* JADX WARN: Code duplicated, block: B:92:0x034c  */
    /* JADX WARN: Code duplicated, block: B:94:0x038e  */
    /* JADX WARN: Code duplicated, block: B:96:0x039f  */
    /* JADX WARN: Code duplicated, block: B:98:0x03a3  */
    public static final void b(wo0.a aVar, boolean z14, String str, String str2, String str3, boolean z15, m mVar, int i14) {
        p3.c<?> cVar;
        g.a.f fVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar2;
        g.a.b bVar;
        String strJ;
        g.a.b bVar2;
        e0.a aVar3;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        boolean z16;
        Object objQ;
        wo0.a aVar4 = aVar;
        x0 x0Var = aVar4.f186420f;
        o0 o0VarE = mVar.E(210468562);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(aVar4) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.B(str2) ? 2048 : 1024) | (o0VarE.B(str3) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 74899) != 74898)) {
            x1 x1Var = n.f135158a;
            r.a aVar5 = r.S;
            r rVarF = x2.f(aVar5, 1.0f);
            d92.b bVar3 = d92.b.f58623a;
            bVar3.getClass();
            j92.b bVar4 = d92.b.f58625c;
            bVar4.getClass();
            e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97917b;
            r rVarY = c2.l.y(rVarF, f14);
            d.f81522a.getClass();
            h4.g.b bVar5 = d.a.f81534l;
            j.f22691a.getClass();
            j.C0343j c0343j = j.f22692b;
            s2 s2VarA2 = q2.a(c0343j, bVar5, o0VarE, 48);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            r rVarC3 = k.c(rVarY, o0VarE);
            g.V.getClass();
            e0.a aVar6 = g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            g.a.e eVar2 = g.a.f81810g;
            b4.c(eVar2, s2VarA2, o0VarE);
            g.a.C1623g c1623g = g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            g.a.b bVar6 = g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                u2 u2Var = u2.f22900a;
                u4.d dVarS = x0Var.s(z14);
                h.f67736a.getClass();
                long jA = h.a(o0VarE);
                long jA2 = n5.a.a(o0VarE, x0Var.f4366i);
                bVar4.getClass();
                i.a(null, dVarS, jA, jA2, eVar.f97923h, 0.0f, null, o0VarE, 0, 225);
                r rVarA = u2Var.a(aVar5, 1.0f, true);
                bVar4.getClass();
                float f16 = eVar.f97920e;
                bVar4.getClass();
                r rVarC4 = c2.l.C(rVarA, f16, 0.0f, eVar.f97920e, 0.0f, 10);
                bVar4.getClass();
                zVarA = y.a(j.i(f15), d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarC4, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    aVar2 = aVar6;
                    o0VarE.M(aVar2);
                } else {
                    aVar2 = aVar6;
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T && s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    bVar = bVar6;
                } else {
                    bVar = bVar6;
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                aVar4 = aVar;
                strJ = aVar4.f186416b;
                if (strJ == null) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1494807516, R.string.txt_untitle, o0VarE, false);
                } else {
                    o0VarE.C(1494806741);
                    o0VarE.g0(false);
                }
                bVar2 = bVar;
                aVar3 = aVar2;
                mh.c(strJ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x.g(o0VarE), o0VarE, 0, 0, 131070);
                if (z15) {
                    o0VarE.C(-905458179);
                    mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x.i(o0VarE), o0VarE, (i15 >> 9) & 14, 0, 131070);
                    mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x.i(o0VarE), o0VarE, (i15 >> 12) & 14, 0, 131070);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-905187146);
                    mh.c(gl1.y.P(R.string.string_at_string_pattern, new Object[]{str2, str3}, o0VarE), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x.i(o0VarE), o0VarE, 0, 0, 131070);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                s2VarA = q2.a(c0343j, bVar5, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = k.c(aVar5, o0VarE);
                if (cVar != null) {
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
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarE);
                if (str != null) {
                    o0VarE.C(405801780);
                    if ((i15 & 14) == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objQ = o0VarE.q();
                    if (z16) {
                        objQ = new a(aVar4, 0);
                        o0VarE.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new a(aVar4, 0);
                            o0VarE.K(objQ);
                        }
                    }
                    r rVarC5 = v.c((e23.l) objQ, aVar5, false);
                    bVar3.getClass();
                    d92.b.f58624b.getClass();
                    o0 o0Var = o0VarE;
                    mh.c(str, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0Var, (i15 >> 6) & 14, 0, 131068);
                    o0VarE = o0Var;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(406096280);
                    o0VarE.g0(false);
                }
                if (aVar4.f186423i) {
                    o0VarE.C(406140858);
                    bVar4.getClass();
                    c2.l.f(x2.u(aVar5, f15), o0VarE);
                    bVar4.getClass();
                    r rVarQ = x2.q(aVar5, j92.b.f97901d.f97904c);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = g5.a(t62.b.f162798a);
                    String strQ = gl1.y.Q(o0VarE, R.string.concept_personal_records);
                    gl.c.f77766a.getClass();
                    i7.b(dVarA, strQ, rVarQ, gl.c.f77767b.M, o0VarE, 0, 0);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(406538712);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                o0VarE.g0(true);
            }
            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar6);
            fVar = g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            u2 u2Var2 = u2.f22900a;
            u4.d dVarS2 = x0Var.s(z14);
            h.f67736a.getClass();
            long jA3 = h.a(o0VarE);
            long jA4 = n5.a.a(o0VarE, x0Var.f4366i);
            bVar4.getClass();
            i.a(null, dVarS2, jA3, jA4, eVar.f97923h, 0.0f, null, o0VarE, 0, 225);
            r rVarA2 = u2Var2.a(aVar5, 1.0f, true);
            bVar4.getClass();
            float f17 = eVar.f97920e;
            bVar4.getClass();
            r rVarC6 = c2.l.C(rVarA2, f17, 0.0f, eVar.f97920e, 0.0f, 10);
            bVar4.getClass();
            zVarA = y.a(j.i(f15), d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarC6, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                aVar2 = aVar6;
                o0VarE.M(aVar2);
            } else {
                aVar2 = aVar6;
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                bVar = bVar6;
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                bVar = bVar6;
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            aVar4 = aVar;
            strJ = aVar4.f186416b;
            if (strJ == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1494807516, R.string.txt_untitle, o0VarE, false);
            } else {
                o0VarE.C(1494806741);
                o0VarE.g0(false);
            }
            bVar2 = bVar;
            aVar3 = aVar2;
            mh.c(strJ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x.g(o0VarE), o0VarE, 0, 0, 131070);
            if (z15) {
                o0VarE.C(-905458179);
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x.i(o0VarE), o0VarE, (i15 >> 9) & 14, 0, 131070);
                mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x.i(o0VarE), o0VarE, (i15 >> 12) & 14, 0, 131070);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-905187146);
                mh.c(gl1.y.P(R.string.string_at_string_pattern, new Object[]{str2, str3}, o0VarE), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x.i(o0VarE), o0VarE, 0, 0, 131070);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            s2VarA = q2.a(c0343j, bVar5, o0VarE, 48);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = k.c(aVar5, o0VarE);
            if (cVar != null) {
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
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            if (str != null) {
                o0VarE.C(405801780);
                if ((i15 & 14) == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objQ = o0VarE.q();
                if (z16) {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new a(aVar4, 0);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new a(aVar4, 0);
                    o0VarE.K(objQ);
                }
                r rVarC7 = v.c((e23.l) objQ, aVar5, false);
                bVar3.getClass();
                d92.b.f58624b.getClass();
                o0 o0Var2 = o0VarE;
                mh.c(str, rVarC7, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0Var2, (i15 >> 6) & 14, 0, 131068);
                o0VarE = o0Var2;
                o0VarE.g0(false);
            } else {
                o0VarE.C(406096280);
                o0VarE.g0(false);
            }
            if (aVar4.f186423i) {
                o0VarE.C(406140858);
                bVar4.getClass();
                c2.l.f(x2.u(aVar5, f15), o0VarE);
                bVar4.getClass();
                r rVarQ2 = x2.q(aVar5, j92.b.f97901d.f97904c);
                s62.a.f157643a.getClass();
                u4.d dVarA2 = g5.a(t62.b.f162798a);
                String strQ2 = gl1.y.Q(o0VarE, R.string.concept_personal_records);
                gl.c.f77766a.getClass();
                i7.b(dVarA2, strQ2, rVarQ2, gl.c.f77767b.M, o0VarE, 0, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(406538712);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ak0.n(aVar4, z14, str, str2, str3, z15, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0162  */
    /* JADX WARN: Code duplicated, block: B:45:0x0169  */
    /* JADX WARN: Code duplicated, block: B:46:0x016d  */
    /* JADX WARN: Code duplicated, block: B:53:0x018c  */
    /* JADX WARN: Code duplicated, block: B:56:0x019b  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:70:0x0206  */
    /* JADX WARN: Code duplicated, block: B:71:0x020a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0283  */
    /* JADX WARN: Code duplicated, block: B:76:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:78:0x02d2  */
    public static final void c(wo0.a aVar, boolean z14, String str, String str2, String str3, m mVar, int i14) {
        int i15;
        g.a.f fVar;
        u2 u2Var;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        String strJ;
        boolean z15;
        Object objQ;
        String str4;
        wo0.a aVar2 = aVar;
        x0 x0Var = aVar2.f186420f;
        o0 o0VarE = mVar.E(-247779873);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.B(aVar2) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.B(str2) ? 2048 : 1024) | (o0VarE.B(str3) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            r.a aVar3 = r.S;
            r rVarF = x2.f(aVar3, 1.0f);
            d92.b bVar = d92.b.f58623a;
            bVar.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            e eVar = j92.b.f97899b;
            r rVarY = c2.l.y(rVarF, eVar.f97920e);
            j.f22691a.getClass();
            j.C0343j c0343j = j.f22692b;
            d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, d.a.f81533k, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarY, o0VarE);
            g.V.getClass();
            e0.a aVar4 = g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            g.a.e eVar2 = g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            g.a.C1623g c1623g = g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            g.a.b bVar3 = g.a.f81813j;
            if (o0VarE.T) {
                i15 = i16;
            } else {
                i15 = i16;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                u2Var = u2.f22900a;
                r rVarC3 = u2Var.c(aVar3, d.a.f81534l);
                u4.d dVarS = x0Var.s(z14);
                h.f67736a.getClass();
                long jA = h.a(o0VarE);
                long jA2 = n5.a.a(o0VarE, x0Var.f4366i);
                bVar2.getClass();
                i.a(rVarC3, dVarS, jA, jA2, eVar.f97923h, 0.0f, null, o0VarE, 0, 224);
                bVar2.getClass();
                float f14 = eVar.f97920e;
                bVar2.getClass();
                r rVarC4 = c2.l.C(aVar3, f14, 0.0f, eVar.f97920e, 0.0f, 10);
                bVar2.getClass();
                zVarA = y.a(j.i(eVar.f97917b), d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarC4, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                aVar2 = aVar;
                strJ = aVar2.f186416b;
                if (strJ == null) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -577816535, R.string.txt_untitle, o0VarE, false);
                } else {
                    o0VarE.C(-577817310);
                    o0VarE.g0(false);
                }
                mh.c(strJ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x.g(o0VarE), o0VarE, 0, 0, 131070);
                if ((i15 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objQ = o0VarE.q();
                if (z15) {
                    objQ = new a(aVar2, 1);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new a(aVar2, 1);
                        o0VarE.K(objQ);
                    }
                }
                r rVarC5 = v.c((e23.l) objQ, aVar3, false);
                if (str == null) {
                    str4 = "";
                } else {
                    str4 = str;
                }
                bVar.getClass();
                d92.b.f58624b.getClass();
                mh.c(str4, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, 0, 0, 131068);
                s5.x0 x0VarI = x.i(o0VarE);
                bVar2.getClass();
                mh.c(str2, c2.l.C(aVar3, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarI, o0VarE, (i15 >> 9) & 14, 0, 131068);
                mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x.i(o0VarE), o0VarE, (i15 >> 12) & 14, 0, 131070);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                if (aVar2.f186423i) {
                    o0VarE.C(-1958463106);
                    c2.l.f(u2Var.a(aVar3, 1.0f, true), o0VarE);
                    bVar2.getClass();
                    r rVarQ = x2.q(aVar3, j92.b.f97901d.f97904c);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = g5.a(t62.b.f162798a);
                    String strQ = gl1.y.Q(o0VarE, R.string.concept_personal_records);
                    gl.c.f77766a.getClass();
                    i7.b(dVarA, strQ, rVarQ, gl.c.f77767b.M, o0VarE, 0, 0);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1958116185);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            fVar = g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            u2Var = u2.f22900a;
            r rVarC6 = u2Var.c(aVar3, d.a.f81534l);
            u4.d dVarS2 = x0Var.s(z14);
            h.f67736a.getClass();
            long jA3 = h.a(o0VarE);
            long jA4 = n5.a.a(o0VarE, x0Var.f4366i);
            bVar2.getClass();
            i.a(rVarC6, dVarS2, jA3, jA4, eVar.f97923h, 0.0f, null, o0VarE, 0, 224);
            bVar2.getClass();
            float f15 = eVar.f97920e;
            bVar2.getClass();
            r rVarC7 = c2.l.C(aVar3, f15, 0.0f, eVar.f97920e, 0.0f, 10);
            bVar2.getClass();
            zVarA = y.a(j.i(eVar.f97917b), d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarC7, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            aVar2 = aVar;
            strJ = aVar2.f186416b;
            if (strJ == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -577816535, R.string.txt_untitle, o0VarE, false);
            } else {
                o0VarE.C(-577817310);
                o0VarE.g0(false);
            }
            mh.c(strJ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x.g(o0VarE), o0VarE, 0, 0, 131070);
            if ((i15 & 14) == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            objQ = o0VarE.q();
            if (z15) {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a(aVar2, 1);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new a(aVar2, 1);
                o0VarE.K(objQ);
            }
            r rVarC8 = v.c((e23.l) objQ, aVar3, false);
            if (str == null) {
                str4 = "";
            } else {
                str4 = str;
            }
            bVar.getClass();
            d92.b.f58624b.getClass();
            mh.c(str4, rVarC8, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, 0, 0, 131068);
            s5.x0 x0VarI2 = x.i(o0VarE);
            bVar2.getClass();
            mh.c(str2, c2.l.C(aVar3, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarI2, o0VarE, (i15 >> 9) & 14, 0, 131068);
            mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x.i(o0VarE), o0VarE, (i15 >> 12) & 14, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            if (aVar2.f186423i) {
                o0VarE.C(-1958463106);
                c2.l.f(u2Var.a(aVar3, 1.0f, true), o0VarE);
                bVar2.getClass();
                r rVarQ2 = x2.q(aVar3, j92.b.f97901d.f97904c);
                s62.a.f157643a.getClass();
                u4.d dVarA2 = g5.a(t62.b.f162798a);
                String strQ2 = gl1.y.Q(o0VarE, R.string.concept_personal_records);
                gl.c.f77766a.getClass();
                i7.b(dVarA2, strQ2, rVarQ2, gl.c.f77767b.M, o0VarE, 0, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1958116185);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(aVar2, str, str2, str3, z14, i14, 12);
        }
    }
}
