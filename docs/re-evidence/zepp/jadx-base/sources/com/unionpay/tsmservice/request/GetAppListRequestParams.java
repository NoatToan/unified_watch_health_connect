package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class GetAppListRequestParams extends RequestParams implements Parcelable {
    public static final Parcelable.Creator<GetAppListRequestParams> CREATOR = new a();
    private String b;
    private String[] c;

    public static class a implements Parcelable.Creator<GetAppListRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetAppListRequestParams createFromParcel(Parcel parcel) {
            return new GetAppListRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetAppListRequestParams[] newArray(int i) {
            return new GetAppListRequestParams[i];
        }
    }

    public GetAppListRequestParams() {
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getKeyword() {
        return this.b;
    }

    public String[] getStatus() {
        return this.c;
    }

    public void setKeyword(String str) {
        this.b = str;
    }

    public void setStatus(String[] strArr) {
        this.c = strArr;
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeStringArray(this.c);
    }

    public GetAppListRequestParams(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.createStringArray();
    }
}
