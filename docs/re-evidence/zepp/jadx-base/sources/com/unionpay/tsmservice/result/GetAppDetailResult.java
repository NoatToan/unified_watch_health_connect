package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.data.AppDetail;

/* JADX INFO: loaded from: classes18.dex */
public class GetAppDetailResult implements Parcelable {
    public static final Parcelable.Creator<GetAppDetailResult> CREATOR = new a();
    private AppDetail a;

    public static class a implements Parcelable.Creator<GetAppDetailResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetAppDetailResult createFromParcel(Parcel parcel) {
            return new GetAppDetailResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetAppDetailResult[] newArray(int i) {
            return new GetAppDetailResult[i];
        }
    }

    public GetAppDetailResult() {
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

    public GetAppDetailResult(Parcel parcel) {
        this.a = (AppDetail) parcel.readParcelable(AppDetail.class.getClassLoader());
    }
}
