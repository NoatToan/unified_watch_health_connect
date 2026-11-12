package com.xiaomi.miplay.audioclient;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class MediaMetaData implements Parcelable {
    public static final Parcelable.Creator<MediaMetaData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13610b;
    public String c;
    public long d;
    public String e;
    public String f;
    public int g;
    public long h;
    public Bitmap i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f13611k;
    public String l;
    public String m;
    public int n;
    public String o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f13612r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public int z;

    public class a implements Parcelable.Creator<MediaMetaData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaMetaData createFromParcel(Parcel parcel) {
            return new MediaMetaData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaMetaData[] newArray(int i) {
            return new MediaMetaData[i];
        }
    }

    public MediaMetaData() {
        this.f13609a = "";
        this.f13610b = "";
        this.c = "";
        this.d = 0L;
        this.e = "";
        this.f = "";
        this.g = 0;
        this.h = 0L;
        this.i = null;
        this.j = 0L;
        this.f13611k = "";
        this.l = "";
        this.m = "";
        this.n = 0;
        this.o = "";
        this.p = 0;
        this.q = 0;
        this.f13612r = "";
        this.s = "";
        this.t = "";
        this.u = "";
        this.v = "";
        this.w = "";
        this.x = "";
        this.y = "";
        this.z = 0;
    }

    public String a() {
        return this.f13610b;
    }

    public Bitmap c() {
        return this.i;
    }

    public String d() {
        return this.f13609a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.w;
    }

    public String f() {
        return this.f;
    }

    public long g() {
        return this.d;
    }

    public String h() {
        return this.l;
    }

    public String i() {
        return this.c;
    }

    public String j() {
        return this.f13611k;
    }

    public String toString() {
        return "MediaMetaData{mArtist='" + this.f13609a + "', mAlbum='" + this.f13610b + "', mTitle='" + this.c + "', mDuration=" + this.d + ", mId='" + this.e + "', mCoverUrl='" + this.f + "', mStatus=" + this.g + ", mVolume=" + this.h + ", mArt=" + this.i + ", mPosition=" + this.j + ", mLrc='" + this.f13611k + "', mPackgeName='" + this.l + "', mSourceName='" + this.m + "', mDeviceState=" + this.n + ", mPackageId='" + this.o + "', mIsSequel=" + this.p + ", mMediaType=" + this.q + ", mVideoUrl='" + this.f13612r + "', mMux='" + this.s + "', mCodec='" + this.t + "', mReverso='" + this.u + "', mPropertiesInfo='" + this.v + "', mAudioId='" + this.w + "', mTVId='" + this.x + "', mVideoUrn='" + this.y + "', mMetaChangeType=" + this.z + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13609a);
        parcel.writeString(this.f13610b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeLong(this.h);
        parcel.writeParcelable(this.i, i);
        parcel.writeLong(this.j);
        parcel.writeString(this.f13611k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        parcel.writeString(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeString(this.f13612r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.x);
        parcel.writeString(this.y);
        parcel.writeInt(this.z);
    }

    public MediaMetaData(Parcel parcel) {
        this.f13609a = parcel.readString();
        this.f13610b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readLong();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readLong();
        this.i = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.j = parcel.readLong();
        this.f13611k = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.readString();
        this.n = parcel.readInt();
        this.o = parcel.readString();
        this.p = parcel.readInt();
        this.q = parcel.readInt();
        this.f13612r = parcel.readString();
        this.s = parcel.readString();
        this.t = parcel.readString();
        this.u = parcel.readString();
        this.v = parcel.readString();
        this.w = parcel.readString();
        this.x = parcel.readString();
        this.y = parcel.readString();
        this.z = parcel.readInt();
    }
}
