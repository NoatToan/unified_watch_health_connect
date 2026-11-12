package com.huawei.hwidauth.utils.globalcfg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class SiteInfoForCFG implements Parcelable {
    public static final Parcelable.Creator<SiteInfoForCFG> CREATOR = new Parcelable.Creator<SiteInfoForCFG>() { // from class: com.huawei.hwidauth.utils.globalcfg.SiteInfoForCFG.2
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SiteInfoForCFG createFromParcel(Parcel parcel) {
            return new SiteInfoForCFG(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SiteInfoForCFG[] newArray(int i) {
            return new SiteInfoForCFG[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f17638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f17640c;
    private String d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SiteInfoForCFG() {
    }

    protected SiteInfoForCFG(Parcel parcel) {
        this.f17638a = parcel.readString();
        this.f17639b = parcel.readString();
        this.f17640c = parcel.readString();
        this.d = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17638a);
        parcel.writeString(this.f17639b);
        parcel.writeString(this.f17640c);
        parcel.writeString(this.d);
    }

    public String a() {
        return this.f17638a;
    }

    public void a(String str) {
        this.f17638a = str;
    }

    public void b(String str) {
        this.f17639b = str;
    }

    public void c(String str) {
        this.f17640c = str;
    }

    public String b() {
        return this.d;
    }

    public void d(String str) {
        this.d = str;
    }
}
