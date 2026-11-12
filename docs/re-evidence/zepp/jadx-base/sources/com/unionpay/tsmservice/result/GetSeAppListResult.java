package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.data.SeAppListItem;

/* JADX INFO: loaded from: classes18.dex */
public class GetSeAppListResult implements Parcelable {
    public static final Parcelable.Creator<GetSeAppListResult> CREATOR = new a();
    private SeAppListItem[] a;

    public static class a implements Parcelable.Creator<GetSeAppListResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetSeAppListResult createFromParcel(Parcel parcel) {
            return new GetSeAppListResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetSeAppListResult[] newArray(int i) {
            return new GetSeAppListResult[i];
        }
    }

    public GetSeAppListResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SeAppListItem[] getSeAppList() {
        return this.a;
    }

    public void setSeAppList(SeAppListItem[] seAppListItemArr) {
        this.a = seAppListItemArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.a, i);
    }

    public GetSeAppListResult(Parcel parcel) {
        this.a = (SeAppListItem[]) parcel.createTypedArray(SeAppListItem.CREATOR);
    }
}
