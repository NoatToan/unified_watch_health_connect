package com.xiaomi.ai;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import com.xiaomi.ai.utils.Log;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
class b implements BluetoothProfile.ServiceListener {
    public final /* synthetic */ BluetoothManager a;

    public b(BluetoothManager bluetoothManager) {
        this.a = bluetoothManager;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        this.a.mBtHeadset = (BluetoothHeadset) bluetoothProfile;
        Log.d("MiSpeechSDK:BluetoothManager", "onServiceConnected profile" + i);
        List<BluetoothDevice> connectedDevices = this.a.mBtHeadset.getConnectedDevices();
        if (connectedDevices.size() <= 0) {
            Log.d("MiSpeechSDK:BluetoothManager", "onServiceConnected size" + connectedDevices.size());
            return;
        }
        Log.d("MiSpeechSDK:BluetoothManager", "l.size(): " + connectedDevices.size());
        this.a.mBtDevice = connectedDevices.get(0);
        this.a.mBindBtSuccess = true;
        if (this.a.mHasPendingRequest) {
            Log.d("MiSpeechSDK:BluetoothManager", "mHasPendingRequest, set sco on");
            this.a.setBluetoothOn(true);
            this.a.mHasPendingRequest = false;
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public void onServiceDisconnected(int i) {
        Log.d("MiSpeechSDK:BluetoothManager", "onServiceDisconnected profile" + i);
        if (i == 1) {
            Log.d("MiSpeechSDK:BluetoothManager", "onServiceDisconnected");
            this.a.mBindBtSuccess = false;
            this.a.mBtHeadset = null;
        }
    }
}
