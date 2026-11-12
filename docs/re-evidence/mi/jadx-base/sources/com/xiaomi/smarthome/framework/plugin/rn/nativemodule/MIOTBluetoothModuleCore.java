package com.xiaomi.smarthome.framework.plugin.rn.nativemodule;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.framework.plugin.rn.RnModuleProvider;
import com.xiaomi.smarthome.framework.plugin.rn.constants.MiotNativeModuleConstants;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnCallbackMapUtil;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;
import defpackage.aje;
import defpackage.ndj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@ndj(name = MIOTBluetoothModuleCore.NAME)
public class MIOTBluetoothModuleCore extends MIOTBaseJavaModule implements IMIOTBluetooth, ReactModuleWithSpec {
    public static final String NAME = "MIOTBluetooth";

    public MIOTBluetoothModuleCore(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void bindDevice(String str) {
        getProvider().bindDevice(str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void call(String str, int i, ReadableMap readableMap, Callback callback) {
        getProvider().call(str, i, readableMap, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void checkBluetoothPermission(Callback callback) {
        getProvider().checkBluetoothPermission(getCurrentActivity(), callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void connect(String str, int i, ReadableMap readableMap, Callback callback) {
        getProvider().connect(getCurrentActivity(), getDevice(), str, i, readableMap, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void decryptMessageXiaoMiBLE(String str, String str2, Callback callback) {
        getProvider().decryptMessageXiaoMiBLE(str, str2, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void disconnectDeviceWithDelay(String str, double d) {
        getProvider().disconnectDeviceWithDelay(str, d);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void discoverCharacteristics(String str, ReadableArray readableArray, String str2) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null || readableArray == null) {
            return;
        }
        String[] strArr = new String[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            strArr[i] = readableArray.getString(i);
        }
        aje.b(reactApplicationContext).d(new Intent().setAction(MiotNativeModuleConstants.DISCOVERCHARACTERISTICS_CALLBACK).putExtra(MiotNativeModuleConstants.EMIT_MAC, str).putExtra(MiotNativeModuleConstants.EMIT_SERVICEID, str2).putExtra(MiotNativeModuleConstants.EMIT_UUID, strArr));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void discoverServices(String str, ReadableArray readableArray) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null || readableArray == null) {
            return;
        }
        String[] strArr = new String[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            strArr[i] = readableArray.getString(i);
        }
        aje.b(reactApplicationContext).d(new Intent().setAction(MiotNativeModuleConstants.DISCOVERSERVICES_CALLBACK).putExtra(MiotNativeModuleConstants.EMIT_MAC, str).putExtra(MiotNativeModuleConstants.EMIT_UUID, strArr));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void doSpecOperation(String str, int i, String str2, Callback callback) {
        RnPluginLog.d("doSpecOperation opcode =" + i + ",json params =" + str2);
        getProvider().doSpecOperation(str, i, str2, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void encryptMessageXiaoMiBLE(String str, String str2, Callback callback) {
        getProvider().encryptMessageXiaoMiBLE(str, str2, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public final void generateOneTimePwdBySelf(ReadableMap readableMap, Callback callback) {
        getProvider().generateOneTimePwdBySelf(readableMap, callback);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public IRnBluetoothProvider getProvider() {
        return (IRnBluetoothProvider) RnModuleProvider.as(IRnBluetoothProvider.class);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void getTokenMd5(String str, Callback callback) {
        callback.invoke(getProvider().getTokenMd5(str));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void getVersion(String str, boolean z, Callback callback) {
        if (getPluginInfo() == null) {
            callback.invoke(Boolean.FALSE, "no device pluginRecord ");
        } else {
            getProvider().getVersion(str, callback);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void goToWifiConfigStep(String str) {
        getProvider().goToWifiConfigStep(getCurrentActivity(), str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public final void initOneTimeContextBySelf(ReadableMap readableMap, Callback callback) {
        getProvider().initOneTimeContextBySelf(readableMap, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void isAutoReconnect(String str, Callback callback) {
        callback.invoke(Boolean.valueOf(getProvider().isAutoReconnect(str)));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void isBleGatewayConnected(String str, Callback callback) {
        getProvider().isBleGatewayConnected(str, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void isBleOrMeshGatewayConnected(final String str, boolean z, final Callback callback) {
        if (TextUtils.isEmpty(str)) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-1, "mac is null or empty."));
            return;
        }
        List<DeviceStat> bleGatewayDeviceList = getRnPluginHostApiProvider().getBleGatewayDeviceList();
        ArrayList arrayList = new ArrayList();
        if (bleGatewayDeviceList != null && bleGatewayDeviceList.size() > 0) {
            for (DeviceStat deviceStat : bleGatewayDeviceList) {
                if (deviceStat != null && !TextUtils.isEmpty(deviceStat.did)) {
                    arrayList.add(deviceStat.did);
                }
            }
        }
        if (arrayList.size() == 0) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-2, "cann't find any gateway device."));
            return;
        }
        DeviceStat device = getDevice();
        if (device == null || getRnPluginHostApiProvider().isOutNetEnabled() || !getRnPluginHostApiProvider().isLocalControlCanUse(device.did)) {
            getRnPluginHostApiProvider().getBleGatewaySubDevices(arrayList, device != null ? Collections.singletonList(device.did) : Collections.emptyList(), new com.xiaomi.smarthome.device.api.Callback<List<DeviceStat>>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTBluetoothModuleCore.1
                @Override // com.xiaomi.smarthome.device.api.Callback
                public void onFailure(int i, String str2) {
                    callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-3, String.format("internal error,code:%d,info:%s", Integer.valueOf(i), str2)));
                }

                @Override // com.xiaomi.smarthome.device.api.Callback
                public void onSuccess(List<DeviceStat> list) {
                    if (list == null || list.size() == 0) {
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putBoolean("connected", false);
                        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(writableMapCreateMap));
                        return;
                    }
                    for (DeviceStat deviceStat2 : list) {
                        if (deviceStat2 != null && str.equalsIgnoreCase(deviceStat2.mac)) {
                            WritableMap writableMapCreateMap2 = Arguments.createMap();
                            writableMapCreateMap2.putBoolean("connected", true);
                            DeviceStat deviceByDid = MIOTBluetoothModuleCore.this.getRnPluginHostApiProvider().getDeviceByDid(deviceStat2.parentId);
                            if (deviceByDid != null) {
                                writableMapCreateMap2.putString("mac", deviceByDid.mac);
                            }
                            callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(writableMapCreateMap2));
                            return;
                        }
                    }
                    WritableMap writableMapCreateMap3 = Arguments.createMap();
                    writableMapCreateMap3.putBoolean("connected", false);
                    callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(writableMapCreateMap3));
                }
            });
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("connected", true);
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(writableMapCreateMap));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void isBluetoothHalfOpen(Callback callback) {
        callback.invoke(Boolean.valueOf(getProvider().isBluetoothHalfOpen()));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void isBluetoothOpen(Callback callback) {
        callback.invoke(Boolean.valueOf(getProvider().isBluetoothOpen()));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void isShareSecureKeyValid(String str, Callback callback) {
        getProvider().isSecurityChipSharedKeyValid(str, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void miotBleDecrypt(String str, String str2, Callback callback) {
        getProvider().miotBleDecrypt(str, str2, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void miotBleEncrypt(String str, String str2, Callback callback) {
        getProvider().miotBleEncrypt(str, str2, callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        getProvider().onCatalystInstanceDestroy(getDevice() != null ? getDevice().model : "");
        super.onCatalystInstanceDestroy();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void oneTimePassword(String str, int i, int i2, Callback callback) {
        getProvider().getOneTimePassword(str, i, i2, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void openBluetooth(boolean z) {
        getProvider().openBluetooth(getCurrentActivity(), getDevice() != null ? getDevice().model : "", z);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void readHexStringWithCallback(String str, String str2, String str3, Callback callback) {
        getProvider().readHexStringWithCallback(str, str2, str3, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void readRSSI(String str, Callback callback) {
        getProvider().readRSSI(str, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void registerBlockListener(String str, Callback callback) {
        getProvider().registerBlockListener(str, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void registerCharacterChanged(String str, String str2, String str3, Callback callback) {
        getProvider().registerCharacterChanged(str, str2, str3, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void registerMediaButtonReceiver(String str) {
        getProvider().registerMediaButtonReceiver(str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void removeToken(String str) {
        getProvider().removeToken(str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void setAlertConfigs(String str, int i, boolean z, Callback callback) {
        getProvider().setAlertConfigs(str, i, z, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void setAutoReconnect(String str, boolean z, Callback callback) {
        getProvider().setAutoReconnect(str, z, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void setIndicationWithCallback(String str, boolean z, String str2, String str3, Callback callback) {
        getProvider().setIndicationWithCallback(str, z, str2, str3, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void setNotifyWithCallback(String str, boolean z, String str2, String str3, Callback callback) {
        getProvider().setNotifyWithCallback(str, z, str2, str3, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void startLeScan(int i, ReadableArray readableArray) {
        getProvider().startLeScan(getReactApplicationContext(), i, readableArray);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    @Deprecated
    public void startScan(int i, int i2) {
        getProvider().startScan(getReactApplicationContext(), i, i2);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void stopScan() {
        getProvider().stopScan();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void toggleLockXiaoMiBLE(String str, int i, int i2, Callback callback) {
        getProvider().toggleLockXiaoMiBLE(str, i, i2, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void unBindDevice(String str) {
        getProvider().unBindDevice(str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void unRegisterMediaButtonReceiver(String str) {
        getProvider().unRegisterMediaButtonReceiver(str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void unregisterBlockListener(String str) {
        getProvider().unregisterBlockListener(str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void unregisterCharacterChanged(String str, String str2, String str3) {
        getProvider().unregisterCharacterChanged(str, str2, str3);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void writeBlock(String str, String str2, Callback callback) {
        getProvider().writeBlock(str, str2, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTBluetooth
    @ReactMethod
    public void writeHexStringWithCallback(String str, String str2, String str3, String str4, int i, Callback callback) {
        getProvider().writeHexStringWithCallback(str, str2, str3, str4, i, callback);
    }
}
