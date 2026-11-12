package com.unionpay.tsmservice;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class AppID implements Parcelable {
    public static final Parcelable.Creator<AppID> CREATOR = new a();
    public String a;
    public String b;

    public static class a implements Parcelable.Creator<AppID> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppID createFromParcel(Parcel parcel) {
            return new AppID(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppID[] newArray(int i) {
            return new AppID[i];
        }
    }

    public AppID(String str, String str2) {
        this.a = "";
        this.b = "";
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppAid() {
        return this.a;
    }

    public String getAppVersion() {
        return this.b;
    }

    public void setAppAid(String str) {
        this.a = str;
    }

    public void setAppVersion(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public AppID(Parcel parcel) {
        this.a = "";
        this.b = "";
        this.a = parcel.readString();
        this.b = parcel.readString();
    }
}
