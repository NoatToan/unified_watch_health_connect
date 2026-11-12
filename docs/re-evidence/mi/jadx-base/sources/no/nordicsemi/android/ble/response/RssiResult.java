package no.nordicsemi.android.ble.response;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import defpackage.ozk;

/* JADX INFO: loaded from: classes3.dex */
public class RssiResult implements ozk, Parcelable {
    public static final Parcelable.Creator<RssiResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BluetoothDevice f28151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @IntRange(from = -128, to = 20)
    public int f28152b;

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
        this.f28151a = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.f28152b = parcel.readInt();
    }

    @Override // defpackage.ozk
    public void a(BluetoothDevice bluetoothDevice, @IntRange(from = -128, to = 20) int i) {
        this.f28151a = bluetoothDevice;
        this.f28152b = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f28151a, i);
        parcel.writeInt(this.f28152b);
    }
}
