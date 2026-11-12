package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "DeviceOrientationRequestCreator")
public final class zzw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzw> CREATOR = new zzx();

    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_SHOULD_USE_MAG", id = 1)
    boolean zza;

    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_MINIMUM_SAMPLING_PERIOD_MS", id = 2)
    long zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_SMALLEST_ANGLE_CHANGE_RADIANS", id = 3)
    float zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_EXPIRE_AT_MS", id = 4)
    long zzd;

    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_NUM_UPDATES", id = 5)
    int zze;

    public zzw() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzw)) {
            return false;
        }
        zzw zzwVar = (zzw) obj;
        return this.zza == zzwVar.zza && this.zzb == zzwVar.zzb && Float.compare(this.zzc, zzwVar.zzc) == 0 && this.zzd == zzwVar.zzd && this.zze == zzwVar.zze;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), Long.valueOf(this.zzb), Float.valueOf(this.zzc), Long.valueOf(this.zzd), Integer.valueOf(this.zze));
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DeviceOrientationRequest[mShouldUseMag=");
        sb3.append(this.zza);
        sb3.append(" mMinimumSamplingPeriodMs=");
        sb3.append(this.zzb);
        sb3.append(" mSmallestAngleChangeRadians=");
        sb3.append(this.zzc);
        long j8 = this.zzd;
        if (j8 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb3.append(" expireIn=");
            sb3.append(j8 - jElapsedRealtime);
            sb3.append("ms");
        }
        if (this.zze != Integer.MAX_VALUE) {
            sb3.append(" num=");
            sb3.append(this.zze);
        }
        sb3.append(']');
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeFloat(parcel, 3, this.zzc);
        SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzw(@SafeParcelable.Param(id = 1) boolean z14, @SafeParcelable.Param(id = 2) long j8, @SafeParcelable.Param(id = 3) float f14, @SafeParcelable.Param(id = 4) long j14, @SafeParcelable.Param(id = 5) int i14) {
        this.zza = z14;
        this.zzb = j8;
        this.zzc = f14;
        this.zzd = j14;
        this.zze = i14;
    }
}
