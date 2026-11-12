package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class Photo implements Parcelable {
    public static final Parcelable.Creator<Photo> CREATOR = new Parcelable.Creator<Photo>() { // from class: com.amap.api.services.poisearch.Photo.1
        private static Photo a(Parcel parcel) {
            return new Photo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Photo createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Photo[] newArray(int i) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6603b;

    public Photo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getTitle() {
        return this.f6602a;
    }

    public final String getUrl() {
        return this.f6603b;
    }

    public final void setTitle(String str) {
        this.f6602a = str;
    }

    public final void setUrl(String str) {
        this.f6603b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6602a);
        parcel.writeString(this.f6603b);
    }

    public Photo(String str, String str2) {
        this.f6602a = str;
        this.f6603b = str2;
    }

    public Photo(Parcel parcel) {
        this.f6602a = parcel.readString();
        this.f6603b = parcel.readString();
    }
}
