package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.data.UpdateInfo;

/* JADX INFO: loaded from: classes18.dex */
public class InitResult implements Parcelable {
    public static final Parcelable.Creator<InitResult> CREATOR = new a();
    private UpdateInfo a;

    public static class a implements Parcelable.Creator<InitResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InitResult createFromParcel(Parcel parcel) {
            return new InitResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InitResult[] newArray(int i) {
            return new InitResult[i];
        }
    }

    public InitResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public UpdateInfo getUpdateInfo() {
        return this.a;
    }

    public void setUpdateInfo(UpdateInfo updateInfo) {
        this.a = updateInfo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }

    public InitResult(Parcel parcel) {
        this.a = (UpdateInfo) parcel.readParcelable(UpdateInfo.class.getClassLoader());
    }
}
