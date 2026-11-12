package e11;

import b82.g1;
import b82.k1;
import c2.n0;
import c2.n3;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.common.base.Ascii;
import f5.z0;
import i3.e5;
import i3.fe;
import i3.i7;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.t1;
import l72.c1;
import l72.r1;
import o4.m1;
import org.slf4j.Marker;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import u1.m0;
import v62.j5;

/* JADX INFO: loaded from: classes9.dex */
public final class x {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final d11.i iVar, final v21.e eVar, final fe feVar, e23.a aVar, e23.a aVar2, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.p pVar, e23.l lVar4, e23.a aVar3, e23.a aVar4, e23.l lVar5, e23.l lVar6, e23.l lVar7, e23.a aVar5, e23.a aVar6, e23.a aVar7, e23.a aVar8, e23.a aVar9, p3.m mVar, final int i14, final int i15) {
        e23.a aVar10;
        int i16;
        e23.a aVar11;
        int i17;
        e23.l lVar8;
        int i18;
        e23.l lVar9;
        int i19;
        e23.l lVar10;
        int i24;
        int i25;
        int i26;
        int i27;
        char c14;
        int i28;
        int i29;
        int i30;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        o0 o0Var;
        final e23.p pVar2;
        final e23.l lVar11;
        final e23.l lVar12;
        final e23.a aVar12;
        final e23.a aVar13;
        final e23.a aVar14;
        final e23.a aVar15;
        final e23.a aVar16;
        final e23.a aVar17;
        final e23.l lVar13;
        final e23.a aVar18;
        final e23.l lVar14;
        final e23.l lVar15;
        final e23.a aVar19;
        final e23.a aVar20;
        final e23.l lVar16;
        final e23.l lVar17;
        e23.a aVar21;
        e23.a aVar22;
        e23.l lVar18;
        e23.l lVar19;
        e23.p pVar3;
        e23.l lVar20;
        e23.a aVar23;
        e23.a aVar24;
        e23.l lVar21;
        e23.l lVar22;
        e23.l lVar23;
        e23.a aVar25;
        e23.a aVar26;
        e23.a aVar27;
        e23.a aVar28;
        iVar.getClass();
        d11.e eVar2 = iVar.f57084f;
        eVar.getClass();
        feVar.getClass();
        o0 o0VarE = mVar.E(-1766731900);
        int i44 = (o0VarE.r(iVar) ? 4 : 2) | i14 | (o0VarE.r(eVar) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i44 |= o0VarE.B(feVar) ? 256 : 128;
        }
        int i45 = i15 & 8;
        if (i45 != 0) {
            i16 = i44 | 3072;
            aVar10 = aVar;
        } else {
            aVar10 = aVar;
            i16 = i44 | (o0VarE.r(aVar10) ? 2048 : 1024);
        }
        int i46 = i15 & 16;
        if (i46 != 0) {
            i17 = i16 | 24576;
            aVar11 = aVar2;
        } else {
            aVar11 = aVar2;
            i17 = i16 | (o0VarE.r(aVar11) ? 16384 : 8192);
        }
        int i47 = i15 & 32;
        if (i47 != 0) {
            i18 = i17 | 196608;
            lVar8 = lVar;
        } else {
            lVar8 = lVar;
            i18 = i17 | (o0VarE.r(lVar8) ? 131072 : 65536);
        }
        int i48 = i15 & 64;
        if (i48 != 0) {
            i19 = i18 | 1572864;
            lVar9 = lVar2;
        } else {
            lVar9 = lVar2;
            i19 = i18 | (o0VarE.r(lVar9) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        int i49 = i15 & 128;
        char c15 = Ascii.MIN;
        if (i49 != 0) {
            i24 = i19 | 12582912;
            lVar10 = lVar3;
        } else {
            lVar10 = lVar3;
            i24 = i19 | (o0VarE.r(lVar10) ? 8388608 : 4194304);
        }
        int i54 = i15 & 256;
        char c16 = Ascii.MIN;
        if (i54 != 0) {
            i25 = i24 | 100663296;
        } else {
            i25 = i24 | (o0VarE.r(pVar) ? 67108864 : 33554432);
        }
        int i55 = i15 & 512;
        char c17 = Ascii.MIN;
        if (i55 != 0) {
            i26 = i25 | C.ENCODING_PCM_32BIT;
        } else {
            i26 = i25 | (o0VarE.r(lVar4) ? 536870912 : 268435456);
        }
        int i56 = i15 & 1024;
        if (i56 != 0) {
            c14 = 6;
            i27 = i56;
        } else {
            i27 = i56;
            c14 = o0VarE.r(aVar3) ? (char) 4 : (char) 2;
        }
        int i57 = i15 & 2048;
        if (i57 != 0) {
            i28 = c14 | '0';
        } else {
            i28 = c14 | (o0VarE.r(aVar4) ? ' ' : (char) 16);
        }
        int i58 = i28;
        int i59 = i26;
        int i64 = i15 & 4096;
        if (i64 != 0) {
            i29 = i58 | 384;
        } else {
            i29 = i58 | (o0VarE.r(lVar5) ? 256 : 128);
        }
        int i65 = i15 & 8192;
        if (i65 != 0) {
            i30 = i29 | 3072;
        } else {
            i30 = i29 | (o0VarE.r(lVar6) ? 2048 : 1024);
        }
        int i66 = i15 & 16384;
        if (i66 != 0) {
            i34 = i30 | 24576;
        } else {
            i34 = i30 | (o0VarE.r(lVar7) ? (char) 16384 : (char) 8192);
        }
        int i67 = i15 & 32768;
        if (i67 != 0) {
            i35 = i34 | 196608;
        } else {
            i35 = i34 | (o0VarE.r(aVar5) ? 131072 : 65536);
        }
        int i68 = i15 & 65536;
        if (i68 != 0) {
            i36 = i35 | 1572864;
        } else {
            i36 = i35 | (o0VarE.r(aVar6) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        int i69 = i15 & 131072;
        if (i69 != 0) {
            i37 = i36 | 12582912;
        } else {
            if (o0VarE.r(aVar7)) {
                c15 = Ascii.MIN;
            }
            i37 = i36 | c15;
        }
        int i74 = i15 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
        if (i74 != 0) {
            i38 = i37 | 100663296;
        } else {
            if (o0VarE.r(aVar8)) {
                c16 = Ascii.MIN;
            }
            i38 = i37 | c16;
        }
        int i75 = i15 & 524288;
        if (i75 != 0) {
            i39 = i38 | C.ENCODING_PCM_32BIT;
        } else {
            if (o0VarE.r(aVar9)) {
                c17 = Ascii.MIN;
            }
            i39 = i38 | c17;
        }
        int i76 = 0;
        if (o0VarE.n(i59 & 1, ((i59 & 306783379) == 306783378 && (i39 & 306783379) == 306783378) ? false : true)) {
            p3.m.a aVar29 = p3.m.f135153a;
            if (i45 != 0) {
                Object objQ = o0VarE.q();
                aVar29.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new dh0.j(18);
                    o0VarE.K(objQ);
                }
                aVar21 = (e23.a) objQ;
            } else {
                aVar21 = aVar10;
            }
            if (i46 != 0) {
                Object objQ2 = o0VarE.q();
                aVar29.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new dh0.j(24);
                    o0VarE.K(objQ2);
                }
                aVar22 = (e23.a) objQ2;
            } else {
                aVar22 = aVar11;
            }
            if (i47 != 0) {
                Object objQ3 = o0VarE.q();
                aVar29.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new dv0.n(11);
                    o0VarE.K(objQ3);
                }
                lVar18 = (e23.l) objQ3;
            } else {
                lVar18 = lVar8;
            }
            if (i48 != 0) {
                Object objQ4 = o0VarE.q();
                aVar29.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new dv0.n(12);
                    o0VarE.K(objQ4);
                }
                lVar19 = (e23.l) objQ4;
            } else {
                lVar19 = lVar9;
            }
            if (i49 != 0) {
                Object objQ5 = o0VarE.q();
                aVar29.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new dv0.n(13);
                    o0VarE.K(objQ5);
                }
                lVar10 = (e23.l) objQ5;
            }
            if (i54 != 0) {
                Object objQ6 = o0VarE.q();
                aVar29.getClass();
                if (objQ6 == p3.m.a.f135155b) {
                    objQ6 = new w(i76);
                    o0VarE.K(objQ6);
                }
                pVar3 = (e23.p) objQ6;
            } else {
                pVar3 = pVar;
            }
            if (i55 != 0) {
                Object objQ7 = o0VarE.q();
                aVar29.getClass();
                if (objQ7 == p3.m.a.f135155b) {
                    objQ7 = new dv0.n(14);
                    o0VarE.K(objQ7);
                }
                lVar20 = (e23.l) objQ7;
            } else {
                lVar20 = lVar4;
            }
            if (i27 != 0) {
                Object objQ8 = o0VarE.q();
                aVar29.getClass();
                if (objQ8 == p3.m.a.f135155b) {
                    objQ8 = new dh0.j(25);
                    o0VarE.K(objQ8);
                }
                aVar23 = (e23.a) objQ8;
            } else {
                aVar23 = aVar3;
            }
            if (i57 != 0) {
                Object objQ9 = o0VarE.q();
                aVar29.getClass();
                if (objQ9 == p3.m.a.f135155b) {
                    objQ9 = new dh0.j(26);
                    o0VarE.K(objQ9);
                }
                aVar24 = (e23.a) objQ9;
            } else {
                aVar24 = aVar4;
            }
            if (i64 != 0) {
                Object objQ10 = o0VarE.q();
                aVar29.getClass();
                if (objQ10 == p3.m.a.f135155b) {
                    objQ10 = new dv0.n(15);
                    o0VarE.K(objQ10);
                }
                lVar21 = (e23.l) objQ10;
            } else {
                lVar21 = lVar5;
            }
            if (i65 != 0) {
                Object objQ11 = o0VarE.q();
                aVar29.getClass();
                if (objQ11 == p3.m.a.f135155b) {
                    objQ11 = new dv0.n(9);
                    o0VarE.K(objQ11);
                }
                lVar22 = (e23.l) objQ11;
            } else {
                lVar22 = lVar6;
            }
            if (i66 != 0) {
                Object objQ12 = o0VarE.q();
                aVar29.getClass();
                if (objQ12 == p3.m.a.f135155b) {
                    objQ12 = new dv0.n(10);
                    o0VarE.K(objQ12);
                }
                lVar23 = (e23.l) objQ12;
            } else {
                lVar23 = lVar7;
            }
            if (i67 != 0) {
                Object objQ13 = o0VarE.q();
                aVar29.getClass();
                if (objQ13 == p3.m.a.f135155b) {
                    objQ13 = new dh0.j(19);
                    o0VarE.K(objQ13);
                }
                aVar25 = (e23.a) objQ13;
            } else {
                aVar25 = aVar5;
            }
            if (i68 != 0) {
                Object objQ14 = o0VarE.q();
                aVar29.getClass();
                if (objQ14 == p3.m.a.f135155b) {
                    objQ14 = new dh0.j(20);
                    o0VarE.K(objQ14);
                }
                aVar13 = (e23.a) objQ14;
            } else {
                aVar13 = aVar6;
            }
            if (i69 != 0) {
                Object objQ15 = o0VarE.q();
                aVar29.getClass();
                if (objQ15 == p3.m.a.f135155b) {
                    objQ15 = new dh0.j(21);
                    o0VarE.K(objQ15);
                }
                aVar26 = (e23.a) objQ15;
            } else {
                aVar26 = aVar7;
            }
            if (i74 != 0) {
                Object objQ16 = o0VarE.q();
                aVar29.getClass();
                if (objQ16 == p3.m.a.f135155b) {
                    objQ16 = new dh0.j(22);
                    o0VarE.K(objQ16);
                }
                aVar27 = (e23.a) objQ16;
            } else {
                aVar27 = aVar8;
            }
            if (i75 != 0) {
                Object objQ17 = o0VarE.q();
                aVar29.getClass();
                if (objQ17 == p3.m.a.f135155b) {
                    objQ17 = new dh0.j(23);
                    o0VarE.K(objQ17);
                }
                aVar28 = (e23.a) objQ17;
            } else {
                aVar28 = aVar9;
            }
            x1 x1Var = p3.n.f135158a;
            m4.q qVar = (m4.q) o0VarE.A(t1.f91491i);
            Object objQ18 = o0VarE.q();
            aVar29.getClass();
            e23.l lVar24 = lVar10;
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ18 == c2565a) {
                objQ18 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ18);
            }
            p1 p1Var = (p1) objQ18;
            e23.l lVar25 = lVar18;
            boolean z14 = iVar.f57087i;
            z3.e eVarC = z3.f.c(-1883032183, new d50.i(iVar, qVar, aVar21, p1Var), o0VarE);
            z3.e eVarC2 = z3.f.c(-819843574, new ak0.o(feVar, 4), o0VarE);
            n0 n0Var = n3.f22788a;
            e23.l lVar26 = lVar19;
            e23.l lVar27 = lVar20;
            e23.p pVar4 = pVar3;
            e23.a aVar30 = aVar23;
            e23.a aVar31 = aVar24;
            e23.l lVar28 = lVar21;
            e23.l lVar29 = lVar22;
            e23.l lVar30 = lVar23;
            e23.a aVar32 = aVar25;
            e23.a aVar33 = aVar21;
            z02.d.a(z14, eVarC, eVarC2, null, new n0(0, 0, 0, 0), z3.f.c(-1925245043, new t(iVar, eVar, lVar25, lVar26, pVar3, lVar27, aVar23, aVar24, lVar21, lVar22, lVar23, aVar25, lVar24), o0VarE), o0VarE, 197040, 8);
            o0Var = o0VarE;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0Var.C(2119910459);
                c1 c1Var = c1.f110940a;
                String strQ = gl1.y.Q(o0Var, R.string.message_common_confirm_leaving_screen);
                String strQ2 = gl1.y.Q(o0Var, R.string.lbl_yes);
                String strQ3 = gl1.y.Q(o0Var, R.string.common_cancel);
                boolean z15 = (i59 & 57344) == 16384;
                Object objQ19 = o0Var.q();
                if (z15 || objQ19 == c2565a) {
                    objQ19 = new a11.a0(aVar22, p1Var, 10);
                    o0Var.K(objQ19);
                }
                e23.a<Unit> aVar34 = (e23.a) objQ19;
                Object objQ20 = o0Var.q();
                if (objQ20 == c2565a) {
                    objQ20 = new dv0.f(p1Var, 15);
                    o0Var.K(objQ20);
                }
                c1Var.a(false, strQ, null, null, null, strQ2, false, false, aVar34, strQ3, (e23.a) objQ20, o0Var, 0, 6, 221);
                o0Var.g0(false);
            } else {
                o0Var.C(2120319070);
                o0Var.g0(false);
            }
            if (eVar2.f57065f) {
                o0Var.C(2120365601);
                c1 c1Var2 = c1.f110940a;
                String strQ4 = gl1.y.Q(o0Var, R.string.pregnancy_something_went_wrong);
                String strQ5 = gl1.y.Q(o0Var, R.string.connect_iq_try_again);
                String strQ6 = gl1.y.Q(o0Var, R.string.lbl_ok);
                boolean z16 = (i39 & 3670016) == 1048576;
                Object objQ21 = o0Var.q();
                if (z16 || objQ21 == c2565a) {
                    objQ21 = new cw1.p0(aVar13, 24);
                    o0Var.K(objQ21);
                }
                c1Var2.a(true, strQ4, strQ5, null, null, strQ6, false, false, (e23.a) objQ21, null, null, o0Var, 6, 0, 1752);
                o0Var.g0(false);
            } else {
                o0Var.C(2120700990);
                o0Var.g0(false);
            }
            if (eVar2.f57064e) {
                o0Var.C(2120762060);
                c1 c1Var3 = c1.f110940a;
                x0.f23314a.getClass();
                String strW = gl1.d.W(x0.f23329ae);
                String strW2 = gl1.d.W(x0.We);
                String strQ7 = gl1.y.Q(o0Var, R.string.lbl_ok);
                boolean z17 = (i39 & 29360128) == 8388608;
                Object objQ22 = o0Var.q();
                if (z17 || objQ22 == c2565a) {
                    objQ22 = new cw1.p0(aVar26, 25);
                    o0Var.K(objQ22);
                }
                c1Var3.a(false, strW, strW2, null, null, strQ7, false, false, (e23.a) objQ22, null, null, o0Var, 6, 0, 1752);
                o0Var.g0(false);
            } else {
                o0Var.C(2121148382);
                o0Var.g0(false);
            }
            if (eVar2.f57066g) {
                o0Var.C(2121196835);
                c1 c1Var4 = c1.f110940a;
                String strQ8 = gl1.y.Q(o0Var, R.string.pregnancy_something_went_wrong);
                String strQ9 = gl1.y.Q(o0Var, R.string.connect_iq_try_again);
                String strQ10 = gl1.y.Q(o0Var, R.string.lbl_ok);
                int i77 = i39 & 234881024;
                boolean z18 = i77 == 67108864;
                Object objQ23 = o0Var.q();
                if (z18 || objQ23 == c2565a) {
                    objQ23 = new cw1.p0(aVar27, 26);
                    o0Var.K(objQ23);
                }
                e23.a<Unit> aVar35 = (e23.a) objQ23;
                boolean z19 = i77 == 67108864;
                Object objQ24 = o0Var.q();
                if (z19 || objQ24 == c2565a) {
                    objQ24 = new cw1.p0(aVar27, 27);
                    o0Var.K(objQ24);
                }
                c1Var4.a(true, strQ8, strQ9, null, null, strQ10, false, false, aVar35, null, (e23.a) objQ24, o0Var, 6, 0, 728);
                o0Var.g0(false);
            } else {
                o0Var.C(2121591806);
                o0Var.g0(false);
            }
            if (eVar2.f57063d) {
                o0Var.C(2121658239);
                c1 c1Var5 = c1.f110940a;
                x0.f23314a.getClass();
                String strW3 = gl1.d.W(x0.f23347be);
                String strV = gl1.d.V(x0.f23730yf, new Object[]{50});
                String strQ11 = gl1.y.Q(o0Var, R.string.lbl_ok);
                boolean z24 = (i39 & 1879048192) == 536870912;
                Object objQ25 = o0Var.q();
                if (z24 || objQ25 == c2565a) {
                    objQ25 = new cw1.p0(aVar28, 28);
                    o0Var.K(objQ25);
                }
                c1Var5.a(true, strW3, strV, null, null, strQ11, false, false, (e23.a) objQ25, null, null, o0Var, 6, 0, 1752);
                o0Var.g0(false);
            } else {
                o0Var.C(2122057054);
                o0Var.g0(false);
            }
            aVar14 = aVar26;
            aVar15 = aVar27;
            aVar16 = aVar28;
            aVar18 = aVar22;
            lVar14 = lVar25;
            lVar13 = lVar24;
            pVar2 = pVar4;
            lVar11 = lVar27;
            aVar19 = aVar30;
            aVar20 = aVar31;
            lVar16 = lVar28;
            lVar12 = lVar29;
            lVar17 = lVar30;
            aVar12 = aVar32;
            aVar17 = aVar33;
            lVar15 = lVar26;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            pVar2 = pVar;
            lVar11 = lVar4;
            lVar12 = lVar6;
            aVar12 = aVar5;
            aVar13 = aVar6;
            aVar14 = aVar7;
            aVar15 = aVar8;
            aVar16 = aVar9;
            aVar17 = aVar10;
            lVar13 = lVar10;
            aVar18 = aVar11;
            lVar14 = lVar8;
            lVar15 = lVar9;
            aVar19 = aVar3;
            aVar20 = aVar4;
            lVar16 = lVar5;
            lVar17 = lVar7;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: e11.v
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(i14 | 1);
                    x.a(iVar, eVar, feVar, aVar17, aVar18, lVar14, lVar15, lVar13, pVar2, lVar11, aVar19, aVar20, lVar16, lVar12, lVar17, aVar12, aVar13, aVar14, aVar15, aVar16, (p3.m) obj, iT, i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(v21.e eVar, String str, String str2, boolean z14, e23.l lVar, e23.l lVar2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1978245060);
        int i15 = i14 | (o0VarE.r(eVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(lVar2) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            r1.b(gl1.y.Q(o0VarE, R.string.food_info), z3.f.c(-46192119, new u(str, z14, lVar, str2, lVar2, eVar), o0VarE), o0VarE, 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(eVar, str, str2, z14, lVar, lVar2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x016c  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:72:0x01af  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x0226  */
    /* JADX WARN: Code duplicated, block: B:82:0x0228  */
    /* JADX WARN: Code duplicated, block: B:85:0x022f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0238  */
    /* JADX WARN: Code duplicated, block: B:89:0x0267  */
    /* JADX WARN: Code duplicated, block: B:91:0x026b  */
    public static final void c(h4.r rVar, v21.e eVar, b11.v vVar, boolean z14, boolean z15, e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        o0 o0Var;
        h4.r rVar2;
        h4.r.a aVar3;
        h5.g.a.f fVar;
        h4.r.a aVar4;
        int i15;
        o0 o0Var2;
        boolean z16;
        j92.b bVar;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        boolean z17;
        Object objQ;
        o0 o0VarE = mVar.E(-1638117736);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | 6;
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= (i14 & 512) == 0 ? o0VarE.B(vVar) : o0VarE.r(vVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.h(z15) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i16 |= o0VarE.r(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i16 |= o0VarE.r(aVar2) ? 1048576 : 524288;
        }
        int i17 = i16;
        if (o0VarE.n(i17 & 1, (i17 & 599187) != 599186)) {
            h4.r.a aVar5 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("label_secondary", eVar.a(Double.valueOf(vVar.G0()), vVar.D0(o0VarE), vVar.getTotalCalories(), vVar.z3(), vVar.g4(), vVar.b4(), true));
            b92.a aVarB = c0235a.b();
            h4.r rVarF = x2.f(aVar5, 1.0f);
            long jC = am.j.c(d92.b.f58623a, o0VarE);
            m1.a aVar6 = m1.f128891a;
            h4.r rVarC2 = wz1.i.c(u1.n.e(rVarF, jC, aVar6), o0VarE);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar7 = h5.g.a.f81805b;
            if (cVar == null) {
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
            b4.c(eVar2, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T) {
                aVar3 = aVar5;
            } else {
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                aVar3 = aVar5;
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                u2 u2Var = u2.f22900a;
                if (z15) {
                    o0VarE.C(698788380);
                    bVar = d92.b.f58625c;
                    bVar.getClass();
                    h4.r rVarC4 = c2.l.C(aVar3, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14);
                    aVar4 = aVar3;
                    i15 = 3670016;
                    z0VarD = c2.q.d(h4.d.a.f81528f, false);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarC4, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar7);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar2, z0VarD, o0VarE);
                    b4.c(c1623g, i2VarA0, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                    }
                    b4.c(fVar, rVarC, o0VarE);
                    c2.u uVar = c2.u.f22885a;
                    bVar.getClass();
                    j92.c cVar2 = j92.b.f97901d;
                    c2.q.a(u1.n.e(l4.k.b(x2.q(aVar4, cVar2.f97904c), k2.i.f102406a), d92.b.a(o0VarE).f().f63508c, aVar6), o0VarE, 0);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = j5.a(t62.b.f162798a);
                    long jF = d92.b.a(o0VarE).f().f();
                    String strQ = gl1.y.Q(o0VarE, R.string.remove_food);
                    bVar.getClass();
                    h4.r rVarQ = x2.q(aVar4, cVar2.f97905d);
                    if ((i17 & 3670016) == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objQ = o0VarE.q();
                    if (z17) {
                        objQ = new cw1.p0(aVar2, 23);
                        o0VarE.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new cw1.p0(aVar2, 23);
                            o0VarE.K(objQ);
                        }
                    }
                    i7.b(dVarA, strQ, u1.w.d(rVarQ, false, null, null, (e23.a) objQ, 15), jF, o0VarE, 0, 0);
                    o0Var2 = o0VarE;
                    z16 = true;
                    o0Var2.g0(true);
                    o0Var2.g0(false);
                } else {
                    aVar4 = aVar3;
                    i15 = 3670016;
                    o0Var2 = o0VarE;
                    z16 = true;
                    o0Var2.C(699566790);
                    o0Var2.g0(false);
                }
                String strO = eVar.o(vVar.getF14238e().f14254b, vVar.getF14238e().f14256d);
                String strA = eVar.a(Double.valueOf(vVar.G0()), vVar.D0(o0Var2), vVar.getTotalCalories(), vVar.z3(), vVar.g4(), vVar.b4(), false);
                String imageUrl = vVar.getImageUrl();
                int i18 = b92.a.f16960b;
                int i19 = i17 << 3;
                o0 o0Var3 = o0Var2;
                j21.q.a(strO, strA, aVarB, imageUrl, z14, true, aVar, aVar2, 0.0f, o0Var3, 196608 | (57344 & i19) | (i19 & i15) | (i19 & 29360128), 256);
                o0Var = o0Var3;
                o0Var.g0(z16);
                rVar2 = aVar4;
            }
            aVar3 = aVar5;
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            aVar3 = aVar5;
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            u2 u2Var2 = u2.f22900a;
            if (z15) {
                o0VarE.C(698788380);
                bVar = d92.b.f58625c;
                bVar.getClass();
                h4.r rVarC5 = c2.l.C(aVar3, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14);
                aVar4 = aVar3;
                i15 = 3670016;
                z0VarD = c2.q.d(h4.d.a.f81528f, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarC5, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar7);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(fVar, rVarC, o0VarE);
                c2.u uVar2 = c2.u.f22885a;
                bVar.getClass();
                j92.c cVar3 = j92.b.f97901d;
                c2.q.a(u1.n.e(l4.k.b(x2.q(aVar4, cVar3.f97904c), k2.i.f102406a), d92.b.a(o0VarE).f().f63508c, aVar6), o0VarE, 0);
                s62.a.f157643a.getClass();
                u4.d dVarA2 = j5.a(t62.b.f162798a);
                long jF2 = d92.b.a(o0VarE).f().f();
                String strQ2 = gl1.y.Q(o0VarE, R.string.remove_food);
                bVar.getClass();
                h4.r rVarQ2 = x2.q(aVar4, cVar3.f97905d);
                if ((i17 & 3670016) == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objQ = o0VarE.q();
                if (z17) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new cw1.p0(aVar2, 23);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new cw1.p0(aVar2, 23);
                    o0VarE.K(objQ);
                }
                i7.b(dVarA2, strQ2, u1.w.d(rVarQ2, false, null, null, (e23.a) objQ, 15), jF2, o0VarE, 0, 0);
                o0Var2 = o0VarE;
                z16 = true;
                o0Var2.g0(true);
                o0Var2.g0(false);
            } else {
                aVar4 = aVar3;
                i15 = 3670016;
                o0Var2 = o0VarE;
                z16 = true;
                o0Var2.C(699566790);
                o0Var2.g0(false);
            }
            String strO2 = eVar.o(vVar.getF14238e().f14254b, vVar.getF14238e().f14256d);
            String strA2 = eVar.a(Double.valueOf(vVar.G0()), vVar.D0(o0Var2), vVar.getTotalCalories(), vVar.z3(), vVar.g4(), vVar.b4(), false);
            String imageUrl2 = vVar.getImageUrl();
            int i110 = b92.a.f16960b;
            int i111 = i17 << 3;
            o0 o0Var4 = o0Var2;
            j21.q.a(strO2, strA2, aVarB, imageUrl2, z14, true, aVar, aVar2, 0.0f, o0Var4, 196608 | (57344 & i111) | (i111 & i15) | (i111 & 29360128), 256);
            o0Var = o0Var4;
            o0Var.g0(z16);
            rVar2 = aVar4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c82.c(rVar2, eVar, vVar, z14, z15, aVar, aVar2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x012e  */
    /* JADX WARN: Code duplicated, block: B:71:0x015a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void d(h4.r rVar, i53.c cVar, v21.e eVar, boolean z14, boolean z15, final e23.l lVar, final e23.l lVar2, e23.a aVar, p3.m mVar, int i14) {
        h4.r rVar2;
        final int i15;
        o0 o0VarE = mVar.E(7805919);
        boolean z16 = z14;
        int i16 = 131072;
        int i17 = i14 | 6 | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.r(eVar) ? 256 : 128) | (o0VarE.h(z16) ? 2048 : 1024) | (o0VarE.h(z15) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536) | (o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar) ? 8388608 : 4194304);
        if (o0VarE.n(i17 & 1, (i17 & 4793491) != 4793490)) {
            h4.r.a aVar2 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            h4.r rVarC = wz1.i.c(x2.f(aVar2, 1.0f), o0VarE);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            o0VarE.C(96078360);
            Iterator<E> it = cVar.iterator();
            while (it.hasNext()) {
                final d11.f fVar = (d11.f) it.next();
                b11.v vVar = fVar.f57067a;
                boolean z17 = fVar.f57068b;
                boolean zR = ((i17 & 458752) == i16) | o0VarE.r(fVar);
                Object objQ = o0VarE.q();
                p3.m.a aVar4 = p3.m.f135153a;
                if (zR) {
                    final int i18 = 0;
                    objQ = new e23.a() { // from class: e11.q
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i18) {
                                case 0:
                                    lVar.invoke(fVar);
                                    break;
                                default:
                                    lVar.invoke(fVar);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                } else {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        final int i19 = 0;
                        objQ = new e23.a() { // from class: e11.q
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i19) {
                                    case 0:
                                        lVar.invoke(fVar);
                                        break;
                                    default:
                                        lVar.invoke(fVar);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ);
                    }
                }
                e23.a aVar5 = (e23.a) objQ;
                boolean zR2 = ((i17 & 3670016) == 1048576) | o0VarE.r(fVar);
                Object objQ2 = o0VarE.q();
                if (zR2) {
                    i15 = 1;
                    objQ2 = new e23.a() { // from class: e11.q
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    lVar2.invoke(fVar);
                                    break;
                                default:
                                    lVar2.invoke(fVar);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ2);
                } else {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        i15 = 1;
                        objQ2 = new e23.a() { // from class: e11.q
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        lVar2.invoke(fVar);
                                        break;
                                    default:
                                        lVar2.invoke(fVar);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ2);
                    } else {
                        i15 = 1;
                    }
                }
                c(null, eVar, vVar, z17, z16, aVar5, (e23.a) objQ2, o0VarE, ((i17 >> 3) & 112) | ((i17 << 3) & 57344));
                z16 = z14;
                aVar2 = aVar2;
                i16 = 131072;
            }
            h4.r.a aVar6 = aVar2;
            o0VarE.g0(false);
            l72.p2.f111205a.g(tn.k.g(gl1.y.Q(o0VarE, R.string.lbl_add), Marker.ANY_MARKER), wz1.i.c(h4.r.S, o0VarE), null, null, z3.f.c(-1512122498, new an1.i(z15, 16), o0VarE), false, false, aVar, o0VarE, (234881024 & (i17 << 3)) | 24576, 236);
            r1.c0.c(b0Var, z15, null, null, null, null, z3.f.c(-962588079, new p(eVar, 1), o0VarE), o0VarE, 1572870 | ((i17 >> 9) & 112), 30);
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
            rVar2 = aVar6;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(rVar2, cVar, eVar, z14, z15, lVar, lVar2, aVar, i14);
        }
    }

    public static final void e(final v21.e eVar, final i53.c cVar, final boolean z14, final boolean z15, e23.a aVar, final e23.a aVar2, final e23.l lVar, final e23.l lVar2, p3.m mVar, int i14) {
        int i15;
        int i16;
        o0 o0VarE = mVar.E(-104817965);
        int i17 = i14 | (o0VarE.r(eVar) ? 4 : 2) | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.h(z15) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536) | (o0VarE.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar2) ? 8388608 : 4194304);
        if (o0VarE.n(i17 & 1, (4793491 & i17) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            if (z14) {
                i15 = -190381730;
                i16 = R.string.lbl_done;
            } else {
                i15 = -190327170;
                i16 = R.string.lbl_edit;
            }
            String strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, false);
            x0.f23314a.getClass();
            String strW = gl1.d.W(x0.f23364ce);
            if (cVar.isEmpty()) {
                o0VarE.C(-189658500);
                final int i18 = 0;
                r1.b(strW, z3.f.c(-589604300, new e23.p() { // from class: e11.k
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i18) {
                            case 0:
                                p3.m mVar2 = (p3.m) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    x.d(null, cVar, eVar, z14, z15, lVar, lVar2, aVar2, mVar2, 0);
                                } else {
                                    mVar2.e();
                                }
                                break;
                            default:
                                p3.m mVar3 = (p3.m) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    x1 x1Var3 = p3.n.f135158a;
                                    x.d(null, cVar, eVar, z14, z15, lVar, lVar2, aVar2, mVar3, 0);
                                } else {
                                    mVar3.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, 48, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-190168016);
                final int i19 = 1;
                r1.c(strW, strJ, aVar, false, null, z3.f.c(809988889, new e23.p() { // from class: e11.k
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i19) {
                            case 0:
                                p3.m mVar2 = (p3.m) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    x.d(null, cVar, eVar, z14, z15, lVar, lVar2, aVar2, mVar2, 0);
                                } else {
                                    mVar2.e();
                                }
                                break;
                            default:
                                p3.m mVar3 = (p3.m) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    x1 x1Var3 = p3.n.f135158a;
                                    x.d(null, cVar, eVar, z14, z15, lVar, lVar2, aVar2, mVar3, 0);
                                } else {
                                    mVar3.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, ((i17 >> 6) & 896) | 196608, 24);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(eVar, cVar, z14, z15, aVar, aVar2, lVar, lVar2, i14);
        }
    }

    public static final void f(String str, e23.l lVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1205493095);
        int i15 = 2;
        int i16 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            x0.f23314a.getClass();
            r1.b(gl1.d.W(x0.f23646te), z3.f.c(569291444, new aa2.b(str, lVar), o0VarE), o0VarE, 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.b(str, lVar, i14, i15);
        }
    }

    public static final void g(h4.r rVar, v21.e eVar, g21.f0 f0Var, g21.f0 f0Var2, i53.c cVar, i53.c cVar2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-2130132522);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.r(eVar) ? 32 : 16) | (o0VarE.B(f0Var) ? 256 : 128) | (o0VarE.B(f0Var2) ? 2048 : 1024) | (o0VarE.B(cVar) ? 16384 : 8192) | (o0VarE.B(cVar2) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            x0.f23314a.getClass();
            i53.f fVarA = i53.a.a(new g1(gl1.d.W(x0.Me), null, null, null, 14, null), new g1(gl1.y.Q(o0VarE, R.string.lbl_total), null, null, null, 14, null));
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = e5.o(0, o0VarE);
            }
            n1 n1Var = (n1) objQ;
            int intValue = n1Var.getIntValue();
            h4.r rVarA = m0.a(rVar, true, null);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new dv0.n(4);
                o0VarE.K(objQ2);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ2, rVarA, false);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC2 = wz1.i.c(c2.l.A(rVarC, j92.b.f97899b.f97920e, 0.0f, 2), o0VarE);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new a11.h0(n1Var, 6);
                o0VarE.K(objQ3);
            }
            k1.a(fVarA, intValue, rVarC2, null, 0.0f, (e23.l) objQ3, o0VarE, 199680, 16);
            Integer numValueOf = Integer.valueOf(n1Var.getIntValue());
            h4.d.f81522a.getClass();
            r1.b.a(numValueOf, null, null, h4.d.a.f81525c, "GoalsChartSection", null, z3.f.c(-1745311840, new a42.c0(f0Var, f0Var2, cVar, cVar2, eVar, 15), o0VarE), o0VarE, 1600512, 38);
            o0VarE = o0VarE;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.c(rVar, eVar, f0Var, f0Var2, cVar, cVar2, i14, 18);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    public static final void h(v21.e eVar, Double d14, a11.r rVar, g01.c cVar, i53.c cVar2, boolean z14, e23.p pVar, e23.l lVar, p3.m mVar, int i14) {
        Object obj;
        o0 o0Var;
        boolean z15;
        boolean z16;
        int i15;
        o0 o0VarE = mVar.E(-1718624679);
        int i16 = i14 | (o0VarE.r(eVar) ? 4 : 2) | (o0VarE.B(d14) ? 32 : 16) | (o0VarE.k(rVar.ordinal()) ? 256 : 128) | (o0VarE.k(cVar.ordinal()) ? 2048 : 1024) | (o0VarE.B(cVar2) ? 16384 : 8192) | (o0VarE.h(z14) ? 131072 : 65536) | (o0VarE.r(pVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar) ? 8388608 : 4194304);
        int i17 = 0;
        if (o0VarE.n(i16 & 1, (4793491 & i16) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            r1.b(gl1.y.Q(o0VarE, R.string.servings), z3.f.c(195417502, new ck0.h(cVar, d14, z14, eVar, p1Var2, p1Var, 5), o0VarE), o0VarE, 48, 0);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(759835273);
                String strQ = gl1.y.Q(o0VarE, R.string.number_of_servings);
                double dDoubleValue = d14 != null ? d14.doubleValue() : 1.0d;
                a11.i iVar = new a11.i(1, 100, v21.d.f175321y);
                a11.j0 j0Var = new a11.j0(6, 3);
                boolean z17 = (3670016 & i16) == 1048576;
                Object objQ3 = o0VarE.q();
                if (z17 || objQ3 == c2565a) {
                    objQ3 = new m(pVar, p1Var2, i17);
                    o0VarE.K(objQ3);
                }
                e23.p pVar2 = (e23.p) objQ3;
                Object objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = new dv0.f(p1Var2, 10);
                    o0VarE.K(objQ4);
                }
                double d15 = dDoubleValue;
                z15 = false;
                z16 = true;
                i15 = 8388608;
                a11.q.a(strQ, d15, rVar, iVar, j0Var, pVar2, (e23.a) objQ4, o0VarE, (i16 & 896) | 1572864, 0);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                z15 = false;
                z16 = true;
                i15 = 8388608;
                o0Var.C(760634825);
                o0Var.g0(false);
            }
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0Var.C(760683867);
                obj = cVar;
                int iIndexOf = cVar2.indexOf(obj);
                Integer numValueOf = Integer.valueOf(iIndexOf);
                if (iIndexOf < 0) {
                    numValueOf = null;
                }
                ?? IntValue = numValueOf != null ? numValueOf.intValue() : z15;
                String strQ2 = gl1.y.Q(o0Var, R.string.unit);
                o0Var.C(1964206487);
                ArrayList arrayList = new ArrayList(p13.y.r(cVar2, 10));
                Iterator it = cVar2.iterator();
                while (it.hasNext()) {
                    g01.c cVar3 = (g01.c) it.next();
                    g01.c.INSTANCE.getClass();
                    arrayList.add(g01.c.Companion.c(cVar3, o0Var));
                }
                o0Var.g0(z15);
                i53.f fVarJ = i53.a.j(arrayList);
                boolean z18 = (i16 & 29360128) == i15 ? z16 : z15;
                Object objQ5 = o0Var.q();
                if (z18 || objQ5 == p3.m.a.f135155b) {
                    objQ5 = new a11.b0(lVar, p1Var, 10);
                    o0Var.K(objQ5);
                }
                e23.l lVar2 = (e23.l) objQ5;
                Object objQ6 = o0Var.q();
                if (objQ6 == p3.m.a.f135155b) {
                    objQ6 = new dv0.f(p1Var, 11);
                    o0Var.K(objQ6);
                }
                a11.i0.a(strQ2, fVarJ, IntValue, null, null, lVar2, (e23.a) objQ6, o0Var, 1572864);
                o0Var.g0(z15);
            } else {
                obj = cVar;
                o0Var.C(761220105);
                o0Var.g0(z15);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            obj = cVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(eVar, d14, rVar, obj, cVar2, z14, pVar, lVar, i14, 0);
        }
    }
}
