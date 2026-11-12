package defpackage;

import com.huawei.devicesdk.callback.DeviceStatusChangeCallback;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.health.ecologydevice.callback.ConnectStatusCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.constant.ConnectState;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class eff implements DeviceStatusChangeCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<String, ConnectStatusCallback> f32867c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32868a;

    public eff(String str) {
        this.f32868a = str;
    }

    @Override // com.huawei.devicesdk.callback.DeviceStatusChangeCallback
    public void onConnectStatusChanged(DeviceInfo deviceInfo, int i, int i2) {
        LogUtil.a("EcologyDevice_ThirdPartyDeviceStatusChangeCallback", "onUdsConnectStatusChanged status:", Integer.valueOf(i), " errCode:", Integer.valueOf(i2));
        emk.c().e(i);
        ConnectState connectState = ConnectState.getConnectState(i);
        ConnectStatusCallback connectStatusCallback = f32867c.get(this.f32868a);
        if (connectStatusCallback != null) {
            if (connectState == ConnectState.CONNECTED) {
                connectStatusCallback.doDeviceConnected(i, deviceInfo);
                enm.b(deviceInfo.getDeviceMac(), 1);
                return;
            } else if (connectState == ConnectState.DISCONNECTED) {
                connectStatusCallback.doDeviceDisconnect(i);
                enm.b(deviceInfo.getDeviceMac(), 0);
                return;
            } else if (connectState == ConnectState.CONNECTING) {
                connectStatusCallback.doDeviceConnecting(i);
                return;
            } else {
                LogUtil.j("EcologyDevice_ThirdPartyDeviceStatusChangeCallback", "onConnectStatusChanged State is unknown");
                return;
            }
        }
        LogUtil.j("EcologyDevice_ThirdPartyDeviceStatusChangeCallback", "ConnectStatusCallback is null");
    }

    public static void b(String str, ConnectStatusCallback connectStatusCallback) {
        f32867c.put(str, connectStatusCallback);
    }

    public static void a() {
        f32867c.clear();
    }

    public static int b() {
        Map<String, ConnectStatusCallback> map = f32867c;
        if (map == null) {
            return 0;
        }
        return map.size();
    }
}
