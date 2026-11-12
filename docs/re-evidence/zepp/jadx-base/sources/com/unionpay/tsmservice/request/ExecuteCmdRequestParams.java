package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class ExecuteCmdRequestParams extends RequestParams {
    public static final Parcelable.Creator<ExecuteCmdRequestParams> CREATOR = new a();
    private String b;
    private String c;

    public static class a implements Parcelable.Creator<ExecuteCmdRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ExecuteCmdRequestParams createFromParcel(Parcel parcel) {
            return new ExecuteCmdRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ExecuteCmdRequestParams[] newArray(int i) {
            return new ExecuteCmdRequestParams[i];
        }
    }

    public ExecuteCmdRequestParams() {
    }

    public String getSign() {
        return this.c;
    }

    public String getSsid() {
        return this.b;
    }

    public void setSign(String str) {
        this.c = str;
    }

    public void setSsid(String str) {
        this.b = str;
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public ExecuteCmdRequestParams(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
