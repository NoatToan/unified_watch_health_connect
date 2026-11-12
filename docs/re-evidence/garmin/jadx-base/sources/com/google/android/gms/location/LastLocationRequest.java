package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import i3.e5;
import org.apache.commons.lang3.BooleanUtils;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "LastLocationRequestCreator")
public final class LastLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new zzbm();

    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getMaxUpdateAgeMillis", id = 1)
    private final long zza;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.location.Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 2)
    private final int zzb;

    @SafeParcelable.Field(defaultValue = BooleanUtils.FALSE, getter = "isBypass", id = 3)
    private final boolean zzc;

    @SafeParcelable.Constructor
    public LastLocationRequest(@SafeParcelable.Param(id = 1) long j8, @SafeParcelable.Param(id = 2) int i14, @SafeParcelable.Param(id = 3) boolean z14) {
        this.zza = j8;
        this.zzb = i14;
        this.zzc = z14;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        return this.zza == lastLocationRequest.zza && this.zzb == lastLocationRequest.zzb && this.zzc == lastLocationRequest.zzc;
    }

    public int getGranularity() {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Integer.valueOf(this.zzb), Boolean.valueOf(this.zzc));
    }

    public String toString() {
        StringBuilder sbK = e5.k("LastLocationRequest[");
        if (this.zza != Long.MAX_VALUE) {
            sbK.append("maxAge=");
            com.google.android.gms.internal.location.zzbo.zza(this.zza, sbK);
        }
        if (this.zzb != 0) {
            sbK.append(", ");
            sbK.append(zzbc.zzb(this.zzb));
        }
        if (this.zzc) {
            sbK.append(", bypass");
        }
        sbK.append(']');
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 2, getGranularity());
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public static class Builder {
        private long zza;
        private int zzb;
        private boolean zzc;

        public Builder(LastLocationRequest lastLocationRequest) {
            this.zza = lastLocationRequest.getMaxUpdateAgeMillis();
            this.zzb = lastLocationRequest.getGranularity();
            this.zzc = lastLocationRequest.zza();
        }

        public LastLocationRequest build() {
            return new LastLocationRequest(this.zza, this.zzb, this.zzc);
        }

        public Builder setGranularity(int i14) {
            zzbc.zza(i14);
            this.zzb = i14;
            return this;
        }

        public Builder setMaxUpdateAgeMillis(long j8) {
            Preconditions.checkArgument(j8 > 0, "maxUpdateAgeMillis must be greater than 0");
            this.zza = j8;
            return this;
        }

        public Builder() {
            this.zza = Long.MAX_VALUE;
            this.zzb = 0;
            this.zzc = false;
        }
    }
}
