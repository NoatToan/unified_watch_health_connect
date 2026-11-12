package com.mi.health.map.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class SportItemValue implements Comparable<SportItemValue>, Parcelable {
    public static final Parcelable.Creator<SportItemValue> CREATOR = new a();
    public static final int TYPE_DEF = 0;
    public static final int TYPE_MAX = 1;
    public static final int TYPE_MIN = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10025b;
    public final int c;
    public float d;
    public int e;
    public int f;

    public class a implements Parcelable.Creator<SportItemValue> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SportItemValue createFromParcel(Parcel parcel) {
            return new SportItemValue(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SportItemValue[] newArray(int i) {
            return new SportItemValue[i];
        }
    }

    public SportItemValue(Parcel parcel) {
        this.e = 0;
        this.f10024a = parcel.readLong();
        this.f10025b = parcel.readLong();
        this.c = parcel.readInt();
        this.d = parcel.readFloat();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(SportItemValue sportItemValue) {
        if (sportItemValue == null) {
            return 1;
        }
        long j = this.f10025b;
        long j2 = sportItemValue.f10025b;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SportItemValue{value=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f10024a);
        parcel.writeLong(this.f10025b);
        parcel.writeInt(this.c);
        parcel.writeFloat(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
    }
}
