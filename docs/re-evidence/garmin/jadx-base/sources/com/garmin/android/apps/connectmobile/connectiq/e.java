package com.garmin.android.apps.connectmobile.connectiq;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f31857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f31861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f31862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f31863g;

    public class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public e(Parcel parcel) {
        this.f31858b = -1;
        this.f31857a = UUID.fromString(parcel.readString());
        this.f31861e = parcel.readString();
        this.f31859c = parcel.readInt();
        this.f31862f = parcel.readLong();
        this.f31860d = Boolean.valueOf(parcel.readString()).booleanValue();
        this.f31858b = parcel.readInt();
        this.f31863g = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f31857a.toString());
        parcel.writeString(this.f31861e);
        parcel.writeInt(this.f31859c);
        parcel.writeLong(this.f31862f);
        parcel.writeString(String.valueOf(this.f31860d));
        parcel.writeInt(this.f31858b);
        parcel.writeByte(this.f31863g ? (byte) 1 : (byte) 0);
    }

    public e(UUID uuid, int i14, long j8, boolean z14, int i15, boolean z15) {
        this.f31857a = uuid;
        this.f31859c = i14;
        this.f31862f = j8;
        this.f31860d = z14;
        this.f31858b = i15;
        this.f31863g = z15;
    }

    public e(byte[] bArr, String str, int i14, long j8, boolean z14, int i15, boolean z15) {
        this.f31858b = -1;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        this.f31857a = new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
        this.f31861e = str;
        this.f31859c = i14;
        this.f31862f = j8;
        this.f31860d = z14;
        this.f31858b = i15;
        this.f31863g = z15;
    }
}
