package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.data.AssociatedCardInfo;

/* JADX INFO: loaded from: classes18.dex */
public class GetAccountInfoResult implements Parcelable {
    public static final Parcelable.Creator<GetAccountInfoResult> CREATOR = new a();
    private AssociatedCardInfo a;

    public static class a implements Parcelable.Creator<GetAccountInfoResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetAccountInfoResult createFromParcel(Parcel parcel) {
            return new GetAccountInfoResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetAccountInfoResult[] newArray(int i) {
            return new GetAccountInfoResult[i];
        }
    }

    public GetAccountInfoResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AssociatedCardInfo getAssociatedCardInfo() {
        return this.a;
    }

    public void setAssociatedCardInfo(AssociatedCardInfo associatedCardInfo) {
        this.a = associatedCardInfo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }

    public GetAccountInfoResult(Parcel parcel) {
        this.a = (AssociatedCardInfo) parcel.readParcelable(AssociatedCardInfo.class.getClassLoader());
    }
}
