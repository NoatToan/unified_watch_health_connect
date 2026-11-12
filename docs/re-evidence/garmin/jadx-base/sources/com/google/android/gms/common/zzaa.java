package com.google.android.gms.common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzah;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzaa {
    private String zza = null;
    private long zzb = -1;
    private zzah zzc = zzah.zzj();
    private zzah zzd = zzah.zzj();

    public final zzaa zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzaa zzb(long j8) {
        this.zzb = j8;
        return this;
    }

    public final zzaa zzc(List list) {
        Preconditions.checkNotNull(list);
        this.zzc = zzah.zzp(list);
        return this;
    }

    public final zzaa zzd(List list) {
        Preconditions.checkNotNull(list);
        this.zzd = zzah.zzp(list);
        return this;
    }

    public final zzab zze() {
        if (this.zza == null) {
            h.z("packageName must be defined");
            return null;
        }
        if (this.zzb < 0) {
            h.z("minimumStampedVersionNumber must be greater than or equal to 0");
            return null;
        }
        if (!this.zzc.isEmpty() || !this.zzd.isEmpty()) {
            return new zzab(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        h.z("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        return null;
    }
}
