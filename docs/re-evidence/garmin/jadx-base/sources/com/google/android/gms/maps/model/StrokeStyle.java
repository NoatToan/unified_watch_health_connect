package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "StrokeStyleCreator")
@SafeParcelable.Reserved({1})
public final class StrokeStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StrokeStyle> CREATOR = new zzad();

    @SafeParcelable.Field(getter = "getWidth", id = 2)
    private final float zza;

    @SafeParcelable.Field(getter = "getColor", id = 3)
    private final int zzb;

    @SafeParcelable.Field(getter = "getToColor", id = 4)
    private final int zzc;

    @SafeParcelable.Field(getter = "isVisible", id = 5)
    private final boolean zzd;

    @SafeParcelable.Field(getter = "getStamp", id = 6)
    private final StampStyle zze;

    @SafeParcelable.Constructor
    public StrokeStyle(@SafeParcelable.Param(id = 2) float f14, @SafeParcelable.Param(id = 3) int i14, @SafeParcelable.Param(id = 4) int i15, @SafeParcelable.Param(id = 5) boolean z14, @SafeParcelable.Param(id = 6) StampStyle stampStyle) {
        this.zza = f14;
        this.zzb = i14;
        this.zzc = i15;
        this.zzd = z14;
        this.zze = stampStyle;
    }

    public static Builder colorBuilder(int i14) {
        Builder builder = new Builder((zzac) null);
        builder.zza(i14);
        return builder;
    }

    public static Builder gradientBuilder(int i14, int i15) {
        Builder builder = new Builder((zzac) null);
        builder.zzb(i14, i15);
        return builder;
    }

    public static Builder transparentColorBuilder() {
        Builder builder = new Builder((zzac) null);
        builder.zza(0);
        return builder;
    }

    public StampStyle getStamp() {
        return this.zze;
    }

    public boolean isVisible() {
        return this.zzd;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, this.zza);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, isVisible());
        SafeParcelWriter.writeParcelable(parcel, 6, getStamp(), i14, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final float zza() {
        return this.zza;
    }

    public final Pair zzb() {
        return new Pair(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    public static final class Builder {
        private float zza;
        private int zzb;
        private int zzc;
        private boolean zzd;
        private StampStyle zze;

        public Builder(StrokeStyle strokeStyle) {
            this.zza = strokeStyle.zza();
            Pair pairZzb = strokeStyle.zzb();
            this.zzb = ((Integer) pairZzb.first).intValue();
            this.zzc = ((Integer) pairZzb.second).intValue();
            this.zzd = strokeStyle.isVisible();
            this.zze = strokeStyle.getStamp();
        }

        public StrokeStyle build() {
            return new StrokeStyle(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }

        public Builder stamp(StampStyle stampStyle) {
            this.zze = stampStyle;
            return this;
        }

        public final Builder zza(int i14) {
            this.zzb = i14;
            this.zzc = i14;
            return this;
        }

        public final Builder zzb(int i14, int i15) {
            this.zzb = i14;
            this.zzc = i15;
            return this;
        }

        public final Builder zzc(boolean z14) {
            this.zzd = z14;
            return this;
        }

        public final Builder zzd(float f14) {
            this.zza = f14;
            return this;
        }

        public /* synthetic */ Builder(zzac zzacVar) {
        }

        private Builder() {
            throw null;
        }
    }
}
