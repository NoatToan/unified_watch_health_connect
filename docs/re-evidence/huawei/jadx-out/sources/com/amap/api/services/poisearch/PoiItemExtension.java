package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class PoiItemExtension implements Parcelable {
    public static final Parcelable.Creator<PoiItemExtension> CREATOR = new Parcelable.Creator<PoiItemExtension>() { // from class: com.amap.api.services.poisearch.PoiItemExtension.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PoiItemExtension createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PoiItemExtension[] newArray(int i) {
            return a(i);
        }

        private static PoiItemExtension a(Parcel parcel) {
            return new PoiItemExtension(parcel);
        }

        private static PoiItemExtension[] a(int i) {
            return new PoiItemExtension[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3626b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PoiItemExtension(String str, String str2) {
        this.f3625a = str;
        this.f3626b = str2;
    }

    public String getOpentime() {
        return this.f3625a;
    }

    public String getmRating() {
        return this.f3626b;
    }

    protected PoiItemExtension(Parcel parcel) {
        this.f3625a = parcel.readString();
        this.f3626b = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3625a);
        parcel.writeString(this.f3626b);
    }
}
