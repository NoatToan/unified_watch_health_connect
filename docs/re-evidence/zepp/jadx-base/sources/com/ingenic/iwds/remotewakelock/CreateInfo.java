package com.ingenic.iwds.remotewakelock;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
class CreateInfo extends com.ingenic.iwds.remotewakelock.a implements Parcelable {
    public static final Parcelable.Creator<CreateInfo> CREATOR = new a();
    private int c;
    private String d;

    public static class a implements Parcelable.Creator<CreateInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CreateInfo createFromParcel(Parcel parcel) {
            return new CreateInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CreateInfo[] newArray(int i) {
            return new CreateInfo[i];
        }
    }

    public CreateInfo(int i, int i2, int i3, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
    }

    public int c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
    }

    public CreateInfo(Parcel parcel) {
        e(parcel);
    }
}
