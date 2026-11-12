package com.xiaomi.smarthome.framework.plugin.rn.nativemodule;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.miui.tsmclient.common.net.NetConstants;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.device.api.Parser;
import com.xiaomi.smarthome.framework.plugin.rn.RnModuleProvider;
import com.xiaomi.smarthome.framework.plugin.rn.constants.RnApiErrorInfo;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider;
import com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.ui.ColorSchemeHelper;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnCallbackMapUtil;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnReadableMapUtil;
import defpackage.ndj;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@ndj(name = MIOTServiceModuleCore.NAME)
public class MIOTServiceModuleCore extends MIOTBaseJavaModule implements IMIOTService, ReactModuleWithSpec {
    public static final String KEY_HAS_CUSTOM_PLUGIN = "hasCustomPlugin";
    public static final String KEY_PLUGIN_DEV_MODE = "devMode";
    public static final String NAME = "MIOTService";
    public static final String PARAM_HOME_TYPE = "homepage_type";
    public static final String PARAM_STANDARDIZED = "standardized";
    public static final Parser<String> PARSERFORRAWRESULT = ((IRnPluginHostApiProvider) RnModuleProvider.as(IRnPluginHostApiProvider.class)).getParserForRawResult();
    private static final String TAG = "MIOTServiceModule";

