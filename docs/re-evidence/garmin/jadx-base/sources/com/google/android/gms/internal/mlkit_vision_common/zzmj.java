package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import h7.e;
import h7.g;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes14.dex */
public final class zzmj {
    private static zzp zza;
    private static final zzr zzb = zzr.zzc("optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID);
    private final String zzc;
    private final String zzd;
    private final zzmc zze;
    private final SharedPrefManager zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzmj(Context context, final SharedPrefManager sharedPrefManager, zzmc zzmcVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = CommonUtils.getAppVersion(context);
        this.zzf = sharedPrefManager;
        this.zze = zzmcVar;
        zzmw.zza();
        this.zzi = str;
        this.zzg = MLTaskExecutor.getInstance().scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza();
            }
        });
        MLTaskExecutor mLTaskExecutor = MLTaskExecutor.getInstance();
        sharedPrefManager.getClass();
        this.zzh = mLTaskExecutor.scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return sharedPrefManager.getMlSdkInstanceId();
            }
        });
        zzr zzrVar = zzb;
        this.zzj = zzrVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzrVar.get(str)) : -1;
    }

    private static synchronized zzp zzd() {
        try {
            zzp zzpVar = zza;
            if (zzpVar != null) {
                return zzpVar;
            }
            g gVarA = e.a(Resources.getSystem().getConfiguration());
            zzm zzmVar = new zzm();
            for (int i14 = 0; i14 < gVarA.f82328a.size(); i14++) {
                zzmVar.zzb(CommonUtils.languageTagFromLocale(gVarA.f82328a.get(i14)));
            }
            zzp zzpVarZzc = zzmVar.zzc();
            zza = zzpVarZzc;
            return zzpVarZzc;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final /* synthetic */ String zza() {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    public final /* synthetic */ void zzb(zzmb zzmbVar, zziv zzivVar, String str) {
        zzmbVar.zza(zzivVar);
        String strZzc = zzmbVar.zzc();
        zzky zzkyVar = new zzky();
        zzkyVar.zzb(this.zzc);
        zzkyVar.zzc(this.zzd);
        zzkyVar.zzh(zzd());
        zzkyVar.zzg(Boolean.TRUE);
        zzkyVar.zzl(strZzc);
        zzkyVar.zzj(str);
        zzkyVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.getMlSdkInstanceId());
        zzkyVar.zzd(10);
        zzkyVar.zzk(Integer.valueOf(this.zzj));
        zzmbVar.zzb(zzkyVar);
        this.zze.zza(zzmbVar);
    }

    public final void zzc(zzmt zzmtVar, final zziv zzivVar) {
        zzii zziiVar;
        zzio zzioVar;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzk.get(zzivVar) != null && jElapsedRealtime - ((Long) this.zzk.get(zzivVar)).longValue() <= 30000) {
            return;
        }
        this.zzk.put(zzivVar, Long.valueOf(jElapsedRealtime));
        int i14 = zzmtVar.zza;
        int i15 = zzmtVar.zzb;
        int i16 = zzmtVar.zzc;
        int i17 = zzmtVar.zzd;
        int i18 = zzmtVar.zze;
        long j8 = zzmtVar.zzf;
        int i19 = zzmtVar.zzg;
        zzin zzinVar = new zzin();
        if (i14 == -1) {
            zziiVar = zzii.BITMAP;
        } else if (i14 == 35) {
            zziiVar = zzii.YUV_420_888;
        } else if (i14 == 842094169) {
            zziiVar = zzii.YV12;
        } else if (i14 != 16) {
            zziiVar = i14 != 17 ? zzii.UNKNOWN_FORMAT : zzii.NV21;
        } else {
            zziiVar = zzii.NV16;
        }
        zzinVar.zzd(zziiVar);
        if (i15 == 1) {
            zzioVar = zzio.BITMAP;
        } else if (i15 == 2) {
            zzioVar = zzio.BYTEARRAY;
        } else if (i15 != 3) {
            zzioVar = i15 != 4 ? zzio.ANDROID_MEDIA_IMAGE : zzio.FILEPATH;
        } else {
            zzioVar = zzio.BYTEBUFFER;
        }
        zzinVar.zzf(zzioVar);
        zzinVar.zzc(Integer.valueOf(i16));
        zzinVar.zze(Integer.valueOf(i17));
        zzinVar.zzg(Integer.valueOf(i18));
        zzinVar.zzb(Long.valueOf(j8));
        zzinVar.zzh(Integer.valueOf(i19));
        zziq zziqVarZzj = zzinVar.zzj();
        zziw zziwVar = new zziw();
        zziwVar.zzd(zziqVarZzj);
        final zzmb zzmbVarZze = zzmk.zze(zziwVar);
        final String version = this.zzg.isSuccessful() ? (String) this.zzg.getResult() : LibraryVersion.getInstance().getVersion(this.zzi);
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmi
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(zzmbVarZze, zzivVar, version);
            }
        });
    }
}
