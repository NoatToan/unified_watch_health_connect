package t21;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import c22.g2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class q0 {
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:45:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    public static final void a(int i14, int i15, b92.a aVar, e23.a aVar2, String str, String str2, p3.m mVar, boolean z14) {
        b92.a aVar3;
        int i16;
        boolean z15;
        boolean z16;
        p3.o0 o0Var;
        boolean z17;
        p2 p2VarI0;
        b92.a aVar4;
        boolean z18;
        z3.e eVarC;
        z3.e eVar;
        int i17;
        str.getClass();
        str2.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(181565139);
        int i18 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.B(str2) ? 32 : 16);
        int i19 = i15 & 4;
        if (i19 != 0) {
            i16 = i18 | 384;
            aVar3 = aVar;
        } else {
            aVar3 = aVar;
            i16 = i18 | (o0VarE.B(aVar3) ? 256 : 128);
        }
        int i24 = i15 & 8;
        if (i24 == 0) {
            if ((i14 & 3072) == 0) {
                z15 = z14;
                i16 |= o0VarE.h(z15) ? 2048 : 1024;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.r(aVar2)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i16 |= i17;
            }
            if ((i16 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i19 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar3;
                }
                z18 = i24 == 0 ? z15 : true;
                x1 x1Var = p3.n.f135158a;
                eVarC = z3.f.c(1951356802, new s70.a0(aVar2, 6), o0VarE);
                l72.p2 p2Var = l72.p2.f111205a;
                if (z18) {
                    eVar = eVarC;
                } else {
                    eVar = null;
                }
                int i25 = b92.a.f16960b;
                o0Var = o0VarE;
                p2Var.h(str, str2, null, null, aVar4, false, false, null, eVar, null, null, o0Var, (i16 & 126) | ((i16 << 6) & 57344), 0, 1772);
                z17 = z18;
                aVar3 = aVar4;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z17 = z15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new kh0.q(str, str2, aVar3, z17, aVar2, i14, i15, 1);
            }
        }
        i16 |= 3072;
        z15 = z14;
        if ((i14 & 24576) == 0) {
            if (o0VarE.r(aVar2)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i16 |= i17;
        }
        if ((i16 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i19 != 0) {
                aVar4 = null;
            } else {
                aVar4 = aVar3;
            }
            if (i24 == 0) {
            }
            x1 x1Var2 = p3.n.f135158a;
            eVarC = z3.f.c(1951356802, new s70.a0(aVar2, 6), o0VarE);
            l72.p2 p2Var2 = l72.p2.f111205a;
            if (z18) {
                eVar = eVarC;
            } else {
                eVar = null;
            }
            int i26 = b92.a.f16960b;
            o0Var = o0VarE;
            p2Var2.h(str, str2, null, null, aVar4, false, false, null, eVar, null, null, o0Var, (i16 & 126) | ((i16 << 6) & 57344), 0, 1772);
            z17 = z18;
            aVar3 = aVar4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z17 = z15;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new kh0.q(str, str2, aVar3, z17, aVar2, i14, i15, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:103:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:105:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:108:0x0311  */
    /* JADX WARN: Code duplicated, block: B:110:0x032f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0331  */
    /* JADX WARN: Code duplicated, block: B:114:0x0338  */
    /* JADX WARN: Code duplicated, block: B:116:0x033f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0365  */
    /* JADX WARN: Code duplicated, block: B:121:0x036b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0375  */
    /* JADX WARN: Code duplicated, block: B:125:0x0392  */
    /* JADX WARN: Code duplicated, block: B:127:0x039e  */
    /* JADX WARN: Code duplicated, block: B:128:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:131:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:133:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:135:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:138:0x0427  */
    /* JADX WARN: Code duplicated, block: B:139:0x0429  */
    /* JADX WARN: Code duplicated, block: B:142:0x0430  */
    /* JADX WARN: Code duplicated, block: B:144:0x0437  */
    /* JADX WARN: Code duplicated, block: B:147:0x0468  */
    /* JADX WARN: Code duplicated, block: B:149:0x0479  */
    /* JADX WARN: Code duplicated, block: B:151:0x0483  */
    /* JADX WARN: Code duplicated, block: B:152:0x0485  */
    /* JADX WARN: Code duplicated, block: B:155:0x048c  */
    /* JADX WARN: Code duplicated, block: B:157:0x0493  */
    /* JADX WARN: Code duplicated, block: B:160:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:161:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:163:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:164:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:166:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:168:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:171:0x04df  */
    /* JADX WARN: Code duplicated, block: B:172:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:174:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:175:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:177:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:179:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:182:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:183:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:186:0x0500  */
    /* JADX WARN: Code duplicated, block: B:188:0x0507  */
    /* JADX WARN: Code duplicated, block: B:191:0x0521  */
    /* JADX WARN: Code duplicated, block: B:193:0x054f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0551  */
    /* JADX WARN: Code duplicated, block: B:197:0x0558  */
    /* JADX WARN: Code duplicated, block: B:199:0x055f  */
    /* JADX WARN: Code duplicated, block: B:201:0x057b  */
    /* JADX WARN: Code duplicated, block: B:203:0x0589  */
    /* JADX WARN: Code duplicated, block: B:220:0x05df  */
    /* JADX WARN: Code duplicated, block: B:232:0x0620  */
    /* JADX WARN: Code duplicated, block: B:235:0x0640  */
    /* JADX WARN: Code duplicated, block: B:239:0x0652 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:250:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:252:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:254:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:256:0x0710  */
    /* JADX WARN: Code duplicated, block: B:258:0x071a  */
    /* JADX WARN: Code duplicated, block: B:261:0x0732  */
    /* JADX WARN: Code duplicated, block: B:264:0x0754  */
    /* JADX WARN: Code duplicated, block: B:266:0x0763  */
    /* JADX WARN: Code duplicated, block: B:268:0x0793  */
    /* JADX WARN: Code duplicated, block: B:270:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:273:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:274:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:277:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:279:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:281:0x0841  */
    /* JADX WARN: Code duplicated, block: B:283:0x084f  */
    /* JADX WARN: Code duplicated, block: B:285:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:287:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:289:0x08c3  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:292:0x08cf  */
    /* JADX WARN: Code duplicated, block: B:294:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:35:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:47:0x0102  */
    /* JADX WARN: Code duplicated, block: B:49:0x0109  */
    /* JADX WARN: Code duplicated, block: B:50:0x010d  */
    /* JADX WARN: Code duplicated, block: B:55:0x012e  */
    /* JADX WARN: Code duplicated, block: B:58:0x016c  */
    /* JADX WARN: Code duplicated, block: B:60:0x017a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0183  */
    /* JADX WARN: Code duplicated, block: B:63:0x018e  */
    /* JADX WARN: Code duplicated, block: B:71:0x01de  */
    /* JADX WARN: Code duplicated, block: B:80:0x0282  */
    /* JADX WARN: Code duplicated, block: B:81:0x0284  */
    /* JADX WARN: Code duplicated, block: B:84:0x028d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0294  */
    /* JADX WARN: Code duplicated, block: B:89:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:91:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:92:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:95:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:97:0x02df  */
    /* JADX WARN: Code duplicated, block: B:99:0x02e4  */
    public static final void b(s21.a0 a0Var, i53.e<? extends s21.z> eVar, boolean z14, e23.l<? super s21.z, Unit> lVar, v21.e eVar2, p3.m mVar, int i14, int i15) {
        boolean z15;
        int i16;
        int i17;
        int i18;
        boolean z16;
        p3.o0 o0Var;
        boolean z17;
        p2 p2VarI0;
        boolean z18;
        Context context;
        String strQ;
        double dDoubleValue;
        double dP1;
        double dP2;
        h4.r.a aVar;
        boolean z19;
        h4.g.a aVar2;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar3;
        h5.g.a.b bVar;
        c2.b0 b0Var;
        j92.b bVar2;
        j92.e eVar3;
        float f14;
        String strJ;
        j92.f fVar;
        int i19;
        boolean z24;
        Object objQ;
        p3.m.a aVar4;
        s21.s sVar;
        s21.s sVar2;
        int i24;
        Boolean bool;
        i53.e<? extends s21.z> eVar4;
        h4.r.a aVar5;
        j92.e eVar5;
        b63.o oVar;
        String string;
        boolean z25;
        Object objQ2;
        b63.o oVar2;
        String strD;
        Object objQ3;
        int i25;
        String strI;
        boolean z26;
        Object objQ4;
        boolean z27;
        Object objQ5;
        Integer num;
        String strQ2;
        String string2;
        boolean z28;
        Object objQ6;
        Double d14;
        Double d15;
        Double d16;
        Double d17;
        Double d18;
        Double d19;
        boolean z29;
        Object objQ7;
        boolean z34;
        boolean z35;
        Object objQ8;
        boolean z36;
        Object objQ9;
        Float f15;
        String string3;
        boolean z37;
        Object objQ10;
        double dFloatValue;
        v21.e eVar6 = eVar2;
        a0Var.getClass();
        s21.e eVar7 = a0Var.f156055t;
        Double d24 = a0Var.f156046k;
        s21.o oVar3 = a0Var.I;
        Double d25 = a0Var.f156047l;
        s21.s sVar3 = a0Var.f156041f;
        Boolean bool2 = a0Var.f156037b;
        eVar.getClass();
        lVar.getClass();
        eVar6.getClass();
        l22.a aVar6 = eVar6.f175325b;
        p3.o0 o0VarE = mVar.E(208119836);
        int i26 = (o0VarE.r(a0Var) ? 4 : 2) | i14 | (o0VarE.B(eVar) ? 32 : 16);
        int i27 = i15 & 4;
        if (i27 == 0) {
            if ((i14 & 384) == 0) {
                z15 = z14;
                i26 |= o0VarE.h(z15) ? 256 : 128;
            }
            if (o0VarE.r(lVar)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            int i28 = i26 | i16;
            if (o0VarE.r(eVar6)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i18 = i28 | i17;
            if ((i18 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i18 & 1, z16)) {
                if (i27 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                x1 x1Var = p3.n.f135158a;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                strQ = gl1.y.Q(o0VarE, R.string.activities_value_not_set);
                l3.a aVar7 = l3.f23124b;
                if (d24 != null) {
                    dDoubleValue = d24.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                aVar7.getClass();
                dP1 = l3.a.P1(dDoubleValue);
                dP2 = l3.a.P1(d25 != null ? d25.doubleValue() : 0.0d);
                aVar = h4.r.S;
                z19 = z18;
                h4.r rVarF = x2.f(aVar, 1.0f);
                h4.d.f81522a.getClass();
                aVar2 = h4.d.a.f81537o;
                c2.j.f22691a.getClass();
                zVarA = c2.y.a(c2.j.f22694d, aVar2, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarF, o0VarE);
                h5.g.V.getClass();
                aVar3 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
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
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0Var = c2.b0.f22601a;
                d92.b.f58623a.getClass();
                bVar2 = d92.b.f58625c;
                bVar2.getClass();
                eVar3 = j92.b.f97899b;
                float f16 = eVar3.f97920e;
                f14 = eVar3.f97920e;
                bVar2.getClass();
                h4.r rVarC2 = c2.l.C(aVar, 0.0f, f16, 0.0f, eVar3.f97918c, 5);
                bVar2.getClass();
                h4.r rVarA = c2.l.A(rVarC2, f14, 0.0f, 2);
                if (z19) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1561595924, R.string.editing_plan_info, o0VarE, false);
                } else if (p005kotlin.jvm.internal.s.g(bool2, Boolean.TRUE)) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1561364323, R.string.reivew_update_nutrition_plan_subtitle, o0VarE, false);
                } else {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1561200953, R.string.reivew_nutrition_plan_subtitle, o0VarE, false);
                }
                String str = strJ;
                d6.h.f57752b.getClass();
                int i29 = d6.h.f57755e;
                fVar = d92.b.f58624b;
                fVar.getClass();
                mh.c(str, rVarA, 0L, null, 0L, null, 0L, d6.h.a(i29), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 130044);
                o0Var = o0VarE;
                if (z19 && (sVar3 == s21.s.LOSE_WEIGHT || sVar3 == s21.s.GAIN_WEIGHT)) {
                    o0Var.C(-1560613038);
                    String strJ2 = p005kotlin.jvm.internal.s.g(bool2, Boolean.TRUE) ? com.airbnb.lottie.animation.keyframe.a.j(o0Var, -1560553735, R.string.review_update_nutrition_plan_subtitle_info, o0Var, false) : com.airbnb.lottie.animation.keyframe.a.j(o0Var, -1560449792, R.string.review_nutrition_plan_subtitle_info, o0Var, false);
                    bVar2.getClass();
                    float f17 = eVar3.f97918c;
                    bVar2.getClass();
                    h4.r rVarC3 = c2.l.C(aVar, 0.0f, f17, 0.0f, eVar3.f97920e, 5);
                    bVar2.getClass();
                    h4.r rVarA2 = c2.l.A(rVarC3, f14, 0.0f, 2);
                    fVar.getClass();
                    mh.c(strJ2, rVarA2, 0L, null, 0L, null, 0L, d6.h.a(i29), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var), o0Var, 0, 0, 130044);
                    o0Var.g0(false);
                } else {
                    o0Var.C(-1559988388);
                    o0Var.g0(false);
                }
                String strQ3 = gl1.y.Q(o0Var, R.string.nutrition_goal);
                s21.s.INSTANCE.getClass();
                String strB = s21.s.Companion.b(sVar3, o0Var);
                i19 = i18 & 7168;
                if (i19 == 2048) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objQ = o0Var.q();
                aVar4 = p3.m.f135153a;
                if (z24) {
                    objQ = new sq1.e(lVar, 6);
                    o0Var.K(objQ);
                } else {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new sq1.e(lVar, 6);
                        o0Var.K(objQ);
                    }
                }
                a(0, 12, null, (e23.a) objQ, strQ3, strB, o0Var, false);
                sVar = s21.s.NO_GOAL;
                if (sVar3 != sVar) {
                    o0Var.C(-1559532750);
                    if (p005kotlin.jvm.internal.s.g(bool2, Boolean.TRUE)) {
                        i25 = R.string.lbl_starting_weight;
                    } else {
                        i25 = R.string.lbl_current_weight;
                    }
                    String strQ4 = gl1.y.Q(o0Var, i25);
                    if (d24 != null) {
                        k42.b bVar3 = k42.b.f102880a;
                        Double dValueOf = Double.valueOf(dP1);
                        bVar3.getClass();
                        strI = k42.b.i(context, dValueOf);
                    } else {
                        strI = strQ;
                    }
                    if (i19 == 2048) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objQ4 = o0Var.q();
                    if (z26) {
                        objQ4 = new sq1.e(lVar, 13);
                        o0Var.K(objQ4);
                    } else {
                        aVar4.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new sq1.e(lVar, 13);
                            o0Var.K(objQ4);
                        }
                    }
                    a(0, 12, null, (e23.a) objQ4, strQ4, strI, o0Var, false);
                    if (d25 != null) {
                        o0Var.C(-1559115986);
                        String strQ5 = gl1.y.Q(o0Var, R.string.lbl_goal_weight);
                        k42.b bVar4 = k42.b.f102880a;
                        Double dValueOf2 = Double.valueOf(dP2);
                        bVar4.getClass();
                        String strI2 = k42.b.i(context, dValueOf2);
                        if (i19 == 2048) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        objQ9 = o0Var.q();
                        if (z36) {
                            objQ9 = new sq1.e(lVar, 14);
                            o0Var.K(objQ9);
                        } else {
                            aVar4.getClass();
                            if (objQ9 == p3.m.a.f135155b) {
                                objQ9 = new sq1.e(lVar, 14);
                                o0Var.K(objQ9);
                            }
                        }
                        a(0, 12, null, (e23.a) objQ9, strQ5, strI2, o0Var, false);
                        String strQ6 = gl1.y.Q(o0Var, R.string.target_weekly_weight_change);
                        f15 = a0Var.f156049n;
                        if (f15 != null) {
                            if (k42.b.l() == 0) {
                                dFloatValue = l3.a.P1(f15.floatValue());
                            } else {
                                dFloatValue = ((double) f15.floatValue()) / 453.592d;
                            }
                            string3 = eVar6.J(Float.valueOf((float) dFloatValue));
                        } else {
                            string3 = aVar6.getString(R.string.lbl_empty_string);
                        }
                        if (i19 == 2048) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        objQ10 = o0Var.q();
                        if (z37) {
                            objQ10 = new sq1.e(lVar, 15);
                            o0Var.K(objQ10);
                        } else {
                            aVar4.getClass();
                            if (objQ10 == p3.m.a.f135155b) {
                                objQ10 = new sq1.e(lVar, 15);
                                o0Var.K(objQ10);
                            }
                        }
                        a(0, 12, null, (e23.a) objQ10, strQ6, string3, o0Var, false);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(-1558456740);
                        o0Var.g0(false);
                    }
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    s21.a aVar8 = a0Var.f156050o;
                    Integer num2 = a0Var.f156052q;
                    sVar2 = sVar;
                    i24 = 2048;
                    c0235a.f16962a.put("label_secondary", eVar6.b(aVar8, num2, num2, a0Var.f156051p, true));
                    b92.a aVarB = c0235a.b();
                    String strQ7 = gl1.y.Q(o0Var, R.string.txt_activity_level_title);
                    s21.a aVar9 = a0Var.f156050o;
                    Integer num3 = a0Var.f156052q;
                    eVar6 = eVar2;
                    String strB2 = eVar6.b(aVar9, num3, num3, a0Var.f156051p, false);
                    if (i19 == 2048) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objQ5 = o0Var.q();
                    if (z27) {
                        objQ5 = new sq1.e(lVar, 16);
                        o0Var.K(objQ5);
                    } else {
                        aVar4.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new sq1.e(lVar, 16);
                            o0Var.K(objQ5);
                        }
                    }
                    int i30 = b92.a.f16960b;
                    a(0, 8, aVarB, (e23.a) objQ5, strQ7, strB2, o0Var, false);
                    o0Var = o0Var;
                    String strQ8 = gl1.y.Q(o0Var, R.string.lbl_daily_calories_goal);
                    num = a0Var.f156054s;
                    strQ2 = gl1.y.Q(o0Var, R.string.lbl_calories);
                    if (num != null) {
                        string2 = v21.e.d(eVar6, Double.valueOf(num.intValue()), strQ2, 4);
                    } else {
                        string2 = aVar6.getString(R.string.user_goal);
                    }
                    String str2 = string2;
                    if (i19 == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    objQ6 = o0Var.q();
                    if (z28) {
                        objQ6 = new sq1.e(lVar, 17);
                        o0Var.K(objQ6);
                    } else {
                        aVar4.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new sq1.e(lVar, 17);
                            o0Var.K(objQ6);
                        }
                    }
                    a(0, 12, null, (e23.a) objQ6, strQ8, str2, o0Var, false);
                    b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                    if (eVar7 != null) {
                        d14 = eVar7.f156099c;
                    } else {
                        d14 = null;
                    }
                    if (eVar7 != null) {
                        d15 = eVar7.f156098b;
                    } else {
                        d15 = null;
                    }
                    if (eVar7 != null) {
                        d16 = eVar7.f156097a;
                    } else {
                        d16 = null;
                    }
                    c0235a2.f16962a.put("label_secondary", eVar6.x(d14, d15, d16, true));
                    b92.a aVarB2 = c0235a2.b();
                    String strQ9 = gl1.y.Q(o0Var, R.string.lbl_macronutrients_goals);
                    if (eVar7 != null) {
                        d17 = eVar7.f156099c;
                    } else {
                        d17 = null;
                    }
                    if (eVar7 != null) {
                        d18 = eVar7.f156098b;
                    } else {
                        d18 = null;
                    }
                    if (eVar7 != null) {
                        d19 = eVar7.f156097a;
                    } else {
                        d19 = null;
                    }
                    String strX = eVar6.x(d17, d18, d19, false);
                    if (i19 == 2048) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    objQ7 = o0Var.q();
                    if (z29) {
                        objQ7 = new sq1.e(lVar, 7);
                        o0Var.K(objQ7);
                    } else {
                        aVar4.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new sq1.e(lVar, 7);
                            o0Var.K(objQ7);
                        }
                    }
                    a(0, 8, aVarB2, (e23.a) objQ7, strQ9, strX, o0Var, false);
                    if (oVar3 != null) {
                        o0Var.C(-1555474757);
                        b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                        c0235a3.f16962a.put("label_secondary", eVar6.C(oVar3, true));
                        b92.a aVarB3 = c0235a3.b();
                        c22.x0.f23314a.getClass();
                        String strW = gl1.d.W(c22.x0.f23712xe);
                        String strC = eVar6.C(oVar3, false);
                        if (i19 == 2048) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        objQ8 = o0Var.q();
                        if (z35) {
                            objQ8 = new sq1.e(lVar, 8);
                            o0Var.K(objQ8);
                        } else {
                            aVar4.getClass();
                            if (objQ8 == p3.m.a.f135155b) {
                                objQ8 = new sq1.e(lVar, 8);
                                o0Var.K(objQ8);
                            }
                        }
                        a(0, 8, aVarB3, (e23.a) objQ8, strW, strC, o0Var, false);
                        z34 = false;
                        o0Var.g0(false);
                    } else {
                        z34 = false;
                        o0Var.C(-1554643492);
                        o0Var.g0(false);
                    }
                    o0Var.g0(z34);
                } else {
                    sVar2 = sVar;
                    i24 = 2048;
                    o0Var.C(-1554633572);
                    o0Var.g0(false);
                }
                bool = Boolean.FALSE;
                if (p005kotlin.jvm.internal.s.g(bool2, bool) || z19) {
                    eVar4 = eVar;
                } else {
                    eVar4 = eVar;
                    if (eVar4.contains(s21.z.Location)) {
                        o0Var.C(-1554367530);
                        String strQ10 = gl1.y.Q(o0Var, R.string.lbl_country_region);
                        String str3 = a0Var.f156058w.f128595b;
                        String str4 = str3 == null ? strQ : str3;
                        boolean z38 = i19 == i24;
                        Object objQ11 = o0Var.q();
                        if (z38) {
                            objQ11 = new sq1.e(lVar, 9);
                            o0Var.K(objQ11);
                        } else {
                            aVar4.getClass();
                            if (objQ11 == p3.m.a.f135155b) {
                                objQ11 = new sq1.e(lVar, 9);
                                o0Var.K(objQ11);
                            }
                        }
                        a(0, 12, null, (e23.a) objQ11, strQ10, str4, o0Var, false);
                        String strQ11 = gl1.y.Q(o0Var, R.string.device_setting_language);
                        String str5 = a0Var.f156059x.f128595b;
                        String str6 = str5 == null ? strQ : str5;
                        boolean z39 = i19 == i24;
                        Object objQ12 = o0Var.q();
                        if (z39) {
                            objQ12 = new sq1.e(lVar, 10);
                            o0Var.K(objQ12);
                        } else {
                            aVar4.getClass();
                            if (objQ12 == p3.m.a.f135155b) {
                                objQ12 = new sq1.e(lVar, 10);
                                o0Var.K(objQ12);
                            }
                        }
                        a(0, 12, null, (e23.a) objQ12, strQ11, str6, o0Var, false);
                        o0Var.g0(false);
                    }
                    if (p005kotlin.jvm.internal.s.g(bool2, bool) || z19 || !eVar4.contains(s21.z.MealSettings)) {
                        o0Var.C(-1553192196);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(-1553578518);
                        c22.x0.f23314a.getClass();
                        String strW2 = gl1.d.W(c22.x0.f23479je);
                        s21.c cVar = a0Var.G;
                        int i34 = a0Var.H;
                        cVar.getClass();
                        g2 g2VarA = cVar.a();
                        aVar6.getClass();
                        String strD2 = aVar6.d(g2.b(c22.x0.Od), dh.b.A(aVar6.f109162a, g2VarA));
                        g2 g2VarB = g2.b(c22.x0.f23496ke);
                        String str7 = eVar6.f175329f.format(Integer.valueOf(i34));
                        str7.getClass();
                        String strA = aVar6.a(R.string.string_space_bullet_string_pattern, strD2, aVar6.d(g2VarB, str7));
                        boolean z44 = i19 == i24;
                        Object objQ13 = o0Var.q();
                        if (z44) {
                            objQ13 = new sq1.e(lVar, 11);
                            o0Var.K(objQ13);
                        } else {
                            aVar4.getClass();
                            if (objQ13 == p3.m.a.f135155b) {
                                objQ13 = new sq1.e(lVar, 11);
                                o0Var.K(objQ13);
                            }
                        }
                        a(0, 12, null, (e23.a) objQ13, strW2, strA, o0Var, false);
                        o0Var.g0(false);
                    }
                    if (d25 != null) {
                        o0Var.C(-1553126042);
                        bVar2.getClass();
                        c2.l.f(x2.q(aVar5, f14), o0Var);
                        String strQ12 = gl1.y.Q(o0Var, R.string.target_date);
                        oVar2 = a0Var.f156048m;
                        if (oVar2 == null) {
                            aVar5 = aVar;
                            strD = aVar6.getString(R.string.lbl_empty_string);
                        } else {
                            aVar5 = aVar;
                            strD = eVar6.f175326c.d(g22.l.h(oVar2), qi0.a.YEAR_MONTH_DAY);
                        }
                        String str8 = strD;
                        objQ3 = o0Var.q();
                        aVar4.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new f(10);
                            o0Var.K(objQ3);
                        }
                        a(27648, 4, null, (e23.a) objQ3, strQ12, str8, o0Var, false);
                        o0Var.g0(false);
                    } else {
                        aVar5 = aVar;
                        o0Var.C(-1552797380);
                        o0Var.g0(false);
                    }
                    if (sVar3 != sVar2) {
                        o0Var.C(-1552631406);
                        bVar2.getClass();
                        c2.l.f(x2.q(aVar5, f14), o0Var);
                        String strQ13 = gl1.y.Q(o0Var, R.string.personal_details);
                        String str9 = a0Var.f156042g;
                        oVar = a0Var.f156043h;
                        Float f18 = a0Var.f156044i;
                        Boolean bool3 = a0Var.f156045j;
                        s21.f0.f156107c.getClass();
                        String string4 = aVar6.getString(s21.f0.a.a(str9).f156114b);
                        if (oVar != null || (string = DateTimeFormat.mediumDate().print(g22.l.h(oVar))) == null) {
                            string = aVar6.getString(R.string.no_value);
                        }
                        String strA2 = aVar6.a(R.string.string_bullet_string_bullet_string_pattern, string4, string, eVar6.q(f18, bool3));
                        if (i19 == i24) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        objQ2 = o0Var.q();
                        if (z25) {
                            objQ2 = new sq1.e(lVar, 12);
                            o0Var.K(objQ2);
                        } else {
                            aVar4.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new sq1.e(lVar, 12);
                                o0Var.K(objQ2);
                            }
                        }
                        a(3072, 4, null, (e23.a) objQ2, strQ13, strA2, o0Var, false);
                        h4.r rVarF2 = x2.f(aVar5, 1.0f);
                        bVar2.getClass();
                        eVar5 = eVar3;
                        float f19 = eVar5.f97917b;
                        bVar2.getClass();
                        float f22 = eVar5.f97918c;
                        bVar2.getClass();
                        float f24 = eVar5.f97920e;
                        bVar2.getClass();
                        h4.r rVarB = c2.l.B(rVarF2, f24, f19, eVar5.f97920e, f22);
                        String strQ14 = gl1.y.Q(o0Var, R.string.personal_details_edit_info);
                        int i35 = d6.h.f57757g;
                        fVar.getClass();
                        mh.c(strQ14, rVarB, 0L, null, 0L, null, 0L, d6.h.a(i35), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var), o0Var, 0, 0, 130044);
                        o0Var.g0(false);
                    } else {
                        eVar5 = eVar3;
                        o0Var.C(-1551453220);
                        o0Var.g0(false);
                    }
                    if (z19) {
                        o0Var.C(-1550967140);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(-1551345123);
                        h4.r rVarB2 = b0Var.b(x2.f(aVar5, 1.0f), aVar2);
                        bVar2.getClass();
                        h4.r rVarY = c2.l.y(rVarB2, eVar5.f97920e);
                        String strQ15 = gl1.y.Q(o0Var, R.string.nutrition_plan_disclaimer);
                        int i36 = d6.h.f57757g;
                        fVar.getClass();
                        mh.c(strQ15, rVarY, 0L, null, 0L, null, 0L, d6.h.a(i36), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var), o0Var, 0, 0, 130044);
                        o0Var.g0(false);
                    }
                    o0Var.g0(true);
                    x1 x1Var2 = p3.n.f135158a;
                    z17 = z19;
                }
                o0Var.C(-1553838980);
                o0Var.g0(false);
                if (p005kotlin.jvm.internal.s.g(bool2, bool)) {
                    o0Var.C(-1553192196);
                    o0Var.g0(false);
                } else {
                    o0Var.C(-1553192196);
                    o0Var.g0(false);
                }
                if (d25 != null) {
                    o0Var.C(-1553126042);
                    bVar2.getClass();
                    c2.l.f(x2.q(aVar5, f14), o0Var);
                    String strQ16 = gl1.y.Q(o0Var, R.string.target_date);
                    oVar2 = a0Var.f156048m;
                    if (oVar2 == null) {
                        aVar5 = aVar;
                        strD = aVar6.getString(R.string.lbl_empty_string);
                    } else {
                        aVar5 = aVar;
                        strD = eVar6.f175326c.d(g22.l.h(oVar2), qi0.a.YEAR_MONTH_DAY);
                    }
                    String str10 = strD;
                    objQ3 = o0Var.q();
                    aVar4.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new f(10);
                        o0Var.K(objQ3);
                    }
                    a(27648, 4, null, (e23.a) objQ3, strQ16, str10, o0Var, false);
                    o0Var.g0(false);
                } else {
                    aVar5 = aVar;
                    o0Var.C(-1552797380);
                    o0Var.g0(false);
                }
                if (sVar3 != sVar2) {
                    o0Var.C(-1552631406);
                    bVar2.getClass();
                    c2.l.f(x2.q(aVar5, f14), o0Var);
                    String strQ17 = gl1.y.Q(o0Var, R.string.personal_details);
                    String str11 = a0Var.f156042g;
                    oVar = a0Var.f156043h;
                    Float f110 = a0Var.f156044i;
                    Boolean bool4 = a0Var.f156045j;
                    s21.f0.f156107c.getClass();
                    String string5 = aVar6.getString(s21.f0.a.a(str11).f156114b);
                    if (oVar != null) {
                        string = aVar6.getString(R.string.no_value);
                    } else {
                        string = aVar6.getString(R.string.no_value);
                    }
                    String strA3 = aVar6.a(R.string.string_bullet_string_bullet_string_pattern, string5, string, eVar6.q(f110, bool4));
                    if (i19 == i24) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objQ2 = o0Var.q();
                    if (z25) {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new sq1.e(lVar, 12);
                            o0Var.K(objQ2);
                        }
                    } else {
                        objQ2 = new sq1.e(lVar, 12);
                        o0Var.K(objQ2);
                    }
                    a(3072, 4, null, (e23.a) objQ2, strQ17, strA3, o0Var, false);
                    h4.r rVarF3 = x2.f(aVar5, 1.0f);
                    bVar2.getClass();
                    eVar5 = eVar3;
                    float f111 = eVar5.f97917b;
                    bVar2.getClass();
                    float f25 = eVar5.f97918c;
                    bVar2.getClass();
                    float f26 = eVar5.f97920e;
                    bVar2.getClass();
                    h4.r rVarB3 = c2.l.B(rVarF3, f26, f111, eVar5.f97920e, f25);
                    String strQ18 = gl1.y.Q(o0Var, R.string.personal_details_edit_info);
                    int i37 = d6.h.f57757g;
                    fVar.getClass();
                    mh.c(strQ18, rVarB3, 0L, null, 0L, null, 0L, d6.h.a(i37), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var), o0Var, 0, 0, 130044);
                    o0Var.g0(false);
                } else {
                    eVar5 = eVar3;
                    o0Var.C(-1551453220);
                    o0Var.g0(false);
                }
                if (z19) {
                    o0Var.C(-1551345123);
                    h4.r rVarB4 = b0Var.b(x2.f(aVar5, 1.0f), aVar2);
                    bVar2.getClass();
                    h4.r rVarY2 = c2.l.y(rVarB4, eVar5.f97920e);
                    String strQ19 = gl1.y.Q(o0Var, R.string.nutrition_plan_disclaimer);
                    int i38 = d6.h.f57757g;
                    fVar.getClass();
                    mh.c(strQ19, rVarY2, 0L, null, 0L, null, 0L, d6.h.a(i38), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var), o0Var, 0, 0, 130044);
                    o0Var.g0(false);
                } else {
                    o0Var.C(-1550967140);
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                x1 x1Var3 = p3.n.f135158a;
                z17 = z19;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z17 = z15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a82.a(a0Var, eVar, z17, lVar, eVar6, i14, i15, 15);
            }
        }
        i26 |= 384;
        z15 = z14;
        if (o0VarE.r(lVar)) {
            i16 = 2048;
        } else {
            i16 = 1024;
        }
        int i210 = i26 | i16;
        if (o0VarE.r(eVar6)) {
            i17 = 16384;
        } else {
            i17 = 8192;
        }
        i18 = i210 | i17;
        if ((i18 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i18 & 1, z16)) {
            if (i27 != 0) {
                z18 = false;
            } else {
                z18 = z15;
            }
            x1 x1Var4 = p3.n.f135158a;
            context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            strQ = gl1.y.Q(o0VarE, R.string.activities_value_not_set);
            l3.a aVar10 = l3.f23124b;
            if (d24 != null) {
                dDoubleValue = d24.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
            aVar10.getClass();
            dP1 = l3.a.P1(dDoubleValue);
            dP2 = l3.a.P1(d25 != null ? d25.doubleValue() : 0.0d);
            aVar = h4.r.S;
            z19 = z18;
            h4.r rVarF4 = x2.f(aVar, 1.0f);
            h4.d.f81522a.getClass();
            aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            zVarA = c2.y.a(c2.j.f22694d, aVar2, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarF4, o0VarE);
            h5.g.V.getClass();
            aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
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
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            bVar2 = d92.b.f58625c;
            bVar2.getClass();
            eVar3 = j92.b.f97899b;
            float f112 = eVar3.f97920e;
            f14 = eVar3.f97920e;
            bVar2.getClass();
            h4.r rVarC4 = c2.l.C(aVar, 0.0f, f112, 0.0f, eVar3.f97918c, 5);
            bVar2.getClass();
            h4.r rVarA3 = c2.l.A(rVarC4, f14, 0.0f, 2);
            if (z19) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1561595924, R.string.editing_plan_info, o0VarE, false);
            } else if (p005kotlin.jvm.internal.s.g(bool2, Boolean.TRUE)) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1561364323, R.string.reivew_update_nutrition_plan_subtitle, o0VarE, false);
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1561200953, R.string.reivew_nutrition_plan_subtitle, o0VarE, false);
            }
            String str12 = strJ;
            d6.h.f57752b.getClass();
            int i211 = d6.h.f57755e;
            fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(str12, rVarA3, 0L, null, 0L, null, 0L, d6.h.a(i211), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 130044);
            o0Var = o0VarE;
            if (z19) {
                o0Var.C(-1559988388);
                o0Var.g0(false);
            } else {
                o0Var.C(-1559988388);
                o0Var.g0(false);
            }
            String strQ20 = gl1.y.Q(o0Var, R.string.nutrition_goal);
            s21.s.INSTANCE.getClass();
            String strB3 = s21.s.Companion.b(sVar3, o0Var);
            i19 = i18 & 7168;
            if (i19 == 2048) {
                z24 = true;
            } else {
                z24 = false;
            }
            objQ = o0Var.q();
            aVar4 = p3.m.f135153a;
            if (z24) {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new sq1.e(lVar, 6);
                    o0Var.K(objQ);
                }
            } else {
                objQ = new sq1.e(lVar, 6);
                o0Var.K(objQ);
            }
            a(0, 12, null, (e23.a) objQ, strQ20, strB3, o0Var, false);
            sVar = s21.s.NO_GOAL;
            if (sVar3 != sVar) {
                o0Var.C(-1559532750);
                if (p005kotlin.jvm.internal.s.g(bool2, Boolean.TRUE)) {
                    i25 = R.string.lbl_starting_weight;
                } else {
                    i25 = R.string.lbl_current_weight;
                }
                String strQ21 = gl1.y.Q(o0Var, i25);
                if (d24 != null) {
                    k42.b bVar5 = k42.b.f102880a;
                    Double dValueOf3 = Double.valueOf(dP1);
                    bVar5.getClass();
                    strI = k42.b.i(context, dValueOf3);
                } else {
                    strI = strQ;
                }
                if (i19 == 2048) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                objQ4 = o0Var.q();
                if (z26) {
                    aVar4.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new sq1.e(lVar, 13);
                        o0Var.K(objQ4);
                    }
                } else {
                    objQ4 = new sq1.e(lVar, 13);
                    o0Var.K(objQ4);
                }
                a(0, 12, null, (e23.a) objQ4, strQ21, strI, o0Var, false);
                if (d25 != null) {
                    o0Var.C(-1559115986);
                    String strQ22 = gl1.y.Q(o0Var, R.string.lbl_goal_weight);
                    k42.b bVar6 = k42.b.f102880a;
                    Double dValueOf4 = Double.valueOf(dP2);
                    bVar6.getClass();
                    String strI3 = k42.b.i(context, dValueOf4);
                    if (i19 == 2048) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    objQ9 = o0Var.q();
                    if (z36) {
                        aVar4.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new sq1.e(lVar, 14);
                            o0Var.K(objQ9);
                        }
                    } else {
                        objQ9 = new sq1.e(lVar, 14);
                        o0Var.K(objQ9);
                    }
                    a(0, 12, null, (e23.a) objQ9, strQ22, strI3, o0Var, false);
                    String strQ23 = gl1.y.Q(o0Var, R.string.target_weekly_weight_change);
                    f15 = a0Var.f156049n;
                    if (f15 != null) {
                        if (k42.b.l() == 0) {
                            dFloatValue = l3.a.P1(f15.floatValue());
                        } else {
                            dFloatValue = ((double) f15.floatValue()) / 453.592d;
                        }
                        string3 = eVar6.J(Float.valueOf((float) dFloatValue));
                    } else {
                        string3 = aVar6.getString(R.string.lbl_empty_string);
                    }
                    if (i19 == 2048) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    objQ10 = o0Var.q();
                    if (z37) {
                        aVar4.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new sq1.e(lVar, 15);
                            o0Var.K(objQ10);
                        }
                    } else {
                        objQ10 = new sq1.e(lVar, 15);
                        o0Var.K(objQ10);
                    }
                    a(0, 12, null, (e23.a) objQ10, strQ23, string3, o0Var, false);
                    o0Var.g0(false);
                } else {
                    o0Var.C(-1558456740);
                    o0Var.g0(false);
                }
                b92.a.C0235a c0235a4 = new b92.a.C0235a(null, 1, null);
                s21.a aVar11 = a0Var.f156050o;
                Integer num4 = a0Var.f156052q;
                sVar2 = sVar;
                i24 = 2048;
                c0235a4.f16962a.put("label_secondary", eVar6.b(aVar11, num4, num4, a0Var.f156051p, true));
                b92.a aVarB4 = c0235a4.b();
                String strQ24 = gl1.y.Q(o0Var, R.string.txt_activity_level_title);
                s21.a aVar12 = a0Var.f156050o;
                Integer num5 = a0Var.f156052q;
                eVar6 = eVar2;
                String strB4 = eVar6.b(aVar12, num5, num5, a0Var.f156051p, false);
                if (i19 == 2048) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                objQ5 = o0Var.q();
                if (z27) {
                    aVar4.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new sq1.e(lVar, 16);
                        o0Var.K(objQ5);
                    }
                } else {
                    objQ5 = new sq1.e(lVar, 16);
                    o0Var.K(objQ5);
                }
                int i39 = b92.a.f16960b;
                a(0, 8, aVarB4, (e23.a) objQ5, strQ24, strB4, o0Var, false);
                o0Var = o0Var;
                String strQ25 = gl1.y.Q(o0Var, R.string.lbl_daily_calories_goal);
                num = a0Var.f156054s;
                strQ2 = gl1.y.Q(o0Var, R.string.lbl_calories);
                if (num != null) {
                    string2 = v21.e.d(eVar6, Double.valueOf(num.intValue()), strQ2, 4);
                } else {
                    string2 = aVar6.getString(R.string.user_goal);
                }
                String str13 = string2;
                if (i19 == 2048) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                objQ6 = o0Var.q();
                if (z28) {
                    aVar4.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new sq1.e(lVar, 17);
                        o0Var.K(objQ6);
                    }
                } else {
                    objQ6 = new sq1.e(lVar, 17);
                    o0Var.K(objQ6);
                }
                a(0, 12, null, (e23.a) objQ6, strQ25, str13, o0Var, false);
                b92.a.C0235a c0235a5 = new b92.a.C0235a(null, 1, null);
                if (eVar7 != null) {
                    d14 = eVar7.f156099c;
                } else {
                    d14 = null;
                }
                if (eVar7 != null) {
                    d15 = eVar7.f156098b;
                } else {
                    d15 = null;
                }
                if (eVar7 != null) {
                    d16 = eVar7.f156097a;
                } else {
                    d16 = null;
                }
                c0235a5.f16962a.put("label_secondary", eVar6.x(d14, d15, d16, true));
                b92.a aVarB5 = c0235a5.b();
                String strQ26 = gl1.y.Q(o0Var, R.string.lbl_macronutrients_goals);
                if (eVar7 != null) {
                    d17 = eVar7.f156099c;
                } else {
                    d17 = null;
                }
                if (eVar7 != null) {
                    d18 = eVar7.f156098b;
                } else {
                    d18 = null;
                }
                if (eVar7 != null) {
                    d19 = eVar7.f156097a;
                } else {
                    d19 = null;
                }
                String strX2 = eVar6.x(d17, d18, d19, false);
                if (i19 == 2048) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                objQ7 = o0Var.q();
                if (z29) {
                    aVar4.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new sq1.e(lVar, 7);
                        o0Var.K(objQ7);
                    }
                } else {
                    objQ7 = new sq1.e(lVar, 7);
                    o0Var.K(objQ7);
                }
                a(0, 8, aVarB5, (e23.a) objQ7, strQ26, strX2, o0Var, false);
                if (oVar3 != null) {
                    o0Var.C(-1555474757);
                    b92.a.C0235a c0235a6 = new b92.a.C0235a(null, 1, null);
                    c0235a6.f16962a.put("label_secondary", eVar6.C(oVar3, true));
                    b92.a aVarB6 = c0235a6.b();
                    c22.x0.f23314a.getClass();
                    String strW3 = gl1.d.W(c22.x0.f23712xe);
                    String strC2 = eVar6.C(oVar3, false);
                    if (i19 == 2048) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    objQ8 = o0Var.q();
                    if (z35) {
                        aVar4.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new sq1.e(lVar, 8);
                            o0Var.K(objQ8);
                        }
                    } else {
                        objQ8 = new sq1.e(lVar, 8);
                        o0Var.K(objQ8);
                    }
                    a(0, 8, aVarB6, (e23.a) objQ8, strW3, strC2, o0Var, false);
                    z34 = false;
                    o0Var.g0(false);
                } else {
                    z34 = false;
                    o0Var.C(-1554643492);
                    o0Var.g0(false);
                }
                o0Var.g0(z34);
            } else {
                sVar2 = sVar;
                i24 = 2048;
                o0Var.C(-1554633572);
                o0Var.g0(false);
            }
            bool = Boolean.FALSE;
            if (p005kotlin.jvm.internal.s.g(bool2, bool)) {
                eVar4 = eVar;
                o0Var.C(-1553838980);
                o0Var.g0(false);
            } else {
                eVar4 = eVar;
                o0Var.C(-1553838980);
                o0Var.g0(false);
            }
            if (p005kotlin.jvm.internal.s.g(bool2, bool)) {
                o0Var.C(-1553192196);
                o0Var.g0(false);
            } else {
                o0Var.C(-1553192196);
                o0Var.g0(false);
            }
            if (d25 != null) {
                o0Var.C(-1553126042);
                bVar2.getClass();
                c2.l.f(x2.q(aVar5, f14), o0Var);
                String strQ110 = gl1.y.Q(o0Var, R.string.target_date);
                oVar2 = a0Var.f156048m;
                if (oVar2 == null) {
                    aVar5 = aVar;
                    strD = aVar6.getString(R.string.lbl_empty_string);
                } else {
                    aVar5 = aVar;
                    strD = eVar6.f175326c.d(g22.l.h(oVar2), qi0.a.YEAR_MONTH_DAY);
                }
                String str14 = strD;
                objQ3 = o0Var.q();
                aVar4.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new f(10);
                    o0Var.K(objQ3);
                }
                a(27648, 4, null, (e23.a) objQ3, strQ110, str14, o0Var, false);
                o0Var.g0(false);
            } else {
                aVar5 = aVar;
                o0Var.C(-1552797380);
                o0Var.g0(false);
            }
            if (sVar3 != sVar2) {
                o0Var.C(-1552631406);
                bVar2.getClass();
                c2.l.f(x2.q(aVar5, f14), o0Var);
                String strQ111 = gl1.y.Q(o0Var, R.string.personal_details);
                String str15 = a0Var.f156042g;
                oVar = a0Var.f156043h;
                Float f113 = a0Var.f156044i;
                Boolean bool5 = a0Var.f156045j;
                s21.f0.f156107c.getClass();
                String string6 = aVar6.getString(s21.f0.a.a(str15).f156114b);
                if (oVar != null) {
                    string = aVar6.getString(R.string.no_value);
                } else {
                    string = aVar6.getString(R.string.no_value);
                }
                String strA4 = aVar6.a(R.string.string_bullet_string_bullet_string_pattern, string6, string, eVar6.q(f113, bool5));
                if (i19 == i24) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                objQ2 = o0Var.q();
                if (z25) {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new sq1.e(lVar, 12);
                        o0Var.K(objQ2);
                    }
                } else {
                    objQ2 = new sq1.e(lVar, 12);
                    o0Var.K(objQ2);
                }
                a(3072, 4, null, (e23.a) objQ2, strQ111, strA4, o0Var, false);
                h4.r rVarF5 = x2.f(aVar5, 1.0f);
                bVar2.getClass();
                eVar5 = eVar3;
                float f114 = eVar5.f97917b;
                bVar2.getClass();
                float f27 = eVar5.f97918c;
                bVar2.getClass();
                float f28 = eVar5.f97920e;
                bVar2.getClass();
                h4.r rVarB5 = c2.l.B(rVarF5, f28, f114, eVar5.f97920e, f27);
                String strQ112 = gl1.y.Q(o0Var, R.string.personal_details_edit_info);
                int i310 = d6.h.f57757g;
                fVar.getClass();
                mh.c(strQ112, rVarB5, 0L, null, 0L, null, 0L, d6.h.a(i310), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var), o0Var, 0, 0, 130044);
                o0Var.g0(false);
            } else {
                eVar5 = eVar3;
                o0Var.C(-1551453220);
                o0Var.g0(false);
            }
            if (z19) {
                o0Var.C(-1551345123);
                h4.r rVarB6 = b0Var.b(x2.f(aVar5, 1.0f), aVar2);
                bVar2.getClass();
                h4.r rVarY3 = c2.l.y(rVarB6, eVar5.f97920e);
                String strQ113 = gl1.y.Q(o0Var, R.string.nutrition_plan_disclaimer);
                int i311 = d6.h.f57757g;
                fVar.getClass();
                mh.c(strQ113, rVarY3, 0L, null, 0L, null, 0L, d6.h.a(i311), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var), o0Var, 0, 0, 130044);
                o0Var.g0(false);
            } else {
                o0Var.C(-1550967140);
                o0Var.g0(false);
            }
            o0Var.g0(true);
            x1 x1Var5 = p3.n.f135158a;
            z17 = z19;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z17 = z15;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.a(a0Var, eVar, z17, lVar, eVar6, i14, i15, 15);
        }
    }
}
