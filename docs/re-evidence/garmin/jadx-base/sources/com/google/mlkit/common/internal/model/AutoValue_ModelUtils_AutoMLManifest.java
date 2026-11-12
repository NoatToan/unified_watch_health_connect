package com.google.mlkit.common.internal.model;

import am.j;
import com.google.android.gms.common.annotation.KeepForSdk;
import j20.x;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_ModelUtils_AutoMLManifest extends ModelUtils.AutoMLManifest {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public AutoValue_ModelUtils_AutoMLManifest(String str, String str2, String str3) {
        if (str == null) {
            x.l("Null modelType");
            throw null;
        }
        this.zza = str;
        if (str2 == null) {
            x.l("Null modelFile");
            throw null;
        }
        this.zzb = str2;
        if (str3 != null) {
            this.zzc = str3;
        } else {
            x.l("Null labelsFile");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ModelUtils.AutoMLManifest) {
            ModelUtils.AutoMLManifest autoMLManifest = (ModelUtils.AutoMLManifest) obj;
            if (this.zza.equals(autoMLManifest.getModelType()) && this.zzb.equals(autoMLManifest.getModelFile()) && this.zzc.equals(autoMLManifest.getLabelsFile())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
    @KeepForSdk
    public String getLabelsFile() {
        return this.zzc;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
    @KeepForSdk
    public String getModelFile() {
        return this.zzb;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
    @KeepForSdk
    public String getModelType() {
        return this.zza;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AutoMLManifest{modelType=");
        sb3.append(this.zza);
        sb3.append(", modelFile=");
        sb3.append(this.zzb);
        sb3.append(", labelsFile=");
        return j.o(this.zzc, StringSubstitutor.DEFAULT_VAR_END, sb3);
    }
}
