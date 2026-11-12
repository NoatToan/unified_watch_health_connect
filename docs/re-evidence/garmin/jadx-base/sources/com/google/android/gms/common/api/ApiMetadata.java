package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import v.e0;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "ApiMetadataCreator")
public final class ApiMetadata extends AbstractSafeParcelable {
    public static final ApiMetadata zza;

    @SafeParcelable.Field(getter = "getComplianceOptions", id = 1)
    private final ComplianceOptions zzc;

    @SafeParcelable.Field(getter = "isCallbackSupportEnabled", id = 2)
    private final boolean zzd;
    private boolean zze;
    public static final Parcelable.Creator<ApiMetadata> CREATOR = zza.zza();
    private static final ApiMetadata zzb = newBuilder().build();

    @KeepForSdk
    public static final class Builder {
        private ComplianceOptions zza;
        private boolean zzb = false;
        private boolean zzc;

        @KeepForSdk
        public ApiMetadata build() {
            ApiMetadata apiMetadata = new ApiMetadata(this.zza, this.zzb);
            apiMetadata.zza(this.zzc);
            return apiMetadata;
        }

        @KeepForSdk
        public Builder setCallbackSupportEnabled(boolean z14) {
            this.zzb = z14;
            return this;
        }

        @KeepForSdk
        public Builder setComplianceOptions(ComplianceOptions complianceOptions) {
            this.zza = complianceOptions;
            return this;
        }

        public final /* synthetic */ Builder zza(boolean z14) {
            this.zzc = z14;
            return this;
        }
    }

    static {
        Builder builderNewBuilder = newBuilder();
        builderNewBuilder.zza(true);
        zza = builderNewBuilder.build();
    }

    @SafeParcelable.Constructor
    public ApiMetadata(@SafeParcelable.Param(id = 1) ComplianceOptions complianceOptions, @SafeParcelable.Param(id = 2) boolean z14) {
        this.zzc = complianceOptions;
        this.zzd = z14;
    }

    @KeepForSdk
    public static final ApiMetadata fromComplianceOptions(ComplianceOptions complianceOptions) {
        Builder builderNewBuilder = newBuilder();
        builderNewBuilder.setComplianceOptions(complianceOptions);
        return builderNewBuilder.build();
    }

    @KeepForSdk
    public static final ApiMetadata getEmptyInstance() {
        return zzb;
    }

    @KeepForSdk
    public static Builder newBuilder() {
        return new Builder();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ApiMetadata)) {
            return false;
        }
        ApiMetadata apiMetadata = (ApiMetadata) obj;
        return Objects.equal(this.zzc, apiMetadata.zzc) && this.zze == apiMetadata.zze && this.zzd == apiMetadata.zzd;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzc, Boolean.valueOf(this.zze), Boolean.valueOf(this.zzd));
    }

    @KeepForSdk
    public Builder toBuilder() {
        Builder builderNewBuilder = newBuilder();
        builderNewBuilder.setComplianceOptions(this.zzc);
        builderNewBuilder.setCallbackSupportEnabled(this.zzd);
        builderNewBuilder.zza(this.zze);
        return builderNewBuilder;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        return e0.h(new StringBuilder(strValueOf.length() + 31), "ApiMetadata(complianceOptions=", strValueOf, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        if (this.zze) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zzc, i14, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final /* synthetic */ void zza(boolean z14) {
        this.zze = z14;
    }
}
