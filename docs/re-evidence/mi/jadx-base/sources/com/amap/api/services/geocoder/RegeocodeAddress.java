package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.road.Crossroad;
import com.amap.api.services.road.Road;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class RegeocodeAddress implements Parcelable {
    public static final Parcelable.Creator<RegeocodeAddress> CREATOR = new Parcelable.Creator<RegeocodeAddress>() { // from class: com.amap.api.services.geocoder.RegeocodeAddress.1
        private static RegeocodeAddress a(Parcel parcel) {
            return new RegeocodeAddress(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RegeocodeAddress createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RegeocodeAddress[] newArray(int i) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6568b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private StreetNumber h;
    private String i;
    private String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f6569k;
    private List<RegeocodeRoad> l;
    private List<Crossroad> m;
    private List<PoiItem> n;
    private List<BusinessArea> o;
    private List<AoiItem> p;
    private String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f6570r;

    public /* synthetic */ RegeocodeAddress(Parcel parcel, byte b2) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getAdCode() {
        return this.j;
    }

    public final List<AoiItem> getAois() {
        return this.p;
    }

    public final String getBuilding() {
        return this.g;
    }

    public final List<BusinessArea> getBusinessAreas() {
        return this.o;
    }

    public final String getCity() {
        return this.c;
    }

    public final String getCityCode() {
        return this.i;
    }

    public final String getCountry() {
        return this.q;
    }

    public final String getCountryCode() {
        return this.f6570r;
    }

    public final List<Crossroad> getCrossroads() {
        return this.m;
    }

    public final String getDistrict() {
        return this.d;
    }

    public final String getFormatAddress() {
        return this.f6567a;
    }

    public final String getNeighborhood() {
        return this.f;
    }

    public final List<PoiItem> getPois() {
        return this.n;
    }

    public final String getProvince() {
        return this.f6568b;
    }

    public final List<RegeocodeRoad> getRoads() {
        return this.l;
    }

    public final StreetNumber getStreetNumber() {
        return this.h;
    }

    public final String getTowncode() {
        return this.f6569k;
    }

    public final String getTownship() {
        return this.e;
    }

    public final void setAdCode(String str) {
        this.j = str;
    }

    public final void setAois(List<AoiItem> list) {
        this.p = list;
    }

    public final void setBuilding(String str) {
        this.g = str;
    }

    public final void setBusinessAreas(List<BusinessArea> list) {
        this.o = list;
    }

    public final void setCity(String str) {
        this.c = str;
    }

    public final void setCityCode(String str) {
        this.i = str;
    }

    public final void setCountry(String str) {
        this.q = str;
    }

    public final void setCountryCode(String str) {
        this.f6570r = str;
    }

    public final void setCrossroads(List<Crossroad> list) {
        this.m = list;
    }

    public final void setDistrict(String str) {
        this.d = str;
    }

    public final void setFormatAddress(String str) {
        this.f6567a = str;
    }

    public final void setNeighborhood(String str) {
        this.f = str;
    }

    public final void setPois(List<PoiItem> list) {
        this.n = list;
    }

    public final void setProvince(String str) {
        this.f6568b = str;
    }

    public final void setRoads(List<RegeocodeRoad> list) {
        this.l = list;
    }

    public final void setStreetNumber(StreetNumber streetNumber) {
        this.h = streetNumber;
    }

    public final void setTowncode(String str) {
        this.f6569k = str;
    }

    public final void setTownship(String str) {
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6567a);
        parcel.writeString(this.f6568b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeValue(this.h);
        parcel.writeList(this.l);
        parcel.writeList(this.m);
        parcel.writeList(this.n);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeList(this.o);
        parcel.writeList(this.p);
        parcel.writeString(this.f6569k);
        parcel.writeString(this.q);
        parcel.writeString(this.f6570r);
    }

    public RegeocodeAddress() {
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
    }

    private RegeocodeAddress(Parcel parcel) {
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.f6567a = parcel.readString();
        this.f6568b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = (StreetNumber) parcel.readValue(StreetNumber.class.getClassLoader());
        this.l = parcel.readArrayList(Road.class.getClassLoader());
        this.m = parcel.readArrayList(Crossroad.class.getClassLoader());
        this.n = parcel.readArrayList(PoiItem.class.getClassLoader());
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.o = parcel.readArrayList(BusinessArea.class.getClassLoader());
        this.p = parcel.readArrayList(AoiItem.class.getClassLoader());
        this.f6569k = parcel.readString();
        this.q = parcel.readString();
        this.f6570r = parcel.readString();
    }
}
