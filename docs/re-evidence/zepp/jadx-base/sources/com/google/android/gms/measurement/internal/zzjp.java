package com.google.android.gms.measurement.internal;

import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzjp extends t3 {
    private String b;
    private boolean c;
    private long d;
    public final zzew zza;
    public final zzew zzb;
    public final zzew zzc;
    public final zzew zzd;
    public final zzew zze;

    public zzjp(zzks zzksVar) {
        super(zzksVar);
        w wVarZzm = this.zzs.zzm();
        wVarZzm.getClass();
        this.zza = new zzew(wVarZzm, "last_delete_stale", 0L);
        w wVarZzm2 = this.zzs.zzm();
        wVarZzm2.getClass();
        this.zzb = new zzew(wVarZzm2, "backoff", 0L);
        w wVarZzm3 = this.zzs.zzm();
        wVarZzm3.getClass();
        this.zzc = new zzew(wVarZzm3, "last_upload", 0L);
        w wVarZzm4 = this.zzs.zzm();
        wVarZzm4.getClass();
        this.zzd = new zzew(wVarZzm4, "last_upload_attempt", 0L);
        w wVarZzm5 = this.zzs.zzm();
        wVarZzm5.getClass();
        this.zze = new zzew(wVarZzm5, "midnight_offset", 0L);
    }

    @WorkerThread
    @Deprecated
    public final Pair<String, Boolean> b(String str) {
        zzg();
        long jElapsedRealtime = this.zzs.zzav().elapsedRealtime();
        String str2 = this.b;
        if (str2 != null && jElapsedRealtime < this.d) {
            return new Pair<>(str2, Boolean.valueOf(this.c));
        }
        this.d = jElapsedRealtime + this.zzs.zzf().zzi(str, zzdy.zza);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zzs.zzau());
            this.b = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.b = id;
            }
            this.c = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e) {
            this.zzs.zzay().zzc().zzb("Unable to get advertising id", e);
            this.b = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.b, Boolean.valueOf(this.c));
    }

    @WorkerThread
    public final Pair<String, Boolean> c(String str, zzag zzagVar) {
        return zzagVar.zzj() ? b(str) : new Pair<>("", Boolean.FALSE);
    }

    @Override // com.google.android.gms.measurement.internal.t3
    public final boolean zzb() {
        return false;
    }

    @WorkerThread
    @Deprecated
    public final String zzf(String str) {
        zzg();
        String str2 = (String) b(str).first;
        MessageDigest messageDigestD = zzkz.d();
        if (messageDigestD == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestD.digest(str2.getBytes())));
    }
}
