package com.huawei.operation.br;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes13.dex */
public class BrBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "BrBroadcastReceiver";
    private final OnBluetoothReceiverListener mOnBluetoothReceiverListener;

    public interface OnBluetoothReceiverListener {
        void onDeviceFound(BluetoothDevice bluetoothDevice);

        void onScanFinish();

        void onStateChanged(int i);
    }

    public BrBroadcastReceiver(Context context, OnBluetoothReceiverListener onBluetoothReceiverListener) {
        this.mOnBluetoothReceiverListener = onBluetoothReceiverListener;
        BroadcastManagerUtil.a(context, this, getBluetoothIntentFilter());
    }

    private IntentFilter getBluetoothIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        try {
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
            intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
            intentFilter.addAction("android.bluetooth.device.action.FOUND");
            return intentFilter;
        } catch (SecurityException e) {
            LogUtil.c(TAG, "getBluetoothIntentFilter SecurityException:", ExceptionUtils.c(e));
            return intentFilter;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        byte b2;
        OnBluetoothReceiverListener onBluetoothReceiverListener;
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        try {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice != null) {
                LogUtil.a(TAG, "BluetoothDevice name is:", bluetoothDevice.getName());
            }
            LogUtil.a(TAG, "action is ", action);
            int iHashCode = action.hashCode();
            if (iHashCode != -1780914469) {
                if (iHashCode != -1530327060) {
                    if (iHashCode == 1167529923 && action.equals("android.bluetooth.device.action.FOUND")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
            } else if (action.equals("android.bluetooth.adapter.action.DISCOVERY_FINISHED")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0);
                OnBluetoothReceiverListener onBluetoothReceiverListener2 = this.mOnBluetoothReceiverListener;
                if (onBluetoothReceiverListener2 != null) {
                    onBluetoothReceiverListener2.onStateChanged(intExtra);
                    return;
                }
                return;
            }
            if (b2 != 1) {
                if (b2 == 2 && (onBluetoothReceiverListener = this.mOnBluetoothReceiverListener) != null) {
                    onBluetoothReceiverListener.onDeviceFound(bluetoothDevice);
                    return;
                }
                return;
            }
            OnBluetoothReceiverListener onBluetoothReceiverListener3 = this.mOnBluetoothReceiverListener;
            if (onBluetoothReceiverListener3 != null) {
                onBluetoothReceiverListener3.onScanFinish();
            }
        } catch (SecurityException e) {
            LogUtil.c(TAG, "onReceive SecurityException:", ExceptionUtils.c(e));
        }
    }
}
