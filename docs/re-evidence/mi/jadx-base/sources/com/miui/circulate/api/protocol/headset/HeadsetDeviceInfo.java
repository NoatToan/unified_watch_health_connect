package com.miui.circulate.api.protocol.headset;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.pmb;
import defpackage.tpe;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class HeadsetDeviceInfo implements Parcelable {
    public static final Parcelable.Creator<HeadsetDeviceInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10300b;
    public String c;
    public String d;
    public int e;
    public List<Integer> f;
    public boolean g;
    public int h;

    @Deprecated
    public boolean i;

    public class a implements Parcelable.Creator<HeadsetDeviceInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HeadsetDeviceInfo createFromParcel(Parcel parcel) {
            return new HeadsetDeviceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HeadsetDeviceInfo[] newArray(int i) {
            return new HeadsetDeviceInfo[i];
        }
    }

    public HeadsetDeviceInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "headset profile: , name=" + this.c + ", volume=" + this.e + ", power=" + this.f + ", mode=" + pmb.a(this.h) + ", output=" + this.g + tpe.e(", mac=" + this.f10299a + ", deviceId=" + this.d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10299a);
        parcel.writeString(this.f10300b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.h);
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
    }

    public HeadsetDeviceInfo(Parcel parcel) {
        this.f10299a = parcel.readString();
        this.f10300b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.g = parcel.readByte() != 0;
        this.h = parcel.readInt();
        this.i = parcel.readByte() != 0;
    }
}
