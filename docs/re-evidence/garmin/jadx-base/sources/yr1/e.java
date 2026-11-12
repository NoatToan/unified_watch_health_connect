package yr1;

import android.content.Context;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.android.lib.connectdevicesync.DeviceSyncService;
import com.garmin.device.datatypes.DeviceProfile;
import ds.e0;
import java.util.ArrayList;
import o53.e1;
import ok2.w;
import ok2.y;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyr1/e;", "", "<init>", "()V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f199078a = new e();

    private e() {
    }

    public static void a(long j8, String str) {
        String macAddress;
        y yVar = new y();
        str.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SYNC;
        aVar.getClass();
        i2.a.b(a2Var, str, "requestSync - deviceUnitId[" + j8 + "] syncOptions[" + yVar + "]");
        DeviceProfile deviceProfileA = d.a(j8);
        if (deviceProfileA == null || (macAddress = deviceProfileA.getMacAddress()) == null) {
            i2.a.f(a2Var, str, a0.f(j8, "requestSync - No connected DeviceProfile found for deviceUnitId[", "]"));
            return;
        }
        i2.a.b(a2Var, str, "requestSync - macAddress[" + macAddress + "] syncOptions[" + yVar + "]");
        if (d(macAddress)) {
            w wVarA = ok2.a0.f132585h.a().a(macAddress);
            if (wVarA != null) {
                wVarA.f(yVar, new y01.k(str, 10));
                return;
            }
            i2.a.f(a2Var, str, "requestSync (2.0) - No TransferManager instance for macAddress[" + macAddress + "]");
            return;
        }
        DeviceProfile deviceProfileD = ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).x().d(macAddress);
        if (deviceProfileD == null) {
            i2.a.f(a2Var, str, "requestSync (1.0) - No connected DeviceProfile found for macAddress[" + macAddress + "]");
            return;
        }
        long f172494b = deviceProfileD.getF172494b();
        i2.a.b(a2Var, str, "requestSync (1.0) - macAddress[" + macAddress + "]");
        d.c(f172494b, true);
    }

    public static final void b(String str) {
        ArrayList<DeviceProfile> arrayListW = ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).w();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SYNC;
        String str2 = "requestUserAllDevicesSync - connected devices count = " + arrayListW.size();
        aVar.getClass();
        i2.a.b(a2Var, str, str2);
        for (DeviceProfile deviceProfile : arrayListW) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.SYNC;
            String str3 = "requestSync - macAddress[" + deviceProfile.getMacAddress() + "] DeviceProfile[" + deviceProfile + "]";
            aVar2.getClass();
            i2.a.b(a2Var2, str, str3);
            d.c(deviceProfile.getF172494b(), true);
        }
    }

    public static final void c(String str, SupportedCapability supportedCapability) {
        supportedCapability.getClass();
        ArrayList<DeviceProfile> arrayListW = ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).w();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SYNC;
        String str2 = "requestSyncFeatureByCapability - connected devices count = " + arrayListW.size();
        aVar.getClass();
        i2.a.b(a2Var, str, str2);
        for (DeviceProfile deviceProfile : arrayListW) {
            if (km2.a.i(deviceProfile.getF172494b(), null, supportedCapability.ordinal())) {
                if (!d(deviceProfile.getMacAddress())) {
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var2 = a2.SYNC;
                    String str3 = "requestSync - macAddress[" + deviceProfile.getMacAddress() + "] DeviceProfile[" + deviceProfile + "]";
                    aVar2.getClass();
                    i2.a.b(a2Var2, str, str3);
                    d.c(deviceProfile.getF172494b(), true);
                } else if (d.a.f199077a[supportedCapability.ordinal()] == 1) {
                    zb1.a aVar3 = (zb1.a) d.b(deviceProfile);
                    if (aVar3 != null) {
                        aVar3.c();
                    }
                } else {
                    i2.a aVar4 = i2.f36769a;
                    aVar4.getClass();
                    i2.a.b(a2.SYNC, str, "requestSyncFeatureByCapability - missing support for capability " + supportedCapability);
                }
            }
        }
    }

    public static final boolean d(String str) {
        w wVarA;
        return (str == null || (wVarA = ok2.a0.f132585h.a().a(str)) == null || !wVarA.l()) ? false : true;
    }

    public static final void e(e23.l lVar, long j8, String str) {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SYNC;
        aVar.getClass();
        i2.a.b(a2Var, str, "syncNow - deviceUnitId[" + j8 + "]");
        DeviceProfile deviceProfileA = d.a(j8);
        if (deviceProfileA == null) {
            i2.a.f(a2Var, str, a0.f(j8, "syncNow - No connected DeviceProfile found for deviceUnitId[", "]"));
            return;
        }
        String macAddress = deviceProfileA.getMacAddress();
        macAddress.getClass();
        f(macAddress, str, lVar);
    }

    public static final void f(String str, String str2, e23.l<? super al2.c, Unit> lVar) {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SYNC;
        aVar.getClass();
        i2.a.b(a2Var, str2, "syncNow - macAddress[" + str + "]");
        y.c cVar = y.f132805h;
        y.d dVar = y.d.FORCED;
        y yVarA = y.c.a(cVar, null, null, dVar, dVar, 3);
        i2.a.b(a2Var, str2, "syncNow - macAddress[" + str + "] syncOptions[" + yVarA + "]");
        w wVarA = ok2.a0.f132585h.a().a(str);
        if (wVarA != null) {
            wVarA.f(yVarA, new vq2.a(str2, 1, str, lVar));
            return;
        }
        i2.a.f(a2Var, str2, "syncNow - No TransferManager instance for macAddress[" + str + "]");
    }

    public static final void g(long j8, long j14, Context context, String str) {
        DeviceProfile deviceProfile;
        context.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SYNC;
        StringBuilder sbK = e0.k(j8, "triggerSyncForNewItemDownload - deviceId[", "] downloadBitMask[");
        sbK.append(j14);
        sbK.append("]");
        String string = sbK.toString();
        aVar.getClass();
        i2.a.b(a2Var, str, string);
        da2.b bVarX = ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).x();
        DeviceProfile[] deviceProfileArrA = bVarX.a(j8);
        DeviceProfile[] deviceProfileArrA2 = bVarX.a(j8);
        int length = deviceProfileArrA2.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                deviceProfile = null;
                break;
            }
            deviceProfile = deviceProfileArrA2[i14];
            if (deviceProfile.getConnectionType() == 2) {
                break;
            } else {
                i14++;
            }
        }
        if (deviceProfile == null) {
            int length2 = deviceProfileArrA.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length2) {
                    deviceProfile = null;
                    break;
                }
                deviceProfile = deviceProfileArrA[i15];
                if (deviceProfile.getConnectionType() == 1) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        if (deviceProfile == null) {
            i2.a aVar2 = i2.f36769a;
            aVar2.getClass();
            i2.a.f(a2.SYNC, str, "triggerSyncForNewItemDownload - No connected DeviceProfile found for deviceUnitId[" + j8 + "]");
            return;
        }
        String macAddress = deviceProfile.getMacAddress();
        macAddress.getClass();
        if (d(macAddress)) {
            y yVarA = y.c.a(y.f132805h, null, null, y.d.BLOCKED, y.d.FORCED, 19);
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.SYNC;
            aVar3.getClass();
            i2.a.b(a2Var2, str, "triggerSyncForNewItemDownload (2.0) - macAddress[" + macAddress + "] syncOptions[" + yVarA + "]");
            w wVarA = ok2.a0.f132585h.a().a(macAddress);
            if (wVarA != null) {
                wVarA.f(yVarA, new y01.k(str, 9));
                return;
            }
            i2.a.f(a2Var2, str, "triggerSyncForNewItemDownload (2.0) - No TransferManager instance for macAddress[" + macAddress + "]");
            return;
        }
        if (!hk0.e.f(context.getApplicationContext()).j(macAddress)) {
            i2.a aVar4 = i2.f36769a;
            aVar4.getClass();
            i2.a.b(a2.SYNC, str, "triggerSyncForNewItemDownload (1.0) - macAddress[" + macAddress + "] DeviceSyncService.requestSync()");
            ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).u();
            DeviceSyncService.d(j8, j14, context, macAddress);
            return;
        }
        i2.a aVar5 = i2.f36769a;
        aVar5.getClass();
        i2.a.b(a2.SYNC, str, "triggerSyncForNewItemDownload (1.0) - macAddress[" + macAddress + "] sendSystemEvent[NEW_DOWNLOAD_AVAILABLE]");
        ik0.d.a aVar6 = ik0.d.f93906a;
        vs2.k kVar = vs2.k.NEW_DOWNLOAD_AVAILABLE;
        aVar6.getClass();
        kVar.getClass();
        ge1.b.T(e1.f129333a, null, null, new ik0.c(context, macAddress, kVar, null, null), 3);
    }
}
