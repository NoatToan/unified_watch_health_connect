package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.data.CardTypeListItem;

/* JADX INFO: loaded from: classes18.dex */
public class GetSupportedCardTypeListResult implements Parcelable {
    public static final Parcelable.Creator<GetSupportedCardTypeListResult> CREATOR = new a();
    private CardTypeListItem[] a;

    public static class a implements Parcelable.Creator<GetSupportedCardTypeListResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetSupportedCardTypeListResult createFromParcel(Parcel parcel) {
            return new GetSupportedCardTypeListResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetSupportedCardTypeListResult[] newArray(int i) {
            return new GetSupportedCardTypeListResult[i];
        }
    }

    public GetSupportedCardTypeListResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CardTypeListItem[] getAppList() {
        return this.a;
    }

    public void setAppList(CardTypeListItem[] cardTypeListItemArr) {
        this.a = cardTypeListItemArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.a, i);
    }

    public GetSupportedCardTypeListResult(Parcel parcel) {
        this.a = (CardTypeListItem[]) parcel.createTypedArray(CardTypeListItem.CREATOR);
    }
}
