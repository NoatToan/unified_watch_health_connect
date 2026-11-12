package ya0;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import c22.s1;
import ca0.o0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.e5;
import i3.zg;
import java.util.Arrays;
import java.util.Locale;
import l72.c1;
import org.apache.commons.lang3.StringUtils;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.x0;
import p3.l0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import v62.fa;

/* JADX INFO: loaded from: classes8.dex */
public final class p {
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x013a  */
    /* JADX WARN: Code duplicated, block: B:66:0x016c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(long j8, l90.b bVar, e23.a aVar, a aVar2, o0 o0Var, e23.l lVar, p3.m mVar, int i14) {
        a aVar3;
        a aVar4;
        int i15;
        bVar.getClass();
        aVar.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(1686475869);
        int i16 = i14 | (o0VarE.l(j8) ? 4 : 2) | (o0VarE.r(bVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | 1024 | (o0VarE.r(o0Var) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536);
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            o0VarE.G0();
            int i17 = i14 & 1;
            p3.m.a aVar5 = p3.m.f135153a;
            if (i17 == 0 || o0VarE.o0()) {
                boolean z14 = (i16 & 14) == 4;
                Object objQ = o0VarE.q();
                if (z14) {
                    objQ = new a90.b(j8, 19);
                    o0VarE.K(objQ);
                } else {
                    aVar5.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a90.b(j8, 19);
                        o0VarE.K(objQ);
                    }
                }
                e23.a aVar6 = (e23.a) objQ;
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(a.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar6);
                o0VarE.g0(false);
                aVar4 = (a) u1VarResolveViewModel;
                i15 = i16 & (-7169);
            } else {
                o0VarE.e();
                i15 = i16 & (-7169);
                aVar4 = aVar2;
            }
            int i18 = i15;
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            o0VarE.L(-1614864554);
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA2 == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(s0.f105811a.b(a.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
            o0VarE.g0(false);
            p1 p1VarC = s9.c.c(((a) u1VarResolveViewModel2).f195394c, o0VarE);
            int i19 = i18 & 14;
            boolean zB = o0VarE.B(p1VarC) | o0VarE.r(aVar4) | (i19 == 4);
            Object objQ2 = o0VarE.q();
            if (zB) {
                m mVar2 = new m(aVar4, j8, p1VarC, 1);
                o0VarE.K(mVar2);
                objQ2 = mVar2;
            } else {
                aVar5.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    m mVar3 = new m(aVar4, j8, p1VarC, 1);
                    o0VarE.K(mVar3);
                    objQ2 = mVar3;
                }
            }
            c.w.a(0, 1, (e23.a) objQ2, o0VarE, false);
            Boolean bool = (Boolean) p1VarC.getF182175a();
            boolean zB2 = o0VarE.B(p1VarC) | ((57344 & i18) == 16384);
            Object objQ3 = o0VarE.q();
            if (zB2) {
                objQ3 = new n(o0Var, p1VarC, null);
                o0VarE.K(objQ3);
            } else {
                aVar5.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new n(o0Var, p1VarC, null);
                    o0VarE.K(objQ3);
                }
            }
            l0.e((e23.p) objQ3, bool, o0VarE);
            Object objQ4 = o0VarE.q();
            aVar5.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ4 == c2565a) {
                objQ4 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ4);
            }
            p1 p1Var = (p1) objQ4;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strG = e5.g(Build.MANUFACTURER, StringUtils.SPACE, Build.MODEL);
            String str = bVar.f111521f;
            String str2 = bVar.f111531p.f58437c.f58421j;
            if (str2 == null) {
                x0 x0Var = x0.f105818a;
                Locale locale = Locale.getDefault();
                locale.getClass();
                str2 = String.format("https://support.garmin.com/%1$s/?faq=9CDD55lm3a4DcQaNL7yii9&productID=125677&tab=topics&sas_source=gcm", Arrays.copyOf(new Object[]{s1.b(locale)}, 1));
            }
            o90.a aVar7 = bVar.f111526k;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_features_not_available);
            String strP = gl1.y.P(R.string.msg_voice_assistant_not_supported, new Object[]{strG, str, str}, o0VarE);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_garmin_support_learn_more);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_exit_setup_capitalized);
            String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_continue_setup);
            boolean zR = o0VarE.r(context) | o0VarE.B(str2);
            Object objQ5 = o0VarE.q();
            if (zR || objQ5 == c2565a) {
                objQ5 = new ry0.a(context, str2, 3);
                o0VarE.K(objQ5);
            }
            e23.a aVar8 = (e23.a) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = new x91.d(p1Var, 25);
                o0VarE.K(objQ6);
            }
            int i24 = i18 >> 6;
            c("device_pairing_ctkd_dual_failure_screen", str, aVar7, strQ, false, null, strP, strQ2, aVar8, strQ4, aVar, strQ3, (e23.a) objQ6, lVar, o0VarE, 6, (i24 & 14) | 384 | (i24 & 7168), 48);
            o0VarE = o0VarE;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-722828685);
                c1 c1Var = c1.f110940a;
                String strP2 = gl1.y.P(R.string.msg_exit_setup_confirmation_question, new Object[]{str}, o0VarE);
                String strQ5 = gl1.y.Q(o0VarE, R.string.lbl_exit);
                boolean zR2 = o0VarE.r(aVar4) | (i19 == 4);
                Object objQ7 = o0VarE.q();
                if (zR2 || objQ7 == c2565a) {
                    d62.s sVar = new d62.s(aVar4, j8, p1Var, 11);
                    o0VarE.K(sVar);
                    objQ7 = sVar;
                }
                e23.a<Unit> aVar9 = (e23.a) objQ7;
                String strQ6 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
                Object objQ8 = o0VarE.q();
                if (objQ8 == c2565a) {
                    objQ8 = new x91.d(p1Var, 24);
                    o0VarE.K(objQ8);
                }
                c1Var.a(false, null, strP2, null, null, strQ5, false, false, aVar9, strQ6, (e23.a) objQ8, o0VarE, 0, 6, 219);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-722350107);
                o0VarE.g0(false);
            }
            aVar3 = aVar4;
        } else {
            o0VarE.e();
            aVar3 = aVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r11.g(j8, bVar, aVar, aVar3, o0Var, lVar, i14);
        }
    }

    public static final void b(l90.b bVar, e23.a<Unit> aVar, e23.l<? super Float, Unit> lVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        bVar.getClass();
        aVar.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(-1252985353);
        int i15 = i14 | (o0VarE.r(bVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            o0Var = o0VarE;
            c("device_pairing_failed_screen", bVar.f111521f, bVar.f111526k, gl1.y.Q(o0VarE, R.string.lbl_setup_failed), false, null, bVar.f111531p.f58437c.f58420i.f58449a, null, null, gl1.y.Q(o0VarE, R.string.lbl_retry), aVar, null, null, lVar, o0Var, 6, ((i15 >> 3) & 14) | ((i15 << 3) & 7168), 6576);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xk1.e(bVar, aVar, lVar, i14, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x015b  */
    /* JADX WARN: Code duplicated, block: B:107:0x016d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0170  */
    /* JADX WARN: Code duplicated, block: B:111:0x0173  */
    /* JADX WARN: Code duplicated, block: B:112:0x0175  */
    /* JADX WARN: Code duplicated, block: B:114:0x0179  */
    /* JADX WARN: Code duplicated, block: B:115:0x0180  */
    /* JADX WARN: Code duplicated, block: B:117:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:120:0x020e  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0107  */
    /* JADX WARN: Code duplicated, block: B:82:0x010f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0112  */
    /* JADX WARN: Code duplicated, block: B:85:0x0117  */
    /* JADX WARN: Code duplicated, block: B:92:0x012f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0138  */
    public static final void c(String str, String str2, o90.a aVar, String str3, boolean z14, u4.d dVar, String str4, String str5, e23.a<Unit> aVar2, String str6, e23.a<Unit> aVar3, String str7, e23.a<Unit> aVar4, e23.l<? super Float, Unit> lVar, p3.m mVar, int i14, int i15, int i16) {
        boolean z15;
        int i17;
        String str8;
        int i18;
        e23.a<Unit> aVar5;
        int i19;
        int i24;
        boolean z16;
        p3.o0 o0Var;
        u4.d dVar2;
        String str9;
        e23.a<Unit> aVar6;
        String str10;
        e23.a<Unit> aVar7;
        boolean z17;
        p2 p2VarI0;
        u4.d dVarA;
        int i25;
        String str11;
        u4.d dVar3;
        String str12;
        e23.a<Unit> aVar8;
        int i26;
        p3.o0 o0VarE = mVar.E(-740360806);
        int i27 = i14 | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(aVar) ? 256 : 128) | (o0VarE.B(str3) ? 2048 : 1024);
        int i28 = i16 & 16;
        if (i28 != 0) {
            i17 = i27 | 24576;
            z15 = z14;
        } else {
            z15 = z14;
            i17 = i27 | (o0VarE.h(z15) ? 16384 : 8192);
        }
        int i29 = i17 | 65536 | (o0VarE.B(str4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        int i30 = i16 & 128;
        if (i30 != 0) {
            i18 = i29 | 12582912;
            str8 = str5;
        } else {
            str8 = str5;
            i18 = i29 | (o0VarE.B(str8) ? 8388608 : 4194304);
        }
        int i34 = i16 & 256;
        if (i34 != 0) {
            i19 = i18 | 100663296;
            aVar5 = aVar2;
        } else {
            aVar5 = aVar2;
            i19 = i18 | (o0VarE.r(aVar5) ? 67108864 : 33554432);
        }
        int i35 = i19 | (o0VarE.B(str6) ? 536870912 : 268435456);
        if ((i15 & 6) == 0) {
            i24 = i15 | (o0VarE.r(aVar3) ? 4 : 2);
        } else {
            i24 = i15;
        }
        int i36 = i16 & 2048;
        if (i36 != 0) {
            i24 |= 48;
        } else if ((i15 & 48) == 0) {
            i24 |= o0VarE.B(str7) ? 32 : 16;
        }
        int i37 = i24;
        int i38 = i16 & 4096;
        if (i38 == 0) {
            if ((i15 & 384) == 0) {
                i37 |= o0VarE.r(aVar4) ? 256 : 128;
            }
            if ((i15 & 3072) != 0) {
                if (o0VarE.r(lVar)) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i37 |= i26;
            }
            if ((i35 & 306783379) == 306783378 || (i37 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i35 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if (i28 != 0) {
                        z15 = false;
                    }
                    s62.a.f157643a.getClass();
                    dVarA = fa.a(t62.b.f162798a);
                    i25 = i35 & (-458753);
                    if (i30 != 0) {
                        str8 = null;
                    }
                    if (i34 != 0) {
                        aVar5 = null;
                    }
                    if (i36 != 0) {
                        str11 = null;
                    } else {
                        str11 = str7;
                    }
                    if (i38 != 0) {
                        dVar3 = dVarA;
                        str12 = str11;
                        aVar8 = aVar5;
                        aVar4 = null;
                    } else {
                        dVar3 = dVarA;
                        str12 = str11;
                    }
                    boolean z18 = z15;
                    o0VarE.h0();
                    x1 x1Var = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    o0Var = o0VarE;
                    da0.p.c(str, str2, aVar, str3, false, dVar3, null, o4.d0.a(d92.b.a(o0VarE).f().f()), str6, aVar3, false, str12, aVar4, false, null, null, false, z18, null, lVar, null, null, z3.f.c(925135737, new kh0.t(str4, 3, str8, aVar8), o0VarE), o0Var, (466942 & i25) | ((i25 >> 3) & 234881024) | ((i37 << 27) & 1879048192), ((i25 << 9) & 29360128) | (i37 & 1008) | ((i37 << 18) & 1879048192), 3072, 7726160);
                    aVar7 = aVar8;
                    str10 = str8;
                    dVar2 = dVar3;
                    str9 = str12;
                    aVar6 = aVar4;
                    z17 = z18;
                } else {
                    o0VarE.e();
                    dVar3 = dVar;
                    str12 = str7;
                    i25 = i35 & (-458753);
                }
                aVar8 = aVar5;
                boolean z19 = z15;
                o0VarE.h0();
                x1 x1Var2 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                o0Var = o0VarE;
                da0.p.c(str, str2, aVar, str3, false, dVar3, null, o4.d0.a(d92.b.a(o0VarE).f().f()), str6, aVar3, false, str12, aVar4, false, null, null, false, z19, null, lVar, null, null, z3.f.c(925135737, new kh0.t(str4, 3, str8, aVar8), o0VarE), o0Var, (466942 & i25) | ((i25 >> 3) & 234881024) | ((i37 << 27) & 1879048192), ((i25 << 9) & 29360128) | (i37 & 1008) | ((i37 << 18) & 1879048192), 3072, 7726160);
                aVar7 = aVar8;
                str10 = str8;
                dVar2 = dVar3;
                str9 = str12;
                aVar6 = aVar4;
                z17 = z19;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                dVar2 = dVar;
                str9 = str7;
                aVar6 = aVar4;
                str10 = str8;
                aVar7 = aVar5;
                z17 = z15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new zg(str, str2, aVar, str3, z17, dVar2, str4, str10, aVar7, str6, aVar3, str9, aVar6, lVar, i14, i15, i16);
            }
        }
        i37 |= 384;
        if ((i15 & 3072) != 0) {
            if (o0VarE.r(lVar)) {
                i26 = 2048;
            } else {
                i26 = 1024;
            }
            i37 |= i26;
        }
        if ((i35 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (o0VarE.n(i35 & 1, z16)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i28 != 0) {
                    z15 = false;
                }
                s62.a.f157643a.getClass();
                dVarA = fa.a(t62.b.f162798a);
                i25 = i35 & (-458753);
                if (i30 != 0) {
                    str8 = null;
                }
                if (i34 != 0) {
                    aVar5 = null;
                }
                if (i36 != 0) {
                    str11 = null;
                } else {
                    str11 = str7;
                }
                if (i38 != 0) {
                    dVar3 = dVarA;
                    str12 = str11;
                    aVar8 = aVar5;
                    aVar4 = null;
                } else {
                    dVar3 = dVarA;
                    str12 = str11;
                    aVar8 = aVar5;
                }
            } else {
                if (i28 != 0) {
                    z15 = false;
                }
                s62.a.f157643a.getClass();
                dVarA = fa.a(t62.b.f162798a);
                i25 = i35 & (-458753);
                if (i30 != 0) {
                    str8 = null;
                }
                if (i34 != 0) {
                    aVar5 = null;
                }
                if (i36 != 0) {
                    str11 = null;
                } else {
                    str11 = str7;
                }
                if (i38 != 0) {
                    dVar3 = dVarA;
                    str12 = str11;
                    aVar8 = aVar5;
                    aVar4 = null;
                } else {
                    dVar3 = dVarA;
                    str12 = str11;
                    aVar8 = aVar5;
                }
            }
            boolean z110 = z15;
            o0VarE.h0();
            x1 x1Var3 = p3.n.f135158a;
            d92.b.f58623a.getClass();
            o0Var = o0VarE;
            da0.p.c(str, str2, aVar, str3, false, dVar3, null, o4.d0.a(d92.b.a(o0VarE).f().f()), str6, aVar3, false, str12, aVar4, false, null, null, false, z110, null, lVar, null, null, z3.f.c(925135737, new kh0.t(str4, 3, str8, aVar8), o0VarE), o0Var, (466942 & i25) | ((i25 >> 3) & 234881024) | ((i37 << 27) & 1879048192), ((i25 << 9) & 29360128) | (i37 & 1008) | ((i37 << 18) & 1879048192), 3072, 7726160);
            aVar7 = aVar8;
            str10 = str8;
            dVar2 = dVar3;
            str9 = str12;
            aVar6 = aVar4;
            z17 = z110;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            dVar2 = dVar;
            str9 = str7;
            aVar6 = aVar4;
            str10 = str8;
            aVar7 = aVar5;
            z17 = z15;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new zg(str, str2, aVar, str3, z17, dVar2, str4, str10, aVar7, str6, aVar3, str9, aVar6, lVar, i14, i15, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0126  */
    /* JADX WARN: Code duplicated, block: B:62:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ea  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(long j8, l90.b bVar, a aVar, o0 o0Var, e23.l lVar, p3.m mVar, int i14) {
        p3.o0 o0Var2;
        a aVar2;
        a aVar3;
        int i15;
        String str;
        boolean z14;
        boolean z15;
        Object objQ;
        long j14 = j8;
        bVar.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(2012424494);
        int i16 = i14 | (o0VarE.l(j14) ? 4 : 2) | (o0VarE.r(bVar) ? 32 : 16) | 128 | (o0VarE.r(o0Var) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            o0VarE.G0();
            int i17 = i14 & 1;
            p3.m.a aVar4 = p3.m.f135153a;
            if (i17 == 0 || o0VarE.o0()) {
                boolean z16 = (i16 & 14) == 4;
                Object objQ2 = o0VarE.q();
                if (z16) {
                    objQ2 = new a90.b(j14, 18);
                    o0VarE.K(objQ2);
                } else {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a90.b(j14, 18);
                        o0VarE.K(objQ2);
                    }
                }
                e23.a aVar5 = (e23.a) objQ2;
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(a.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar5);
                o0VarE.g0(false);
                aVar3 = (a) u1VarResolveViewModel;
                i15 = i16 & (-897);
            } else {
                o0VarE.e();
                i15 = i16 & (-897);
                aVar3 = aVar;
            }
            int i18 = i15;
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            o0VarE.L(-1614864554);
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA2 == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(s0.f105811a.b(a.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
            o0VarE.g0(false);
            p1 p1VarC = s9.c.c(((a) u1VarResolveViewModel2).f195394c, o0VarE);
            int i19 = i18 & 14;
            boolean zB = o0VarE.B(p1VarC) | o0VarE.r(aVar3) | (i19 == 4);
            Object objQ3 = o0VarE.q();
            if (zB) {
                a aVar6 = aVar3;
                m mVar2 = new m(aVar6, j14, p1VarC, 0);
                aVar3 = aVar6;
                j14 = j14;
                o0VarE.K(mVar2);
                objQ3 = mVar2;
            } else {
                aVar4.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    a aVar7 = aVar3;
                    m mVar3 = new m(aVar7, j14, p1VarC, 0);
                    aVar3 = aVar7;
                    j14 = j14;
                    o0VarE.K(mVar3);
                    objQ3 = mVar3;
                }
            }
            c.w.a(0, 1, (e23.a) objQ3, o0VarE, false);
            Boolean bool = (Boolean) p1VarC.getF182175a();
            boolean zB2 = o0VarE.B(p1VarC) | ((i18 & 7168) == 2048);
            Object objQ4 = o0VarE.q();
            if (zB2) {
                objQ4 = new o(o0Var, p1VarC, null);
                o0VarE.K(objQ4);
            } else {
                aVar4.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new o(o0Var, p1VarC, null);
                    o0VarE.K(objQ4);
                }
            }
            l0.e((e23.p) objQ4, bool, o0VarE);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String str2 = bVar.f111521f;
            o90.a aVar8 = bVar.f111526k;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_unable_to_add_device);
            boolean zG = p005kotlin.jvm.internal.s.g((Boolean) p1VarC.getF182175a(), Boolean.TRUE);
            String strP = gl1.y.P(R.string.msg_unable_to_add_device_with_active_inreach_plan, new Object[]{bVar.f111521f}, o0VarE);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_garmin_support_learn_more);
            boolean zR = o0VarE.r(context);
            Object objQ5 = o0VarE.q();
            if (zR) {
                str = str2;
            } else {
                aVar4.getClass();
                str = str2;
                if (objQ5 == p3.m.a.f135155b) {
                }
                e23.a aVar9 = (e23.a) objQ5;
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_exit_setup_capitalized);
                boolean zR2 = o0VarE.r(aVar3);
                if (i19 == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zR2 | z14;
                objQ = o0VarE.q();
                if (z15) {
                    objQ = new a6.g(aVar3, j14, 9);
                    o0VarE.K(objQ);
                } else {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a6.g(aVar3, j14, 9);
                        o0VarE.K(objQ);
                    }
                }
                o0Var2 = o0VarE;
                c("device_pairing_inreach_blocked_screen", str, aVar8, strQ, zG, null, strP, strQ2, aVar9, strQ3, (e23.a) objQ, null, null, lVar, o0Var2, 6, (i18 >> 3) & 7168, 6176);
                aVar2 = aVar3;
            }
            objQ5 = new tz1.h(context, 21);
            o0VarE.K(objQ5);
            e23.a aVar10 = (e23.a) objQ5;
            String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_exit_setup_capitalized);
            boolean zR3 = o0VarE.r(aVar3);
            if (i19 == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = zR3 | z14;
            objQ = o0VarE.q();
            if (z15) {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a6.g(aVar3, j14, 9);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new a6.g(aVar3, j14, 9);
                o0VarE.K(objQ);
            }
            o0Var2 = o0VarE;
            c("device_pairing_inreach_blocked_screen", str, aVar8, strQ, zG, null, strP, strQ2, aVar10, strQ4, (e23.a) objQ, null, null, lVar, o0Var2, 6, (i18 >> 3) & 7168, 6176);
            aVar2 = aVar3;
        } else {
            o0Var2 = o0VarE;
            o0Var2.e();
            aVar2 = aVar;
        }
        p2 p2VarI0 = o0Var2.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c42.e(j14, bVar, aVar2, o0Var, lVar, i14, 8);
        }
    }
}
