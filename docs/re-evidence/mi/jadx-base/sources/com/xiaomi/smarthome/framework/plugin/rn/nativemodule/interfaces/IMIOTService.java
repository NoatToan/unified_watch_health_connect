package com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes2.dex */
public interface IMIOTService {
    void activeABTestByPath(ReadableMap readableMap);

    void addLog(String str, String str2);

    void addStat(String str, String str2, ReadableMap readableMap);

    void callMiCloudAPI(String str, String str2, ReadableMap readableMap, ReadableMap readableMap2, Callback callback);

    void callSmartHomeAPI(String str, String str2, Callback callback);

    void callSmartHomeCameraAPI(String str, String str2, boolean z, ReadableMap readableMap, Callback callback);

    void callSmartHomeCameraAPIWithStringParam(String str, String str2, boolean z, String str3, Callback callback);

    void callSpecificAPI(String str, String str2, ReadableMap readableMap, Callback callback);

    void deleteDevice(Callback callback);

    void deleteSceneRecords(ReadableArray readableArray, Callback callback);

    void editSceneRecord(ReadableMap readableMap, Callback callback);

    void getABTestConfigByPath(ReadableMap readableMap, Callback callback);

    void getCustomPluginInfo(ReadableMap readableMap, Callback callback);

    void getDeviceIcon(ReadableMap readableMap, Callback callback);

    void getHomeList(ReadableMap readableMap, Callback callback);

    void getHomepageSettings(Callback callback);

    void getSTDGuideSettings(String str, Callback callback);

    void getServerName(Callback callback);

    void getServiceTokenWithSid(String str, Callback callback);

    void getTvList(Callback callback);

    void getVirtualDeviceCombineStatus(ReadableMap readableMap, Callback callback);

    void goEditRecommendScene(ReadableMap readableMap);

    void loadAccountInfo(String str, Callback callback);

    void reportEvent(String str, ReadableMap readableMap);

    void reportEventRefChannel(String str, ReadableMap readableMap);

    void reportMJFStatLog(String str, ReadableMap readableMap);

    void requestAuthForAlexaVoiceService(ReadableMap readableMap, Callback callback);

    void revokePrivacyLicense(Callback callback);

    void setHomepageSettings(ReadableMap readableMap);

    void setSTDGuideSettings(String str, boolean z);

    void updatePluginPageRef(ReadableMap readableMap);
}
