package com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes2.dex */
public interface IMIOTDevice {
    void callMethod(String str, String str2, String str3, String str4, Callback callback);

    void callMethodFromCloud(String str, String str2, String str3, String str4, Callback callback);

    void callMethodFromLocal(String str, String str2, String str3, String str4, Callback callback);

    void changeDeviceName(String str, String str2, Callback callback);

    void getAllDevicesOfBelongedCompanies(Callback callback);

    void getCurrentDeviceValue(Callback callback);

    void getDeviceTimeZone(String str, Callback callback);

    void getFreqCameraFlag(Callback callback);

    void getFreqFlag(Callback callback);

    void getHomeDeviceList(Callback callback);

    void getLinkedBTDevices(String str, Callback callback);

    void getNativePrivacyConfirmationVersion(ReadableMap readableMap, Callback callback);

    void getRecommendScenes(String str, String str2, Callback callback);

    void getRoomInfoForCurrentHome(String str, Callback callback);

    void getVersion(boolean z, Callback callback);

    void hasSetDeviceCall(Callback callback);

    void loadSubDevices(String str, Callback callback);

    void localPingWithCallback(String str, Callback callback);

    void readDeviceNetWorkInfo(String str, Callback callback);

    void reportDeviceGPSInfo(Callback callback);

    void requestAuthorizedDeviceListData(String str, Callback callback);

    void sendKeyFramePayLoad(String str, int i, String str2, Callback callback);

    void setCommonUseDeviceSwitch(ReadableMap readableMap, Callback callback);

    void setNativePrivacyConfirmationVersion(ReadableMap readableMap);

    void setPrivacyConfirmation(ReadableMap readableMap, Callback callback);

    void specifyDeviceNeedUpdateLocalPravicyVersion(ReadableMap readableMap);

    void subscribeMessages(String str, ReadableArray readableArray, Callback callback);

    void unsubscribeMessages(String str, ReadableArray readableArray, String str2, Callback callback);
}
