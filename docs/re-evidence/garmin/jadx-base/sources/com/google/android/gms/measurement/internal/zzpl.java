package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "UserAttributeParcelCreator")
public final class zzpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpl> CREATOR = new zzpm();

    @SafeParcelable.Field(id = 1)
    public final int zza;

    @SafeParcelable.Field(id = 2)
    public final String zzb;

    @SafeParcelable.Field(id = 3)
    public final long zzc;

    @SafeParcelable.Field(id = 4)
    public final Long zzd;

    @SafeParcelable.Field(id = 6)
    public final String zze;

    @SafeParcelable.Field(id = 7)
    public final String zzf;

    @SafeParcelable.Field(id = 8)
    public final Double zzg;

    public zzpl(String str, long j8, Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.zza = 2;
        this.zzb = str;
        this.zzc = j8;
        this.zzf = str2;
        if (obj == null) {
            this.zzd = null;
            this.zzg = null;
            this.zze = null;
            return;
        }
        if (obj instanceof Long) {
            this.zzd = (Long) obj;
            this.zzg = null;
            this.zze = null;
        } else if (obj instanceof String) {
            this.zzd = null;
            this.zzg = null;
            this.zze = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                h.s("User attribute given of un-supported type");
                throw null;
            }
            this.zzd = null;
            this.zzg = (Double) obj;
            this.zze = null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        zzpm.zza(this, parcel, i14);
    }

    public final Object zza() {
        Long l14 = this.zzd;
        if (l14 != null) {
            return l14;
        }
        Double d14 = this.zzg;
        if (d14 != null) {
            return d14;
        }
        String str = this.zze;
        if (str != null) {
            return str;
        }
        return null;
    }

    public zzpl(zzpn zzpnVar) {
        this(zzpnVar.zzc, zzpnVar.zzd, zzpnVar.zze, zzpnVar.zzb);
    }

    @SafeParcelable.Constructor
    public zzpl(@SafeParcelable.Param(id = 1) int i14, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) long j8, @SafeParcelable.Param(id = 4) Long l14, @SafeParcelable.Param(id = 5) Float f14, @SafeParcelable.Param(id = 6) String str2, @SafeParcelable.Param(id = 7) String str3, @SafeParcelable.Param(id = 8) Double d14) {
        this.zza = i14;
        this.zzb = str;
        this.zzc = j8;
        this.zzd = l14;
        this.zzg = i14 == 1 ? f14 != null ? Double.valueOf(f14.doubleValue()) : null : d14;
        this.zze = str2;
        this.zzf = str3;
    }
}
