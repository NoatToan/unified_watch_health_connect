package no.nordicsemi.android.ble.response;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.xuh;

/* JADX INFO: loaded from: classes3.dex */
public class PhyResult implements xuh, Parcelable {
    public static final Parcelable.Creator<PhyResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BluetoothDevice f28147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28148b;
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
        this.f28147a = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.f28148b = parcel.readInt();
        this.c = parcel.readInt();
    }

    @Override // defpackage.xuh
    public void a(BluetoothDevice bluetoothDevice, int i, int i2) {
        this.f28147a = bluetoothDevice;
        this.f28148b = i;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f28147a, i);
        parcel.writeInt(this.f28148b);
        parcel.writeInt(this.c);
    }
}
