package com.xiaomi.smarthome.library.bluetooth.search;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class BluetoothSearchResult implements Parcelable {
    public static final Parcelable.Creator<BluetoothSearchResult> CREATOR = new Parcelable.Creator<BluetoothSearchResult>() { // from class: com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BluetoothSearchResult createFromParcel(Parcel parcel) {
            return new BluetoothSearchResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BluetoothSearchResult[] newArray(int i) {
            return new BluetoothSearchResult[i];
        }
    };
    private BluetoothDevice device;
    private int deviceType;
    private String name;
    private int rssi;
    private byte[] scanRecord;

    public BluetoothSearchResult() {
    }

    private String getBleStateString(int i) {
        if (i == 0) {
            return "disconnected";
        }
        if (i == 1) {
            return "connecting";
        }
        if (i != 2) {
            return i != 3 ? String.format("unknonw %d", Integer.valueOf(i)) : "disconnecting";
        }
        return "connected";
    }

    private String getClassicStateString(int i) {
        switch (i) {
            case 10:
                return "BOND_NONE";
            case 11:
                return "BOND_BONDING";
            case 12:
                return "BOND_BONDED";
            default:
                return "unknown";
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAddress() {
        BluetoothDevice bluetoothDevice = this.device;
        return bluetoothDevice != null ? bluetoothDevice.getAddress() : "";
    }

    public BluetoothDevice getDevice() {
        return this.device;
    }

    public int getDeviceType() {
        return this.deviceType;
    }

    public String getName() {
        return this.name;
    }

    public int getRssi() {
        return this.rssi;
    }

    public byte[] getScanRecord() {
        return this.scanRecord;
    }

    public boolean isBleDevice() {
        return this.deviceType == 2;
    }

    public boolean isClassicDevice() {
        return this.deviceType == 1;
    }

    public void setBleDevice() {
        this.deviceType = 2;
    }

    public void setClassicDevice() {
        this.deviceType = 1;
    }

    public void setDevice(BluetoothDevice bluetoothDevice) {
        this.device = bluetoothDevice;
    }

    public void setDeviceType(int i) {
        this.deviceType = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNameFromDevice() {
        BluetoothDevice bluetoothDevice = this.device;
        if (bluetoothDevice == null) {
            this.name = "";
            return;
        }
        try {
            this.name = bluetoothDevice.getName();
        } catch (Exception e) {
            e.printStackTrace();
            this.name = "";
        }
    }

    public void setRssi(int i) {
        this.rssi = i;
    }

    public void setScanRecord(byte[] bArr) {
        this.scanRecord = bArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name = " + this.name);
        sb.append(", mac = " + this.device.getAddress());
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.device, 0);
        parcel.writeInt(this.rssi);
        parcel.writeByteArray(this.scanRecord);
        parcel.writeInt(this.deviceType);
        parcel.writeString(this.name);
    }

    public BluetoothSearchResult(BluetoothDevice bluetoothDevice) {
        this.device = bluetoothDevice;
    }

    public BluetoothSearchResult(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        this.device = bluetoothDevice;
        this.rssi = i;
        this.scanRecord = bArr;
    }

    public BluetoothSearchResult(Parcel parcel) {
        this.device = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.rssi = parcel.readInt();
        this.scanRecord = parcel.createByteArray();
        this.deviceType = parcel.readInt();
        this.name = parcel.readString();
    }
}
