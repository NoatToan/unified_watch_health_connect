package com.euicc.server.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class EUICCInfo implements Parcelable, Cloneable {
    public static final Parcelable.Creator<EUICCInfo> CREATOR = new a();
    private String a;
    private String b;
    private boolean c;

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
        this.a = null;
        this.b = null;
        this.c = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getICCID() {
        return this.b;
    }

    public String getIMSI() {
        return this.a;
    }

    public boolean isActive() {
        return this.c;
    }

    public void setActive(boolean z) {
        this.c = z;
    }

    public void setICCID(String str) {
        this.b = str;
    }

    public void setIMSI(String str) {
        this.a = str;
    }

    public String toString() {
        return "SimInfo [mIMSI=" + this.a + ", mICCID=" + this.b + ", mActive=" + this.c + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EUICCInfo m3299clone() throws CloneNotSupportedException {
        return (EUICCInfo) super.clone();
    }

    public EUICCInfo(Parcel parcel) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readByte() != 0;
    }

    public EUICCInfo(String str, String str2, boolean z) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
