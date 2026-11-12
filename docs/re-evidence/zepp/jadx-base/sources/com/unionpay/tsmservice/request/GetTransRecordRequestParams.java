package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.AppID;

/* JADX INFO: loaded from: classes18.dex */
public class GetTransRecordRequestParams extends RequestParams {
    public static final Parcelable.Creator<GetTransRecordRequestParams> CREATOR = new a();
    private AppID b;

    public static class a implements Parcelable.Creator<GetTransRecordRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetTransRecordRequestParams createFromParcel(Parcel parcel) {
            return new GetTransRecordRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetTransRecordRequestParams[] newArray(int i) {
            return new GetTransRecordRequestParams[i];
        }
    }

    public GetTransRecordRequestParams() {
    }

    public AppID getAppID() {
        return this.b;
    }

    public void setAppID(AppID appID) {
        this.b = appID;
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b, i);
    }

    public GetTransRecordRequestParams(Parcel parcel) {
        this.b = (AppID) parcel.readParcelable(AppID.class.getClassLoader());
    }
}
