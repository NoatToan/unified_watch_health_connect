package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.data.AppDetail;

/* JADX INFO: loaded from: classes18.dex */
public class GetAppListResult implements Parcelable {
    public static final Parcelable.Creator<GetAppListResult> CREATOR = new a();
    private AppDetail[] a;

    public static class a implements Parcelable.Creator<GetAppListResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetAppListResult createFromParcel(Parcel parcel) {
            return new GetAppListResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetAppListResult[] newArray(int i) {
            return new GetAppListResult[i];
        }
    }

    public GetAppListResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AppDetail[] getAppList() {
        return this.a;
    }

    public void setAppList(AppDetail[] appDetailArr) {
        this.a = appDetailArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.a, i);
    }

    public GetAppListResult(Parcel parcel) {
        this.a = (AppDetail[]) parcel.createTypedArray(AppDetail.CREATOR);
    }
}
