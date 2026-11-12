package no.nordicsemi.android.ble.response;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import defpackage.m9g;

/* JADX INFO: loaded from: classes3.dex */
public class MtuResult implements m9g, Parcelable {
    public static final Parcelable.Creator<MtuResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BluetoothDevice f28145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @IntRange(from = 23, to = 517)
    public int f28146b;

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
        this.f28145a = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.f28146b = parcel.readInt();
    }

    @Override // defpackage.m9g
    public void a(BluetoothDevice bluetoothDevice, @IntRange(from = 23, to = 517) int i) {
        this.f28145a = bluetoothDevice;
        this.f28146b = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f28145a, i);
        parcel.writeInt(this.f28146b);
    }
}
