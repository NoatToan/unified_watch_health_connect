package com.unionpay.tsmservice.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class CheckBinCodeInfo implements Parcelable {
    public static final Parcelable.Creator<CheckBinCodeInfo> CREATOR = new a();
    private String a;
    private String b;
    private String c;
    private String d;

    public static class a implements Parcelable.Creator<CheckBinCodeInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CheckBinCodeInfo createFromParcel(Parcel parcel) {
            return new CheckBinCodeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CheckBinCodeInfo[] newArray(int i) {
            return new CheckBinCodeInfo[i];
        }
    }

    public CheckBinCodeInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBankName() {
        return this.b;
    }

    public String getCardType() {
        return this.c;
    }

    public String getIssuerUrl() {
        return this.d;
    }

    public String getTCUrl() {
        return this.a;
    }

    public void setBankName(String str) {
        this.b = str;
    }

    public void setCardType(String str) {
        this.c = str;
    }

    public void setIssuerUrl(String str) {
        this.d = str;
    }

    public void setTCUrl(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public CheckBinCodeInfo(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
    }
}
