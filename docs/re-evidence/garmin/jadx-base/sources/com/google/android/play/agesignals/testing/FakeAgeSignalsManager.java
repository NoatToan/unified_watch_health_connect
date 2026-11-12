package com.google.android.play.agesignals.testing;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.agesignals.AgeSignalsAccessRequest;
import com.google.android.play.agesignals.AgeSignalsAccessResult;
import com.google.android.play.agesignals.AgeSignalsException;
import com.google.android.play.agesignals.AgeSignalsManager;
import com.google.android.play.agesignals.AgeSignalsRequest;
import com.google.android.play.agesignals.AgeSignalsResult;

/* JADX INFO: loaded from: classes14.dex */
public class FakeAgeSignalsManager implements AgeSignalsManager {
    private AgeSignalsException zza;
    private AgeSignalsResult zzb;
    private AgeSignalsException zzc;
    private AgeSignalsAccessResult zzd;

    @Override // com.google.android.play.agesignals.AgeSignalsManager
    public Task<AgeSignalsResult> checkAgeSignals(AgeSignalsRequest ageSignalsRequest) {
        AgeSignalsException ageSignalsException = this.zza;
        if (ageSignalsException != null) {
            return Tasks.forException(ageSignalsException);
        }
        AgeSignalsResult ageSignalsResult = this.zzb;
        return ageSignalsResult != null ? Tasks.forResult(ageSignalsResult) : Tasks.forException(new IllegalStateException("FakeAgeSignalsManager not configured with a response or exception."));
    }

    @Override // com.google.android.play.agesignals.AgeSignalsManager
    public Task<AgeSignalsAccessResult> requestAgeSignalsAccess(AgeSignalsAccessRequest ageSignalsAccessRequest) {
        AgeSignalsException ageSignalsException = this.zzc;
        if (ageSignalsException != null) {
            return Tasks.forException(ageSignalsException);
        }
        AgeSignalsAccessResult ageSignalsAccessResult = this.zzd;
        return ageSignalsAccessResult != null ? Tasks.forResult(ageSignalsAccessResult) : Tasks.forException(new IllegalStateException("FakeAgeSignalsManager not configured with an age signals access response or exception."));
    }

    public void setNextAgeSignalsAccessResult(AgeSignalsAccessResult ageSignalsAccessResult) {
        this.zzc = null;
        this.zzd = ageSignalsAccessResult;
    }

    public void setNextAgeSignalsException(AgeSignalsException ageSignalsException) {
        this.zza = ageSignalsException;
        this.zzb = null;
    }

    public void setNextAgeSignalsResult(AgeSignalsResult ageSignalsResult) {
        this.zza = null;
        this.zzb = ageSignalsResult;
    }

    public void setNextRequestAgeSignalsAccessException(AgeSignalsException ageSignalsException) {
        this.zzc = ageSignalsException;
        this.zzd = null;
    }
}
