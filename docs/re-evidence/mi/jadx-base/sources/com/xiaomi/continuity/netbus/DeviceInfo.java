package com.xiaomi.continuity.netbus;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j3s;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public final class DeviceInfo implements Parcelable {
    public static final Parcelable.Creator<DeviceInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11206b;
    public String c;
    public String d;
    public int e;
    public long f;
    public int g;
    public int h;
    public boolean i;

    public class a implements Parcelable.Creator<DeviceInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceInfo createFromParcel(Parcel parcel) {
            return new DeviceInfo(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DeviceInfo[] newArray(int i) {
            return new DeviceInfo[i];
        }
    }

    public DeviceInfo() {
    }

    public DeviceInfo(Parcel parcel) {
        this.f11205a = parcel.readInt();
        this.f11206b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readLong();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbA = j3s.a("DeviceInfo{mDeviceType=");
        sbA.append(this.f11205a);
        sbA.append(", mDeviceName='");
        sbA.append(this.f11206b);
        sbA.append('\'');
        sbA.append(", mDeviceId='");
        sbA.append(this.c);
        sbA.append('\'');
        sbA.append(", mUidHash=");
        sbA.append(this.d);
        sbA.append(", mDiscMediumTypes=");
        sbA.append(Integer.toHexString(this.g));
        sbA.append(", mConnMediumTypes=");
        sbA.append(Integer.toHexString(this.h));
        sbA.append(", mIsCutOff=");
        sbA.append(this.i);
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11205a);
        parcel.writeString(this.f11206b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeLong(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
    }

    public /* synthetic */ DeviceInfo(Parcel parcel, a aVar) {
        this(parcel);
    }
}
