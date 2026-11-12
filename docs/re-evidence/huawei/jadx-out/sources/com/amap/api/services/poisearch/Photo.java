package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class Photo implements Parcelable {
    public static final Parcelable.Creator<Photo> CREATOR = new Parcelable.Creator<Photo>() { // from class: com.amap.api.services.poisearch.Photo.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Photo[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Photo createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static Photo a(Parcel parcel) {
            return new Photo(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3624b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public Photo() {
    }

    public Photo(String str, String str2) {
        this.f3623a = str;
        this.f3624b = str2;
    }

    public final String getTitle() {
        return this.f3623a;
    }

    public final void setTitle(String str) {
        this.f3623a = str;
    }

    public final String getUrl() {
        return this.f3624b;
    }

    public final void setUrl(String str) {
        this.f3624b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3623a);
        parcel.writeString(this.f3624b);
    }

    public Photo(Parcel parcel) {
        this.f3623a = parcel.readString();
        this.f3624b = parcel.readString();
    }
}
