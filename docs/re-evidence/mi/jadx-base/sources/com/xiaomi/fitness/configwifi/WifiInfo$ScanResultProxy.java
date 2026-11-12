package com.xiaomi.fitness.configwifi;

import android.net.wifi.ScanResult;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.lni;
import defpackage.xhr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public class WifiInfo$ScanResultProxy implements Parcelable {
    public static final Parcelable.Creator<WifiInfo$ScanResultProxy> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ScanResult f11825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WifiInfo$SsidInfo f11826b;
    public boolean c;
    public boolean d;

    public class a implements Parcelable.Creator<WifiInfo$ScanResultProxy> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WifiInfo$ScanResultProxy createFromParcel(Parcel parcel) {
            return new WifiInfo$ScanResultProxy(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WifiInfo$ScanResultProxy[] newArray(int i) {
            return new WifiInfo$ScanResultProxy[i];
        }
    }

    public WifiInfo$ScanResultProxy() {
    }

    public int a() {
        ScanResult scanResult = this.f11825a;
        if (scanResult != null) {
            return scanResult.level;
        }
        WifiInfo$SsidInfo wifiInfo$SsidInfo = this.f11826b;
        if (wifiInfo$SsidInfo != null) {
            return wifiInfo$SsidInfo.a();
        }
        return 0;
    }

    public int c() {
        int iA = a();
        if (iA < -70) {
            return lni.F;
        }
        return iA < -60 ? lni.E : lni.D;
    }

    public String d() {
        ScanResult scanResult = this.f11825a;
        if (scanResult != null) {
            return scanResult.SSID;
        }
        WifiInfo$SsidInfo wifiInfo$SsidInfo = this.f11826b;
        return wifiInfo$SsidInfo != null ? wifiInfo$SsidInfo.c() : "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        ScanResult scanResult = this.f11825a;
        if (scanResult != null) {
            return xhr.d(scanResult.capabilities);
        }
        WifiInfo$SsidInfo wifiInfo$SsidInfo = this.f11826b;
        if (wifiInfo$SsidInfo != null) {
            return wifiInfo$SsidInfo.d();
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (toString().equals(obj.toString())) {
            return true;
        }
        return super.equals(obj);
    }

    public boolean f() {
        ScanResult scanResult = this.f11825a;
        if (scanResult != null) {
            return WifiInfo$SsidInfo.f(scanResult.frequency);
        }
        WifiInfo$SsidInfo wifiInfo$SsidInfo = this.f11826b;
        if (wifiInfo$SsidInfo != null) {
            return wifiInfo$SsidInfo.e();
        }
        return false;
    }

    public boolean g() {
        ScanResult scanResult = this.f11825a;
        if (scanResult != null) {
            return xhr.f(scanResult.capabilities);
        }
        WifiInfo$SsidInfo wifiInfo$SsidInfo = this.f11826b;
        if (wifiInfo$SsidInfo != null) {
            return wifiInfo$SsidInfo.g();
        }
        return false;
    }

    public boolean h() {
        return this.f11825a == null && this.f11826b == null;
    }

    @NotNull
    public String toString() {
        ScanResult scanResult = this.f11825a;
        if (scanResult != null) {
            return scanResult.SSID;
        }
        WifiInfo$SsidInfo wifiInfo$SsidInfo = this.f11826b;
        return wifiInfo$SsidInfo != null ? wifiInfo$SsidInfo.c() : "";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f11825a, i);
        parcel.writeParcelable(this.f11826b, i);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
    }

    public WifiInfo$ScanResultProxy(ScanResult scanResult) {
        this.f11825a = scanResult;
    }

    public WifiInfo$ScanResultProxy(Parcel parcel) {
        this.f11825a = (ScanResult) parcel.readParcelable(ScanResult.class.getClassLoader());
        this.f11826b = (WifiInfo$SsidInfo) parcel.readParcelable(WifiInfo$SsidInfo.class.getClassLoader());
        this.c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
    }
}
