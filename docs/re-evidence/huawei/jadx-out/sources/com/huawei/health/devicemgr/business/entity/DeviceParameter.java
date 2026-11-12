package com.huawei.health.devicemgr.business.entity;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cpu;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceParameter implements Parcelable {
    public static final Parcelable.Creator<DeviceParameter> CREATOR = new Parcelable.Creator<DeviceParameter>() { // from class: com.huawei.health.devicemgr.business.entity.DeviceParameter.5
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public DeviceParameter[] newArray(int i) {
            return new DeviceParameter[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceParameter createFromParcel(Parcel parcel) {
            DeviceParameter deviceParameter = new DeviceParameter();
            deviceParameter.setBluetoothType(parcel.readInt());
            deviceParameter.setProductType(parcel.readInt());
            deviceParameter.setDeviceNameInfo(parcel.readString());
            deviceParameter.setMac(parcel.readString());
            deviceParameter.setFilePath(parcel.readString());
            deviceParameter.setVersion(parcel.readString());
            deviceParameter.setIsSupportHeartRate(parcel.readByte() != 0);
            deviceParameter.setNameFilter(parcel.readArrayList(DeviceParameter.class.getClassLoader()));
            deviceParameter.setProductPin(parcel.readString());
            deviceParameter.setIsBand(parcel.readByte() != 0);
            return deviceParameter;
        }
    };
    private int mBluetoothType;
    private String mDeviceName;
    private String mFilePath;
    private boolean mIsBand;
    private boolean mIsSupportHeartRate;
    private String mMac;
    private ArrayList<String> mNameFilter = new ArrayList<>();
    private String mProductPin = "";
    private int mProductType;
    private String mVersion;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getBluetoothType() {
        return ((Integer) cpu.a(Integer.valueOf(this.mBluetoothType))).intValue();
    }

    public void setBluetoothType(int i) {
        this.mBluetoothType = ((Integer) cpu.a(Integer.valueOf(i))).intValue();
    }

    public int getProductType() {
        return ((Integer) cpu.a(Integer.valueOf(this.mProductType))).intValue();
    }

    public void setProductType(int i) {
        this.mProductType = ((Integer) cpu.a(Integer.valueOf(i))).intValue();
    }

    public String getDeviceNameInfo() {
        return (String) cpu.a(this.mDeviceName);
    }

    public void setDeviceNameInfo(String str) {
        this.mDeviceName = (String) cpu.a(str);
    }

    public String getMac() {
        return (String) cpu.a(this.mMac);
    }

    public void setMac(String str) {
        this.mMac = (String) cpu.a(str);
    }

    public String getFilePath() {
        return (String) cpu.a(this.mFilePath);
    }

    public void setFilePath(String str) {
        this.mFilePath = (String) cpu.a(str);
    }

    public String getVersion() {
        return (String) cpu.a(this.mVersion);
    }

    public void setVersion(String str) {
        this.mVersion = (String) cpu.a(str);
    }

    public ArrayList<String> getNameFilter() {
        return this.mNameFilter;
    }

    public void setNameFilter(ArrayList<String> arrayList) {
        this.mNameFilter = arrayList;
    }

    public String getProductPin() {
        return this.mProductPin;
    }

    public void setProductPin(String str) {
        this.mProductPin = str;
    }

    public boolean isSupportHeartRate() {
        return this.mIsSupportHeartRate;
    }

    public void setIsSupportHeartRate(boolean z) {
        this.mIsSupportHeartRate = z;
    }

    public boolean isBand() {
        return this.mIsBand;
    }

    public void setIsBand(boolean z) {
        this.mIsBand = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mBluetoothType);
        parcel.writeInt(this.mProductType);
        parcel.writeString(this.mDeviceName);
        parcel.writeString(this.mMac);
        parcel.writeString(this.mFilePath);
        parcel.writeString(this.mVersion);
        parcel.writeByte(this.mIsSupportHeartRate ? (byte) 1 : (byte) 0);
        parcel.writeList(this.mNameFilter);
        parcel.writeString(this.mProductPin);
        parcel.writeByte(this.mIsBand ? (byte) 1 : (byte) 0);
    }
}
