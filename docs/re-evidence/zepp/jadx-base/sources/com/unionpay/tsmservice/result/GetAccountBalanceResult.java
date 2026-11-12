package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.data.AssociatedCardBalance;

/* JADX INFO: loaded from: classes18.dex */
public class GetAccountBalanceResult implements Parcelable {
    public static final Parcelable.Creator<GetAccountBalanceResult> CREATOR = new a();
    private AssociatedCardBalance a;

    public static class a implements Parcelable.Creator<GetAccountBalanceResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetAccountBalanceResult createFromParcel(Parcel parcel) {
            return new GetAccountBalanceResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetAccountBalanceResult[] newArray(int i) {
            return new GetAccountBalanceResult[i];
        }
    }

    public GetAccountBalanceResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AssociatedCardBalance getAssociatedCardBalance() {
        return this.a;
    }

    public void setAssociatedCardBalance(AssociatedCardBalance associatedCardBalance) {
        this.a = associatedCardBalance;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }

    public GetAccountBalanceResult(Parcel parcel) {
        this.a = (AssociatedCardBalance) parcel.readParcelable(AssociatedCardBalance.class.getClassLoader());
    }
}
