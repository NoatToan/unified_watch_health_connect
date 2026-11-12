package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.AppID;

/* JADX INFO: loaded from: classes18.dex */
public class GetAppStatusRequestParams extends RequestParams {
    public static final Parcelable.Creator<GetAppStatusRequestParams> CREATOR = new a();
    private AppID b;

    public static class a implements Parcelable.Creator<GetAppStatusRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetAppStatusRequestParams createFromParcel(Parcel parcel) {
            return new GetAppStatusRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetAppStatusRequestParams[] newArray(int i) {
            return new GetAppStatusRequestParams[i];
        }
    }

    public GetAppStatusRequestParams() {
    }

    public AppID getAppID() {
        return this.b;
    }

    public void setAppID(AppID appID) {
        this.b = appID;
    }

    public GetAppStatusRequestParams(Parcel parcel) {
    }
}
