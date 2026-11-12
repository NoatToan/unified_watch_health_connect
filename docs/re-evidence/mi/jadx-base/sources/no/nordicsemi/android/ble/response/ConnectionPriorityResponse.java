package no.nordicsemi.android.ble.response;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public class ConnectionPriorityResponse implements Parcelable {
    public static final Parcelable.Creator<ConnectionPriorityResponse> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BluetoothDevice f28143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS, to = 3200)
    public int f28144b;

    @IntRange(from = 0, to = 499)
    public int c;

    @IntRange(from = 10, to = 3200)
    public int d;

    public class a implements Parcelable.Creator<ConnectionPriorityResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectionPriorityResponse createFromParcel(Parcel parcel) {
            return new ConnectionPriorityResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ConnectionPriorityResponse[] newArray(int i) {
            return new ConnectionPriorityResponse[i];
        }
    }

    public ConnectionPriorityResponse(Parcel parcel) {
        this.f28143a = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.f28144b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f28143a, i);
        parcel.writeInt(this.f28144b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
