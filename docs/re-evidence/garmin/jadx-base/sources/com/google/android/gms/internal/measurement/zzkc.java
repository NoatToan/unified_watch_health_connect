package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes14.dex */
final class zzkc extends zzkm {
    public zzkc(zzkg zzkgVar, String str, Long l14, boolean z14) {
        super(zzkgVar, str, l14, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        new StringBuilder(this.zzb.length() + 25 + obj.toString().length());
        return null;
    }
}
