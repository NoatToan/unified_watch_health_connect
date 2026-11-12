package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
public final class RootTelemetryConfigManager {
    private static RootTelemetryConfigManager zza;
    private static final RootTelemetryConfiguration zzb = new RootTelemetryConfiguration(0, false, false, 0, 0);
    private RootTelemetryConfiguration zzc;

    private RootTelemetryConfigManager() {
    }

    @KeepForSdk
    public static synchronized RootTelemetryConfigManager getInstance() {
        try {
            if (zza == null) {
                zza = new RootTelemetryConfigManager();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return zza;
    }

    @KeepForSdk
    public RootTelemetryConfiguration getConfig() {
        return this.zzc;
    }

    public final synchronized void zza(RootTelemetryConfiguration rootTelemetryConfiguration) {
        try {
            if (rootTelemetryConfiguration == null) {
                this.zzc = zzb;
                return;
            }
            RootTelemetryConfiguration rootTelemetryConfiguration2 = this.zzc;
            if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.getVersion() < rootTelemetryConfiguration.getVersion()) {
                this.zzc = rootTelemetryConfiguration;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
