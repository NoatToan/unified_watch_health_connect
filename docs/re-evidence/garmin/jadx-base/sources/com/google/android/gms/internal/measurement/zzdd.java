package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "InitializationParamsCreator")
@SafeParcelable.Reserved({4, 5, 6})
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzde();

    @SafeParcelable.Field(id = 1)
    public final long zza;

    @SafeParcelable.Field(id = 2)
    public final long zzb;

    @SafeParcelable.Field(id = 3)
    public final boolean zzc;

    @SafeParcelable.Field(id = 7)
    public final Bundle zzd;

    @SafeParcelable.Field(id = 8)
    public final String zze;

    @SafeParcelable.Constructor
    public zzdd(@SafeParcelable.Param(id = 1) long j8, @SafeParcelable.Param(id = 2) long j14, @SafeParcelable.Param(id = 3) boolean z14, @SafeParcelable.Param(id = 7) Bundle bundle, @SafeParcelable.Param(id = 8) String str) {
        this.zza = j8;
        this.zzb = j14;
        this.zzc = z14;
        this.zzd = bundle;
        this.zze = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        long j8 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, j8);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeBundle(parcel, 7, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 8, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
