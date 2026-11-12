package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class GetActiveCodeRequestParams extends RequestParams {
    public static final Parcelable.Creator<GetActiveCodeRequestParams> CREATOR = new a();
    private String b;
    private String c;

    public static class a implements Parcelable.Creator<GetActiveCodeRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetActiveCodeRequestParams createFromParcel(Parcel parcel) {
            return new GetActiveCodeRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetActiveCodeRequestParams[] newArray(int i) {
            return new GetActiveCodeRequestParams[i];
        }
    }

    public GetActiveCodeRequestParams() {
    }

    public String getActiveType() {
        return this.c;
    }

    public String getMPanId() {
        return this.b;
    }

    public void setActiveType(String str) {
        this.c = str;
    }

    public void setMPanId(String str) {
        this.b = str;
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public GetActiveCodeRequestParams(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
