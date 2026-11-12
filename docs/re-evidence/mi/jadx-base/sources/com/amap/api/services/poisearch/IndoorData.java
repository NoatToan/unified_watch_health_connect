package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class IndoorData implements Parcelable {
    public static final Parcelable.Creator<IndoorData> CREATOR = new Parcelable.Creator<IndoorData>() { // from class: com.amap.api.services.poisearch.IndoorData.1
        private static IndoorData a(Parcel parcel) {
            return new IndoorData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IndoorData createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IndoorData[] newArray(int i) {
            return a(i);
        }

        private static IndoorData[] a(int i) {
            return new IndoorData[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6599b;
    private String c;

    public IndoorData(String str, int i, String str2) {
        this.f6598a = str;
        this.f6599b = i;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getFloor() {
        return this.f6599b;
    }

    public String getFloorName() {
        return this.c;
    }

    public String getPoiId() {
        return this.f6598a;
    }

    public void setFloor(int i) {
        this.f6599b = i;
    }

    public void setFloorName(String str) {
        this.c = str;
    }

    public void setPoiId(String str) {
        this.f6598a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6598a);
        parcel.writeInt(this.f6599b);
        parcel.writeString(this.c);
    }

    public IndoorData(Parcel parcel) {
        this.f6598a = parcel.readString();
        this.f6599b = parcel.readInt();
        this.c = parcel.readString();
    }
}
