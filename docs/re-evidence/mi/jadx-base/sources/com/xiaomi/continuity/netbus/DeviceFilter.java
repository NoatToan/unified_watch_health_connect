package com.xiaomi.continuity.netbus;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j3s;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceFilter implements Parcelable {
    public static final Parcelable.Creator<DeviceFilter> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11204b;
    public boolean c;
    public int d;

    public class a implements Parcelable.Creator<DeviceFilter> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceFilter createFromParcel(Parcel parcel) {
            return new DeviceFilter(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DeviceFilter[] newArray(int i) {
            return new DeviceFilter[i];
        }
    }

    public DeviceFilter() {
        this.d = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbA = j3s.a("DeviceFilter {mMediumTypes=");
        sbA.append(this.d);
        sbA.append(", mSameAccount=");
        sbA.append(this.f11203a);
        sbA.append(", mSameGroup=");
        sbA.append(this.f11204b);
        sbA.append(", mSameNoGroup=");
        sbA.append(this.c);
        sbA.append("}");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f11203a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11204b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.d);
    }

    public DeviceFilter(Parcel parcel) {
        this.d = 0;
        this.f11203a = parcel.readByte() != 0;
        this.f11204b = parcel.readByte() != 0;
        this.c = parcel.readByte() != 0;
        this.d = parcel.readInt();
    }
}
