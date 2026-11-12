package com.ingenic.iwds.uniconnect.link;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes18.dex */
public class AndroidBtDevice extends RemoteDevice {
    private BluetoothDevice a;

    public AndroidBtDevice(BluetoothDevice bluetoothDevice) {
        this.a = bluetoothDevice;
    }

    @Override // com.ingenic.iwds.uniconnect.link.RemoteDevice
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AndroidBtDevice androidBtDevice = (AndroidBtDevice) obj;
        BluetoothDevice bluetoothDevice = this.a;
        if (bluetoothDevice == null) {
            if (androidBtDevice.a != null) {
                return false;
            }
        } else if (!bluetoothDevice.equals(androidBtDevice.a)) {
            return false;
        }
        return true;
    }

    @Override // com.ingenic.iwds.uniconnect.link.RemoteDevice
    public String getAddress() {
        return this.a.getAddress();
    }

    @Override // com.ingenic.iwds.uniconnect.link.RemoteDevice
    public int getDeviceType() {
        return RemoteDevice.TYPE_BLUETOOTH_CLASSIC;
    }

    @Override // com.ingenic.iwds.uniconnect.link.RemoteDevice
    public String getName() {
        return this.a.getName();
    }

    @Override // com.ingenic.iwds.uniconnect.link.RemoteDevice
    public int hashCode() {
        BluetoothDevice bluetoothDevice = this.a;
        return 31 + (bluetoothDevice == null ? 0 : bluetoothDevice.hashCode());
    }

    @Override // com.ingenic.iwds.uniconnect.link.RemoteDevice
    public String toString() {
        return "AndroidBtDevice [Name=" + getName() + ", MAC=" + this.a + "]";
    }
}
