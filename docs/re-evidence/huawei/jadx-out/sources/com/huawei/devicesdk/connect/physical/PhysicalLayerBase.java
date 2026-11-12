package com.huawei.devicesdk.connect.physical;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.devicesdk.callback.BtDevicePairCallback;
import com.huawei.devicesdk.callback.DeviceStatusChangeCallback;
import com.huawei.devicesdk.callback.MessageReceiveCallback;
import com.huawei.devicesdk.entity.DeviceInfo;
import defpackage.clp;
import defpackage.cmd;
import defpackage.cnk;
import defpackage.coi;
import defpackage.cpi;
import defpackage.cpl;
import defpackage.cqc;
import defpackage.cqp;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PhysicalLayerBase {
    private static final String TAG = "PhysicalLayerBase";
    protected BluetoothDevice mBluetoothDevice;
    public DeviceInfo mDeviceInfo;
    public MessageReceiveCallback mMessageReceiveCallback;
    protected DeviceStatusChangeCallback mStatusChangeCallback;
    protected coi mCommonAdapterUtil = coi.b();
    private BtDevicePairCallback mDevicePairCallback = new BtDevicePairCallback() { // from class: com.huawei.devicesdk.connect.physical.PhysicalLayerBase.1
        @Override // com.huawei.devicesdk.callback.BtDevicePairCallback
        public void onDevicePairing(BluetoothDevice bluetoothDevice) {
            if (bluetoothDevice == null) {
                LogUtil.b(PhysicalLayerBase.TAG, "onDevicePairing device is null");
                return;
            }
            LogUtil.b(PhysicalLayerBase.TAG, "onDevicePairing", cpl.a(bluetoothDevice.getAddress()));
            PhysicalLayerBase physicalLayerBase = PhysicalLayerBase.this;
            physicalLayerBase.reportStatusChange(physicalLayerBase.mDeviceInfo, 31, 100000);
        }

        @Override // com.huawei.devicesdk.callback.BtDevicePairCallback
        public void onDevicePaired(BluetoothDevice bluetoothDevice) {
            if (bluetoothDevice == null) {
                LogUtil.b(PhysicalLayerBase.TAG, "onDevicePaired device is null");
                return;
            }
            LogUtil.b(PhysicalLayerBase.TAG, "onDevicePaired", cpl.a(bluetoothDevice.getAddress()));
            PhysicalLayerBase physicalLayerBase = PhysicalLayerBase.this;
            physicalLayerBase.reportStatusChange(physicalLayerBase.mDeviceInfo, 30, 100000);
        }

        @Override // com.huawei.devicesdk.callback.BtDevicePairCallback
        public void onDevicePairNone(BluetoothDevice bluetoothDevice) {
            if (bluetoothDevice == null) {
                LogUtil.b(PhysicalLayerBase.TAG, "onDevicePairNone device is null");
                return;
            }
            LogUtil.b(PhysicalLayerBase.TAG, "onDevicePairNone", cpl.a(bluetoothDevice.getAddress()));
            PhysicalLayerBase physicalLayerBase = PhysicalLayerBase.this;
            physicalLayerBase.reportStatusChange(physicalLayerBase.mDeviceInfo, 32, 100000);
        }
    };

    public abstract void connectDevice(DeviceInfo deviceInfo);

    public abstract void destroy();

    public abstract void disconnectDevice();

    public boolean isSupportCharactor(String str, String str2) {
        return false;
    }

    public boolean isSupportService(String str) {
        return false;
    }

    public abstract boolean sendData(cmd cmdVar, String str);

    protected void sendTimeoutMessage(clp clpVar, int i) {
        sendTimeoutMessage(clpVar, i, 25000L);
    }

    protected void sendTimeoutMessage(clp clpVar, int i, long j) {
        if (clpVar == null) {
            LogUtil.d(TAG, "mConnectHandler is null, sendTimeoutMessage fail.");
            return;
        }
        Message messageE = clpVar.e(4);
        messageE.arg1 = cpi.c(i, 304);
        messageE.obj = Long.valueOf(System.currentTimeMillis() + j);
        clpVar.a(messageE, j);
    }

    protected void sendTimeoutMessageForService(clp clpVar) {
        if (clpVar == null) {
            LogUtil.e(TAG, "sendTimeoutMessageForService mConnectHandler is null, sendTimeoutMessage fail.");
            return;
        }
        Message messageE = clpVar.e(4);
        messageE.arg1 = cpi.c(2, 304);
        clpVar.a(messageE, 7000L);
    }

    protected void reportMonitorResult(Message message, DeviceInfo deviceInfo, int i) {
        if (message == null || deviceInfo == null) {
            LogUtil.d(TAG, "message or deviceInfo is null");
            return;
        }
        Object obj = message.obj;
        if (obj instanceof Long) {
            if (System.currentTimeMillis() - ((Long) obj).longValue() > 2000) {
                cqp.a(100071, cqc.a((Object) deviceInfo.getDeviceName()), cqc.a(Integer.valueOf(message.what)), Byte.toString(deviceInfo.getTriggerType()));
                LogUtil.b(TAG, "freezing connect timeout,", cpl.a(this.mDeviceInfo));
                return;
            }
        }
        cqp.a(i, cqc.a((Object) deviceInfo.getDeviceName()), cqc.a(Integer.valueOf(message.what)), "");
    }

    protected void setTriggerType(int i, DeviceInfo deviceInfo) {
        if (i == 1 || deviceInfo == null || deviceInfo.getTriggerType() == 0) {
            return;
        }
        LogUtil.b(TAG, "deviceInfo triggerType is ", Byte.valueOf(deviceInfo.getTriggerType()));
        deviceInfo.setTriggerType((byte) 0);
    }

    public void init(DeviceInfo deviceInfo, DeviceStatusChangeCallback deviceStatusChangeCallback, MessageReceiveCallback messageReceiveCallback) {
        this.mDeviceInfo = deviceInfo;
        addDeviceStatusChangeListener(deviceStatusChangeCallback);
        addMessageReceiveListener(messageReceiveCallback);
    }

    public void addDeviceStatusChangeListener(DeviceStatusChangeCallback deviceStatusChangeCallback) {
        this.mStatusChangeCallback = deviceStatusChangeCallback;
    }

    public void addMessageReceiveListener(MessageReceiveCallback messageReceiveCallback) {
        this.mMessageReceiveCallback = messageReceiveCallback;
    }

    public DeviceInfo getCurrentDeviceInfo() {
        return this.mDeviceInfo;
    }

    public void pairDevice(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.b(TAG, "pair device error. device is invalid.");
            return;
        }
        LogUtil.b(TAG, "pair device start.", cpl.a(deviceInfo));
        this.mDeviceInfo = deviceInfo;
        String deviceMac = deviceInfo.getDeviceMac();
        BluetoothDevice bluetoothDevice = this.mBluetoothDevice;
        if (bluetoothDevice == null || !bluetoothDevice.getAddress().equals(deviceMac)) {
            this.mBluetoothDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(deviceMac);
        }
        BluetoothDevice bluetoothDevice2 = this.mBluetoothDevice;
        if (bluetoothDevice2 == null) {
            LogUtil.b(TAG, "pair device error. mBluetoothDevice is null.");
            return;
        }
        coi coiVar = this.mCommonAdapterUtil;
        if (coiVar == null) {
            LogUtil.b(TAG, "pair device error. mCommonAdapterUtil is null.");
            return;
        }
        boolean zC = coiVar.c(bluetoothDevice2, this.mDevicePairCallback);
        LogUtil.b(TAG, "pair device. ", cpl.a(deviceInfo), " result:", Boolean.valueOf(zC));
        if (zC) {
            return;
        }
        reportStatusChange(deviceInfo, 32, 60032);
    }

    public boolean unPairDevice(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.b(TAG, "unPair device error. device is invalid.");
            return false;
        }
        LogUtil.b(TAG, "unPair device start.", cpl.a(deviceInfo));
        this.mDeviceInfo = deviceInfo;
        String deviceMac = deviceInfo.getDeviceMac();
        BluetoothDevice bluetoothDevice = this.mBluetoothDevice;
        if (bluetoothDevice == null || !bluetoothDevice.getAddress().equals(deviceMac)) {
            this.mBluetoothDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(deviceMac);
        }
        BluetoothDevice bluetoothDevice2 = this.mBluetoothDevice;
        if (bluetoothDevice2 == null) {
            LogUtil.b(TAG, "unPair device error. mBluetoothDevice is null.");
            return false;
        }
        coi coiVar = this.mCommonAdapterUtil;
        if (coiVar == null) {
            LogUtil.b(TAG, "unPair device error. mCommonAdapterUtil is null");
            return false;
        }
        boolean zE = coiVar.e(bluetoothDevice2);
        LogUtil.b(TAG, "unPair device.", cpl.a(deviceInfo), " result:", Boolean.valueOf(zE));
        cqp.a(100027, cqc.a((Object) deviceInfo.getDeviceName()), cqc.a(Boolean.valueOf(zE)), "");
        if (zE) {
            reportStatusChange(deviceInfo, 33, 100000);
        } else {
            reportStatusChange(deviceInfo, 34, 70034);
        }
        disconnectDevice();
        clearDataCache();
        return zE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportStatusChange(DeviceInfo deviceInfo, int i, int i2) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            LogUtil.d(TAG, "deviceInfo is invalid, reportStatusChange fail.");
            return;
        }
        if (this.mStatusChangeCallback == null) {
            LogUtil.d(TAG, "mStatusChangeCallback is null, reportStatusChange fail.");
            return;
        }
        String deviceMac = deviceInfo.getDeviceMac();
        if (deviceInfo.getDeviceType() <= 0) {
            DeviceInfo deviceInfoJ = cnk.c().j(deviceMac);
            if (deviceInfoJ == null) {
                deviceInfoJ = cnk.c().a(deviceMac);
            }
            if (deviceInfoJ == null) {
                LogUtil.d(TAG, "unknown device, reportStatusChange fail.");
                return;
            }
            deviceInfo.setDeviceType(deviceInfoJ.getDeviceType());
        }
        this.mStatusChangeCallback.onConnectStatusChanged(deviceInfo, i, i2);
    }

    private void clearDataCache() {
        LogUtil.b(TAG, "clearDataCache");
        cnk.c().e(this.mDeviceInfo.getDeviceMac());
    }
}
