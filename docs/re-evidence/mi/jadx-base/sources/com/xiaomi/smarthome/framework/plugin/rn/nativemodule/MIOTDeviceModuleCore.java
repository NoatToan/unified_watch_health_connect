package com.xiaomi.smarthome.framework.plugin.rn.nativemodule;

import android.text.TextUtils;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.device.api.Parser;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.framework.plugin.rn.RnModuleProvider;
import com.xiaomi.smarthome.framework.plugin.rn.constants.RnApiErrorInfo;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider;
import com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.device.DeviceInfoHelper;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice;
import com.xiaomi.smarthome.framework.plugin.rn.utils.ModelUtil;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnCallbackMapUtil;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;
import com.xiaomi.smarthome.homeroom.model.Home;
import com.xiaomi.smarthome.homeroom.model.Room;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.common.util.StringUtil;
import com.xiaomi.smarthome.rn.core.bean.RnPluginDeviceInfo;
import com.xiaomi.smarthome.shop.utils.ToastUtil;
import defpackage.ndj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@ndj(name = MIOTDeviceModuleCore.NAME)
public class MIOTDeviceModuleCore extends MIOTBaseJavaModule implements IMIOTDevice, ReactModuleWithSpec {
    public static final String NAME = "MIOTDevice";
    private static final Parser<String> PARSERFORRAWRESULT;
    private static final String TAG = "MIOTDeviceModule";
    private static List<Integer> mErrorcodesShowForDebug;

    static {
        ArrayList arrayList = new ArrayList();
        mErrorcodesShowForDebug = arrayList;
        arrayList.add(-9999);
        mErrorcodesShowForDebug.add(-12);
        mErrorcodesShowForDebug.add(-97);
        mErrorcodesShowForDebug.add(-4);
        mErrorcodesShowForDebug.add(-3);
        mErrorcodesShowForDebug.add(-1);
        PARSERFORRAWRESULT = ((IRnPluginHostApiProvider) RnModuleProvider.as(IRnPluginHostApiProvider.class)).getParserForRawResult();
    }

    public MIOTDeviceModuleCore(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        updateConfig();
    }

