package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "CalendarDateTimeCreator")
@SafeParcelable.Reserved({1})
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzw();

    @SafeParcelable.Field(id = 2)
    public int zza;

    @SafeParcelable.Field(id = 3)
    public int zzb;

    @SafeParcelable.Field(id = 4)
    public int zzc;

    @SafeParcelable.Field(id = 5)
    public int zzd;

    @SafeParcelable.Field(id = 6)
    public int zze;

    @SafeParcelable.Field(id = 7)
    public int zzf;

    @SafeParcelable.Field(id = 8)
    public boolean zzg;

    @SafeParcelable.Field(id = 9)
    public String zzh;

    @SafeParcelable.Constructor
    public zzj(@SafeParcelable.Param(id = 2) int i14, @SafeParcelable.Param(id = 3) int i15, @SafeParcelable.Param(id = 4) int i16, @SafeParcelable.Param(id = 5) int i17, @SafeParcelable.Param(id = 6) int i18, @SafeParcelable.Param(id = 7) int i19, @SafeParcelable.Param(id = 8) boolean z14, @SafeParcelable.Param(id = 9) String str) {
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
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        SafeParcelWriter.writeInt(parcel, 6, this.zze);
        SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzj() {
    }
}
