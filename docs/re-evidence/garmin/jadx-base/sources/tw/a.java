package tw;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.common.base.Ascii;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k2.i;
import kw.o;
import kw.p;
import o4.m1;
import o53.f0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
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
import p5.v;
import s5.x0;
import t21.l0;
import tn2.n0;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:42:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:54:0x0208  */
    /* JADX WARN: Code duplicated, block: B:56:0x020f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0217  */
    /* JADX WARN: Code duplicated, block: B:63:0x0235  */
    /* JADX WARN: Code duplicated, block: B:68:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:71:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:72:0x02af  */
    /* JADX WARN: Code duplicated, block: B:74:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:77:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:92:0x031a  */
    /* JADX WARN: Code duplicated, block: B:94:0x032d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(qw.g gVar, p pVar, e23.a<Unit> aVar, m mVar, int i14) {
        e23.a<Unit> aVar2;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        m.a aVar3;
        boolean z14;
        v60.a aVar4;
        kw.m mVar2;
        boolean z15;
        int i15;
        int i16;
        j92.f fVar2;
        x0 x0Var;
        j92.b bVar;
        j92.e eVar;
        p3.c<?> cVar2;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        boolean zR;
        Object objQ;
        qw.g gVar2 = gVar;
        gVar2.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(414953188);
        p3.c<?> cVar3 = o0VarE.f135177b;
        int i17 = i14 | (o0VarE.r(gVar2) ? 4 : 2) | (o0VarE.r(pVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            p1 p1VarG = f0.G(gVar2.f148252g, o0VarE);
            List<pw.a> listB = pVar != null ? pVar.f106894a.b() : null;
            DateTime dateTimeD = pVar != null ? pVar.f106894a.d() : null;
            r.a aVar5 = r.S;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar6 = h4.d.a.f81536n;
            z zVarA2 = y.a(kVar, aVar6, o0VarE, 0);
            List<pw.a> list = listB;
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(aVar5, o0VarE);
            h5.g.V.getClass();
            DateTime dateTime = dateTimeD;
            e0.a aVar7 = h5.g.a.f81805b;
            if (cVar3 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar3;
            } else {
                cVar = cVar3;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                b0 b0Var = b0.f22601a;
                aVar3 = m.f135153a;
                if (pVar != null) {
                    mVar2 = pVar.f106895b;
                    if (dateTime != null) {
                        z14 = true;
                    } else if (list != null) {
                        z14 = true;
                        if (!list.isEmpty()) {
                            o0VarE.C(923593037);
                            if (g22.k.k(dateTime)) {
                                i15 = 1415267018;
                                i16 = R.string.lbl_today_readings;
                                z15 = false;
                            } else {
                                z15 = false;
                                i15 = 1415268746;
                                i16 = R.string.lbl_blood_pressure;
                            }
                            String strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, z15);
                            d92.b.f58623a.getClass();
                            fVar2 = d92.b.f58624b;
                            fVar2.getClass();
                            x0Var = j92.f.f97931h;
                            x0 x0VarB = d92.c.b(d92.c.e(x0Var), o0VarE);
                            bVar = d92.b.f58625c;
                            bVar.getClass();
                            eVar = j92.b.f97899b;
                            float f14 = eVar.f97920e;
                            float f15 = eVar.f97920e;
                            bVar.getClass();
                            float f16 = eVar.f97920e;
                            bVar.getClass();
                            cVar2 = cVar;
                            mh.c(strJ, l.C(aVar5, f14, f16, 0.0f, eVar.f97922g, 4), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                            f.a(list, mVar2, o0VarE, z15 ? 1 : 0);
                            String str = mVar2.f106879c;
                            fVar2.getClass();
                            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
                            bVar.getClass();
                            bVar.getClass();
                            bVar.getClass();
                            float f17 = eVar.f97918c;
                            bVar.getClass();
                            mh.c(str, l.B(aVar5, f15, f17, f15, eVar.f97922g), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
                            r rVarE = u1.n.e(aVar5, d92.b.a(o0VarE).c().b(), m1.f128891a);
                            zVarA = y.a(kVar, aVar6, o0VarE, 0);
                            iHashCode = Long.hashCode(o0VarE.U);
                            i2VarA0 = o0VarE.a0();
                            rVarC = k.c(rVarE, o0VarE);
                            if (cVar2 != null) {
                                p0.l();
                                throw null;
                            }
                            o0VarE.z();
                            if (o0VarE.T) {
                                o0VarE.M(aVar7);
                            } else {
                                o0VarE.c();
                            }
                            b4.c(eVar2, zVarA, o0VarE);
                            b4.c(c1623g, i2VarA0, o0VarE);
                            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                            }
                            b4.c(fVar, rVarC, o0VarE);
                            String strP = gl1.y.P(R.string.lbl_readings_value_in_parantheses, new Object[]{String.valueOf(list.size())}, o0VarE);
                            fVar2.getClass();
                            bVar.getClass();
                            float f18 = eVar.f97920e;
                            bVar.getClass();
                            float f19 = eVar.f97920e;
                            bVar.getClass();
                            mh.c(strP, l.C(aVar5, f18, f19, 0.0f, eVar.f97918c, 4), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 131068);
                            o0VarE = o0VarE;
                            o oVar = pVar.f106894a;
                            gVar2 = gVar;
                            zR = o0VarE.r(gVar2);
                            objQ = o0VarE.q();
                            if (zR) {
                                z14 = true;
                                objQ = new qw.d(gVar2, 1);
                                o0VarE.K(objQ);
                            } else {
                                aVar3.getClass();
                                if (objQ == m.a.f135155b) {
                                    z14 = true;
                                    objQ = new qw.d(gVar2, 1);
                                    o0VarE.K(objQ);
                                } else {
                                    z14 = true;
                                }
                            }
                            d(oVar, mVar2, (e23.l) objQ, o0VarE, 0);
                            o0VarE.g0(z14);
                            o0VarE.g0(false);
                            aVar2 = aVar;
                        }
                    } else {
                        z14 = true;
                    }
                    o0VarE.C(925225807);
                    aVar2 = aVar;
                    b(aVar2, o0VarE, (i17 >> 6) & 14);
                    o0VarE.g0(false);
                } else {
                    z14 = true;
                    o0VarE.C(925225807);
                    aVar2 = aVar;
                    b(aVar2, o0VarE, (i17 >> 6) & 14);
                    o0VarE.g0(false);
                }
                aVar4 = (v60.a) p1VarG.getF182175a();
                if (aVar4 == null && aVar4.f175792a == z14) {
                    o0VarE.C(925349900);
                    v60.a aVar8 = (v60.a) p1VarG.getF182175a();
                    String str2 = aVar8 != null ? aVar8.f175793b : null;
                    boolean zR2 = o0VarE.r(gVar2);
                    Object objQ2 = o0VarE.q();
                    if (zR2) {
                        objQ2 = new qw.e(gVar2, 2);
                        o0VarE.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new qw.e(gVar2, 2);
                            o0VarE.K(objQ2);
                        }
                    }
                    g.a(0, (e23.a) objQ2, str2, o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(925499816);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z14);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var2 = b0.f22601a;
            aVar3 = m.f135153a;
            if (pVar != null) {
                mVar2 = pVar.f106895b;
                if (dateTime != null) {
                    z14 = true;
                } else if (list != null) {
                    z14 = true;
                    if (!list.isEmpty()) {
                        o0VarE.C(923593037);
                        if (g22.k.k(dateTime)) {
                            i15 = 1415267018;
                            i16 = R.string.lbl_today_readings;
                            z15 = false;
                        } else {
                            z15 = false;
                            i15 = 1415268746;
                            i16 = R.string.lbl_blood_pressure;
                        }
                        String strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, z15);
                        d92.b.f58623a.getClass();
                        fVar2 = d92.b.f58624b;
                        fVar2.getClass();
                        x0Var = j92.f.f97931h;
                        x0 x0VarB2 = d92.c.b(d92.c.e(x0Var), o0VarE);
                        bVar = d92.b.f58625c;
                        bVar.getClass();
                        eVar = j92.b.f97899b;
                        float f110 = eVar.f97920e;
                        float f111 = eVar.f97920e;
                        bVar.getClass();
                        float f112 = eVar.f97920e;
                        bVar.getClass();
                        cVar2 = cVar;
                        mh.c(strJ2, l.C(aVar5, f110, f112, 0.0f, eVar.f97922g, 4), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, 0, 0, 131068);
                        f.a(list, mVar2, o0VarE, z15 ? 1 : 0);
                        String str3 = mVar2.f106879c;
                        fVar2.getClass();
                        x0 x0VarF2 = d92.c.f(j92.f.f97933j, o0VarE);
                        bVar.getClass();
                        bVar.getClass();
                        bVar.getClass();
                        float f113 = eVar.f97918c;
                        bVar.getClass();
                        mh.c(str3, l.B(aVar5, f111, f113, f111, eVar.f97922g), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, o0VarE, 0, 0, 131068);
                        r rVarE2 = u1.n.e(aVar5, d92.b.a(o0VarE).c().b(), m1.f128891a);
                        zVarA = y.a(kVar, aVar6, o0VarE, 0);
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        rVarC = k.c(rVarE2, o0VarE);
                        if (cVar2 != null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar7);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar2, zVarA, o0VarE);
                        b4.c(c1623g, i2VarA0, o0VarE);
                        if (o0VarE.T) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                        } else {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                        }
                        b4.c(fVar, rVarC, o0VarE);
                        String strP2 = gl1.y.P(R.string.lbl_readings_value_in_parantheses, new Object[]{String.valueOf(list.size())}, o0VarE);
                        fVar2.getClass();
                        bVar.getClass();
                        float f114 = eVar.f97920e;
                        bVar.getClass();
                        float f115 = eVar.f97920e;
                        bVar.getClass();
                        mh.c(strP2, l.C(aVar5, f114, f115, 0.0f, eVar.f97918c, 4), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 131068);
                        o0VarE = o0VarE;
                        o oVar2 = pVar.f106894a;
                        gVar2 = gVar;
                        zR = o0VarE.r(gVar2);
                        objQ = o0VarE.q();
                        if (zR) {
                            aVar3.getClass();
                            if (objQ == m.a.f135155b) {
                                z14 = true;
                                objQ = new qw.d(gVar2, 1);
                                o0VarE.K(objQ);
                            } else {
                                z14 = true;
                            }
                        } else {
                            z14 = true;
                            objQ = new qw.d(gVar2, 1);
                            o0VarE.K(objQ);
                        }
                        d(oVar2, mVar2, (e23.l) objQ, o0VarE, 0);
                        o0VarE.g0(z14);
                        o0VarE.g0(false);
                        aVar2 = aVar;
                    }
                } else {
                    z14 = true;
                }
                o0VarE.C(925225807);
                aVar2 = aVar;
                b(aVar2, o0VarE, (i17 >> 6) & 14);
                o0VarE.g0(false);
            } else {
                z14 = true;
                o0VarE.C(925225807);
                aVar2 = aVar;
                b(aVar2, o0VarE, (i17 >> 6) & 14);
                o0VarE.g0(false);
            }
            aVar4 = (v60.a) p1VarG.getF182175a();
            if (aVar4 == null) {
                o0VarE.C(925499816);
                o0VarE.g0(false);
            } else {
                o0VarE.C(925499816);
                o0VarE.g0(false);
            }
            o0VarE.g0(z14);
        } else {
            o0VarE = o0VarE;
            aVar2 = aVar;
            gVar2 = gVar2;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new tb0.h(gVar2, pVar, aVar2, i14, 5);
        }
    }

    public static final void b(e23.a<Unit> aVar, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(911545883);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_index_bpm);
            String lowerCase = gl1.y.Q(o0VarE, R.string.lbl_device).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            String str = String.format("%s %s", Arrays.copyOf(new Object[]{strQ, lowerCase}, 2));
            r.a aVar2 = r.S;
            h4.d.f81522a.getClass();
            r rVarX = x2.x(aVar2, h4.d.a.f81533k, 2);
            s62.a.f157643a.getClass();
            u4.d dVarA = f72.g.a(t62.c.f162799a);
            gl.c.f77766a.getClass();
            long jM = gl.c.a(o0VarE).m();
            o0VarE.C(467468645);
            z3.e eVarC = z3.f.c(1901661544, new j21.r(dVarA, jM, 3, (byte) 0), o0VarE);
            o0VarE.g0(false);
            b82.n.b(eVarC, gl1.y.Q(o0VarE, R.string.lbl_no_readings), gl1.y.P(R.string.msg_add_bp_reading_instructions, new Object[]{str}, o0VarE), rVarX, gl1.y.Q(o0VarE, R.string.lbl_add_reading), aVar, null, null, o0VarE, ((i15 << 15) & 458752) | 3072, 192);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.c(aVar, i14, 16);
        }
    }

    public static final void c(String str, String str2, m mVar, int i14) {
        o0 o0Var;
        int i15;
        String str3 = str;
        o0 o0VarE = mVar.E(-372786241);
        int i16 = i14 | (o0VarE.B(str3) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (str3 == null) {
                o0VarE.C(1110606828);
                o0VarE.g0(false);
                o0Var = o0VarE;
                i15 = 1;
            } else {
                o0VarE.C(1110606829);
                r.a aVar = r.S;
                r rVarE = u1.n.e(x2.f(aVar, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                bVar.getClass();
                float f15 = eVar.f97918c;
                bVar.getClass();
                r rVarC = l.C(rVarE, f14, f15, 0.0f, eVar.f97918c, 4);
                Object objQ = o0VarE.q();
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new n0(21);
                    o0VarE.K(objQ);
                }
                r rVarC2 = v.c((e23.l) objQ, rVarC, true);
                j.f22691a.getClass();
                j.g gVar = j.f22698h;
                h4.d.f81522a.getClass();
                s2 s2VarA = q2.a(gVar, h4.d.a.f81533k, o0VarE, 6);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC3 = k.c(rVarC2, o0VarE);
                h5.g.V.getClass();
                e0.a aVar2 = h5.g.a.f81805b;
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
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC3, o0VarE);
                u2 u2Var = u2.f22900a;
                d92.b.f58624b.getClass();
                mh.c(str2, u2Var.a(aVar, 0.5f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, (i16 >> 3) & 14, 0, 131068);
                str3 = str;
                mh.c(str3, u2Var.a(aVar, 0.5f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, o0VarE, 0, 0, 262140);
                o0Var = o0VarE;
                i15 = 1;
                o0Var.g0(true);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            i15 = 1;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rv1.s(str3, str2, i14, i15);
        }
    }

    public static final void d(o oVar, kw.m mVar, e23.l<? super pw.a, Unit> lVar, m mVar2, int i14) {
        o0 o0VarE = mVar2.E(-738912176);
        int i15 = (o0VarE.r(oVar) ? 4 : 2) | i14 | (o0VarE.r(mVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            List<pw.a> listB = oVar.b();
            if (listB == null) {
                o0VarE.C(-1225087130);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1225087129);
                Iterator<T> it = listB.iterator();
                while (it.hasNext()) {
                    e((pw.a) it.next(), mVar, lVar, o0VarE, pw.a.f141687m | (i15 & 112) | (i15 & 896));
                }
                o0VarE.g0(false);
            }
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new tb0.h(oVar, mVar, lVar, i14, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0185  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01de  */
    /* JADX WARN: Code duplicated, block: B:78:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:80:0x0203  */
    /* JADX WARN: Code duplicated, block: B:81:0x0207  */
    /* JADX WARN: Code duplicated, block: B:86:0x0222  */
    /* JADX WARN: Code duplicated, block: B:89:0x022a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0239  */
    /* JADX WARN: Code duplicated, block: B:92:0x034a  */
    /* JADX WARN: Code duplicated, block: B:94:0x034e  */
    public static final void e(pw.a aVar, kw.m mVar, e23.l<? super pw.a, Unit> lVar, m mVar2, int i14) {
        int i15;
        o0 o0Var;
        e23.l<? super pw.a, Unit> lVar2;
        Object next;
        String str;
        Integer numValueOf;
        int i16;
        h5.g.a.f fVar;
        Object objQ;
        h4.g.b bVar;
        j.C0343j c0343j;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        u2 u2Var;
        s2 s2VarA2;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        char c14;
        int i17;
        pw.a aVar2 = aVar;
        o0 o0VarE = mVar2.E(1719047841);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(aVar2) : o0VarE.r(aVar2) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(mVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            new yw.b(context);
            Iterator<T> it = mVar.f106878b.values().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!s.g(((kw.f) next).f106836a, aVar2.getCategoryName()));
            kw.f fVar2 = (kw.f) next;
            if (fVar2 != null) {
                str = fVar2.f106837b;
                numValueOf = Integer.valueOf(fVar2.f106844i);
                Unit unit = Unit.INSTANCE;
            } else {
                str = "";
                numValueOf = null;
            }
            String str2 = str;
            DateTime dateTime = new DateTime(aVar2.j(), DateTimeZone.getDefault());
            context.getClass();
            String upperCase = com.nimbusds.jose.shaded.gson.internal.a.i(DateFormat.is24HourFormat(context) ? "HH:mm" : "h:mm a", dateTime).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            r.a aVar3 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97920e;
            r rVarP = l.p(l.C(aVar3, 0.0f, 0.0f, 0.0f, f14, 7));
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = n.f135158a;
            Integer num = numValueOf;
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            r rVarC3 = k.c(rVarP, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
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
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T) {
                i16 = i15;
            } else {
                i16 = i15;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                b0 b0Var = b0.f22601a;
                bVar2.getClass();
                bVar2.getClass();
                r rVarF = x2.f(l.z(aVar3, f15, eVar.f97918c), 1.0f);
                objQ = o0VarE.q();
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new n0(20);
                    o0VarE.K(objQ);
                }
                r rVarC4 = v.c((e23.l) objQ, rVarF, true);
                bVar = h4.d.a.f81534l;
                c0343j = j.f22692b;
                s2VarA = q2.a(c0343j, bVar, o0VarE, 48);
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
                b4.c(eVar2, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(fVar, rVarC, o0VarE);
                u2Var = u2.f22900a;
                s2VarA2 = q2.a(c0343j, bVar, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = k.c(aVar3, o0VarE);
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
                b4.c(eVar2, s2VarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                }
                b4.c(fVar, rVarC2, o0VarE);
                if (num == null) {
                    o0VarE.C(719598774);
                    o0VarE.g0(false);
                    i17 = 0;
                    c14 = Ascii.MIN;
                } else {
                    o0VarE.C(719598775);
                    int iIntValue = num.intValue();
                    bVar2.getClass();
                    r rVarC5 = l.C(aVar3, 0.0f, 0.0f, eVar.f97918c, 0.0f, 11);
                    c14 = Ascii.MIN;
                    g6.f.a aVar5 = g6.f.f75994b;
                    r rVarE = u1.n.e(l4.k.b(x2.q(x2.c(rVarC5, 1.0f), 16), i.f102406a), n5.a.a(o0VarE, iIntValue), m1.f128891a);
                    i17 = 0;
                    q.a(rVarE, o0VarE, 0);
                    Unit unit2 = Unit.INSTANCE;
                    o0VarE.g0(false);
                }
                j92.f fVar3 = d92.b.f58624b;
                fVar3.getClass();
                x0 x0Var = j92.f.f97931h;
                x0 x0VarB = d92.c.b(x0Var, o0VarE);
                int i18 = i16;
                int i19 = i17;
                mh.c(upperCase, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131070);
                o0VarE.g0(true);
                l.f(u2Var.a(aVar3, 1.0f, true), o0VarE);
                fVar3.getClass();
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131070);
                o0Var = o0VarE;
                o0Var.g0(true);
                c(yw.b.e(aVar.getSystolic()), gl1.y.Q(o0Var, R.string.lbl_blood_pressure_systolic), o0Var, i19);
                c(yw.b.e(aVar.getDiastolic()), gl1.y.Q(o0Var, R.string.lbl_blood_pressure_diastolic), o0Var, i19);
                c(yw.b.e(aVar.getPulse()), gl1.y.Q(o0Var, R.string.activity_details_heart_rate), o0Var, i19);
                tn.k.n(bVar2, aVar3, f15, o0Var);
                aVar2 = aVar;
                lVar2 = lVar;
                b.a(aVar2, lVar2, o0Var, pw.a.f141687m | (i18 & 14) | ((i18 >> 3) & 112));
                o0Var.g0(true);
            }
            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar3);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var2 = b0.f22601a;
            bVar2.getClass();
            bVar2.getClass();
            r rVarF2 = x2.f(l.z(aVar3, f15, eVar.f97918c), 1.0f);
            objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new n0(20);
                o0VarE.K(objQ);
            }
            r rVarC6 = v.c((e23.l) objQ, rVarF2, true);
            bVar = h4.d.a.f81534l;
            c0343j = j.f22692b;
            s2VarA = q2.a(c0343j, bVar, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarC6, o0VarE);
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
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(fVar, rVarC, o0VarE);
            u2Var = u2.f22900a;
            s2VarA2 = q2.a(c0343j, bVar, o0VarE, 48);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = k.c(aVar3, o0VarE);
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
            b4.c(eVar2, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, o0VarE);
            if (num == null) {
                o0VarE.C(719598774);
                o0VarE.g0(false);
                i17 = 0;
                c14 = Ascii.MIN;
            } else {
                o0VarE.C(719598775);
                int iIntValue2 = num.intValue();
                bVar2.getClass();
                r rVarC7 = l.C(aVar3, 0.0f, 0.0f, eVar.f97918c, 0.0f, 11);
                c14 = Ascii.MIN;
                g6.f.a aVar6 = g6.f.f75994b;
                r rVarE2 = u1.n.e(l4.k.b(x2.q(x2.c(rVarC7, 1.0f), 16), i.f102406a), n5.a.a(o0VarE, iIntValue2), m1.f128891a);
                i17 = 0;
                q.a(rVarE2, o0VarE, 0);
                Unit unit3 = Unit.INSTANCE;
                o0VarE.g0(false);
            }
            j92.f fVar4 = d92.b.f58624b;
            fVar4.getClass();
            x0 x0Var2 = j92.f.f97931h;
            x0 x0VarB2 = d92.c.b(x0Var2, o0VarE);
            int i110 = i16;
            int i111 = i17;
            mh.c(upperCase, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, 0, 0, 131070);
            o0VarE.g0(true);
            l.f(u2Var.a(aVar3, 1.0f, true), o0VarE);
            fVar4.getClass();
            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var2, o0VarE), o0VarE, 0, 0, 131070);
            o0Var = o0VarE;
            o0Var.g0(true);
            c(yw.b.e(aVar.getSystolic()), gl1.y.Q(o0Var, R.string.lbl_blood_pressure_systolic), o0Var, i111);
            c(yw.b.e(aVar.getDiastolic()), gl1.y.Q(o0Var, R.string.lbl_blood_pressure_diastolic), o0Var, i111);
            c(yw.b.e(aVar.getPulse()), gl1.y.Q(o0Var, R.string.activity_details_heart_rate), o0Var, i111);
            tn.k.n(bVar2, aVar3, f15, o0Var);
            aVar2 = aVar;
            lVar2 = lVar;
            b.a(aVar2, lVar2, o0Var, pw.a.f141687m | (i110 & 14) | ((i110 >> 3) & 112));
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            lVar2 = lVar;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(aVar2, mVar, lVar2, false, i14, 9);
        }
    }
}
