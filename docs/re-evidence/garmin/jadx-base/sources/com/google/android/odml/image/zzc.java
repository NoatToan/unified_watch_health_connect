package com.google.android.odml.image;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes14.dex */
final class zzc extends ImageProperties {
    private final int zza;
    private final int zzb;

    public /* synthetic */ zzc(int i14, int i15, zza zzaVar) {
        this.zza = i14;
        this.zzb = i15;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImageProperties) {
            ImageProperties imageProperties = (ImageProperties) obj;
            if (this.zza == imageProperties.getImageFormat() && this.zzb == imageProperties.getStorageType()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.odml.image.ImageProperties
    public final int getImageFormat() {
        return this.zza;
    }

    @Override // com.google.android.odml.image.ImageProperties
    public final int getStorageType() {
        return this.zzb;
    }

    public final int hashCode() {
        return ((this.zza ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final String toString() {
        int i14 = this.zza;
        int i15 = this.zzb;
        StringBuilder sb3 = new StringBuilder(65);
        sb3.append("ImageProperties{imageFormat=");
        sb3.append(i14);
        sb3.append(", storageType=");
        sb3.append(i15);
        sb3.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb3.toString();
    }
}
