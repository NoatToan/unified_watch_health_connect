package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes14.dex */
@ShowFirstParty
public final class zzk {
    private long zza = Long.MIN_VALUE;

    public final zzk zza(long j8) {
        Preconditions.checkArgument(j8 >= 0, "intervalMillis can't be negative.");
        this.zza = j8;
        return this;
    }

    public final zzl zzb() {
        Preconditions.checkState(this.zza != Long.MIN_VALUE, "Must set intervalMillis.");
        return new zzl(this.zza, true, null, null, null, false, null, 0L, null);
    }
}
