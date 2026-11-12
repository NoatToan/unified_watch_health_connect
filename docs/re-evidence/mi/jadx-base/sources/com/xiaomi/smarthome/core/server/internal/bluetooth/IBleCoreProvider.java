package com.xiaomi.smarthome.core.server.internal.bluetooth;

import android.util.Pair;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleDeleteDeviceCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetRequest;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleRpcCallback;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.frame.AsyncCallback;
import com.xiaomi.smarthome.frame.Error;
import com.xiaomi.smarthome.homeroom.model.Home;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public interface IBleCoreProvider {
    void delDeviceBatch(List<String> list, BleDeleteDeviceCallback bleDeleteDeviceCallback);

    void generateOneTimePwdBySelf(String str, AsyncCallback<String, Error> asyncCallback);

    int getBluetoothBindStyle(String str);

    Home getCurrentHome();

    Device getDeviceByDid(String str);

    List<Device> getDeviceList();

    String getMachineCode();

    String getMiId();

    String getModelByProductId(int i);

    String getPluginNameByModel(String str);

    int getProductIdByModel(String str);

    void initOneTimeContextBySelf(String str, int i, int i2, AsyncCallback<String, Error> asyncCallback);

    boolean isBluetoothGatewayDevice(String str);

    boolean isBluetoothSecurityChipDevice(String str);

    boolean isEuropeServer();

    boolean isInternationalServer();

    boolean isKuailianUseA4();

    boolean isLockCanShare(String str);

    Pair<Boolean, String> isMeshDevice(String str);

    boolean isPluginDevice(String str);

    boolean isShareDevice(String str);

    boolean isXiaoaiSupportA4(String str);

    void onBleCharacterChanged(String str, UUID uuid, UUID uuid2, byte[] bArr);

    void reportStat(String str, String str2);

    void rpcAsync(String str, String str2, String str3, BleRpcCallback bleRpcCallback);

    void sendSmartHomeRequest(BleNetRequest bleNetRequest, BleNetCallback bleNetCallback);

    void writeLogOnAll(String str, String str2);

    void writeLogOnDebug(String str, String str2);

    void writeLogOnGrey(String str, String str2);
}
