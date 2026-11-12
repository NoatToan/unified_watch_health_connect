package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.AppID;

/* JADX INFO: loaded from: classes18.dex */
public class OpenCardApplyActivityRequestParams extends RequestParams {
    public static final Parcelable.Creator<OpenCardApplyActivityRequestParams> CREATOR = new a();
    private AppID b;
    private String c;

    public static class a implements Parcelable.Creator<OpenCardApplyActivityRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OpenCardApplyActivityRequestParams createFromParcel(Parcel parcel) {
            return new OpenCardApplyActivityRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OpenCardApplyActivityRequestParams[] newArray(int i) {
            return new OpenCardApplyActivityRequestParams[i];
        }
    }

    public OpenCardApplyActivityRequestParams() {
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

    public OpenCardApplyActivityRequestParams(Parcel parcel) {
        this.b = (AppID) parcel.readParcelable(AppID.class.getClassLoader());
        this.c = parcel.readString();
    }
}
