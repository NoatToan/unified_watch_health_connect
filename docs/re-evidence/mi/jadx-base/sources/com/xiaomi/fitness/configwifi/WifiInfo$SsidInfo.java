package com.xiaomi.fitness.configwifi;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.xhr;

/* JADX INFO: loaded from: classes6.dex */
public class WifiInfo$SsidInfo implements Parcelable {
    public static final Parcelable.Creator<WifiInfo$SsidInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11828b;
    public int c;
    public int d;

    public class a implements Parcelable.Creator<WifiInfo$SsidInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WifiInfo$SsidInfo createFromParcel(Parcel parcel) {
            return new WifiInfo$SsidInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WifiInfo$SsidInfo[] newArray(int i) {
            return new WifiInfo$SsidInfo[i];
        }
    }

    public WifiInfo$SsidInfo(Parcel parcel) {
        this.f11827a = parcel.readString();
        this.f11828b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }

    public static boolean f(int i) {
        return i > 4900 && i < 5900;
    }

    public int a() {
        return this.d;
    }

    public String c() {
        return this.f11827a;
    }

    public boolean d() {
        return xhr.d(this.f11828b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return f(this.c);
    }

    public boolean g() {
        return xhr.f(this.f11828b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11827a);
        parcel.writeString(this.f11828b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
