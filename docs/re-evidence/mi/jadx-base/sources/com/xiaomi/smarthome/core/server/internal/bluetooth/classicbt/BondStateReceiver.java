package com.xiaomi.smarthome.core.server.internal.bluetooth.classicbt;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public class BondStateReceiver extends BroadcastReceiver {
    private final BondStateListener mListener;

    public interface BondStateListener {
        void onBondStateChange(BluetoothDevice bluetoothDevice, int i) throws RemoteException;
    }

    public BondStateReceiver(BondStateListener bondStateListener) {
        this.mListener = bondStateListener;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        BluetoothDevice bluetoothDevice;
        if (!intent.getAction().equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
            if (!intent.getAction().equals("android.bluetooth.device.action.PAIRING_REQUEST") || (bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) == null) {
                return;
            }
            try {
                BondStateListener bondStateListener = this.mListener;
                if (bondStateListener != null) {
                    bondStateListener.onBondStateChange(bluetoothDevice, 11);
                    return;
                }
                return;
            } catch (RemoteException e) {
                e.printStackTrace();
                return;
            }
        }
        BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1);
        if (bluetoothDevice2 == null || intExtra <= -1) {
            return;
        }
        try {
            BondStateListener bondStateListener2 = this.mListener;
            if (bondStateListener2 != null) {
                bondStateListener2.onBondStateChange(bluetoothDevice2, intExtra);
            }
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }
}
