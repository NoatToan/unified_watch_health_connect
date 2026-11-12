package com.huawei.indoorequip.device;

import android.os.Bundle;
import com.huawei.btsportdevice.callback.MessageOrStateCallback;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.device.model.DeviceInformation;
import com.huawei.hmf.annotation.ApiDefine;
import defpackage.nxs;
import java.util.Map;

/* JADX INFO: loaded from: classes40.dex */
@ApiDefine(uri = IndoorEquipManagerApi.class)
public class IndoorEquipManagerImpl implements IndoorEquipManagerApi {
    @Override // com.huawei.health.device.base.BaseDeviceManagerApi
    public void init() {
        nxs.d().e();
    }

    @Override // com.huawei.health.device.base.BaseDeviceManagerApi
    public void setMessageOrStateCallback(String str, MessageOrStateCallback messageOrStateCallback, boolean z) {
        nxs.d().a(str, messageOrStateCallback);
    }

    @Override // com.huawei.health.device.api.IndoorEquipManagerApi
    public void disconnect(boolean z) {
        nxs.d().a(z);
    }

    @Override // com.huawei.health.device.api.IndoorEquipManagerApi
    public void connectByMac(boolean z, String str) {
        nxs.d().e(z, str);
    }

    @Override // com.huawei.health.device.api.IndoorEquipManagerApi
    public boolean reConnect() {
        return nxs.d().j();
    }

    @Override // com.huawei.health.device.api.IndoorEquipManagerApi
    public void connectByName(boolean z, String str) {
        nxs.d().c(z, str);
    }

    @Override // com.huawei.health.device.api.IndoorEquipManagerApi
    public void onlyConnectByMacOrName(String str, String str2) {
        nxs.d().a(str, str2);
    }

    @Override // com.huawei.health.device.api.IndoorEquipManagerApi
    public void startDiscoverServices() {
        nxs.d().o();
    }

    @Override // com.huawei.health.device.api.IndoorEquipManagerApi
    public DeviceInformation getDeviceInformation() {
        return nxs.d().a();
    }

    @Override // com.huawei.health.device.api.IndoorEquipManagerApi
    public void cancelPairing() {
        nxs.d().b();
    }

    @Override // com.huawei.health.device.api.IndoorEquipManagerApi
    public void sendByteToEquip(byte[] bArr) {
        nxs.d().d(bArr);
    }

    @Override // com.huawei.health.device.base.BaseDeviceManagerApi
    public void setFitnessMachineControl(int i, int[] iArr) {
        nxs.d().d(i, iArr);
    }

    @Override // com.huawei.health.device.base.BaseDeviceManagerApi
    public void setFitnessMachineControl(int i, int i2, int[] iArr) {
        nxs.d().d(i, i, iArr);
    }

    @Override // com.huawei.health.device.api.IndoorEquipManagerApi
    public void setHeartRateFromWearable(int i) {
        nxs.d().d(i);
    }

    @Override // com.huawei.health.device.api.IndoorEquipManagerApi
    public void setRealStartWorkout() {
        nxs.d().n();
    }

    @Override // com.huawei.health.device.base.BaseDeviceManagerApi
    public String getCurrentMacAddress() {
        return nxs.d().c();
    }

    @Override // com.huawei.health.device.base.BaseDeviceManagerApi
    public void removeMessageOrStateCallback(String str, boolean z) {
        nxs.d().d(str, z);
    }

    @Override // com.huawei.health.device.base.BaseDeviceManagerApi
    public void releaseResource() {
        nxs.d().m();
        nxs.d().c(false);
    }

    @Override // com.huawei.health.device.api.IndoorEquipManagerApi
    public void stopThreadsInCsafeController() {
        nxs.d().q();
    }

    @Override // com.huawei.health.device.api.IndoorEquipManagerApi
    public void setHasExperiencedStateOfStartForFtmp(boolean z) {
        nxs.d().d(z);
    }

    @Override // com.huawei.health.device.api.IndoorEquipManagerApi
    public void setDeviceType(String str) {
        nxs.d().a(str);
    }

    @Override // com.huawei.health.device.api.IndoorEquipManagerApi
    public void setSuppressPause(boolean z) {
        nxs.d().b(z);
    }

    @Override // com.huawei.health.device.api.IndoorEquipManagerApi
    public boolean isFitnessMachineProfile() {
        return nxs.d().g();
    }

    @Override // com.huawei.health.device.api.IndoorEquipManagerApi
    public void stopSport() {
        nxs.d().r();
    }

    @Override // com.huawei.health.device.api.IndoorEquipManagerApi
    public boolean isDeviceBtConnected() {
        return nxs.d().h();
    }

    @Override // com.huawei.health.device.api.IndoorEquipManagerApi
    public void unPair(String str) {
        nxs.d().d(str);
    }

    @Override // com.huawei.health.device.api.IndoorEquipManagerApi
    public void setUnlockCode(int[] iArr) {
        nxs.d().c(iArr);
    }

    @Override // com.huawei.health.device.api.IndoorEquipManagerApi
    public void setSendCalorieToDevice(boolean z) {
        nxs.d().c(z);
    }

    @Override // com.huawei.health.device.api.IndoorEquipManagerApi
    public void sendExtensionCollectionControl(Map<String, String> map) {
        nxs.d().e(map);
    }

    @Override // com.huawei.health.device.api.IndoorEquipManagerApi
    public boolean isStartByDevice(Bundle bundle) {
        return nxs.d().c(bundle);
    }

    @Override // com.huawei.health.device.api.IndoorEquipManagerApi
    public boolean isStopByDevice(Bundle bundle) {
        return nxs.d().b(bundle);
    }
}
