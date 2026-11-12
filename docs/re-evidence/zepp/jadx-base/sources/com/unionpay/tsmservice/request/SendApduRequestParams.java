package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class SendApduRequestParams extends RequestParams {
    public static final Parcelable.Creator<SendApduRequestParams> CREATOR = new a();
    private String b;
    private String c;

    public static class a implements Parcelable.Creator<SendApduRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SendApduRequestParams createFromParcel(Parcel parcel) {
            return new SendApduRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SendApduRequestParams[] newArray(int i) {
            return new SendApduRequestParams[i];
        }
    }

    public SendApduRequestParams() {
    }

    public String getChannel() {
        return this.b;
    }

    public String getHexApdu() {
        return this.c;
    }

    public void setChannel(String str) {
        this.b = str;
    }

    public void setHexApdu(String str) {
        this.c = str;
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public SendApduRequestParams(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
