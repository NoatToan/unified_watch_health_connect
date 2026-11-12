package com.xiaomi.smarthome.framework.plugin.rn.core.api;

import android.app.Activity;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.xiaomi.smarthome.device.api.DeviceStat;

/* JADX INFO: loaded from: classes2.dex */
public interface IRnBluetoothProvider {
    void bindDevice(String str);

    void call(String str, int i, ReadableMap readableMap, Callback callback);

    void checkBluetoothPermission(Activity activity, Callback callback);

    void connect(Activity activity, DeviceStat deviceStat, String str, int i, ReadableMap readableMap, Callback callback);

    void decryptMessageXiaoMiBLE(String str, String str2, Callback callback);

    void disconnectDeviceWithDelay(String str, double d);

    void doSpecOperation(String str, int i, String str2, Callback callback);

    void encryptMessageXiaoMiBLE(String str, String str2, Callback callback);

    void generateOneTimePwdBySelf(ReadableMap readableMap, Callback callback);

    void getOneTimePassword(String str, int i, int i2, Callback callback);

    String getTokenMd5(String str);

    void getVersion(String str, Callback callback);

    void goToWifiConfigStep(Activity activity, String str);

    void initOneTimeContextBySelf(ReadableMap readableMap, Callback callback);

    boolean isAutoReconnect(String str);

    void isBleGatewayConnected(String str, Callback callback);

    boolean isBluetoothHalfOpen();

    boolean isBluetoothOpen();

    void isSecurityChipSharedKeyValid(String str, Callback callback);

    void miotBleDecrypt(String str, String str2, Callback callback);

    void miotBleEncrypt(String str, String str2, Callback callback);

    void onCatalystInstanceDestroy(String str);

    void openBluetooth(Activity activity, String str, boolean z);

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

    void startLeScan(ReactApplicationContext reactApplicationContext, int i, ReadableArray readableArray);

    void startScan(ReactApplicationContext reactApplicationContext, int i, int i2);

    void stopScan();

    void toggleLockXiaoMiBLE(String str, int i, int i2, Callback callback);

    void unBindDevice(String str);

    void unRegisterMediaButtonReceiver(String str);

    void unregisterBlockListener(String str);

    void unregisterCharacterChanged(String str, String str2, String str3);

    void writeBlock(String str, String str2, Callback callback);

    void writeHexStringWithCallback(String str, String str2, String str3, String str4, int i, Callback callback);
}
