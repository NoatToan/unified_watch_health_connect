package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.AppID;

/* JADX INFO: loaded from: classes18.dex */
public class GetAccountBalanceRequestParams extends RequestParams {
    public static final Parcelable.Creator<GetAccountBalanceRequestParams> CREATOR = new a();
    private AppID b;
    private String c;

    public static class a implements Parcelable.Creator<GetAccountBalanceRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetAccountBalanceRequestParams createFromParcel(Parcel parcel) {
            return new GetAccountBalanceRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetAccountBalanceRequestParams[] newArray(int i) {
            return new GetAccountBalanceRequestParams[i];
        }
    }

    public GetAccountBalanceRequestParams() {
    }

    public AppID getAppID() {
        return this.b;
    }

    public String getEncryptPin() {
        return this.c;
    }

    public void setAppID(AppID appID) {
        this.b = appID;
    }

    public void setEncryptPin(String str) {
        this.c = str;
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
    }

    public GetAccountBalanceRequestParams(Parcel parcel) {
        this.b = (AppID) parcel.readParcelable(AppID.class.getClassLoader());
        this.c = parcel.readString();
    }
}
