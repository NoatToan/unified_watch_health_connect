package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class IndoorDataV2 implements Parcelable {
    public static final Parcelable.Creator<IndoorDataV2> CREATOR = new Parcelable.Creator<IndoorDataV2>() { // from class: com.amap.api.services.poisearch.IndoorDataV2.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IndoorDataV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IndoorDataV2[] newArray(int i) {
            return a(i);
        }

        private static IndoorDataV2 a(Parcel parcel) {
            return new IndoorDataV2(parcel);
        }

        private static IndoorDataV2[] a(int i) {
            return new IndoorDataV2[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f3620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3622c;
    private String d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IndoorDataV2(boolean z, String str, int i, String str2) {
        this.f3620a = z;
        this.f3621b = str;
        this.f3622c = i;
        this.d = str2;
    }

    public void setIndoorMap(boolean z) {
        this.f3620a = z;
    }

    public boolean isIndoorMap() {
        return this.f3620a;
    }

    public String getPoiId() {
        return this.f3621b;
    }

    public void setPoiId(String str) {
        this.f3621b = str;
    }

    public int getFloor() {
        return this.f3622c;
    }

    public void setFloor(int i) {
        this.f3622c = i;
    }

    public String getFloorName() {
        return this.d;
    }

    public void setFloorName(String str) {
        this.d = str;
    }

    protected IndoorDataV2(Parcel parcel) {
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.f3620a = zArr[0];
        this.f3621b = parcel.readString();
        this.f3622c = parcel.readInt();
        this.d = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBooleanArray(new boolean[]{this.f3620a});
        parcel.writeString(this.f3621b);
        parcel.writeInt(this.f3622c);
        parcel.writeString(this.d);
    }
}
