package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class UniteAppDownloadRequestParams extends RequestParams {
    public static final Parcelable.Creator<UniteAppDownloadRequestParams> CREATOR = new a();
    private String b;

    public static class a implements Parcelable.Creator<UniteAppDownloadRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UniteAppDownloadRequestParams createFromParcel(Parcel parcel) {
            return new UniteAppDownloadRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UniteAppDownloadRequestParams[] newArray(int i) {
            return new UniteAppDownloadRequestParams[i];
        }
    }

    public UniteAppDownloadRequestParams() {
    }

    public String getMPanId() {
        return this.b;
    }

    public void setMPanId(String str) {
        this.b = str;
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.b);
    }

    public UniteAppDownloadRequestParams(Parcel parcel) {
        this.b = parcel.readString();
    }
}
