package com.xiaomi.smarthome.framework.plugin.rn.core.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.device.api.Parser;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface IRnPluginHostApiProvider {
    void addNewRoomWithName(String str, Callback callback);

    void callMethod(DeviceStat deviceStat, String str, String str2, String str3, String str4, Callback callback);

    void callMethodFromCloud(DeviceStat deviceStat, String str, String str2, String str3, String str4, Callback callback);

    void callMethodFromLocal(DeviceStat deviceStat, String str, String str2, String str3, String str4, Callback callback);

    void callSmartHomeAPI(ReactApplicationContext reactApplicationContext, String str, String str2, String str3, Callback callback);

    <T> void callSmartHomeApi(String str, String str2, String str3, com.xiaomi.smarthome.device.api.Callback<T> callback, Parser<T> parser);

    void createExecutor(ReactApplicationContext reactApplicationContext, String str, String str2, Callback callback);

    void delDataWhileRevokeLicense(PluginPackageInfo pluginPackageInfo, DeviceStat deviceStat);

    void delDeviceNativeData(String str);

    void delScenes(String str, List<String> list, Callback callback);

    void editRoom(String str, String str2, Callback callback);

    void editSceneV2(String str, int i, String str2, String str3, String str4, String str5, JSONObject jSONObject, JSONArray jSONArray, Callback callback);

    void executeMethod(String str, String str2, String str3, Callback callback);

    String getAccountId();

    List<DeviceStat> getBleGatewayDeviceList();

    void getBleGatewaySubDevices(List<String> list, List<String> list2, com.xiaomi.smarthome.device.api.Callback<List<DeviceStat>> callback);

    String getBusinessType();

    String getCurrentServer();

    DeviceStat getDeviceByDid(String str);

    List<DeviceStat> getDeviceList();

    JSONArray getDeviceProp(String str);

    String getHomeDeviceList();

    String getHomeList();

    String getNativePrivacyConfirmationVersion(String str);

    Parser<String> getParserForRawResult();

    void getRecommendScenes(String str, String str2, com.xiaomi.smarthome.device.api.Callback<JSONObject> callback);

    void getRoomList(boolean z, Callback callback);

    List<String> getRoomNames(List<String> list);

    int getSdkApiLevel();

    void getSubDevice(String str, String[] strArr, Callback callback);

    int getUsePreviewConfig();

    void getVersion(DeviceStat deviceStat, boolean z, Callback callback);

    String getVirtualGroupStatus(String str);

    void hasSetDeviceCall(String str, Callback callback);

    boolean isLocalControlCanUse(String str);

    boolean isOutNetEnabled();

    void jumpToThirdPartApp(Activity activity, Intent intent, Callback callback);

    void loadAccountInfo(String str, Callback callback);

    void localPingWithCallback(String str, Callback callback);

    void modDeviceName(String str, String str2, com.xiaomi.smarthome.device.api.Callback<Void> callback);

    void openDevice(Context context, String str, String str2, ReadableMap readableMap, Callback callback);

    void openPluginPage(Activity activity, String str, String str2, ReadableMap readableMap, Callback callback);

    void reportDeviceGPSInfo(DeviceStat deviceStat, Callback callback);

    void requestAuthorizedDeviceListData(String str, Callback callback);

    void saveStringToNotesAppOnMIUI(String str, com.xiaomi.smarthome.device.api.Callback<Void> callback);

    void setCommonUseDeviceSwitch(List<String> list, boolean z, com.xiaomi.smarthome.device.api.Callback<Boolean> callback);

    void setNativePrivacyConfirmationVersion(String str, String str2);

    void setPrivacyConfirmation(String str, String str2, String str3, int i, int i2, int i3, String str4, int i4, Callback callback);

    void subscribeMessages(ReactApplicationContext reactApplicationContext, String str, int i, ReadableArray readableArray, Callback callback);

    void unsubscribeMessages(String str, ReadableArray readableArray, int i, String str2, Callback callback);
}
