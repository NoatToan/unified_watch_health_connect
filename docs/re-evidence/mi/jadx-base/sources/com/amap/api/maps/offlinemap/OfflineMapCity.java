package com.amap.api.maps.offlinemap;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class OfflineMapCity extends City {
    public static final Parcelable.Creator<OfflineMapCity> CREATOR = new Parcelable.Creator<OfflineMapCity>() { // from class: com.amap.api.maps.offlinemap.OfflineMapCity.1
        private static OfflineMapCity a(Parcel parcel) {
            return new OfflineMapCity(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OfflineMapCity createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OfflineMapCity[] newArray(int i) {
            return a(i);
        }

        private static OfflineMapCity[] a(int i) {
            return new OfflineMapCity[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f6468b;
    private int c;
    private String d;
    private int e;

    public OfflineMapCity() {
        this.f6467a = "";
        this.f6468b = 0L;
        this.c = 6;
        this.d = "";
        this.e = 0;
    }

    @Override // com.amap.api.maps.offlinemap.City, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getSize() {
        return this.f6468b;
    }

    public int getState() {
        return this.c;
    }

    public String getUrl() {
        return this.f6467a;
    }

    public String getVersion() {
        return this.d;
    }

    public int getcompleteCode() {
        return this.e;
    }

    public void setCompleteCode(int i) {
        this.e = i;
    }

    public void setSize(long j) {
        this.f6468b = j;
    }

    public void setState(int i) {
        this.c = i;
    }

    public void setUrl(String str) {
        this.f6467a = str;
    }

    public void setVersion(String str) {
        this.d = str;
    }

    @Override // com.amap.api.maps.offlinemap.City, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f6467a);
        parcel.writeLong(this.f6468b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
    }

    public OfflineMapCity(Parcel parcel) {
        super(parcel);
        this.f6467a = "";
        this.f6468b = 0L;
        this.c = 6;
        this.d = "";
        this.e = 0;
        this.f6467a = parcel.readString();
        this.f6468b = parcel.readLong();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readInt();
    }
}
