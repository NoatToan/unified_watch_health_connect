package com.google.android.play.core.appupdate;

import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzv extends AppUpdateOptions.Builder {
    private int zza;
    private boolean zzb;
    private byte zzc;

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions.Builder
    public final AppUpdateOptions build() {
        if (this.zzc == 3) {
            return new zzx(this.zza, this.zzb, null);
        }
        StringBuilder sb3 = new StringBuilder();
        if ((this.zzc & 1) == 0) {
            sb3.append(" appUpdateType");
        }
        if ((this.zzc & 2) == 0) {
            sb3.append(" allowAssetPackDeletion");
        }
        h.z("Missing required properties:".concat(sb3.toString()));
        return null;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions.Builder
    public final AppUpdateOptions.Builder setAllowAssetPackDeletion(boolean z14) {
        this.zzb = z14;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions.Builder
    public final AppUpdateOptions.Builder setAppUpdateType(int i14) {
        this.zza = i14;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }
}
