package com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes2.dex */
public interface IMIOTBluetooth {
    void bindDevice(String str);

    void call(String str, int i, ReadableMap readableMap, Callback callback);

    void checkBluetoothPermission(Callback callback);

    void connect(String str, int i, ReadableMap readableMap, Callback callback);

    void decryptMessageXiaoMiBLE(String str, String str2, Callback callback);

    void disconnectDeviceWithDelay(String str, double d);

    void discoverCharacteristics(String str, ReadableArray readableArray, String str2);

    void discoverServices(String str, ReadableArray readableArray);

    void doSpecOperation(String str, int i, String str2, Callback callback);

    void encryptMessageXiaoMiBLE(String str, String str2, Callback callback);

    void generateOneTimePwdBySelf(ReadableMap readableMap, Callback callback);

    void getTokenMd5(String str, Callback callback);

    void getVersion(String str, boolean z, Callback callback);

    void goToWifiConfigStep(String str);

    void initOneTimeContextBySelf(ReadableMap readableMap, Callback callback);

    void isAutoReconnect(String str, Callback callback);

    void isBleGatewayConnected(String str, Callback callback);

    void isBleOrMeshGatewayConnected(String str, boolean z, Callback callback);

    void isBluetoothHalfOpen(Callback callback);

    void isBluetoothOpen(Callback callback);

    void isShareSecureKeyValid(String str, Callback callback);

    void miotBleDecrypt(String str, String str2, Callback callback);

    void miotBleEncrypt(String str, String str2, Callback callback);

    void oneTimePassword(String str, int i, int i2, Callback callback);

    void openBluetooth(boolean z);

    void readHexStringWithCallback(String str, String str2, String str3, Callback callback);

    void readRSSI(String str, Callback callback);

    void registerBlockListener(String str, Callback callback);

    void registerCharacterChanged(String str, String str2, String str3, Callback callback);

    void registerMediaButtonReceiver(String str);

    void removeToken(String str);

    void setAlertConfigs(String str, int i, boolean z, Callback callback);

    void setAutoReconnect(String str, boolean z, Callback callback);

    void setIndicationWithCallback(String str, boolean z, String str2, String str3, Callback callback);

    void setNotifyWithCallback(String str, boolean z, String str2, String str3, Callback callback);

    void startLeScan(int i, ReadableArray readableArray);

    void startScan(int i, int i2);

    void stopScan();

    void toggleLockXiaoMiBLE(String str, int i, int i2, Callback callback);

    void unBindDevice(String str);

    void unRegisterMediaButtonReceiver(String str);

    void unregisterBlockListener(String str);

    void unregisterCharacterChanged(String str, String str2, String str3);

    void writeBlock(String str, String str2, Callback callback);

    void writeHexStringWithCallback(String str, String str2, String str3, String str4, int i, Callback callback);
}
