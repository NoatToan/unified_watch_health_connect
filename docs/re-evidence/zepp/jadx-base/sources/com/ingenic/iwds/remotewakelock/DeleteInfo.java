package com.ingenic.iwds.remotewakelock;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
class DeleteInfo extends com.ingenic.iwds.remotewakelock.a implements Parcelable {
    public static final Parcelable.Creator<DeleteInfo> CREATOR = new a();

    public static class a implements Parcelable.Creator<DeleteInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeleteInfo createFromParcel(Parcel parcel) {
            return new DeleteInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DeleteInfo[] newArray(int i) {
            return new DeleteInfo[i];
        }
    }

    public DeleteInfo(int i, int i2) {
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

    public DeleteInfo(Parcel parcel) {
        c(parcel);
    }
}
