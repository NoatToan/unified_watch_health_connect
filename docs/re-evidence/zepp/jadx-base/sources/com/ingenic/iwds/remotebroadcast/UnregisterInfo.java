package com.ingenic.iwds.remotebroadcast;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
class UnregisterInfo extends com.ingenic.iwds.remotebroadcast.a implements Parcelable {
    public static final Parcelable.Creator<UnregisterInfo> CREATOR = new a();

    public static class a implements Parcelable.Creator<UnregisterInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UnregisterInfo createFromParcel(Parcel parcel) {
            return new UnregisterInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UnregisterInfo[] newArray(int i) {
            return new UnregisterInfo[i];
        }
    }

    public UnregisterInfo(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void c(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }

    public UnregisterInfo(Parcel parcel) {
        c(parcel);
    }
}
