package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class GetDefaultCardResult implements Parcelable {
    public static final Parcelable.Creator<GetDefaultCardResult> CREATOR = new a();
    private String a;

    public static class a implements Parcelable.Creator<GetDefaultCardResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetDefaultCardResult createFromParcel(Parcel parcel) {
            return new GetDefaultCardResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetDefaultCardResult[] newArray(int i) {
            return new GetDefaultCardResult[i];
        }
    }

    public GetDefaultCardResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDefaultCard() {
        return this.a;
    }

    public void setDefaultCard(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    public GetDefaultCardResult(Parcel parcel) {
        this.a = parcel.readString();
    }
}
