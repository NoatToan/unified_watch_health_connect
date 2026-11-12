package com.huami.watch.transport;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public class ConnectionResult implements Parcelable {
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new a();
    public static final int R_SERVICE_AUTH_FALIED = 2;
    public static final int R_SERVICE_CONNECTING = 4;
    public static final int R_SERVICE_DISCONNECTED = 3;
    public static final int R_SERVICE_UNAVAILABLE = 1;
    public static final int R_SUCCESS = 0;
    private int a;

    public class a implements Parcelable.Creator<ConnectionResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectionResult createFromParcel(Parcel parcel) {
            return new ConnectionResult(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ConnectionResult[] newArray(int i) {
            return new ConnectionResult[i];
        }
    }

    public /* synthetic */ ConnectionResult(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getResultCode() {
        return this.a;
    }

    public String toString() {
        int i = this.a;
        if (i == 0) {
            return "success";
        }
        if (i != 1) {
            return i != 2 ? "Assert" : "service authentication failure";
        }
        return "service is unavailable";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }

    public ConnectionResult(int i) {
        this.a = i;
    }

    private ConnectionResult(Parcel parcel) {
        this.a = parcel.readInt();
    }
}
