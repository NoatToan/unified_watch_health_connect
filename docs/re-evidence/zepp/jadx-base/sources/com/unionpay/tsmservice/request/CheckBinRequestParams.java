package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class CheckBinRequestParams extends RequestParams {
    public static final Parcelable.Creator<CheckBinRequestParams> CREATOR = new a();
    private String b;

    public static class a implements Parcelable.Creator<CheckBinRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CheckBinRequestParams createFromParcel(Parcel parcel) {
            return new CheckBinRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CheckBinRequestParams[] newArray(int i) {
            return new CheckBinRequestParams[i];
        }
    }

    public CheckBinRequestParams() {
    }

    public String getSPan() {
        return this.b;
    }

    public void setSPan(String str) {
        this.b = str;
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.b);
    }

    public CheckBinRequestParams(Parcel parcel) {
        this.b = parcel.readString();
    }
}
