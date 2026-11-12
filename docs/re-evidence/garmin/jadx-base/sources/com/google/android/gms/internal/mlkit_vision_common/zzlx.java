package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class zzlx implements Closeable {
    private static final Map zza = new HashMap();
    private final String zzb;
    private int zzc;
    private double zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    private zzlx(String str) {
        this.zzg = 2147483647L;
        this.zzh = -2147483648L;
        this.zzb = str;
    }

    private final void zza() {
        this.zzc = 0;
        this.zzd = 0.0d;
        this.zze = 0L;
        this.zzg = 2147483647L;
        this.zzh = -2147483648L;
    }

    public static zzlx zze(String str) {
        zzmw.zza();
        if (!zzmw.zzb()) {
            return zzlv.zza;
        }
        Map map = zza;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new zzlx("detectorTaskWithResource#run"));
        }
        return (zzlx) map.get("detectorTaskWithResource#run");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j8 = this.zze;
        if (j8 != 0) {
            zzd(j8);
        } else {
            h.z("Did you forget to call start()?");
        }
    }

    public zzlx zzb() {
        this.zze = SystemClock.elapsedRealtimeNanos() / 1000;
        return this;
    }

    public void zzc(long j8) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j14 = this.zzf;
        if (j14 != 0 && jElapsedRealtimeNanos - j14 >= 1000000) {
            zza();
        }
        this.zzf = jElapsedRealtimeNanos;
        this.zzc++;
        this.zzd += j8;
        this.zzg = Math.min(this.zzg, j8);
        this.zzh = Math.max(this.zzh, j8);
        if (this.zzc % 50 == 0) {
            Locale locale = Locale.US;
            zzmw.zza();
        }
        if (this.zzc % 500 == 0) {
            zza();
        }
    }

    public void zzd(long j8) {
        zzc((SystemClock.elapsedRealtimeNanos() / 1000) - j8);
    }
}
