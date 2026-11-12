package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.data.UniteAppDetail;

/* JADX INFO: loaded from: classes18.dex */
public class GetUniteAppListResult implements Parcelable {
    public static final Parcelable.Creator<GetUniteAppListResult> CREATOR = new a();
    private UniteAppDetail[] a;

    public static class a implements Parcelable.Creator<GetUniteAppListResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetUniteAppListResult createFromParcel(Parcel parcel) {
            return new GetUniteAppListResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetUniteAppListResult[] newArray(int i) {
            return new GetUniteAppListResult[i];
        }
    }

    public GetUniteAppListResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public UniteAppDetail[] getAppList() {
        return this.a;
    }

    public void setAppList(UniteAppDetail[] uniteAppDetailArr) {
        this.a = uniteAppDetailArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.a, i);
    }

    public GetUniteAppListResult(Parcel parcel) {
        this.a = (UniteAppDetail[]) parcel.createTypedArray(UniteAppDetail.CREATOR);
    }
}
