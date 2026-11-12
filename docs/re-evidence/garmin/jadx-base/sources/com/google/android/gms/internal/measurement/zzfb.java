package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Pair;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class zzfb {
    private static volatile zzfb zzc;
    protected final ExecutorService zzb;
    private final AppMeasurementSdk zze;
    private final List zzf;
    private int zzg;
    private boolean zzh;
    private final String zzi;
    private volatile zzcr zzj;
    private final String zzd = "FA";
    protected final Clock zza = DefaultClock.getInstance();

    public zzfb(Context context, Bundle bundle) {
        zzcm.zza();
        zzed zzedVar = new zzed(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzedVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzb = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.zze = new AppMeasurementSdk(this);
        this.zzf = new ArrayList();
        try {
            if (com.google.android.gms.measurement.internal.zzlt.zza(context, "google_app_id", com.google.android.gms.measurement.internal.zzhu.zza(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, zzfb.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.zzi = null;
                    this.zzh = true;
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        this.zzi = "fa";
        zzM(new zzdr(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new zzfa(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
    public final void zzM(zzeq zzeqVar) {
        this.zzb.execute(zzeqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzT, reason: merged with bridge method [inline-methods] */
    public final void zzN(Exception exc, boolean z14, boolean z15) {
        this.zzh |= z14;
        if (!z14 && z15) {
            zzD(5, "Error with data collection. Data lost.", exc, null, null);
        }
    }

    private final void zzU(String str, String str2, Bundle bundle, boolean z14, boolean z15, Long l14) {
        zzM(new zzep(this, l14, str, str2, bundle, z14, z15));
    }

    public static zzfb zza(Context context, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (zzc == null) {
            synchronized (zzfb.class) {
                try {
                    if (zzc == null) {
                        zzc = new zzfb(context, bundle);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return zzc;
    }

    public final String zzA() {
        zzco zzcoVar = new zzco();
        zzM(new zzdz(this, zzcoVar));
        return zzcoVar.zzc(500L);
    }

    public final String zzB() {
        zzco zzcoVar = new zzco();
        zzM(new zzea(this, zzcoVar));
        return zzcoVar.zzc(500L);
    }

    public final Map zzC(String str, String str2, boolean z14) {
        zzco zzcoVar = new zzco();
        zzM(new zzeb(this, str, str2, z14, zzcoVar));
        Bundle bundleZze = zzcoVar.zze(5000L);
        if (bundleZze == null || bundleZze.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleZze.size());
        for (String str3 : bundleZze.keySet()) {
            Object obj = bundleZze.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void zzD(int i14, String str, Object obj, Object obj2, Object obj3) {
        zzM(new zzec(this, false, 5, str, obj, null, null));
    }

    public final Bundle zzE(Bundle bundle, boolean z14) {
        zzco zzcoVar = new zzco();
        zzM(new zzee(this, bundle, zzcoVar));
        if (z14) {
            return zzcoVar.zze(5000L);
        }
        return null;
    }

    public final int zzF(String str) {
        zzco zzcoVar = new zzco();
        zzM(new zzef(this, str, zzcoVar));
        Integer num = (Integer) zzco.zzf(zzcoVar.zze(AbstractComponentTracker.LINGERING_TIMEOUT), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final String zzG() {
        zzco zzcoVar = new zzco();
        zzM(new zzeg(this, zzcoVar));
        return zzcoVar.zzc(120000L);
    }

    public final Long zzH() {
        zzco zzcoVar = new zzco();
        zzM(new zzeh(this, zzcoVar));
        return zzcoVar.zzd(120000L);
    }

    public final String zzI() {
        return this.zzi;
    }

    public final Object zzJ(int i14) {
        zzco zzcoVar = new zzco();
        zzM(new zzei(this, zzcoVar, i14));
        return zzco.zzf(zzcoVar.zze(15000L), Object.class);
    }

    public final void zzK(boolean z14) {
        zzM(new zzej(this, z14));
    }

    public final void zzL(Bundle bundle) {
        zzM(new zzek(this, bundle));
    }

    public final /* synthetic */ String zzO() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzP() {
        return this.zzh;
    }

    public final /* synthetic */ zzcr zzQ() {
        return this.zzj;
    }

    public final /* synthetic */ void zzR(zzcr zzcrVar) {
        this.zzj = zzcrVar;
    }

    public final AppMeasurementSdk zzb() {
        return this.zze;
    }

    public final zzcr zzc(Context context, boolean z14) {
        try {
            return zzcq.asInterface(DynamiteModule.load(context, z14 ? DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION : DynamiteModule.PREFER_LOCAL, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e4) {
            zzN(e4, true, false);
            return null;
        }
    }

    public final void zzd(com.google.android.gms.measurement.internal.zzjp zzjpVar) {
        zzer zzerVar = new zzer(zzjpVar);
        if (this.zzj != null) {
            try {
                this.zzj.setEventInterceptor(zzerVar);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
            }
        }
        zzM(new zzel(this, zzerVar));
    }

    public final void zze(Intent intent) {
        zzM(new zzem(this, intent));
    }

    public final void zzf(com.google.android.gms.measurement.internal.zzjq zzjqVar) {
        Preconditions.checkNotNull(zzjqVar);
        List list = this.zzf;
        synchronized (list) {
            for (int i14 = 0; i14 < list.size(); i14++) {
                try {
                    if (zzjqVar.equals(((Pair) list.get(i14)).first)) {
                        return;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            zzes zzesVar = new zzes(zzjqVar);
            list.add(new Pair(zzjqVar, zzesVar));
            if (this.zzj != null) {
                try {
                    this.zzj.registerOnMeasurementEventListener(zzesVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            zzM(new zzen(this, zzesVar));
        }
    }

    public final void zzg(com.google.android.gms.measurement.internal.zzjq zzjqVar) {
        Pair pair;
        Preconditions.checkNotNull(zzjqVar);
        List list = this.zzf;
        synchronized (list) {
            int i14 = 0;
            while (true) {
                try {
                    if (i14 >= list.size()) {
                        pair = null;
                        break;
                    } else {
                        if (zzjqVar.equals(((Pair) list.get(i14)).first)) {
                            pair = (Pair) list.get(i14);
                            break;
                        }
                        i14++;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (pair == null) {
                return;
            }
            list.remove(pair);
            zzes zzesVar = (zzes) pair.second;
            if (this.zzj != null) {
                try {
                    this.zzj.unregisterOnMeasurementEventListener(zzesVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            zzM(new zzeo(this, zzesVar));
        }
    }

    public final void zzh(String str, Bundle bundle) {
        zzU(null, str, bundle, false, true, null);
    }

    public final void zzi(String str, String str2, Bundle bundle) {
        zzU(str, str2, bundle, true, true, null);
    }

    public final void zzj(String str, String str2, Bundle bundle, long j8) {
        zzU(str, str2, bundle, true, false, Long.valueOf(j8));
    }

    public final void zzk(String str, String str2, Object obj, boolean z14) {
        zzM(new zzdh(this, str, str2, obj, z14));
    }

    public final void zzl(Bundle bundle) {
        zzM(new zzdi(this, bundle));
    }

    public final void zzm(String str, String str2, Bundle bundle) {
        zzM(new zzdj(this, str, str2, bundle));
    }

    public final List zzn(String str, String str2) {
        zzco zzcoVar = new zzco();
        zzM(new zzdk(this, str, str2, zzcoVar));
        List list = (List) zzco.zzf(zzcoVar.zze(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final void zzo(String str) {
        zzM(new zzdl(this, str));
    }

    public final void zzp(zzdf zzdfVar, String str, String str2) {
        zzM(new zzdm(this, zzdfVar, str, str2));
    }

    public final void zzq(Boolean bool) {
        zzM(new zzdn(this, bool));
    }

    public final void zzr(Bundle bundle) {
        zzM(new zzdo(this, bundle));
    }

    public final void zzs() {
        zzM(new zzdp(this));
    }

    public final void zzt(long j8) {
        zzM(new zzdq(this, j8));
    }

    public final void zzu(String str) {
        zzM(new zzds(this, str));
    }

    public final void zzv(String str) {
        zzM(new zzdt(this, str));
    }

    public final void zzw(Runnable runnable) {
        zzM(new zzdv(this, runnable));
    }

    public final String zzx() {
        zzco zzcoVar = new zzco();
        zzM(new zzdw(this, zzcoVar));
        return zzcoVar.zzc(500L);
    }

    public final String zzy() {
        zzco zzcoVar = new zzco();
        zzM(new zzdx(this, zzcoVar));
        return zzcoVar.zzc(50L);
    }

    public final long zzz() {
        zzco zzcoVar = new zzco();
        zzM(new zzdy(this, zzcoVar));
        Long lZzd = zzcoVar.zzd(500L);
        if (lZzd != null) {
            return lZzd.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.zza.currentTimeMillis()).nextLong();
        int i14 = this.zzg + 1;
        this.zzg = i14;
        return jNextLong + ((long) i14);
    }
}
