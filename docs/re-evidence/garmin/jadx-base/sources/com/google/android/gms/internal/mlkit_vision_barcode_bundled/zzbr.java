package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "MlBinarizerOptionsParcelCreator")
public final class zzbr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbr> CREATOR = new zzbs();

    @SafeParcelable.Field(getter = "getUseMlBinarizerSequenceFor2d", id = 1)
    private final boolean zza;

    @SafeParcelable.Field(getter = "getBinarizerModelData", id = 2)
    private final byte[] zzb;

    @SafeParcelable.Field(getter = "getUseNnapi", id = 3)
    private final boolean zzc;

    @SafeParcelable.Field(getter = "getForegroundThreshold", id = 4)
    private final float zzd;

    @SafeParcelable.Field(getter = "getUsePaddedInput", id = 5)
    private final boolean zze;

    @SafeParcelable.Constructor
    public zzbr(@SafeParcelable.Param(id = 1) boolean z14, @SafeParcelable.Param(id = 2) byte[] bArr, @SafeParcelable.Param(id = 3) boolean z15, @SafeParcelable.Param(id = 4) float f14, @SafeParcelable.Param(id = 5) boolean z16) {
        this.zza = z14;
        this.zzb = bArr;
        this.zzc = z15;
        this.zzd = f14;
        this.zze = z16;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        boolean z14 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, z14);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeFloat(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
