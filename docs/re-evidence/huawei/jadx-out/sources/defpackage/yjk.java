package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.callback.DeviceStatusCallback;
import com.huawei.datatype.DeviceStatusParam;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.wearengine.core.device.PowerModeChangeManager;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.monitor.MonitorMessage;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class yjk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f53507a;
    private HandlerThread d;
    private Handler e;

    private yjk() {
        this.f53507a = new ConcurrentHashMap();
        LogUtil.a("WearEngine_ConnectionStatusHandleManager", "enter ConnectionStatusHandleManager");
        c();
    }

    static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final yjk f53509c = new yjk();
    }

    public static yjk d() {
        return c.f53509c;
    }

    private void c() {
        HandlerThread handlerThread = new HandlerThread("SaveDeviceCapabilityThread");
        this.d = handlerThread;
        handlerThread.start();
        if (this.d.getLooper() == null) {
            LogUtil.j("WearEngine_ConnectionStatusHandleManager", "initHandler mSaveCapabilityThread getLooper is null!");
        } else {
            this.e = new Handler(this.d.getLooper()) { // from class: yjk.3
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    super.handleMessage(message);
                    yjk.this.a(message);
                }
            };
        }
    }

    private void e(DeviceInfo deviceInfo) {
        LogUtil.a("WearEngine_ConnectionStatusHandleManager", "onReceive connectState device: ", CommonUtil.n(deviceInfo.getDeviceIdentify()), ", connectState: ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
        Message messageObtain = Message.obtain();
        messageObtain.what = 1000;
        messageObtain.obj = deviceInfo;
        this.e.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        if (message.what == 1000) {
            DeviceInfo deviceInfo = message.obj instanceof DeviceInfo ? (DeviceInfo) message.obj : null;
            if (deviceInfo == null) {
                LogUtil.e("WearEngine_ConnectionStatusHandleManager", "handleDeviceStateChangeMessage deviceInfo is null");
                return;
            }
            if (deviceInfo.getDeviceConnectState() == 2) {
                yie.b();
                ykx.l(deviceInfo);
            }
            boolean zJ = ykx.j(deviceInfo);
            if (zJ && deviceInfo.getDeviceConnectState() == 3) {
                yie.e(deviceInfo);
                ykx.c(deviceInfo);
            }
            yih.b().a(deviceInfo);
            c(deviceInfo);
            a(deviceInfo, zJ);
            e(deviceInfo, zJ);
        }
    }

    private void a(DeviceInfo deviceInfo, boolean z) {
        if (deviceInfo.getDeviceConnectState() == 2 || deviceInfo.getDeviceConnectState() == 3) {
            Device deviceI = ykx.i(deviceInfo);
            if (!z && deviceI == null) {
                LogUtil.e("WearEngine_ConnectionStatusHandleManager", "handleDeviceStateChangeMessage hiWearDevice is null");
                return;
            }
            int deviceConnectState = z ? 5 : deviceInfo.getDeviceConnectState();
            String uuid = TextUtils.isEmpty(deviceInfo.getDeviceUdid()) ? deviceInfo.getUuid() : deviceInfo.getDeviceUdid();
            int productType = deviceI != null ? deviceI.getProductType() : -1;
            LogUtil.d("WearEngine_ConnectionStatusHandleManager", "monitorReceiverOnChanged reportDeviceId: ", uuid, ", Identify: ", deviceInfo.getDeviceIdentify());
            if (deviceInfo.getDeviceConnectState() == 2) {
                d(deviceInfo, uuid, productType);
            }
            b(deviceConnectState, uuid, productType);
        }
    }

    private boolean d(DeviceInfo deviceInfo, String str, int i) {
        if (!a(deviceInfo)) {
            return false;
        }
        if (ykx.g(deviceInfo)) {
            LogUtil.a("WearEngine_ConnectionStatusHandleManager", "handleDevicePowerModeChanged GalileoDevice cant report EVENT_POWER_MODE");
            return false;
        }
        PowerModeChangeManager.a().c();
        if (yht.d().b() == null) {
            LogUtil.j("WearEngine_ConnectionStatusHandleManager", "handleDevicePowerModeChanged monitorCallback is null");
            return true;
        }
        try {
            yht.d().b().onChanged(0, new MonitorMessage().setMonitorItemType("powerMode").setDeviceId(str).setProductType(i).setIntData(ykx.b(deviceInfo)));
            LogUtil.a("WearEngine_ConnectionStatusHandleManager", "handleDevicePowerModeChanged notify ok.");
        } catch (RemoteException unused) {
            LogUtil.e("WearEngine_ConnectionStatusHandleManager", "handleDevicePowerModeChanged RemoteException.");
        } catch (Exception unused2) {
            LogUtil.e("WearEngine_ConnectionStatusHandleManager", "handleDevicePowerModeChanged send EventMessage failed.");
        }
        return true;
    }

    private boolean a(DeviceInfo deviceInfo) {
        Integer num;
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        boolean z = false;
        if (deviceIdentify == null) {
            LogUtil.j("WearEngine_ConnectionStatusHandleManager", "isPowerModeChanged deviceIdentify is null");
            return false;
        }
        if (this.f53507a.containsKey(deviceIdentify) && (num = this.f53507a.get(deviceIdentify)) != null && num.intValue() != deviceInfo.getPowerSaveModel()) {
            z = true;
        }
        if (!this.f53507a.containsKey(deviceIdentify) || z) {
            this.f53507a.put(deviceIdentify, Integer.valueOf(deviceInfo.getPowerSaveModel()));
        }
        LogUtil.a("WearEngine_ConnectionStatusHandleManager", "isPowerModeChanged result ", Boolean.valueOf(z));
        return z;
    }

    private void b(int i, String str, int i2) {
        try {
            if (yht.d().b() == null) {
                LogUtil.j("WearEngine_ConnectionStatusHandleManager", "handleConnectionStatusChanged monitorCallback is null");
            } else {
                yht.d().b().onChanged(0, new MonitorMessage().setMonitorItemType("connectionStatus").setDeviceId(str).setProductType(i2).setIntData(i));
                LogUtil.a("WearEngine_ConnectionStatusHandleManager", "handleConnectionStatusChanged notify ok.");
            }
        } catch (RemoteException unused) {
            LogUtil.e("WearEngine_ConnectionStatusHandleManager", "handleConnectionStatusChanged RemoteException.");
        } catch (Exception unused2) {
            LogUtil.e("WearEngine_ConnectionStatusHandleManager", "handleConnectionStatusChanged send EventMessage failed.");
        }
    }

    private void e(DeviceInfo deviceInfo, boolean z) {
        String str;
        if (!ykx.e("com.huawei.action.NOTIFICATION_DECISION_CENTER")) {
            LogUtil.a("WearEngine_ConnectionStatusHandleManager", "handleNotificationCoordinationMsg provider not support");
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 2 || deviceInfo.getDeviceConnectState() == 3) {
            boolean zD = eey.d(deviceInfo, Constants.MAX_PRO_BOTTOM_MARGIN_PAD);
            int deviceConnectState = z ? 5 : deviceInfo.getDeviceConnectState();
            LogUtil.a("WearEngine_ConnectionStatusHandleManager", "handleNotificationCoordinationMsg connectState: " + deviceConnectState);
            if (deviceConnectState != 5 && !zD) {
                LogUtil.a("WearEngine_ConnectionStatusHandleManager", "handleNotificationCoordinationMsg device not support");
                return;
            }
            if (deviceConnectState == 2) {
                str = "com.huawei.wearengine.NotificationCoordination.add";
            } else if (deviceConnectState == 3) {
                str = "com.huawei.wearengine.NotificationCoordination.update";
            } else if (deviceConnectState != 5) {
                return;
            } else {
                str = "com.huawei.wearengine.NotificationCoordination.delete";
            }
            yjs yjsVarD = yjs.d();
            if (yjsVarD == null) {
                LogUtil.j("WearEngine_ConnectionStatusHandleManager", "handleNotificationCoordinationMsg instance is null");
            } else {
                yjsVarD.c(str, deviceInfo);
            }
        }
    }

    private void c(DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceConnectState() == 2 || deviceInfo.getDeviceConnectState() == 3) {
            boolean[] zArr = {false, false, false, false};
            for (DeviceInfo deviceInfo2 : ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "WearEngine_ConnectionStatusHandleManager")) {
                if (deviceInfo2 != null) {
                    d(zArr, 0, deviceInfo2);
                    if (ykx.f(deviceInfo2)) {
                        if (!zArr[1]) {
                            zArr[1] = true;
                        }
                        d(zArr, 2, deviceInfo2);
                        d(zArr, deviceInfo2);
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isHasConnectedWearDevice", zArr[0]);
                jSONObject.put("isHasSupportHiWearDevice", zArr[1]);
                jSONObject.put("isHasAvailableDevice", zArr[2]);
                jSONObject.put("isHasSupportCommonDevice", zArr[3]);
                SharedPreferenceManager.c(String.valueOf(53), "key_wearEngine_device", jSONObject.toString());
                LogUtil.a("WearEngine_ConnectionStatusHandleManager", "updateContentProviderData setWearEngineDevice done");
            } catch (JSONException unused) {
                LogUtil.e("WearEngine_ConnectionStatusHandleManager", "updateContentProviderData setWearEngineDevice has an JSONException");
            }
            try {
                BaseApplication.getContext().getContentResolver().notifyChange(Uri.parse("content://com.huawei.healthcloud.health.provider/wear_device_state"), null);
            } catch (Exception unused2) {
                LogUtil.e("WearEngine_ConnectionStatusHandleManager", "notifyChange has an Exception");
            }
        }
    }

    private void d(boolean[] zArr, int i, DeviceInfo deviceInfo) {
        if (zArr[i] || deviceInfo.getDeviceConnectState() != 2) {
            return;
        }
        zArr[i] = true;
    }

    private void d(boolean[] zArr, DeviceInfo deviceInfo) {
        if (zArr[3] || !ykx.b(deviceInfo, true)) {
            return;
        }
        zArr[3] = true;
    }

    public void a() {
        mjn.d("WearEngine", new DeviceStatusCallback() { // from class: yji
            @Override // com.huawei.callback.DeviceStatusCallback
            public final void onDeviceConnectedChanged(DeviceInfo deviceInfo, int i, DeviceStatusParam deviceStatusParam) {
                this.e.b(deviceInfo, i, deviceStatusParam);
            }
        });
    }

    /* synthetic */ void b(DeviceInfo deviceInfo, int i, DeviceStatusParam deviceStatusParam) {
        LogUtil.a("WearEngine_ConnectionStatusHandleManager", "enter ConnectionChangeListener");
        if (deviceInfo == null) {
            LogUtil.e("WearEngine_ConnectionStatusHandleManager", "onConnectionChange deviceInfo is null");
        } else {
            e(deviceInfo);
        }
    }
}
