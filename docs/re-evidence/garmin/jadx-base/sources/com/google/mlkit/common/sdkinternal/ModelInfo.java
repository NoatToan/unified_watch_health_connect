package com.google.mlkit.common.sdkinternal;

import android.net.Uri;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class ModelInfo {
    private final String zza;
    private final Uri zzb;
    private final String zzc;
    private final ModelType zzd;

    @KeepForSdk
    public ModelInfo(String str, Uri uri, String str2, ModelType modelType) {
        this.zza = str;
        this.zzb = uri;
        this.zzc = str2;
        this.zzd = modelType;
    }

    @KeepForSdk
    public String getModelHash() {
        return this.zzc;
    }

    @KeepForSdk
    public String getModelNameForPersist() {
        return this.zza;
    }

    @KeepForSdk
    public ModelType getModelType() {
        return this.zzd;
    }

    @KeepForSdk
    public Uri getModelUri() {
        return this.zzb;
    }
}
