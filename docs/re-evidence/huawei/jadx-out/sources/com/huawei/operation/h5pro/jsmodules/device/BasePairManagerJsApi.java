package com.huawei.operation.h5pro.jsmodules.device;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcelable;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.devicepair.api.BasePairManagerApi;
import com.huawei.devicepair.api.PermissionsApi;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.cjk;
import defpackage.cjo;
import defpackage.eej;
import defpackage.ltd;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class BasePairManagerJsApi extends JsBaseModule {
    public static final String FROM_H5_KEY = "isFromH5";
    private static final Object LOCK = new Object();
    private static final String TAG = "BasePairManagerJsApi";
    private static final String TAG_RELEASE = "DEVMGR_BasePairManagerJsApi";
    public static final String UUID_LIST = "uuid_list";
    public static volatile boolean isOpen = false;
    private boolean isOobe;
    private Map<String, Set<Long>> mCallBacks;
    private final BroadcastReceiver mDeviceStateBroadcast = new BroadcastReceiver() { // from class: com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (context == null || intent == null) {
                LogUtil.j(BasePairManagerJsApi.TAG, "context or intent is null");
                return;
            }
            String action = intent.getAction();
            ReleaseLogUtil.c(BasePairManagerJsApi.TAG_RELEASE, "action : ", action);
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
                    if (!(parcelableExtra instanceof DeviceInfo)) {
                        LogUtil.e(BasePairManagerJsApi.TAG, "parcelableExtra is not deviceInfo");
                    } else {
                        BasePairManagerJsApi.this.dealDevice((DeviceInfo) parcelableExtra);
                    }
                } catch (ClassCastException unused) {
                    LogUtil.e(BasePairManagerJsApi.TAG, "dealStateChange ClassCastException");
                } catch (Exception unused2) {
                    LogUtil.e(BasePairManagerJsApi.TAG, "dealStateChange Exception");
                }
            }
        }
    };
    private String mTempMac;

    /* JADX INFO: Access modifiers changed from: private */
    public void dealDevice(DeviceInfo deviceInfo) {
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (TextUtils.isEmpty(deviceIdentify)) {
            LogUtil.j(TAG, "deviceId is null");
            return;
        }
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        LogUtil.a(TAG, "device: ", deviceInfo.getDeviceName(), " device state: ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
        synchronized (LOCK) {
            Set<Long> set = this.mCallBacks.get(deviceIdentify);
            if (set != null && !set.isEmpty()) {
                for (Long l : set) {
                    LogUtil.a(TAG, "callbackid: ", l);
                    onSuccessCallback(l.longValue(), getDeviceJson(deviceInfo));
                    if (deviceIdentify.equals(this.mTempMac)) {
                        if (deviceConnectState == 11) {
                            cjk.d().sendOobeStatus(deviceInfo);
                            this.isOobe = true;
                        } else {
                            this.isOobe = false;
                        }
                    }
                }
                if (deviceConnectState == 2 && deviceIdentify.equals(this.mTempMac) && this.mCallBacks.get(deviceIdentify) != null) {
                    this.mCallBacks.remove(deviceIdentify);
                    this.mTempMac = null;
                }
            }
        }
    }

    private String getDeviceJson(DeviceInfo deviceInfo) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deviceName", deviceInfo.getDeviceName());
            jSONObject.put("deviceId", deviceInfo.getDeviceIdentify());
            jSONObject.put(DevicePairUtils.DEVICE_CONNECT_STATE, deviceInfo.getDeviceConnectState());
            jSONObject.put(DevicePairUtils.DEVICE_FACTORY_RESET, deviceInfo.getDeviceFactoryReset());
            jSONObject.put(DevicePairUtils.DEVICE_EMUI_VERSION, deviceInfo.getEmuiVersion());
            jSONObject.put(DevicePairUtils.DEVICE_SPORT_VERSION, deviceInfo.getSportVersion());
            DeviceCapability deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify());
            jSONObject.put(DevicePairUtils.DEVICE_SMART_METER_VERSION, deviceCapabilityA != null ? deviceCapabilityA.getSmartWatchVersionTypeValue() : -1);
        } catch (JSONException unused) {
            LogUtil.e(TAG, "getDeviceJson is error");
        }
        return jSONObject.toString();
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        super.onCreate(h5ProBundle);
        this.mCallBacks = new HashMap();
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
            intentFilter.setPriority(800);
            BroadcastManagerUtil.c(this.mContext, this.mDeviceStateBroadcast, intentFilter, LocalBroadcast.f36595c, null);
        } catch (IllegalStateException unused) {
            LogUtil.e(TAG, "registerConnectStateBroadcast IllegalStateException");
        }
        ReleaseLogUtil.c(TAG_RELEASE, "enter onCreate");
        isOpen = true;
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        if (this.isOobe) {
            cjk.d().removeDevice(this.mTempMac);
        }
        cjk.d().onDestroyActivity();
        try {
            this.mContext.unregisterReceiver(this.mDeviceStateBroadcast);
        } catch (IllegalArgumentException unused) {
            LogUtil.e(TAG, "unregisterReceiver IllegalStateException");
        }
        this.mTempMac = null;
        isOpen = false;
        super.onDestroy();
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ltd.e().e(strArr, iArr);
    }

    @JavascriptInterface
    public void connectDevice(final long j, String str) {
        ReleaseLogUtil.c(TAG, "connectDevice callbackId ", Long.valueOf(j));
        BasePairManagerApi basePairManagerApiD = cjk.d();
        String deviceMac = DevicePairUtils.getDeviceMac(str);
        boolean zIsReconnect = DevicePairUtils.isReconnect(str);
        String devicePairInfo = DevicePairUtils.getDevicePairInfo(str);
        if (TextUtils.isEmpty(deviceMac) || TextUtils.isEmpty(devicePairInfo)) {
            onFailureCallback(j, "get deviceMac or pairInfo error");
            return;
        }
        this.mTempMac = deviceMac;
        setCallBack(deviceMac, j);
        basePairManagerApiD.connectDevice(this.mContext, deviceMac, zIsReconnect, devicePairInfo, new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                BasePairManagerJsApi.this.onFailureCallback(j, "permission error");
            }
        });
    }

    private void setCallBack(String str, long j) {
        synchronized (LOCK) {
            Map<String, Set<Long>> map = this.mCallBacks;
            if (map == null) {
                onFailureCallback(j, "get callback list is fail");
                return;
            }
            Set<Long> hashSet = map.get(str);
            if (hashSet == null) {
                hashSet = new HashSet<>(16);
            }
            hashSet.add(Long.valueOf(j));
            this.mCallBacks.put(str, hashSet);
        }
    }

    @JavascriptInterface
    public void disconnectDevice(final long j, String str) {
        ReleaseLogUtil.c(TAG, "disconnectDevice callbackId ", Long.valueOf(j));
        BasePairManagerApi basePairManagerApiD = cjk.d();
        String deviceMac = DevicePairUtils.getDeviceMac(str);
        boolean zIsDeleteDevice = DevicePairUtils.isDeleteDevice(str);
        String devicePairInfo = DevicePairUtils.getDevicePairInfo(str);
        if (TextUtils.isEmpty(deviceMac)) {
            LogUtil.j(TAG, "disconnectDevice, get deviceMac is error");
            onFailureCallback(j, "disconnectDevice is error");
            return;
        }
        basePairManagerApiD.disconnectDevice(deviceMac, devicePairInfo, zIsDeleteDevice, new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a(BasePairManagerJsApi.TAG, "disconnectDevice errorCode:", Integer.valueOf(i));
                if (i == -1) {
                    BasePairManagerJsApi.this.onFailureCallback(j, "disconnectDevice fail");
                } else {
                    BasePairManagerJsApi.this.onSuccessCallback(j);
                }
            }
        });
        synchronized (LOCK) {
            Set<Long> set = this.mCallBacks.get(deviceMac);
            if (set != null && !set.isEmpty() && this.mCallBacks.get(deviceMac) != null) {
                this.mCallBacks.remove(deviceMac);
            }
        }
    }

    @JavascriptInterface
    public void listDevice(long j, String str) {
        ReleaseLogUtil.c(TAG, "listDevice callbackId ", Long.valueOf(j));
        try {
            List<cjo> listListDevice = cjk.d().listDevice();
            if (CollectionUtils.a(listListDevice)) {
                ReleaseLogUtil.d(TAG_RELEASE, "listDevice connectedDevices isEmpty");
                onFailureCallback(j, "get listDevice is error");
                return;
            }
            String deviceType = DevicePairUtils.getDeviceType(str);
            if (TextUtils.isEmpty(deviceType)) {
                ReleaseLogUtil.d(TAG_RELEASE, "listDevice deviceType isEmpty");
                onSuccessCallback(j, listListDevice);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (cjo cjoVar : listListDevice) {
                LogUtil.j(TAG, cjoVar.e().f1630a, ":", cjoVar.e().f1632c);
                if (deviceType.equals(cjoVar.e().f1632c)) {
                    arrayList.add(cjoVar);
                }
                if (String.valueOf(OldToNewMotionPath.SPORT_TYPE_TREAD_MACHINE).equals(cjoVar.e().f1632c) && String.valueOf(96).equals(deviceType)) {
                    arrayList.add(cjoVar);
                }
            }
            ReleaseLogUtil.d(TAG_RELEASE, "listDevice resultList.size: ", Integer.valueOf(arrayList.size()));
            onSuccessCallback(j, arrayList);
        } catch (Exception e) {
            ReleaseLogUtil.d(TAG_RELEASE, "listDevice printStackTrace:", DfxUtils.d(Thread.currentThread(), e));
            onSuccessCallback(j, "[]");
        }
    }

    @JavascriptInterface
    public void jumpToScanActivity(long j, String str) {
        LogUtil.a(TAG, "enter jumpToScanActivity");
        String deviceUuid = DevicePairUtils.getDeviceUuid(str);
        if (TextUtils.isEmpty(deviceUuid)) {
            onFailureCallback(j, "param is invalid uuid is empty");
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(deviceUuid);
        Intent intent = new Intent();
        intent.setAction("com.huawei.ui.device.activity.adddevice.OneKeyScanActivity");
        intent.putStringArrayListExtra(UUID_LIST, arrayList);
        intent.setClassName(BaseApplication.getContext().getPackageName(), "com.huawei.ui.device.activity.adddevice.OneKeyScanActivity");
        this.mContext.startActivity(intent);
        onSuccessCallback(j);
    }

    @JavascriptInterface
    public void getOobePath(long j, String str) {
        ReleaseLogUtil.c(TAG, "getOobePath callbackId ", Long.valueOf(j));
        String oobePath = cjk.d().getOobePath(DevicePairUtils.getBluetoothName(str));
        if (TextUtils.isEmpty(oobePath)) {
            onFailureCallback(j, "getOobePath is error");
        } else {
            onSuccessCallback(j, oobePath);
        }
    }

    @JavascriptInterface
    public void sendDeclarationInfoList(long j, String str) {
        ReleaseLogUtil.c(TAG, "sendDeclarationInfoList callbackId ", Long.valueOf(j));
        BasePairManagerApi basePairManagerApiD = cjk.d();
        String deviceMac = DevicePairUtils.getDeviceMac(str);
        String commandList = DevicePairUtils.getCommandList(str);
        if (TextUtils.isEmpty(deviceMac) || TextUtils.isEmpty(commandList)) {
            LogUtil.j(TAG, "sendDeclarationInfoList, device mac or context is empty ");
            onFailureCallback(j, "sendDeclarationInfoList error");
        } else {
            basePairManagerApiD.sendDeclarationInfoList(deviceMac, commandList);
        }
    }

    @JavascriptInterface
    public void isSupportOobe(long j, String str) {
        ReleaseLogUtil.c(TAG, "connectDevice callbackId ", Long.valueOf(j));
    }

    @JavascriptInterface
    public void isSupportSyncAccount(long j, String str) {
        ReleaseLogUtil.c(TAG, "isSupportSyncAccount callbackId ", Long.valueOf(j));
        BasePairManagerApi basePairManagerApiD = cjk.d();
        String deviceMac = DevicePairUtils.getDeviceMac(str);
        if (TextUtils.isEmpty(deviceMac)) {
            LogUtil.j(TAG, "isSupportSyncAccount, device mac is empty ");
            onFailureCallback(j, "isSupportSyncAccount error");
        } else {
            onSuccessCallback(j, Boolean.valueOf(basePairManagerApiD.isSupportSyncAccount(deviceMac)));
        }
    }

    @JavascriptInterface
    public void syncAccount(long j, String str) {
        ReleaseLogUtil.c(TAG, "syncAccount callbackId ", Long.valueOf(j));
        cjk.d().syncAccount("", 1);
    }

    @JavascriptInterface
    public void isSupportHwSynergy(long j, String str) {
        ReleaseLogUtil.c(TAG, "isSupportHwSynergy callbackId ", Long.valueOf(j));
        BasePairManagerApi basePairManagerApiD = cjk.d();
        String deviceMac = DevicePairUtils.getDeviceMac(str);
        if (TextUtils.isEmpty(deviceMac)) {
            LogUtil.j(TAG, "isSupportHwSynergy, device mac is empty ");
            onFailureCallback(j, "isSupportSyncAccount error");
        } else {
            onSuccessCallback(j, Boolean.valueOf(basePairManagerApiD.isSupportHwSynergy(deviceMac)));
        }
    }

    @JavascriptInterface
    public void hwSynergy(long j, String str) {
        ReleaseLogUtil.c(TAG, "hwSynergy callbackId ", Long.valueOf(j));
        BasePairManagerApi basePairManagerApiD = cjk.d();
        String deviceMac = DevicePairUtils.getDeviceMac(str);
        String hwSynergyStatus = DevicePairUtils.getHwSynergyStatus(str);
        if (TextUtils.isEmpty(deviceMac) || TextUtils.isEmpty(hwSynergyStatus)) {
            LogUtil.j(TAG, "hwSynergy, deviceId or status is error");
            onFailureCallback(j, "get param error");
        } else {
            basePairManagerApiD.hwSynergy(deviceMac, Integer.parseInt(hwSynergyStatus));
        }
    }

    @JavascriptInterface
    public void requestPermissionsForPair(long j, String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            ReleaseLogUtil.b(TAG_RELEASE, "requestPermissionsForPair JSONException ", ExceptionUtils.c(e));
            jSONObject = null;
        }
        if (jSONObject == null) {
            ReleaseLogUtil.d(TAG_RELEASE, "requestPermissionsForPair jsonObject is null");
            onFailureCallback(j, "jsonObject is null", -1);
            return;
        }
        String strOptString = jSONObject.optString(MatterDataContans.KEY_MAC_ADDRESS);
        PermissionsApi permissionsApiA = cjk.a();
        JSONArray jSONArray = new JSONArray();
        Map<String, Boolean> mapRequestPermissionsForPair = permissionsApiA.requestPermissionsForPair(strOptString);
        if (mapRequestPermissionsForPair == null || mapRequestPermissionsForPair.isEmpty()) {
            ReleaseLogUtil.d(TAG_RELEASE, "requestPermissionsForPair permissionMap is error");
        } else {
            for (Map.Entry<String, Boolean> entry : mapRequestPermissionsForPair.entrySet()) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("permission", entry.getKey());
                    jSONObject2.put("status", entry.getValue());
                    jSONArray.put(jSONObject2);
                } catch (JSONException e2) {
                    ReleaseLogUtil.b(TAG_RELEASE, "requestPermissionsForPair permission JSONException ", ExceptionUtils.c(e2));
                }
            }
            if (jSONArray.length() == 0) {
                ReleaseLogUtil.d(TAG_RELEASE, "requestPermissionsForPair permissionArray is empty");
            }
        }
        LogUtil.a(TAG, "requestPermissionsForPair permissionArray:", jSONArray.toString());
        onSuccessCallback(j, jSONArray.toString());
    }

    @JavascriptInterface
    public void requestPermissionsGrantStatus(final long j, String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            ReleaseLogUtil.b(TAG_RELEASE, "requestPermissionsGrantStatus JSONException ", ExceptionUtils.c(e));
            jSONObject = null;
        }
        if (jSONObject == null) {
            ReleaseLogUtil.d(TAG_RELEASE, "requestPermissionsGrantStatus jsonObject is null");
            onFailureCallback(j, "jsonObject is null", -1);
            return;
        }
        String strOptString = jSONObject.optString("pairPermission");
        if (TextUtils.isEmpty(strOptString)) {
            LogUtil.j(TAG, "requestPermissionsGrantStatus permissionParam is error");
            onFailureCallback(j, "permissionParam is error", -1);
            return;
        }
        final List<String> list = (List) HiJsonUtil.d(strOptString, List.class);
        if (CollectionUtils.a(list)) {
            LogUtil.j(TAG, "requestPermissionsGrantStatus permissionList is empty");
            onFailureCallback(j, "permissionList is error", -1);
        } else {
            cjk.a().requestPermissionsGrantStatus(list, jSONObject.optString(MatterDataContans.KEY_MAC_ADDRESS), this.mContext, new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.j(BasePairManagerJsApi.TAG, "requestPermissionsGrantStatus errorCode:", Integer.valueOf(i), ", objectData:", obj);
                    if (i != -1) {
                        BasePairManagerJsApi.this.responseSuccess(j, obj, list);
                    } else {
                        ReleaseLogUtil.c(BasePairManagerJsApi.TAG_RELEASE, "responseSuccess errorCode -1");
                        BasePairManagerJsApi.this.onFailureCallback(j, "request error", -1);
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void permissionGrantRegisterContactObserver(long j, String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            ReleaseLogUtil.b(TAG_RELEASE, "permissionGrantRegisterContactObserver JSONException ", ExceptionUtils.c(e));
            jSONObject = null;
        }
        if (jSONObject == null) {
            ReleaseLogUtil.d(TAG_RELEASE, "permissionGrantRegisterContactObserver param is null");
            onFailureCallback(j, "param is null", -1);
        } else {
            cjk.a().permissionGrantRegisterContactObserver(jSONObject.optString(MatterDataContans.KEY_MAC_ADDRESS));
            onSuccessCallback(j, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void responseSuccess(long j, Object obj, List<String> list) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            int[] iArr = new int[map.size()];
            for (int i = 0; i < list.size(); i++) {
                Integer num = (Integer) map.get(list.get(i));
                if (num != null) {
                    iArr[i] = num.intValue();
                }
            }
            ReleaseLogUtil.c(TAG_RELEASE, "responseSuccess resultArray:", Arrays.toString(iArr));
            onSuccessCallback(j, iArr);
            return;
        }
        ReleaseLogUtil.c(TAG_RELEASE, "responseSuccess error");
        onFailureCallback(j, "request error", -1);
    }

    @JavascriptInterface
    public void isSupportKeepAlive(long j, String str) {
        ReleaseLogUtil.c(TAG, "isSupportKeepAlive callbackId ", Long.valueOf(j));
        onSuccessCallback(j, Boolean.valueOf(cjk.d().isSupportKeepAlive()));
    }

    @JavascriptInterface
    public void onSuccessPair(long j, String str) {
        ReleaseLogUtil.c(TAG, "onSuccessPair");
        cjk.d().onSuccessPair(this.mContext, DevicePairUtils.getDeviceMac(str));
    }

    @JavascriptInterface
    public void settingComplete(long j, String str) {
        ReleaseLogUtil.c(TAG, "enter settingComplete");
        Intent intent = new Intent();
        intent.setAction("com.huawei.health.action.PAIR_DEVICE_SUCCESS");
        intent.putExtra(FROM_H5_KEY, true);
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
    }

    @JavascriptInterface
    public void requestPermissionsForSOS(long j, String str) {
        JSONObject jSONObject;
        ReleaseLogUtil.c(TAG_RELEASE, "requestPermissionsForSOS  enter");
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            ReleaseLogUtil.b(TAG_RELEASE, "requestPermissionsForSOS JSONException ");
            jSONObject = null;
        }
        if (jSONObject == null) {
            onFailureCallback(j, "jsonObject is null", -1);
            return;
        }
        Map<String, Boolean> mapRequestPermissionsForSoS = cjk.a().requestPermissionsForSoS(jSONObject.optString(MatterDataContans.KEY_MAC_ADDRESS));
        JSONArray jSONArray = new JSONArray();
        if (!CollectionUtils.c(mapRequestPermissionsForSoS)) {
            for (Map.Entry<String, Boolean> entry : mapRequestPermissionsForSoS.entrySet()) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("permission", entry.getKey());
                    jSONObject2.put("status", entry.getValue());
                    jSONArray.put(jSONObject2);
                } catch (JSONException unused2) {
                    ReleaseLogUtil.b(TAG_RELEASE, "requestPermissionsForSOS permission JSONException");
                }
            }
        } else {
            LogUtil.a(TAG, "requestPermissionsForSOS permissionMap isEmpty");
        }
        LogUtil.a(TAG, "requestPermissionsForSOS permissionArray:", jSONArray.toString());
        onSuccessCallback(j, jSONArray.toString());
    }
}
