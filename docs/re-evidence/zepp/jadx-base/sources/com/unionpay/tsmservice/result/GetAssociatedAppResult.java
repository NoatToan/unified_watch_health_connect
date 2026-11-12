package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.data.AppDetail;

/* JADX INFO: loaded from: classes18.dex */
public class GetAssociatedAppResult implements Parcelable {
    public static final Parcelable.Creator<GetAssociatedAppResult> CREATOR = new a();
    private AppDetail a;

    public static class a implements Parcelable.Creator<GetAssociatedAppResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetAssociatedAppResult createFromParcel(Parcel parcel) {
            return new GetAssociatedAppResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetAssociatedAppResult[] newArray(int i) {
            return new GetAssociatedAppResult[i];
        }
    }

    public GetAssociatedAppResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AppDetail getAppDetail() {
        return this.a;
    }

    public void setAppDetail(AppDetail appDetail) {
        this.a = appDetail;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }

    public GetAssociatedAppResult(Parcel parcel) {
        this.a = (AppDetail) parcel.readParcelable(AppDetail.class.getClassLoader());
    }
}
