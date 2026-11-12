package com.xiaomi.yrn.env.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.sk1;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class YRNDevConfigInfo implements Parcelable {
    public static final Parcelable.Creator<YRNDevConfigInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14538b;
    public String c;

    public static class a implements Parcelable.Creator<YRNDevConfigInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public YRNDevConfigInfo createFromParcel(Parcel parcel) {
            return new YRNDevConfigInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public YRNDevConfigInfo[] newArray(int i) {
            return new YRNDevConfigInfo[i];
        }
    }

    public YRNDevConfigInfo() {
        this.c = "production";
    }

    public String a() {
        return this.c;
    }

    public boolean c() {
        return this.f14538b;
    }

    public void d(String str) {
        this.c = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(boolean z) {
        this.f14538b = z;
    }

    public String toString() {
        return "{appName='" + this.f14537a + "', showRMButton=" + this.f14538b + ", envType='" + this.c + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14537a);
        parcel.writeInt(this.f14538b ? 1 : 0);
        parcel.writeString(this.c);
    }

    public YRNDevConfigInfo(String str) {
        this.c = "production";
        sk1.b(!TextUtils.isEmpty(str), "appName can not be Empty!");
        this.f14537a = str;
    }

    public YRNDevConfigInfo(Parcel parcel) {
        this.c = "production";
        this.f14537a = parcel.readString();
        this.f14538b = parcel.readByte() != 0;
        this.c = parcel.readString();
    }
}
