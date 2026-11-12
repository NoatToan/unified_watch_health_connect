package com.ingenic.iwds.remotewakelock;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
class CMDInfo extends com.ingenic.iwds.remotewakelock.a implements Parcelable {
    public static final int CMD_ACQUIRE = 1;
    public static final int CMD_RELEASE = 0;
    public static final Parcelable.Creator<CMDInfo> CREATOR = new a();
    private int c;
    private long d;

    public static class a implements Parcelable.Creator<CMDInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CMDInfo createFromParcel(Parcel parcel) {
            return new CMDInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CMDInfo[] newArray(int i) {
            return new CMDInfo[i];
        }
    }

    public CMDInfo(int i, int i2) {
        this(i, i, 0);
    }

    public int c() {
        return this.c;
    }

    public long d() {
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
        this.d = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
    }

    public CMDInfo(int i, int i2, int i3) {
        this(i, i2, i3, -1L);
    }

    public CMDInfo(int i, int i2, int i3, long j) {
        this.c = 0;
        this.d = -1L;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
    }

    public CMDInfo(Parcel parcel) {
        this.c = 0;
        this.d = -1L;
        e(parcel);
    }
}
