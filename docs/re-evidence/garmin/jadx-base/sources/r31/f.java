package r31;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.m0;
import c22.g2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import d53.w;
import d81.z;
import gl1.y;
import i3.fe;
import l72.r1;
import o4.e0;
import o53.b0;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import q42.v;
import w2.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:50:0x00ab  */
    public static final void a(boolean z14, j jVar, e23.p<? super k31.c, ? super d31.c, Unit> pVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        Object obj;
        o0 o0Var;
        jVar.getClass();
        pVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(1377530243);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = i15 | (o0VarE.B(jVar) ? 32 : 16);
        if ((i14 & 384) == 0) {
            obj = pVar;
            i16 |= o0VarE.r(obj) ? 256 : 128;
        } else {
            obj = pVar;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zR = o0VarE.r(context) | ((i16 & 112) == 32);
            Object objQ = o0VarE.q();
            int i17 = 27;
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ = new ph1.d(i17, context, jVar);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ph1.d(i17, context, jVar);
                    o0VarE.K(objQ);
                }
            }
            p1 p1VarQ = p0.q((e23.l) objQ, o0VarE);
            Object objQ2 = o0VarE.q();
            aVar3.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar = (fe) objQ2;
            if (z14) {
                o0VarE.C(-408333545);
                d(aVar2, o0VarE, (i16 >> 12) & 14);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-408264353);
                o0VarE.g0(false);
            }
            boolean zB = o0VarE.B(jVar.f150031d) | o0VarE.B(jVar.f150032e) | o0VarE.B(jVar.f150033f);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                objQ3 = p0.f(new q42.d(jVar, i17));
                o0VarE.K(objQ3);
            }
            o0Var = o0VarE;
            z02.d.a(jVar.f150034g, z3.f.c(-1654413090, new p40.r(aVar, 19), o0VarE), z3.f.c(-2088376771, new p21.b(feVar, 10), o0VarE), null, null, z3.f.c(904699482, new ob0.e(jVar, feVar, obj, (x3) objQ3, p1VarQ, 16), o0VarE), o0Var, 197040, 24);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.l(z14, jVar, pVar, aVar, aVar2, i14, 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0137  */
    public static final void b(k31.c cVar, d31.c cVar2, long j8, u4.d dVar, e23.l<? super d31.d, Unit> lVar, p3.m mVar, int i14, int i15) {
        u4.d dVar2;
        int i16;
        o0 o0Var;
        u4.d dVar3;
        String string;
        z3.e eVarC;
        o0 o0VarE = mVar.E(-278950420);
        int i17 = i14 | (o0VarE.k(cVar.ordinal()) ? 4 : 2);
        if ((i14 & 48) == 0) {
            i17 |= o0VarE.k(cVar2.ordinal()) ? 32 : 16;
        }
        int i18 = i17 | (o0VarE.l(j8) ? 256 : 128);
        int i19 = i15 & 8;
        if (i19 != 0) {
            i16 = i18 | 3072;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i16 = i18 | (o0VarE.B(dVar2) ? 2048 : 1024);
        }
        int i24 = i16 | (o0VarE.r(lVar) ? 16384 : 8192);
        if (o0VarE.n(i24 & 1, (i24 & 9363) != 9362)) {
            u4.d dVar4 = i19 != 0 ? null : dVar2;
            x1 x1Var = p3.n.f135158a;
            l72.p2 p2Var = l72.p2.f111205a;
            l22.a aVarS = a0.s(o0VarE);
            int i25 = cVar.f102650f;
            String str = cVar.f102656l;
            String string2 = "";
            if (str != null) {
                string = dh.b.A(aVarS.f109162a, g2.b(str));
                if (w.J(string)) {
                    string = null;
                }
                if (string == null) {
                    try {
                        string = aVarS.getString(i25);
                    } catch (Exception unused) {
                    }
                }
            } else {
                string = i25 != 0 ? aVarS.getString(i25) : "";
            }
            l22.a aVarS2 = a0.s(o0VarE);
            int i26 = cVar.f102651g;
            String str2 = cVar.f102657m;
            if (str2 != null) {
                String strA = dh.b.A(aVarS2.f109162a, g2.b(str2));
                if (w.J(strA)) {
                    strA = null;
                }
                if (strA == null) {
                    try {
                        string2 = aVarS2.getString(i26);
                    } catch (Exception unused2) {
                    }
                } else {
                    string2 = strA;
                }
            } else if (i26 != 0) {
                string2 = aVarS2.getString(i26);
            }
            if (dVar4 == null) {
                o0VarE.C(550478151);
                o0VarE.g0(false);
                eVarC = null;
            } else {
                o0VarE.C(550478152);
                eVarC = z3.f.c(1283508207, new b82.k(dVar4, 12), o0VarE);
                o0VarE.g0(false);
            }
            z3.e eVarC2 = z3.f.c(-789669858, new z(cVar, j8, 8), o0VarE);
            boolean z14 = ((i24 & 14) == 4) | ((i24 & 112) == 32) | ((i24 & 57344) == 16384);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new v(cVar, 7, cVar2, lVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new v(cVar, 7, cVar2, lVar);
                    o0VarE.K(objQ);
                }
            }
            l72.p2 p2Var2 = l72.p2.f111205a;
            o0Var = o0VarE;
            p2Var.h(string, string2, null, null, null, false, false, eVarC2, eVarC, null, (e23.a) objQ, o0Var, 12582912, 0, 636);
            x1 x1Var2 = p3.n.f135158a;
            dVar3 = dVar4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            dVar3 = dVar2;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.a(cVar, cVar2, j8, dVar3, lVar, i14, i15);
        }
    }

    public static final void c(i53.c cVar, long j8, d31.c cVar2, fe feVar, e23.p pVar, e23.l lVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-481312562);
        int i15 = i14 | (o0VarE.k(R.string.onboarding_device_setup_recommended) ? 4 : 2) | (o0VarE.B(cVar) ? 32 : 16) | 384 | (o0VarE.l(j8) ? 2048 : 1024) | (o0VarE.r(pVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar) ? 8388608 : 4194304);
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            String strQ = y.Q(o0VarE, R.string.common_undo);
            if (cVar.isEmpty()) {
                o0VarE.C(2116524532);
                o0VarE.g0(false);
            } else {
                o0VarE.C(2113889470);
                r1.b(y.Q(o0VarE, R.string.onboarding_device_setup_recommended), z3.f.c(-207391932, new m0(cVar, b0Var, cVar2, j8, lVar, pVar, feVar, strQ), o0VarE), o0VarE, 48, 0);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r11.g(cVar, j8, cVar2, feVar, pVar, lVar, i14);
        }
    }

    public static final void d(e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1950403366);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = i15;
            g82.c cVar = g82.c.f76436a;
            e0.a aVar2 = e0.f128843b;
            d92.b.f58623a.getClass();
            g82.c.C1532c c1532c = new g82.c.C1532c(2131231745, null, null, null, e0.a.a(aVar2, d92.b.a(o0VarE).f().a()), 14, null);
            String strQ = y.Q(o0VarE, R.string.onboarding_you_are_all_set);
            String strQ2 = y.Q(o0VarE, R.string.onboarding_you_are_all_set_description);
            String strQ3 = y.Q(o0VarE, R.string.common_button_got_it);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new qy0.a(17);
                o0VarE.K(objQ);
            }
            cVar.c(c1532c, strQ, strQ2, 0, strQ3, aVar, null, null, false, (e23.a) objQ, o0VarE, 805306368 | ((i16 << 15) & 458752), 456);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.c(aVar, i14, 11);
        }
    }

    public static final void e(d31.d dVar, d31.c cVar) {
        String str = (cVar == d31.c.NOT_STARTED || cVar == d31.c.COMPLETED) ? "OnboardingFeatureSetupClicked" : "OnboardingFeatureIgnored";
        ht.s sVar = ht.s.f85508a;
        jt.a aVar = new jt.a(dVar.f57377a, str);
        sVar.getClass();
        ht.s.a(aVar);
        if (dVar == d31.d.GARMIN_COACH || dVar == d31.d.INTELLIGENT_TRAINING_PLAN) {
            ht.a.f85464a.getClass();
            ht.a.a(null, "GarminCoachDeviceLinkFromPromotional");
        }
    }
}
