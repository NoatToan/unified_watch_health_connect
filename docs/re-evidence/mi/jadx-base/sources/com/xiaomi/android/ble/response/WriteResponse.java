package com.xiaomi.android.ble.response;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.android.ble.data.Data;
import defpackage.bo5;

/* JADX INFO: loaded from: classes7.dex */
public class WriteResponse implements bo5, Parcelable {
    public static final Parcelable.Creator<WriteResponse> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BluetoothDevice f11165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Data f11166b;

    public class a implements Parcelable.Creator<WriteResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WriteResponse createFromParcel(Parcel parcel) {
            return new WriteResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WriteResponse[] newArray(int i) {
            return new WriteResponse[i];
        }
    }

    public WriteResponse(Parcel parcel) {
        this.f11165a = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.f11166b = (Data) parcel.readParcelable(Data.class.getClassLoader());
    }

    @Override // defpackage.bo5
    public void a(BluetoothDevice bluetoothDevice, Data data) {
        this.f11165a = bluetoothDevice;
        this.f11166b = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f11165a, i);
        parcel.writeParcelable(this.f11166b, i);
    }
}
