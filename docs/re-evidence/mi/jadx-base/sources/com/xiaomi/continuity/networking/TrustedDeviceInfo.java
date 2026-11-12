package com.xiaomi.continuity.networking;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j3s;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class TrustedDeviceInfo implements Parcelable {
    public static final Parcelable.Creator<TrustedDeviceInfo> CREATOR = new a();
    public static final int DEVICE_TYPE_MI_AUTOMOTIVE = 8;
    public static final int DEVICE_TYPE_NONE = 0;
    public static final int DEVICE_TYPE_PAD = 2;
    public static final int DEVICE_TYPE_PC = 4;
    public static final int DEVICE_TYPE_PHONE = 1;
    public static final int DEVICE_TYPE_SOUND = 5;
    public static final int DEVICE_TYPE_TV = 3;
    public static final int DEVICE_TYPE_VELA_SOUND = 7;
    public static final int DEVICE_TYPE_VELA_WEAR = 6;
    public static final int MEDIUM_TYPES_BLE = 2;
    public static final int MEDIUM_TYPES_P2P = 32;
    public static final int MEDIUM_TYPES_WLAN = 128;
    public static final int TRUSTED_TYPES_P2P_GROUP = 2;
    public static final int TRUSTED_TYPES_SAME_ACCOUNT = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11234b;
    public String c;
    public int d;
    public int e;

    public class a implements Parcelable.Creator<TrustedDeviceInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrustedDeviceInfo createFromParcel(Parcel parcel) {
            return new TrustedDeviceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TrustedDeviceInfo[] newArray(int i) {
            return new TrustedDeviceInfo[i];
        }
    }

    public TrustedDeviceInfo() {
    }

    public TrustedDeviceInfo(Parcel parcel) {
        this.f11233a = parcel.readString();
        this.f11234b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrustedDeviceInfo trustedDeviceInfo = (TrustedDeviceInfo) obj;
        return this.f11234b == trustedDeviceInfo.f11234b && this.d == trustedDeviceInfo.d && this.e == trustedDeviceInfo.e && Objects.equals(this.f11233a, trustedDeviceInfo.f11233a) && Objects.equals(this.c, trustedDeviceInfo.c);
    }

    public int hashCode() {
        return Objects.hash(this.f11233a, Integer.valueOf(this.f11234b), this.c, Integer.valueOf(this.d), Integer.valueOf(this.e));
    }

    public String toString() {
        StringBuilder sbA = j3s.a("TrustedDeviceInfo{mDeviceId='");
        sbA.append(this.f11233a);
        sbA.append('\'');
        sbA.append(", mDeviceType=");
        sbA.append(this.f11234b);
        sbA.append(", mDeviceName='");
        sbA.append(this.c);
        sbA.append('\'');
        sbA.append(", mMediumTypes=");
        sbA.append(this.d);
        sbA.append(", mTrustedTypes=");
        sbA.append(this.e);
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11233a);
        parcel.writeInt(this.f11234b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }
}
