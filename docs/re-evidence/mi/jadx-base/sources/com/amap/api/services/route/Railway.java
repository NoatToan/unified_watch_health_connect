package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class Railway implements Parcelable {
    public static final Parcelable.Creator<Railway> CREATOR = new Parcelable.Creator<Railway>() { // from class: com.amap.api.services.route.Railway.1
        private static Railway a(Parcel parcel) {
            return new Railway(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Railway createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Railway[] newArray(int i) {
            return a(i);
        }

        private static Railway[] a(int i) {
            return new Railway[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6689b;

    public Railway() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getID() {
        return this.f6688a;
    }

    public String getName() {
        return this.f6689b;
    }

    public void setID(String str) {
        this.f6688a = str;
    }

    public void setName(String str) {
        this.f6689b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6688a);
        parcel.writeString(this.f6689b);
    }

    public Railway(Parcel parcel) {
        this.f6688a = parcel.readString();
        this.f6689b = parcel.readString();
    }
}
