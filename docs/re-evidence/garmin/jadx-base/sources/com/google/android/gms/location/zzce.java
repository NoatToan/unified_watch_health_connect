package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.j;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "UserPreferredSleepWindowCreator")
@SafeParcelable.Reserved({1000})
public final class zzce extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzce> CREATOR = new zzcf();

    @SafeParcelable.Field(getter = "getStartHour", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getStartMinute", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getEndHour", id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getEndMinute", id = 4)
    private final int zzd;

    @SafeParcelable.Constructor
    public zzce(@SafeParcelable.Param(id = 1) int i14, @SafeParcelable.Param(id = 2) int i15, @SafeParcelable.Param(id = 3) int i16, @SafeParcelable.Param(id = 4) int i17) {
        Preconditions.checkState(i14 >= 0 && i14 <= 23, "Start hour must be in range [0, 23].");
        Preconditions.checkState(i15 >= 0 && i15 <= 59, "Start minute must be in range [0, 59].");
        Preconditions.checkState(i16 >= 0 && i16 <= 23, "End hour must be in range [0, 23].");
        Preconditions.checkState(i17 >= 0 && i17 <= 59, "End minute must be in range [0, 59].");
        Preconditions.checkState(((i14 + i15) + i16) + i17 > 0, "Parameters can't be all 0.");
        this.zza = i14;
        this.zzb = i15;
        this.zzc = i16;
        this.zzd = i17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzce)) {
            return false;
        }
        zzce zzceVar = (zzce) obj;
        return this.zza == zzceVar.zza && this.zzb == zzceVar.zzb && this.zzc == zzceVar.zzc && this.zzd == zzceVar.zzd;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    public final String toString() {
        int i14 = this.zza;
        int i15 = this.zzb;
        int i16 = this.zzc;
        int i17 = this.zzd;
        StringBuilder sb3 = new StringBuilder(117);
        sb3.append("UserPreferredSleepWindow [startHour=");
        sb3.append(i14);
        sb3.append(", startMinute=");
        sb3.append(i15);
        j.m(i16, i17, ", endHour=", ", endMinute=", sb3);
        sb3.append(']');
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
