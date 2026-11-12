package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class ExchangeKeyRequestParams extends RequestParams {
    public static final Parcelable.Creator<ExchangeKeyRequestParams> CREATOR = new a();
    private int b;
    private String c;

    public static class a implements Parcelable.Creator<ExchangeKeyRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ExchangeKeyRequestParams createFromParcel(Parcel parcel) {
            return new ExchangeKeyRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ExchangeKeyRequestParams[] newArray(int i) {
            return new ExchangeKeyRequestParams[i];
        }
    }

    public ExchangeKeyRequestParams() {
    }

    public String getTempKey() {
        return this.c;
    }

    public int getType() {
        return this.b;
    }

    public void setTempKey(String str) {
        this.c = str;
    }

    public void setType(int i) {
        this.b = i;
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
    }

    public ExchangeKeyRequestParams(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readString();
    }
}
