package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class District implements Parcelable {
    public static final Parcelable.Creator<District> CREATOR = new Parcelable.Creator<District>() { // from class: com.amap.api.services.route.District.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ District[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ District createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static District a(Parcel parcel) {
            return new District(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3698b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDistrictName() {
        return this.f3697a;
    }

    public void setDistrictName(String str) {
        this.f3697a = str;
    }

    public String getDistrictAdcode() {
        return this.f3698b;
    }

    public void setDistrictAdcode(String str) {
        this.f3698b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3697a);
        parcel.writeString(this.f3698b);
    }

    public District(Parcel parcel) {
        this.f3697a = parcel.readString();
        this.f3698b = parcel.readString();
    }

    public District() {
    }
}
