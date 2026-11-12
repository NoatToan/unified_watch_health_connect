package com.google.android.play.agesignals;

import com.garmin.android.apps.connectmobile.f3;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes14.dex */
final class zzp extends AgeSignalsAccessResult {
    private final Integer zza;

    public /* synthetic */ zzp(Integer num, zzo zzoVar) {
        this.zza = num;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsAccessResult
    public final Integer ageSignalsStatus() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AgeSignalsAccessResult)) {
            return false;
        }
        AgeSignalsAccessResult ageSignalsAccessResult = (AgeSignalsAccessResult) obj;
        Integer num = this.zza;
        if (num == null) {
            return ageSignalsAccessResult.ageSignalsStatus() == null;
        }
        return num.equals(ageSignalsAccessResult.ageSignalsStatus());
    }

    public final int hashCode() {
        Integer num = this.zza;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return f3.i(new StringBuilder("AgeSignalsAccessResult{ageSignalsStatus="), this.zza, StringSubstitutor.DEFAULT_VAR_END);
    }
}
