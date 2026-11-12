package com.xiaomi.android.ble.response;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.android.ble.data.Data;
import defpackage.bn5;

/* JADX INFO: loaded from: classes7.dex */
public class ReadResponse implements bn5, Parcelable {
    public static final Parcelable.Creator<ReadResponse> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BluetoothDevice f11161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Data f11162b;

    public class a implements Parcelable.Creator<ReadResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ReadResponse createFromParcel(Parcel parcel) {
            return new ReadResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ReadResponse[] newArray(int i) {
            return new ReadResponse[i];
        }
    }

    public ReadResponse() {
    }

    @Override // defpackage.bn5
    public void a(BluetoothDevice bluetoothDevice, Data data) {
        this.f11161a = bluetoothDevice;
        this.f11162b = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f11161a, i);
        parcel.writeParcelable(this.f11162b, i);
    }

    public ReadResponse(Parcel parcel) {
        this.f11161a = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.f11162b = (Data) parcel.readParcelable(Data.class.getClassLoader());
    }
}
