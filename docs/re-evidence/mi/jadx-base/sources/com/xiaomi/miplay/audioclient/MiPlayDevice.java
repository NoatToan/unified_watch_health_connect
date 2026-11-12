package com.xiaomi.miplay.audioclient;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public class MiPlayDevice implements Parcelable {
    public static final Parcelable.Creator<MiPlayDevice> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13614b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f13615k;
    public String l;
    public int m;
    public float n;
    public float o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13616r;

    public class a implements Parcelable.Creator<MiPlayDevice> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MiPlayDevice createFromParcel(Parcel parcel) {
            return new MiPlayDevice(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MiPlayDevice[] newArray(int i) {
            return new MiPlayDevice[i];
        }
    }

    public MiPlayDevice() {
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0;
    }

    public String a() {
        return this.f13613a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MiPlayDevice) && ((MiPlayDevice) obj).a() == this.f13613a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13613a);
        parcel.writeString(this.f13614b);
        parcel.writeInt(this.c);
        parcel.writeString(this.e);
        parcel.writeString(this.d);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.f13615k);
        parcel.writeString(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.q);
        parcel.writeInt(this.f13616r);
        parcel.writeFloat(this.n);
        parcel.writeFloat(this.o);
        parcel.writeInt(this.p);
    }

    public MiPlayDevice(Parcel parcel) {
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0;
        this.f13613a = parcel.readString();
        this.f13614b = parcel.readString();
        this.c = parcel.readInt();
        this.e = parcel.readString();
        this.d = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.f13615k = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.readInt();
        this.q = parcel.readInt();
        this.f13616r = parcel.readInt();
        this.n = parcel.readFloat();
        this.o = parcel.readFloat();
        this.p = parcel.readInt();
    }
}
