package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class UniteAppDeleteRequestParams extends RequestParams {
    public static final Parcelable.Creator<UniteAppDeleteRequestParams> CREATOR = new a();
    private String b;

    public static class a implements Parcelable.Creator<UniteAppDeleteRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UniteAppDeleteRequestParams createFromParcel(Parcel parcel) {
            return new UniteAppDeleteRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UniteAppDeleteRequestParams[] newArray(int i) {
            return new UniteAppDeleteRequestParams[i];
        }
    }

    public UniteAppDeleteRequestParams() {
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

    public UniteAppDeleteRequestParams(Parcel parcel) {
        this.b = parcel.readString();
    }
}
