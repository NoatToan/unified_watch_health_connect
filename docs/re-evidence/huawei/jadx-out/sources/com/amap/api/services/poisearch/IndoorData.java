package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class IndoorData implements Parcelable {
    public static final Parcelable.Creator<IndoorData> CREATOR = new Parcelable.Creator<IndoorData>() { // from class: com.amap.api.services.poisearch.IndoorData.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IndoorData createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IndoorData[] newArray(int i) {
            return a(i);
        }

        private static IndoorData a(Parcel parcel) {
            return new IndoorData(parcel);
        }

        private static IndoorData[] a(int i) {
            return new IndoorData[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3619c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IndoorData(String str, int i, String str2) {
        this.f3617a = str;
        this.f3618b = i;
        this.f3619c = str2;
    }

    public String getPoiId() {
        return this.f3617a;
    }

    public void setPoiId(String str) {
        this.f3617a = str;
    }

    public int getFloor() {
        return this.f3618b;
    }

    public void setFloor(int i) {
        this.f3618b = i;
    }

    public String getFloorName() {
        return this.f3619c;
    }

    public void setFloorName(String str) {
        this.f3619c = str;
    }

    protected IndoorData(Parcel parcel) {
        this.f3617a = parcel.readString();
        this.f3618b = parcel.readInt();
        this.f3619c = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3617a);
        parcel.writeInt(this.f3618b);
        parcel.writeString(this.f3619c);
    }
}
