package com.google.android.play.agesignals;

import am.j;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;
import p6.b;

/* JADX INFO: loaded from: classes14.dex */
final class zzs extends AgeSignalsResult {
    private final Integer zza;
    private final Integer zzb;
    private final Integer zzc;
    private final Date zzd;
    private final Integer zze;
    private final String zzf;

    public /* synthetic */ zzs(Integer num, Integer num2, Integer num3, Date date, Integer num4, String str, zzr zzrVar) {
        this.zza = num;
        this.zzb = num2;
        this.zzc = num3;
        this.zzd = date;
        this.zze = num4;
        this.zzf = str;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult
    public final Integer ageLower() {
        return this.zzb;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult
    public final Integer ageRangeSource() {
        return this.zza;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult
    public final Integer ageUpper() {
        return this.zzc;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AgeSignalsResult) {
            AgeSignalsResult ageSignalsResult = (AgeSignalsResult) obj;
            Integer num = this.zza;
            if (num != null ? num.equals(ageSignalsResult.ageRangeSource()) : ageSignalsResult.ageRangeSource() == null) {
                Integer num2 = this.zzb;
                if (num2 != null ? num2.equals(ageSignalsResult.ageLower()) : ageSignalsResult.ageLower() == null) {
                    Integer num3 = this.zzc;
                    if (num3 != null ? num3.equals(ageSignalsResult.ageUpper()) : ageSignalsResult.ageUpper() == null) {
                        Date date = this.zzd;
                        if (date != null ? date.equals(ageSignalsResult.significantChangeApprovalDate()) : ageSignalsResult.significantChangeApprovalDate() == null) {
                            Integer num4 = this.zze;
                            if (num4 != null ? num4.equals(ageSignalsResult.significantChangeStatus()) : ageSignalsResult.significantChangeStatus() == null) {
                                String str = this.zzf;
                                if (str != null ? str.equals(ageSignalsResult.installId()) : ageSignalsResult.installId() == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.zza;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.zzb;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        int i14 = iHashCode ^ 1000003;
        Integer num3 = this.zzc;
        int iHashCode3 = ((((i14 * 1000003) ^ iHashCode2) * 1000003) ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Date date = this.zzd;
        int iHashCode4 = (iHashCode3 ^ (date == null ? 0 : date.hashCode())) * 1000003;
        Integer num4 = this.zze;
        int iHashCode5 = (iHashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
        String str = this.zzf;
        return iHashCode5 ^ (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult
    public final String installId() {
        return this.zzf;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult
    public final Date significantChangeApprovalDate() {
        return this.zzd;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult
    public final Integer significantChangeStatus() {
        return this.zze;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        StringBuilder sb3 = new StringBuilder("AgeSignalsResult{ageRangeSource=");
        sb3.append(this.zza);
        sb3.append(", ageLower=");
        sb3.append(this.zzb);
        sb3.append(", ageUpper=");
        b.l(this.zzc, ", significantChangeApprovalDate=", strValueOf, ", significantChangeStatus=", sb3);
        sb3.append(this.zze);
        sb3.append(", installId=");
        return j.o(this.zzf, StringSubstitutor.DEFAULT_VAR_END, sb3);
    }
}
