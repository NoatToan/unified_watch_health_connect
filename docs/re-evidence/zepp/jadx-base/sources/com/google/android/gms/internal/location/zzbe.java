package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.Geofence;
import com.huami.ecg.core.db.entity.EcgData;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
@SafeParcelable.Class(creator = "ParcelableGeofenceCreator")
@SafeParcelable.Reserved({1000})
public final class zzbe extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<zzbe> CREATOR = new zzbf();

    @SafeParcelable.Field(getter = "getRequestId", id = 1)
    private final String a;

    @SafeParcelable.Field(getter = "getExpirationTime", id = 2)
    private final long b;

    @SafeParcelable.Field(getter = "getType", id = 3)
    private final short c;

    @SafeParcelable.Field(getter = "getLatitude", id = 4)
    private final double d;

    @SafeParcelable.Field(getter = "getLongitude", id = 5)
    private final double e;

    @SafeParcelable.Field(getter = "getRadius", id = 6)
    private final float f;

    @SafeParcelable.Field(getter = "getTransitionTypes", id = 7)
    private final int g;

    @SafeParcelable.Field(defaultValue = "0", getter = "getNotificationResponsiveness", id = 8)
    private final int h;

    @SafeParcelable.Field(defaultValue = EcgData.DEFAULT_DIGIT_VALUE, getter = "getLoiteringDelay", id = 9)
    private final int i;

    @SafeParcelable.Constructor
    public zzbe(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 7) int i, @SafeParcelable.Param(id = 3) short s, @SafeParcelable.Param(id = 4) double d, @SafeParcelable.Param(id = 5) double d2, @SafeParcelable.Param(id = 6) float f, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 8) int i2, @SafeParcelable.Param(id = 9) int i3) {
        if (str == null || str.length() > 100) {
            String strValueOf = String.valueOf(str);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "requestId is null or too long: ".concat(strValueOf) : new String("requestId is null or too long: "));
        }
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        }
        if (d > 90.0d || d < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (d2 > 180.0d || d2 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d2);
            throw new IllegalArgumentException(sb3.toString());
        }
        int i4 = i & 7;
        if (i4 == 0) {
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i);
            throw new IllegalArgumentException(sb4.toString());
        }
        this.c = s;
        this.a = str;
        this.d = d;
        this.e = d2;
        this.f = f;
        this.b = j;
        this.g = i4;
        this.h = i2;
        this.i = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.f == zzbeVar.f && this.d == zzbeVar.d && this.e == zzbeVar.e && this.c == zzbeVar.c) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.location.Geofence
    public final String getRequestId() {
        return this.a;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.d);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.e);
        return ((((((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f)) * 31) + this.c) * 31) + this.g;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        short s = this.c;
        if (s != -1) {
            str = s != 1 ? "UNKNOWN" : "CIRCLE";
        } else {
            str = "INVALID";
        }
        objArr[0] = str;
        objArr[1] = this.a.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.g);
        objArr[3] = Double.valueOf(this.d);
        objArr[4] = Double.valueOf(this.e);
        objArr[5] = Float.valueOf(this.f);
        objArr[6] = Integer.valueOf(this.h / 1000);
        objArr[7] = Integer.valueOf(this.i);
        objArr[8] = Long.valueOf(this.b);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeLong(parcel, 2, this.b);
        SafeParcelWriter.writeShort(parcel, 3, this.c);
        SafeParcelWriter.writeDouble(parcel, 4, this.d);
        SafeParcelWriter.writeDouble(parcel, 5, this.e);
        SafeParcelWriter.writeFloat(parcel, 6, this.f);
        SafeParcelWriter.writeInt(parcel, 7, this.g);
        SafeParcelWriter.writeInt(parcel, 8, this.h);
        SafeParcelWriter.writeInt(parcel, 9, this.i);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
