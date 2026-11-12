package com.chinatelecom.multisimservice.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class SimInfo implements Parcelable, Cloneable {
    public static final Parcelable.Creator<SimInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7013b;
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

    public SimInfo() {
        this.f7012a = null;
        this.f7013b = null;
        this.c = false;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SimInfo clone() throws CloneNotSupportedException {
        return (SimInfo) super.clone();
    }

    public void c(boolean z) {
        this.c = z;
    }

    public void d(String str) {
        this.f7013b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SimInfo [mIMSI=" + this.f7012a + ", mICCID=" + this.f7013b + ", mActive=" + this.c + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7012a);
        parcel.writeString(this.f7013b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
    }

    public SimInfo(Parcel parcel) {
        this.f7012a = null;
        this.f7013b = null;
        this.c = false;
        this.f7012a = parcel.readString();
        this.f7013b = parcel.readString();
        this.c = parcel.readByte() != 0;
    }
}
