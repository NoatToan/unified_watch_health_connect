package com.xiaomi.android.ble.response;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.yuh;

/* JADX INFO: loaded from: classes7.dex */
public class PhyResult implements yuh, Parcelable {
    public static final Parcelable.Creator<PhyResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BluetoothDevice f11159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11160b;
    public int c;

    public class a implements Parcelable.Creator<PhyResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PhyResult createFromParcel(Parcel parcel) {
            return new PhyResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PhyResult[] newArray(int i) {
            return new PhyResult[i];
        }
    }

    public PhyResult(Parcel parcel) {
        this.f11159a = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.f11160b = parcel.readInt();
        this.c = parcel.readInt();
    }

    @Override // defpackage.yuh
    public void a(BluetoothDevice bluetoothDevice, int i, int i2) {
        this.f11159a = bluetoothDevice;
        this.f11160b = i;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f11159a, i);
        parcel.writeInt(this.f11160b);
        parcel.writeInt(this.c);
    }
}
