package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.data.VirtualCardInfo;

/* JADX INFO: loaded from: classes18.dex */
public class GetCardInfoResult implements Parcelable {
    public static final Parcelable.Creator<GetCardInfoResult> CREATOR = new a();
    private VirtualCardInfo[] a;

    public static class a implements Parcelable.Creator<GetCardInfoResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetCardInfoResult createFromParcel(Parcel parcel) {
            return new GetCardInfoResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetCardInfoResult[] newArray(int i) {
            return new GetCardInfoResult[i];
        }
    }

    public GetCardInfoResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VirtualCardInfo[] getVirtualCardInfo() {
        return this.a;
    }

    public void setVirtualCardInfo(VirtualCardInfo[] virtualCardInfoArr) {
        this.a = virtualCardInfoArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.a, i);
    }

    public GetCardInfoResult(Parcel parcel) {
        this.a = (VirtualCardInfo[]) parcel.createTypedArray(VirtualCardInfo.CREATOR);
    }
}
