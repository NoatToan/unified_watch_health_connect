package com.xiaomi.continuity.netbus;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j3s;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public final class StartDiscoveryOptions implements Parcelable {
    public static final Parcelable.Creator<StartDiscoveryOptions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11226b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    public class a implements Parcelable.Creator<StartDiscoveryOptions> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StartDiscoveryOptions createFromParcel(Parcel parcel) {
            return new StartDiscoveryOptions(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StartDiscoveryOptions[] newArray(int i) {
            return new StartDiscoveryOptions[i];
        }
    }

    public StartDiscoveryOptions() {
        this.f11226b = DiscoveryOptions$DiscoveryDataType.NORMAL.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbA = j3s.a("StartDiscoveryOptions{mMediumType=");
        sbA.append(this.f11225a);
        sbA.append(", mFrequency=");
        sbA.append(this.c);
        sbA.append(", mDataType=");
        sbA.append(this.f11226b);
        sbA.append(", mSameAccount=");
        sbA.append(this.d);
        sbA.append(", mRealtime=");
        sbA.append(this.g);
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11225a);
        parcel.writeInt(this.f11226b);
        parcel.writeInt(this.c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
    }

    public StartDiscoveryOptions(Parcel parcel) {
        this.f11226b = DiscoveryOptions$DiscoveryDataType.NORMAL.ordinal();
        this.f11225a = parcel.readInt();
        this.f11226b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readByte() != 0;
        this.e = parcel.readByte() != 0;
        this.f = parcel.readByte() != 0;
        this.g = parcel.readByte() != 0;
    }

    public /* synthetic */ StartDiscoveryOptions(Parcel parcel, a aVar) {
        this(parcel);
    }
}
