package hk0;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import c22.d1;
import c22.u1;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.Arrays;
import org.koin.java.KoinJavaComponent;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
public class a extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f84045b;

    /* JADX INFO: renamed from: hk0.a$a, reason: collision with other inner class name */
    public enum EnumC1667a {
        STARTED,
        FINISHED_WITH_SUCCESS,
        FINISHED_WITH_FAILURE,
        FINISHED_CANCELED,
        SKIPPED
    }

    private a(Context context) {
        super(context);
    }

    public static void e(Context context) {
        f84045b = new a(context);
    }

    public static a f() {
        if (f84045b == null) {
            f84045b = new a(((c22.o) KoinJavaComponent.get(c22.o.class)).c());
        }
        return f84045b;
    }

    public static a g(Context context) {
        if (f84045b == null) {
            f84045b = new a(context);
        }
        return f84045b;
    }

    public static void j(EnumC1667a enumC1667a, String str, long j8, String str2, yl2.e eVar, String str3) {
        String str4;
        int iOrdinal = enumC1667a.ordinal();
        if (iOrdinal == 0) {
            str4 = "android_pairingStarted";
        } else if (iOrdinal != 1) {
            str4 = "android_pairingCanceled";
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    return;
                }
            } else if (!yl2.e.ABORTED.equals(eVar)) {
                str4 = "android_pairingFailed";
            }
        } else {
            str4 = "android_pairingSuccess";
        }
        rd2.f.a().f152045a.getClass();
        sd2.f fVarI = rd2.j.i(j8, null);
        boolean z14 = false;
        if (fVarI != null) {
            u0 u0Var = (u0) u0.f203782n6.get(fVarI.getProductNumber());
            z14 = u0Var != null && u0Var.f203859f;
        }
        d1.c(str4, new d1.b(str, str2, j8, str3), Boolean.valueOf(z14));
    }

    public final void h(long j8) {
        String strA = u1.a(j8);
        if (strA == null) {
            d(j8, "requestFactoryReset");
        } else if (TextUtils.isEmpty(strA)) {
            c("requestFactoryReset");
        } else {
            ((fm2.c) lm2.h.c()).n(strA, 10000, null);
        }
    }

    public final void i(long j8) {
        if (j8 < 0) {
            d(j8, "requestRemoteDeviceDisconnection");
            return;
        }
        String strA = u1.a(j8);
        if (TextUtils.isEmpty(strA)) {
            c("requestRemoteDeviceDisconnection");
            return;
        }
        DeviceProfile deviceProfileD = ((da2.b) s.a()).d(strA);
        ea2.a aVar = (ea2.a) s.a().getCapability(strA, ea2.a.class);
        if (aVar == null || deviceProfileD == null) {
            return;
        }
        aVar.requestRemoteDeviceDisconnection(null);
    }

    public final void k(EnumC1667a enumC1667a, long j8) {
        l(enumC1667a, j8, null, null);
    }

    public final void l(EnumC1667a enumC1667a, long j8, yl2.e eVar, String str) {
        String strA = u1.a(j8);
        if (strA != null) {
            m(enumC1667a, strA, eVar, str);
        }
    }

    public final void m(EnumC1667a enumC1667a, String str, yl2.e eVar, String str2) {
        da2.j jVar;
        if (enumC1667a == null || TextUtils.isEmpty(str)) {
            i2.i(b(), "sendPairingState(): Unable to execute operation. Null milestone.");
            return;
        }
        DeviceProfile deviceProfileD = ((da2.b) s.a()).d(str);
        if (deviceProfileD == null) {
            j(enumC1667a, str, -1L, "", eVar, str2);
            return;
        }
        if (enumC1667a == EnumC1667a.FINISHED_WITH_SUCCESS) {
            rd2.j jVar2 = rd2.f.a().f152045a;
            long f172494b = deviceProfileD.getF172494b();
            jVar2.getClass();
            sd2.f fVarI = rd2.j.i(f172494b, null);
            if (fVarI != null) {
                Intent intent = new Intent("com.garmin.android.apps.ACTION_NEW_DEVICE_PAIRED");
                intent.putExtra("com.garmin.android.apps.EXTRA_UNIT_ID", deviceProfileD.getF172494b());
                intent.putExtra("com.garin.android.apps.EXTRA_PRODUCT_NUMBER", fVarI.getProductNumber());
                Context context = this.f84094a;
                Context applicationContext = context.getApplicationContext();
                Context applicationContext2 = context.getApplicationContext();
                String str3 = oa2.b.f131086a;
                applicationContext.sendBroadcast(intent, applicationContext2.getPackageName() + ".permission.RECEIVE_THIRD_PARTY_BROADCASTS");
            }
        }
        int iOrdinal = enumC1667a.ordinal();
        if (iOrdinal != 0) {
            jVar = iOrdinal != 1 ? da2.j.FINISHED_WITH_FAILURE : da2.j.FINISHED_WITH_SUCCESS;
        } else {
            jVar = da2.j.STARTED;
        }
        try {
            ((fm2.c) lm2.h.c()).q(jVar, str);
        } catch (Throwable unused) {
            ea2.a aVar = (ea2.a) s.a().getCapability(str, ea2.a.class);
            if (aVar != null) {
                aVar.setPairingState(jVar);
            }
        }
        i2.d(b(), "success sendPairingState(" + enumC1667a.name() + ")");
        if (enumC1667a == EnumC1667a.STARTED) {
            v80.c cVar = (v80.c) KoinJavaComponent.get(v80.c.class);
            cVar.getClass();
            str.getClass();
            ge1.b.T(cVar.f176208e, null, null, new v80.e(cVar, str, null), 3);
        }
        if (deviceProfileD.getF172498f()) {
            j(enumC1667a, Arrays.toString(new String[]{deviceProfileD.getMacAddress(), deviceProfileD.getDualPairingMacAddress()}), deviceProfileD.getF172494b(), deviceProfileD.getDeviceFullName(), eVar, str2);
        } else {
            j(enumC1667a, str, deviceProfileD.getF172494b(), deviceProfileD.getDeviceFullName(), eVar, str2);
        }
    }

    public final void n(EnumC1667a enumC1667a, String str) {
        da2.j jVar;
        if (enumC1667a != null) {
            if (TextUtils.isEmpty(str)) {
                c("sendSetupWizardState");
                return;
            }
            ea2.a aVar = (ea2.a) s.a().getCapability(str, ea2.a.class);
            if (aVar != null) {
                int iOrdinal = enumC1667a.ordinal();
                if (iOrdinal == 0) {
                    jVar = da2.j.STARTED;
                } else if (iOrdinal != 1) {
                    jVar = (iOrdinal == 2 || iOrdinal == 3 || iOrdinal != 4) ? da2.j.FINISHED_WITH_FAILURE : da2.j.SKIPPED;
                } else {
                    jVar = da2.j.FINISHED_WITH_SUCCESS;
                }
                aVar.setSetupWizardState(jVar);
            }
        }
    }

    public final void o(long j8, boolean z14) {
        String strA = u1.a(j8);
        if (strA == null) {
            d(j8, "setAutoUploadEnabled");
            return;
        }
        if (TextUtils.isEmpty(strA)) {
            c("setAutoUploadEnabled");
            return;
        }
        DeviceProfile deviceProfileA = da2.d.c(this.f84094a).a(strA);
        if (deviceProfileA != null) {
            if (z14) {
                sm2.g.e(deviceProfileA, 1, true);
            } else {
                sm2.g.e(deviceProfileA, 1, false);
            }
        }
    }

    public final void p(long j8, boolean z14) {
        String strA = u1.a(j8);
        if (strA == null) {
            d(j8, "setWeatherConditionsEnabled");
            return;
        }
        if (TextUtils.isEmpty(strA)) {
            c("setWeatherConditionsEnabled");
            return;
        }
        DeviceProfile deviceProfileA = da2.d.c(this.f84094a).a(strA);
        if (deviceProfileA != null) {
            if (z14) {
                sm2.g.e(deviceProfileA, 2, true);
            } else {
                sm2.g.e(deviceProfileA, 2, false);
            }
        }
    }
}
