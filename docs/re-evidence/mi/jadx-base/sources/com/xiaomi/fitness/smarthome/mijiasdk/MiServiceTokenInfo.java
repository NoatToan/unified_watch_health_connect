package com.xiaomi.fitness.smarthome.mijiasdk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class MiServiceTokenInfo implements Parcelable {
    public static final Parcelable.Creator<MiServiceTokenInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f12911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f12912b;
    public String c;
    public String d;
    public String e;
    public long f;
    public String g;

    public class a implements Parcelable.Creator<MiServiceTokenInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MiServiceTokenInfo createFromParcel(Parcel parcel) {
            return new MiServiceTokenInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MiServiceTokenInfo[] newArray(int i) {
            return new MiServiceTokenInfo[i];
        }
    }

    public MiServiceTokenInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MiServiceTokenInfo{sid='" + this.f12911a + "', userId='" + this.f12912b + "', cUserId='" + this.c + "', serviceToken='" + this.d + "', ssecurity='" + this.e + "', timeDiff=" + this.f + ", domain='" + this.g + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12911a);
        parcel.writeString(this.f12912b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeLong(this.f);
        parcel.writeString(this.g);
    }

    public MiServiceTokenInfo(Parcel parcel) {
        this.f12911a = parcel.readString();
        this.f12912b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readLong();
        this.g = parcel.readString();
    }
}
