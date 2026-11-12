package com.unionpay.tsmservice.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.AppID;

/* JADX INFO: loaded from: classes18.dex */
public class VirtualCardInfo implements Parcelable {
    public static final Parcelable.Creator<VirtualCardInfo> CREATOR = new a();
    private AppID a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    public static class a implements Parcelable.Creator<VirtualCardInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VirtualCardInfo createFromParcel(Parcel parcel) {
            return new VirtualCardInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public VirtualCardInfo[] newArray(int i) {
            return new VirtualCardInfo[i];
        }
    }

    public VirtualCardInfo() {
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AppID getAppID() {
        return this.a;
    }

    public String getBalance() {
        return this.f;
    }

    public String getCVN2() {
        return this.e;
    }

    public String getCardNo() {
        return this.c;
    }

    public String getReferenceID() {
        return this.b;
    }

    public String getValidDate() {
        return this.d;
    }

    public void setAppID(AppID appID) {
        this.a = appID;
    }

    public void setBalance(String str) {
        this.f = str;
    }

    public void setCVN2(String str) {
        this.e = str;
    }

    public void setCardNo(String str) {
        this.c = str;
    }

    public void setReferenceID(String str) {
        this.b = str;
    }

    public void setValidDate(String str) {
        this.d = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }

    public VirtualCardInfo(Parcel parcel) {
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.a = (AppID) parcel.readParcelable(AppID.class.getClassLoader());
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
    }
}
