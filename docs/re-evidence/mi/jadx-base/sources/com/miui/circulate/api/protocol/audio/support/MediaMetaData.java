package com.miui.circulate.api.protocol.audio.support;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RequiresApi;
import com.miui.tsmclient.net.TSMAuthContants;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class MediaMetaData implements Parcelable {
    public static final String COVER_URL = "coverUrl";
    public static final Parcelable.Creator<MediaMetaData> CREATOR = new a();
    public static final String IS_LOCAL = "isLocal";
    public static final String LRC_ID = "id";
    public static final String PACKAGE_NAME = "packageName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10293b;
    public final String c;
    public final long d;
    public final Bitmap e;
    public final String f;
    public final String g;
    public final Bundle h;

    public class a implements Parcelable.Creator<MediaMetaData> {
        @Override // android.os.Parcelable.Creator
        @RequiresApi(api = 29)
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaMetaData createFromParcel(Parcel parcel) {
            return new MediaMetaData(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaMetaData[] newArray(int i) {
            return new MediaMetaData[i];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10295b;
        public String c;
        public String d;
        public long e;
        public Bitmap f;
        public String g;
        public Bundle h;

        public MediaMetaData h() {
            return new MediaMetaData(this, (a) null);
        }

        public b i(String str) {
            this.d = str;
            return this;
        }

        public b j(Bitmap bitmap) {
            this.f = bitmap;
            return this;
        }

        public b k(String str) {
            this.f10295b = str;
            return this;
        }

        public b l(String str) {
            this.f10294a = str;
            return this;
        }

        public b m(long j) {
            this.e = j;
            return this;
        }

        public b n(Bundle bundle) {
            this.h = bundle;
            return this;
        }

        public b o(String str) {
            this.g = str;
            return this;
        }

        public b p(String str) {
            this.c = str;
            return this;
        }
    }

    public /* synthetic */ MediaMetaData(Parcel parcel, a aVar) {
        this(parcel);
    }

    public String a() {
        return this.f10293b;
    }

    public String c() {
        return this.f10292a;
    }

    public long d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MediaMetaData)) {
            return false;
        }
        MediaMetaData mediaMetaData = (MediaMetaData) obj;
        if (String.valueOf(this.c).equals(String.valueOf(mediaMetaData.c)) && String.valueOf(this.f10292a).equals(String.valueOf(mediaMetaData.f10292a)) && String.valueOf(this.d).equals(String.valueOf(mediaMetaData.d)) && String.valueOf(this.g).equals(String.valueOf(mediaMetaData.g))) {
            return String.valueOf(this.f10293b).equals(String.valueOf(mediaMetaData.f10293b));
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaMetaData{mArtist='");
        sb.append(this.f10292a);
        sb.append('\'');
        sb.append(", mAlbum='");
        sb.append(this.f10293b);
        sb.append('\'');
        sb.append(", mTitle='");
        sb.append(this.c);
        sb.append('\'');
        sb.append(", mDuration=");
        sb.append(this.d);
        sb.append(", mArt=");
        sb.append(this.e == null ? AbstractJsonLexerKt.NULL : TSMAuthContants.PARAM_VALID);
        sb.append(", mLrc='");
        sb.append(this.f);
        sb.append('\'');
        sb.append(", mAudioId='");
        sb.append(this.g);
        sb.append('\'');
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    @RequiresApi(api = 29)
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10292a);
        parcel.writeString(this.f10293b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeBundle(this.h);
    }

    public /* synthetic */ MediaMetaData(b bVar, a aVar) {
        this(bVar);
    }

    public MediaMetaData(b bVar) {
        this.f10292a = bVar.f10295b;
        this.f10293b = bVar.d;
        this.c = bVar.c;
        this.d = bVar.e;
        this.e = bVar.f;
        this.f = bVar.g;
        this.h = bVar.h;
        this.g = bVar.f10294a;
    }

    @RequiresApi(api = 29)
    public MediaMetaData(Parcel parcel) {
        this.f10292a = parcel.readString();
        this.f10293b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readLong();
        this.e = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readBundle(getClass().getClassLoader());
    }
}
