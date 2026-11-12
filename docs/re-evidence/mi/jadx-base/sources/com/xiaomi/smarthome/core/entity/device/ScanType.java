package com.xiaomi.smarthome.core.entity.device;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public enum ScanType implements Parcelable {
    ALL,
    BLUETOOTH;

    public static final Parcelable.Creator<ScanType> CREATOR = new Parcelable.Creator<ScanType>() { // from class: com.xiaomi.smarthome.core.entity.device.ScanType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ScanType createFromParcel(Parcel parcel) {
            return ScanType.values()[parcel.readInt()];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ScanType[] newArray(int i) {
            return new ScanType[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
