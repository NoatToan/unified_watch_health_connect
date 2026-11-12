package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.AppID;

/* JADX INFO: loaded from: classes18.dex */
public class AppUnlockRequestParams extends RequestParams {
    public static final Parcelable.Creator<AppUnlockRequestParams> CREATOR = new a();
    private AppID b;

    public static class a implements Parcelable.Creator<AppUnlockRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppUnlockRequestParams createFromParcel(Parcel parcel) {
            return new AppUnlockRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppUnlockRequestParams[] newArray(int i) {
            return new AppUnlockRequestParams[i];
        }
    }

    public AppUnlockRequestParams() {
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

    public AppUnlockRequestParams(Parcel parcel) {
        this.b = (AppID) parcel.readParcelable(AppID.class.getClassLoader());
    }
}
