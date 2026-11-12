package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class GetPubKeyResult implements Parcelable {
    public static final Parcelable.Creator<GetPubKeyResult> CREATOR = new a();
    private String a;

    public static class a implements Parcelable.Creator<GetPubKeyResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetPubKeyResult createFromParcel(Parcel parcel) {
            return new GetPubKeyResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetPubKeyResult[] newArray(int i) {
            return new GetPubKeyResult[i];
        }
    }

    public GetPubKeyResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getKey() {
        return this.a;
    }

    public void setKey(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    public GetPubKeyResult(Parcel parcel) {
        this.a = parcel.readString();
    }
}
