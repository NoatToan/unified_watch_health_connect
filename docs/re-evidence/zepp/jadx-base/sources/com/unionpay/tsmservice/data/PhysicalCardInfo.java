package com.unionpay.tsmservice.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class PhysicalCardInfo implements Parcelable {
    public static final Parcelable.Creator<PhysicalCardInfo> CREATOR = new a();
    public static final String TYPE_CREDIT = "02";
    public static final String TYPE_DEBIT = "01";
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    public static class a implements Parcelable.Creator<PhysicalCardInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PhysicalCardInfo createFromParcel(Parcel parcel) {
            return new PhysicalCardInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PhysicalCardInfo[] newArray(int i) {
            return new PhysicalCardInfo[i];
        }
    }

    public PhysicalCardInfo() {
        this.a = "";
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

    public String getBankLogo() {
        return this.f;
    }

    public String getBankName() {
        return this.e;
    }

    public String getCardIcon() {
        return this.d;
    }

    public String getCardNo() {
        return this.b;
    }

    public String getCardType() {
        return this.c;
    }

    public String getReferenceID() {
        return this.a;
    }

    public void setBankLogo(String str) {
        this.f = str;
    }

    public void setBankName(String str) {
        this.e = str;
    }

    public void setCardIcon(String str) {
        this.d = str;
    }

    public void setCardNo(String str) {
        this.b = str;
    }

    public void setCardType(String str) {
        this.c = str;
    }

    public void setReferenceID(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }

    public PhysicalCardInfo(Parcel parcel) {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
    }
}
