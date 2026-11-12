package com.xiaomi.smarthome.core.entity.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchResult;

/* JADX INFO: loaded from: classes10.dex */
public class SearchResult implements Parcelable {
    public static final Parcelable.Creator<SearchResult> CREATOR = new Parcelable.Creator<SearchResult>() { // from class: com.xiaomi.smarthome.core.entity.bluetooth.SearchResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SearchResult createFromParcel(Parcel parcel) {
            return new SearchResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SearchResult[] newArray(int i) {
            return new SearchResult[i];
        }
    };
    public BluetoothDevice device;
    public int deviceType;
    public String name;
    public int rssi;
    public byte[] scanRecord;

    public SearchResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAddress() {
        BluetoothDevice bluetoothDevice = this.device;
        if (bluetoothDevice != null) {
            return bluetoothDevice.getAddress();
        }
        return null;
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

    public void setDevice(BluetoothDevice bluetoothDevice) {
        this.device = bluetoothDevice;
    }

    public void setDeviceType(int i) {
        this.deviceType = i;
    }

    public void setName(String str) {
        this.name = str;
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

    public SearchResult(BluetoothSearchResult bluetoothSearchResult) {
        this.device = bluetoothSearchResult.getDevice();
        this.rssi = bluetoothSearchResult.getRssi();
        this.scanRecord = bluetoothSearchResult.getScanRecord();
        this.deviceType = bluetoothSearchResult.getDeviceType();
        this.name = bluetoothSearchResult.getName();
    }

    public SearchResult(BluetoothDevice bluetoothDevice, int i) {
        this.device = bluetoothDevice;
        this.deviceType = i;
    }

    public SearchResult(BluetoothDevice bluetoothDevice, int i, byte[] bArr, int i2) {
        this.device = bluetoothDevice;
        this.rssi = i;
        this.scanRecord = bArr;
        this.deviceType = i2;
    }

    public SearchResult(Parcel parcel) {
        this.device = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.rssi = parcel.readInt();
        this.scanRecord = parcel.createByteArray();
        this.deviceType = parcel.readInt();
        this.name = parcel.readString();
    }
}
