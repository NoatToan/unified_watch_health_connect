package com.google.android.play.agesignals;

import am.j;
import android.app.Activity;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes14.dex */
final class zzm extends AgeSignalsAccessRequest {
    private final Activity zza;

    public /* synthetic */ zzm(Activity activity, zzl zzlVar) {
        this.zza = activity;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsAccessRequest
    public final Activity activity() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AgeSignalsAccessRequest) {
            return this.zza.equals(((AgeSignalsAccessRequest) obj).activity());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        return j.m("AgeSignalsAccessRequest{activity=", this.zza.toString(), StringSubstitutor.DEFAULT_VAR_END);
    }
}
