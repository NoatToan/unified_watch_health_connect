package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes21.dex */
public final class RegeocodeRoad implements Parcelable {
    public static final Parcelable.Creator<RegeocodeRoad> CREATOR = new Parcelable.Creator<RegeocodeRoad>() { // from class: com.amap.api.services.geocoder.RegeocodeRoad.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RegeocodeRoad[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RegeocodeRoad createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static RegeocodeRoad a(Parcel parcel) {
            return new RegeocodeRoad(parcel, (byte) 0);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f3588c;
    private String d;
    private LatLonPoint e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* synthetic */ RegeocodeRoad(Parcel parcel, byte b2) {
        this(parcel);
    }

    public RegeocodeRoad() {
    }

    public final String getId() {
        return this.f3586a;
    }

    public final void setId(String str) {
        this.f3586a = str;
    }

    public final String getName() {
        return this.f3587b;
    }

    public final void setName(String str) {
        this.f3587b = str;
    }

    public final float getDistance() {
        return this.f3588c;
    }

    public final void setDistance(float f) {
        this.f3588c = f;
    }

    public final String getDirection() {
        return this.d;
    }

    public final void setDirection(String str) {
        this.d = str;
    }

    public final LatLonPoint getLatLngPoint() {
        return this.e;
    }

    public final void setLatLngPoint(LatLonPoint latLonPoint) {
        this.e = latLonPoint;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3586a);
        parcel.writeString(this.f3587b);
        parcel.writeFloat(this.f3588c);
        parcel.writeString(this.d);
        parcel.writeValue(this.e);
    }

    private RegeocodeRoad(Parcel parcel) {
        this.f3586a = parcel.readString();
        this.f3587b = parcel.readString();
        this.f3588c = parcel.readFloat();
        this.d = parcel.readString();
        this.e = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
    }
}
