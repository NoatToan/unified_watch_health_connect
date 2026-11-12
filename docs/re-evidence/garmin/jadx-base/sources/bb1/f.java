package bb1;

import a03.t0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import gl1.y;
import java.util.Set;
import l72.l2;
import o53.b0;
import p005kotlin.Unit;
import p13.u;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import r1.q2;
import sa1.h;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00af  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00be  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void a(int i14, int i15, l lVar, String str, m mVar, boolean z14) {
        String str2;
        int i16;
        boolean z15;
        int i17;
        l lVar2;
        int i18;
        int i19;
        boolean z16;
        boolean z17;
        l lVar3;
        p2 p2VarI0;
        String str3;
        l lVar4;
        String strD;
        boolean z18;
        boolean z19;
        Object objQ;
        o0 o0VarE = mVar.E(-1726248718);
        int i24 = i15 & 1;
        if (i24 != 0) {
            i16 = i14 | 6;
            str2 = str;
        } else {
            str2 = str;
            i16 = i14 | (o0VarE.B(str2) ? 4 : 2);
        }
        int i25 = i15 & 2;
        if (i25 == 0) {
            if ((i14 & 48) == 0) {
                z15 = z14;
                i16 |= o0VarE.h(z15) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                i19 = i16 | 384;
                lVar2 = lVar;
            } else {
                lVar2 = lVar;
                if (o0VarE.r(lVar2)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i19 = i16 | i18;
            }
            if ((i19 & 147) != 146) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i19 & 1, z16)) {
                if (i24 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i25 != 0) {
                    z15 = true;
                }
                if (i17 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar2;
                }
                x1 x1Var = n.f135158a;
                String strQ = y.Q(o0VarE, R.string.power_guide_title);
                if (z15) {
                    strD = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1263206696, R.string.power_guide_footer_note, o0VarE, false);
                } else {
                    o0VarE.C(1263284227);
                    strD = h.d((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                    o0VarE.g0(false);
                }
                b.f17304a.getClass();
                z3.e eVar = b.f17306c;
                z3.e eVar2 = b.f17307d;
                l72.p2 p2Var = l72.p2.f111205a;
                if ((i19 & 14) == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | ((i19 & 896) == 256);
                objQ = o0VarE.q();
                if (z19) {
                    objQ = new d(str3, lVar4);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new d(str3, lVar4);
                        o0VarE.K(objQ);
                    }
                }
                l lVar5 = lVar4;
                boolean z24 = z15;
                p2Var.h(strQ, strD, null, null, null, z24, false, eVar, eVar2, null, (e23.a) objQ, o0VarE, ((i19 << 12) & 458752) | 113246208, 0, 604);
                str2 = str3;
                z17 = z24;
                lVar3 = lVar5;
            } else {
                o0VarE.e();
                z17 = z15;
                lVar3 = lVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e(str2, z17, lVar3, i14, i15);
            }
        }
        i16 |= 48;
        z15 = z14;
        i17 = i15 & 4;
        if (i17 != 0) {
            i19 = i16 | 384;
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            if (o0VarE.r(lVar2)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i19 = i16 | i18;
        }
        if ((i19 & 147) != 146) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i19 & 1, z16)) {
            if (i24 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            if (i25 != 0) {
                z15 = true;
            }
            if (i17 != 0) {
                lVar4 = null;
            } else {
                lVar4 = lVar2;
            }
            x1 x1Var2 = n.f135158a;
            String strQ2 = y.Q(o0VarE, R.string.power_guide_title);
            if (z15) {
                strD = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1263206696, R.string.power_guide_footer_note, o0VarE, false);
            } else {
                o0VarE.C(1263284227);
                strD = h.d((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                o0VarE.g0(false);
            }
            b.f17304a.getClass();
            z3.e eVar3 = b.f17306c;
            z3.e eVar4 = b.f17307d;
            l72.p2 p2Var2 = l72.p2.f111205a;
            if ((i19 & 14) == 4) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = z18 | ((i19 & 896) == 256);
            objQ = o0VarE.q();
            if (z19) {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new d(str3, lVar4);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new d(str3, lVar4);
                o0VarE.K(objQ);
            }
            l lVar6 = lVar4;
            boolean z25 = z15;
            p2Var2.h(strQ2, strD, null, null, null, z25, false, eVar3, eVar4, null, (e23.a) objQ, o0VarE, ((i19 << 12) & 458752) | 113246208, 0, 604);
            str2 = str3;
            z17 = z25;
            lVar3 = lVar6;
        } else {
            o0VarE.e();
            z17 = z15;
            lVar3 = lVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(str2, z17, lVar3, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x01c3  */
    public static final void b(g gVar, l<? super Long, Unit> lVar, l<? super Long, Unit> lVar2, p<? super Long, ? super Long, Unit> pVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        String strP;
        b92.a aVar;
        g gVar2 = gVar;
        p<? super Long, ? super Long, Unit> pVar2 = pVar;
        gVar2.getClass();
        String str = gVar2.f17322c;
        pVar2.getClass();
        o0 o0VarE = mVar.E(-2005128576);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(gVar2) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(pVar2) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.power_guide_title);
            String str2 = gVar2.f17323d;
            if (str2 == null || str2.length() == 0) {
                o0VarE.C(-379624647);
                o0VarE.g0(false);
                strP = str;
            } else {
                o0VarE.C(-379808694);
                strP = y.P(R.string.string_space_bullet_string_pattern, new Object[]{str, str2}, o0VarE);
                o0VarE.g0(false);
            }
            String str3 = gVar2.f17324e;
            z3.e eVarC = null;
            if (str3 == null || str3.length() == 0) {
                o0VarE.C(-379019930);
                o0VarE.g0(false);
                aVar = null;
            } else {
                o0VarE.C(-379375593);
                String strP2 = y.P(R.string.string_space_bullet_string_pattern, new Object[]{str, str3}, o0VarE);
                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                c0235a.f16962a.put("label_secondary", strP2);
                b92.a aVarB = c0235a.b();
                o0VarE.g0(false);
                aVar = aVarB;
            }
            b.f17304a.getClass();
            z3.e eVar = b.f17305b;
            if (lVar != null) {
                o0VarE.C(-378550590);
                eVarC = z3.f.c(-1423972576, new t0(19, lVar, gVar2), o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-378082490);
                o0VarE.g0(false);
            }
            z3.e eVar2 = eVarC;
            m.a aVar2 = m.f135153a;
            if (lVar2 != null) {
                Object objH = q2.h(o0VarE, -377958118, aVar2);
                m.a.C2565a c2565a = m.a.f135155b;
                if (objH == c2565a) {
                    objH = l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objH);
                }
                b0 b0Var = (b0) objH;
                c92.a aVar3 = c92.a.DELETE;
                Set setM0 = u.m0(new c92.b[]{new c92.b.C0397b(aVar3, y.Q(o0VarE, R.string.lbl_delete)), new c92.b.a(aVar3, y.Q(o0VarE, R.string.lbl_delete))});
                Object objQ = o0VarE.q();
                if (objQ == c2565a) {
                    objQ = new b4.b(10);
                    o0VarE.K(objQ);
                }
                e23.a aVar4 = (e23.a) objQ;
                b21.l0 l0Var = new b21.l0(strQ, strP, aVar, eVar, eVar2, pVar2, gVar2);
                pVar2 = pVar2;
                gVar2 = gVar2;
                l2.a(setM0, b0Var, false, null, aVar4, z3.f.c(1290129390, l0Var, o0VarE), z3.f.c(-1979794995, new aa2.f(11, lVar2, gVar2), o0VarE), o0VarE, 1794048, 12);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                b92.a aVar5 = aVar;
                String str4 = strP;
                o0Var = o0VarE;
                o0Var.C(-376519811);
                l72.p2 p2Var = l72.p2.f111205a;
                boolean z14 = ((i15 & 14) == 4) | ((i15 & 7168) == 2048);
                Object objQ2 = o0Var.q();
                if (z14) {
                    objQ2 = new c(pVar2, gVar2, 1);
                    o0Var.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new c(pVar2, gVar2, 1);
                        o0Var.K(objQ2);
                    }
                }
                int i16 = b92.a.f16960b;
                p2Var.h(strQ, str4, null, null, aVar5, false, false, eVar, eVar2, null, (e23.a) objQ2, o0Var, 12582912, 0, 620);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.g(gVar2, lVar, lVar2, pVar2, i14, 13);
        }
    }
}
