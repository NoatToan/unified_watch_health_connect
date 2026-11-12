package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.data.AppApplyDeleteRecord;

/* JADX INFO: loaded from: classes18.dex */
public class GetActivityApplyDeleteResult implements Parcelable {
    public static final Parcelable.Creator<GetActivityApplyDeleteResult> CREATOR = new a();
    private AppApplyDeleteRecord a;

    public static class a implements Parcelable.Creator<GetActivityApplyDeleteResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetActivityApplyDeleteResult createFromParcel(Parcel parcel) {
            return new GetActivityApplyDeleteResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetActivityApplyDeleteResult[] newArray(int i) {
            return new GetActivityApplyDeleteResult[i];
        }
    }

    public GetActivityApplyDeleteResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AppApplyDeleteRecord getApplyDeleteResult() {
        return this.a;
    }

    public void setApplyDeleteResult(AppApplyDeleteRecord appApplyDeleteRecord) {
        this.a = appApplyDeleteRecord;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }

    public GetActivityApplyDeleteResult(Parcel parcel) {
        this.a = (AppApplyDeleteRecord) parcel.readParcelable(AppApplyDeleteRecord.class.getClassLoader());
    }
}
