package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.j;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "ComplianceOptionsCreator")
public final class ComplianceOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ComplianceOptions> CREATOR;
    public static final ComplianceOptions zza;

    @SafeParcelable.Field(getter = "getCallerProductId", id = 1)
    private final int zzb;

    @SafeParcelable.Field(getter = "getDataOwnerProductId", id = 2)
    private final int zzc;

    @SafeParcelable.Field(getter = "getProcessingReason", id = 3)
    private final int zzd;

    @SafeParcelable.Field(defaultValue = BooleanUtils.TRUE, getter = "isUserData", id = 4)
    private final boolean zze;

    @KeepForSdk
    public static final class Builder {
        private int zza = -1;
        private int zzb = -1;
        private int zzc = 0;
        private boolean zzd = true;

        @KeepForSdk
        public ComplianceOptions build() {
            return new ComplianceOptions(this.zza, this.zzb, this.zzc, this.zzd);
        }

        @KeepForSdk
        public Builder setCallerProductId(int i14) {
            this.zza = i14;
            return this;
        }

        @KeepForSdk
        public Builder setDataOwnerProductId(int i14) {
            this.zzb = i14;
            return this;
        }

        @KeepForSdk
        public Builder setIsUserData(boolean z14) {
            this.zzd = z14;
            return this;
        }

        @KeepForSdk
        public Builder setProcessingReason(int i14) {
            this.zzc = i14;
            return this;
        }
    }

    static {
        Builder builderNewBuilder = newBuilder();
        builderNewBuilder.setCallerProductId(-1);
        builderNewBuilder.setDataOwnerProductId(-1);
        builderNewBuilder.setProcessingReason(0);
        builderNewBuilder.setIsUserData(true);
        zza = builderNewBuilder.build();
        CREATOR = new zzc();
    }

    @SafeParcelable.Constructor
    public ComplianceOptions(@SafeParcelable.Param(id = 1) int i14, @SafeParcelable.Param(id = 2) int i15, @SafeParcelable.Param(id = 3) int i16, @SafeParcelable.Param(id = 4) boolean z14) {
        this.zzb = i14;
        this.zzc = i15;
        this.zzd = i16;
        this.zze = z14;
    }

    @KeepForSdk
    public static Builder newBuilder() {
        return new Builder();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ComplianceOptions)) {
            return false;
        }
        ComplianceOptions complianceOptions = (ComplianceOptions) obj;
        return this.zzb == complianceOptions.zzb && this.zzc == complianceOptions.zzc && this.zzd == complianceOptions.zzd && this.zze == complianceOptions.zze;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), Boolean.valueOf(this.zze));
    }

    @KeepForSdk
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setCallerProductId(this.zzb);
        builder.setDataOwnerProductId(this.zzc);
        builder.setProcessingReason(this.zzd);
        builder.setIsUserData(this.zze);
        return builder;
    }

    public final String toString() {
        int i14 = this.zzb;
        int length = String.valueOf(i14).length();
        int i15 = this.zzc;
        int length2 = String.valueOf(i15).length();
        int i16 = this.zzd;
        int length3 = String.valueOf(i16).length();
        boolean z14 = this.zze;
        StringBuilder sb3 = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z14).length() + 1);
        j.m(i14, i15, "ComplianceOptions{callerProductId=", ", dataOwnerProductId=", sb3);
        sb3.append(", processingReason=");
        sb3.append(i16);
        sb3.append(", isUserData=");
        sb3.append(z14);
        sb3.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        int i15 = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i15);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @KeepForSdk
    public static final Builder newBuilder(Context context) {
        return newBuilder();
    }
}
