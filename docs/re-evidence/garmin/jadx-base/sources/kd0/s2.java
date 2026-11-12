package kd0;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtoUtil;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestManager;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.gcsprotos.generated.FitnessDeviceProto;
import com.garmin.proto.generated.GDIAudioPromptsProto;
import com.garmin.proto.generated.GDISmartProto;
import java.util.ArrayList;
import java.util.Iterator;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/s2;", "Ll80/b;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s2 implements l80.b {
    @Override // l80.b
    public final boolean a(long j8) {
        return hk0.p.k(j8);
    }

    @Override // l80.b
    public final DeviceProfile b(long j8) {
        return hk0.p.b(j8);
    }

    @Override // l80.b
    public final void c(GDISmartProto.Smart smart, long j8, wm2.b bVar) {
        smart.getClass();
        ProtobufRequestManager.getInstance().initiateRequest(smart, j8, bVar);
    }

    @Override // l80.b
    public final void d(long j8) {
        hk0.d dVarH = hk0.d.h();
        dVarH.getClass();
        String strA = c22.u1.a(j8);
        if (strA == null) {
            dVarH.d(j8, "retrieveGarminDeviceXml");
            return;
        }
        if (TextUtils.isEmpty(strA)) {
            dVarH.c("retrieveGarminDeviceXml");
            return;
        }
        ea2.f fVar = (ea2.f) hk0.s.a().getCapability(strA, ea2.f.class);
        if (fVar != null) {
            DeviceProfile deviceProfileD = ((da2.b) hk0.s.a()).d(strA);
            if (deviceProfileD != null) {
                fVar.readGarminDeviceXml(new hk0.d.a(dVarH.f84094a, deviceProfileD));
                return;
            }
            com.garmin.android.apps.connectmobile.i2.i(dVarH.b(), "SyncListenerImpl is null for device mac address (" + strA + ")");
        }
    }

    @Override // l80.b
    public final boolean e(sd2.f fVar) {
        fVar.getClass();
        return hk0.p.m(fVar);
    }

    @Override // l80.b
    public final boolean f(String str) {
        return hk0.p.l(str);
    }

    @Override // l80.b
    public final void g(String str) {
        str.getClass();
        hk0.p.c().e(str);
    }

    @Override // l80.b
    public final <T> T getCapability(String str, Class<T> cls) {
        return (T) hk0.p.f().getCapability(str, cls);
    }

    @Override // l80.b
    public final boolean h(long j8) {
        return hk0.p.j(j8);
    }

    @Override // l80.b
    public final void i(long j8) {
        ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
        ProtoUtil.Companion companion = ProtoUtil.INSTANCE;
        GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
        builderNewBuilder.getClass();
        GDIAudioPromptsProto.AudioPromptsService.Builder audioSettingsUpdatedNotification = GDIAudioPromptsProto.AudioPromptsService.newBuilder().setAudioSettingsUpdatedNotification(GDIAudioPromptsProto.AudioSettingsUpdatedNotification.newBuilder());
        audioSettingsUpdatedNotification.getClass();
        GDISmartProto.Smart smartBuild = companion.setAudioPromptsService(builderNewBuilder, audioSettingsUpdatedNotification).build();
        smartBuild.getClass();
        protobufRequestManager.initiateNotification(smartBuild, j8);
    }

    @Override // l80.b
    public final void j() {
        if (hk0.p.f84079d != null) {
            new ArrayList();
        }
    }

    @Override // l80.b
    public final void k(String str, boolean z14) {
        str.getClass();
        hk0.p pVar = hk0.p.f84079d;
        hk0.p.c().c(new da2.a(str, true), z14);
    }

    @Override // l80.b
    public final wb2.x l(long j8) {
        hk0.p pVar = hk0.p.f84079d;
        if (pVar == null || !pVar.n()) {
            return null;
        }
        try {
            Iterator it = c22.u1.c(j8).iterator();
            while (it.hasNext()) {
                wb2.x xVarZ = hk0.p.f84079d.f84080a.z((String) it.next());
                if (xVarZ != null) {
                    return xVarZ;
                }
            }
            return null;
        } catch (RemoteException e4) {
            com.garmin.android.apps.connectmobile.i2.g(e4, "TMP#GFDIService");
            return null;
        }
    }

    @Override // l80.b
    public final void m() {
        hk0.p pVar = hk0.p.f84079d;
        com.garmin.android.apps.connectmobile.i2.n("TMP#GFDIService", "enableFriendlyBLEScan is deprecated");
    }

    @Override // l80.b
    public final void n(Context context, long j8, String str) {
        context.getClass();
        yr1.e.g(j8, -1L, context, str);
    }

    @Override // l80.b
    public final void o(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        str.getClass();
        bArr.getClass();
        bArr2.getClass();
        bArr3.getClass();
        hk0.p pVar = hk0.p.f84079d;
        hk0.p.c().c(new da2.a(str, bArr, bArr2, bArr3, true), false);
    }

    @Override // l80.b
    public final int p(String str, String str2) {
        str.getClass();
        str2.getClass();
        hk0.p pVar = hk0.p.f84079d;
        if (TextUtils.isEmpty(str)) {
            return -133;
        }
        if (da2.c.f58878b == null) {
            da2.c.f58878b = new da2.c();
        }
        da2.c cVar = da2.c.f58878b;
        Context context = GarminConnectMobileApp.f28688j;
        cVar.getClass();
        da2.d dVarC = da2.d.c(context);
        ea2.c cVar2 = (ea2.c) dVarC.getCapability(str, ea2.c.class);
        if (cVar2 == null) {
            return dVarC.a(str) != null ? 1 : 2;
        }
        cVar2.authenticateDevice(str2);
        return 0;
    }

    @Override // l80.b
    public final int q(String str) {
        hk0.p pVar = hk0.p.f84079d;
        if (TextUtils.isEmpty(str)) {
            return -133;
        }
        try {
            BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
            Logger logger = oa2.a.f131085a;
            if (remoteDevice != null) {
                try {
                    remoteDevice.getClass().getMethod("createBond", null).invoke(remoteDevice, null);
                } catch (Exception e4) {
                    oa2.a.f131085a.error(e4.getMessage(), (Throwable) e4);
                }
            }
            return 0;
        } catch (Exception unused) {
            return -132;
        }
    }

    @Override // l80.b
    public final void r() {
        if (hk0.p.f84079d != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(FitnessDeviceProto.MessageType.SETTINGS);
            arrayList.add(FitnessDeviceProto.MessageType.DEVICE_SETTINGS);
            arrayList.add(FitnessDeviceProto.MessageType.GOALS);
            arrayList.add(FitnessDeviceProto.MessageType.SPORTS);
            arrayList.add(FitnessDeviceProto.MessageType.USER_PROFILE);
            arrayList.add(FitnessDeviceProto.MessageType.ACTIVITIES);
            arrayList.add(FitnessDeviceProto.MessageType.PERSONAL_RECORDS);
            arrayList.add(FitnessDeviceProto.MessageType.GOLF_CLUB);
            arrayList.add(FitnessDeviceProto.MessageType.CHECK_BACK);
            arrayList.add(FitnessDeviceProto.MessageType.TRUE_UP);
            arrayList.add(FitnessDeviceProto.MessageType.SETTINGS_CHANGE);
            hk0.p.f84079d.getClass();
            new ArrayList(arrayList);
        }
    }

    @Override // l80.b
    public final void s(GDISmartProto.Smart smart, long j8) {
        smart.getClass();
        ProtobufRequestManager.getInstance().initiateNotification(smart, j8);
    }

    @Override // l80.b
    public final void t(long j8) {
        Iterator<String> it = hk0.p.e(j8).iterator();
        while (it.hasNext()) {
            hk0.p.c().e(it.next());
        }
    }

    @Override // l80.b
    public final void u() {
        GarminConnectMobileApp.f28685g.getClass();
        hk0.p.h(GarminConnectMobileApp.a.a());
    }

    @Override // l80.b
    public final boolean v(String str) {
        str.getClass();
        return hk0.p.c().h(str);
    }

    @Override // l80.b
    public final ArrayList w() {
        return hk0.p.d();
    }

    @Override // l80.b
    public final da2.b x() {
        da2.b bVarF = hk0.p.f();
        bVarF.getClass();
        return bVarF;
    }

    @Override // l80.b
    public final void y() {
        hk0.p pVar = hk0.p.f84079d;
        com.garmin.android.apps.connectmobile.i2.n("TMP#GFDIService", "enableAggressiveBLEScan is deprecated");
    }

    @Override // l80.b
    public final void z() {
        GarminConnectMobileApp.f28685g.getClass();
        hk0.p.g(GarminConnectMobileApp.a.a());
    }
}
