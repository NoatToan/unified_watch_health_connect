package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.maps.zzay;
import com.google.android.gms.internal.maps.zzaz;
import org.apache.commons.lang3.BooleanUtils;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "TileOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new zzaj();

    @SafeParcelable.Field(getter = "getTileProviderDelegate", id = 2, type = "android.os.IBinder")
    private zzaz zza;
    private TileProvider zzb;

    @SafeParcelable.Field(getter = "isVisible", id = 3)
    private boolean zzc;

    @SafeParcelable.Field(getter = "getZIndex", id = 4)
    private float zzd;

    @SafeParcelable.Field(defaultValue = BooleanUtils.TRUE, getter = "getFadeIn", id = 5)
    private boolean zze;

    @SafeParcelable.Field(getter = "getTransparency", id = 6)
    private float zzf;

    @SafeParcelable.Constructor
    public TileOverlayOptions(@SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) boolean z14, @SafeParcelable.Param(id = 4) float f14, @SafeParcelable.Param(id = 5) boolean z15, @SafeParcelable.Param(id = 6) float f15) {
        this.zzc = true;
        this.zze = true;
        this.zzf = 0.0f;
        zzaz zzazVarZzc = zzay.zzc(iBinder);
        this.zza = zzazVarZzc;
        this.zzb = zzazVarZzc == null ? null : new zzah(this);
        this.zzc = z14;
        this.zzd = f14;
        this.zze = z15;
        this.zzf = f15;
    }

    public TileOverlayOptions fadeIn(boolean z14) {
        this.zze = z14;
        return this;
    }

    public boolean getFadeIn() {
        return this.zze;
    }

    public TileProvider getTileProvider() {
        return this.zzb;
    }

    public float getTransparency() {
        return this.zzf;
    }

    public float getZIndex() {
        return this.zzd;
    }

    public boolean isVisible() {
        return this.zzc;
    }

    public TileOverlayOptions tileProvider(TileProvider tileProvider) {
        this.zzb = (TileProvider) Preconditions.checkNotNull(tileProvider, "tileProvider must not be null.");
        this.zza = new zzai(this, tileProvider);
        return this;
    }

    public TileOverlayOptions transparency(float f14) {
        boolean z14 = false;
        if (f14 >= 0.0f && f14 <= 1.0f) {
            z14 = true;
        }
        Preconditions.checkArgument(z14, "Transparency must be in the range [0..1]");
        this.zzf = f14;
        return this;
    }

    public TileOverlayOptions visible(boolean z14) {
        this.zzc = z14;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzaz zzazVar = this.zza;
        SafeParcelWriter.writeIBinder(parcel, 2, zzazVar == null ? null : zzazVar.asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 3, isVisible());
        SafeParcelWriter.writeFloat(parcel, 4, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 5, getFadeIn());
        SafeParcelWriter.writeFloat(parcel, 6, getTransparency());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public TileOverlayOptions zIndex(float f14) {
        this.zzd = f14;
        return this;
    }

    public TileOverlayOptions() {
        this.zzc = true;
        this.zze = true;
        this.zzf = 0.0f;
    }
}
