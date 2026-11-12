package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class Railway implements Parcelable {
    public static final Parcelable.Creator<Railway> CREATOR = new Parcelable.Creator<Railway>() { // from class: com.amap.api.services.route.Railway.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Railway createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Railway[] newArray(int i) {
            return a(i);
        }

        private static Railway a(Parcel parcel) {
            return new Railway(parcel);
        }

        private static Railway[] a(int i) {
            return new Railway[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3738b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Railway() {
    }

    public String getID() {
        return this.f3737a;
    }

    public String getName() {
        return this.f3738b;
    }

    public void setID(String str) {
        this.f3737a = str;
    }

    public void setName(String str) {
        this.f3738b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3737a);
        parcel.writeString(this.f3738b);
    }

    protected Railway(Parcel parcel) {
        this.f3737a = parcel.readString();
        this.f3738b = parcel.readString();
    }
}
