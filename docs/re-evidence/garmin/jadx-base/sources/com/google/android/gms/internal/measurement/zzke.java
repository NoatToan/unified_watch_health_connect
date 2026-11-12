package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes14.dex */
final class zzke extends zzkm {
    public zzke(zzkg zzkgVar, String str, Double d14, boolean z14) {
        super(zzkgVar, "measurement.test.double_flag", d14, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        new StringBuilder(this.zzb.length() + 27 + obj.toString().length());
        return null;
    }
}