    public MIOTServiceModuleCore(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void activeABTestByPath(ReadableMap readableMap) {
        getRnAppProxyProvider().activeABTestByPath(RnReadableMapUtil.optString(readableMap, "expPath"));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void addLog(String str, String str2) {
        getRnCommonProvider().addLog(getDevice(), str, str2);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void addStat(String str, String str2, ReadableMap readableMap) {
        DeviceStat device = getDevice();
        PluginPackageInfo pluginRecord = getPluginRecord();
        if (device == null || pluginRecord == null) {
            MRnLog.w(TAG, "reportData error: deviceStat == null || packageInfo == null ");
        } else {
            getRnCommonProvider().addStat(device, pluginRecord, str, str2, readableMap);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void callMiCloudAPI(String str, String str2, ReadableMap readableMap, ReadableMap readableMap2, Callback callback) {
        DeviceStat device = getDevice();
        if (device == null) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-4, "device cannot be null"));
        } else if (supportMiCloud(device.model)) {
            getRnCommonProvider().callMiCloudAPI(getCurrentActivity(), str, str2, readableMap, readableMap2, callback);
        } else {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-1, "permission denied"));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void callSmartHomeAPI(String str, String str2, Callback callback) {
        getRnPluginHostApiProvider().callSmartHomeAPI(getReactApplicationContext(), getDevice() != null ? getDevice().model : null, str, str2, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void callSmartHomeCameraAPI(String str, String str2, boolean z, ReadableMap readableMap, Callback callback) {
        if (callback == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(RnApiErrorInfo.PARAMS_ERROR, "url is empty..."));
            return;
        }
        if (getDevice() == null) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(RnApiErrorInfo.DEVICE_ERROR, "current device is null..."));
            return;
        }
        try {
            getCameraApiProvider().checkSwitchFaceAiOpen(str, MIOTUtils.readableMapToJsonStr(readableMap), str2, z, false, callback);
        } catch (Exception e) {
            String str3 = "callSmartHomeCameraAPI params map to Json string error,api:" + str + ",errorStr:" + e.toString();
            RnPluginLog.e(str3);
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(RnApiErrorInfo.PARAMS_ERROR, str3));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void callSmartHomeCameraAPIWithStringParam(String str, String str2, boolean z, String str3, Callback callback) {
        if (callback == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(RnApiErrorInfo.PARAMS_ERROR, "url is empty..."));
        } else if (getDevice() == null) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(RnApiErrorInfo.DEVICE_ERROR, "current device is null..."));
        } else {
            getCameraApiProvider().checkSwitchFaceAiOpen(str, str3, str2, z, false, callback);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void callSpecificAPI(String str, String str2, ReadableMap readableMap, Callback callback) {
        if (getDevice() == null) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(RnApiErrorInfo.DEVICE_ERROR, "current device is null..."));
        } else {
            getRnCommonProvider().callSpecificAPI(getDevice().model, str, str2, readableMap, callback);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void deleteDevice(Callback callback) {
        DeviceStat device = getDevice();
        if (device == null) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-1, "invalid device"));
        } else {
            getRnAppProxyProvider().deleteDevice(device.did, device.pid, callback);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void deleteSceneRecords(ReadableArray readableArray, Callback callback) {
        if (callback == null) {
            return;
        }
        if (readableArray == null) {
            callback.invoke(Boolean.FALSE, "params is null...");
        } else if (getDevice() == null) {
            callback.invoke(Boolean.FALSE, "current device is null...");
        } else {
            getRnPluginHostApiProvider().delScenes(getDevice().model, MIOTUtils.convertReadableArrayToList(readableArray), callback);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void editSceneRecord(ReadableMap readableMap, Callback callback) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        if (callback == null) {
            return;
        }
        if (readableMap == null) {
            callback.invoke(Boolean.FALSE, "params is null...");
            return;
        }
        String valueString = MIOTUtils.getValueString(readableMap, "model", "");
        int i = MIOTUtils.getInt(readableMap, "st_id");
        String valueString2 = MIOTUtils.getValueString(readableMap, "us_id", "");
        String valueString3 = MIOTUtils.getValueString(readableMap, "did", "");
        String valueString4 = MIOTUtils.getValueString(readableMap, "identify", "");
        String valueString5 = MIOTUtils.getValueString(readableMap, "name", "");
        ReadableMap map = MIOTUtils.getMap(readableMap, "setting");
        ReadableArray array = MIOTUtils.getArray(readableMap, NetConstants.AUTH_TYPE_AUTHED);
        try {
            jSONObject = new JSONObject(map.toString());
            try {
                if (jSONObject.has("NativeMap")) {
                    jSONObject = jSONObject.getJSONObject("NativeMap");
                }
                jSONArray = new JSONArray(array.toString());
            } catch (JSONException e) {
                e = e;
                RnPluginLog.e(e.toString());
                jSONArray = null;
            } catch (Exception e2) {
                e = e2;
                RnPluginLog.e(e.toString());
                jSONArray = null;
            }
        } catch (JSONException e3) {
            e = e3;
            jSONObject = null;
        } catch (Exception e4) {
            e = e4;
            jSONObject = null;
        }
        getRnPluginHostApiProvider().editSceneV2(valueString, i, valueString2, valueString3, valueString4, valueString5, jSONObject, jSONArray, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void getABTestConfigByPath(ReadableMap readableMap, Callback callback) {
        String aBTestConfigByPath = getRnAppProxyProvider().getABTestConfigByPath(RnReadableMapUtil.optString(readableMap, "expPath"));
        if (aBTestConfigByPath != null) {
            callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(MIOTUtils.jsonStrToWritableMap(aBTestConfigByPath)));
        } else {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("can not get ABTestConfig"));
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("currentAccountID", getRnPluginHostApiProvider().getAccountId());
        if (getPluginRecord() != null) {
            map.put("pluginID", Long.valueOf(getPluginRecord().getPluginId()));
        }
        map.put("currentServerName", getRnPluginHostApiProvider().getCurrentServer());
        String strColorSchemeForCurrentConfiguration = ColorSchemeHelper.colorSchemeForCurrentConfiguration(getContext());
        RnPluginLog.d(TAG, "getConstants, color: " + strColorSchemeForCurrentConfiguration);
        map.put("currentDarkMode", strColorSchemeForCurrentConfiguration);
        return map;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void getCustomPluginInfo(ReadableMap readableMap, Callback callback) {
        getRnCommonProvider().getCustomPluginInfo(RnReadableMapUtil.optString(readableMap, "model"), callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void getDeviceIcon(ReadableMap readableMap, Callback callback) {
        int iOptInt = RnReadableMapUtil.optInt(readableMap, "subclass_id");
        if (iOptInt != 0) {
            getRnAppProxyProvider().getDeviceIcon(iOptInt, callback);
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("proxy_category_icon", getPluginInfo().mIconReal);
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, writableMapCreateMap));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void getHomeList(ReadableMap readableMap, Callback callback) {
        String homeList = getRnPluginHostApiProvider().getHomeList();
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        try {
            JSONArray jSONArray = new JSONArray(homeList);
            for (int i = 0; i < jSONArray.length(); i++) {
                writableNativeArray.pushMap(MIOTUtils.jsonObjToWritableMap(jSONArray.getJSONObject(i)));
            }
        } catch (JSONException e) {
            e.printStackTrace();
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(Log.getStackTraceString(e)));
        }
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(writableNativeArray));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void getHomepageSettings(Callback callback) {
        DeviceStat device = getDevice();
        if (device != null) {
            getRnCommonProvider().getHomepageSettings(device.model, callback);
        } else {
            MRnLog.w(TAG, "setHomepageSettings,device = null");
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-1, "invalid device"));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void getSTDGuideSettings(String str, Callback callback) {
        if (TextUtils.isEmpty(str)) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-1, "invalid category"));
        } else {
            callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, Boolean.valueOf(getRnCommonProvider().getSTDGuideSettings(str))));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    @SuppressLint({"CheckResult"})
    public void getServerName(Callback callback) {
        getRnAppProxyProvider().getServerName(getReactApplicationContext(), callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void getServiceTokenWithSid(String str, Callback callback) {
        callback.invoke(Boolean.FALSE, "Not in the scope of permission");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void getTvList(Callback callback) {
        getRnCommonProvider().getTvList(callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void getVirtualDeviceCombineStatus(ReadableMap readableMap, Callback callback) {
        String string = MIOTUtils.getString(readableMap, "groupDid");
        if (TextUtils.isEmpty(string)) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-1, "groupDid is empty"));
            return;
        }
        String virtualGroupStatus = getRnPluginHostApiProvider().getVirtualGroupStatus(string);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("status", virtualGroupStatus);
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, writableMapCreateMap));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void goEditRecommendScene(ReadableMap readableMap) {
        if (getCurrentActivity() == null) {
            MRnLog.w(TAG, "revokeLicense: activity is null");
        } else {
            getRnCommonProvider().openRecommendSceneDetail(getCurrentActivity(), readableMap);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void loadAccountInfo(String str, Callback callback) {
        getRnPluginHostApiProvider().loadAccountInfo(str, callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        getRnCommonProvider().recycleMiWifiResource();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void reportEvent(String str, ReadableMap readableMap) {
        DeviceStat device = getDevice();
        PluginPackageInfo pluginRecord = getPluginRecord();
        if (device == null || pluginRecord == null) {
            MRnLog.i(TAG, "reportEvent,deviceStat = null or pluginRecord = null");
        } else {
            getRnCommonProvider().reportEvent(device, pluginRecord, str, readableMap);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void reportEventRefChannel(String str, ReadableMap readableMap) {
        DeviceStat device = getDevice();
        PluginPackageInfo pluginRecord = getPluginRecord();
        if (device == null || pluginRecord == null) {
            MRnLog.i(TAG, "reportEvent,deviceStat = null or pluginRecord = null");
        } else {
            getRnCommonProvider().reportEventRefChannel(device, pluginRecord, str, readableMap);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void reportMJFStatLog(String str, ReadableMap readableMap) {
        getRnCommonProvider().reportMJFStatLog(str, readableMap);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void requestAuthForAlexaVoiceService(ReadableMap readableMap, Callback callback) {
        getRnCommonProvider().requestAuthForAlexaVoiceService(readableMap, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void revokePrivacyLicense(Callback callback) {
        DeviceStat device = getDevice();
        if (device == null) {
            MRnLog.w(TAG, "revokeLicense: device is null");
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-1, "invalid device"));
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            MRnLog.w(TAG, "revokeLicense: activity is null");
        } else {
            getRnCommonProvider().revokePrivacyLicense(currentActivity, device, callback);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void setHomepageSettings(ReadableMap readableMap) {
        DeviceStat device = getDevice();
        if (device == null) {
            MRnLog.w(TAG, "setHomepageSettings,device = null");
        } else {
            getRnCommonProvider().setHomepageSettings(device.model, readableMap);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void setSTDGuideSettings(String str, boolean z) {
        getRnCommonProvider().setSTDGuideSettings(str, z);
    }

    public boolean supportMiCloud(String str) {
        return TextUtils.equals("jiqid.sxb.v1", str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTService
    @ReactMethod
    public void updatePluginPageRef(ReadableMap readableMap) {
        getRnCommonProvider().updatePluginPageRef(readableMap);
    }
}
