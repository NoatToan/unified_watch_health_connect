package com.ingenic.iwds.remotedevice;

import android.content.pm.PackageStats;
import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.sdk.m.u.i;

/* JADX INFO: loaded from: classes18.dex */
class RemotePackageStats implements Parcelable {
    public static final Parcelable.Creator<RemotePackageStats> CREATOR = new a();
    public String a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    private PackageStats j;

    public static class a implements Parcelable.Creator<RemotePackageStats> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RemotePackageStats createFromParcel(Parcel parcel) {
            return new RemotePackageStats(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RemotePackageStats[] newArray(int i) {
            return new RemotePackageStats[i];
        }
    }

    public RemotePackageStats(String str) {
        this.a = str;
    }

    public PackageStats a() {
        return this.j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PackageStats{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" ");
        sb.append(this.a);
        if (this.b != 0) {
            sb.append(" code=");
            sb.append(this.b);
        }
        if (this.c != 0) {
            sb.append(" data=");
            sb.append(this.c);
        }
        if (this.d != 0) {
            sb.append(" cache=");
            sb.append(this.d);
        }
        if (this.e != 0) {
            sb.append(" extCode=");
            sb.append(this.e);
        }
        if (this.f != 0) {
            sb.append(" extData=");
            sb.append(this.f);
        }
        if (this.g != 0) {
            sb.append(" extCache=");
            sb.append(this.g);
        }
        if (this.h != 0) {
            sb.append(" media=");
            sb.append(this.h);
        }
        if (this.i != 0) {
            sb.append(" obb=");
            sb.append(this.i);
        }
        sb.append(i.d);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeLong(this.h);
        parcel.writeLong(this.i);
    }

    public RemotePackageStats(Parcel parcel) {
        this.a = parcel.readString();
        PackageStats packageStats = new PackageStats(this.a);
        this.j = packageStats;
        long j = parcel.readLong();
        this.b = j;
        packageStats.codeSize = j;
        PackageStats packageStats2 = this.j;
        long j2 = parcel.readLong();
        this.c = j2;
        packageStats2.dataSize = j2;
        PackageStats packageStats3 = this.j;
        long j3 = parcel.readLong();
        this.d = j3;
        packageStats3.cacheSize = j3;
        PackageStats packageStats4 = this.j;
        long j4 = parcel.readLong();
        this.e = j4;
        packageStats4.externalCodeSize = j4;
        PackageStats packageStats5 = this.j;
        long j5 = parcel.readLong();
        this.f = j5;
        packageStats5.externalDataSize = j5;
        PackageStats packageStats6 = this.j;
        long j6 = parcel.readLong();
        this.g = j6;
        packageStats6.externalCacheSize = j6;
        PackageStats packageStats7 = this.j;
        long j7 = parcel.readLong();
        this.h = j7;
        packageStats7.externalMediaSize = j7;
        PackageStats packageStats8 = this.j;
        long j8 = parcel.readLong();
        this.i = j8;
        packageStats8.externalObbSize = j8;
    }

    public RemotePackageStats(PackageStats packageStats) {
        this.a = packageStats.packageName;
        this.b = packageStats.codeSize;
        this.c = packageStats.dataSize;
        this.d = packageStats.cacheSize;
        this.e = packageStats.externalCodeSize;
        this.f = packageStats.externalDataSize;
        this.g = packageStats.externalCacheSize;
        this.h = packageStats.externalMediaSize;
        this.i = packageStats.externalObbSize;
    }
}
