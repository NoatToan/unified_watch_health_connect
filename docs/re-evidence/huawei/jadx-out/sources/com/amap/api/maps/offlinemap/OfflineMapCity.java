package com.amap.api.maps.offlinemap;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class OfflineMapCity extends City {
    public static final Parcelable.Creator<OfflineMapCity> CREATOR = new Parcelable.Creator<OfflineMapCity>() { // from class: com.amap.api.maps.offlinemap.OfflineMapCity.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OfflineMapCity createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OfflineMapCity[] newArray(int i) {
            return a(i);
        }

        private static OfflineMapCity a(Parcel parcel) {
            return new OfflineMapCity(parcel);
        }

        private static OfflineMapCity[] a(int i) {
            return new OfflineMapCity[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f3453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3454c;
    private String d;
    private int e;

    @Override // com.amap.api.maps.offlinemap.City, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public OfflineMapCity() {
        this.f3452a = "";
        this.f3453b = 0L;
        this.f3454c = 6;
        this.d = "";
        this.e = 0;
    }

    public String getUrl() {
        return this.f3452a;
    }

    public void setUrl(String str) {
        this.f3452a = str;
    }

    public long getSize() {
        return this.f3453b;
    }

    public void setSize(long j) {
        this.f3453b = j;
    }

    public int getState() {
        return this.f3454c;
    }

    public void setState(int i) {
        this.f3454c = i;
    }

    public String getVersion() {
        return this.d;
    }

    public void setVersion(String str) {
        this.d = str;
    }

    public int getcompleteCode() {
        return this.e;
    }

    public void setCompleteCode(int i) {
        this.e = i;
    }

    @Override // com.amap.api.maps.offlinemap.City, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f3452a);
        parcel.writeLong(this.f3453b);
        parcel.writeInt(this.f3454c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
    }

    public OfflineMapCity(Parcel parcel) {
        super(parcel);
        this.f3452a = "";
        this.f3453b = 0L;
        this.f3454c = 6;
        this.d = "";
        this.e = 0;
        this.f3452a = parcel.readString();
        this.f3453b = parcel.readLong();
        this.f3454c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readInt();
    }
}
