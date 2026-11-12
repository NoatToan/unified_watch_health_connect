package com.huawei.operation.h5pro.jsmodules;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcelable;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.fitnessadvice.api.FitnessAdviceApi;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcloudmodel.healthdatacloud.model.BindDeviceReq;
import com.huawei.hwcloudmodel.model.userprofile.BindDeviceRsp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.db.bean.EventMonitorRecord;
import com.huawei.openalliance.ad.db.bean.IntentDataRecord;
import com.huawei.operation.adapter.PluginOperationAdapter;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.jsmodules.fallDetection.FallDetectionConstant;
import com.huawei.operation.h5pro.jsmodules.fallDetection.FallDetectionUtil;
import com.huawei.operation.h5pro.jsmodules.gesture.SmartGestureConstant;
import com.huawei.operation.h5pro.jsmodules.gesture.SmartGestureUtil;
import com.huawei.operation.operation.PluginOperation;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.pluginbase.PluginBaseAdapter;
import com.huawei.unitedevice.manager.SampleEventCache;
import defpackage.dfp;
import defpackage.dyb;
import defpackage.ecu;
import defpackage.edc;
import defpackage.eec;
import defpackage.eee;
import defpackage.eef;
import defpackage.eeg;
import defpackage.eeq;
import defpackage.eet;
import defpackage.eeu;
import defpackage.eew;
import defpackage.eey;
import defpackage.fej;
import defpackage.lqo;
import defpackage.lsy;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Device extends JsBaseModule {
    private static final int ACTION_MODIFY = 1;
    private static final int ACTION_QUERY = 2;
    private static final String CLOUD_CONFIG_ID = "com.huawei.health_deviceFeature_config";
    private static final int CONVERT_RADIX_10 = 10;
    private static final long DEFAULT_CALLBACK_ID = -1;
    private static final int DEVICE_STATUS_ACTIVE = 0;
    private static final int DEVICE_STATUS_CONNECTED = 1;
    private static final String JSON_KEY_ANALYSIS_TYPE = "analysisType";
    private static final String KEY_SWITCH_KEYS = "switchKeys";
    private static final Object ON_WAIT_LOCK = new Object();
    private static final int RETURN_ANALYSIS_TYPE_MAP = 1;
    private static final int RETURN_ANALYSIS_TYPE_SWITCH = 0;
    private static final int TIMEOUT_MS = 5000;
    private edc mCommandProxy;
    private long mConnectListenerId;
    private Map<String, Set<Long>> mOnWaitCallbacks;
    private final BroadcastReceiver mConnectListener = new BroadcastReceiver() { // from class: com.huawei.operation.h5pro.jsmodules.Device.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.a(Device.this.TAG, "ConnectListener Intent input is null, receive content ignored");
                return;
            }
            Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
            if (!(parcelableExtra instanceof DeviceInfo)) {
                LogUtil.a(Device.this.TAG, "ConnectListener DeviceInfo input is null, receive content ignored");
                return;
            }
            DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
            String deviceIdentify = deviceInfo.getDeviceIdentify();
            if (TextUtils.isEmpty(deviceIdentify)) {
                LogUtil.j(Device.this.TAG, "ConnectListener Empty deviceIdentify");
                return;
            }
            int deviceConnectState = deviceInfo.getDeviceConnectState();
            LogUtil.a(Device.this.TAG, "ConnectListener Connecting state just changed to: ", Integer.valueOf(deviceConnectState));
            Device.this.callbackConnectListener(deviceInfo);
            synchronized (Device.ON_WAIT_LOCK) {
                Set set = (Set) Device.this.mOnWaitCallbacks.get(deviceIdentify);
                if (set != null && !set.isEmpty()) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        Device.this.onSuccessCallback(((Long) it.next()).longValue(), Integer.valueOf(deviceConnectState));
                    }
                    Device.this.mOnWaitCallbacks.remove(deviceIdentify);
                }
            }
        }
    };
    private long mGestureCallbackId = -1;
    private long mFallDetectionCallbackId = -1;
    private final BroadcastReceiver mSmartGestureBroadCast = new BroadcastReceiver() { // from class: com.huawei.operation.h5pro.jsmodules.Device.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j(Device.this.TAG, "intent is null");
                return;
            }
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                LogUtil.j(Device.this.TAG, "smartGestureRefreshStatus intent is null");
                return;
            }
            LogUtil.a(Device.this.TAG, "smartGestureRefreshStatus intent is ", action);
            if (!SmartGestureConstant.ACTION_SMART_GESTURE_STATUS.equals(action)) {
                LogUtil.j(Device.this.TAG, "smartGestureRefreshStatus action do not match");
                return;
            }
            if (Device.this.mGestureCallbackId == -1) {
                LogUtil.j(Device.this.TAG, "smartGestureRefreshStatus mGestureCallbackId is -1");
                return;
            }
            boolean zIsSmartGestureOpen = SmartGestureUtil.isSmartGestureOpen();
            LogUtil.a(Device.this.TAG, "smartGestureRefreshStatus status is ", Integer.valueOf(zIsSmartGestureOpen ? 1 : 0), "mGestureCallbackId is ", Long.valueOf(Device.this.mGestureCallbackId));
            Device device = Device.this;
            device.onSuccessCallback(device.mGestureCallbackId, Integer.valueOf(zIsSmartGestureOpen ? 1 : 0));
        }
    };
    private final BroadcastReceiver mFallDetectionBroadCast = new BroadcastReceiver() { // from class: com.huawei.operation.h5pro.jsmodules.Device.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j(Device.this.TAG, "intent is null");
                return;
            }
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                LogUtil.j(Device.this.TAG, "mFallDetectionBroadCast intent is null");
                return;
            }
            LogUtil.a(Device.this.TAG, "mFallDetectionBroadCast intent is ", action);
            if (!FallDetectionConstant.ACTION_FALL_DETECTION_STATUS.equals(action)) {
                LogUtil.j(Device.this.TAG, "mFallDetectionBroadCast action do not match");
                return;
            }
            if (Device.this.mFallDetectionCallbackId == -1) {
                LogUtil.j(Device.this.TAG, "mFallDetectionBroadCast mGestureCallbackId is -1");
                return;
            }
            int intExtra = intent.getIntExtra(FallDetectionConstant.EXTRA_FALL_DETECTION_SWITCH, 0);
            LogUtil.j(Device.this.TAG, "mFallDetectionBroadCast extra is ", Integer.valueOf(intExtra));
            Device device = Device.this;
            device.onSuccessCallback(device.mFallDetectionCallbackId, Integer.valueOf(intExtra));
        }
    };

    /* JADX INFO: loaded from: classes41.dex */
    public enum SampleEventResult {
        SUCCESS_NOTIFICATION(0, "Notification send successfully"),
        DEVICE_STATUS_UNCONNECTED(1, "Device is unconnected"),
        BLUETOOTH_STATUS_UNCONNECTED(2, "Bluetooth is unconnected"),
        FAIL_IN_ORDER_SCENE(3, "Notification sent failed in order scene");

        private final int code;
        private final String desc;

        SampleEventResult(int i, String str) {
            this.code = i;
            this.desc = str;
        }

        public int getCode() {
            return this.code;
        }

        public String getDesc() {
            return this.desc;
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        super.onCreate(h5ProBundle);
        this.mCommandProxy = edc.e();
        this.mOnWaitCallbacks = new HashMap();
        BroadcastManagerUtil.c(this.mContext, this.mConnectListener, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
        SmartGestureUtil.registerLocalBroadcast(this.mSmartGestureBroadCast);
        FallDetectionUtil.registerLocalBroadcast(this.mFallDetectionBroadCast);
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        this.mContext.unregisterReceiver(this.mConnectListener);
        SmartGestureUtil.unRegisterLocalBroadcast(this.mSmartGestureBroadCast);
        FallDetectionUtil.unRegisterLocalBroadcast(this.mFallDetectionBroadCast);
        super.onDestroy();
    }

    @JavascriptInterface
    public void isSupportDeviceCapability(final long j, String str) {
        try {
            LogUtil.a(this.TAG, "isSupportDeviceCapability start: " + str);
            JSONObject jSONObject = new JSONObject(str);
            final int iOptInt = jSONObject.optInt("capability", -1);
            final int iOptInt2 = jSONObject.optInt("deviceStatus", 0);
            if (iOptInt == -1) {
                LogUtil.j(this.TAG, "isSupportDeviceCapability param capability is null");
                onFailureCallback(j, "param capability is null");
            }
            lsy.a(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.Device.4
                @Override // java.lang.Runnable
                public void run() {
                    GetDeviceInfoMode getDeviceInfoMode;
                    ecu ecuVarD = ecu.d();
                    if (iOptInt2 == 1) {
                        getDeviceInfoMode = GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70;
                    } else {
                        getDeviceInfoMode = GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70;
                    }
                    DeviceInfo deviceInfo = ecuVarD.getDeviceInfo(getDeviceInfoMode, null, Device.this.TAG);
                    if (deviceInfo == null) {
                        LogUtil.j(Device.this.TAG, "isSupportDeviceCapability currentDeviceInfo is null");
                        Device.this.onFailureCallback(j, "currentDeviceInfo is null");
                        return;
                    }
                    boolean zD = eey.d(deviceInfo, iOptInt);
                    LogUtil.a(Device.this.TAG, "isSupportDeviceCapability end isSupport: " + zD);
                    Device.this.onSuccessCallback(j, Boolean.valueOf(zD));
                }
            });
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "isSupportDeviceCapability JSONException", e.getMessage());
            onFailureCallback(j, "parse param err");
        }
    }

    @JavascriptInterface
    public void sendSampleConfigCommand(long j, String str) {
        LogUtil.a(this.TAG, "start sendSampleConfigCommand");
        eef eefVarStructSampleConfig = structSampleConfig(str);
        if (eefVarStructSampleConfig == null) {
            LogUtil.a(this.TAG, "sendSampleConfigCommand: Input SampleConfig with invalid params");
            onFailureCallback(j, "SampleConfig with invalid params");
            return;
        }
        String srcPkgName = eefVarStructSampleConfig.getSrcPkgName();
        eeg eegVar = eefVarStructSampleConfig.getConfigInfoList().get(0);
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, this.TAG);
        long jC = eegVar.c();
        if (eegVar.d() == 1 && (jC == 900300005 || jC == 900300010)) {
            LogUtil.a(this.TAG, "enter modify");
            sendSetCommand(eefVarStructSampleConfig, eegVar, deviceInfo, j, jC);
            return;
        }
        if (eegVar.d() != 2) {
            if (this.mCommandProxy.sendSampleConfigCommand(deviceInfo, eefVarStructSampleConfig, this.TAG)) {
                onSuccessCallback(j, "Command send successful");
                return;
            } else {
                onFailureCallback(j, "Command send failed");
                return;
            }
        }
        if (jC == 900300006 || jC == 900300010) {
            LogUtil.a(this.TAG, "enter QUERY");
            getActiveStatus(eefVarStructSampleConfig, deviceInfo, j);
            return;
        }
        int analysisType = getAnalysisType(str);
        LogUtil.a(this.TAG, "sendSampleConfigCommand: Prepare to listen the receive of query, analysisType=", Integer.valueOf(analysisType));
        if (analysisType == -1) {
            onFailureCallback(j, "Incorrect analysisType");
            return;
        }
        this.mCommandProxy.registerDeviceSampleListener(srcPkgName, receiveConfigCallback(j, srcPkgName, analysisType));
        if (this.mCommandProxy.sendSampleConfigCommand(deviceInfo, eefVarStructSampleConfig, this.TAG)) {
            return;
        }
        this.mCommandProxy.unRegisterDeviceSampleListener(srcPkgName);
        onFailureCallback(j, "Command send failed");
    }

    private void sendSetCommand(eef eefVar, eeg eegVar, DeviceInfo deviceInfo, long j, long j2) {
        if (j2 == 900300005) {
            if (this.mCommandProxy.sendSampleConfigCommand(deviceInfo, eefVar, this.TAG)) {
                dyb.e(eegVar, getTlvValues(eefVar), "authoricationSwitch");
                onSuccessCallback(j, "Command send successful");
                return;
            } else {
                onFailureCallback(j, "Command send failed");
                return;
            }
        }
        if (j2 == 900300010) {
            if (this.mCommandProxy.sendSampleConfigCommand(deviceInfo, eefVar, this.TAG)) {
                dyb.e(eegVar, getTlvValues(eefVar), "pwvActiveSwitch");
                onSuccessCallback(j, "Command send successful");
            } else {
                onFailureCallback(j, "Command send failed");
            }
        }
    }

    private void getActiveStatus(eef eefVar, DeviceInfo deviceInfo, long j) {
        long jC = eefVar.getConfigInfoList().get(0).c();
        if (jC == 900300006) {
            getEcgStatus(deviceInfo, j);
        } else if (jC == 900300010) {
            getPwvStatus(deviceInfo, j);
        }
    }

    private void getEcgStatus(DeviceInfo deviceInfo, final long j) {
        dyb.a(deviceInfo, new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.Device.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a(Device.this.TAG, "errorcode ecg: ", Integer.valueOf(i));
                if (i != 0 || !(obj instanceof Integer)) {
                    Device.this.onFailureCallback(j, "get status is error");
                    return;
                }
                Integer num = (Integer) obj;
                num.intValue();
                LogUtil.a(Device.this.TAG, "status ecg: ", num);
                Device.this.onSuccessCallback(j, num);
            }
        });
    }

    private void getPwvStatus(DeviceInfo deviceInfo, final long j) {
        dyb.e(deviceInfo, new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.Device.6
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a(Device.this.TAG, "errorcode Pwv: ", Integer.valueOf(i));
                if (i != 0 || !(obj instanceof Integer)) {
                    Device.this.onFailureCallback(j, "get status is error");
                    return;
                }
                Integer num = (Integer) obj;
                num.intValue();
                LogUtil.a(Device.this.TAG, "status Pwv: ", num);
                Device.this.onSuccessCallback(j, num);
            }
        });
    }

    private int getTlvValues(eef eefVar) {
        int iV = -1;
        try {
            for (eew eewVar : new eet().b(eeq.e(eefVar.getConfigInfoList().get(0).e())).e()) {
                if (CommonUtil.v(eewVar.e()) == 1) {
                    iV = CommonUtil.v(eewVar.b());
                    break;
                }
            }
            LogUtil.d(this.TAG, "getTlvValues handled tlv list: ", Integer.valueOf(iV));
            return iV;
        } catch (eeu unused) {
            LogUtil.e(this.TAG, "getTlvValues TlvException");
            return iV;
        }
    }

    @JavascriptInterface
    public void syncData(long j, String str) {
        LogUtil.a(this.TAG, "sync Data: ", str);
        if (ecu.d().startToSyncByH5(str)) {
            onSuccessCallback(j, "sync Data successful");
        } else {
            onFailureCallback(j, "sync Data failed");
        }
    }

    private DataReceiveCallback receiveConfigCallback(final long j, final String str, final int i) {
        return new DataReceiveCallback() { // from class: com.huawei.operation.h5pro.jsmodules.Device.7
            private static final String POSITION = "sendSampleConfigCommand: onDataReceived: ";

            @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
            public void onDataReceived(int i2, DeviceInfo deviceInfo, eec eecVar) {
                Object tlvValues;
                if (!(eecVar instanceof eef)) {
                    Device.this.receiveFailedAndLog(j, str, POSITION, "Received a message with wrong format");
                    return;
                }
                List<eeg> configInfoList = ((eef) eecVar).getConfigInfoList();
                if (configInfoList == null || configInfoList.size() == 0) {
                    Device.this.receiveFailedAndLog(j, str, POSITION, "Received a message are missing config info list");
                    return;
                }
                eeg eegVar = configInfoList.get(0);
                if (eegVar == null) {
                    Device.this.receiveFailedAndLog(j, str, POSITION, "Received a message are missing config info");
                    return;
                }
                byte[] bArrE = eegVar.e();
                if (bArrE == null) {
                    Device.this.receiveFailedAndLog(j, str, POSITION, "Received a message are missing byte data");
                    return;
                }
                Device device = Device.this;
                long j2 = j;
                if (i != 0) {
                    tlvValues = device.getTlvValues(bArrE);
                } else {
                    tlvValues = Byte.valueOf(bArrE[bArrE.length - 1]);
                }
                device.onSuccessCallback(j2, tlvValues);
                Device.this.mCommandProxy.unRegisterDeviceSampleListener(str);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getTlvValues(byte[] bArr) {
        try {
            List<eew> listE = new eet().b(eeq.e(bArr)).e();
            LogUtil.d(this.TAG, "getTlvValues origin tlv list: ", HiJsonUtil.d(listE));
            TreeMap treeMap = new TreeMap();
            for (eew eewVar : listE) {
                treeMap.put(eewVar.e(), eeq.d(cutHead0(eewVar.b())));
            }
            String strD = HiJsonUtil.d(treeMap);
            LogUtil.d(this.TAG, "getTlvValues handled tlv list: ", strD);
            return strD;
        } catch (eeu unused) {
            LogUtil.e(this.TAG, "getTlvValues TlvException");
            return "getTlvValues TlvException";
        }
    }

    private String cutHead0(String str) {
        while (str.startsWith("0")) {
            str = str.substring(1);
        }
        return str;
    }

    private int getAnalysisType(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has(JSON_KEY_ANALYSIS_TYPE)) {
                return 0;
            }
            int i = jSONObject.getInt(JSON_KEY_ANALYSIS_TYPE);
            if (i == 0 || i == 1) {
                return i;
            }
            return -1;
        } catch (JSONException unused) {
            LogUtil.e(this.TAG, "JSONException during getAnalysisType");
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void receiveFailedAndLog(long j, String str, String str2, String str3) {
        LogUtil.e(this.TAG, str2, str3);
        onFailureCallback(j, str3);
        this.mCommandProxy.unRegisterDeviceSampleListener(str);
    }

    public eef structSampleConfig(String str) {
        try {
            eef eefVar = new eef();
            JSONObject jSONObject = new JSONObject(str);
            eefVar.setSrcPkgName(jSONObject.getString(IntentDataRecord.SRC_PKG_NAME));
            eefVar.setWearPkgName(jSONObject.getString("wearPkgName"));
            eefVar.setCommandId(jSONObject.optInt("commandId"));
            JSONArray jSONArray = jSONObject.getJSONArray("configInfoList");
            if (jSONArray.length() == 0) {
                throw new JSONException("");
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                eeg eegVar = new eeg();
                eegVar.b(jSONObject2.getLong("configId"));
                eegVar.b(jSONObject2.getInt("configAction"));
                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("byteConfigData");
                byte[] bArrStructByteConfigData = new byte[0];
                if (jSONArrayOptJSONArray != null) {
                    bArrStructByteConfigData = structByteConfigData(jSONArrayOptJSONArray);
                }
                eegVar.d(bArrStructByteConfigData);
                eegVar.c(Long.valueOf(System.currentTimeMillis()));
                arrayList.add(eegVar);
            }
            eefVar.setConfigInfoList(arrayList);
            return eefVar;
        } catch (JSONException unused) {
            LogUtil.e(this.TAG, "structSampleConfig JSONException");
            return null;
        }
    }

    private byte[] structByteConfigData(JSONArray jSONArray) throws JSONException {
        String strA;
        byte[] bArr = new byte[0];
        int i = 0;
        while (i < jSONArray.length()) {
            int i2 = i + 1;
            String strD = eeq.d(i2);
            String string = jSONArray.getString(i);
            if (TextUtils.isDigitsOnly(string)) {
                strA = eeq.d(CommonUtil.b(string, 10));
            } else {
                strA = eeq.a(string);
            }
            int length = strA.length() / 2;
            if (strA.length() % 2 != 0) {
                length++;
            }
            byte[] bArrC = eeq.c(strD + eeq.d(length) + strA);
            byte[] bArr2 = new byte[bArr.length + bArrC.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            System.arraycopy(bArrC, 0, bArr2, bArr.length, bArrC.length);
            i = i2;
            bArr = bArr2;
        }
        return bArr;
    }

    @JavascriptInterface
    public void getConfig(long j, String str) {
        try {
            JSONObject jSONObjectC = fej.c(CLOUD_CONFIG_ID, new JSONObject(str).getString("packageName"));
            int i = jSONObjectC.getInt("resultCode");
            if (i == -1) {
                LogUtil.a(this.TAG, "getConfig failed: ", HiJsonUtil.d(jSONObjectC));
                onFailureCallback(j, jSONObjectC.getString("resultDesc"), i);
            } else {
                if (i == 0) {
                    LogUtil.a(this.TAG, "getConfig success");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", jSONObjectC);
                    onSuccessCallback(j, jSONObject);
                    return;
                }
                LogUtil.e(this.TAG, "getConfig: unknown error");
                onFailureCallback(j, "Unknown error", -1);
            }
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "JSONException in getConfig: ", e.getMessage());
            onFailureCallback(j, "JSONException in getConfig", -1);
        }
    }

    @JavascriptInterface
    public void registerConnectListener(long j, String str) {
        String deviceIdentify;
        try {
            deviceIdentify = new JSONObject(str).optString("deviceIdentify");
        } catch (JSONException unused) {
            LogUtil.j(this.TAG, "listenConnectState Input empty deviceIdentify, getting from main device");
            deviceIdentify = null;
        }
        if (TextUtils.isEmpty(deviceIdentify)) {
            DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, this.TAG);
            if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
                LogUtil.e(this.TAG, "listenConnectState Get deviceIdentify failed");
                onFailureCallback(j, "get deviceIdentify failed");
                return;
            }
            deviceIdentify = deviceInfo.getDeviceIdentify();
        }
        synchronized (ON_WAIT_LOCK) {
            Map<String, Set<Long>> map = this.mOnWaitCallbacks;
            if (map == null) {
                onFailureCallback(j, "callback list generate failed");
                return;
            }
            Set<Long> hashSet = map.get(deviceIdentify);
            if (hashSet == null) {
                hashSet = new HashSet<>(10);
            }
            hashSet.add(Long.valueOf(j));
            this.mOnWaitCallbacks.put(deviceIdentify, hashSet);
        }
    }

    @JavascriptInterface
    public void registerConnectListener(long j) {
        this.mConnectListenerId = j;
        pushCurrentDeviceToH5();
    }

    private void pushCurrentDeviceToH5() {
        callbackConnectListener(ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, this.TAG));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackConnectListener(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j(this.TAG, "callbackConnectListener, deviceInfo is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uuid", deviceInfo.getDeviceIdentify());
            jSONObject.put("name", deviceInfo.getDeviceName());
            jSONObject.put("state", deviceInfo.getDeviceConnectState());
            onSuccessCallback(this.mConnectListenerId, jSONObject);
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "callbackConnectListener err: ", e.getMessage());
        }
    }

    @JavascriptInterface
    public void isBindHuaweiDevice(long j) {
        LogUtil.a(this.TAG, "isBindHuaweiDevice");
        PluginBaseAdapter adapter = PluginOperation.getInstance(BaseApplication.getContext()).getAdapter();
        PluginOperationAdapter pluginOperationAdapterInitAdapter = adapter instanceof PluginOperationAdapter ? (PluginOperationAdapter) adapter : WebViewHelp.initAdapter();
        if (pluginOperationAdapterInitAdapter == null) {
            LogUtil.a(this.TAG, "isBindHuaweiDevice adapter is null");
            onSuccessCallback(j, false);
        } else {
            onSuccessCallback(j, Boolean.valueOf(pluginOperationAdapterInitAdapter.isBindDevice()));
        }
    }

    @JavascriptInterface
    public void queryBloodPressureDeviceStatus(final long j) {
        LogUtil.a(this.TAG, "queryBloodPressureDeviceStatus");
        dfp.a(new ResponseCallback<JSONObject>() { // from class: com.huawei.operation.h5pro.jsmodules.Device.8
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public void onResponse(int i, JSONObject jSONObject) {
                if (i == 0) {
                    Device.this.onSuccessCallback(j, jSONObject);
                } else {
                    Device.this.onFailureCallback(j, "");
                }
            }
        });
    }

    @JavascriptInterface
    public void queryHealthSwitchStatus(final long j, String str) {
        JSONArray jSONArrayOptJSONArray;
        LogUtil.a(this.TAG, "openHealthSwitch keyJson:", str);
        try {
            jSONArrayOptJSONArray = new JSONObject(str).optJSONArray(KEY_SWITCH_KEYS);
        } catch (JSONException unused) {
            LogUtil.e(this.TAG, "openHealthSwitch JSONException");
            jSONArrayOptJSONArray = null;
        }
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            onFailureCallback(j, "H5 param is error", -1);
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            String strOptString = jSONArrayOptJSONArray.optString(i);
            if (TextUtils.isEmpty(strOptString)) {
                onFailureCallback(j, "H5 param key is error", -1);
                return;
            }
            arrayList.add(strOptString);
        }
        ecu.d().getHealthSwitch(arrayList, new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.Device.9
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                LogUtil.a(Device.this.TAG, "getHealthSwitch errorCode:", Integer.valueOf(i2));
                if (i2 == 0) {
                    Device.this.onSuccessCallback(j, obj);
                } else if (i2 == -2) {
                    Device.this.onFailureCallback(j, "get health switch no connect device", i2);
                } else {
                    Device.this.onFailureCallback(j, "get health switch other failed", i2);
                }
            }
        });
    }

    @JavascriptInterface
    public void setHealthSwitch(final long j, String str) {
        JSONObject jSONObjectOptJSONObject;
        LogUtil.a(this.TAG, "setHealthSwitch keyJson:", str);
        try {
            jSONObjectOptJSONObject = new JSONObject(str).optJSONObject(KEY_SWITCH_KEYS);
        } catch (JSONException unused) {
            LogUtil.e(this.TAG, "setHealthSwitch JSONException");
            jSONObjectOptJSONObject = null;
        }
        if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() == 0) {
            onFailureCallback(j, "H5 param is error", -1);
        } else {
            ecu.d().setHealthSwitch(jSONObjectOptJSONObject, new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.Device.10
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a(Device.this.TAG, "setHealthSwitch errorCode:", Integer.valueOf(i));
                    if (i == 0) {
                        Device.this.onSuccessCallback(j, obj);
                    } else if (i == -2) {
                        Device.this.onFailureCallback(j, "set health switch no connect device", i);
                    } else {
                        Device.this.onFailureCallback(j, "set health switch other failed", i);
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void getConnectDeviceStatus(long j) {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, this.TAG);
        if (deviceInfo == null) {
            LogUtil.j(this.TAG, "getConnectDeviceStatus deviceInfo is null");
            onSuccessCallback(j, 0);
        } else {
            int deviceConnectState = deviceInfo.getDeviceConnectState();
            LogUtil.a(this.TAG, "getConnectDeviceStatus connectStatus:", Integer.valueOf(deviceConnectState));
            onSuccessCallback(j, Integer.valueOf(deviceConnectState));
        }
    }

    @JavascriptInterface
    public void getBondedDevice(long j, String str) {
        HealthDeviceEntryApi healthDeviceEntryApi = (HealthDeviceEntryApi) Services.d("PluginDevice", HealthDeviceEntryApi.class);
        if (healthDeviceEntryApi == null) {
            ReleaseLogUtil.d(this.TAG, "getBondedDevice api is null productId ", str);
            onFailureCallback(j, "");
            return;
        }
        HealthDevice bondedDevice = healthDeviceEntryApi.getBondedDevice(str);
        LogUtil.a(this.TAG, "getBondedDevice device ", bondedDevice, " productId ", str, " callbackId ", Long.valueOf(j));
        if (bondedDevice == null) {
            onSuccessCallback(j, "");
            return;
        }
        HashMap map = new HashMap(1);
        map.put("name", bondedDevice.getDeviceName());
        onSuccessCallback(j, map);
    }

    @JavascriptInterface
    public void getBondedDeviceList(long j, String str) {
        HealthDeviceEntryApi healthDeviceEntryApi = (HealthDeviceEntryApi) Services.d("PluginDevice", HealthDeviceEntryApi.class);
        if (healthDeviceEntryApi == null || TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d(this.TAG, "getBondedDeviceList api is null kindName ", str);
            onFailureCallback(j, "");
            return;
        }
        HealthDevice.HealthDeviceKind healthDeviceKind = null;
        for (HealthDevice.HealthDeviceKind healthDeviceKind2 : HealthDevice.HealthDeviceKind.values()) {
            if (healthDeviceKind2 != null && str.equals(healthDeviceKind2.name())) {
                healthDeviceKind = healthDeviceKind2;
            }
        }
        ArrayList<ContentValues> bondedDeviceByDeviceKind = healthDeviceEntryApi.getBondedDeviceByDeviceKind(healthDeviceKind);
        LogUtil.a(this.TAG, "getBondedDeviceList deviceList ", bondedDeviceByDeviceKind, " kindName ", str);
        if (CollectionUtils.a(bondedDeviceByDeviceKind)) {
            onSuccessCallback(j, "");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ContentValues contentValues : bondedDeviceByDeviceKind) {
            if (contentValues != null) {
                HashMap map = new HashMap(6);
                map.put("displayName", contentValues.getAsString("displayName"));
                map.put("name", contentValues.getAsString("name"));
                map.put(Wpt.MODE, contentValues.getAsString(Wpt.MODE));
                map.put("kind", contentValues.getAsString("kind"));
                map.put("productId", contentValues.getAsString("productId"));
                map.put(TtmlNode.TEXT_EMPHASIS_AUTO, contentValues.getAsString(TtmlNode.TEXT_EMPHASIS_AUTO));
                arrayList.add(map);
            }
        }
        LogUtil.a(this.TAG, "getBondedDeviceList list ", arrayList, " callbackId ", Long.valueOf(j));
        onSuccessCallback(j, arrayList);
    }

    @JavascriptInterface
    public void connectLatestScale() {
        HealthDeviceEntryApi healthDeviceEntryApi = (HealthDeviceEntryApi) Services.d("PluginDevice", HealthDeviceEntryApi.class);
        ReleaseLogUtil.c(this.TAG, "connectLatestScale api ", healthDeviceEntryApi);
        if (healthDeviceEntryApi == null) {
            return;
        }
        healthDeviceEntryApi.startConnectLatestScale();
    }

    @JavascriptInterface
    public void getProductInfoList(long j, String str) {
        LogUtil.a(this.TAG, "getProductInfoList param ", str, " callbackId ", Long.valueOf(j));
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(MedalConstants.EVENT_KEY);
            String strOptString2 = jSONObject.optString("value");
            ProductMapParseUtil.a(BaseApplication.getContext());
            List<ProductMapInfo> listC = ProductMap.c(strOptString, strOptString2);
            ArrayList arrayList = new ArrayList();
            for (ProductMapInfo productMapInfo : listC) {
                if (productMapInfo != null) {
                    HashMap map = new HashMap();
                    map.put("deviceId", Integer.valueOf(productMapInfo.c()));
                    arrayList.add(map);
                }
            }
            LogUtil.a(this.TAG, "getProductInfoList key ", strOptString, " value ", strOptString2, " productInfoList ", listC);
            onSuccessCallback(j, arrayList);
        } catch (JSONException e) {
            String strC = ExceptionUtils.c(e);
            ReleaseLogUtil.b(this.TAG, "getProductInfoList exception ", strC);
            onFailureCallback(j, strC);
        }
    }

    @JavascriptInterface
    public void getWearDeviceInfo(long j) {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, this.TAG);
        if (deviceInfo == null) {
            LogUtil.j(this.TAG, "device info null");
            onSuccessCallback(j, "");
            return;
        }
        HashMap map = new HashMap(3);
        map.put("name", deviceInfo.getDeviceName());
        map.put("deviceId", deviceInfo.getUuid());
        map.put(BleConstants.KEY_CONNECTSTATE, String.valueOf(deviceInfo.getDeviceConnectState()));
        onSuccessCallback(j, map);
    }

    @JavascriptInterface
    public void startMoreDeviceActivity(long j) {
        LogUtil.a(this.TAG, "startMoreDeviceActivity");
        ((FitnessAdviceApi) Services.b("PluginFitnessAdvice", FitnessAdviceApi.class)).startMoreDeviceActivity(this.mContext);
        onSuccessCallback(j);
    }

    @JavascriptInterface
    public void startAddHeartRateDevice(long j) {
        LogUtil.a(this.TAG, "startAddHeartRateDevice");
        ((FitnessAdviceApi) Services.b("PluginFitnessAdvice", FitnessAdviceApi.class)).startAddHeartRateDevice(this.mContext);
        onSuccessCallback(j);
    }

    @JavascriptInterface
    public void getDeviceSportStatus(final long j) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.Device$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1554xdf602cf2(j);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getDeviceSportStatus$1$com-huawei-operation-h5pro-jsmodules-Device, reason: not valid java name */
    /* synthetic */ void m1554xdf602cf2(final long j) {
        ReleaseLogUtil.c(this.TAG, "getDeviceSportStatus callbackId:", Long.valueOf(j));
        ((FitnessAdviceApi) Services.b("PluginFitnessAdvice", FitnessAdviceApi.class)).getDeviceSportStatus(new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.Device$$ExternalSyntheticLambda1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m1553x44bf6a71(j, i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getDeviceSportStatus$0$com-huawei-operation-h5pro-jsmodules-Device, reason: not valid java name */
    /* synthetic */ void m1553x44bf6a71(long j, int i, Object obj) {
        ReleaseLogUtil.c(this.TAG, "getDeviceSportStatus errorCode:", Integer.valueOf(i), "objData:", obj);
        onSuccessCallback(j, obj);
    }

    @JavascriptInterface
    public void smartGestureRefreshStatus(long j) {
        this.mGestureCallbackId = j;
        boolean zIsSmartGestureOpen = SmartGestureUtil.isSmartGestureOpen();
        LogUtil.a(this.TAG, "smartGestureRefreshStatus status is ", Integer.valueOf(zIsSmartGestureOpen ? 1 : 0), "mGestureCallbackId is ", Long.valueOf(this.mGestureCallbackId));
        onSuccessCallback(this.mGestureCallbackId, Integer.valueOf(zIsSmartGestureOpen ? 1 : 0));
    }

    @JavascriptInterface
    public void fallDetectionRefreshStatus(long j) {
        this.mFallDetectionCallbackId = j;
    }

    @JavascriptInterface
    public void sendSampleEventCommand(long j, String str) {
        ReleaseLogUtil.c(this.TAG, "sendSampleEvent");
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, this.TAG);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(IntentDataRecord.SRC_PKG_NAME);
            String strOptString2 = jSONObject.optString("destPkgName");
            int iOptInt = jSONObject.optInt(EventMonitorRecord.EVENT_ID);
            boolean zOptBoolean = jSONObject.optBoolean("needCallBack");
            int iOptInt2 = jSONObject.optInt("cacheReason");
            int iOptInt3 = jSONObject.optInt("validityPeriod");
            eee eeeVarBulidSampleEvent = bulidSampleEvent(iOptInt, strOptString, strOptString2, jSONObject);
            if (isExceptionalStatus(j, iOptInt2, iOptInt3, deviceInfo, eeeVarBulidSampleEvent)) {
                return;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            if (zOptBoolean) {
                needDeviceCallBack(j, strOptString, strOptString2, iOptInt, countDownLatch);
            }
            boolean zSendSampleEventCommand = edc.e().sendSampleEventCommand(deviceInfo, eeeVarBulidSampleEvent, this.TAG);
            ReleaseLogUtil.c(this.TAG, "SampleEvent result is ", Boolean.valueOf(zSendSampleEventCommand));
            if (zOptBoolean) {
                deviceResponseTimeOut(countDownLatch, j, strOptString);
            } else if (zSendSampleEventCommand) {
                sampleEventCallBack(j, SampleEventResult.SUCCESS_NOTIFICATION.getCode(), "", SampleEventResult.SUCCESS_NOTIFICATION.getDesc());
            } else {
                sampleEventCallBack(j, SampleEventResult.FAIL_IN_ORDER_SCENE.getCode(), SampleEventResult.FAIL_IN_ORDER_SCENE.getDesc());
            }
        } catch (JSONException e) {
            String strC = ExceptionUtils.c(e);
            ReleaseLogUtil.b(this.TAG, "getSampleEventInfo exception ", strC);
            sampleEventCallBack(j, SampleEventResult.FAIL_IN_ORDER_SCENE.getCode(), strC);
        }
    }

    @JavascriptInterface
    public void getBindDeviceInfo(final long j) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.Device$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1552xbb544f76(j);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getBindDeviceInfo$2$com-huawei-operation-h5pro-jsmodules-Device, reason: not valid java name */
    /* synthetic */ void m1552xbb544f76(long j) {
        ReleaseLogUtil.c(this.TAG, "getBindDeviceInfo");
        BindDeviceReq bindDeviceReq = new BindDeviceReq();
        bindDeviceReq.setProductId(1);
        bindDeviceReq.setUniqueId("-1");
        bindDeviceReq.setAppName(com.huawei.haf.application.BaseApplication.d());
        BindDeviceRsp bindDeviceRspB = lqo.b(com.huawei.haf.application.BaseApplication.b()).b(bindDeviceReq);
        if (bindDeviceRspB != null && bindDeviceRspB.getResultCode().intValue() == 0) {
            LogUtil.a(this.TAG, "deviceCode query:", bindDeviceRspB.getDeviceCode());
            onSuccessCallback(j, String.valueOf(bindDeviceRspB.getDeviceCode()));
        } else {
            onFailureCallback(j, "deviceCode query fail");
        }
    }

    private boolean isExceptionalStatus(long j, int i, int i2, DeviceInfo deviceInfo, eee eeeVar) {
        boolean z = (i == 0 && i2 == 0) ? false : true;
        if (BluetoothAdapter.getDefaultAdapter() == null || !BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            LogUtil.a(this.TAG, "Bluetooth is unconnected");
            handleSampleEventCache(z, i2, deviceInfo, eeeVar);
            sampleEventCallBack(j, SampleEventResult.BLUETOOTH_STATUS_UNCONNECTED.getCode(), SampleEventResult.BLUETOOTH_STATUS_UNCONNECTED.getDesc());
            return true;
        }
        if (deviceInfo == null) {
            LogUtil.j(this.TAG, "device info is null");
            handleSampleEventCache(z, i2, deviceInfo, eeeVar);
            sampleEventCallBack(j, SampleEventResult.FAIL_IN_ORDER_SCENE.getCode(), SampleEventResult.FAIL_IN_ORDER_SCENE.getDesc());
            return true;
        }
        if (deviceInfo.getDeviceConnectState() == 2) {
            return false;
        }
        LogUtil.a(this.TAG, "device is unconnected");
        handleSampleEventCache(z, i2, deviceInfo, eeeVar);
        sampleEventCallBack(j, SampleEventResult.DEVICE_STATUS_UNCONNECTED.getCode(), SampleEventResult.DEVICE_STATUS_UNCONNECTED.getDesc());
        return true;
    }

    private void handleSampleEventCache(boolean z, int i, DeviceInfo deviceInfo, eee eeeVar) {
        if (!z) {
            LogUtil.a(this.TAG, "handleSampleEventCache is not need cache");
            return;
        }
        if (deviceInfo == null) {
            LogUtil.j(this.TAG, "device info is null");
            deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, this.TAG);
        }
        if (i == 0) {
            i = 24;
        }
        edc.e().sendSampleEventCommand(deviceInfo, eeeVar, new SampleEventCache.e(SampleEventCache.SampleEventCacheReason.DISCONNECT, i), this.TAG);
    }

    private void needDeviceCallBack(final long j, final String str, final String str2, final int i, final CountDownLatch countDownLatch) {
        edc.e().registerDeviceSampleListener(str, new DataReceiveCallback() { // from class: com.huawei.operation.h5pro.jsmodules.Device.11
            @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
            public void onDataReceived(int i2, DeviceInfo deviceInfo, eec eecVar) {
                ReleaseLogUtil.c(Device.this.TAG, "Received device event with errorCode:", Integer.valueOf(i2));
                if (!(eecVar instanceof eee)) {
                    ReleaseLogUtil.d(Device.this.TAG, "Message is not an instance of SampleEvent.");
                    return;
                }
                eee eeeVar = (eee) eecVar;
                if (eeeVar.d() != i || !str2.equals(eeeVar.getSrcPkgName())) {
                    ReleaseLogUtil.d(Device.this.TAG, "message commandId or pkgName not match.");
                    return;
                }
                ReleaseLogUtil.c(Device.this.TAG, "message:", eeeVar);
                String strD = eeq.d(eeq.e(eeeVar.c()));
                ReleaseLogUtil.c(Device.this.TAG, "eventData:", strD);
                Device.this.sampleEventCallBack(j, SampleEventResult.SUCCESS_NOTIFICATION.getCode(), strD, SampleEventResult.SUCCESS_NOTIFICATION.getDesc());
                edc.e().unRegisterDeviceSampleListener(str);
                countDownLatch.countDown();
            }
        });
    }

    private eee bulidSampleEvent(long j, String str, String str2, JSONObject jSONObject) {
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName(str);
        eeeVar.setWearPkgName(str2);
        eeeVar.setCommandId(2);
        eeeVar.a(j);
        eeeVar.a(jSONObject.optInt("eventLevel"));
        eeeVar.e(eeq.c(eeq.a(jSONObject.optString("eventData"))));
        LogUtil.a(this.TAG, "send SampleEvent: ", eeeVar.toString());
        return eeeVar;
    }

    private void sampleEventCallBack(long j, int i, String str) {
        sampleEventCallBack(j, i, str, new JSONObject());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sampleEventCallBack(long j, int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultData", str);
            sampleEventCallBack(j, i, str2, jSONObject);
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "callbackConnectListener err: ", e.getMessage());
            onFailureCallback(j, e.getMessage());
        }
    }

    private void sampleEventCallBack(long j, int i, String str, JSONObject jSONObject) {
        try {
            jSONObject.put("resultCode", i);
            jSONObject.put("resultDesc", str);
            onSuccessCallback(j, jSONObject);
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "callbackConnectListener err: ", e.getMessage());
            onFailureCallback(j, e.getMessage());
        }
    }

    private void deviceResponseTimeOut(CountDownLatch countDownLatch, long j, String str) {
        try {
            if (countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                return;
            }
        } catch (InterruptedException unused) {
            ReleaseLogUtil.d(this.TAG, "Thread interrupted while waiting for device response.", Long.valueOf(j));
        }
        ReleaseLogUtil.d(this.TAG, "Device response timeout for callbackId: ", Long.valueOf(j));
        sampleEventCallBack(j, SampleEventResult.FAIL_IN_ORDER_SCENE.getCode(), SampleEventResult.FAIL_IN_ORDER_SCENE.getDesc());
        edc.e().unRegisterDeviceSampleListener(str);
    }
}
