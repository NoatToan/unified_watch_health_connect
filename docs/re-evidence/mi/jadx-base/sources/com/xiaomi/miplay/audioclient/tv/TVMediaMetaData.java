package com.xiaomi.miplay.audioclient.tv;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public class TVMediaMetaData implements Parcelable {
    public static final Parcelable.Creator<TVMediaMetaData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13622b;
    public String c;
    public long d;
    public String e;
    public String f;
    public int g;
    public long h;
    public Bitmap i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f13623k;
    public String l;
    public String m;
    public String n;
    public int o;
    public String p;
    public String q;

    public class a implements Parcelable.Creator<TVMediaMetaData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TVMediaMetaData createFromParcel(Parcel parcel) {
            return new TVMediaMetaData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TVMediaMetaData[] newArray(int i) {
            return new TVMediaMetaData[i];
        }
    }

    public TVMediaMetaData() {
        this.f13621a = "";
        this.f13622b = "";
        this.c = "";
        this.d = 0L;
        this.e = "";
        this.f = "";
        this.g = 0;
        this.h = 0L;
        this.i = null;
        this.j = 0L;
        this.f13623k = "";
        this.l = "";
        this.m = "";
        this.n = "";
        this.o = 0;
        this.p = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13621a);
        parcel.writeString(this.f13622b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeLong(this.h);
        parcel.writeParcelable(this.i, i);
        parcel.writeLong(this.j);
        parcel.writeString(this.f13623k);
        parcel.writeString(this.l);
        parcel.writeString(this.n);
        parcel.writeString(this.m);
        parcel.writeInt(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
    }

    public TVMediaMetaData(Parcel parcel) {
        this.f13621a = parcel.readString();
        this.f13622b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readLong();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readLong();
        this.i = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.j = parcel.readLong();
        this.f13623k = parcel.readString();
        this.l = parcel.readString();
        this.n = parcel.readString();
        this.m = parcel.readString();
        this.o = parcel.readInt();
        this.p = parcel.readString();
        this.q = parcel.readString();
    }
}
