package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class HideAppApplyResult implements Parcelable {
    public static final Parcelable.Creator<HideAppApplyResult> CREATOR = new a();
    private boolean a;

    public static class a implements Parcelable.Creator<HideAppApplyResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HideAppApplyResult createFromParcel(Parcel parcel) {
            return new HideAppApplyResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HideAppApplyResult[] newArray(int i) {
            return new HideAppApplyResult[i];
        }
    }

    public HideAppApplyResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isSuccess() {
        return this.a;
    }

    public void setSuccess(boolean z) {
        this.a = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
    }

    public HideAppApplyResult(Parcel parcel) {
        this.a = parcel.readByte() != 0;
    }
}
