package com.xiaomi.fitness.devicesettings.huami.photo;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;

/* JADX INFO: loaded from: classes8.dex */
public class a implements BluetoothProfile.ServiceListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BluetoothProfile f12011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12012b = "HID_UTIL";
    public InterfaceC0503a c;

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.photo.a$a, reason: collision with other inner class name */
    public interface InterfaceC0503a {
        void a();
    }

    public a(InterfaceC0503a interfaceC0503a) {
        this.c = interfaceC0503a;
        BluetoothAdapter.getDefaultAdapter().getProfileProxy(AppUtil.getApp(), this, 4);
    }

    public boolean a(BluetoothDevice bluetoothDevice) {
        try {
            BluetoothProfile bluetoothProfile = this.f12011a;
            if (bluetoothProfile == null) {
                return false;
            }
            bluetoothProfile.getClass().getMethod("connect", BluetoothDevice.class).invoke(this.f12011a, bluetoothDevice);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void b() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        BluetoothProfile bluetoothProfile = this.f12011a;
        if (bluetoothProfile != null) {
            defaultAdapter.closeProfileProxy(4, bluetoothProfile);
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        if (i == 4) {
            try {
                this.f12011a = bluetoothProfile;
                this.c.a();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public void onServiceDisconnected(int i) {
        Logger.i("HID_UTIL onServiceDisconnected", new Object[0]);
    }
}
