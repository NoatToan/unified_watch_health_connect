package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.exoplayer2.v;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.apache.commons.lang3.BooleanUtils;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "LocationRequestCreator")
@SafeParcelable.Reserved({1000})
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzbo();

    @Deprecated
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;

    @Deprecated
    public static final int PRIORITY_HIGH_ACCURACY = 100;

    @Deprecated
    public static final int PRIORITY_LOW_POWER = 104;

    @Deprecated
    public static final int PRIORITY_NO_POWER = 105;

    @SafeParcelable.Field(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", id = 1)
    int zza;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_INTERVAL", id = 2)
    long zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_FASTEST_INTERVAL", id = 3)
    long zzc;

    @SafeParcelable.Field(defaultValue = BooleanUtils.FALSE, id = 4)
    boolean zzd;

    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", id = 5)
    long zze;

    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MAX_VALUE", id = 6)
    int zzf;

    @SafeParcelable.Field(defaultValue = "0", id = 7)
    float zzg;

    @SafeParcelable.Field(defaultValue = "0", id = 8)
    long zzh;

    @SafeParcelable.Field(defaultValue = BooleanUtils.FALSE, id = 9)
    boolean zzi;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, false, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, 0L, false);
    }

    public static LocationRequest create() {
        return new LocationRequest(102, 3600000L, 600000L, false, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, 0L, true);
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.zza == locationRequest.zza && this.zzb == locationRequest.zzb && this.zzc == locationRequest.zzc && this.zzd == locationRequest.zzd && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && getMaxWaitTime() == locationRequest.getMaxWaitTime() && this.zzi == locationRequest.zzi) {
                return true;
            }
        }
        return false;
    }

    public long getExpirationTime() {
        return this.zze;
    }

    public long getFastestInterval() {
        return this.zzc;
    }

    public long getInterval() {
        return this.zzb;
    }

    public long getMaxWaitTime() {
        long j8 = this.zzh;
        long j14 = this.zzb;
        return j8 < j14 ? j14 : j8;
    }

    public int getNumUpdates() {
        return this.zzf;
    }

    public int getPriority() {
        return this.zza;
    }

    public float getSmallestDisplacement() {
        return this.zzg;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), Float.valueOf(this.zzg), Long.valueOf(this.zzh));
    }

    public boolean isFastestIntervalExplicitlySet() {
        return this.zzd;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzi;
    }

    public LocationRequest setExpirationDuration(long j8) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j14 = j8 <= Long.MAX_VALUE - jElapsedRealtime ? j8 + jElapsedRealtime : Long.MAX_VALUE;
        this.zze = j14;
        if (j14 < 0) {
            this.zze = 0L;
        }
        return this;
    }

    @Deprecated
    public LocationRequest setExpirationTime(long j8) {
        this.zze = j8;
        if (j8 < 0) {
            this.zze = 0L;
        }
        return this;
    }

    public LocationRequest setFastestInterval(long j8) {
        Preconditions.checkArgument(j8 >= 0, "illegal fastest interval: %d", Long.valueOf(j8));
        this.zzd = true;
        this.zzc = j8;
        return this;
    }

    public LocationRequest setInterval(long j8) {
        Preconditions.checkArgument(j8 >= 0, "illegal interval: %d", Long.valueOf(j8));
        this.zzb = j8;
        if (!this.zzd) {
            this.zzc = (long) (j8 / 6.0d);
        }
        return this;
    }

    public LocationRequest setMaxWaitTime(long j8) {
        Preconditions.checkArgument(j8 >= 0, "illegal max wait time: %d", Long.valueOf(j8));
        this.zzh = j8;
        return this;
    }

    public LocationRequest setNumUpdates(int i14) {
        if (i14 > 0) {
            this.zzf = i14;
            return this;
        }
        h.s(v.b(31, i14, "invalid numUpdates: "));
        return null;
    }

    public LocationRequest setPriority(int i14) {
        boolean z14 = true;
        if (i14 != 100 && i14 != 102 && i14 != 104) {
            if (i14 == 105) {
                i14 = 105;
            } else {
                z14 = false;
            }
        }
        Preconditions.checkArgument(z14, "illegal priority: %d", Integer.valueOf(i14));
        this.zza = i14;
        return this;
    }

    public LocationRequest setSmallestDisplacement(float f14) {
        if (f14 >= 0.0f) {
            this.zzg = f14;
            return this;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("invalid displacement: ");
        sb3.append(f14);
        throw new IllegalArgumentException(sb3.toString());
    }

    public LocationRequest setWaitForAccurateLocation(boolean z14) {
        this.zzi = z14;
        return this;
    }

    public String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder("Request[");
        int i14 = this.zza;
        if (i14 == 100) {
            str = "PRIORITY_HIGH_ACCURACY";
        } else if (i14 == 102) {
            str = "PRIORITY_BALANCED_POWER_ACCURACY";
        } else if (i14 != 104) {
            str = i14 != 105 ? "???" : "PRIORITY_NO_POWER";
        } else {
            str = "PRIORITY_LOW_POWER";
        }
        sb3.append(str);
        if (this.zza != 105) {
            sb3.append(" requested=");
            sb3.append(this.zzb);
            sb3.append("ms");
        }
        sb3.append(" fastest=");
        sb3.append(this.zzc);
        sb3.append("ms");
        if (this.zzh > this.zzb) {
            sb3.append(" maxWait=");
            sb3.append(this.zzh);
            sb3.append("ms");
        }
        if (this.zzg > 0.0f) {
            sb3.append(" smallestDisplacement=");
            sb3.append(this.zzg);
            sb3.append("m");
        }
        long j8 = this.zze;
        if (j8 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb3.append(" expireIn=");
            sb3.append(j8 - jElapsedRealtime);
            sb3.append("ms");
        }
        if (this.zzf != Integer.MAX_VALUE) {
            sb3.append(" num=");
            sb3.append(this.zzf);
        }
        sb3.append(']');
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeLong(parcel, 5, this.zze);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeFloat(parcel, 7, this.zzg);
        SafeParcelWriter.writeLong(parcel, 8, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public LocationRequest(@SafeParcelable.Param(id = 1) int i14, @SafeParcelable.Param(id = 2) long j8, @SafeParcelable.Param(id = 3) long j14, @SafeParcelable.Param(id = 4) boolean z14, @SafeParcelable.Param(id = 5) long j15, @SafeParcelable.Param(id = 6) int i15, @SafeParcelable.Param(id = 7) float f14, @SafeParcelable.Param(id = 8) long j16, @SafeParcelable.Param(id = 9) boolean z15) {
        this.zza = i14;
        this.zzb = j8;
        this.zzc = j14;
        this.zzd = z14;
        this.zze = j15;
        this.zzf = i15;
        this.zzg = f14;
        this.zzh = j16;
        this.zzi = z15;
    }
}
