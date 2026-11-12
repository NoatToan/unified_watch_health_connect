package com.xiaomi.android.ble.response;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import defpackage.pzk;

/* JADX INFO: loaded from: classes7.dex */
public class RssiResult implements pzk, Parcelable {
    public static final Parcelable.Creator<RssiResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BluetoothDevice f11163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @IntRange(from = -128, to = 20)
    public int f11164b;

    public class a implements Parcelable.Creator<RssiResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RssiResult createFromParcel(Parcel parcel) {
            return new RssiResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RssiResult[] newArray(int i) {
            return new RssiResult[i];
        }
    }

    public RssiResult(Parcel parcel) {
        this.f11163a = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.f11164b = parcel.readInt();
    }

    @Override // defpackage.pzk
    public void a(BluetoothDevice bluetoothDevice, @IntRange(from = -128, to = 20) int i) {
        this.f11163a = bluetoothDevice;
        this.f11164b = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f11163a, i);
        parcel.writeInt(this.f11164b);
    }
}
