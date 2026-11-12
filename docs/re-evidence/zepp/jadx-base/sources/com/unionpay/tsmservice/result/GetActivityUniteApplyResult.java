package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.data.AppUniteApplyRecord;

/* JADX INFO: loaded from: classes18.dex */
public class GetActivityUniteApplyResult implements Parcelable {
    public static final Parcelable.Creator<GetActivityUniteApplyResult> CREATOR = new a();
    private AppUniteApplyRecord a;

    public static class a implements Parcelable.Creator<GetActivityUniteApplyResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetActivityUniteApplyResult createFromParcel(Parcel parcel) {
            return new GetActivityUniteApplyResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetActivityUniteApplyResult[] newArray(int i) {
            return new GetActivityUniteApplyResult[i];
        }
    }

    public GetActivityUniteApplyResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AppUniteApplyRecord getApplyResult() {
        return this.a;
    }

    public void setApplyDeleteResult(AppUniteApplyRecord appUniteApplyRecord) {
        this.a = appUniteApplyRecord;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }

    public GetActivityUniteApplyResult(Parcel parcel) {
        this.a = (AppUniteApplyRecord) parcel.readParcelable(AppUniteApplyRecord.class.getClassLoader());
    }
}
