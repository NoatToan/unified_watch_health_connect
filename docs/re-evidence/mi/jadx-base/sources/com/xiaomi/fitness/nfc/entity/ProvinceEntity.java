package com.xiaomi.fitness.nfc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ProvinceEntity implements Parcelable {
    public static final Parcelable.Creator<ProvinceEntity> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("province")
    private String f12513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("cityList")
    private List<CityEntity> f12514b;

    public static class CityEntity implements Parcelable {
        public static final Parcelable.Creator<CityEntity> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("code")
        private String f12515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("city")
        private String f12516b;

        public class a implements Parcelable.Creator<CityEntity> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CityEntity createFromParcel(Parcel parcel) {
                CityEntity cityEntity = new CityEntity();
                cityEntity.f12515a = parcel.readString();
                cityEntity.f12516b = parcel.readString();
                return cityEntity;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public CityEntity[] newArray(int i) {
                return new CityEntity[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f12515a);
            parcel.writeString(this.f12516b);
        }
    }

    public class a implements Parcelable.Creator<ProvinceEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ProvinceEntity createFromParcel(Parcel parcel) {
            ProvinceEntity provinceEntity = new ProvinceEntity();
            provinceEntity.c(parcel);
            return provinceEntity;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ProvinceEntity[] newArray(int i) {
            return new ProvinceEntity[i];
        }
    }

    public final void c(Parcel parcel) {
        this.f12513a = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f12514b = arrayList;
        parcel.readList(arrayList, getClass().getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12513a);
        parcel.writeList(this.f12514b);
    }
}
