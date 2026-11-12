package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class BleKeyExchangeResult implements Parcelable {
    public static final Parcelable.Creator<BleKeyExchangeResult> CREATOR = new a();

    public static class a implements Parcelable.Creator<BleKeyExchangeResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BleKeyExchangeResult createFromParcel(Parcel parcel) {
            return new BleKeyExchangeResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BleKeyExchangeResult[] newArray(int i) {
            return new BleKeyExchangeResult[i];
        }
    }

    public BleKeyExchangeResult(Parcel parcel) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    public BleKeyExchangeResult() {
    }
}
