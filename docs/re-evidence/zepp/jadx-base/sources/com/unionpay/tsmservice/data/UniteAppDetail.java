package com.unionpay.tsmservice.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class UniteAppDetail implements Parcelable {
    public static final Parcelable.Creator<UniteAppDetail> CREATOR = new a();
    private String a;
    private String b;
    private String c;
    private String d;
    private UniteAppStatus e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;

    public static class a implements Parcelable.Creator<UniteAppDetail> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UniteAppDetail createFromParcel(Parcel parcel) {
            return new UniteAppDetail(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UniteAppDetail[] newArray(int i) {
            return new UniteAppDetail[i];
        }
    }

    public UniteAppDetail() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.m = "";
        this.n = "";
        this.o = "";
        this.p = "";
        this.q = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getApkDownloadUrl() {
        return this.p;
    }

    public String getApkIcon() {
        return this.m;
    }

    public String getApkName() {
        return this.n;
    }

    public String getApkPackageName() {
        return this.o;
    }

    public String getApkSign() {
        return this.q;
    }

    public String getAppID() {
        return this.a;
    }

    public String getAppIcon() {
        return this.c;
    }

    public String getAppName() {
        return this.b;
    }

    public String getAppProviderName() {
        return this.d;
    }

    public String getCallCenterNumber() {
        return this.j;
    }

    public String getCardType() {
        return this.i;
    }

    public String getEmail() {
        return this.k;
    }

    public String getMPan() {
        return this.g;
    }

    public String getMPanId() {
        return this.f;
    }

    public String getSPan() {
        return this.h;
    }

    public UniteAppStatus getStatus() {
        return this.e;
    }

    public String getWebsite() {
        return this.l;
    }

    public void setApkDownloadUrl(String str) {
        this.p = str;
    }

    public void setApkIcon(String str) {
        this.m = str;
    }

    public void setApkName(String str) {
        this.n = str;
    }

    public void setApkPackageName(String str) {
        this.o = str;
    }

    public void setApkSign(String str) {
        this.q = str;
    }

    public void setAppID(String str) {
        this.a = str;
    }

    public void setAppIcon(String str) {
        this.c = str;
    }

    public void setAppName(String str) {
        this.b = str;
    }

    public void setAppProviderName(String str) {
        this.d = str;
    }

    public void setCallCenterNumber(String str) {
        this.j = str;
    }

    public void setCardType(String str) {
        this.i = str;
    }

    public void setEmail(String str) {
        this.k = str;
    }

    public void setMPan(String str) {
        this.g = str;
    }

    public void setMPanId(String str) {
        this.f = str;
    }

    public void setSPan(String str) {
        this.h = str;
    }

    public void setStatus(UniteAppStatus uniteAppStatus) {
        this.e = uniteAppStatus;
    }

    public void setWebsite(String str) {
        this.l = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
    }

    public UniteAppDetail(Parcel parcel) {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.m = "";
        this.n = "";
        this.o = "";
        this.p = "";
        this.q = "";
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = (UniteAppStatus) parcel.readParcelable(UniteAppStatus.class.getClassLoader());
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.readString();
        this.n = parcel.readString();
        this.o = parcel.readString();
        this.p = parcel.readString();
        this.q = parcel.readString();
    }
}
