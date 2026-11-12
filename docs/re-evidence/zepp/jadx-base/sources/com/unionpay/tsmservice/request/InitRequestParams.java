package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class InitRequestParams extends RequestParams {
    public static final Parcelable.Creator<InitRequestParams> CREATOR = new a();
    private int b;

    public static class a implements Parcelable.Creator<InitRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InitRequestParams createFromParcel(Parcel parcel) {
            return new InitRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InitRequestParams[] newArray(int i) {
            return new InitRequestParams[i];
        }
    }

    public InitRequestParams(Parcel parcel) {
        this.b = parcel.readInt();
    }

    public int getType() {
        return this.b;
    }

    public void setType(int i) {
        this.b = i;
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.b);
    }

    public InitRequestParams() {
    }
}
