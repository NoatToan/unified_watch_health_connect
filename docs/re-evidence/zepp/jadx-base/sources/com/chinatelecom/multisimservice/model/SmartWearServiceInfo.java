package com.chinatelecom.multisimservice.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class SmartWearServiceInfo implements Parcelable {
    public static final Parcelable.Creator<SmartWearServiceInfo> CREATOR = new a();
    private String a;
    private String b;

    public class a implements Parcelable.Creator<SmartWearServiceInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SmartWearServiceInfo createFromParcel(Parcel parcel) {
            return new SmartWearServiceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SmartWearServiceInfo[] newArray(int i) {
            return new SmartWearServiceInfo[i];
        }
    }

    public SmartWearServiceInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getPackageName() {
        return this.a;
    }

    public String getVersionName() {
        return this.b;
    }

    public void setPackageName(String str) {
        this.a = str;
    }

    public void setVersionName(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public SmartWearServiceInfo(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }
}
