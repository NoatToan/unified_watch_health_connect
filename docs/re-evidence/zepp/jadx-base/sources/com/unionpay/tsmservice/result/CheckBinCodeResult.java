package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.data.CheckBinCodeInfo;

/* JADX INFO: loaded from: classes18.dex */
public class CheckBinCodeResult implements Parcelable {
    public static final Parcelable.Creator<CheckBinCodeResult> CREATOR = new a();
    private CheckBinCodeInfo a;

    public static class a implements Parcelable.Creator<CheckBinCodeResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CheckBinCodeResult createFromParcel(Parcel parcel) {
            return new CheckBinCodeResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CheckBinCodeResult[] newArray(int i) {
            return new CheckBinCodeResult[i];
        }
    }

    public CheckBinCodeResult(Parcel parcel) {
        this.a = (CheckBinCodeInfo) parcel.readParcelable(CheckBinCodeInfo.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CheckBinCodeInfo getCheckBinCodeInfo() {
        return this.a;
    }

    public void setCheckBinCodeInfo(CheckBinCodeInfo checkBinCodeInfo) {
        this.a = checkBinCodeInfo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }

    public CheckBinCodeResult() {
    }
}
