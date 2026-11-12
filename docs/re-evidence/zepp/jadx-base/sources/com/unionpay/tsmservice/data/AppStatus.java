package com.unionpay.tsmservice.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class AppStatus implements Parcelable {
    public static final String APPLY = "06";
    public static final String APPROVED = "00";
    public static final String APPROVING = "02";
    public static final Parcelable.Creator<AppStatus> CREATOR = new a();
    public static final String NOT_APPROVED = "01";
    public static final String OPEN = "05";
    public static final String VIEW = "07";
    private String a;

    public static class a implements Parcelable.Creator<AppStatus> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppStatus createFromParcel(Parcel parcel) {
            return new AppStatus(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppStatus[] newArray(int i) {
            return new AppStatus[i];
        }
    }

    public AppStatus() {
        this.a = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getStatus() {
        return this.a;
    }

    public void setStatus(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    public AppStatus(String str) {
        this.a = "";
        this.a = str;
    }

    public AppStatus(Parcel parcel) {
        this.a = "";
        this.a = parcel.readString();
    }
}
