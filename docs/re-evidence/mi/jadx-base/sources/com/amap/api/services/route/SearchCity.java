package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class SearchCity implements Parcelable {
    public static final Parcelable.Creator<SearchCity> CREATOR = new Parcelable.Creator<SearchCity>() { // from class: com.amap.api.services.route.SearchCity.1
        private static SearchCity a(Parcel parcel) {
            return new SearchCity(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SearchCity createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SearchCity[] newArray(int i) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6757b;
    private String c;

    public SearchCity(Parcel parcel) {
        this.f6756a = parcel.readString();
        this.f6757b = parcel.readString();
        this.c = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getSearchCityAdCode() {
        return this.c;
    }

    public String getSearchCityName() {
        return this.f6756a;
    }

    public String getSearchCitycode() {
        return this.f6757b;
    }

    public void setSearchCityName(String str) {
        this.f6756a = str;
    }

    public void setSearchCitycode(String str) {
        this.f6757b = str;
    }

    public void setSearchCityhAdCode(String str) {
        this.c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6756a);
        parcel.writeString(this.f6757b);
        parcel.writeString(this.c);
    }

    public SearchCity() {
    }
}
