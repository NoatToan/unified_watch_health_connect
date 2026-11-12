package com.amap.api.maps.offlinemap;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class Province implements Parcelable {
    public static final Parcelable.Creator<Province> CREATOR = new Parcelable.Creator<Province>() { // from class: com.amap.api.maps.offlinemap.Province.1
        private static Province a(Parcel parcel) {
            return new Province(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Province createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Province[] newArray(int i) {
            return a(i);
        }

        private static Province[] a(int i) {
            return new Province[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6486b;
    private String c;
    private String d;

    public Province() {
        this.f6485a = "";
        this.d = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getJianpin() {
        return this.f6486b;
    }

    public String getPinyin() {
        return this.c;
    }

    public String getProvinceCode() {
        return this.d;
    }

    public String getProvinceName() {
        return this.f6485a;
    }

    public void setJianpin(String str) {
        this.f6486b = str;
    }

    public void setPinyin(String str) {
        this.c = str;
    }

    public void setProvinceCode(String str) {
        this.d = str;
    }

    public void setProvinceName(String str) {
        this.f6485a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6485a);
        parcel.writeString(this.f6486b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public Province(Parcel parcel) {
        this.f6485a = "";
        this.d = "";
        this.f6485a = parcel.readString();
        this.f6486b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
    }
}
