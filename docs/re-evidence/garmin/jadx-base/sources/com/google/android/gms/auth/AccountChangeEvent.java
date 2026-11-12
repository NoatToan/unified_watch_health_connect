package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.v;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "AccountChangeEventCreator")
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new zza();

    @SafeParcelable.VersionField(id = 1)
    private final int zze;

    @SafeParcelable.Field(id = 2)
    private final long zzf;

    @SafeParcelable.Field(id = 3)
    private final String zzg;

    @SafeParcelable.Field(id = 4)
    private final int zzh;

    @SafeParcelable.Field(id = 5)
    private final int zzi;

    @SafeParcelable.Field(id = 6)
    private final String zzj;

    public AccountChangeEvent(long j8, String str, int i14, int i15, String str2) {
        this.zze = 1;
        this.zzf = j8;
        this.zzg = (String) Preconditions.checkNotNull(str);
        this.zzh = i14;
        this.zzi = i15;
        this.zzj = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AccountChangeEvent) {
            AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
            if (this.zze == accountChangeEvent.zze && this.zzf == accountChangeEvent.zzf && Objects.equal(this.zzg, accountChangeEvent.zzg) && this.zzh == accountChangeEvent.zzh && this.zzi == accountChangeEvent.zzi && Objects.equal(this.zzj, accountChangeEvent.zzj)) {
                return true;
            }
        }
        return false;
    }

    public String getAccountName() {
        return this.zzg;
    }

    public String getChangeData() {
        return this.zzj;
    }

    public int getChangeType() {
        return this.zzh;
    }

    public int getEventIndex() {
        return this.zzi;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zze), Long.valueOf(this.zzf), this.zzg, Integer.valueOf(this.zzh), Integer.valueOf(this.zzi), this.zzj);
    }

    public String toString() {
        String str;
        int i14 = this.zzh;
        if (i14 == 1) {
            str = "ADDED";
        } else if (i14 == 2) {
            str = "REMOVED";
        } else if (i14 != 3) {
            str = i14 != 4 ? "UNKNOWN" : "RENAMED_TO";
        } else {
            str = "RENAMED_FROM";
        }
        String str2 = this.zzg;
        String str3 = this.zzj;
        int i15 = this.zzi;
        StringBuilder sbD = v.d(v.a(str.length() + v.a(91, str2), str3), "AccountChangeEvent {accountName = ", str2, ", changeType = ", str);
        sbD.append(", changeData = ");
        sbD.append(str3);
        sbD.append(", eventIndex = ");
        sbD.append(i15);
        sbD.append(StringSubstitutor.DEFAULT_VAR_END);
        return sbD.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zze);
        SafeParcelWriter.writeLong(parcel, 2, this.zzf);
        SafeParcelWriter.writeString(parcel, 3, this.zzg, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzh);
        SafeParcelWriter.writeInt(parcel, 5, this.zzi);
        SafeParcelWriter.writeString(parcel, 6, this.zzj, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public AccountChangeEvent(@SafeParcelable.Param(id = 1) int i14, @SafeParcelable.Param(id = 2) long j8, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) int i15, @SafeParcelable.Param(id = 5) int i16, @SafeParcelable.Param(id = 6) String str2) {
        this.zze = i14;
        this.zzf = j8;
        this.zzg = (String) Preconditions.checkNotNull(str);
        this.zzh = i15;
        this.zzi = i16;
        this.zzj = str2;
    }
}
