package com.unionpay.tsmservice.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class UniteAppStatus implements Parcelable {
    public static final String ACTIVELESS = "02";
    public static final Parcelable.Creator<UniteAppStatus> CREATOR = new a();
    public static final String DELETED = "06";
    public static final String FINE = "01";
    public static final String ILLEGAL = "99";
    public static final String INSTALLLESS = "04";
    public static final String LOCKED = "05";
    public static final String NONE = "03";
    private String a;

    public static class a implements Parcelable.Creator<UniteAppStatus> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UniteAppStatus createFromParcel(Parcel parcel) {
            return new UniteAppStatus(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UniteAppStatus[] newArray(int i) {
            return new UniteAppStatus[i];
        }
    }

    public UniteAppStatus() {
        this.a = "03";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getStatus() {
        return this.a;
    }

    public void setStatus(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    public UniteAppStatus(String str) {
        this.a = "03";
        this.a = str;
    }

    public UniteAppStatus(Parcel parcel) {
        this.a = "03";
        this.a = parcel.readString();
    }
}
