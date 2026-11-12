package no.nordicsemi.android.ble.response;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ao5;
import no.nordicsemi.android.ble.data.Data;

/* JADX INFO: loaded from: classes3.dex */
public class WriteResponse implements ao5, Parcelable {
    public static final Parcelable.Creator<WriteResponse> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BluetoothDevice f28153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Data f28154b;

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
        this.f28153a = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.f28154b = (Data) parcel.readParcelable(Data.class.getClassLoader());
    }

    @Override // defpackage.ao5
    public void a(BluetoothDevice bluetoothDevice, Data data) {
        this.f28153a = bluetoothDevice;
        this.f28154b = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f28153a, i);
        parcel.writeParcelable(this.f28154b, i);
    }
}
