package com.huawei.health.device.connectivity.comm;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class BleDeviceHelper extends BroadcastReceiver {
    private IDeviceEventHandler d;
    private BluetoothDevice e;

    public BleDeviceHelper(BluetoothDevice bluetoothDevice) {
        this.e = bluetoothDevice;
    }

    public String d() {
        BluetoothDevice bluetoothDevice = this.e;
        if (bluetoothDevice == null) {
            return null;
        }
        try {
            String name = bluetoothDevice.getName();
            if (name != null) {
                return name;
            }
            return null;
        } catch (SecurityException e) {
            LogUtil.e("BleDeviceHelper", "getDeviceName SecurityException:", ExceptionUtils.c(e));
        }
    }

    public void c(IDeviceEventHandler iDeviceEventHandler) {
        this.d = iDeviceEventHandler;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        LogUtil.a("BleDeviceHelper", "receive broadcast ", intent.getAction());
        try {
            if ("android.bluetooth.device.action.BOND_STATE_CHANGED".equals(intent.getAction())) {
                BluetoothDevice bluetoothDevice = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE") instanceof BluetoothDevice ? (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE") : null;
                if (bluetoothDevice != null && bluetoothDevice.getName() != null) {
                    if (bluetoothDevice.getName().equals(d()) && this.d != null) {
                        int bondState = bluetoothDevice.getBondState();
                        if (bondState == 12) {
                            LogUtil.a("BleDeviceHelper", "BleDevice is bonded");
                            this.d.onStateChanged(10);
                            return;
                        } else if (bondState == 10) {
                            LogUtil.a("BleDeviceHelper", "BleDevice is bond_none");
                            this.d.onStateChanged(8);
                            return;
                        } else {
                            LogUtil.a("BleDeviceHelper", "BleDevice is other bondState:", Integer.valueOf(bondState));
                            return;
                        }
                    }
                    return;
                }
                LogUtil.j("BleDeviceHelper", "BleDevice BroadcastReceiver device or deviceName = null");
            }
        } catch (RuntimeException e) {
            LogUtil.e("BleDeviceHelper", "onReceive:", ExceptionUtils.c(e));
        }
    }
}
