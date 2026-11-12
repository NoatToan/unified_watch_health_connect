package com.xiaomi.smarthome.core.server.internal.bluetooth;

import android.os.Bundle;
import android.util.Pair;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleDeleteDeviceCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetRequest;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleRpcCallback;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.frame.AsyncCallback;
import com.xiaomi.smarthome.frame.Error;
import com.xiaomi.smarthome.homeroom.model.Home;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public class DefaultBleCoreProvider implements IBleCoreProvider {
    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public void delDeviceBatch(List<String> list, BleDeleteDeviceCallback bleDeleteDeviceCallback) {
        if (bleDeleteDeviceCallback != null) {
            bleDeleteDeviceCallback.onFailure(new Bundle());
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public void generateOneTimePwdBySelf(String str, AsyncCallback<String, Error> asyncCallback) {
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public int getBluetoothBindStyle(String str) {
        return 0;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public Home getCurrentHome() {
        return null;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public Device getDeviceByDid(String str) {
        return null;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public List<Device> getDeviceList() {
        return new ArrayList();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public String getMachineCode() {
        return "cn";
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public String getMiId() {
        return "";
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public String getModelByProductId(int i) {
        return "";
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public String getPluginNameByModel(String str) {
        return "";
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public int getProductIdByModel(String str) {
        return 0;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public void initOneTimeContextBySelf(String str, int i, int i2, AsyncCallback<String, Error> asyncCallback) {
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public boolean isBluetoothGatewayDevice(String str) {
        return false;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public boolean isBluetoothSecurityChipDevice(String str) {
        return false;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public boolean isEuropeServer() {
        return false;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public boolean isInternationalServer() {
        return false;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public boolean isKuailianUseA4() {
        return false;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public boolean isLockCanShare(String str) {
        return false;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public Pair<Boolean, String> isMeshDevice(String str) {
        return null;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public boolean isPluginDevice(String str) {
        return false;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public boolean isShareDevice(String str) {
        return false;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public boolean isXiaoaiSupportA4(String str) {
        return false;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public void onBleCharacterChanged(String str, UUID uuid, UUID uuid2, byte[] bArr) {
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public void reportStat(String str, String str2) {
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public void rpcAsync(String str, String str2, String str3, BleRpcCallback bleRpcCallback) {
        if (bleRpcCallback != null) {
            bleRpcCallback.onFailure(-1, "BleCoreProvider need implement");
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public void sendSmartHomeRequest(BleNetRequest bleNetRequest, BleNetCallback bleNetCallback) {
        if (bleNetCallback != null) {
            bleNetCallback.onFailed(-1, "BleCoreProvider need implement");
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public void writeLogOnAll(String str, String str2) {
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public void writeLogOnDebug(String str, String str2) {
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public void writeLogOnGrey(String str, String str2) {
    }
}
