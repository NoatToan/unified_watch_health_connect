package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class SearchCity implements Parcelable {
    public static final Parcelable.Creator<SearchCity> CREATOR = new Parcelable.Creator<SearchCity>() { // from class: com.amap.api.services.route.SearchCity.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SearchCity[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SearchCity createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static SearchCity a(Parcel parcel) {
            return new SearchCity(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3825c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getSearchCityName() {
        return this.f3823a;
    }

    public void setSearchCityName(String str) {
        this.f3823a = str;
    }

    public String getSearchCitycode() {
        return this.f3824b;
    }

    public void setSearchCitycode(String str) {
        this.f3824b = str;
    }

    public String getSearchCityAdCode() {
        return this.f3825c;
    }

    public void setSearchCityhAdCode(String str) {
        this.f3825c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3823a);
        parcel.writeString(this.f3824b);
        parcel.writeString(this.f3825c);
    }

    public SearchCity(Parcel parcel) {
        this.f3823a = parcel.readString();
        this.f3824b = parcel.readString();
        this.f3825c = parcel.readString();
    }

    public SearchCity() {
    }
}
