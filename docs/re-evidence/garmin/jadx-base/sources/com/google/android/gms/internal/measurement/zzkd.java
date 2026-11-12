package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes14.dex */
final class zzkd extends zzkm {
    public zzkd(zzkg zzkgVar, String str, Boolean bool, boolean z14) {
        super(zzkgVar, str, bool, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzjg.zzc.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzjg.zzd.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        new StringBuilder(this.zzb.length() + 28 + obj.toString().length());
        return null;
    }
}
