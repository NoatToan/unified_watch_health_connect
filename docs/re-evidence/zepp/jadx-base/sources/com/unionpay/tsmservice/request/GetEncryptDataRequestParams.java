package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class GetEncryptDataRequestParams extends RequestParams {
    public static final Parcelable.Creator<GetEncryptDataRequestParams> CREATOR = new a();
    private int b;
    private String c;

    public static class a implements Parcelable.Creator<GetEncryptDataRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetEncryptDataRequestParams createFromParcel(Parcel parcel) {
            return new GetEncryptDataRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetEncryptDataRequestParams[] newArray(int i) {
            return new GetEncryptDataRequestParams[i];
        }
    }

    public GetEncryptDataRequestParams() {
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getPan() {
        return this.c;
    }

    public int getType() {
        return this.b;
    }

    public void setPan(String str) {
        this.c = str;
    }

    public void setType(int i) {
        this.b = i;
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
    }

    public GetEncryptDataRequestParams(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readString();
    }
}
