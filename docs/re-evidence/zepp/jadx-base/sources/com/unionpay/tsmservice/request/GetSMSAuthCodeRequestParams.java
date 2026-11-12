package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.AppID;

/* JADX INFO: loaded from: classes18.dex */
public class GetSMSAuthCodeRequestParams extends RequestParams {
    public static final Parcelable.Creator<GetSMSAuthCodeRequestParams> CREATOR = new a();
    private AppID b;
    private String c;
    private String d;

    public static class a implements Parcelable.Creator<GetSMSAuthCodeRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetSMSAuthCodeRequestParams createFromParcel(Parcel parcel) {
            return new GetSMSAuthCodeRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetSMSAuthCodeRequestParams[] newArray(int i) {
            return new GetSMSAuthCodeRequestParams[i];
        }
    }

    public GetSMSAuthCodeRequestParams() {
    }

    public AppID getAppID() {
        return this.b;
    }

    public String getMsisdn() {
        return this.d;
    }

    public String getPan() {
        return this.c;
    }

    public void setAppID(AppID appID) {
        this.b = appID;
    }

    public void setMsisdn(String str) {
        this.d = str;
    }

    public void setPan(String str) {
        this.c = str;
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public GetSMSAuthCodeRequestParams(Parcel parcel) {
        this.b = (AppID) parcel.readParcelable(AppID.class.getClassLoader());
        this.c = parcel.readString();
        this.d = parcel.readString();
    }
}
