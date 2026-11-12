package com.amap.api.services.road;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class Crossroad extends Road implements Parcelable {
    public static final Parcelable.Creator<Crossroad> CREATOR = new Parcelable.Creator<Crossroad>() { // from class: com.amap.api.services.road.Crossroad.1
        private static Crossroad a(Parcel parcel) {
            return new Crossroad(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Crossroad createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Crossroad[] newArray(int i) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f6630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6631b;
    private String c;
    private String d;
    private String e;
    private String f;

    public /* synthetic */ Crossroad(Parcel parcel, byte b2) {
        this(parcel);
    }

    @Override // com.amap.api.services.road.Road, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getDirection() {
        return this.f6631b;
    }

    public final float getDistance() {
        return this.f6630a;
    }

    public final String getFirstRoadId() {
        return this.c;
    }

    public final String getFirstRoadName() {
        return this.d;
    }

    public final String getSecondRoadId() {
        return this.e;
    }

    public final String getSecondRoadName() {
        return this.f;
    }

    public final void setDirection(String str) {
        this.f6631b = str;
    }

    public final void setDistance(float f) {
        this.f6630a = f;
    }

    public final void setFirstRoadId(String str) {
        this.c = str;
    }

    public final void setFirstRoadName(String str) {
        this.d = str;
    }

    public final void setSecondRoadId(String str) {
        this.e = str;
    }

    public final void setSecondRoadName(String str) {
        this.f = str;
    }

    @Override // com.amap.api.services.road.Road, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f6630a);
        parcel.writeString(this.f6631b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }

    public Crossroad() {
    }

    private Crossroad(Parcel parcel) {
        super(parcel);
        this.f6630a = parcel.readFloat();
        this.f6631b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
    }
}
