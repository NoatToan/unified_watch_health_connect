package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "LocationAvailabilityCreator")
@SafeParcelable.Reserved({1000})
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {

    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNSUCCESSFUL", id = 4)
    int zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", getter = "getCellStatus", id = 1)
    private final int zzd;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", getter = "getWifiStatus", id = 2)
    private final int zze;

    @SafeParcelable.Field(defaultValueUnchecked = "0", getter = "getElapsedRealtimeNs", id = 3)
    private final long zzf;

    @SafeParcelable.Field(getter = "getBatchedStatus", id = 5)
    private final zzbv[] zzg;
    public static final LocationAvailability zza = new LocationAvailability(0, 1, 1, 0, null, true);
    public static final LocationAvailability zzb = new LocationAvailability(1000, 1, 1, 0, null, false);
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new zzbn();

    @SafeParcelable.Constructor
    public LocationAvailability(@SafeParcelable.Param(id = 4) int i14, @SafeParcelable.Param(id = 1) int i15, @SafeParcelable.Param(id = 2) int i16, @SafeParcelable.Param(id = 3) long j8, @SafeParcelable.Param(id = 5) zzbv[] zzbvVarArr, @SafeParcelable.Param(id = 6) boolean z14) {
        this.zzc = i14 < 1000 ? 0 : 1000;
        this.zzd = i15;
        this.zze = i16;
        this.zzf = j8;
        this.zzg = zzbvVarArr;
    }

    public static LocationAvailability extractLocationAvailability(Intent intent) {
        if (!hasLocationAvailability(intent)) {
            return null;
        }
        try {
            return (LocationAvailability) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public static boolean hasLocationAvailability(Intent intent) {
        return intent != null && intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.zzd == locationAvailability.zzd && this.zze == locationAvailability.zze && this.zzf == locationAvailability.zzf && this.zzc == locationAvailability.zzc && Arrays.equals(this.zzg, locationAvailability.zzg)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzc));
    }

    public boolean isLocationAvailable() {
        return this.zzc < 1000;
    }

    public String toString() {
        boolean zIsLocationAvailable = isLocationAvailable();
        StringBuilder sb3 = new StringBuilder(27);
        sb3.append("LocationAvailability[");
        sb3.append(zIsLocationAvailable);
        sb3.append("]");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzd);
        SafeParcelWriter.writeInt(parcel, 2, this.zze);
        SafeParcelWriter.writeLong(parcel, 3, this.zzf);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.zzg, i14, false);
        SafeParcelWriter.writeBoolean(parcel, 6, isLocationAvailable());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
