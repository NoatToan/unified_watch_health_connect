package com.unionpay.tsmservice.result;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class ECashTopUpResult implements Parcelable {
    public static final Parcelable.Creator<ECashTopUpResult> CREATOR = new a();
    private String a;
    private String b;

    public static class a implements Parcelable.Creator<ECashTopUpResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ECashTopUpResult createFromParcel(Parcel parcel) {
            return new ECashTopUpResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ECashTopUpResult[] newArray(int i) {
            return new ECashTopUpResult[i];
        }
    }

    public ECashTopUpResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBalance() {
        return this.a;
    }

    public String getOverdraw() {
        return this.b;
    }

    public void setBalance(String str) {
        this.a = str;
    }

    public void setOverdraw(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    @SuppressLint({"NewApi"})
    public ECashTopUpResult(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }
}
