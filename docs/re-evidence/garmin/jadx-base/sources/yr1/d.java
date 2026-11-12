package yr1;

import android.os.Handler;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.device.datatypes.DeviceProfile;
import ds.e0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p1.z;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f199077a;

        static {
            int[] iArr = new int[SupportedCapability.values().length];
            try {
                iArr[SupportedCapability.CONTACTS_SUPPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f199077a = iArr;
        }
    }

    public static final DeviceProfile a(long j8) {
        DeviceProfile deviceProfile;
        DeviceProfile[] deviceProfileArrA = ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).x().a(j8);
        int length = deviceProfileArrA.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                deviceProfile = null;
                break;
            }
            deviceProfile = deviceProfileArrA[i14];
            if (deviceProfile.getConnectionType() == 1) {
                break;
            }
            i14++;
        }
        if (deviceProfile != null) {
            return deviceProfile;
        }
        for (DeviceProfile deviceProfile2 : deviceProfileArrA) {
            if (deviceProfile2.getConnectionType() == 2) {
                return deviceProfile2;
            }
        }
        return null;
    }

    public static final Object b(rs2.c cVar) {
        cVar.getClass();
        da2.b bVarX = ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).x();
        DeviceProfile deviceProfileD = bVarX.d(cVar.getF92737a());
        if (deviceProfileD == null) {
            deviceProfileD = bVarX.d(cVar.getF92739c());
        }
        if (deviceProfileD == null) {
            return null;
        }
        String macAddress = deviceProfileD.getMacAddress();
        macAddress.getClass();
        return bVarX.getCapability(macAddress, zb1.a.class);
    }

    public static final void c(final long j8, final boolean z14) {
        Boolean boolB;
        final c cVarA = c.a();
        z<Runnable> zVar = cVarA.f199072b;
        Handler handler = cVarA.f199074d;
        Long lB = cVarA.f199071a.b(j8);
        if (lB == null) {
            i2.a(a2.SYNC, "DeviceSyncController", a0.f(j8, "requestSync  unitId ", " device NOT connected, ignore"));
            return;
        }
        if (((l80.a) KoinJavaComponent.get(l80.a.class)).l()) {
            i2.a(a2.SYNC, "DeviceSyncController", a0.f(j8, "requestSync  unitId ", " user is in pairing flow, ignore"));
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Runnable runnableB = zVar.b(j8);
        long jLongValue = lB.longValue() - jCurrentTimeMillis;
        if (jLongValue < 0) {
            if (runnableB != null) {
                handler.removeCallbacks(runnableB);
            }
            a2 a2Var = a2.SYNC;
            StringBuilder sbK = e0.k(j8, "requestSync  unitId ", " Syncing immediately: ");
            sbK.append(jCurrentTimeMillis - lB.longValue());
            i2.a(a2Var, "DeviceSyncController", sbK.toString());
            cVarA.c(j8, z14);
            return;
        }
        if (runnableB != null) {
            if (z14) {
                handler.removeCallbacks(runnableB);
                final int i14 = 0;
                Runnable runnable = new Runnable() { // from class: yr1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                a2 a2Var2 = a2.SYNC;
                                long j14 = j8;
                                i2.a(a2Var2, "DeviceSyncController", a0.f(j14, "requestSync  unitId ", " Running delayed sync request"));
                                c cVar = cVarA;
                                cVar.f199072b.g(j14);
                                cVar.c(j14, z14);
                                break;
                            default:
                                a2 a2Var3 = a2.SYNC;
                                long j15 = j8;
                                i2.a(a2Var3, "DeviceSyncController", a0.f(j15, "requestSync  unitId ", " Running delayed sync request"));
                                c cVar2 = cVarA;
                                cVar2.f199072b.g(j15);
                                cVar2.c(j15, z14);
                                break;
                        }
                    }
                };
                zVar.f(j8, runnable);
                handler.postDelayed(runnable, jLongValue);
                a2 a2Var2 = a2.SYNC;
                StringBuilder sbK2 = e0.k(j8, "requestSync  unitId ", " Posting delayed sync: ");
                sbK2.append(jLongValue);
                i2.a(a2Var2, "DeviceSyncController", sbK2.toString());
                return;
            }
            return;
        }
        a2 a2Var3 = a2.SYNC;
        i2.a(a2Var3, "DeviceSyncController", a0.f(j8, "requestSync  unitId ", " Initiating delayed sync logic"));
        if (((l80.b) KoinJavaComponent.get(l80.b.class)).h(j8) && (((boolB = cVarA.f199073c.b(j8)) != null && boolB != Boolean.TRUE) || c.b(j8))) {
            String strF = a0.f(j8, "requestSync  unitId ", " Syncing but not a silent sync so bailing");
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "DeviceSyncController", strF);
            return;
        }
        final int i15 = 1;
        Runnable runnable2 = new Runnable() { // from class: yr1.b
            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        a2 a2Var4 = a2.SYNC;
                        long j14 = j8;
                        i2.a(a2Var4, "DeviceSyncController", a0.f(j14, "requestSync  unitId ", " Running delayed sync request"));
                        c cVar = cVarA;
                        cVar.f199072b.g(j14);
                        cVar.c(j14, z14);
                        break;
                    default:
                        a2 a2Var5 = a2.SYNC;
                        long j15 = j8;
                        i2.a(a2Var5, "DeviceSyncController", a0.f(j15, "requestSync  unitId ", " Running delayed sync request"));
                        c cVar2 = cVarA;
                        cVar2.f199072b.g(j15);
                        cVar2.c(j15, z14);
                        break;
                }
            }
        };
        zVar.f(j8, runnable2);
        handler.postDelayed(runnable2, jLongValue);
        i2.f36769a.getClass();
        i2.a.b(a2Var3, "DeviceSyncController", "requestSync  unitId " + j8 + " Posting delayed sync: " + jLongValue);
    }

    public static final void d(sd2.f fVar, String str, e23.l<? super al2.c, Unit> lVar) {
        fVar.getClass();
        String strD0 = fVar.d0();
        if (strD0 == null) {
            strD0 = fVar.Q();
        }
        if (strD0 == null) {
            i2.f36769a.getClass();
            i2.a.f(a2.SYNC, str, "syncNow - No valid mac address for DeviceDatabaseRecord[" + fVar + "]");
            return;
        }
        i2.f36769a.getClass();
        i2.a.b(a2.SYNC, str, "syncNow - macAddress[" + strD0 + "] DeviceDatabaseRecord[" + fVar + "]");
        e.f(strD0, str, lVar);
    }
}
