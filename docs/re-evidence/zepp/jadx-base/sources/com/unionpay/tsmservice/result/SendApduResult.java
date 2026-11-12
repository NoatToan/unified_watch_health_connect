package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class SendApduResult implements Parcelable {
    public static final Parcelable.Creator<SendApduResult> CREATOR = new a();
    private String a;

    public static class a implements Parcelable.Creator<SendApduResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SendApduResult createFromParcel(Parcel parcel) {
            return new SendApduResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SendApduResult[] newArray(int i) {
            return new SendApduResult[i];
        }
    }

    public SendApduResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getOutHexApdu() {
        return this.a;
    }

    public void setOutHexApdu(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    public SendApduResult(Parcel parcel) {
        this.a = parcel.readString();
    }
}
