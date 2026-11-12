package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.data.PhysicalCardInfo;

/* JADX INFO: loaded from: classes18.dex */
public class AppDownloadApplyResult implements Parcelable {
    public static final Parcelable.Creator<AppDownloadApplyResult> CREATOR = new a();
    private PhysicalCardInfo a;

    public static class a implements Parcelable.Creator<AppDownloadApplyResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppDownloadApplyResult createFromParcel(Parcel parcel) {
            return new AppDownloadApplyResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppDownloadApplyResult[] newArray(int i) {
            return new AppDownloadApplyResult[i];
        }
    }

    public AppDownloadApplyResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PhysicalCardInfo getPhysicalCardInfo() {
        return this.a;
    }

    public void setPhysicalCardInfo(PhysicalCardInfo physicalCardInfo) {
        this.a = physicalCardInfo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }

    public AppDownloadApplyResult(Parcel parcel) {
        this.a = (PhysicalCardInfo) parcel.readParcelable(PhysicalCardInfo.class.getClassLoader());
    }
}
