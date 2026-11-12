package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.maps.zzbo;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "FeatureLayerOptionsCreator")
public final class FeatureLayerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FeatureLayerOptions> CREATOR = new zzg();
    private static final zzbo zza = zzbo.zzi(FeatureType.ADMINISTRATIVE_AREA_LEVEL_1, FeatureType.ADMINISTRATIVE_AREA_LEVEL_2, FeatureType.COUNTRY, FeatureType.LOCALITY, FeatureType.POSTAL_CODE, FeatureType.SCHOOL_DISTRICT, FeatureType.DATASET);

    @SafeParcelable.Field(getter = "getFeatureType", id = 1)
    @FeatureType
    private final String zzb;

    @SafeParcelable.Field(getter = "getDatasetId", id = 2)
    private final String zzc;

    public static final class Builder {
        private String zza;
        private String zzb;

        public FeatureLayerOptions build() {
            String str = this.zza;
            if (str == null) {
                h.s("FeatureType must be specified.");
                return null;
            }
            if (!str.equals(FeatureType.DATASET) || this.zzb != null) {
                return new FeatureLayerOptions(this, (zzf) null);
            }
            h.s("A datasetId must be specified for DATASET feature layers.");
            return null;
        }

        public Builder datasetId(String str) {
            this.zzb = str;
            return this;
        }

        public Builder featureType(@FeatureType String str) {
            Preconditions.checkArgument(FeatureLayerOptions.zza.contains(str), "Invalid FeatureType value");
            this.zza = str;
            return this;
        }
    }

    public /* synthetic */ FeatureLayerOptions(Builder builder, zzf zzfVar) {
        this.zzb = builder.zza;
        this.zzc = builder.zzb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getDatasetId() {
        return this.zzc;
    }

    @FeatureType
    public String getFeatureType() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getFeatureType(), false);
        SafeParcelWriter.writeString(parcel, 2, getDatasetId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public FeatureLayerOptions(@SafeParcelable.Param(id = 1) @FeatureType String str, @SafeParcelable.Param(id = 2) String str2) {
        this.zzb = str;
        this.zzc = str2;
    }
}
