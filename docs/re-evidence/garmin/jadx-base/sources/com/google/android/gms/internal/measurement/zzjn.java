package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.common.base.Supplier;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes14.dex */
final class zzjn extends zzkh {
    private final Context zza;
    private final Supplier zzb;

    public zzjn(Context context, Supplier supplier) {
        this.zza = context;
        this.zzb = supplier;
    }

    public final boolean equals(Object obj) {
        Supplier supplier;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzkh) {
            zzkh zzkhVar = (zzkh) obj;
            if (this.zza.equals(zzkhVar.zza()) && ((supplier = this.zzb) != null ? supplier.equals(zzkhVar.zzb()) : zzkhVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        Supplier supplier = this.zzb;
        return (iHashCode * 1000003) ^ (supplier == null ? 0 : supplier.hashCode());
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb3 = new StringBuilder(length + 45 + strValueOf.length() + 1);
        sn.a.t(sb3, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb3.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb3.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    public final Supplier zzb() {
        return this.zzb;
    }
}
