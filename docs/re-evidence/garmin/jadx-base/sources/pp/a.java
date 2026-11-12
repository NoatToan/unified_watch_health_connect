package pp;

import a42.a0;
import am.x0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.x2;
import c2.z;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import g02.n1;
import gl1.y;
import h4.r;
import h5.e0;
import i3.gf;
import i3.mh;
import java.util.LinkedHashMap;
import l72.c1;
import l72.l;
import mp.k;
import o4.m1;
import o62.s0;
import org.joda.time.DateTime;
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
import p40.k0;
import p5.v;
import u1.w;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(yp.d dVar, k kVar, boolean z14, boolean z15, p<? super Long, ? super x0, Unit> pVar, p<? super Long, ? super String, Unit> pVar2, m mVar, int i14) {
        int i15;
        boolean z16;
        k kVar2;
        boolean z17;
        o0 o0Var;
        String string;
        kVar.getClass();
        pVar.getClass();
        pVar2.getClass();
        o0 o0VarE = mVar.E(-1394112141);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(kVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            z16 = z15;
            i15 |= o0VarE.h(z16) ? 2048 : 1024;
        } else {
            z16 = z15;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(pVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(pVar2) ? 131072 : 65536;
        }
        int i16 = i15;
        boolean z18 = true;
        if (o0VarE.n(i16 & 1, (i16 & 74899) != 74898)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new mn.a(new l22.a(context));
                o0VarE.K(objQ2);
            }
            mn.a aVar = (mn.a) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new pi0.e(context);
                o0VarE.K(objQ3);
            }
            pi0.e eVar = (pi0.e) objQ3;
            context.getClass();
            aVar.getClass();
            eVar.getClass();
            String strA = aVar.a(dVar.f198608a);
            long j8 = dVar.f198610c;
            String strQ = j0.q(context, new DateTime(j8));
            z17 = z14;
            String strB = wp.a.b(context, dVar.f198611d, kVar, dVar.f198612e, z17, z16, 80);
            int[] iArr = wp.a.C3468a.f186520a;
            int i17 = iArr[kVar.ordinal()];
            if (i17 == 10) {
                string = context.getString(R.string.lbl_win_rate);
            } else if (i17 != 14) {
                string = i17 != 18 ? null : context.getString(R.string.activity_details_net_impact);
            } else {
                string = context.getString(R.string.activity_details_average_stress);
            }
            o13.p pVar3 = new o13.p(string, iArr[kVar.ordinal()] == 14 ? oi0.c.A(context, new wl.a(14), string) : string);
            kVar2 = kVar;
            qp.a aVar2 = new qp.a(strA, strQ, eVar.b(new DateTime(j8), qi0.b.NUMERICAL_DATE_RELATIVE_24H_AM_PM_TIME), strB, wp.a.c(context, kVar2, dVar.f198611d, strB, z17), (String) pVar3.f128594a, (String) pVar3.f128595b);
            r rVarD = d(r.S, o0VarE);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new k0(p1Var, 16);
                o0VarE.K(objQ4);
            }
            e23.a aVar3 = (e23.a) objQ4;
            int i18 = i16 & 14;
            boolean z19 = ((i16 & 57344) == 16384) | (i18 == 4 || ((i16 & 8) != 0 && o0VarE.r(dVar)));
            Object objQ5 = o0VarE.q();
            if (z19 || objQ5 == c2565a) {
                objQ5 = new p40.o0(12, pVar, dVar);
                o0VarE.K(objQ5);
            }
            r rVarF = w.f(238, aVar3, (e23.a) objQ5, rVarD, null, true);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(340218081);
                c1 c1Var = c1.f110940a;
                String strQ2 = y.Q(o0VarE, R.string.activity_edit_delete_button_title);
                String strQ3 = y.Q(o0VarE, R.string.msg_permanently_delete_activity_confirmation);
                String strQ4 = y.Q(o0VarE, R.string.lbl_delete);
                String strQ5 = y.Q(o0VarE, R.string.lbl_cancel);
                boolean z24 = (i16 & 458752) == 131072;
                if (i18 != 4 && ((i16 & 8) == 0 || !o0VarE.r(dVar))) {
                    z18 = false;
                }
                boolean z25 = z24 | z18;
                Object objQ6 = o0VarE.q();
                if (z25 || objQ6 == c2565a) {
                    objQ6 = new nw0.p(pVar2, 29, dVar, p1Var);
                    o0VarE.K(objQ6);
                }
                e23.a<Unit> aVar4 = (e23.a) objQ6;
                Object objQ7 = o0VarE.q();
                if (objQ7 == c2565a) {
                    objQ7 = new k0(p1Var, 17);
                    o0VarE.K(objQ7);
                }
                c1Var.a(false, strQ2, strQ3, null, null, strQ4, true, false, aVar4, strQ5, (e23.a) objQ7, o0VarE, 1572864, 6, 153);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                o0Var.C(340893199);
                o0Var.g0(false);
            }
            l.c(z3.f.c(-330147903, new o72.b(9, dVar, aVar2), o0Var), z3.f.c(570920032, new s0(aVar2, 6), o0Var), rVarF, null, false, null, o0Var, 54, 56);
        } else {
            kVar2 = kVar;
            z17 = z14;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gf(dVar, kVar2, z17, z15, pVar, pVar2, i14, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x015d  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a9  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(yp.e eVar, k kVar, boolean z14, boolean z15, p<? super Integer, ? super Integer, Unit> pVar, m mVar, int i14) {
        int i15;
        boolean z16;
        k kVar2;
        boolean z17;
        o0 o0Var;
        String string;
        kVar.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(-1702755714);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(kVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            z16 = z15;
            i15 |= o0VarE.h(z16) ? 2048 : 1024;
        } else {
            z16 = z15;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(pVar) ? 16384 : 8192;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            r rVarD = d(r.S, o0VarE);
            context.getClass();
            String strB = j0.b(new DateTime(eVar.f198615b, eVar.f198614a, 1, 0, 0), "MMMM yyyy", null);
            if (strB == null) {
                strB = "";
            }
            String str = strB;
            z17 = z14;
            String strB2 = wp.a.b(context, eVar.f198616c, kVar, null, z17, z16, 88);
            kVar2 = kVar;
            String strC = wp.a.c(context, kVar2, eVar.f198616c, strB2, z17);
            int[] iArr = wp.a.C3468a.f186520a;
            int i17 = iArr[kVar2.ordinal()];
            if (i17 == 10) {
                string = context.getString(R.string.lbl_win_rate);
            } else if (i17 == 14) {
                string = context.getString(R.string.activity_details_average_stress);
            } else if (i17 != 18) {
                string = i17 != 19 ? null : context.getString(R.string.lbl_avg_pack_weight_abbreviated);
            } else {
                string = context.getString(R.string.activity_details_net_impact);
            }
            int i18 = iArr[kVar2.ordinal()];
            o13.p pVar2 = new o13.p(string, (i18 == 14 || i18 == 19) ? oi0.c.A(context, new wl.a(15), string) : string);
            qp.a aVar = new qp.a(str, null, null, strB2, strC, (String) pVar2.f128594a, (String) pVar2.f128595b, 6, null);
            boolean zB = o0VarE.B(aVar);
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (zB) {
                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                String str2 = aVar.f145992e;
                LinkedHashMap linkedHashMap = c0235a.f16962a;
                linkedHashMap.put("value", str2);
                linkedHashMap.put("value_secondary", aVar.f145994g);
                objQ = c0235a.b();
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                    String str3 = aVar.f145992e;
                    LinkedHashMap linkedHashMap2 = c0235a2.f16962a;
                    linkedHashMap2.put("value", str3);
                    linkedHashMap2.put("value_secondary", aVar.f145994g);
                    objQ = c0235a2.b();
                    o0VarE.K(objQ);
                }
            }
            b92.a aVar3 = (b92.a) objQ;
            boolean z18 = ((57344 & i16) == 16384) | ((i16 & 14) == 4 || ((i16 & 8) != 0 && o0VarE.r(eVar)));
            Object objQ2 = o0VarE.q();
            if (z18) {
                objQ2 = new p40.o0(11, pVar, eVar);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new p40.o0(11, pVar, eVar);
                    o0VarE.K(objQ2);
                }
            }
            int i19 = b92.a.f16960b;
            o0Var = o0VarE;
            l.e(aVar.f145988a, null, aVar.f145991d, aVar.f145993f, null, null, rVarD, aVar3, false, (e23.a) objQ2, o0Var, 0, 306);
        } else {
            kVar2 = kVar;
            z17 = z14;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n1(eVar, kVar2, z17, z15, pVar, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0262  */
    /* JADX WARN: Code duplicated, block: B:103:0x0269  */
    /* JADX WARN: Code duplicated, block: B:106:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:108:0x02af  */
    /* JADX WARN: Code duplicated, block: B:111:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b A[PHI: r5 r6
      0x008b: PHI (r5v28 int) = (r5v11 int), (r5v8 int), (r5v30 int) binds: [B:50:0x0096, B:44:0x0087, B:45:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x008b: PHI (r6v15 java.lang.String) = (r6v5 java.lang.String), (r6v3 java.lang.String), (r6v3 java.lang.String) binds: [B:50:0x0096, B:44:0x0087, B:45:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:59:0x0127  */
    /* JADX WARN: Code duplicated, block: B:61:0x012e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0132  */
    /* JADX WARN: Code duplicated, block: B:65:0x0145  */
    /* JADX WARN: Code duplicated, block: B:67:0x0153  */
    /* JADX WARN: Code duplicated, block: B:70:0x0165  */
    /* JADX WARN: Code duplicated, block: B:72:0x0180  */
    /* JADX WARN: Code duplicated, block: B:75:0x019a  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01af  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:88:0x020d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0219  */
    /* JADX WARN: Code duplicated, block: B:92:0x0247  */
    /* JADX WARN: Code duplicated, block: B:94:0x024d  */
    public static final void c(String str, String str2, String str3, String str4, h4.d.b bVar, m mVar, int i14, int i15) {
        String str5;
        int i16;
        int i17;
        int i18;
        int i19;
        h4.d.b bVar2;
        int i24;
        boolean z14;
        o0 o0Var;
        String str6;
        h4.d.b bVar3;
        p2 p2VarI0;
        int i25;
        String str7;
        h4.d.b bVar4;
        float f14;
        r.a aVar;
        j92.b bVar5;
        j92.e eVar;
        z zVarA;
        int i26;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar2;
        h5.g.a.b bVar6;
        s5.x0 x0VarB;
        boolean z15;
        Object objQ;
        m.a aVar3;
        boolean zB;
        Object objQ2;
        o0 o0VarE = mVar.E(-152699352);
        int i27 = (o0VarE.B(str) ? 4 : 2) | i14;
        if ((i15 & 2) == 0) {
            str5 = str2;
            int i28 = o0VarE.B(str5) ? 32 : 16;
            int i29 = i27 | i28;
            if (o0VarE.B(str3)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            int i30 = i29 | i16;
            if (o0VarE.B(str4)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i18 = i30 | i17;
            i19 = i15 & 16;
            if (i19 != 0) {
                if ((i14 & 24576) == 0) {
                    bVar2 = bVar;
                    if (o0VarE.B(bVar2)) {
                        i24 = 16384;
                    } else {
                        i24 = 8192;
                    }
                    i18 |= i24;
                }
                if ((i18 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i18 & 1, z14)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0 || o0VarE.o0()) {
                        if ((i15 & 2) != 0) {
                            i18 &= -113;
                            str5 = str;
                        }
                        if (i19 != 0) {
                            h4.d.f81522a.getClass();
                            i25 = i18;
                            str7 = str5;
                            bVar4 = h4.d.a.f81536n;
                        }
                        o0VarE.h0();
                        x1 x1Var = n.f135158a;
                        h4.d.f81522a.getClass();
                        if (s.g(bVar4, h4.d.a.f81538p)) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f14 = j92.b.f97899b.f97920e;
                        } else {
                            f14 = 0;
                            g6.f.a aVar4 = g6.f.f75994b;
                        }
                        float f15 = f14;
                        aVar = r.S;
                        r rVarD = x2.d(aVar, 1.0f);
                        d92.b.f58623a.getClass();
                        bVar5 = d92.b.f58625c;
                        bVar5.getClass();
                        eVar = j92.b.f97899b;
                        float f16 = eVar.f97920e;
                        bVar5.getClass();
                        r rVarC2 = c2.l.C(rVarD, 0.0f, f16, f15, eVar.f97920e, 1);
                        j.f22691a.getClass();
                        zVarA = c2.y.a(j.f22696f, bVar4, o0VarE, 6 | (((((i25 >> 6) & 896) | 48) >> 3) & 112));
                        i26 = i25;
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        rVarC = h4.k.c(rVarC2, o0VarE);
                        h5.g.V.getClass();
                        aVar2 = h5.g.a.f81805b;
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
                        b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                        b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                        bVar6 = h5.g.a.f81813j;
                        if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar6);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                        b0 b0Var = b0.f22601a;
                        if (s.g(bVar4, h4.d.a.f81536n)) {
                            o0VarE.C(-1366856710);
                            d92.b.f58624b.getClass();
                            x0VarB = d92.c.e(d92.c.b(j92.f.f97932i, o0VarE));
                        } else {
                            o0VarE.C(-1366855776);
                            d92.b.f58624b.getClass();
                            x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
                        }
                        o0VarE.g0(false);
                        s5.x0 x0Var = x0VarB;
                        z15 = (((i26 & 112) ^ 48) <= 32 && o0VarE.B(str7)) || (i26 & 48) == 32;
                        objQ = o0VarE.q();
                        aVar3 = m.f135153a;
                        if (z15) {
                            objQ = new o60.b(str7, 8);
                            o0VarE.K(objQ);
                        } else {
                            aVar3.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new o60.b(str7, 8);
                                o0VarE.K(objQ);
                            }
                        }
                        String str8 = str7;
                        h4.d.b bVar7 = bVar4;
                        mh.c(str, v.c((e23.l) objQ, aVar, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, i26 & 14, 0, 131068);
                        o0Var = o0VarE;
                        if (str3 == null) {
                            o0Var.C(577352690);
                            o0Var.g0(false);
                        } else {
                            o0Var.C(577352691);
                            d92.b.f58624b.getClass();
                            s5.x0 x0VarF = d92.c.f(j92.f.f97933j, o0Var);
                            bVar5.getClass();
                            r rVarC3 = c2.l.C(aVar, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13);
                            zB = o0Var.B(str3) | ((((i26 & 7168) ^ 3072) <= 2048 && o0Var.B(str4)) || (i26 & 3072) == 2048);
                            objQ2 = o0Var.q();
                            if (zB) {
                                objQ2 = new cn1.j(str4, str3, 14);
                                o0Var.K(objQ2);
                            } else {
                                aVar3.getClass();
                                if (objQ2 == m.a.f135155b) {
                                    objQ2 = new cn1.j(str4, str3, 14);
                                    o0Var.K(objQ2);
                                }
                            }
                            mh.c(str3, v.c((e23.l) objQ2, rVarC3, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 131068);
                            o0Var = o0Var;
                            o0Var.g0(false);
                        }
                        o0Var.g0(true);
                        bVar3 = bVar7;
                        str6 = str8;
                    } else {
                        o0VarE.e();
                        if ((i15 & 2) != 0) {
                            i18 &= -113;
                        }
                    }
                    i25 = i18;
                    str7 = str5;
                    bVar4 = bVar2;
                    o0VarE.h0();
                    x1 x1Var2 = n.f135158a;
                    h4.d.f81522a.getClass();
                    if (s.g(bVar4, h4.d.a.f81538p)) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f14 = j92.b.f97899b.f97920e;
                    } else {
                        f14 = 0;
                        g6.f.a aVar5 = g6.f.f75994b;
                    }
                    float f17 = f14;
                    aVar = r.S;
                    r rVarD2 = x2.d(aVar, 1.0f);
                    d92.b.f58623a.getClass();
                    bVar5 = d92.b.f58625c;
                    bVar5.getClass();
                    eVar = j92.b.f97899b;
                    float f18 = eVar.f97920e;
                    bVar5.getClass();
                    r rVarC4 = c2.l.C(rVarD2, 0.0f, f18, f17, eVar.f97920e, 1);
                    j.f22691a.getClass();
                    zVarA = c2.y.a(j.f22696f, bVar4, o0VarE, 6 | (((((i25 >> 6) & 896) | 48) >> 3) & 112));
                    i26 = i25;
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarC4, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
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
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar6 = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar6);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar6);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    b0 b0Var2 = b0.f22601a;
                    if (s.g(bVar4, h4.d.a.f81536n)) {
                        o0VarE.C(-1366856710);
                        d92.b.f58624b.getClass();
                        x0VarB = d92.c.e(d92.c.b(j92.f.f97932i, o0VarE));
                    } else {
                        o0VarE.C(-1366855776);
                        d92.b.f58624b.getClass();
                        x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
                    }
                    o0VarE.g0(false);
                    s5.x0 x0Var2 = x0VarB;
                    if (((i26 & 112) ^ 48) <= 32) {
                    }
                    objQ = o0VarE.q();
                    aVar3 = m.f135153a;
                    if (z15) {
                        aVar3.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new o60.b(str7, 8);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new o60.b(str7, 8);
                        o0VarE.K(objQ);
                    }
                    String str9 = str7;
                    h4.d.b bVar8 = bVar4;
                    mh.c(str, v.c((e23.l) objQ, aVar, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, o0VarE, i26 & 14, 0, 131068);
                    o0Var = o0VarE;
                    if (str3 == null) {
                        o0Var.C(577352690);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(577352691);
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarF2 = d92.c.f(j92.f.f97933j, o0Var);
                        bVar5.getClass();
                        r rVarC5 = c2.l.C(aVar, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13);
                        zB = o0Var.B(str3) | ((((i26 & 7168) ^ 3072) <= 2048 && o0Var.B(str4)) || (i26 & 3072) == 2048);
                        objQ2 = o0Var.q();
                        if (zB) {
                            aVar3.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new cn1.j(str4, str3, 14);
                                o0Var.K(objQ2);
                            }
                        } else {
                            objQ2 = new cn1.j(str4, str3, 14);
                            o0Var.K(objQ2);
                        }
                        mh.c(str3, v.c((e23.l) objQ2, rVarC5, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, o0Var, 0, 0, 131068);
                        o0Var = o0Var;
                        o0Var.g0(false);
                    }
                    o0Var.g0(true);
                    bVar3 = bVar8;
                    str6 = str9;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    str6 = str5;
                    bVar3 = bVar2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a0(str, str6, str3, str4, bVar3, i14, i15, 23);
                }
            }
            i18 |= 24576;
            bVar2 = bVar;
            if ((i18 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i18 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if ((i15 & 2) != 0) {
                        i18 &= -113;
                        str5 = str;
                    }
                    if (i19 != 0) {
                        h4.d.f81522a.getClass();
                        i25 = i18;
                        str7 = str5;
                        bVar4 = h4.d.a.f81536n;
                    } else {
                        i25 = i18;
                        str7 = str5;
                        bVar4 = bVar2;
                    }
                } else {
                    if ((i15 & 2) != 0) {
                        i18 &= -113;
                        str5 = str;
                    }
                    if (i19 != 0) {
                        h4.d.f81522a.getClass();
                        i25 = i18;
                        str7 = str5;
                        bVar4 = h4.d.a.f81536n;
                    } else {
                        i25 = i18;
                        str7 = str5;
                        bVar4 = bVar2;
                    }
                }
                o0VarE.h0();
                x1 x1Var3 = n.f135158a;
                h4.d.f81522a.getClass();
                if (s.g(bVar4, h4.d.a.f81538p)) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f14 = j92.b.f97899b.f97920e;
                } else {
                    f14 = 0;
                    g6.f.a aVar6 = g6.f.f75994b;
                }
                float f19 = f14;
                aVar = r.S;
                r rVarD3 = x2.d(aVar, 1.0f);
                d92.b.f58623a.getClass();
                bVar5 = d92.b.f58625c;
                bVar5.getClass();
                eVar = j92.b.f97899b;
                float f110 = eVar.f97920e;
                bVar5.getClass();
                r rVarC6 = c2.l.C(rVarD3, 0.0f, f110, f19, eVar.f97920e, 1);
                j.f22691a.getClass();
                zVarA = c2.y.a(j.f22696f, bVar4, o0VarE, 6 | (((((i25 >> 6) & 896) | 48) >> 3) & 112));
                i26 = i25;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarC6, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
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
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar6 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar6);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar6);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var3 = b0.f22601a;
                if (s.g(bVar4, h4.d.a.f81536n)) {
                    o0VarE.C(-1366856710);
                    d92.b.f58624b.getClass();
                    x0VarB = d92.c.e(d92.c.b(j92.f.f97932i, o0VarE));
                } else {
                    o0VarE.C(-1366855776);
                    d92.b.f58624b.getClass();
                    x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
                }
                o0VarE.g0(false);
                s5.x0 x0Var3 = x0VarB;
                if (((i26 & 112) ^ 48) <= 32) {
                }
                objQ = o0VarE.q();
                aVar3 = m.f135153a;
                if (z15) {
                    aVar3.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new o60.b(str7, 8);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new o60.b(str7, 8);
                    o0VarE.K(objQ);
                }
                String str10 = str7;
                h4.d.b bVar9 = bVar4;
                mh.c(str, v.c((e23.l) objQ, aVar, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var3, o0VarE, i26 & 14, 0, 131068);
                o0Var = o0VarE;
                if (str3 == null) {
                    o0Var.C(577352690);
                    o0Var.g0(false);
                } else {
                    o0Var.C(577352691);
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarF3 = d92.c.f(j92.f.f97933j, o0Var);
                    bVar5.getClass();
                    r rVarC7 = c2.l.C(aVar, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13);
                    zB = o0Var.B(str3) | ((((i26 & 7168) ^ 3072) <= 2048 && o0Var.B(str4)) || (i26 & 3072) == 2048);
                    objQ2 = o0Var.q();
                    if (zB) {
                        aVar3.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new cn1.j(str4, str3, 14);
                            o0Var.K(objQ2);
                        }
                    } else {
                        objQ2 = new cn1.j(str4, str3, 14);
                        o0Var.K(objQ2);
                    }
                    mh.c(str3, v.c((e23.l) objQ2, rVarC7, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF3, o0Var, 0, 0, 131068);
                    o0Var = o0Var;
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                bVar3 = bVar9;
                str6 = str10;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str6 = str5;
                bVar3 = bVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a0(str, str6, str3, str4, bVar3, i14, i15, 23);
            }
        }
        str5 = str2;
        int i210 = i27 | i28;
        if (o0VarE.B(str3)) {
            i16 = 256;
        } else {
            i16 = 128;
        }
        int i34 = i210 | i16;
        if (o0VarE.B(str4)) {
            i17 = 2048;
        } else {
            i17 = 1024;
        }
        i18 = i34 | i17;
        i19 = i15 & 16;
        if (i19 != 0) {
            if ((i14 & 24576) == 0) {
                bVar2 = bVar;
                if (o0VarE.B(bVar2)) {
                    i24 = 16384;
                } else {
                    i24 = 8192;
                }
                i18 |= i24;
            }
            if ((i18 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i18 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if ((i15 & 2) != 0) {
                        i18 &= -113;
                        str5 = str;
                    }
                    if (i19 != 0) {
                        h4.d.f81522a.getClass();
                        i25 = i18;
                        str7 = str5;
                        bVar4 = h4.d.a.f81536n;
                    } else {
                        i25 = i18;
                        str7 = str5;
                        bVar4 = bVar2;
                    }
                } else {
                    if ((i15 & 2) != 0) {
                        i18 &= -113;
                        str5 = str;
                    }
                    if (i19 != 0) {
                        h4.d.f81522a.getClass();
                        i25 = i18;
                        str7 = str5;
                        bVar4 = h4.d.a.f81536n;
                    } else {
                        i25 = i18;
                        str7 = str5;
                        bVar4 = bVar2;
                    }
                }
                o0VarE.h0();
                x1 x1Var4 = n.f135158a;
                h4.d.f81522a.getClass();
                if (s.g(bVar4, h4.d.a.f81538p)) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f14 = j92.b.f97899b.f97920e;
                } else {
                    f14 = 0;
                    g6.f.a aVar7 = g6.f.f75994b;
                }
                float f111 = f14;
                aVar = r.S;
                r rVarD4 = x2.d(aVar, 1.0f);
                d92.b.f58623a.getClass();
                bVar5 = d92.b.f58625c;
                bVar5.getClass();
                eVar = j92.b.f97899b;
                float f112 = eVar.f97920e;
                bVar5.getClass();
                r rVarC8 = c2.l.C(rVarD4, 0.0f, f112, f111, eVar.f97920e, 1);
                j.f22691a.getClass();
                zVarA = c2.y.a(j.f22696f, bVar4, o0VarE, 6 | (((((i25 >> 6) & 896) | 48) >> 3) & 112));
                i26 = i25;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarC8, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
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
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar6 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar6);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar6);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var4 = b0.f22601a;
                if (s.g(bVar4, h4.d.a.f81536n)) {
                    o0VarE.C(-1366856710);
                    d92.b.f58624b.getClass();
                    x0VarB = d92.c.e(d92.c.b(j92.f.f97932i, o0VarE));
                } else {
                    o0VarE.C(-1366855776);
                    d92.b.f58624b.getClass();
                    x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
                }
                o0VarE.g0(false);
                s5.x0 x0Var4 = x0VarB;
                if (((i26 & 112) ^ 48) <= 32) {
                }
                objQ = o0VarE.q();
                aVar3 = m.f135153a;
                if (z15) {
                    aVar3.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new o60.b(str7, 8);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new o60.b(str7, 8);
                    o0VarE.K(objQ);
                }
                String str11 = str7;
                h4.d.b bVar10 = bVar4;
                mh.c(str, v.c((e23.l) objQ, aVar, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var4, o0VarE, i26 & 14, 0, 131068);
                o0Var = o0VarE;
                if (str3 == null) {
                    o0Var.C(577352690);
                    o0Var.g0(false);
                } else {
                    o0Var.C(577352691);
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarF4 = d92.c.f(j92.f.f97933j, o0Var);
                    bVar5.getClass();
                    r rVarC9 = c2.l.C(aVar, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13);
                    zB = o0Var.B(str3) | ((((i26 & 7168) ^ 3072) <= 2048 && o0Var.B(str4)) || (i26 & 3072) == 2048);
                    objQ2 = o0Var.q();
                    if (zB) {
                        aVar3.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new cn1.j(str4, str3, 14);
                            o0Var.K(objQ2);
                        }
                    } else {
                        objQ2 = new cn1.j(str4, str3, 14);
                        o0Var.K(objQ2);
                    }
                    mh.c(str3, v.c((e23.l) objQ2, rVarC9, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF4, o0Var, 0, 0, 131068);
                    o0Var = o0Var;
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                bVar3 = bVar10;
                str6 = str11;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str6 = str5;
                bVar3 = bVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a0(str, str6, str3, str4, bVar3, i14, i15, 23);
            }
        }
        i18 |= 24576;
        bVar2 = bVar;
        if ((i18 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i18 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if ((i15 & 2) != 0) {
                    i18 &= -113;
                    str5 = str;
                }
                if (i19 != 0) {
                    h4.d.f81522a.getClass();
                    i25 = i18;
                    str7 = str5;
                    bVar4 = h4.d.a.f81536n;
                } else {
                    i25 = i18;
                    str7 = str5;
                    bVar4 = bVar2;
                }
            } else {
                if ((i15 & 2) != 0) {
                    i18 &= -113;
                    str5 = str;
                }
                if (i19 != 0) {
                    h4.d.f81522a.getClass();
                    i25 = i18;
                    str7 = str5;
                    bVar4 = h4.d.a.f81536n;
                } else {
                    i25 = i18;
                    str7 = str5;
                    bVar4 = bVar2;
                }
            }
            o0VarE.h0();
            x1 x1Var5 = n.f135158a;
            h4.d.f81522a.getClass();
            if (s.g(bVar4, h4.d.a.f81538p)) {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f14 = j92.b.f97899b.f97920e;
            } else {
                f14 = 0;
                g6.f.a aVar8 = g6.f.f75994b;
            }
            float f113 = f14;
            aVar = r.S;
            r rVarD5 = x2.d(aVar, 1.0f);
            d92.b.f58623a.getClass();
            bVar5 = d92.b.f58625c;
            bVar5.getClass();
            eVar = j92.b.f97899b;
            float f114 = eVar.f97920e;
            bVar5.getClass();
            r rVarC10 = c2.l.C(rVarD5, 0.0f, f114, f113, eVar.f97920e, 1);
            j.f22691a.getClass();
            zVarA = c2.y.a(j.f22696f, bVar4, o0VarE, 6 | (((((i25 >> 6) & 896) | 48) >> 3) & 112));
            i26 = i25;
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarC10, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar6 = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar6);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar6);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var5 = b0.f22601a;
            if (s.g(bVar4, h4.d.a.f81536n)) {
                o0VarE.C(-1366856710);
                d92.b.f58624b.getClass();
                x0VarB = d92.c.e(d92.c.b(j92.f.f97932i, o0VarE));
            } else {
                o0VarE.C(-1366855776);
                d92.b.f58624b.getClass();
                x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
            }
            o0VarE.g0(false);
            s5.x0 x0Var5 = x0VarB;
            if (((i26 & 112) ^ 48) <= 32) {
            }
            objQ = o0VarE.q();
            aVar3 = m.f135153a;
            if (z15) {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new o60.b(str7, 8);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new o60.b(str7, 8);
                o0VarE.K(objQ);
            }
            String str12 = str7;
            h4.d.b bVar11 = bVar4;
            mh.c(str, v.c((e23.l) objQ, aVar, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var5, o0VarE, i26 & 14, 0, 131068);
            o0Var = o0VarE;
            if (str3 == null) {
                o0Var.C(577352690);
                o0Var.g0(false);
            } else {
                o0Var.C(577352691);
                d92.b.f58624b.getClass();
                s5.x0 x0VarF5 = d92.c.f(j92.f.f97933j, o0Var);
                bVar5.getClass();
                r rVarC11 = c2.l.C(aVar, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13);
                zB = o0Var.B(str3) | ((((i26 & 7168) ^ 3072) <= 2048 && o0Var.B(str4)) || (i26 & 3072) == 2048);
                objQ2 = o0Var.q();
                if (zB) {
                    aVar3.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new cn1.j(str4, str3, 14);
                        o0Var.K(objQ2);
                    }
                } else {
                    objQ2 = new cn1.j(str4, str3, 14);
                    o0Var.K(objQ2);
                }
                mh.c(str3, v.c((e23.l) objQ2, rVarC11, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF5, o0Var, 0, 0, 131068);
                o0Var = o0Var;
                o0Var.g0(false);
            }
            o0Var.g0(true);
            bVar3 = bVar11;
            str6 = str12;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            str6 = str5;
            bVar3 = bVar2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0(str, str6, str3, str4, bVar3, i14, i15, 23);
        }
    }

    public static final r d(r rVar, m mVar) {
        x1 x1Var = n.f135158a;
        r rVarE = u1.n.e(rVar, tn.k.a(d92.b.f58623a, mVar), m1.f128891a);
        j92.b bVar = d92.b.f58625c;
        bVar.getClass();
        j92.e eVar = j92.b.f97899b;
        float f14 = eVar.f97918c;
        bVar.getClass();
        return c2.l.z(rVarE, eVar.f97920e, f14);
    }
}
