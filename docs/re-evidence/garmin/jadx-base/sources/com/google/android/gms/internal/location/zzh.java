package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.maps.android.BuildConfig;
import java.util.Collections;
import java.util.List;
import sn.a;
import v.e0;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "DeviceOrientationRequestInternalCreator")
public final class zzh extends AbstractSafeParcelable {

    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_DEVICE_ORIENTATION_REQUEST", id = 1)
    final com.google.android.gms.location.zzw zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_CLIENTS", id = 2)
    final List zzd;

    @SafeParcelable.Field(defaultValueUnchecked = BuildConfig.TRAVIS, id = 3)
    final String zze;

    @VisibleForTesting
    static final List zza = Collections.EMPTY_LIST;
    static final com.google.android.gms.location.zzw zzb = new com.google.android.gms.location.zzw();
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();

    @SafeParcelable.Constructor
    public zzh(@SafeParcelable.Param(id = 1) com.google.android.gms.location.zzw zzwVar, @SafeParcelable.Param(id = 2) List list, @SafeParcelable.Param(id = 3) String str) {
        this.zzc = zzwVar;
        this.zzd = list;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return Objects.equal(this.zzc, zzhVar.zzc) && Objects.equal(this.zzd, zzhVar.zzd) && Objects.equal(this.zze, zzhVar.zze);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(this.zzd);
        String str = this.zze;
        int length = strValueOf.length();
        StringBuilder sb3 = new StringBuilder(length + 77 + strValueOf2.length() + String.valueOf(str).length());
        a.t(sb3, "DeviceOrientationRequestInternal{deviceOrientationRequest=", strValueOf, ", clients=", strValueOf2);
        return e0.h(sb3, ", tag='", str, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zzc, i14, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 3, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
