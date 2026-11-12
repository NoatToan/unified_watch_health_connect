package com.chinatelecom.multisimservice.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class SimInfo implements Parcelable, Cloneable {
    public static final Parcelable.Creator<SimInfo> CREATOR = new a();
    private String a;
    private String b;
    private boolean c;

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

    @NotNull
    public String toString() {
        return "SimInfo [mIMSI=" + this.a + ", mICCID=" + this.b + ", mActive=" + this.c + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
    }

    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SimInfo m3298clone() throws CloneNotSupportedException {
        return (SimInfo) super.clone();
    }

    public SimInfo(Parcel parcel) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readByte() != 0;
    }

    public SimInfo(String str, String str2, boolean z) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
