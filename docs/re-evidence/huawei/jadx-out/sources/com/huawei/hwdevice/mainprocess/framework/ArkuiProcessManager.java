package com.huawei.hwdevice.mainprocess.framework;

import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.device.api.PluginDeviceApi;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ecu;
import defpackage.eej;
import defpackage.eey;
import defpackage.lvb;
import defpackage.lvv;
import defpackage.mca;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public class ArkuiProcessManager {
    private static ArkuiProcessManager d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final BroadcastReceiver f17250b;
    private BindTargetCallback e;
    private Runnable k;
    private InvokeArkuiBridgeCallback n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f17249c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f17248a = new HashSet<String>() { // from class: com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.5
        {
            add("39.5");
        }
    };
    private Set<String> m = new HashSet();
    private Map<String, LinkedList<String>> g = new HashMap();
    private final Object h = new Object();
    private AtomicReference<Map.Entry<String, Object>> j = new AtomicReference<>();
    private Map<String, String> f = new HashMap();
    private Set<BaseResponseCallback<Map.Entry<String, String>>> i = new HashSet();

    /* JADX INFO: loaded from: classes38.dex */
    public interface BindTargetCallback {
        void onBindTarget(DeviceInfo deviceInfo, SimpleChain.Emitter emitter);

        void onDeviceConnectChanger(DeviceInfo deviceInfo);
    }

    /* JADX INFO: loaded from: classes38.dex */
    public interface ClickDevicePageMenuCallback {
        void onClickDevicePageMenu(DeviceInfo deviceInfo, SimpleChain.Emitter emitter);
    }

    public interface InvokeArkuiBridgeCallback {
        void deviceTabShow(boolean z);

        void getShownCurDevice();

        void onConnectDevice(String str);

        void onConnectDevicesFromNative();

        void onDataReceived(DeviceInfo deviceInfo, int i, int i2, byte[] bArr);

        void onDeviceDelete(String str, String str2);

        void onDiscoverSuccess(String str, int i, String str2, int i2);

        void onStatusChanger(DeviceInfo deviceInfo, int i);

        void onWspDataReceived(String str, String str2, String str3, byte[] bArr);

        void onWspStatusChanger(ContentValues contentValues, int i);

        void refreshByAccountChange(int i);

        void refreshDeviceSource();

        void scrollTo(int i);
    }

    /* JADX INFO: loaded from: classes38.dex */
    public interface TitlePositionUpdater {
        void updateSwitchTabPosition(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i) {
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    private int d(int i) {
        if (i == 9) {
            return 13;
        }
        if (i == 10) {
            return 14;
        }
        if (i == 15) {
            return 25;
        }
        if (i == 12) {
            return 15;
        }
        return i;
    }

    public boolean e(DeviceInfo deviceInfo) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(DeviceInfo deviceInfo) {
        return String.valueOf(deviceInfo.getLastConnectedTime()) + deviceInfo.getDeviceConnectState();
    }

    private ArkuiProcessManager() {
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                    try {
                        DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
                        if (deviceInfo == null) {
                            LogUtil.j("ArkuiCommandProcessMana", "deviceStatusChangeReceiver deviceInfo == null");
                            return;
                        }
                        int deviceConnectState = deviceInfo.getDeviceConnectState();
                        LogUtil.a("ArkuiCommandProcessMana", "switchDeviceHandler CONNECT_STATE = ", Integer.valueOf(deviceConnectState), " DeviceIdentify:", CommonUtil.n(deviceInfo.getDeviceIdentify()), " LastConnectedTime:", Long.valueOf(deviceInfo.getLastConnectedTime()));
                        String strA = ArkuiProcessManager.this.a(deviceInfo);
                        if (c(deviceInfo, deviceConnectState, strA)) {
                            return;
                        }
                        ArkuiProcessManager.this.g.remove(deviceInfo.getDeviceIdentify());
                        ArkuiProcessManager.this.d(deviceInfo, strA);
                    } catch (ClassCastException e) {
                        LogUtil.e("ArkuiCommandProcessMana", "DeviceInfo deviceInfo error :", e.getMessage());
                    }
                }
            }

            private boolean c(DeviceInfo deviceInfo, int i, String str) {
                LinkedList linkedList;
                if (!ArkuiProcessManager.this.a(i) || (linkedList = (LinkedList) ArkuiProcessManager.this.g.get(deviceInfo.getDeviceIdentify())) == null || !linkedList.removeFirstOccurrence(str)) {
                    return false;
                }
                LogUtil.a("ArkuiCommandProcessMana", "switchDeviceHandler removeFirstOccurrence");
                return true;
            }
        };
        this.f17250b = broadcastReceiver;
        this.k = new Runnable() { // from class: lui
            @Override // java.lang.Runnable
            public final void run() {
                ArkuiProcessManager.c().d((BaseResponseCallback<Map.Entry<String, String>>) null);
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.bone.action.BATTERY_LEVEL");
        BroadcastManagerUtil.d(BaseApplication.b(), broadcastReceiver, intentFilter);
    }

    public static ArkuiProcessManager c() {
        ArkuiProcessManager arkuiProcessManager;
        synchronized (f17249c) {
            if (d == null) {
                d = new ArkuiProcessManager();
            }
            arkuiProcessManager = d;
        }
        return arkuiProcessManager;
    }

    public void d(String str, int i, int i2, byte[] bArr, boolean z) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setmIdentify(str);
        deviceCommand.setServiceId(i);
        deviceCommand.setCommandId(i2);
        deviceCommand.setDataContent(bArr);
        deviceCommand.setDataLen(bArr.length);
        deviceCommand.setNeedEncrypt(z);
        lvb.e().c(deviceCommand);
        this.m.add(i + "." + i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DeviceInfo deviceInfo, String str) {
        InvokeArkuiBridgeCallback invokeArkuiBridgeCallback = this.n;
        if (invokeArkuiBridgeCallback != null) {
            if (this.f.containsKey(deviceInfo.getDeviceIdentify()) || e(deviceInfo)) {
                LogUtil.a("ArkuiCommandProcessMana", "dealDeviceConnectChanger entry");
                String str2 = this.f.get(deviceInfo.getDeviceIdentify());
                this.f.put(deviceInfo.getDeviceIdentify(), str);
                d(deviceInfo);
                invokeArkuiBridgeCallback.onStatusChanger(deviceInfo, d(deviceInfo.getDeviceConnectState()));
                if (str.equals(str2)) {
                    return;
                }
                LogUtil.a("ArkuiCommandProcessMana", "checkDealDeviceConnectChanger state is ", str, " lastState is ", str2);
                c(deviceInfo);
            }
        }
    }

    private void d(DeviceInfo deviceInfo) {
        i(deviceInfo);
    }

    private void c(DeviceInfo deviceInfo) {
        BindTargetCallback bindTargetCallback = this.e;
        if (bindTargetCallback != null) {
            bindTargetCallback.onDeviceConnectChanger(deviceInfo);
        }
        j(deviceInfo);
        b(deviceInfo);
    }

    private void b(DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceConnectState() != 2) {
            return;
        }
        DeviceCapability deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityA == null) {
            LogUtil.a("ArkuiCommandProcessMana", "getAlarmNumber capability is null");
            return;
        }
        if (!deviceCapabilityA.isEventAlarm()) {
            LogUtil.a("ArkuiCommandProcessMana", "Device is not support event alarm");
        } else if (eey.d(deviceInfo, 123)) {
            LogUtil.a("ArkuiCommandProcessMana", "Device is support obtain alarm number.");
            lvv.c(BaseApplication.b()).b(deviceInfo);
        } else {
            lvv.c(BaseApplication.b()).a(5);
        }
    }

    private void i(DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.a("ArkuiCommandProcessMana", "refreshWearCapability device is disconnected");
            return;
        }
        LogUtil.a("ArkuiCommandProcessMana", "refreshWearCapability entry");
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        Map<String, DeviceCapability> mapD = lvb.e().d(1, deviceIdentify, "ArkuiCommandProcessMana");
        if (mapD == null) {
            LogUtil.a("ArkuiCommandProcessMana", "refreshWearCapability map is null");
            return;
        }
        DeviceCapability deviceCapability = mapD.get(deviceIdentify);
        if (deviceCapability == null) {
            LogUtil.a("ArkuiCommandProcessMana", "refreshWearCapability deviceCapability is null");
        } else {
            LogUtil.a("ArkuiCommandProcessMana", "refreshWearCapability success");
            eej.a(deviceIdentify, deviceCapability);
        }
    }

    private void j(DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.a("ArkuiCommandProcessMana", "refreshWatchfaceInfo device is disconnected");
            return;
        }
        LogUtil.a("ArkuiCommandProcessMana", "refreshWatchfaceInfo entry");
        mca.a(BaseApplication.b());
        if (WatchFaceUtil.isSupportMyWatch(deviceInfo)) {
            LogUtil.a("ArkuiCommandProcessMana", "refreshWatchfaceInfo reload watchface params");
            WatchFaceManager.getInstance().refreshWatchFaceInfo(deviceInfo.getDeviceIdentify(), new ResponseCallback() { // from class: lud
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    LogUtil.a("ArkuiCommandProcessMana", "refreshWatchfaceInfo reload watchface params finish");
                }
            });
            WatchFaceManager.getInstance().getWearWatchInfoFromDevice(deviceInfo.getDeviceIdentify(), false, WatchFaceManager.WATCH_FACE_LOCAL_LIST_KEY_PREFIX, new ResponseCallback() { // from class: luc
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    LogUtil.a("ArkuiCommandProcessMana", "refreshWatchfaceInfo reload watchface list finish");
                }
            });
        }
    }

    private DeviceInfo e(String str) {
        List<DeviceInfo> deviceList;
        if (TextUtils.isEmpty(str) || (deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "ArkuiCommandProcessMana")) == null) {
            return null;
        }
        for (DeviceInfo deviceInfo : deviceList) {
            if (str.equals(deviceInfo.getDeviceIdentify())) {
                return deviceInfo;
            }
        }
        return null;
    }

    public void b(String str, int i, SimpleChain.Emitter emitter) {
        LogUtil.a("ArkuiCommandProcessMana", "bindTarget deviceId:", str, " linkLayerProtocol:", Integer.valueOf(i));
        if (c(str, emitter)) {
            return;
        }
        if (1 == i) {
            ((PluginDeviceApi) Services.b("PluginDevice", PluginDeviceApi.class)).connectScaleDevice(str);
            return;
        }
        DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE == null) {
            emitter.onError("bindTarget deviceInfo == null");
            return;
        }
        BindTargetCallback bindTargetCallback = this.e;
        if (bindTargetCallback != null) {
            bindTargetCallback.onBindTarget(deviceInfoE, emitter);
        }
    }

    private boolean c(String str, SimpleChain.Emitter emitter) {
        synchronized (this.h) {
            Map.Entry<String, Object> entry = this.j.get();
            if (entry != null && Objects.equals(entry.getKey(), str)) {
                String key = entry.getKey();
                BaseResponseCallback baseResponseCallback = null;
                if (entry.getValue() instanceof BaseResponseCallback) {
                    BaseResponseCallback baseResponseCallback2 = (BaseResponseCallback) entry.getValue();
                    this.j.set(null);
                    baseResponseCallback = baseResponseCallback2;
                } else {
                    this.j.set(new AbstractMap.SimpleEntry(key, emitter));
                }
                if (baseResponseCallback != null) {
                    baseResponseCallback.onResponse(0, key);
                    emitter.onSuccess(new Object[0]);
                }
                return true;
            }
            LogUtil.j("ArkuiCommandProcessMana", "setBindDeviceCallback entry == null or device not equals");
            return false;
        }
    }

    public void d(BaseResponseCallback<Map.Entry<String, String>> baseResponseCallback) {
        InvokeArkuiBridgeCallback invokeArkuiBridgeCallback = this.n;
        if (invokeArkuiBridgeCallback == null) {
            if (baseResponseCallback != null) {
                baseResponseCallback.onResponse(-1, null);
            }
        } else {
            invokeArkuiBridgeCallback.getShownCurDevice();
            if (baseResponseCallback != null) {
                this.i.add(baseResponseCallback);
            }
        }
    }

    public void d(final String str, final String str2, final String str3) {
        ((PluginDeviceApi) Services.b("PluginDevice", PluginDeviceApi.class)).sendWspData(str, str2, str3, new BaseResponseCallback() { // from class: lue
            @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f40833c.e(str, str2, str3, i, (byte[]) obj);
            }
        });
    }

    public /* synthetic */ void e(String str, String str2, String str3, int i, byte[] bArr) {
        InvokeArkuiBridgeCallback invokeArkuiBridgeCallback = this.n;
        if (invokeArkuiBridgeCallback != null) {
            invokeArkuiBridgeCallback.onWspDataReceived(str, str2, str3, bArr);
        }
    }
}
