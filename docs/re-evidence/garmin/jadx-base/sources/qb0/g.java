package qb0;

import ca0.u1;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import l72.c1;
import o4.d0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p40.k0;
import v62.fa;
import v62.g0;
import v62.ja;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f143990a;

        static {
            int[] iArr = new int[z90.b.values().length];
            try {
                iArr[z90.b.NO_BLUETOOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z90.b.NO_NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[z90.b.SERVER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[z90.b.GENERIC_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f143990a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:63:0x010d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0119  */
    /* JADX WARN: Code duplicated, block: B:67:0x0132  */
    /* JADX WARN: Code duplicated, block: B:70:0x0149  */
    /* JADX WARN: Code duplicated, block: B:72:0x0166  */
    /* JADX WARN: Code duplicated, block: B:73:0x0168  */
    /* JADX WARN: Code duplicated, block: B:77:0x0171  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ff  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, o90.a aVar, z90.b bVar, e23.a aVar2, u1 u1Var, e23.l lVar, p3.m mVar, int i14) {
        o0 o0Var;
        int i15;
        int i16;
        String strJ;
        int i17;
        int i18;
        int i19;
        int i24;
        u4.d dVarA;
        Object objQ;
        p3.m.a.C2565a c2565a;
        p1 p1Var;
        p1 p1Var2;
        boolean z14;
        o0 o0Var2;
        p3.m.a.C2565a c2565a2;
        Object objQ2;
        Object objQ3;
        boolean z15;
        Object objQ4;
        str.getClass();
        aVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(324620174);
        int i25 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(aVar) ? 32 : 16) | (o0VarE.k(bVar.ordinal()) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(u1Var) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536);
        if (o0VarE.n(i25 & 1, (74899 & i25) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            int[] iArr = a.f143990a;
            int i26 = iArr[bVar.ordinal()];
            if (i26 == 1) {
                i15 = -1572615877;
                i16 = R.string.startup_no_bluetooth;
            } else if (i26 != 2) {
                if (i26 != 3) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i26 != 4 ? -1572604283 : -1572606587, R.string.pregnancy_something_went_wrong, o0VarE, false);
                } else {
                    i15 = -1572609635;
                    i16 = R.string.startup_no_server_conn;
                }
                String str2 = strJ;
                i17 = iArr[bVar.ordinal()];
                if (i17 != 1) {
                    i18 = -1572599488;
                    i19 = R.string.startup_no_bluetooth_desc;
                } else if (i17 != 2) {
                    i18 = -1572596444;
                    i19 = R.string.startup_no_internet_conn_desc;
                } else if (i17 != 3) {
                    i19 = R.string.sync_generic_failure_details;
                    if (i17 != 4) {
                        i18 = -1572587933;
                    } else {
                        i18 = -1572590173;
                    }
                } else {
                    i18 = -1572593219;
                    i19 = R.string.msg_sync_device_failed;
                }
                String strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i18, i19, o0VarE, false);
                i24 = iArr[bVar.ordinal()];
                if (i24 != 1) {
                    s62.a.f157643a.getClass();
                    dVarA = g0.a(t62.b.f162798a);
                } else if (i24 != 2) {
                    s62.a.f157643a.getClass();
                    dVarA = fa.a(t62.b.f162798a);
                } else {
                    s62.a.f157643a.getClass();
                    dVarA = ja.a(t62.b.f162798a);
                }
                u4.d dVar = dVarA;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                p1Var = (p1) objQ;
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0VarE.C(-1505207372);
                    c1 c1Var = c1.f110940a;
                    String strQ = y.Q(o0VarE, R.string.skip_sync_alert_msg);
                    String strQ2 = y.Q(o0VarE, R.string.lbl_ok);
                    if ((i25 & 57344) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objQ4 = o0VarE.q();
                    if (z15 || objQ4 == c2565a) {
                        objQ4 = new f(u1Var, p1Var, 0);
                        o0VarE.K(objQ4);
                    }
                    z14 = false;
                    p1Var2 = p1Var;
                    c2565a2 = c2565a;
                    c1Var.a(false, null, strQ, null, null, strQ2, false, false, (e23.a) objQ4, null, null, o0VarE, 0, 0, 1755);
                    o0Var2 = o0VarE;
                    o0Var2.g0(false);
                } else {
                    p1Var2 = p1Var;
                    z14 = false;
                    o0Var2 = o0VarE;
                    c2565a2 = c2565a;
                    o0Var2.C(-1504930604);
                    o0Var2.g0(false);
                }
                d92.b.f58623a.getClass();
                long jF = d92.b.a(o0Var2).f().f();
                String strQ3 = y.Q(o0Var2, R.string.lbl_retry);
                String strQ4 = y.Q(o0Var2, R.string.lbl_skip_button);
                d0 d0VarA = d0.a(jF);
                if ((i25 & 7168) == 2048) {
                    z14 = true;
                }
                objQ2 = o0Var2.q();
                if (z14 || objQ2 == c2565a2) {
                    objQ2 = new pf0.j(aVar2, 22);
                    o0Var2.K(objQ2);
                }
                e23.a aVar3 = (e23.a) objQ2;
                objQ3 = o0Var2.q();
                if (objQ3 == c2565a2) {
                    objQ3 = new k0(p1Var2, 24);
                    o0Var2.K(objQ3);
                }
                int i27 = i25 << 3;
                o0Var = o0Var2;
                da0.p.c("sync_failed_screen", str, aVar, str2, false, dVar, null, d0VarA, strQ3, aVar3, false, strQ4, (e23.a) objQ3, false, null, null, false, false, null, lVar, null, null, z3.f.c(557293903, new j21.p(strJ2, 16), o0Var2), o0Var, (i27 & 112) | 6 | (i27 & 896), ((i25 << 12) & 1879048192) | 384, 3072, 7857232);
            } else {
                i15 = -1572612984;
                i16 = R.string.common_network_reachability_error;
            }
            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, false);
            String str3 = strJ;
            i17 = iArr[bVar.ordinal()];
            if (i17 != 1) {
                i18 = -1572599488;
                i19 = R.string.startup_no_bluetooth_desc;
            } else if (i17 != 2) {
                i18 = -1572596444;
                i19 = R.string.startup_no_internet_conn_desc;
            } else if (i17 != 3) {
                i19 = R.string.sync_generic_failure_details;
                if (i17 != 4) {
                    i18 = -1572587933;
                } else {
                    i18 = -1572590173;
                }
            } else {
                i18 = -1572593219;
                i19 = R.string.msg_sync_device_failed;
            }
            String strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i18, i19, o0VarE, false);
            i24 = iArr[bVar.ordinal()];
            if (i24 != 1) {
                s62.a.f157643a.getClass();
                dVarA = g0.a(t62.b.f162798a);
            } else if (i24 != 2) {
                s62.a.f157643a.getClass();
                dVarA = fa.a(t62.b.f162798a);
            } else {
                s62.a.f157643a.getClass();
                dVarA = ja.a(t62.b.f162798a);
            }
            u4.d dVar2 = dVarA;
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1Var = (p1) objQ;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-1505207372);
                c1 c1Var2 = c1.f110940a;
                String strQ5 = y.Q(o0VarE, R.string.skip_sync_alert_msg);
                String strQ6 = y.Q(o0VarE, R.string.lbl_ok);
                if ((i25 & 57344) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objQ4 = o0VarE.q();
                if (z15) {
                    objQ4 = new f(u1Var, p1Var, 0);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new f(u1Var, p1Var, 0);
                    o0VarE.K(objQ4);
                }
                z14 = false;
                p1Var2 = p1Var;
                c2565a2 = c2565a;
                c1Var2.a(false, null, strQ5, null, null, strQ6, false, false, (e23.a) objQ4, null, null, o0VarE, 0, 0, 1755);
                o0Var2 = o0VarE;
                o0Var2.g0(false);
            } else {
                p1Var2 = p1Var;
                z14 = false;
                o0Var2 = o0VarE;
                c2565a2 = c2565a;
                o0Var2.C(-1504930604);
                o0Var2.g0(false);
            }
            d92.b.f58623a.getClass();
            long jF2 = d92.b.a(o0Var2).f().f();
            String strQ7 = y.Q(o0Var2, R.string.lbl_retry);
            String strQ8 = y.Q(o0Var2, R.string.lbl_skip_button);
            d0 d0VarA2 = d0.a(jF2);
            if ((i25 & 7168) == 2048) {
                z14 = true;
            }
            objQ2 = o0Var2.q();
            if (z14) {
                objQ2 = new pf0.j(aVar2, 22);
                o0Var2.K(objQ2);
            } else {
                objQ2 = new pf0.j(aVar2, 22);
                o0Var2.K(objQ2);
            }
            e23.a aVar4 = (e23.a) objQ2;
            objQ3 = o0Var2.q();
            if (objQ3 == c2565a2) {
                objQ3 = new k0(p1Var2, 24);
                o0Var2.K(objQ3);
            }
            int i28 = i25 << 3;
            o0Var = o0Var2;
            da0.p.c("sync_failed_screen", str, aVar, str3, false, dVar2, null, d0VarA2, strQ7, aVar4, false, strQ8, (e23.a) objQ3, false, null, null, false, false, null, lVar, null, null, z3.f.c(557293903, new j21.p(strJ3, 16), o0Var2), o0Var, (i28 & 112) | 6 | (i28 & 896), ((i25 << 12) & 1879048192) | 384, 3072, 7857232);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oy0.b(str, aVar, bVar, aVar2, u1Var, lVar, i14, 6);
        }
    }
}
