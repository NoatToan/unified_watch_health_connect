package com.google.android.play.core.install;

import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.InstallStatus;
import j20.x;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes14.dex */
final class zza extends InstallState {
    private final int zza;
    private final long zzb;
    private final long zzc;
    private final int zzd;
    private final String zze;

    public zza(int i14, long j8, long j14, int i15, String str) {
        this.zza = i14;
        this.zzb = j8;
        this.zzc = j14;
        this.zzd = i15;
        if (str != null) {
            this.zze = str;
        } else {
            x.l("Null packageName");
            throw null;
        }
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long bytesDownloaded() {
        return this.zzb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            if (this.zza == installState.installStatus() && this.zzb == installState.bytesDownloaded() && this.zzc == installState.totalBytesToDownload() && this.zzd == installState.installErrorCode() && this.zze.equals(installState.packageName())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i14 = this.zza ^ 1000003;
        long j8 = this.zzb;
        long j14 = this.zzc;
        return (((((((i14 * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) ((j14 >>> 32) ^ j14))) * 1000003) ^ this.zzd) * 1000003) ^ this.zze.hashCode();
    }

    @Override // com.google.android.play.core.install.InstallState
    @InstallErrorCode
    public final int installErrorCode() {
        return this.zzd;
    }

    @Override // com.google.android.play.core.install.InstallState
    @InstallStatus
    public final int installStatus() {
        return this.zza;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final String packageName() {
        return this.zze;
    }

    public final String toString() {
        int i14 = this.zza;
        long j8 = this.zzb;
        long j14 = this.zzc;
        int i15 = this.zzd;
        String str = this.zze;
        StringBuilder sb3 = new StringBuilder("InstallState{installStatus=");
        sb3.append(i14);
        sb3.append(", bytesDownloaded=");
        sb3.append(j8);
        x.j(j14, ", totalBytesToDownload=", ", installErrorCode=", sb3);
        sb3.append(i15);
        sb3.append(", packageName=");
        sb3.append(str);
        sb3.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb3.toString();
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long totalBytesToDownload() {
        return this.zzc;
    }
}
