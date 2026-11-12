package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.AppID;

/* JADX INFO: loaded from: classes18.dex */
public class AppDownloadRequestParams extends RequestParams {
    public static final Parcelable.Creator<AppDownloadRequestParams> CREATOR = new a();
    private AppID b;
    private String c;

    public static class a implements Parcelable.Creator<AppDownloadRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppDownloadRequestParams createFromParcel(Parcel parcel) {
            return new AppDownloadRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppDownloadRequestParams[] newArray(int i) {
            return new AppDownloadRequestParams[i];
        }
    }

    public AppDownloadRequestParams() {
    }

    public AppID getAppID() {
        return this.b;
    }

    public String getAppName() {
        return this.c;
    }

    public void setAppID(AppID appID) {
        this.b = appID;
    }

    public void setAppName(String str) {
        this.c = str;
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
    }

    public AppDownloadRequestParams(Parcel parcel) {
        this.b = (AppID) parcel.readParcelable(AppID.class.getClassLoader());
        this.c = parcel.readString();
    }
}
