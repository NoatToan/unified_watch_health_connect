package zz1;

import aa2.k;
import aa2.o;
import c02.e;
import c02.h;
import c2.b0;
import c2.j;
import c2.q;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import f5.z0;
import f72.s2;
import gl1.y;
import h4.r;
import h5.e0;
import h5.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import o4.d0;
import org.joda.time.LocalDate;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import w52.j0;
import w52.k0;
import yz1.z;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static final void a(r rVar, Double d14, Double d15, l<? super Double, String> lVar, l<? super Double, String> lVar2, String str, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1759574941);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(d14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(d15) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(str) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            h.a(rVar, d14, d15, lVar, lVar2, str, o0VarE, i15 & 524286);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(rVar, d14, d15, lVar, lVar2, str, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0088 A[EDGE_INSN: B:47:0x0088->B:48:0x0089 BREAK  A[LOOP:0: B:42:0x0079->B:72:?]] */
    public static final void b(r rVar, d dVar, a aVar, m mVar, int i14) {
        r rVar2;
        int i15;
        a aVar2;
        rVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1870883611);
        if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i15 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(aVar) ? 256 : 128;
        }
        boolean z14 = true;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Integer num = dVar != null ? dVar.f207638b : null;
            Integer num2 = dVar != null ? dVar.f207639c : null;
            if (dVar == null) {
                z14 = false;
                break;
            }
            i53.c<Integer> cVar = dVar.f207640d;
            if (!cVar.isEmpty()) {
                Iterator<Integer> it = cVar.iterator();
                do {
                    if (!it.hasNext()) {
                        z14 = false;
                        break;
                    }
                } while (it.next() == null);
            } else {
                z14 = false;
                break;
            }
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new zw.b(7);
                o0VarE.K(objQ);
            }
            l lVar = (l) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new zw.b(8);
                o0VarE.K(objQ2);
            }
            l lVar2 = (l) objQ2;
            String strQ = y.Q(o0VarE, R.string.title_intensity_minutes);
            String strQ2 = y.Q(o0VarE, R.string.no_data_label);
            if (num == null || num2 == null) {
                o0VarE.C(298422911);
                o0VarE.g0(false);
            } else {
                o0VarE.C(297798106);
                strQ2 = h0.k0(x.k(y.P(R.string.lbl_out_of_goal_1, new Object[]{(String) lVar.invoke(Double.valueOf(num.intValue())), y.P(R.string.lbl_plural_more_than_one_minute, new Object[]{lVar2.invoke(Double.valueOf(num2.intValue()))}, o0VarE)}, o0VarE), y.P(R.string.msg_percent_of_weekly_goal_met, new Object[]{Integer.valueOf((int) ((num.intValue() / num2.intValue()) * 100))}, o0VarE)), ". ", null, null, null, 62);
                o0VarE.g0(false);
            }
            z3.e eVarC = f.c(-1304292616, new x91.n(num, num2, lVar, lVar2, strQ2, 9), o0VarE);
            if (z14) {
                o0VarE.C(298909208);
                d(rVar2, dVar, strQ, aVar, f.c(-168944131, new k(eVarC, 19), o0VarE), o0VarE, ((i15 << 3) & 7168) | (i15 & 14) | 24576 | (i15 & 112));
                aVar2 = aVar;
                o0VarE.g0(false);
            } else {
                int i16 = i15;
                aVar2 = aVar;
                o0VarE.C(299111762);
                c(rVar, dVar, strQ, aVar2.f207631a, f.c(-1097364448, new k(eVarC, 20), o0VarE), o0VarE, (i16 & 14) | 24576 | (i16 & 112));
                o0VarE.g0(false);
            }
            x1 x1Var2 = n.f135158a;
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(rVar, dVar, aVar2, i14, 23);
        }
    }

    public static final void c(r rVar, d dVar, String str, e23.a aVar, z3.e eVar, m mVar, int i14) {
        r rVar2;
        int i15;
        e23.a aVar2;
        o0 o0Var;
        Integer num;
        o0 o0VarE = mVar.E(-922732610);
        if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i15 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            aVar2 = aVar;
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        } else {
            aVar2 = aVar;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(eVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            yz1.d dVar2 = dVar != null ? dVar.f207637a : null;
            s62.a.f157643a.getClass();
            u4.d dVarA = s2.a(t62.c.f162799a);
            f02.r.f67746a.getClass();
            gl.c.f77766a.getClass();
            d0 d0VarA = d0.a(gl.c.a(o0VarE).i());
            z3.e eVarC = f.c(-707047365, new o(eVar, 21), o0VarE);
            z zVar = (dVar == null || (num = dVar.f207638b) == null || num.intValue() == 0 || dVar.f207639c == null) ? z.EMPTY : z.VALID_DATA;
            o0Var = o0VarE;
            yz1.y.c(rVar2, dVar2, str, str, dVarA, d0VarA, 0.0f, 0, null, 0.0f, null, null, null, null, eVarC, aVar2, zVar, y.Q(o0VarE, R.string.intensity_minutes_card_no_data_state_message), null, null, o0Var, (i15 & 910) | ((i15 << 3) & 7168), ((i15 << 6) & 458752) | 24576, 802752);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j0(rVar, dVar, str, aVar, eVar, i14, 13);
        }
    }

    public static final void d(r rVar, d dVar, String str, a aVar, z3.e eVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(1894557659);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(eVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            yz1.d dVar2 = dVar != null ? dVar.f207637a : null;
            s62.a.f157643a.getClass();
            u4.d dVarA = s2.a(t62.c.f162799a);
            f02.r.f67746a.getClass();
            gl.c.f77766a.getClass();
            o0Var = o0VarE;
            yz1.y.d(rVar, dVar2, str, str, dVarA, d0.a(gl.c.a(o0VarE).i()), 0.0f, 0, null, 0.0f, null, null, false, 0L, null, f.c(-1045487817, new o(eVar, 22), o0VarE), f.c(-1216327274, new b(dVar, str), o0VarE), aVar.f207631a, aVar.f207632b, aVar.f207633c, null, y.Q(o0VarE, R.string.intensity_minutes_card_no_data_state_message), null, null, o0Var, (i15 & 910) | ((i15 << 3) & 7168), 1769472, 0, 13664192);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j0(rVar, dVar, str, aVar, eVar, i14, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0126  */
    /* JADX WARN: Code duplicated, block: B:51:0x0129  */
    /* JADX WARN: Code duplicated, block: B:54:0x015c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0163  */
    /* JADX WARN: Code duplicated, block: B:57:0x0167  */
    /* JADX WARN: Code duplicated, block: B:62:0x0182  */
    /* JADX WARN: Code duplicated, block: B:65:0x0193  */
    /* JADX WARN: Code duplicated, block: B:66:0x0196  */
    /* JADX WARN: Code duplicated, block: B:69:0x019f  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x0205  */
    /* JADX WARN: Code duplicated, block: B:86:0x0229  */
    /* JADX WARN: Code duplicated, block: B:88:0x0230  */
    /* JADX WARN: Code duplicated, block: B:91:0x0293  */
    /* JADX WARN: Code duplicated, block: B:93:0x0297  */
    /* JADX WARN: Code duplicated, block: B:95:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:97:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:99:0x02c0  */
    public static final void e(d dVar, String str, m mVar, int i14) {
        o0 o0Var;
        List listG;
        Integer num;
        g.a.f fVar;
        float fI;
        float f14;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        m92.h0.e.a aVar;
        float f15;
        m92.h0.e.a aVar2;
        float f16;
        float fIntValue;
        float fMax;
        boolean zI;
        Object objQ;
        Object cVar;
        List list;
        float f17;
        long j8;
        float f18;
        float f19;
        m92.h0.e.a aVar3;
        m92.h0.e.a aVar4;
        boolean zR;
        Object objQ2;
        c02.c cVarC;
        i53.c cVarB;
        d dVar2 = dVar;
        o0 o0VarE = mVar.E(501729810);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(dVar2) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            gl.c.f77766a.getClass();
            long jG = gl.c.a(o0VarE).g();
            if (dVar2 != null) {
                ArrayList arrayList = new ArrayList(dVar2.f207640d);
                if (arrayList.size() > 0) {
                    arrayList.set(0, 0);
                }
                i53.f fVarJ = i53.a.j(arrayList);
                if (fVarJ == null || (listG = c02.a.g(fVarJ)) == null) {
                    listG = p13.j0.f134944a;
                }
            } else {
                listG = p13.j0.f134944a;
            }
            Integer num2 = dVar2 != null ? dVar2.f207639c : null;
            String strP = y.P(R.string.msg_view_last_7_day_feature_trend, new Object[]{str}, o0VarE);
            r.a aVar5 = r.S;
            r rVarD = x2.d(aVar5, 1.0f);
            boolean zB = o0VarE.B(strP);
            Object objQ3 = o0VarE.q();
            m.a aVar6 = m.f135153a;
            if (zB) {
                objQ3 = new y01.k(strP, 29);
                o0VarE.K(objQ3);
            } else {
                aVar6.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new y01.k(strP, 29);
                    o0VarE.K(objQ3);
                }
            }
            r rVarC2 = v.c((l) objQ3, rVarD, false);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC3 = h4.k.c(rVarC2, o0VarE);
            g.V.getClass();
            e0.a aVar7 = g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
            } else {
                o0VarE.c();
            }
            g.a.e eVar = g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            g.a.C1623g c1623g = g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T) {
                num = num2;
            } else {
                num = num2;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                b0 b0Var = b0.f22601a;
                fI = yz1.y.i(o0VarE);
                if (((g6.c) o0VarE.A(t1.f91490h)).getF75992b() > 1.5f) {
                    f14 = 8.0f;
                } else {
                    f14 = 4.0f;
                }
                g6.f.a aVar8 = g6.f.f75994b;
                r rVarZ = c2.l.z(b0Var.a(x2.f(aVar5, 1.0f), 1.0f, true), f14, 2 * f14);
                z0VarD = q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarZ, o0VarE);
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
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                u uVar = u.f22885a;
                aVar = (m92.h0.e.a) h0.n0(listG);
                if (aVar != null) {
                    f15 = aVar.f117347b;
                } else {
                    f15 = 0.0f;
                }
                aVar2 = (m92.h0.e.a) h0.d0(listG);
                if (aVar2 != null) {
                    f16 = aVar2.f117347b;
                } else {
                    f16 = 0.0f;
                }
                if (num != null) {
                    fIntValue = num.intValue();
                } else {
                    fIntValue = 0.0f;
                }
                fMax = Math.max(f15, fIntValue);
                zI = o0VarE.i(fI) | o0VarE.l(jG) | o0VarE.r(listG) | o0VarE.i(f16) | o0VarE.i(fMax);
                objQ = o0VarE.q();
                if (zI) {
                    float f22 = f16;
                    list = listG;
                    f17 = 1.0f;
                    cVar = new f71.c(fI, jG, list, f22, fMax);
                    j8 = jG;
                    f18 = f22;
                    f19 = fMax;
                    o0VarE.K(cVar);
                } else {
                    aVar6.getClass();
                    if (objQ == m.a.f135155b) {
                        float f24 = f16;
                        list = listG;
                        f17 = 1.0f;
                        cVar = new f71.c(fI, jG, list, f24, fMax);
                        j8 = jG;
                        f18 = f24;
                        f19 = fMax;
                        o0VarE.K(cVar);
                    } else {
                        list = listG;
                        cVar = objQ;
                        j8 = jG;
                        f19 = fMax;
                        f18 = f16;
                        f17 = 1.0f;
                    }
                }
                l lVar = (l) cVar;
                aVar3 = (m92.h0.e.a) h0.n0(list);
                if (aVar3 == null) {
                    aVar3 = new m92.h0.e.a(0.0f, 0.0f);
                }
                aVar4 = aVar3;
                zR = o0VarE.r(aVar4) | o0VarE.l(j8) | o0VarE.i(f14) | o0VarE.i(f18) | o0VarE.i(f19);
                objQ2 = o0VarE.q();
                if (zR) {
                    f71.c cVar3 = new f71.c(aVar4, j8, f14, f18, f19, 3);
                    o0VarE.K(cVar3);
                    objQ2 = cVar3;
                } else {
                    aVar6.getClass();
                    if (objQ2 == m.a.f135155b) {
                        f71.c cVar4 = new f71.c(aVar4, j8, f14, f18, f19, 3);
                        o0VarE.K(cVar4);
                        objQ2 = cVar4;
                    }
                }
                o0Var = o0VarE;
                m92.r.b(x2.d(r16, f17), i53.a.a(lVar, (l) objQ2), null, null, false, y.Q(o0VarE, R.string.common_no_data), 0.0f, 0.0f, null, null, null, o0Var, 6, 0, 2012);
                o0Var.g0(true);
                r rVarF = x2.f(aVar5, f17);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarC4 = c2.l.C(rVarF, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7);
                dVar2 = dVar;
                if (dVar != null) {
                    cVarC = dVar2.f207642f;
                } else {
                    LocalDate localDateNow = LocalDate.now();
                    localDateNow.getClass();
                    cVarC = c02.n.c(localDateNow);
                }
                c02.c cVar5 = cVarC;
                if (dVar2 != null) {
                    cVarB = dVar2.f207641e;
                } else {
                    cVarB = j53.l.b();
                }
                c02.n.a(rVarC4, cVarB, cVar5, null, c02.c.MONDAY, 0, null, false, o0Var, 27648, 224);
                o0Var.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            fVar = g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var2 = b0.f22601a;
            fI = yz1.y.i(o0VarE);
            if (((g6.c) o0VarE.A(t1.f91490h)).getF75992b() > 1.5f) {
                f14 = 8.0f;
            } else {
                f14 = 4.0f;
            }
            g6.f.a aVar9 = g6.f.f75994b;
            r rVarZ2 = c2.l.z(b0Var2.a(x2.f(aVar5, 1.0f), 1.0f, true), f14, 2 * f14);
            z0VarD = q.d(h4.d.a.f81524b, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarZ2, o0VarE);
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
            b4.c(eVar, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, o0VarE);
            u uVar2 = u.f22885a;
            aVar = (m92.h0.e.a) h0.n0(listG);
            if (aVar != null) {
                f15 = aVar.f117347b;
            } else {
                f15 = 0.0f;
            }
            aVar2 = (m92.h0.e.a) h0.d0(listG);
            if (aVar2 != null) {
                f16 = aVar2.f117347b;
            } else {
                f16 = 0.0f;
            }
            if (num != null) {
                fIntValue = num.intValue();
            } else {
                fIntValue = 0.0f;
            }
            fMax = Math.max(f15, fIntValue);
            zI = o0VarE.i(fI) | o0VarE.l(jG) | o0VarE.r(listG) | o0VarE.i(f16) | o0VarE.i(fMax);
            objQ = o0VarE.q();
            if (zI) {
                aVar6.getClass();
                if (objQ == m.a.f135155b) {
                    float f25 = f16;
                    list = listG;
                    f17 = 1.0f;
                    cVar = new f71.c(fI, jG, list, f25, fMax);
                    j8 = jG;
                    f18 = f25;
                    f19 = fMax;
                    o0VarE.K(cVar);
                } else {
                    list = listG;
                    cVar = objQ;
                    j8 = jG;
                    f19 = fMax;
                    f18 = f16;
                    f17 = 1.0f;
                }
            } else {
                float f26 = f16;
                list = listG;
                f17 = 1.0f;
                cVar = new f71.c(fI, jG, list, f26, fMax);
                j8 = jG;
                f18 = f26;
                f19 = fMax;
                o0VarE.K(cVar);
            }
            l lVar2 = (l) cVar;
            aVar3 = (m92.h0.e.a) h0.n0(list);
            if (aVar3 == null) {
                aVar3 = new m92.h0.e.a(0.0f, 0.0f);
            }
            aVar4 = aVar3;
            zR = o0VarE.r(aVar4) | o0VarE.l(j8) | o0VarE.i(f14) | o0VarE.i(f18) | o0VarE.i(f19);
            objQ2 = o0VarE.q();
            if (zR) {
                aVar6.getClass();
                if (objQ2 == m.a.f135155b) {
                    f71.c cVar6 = new f71.c(aVar4, j8, f14, f18, f19, 3);
                    o0VarE.K(cVar6);
                    objQ2 = cVar6;
                }
            } else {
                f71.c cVar7 = new f71.c(aVar4, j8, f14, f18, f19, 3);
                o0VarE.K(cVar7);
                objQ2 = cVar7;
            }
            o0Var = o0VarE;
            m92.r.b(x2.d(r16, f17), i53.a.a(lVar2, (l) objQ2), null, null, false, y.Q(o0VarE, R.string.common_no_data), 0.0f, 0.0f, null, null, null, o0Var, 6, 0, 2012);
            o0Var.g0(true);
            r rVarF2 = x2.f(aVar5, f17);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarC5 = c2.l.C(rVarF2, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7);
            dVar2 = dVar;
            if (dVar != null) {
                cVarC = dVar2.f207642f;
            } else {
                LocalDate localDateNow2 = LocalDate.now();
                localDateNow2.getClass();
                cVarC = c02.n.c(localDateNow2);
            }
            c02.c cVar8 = cVarC;
            if (dVar2 != null) {
                cVarB = dVar2.f207641e;
            } else {
                cVarB = j53.l.b();
            }
            c02.n.a(rVarC5, cVarB, cVar8, null, c02.c.MONDAY, 0, null, false, o0Var, 27648, 224);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(dVar2, str, i14);
        }
    }
}
