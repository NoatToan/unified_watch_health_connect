package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class GetUniteAppListRequestParams extends RequestParams implements Parcelable {
    public static final Parcelable.Creator<GetUniteAppListRequestParams> CREATOR = new a();
    private String[] b;

    public static class a implements Parcelable.Creator<GetUniteAppListRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetUniteAppListRequestParams createFromParcel(Parcel parcel) {
            return new GetUniteAppListRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetUniteAppListRequestParams[] newArray(int i) {
            return new GetUniteAppListRequestParams[i];
        }
    }

    public GetUniteAppListRequestParams() {
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String[] getStatus() {
        return this.b;
    }

    public void setStatus(String[] strArr) {
        this.b = strArr;
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(this.b);
    }

    public GetUniteAppListRequestParams(Parcel parcel) {
        this.b = parcel.createStringArray();
    }
}
