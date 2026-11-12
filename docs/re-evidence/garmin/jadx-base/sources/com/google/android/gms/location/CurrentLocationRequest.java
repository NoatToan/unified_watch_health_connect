package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;
import i3.e5;
import org.apache.commons.lang3.BooleanUtils;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "CurrentLocationRequestCreator")
public final class CurrentLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = new zzt();

    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getMaxUpdateAgeMillis", id = 1)
    private final long zza;

    @SafeParcelable.Field(defaultValueUnchecked = "Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 2)
    private final int zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", getter = "getPriority", id = 3)
    private final int zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getDurationMillis", id = 4)
    private final long zzd;

    @SafeParcelable.Field(defaultValue = BooleanUtils.FALSE, getter = "isBypass", id = 5)
    private final boolean zze;

    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.WorkSource()", getter = "getWorkSource", id = 6)
    private final WorkSource zzf;

    @SafeParcelable.Constructor
    public CurrentLocationRequest(@SafeParcelable.Param(id = 1) long j8, @SafeParcelable.Param(id = 2) int i14, @SafeParcelable.Param(id = 3) int i15, @SafeParcelable.Param(id = 4) long j14, @SafeParcelable.Param(id = 5) boolean z14, @SafeParcelable.Param(id = 6) WorkSource workSource) {
        this.zza = j8;
        this.zzb = i14;
        this.zzc = i15;
        this.zzd = j14;
        this.zze = z14;
        this.zzf = workSource;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
        return this.zza == currentLocationRequest.zza && this.zzb == currentLocationRequest.zzb && this.zzc == currentLocationRequest.zzc && this.zzd == currentLocationRequest.zzd && this.zze == currentLocationRequest.zze && Objects.equal(this.zzf, currentLocationRequest.zzf);
    }

    public long getDurationMillis() {
        return this.zzd;
    }

    public int getGranularity() {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.zza;
    }

    public int getPriority() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Long.valueOf(this.zzd));
    }

    public String toString() {
        String str;
        StringBuilder sbK = e5.k("CurrentLocationRequest[");
        int i14 = this.zzc;
        if (i14 == 100) {
            str = "HIGH_ACCURACY";
        } else if (i14 == 102) {
            str = "BALANCED_POWER_ACCURACY";
        } else if (i14 == 104) {
            str = "LOW_POWER";
        } else {
            if (i14 != 105) {
                h.w();
                return null;
            }
            str = "PASSIVE";
        }
        sbK.append(str);
        if (this.zza != Long.MAX_VALUE) {
            sbK.append(", maxAge=");
            com.google.android.gms.internal.location.zzbo.zza(this.zza, sbK);
        }
        if (this.zzd != Long.MAX_VALUE) {
            sbK.append(", duration=");
            sbK.append(this.zzd);
            sbK.append("ms");
        }
        if (this.zzb != 0) {
            sbK.append(", ");
            sbK.append(zzbc.zzb(this.zzb));
        }
        if (this.zze) {
            sbK.append(", bypass");
        }
        if (!WorkSourceUtil.isEmpty(this.zzf)) {
            sbK.append(", workSource=");
            sbK.append(this.zzf);
        }
        sbK.append(']');
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 2, getGranularity());
        SafeParcelWriter.writeInt(parcel, 3, getPriority());
        SafeParcelWriter.writeLong(parcel, 4, getDurationMillis());
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i14, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final WorkSource zza() {
        return this.zzf;
    }

    public final boolean zzb() {
        return this.zze;
    }

    public static class Builder {
        private long zza;
        private int zzb;
        private int zzc;
        private long zzd;
        private boolean zze;
        private WorkSource zzf;

        public Builder(CurrentLocationRequest currentLocationRequest) {
            this.zza = currentLocationRequest.getMaxUpdateAgeMillis();
            this.zzb = currentLocationRequest.getGranularity();
            this.zzc = currentLocationRequest.getPriority();
            this.zzd = currentLocationRequest.getDurationMillis();
            this.zze = currentLocationRequest.zzb();
            this.zzf = new WorkSource(currentLocationRequest.zza());
        }

        public CurrentLocationRequest build() {
            return new CurrentLocationRequest(this.zza, this.zzb, this.zzc, this.zzd, this.zze, new WorkSource(this.zzf));
        }

        public Builder setDurationMillis(long j8) {
            Preconditions.checkArgument(j8 > 0, "durationMillis must be greater than 0");
            this.zzd = j8;
            return this;
        }

        public Builder setGranularity(int i14) {
            zzbc.zza(i14);
            this.zzb = i14;
            return this;
        }

        public Builder setMaxUpdateAgeMillis(long j8) {
            Preconditions.checkArgument(j8 >= 0, "maxUpdateAgeMillis must be greater than or equal to 0");
            this.zza = j8;
            return this;
        }

        public Builder setPriority(int i14) {
            int i15;
            boolean z14 = true;
            if (i14 == 100 || i14 == 102 || i14 == 104) {
                i15 = i14;
            } else {
                i15 = 105;
                if (i14 == 105) {
                    i14 = 105;
                } else {
                    z14 = false;
                    i15 = i14;
                }
            }
            Preconditions.checkArgument(z14, "priority %d must be a Priority.PRIORITY_* constants", Integer.valueOf(i14));
            this.zzc = i15;
            return this;
        }

        public final Builder zza(boolean z14) {
            this.zze = z14;
            return this;
        }

        public final Builder zzb(WorkSource workSource) {
            this.zzf = workSource;
            return this;
        }

        public Builder() {
            this.zza = 60000L;
            this.zzb = 0;
            this.zzc = 102;
            this.zzd = Long.MAX_VALUE;
            this.zze = false;
            this.zzf = null;
        }
    }
}
