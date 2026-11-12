package com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes2.dex */
public interface IMIOTSystem {
    void checkAPPSystemConfigEnable(String str, Callback callback);

    void connectWifi(String str, String str2);

    void getBatteryInfo(Callback callback);

    void getGatewayIpAddress(Callback callback);

    @Deprecated
    void getLocation(String str, Callback callback);

    void getLocationServerState(Callback callback);

    void getNfcInfo(Callback callback);

    void getVolumeInfo(Callback callback);

    void getWifiBroadcastAddress(Callback callback);

    void isMiConnectSupportNFC(ReadableMap readableMap, Callback callback);

    void openAPPSystemConfigPage(String str);

    void scanCode(Callback callback);

    void startAccelerometer(String str, Callback callback);

    void startAdvertising(ReadableMap readableMap);

    void startCompass(String str, Callback callback);

    void startGyroscope(String str, Callback callback);

    void startShakeListener(Callback callback);

    void startVolume(ReadableMap readableMap, Callback callback);

    void stopAccelerometer(Callback callback);

    void stopCompass(Callback callback);

    void stopGyroscope(Callback callback);

    void stopShakeListener(Callback callback);

    void stopVolume(Callback callback);

    void vibrateLong();

    void vibrateShort();

    void writeNFCData(ReadableMap readableMap, Callback callback);
}
