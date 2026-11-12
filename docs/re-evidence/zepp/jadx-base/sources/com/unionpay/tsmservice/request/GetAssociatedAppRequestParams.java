package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class GetAssociatedAppRequestParams extends RequestParams {
    public static final Parcelable.Creator<GetAssociatedAppRequestParams> CREATOR = new a();
    private String b;

    public static class a implements Parcelable.Creator<GetAssociatedAppRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetAssociatedAppRequestParams createFromParcel(Parcel parcel) {
            return new GetAssociatedAppRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetAssociatedAppRequestParams[] newArray(int i) {
            return new GetAssociatedAppRequestParams[i];
        }
    }

    public GetAssociatedAppRequestParams() {
    }

    public String getEncryptPan() {
        return this.b;
    }

    public void setEncryptPan(String str) {
        this.b = str;
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.b);
    }

    public GetAssociatedAppRequestParams(Parcel parcel) {
        this.b = parcel.readString();
    }

    public GetAssociatedAppRequestParams(String str) {
        this.b = str;
    }
}
