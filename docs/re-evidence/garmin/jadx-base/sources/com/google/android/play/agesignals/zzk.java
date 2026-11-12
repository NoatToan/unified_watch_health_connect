package com.google.android.play.agesignals;

import android.app.Activity;
import j20.x;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzk extends AgeSignalsAccessRequest.Builder {
    private Activity zza;

    @Override // com.google.android.play.agesignals.AgeSignalsAccessRequest.Builder
    public final AgeSignalsAccessRequest build() {
        Activity activity = this.zza;
        if (activity != null) {
            return new zzm(activity, null);
        }
        h.z("Missing required properties: activity");
        return null;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsAccessRequest.Builder
    public final AgeSignalsAccessRequest.Builder setActivity(Activity activity) {
        if (activity != null) {
            this.zza = activity;
            return this;
        }
        x.l("Null activity");
        return null;
    }
}
