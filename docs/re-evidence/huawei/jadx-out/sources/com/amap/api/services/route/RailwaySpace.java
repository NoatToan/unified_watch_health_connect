package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class RailwaySpace implements Parcelable {
    public static final Parcelable.Creator<RailwaySpace> CREATOR = new Parcelable.Creator<RailwaySpace>() { // from class: com.amap.api.services.route.RailwaySpace.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RailwaySpace createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RailwaySpace[] newArray(int i) {
            return a(i);
        }

        private static RailwaySpace a(Parcel parcel) {
            return new RailwaySpace(parcel);
        }

        private static RailwaySpace[] a(int i) {
            return new RailwaySpace[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f3740b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RailwaySpace(String str, float f) {
        this.f3739a = str;
        this.f3740b = f;
    }

    public String getCode() {
        return this.f3739a;
    }

    public float getCost() {
        return this.f3740b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3739a);
        parcel.writeFloat(this.f3740b);
    }

    protected RailwaySpace(Parcel parcel) {
        this.f3739a = parcel.readString();
        this.f3740b = parcel.readFloat();
    }
}
