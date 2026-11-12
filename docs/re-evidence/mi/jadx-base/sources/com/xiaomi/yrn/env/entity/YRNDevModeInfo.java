package com.xiaomi.yrn.env.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.sk1;

/* JADX INFO: loaded from: classes2.dex */
public class YRNDevModeInfo implements Parcelable {
    public static final Parcelable.Creator<YRNDevModeInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14540b;
    public String c;
    public String d;

    public static class a implements Parcelable.Creator<YRNDevModeInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public YRNDevModeInfo createFromParcel(Parcel parcel) {
            return new YRNDevModeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public YRNDevModeInfo[] newArray(int i) {
            return new YRNDevModeInfo[i];
        }
    }

    public YRNDevModeInfo() {
    }

    public String a() {
        return this.f14539a;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f14540b;
    }

    public String toString() {
        return "\n{\nappName='" + this.f14539a + "', \nmodule='" + this.f14540b + "', \nbranch='" + this.c + "', \nip='" + this.d + "'\n}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14539a);
        parcel.writeString(this.f14540b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public YRNDevModeInfo(String str, String str2, String str3, String str4) {
        sk1.b(!TextUtils.isEmpty(str), "appName can not be Empty!");
        this.f14539a = str;
        this.f14540b = str2;
        this.c = str3;
        this.d = str4;
    }

    public YRNDevModeInfo(Parcel parcel) {
        this.f14539a = parcel.readString();
        this.f14540b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
    }
}
