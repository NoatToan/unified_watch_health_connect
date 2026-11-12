package com.cmcc.server.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class MultiSimDeviceInfo implements Parcelable {
    public static final Parcelable.Creator<MultiSimDeviceInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7020b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public long i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<SimInfo> f7021k;

    public class a implements Parcelable.Creator<MultiSimDeviceInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MultiSimDeviceInfo createFromParcel(Parcel parcel) {
            return new MultiSimDeviceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MultiSimDeviceInfo[] newArray(int i) {
            return new MultiSimDeviceInfo[i];
        }
    }

    public MultiSimDeviceInfo(Parcel parcel) {
        this.f7019a = parcel.readInt();
        this.f7020b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readLong();
        this.j = parcel.readString();
        this.f7021k = parcel.createTypedArrayList(SimInfo.CREATOR);
    }

    public void a(String str) {
        this.g = str;
    }

    public void c(String str) {
        this.c = str;
    }

    public void d(String str) {
        this.d = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(int i) {
        this.f7020b = i;
    }

    public void f(String str) {
        this.f = str;
    }

    public void g(String str) {
        this.e = str;
    }

    public void h(int i) {
        this.f7019a = i;
    }

    public void i(String str) {
        this.j = str;
    }

    public void j(List<SimInfo> list) {
        this.f7021k = list;
    }

    public void k(String str) {
        this.h = str;
    }

    public void l(long j) {
        this.i = j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7019a);
        parcel.writeInt(this.f7020b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeLong(this.i);
        parcel.writeString(this.j);
        parcel.writeTypedList(this.f7021k);
    }
}
