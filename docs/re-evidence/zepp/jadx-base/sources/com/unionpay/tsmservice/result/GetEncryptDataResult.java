package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class GetEncryptDataResult implements Parcelable {
    public static final Parcelable.Creator<GetEncryptDataResult> CREATOR = new a();
    private String a;

    public static class a implements Parcelable.Creator<GetEncryptDataResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetEncryptDataResult createFromParcel(Parcel parcel) {
            return new GetEncryptDataResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetEncryptDataResult[] newArray(int i) {
            return new GetEncryptDataResult[i];
        }
    }

    public GetEncryptDataResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getData() {
        return this.a;
    }

    public void setData(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    public GetEncryptDataResult(Parcel parcel) {
        this.a = parcel.readString();
    }
}
