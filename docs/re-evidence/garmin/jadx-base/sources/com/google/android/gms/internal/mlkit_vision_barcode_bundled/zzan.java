package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "CalendarDateTimeParcelCreator")
public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzan> CREATOR = new zzbg();

    @SafeParcelable.Field(getter = "getYear", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getMonth", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getDay", id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getHours", id = 4)
    private final int zzd;

    @SafeParcelable.Field(getter = "getMinutes", id = 5)
    private final int zze;

    @SafeParcelable.Field(getter = "getSeconds", id = 6)
    private final int zzf;

    @SafeParcelable.Field(getter = "isUtc", id = 7)
    private final boolean zzg;

    @SafeParcelable.Field(getter = "getRawValue", id = 8)
    private final String zzh;

    @SafeParcelable.Constructor
    public zzan(@SafeParcelable.Param(id = 1) int i14, @SafeParcelable.Param(id = 2) int i15, @SafeParcelable.Param(id = 3) int i16, @SafeParcelable.Param(id = 4) int i17, @SafeParcelable.Param(id = 5) int i18, @SafeParcelable.Param(id = 6) int i19, @SafeParcelable.Param(id = 7) boolean z14, @SafeParcelable.Param(id = 8) String str) {
        this.zza = i14;
        this.zzb = i15;
        this.zzc = i16;
        this.zzd = i17;
        this.zze = i18;
        this.zzf = i19;
        this.zzg = z14;
        this.zzh = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        int i15 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i15);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
