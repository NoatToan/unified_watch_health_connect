package com.huami.watch.transport;

import android.os.Parcel;
import android.os.Parcelable;
import com.huami.nfc.bus.NoticesEntity;

/* JADX INFO: loaded from: classes5.dex */
public class DataTransportResult implements Parcelable {
    public static final Parcelable.Creator<DataTransportResult> CREATOR = new a();
    public static final int RESULT_FAILED_CHANNEL_UNAVAILABLE = 1;
    public static final int RESULT_FAILED_IWDS_CRASH = 3;
    public static final int RESULT_FAILED_LINK_DISCONNECTED = 2;
    public static final int RESULT_FAILED_TRANSPORT_SERVICE_UNCONNECTED = 4;
    public static final int RESULT_OK = 0;
    private TransportDataItem a;
    private int b;

    public class a implements Parcelable.Creator<DataTransportResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataTransportResult createFromParcel(Parcel parcel) {
            return new DataTransportResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DataTransportResult[] newArray(int i) {
            return new DataTransportResult[i];
        }
    }

    public DataTransportResult(TransportDataItem transportDataItem, int i) {
        this.a = new TransportDataItem(transportDataItem.getUri(), transportDataItem.getCreateTime());
        this.b = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TransportDataItem getDataItem() {
        return this.a;
    }

    public int getResultCode() {
        return this.b;
    }

    public String toString() {
        String str;
        int i = this.b;
        if (i == 0) {
            str = "OK";
        } else if (i == 1) {
            str = "FAILED_CHANNEL_UNAVAILABLE";
        } else if (i == 2) {
            str = "FAILED_LINK_DISCONNECTED";
        } else if (i != 3) {
            str = i != 4 ? NoticesEntity.LOOP_TYPE_NONE : "FAILED_TRANSPORT_SERVICE_UNCONNECTED";
        } else {
            str = "FAILED_IWDS_CRASH";
        }
        return this.a + ", " + str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeInt(this.b);
    }

    public DataTransportResult(Parcel parcel) {
        this.a = (TransportDataItem) parcel.readParcelable(TransportDataItem.class.getClassLoader());
        this.b = parcel.readInt();
    }
}
