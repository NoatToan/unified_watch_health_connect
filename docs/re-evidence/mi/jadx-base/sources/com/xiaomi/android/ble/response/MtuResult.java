package com.xiaomi.android.ble.response;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import defpackage.n9g;

/* JADX INFO: loaded from: classes7.dex */
public class MtuResult implements n9g, Parcelable {
    public static final Parcelable.Creator<MtuResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BluetoothDevice f11157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @IntRange(from = 23, to = 517)
    public int f11158b;

    public class a implements Parcelable.Creator<MtuResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MtuResult createFromParcel(Parcel parcel) {
            return new MtuResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MtuResult[] newArray(int i) {
            return new MtuResult[i];
        }
    }

    public MtuResult(Parcel parcel) {
        this.f11157a = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.f11158b = parcel.readInt();
    }

    @Override // defpackage.n9g
    public void a(BluetoothDevice bluetoothDevice, @IntRange(from = 23, to = 517) int i) {
        this.f11157a = bluetoothDevice;
        this.f11158b = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f11157a, i);
        parcel.writeInt(this.f11158b);
    }
}
