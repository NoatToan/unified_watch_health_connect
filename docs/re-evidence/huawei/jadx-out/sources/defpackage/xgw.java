package defpackage;

import android.content.Context;
import com.huawei.devicesdk.callback.ConnectFilter;
import com.huawei.devicesdk.callback.DeviceCompatibleCallback;
import com.huawei.devicesdk.callback.DeviceScanCallback;
import com.huawei.devicesdk.callback.DeviceStatusChangeCallback;
import com.huawei.devicesdk.callback.MessageReceiveCallback;
import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.devicesdk.entity.ScanMode;
import com.huawei.devicesdk.entity.SendMode;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.unitedevice.api.UniteChannelInterface;
import com.huawei.unitedevice.entity.UniteDevice;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class xgw implements UniteChannelInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xgv f52960a;

    private xgw() {
        this.f52960a = xgv.b();
    }

    public void c(Context context) {
        this.f52960a.d(context);
    }

    public static xgw d() {
        return d.d;
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void scanDevice(ScanMode scanMode, List<cmy> list, DeviceScanCallback deviceScanCallback) {
        this.f52960a.scanDevice(scanMode, list, deviceScanCallback);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void stopScanDevice() {
        this.f52960a.stopScanDevice();
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void connectDevice(UniteDevice uniteDevice, boolean z, ConnectMode connectMode) {
        this.f52960a.connectDevice(uniteDevice, z, connectMode);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void connectDevice(UniteDevice uniteDevice, boolean z, ConnectMode connectMode, ConnectFilter connectFilter) {
        this.f52960a.connectDevice(uniteDevice, z, connectMode, connectFilter);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void createSystemBond(UniteDevice uniteDevice) {
        this.f52960a.createSystemBond(uniteDevice);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void sendCommand(UniteDevice uniteDevice, cmg cmgVar) {
        this.f52960a.sendCommand(uniteDevice, cmgVar);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public Map<String, UniteDevice> getDeviceList() {
        return this.f52960a.getDeviceList();
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void unPairDevice(UniteDevice uniteDevice) {
        this.f52960a.unPairDevice(uniteDevice);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void disconnect(UniteDevice uniteDevice) {
        this.f52960a.disconnect(uniteDevice);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public boolean isSupportService(UniteDevice uniteDevice, String str) {
        return this.f52960a.isSupportService(uniteDevice, str);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public boolean isSupportCharactor(UniteDevice uniteDevice, String str, String str2) {
        return this.f52960a.isSupportCharactor(uniteDevice, str, str2);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void registerDeviceStateListener(String str, DeviceStatusChangeCallback deviceStatusChangeCallback) {
        this.f52960a.registerDeviceStateListener(str, deviceStatusChangeCallback);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void registerDeviceMessageListener(String str, MessageReceiveCallback messageReceiveCallback) {
        this.f52960a.registerDeviceMessageListener(str, messageReceiveCallback);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void unregisterDeviceStateListener(String str) {
        this.f52960a.unregisterDeviceStateListener(str);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void unregisterDeviceMessageListener(String str) {
        this.f52960a.unregisterDeviceMessageListener(str);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void registerHandshakeFilter(ConnectFilter connectFilter) {
        this.f52960a.registerHandshakeFilter(connectFilter);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void setCharacteristicNotify(UniteDevice uniteDevice, String str, String str2, SendMode sendMode, boolean z) {
        this.f52960a.setCharacteristicNotify(uniteDevice, str, str2, sendMode, z);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void registerDeviceCompatibleListener(String str, DeviceCompatibleCallback deviceCompatibleCallback) {
        this.f52960a.registerDeviceCompatibleListener(str, deviceCompatibleCallback);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void unregisterDeviceCompatibleListener(String str) {
        this.f52960a.unregisterDeviceCompatibleListener(str);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void registerListener(String str, String str2, DataReceiveCallback dataReceiveCallback) {
        this.f52960a.registerListener(str, str2, dataReceiveCallback);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void unregisterListener(String str, String str2) {
        this.f52960a.unregisterListener(str, str2);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void updateDeviceAfterSimulatConnected(String str) {
        this.f52960a.updateDeviceAfterSimulatConnected(str);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public List<DeviceInfo> getDeviceMgrList(int i, String str) {
        return this.f52960a.getDeviceMgrList(i, str);
    }

    static class d {
        private static xgw d = new xgw();
    }
}
