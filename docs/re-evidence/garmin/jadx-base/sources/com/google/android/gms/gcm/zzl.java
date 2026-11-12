package com.google.android.gms.gcm;

import android.os.Bundle;
import com.google.android.gms.common.internal.ShowFirstParty;
import j20.x;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes14.dex */
@ShowFirstParty
public final class zzl {
    public static final zzl zzaq = new zzl(0, 30, DateTimeConstants.SECONDS_PER_HOUR);
    private static final zzl zzar = new zzl(1, 30, DateTimeConstants.SECONDS_PER_HOUR);
    private final int zzas;
    private final int zzat = 30;
    private final int zzau = DateTimeConstants.SECONDS_PER_HOUR;

    private zzl(int i14, int i15, int i16) {
        this.zzas = i14;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzl)) {
            return false;
        }
        zzl zzlVar = (zzl) obj;
        return zzlVar.zzas == this.zzas && zzlVar.zzat == this.zzat && zzlVar.zzau == this.zzau;
    }

    public final int hashCode() {
        return (((((this.zzas + 1) ^ 1000003) * 1000003) ^ this.zzat) * 1000003) ^ this.zzau;
    }

    public final String toString() {
        int i14 = this.zzas;
        int i15 = this.zzat;
        int i16 = this.zzau;
        StringBuilder sb3 = new StringBuilder(74);
        sb3.append("policy=");
        sb3.append(i14);
        sb3.append(" initial_backoff=");
        sb3.append(i15);
        return x.e(sb3, i16, " maximum_backoff=");
    }

    public final Bundle zzf(Bundle bundle) {
        bundle.putInt("retry_policy", this.zzas);
        bundle.putInt("initial_backoff_seconds", this.zzat);
        bundle.putInt("maximum_backoff_seconds", this.zzau);
        return bundle;
    }

    public final int zzi() {
        return this.zzas;
    }

    public final int zzj() {
        return this.zzat;
    }

    public final int zzk() {
        return this.zzau;
    }
}
