package no.nordicsemi.android.ble.response;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.an5;
import no.nordicsemi.android.ble.data.Data;

/* JADX INFO: loaded from: classes3.dex */
public class ReadResponse implements an5, Parcelable {
    public static final Parcelable.Creator<ReadResponse> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BluetoothDevice f28149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Data f28150b;

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

    @Override // defpackage.an5
    public void a(BluetoothDevice bluetoothDevice, Data data) {
        this.f28149a = bluetoothDevice;
        this.f28150b = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f28149a, i);
        parcel.writeParcelable(this.f28150b, i);
    }

    public ReadResponse(Parcel parcel) {
        this.f28149a = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.f28150b = (Data) parcel.readParcelable(Data.class.getClassLoader());
    }
}
