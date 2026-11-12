package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "FeatureStyleCreator")
public final class FeatureStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FeatureStyle> CREATOR = new zzi();

    @SafeParcelable.Field(getter = "getFillColor", id = 1)
    private final Integer zza;

    @SafeParcelable.Field(getter = "getStrokeColor", id = 2)
    private final Integer zzb;

    @SafeParcelable.Field(getter = "getStrokeWidth", id = 3)
    private final Float zzc;

    @SafeParcelable.Field(getter = "getPointRadius", id = 4)
    private final Float zzd;

    public static final class Builder {
        private Integer zza;
        private Integer zzb;
        private Float zzc;
        private Float zzd;

        public FeatureStyle build() {
            return new FeatureStyle(this, null);
        }

        public Builder fillColor(int i14) {
            this.zza = Integer.valueOf(i14);
            return this;
        }

        public Builder pointRadius(float f14) {
            Preconditions.checkArgument(f14 >= 0.0f, "Point radius cannot be negative.");
            Preconditions.checkArgument(f14 <= 128.0f, "The max allowed pointRadius value is 128px.");
            this.zzd = Float.valueOf(f14);
            return this;
        }

        public Builder strokeColor(int i14) {
            this.zzb = Integer.valueOf(i14);
            return this;
        }

        public Builder strokeWidth(float f14) {
            Preconditions.checkArgument(f14 >= 0.0f, "Stroke width cannot be negative.");
            this.zzc = Float.valueOf(f14);
            return this;
        }
    }

    public /* synthetic */ FeatureStyle(Builder builder, zzh zzhVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
        this.zzd = builder.zzd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getFillColor() {
        return this.zza;
    }

    public Float getPointRadius() {
        return this.zzd;
    }

    public Integer getStrokeColor() {
        return this.zzb;
    }

    public Float getStrokeWidth() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerObject(parcel, 1, getFillColor(), false);
        SafeParcelWriter.writeIntegerObject(parcel, 2, getStrokeColor(), false);
        SafeParcelWriter.writeFloatObject(parcel, 3, getStrokeWidth(), false);
        SafeParcelWriter.writeFloatObject(parcel, 4, getPointRadius(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public FeatureStyle(@SafeParcelable.Param(id = 1) Integer num, @SafeParcelable.Param(id = 2) Integer num2, @SafeParcelable.Param(id = 3) Float f14, @SafeParcelable.Param(id = 4) Float f15) {
        this.zza = num;
        this.zzb = num2;
        this.zzc = f14;
        this.zzd = f15;
    }
}
