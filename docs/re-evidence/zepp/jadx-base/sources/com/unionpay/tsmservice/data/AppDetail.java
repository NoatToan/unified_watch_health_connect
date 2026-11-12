package com.unionpay.tsmservice.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.AppID;

/* JADX INFO: loaded from: classes18.dex */
public class AppDetail implements Parcelable {
    public static final Parcelable.Creator<AppDetail> CREATOR = new a();
    private AppID a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private long k;
    private String l;
    private String m;
    private String n;
    private String o;
    private AppStatus p;
    private String q;

    public static class a implements Parcelable.Creator<AppDetail> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppDetail createFromParcel(Parcel parcel) {
            return new AppDetail(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppDetail[] newArray(int i) {
            return new AppDetail[i];
        }
    }

    public AppDetail() {
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = 0L;
        this.l = "";
        this.m = "";
        this.n = "";
        this.o = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppApplyId() {
        return this.q;
    }

    public String getAppDesc() {
        return this.d;
    }

    public AppID getAppID() {
        return this.a;
    }

    public String getAppIcon() {
        return this.c;
    }

    public String getAppName() {
        return this.b;
    }

    public String getAppProviderAgreement() {
        return this.g;
    }

    public String getAppProviderLogo() {
        return this.e;
    }

    public String getAppProviderName() {
        return this.f;
    }

    public String getApplyMode() {
        return this.i;
    }

    public long getDownloadTimes() {
        return this.k;
    }

    public String getPublishData() {
        return this.l;
    }

    public String getPublishStatus() {
        return this.m;
    }

    public String getRechargeLowerLimit() {
        return this.o;
    }

    public String getRechargeMode() {
        return this.n;
    }

    public String getServicePhone() {
        return this.j;
    }

    public AppStatus getStatus() {
        return this.p;
    }

    public String getUpAgreement() {
        return this.h;
    }

    public void setAppApplyId(String str) {
        this.q = str;
    }

    public void setAppDesc(String str) {
        this.d = str;
    }

    public void setAppID(AppID appID) {
        this.a = appID;
    }

    public void setAppIcon(String str) {
        this.c = str;
    }

    public void setAppName(String str) {
        this.b = str;
    }

    public void setAppProviderAgreement(String str) {
        this.g = str;
    }

    public void setAppProviderLogo(String str) {
        this.e = str;
    }

    public void setAppProviderName(String str) {
        this.f = str;
    }

    public void setApplyMode(String str) {
        this.i = str;
    }

    public void setDownloadTimes(long j) {
        this.k = j;
    }

    public void setPublishData(String str) {
        this.l = str;
    }

    public void setPublishStatus(String str) {
        this.m = str;
    }

    public void setRechargeLowerLimit(String str) {
        this.o = str;
    }

    public void setRechargeMode(String str) {
        this.n = str;
    }

    public void setServicePhone(String str) {
        this.j = str;
    }

    public void setStatus(AppStatus appStatus) {
        this.p = appStatus;
    }

    public void setUpAgreement(String str) {
        this.h = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeLong(this.k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeString(this.q);
        parcel.writeParcelable(this.p, i);
    }

    public AppDetail(Parcel parcel) {
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = 0L;
        this.l = "";
        this.m = "";
        this.n = "";
        this.o = "";
        this.a = (AppID) parcel.readParcelable(AppID.class.getClassLoader());
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.k = parcel.readLong();
        this.l = parcel.readString();
        this.m = parcel.readString();
        this.n = parcel.readString();
        this.o = parcel.readString();
        this.q = parcel.readString();
        this.p = (AppStatus) parcel.readParcelable(AppStatus.class.getClassLoader());
    }
}
