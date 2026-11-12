package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class GetSeIdResult implements Parcelable {
    public static final Parcelable.Creator<GetSeIdResult> CREATOR = new a();
    private String a;

    public static class a implements Parcelable.Creator<GetSeIdResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetSeIdResult createFromParcel(Parcel parcel) {
            return new GetSeIdResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetSeIdResult[] newArray(int i) {
            return new GetSeIdResult[i];
        }
    }

    public GetSeIdResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getSeId() {
        return this.a;
    }

    public void setSeId(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    public GetSeIdResult(Parcel parcel) {
        this.a = parcel.readString();
    }
}
