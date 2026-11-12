package com.xiaomi.miplay.audioclient;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public class MiPlayDeviceControlCenter implements Parcelable {
    public static final Parcelable.Creator<MiPlayDeviceControlCenter> CREATOR = new a();
    public String A;
    public String B;
    public String C;
    public String D;
    public int E;
    public String F;
    public String G;
    public String H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13618b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f13619k;
    public String l;
    public String m;
    public int n;
    public float o;
    public float p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f13620r;
    public int s;
    public String t;
    public int u;
    public int v;
    public String w;
    public int x;
    public String y;
    public String z;

    public class a implements Parcelable.Creator<MiPlayDeviceControlCenter> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MiPlayDeviceControlCenter createFromParcel(Parcel parcel) {
            return new MiPlayDeviceControlCenter(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MiPlayDeviceControlCenter[] newArray(int i) {
            return new MiPlayDeviceControlCenter[i];
        }
    }

    public MiPlayDeviceControlCenter() {
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.z = "";
    }

    public String a() {
        return this.f;
    }

    public int c() {
        return this.E;
    }

    public String d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.x;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MiPlayDeviceControlCenter) && ((MiPlayDeviceControlCenter) obj).j() == this.f13617a;
    }

    public int f() {
        return this.u;
    }

    public String g() {
        return this.z;
    }

    public int h() {
        return this.s;
    }

    public String i() {
        return this.f13620r;
    }

    public String j() {
        return this.f13617a;
    }

    public String k() {
        return this.t;
    }

    public String l() {
        return this.w;
    }

    public int m() {
        return this.c;
    }

    public String o() {
        return this.F;
    }

    public String q() {
        return this.e;
    }

    public String r() {
        return this.C;
    }

    public String t() {
        return this.f13618b;
    }

    public String u() {
        return this.H;
    }

    public String v() {
        return this.B;
    }

    public String w() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13617a);
        parcel.writeString(this.f13618b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.f);
        parcel.writeString(this.e);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.f13619k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        parcel.writeFloat(this.o);
        parcel.writeFloat(this.p);
        parcel.writeInt(this.q);
        parcel.writeString(this.f13620r);
        parcel.writeInt(this.s);
        parcel.writeString(this.e);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeString(this.t);
        parcel.writeString(this.w);
        parcel.writeInt(this.x);
        parcel.writeString(this.y);
        parcel.writeString(this.z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeInt(this.E);
        parcel.writeString(this.F);
        parcel.writeString(this.G);
        parcel.writeString(this.H);
    }

    public String x() {
        return this.A;
    }

    public MiPlayDeviceControlCenter(Parcel parcel) {
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.z = "";
        this.f13617a = parcel.readString();
        this.f13618b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.f = parcel.readString();
        this.e = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.f13619k = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.readString();
        this.n = parcel.readInt();
        this.o = parcel.readFloat();
        this.p = parcel.readFloat();
        this.q = parcel.readInt();
        this.f13620r = parcel.readString();
        this.s = parcel.readInt();
        this.e = parcel.readString();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.t = parcel.readString();
        this.w = parcel.readString();
        this.x = parcel.readInt();
        this.y = parcel.readString();
        this.z = parcel.readString();
        this.A = parcel.readString();
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.D = parcel.readString();
        this.E = parcel.readInt();
        this.F = parcel.readString();
        this.G = parcel.readString();
        this.H = parcel.readString();
    }
}
