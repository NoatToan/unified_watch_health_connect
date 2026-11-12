package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes4.dex */
public final class RegeocodeRoad implements Parcelable {
    public static final Parcelable.Creator<RegeocodeRoad> CREATOR = new Parcelable.Creator<RegeocodeRoad>() { // from class: com.amap.api.services.geocoder.RegeocodeRoad.1
        private static RegeocodeRoad a(Parcel parcel) {
            return new RegeocodeRoad(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RegeocodeRoad createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RegeocodeRoad[] newArray(int i) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6576b;
    private float c;
    private String d;
    private LatLonPoint e;

    public /* synthetic */ RegeocodeRoad(Parcel parcel, byte b2) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getDirection() {
        return this.d;
    }

    public final float getDistance() {
        return this.c;
    }

    public final String getId() {
        return this.f6575a;
    }

    public final LatLonPoint getLatLngPoint() {
        return this.e;
    }

    public final String getName() {
        return this.f6576b;
    }

    public final void setDirection(String str) {
        this.d = str;
    }

    public final void setDistance(float f) {
        this.c = f;
    }

    public final void setId(String str) {
        this.f6575a = str;
    }

    public final void setLatLngPoint(LatLonPoint latLonPoint) {
        this.e = latLonPoint;
    }

    public final void setName(String str) {
        this.f6576b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6575a);
        parcel.writeString(this.f6576b);
        parcel.writeFloat(this.c);
        parcel.writeString(this.d);
        parcel.writeValue(this.e);
    }

    public RegeocodeRoad() {
    }

    private RegeocodeRoad(Parcel parcel) {
        this.f6575a = parcel.readString();
        this.f6576b = parcel.readString();
        this.c = parcel.readFloat();
        this.d = parcel.readString();
        this.e = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
    }
}
