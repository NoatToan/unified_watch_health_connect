package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes4.dex */
public class BusinessArea implements Parcelable {
    public static final Parcelable.Creator<BusinessArea> CREATOR = new Parcelable.Creator<BusinessArea>() { // from class: com.amap.api.services.geocoder.BusinessArea.1
        private static BusinessArea a(Parcel parcel) {
            return new BusinessArea(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusinessArea createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusinessArea[] newArray(int i) {
            return a(i);
        }

        private static BusinessArea[] a(int i) {
            return new BusinessArea[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LatLonPoint f6557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6558b;

    public BusinessArea() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getCenterPoint() {
        return this.f6557a;
    }

    public String getName() {
        return this.f6558b;
    }

    public void setCenterPoint(LatLonPoint latLonPoint) {
        this.f6557a = latLonPoint;
    }

    public void setName(String str) {
        this.f6558b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f6557a, i);
        parcel.writeString(this.f6558b);
    }

    public BusinessArea(Parcel parcel) {
        this.f6557a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f6558b = parcel.readString();
    }
}
