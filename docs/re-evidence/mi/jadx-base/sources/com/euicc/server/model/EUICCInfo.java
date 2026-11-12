package com.euicc.server.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class EUICCInfo implements Parcelable, Cloneable {
    public static final Parcelable.Creator<EUICCInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7075b;
    public boolean c;

    public class a implements Parcelable.Creator<EUICCInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EUICCInfo createFromParcel(Parcel parcel) {
            return new EUICCInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EUICCInfo[] newArray(int i) {
            return new EUICCInfo[i];
        }
    }

    public EUICCInfo() {
        this.f7074a = null;
        this.f7075b = null;
        this.c = false;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public EUICCInfo clone() throws CloneNotSupportedException {
        return (EUICCInfo) super.clone();
    }

    public String c() {
        return this.f7075b;
    }

    public String d() {
        return this.f7074a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(boolean z) {
        this.c = z;
    }

    public void f(String str) {
        this.f7075b = str;
    }

    public String toString() {
        return "SimInfo [mIMSI=" + this.f7074a + ", mICCID=" + this.f7075b + ", mActive=" + this.c + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7074a);
        parcel.writeString(this.f7075b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
    }

    public EUICCInfo(Parcel parcel) {
        this.f7074a = null;
        this.f7075b = null;
        this.c = false;
        this.f7074a = parcel.readString();
        this.f7075b = parcel.readString();
        this.c = parcel.readByte() != 0;
    }
}
