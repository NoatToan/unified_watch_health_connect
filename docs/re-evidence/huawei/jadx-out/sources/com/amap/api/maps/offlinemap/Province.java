package com.amap.api.maps.offlinemap;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class Province implements Parcelable {
    public static final Parcelable.Creator<Province> CREATOR = new Parcelable.Creator<Province>() { // from class: com.amap.api.maps.offlinemap.Province.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Province createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Province[] newArray(int i) {
            return a(i);
        }

        private static Province a(Parcel parcel) {
            return new Province(parcel);
        }

        private static Province[] a(int i) {
            return new Province[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3475c;
    private String d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Province() {
        this.f3473a = "";
        this.d = "";
    }

    public String getProvinceName() {
        return this.f3473a;
    }

    public String getJianpin() {
        return this.f3474b;
    }

    public String getPinyin() {
        return this.f3475c;
    }

    public void setProvinceName(String str) {
        this.f3473a = str;
    }

    public void setJianpin(String str) {
        this.f3474b = str;
    }

    public void setPinyin(String str) {
        this.f3475c = str;
    }

    public void setProvinceCode(String str) {
        this.d = str;
    }

    public String getProvinceCode() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3473a);
        parcel.writeString(this.f3474b);
        parcel.writeString(this.f3475c);
        parcel.writeString(this.d);
    }

    public Province(Parcel parcel) {
        this.f3473a = "";
        this.d = "";
        this.f3473a = parcel.readString();
        this.f3474b = parcel.readString();
        this.f3475c = parcel.readString();
        this.d = parcel.readString();
    }
}
