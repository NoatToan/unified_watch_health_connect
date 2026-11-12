package com.google.android.gms.stats;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
@ShowFirstParty
@KeepForSdk
public class WakeLock {
    private static final long zzb = 31622400000L;
    private static volatile ScheduledExecutorService zzc = null;
    private static final Object zzd = new Object();
    private static volatile zzd zze = new zzb();
    com.google.android.gms.internal.stats.zzb zza;
    private final Object zzf;
    private final PowerManager.WakeLock zzg;
    private int zzh;
    private Future<?> zzi;
    private long zzj;
    private final Set<zze> zzk;
    private boolean zzl;
    private int zzm;
    private Clock zzn;
    private WorkSource zzo;
    private final String zzp;
    private final String zzq;
    private final Context zzr;
    private final Map<String, zzc> zzs;
    private AtomicInteger zzt;
    private final ScheduledExecutorService zzu;

    @KeepForSdk
    public WakeLock(Context context, int i14, String str) {
        String packageName = context.getPackageName();
        this.zzf = new Object();
        this.zzh = 0;
        this.zzk = new HashSet();
        this.zzl = true;
        this.zzn = DefaultClock.getInstance();
        this.zzs = new HashMap();
        this.zzt = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "WakeLock: context must not be null");
        Preconditions.checkNotEmpty(str, "WakeLock: wakeLockName must not be empty");
        this.zzr = context.getApplicationContext();
        this.zzq = str;
        this.zza = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.zzp = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.zzp = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb3.toString());
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i14, str);
        this.zzg = wakeLockNewWakeLock;
        if (WorkSourceUtil.hasWorkSourcePermission(context)) {
            WorkSource workSourceFromPackage = WorkSourceUtil.fromPackage(context, Strings.isEmptyOrWhitespace(packageName) ? context.getPackageName() : packageName);
            this.zzo = workSourceFromPackage;
            if (workSourceFromPackage != null) {
                zze(wakeLockNewWakeLock, workSourceFromPackage);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = zzc;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (zzd) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = zzc;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        zzh.zza();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        zzc = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        this.zzu = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public static /* synthetic */ void zza(WakeLock wakeLock) {
        synchronized (wakeLock.zzf) {
            try {
                if (wakeLock.isHeld()) {
                    String.valueOf(wakeLock.zzp).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                    wakeLock.zzc();
                    if (wakeLock.isHeld()) {
                        wakeLock.zzh = 1;
                        wakeLock.zzd(0);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private final String zzb(String str) {
        if (this.zzl) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void zzc() {
        if (this.zzk.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.zzk);
        this.zzk.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    private final void zzd(int i14) {
        synchronized (this.zzf) {
            try {
                if (isHeld()) {
                    if (this.zzl) {
                        int i15 = this.zzh - 1;
                        this.zzh = i15;
                        if (i15 > 0) {
                            return;
                        }
                    } else {
                        this.zzh = 0;
                    }
                    zzc();
                    Iterator<zzc> it = this.zzs.values().iterator();
                    while (it.hasNext()) {
                        it.next().zza = 0;
                    }
                    this.zzs.clear();
                    Future<?> future = this.zzi;
                    if (future != null) {
                        future.cancel(false);
                        this.zzi = null;
                        this.zzj = 0L;
                    }
                    this.zzm = 0;
                    if (this.zzg.isHeld()) {
                        try {
                            try {
                                this.zzg.release();
                                if (this.zza != null) {
                                    this.zza = null;
                                }
                            } catch (RuntimeException e4) {
                                if (!e4.getClass().equals(RuntimeException.class)) {
                                    throw e4;
                                }
                                String.valueOf(this.zzp).concat(" failed to release!");
                                if (this.zza != null) {
                                    this.zza = null;
                                }
                            }
                        } catch (Throwable th3) {
                            if (this.zza != null) {
                                this.zza = null;
                            }
                            throw th3;
                        }
                    } else {
                        String.valueOf(this.zzp).concat(" should be held!");
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private static void zze(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e4) {
            e4.toString();
        }
    }

    @KeepForSdk
    public void acquire(long j8) {
        this.zzt.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, zzb), 1L);
        if (j8 > 0) {
            jMax = Math.min(j8, jMax);
        }
        synchronized (this.zzf) {
            try {
                if (!isHeld()) {
                    this.zza = com.google.android.gms.internal.stats.zzb.zza(false, null);
                    this.zzg.acquire();
                    this.zzn.elapsedRealtime();
                }
                this.zzh++;
                this.zzm++;
                zzb(null);
                zzc zzcVar = this.zzs.get(null);
                if (zzcVar == null) {
                    zzcVar = new zzc(null);
                    this.zzs.put(null, zzcVar);
                }
                zzcVar.zza++;
                long jElapsedRealtime = this.zzn.elapsedRealtime();
                long j14 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j14 > this.zzj) {
                    this.zzj = j14;
                    Future<?> future = this.zzi;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.zzi = this.zzu.schedule(new Runnable() { // from class: com.google.android.gms.stats.zza
                        @Override // java.lang.Runnable
                        public final void run() {
                            WakeLock.zza(this.zza);
                        }
                    }, jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @KeepForSdk
    public boolean isHeld() {
        boolean z14;
        synchronized (this.zzf) {
            z14 = this.zzh > 0;
        }
        return z14;
    }

    @KeepForSdk
    public void release() {
        if (this.zzt.decrementAndGet() < 0) {
            String.valueOf(this.zzp).concat(" release without a matched acquire!");
        }
        synchronized (this.zzf) {
            try {
                zzb(null);
                if (this.zzs.containsKey(null)) {
                    zzc zzcVar = this.zzs.get(null);
                    if (zzcVar != null) {
                        int i14 = zzcVar.zza - 1;
                        zzcVar.zza = i14;
                        if (i14 == 0) {
                            this.zzs.remove(null);
                        }
                    }
                } else {
                    String.valueOf(this.zzp).concat(" counter does not exist");
                }
                zzd(0);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @KeepForSdk
    public void setReferenceCounted(boolean z14) {
        synchronized (this.zzf) {
            this.zzl = z14;
        }
    }
}
