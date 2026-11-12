package sa0;

import androidx.lifecycle.v1;
import c.w;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.WifiSetup;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.common.ConnectionResult;
import f5.z0;
import i3.i5;
import i3.i7;
import i3.tb;
import o4.s0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p2;
import p3.x1;
import q42.v;
import rk0.y;
import s1.e0;
import s1.n0;
import s1.p0;
import v62.ia;
import v62.ja;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.wifi.WiFiConnectionStatusScreenKt$WiFiConnectionStatusScreenRoute$1$1", f = "WiFiConnectionStatusScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f158205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f158206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WifiSetup.SecurityType f158207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f158208d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, String str, WifiSetup.SecurityType securityType, String str2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f158205a = nVar;
            this.f158206b = str;
            this.f158207c = securityType;
            this.f158208d = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f158205a, this.f158206b, this.f158207c, this.f158208d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            n nVar = this.f158205a;
            nVar.getClass();
            String str = this.f158206b;
            str.getClass();
            WifiSetup.SecurityType securityType = this.f158207c;
            securityType.getClass();
            ge1.b.T(v1.a(nVar), null, null, new r(nVar, str, securityType, this.f158208d, null), 3);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:43:0x0116  */
    public static final void a(h4.r rVar, boolean z14, u4.d dVar, p3.m mVar, int i14) {
        h4.r rVar2;
        o0 o0VarE = mVar.E(410690727);
        int i15 = i14 | 6;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        int i16 = i15 | (o0VarE.B(dVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            h4.r.a aVar = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            n0.a aVarA = p0.a(p0.c(null, o0VarE, 1), 0.0f, 360.0f, s1.l.a(s1.l.d(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 0, e0.f155563d, 2), null, 6), null, o0VarE, 4536, 8);
            float f14 = 80;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarG = c2.l.g(x2.q(aVar, f14), 1.0f);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarG, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            long jD = hb.a.d(d92.b.f58623a, o0VarE);
            h4.r rVarQ = x2.q(aVar, f14);
            boolean zB = o0VarE.B(aVarA);
            Object objQ = o0VarE.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zB) {
                objQ = new i5(aVarA, 10);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new i5(aVarA, 10);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarA = s0.a(rVarQ, (e23.l) objQ);
            boolean zL = o0VarE.l(jD) | ((i16 & 112) == 32);
            Object objQ2 = o0VarE.q();
            if (zL) {
                objQ2 = new j82.b(jD, z14, 1);
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new j82.b(jD, z14, 1);
                    o0VarE.K(objQ2);
                }
            }
            u1.n.b(rVarA, (e23.l) objQ2, o0VarE, 0);
            i7.b(dVar, null, x2.q(aVar, 32), am.j.d(o0VarE), o0VarE, ((i16 >> 6) & 14) | 432, 0);
            o0VarE.g0(true);
            rVar2 = aVar;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(rVar2, z14, dVar, i14, 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0176  */
    /* JADX WARN: Code duplicated, block: B:107:0x0182  */
    /* JADX WARN: Code duplicated, block: B:77:0x010f  */
    /* JADX WARN: Code duplicated, block: B:82:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x012d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0138  */
    /* JADX WARN: Code duplicated, block: B:89:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x014c  */
    /* JADX WARN: Code duplicated, block: B:91:0x014e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0162  */
    public static final void b(boolean z14, WifiSetup.StatusType statusType, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, p3.m mVar, int i14) {
        int i15;
        e23.a<Unit> aVar5;
        e23.a<Unit> aVar6;
        e23.a<Unit> aVar7;
        e23.a<Unit> aVar8;
        o0 o0Var;
        String strJ;
        String str;
        String strJ2;
        u4.d dVarA;
        String strJ3;
        e23.a<Unit> aVar9;
        String strJ4;
        e23.a<Unit> aVar10;
        e23.a<Unit> aVar11;
        o0 o0VarE = mVar.E(345856773);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(statusType.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            aVar5 = aVar;
            i15 |= o0VarE.r(aVar5) ? 256 : 128;
        } else {
            aVar5 = aVar;
        }
        if ((i14 & 3072) == 0) {
            aVar6 = aVar2;
            i15 |= o0VarE.r(aVar6) ? 2048 : 1024;
        } else {
            aVar6 = aVar2;
        }
        if ((i14 & 24576) == 0) {
            aVar7 = aVar3;
            i15 |= o0VarE.r(aVar7) ? 16384 : 8192;
        } else {
            aVar7 = aVar3;
        }
        if ((196608 & i14) == 0) {
            aVar8 = aVar4;
            i15 |= o0VarE.r(aVar8) ? 131072 : 65536;
        } else {
            aVar8 = aVar4;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            if (z14) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1655888664, R.string.pair_ble_connecting_status, o0VarE, false);
            } else {
                strJ = statusType == WifiSetup.StatusType.ConnectionSuccess ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1655892683, R.string.lbl_connected, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1655894592, R.string.wallet_vva3_reconnect_failed_title, o0VarE, false);
            }
            String str2 = strJ;
            if (z14) {
                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1655898589, R.string.msg_test_device_wifi_connection, o0VarE, false);
            } else if (statusType == WifiSetup.StatusType.InvalidCredentials) {
                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1655902812, R.string.wifi_error_invalid_credentials, o0VarE, false);
            } else {
                if (statusType != WifiSetup.StatusType.ConnectionSuccess) {
                    strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1655906963, R.string.lbl_network_not_found, o0VarE, false);
                } else {
                    o0VarE.C(-206426536);
                    o0VarE.g0(false);
                    str = null;
                }
                if (!z14 || statusType == WifiSetup.StatusType.ConnectionSuccess) {
                    s62.a.f157643a.getClass();
                    dVarA = ia.a(t62.b.f162798a);
                } else {
                    s62.a.f157643a.getClass();
                    dVarA = ja.a(t62.b.f162798a);
                }
                if (z14 && statusType == WifiSetup.StatusType.ConnectionSuccess) {
                    strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1655919366, R.string.lbl_next, o0VarE, false);
                } else if (z14) {
                    o0VarE.C(-205987080);
                    o0VarE.g0(false);
                    strJ3 = null;
                } else {
                    strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1655921387, R.string.lbl_try_again, o0VarE, false);
                }
                if (z14 && statusType == WifiSetup.StatusType.ConnectionSuccess) {
                    aVar9 = aVar5;
                } else if (z14) {
                    aVar9 = null;
                } else {
                    aVar9 = aVar7;
                }
                if (!z14 || statusType == WifiSetup.StatusType.ConnectionSuccess) {
                    o0VarE.C(-205582344);
                    o0VarE.g0(false);
                    strJ4 = null;
                } else {
                    strJ4 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1655934381, R.string.lbl_skip_button, o0VarE, false);
                }
                if (!z14 || statusType == WifiSetup.StatusType.ConnectionSuccess) {
                    aVar10 = null;
                } else {
                    aVar10 = aVar6;
                }
                if (!z14 || statusType == WifiSetup.StatusType.ConnectionSuccess) {
                    aVar11 = null;
                } else {
                    aVar11 = aVar8;
                }
                c2.j.f22691a.getClass();
                c2.j.c cVar = c2.j.f22696f;
                h4.d.f81522a.getClass();
                o0Var = o0VarE;
                da0.p.b("wifi_connection_status_screen", str2, dVarA, str, null, strJ3, aVar9, false, strJ4, aVar10, false, null, null, false, false, aVar11, null, null, null, cVar, h4.d.a.f81537o, z3.f.c(171283973, new tb(z14, statusType, 3), o0VarE), o0Var, 6, 0, 438, 1014928);
            }
            str = strJ2;
            if (z14) {
                s62.a.f157643a.getClass();
                dVarA = ia.a(t62.b.f162798a);
            } else {
                s62.a.f157643a.getClass();
                dVarA = ia.a(t62.b.f162798a);
            }
            if (z14) {
                if (z14) {
                    strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1655921387, R.string.lbl_try_again, o0VarE, false);
                } else {
                    o0VarE.C(-205987080);
                    o0VarE.g0(false);
                    strJ3 = null;
                }
            } else if (z14) {
                strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1655921387, R.string.lbl_try_again, o0VarE, false);
            } else {
                o0VarE.C(-205987080);
                o0VarE.g0(false);
                strJ3 = null;
            }
            if (z14) {
                if (z14) {
                    aVar9 = aVar7;
                } else {
                    aVar9 = null;
                }
            } else if (z14) {
                aVar9 = aVar7;
            } else {
                aVar9 = null;
            }
            if (z14) {
                o0VarE.C(-205582344);
                o0VarE.g0(false);
                strJ4 = null;
            } else {
                o0VarE.C(-205582344);
                o0VarE.g0(false);
                strJ4 = null;
            }
            if (z14) {
                aVar10 = null;
            } else {
                aVar10 = null;
            }
            if (z14) {
                aVar11 = null;
            } else {
                aVar11 = null;
            }
            c2.j.f22691a.getClass();
            c2.j.c cVar2 = c2.j.f22696f;
            h4.d.f81522a.getClass();
            o0Var = o0VarE;
            da0.p.b("wifi_connection_status_screen", str2, dVarA, str, null, strJ3, aVar9, false, strJ4, aVar10, false, null, null, false, false, aVar11, null, null, null, cVar2, h4.d.a.f81537o, z3.f.c(171283973, new tb(z14, statusType, 3), o0VarE), o0Var, 6, 0, 438, 1014928);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(z14, statusType, aVar5, aVar6, aVar7, aVar4, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:73:0x0118  */
    /* JADX WARN: Code duplicated, block: B:78:0x0135  */
    /* JADX WARN: Code duplicated, block: B:83:0x015b  */
    public static final void c(String str, WifiSetup.SecurityType securityType, String str2, n.b bVar, n nVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, p3.m mVar, int i14) {
        str.getClass();
        securityType.getClass();
        bVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarP = fb1.c.p(aVar3, aVar4, mVar, -1132779618);
        int i15 = i14 | (o0VarP.B(str) ? 4 : 2) | (o0VarP.k(securityType.ordinal()) ? 32 : 16) | (o0VarP.B(str2) ? 256 : 128) | (o0VarP.r(bVar) ? 2048 : 1024) | (o0VarP.r(nVar) ? 16384 : 8192) | (o0VarP.r(aVar) ? 131072 : 65536) | (o0VarP.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarP.r(aVar3) ? 8388608 : 4194304) | (o0VarP.r(aVar4) ? 67108864 : 33554432);
        if (o0VarP.n(i15 & 1, (38347923 & i15) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            Unit unit = Unit.INSTANCE;
            boolean zR = ((i15 & 14) == 4) | o0VarP.r(nVar) | ((i15 & 112) == 32) | ((i15 & 896) == 256);
            Object objQ = o0VarP.q();
            p3.m.a aVar5 = p3.m.f135153a;
            if (zR) {
                a aVar6 = new a(nVar, str, securityType, str2, null);
                o0VarP.K(aVar6);
                objQ = aVar6;
            } else {
                aVar5.getClass();
                if (objQ == p3.m.a.f135155b) {
                    a aVar7 = new a(nVar, str, securityType, str2, null);
                    o0VarP.K(aVar7);
                    objQ = aVar7;
                }
            }
            l0.e((e23.p) objQ, unit, o0VarP);
            boolean zR2 = o0VarP.r(bVar) | ((458752 & i15) == 131072) | ((234881024 & i15) == 67108864);
            Object objQ2 = o0VarP.q();
            if (zR2) {
                objQ2 = new v(bVar, 28, aVar, aVar4);
                o0VarP.K(objQ2);
            } else {
                aVar5.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new v(bVar, 28, aVar, aVar4);
                    o0VarP.K(objQ2);
                }
            }
            e23.a aVar8 = (e23.a) objQ2;
            boolean zB = o0VarP.B(aVar8);
            Object objQ3 = o0VarP.q();
            if (zB) {
                objQ3 = new y(aVar8, 25);
                o0VarP.K(objQ3);
            } else {
                aVar5.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new y(aVar8, 25);
                    o0VarP.K(objQ3);
                }
            }
            w.a(0, 1, (e23.a) objQ3, o0VarP, false);
            boolean z14 = bVar.f158214a;
            WifiSetup.StatusType statusType = bVar.f158220g;
            boolean zB2 = o0VarP.B(aVar8);
            Object objQ4 = o0VarP.q();
            if (zB2) {
                objQ4 = new y(aVar8, 26);
                o0VarP.K(objQ4);
            } else {
                aVar5.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new y(aVar8, 26);
                    o0VarP.K(objQ4);
                }
            }
            b(z14, statusType, aVar, aVar2, aVar3, (e23.a) objQ4, o0VarP, (i15 >> 9) & 65408);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c42.d(str, securityType, str2, bVar, nVar, aVar, aVar2, aVar3, aVar4, i14);
        }
    }
}
