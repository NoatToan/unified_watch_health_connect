package com.google.android.play.agesignals;

import java.util.Date;

/* JADX INFO: loaded from: classes14.dex */
final class zzq extends AgeSignalsResult.Builder {
    private Integer zza;
    private Integer zzb;
    private Integer zzc;
    private Date zzd;
    private Integer zze;
    private String zzf;

    @Override // com.google.android.play.agesignals.AgeSignalsResult.Builder
    public final AgeSignalsResult build() {
        return new zzs(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null);
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult.Builder
    public final AgeSignalsResult.Builder setAgeLower(Integer num) {
        this.zzb = num;
        return this;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult.Builder
    public final AgeSignalsResult.Builder setAgeRangeSource(Integer num) {
        this.zza = num;
        return this;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult.Builder
    public final AgeSignalsResult.Builder setAgeUpper(Integer num) {
        this.zzc = num;
        return this;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult.Builder
    public final AgeSignalsResult.Builder setInstallId(String str) {
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult.Builder
    public final AgeSignalsResult.Builder setSignificantChangeApprovalDate(Date date) {
        this.zzd = date;
        return this;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult.Builder
    public final AgeSignalsResult.Builder setSignificantChangeStatus(Integer num) {
        this.zze = num;
        return this;
    }
}
