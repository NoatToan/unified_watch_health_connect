package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.AppID;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class AppDeleteRequestParams extends RequestParams {
    public static final Parcelable.Creator<AppDeleteRequestParams> CREATOR = new a();
    private AppID b;
    private HashMap<String, String> c;

    public static class a implements Parcelable.Creator<AppDeleteRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppDeleteRequestParams createFromParcel(Parcel parcel) {
            return new AppDeleteRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppDeleteRequestParams[] newArray(int i) {
            return new AppDeleteRequestParams[i];
        }
    }

    public AppDeleteRequestParams() {
    }

    public AppID getAppID() {
        return this.b;
    }

    public Map<String, String> getParams() {
        return this.c;
    }

    public void setAppID(AppID appID) {
        this.b = appID;
    }

    public void setParams(HashMap<String, String> map) {
        this.c = map;
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeMap(this.c);
    }

    public AppDeleteRequestParams(Parcel parcel) {
        this.b = (AppID) parcel.readParcelable(AppID.class.getClassLoader());
        this.c = parcel.readHashMap(HashMap.class.getClassLoader());
    }
}
