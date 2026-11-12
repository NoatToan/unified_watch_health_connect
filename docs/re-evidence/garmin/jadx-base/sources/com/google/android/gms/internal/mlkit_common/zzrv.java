package com.google.android.gms.internal.mlkit_common;

import com.google.mlkit.common.sdkinternal.ModelType;
import j20.x;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzrv extends zzsi {
    private zzmu zza;
    private String zzb;
    private boolean zzc;
    private boolean zzd;
    private ModelType zze;
    private zzna zzf;
    private int zzg;
    private byte zzh;

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zza(zzna zznaVar) {
        if (zznaVar != null) {
            this.zzf = zznaVar;
            return this;
        }
        x.l("Null downloadStatus");
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zzb(zzmu zzmuVar) {
        if (zzmuVar != null) {
            this.zza = zzmuVar;
            return this;
        }
        x.l("Null errorCode");
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zzc(int i14) {
        this.zzg = i14;
        this.zzh = (byte) (this.zzh | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zzd(ModelType modelType) {
        if (modelType != null) {
            this.zze = modelType;
            return this;
        }
        x.l("Null modelType");
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zze(boolean z14) {
        this.zzd = z14;
        this.zzh = (byte) (this.zzh | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zzf(boolean z14) {
        this.zzc = z14;
        this.zzh = (byte) (this.zzh | 1);
        return this;
    }

    public final zzsi zzg(String str) {
        this.zzb = "NA";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsj zzh() {
        zzmu zzmuVar;
        String str;
        ModelType modelType;
        zzna zznaVar;
        if (this.zzh == 7 && (zzmuVar = this.zza) != null && (str = this.zzb) != null && (modelType = this.zze) != null && (zznaVar = this.zzf) != null) {
            return new zzrx(zzmuVar, str, this.zzc, this.zzd, modelType, zznaVar, this.zzg, null);
        }
        StringBuilder sb3 = new StringBuilder();
        if (this.zza == null) {
            sb3.append(" errorCode");
        }
        if (this.zzb == null) {
            sb3.append(" tfliteSchemaVersion");
        }
        if ((this.zzh & 1) == 0) {
            sb3.append(" shouldLogRoughDownloadTime");
        }
        if ((this.zzh & 2) == 0) {
            sb3.append(" shouldLogExactDownloadTime");
        }
        if (this.zze == null) {
            sb3.append(" modelType");
        }
        if (this.zzf == null) {
            sb3.append(" downloadStatus");
        }
        if ((this.zzh & 4) == 0) {
            sb3.append(" failureStatusCode");
        }
        h.z("Missing required properties:".concat(sb3.toString()));
        return null;
    }
}
