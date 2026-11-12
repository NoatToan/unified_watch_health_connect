package com.cmcc.server.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class SimInfo implements Parcelable {
    public static final Parcelable.Creator<SimInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7023b;
    public boolean c;

    public class a implements Parcelable.Creator<SimInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimInfo createFromParcel(Parcel parcel) {
            return new SimInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SimInfo[] newArray(int i) {
            return new SimInfo[i];
        }
    }

    public SimInfo(Parcel parcel) {
        this.f7022a = parcel.readString();
        this.f7023b = parcel.readString();
        this.c = parcel.readByte() != 0;
    }

    public void a(boolean z) {
        this.c = z;
    }

    public void c(String str) {
        this.f7023b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7022a);
        parcel.writeString(this.f7023b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
    }
}
