package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class PoiItemExtension implements Parcelable {
    public static final Parcelable.Creator<PoiItemExtension> CREATOR = new Parcelable.Creator<PoiItemExtension>() { // from class: com.amap.api.services.poisearch.PoiItemExtension.1
        private static PoiItemExtension a(Parcel parcel) {
            return new PoiItemExtension(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PoiItemExtension createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PoiItemExtension[] newArray(int i) {
            return a(i);
        }

        private static PoiItemExtension[] a(int i) {
            return new PoiItemExtension[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6605b;

    public PoiItemExtension(String str, String str2) {
        this.f6604a = str;
        this.f6605b = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getOpentime() {
        return this.f6604a;
    }

    public String getmRating() {
        return this.f6605b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6604a);
        parcel.writeString(this.f6605b);
    }

    public PoiItemExtension(Parcel parcel) {
        this.f6604a = parcel.readString();
        this.f6605b = parcel.readString();
    }
}
