package com.google.android.gms.stats;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.stats.zzb;
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
import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
@ThreadSafe
@KeepForSdk
public class WakeLock {
    private static final long r = TimeUnit.DAYS.toMillis(366);
    private static volatile ScheduledExecutorService s = null;
    private static final Object t = new Object();
    private static volatile zzd u = new a();
    private final Object a;

    @GuardedBy("acquireReleaseLock")
    private final PowerManager.WakeLock b;

    @GuardedBy("acquireReleaseLock")
    private int c;

    @GuardedBy("acquireReleaseLock")
    private Future<?> d;

    @GuardedBy("acquireReleaseLock")
    private long e;

    @GuardedBy("acquireReleaseLock")
    private final Set<zze> f;

    @GuardedBy("acquireReleaseLock")
    private boolean g;

    @GuardedBy("acquireReleaseLock")
    private int h;

    @GuardedBy("acquireReleaseLock")
    public zzb i;
    private Clock j;
    private WorkSource k;
    private final String l;
    private final String m;
    private final Context n;

    @GuardedBy("acquireReleaseLock")
    private final Map<String, b> o;
    private AtomicInteger p;
    private final ScheduledExecutorService q;

    @KeepForSdk
    public WakeLock(@NonNull Context context, int i, @NonNull String str) {
        String packageName = context.getPackageName();
        this.a = new Object();
        this.c = 0;
        this.f = new HashSet();
        this.g = true;
        this.j = DefaultClock.getInstance();
        this.o = new HashMap();
        this.p = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "WakeLock: context must not be null");
        Preconditions.checkNotEmpty(str, "WakeLock: wakeLockName must not be empty");
        this.n = context.getApplicationContext();
        this.m = str;
        this.i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.l = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.l = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb.toString());
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i, str);
        this.b = wakeLockNewWakeLock;
        if (WorkSourceUtil.hasWorkSourcePermission(context)) {
            WorkSource workSourceFromPackage = WorkSourceUtil.fromPackage(context, Strings.isEmptyOrWhitespace(packageName) ? context.getPackageName() : packageName);
            this.k = workSourceFromPackage;
            if (workSourceFromPackage != null) {
                d(wakeLockNewWakeLock, workSourceFromPackage);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = s;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (t) {
                scheduledExecutorServiceUnconfigurableScheduledExecutorService = s;
                if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                    zzh.zza();
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    s = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                }
            }
        }
        this.q = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    @GuardedBy("acquireReleaseLock")
    private final String a(String str) {
        if (this.g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    @GuardedBy("acquireReleaseLock")
    private final void b() {
        if (this.f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f);
        this.f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    private final void c(int i) {
        synchronized (this.a) {
            if (isHeld()) {
                if (this.g) {
                    int i2 = this.c - 1;
                    this.c = i2;
                    if (i2 > 0) {
                        return;
                    }
                } else {
                    this.c = 0;
                }
                b();
                Iterator<b> it2 = this.o.values().iterator();
                while (it2.hasNext()) {
                    it2.next().a = 0;
                }
                this.o.clear();
                Future<?> future = this.d;
                if (future != null) {
                    future.cancel(false);
                    this.d = null;
                    this.e = 0L;
                }
                this.h = 0;
                try {
                    if (this.b.isHeld()) {
                        try {
                            this.b.release();
                            if (this.i != null) {
                                this.i = null;
                            }
                        } catch (RuntimeException e) {
                            if (!e.getClass().equals(RuntimeException.class)) {
                                throw e;
                            }
                            Log.e("WakeLock", String.valueOf(this.l).concat(" failed to release!"), e);
                            if (this.i != null) {
                                this.i = null;
                            }
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.l).concat(" should be held!"));
                    }
                } catch (Throwable th) {
                    if (this.i != null) {
                        this.i = null;
                    }
                    throw th;
                }
            }
        }
    }

    private static void d(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    public static /* synthetic */ void zza(@NonNull WakeLock wakeLock) {
        synchronized (wakeLock.a) {
            if (wakeLock.isHeld()) {
                Log.e("WakeLock", String.valueOf(wakeLock.l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                wakeLock.b();
                if (wakeLock.isHeld()) {
                    wakeLock.c = 1;
                    wakeLock.c(0);
                }
            }
        }
    }

    @KeepForSdk
    public void acquire(long j) {
        this.p.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, r), 1L);
        if (j > 0) {
            jMax = Math.min(j, jMax);
        }
        synchronized (this.a) {
            if (!isHeld()) {
                this.i = zzb.zza(false, null);
                this.b.acquire();
                this.j.elapsedRealtime();
            }
            this.c++;
            this.h++;
            a(null);
            b bVar = this.o.get(null);
            if (bVar == null) {
                bVar = new b(null);
                this.o.put(null, bVar);
            }
            bVar.a++;
            long jElapsedRealtime = this.j.elapsedRealtime();
            long j2 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
            if (j2 > this.e) {
                this.e = j2;
                Future<?> future = this.d;
                if (future != null) {
                    future.cancel(false);
                }
                this.d = this.q.schedule(new Runnable() { // from class: com.google.android.gms.stats.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        WakeLock.zza(this.zza);
                    }
                }, jMax, TimeUnit.MILLISECONDS);
            }
        }
    }

    @KeepForSdk
    public boolean isHeld() {
        boolean z;
        synchronized (this.a) {
            z = this.c > 0;
        }
        return z;
    }

    @KeepForSdk
    public void release() {
        if (this.p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.l).concat(" release without a matched acquire!"));
        }
        synchronized (this.a) {
            a(null);
            if (this.o.containsKey(null)) {
                b bVar = this.o.get(null);
                if (bVar != null) {
                    int i = bVar.a - 1;
                    bVar.a = i;
                    if (i == 0) {
                        this.o.remove(null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.l).concat(" counter does not exist"));
            }
            c(0);
        }
    }

    @KeepForSdk
    public void setReferenceCounted(boolean z) {
        synchronized (this.a) {
            this.g = z;
        }
    }
}
