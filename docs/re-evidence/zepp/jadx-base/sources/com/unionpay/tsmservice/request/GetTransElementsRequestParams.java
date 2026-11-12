package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.AppID;

/* JADX INFO: loaded from: classes18.dex */
public class GetTransElementsRequestParams extends RequestParams {
    public static final Parcelable.Creator<GetTransElementsRequestParams> CREATOR = new a();
    public static final String TRANS_TYPE_DELETE = "0112";
    public static final String TRANS_TYPE_DOWNLOAD_APPLY = "0101";
    private AppID b;
    private String c;

    public static class a implements Parcelable.Creator<GetTransElementsRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetTransElementsRequestParams createFromParcel(Parcel parcel) {
            return new GetTransElementsRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetTransElementsRequestParams[] newArray(int i) {
            return new GetTransElementsRequestParams[i];
        }
    }

    public GetTransElementsRequestParams() {
    }

    public AppID getAppID() {
        return this.b;
    }

    public String getTransType() {
        return this.c;
    }

    public void setAppID(AppID appID) {
        this.b = appID;
    }

    public void setTransType(String str) {
        this.c = str;
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
    }

    public GetTransElementsRequestParams(Parcel parcel) {
        this.b = (AppID) parcel.readParcelable(AppID.class.getClassLoader());
        this.c = parcel.readString();
    }
}
