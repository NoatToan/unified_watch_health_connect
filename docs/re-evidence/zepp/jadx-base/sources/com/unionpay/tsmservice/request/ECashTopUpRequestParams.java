package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.AppID;

/* JADX INFO: loaded from: classes18.dex */
public class ECashTopUpRequestParams extends RequestParams {
    public static final Parcelable.Creator<ECashTopUpRequestParams> CREATOR = new a();
    private AppID b;
    private String c;
    private String d;
    private String e;

    public static class a implements Parcelable.Creator<ECashTopUpRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ECashTopUpRequestParams createFromParcel(Parcel parcel) {
            return new ECashTopUpRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ECashTopUpRequestParams[] newArray(int i) {
            return new ECashTopUpRequestParams[i];
        }
    }

    public ECashTopUpRequestParams() {
        this.c = "0";
    }

    public String getAmount() {
        return this.d;
    }

    public AppID getAppID() {
        return this.b;
    }

    public String getEncrpytPin() {
        return this.e;
    }

    public String getType() {
        return this.c;
    }

    public void setAmount(String str) {
        this.d = str;
    }

    public void setAppID(AppID appID) {
        this.b = appID;
    }

    public void setEncrpytPin(String str) {
        this.e = str;
    }

    public void setType(String str) {
        this.c = str;
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }

    public ECashTopUpRequestParams(Parcel parcel) {
        this.c = "0";
        this.b = (AppID) parcel.readParcelable(AppID.class.getClassLoader());
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
    }
}
