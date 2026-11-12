package com.google.android.odml.image;

import am.j;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzb extends zzh {
    private Integer zza;
    private Integer zzb;

    @Override // com.google.android.odml.image.zzh
    public final zzh zza(int i14) {
        this.zza = Integer.valueOf(i14);
        return this;
    }

    @Override // com.google.android.odml.image.zzh
    public final zzh zzb(int i14) {
        this.zzb = Integer.valueOf(i14);
        return this;
    }

    @Override // com.google.android.odml.image.zzh
    public final ImageProperties zzc() {
        Integer num = this.zza;
        if (num != null && this.zzb != null) {
            return new zzc(num.intValue(), this.zzb.intValue(), null);
        }
        StringBuilder sb3 = new StringBuilder();
        if (this.zza == null) {
            sb3.append(" imageFormat");
        }
        if (this.zzb == null) {
            sb3.append(" storageType");
        }
        String strValueOf = String.valueOf(sb3);
        h.z(j.o("Missing required properties:", strValueOf, new StringBuilder(strValueOf.length() + 28)));
        return null;
    }
}
