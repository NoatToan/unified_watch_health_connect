package com.google.android.gms.internal.common;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes14.dex */
final class zzs extends zzv {
    final /* synthetic */ zzp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzw zzwVar, CharSequence charSequence, zzp zzpVar) {
        super(zzwVar, charSequence);
        this.zza = zzpVar;
    }

    @Override // com.google.android.gms.internal.common.zzv
    public final int zzc(int i14) {
        CharSequence charSequence = ((zzv) this).zzb;
        int length = charSequence.length();
        zzr.zzc(i14, length, FirebaseAnalytics.Param.INDEX);
        while (i14 < length) {
            if (this.zza.zza(charSequence.charAt(i14))) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzv
    public final int zzd(int i14) {
        return i14 + 1;
    }
}
