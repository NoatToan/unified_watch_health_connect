package com.google.android.play.agesignals;

/* JADX INFO: loaded from: classes14.dex */
final class zzn extends AgeSignalsAccessResult.Builder {
    private Integer zza;

    @Override // com.google.android.play.agesignals.AgeSignalsAccessResult.Builder
    public final AgeSignalsAccessResult build() {
        return new zzp(this.zza, null);
    }

    @Override // com.google.android.play.agesignals.AgeSignalsAccessResult.Builder
    public final AgeSignalsAccessResult.Builder setAgeSignalsStatus(Integer num) {
        this.zza = num;
        return this;
    }
}
