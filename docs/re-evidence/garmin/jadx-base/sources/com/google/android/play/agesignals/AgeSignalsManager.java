package com.google.android.play.agesignals;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes14.dex */
public interface AgeSignalsManager {
    Task<AgeSignalsResult> checkAgeSignals(AgeSignalsRequest ageSignalsRequest);

    Task<AgeSignalsAccessResult> requestAgeSignalsAccess(AgeSignalsAccessRequest ageSignalsAccessRequest);
}
