package com.xiaomi.smarthome.core.server.internal.bluetooth.classicbt;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.os.RemoteException;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;

/* JADX INFO: loaded from: classes10.dex */
public class ClassicBtProvider extends AbsClassicBTProvider {
    private static final String TAG = "ClassicBtProvider";
    private IProviderNotify mListener;

    public interface IProviderNotify {
        void onConnectionStateChanged(String str, int i) throws RemoteException;

        void onReceiveData(String str, byte[] bArr) throws RemoteException;
    }

    public ClassicBtProvider(BluetoothManager bluetoothManager) {
        super(bluetoothManager);
        this.mListener = null;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.classicbt.AbsClassicBTProvider
    public void onCommunicationRunning() {
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.classicbt.AbsClassicBTProvider
    public void onConnectionError(int i) {
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.classicbt.AbsClassicBTProvider
    public void onConnectionStateChanged(int i) {
        BluetoothDevice device = getDevice();
        if (device == null) {
            BluetoothLog.d("ClassicBtProvider onConnectionStateChanged device is null");
            return;
        }
        IProviderNotify iProviderNotify = this.mListener;
        if (iProviderNotify == null) {
            BluetoothLog.w("ClassicBtProvider onConnectionStateChanged listener is null");
            return;
        }
        try {
            iProviderNotify.onConnectionStateChanged(device.getAddress(), i);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.classicbt.AbsClassicBTProvider
    public void onDataFound(byte[] bArr) {
        BluetoothDevice device = getDevice();
        IProviderNotify iProviderNotify = this.mListener;
        if (iProviderNotify == null || device == null) {
            BluetoothLog.d("ClassicBtProvider onConnectionStateChanged device is null");
            return;
        }
        try {
            iProviderNotify.onReceiveData(device.getAddress(), bArr);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setOnProviderNotify(IProviderNotify iProviderNotify) {
        this.mListener = iProviderNotify;
    }
}
