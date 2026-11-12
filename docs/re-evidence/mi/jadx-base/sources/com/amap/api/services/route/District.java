package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class District implements Parcelable {
    public static final Parcelable.Creator<District> CREATOR = new Parcelable.Creator<District>() { // from class: com.amap.api.services.route.District.1
        private static District a(Parcel parcel) {
            return new District(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ District createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ District[] newArray(int i) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6659b;

    public District(Parcel parcel) {
        this.f6658a = parcel.readString();
        this.f6659b = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDistrictAdcode() {
        return this.f6659b;
    }

    public String getDistrictName() {
        return this.f6658a;
    }

    public void setDistrictAdcode(String str) {
        this.f6659b = str;
    }

    public void setDistrictName(String str) {
        this.f6658a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6658a);
        parcel.writeString(this.f6659b);
    }

    public District() {
    }
}