    private WritableMap _getCurrentDeviceInfo(DeviceStat deviceStat) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (deviceStat != null && getPluginInfo() != null) {
            DeviceInfoHelper.device2Map(writableNativeMap, deviceStat);
            RnPluginDeviceInfo pluginInfo = getPluginInfo();
            if (pluginInfo != null) {
                writableNativeMap.putBoolean("isVoiceDevice", pluginInfo.mSupportVoiceCtrl == 1);
                writableNativeMap.putInt("pd_id", pluginInfo.mProductId);
                writableNativeMap.putString("lastestPrivacyVersion", pluginInfo.mPrivacyVer);
                writableNativeMap.putString("productName", pluginInfo.getName());
                writableNativeMap.putString("deviceConfigInfo", getRnRuntimeProvider().getStringfyPluginDeviceInfo(pluginInfo.getModel()));
                MRnLog.i(TAG, "MIOTDeviceModule,getCurrentDeviceInfo: pd_id=" + pluginInfo.mProductId + ",lastestPrivacyVersion=" + pluginInfo.mPrivacyVer);
            }
        }
        return writableNativeMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WritableMap combineBleGatewayDevice(WritableArray writableArray, WritableArray writableArray2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putArray("mesh", writableArray);
        writableMapCreateMap.putArray("normal", writableArray2);
        return writableMapCreateMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int convertRssiToSignal(int i) {
        if (i >= -50) {
            return 4;
        }
        if (i >= -70) {
            return 3;
        }
        if (i >= -90) {
            return 2;
        }
        return i >= -100 ? 1 : 0;
    }

    private void showErrorInfoForDebug(int i, String str) {
        if (MiJiaEnvironment.isDebugBuildType() && mErrorcodesShowForDebug.contains(Integer.valueOf(i))) {
            ToastUtil.show(getReactApplicationContext(), "errorcode: " + i + ", info: " + str);
        }
    }

    private void updateConfig() {
        getRnCommonProvider().updateConfig();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public void callMethod(String str, String str2, String str3, String str4, Callback callback) {
        try {
            DeviceStat device = getDevice();
            if (device == null) {
                callback.invoke(Boolean.FALSE, "has no device");
            } else {
                getRnPluginHostApiProvider().callMethod(device, str, str2, str3, str4, callback);
            }
        } catch (Throwable th) {
            if (callback != null) {
                callback.invoke(Boolean.FALSE, Log.getStackTraceString(th));
            }
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public void callMethodFromCloud(String str, String str2, String str3, String str4, Callback callback) {
        try {
            DeviceStat device = getDevice();
            if (device == null) {
                callback.invoke(Boolean.FALSE, "has no device ");
            } else {
                getRnPluginHostApiProvider().callMethodFromCloud(device, str, str2, str3, str4, callback);
            }
        } catch (Throwable th) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putInt("error", -1);
            writableNativeMap.putString("message", Log.getStackTraceString(th));
            callback.invoke(Boolean.FALSE, writableNativeMap);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public void callMethodFromLocal(String str, String str2, String str3, String str4, Callback callback) {
        if (callback == null) {
            return;
        }
        try {
            DeviceStat device = getDevice();
            if (device == null) {
                callback.invoke(Boolean.FALSE, "has no device");
            } else {
                getRnPluginHostApiProvider().callMethodFromLocal(device, str, str2, str3, str4, callback);
            }
        } catch (Exception e) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(e.toString()));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public void changeDeviceName(final String str, String str2, final Callback callback) {
        DeviceStat deviceByDid;
        DeviceStat device = getDevice();
        if (TextUtils.isEmpty(str2)) {
            if (device == null) {
                callback.invoke(Boolean.FALSE, "this did and current device is empty, change device name failed...");
                return;
            } else {
                str2 = device.did;
                deviceByDid = null;
            }
        } else {
            if (device == null) {
                callback.invoke(Boolean.FALSE, "current device is empty, change device name failed...");
                return;
            }
            deviceByDid = getRnPluginHostApiProvider().getDeviceByDid(str2);
            if (deviceByDid == null || !device.did.equals(deviceByDid.parentId)) {
                callback.invoke(Boolean.FALSE, "this device is not current child device, change device name failed...");
                return;
            }
        }
        if (TextUtils.isEmpty(str)) {
            callback.invoke(Boolean.FALSE, "new name is empty");
            return;
        }
        if (device.did.equals(str2) && str.equals(device.name)) {
            callback.invoke(Boolean.FALSE, "update current device name, new name is same with current device name");
            return;
        }
        if (deviceByDid != null && deviceByDid.did.equals(str2) && str.equals(deviceByDid.name)) {
            callback.invoke(Boolean.FALSE, "update child device name, new name is same with child device name");
            return;
        }
        if (StringUtil.containsEmoji(str.trim())) {
            callback.invoke(Boolean.FALSE, "new name contains not support emoji");
        } else if (StringUtil.getStringCharLen1(str.trim()) > 40) {
            callback.invoke(Boolean.FALSE, "Chinese length should not exceed 20, English length should not exceed 40");
        } else {
            getRnPluginHostApiProvider().modDeviceName(str2, str, new com.xiaomi.smarthome.device.api.Callback<Void>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTDeviceModuleCore.3
                @Override // com.xiaomi.smarthome.device.api.Callback
                public void onFailure(int i, String str3) {
                    callback.invoke(Boolean.FALSE, "errorCode: " + i + ",  errorInfo: " + str3);
                }

                @Override // com.xiaomi.smarthome.device.api.Callback
                public void onSuccess(Void r3) {
                    callback.invoke(Boolean.TRUE, str);
                }
            });
        }
    }

    public Map<String, Object> doGetConstants(DeviceStat deviceStat) {
        HashMap map = new HashMap();
        if (deviceStat == null) {
            return map;
        }
        WritableMap writableMap_getCurrentDeviceInfo = _getCurrentDeviceInfo(deviceStat);
        HashMap map2 = new HashMap();
        map2.put("currentDevice", writableMap_getCurrentDeviceInfo);
        return map2;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public final void getAllDevicesOfBelongedCompanies(Callback callback) {
        DeviceStat device = getDevice();
        if (device == null) {
            MRnLog.w(TAG, "getAllDevicesOfBelongedCompanies：deviceStat is null");
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-1, "cannot get current device info"));
            return;
        }
        String companyIdentifierByModel = ModelUtil.getCompanyIdentifierByModel(device.model);
        if (TextUtils.isEmpty(companyIdentifierByModel)) {
            MRnLog.w(TAG, "getAllDevicesOfBelongedCompanies,get company identifier error:" + device.model);
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-2, "get company identifier error"));
            return;
        }
        List<DeviceStat> deviceList = getRnPluginHostApiProvider().getDeviceList();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        if (deviceList != null) {
            for (DeviceStat deviceStat : deviceList) {
                if (TextUtils.equals(companyIdentifierByModel, ModelUtil.getCompanyIdentifierByModel(deviceStat.model))) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    DeviceInfoHelper.device2Map(writableMapCreateMap, deviceStat);
                    writableArrayCreateArray.pushMap(writableMapCreateMap);
                }
            }
        }
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(writableArrayCreateArray));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Map<String, Object> mapDoGetConstants = doGetConstants(getRnRuntimeProvider().getDeviceStat());
        MRnLog.d(TAG, "miot device to js params : " + mapDoGetConstants);
        return mapDoGetConstants;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public void getCurrentDeviceValue(Callback callback) {
        DeviceStat device = getDevice();
        if (device == null) {
            callback.invoke(Boolean.FALSE, "device is null...");
            return;
        }
        JSONArray deviceProp = getRnPluginHostApiProvider().getDeviceProp(device.did);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (deviceProp == null) {
            callback.invoke(Boolean.FALSE, "deviceProp is null... ");
            return;
        }
        for (int i = 0; i < deviceProp.length(); i++) {
            try {
                JSONObject jSONObject = deviceProp.getJSONObject(i);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null) {
                        if (next.startsWith("prop.") || next.startsWith("event.")) {
                            writableNativeMap.putString(next, jSONObject.optString(next));
                        } else {
                            writableNativeMap.putString("prop." + next, jSONObject.optString(next));
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        callback.invoke(Boolean.TRUE, writableNativeMap);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public void getDeviceTimeZone(final String str, final Callback callback) {
        if (getCurrentActivity() == null) {
            callback.invoke(Boolean.FALSE, "current activity is null...");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("did", str);
            jSONArray.put("timezone");
            jSONObject.put("keys", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        getRnPluginHostApiProvider().callSmartHomeApi(null, "/v2/device/get_extra_data", jSONObject.toString(), new com.xiaomi.smarthome.device.api.Callback<String>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTDeviceModuleCore.2
            @Override // com.xiaomi.smarthome.device.api.Callback
            public void onFailure(int i, String str2) {
                callback.invoke(Boolean.FALSE, "error: " + i + ",  " + str2);
            }

            @Override // com.xiaomi.smarthome.device.api.Callback
            public void onSuccess(String str2) {
                if (TextUtils.isEmpty(str2)) {
                    callback.invoke(Boolean.TRUE, Arguments.createMap());
                    return;
                }
                try {
                    String str3 = (String) new JSONObject(str2).getJSONObject("result").getJSONObject("data").get("timezone");
                    if (TextUtils.isEmpty(str3)) {
                        callback.invoke(Boolean.TRUE, Arguments.createMap());
                        return;
                    }
                    TimeZone timeZone = TimeZone.getTimeZone(str3);
                    TimeZone timeZone2 = TimeZone.getDefault();
                    TimeZone.setDefault(timeZone);
                    String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
                    TimeZone.setDefault(timeZone2);
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putString("timeZone", displayName);
                    writableMapCreateMap.putString("timeZoneId", str3);
                    writableMapCreateMap.putString("did", str);
                    callback.invoke(Boolean.TRUE, writableMapCreateMap);
                } catch (JSONException e2) {
                    RnPluginLog.e(e2.toString());
                    callback.invoke(Boolean.FALSE, e2.toString());
                }
            }
        }, PARSERFORRAWRESULT);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public void getFreqCameraFlag(Callback callback) {
        DeviceStat device = getDevice();
        if (device == null) {
            MRnLog.w(TAG, "getFreqCameraFlag: stat = null");
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-1, "device is null"));
            return;
        }
        DeviceStat deviceByDid = getRnPluginHostApiProvider().getDeviceByDid(device.did);
        if (deviceByDid != null) {
            callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(Boolean.valueOf((deviceByDid.comFlag & 64) == 64)));
        } else {
            MRnLog.w(TAG, "getFreqCameraFlag:getDeviceByDid return null");
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-2, "cur device is null"));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public void getFreqFlag(Callback callback) {
        getCameraApiProvider().getFreqFlag(callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public void getHomeDeviceList(Callback callback) {
        try {
            callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, MIOTUtils.jsonStrToWritableMap(getRnPluginHostApiProvider().getHomeDeviceList())));
        } catch (Exception e) {
            MRnLog.i(TAG, "MIOTDeviceModule, getDevicesInfoByHome：failed , errorInfo = " + Log.getStackTraceString(e));
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-1, Log.getStackTraceString(e)));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public void getLinkedBTDevices(String str, final Callback callback) {
        if (callback == null) {
            return;
        }
        DeviceStat device = getDevice();
        if (device == null) {
            callback.invoke(Boolean.FALSE, "current device is null... ");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str) || !(str.equals(device.did) || str.equals(device.parentId))) {
            callback.invoke(Boolean.FALSE, "did is empty...");
        } else {
            arrayList.add(str);
            getRnPluginHostApiProvider().getBleGatewaySubDevices(arrayList, Collections.emptyList(), new com.xiaomi.smarthome.device.api.Callback<List<DeviceStat>>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTDeviceModuleCore.1
                @Override // com.xiaomi.smarthome.device.api.Callback
                public void onFailure(int i, String str2) {
                    callback.invoke(Boolean.FALSE, str2);
                }

                @Override // com.xiaomi.smarthome.device.api.Callback
                public void onSuccess(List<DeviceStat> list) {
                    WritableArray writableArrayCreateArray = Arguments.createArray();
                    WritableArray writableArrayCreateArray2 = Arguments.createArray();
                    if (list != null && list.size() > 0) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            String string = list.get(i).property == null ? "" : list.get(i).property.getString("deviceGatewayType");
                            WritableMap writableMapCreateMap = Arguments.createMap();
                            list.get(i).rssi = MIOTDeviceModuleCore.this.convertRssiToSignal(list.get(i).rssi);
                            DeviceInfoHelper.device2Map(writableMapCreateMap, list.get(i));
                            if ("mesh".equalsIgnoreCase(string)) {
                                writableArrayCreateArray.pushMap(writableMapCreateMap);
                            } else {
                                writableArrayCreateArray2.pushMap(writableMapCreateMap);
                            }
                        }
                    }
                    callback.invoke(Boolean.TRUE, MIOTDeviceModuleCore.this.combineBleGatewayDevice(writableArrayCreateArray, writableArrayCreateArray2));
                }
            });
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public final void getNativePrivacyConfirmationVersion(ReadableMap readableMap, Callback callback) {
        DeviceStat device = getDevice();
        if (device == null) {
            MRnLog.w(TAG, "getNativePrivacyConfirmationVersion：deviceStat is null");
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-1, "cannot get current device info"));
            return;
        }
        String nativePrivacyConfirmationVersion = getRnPluginHostApiProvider().getNativePrivacyConfirmationVersion(device.did);
        MRnLog.i(TAG, "MIOTDeviceModule,getNativePrivacyConfirmationVersion：nativePrivacyConfirmationVersion=" + nativePrivacyConfirmationVersion);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("version", nativePrivacyConfirmationVersion);
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(writableMapCreateMap));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public void getRecommendScenes(String str, String str2, final Callback callback) {
        if (callback == null) {
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            callback.invoke(Boolean.FALSE, "model or did is empty...");
        } else {
            getRnPluginHostApiProvider().getRecommendScenes(str, str2, new com.xiaomi.smarthome.device.api.Callback<JSONObject>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTDeviceModuleCore.4
                @Override // com.xiaomi.smarthome.device.api.Callback
                public void onFailure(int i, String str3) {
                    callback.invoke(Boolean.FALSE, "code: " + i + "   errorInfo: " + str3);
                }

                @Override // com.xiaomi.smarthome.device.api.Callback
                public void onSuccess(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    callback.invoke(Boolean.TRUE, jSONObject.toString());
                }
            });
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public void getRoomInfoForCurrentHome(String str, Callback callback) {
        if (TextUtils.isEmpty(str)) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-1, "did is empty"));
            return;
        }
        Room roomByDid = getRnAppProxyProvider().getRoomByDid(str);
        Home homeByDid = getRnAppProxyProvider().getHomeByDid(str);
        if (roomByDid == null) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-2, "room not found"));
            return;
        }
        if (homeByDid == null) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-3, "home not found"));
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("roomId", roomByDid.getId());
        writableMapCreateMap.putString("roomName", roomByDid.getName());
        writableMapCreateMap.putString("homeId", homeByDid.getId());
        writableMapCreateMap.putString("homeName", homeByDid.getRawName());
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, writableMapCreateMap));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public void getVersion(boolean z, Callback callback) {
        DeviceStat device = getDevice();
        if (device == null) {
            callback.invoke(Boolean.FALSE, "has no device");
        } else {
            getRnPluginHostApiProvider().getVersion(device, z, callback);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public void hasSetDeviceCall(Callback callback) {
        getRnPluginHostApiProvider().hasSetDeviceCall(getDevice().did, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public void loadSubDevices(String str, Callback callback) {
        if (TextUtils.isEmpty(str)) {
            callback.invoke(Boolean.FALSE, "did is empty...");
        } else {
            if (getDevice() == null) {
                callback.invoke(Boolean.FALSE, "current device is null...");
                return;
            }
            getRnPluginHostApiProvider().getSubDevice(getDevice().model, new String[]{str}, callback);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public void localPingWithCallback(String str, Callback callback) {
        getRnPluginHostApiProvider().localPingWithCallback(str, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public void readDeviceNetWorkInfo(String str, Callback callback) {
        if (callback != null) {
            DeviceStat deviceByDid = getRnPluginHostApiProvider().getDeviceByDid(str);
            if (deviceByDid == null) {
                callback.invoke(Boolean.FALSE, "device info is null, please  insure your did is right!");
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(DeviceTagInterface.ROUTER_BSSID, deviceByDid.bssid);
            writableNativeMap.putString("ssid", deviceByDid.ssid);
            writableNativeMap.putInt("rssi", deviceByDid.rssi);
            callback.invoke(Boolean.TRUE, writableNativeMap);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public void reportDeviceGPSInfo(Callback callback) {
        if (callback == null) {
            return;
        }
        DeviceStat device = getDevice();
        if (device == null) {
            callback.invoke(Boolean.FALSE, "device is null...");
        } else {
            getRnPluginHostApiProvider().reportDeviceGPSInfo(device, callback);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public void requestAuthorizedDeviceListData(String str, Callback callback) {
        getRnPluginHostApiProvider().requestAuthorizedDeviceListData(str, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public void sendKeyFramePayLoad(String str, int i, String str2, Callback callback) {
        if (callback == null) {
            return;
        }
        DeviceStat device = getDevice();
        if (device == null) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(RnApiErrorInfo.DEVICE_ERROR));
        } else if (TextUtils.isEmpty(str)) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(RnApiErrorInfo.PARAMS_ERROR, "params payload is empty..."));
        } else {
            getRnAppProxyProvider().setGatewayScene(str, device, i, str2, callback);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public void setCommonUseDeviceSwitch(ReadableMap readableMap, final Callback callback) {
        RnPluginLog.writePluginLog("MIOTDeviceModule,setCommonUseDeviceSwitch: called");
        DeviceStat device = getDevice();
        if (device == null) {
            MRnLog.w(TAG, "setCommonUseDeviceSwitch：deviceStat is null");
            return;
        }
        try {
            Home homeByDid = getRnAppProxyProvider().getHomeByDid(device.did);
            if (homeByDid == null) {
                MRnLog.w(TAG, "setCommonUseDeviceSwitch：getHomeByDid return null");
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("getHomeByDid return null"));
                return;
            }
            if (homeByDid.getPermitLevel() < 9) {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("Can only be configured by the home's admin"));
                return;
            }
            final String str = device.did;
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            String string = MIOTUtils.getString(readableMap, "switchStatus");
            boolean zEquals = "1".equals(string);
            RnPluginLog.writePluginLog("MIOTDeviceModule,setCommonUseDeviceSwitch,setStr=" + string);
            getRnPluginHostApiProvider().setCommonUseDeviceSwitch(arrayList, zEquals, new com.xiaomi.smarthome.device.api.Callback<Boolean>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTDeviceModuleCore.5
                @Override // com.xiaomi.smarthome.device.api.Callback
                public void onFailure(int i, String str2) {
                    RnPluginLog.writePluginLog("MIOTDeviceModule,setCommonUseDeviceSwitch：onFailure,d=" + str + ",errorInfo=" + str2);
                    Arguments.createMap();
                    callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(i, str2));
                }

                @Override // com.xiaomi.smarthome.device.api.Callback
                public void onSuccess(Boolean bool) {
                    RnPluginLog.writePluginLog("MIOTDeviceModule,setCommonUseDeviceSwitch：onSuccess,result=" + bool);
                    callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(Arguments.createMap()));
                }
            });
        } catch (Exception e) {
            RnPluginLog.writePluginLog("MIOTDeviceModule,setCommonUseDeviceSwitch：error,Exception=" + e);
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-1, "Exception:" + Log.getStackTraceString(e)));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public final void setNativePrivacyConfirmationVersion(ReadableMap readableMap) {
        DeviceStat device = getDevice();
        if (device == null) {
            MRnLog.w(TAG, "setNativePrivacyConfirmationVersion：deviceStat is null");
            return;
        }
        String string = MIOTUtils.getString(readableMap, "version");
        MRnLog.i(TAG, "MIOTDeviceModule,setNativePrivacyConfirmationVersion：version=" + string);
        getRnPluginHostApiProvider().setNativePrivacyConfirmationVersion(device.did, string);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public final void setPrivacyConfirmation(ReadableMap readableMap, Callback callback) {
        DeviceStat device = getDevice();
        if (device == null) {
            MRnLog.w(TAG, "getNativePrivacyConfirmationVersion：deviceStat is null");
            return;
        }
        RnPluginDeviceInfo pluginInfo = getPluginInfo();
        if (pluginInfo == null) {
            MRnLog.w(TAG, "getNativePrivacyConfirmationVersion：record is null");
        }
        String string = MIOTUtils.getString(readableMap, "privacyVersion");
        String string2 = MIOTUtils.getString(readableMap, "type");
        int i = MIOTUtils.getInt(readableMap, "privacyType");
        String str = MIOTUtils.readableArrToJsonStr(MIOTUtils.getArray(readableMap, "sysPermissionInfo"));
        int i2 = pluginInfo.mProductId;
        int i3 = MIOTUtils.getInt(readableMap, "pluginPrivacyId");
        MRnLog.i(TAG, "MIOTDeviceModule,setPrivacyConfirmation：privacyVersion=" + string);
        getRnPluginHostApiProvider().setPrivacyConfirmation(device.did, string2, string, 4, i, i2, str, i3, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public final void specifyDeviceNeedUpdateLocalPravicyVersion(ReadableMap readableMap) {
        DeviceStat device = getDevice();
        if (device == null) {
            MRnLog.w(TAG, "specifyDeviceNeedUpdateLocalPravicyVersion：deviceStat is null");
            return;
        }
        if (TextUtils.isEmpty(getRnPluginHostApiProvider().getNativePrivacyConfirmationVersion(device.did))) {
            String string = MIOTUtils.getString(readableMap, "version");
            MRnLog.i(TAG, "MIOTDeviceModule,specifyDeviceNeedUpdateLocalPravicyVersion：version=" + string);
            getRnPluginHostApiProvider().setNativePrivacyConfirmationVersion(device.did, string);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public void subscribeMessages(String str, ReadableArray readableArray, Callback callback) {
        DeviceStat device = getDevice();
        RnPluginDeviceInfo pluginInfo = getPluginInfo();
        RnPluginLog.addFrameworkLog("SubscribeMessagesLogTag", "================开始订阅=====================");
        RnPluginLog.addFrameworkLog("SubscribeMessagesLogTag", "监听属性：" + readableArray.toString());
        if (pluginInfo == null || device == null) {
            callback.invoke(Boolean.FALSE, "no device pluginRecord ");
        } else {
            getRnPluginHostApiProvider().subscribeMessages(getReactApplicationContext(), str, device.pid, readableArray, callback);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTDevice
    @ReactMethod
    public void unsubscribeMessages(String str, ReadableArray readableArray, String str2, Callback callback) {
        DeviceStat device = getDevice();
        if (getPluginInfo() == null || device == null) {
            callback.invoke(Boolean.FALSE, "no device pluginRecord ");
        } else {
            getRnPluginHostApiProvider().unsubscribeMessages(str, readableArray, device.pid, str2, callback);
        }
    }
}
