package g11;

import c2.b0;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import g21.f0;
import g21.u;
import h4.r;
import h5.e0;
import i3.e5;
import java.util.LinkedHashMap;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.q0;
import s5.s0;
import s5.t0;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class p {
    /* JADX WARN: Code duplicated, block: B:101:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:105:0x0230  */
    /* JADX WARN: Code duplicated, block: B:108:0x023a  */
    /* JADX WARN: Code duplicated, block: B:109:0x023d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0258  */
    /* JADX WARN: Code duplicated, block: B:113:0x026a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0289  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:121:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:124:0x0314  */
    /* JADX WARN: Code duplicated, block: B:125:0x032d  */
    /* JADX WARN: Code duplicated, block: B:128:0x035b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0367  */
    /* JADX WARN: Code duplicated, block: B:132:0x0382  */
    /* JADX WARN: Code duplicated, block: B:133:0x039d  */
    /* JADX WARN: Code duplicated, block: B:136:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:137:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:140:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:141:0x040e  */
    /* JADX WARN: Code duplicated, block: B:143:0x0442  */
    /* JADX WARN: Code duplicated, block: B:145:0x0447  */
    /* JADX WARN: Code duplicated, block: B:148:0x0452  */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x0081  */
    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x0092  */
    /* JADX WARN: Code duplicated, block: B:46:0x009b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b4 A[PHI: r8 r9
      0x00b4: PHI (r8v47 c2.j$l) = (r8v12 c2.j$l), (r8v49 c2.j$l) binds: [B:61:0x00db, B:54:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x00b4: PHI (r9v46 int) = (r9v10 int), (r9v49 int) binds: [B:61:0x00db, B:54:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:65:0x010e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0115  */
    /* JADX WARN: Code duplicated, block: B:68:0x0119  */
    /* JADX WARN: Code duplicated, block: B:71:0x012c  */
    /* JADX WARN: Code duplicated, block: B:73:0x013a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0163  */
    /* JADX WARN: Code duplicated, block: B:77:0x016a  */
    /* JADX WARN: Code duplicated, block: B:79:0x016d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0172  */
    /* JADX WARN: Code duplicated, block: B:83:0x0191  */
    /* JADX WARN: Code duplicated, block: B:84:0x0196  */
    /* JADX WARN: Code duplicated, block: B:86:0x019a  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f4  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [b92.a, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15, types: [b92.a, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21, types: [b92.a, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [b92.a, kotlin.jvm.internal.j] */
    public static final void a(r rVar, c2.j.l lVar, v21.e eVar, u uVar, f0 f0Var, boolean z14, boolean z15, p3.m mVar, int i14, int i15) {
        int i16;
        c2.j.l lVar2;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        boolean z16;
        int i26;
        boolean z17;
        c2.j.l lVar3;
        boolean z18;
        p2 p2VarI0;
        c2.j.l lVarI;
        int i27;
        c2.j.l lVar4;
        boolean z19;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar;
        h5.g.a.b bVar;
        String strQ;
        Integer num;
        String strE;
        String strE2;
        String strU;
        String strU2;
        String strQ2;
        Double d14;
        String strD;
        String strD2;
        String strT;
        String strT2;
        String strQ3;
        Double d15;
        String strD3;
        String strD4;
        String strT3;
        String strT4;
        String strQ4;
        Double d16;
        String strD5;
        String strD6;
        String strT5;
        String strT6;
        s0 s0VarA;
        x0 x0VarB;
        boolean zB;
        Object objQ;
        q0 q0Var;
        int i28;
        String strJ;
        ?? r14;
        z01.a aVar2;
        String strJ2;
        ?? r15;
        z01.a aVar3;
        String strJ3;
        ?? r16;
        z01.a aVar4;
        String strJ4;
        ?? r17;
        z01.a aVar5;
        uVar.getClass();
        Double d17 = uVar.f75504f;
        Double d18 = uVar.f75505g;
        Double d19 = uVar.f75506h;
        int i29 = uVar.f75500b;
        f0Var.getClass();
        o0 o0VarE = mVar.E(978919383);
        if ((i14 & 6) == 0) {
            i16 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i15 & 2) == 0) {
            lVar2 = lVar;
            int i30 = o0VarE.B(lVar2) ? 32 : 16;
            int i34 = i16 | i30;
            if (o0VarE.r(eVar)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            int i35 = i34 | i17;
            if (o0VarE.B(uVar)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            int i36 = i35 | i18;
            if (o0VarE.B(f0Var)) {
                i19 = 16384;
            } else {
                i19 = 8192;
            }
            i24 = i36 | i19;
            i25 = i15 & 64;
            if (i25 != 0) {
                if ((i14 & 1572864) == 0) {
                    z16 = z15;
                    if (o0VarE.h(z16)) {
                        i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i26 = 524288;
                    }
                    i24 |= i26;
                }
                if ((599187 & i24) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (o0VarE.n(i24 & 1, z17)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0 || o0VarE.o0()) {
                        if ((i15 & 2) != 0) {
                            c2.j jVar = c2.j.f22691a;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            float f14 = j92.b.f97899b.f97917b;
                            jVar.getClass();
                            lVarI = c2.j.i(f14);
                            i24 &= -113;
                        } else {
                            lVarI = lVar2;
                        }
                        c2.j.l lVar5 = lVarI;
                        i27 = i24;
                        lVar4 = lVar5;
                        if (i25 != 0) {
                            z19 = false;
                        }
                        o0VarE.h0();
                        x1 x1Var = p3.n.f135158a;
                        h4.d.f81522a.getClass();
                        zVarA = y.a(lVar4, h4.d.a.f81536n, o0VarE, ((i27 & 126) >> 3) & 14);
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        rVarC = h4.k.c(rVar, o0VarE);
                        h5.g.V.getClass();
                        aVar = h5.g.a.f81805b;
                        if (o0VarE.f135177b == null) {
                            p0.l();
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
                        bVar = h5.g.a.f81813j;
                        if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                        b0 b0Var = b0.f22601a;
                        strQ = gl1.y.Q(o0VarE, R.string.lbl_calories);
                        num = f0Var.f75417a;
                        Integer numValueOf = Integer.valueOf(i29);
                        int i37 = v21.e.f175323i;
                        strE = eVar.E(num, numValueOf, false);
                        strE2 = eVar.E(num, Integer.valueOf(i29), true);
                        if (z14) {
                            strU = eVar.u(num, i29, false);
                        } else {
                            strU = strE;
                        }
                        if (z14) {
                            strU2 = eVar.u(num, i29, true);
                        } else {
                            strU2 = strE2;
                        }
                        strQ2 = gl1.y.Q(o0VarE, R.string.protein);
                        d14 = f0Var.f75420d;
                        c2.j.l lVar6 = lVar4;
                        String str = strU;
                        strD = eVar.D(d14, d19, true, (12 & 8) == 0);
                        strD2 = eVar.D(d14, d19, true, (12 & 8) == 0);
                        if (z14) {
                            strT = eVar.t(d14, d19, true, (12 & 8) == 0);
                        } else {
                            strT = strD;
                        }
                        if (z14) {
                            strT2 = eVar.t(d14, d19, true, (12 & 8) == 0);
                        } else {
                            strT2 = strD2;
                        }
                        strQ3 = gl1.y.Q(o0VarE, R.string.fat);
                        d15 = f0Var.f75419c;
                        String str2 = strT2;
                        strD3 = eVar.D(d15, d18, true, (12 & 8) == 0);
                        strD4 = eVar.D(d15, d18, true, (12 & 8) == 0);
                        if (z14) {
                            strT3 = eVar.t(d15, d18, true, (12 & 8) == 0);
                        } else {
                            strT3 = strD3;
                        }
                        if (z14) {
                            strT4 = eVar.t(d15, d18, true, (12 & 8) == 0);
                        } else {
                            strT4 = strD4;
                        }
                        strQ4 = gl1.y.Q(o0VarE, R.string.carbs);
                        d16 = f0Var.f75418b;
                        String str3 = strT4;
                        strD5 = eVar.D(d16, d17, true, (12 & 8) == 0);
                        strD6 = eVar.D(d16, d17, true, (12 & 8) == 0);
                        if (z14) {
                            strT5 = eVar.t(d16, d17, true, (12 & 8) == 0);
                        } else {
                            strT5 = strD5;
                        }
                        String str4 = strT5;
                        if (z14) {
                            strT6 = eVar.t(d16, d17, true, (12 & 8) == 0);
                        } else {
                            strT6 = strD6;
                        }
                        s0VarA = t0.a(o0VarE);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0VarB = d92.c.b(j92.f.f97933j, o0VarE);
                        zB = o0VarE.B(strE) | o0VarE.B(strD) | o0VarE.B(strD3) | o0VarE.B(strD5);
                        objQ = o0VarE.q();
                        if (zB) {
                            objQ = s0.a(s0VarA, am.j.o("\n", strD5, e5.l(strE, "\n", strD, "\n", strD3)), x0VarB, 0L, 1020);
                            o0VarE.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = s0.a(s0VarA, am.j.o("\n", strD5, e5.l(strE, "\n", strD, "\n", strD3)), x0VarB, 0L, 1020);
                                o0VarE.K(objQ);
                            }
                        }
                        q0Var = (q0) objQ;
                        if (z19) {
                            i28 = 0;
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1819861934, R.string.calories_abbreviation, o0VarE, false);
                        } else {
                            i28 = 0;
                            o0VarE.C(1819949044);
                            o0VarE.g0(false);
                            strJ = strQ;
                        }
                        z3.e eVarC = z3.f.c(337944090, new n(num, uVar, i28), o0VarE);
                        if (z14) {
                            o0VarE.C(1820489870);
                            r14 = 0;
                            aVar2 = new z01.a(w02.b0.x(o0VarE, (int) (q0Var.f157282c >> 32)), strE, x0VarB, null);
                            o0VarE.g0(false);
                        } else {
                            r14 = 0;
                            o0VarE.C(1820699709);
                            o0VarE.g0(false);
                            aVar2 = null;
                        }
                        b92.a.C0235a c0235a = new b92.a.C0235a(r14, 1, r14);
                        LinkedHashMap linkedHashMap = c0235a.f16962a;
                        linkedHashMap.put("title", strQ);
                        linkedHashMap.put("label_metadata", strU2);
                        linkedHashMap.put("value", strE2);
                        b92.a aVarB = c0235a.b();
                        int i38 = b92.a.f16960b;
                        z01.b.b(null, strJ, str, eVarC, aVar2, aVarB, o0VarE, 3072);
                        if (z19) {
                            strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1821135631, R.string.protein_abbreviation, o0VarE, false);
                        } else {
                            o0VarE.C(1821221749);
                            o0VarE.g0(false);
                            strJ2 = strQ2;
                        }
                        z3.e eVarC2 = z3.f.c(-307636669, new o(d14, uVar, 0), o0VarE);
                        if (z14) {
                            o0VarE.C(1821757615);
                            r15 = 0;
                            aVar3 = new z01.a(w02.b0.x(o0VarE, (int) (q0Var.f157282c >> 32)), strD, x0VarB, null);
                            o0VarE.g0(false);
                        } else {
                            r15 = 0;
                            o0VarE.C(1821966493);
                            o0VarE.g0(false);
                            aVar3 = null;
                        }
                        b92.a.C0235a c0235a2 = new b92.a.C0235a(r15, 1, r15);
                        LinkedHashMap linkedHashMap2 = c0235a2.f16962a;
                        linkedHashMap2.put("title", strQ2);
                        linkedHashMap2.put("label_metadata", str2);
                        linkedHashMap2.put("value", strD2);
                        z01.b.b(null, strJ2, strT, eVarC2, aVar3, c0235a2.b(), o0VarE, 3072);
                        if (z19) {
                            strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1822399315, R.string.fat_abbreviation, o0VarE, false);
                        } else {
                            o0VarE.C(1822481465);
                            o0VarE.g0(false);
                            strJ3 = strQ3;
                        }
                        z3.e eVarC3 = z3.f.c(-1951585438, new o(d15, uVar, 1), o0VarE);
                        if (z14) {
                            o0VarE.C(1822993523);
                            r16 = 0;
                            aVar4 = new z01.a(w02.b0.x(o0VarE, (int) (q0Var.f157282c >> 32)), strD3, x0VarB, null);
                            o0VarE.g0(false);
                        } else {
                            r16 = 0;
                            o0VarE.C(1823198557);
                            o0VarE.g0(false);
                            aVar4 = null;
                        }
                        b92.a.C0235a c0235a3 = new b92.a.C0235a(r16, 1, r16);
                        LinkedHashMap linkedHashMap3 = c0235a3.f16962a;
                        linkedHashMap3.put("title", strQ3);
                        linkedHashMap3.put("label_metadata", str3);
                        linkedHashMap3.put("value", strD4);
                        z01.b.b(null, strJ3, strT3, eVarC3, aVar4, c0235a3.b(), o0VarE, 3072);
                        if (z19) {
                            strJ4 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1823619537, R.string.carbs_abbreviation, o0VarE, false);
                        } else {
                            o0VarE.C(1823703671);
                            o0VarE.g0(false);
                            strJ4 = strQ4;
                        }
                        z3.e eVarC4 = z3.f.c(699433089, new o(d16, uVar, 2), o0VarE);
                        if (z14) {
                            o0VarE.C(1824227633);
                            r17 = 0;
                            aVar5 = new z01.a(w02.b0.x(o0VarE, (int) (q0Var.f157282c >> 32)), strD5, x0VarB, null);
                            o0VarE.g0(false);
                        } else {
                            r17 = 0;
                            o0VarE.C(1824434589);
                            o0VarE.g0(false);
                            aVar5 = null;
                        }
                        b92.a.C0235a c0235a4 = new b92.a.C0235a(r17, 1, r17);
                        LinkedHashMap linkedHashMap4 = c0235a4.f16962a;
                        linkedHashMap4.put("title", strQ4);
                        linkedHashMap4.put("label_metadata", strT6);
                        linkedHashMap4.put("value", strD6);
                        z01.b.b(null, strJ4, str4, eVarC4, aVar5, c0235a4.b(), o0VarE, 3072);
                        o0VarE.g0(true);
                        lVar3 = lVar6;
                        z18 = z19;
                    } else {
                        o0VarE.e();
                        if ((i15 & 2) != 0) {
                            i24 &= -113;
                        }
                        i27 = i24;
                        lVar4 = lVar2;
                    }
                    z19 = z16;
                    o0VarE.h0();
                    x1 x1Var2 = p3.n.f135158a;
                    h4.d.f81522a.getClass();
                    zVarA = y.a(lVar4, h4.d.a.f81536n, o0VarE, ((i27 & 126) >> 3) & 14);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVar, o0VarE);
                    h5.g.V.getClass();
                    aVar = h5.g.a.f81805b;
                    if (o0VarE.f135177b == null) {
                        p0.l();
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
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    b0 b0Var2 = b0.f22601a;
                    strQ = gl1.y.Q(o0VarE, R.string.lbl_calories);
                    num = f0Var.f75417a;
                    Integer numValueOf2 = Integer.valueOf(i29);
                    int i39 = v21.e.f175323i;
                    strE = eVar.E(num, numValueOf2, false);
                    strE2 = eVar.E(num, Integer.valueOf(i29), true);
                    if (z14) {
                        strU = eVar.u(num, i29, false);
                    } else {
                        strU = strE;
                    }
                    if (z14) {
                        strU2 = eVar.u(num, i29, true);
                    } else {
                        strU2 = strE2;
                    }
                    strQ2 = gl1.y.Q(o0VarE, R.string.protein);
                    d14 = f0Var.f75420d;
                    c2.j.l lVar7 = lVar4;
                    String str5 = strU;
                    strD = eVar.D(d14, d19, true, (12 & 8) == 0);
                    strD2 = eVar.D(d14, d19, true, (12 & 8) == 0);
                    if (z14) {
                        strT = eVar.t(d14, d19, true, (12 & 8) == 0);
                    } else {
                        strT = strD;
                    }
                    if (z14) {
                        strT2 = eVar.t(d14, d19, true, (12 & 8) == 0);
                    } else {
                        strT2 = strD2;
                    }
                    strQ3 = gl1.y.Q(o0VarE, R.string.fat);
                    d15 = f0Var.f75419c;
                    String str6 = strT2;
                    strD3 = eVar.D(d15, d18, true, (12 & 8) == 0);
                    strD4 = eVar.D(d15, d18, true, (12 & 8) == 0);
                    if (z14) {
                        strT3 = eVar.t(d15, d18, true, (12 & 8) == 0);
                    } else {
                        strT3 = strD3;
                    }
                    if (z14) {
                        strT4 = eVar.t(d15, d18, true, (12 & 8) == 0);
                    } else {
                        strT4 = strD4;
                    }
                    strQ4 = gl1.y.Q(o0VarE, R.string.carbs);
                    d16 = f0Var.f75418b;
                    String str7 = strT4;
                    strD5 = eVar.D(d16, d17, true, (12 & 8) == 0);
                    strD6 = eVar.D(d16, d17, true, (12 & 8) == 0);
                    if (z14) {
                        strT5 = eVar.t(d16, d17, true, (12 & 8) == 0);
                    } else {
                        strT5 = strD5;
                    }
                    String str8 = strT5;
                    if (z14) {
                        strT6 = eVar.t(d16, d17, true, (12 & 8) == 0);
                    } else {
                        strT6 = strD6;
                    }
                    s0VarA = t0.a(o0VarE);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0VarB = d92.c.b(j92.f.f97933j, o0VarE);
                    zB = o0VarE.B(strE) | o0VarE.B(strD) | o0VarE.B(strD3) | o0VarE.B(strD5);
                    objQ = o0VarE.q();
                    if (zB) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = s0.a(s0VarA, am.j.o("\n", strD5, e5.l(strE, "\n", strD, "\n", strD3)), x0VarB, 0L, 1020);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = s0.a(s0VarA, am.j.o("\n", strD5, e5.l(strE, "\n", strD, "\n", strD3)), x0VarB, 0L, 1020);
                        o0VarE.K(objQ);
                    }
                    q0Var = (q0) objQ;
                    if (z19) {
                        i28 = 0;
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1819861934, R.string.calories_abbreviation, o0VarE, false);
                    } else {
                        i28 = 0;
                        o0VarE.C(1819949044);
                        o0VarE.g0(false);
                        strJ = strQ;
                    }
                    z3.e eVarC5 = z3.f.c(337944090, new n(num, uVar, i28), o0VarE);
                    if (z14) {
                        o0VarE.C(1820489870);
                        r14 = 0;
                        aVar2 = new z01.a(w02.b0.x(o0VarE, (int) (q0Var.f157282c >> 32)), strE, x0VarB, null);
                        o0VarE.g0(false);
                    } else {
                        r14 = 0;
                        o0VarE.C(1820699709);
                        o0VarE.g0(false);
                        aVar2 = null;
                    }
                    b92.a.C0235a c0235a5 = new b92.a.C0235a(r14, 1, r14);
                    LinkedHashMap linkedHashMap5 = c0235a5.f16962a;
                    linkedHashMap5.put("title", strQ);
                    linkedHashMap5.put("label_metadata", strU2);
                    linkedHashMap5.put("value", strE2);
                    b92.a aVarB2 = c0235a5.b();
                    int i310 = b92.a.f16960b;
                    z01.b.b(null, strJ, str5, eVarC5, aVar2, aVarB2, o0VarE, 3072);
                    if (z19) {
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1821135631, R.string.protein_abbreviation, o0VarE, false);
                    } else {
                        o0VarE.C(1821221749);
                        o0VarE.g0(false);
                        strJ2 = strQ2;
                    }
                    z3.e eVarC6 = z3.f.c(-307636669, new o(d14, uVar, 0), o0VarE);
                    if (z14) {
                        o0VarE.C(1821757615);
                        r15 = 0;
                        aVar3 = new z01.a(w02.b0.x(o0VarE, (int) (q0Var.f157282c >> 32)), strD, x0VarB, null);
                        o0VarE.g0(false);
                    } else {
                        r15 = 0;
                        o0VarE.C(1821966493);
                        o0VarE.g0(false);
                        aVar3 = null;
                    }
                    b92.a.C0235a c0235a6 = new b92.a.C0235a(r15, 1, r15);
                    LinkedHashMap linkedHashMap6 = c0235a6.f16962a;
                    linkedHashMap6.put("title", strQ2);
                    linkedHashMap6.put("label_metadata", str6);
                    linkedHashMap6.put("value", strD2);
                    z01.b.b(null, strJ2, strT, eVarC6, aVar3, c0235a6.b(), o0VarE, 3072);
                    if (z19) {
                        strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1822399315, R.string.fat_abbreviation, o0VarE, false);
                    } else {
                        o0VarE.C(1822481465);
                        o0VarE.g0(false);
                        strJ3 = strQ3;
                    }
                    z3.e eVarC7 = z3.f.c(-1951585438, new o(d15, uVar, 1), o0VarE);
                    if (z14) {
                        o0VarE.C(1822993523);
                        r16 = 0;
                        aVar4 = new z01.a(w02.b0.x(o0VarE, (int) (q0Var.f157282c >> 32)), strD3, x0VarB, null);
                        o0VarE.g0(false);
                    } else {
                        r16 = 0;
                        o0VarE.C(1823198557);
                        o0VarE.g0(false);
                        aVar4 = null;
                    }
                    b92.a.C0235a c0235a7 = new b92.a.C0235a(r16, 1, r16);
                    LinkedHashMap linkedHashMap7 = c0235a7.f16962a;
                    linkedHashMap7.put("title", strQ3);
                    linkedHashMap7.put("label_metadata", str7);
                    linkedHashMap7.put("value", strD4);
                    z01.b.b(null, strJ3, strT3, eVarC7, aVar4, c0235a7.b(), o0VarE, 3072);
                    if (z19) {
                        strJ4 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1823619537, R.string.carbs_abbreviation, o0VarE, false);
                    } else {
                        o0VarE.C(1823703671);
                        o0VarE.g0(false);
                        strJ4 = strQ4;
                    }
                    z3.e eVarC8 = z3.f.c(699433089, new o(d16, uVar, 2), o0VarE);
                    if (z14) {
                        o0VarE.C(1824227633);
                        r17 = 0;
                        aVar5 = new z01.a(w02.b0.x(o0VarE, (int) (q0Var.f157282c >> 32)), strD5, x0VarB, null);
                        o0VarE.g0(false);
                    } else {
                        r17 = 0;
                        o0VarE.C(1824434589);
                        o0VarE.g0(false);
                        aVar5 = null;
                    }
                    b92.a.C0235a c0235a8 = new b92.a.C0235a(r17, 1, r17);
                    LinkedHashMap linkedHashMap8 = c0235a8.f16962a;
                    linkedHashMap8.put("title", strQ4);
                    linkedHashMap8.put("label_metadata", strT6);
                    linkedHashMap8.put("value", strD6);
                    z01.b.b(null, strJ4, str8, eVarC8, aVar5, c0235a8.b(), o0VarE, 3072);
                    o0VarE.g0(true);
                    lVar3 = lVar7;
                    z18 = z19;
                } else {
                    o0VarE.e();
                    lVar3 = lVar2;
                    z18 = z16;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new ak0.r(rVar, lVar3, eVar, uVar, f0Var, z14, z18, i14, i15);
                }
            }
            i24 |= 1572864;
            z16 = z15;
            if ((599187 & i24) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i24 & 1, z17)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if ((i15 & 2) != 0) {
                        c2.j jVar2 = c2.j.f22691a;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        float f15 = j92.b.f97899b.f97917b;
                        jVar2.getClass();
                        lVarI = c2.j.i(f15);
                        i24 &= -113;
                    } else {
                        lVarI = lVar2;
                    }
                    c2.j.l lVar8 = lVarI;
                    i27 = i24;
                    lVar4 = lVar8;
                    if (i25 != 0) {
                        z19 = false;
                    } else {
                        z19 = z16;
                    }
                } else {
                    if ((i15 & 2) != 0) {
                        c2.j jVar3 = c2.j.f22691a;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        float f16 = j92.b.f97899b.f97917b;
                        jVar3.getClass();
                        lVarI = c2.j.i(f16);
                        i24 &= -113;
                    } else {
                        lVarI = lVar2;
                    }
                    c2.j.l lVar9 = lVarI;
                    i27 = i24;
                    lVar4 = lVar9;
                    if (i25 != 0) {
                        z19 = false;
                    } else {
                        z19 = z16;
                    }
                }
                o0VarE.h0();
                x1 x1Var3 = p3.n.f135158a;
                h4.d.f81522a.getClass();
                zVarA = y.a(lVar4, h4.d.a.f81536n, o0VarE, ((i27 & 126) >> 3) & 14);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
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
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var3 = b0.f22601a;
                strQ = gl1.y.Q(o0VarE, R.string.lbl_calories);
                num = f0Var.f75417a;
                Integer numValueOf3 = Integer.valueOf(i29);
                int i311 = v21.e.f175323i;
                strE = eVar.E(num, numValueOf3, false);
                strE2 = eVar.E(num, Integer.valueOf(i29), true);
                if (z14) {
                    strU = eVar.u(num, i29, false);
                } else {
                    strU = strE;
                }
                if (z14) {
                    strU2 = eVar.u(num, i29, true);
                } else {
                    strU2 = strE2;
                }
                strQ2 = gl1.y.Q(o0VarE, R.string.protein);
                d14 = f0Var.f75420d;
                c2.j.l lVar10 = lVar4;
                String str9 = strU;
                strD = eVar.D(d14, d19, true, (12 & 8) == 0);
                strD2 = eVar.D(d14, d19, true, (12 & 8) == 0);
                if (z14) {
                    strT = eVar.t(d14, d19, true, (12 & 8) == 0);
                } else {
                    strT = strD;
                }
                if (z14) {
                    strT2 = eVar.t(d14, d19, true, (12 & 8) == 0);
                } else {
                    strT2 = strD2;
                }
                strQ3 = gl1.y.Q(o0VarE, R.string.fat);
                d15 = f0Var.f75419c;
                String str10 = strT2;
                strD3 = eVar.D(d15, d18, true, (12 & 8) == 0);
                strD4 = eVar.D(d15, d18, true, (12 & 8) == 0);
                if (z14) {
                    strT3 = eVar.t(d15, d18, true, (12 & 8) == 0);
                } else {
                    strT3 = strD3;
                }
                if (z14) {
                    strT4 = eVar.t(d15, d18, true, (12 & 8) == 0);
                } else {
                    strT4 = strD4;
                }
                strQ4 = gl1.y.Q(o0VarE, R.string.carbs);
                d16 = f0Var.f75418b;
                String str11 = strT4;
                strD5 = eVar.D(d16, d17, true, (12 & 8) == 0);
                strD6 = eVar.D(d16, d17, true, (12 & 8) == 0);
                if (z14) {
                    strT5 = eVar.t(d16, d17, true, (12 & 8) == 0);
                } else {
                    strT5 = strD5;
                }
                String str12 = strT5;
                if (z14) {
                    strT6 = eVar.t(d16, d17, true, (12 & 8) == 0);
                } else {
                    strT6 = strD6;
                }
                s0VarA = t0.a(o0VarE);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarB = d92.c.b(j92.f.f97933j, o0VarE);
                zB = o0VarE.B(strE) | o0VarE.B(strD) | o0VarE.B(strD3) | o0VarE.B(strD5);
                objQ = o0VarE.q();
                if (zB) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = s0.a(s0VarA, am.j.o("\n", strD5, e5.l(strE, "\n", strD, "\n", strD3)), x0VarB, 0L, 1020);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = s0.a(s0VarA, am.j.o("\n", strD5, e5.l(strE, "\n", strD, "\n", strD3)), x0VarB, 0L, 1020);
                    o0VarE.K(objQ);
                }
                q0Var = (q0) objQ;
                if (z19) {
                    i28 = 0;
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1819861934, R.string.calories_abbreviation, o0VarE, false);
                } else {
                    i28 = 0;
                    o0VarE.C(1819949044);
                    o0VarE.g0(false);
                    strJ = strQ;
                }
                z3.e eVarC9 = z3.f.c(337944090, new n(num, uVar, i28), o0VarE);
                if (z14) {
                    o0VarE.C(1820489870);
                    r14 = 0;
                    aVar2 = new z01.a(w02.b0.x(o0VarE, (int) (q0Var.f157282c >> 32)), strE, x0VarB, null);
                    o0VarE.g0(false);
                } else {
                    r14 = 0;
                    o0VarE.C(1820699709);
                    o0VarE.g0(false);
                    aVar2 = null;
                }
                b92.a.C0235a c0235a9 = new b92.a.C0235a(r14, 1, r14);
                LinkedHashMap linkedHashMap9 = c0235a9.f16962a;
                linkedHashMap9.put("title", strQ);
                linkedHashMap9.put("label_metadata", strU2);
                linkedHashMap9.put("value", strE2);
                b92.a aVarB3 = c0235a9.b();
                int i312 = b92.a.f16960b;
                z01.b.b(null, strJ, str9, eVarC9, aVar2, aVarB3, o0VarE, 3072);
                if (z19) {
                    strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1821135631, R.string.protein_abbreviation, o0VarE, false);
                } else {
                    o0VarE.C(1821221749);
                    o0VarE.g0(false);
                    strJ2 = strQ2;
                }
                z3.e eVarC10 = z3.f.c(-307636669, new o(d14, uVar, 0), o0VarE);
                if (z14) {
                    o0VarE.C(1821757615);
                    r15 = 0;
                    aVar3 = new z01.a(w02.b0.x(o0VarE, (int) (q0Var.f157282c >> 32)), strD, x0VarB, null);
                    o0VarE.g0(false);
                } else {
                    r15 = 0;
                    o0VarE.C(1821966493);
                    o0VarE.g0(false);
                    aVar3 = null;
                }
                b92.a.C0235a c0235a10 = new b92.a.C0235a(r15, 1, r15);
                LinkedHashMap linkedHashMap10 = c0235a10.f16962a;
                linkedHashMap10.put("title", strQ2);
                linkedHashMap10.put("label_metadata", str10);
                linkedHashMap10.put("value", strD2);
                z01.b.b(null, strJ2, strT, eVarC10, aVar3, c0235a10.b(), o0VarE, 3072);
                if (z19) {
                    strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1822399315, R.string.fat_abbreviation, o0VarE, false);
                } else {
                    o0VarE.C(1822481465);
                    o0VarE.g0(false);
                    strJ3 = strQ3;
                }
                z3.e eVarC11 = z3.f.c(-1951585438, new o(d15, uVar, 1), o0VarE);
                if (z14) {
                    o0VarE.C(1822993523);
                    r16 = 0;
                    aVar4 = new z01.a(w02.b0.x(o0VarE, (int) (q0Var.f157282c >> 32)), strD3, x0VarB, null);
                    o0VarE.g0(false);
                } else {
                    r16 = 0;
                    o0VarE.C(1823198557);
                    o0VarE.g0(false);
                    aVar4 = null;
                }
                b92.a.C0235a c0235a11 = new b92.a.C0235a(r16, 1, r16);
                LinkedHashMap linkedHashMap11 = c0235a11.f16962a;
                linkedHashMap11.put("title", strQ3);
                linkedHashMap11.put("label_metadata", str11);
                linkedHashMap11.put("value", strD4);
                z01.b.b(null, strJ3, strT3, eVarC11, aVar4, c0235a11.b(), o0VarE, 3072);
                if (z19) {
                    strJ4 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1823619537, R.string.carbs_abbreviation, o0VarE, false);
                } else {
                    o0VarE.C(1823703671);
                    o0VarE.g0(false);
                    strJ4 = strQ4;
                }
                z3.e eVarC12 = z3.f.c(699433089, new o(d16, uVar, 2), o0VarE);
                if (z14) {
                    o0VarE.C(1824227633);
                    r17 = 0;
                    aVar5 = new z01.a(w02.b0.x(o0VarE, (int) (q0Var.f157282c >> 32)), strD5, x0VarB, null);
                    o0VarE.g0(false);
                } else {
                    r17 = 0;
                    o0VarE.C(1824434589);
                    o0VarE.g0(false);
                    aVar5 = null;
                }
                b92.a.C0235a c0235a12 = new b92.a.C0235a(r17, 1, r17);
                LinkedHashMap linkedHashMap12 = c0235a12.f16962a;
                linkedHashMap12.put("title", strQ4);
                linkedHashMap12.put("label_metadata", strT6);
                linkedHashMap12.put("value", strD6);
                z01.b.b(null, strJ4, str12, eVarC12, aVar5, c0235a12.b(), o0VarE, 3072);
                o0VarE.g0(true);
                lVar3 = lVar10;
                z18 = z19;
            } else {
                o0VarE.e();
                lVar3 = lVar2;
                z18 = z16;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new ak0.r(rVar, lVar3, eVar, uVar, f0Var, z14, z18, i14, i15);
            }
        }
        lVar2 = lVar;
        int i313 = i16 | i30;
        if (o0VarE.r(eVar)) {
            i17 = 256;
        } else {
            i17 = 128;
        }
        int i314 = i313 | i17;
        if (o0VarE.B(uVar)) {
            i18 = 2048;
        } else {
            i18 = 1024;
        }
        int i315 = i314 | i18;
        if (o0VarE.B(f0Var)) {
            i19 = 16384;
        } else {
            i19 = 8192;
        }
        i24 = i315 | i19;
        i25 = i15 & 64;
        if (i25 != 0) {
            if ((i14 & 1572864) == 0) {
                z16 = z15;
                if (o0VarE.h(z16)) {
                    i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i26 = 524288;
                }
                i24 |= i26;
            }
            if ((599187 & i24) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i24 & 1, z17)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if ((i15 & 2) != 0) {
                        c2.j jVar4 = c2.j.f22691a;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        float f17 = j92.b.f97899b.f97917b;
                        jVar4.getClass();
                        lVarI = c2.j.i(f17);
                        i24 &= -113;
                    } else {
                        lVarI = lVar2;
                    }
                    c2.j.l lVar11 = lVarI;
                    i27 = i24;
                    lVar4 = lVar11;
                    if (i25 != 0) {
                        z19 = false;
                    } else {
                        z19 = z16;
                    }
                } else {
                    if ((i15 & 2) != 0) {
                        c2.j jVar5 = c2.j.f22691a;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        float f18 = j92.b.f97899b.f97917b;
                        jVar5.getClass();
                        lVarI = c2.j.i(f18);
                        i24 &= -113;
                    } else {
                        lVarI = lVar2;
                    }
                    c2.j.l lVar12 = lVarI;
                    i27 = i24;
                    lVar4 = lVar12;
                    if (i25 != 0) {
                        z19 = false;
                    } else {
                        z19 = z16;
                    }
                }
                o0VarE.h0();
                x1 x1Var4 = p3.n.f135158a;
                h4.d.f81522a.getClass();
                zVarA = y.a(lVar4, h4.d.a.f81536n, o0VarE, ((i27 & 126) >> 3) & 14);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
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
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var4 = b0.f22601a;
                strQ = gl1.y.Q(o0VarE, R.string.lbl_calories);
                num = f0Var.f75417a;
                Integer numValueOf4 = Integer.valueOf(i29);
                int i316 = v21.e.f175323i;
                strE = eVar.E(num, numValueOf4, false);
                strE2 = eVar.E(num, Integer.valueOf(i29), true);
                if (z14) {
                    strU = eVar.u(num, i29, false);
                } else {
                    strU = strE;
                }
                if (z14) {
                    strU2 = eVar.u(num, i29, true);
                } else {
                    strU2 = strE2;
                }
                strQ2 = gl1.y.Q(o0VarE, R.string.protein);
                d14 = f0Var.f75420d;
                c2.j.l lVar13 = lVar4;
                String str13 = strU;
                strD = eVar.D(d14, d19, true, (12 & 8) == 0);
                strD2 = eVar.D(d14, d19, true, (12 & 8) == 0);
                if (z14) {
                    strT = eVar.t(d14, d19, true, (12 & 8) == 0);
                } else {
                    strT = strD;
                }
                if (z14) {
                    strT2 = eVar.t(d14, d19, true, (12 & 8) == 0);
                } else {
                    strT2 = strD2;
                }
                strQ3 = gl1.y.Q(o0VarE, R.string.fat);
                d15 = f0Var.f75419c;
                String str14 = strT2;
                strD3 = eVar.D(d15, d18, true, (12 & 8) == 0);
                strD4 = eVar.D(d15, d18, true, (12 & 8) == 0);
                if (z14) {
                    strT3 = eVar.t(d15, d18, true, (12 & 8) == 0);
                } else {
                    strT3 = strD3;
                }
                if (z14) {
                    strT4 = eVar.t(d15, d18, true, (12 & 8) == 0);
                } else {
                    strT4 = strD4;
                }
                strQ4 = gl1.y.Q(o0VarE, R.string.carbs);
                d16 = f0Var.f75418b;
                String str15 = strT4;
                strD5 = eVar.D(d16, d17, true, (12 & 8) == 0);
                strD6 = eVar.D(d16, d17, true, (12 & 8) == 0);
                if (z14) {
                    strT5 = eVar.t(d16, d17, true, (12 & 8) == 0);
                } else {
                    strT5 = strD5;
                }
                String str16 = strT5;
                if (z14) {
                    strT6 = eVar.t(d16, d17, true, (12 & 8) == 0);
                } else {
                    strT6 = strD6;
                }
                s0VarA = t0.a(o0VarE);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarB = d92.c.b(j92.f.f97933j, o0VarE);
                zB = o0VarE.B(strE) | o0VarE.B(strD) | o0VarE.B(strD3) | o0VarE.B(strD5);
                objQ = o0VarE.q();
                if (zB) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = s0.a(s0VarA, am.j.o("\n", strD5, e5.l(strE, "\n", strD, "\n", strD3)), x0VarB, 0L, 1020);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = s0.a(s0VarA, am.j.o("\n", strD5, e5.l(strE, "\n", strD, "\n", strD3)), x0VarB, 0L, 1020);
                    o0VarE.K(objQ);
                }
                q0Var = (q0) objQ;
                if (z19) {
                    i28 = 0;
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1819861934, R.string.calories_abbreviation, o0VarE, false);
                } else {
                    i28 = 0;
                    o0VarE.C(1819949044);
                    o0VarE.g0(false);
                    strJ = strQ;
                }
                z3.e eVarC13 = z3.f.c(337944090, new n(num, uVar, i28), o0VarE);
                if (z14) {
                    o0VarE.C(1820489870);
                    r14 = 0;
                    aVar2 = new z01.a(w02.b0.x(o0VarE, (int) (q0Var.f157282c >> 32)), strE, x0VarB, null);
                    o0VarE.g0(false);
                } else {
                    r14 = 0;
                    o0VarE.C(1820699709);
                    o0VarE.g0(false);
                    aVar2 = null;
                }
                b92.a.C0235a c0235a13 = new b92.a.C0235a(r14, 1, r14);
                LinkedHashMap linkedHashMap13 = c0235a13.f16962a;
                linkedHashMap13.put("title", strQ);
                linkedHashMap13.put("label_metadata", strU2);
                linkedHashMap13.put("value", strE2);
                b92.a aVarB4 = c0235a13.b();
                int i317 = b92.a.f16960b;
                z01.b.b(null, strJ, str13, eVarC13, aVar2, aVarB4, o0VarE, 3072);
                if (z19) {
                    strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1821135631, R.string.protein_abbreviation, o0VarE, false);
                } else {
                    o0VarE.C(1821221749);
                    o0VarE.g0(false);
                    strJ2 = strQ2;
                }
                z3.e eVarC14 = z3.f.c(-307636669, new o(d14, uVar, 0), o0VarE);
                if (z14) {
                    o0VarE.C(1821757615);
                    r15 = 0;
                    aVar3 = new z01.a(w02.b0.x(o0VarE, (int) (q0Var.f157282c >> 32)), strD, x0VarB, null);
                    o0VarE.g0(false);
                } else {
                    r15 = 0;
                    o0VarE.C(1821966493);
                    o0VarE.g0(false);
                    aVar3 = null;
                }
                b92.a.C0235a c0235a14 = new b92.a.C0235a(r15, 1, r15);
                LinkedHashMap linkedHashMap14 = c0235a14.f16962a;
                linkedHashMap14.put("title", strQ2);
                linkedHashMap14.put("label_metadata", str14);
                linkedHashMap14.put("value", strD2);
                z01.b.b(null, strJ2, strT, eVarC14, aVar3, c0235a14.b(), o0VarE, 3072);
                if (z19) {
                    strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1822399315, R.string.fat_abbreviation, o0VarE, false);
                } else {
                    o0VarE.C(1822481465);
                    o0VarE.g0(false);
                    strJ3 = strQ3;
                }
                z3.e eVarC15 = z3.f.c(-1951585438, new o(d15, uVar, 1), o0VarE);
                if (z14) {
                    o0VarE.C(1822993523);
                    r16 = 0;
                    aVar4 = new z01.a(w02.b0.x(o0VarE, (int) (q0Var.f157282c >> 32)), strD3, x0VarB, null);
                    o0VarE.g0(false);
                } else {
                    r16 = 0;
                    o0VarE.C(1823198557);
                    o0VarE.g0(false);
                    aVar4 = null;
                }
                b92.a.C0235a c0235a15 = new b92.a.C0235a(r16, 1, r16);
                LinkedHashMap linkedHashMap15 = c0235a15.f16962a;
                linkedHashMap15.put("title", strQ3);
                linkedHashMap15.put("label_metadata", str15);
                linkedHashMap15.put("value", strD4);
                z01.b.b(null, strJ3, strT3, eVarC15, aVar4, c0235a15.b(), o0VarE, 3072);
                if (z19) {
                    strJ4 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1823619537, R.string.carbs_abbreviation, o0VarE, false);
                } else {
                    o0VarE.C(1823703671);
                    o0VarE.g0(false);
                    strJ4 = strQ4;
                }
                z3.e eVarC16 = z3.f.c(699433089, new o(d16, uVar, 2), o0VarE);
                if (z14) {
                    o0VarE.C(1824227633);
                    r17 = 0;
                    aVar5 = new z01.a(w02.b0.x(o0VarE, (int) (q0Var.f157282c >> 32)), strD5, x0VarB, null);
                    o0VarE.g0(false);
                } else {
                    r17 = 0;
                    o0VarE.C(1824434589);
                    o0VarE.g0(false);
                    aVar5 = null;
                }
                b92.a.C0235a c0235a16 = new b92.a.C0235a(r17, 1, r17);
                LinkedHashMap linkedHashMap16 = c0235a16.f16962a;
                linkedHashMap16.put("title", strQ4);
                linkedHashMap16.put("label_metadata", strT6);
                linkedHashMap16.put("value", strD6);
                z01.b.b(null, strJ4, str16, eVarC16, aVar5, c0235a16.b(), o0VarE, 3072);
                o0VarE.g0(true);
                lVar3 = lVar13;
                z18 = z19;
            } else {
                o0VarE.e();
                lVar3 = lVar2;
                z18 = z16;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new ak0.r(rVar, lVar3, eVar, uVar, f0Var, z14, z18, i14, i15);
            }
        }
        i24 |= 1572864;
        z16 = z15;
        if ((599187 & i24) != 599186) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (o0VarE.n(i24 & 1, z17)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if ((i15 & 2) != 0) {
                    c2.j jVar6 = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f19 = j92.b.f97899b.f97917b;
                    jVar6.getClass();
                    lVarI = c2.j.i(f19);
                    i24 &= -113;
                } else {
                    lVarI = lVar2;
                }
                c2.j.l lVar14 = lVarI;
                i27 = i24;
                lVar4 = lVar14;
                if (i25 != 0) {
                    z19 = false;
                } else {
                    z19 = z16;
                }
            } else {
                if ((i15 & 2) != 0) {
                    c2.j jVar7 = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f110 = j92.b.f97899b.f97917b;
                    jVar7.getClass();
                    lVarI = c2.j.i(f110);
                    i24 &= -113;
                } else {
                    lVarI = lVar2;
                }
                c2.j.l lVar15 = lVarI;
                i27 = i24;
                lVar4 = lVar15;
                if (i25 != 0) {
                    z19 = false;
                } else {
                    z19 = z16;
                }
            }
            o0VarE.h0();
            x1 x1Var5 = p3.n.f135158a;
            h4.d.f81522a.getClass();
            zVarA = y.a(lVar4, h4.d.a.f81536n, o0VarE, ((i27 & 126) >> 3) & 14);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
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
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var5 = b0.f22601a;
            strQ = gl1.y.Q(o0VarE, R.string.lbl_calories);
            num = f0Var.f75417a;
            Integer numValueOf5 = Integer.valueOf(i29);
            int i318 = v21.e.f175323i;
            strE = eVar.E(num, numValueOf5, false);
            strE2 = eVar.E(num, Integer.valueOf(i29), true);
            if (z14) {
                strU = eVar.u(num, i29, false);
            } else {
                strU = strE;
            }
            if (z14) {
                strU2 = eVar.u(num, i29, true);
            } else {
                strU2 = strE2;
            }
            strQ2 = gl1.y.Q(o0VarE, R.string.protein);
            d14 = f0Var.f75420d;
            c2.j.l lVar16 = lVar4;
            String str17 = strU;
            strD = eVar.D(d14, d19, true, (12 & 8) == 0);
            strD2 = eVar.D(d14, d19, true, (12 & 8) == 0);
            if (z14) {
                strT = eVar.t(d14, d19, true, (12 & 8) == 0);
            } else {
                strT = strD;
            }
            if (z14) {
                strT2 = eVar.t(d14, d19, true, (12 & 8) == 0);
            } else {
                strT2 = strD2;
            }
            strQ3 = gl1.y.Q(o0VarE, R.string.fat);
            d15 = f0Var.f75419c;
            String str18 = strT2;
            strD3 = eVar.D(d15, d18, true, (12 & 8) == 0);
            strD4 = eVar.D(d15, d18, true, (12 & 8) == 0);
            if (z14) {
                strT3 = eVar.t(d15, d18, true, (12 & 8) == 0);
            } else {
                strT3 = strD3;
            }
            if (z14) {
                strT4 = eVar.t(d15, d18, true, (12 & 8) == 0);
            } else {
                strT4 = strD4;
            }
            strQ4 = gl1.y.Q(o0VarE, R.string.carbs);
            d16 = f0Var.f75418b;
            String str19 = strT4;
            strD5 = eVar.D(d16, d17, true, (12 & 8) == 0);
            strD6 = eVar.D(d16, d17, true, (12 & 8) == 0);
            if (z14) {
                strT5 = eVar.t(d16, d17, true, (12 & 8) == 0);
            } else {
                strT5 = strD5;
            }
            String str110 = strT5;
            if (z14) {
                strT6 = eVar.t(d16, d17, true, (12 & 8) == 0);
            } else {
                strT6 = strD6;
            }
            s0VarA = t0.a(o0VarE);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0VarB = d92.c.b(j92.f.f97933j, o0VarE);
            zB = o0VarE.B(strE) | o0VarE.B(strD) | o0VarE.B(strD3) | o0VarE.B(strD5);
            objQ = o0VarE.q();
            if (zB) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = s0.a(s0VarA, am.j.o("\n", strD5, e5.l(strE, "\n", strD, "\n", strD3)), x0VarB, 0L, 1020);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = s0.a(s0VarA, am.j.o("\n", strD5, e5.l(strE, "\n", strD, "\n", strD3)), x0VarB, 0L, 1020);
                o0VarE.K(objQ);
            }
            q0Var = (q0) objQ;
            if (z19) {
                i28 = 0;
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1819861934, R.string.calories_abbreviation, o0VarE, false);
            } else {
                i28 = 0;
                o0VarE.C(1819949044);
                o0VarE.g0(false);
                strJ = strQ;
            }
            z3.e eVarC17 = z3.f.c(337944090, new n(num, uVar, i28), o0VarE);
            if (z14) {
                o0VarE.C(1820489870);
                r14 = 0;
                aVar2 = new z01.a(w02.b0.x(o0VarE, (int) (q0Var.f157282c >> 32)), strE, x0VarB, null);
                o0VarE.g0(false);
            } else {
                r14 = 0;
                o0VarE.C(1820699709);
                o0VarE.g0(false);
                aVar2 = null;
            }
            b92.a.C0235a c0235a17 = new b92.a.C0235a(r14, 1, r14);
            LinkedHashMap linkedHashMap17 = c0235a17.f16962a;
            linkedHashMap17.put("title", strQ);
            linkedHashMap17.put("label_metadata", strU2);
            linkedHashMap17.put("value", strE2);
            b92.a aVarB5 = c0235a17.b();
            int i319 = b92.a.f16960b;
            z01.b.b(null, strJ, str17, eVarC17, aVar2, aVarB5, o0VarE, 3072);
            if (z19) {
                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1821135631, R.string.protein_abbreviation, o0VarE, false);
            } else {
                o0VarE.C(1821221749);
                o0VarE.g0(false);
                strJ2 = strQ2;
            }
            z3.e eVarC18 = z3.f.c(-307636669, new o(d14, uVar, 0), o0VarE);
            if (z14) {
                o0VarE.C(1821757615);
                r15 = 0;
                aVar3 = new z01.a(w02.b0.x(o0VarE, (int) (q0Var.f157282c >> 32)), strD, x0VarB, null);
                o0VarE.g0(false);
            } else {
                r15 = 0;
                o0VarE.C(1821966493);
                o0VarE.g0(false);
                aVar3 = null;
            }
            b92.a.C0235a c0235a18 = new b92.a.C0235a(r15, 1, r15);
            LinkedHashMap linkedHashMap18 = c0235a18.f16962a;
            linkedHashMap18.put("title", strQ2);
            linkedHashMap18.put("label_metadata", str18);
            linkedHashMap18.put("value", strD2);
            z01.b.b(null, strJ2, strT, eVarC18, aVar3, c0235a18.b(), o0VarE, 3072);
            if (z19) {
                strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1822399315, R.string.fat_abbreviation, o0VarE, false);
            } else {
                o0VarE.C(1822481465);
                o0VarE.g0(false);
                strJ3 = strQ3;
            }
            z3.e eVarC19 = z3.f.c(-1951585438, new o(d15, uVar, 1), o0VarE);
            if (z14) {
                o0VarE.C(1822993523);
                r16 = 0;
                aVar4 = new z01.a(w02.b0.x(o0VarE, (int) (q0Var.f157282c >> 32)), strD3, x0VarB, null);
                o0VarE.g0(false);
            } else {
                r16 = 0;
                o0VarE.C(1823198557);
                o0VarE.g0(false);
                aVar4 = null;
            }
            b92.a.C0235a c0235a19 = new b92.a.C0235a(r16, 1, r16);
            LinkedHashMap linkedHashMap19 = c0235a19.f16962a;
            linkedHashMap19.put("title", strQ3);
            linkedHashMap19.put("label_metadata", str19);
            linkedHashMap19.put("value", strD4);
            z01.b.b(null, strJ3, strT3, eVarC19, aVar4, c0235a19.b(), o0VarE, 3072);
            if (z19) {
                strJ4 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1823619537, R.string.carbs_abbreviation, o0VarE, false);
            } else {
                o0VarE.C(1823703671);
                o0VarE.g0(false);
                strJ4 = strQ4;
            }
            z3.e eVarC110 = z3.f.c(699433089, new o(d16, uVar, 2), o0VarE);
            if (z14) {
                o0VarE.C(1824227633);
                r17 = 0;
                aVar5 = new z01.a(w02.b0.x(o0VarE, (int) (q0Var.f157282c >> 32)), strD5, x0VarB, null);
                o0VarE.g0(false);
            } else {
                r17 = 0;
                o0VarE.C(1824434589);
                o0VarE.g0(false);
                aVar5 = null;
            }
            b92.a.C0235a c0235a110 = new b92.a.C0235a(r17, 1, r17);
            LinkedHashMap linkedHashMap110 = c0235a110.f16962a;
            linkedHashMap110.put("title", strQ4);
            linkedHashMap110.put("label_metadata", strT6);
            linkedHashMap110.put("value", strD6);
            z01.b.b(null, strJ4, str110, eVarC110, aVar5, c0235a110.b(), o0VarE, 3072);
            o0VarE.g0(true);
            lVar3 = lVar16;
            z18 = z19;
        } else {
            o0VarE.e();
            lVar3 = lVar2;
            z18 = z16;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ak0.r(rVar, lVar3, eVar, uVar, f0Var, z14, z18, i14, i15);
        }
    }
}
