package com.unionpay.tsmservice.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.AppID;

/* JADX INFO: loaded from: classes18.dex */
public class AppApplyDeleteRecord implements Parcelable {
    public static final Parcelable.Creator<AppApplyDeleteRecord> CREATOR = new a();
    private AppID a;
    private String b;

    public static class a implements Parcelable.Creator<AppApplyDeleteRecord> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppApplyDeleteRecord createFromParcel(Parcel parcel) {
            return new AppApplyDeleteRecord(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppApplyDeleteRecord[] newArray(int i) {
            return new AppApplyDeleteRecord[i];
        }
    }

    public AppApplyDeleteRecord() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AppID getAppID() {
        return this.a;
    }

    public String getResult() {
        return this.b;
    }

    public void setAppID(AppID appID) {
        this.a = appID;
    }

    public void setResult(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
    }

    public AppApplyDeleteRecord(Parcel parcel) {
        this.a = (AppID) parcel.readParcelable(AppID.class.getClassLoader());
        this.b = parcel.readString();
    }
}
