package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zzgo;
import com.google.android.gms.internal.measurement.zzkh;
import com.google.android.gms.internal.measurement.zzn;
import com.google.android.gms.internal.measurement.zznl;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzpe;
import com.google.android.gms.internal.measurement.zzt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfm extends t3 implements b {
    private final Map<String, Map<String, String>> b;

    @VisibleForTesting
    public final Map<String, Map<String, Boolean>> c;

    @VisibleForTesting
    public final Map<String, Map<String, Boolean>> d;
    private final Map<String, com.google.android.gms.internal.measurement.zzfc> e;
    private final Map<String, Map<String, Integer>> f;

    @VisibleForTesting
    public final LruCache<String, zzc> g;
    public final com.google.android.gms.internal.measurement.zzr h;
    private final Map<String, String> i;

    public zzfm(zzks zzksVar) {
        super(zzksVar);
        this.b = new ArrayMap();
        this.c = new ArrayMap();
        this.d = new ArrayMap();
        this.e = new ArrayMap();
        this.i = new ArrayMap();
        this.f = new ArrayMap();
        this.g = new y(this, 20);
        this.h = new z(this);
    }

    public static /* bridge */ /* synthetic */ zzc c(zzfm zzfmVar, String str) throws Throwable {
        zzfmVar.zzY();
        Preconditions.checkNotEmpty(str);
        zzpe.zzc();
        if (!zzfmVar.zzs.zzf().zzs(null, zzdy.zzat) || !zzfmVar.zzl(str)) {
            return null;
        }
        if (!zzfmVar.e.containsKey(str) || zzfmVar.e.get(str) == null) {
            zzfmVar.m(str);
        } else {
            zzfmVar.n(str, zzfmVar.e.get(str));
        }
        return zzfmVar.g.snapshot().get(str);
    }

    @WorkerThread
    private final com.google.android.gms.internal.measurement.zzfc k(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.zzfc.zzg();
        }
        try {
            com.google.android.gms.internal.measurement.zzfc zzfcVarZzaA = ((zzfb) zzku.s(com.google.android.gms.internal.measurement.zzfc.zze(), bArr)).zzaA();
            this.zzs.zzay().zzj().zzc("Parsed config. version, gmp_app_id", zzfcVarZzaA.zzq() ? Long.valueOf(zzfcVarZzaA.zzc()) : null, zzfcVarZzaA.zzp() ? zzfcVarZzaA.zzh() : null);
            return zzfcVarZzaA;
        } catch (zzkh e) {
            this.zzs.zzay().zzk().zzc("Unable to merge remote config. appId", zzel.zzn(str), e);
            return com.google.android.gms.internal.measurement.zzfc.zzg();
        } catch (RuntimeException e2) {
            this.zzs.zzay().zzk().zzc("Unable to merge remote config. appId", zzel.zzn(str), e2);
            return com.google.android.gms.internal.measurement.zzfc.zzg();
        }
    }

    private final void l(String str, zzfb zzfbVar) {
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        if (zzfbVar != null) {
            for (int i = 0; i < zzfbVar.zza(); i++) {
                com.google.android.gms.internal.measurement.zzez zzezVarZzbv = zzfbVar.zzb(i).zzbv();
                if (TextUtils.isEmpty(zzezVarZzbv.zzc())) {
                    this.zzs.zzay().zzk().zza("EventConfig contained null event name");
                } else {
                    String strZzc = zzezVarZzbv.zzc();
                    String strZzb = zzgs.zzb(zzezVarZzbv.zzc());
                    if (!TextUtils.isEmpty(strZzb)) {
                        zzezVarZzbv.zzb(strZzb);
                        zzfbVar.zzd(i, zzezVarZzbv);
                    }
                    zznl.zzc();
                    zzaf zzafVarZzf = this.zzs.zzf();
                    zzdx<Boolean> zzdxVar = zzdy.zzaC;
                    if (!zzafVarZzf.zzs(null, zzdxVar)) {
                        arrayMap.put(strZzc, Boolean.valueOf(zzezVarZzbv.zzd()));
                    } else if (zzezVarZzbv.zzf() && zzezVarZzbv.zzd()) {
                        arrayMap.put(strZzc, Boolean.TRUE);
                    }
                    zznl.zzc();
                    if (!this.zzs.zzf().zzs(null, zzdxVar)) {
                        arrayMap2.put(zzezVarZzbv.zzc(), Boolean.valueOf(zzezVarZzbv.zze()));
                    } else if (zzezVarZzbv.zzg() && zzezVarZzbv.zze()) {
                        arrayMap2.put(zzezVarZzbv.zzc(), Boolean.TRUE);
                    }
                    if (zzezVarZzbv.zzh()) {
                        if (zzezVarZzbv.zza() < 2 || zzezVarZzbv.zza() > 65535) {
                            this.zzs.zzay().zzk().zzc("Invalid sampling rate. Event name, sample rate", zzezVarZzbv.zzc(), Integer.valueOf(zzezVarZzbv.zza()));
                        } else {
                            arrayMap3.put(zzezVarZzbv.zzc(), Integer.valueOf(zzezVarZzbv.zza()));
                        }
                    }
                }
            }
        }
        this.c.put(str, arrayMap);
        this.d.put(str, arrayMap2);
        this.f.put(str, arrayMap3);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:34:0x010a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0114  */
    /* JADX WARN: Code duplicated, block: B:41:0x011e  */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x011b: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:39:0x011b */
    @WorkerThread
    private final void m(String str) throws Throwable {
        SQLiteException e;
        Cursor cursorQuery;
        Cursor cursor;
        Pair pair;
        zzfb zzfbVarZzbv;
        zzY();
        zzg();
        Preconditions.checkNotEmpty(str);
        if (this.e.get(str) == null) {
            d dVarZzi = this.zzf.zzi();
            Preconditions.checkNotEmpty(str);
            dVarZzi.zzg();
            dVarZzi.zzY();
            Cursor cursor2 = null;
            try {
                try {
                    cursorQuery = dVarZzi.F().query("apps", new String[]{"remote_config", "config_last_modified_time"}, "app_id=?", new String[]{str}, null, null, null);
                    try {
                        if (cursorQuery.moveToFirst()) {
                            byte[] blob = cursorQuery.getBlob(0);
                            String string = cursorQuery.getString(1);
                            if (cursorQuery.moveToNext()) {
                                dVarZzi.zzs.zzay().zzd().zzb("Got multiple records for app config, expected one. appId", zzel.zzn(str));
                            }
                            if (blob != null) {
                                pair = new Pair(blob, string);
                                cursorQuery.close();
                            }
                            if (pair == null) {
                                this.b.put(str, null);
                                this.c.put(str, null);
                                this.d.put(str, null);
                                this.e.put(str, null);
                                this.i.put(str, null);
                                this.f.put(str, null);
                                return;
                            }
                            zzfbVarZzbv = k(str, (byte[]) pair.first).zzbv();
                            l(str, zzfbVarZzbv);
                            this.b.put(str, o(zzfbVarZzbv.zzaA()));
                            this.e.put(str, zzfbVarZzbv.zzaA());
                            zzpe.zzc();
                            if (this.zzs.zzf().zzs(null, zzdy.zzat)) {
                                n(str, zzfbVarZzbv.zzaA());
                            }
                            zzoy.zzc();
                            if (this.zzs.zzf().zzs(null, zzdy.zzaq)) {
                                this.i.put(str, (String) pair.second);
                            } else {
                                this.i.put(str, null);
                            }
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        dVarZzi.zzs.zzay().zzd().zzc("Error querying remote config. appId", zzel.zzn(str), e);
                        if (cursorQuery != null) {
                        }
                        pair = null;
                        if (pair == null) {
                            this.b.put(str, null);
                            this.c.put(str, null);
                            this.d.put(str, null);
                            this.e.put(str, null);
                            this.i.put(str, null);
                            this.f.put(str, null);
                            return;
                        }
                        zzfbVarZzbv = k(str, (byte[]) pair.first).zzbv();
                        l(str, zzfbVarZzbv);
                        this.b.put(str, o(zzfbVarZzbv.zzaA()));
                        this.e.put(str, zzfbVarZzbv.zzaA());
                        zzpe.zzc();
                        if (this.zzs.zzf().zzs(null, zzdy.zzat)) {
                            n(str, zzfbVarZzbv.zzaA());
                        }
                        zzoy.zzc();
                        if (this.zzs.zzf().zzs(null, zzdy.zzaq)) {
                            this.i.put(str, (String) pair.second);
                        } else {
                            this.i.put(str, null);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
            cursorQuery.close();
            pair = null;
            if (pair == null) {
                this.b.put(str, null);
                this.c.put(str, null);
                this.d.put(str, null);
                this.e.put(str, null);
                this.i.put(str, null);
                this.f.put(str, null);
                return;
            }
            zzfbVarZzbv = k(str, (byte[]) pair.first).zzbv();
            l(str, zzfbVarZzbv);
            this.b.put(str, o(zzfbVarZzbv.zzaA()));
            this.e.put(str, zzfbVarZzbv.zzaA());
            zzpe.zzc();
            if (this.zzs.zzf().zzs(null, zzdy.zzat)) {
                n(str, zzfbVarZzbv.zzaA());
            }
            zzoy.zzc();
            if (this.zzs.zzf().zzs(null, zzdy.zzaq)) {
                this.i.put(str, (String) pair.second);
            } else {
                this.i.put(str, null);
            }
        }
    }

    @WorkerThread
    private final void n(final String str, com.google.android.gms.internal.measurement.zzfc zzfcVar) {
        if (zzfcVar.zza() == 0) {
            this.g.remove(str);
            return;
        }
        this.zzs.zzay().zzj().zzb("EES programs found", Integer.valueOf(zzfcVar.zza()));
        zzgo zzgoVar = zzfcVar.zzj().get(0);
        try {
            zzc zzcVar = new zzc();
            zzcVar.zzd("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzn("internal.remoteConfig", new a0(this.zza, str));
                }
            });
            zzcVar.zzd("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfi
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final zzfm zzfmVar = this.zza;
                    final String str2 = str;
                    return new com.google.android.gms.internal.measurement.zzu("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfh
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zzfm zzfmVar2 = zzfmVar;
                            String str3 = str2;
                            j0 j0VarH = zzfmVar2.zzf.zzi().H(str3);
                            HashMap map = new HashMap();
                            map.put(Constants.PARAM_PLATFORM, "android");
                            map.put("package_name", str3);
                            zzfmVar2.zzs.zzf().zzh();
                            map.put("gmp_version", 46000L);
                            if (j0VarH != null) {
                                String strH0 = j0VarH.h0();
                                if (strH0 != null) {
                                    map.put("app_version", strH0);
                                }
                                map.put("app_version_int", Long.valueOf(j0VarH.M()));
                                map.put("dynamite_version", Long.valueOf(j0VarH.V()));
                            }
                            return map;
                        }
                    });
                }
            });
            zzcVar.zzd("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzff
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzt(this.zza.h);
                }
            });
            zzcVar.zzc(zzgoVar);
            this.g.put(str, zzcVar);
            this.zzs.zzay().zzj().zzc("EES program loaded for appId, activities", str, Integer.valueOf(zzgoVar.zza().zza()));
            Iterator<zzgm> it2 = zzgoVar.zza().zzd().iterator();
            while (it2.hasNext()) {
                this.zzs.zzay().zzj().zzb("EES program activity", it2.next().zzb());
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zzs.zzay().zzd().zzb("Failed to load EES program. appId", str);
        }
    }

    private static final Map<String, String> o(com.google.android.gms.internal.measurement.zzfc zzfcVar) {
        ArrayMap arrayMap = new ArrayMap();
        if (zzfcVar != null) {
            for (com.google.android.gms.internal.measurement.zzfe zzfeVar : zzfcVar.zzk()) {
                arrayMap.put(zzfeVar.zzb(), zzfeVar.zzc());
            }
        }
        return arrayMap;
    }

    @WorkerThread
    public final int b(String str, String str2) throws Throwable {
        Integer num;
        zzg();
        m(str);
        Map<String, Integer> map = this.f.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @WorkerThread
    public final void e(String str) {
        zzg();
        this.e.remove(str);
    }

    @WorkerThread
    public final boolean f(String str) {
        zzg();
        com.google.android.gms.internal.measurement.zzfc zzfcVarZze = zze(str);
        if (zzfcVarZze == null) {
            return false;
        }
        return zzfcVarZze.zzo();
    }

    public final boolean g(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    @WorkerThread
    public final boolean h(String str, String str2) throws Throwable {
        Boolean bool;
        zzg();
        m(str);
        if (FirebaseAnalytics.Event.ECOMMERCE_PURCHASE.equals(str2) || "purchase".equals(str2) || FirebaseAnalytics.Event.REFUND.equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.d.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @WorkerThread
    public final boolean i(String str, String str2) throws Throwable {
        Boolean bool;
        zzg();
        m(str);
        if (g(str) && zzkz.x(str2)) {
            return true;
        }
        if (j(str) && zzkz.y(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.c.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean j(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    @Override // com.google.android.gms.measurement.internal.b
    @WorkerThread
    public final String zza(String str, String str2) throws Throwable {
        zzg();
        m(str);
        Map<String, String> map = this.b.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.t3
    public final boolean zzb() {
        return false;
    }

    @WorkerThread
    public final com.google.android.gms.internal.measurement.zzfc zze(String str) {
        zzY();
        zzg();
        Preconditions.checkNotEmpty(str);
        m(str);
        return this.e.get(str);
    }

    @WorkerThread
    public final String zzf(String str) {
        zzg();
        return this.i.get(str);
    }

    @WorkerThread
    public final void zzi(String str) {
        zzg();
        this.i.put(str, null);
    }

    public final boolean zzl(String str) {
        com.google.android.gms.internal.measurement.zzfc zzfcVar;
        zzpe.zzc();
        return (!this.zzs.zzf().zzs(null, zzdy.zzat) || TextUtils.isEmpty(str) || (zzfcVar = this.e.get(str)) == null || zzfcVar.zza() == 0) ? false : true;
    }

    @WorkerThread
    public final boolean zzq(String str, byte[] bArr, String str2) throws Throwable {
        zzY();
        zzg();
        Preconditions.checkNotEmpty(str);
        zzfb zzfbVarZzbv = k(str, bArr).zzbv();
        if (zzfbVarZzbv == null) {
            return false;
        }
        l(str, zzfbVarZzbv);
        zzpe.zzc();
        if (this.zzs.zzf().zzs(null, zzdy.zzat)) {
            n(str, zzfbVarZzbv.zzaA());
        }
        this.e.put(str, zzfbVarZzbv.zzaA());
        this.i.put(str, str2);
        this.b.put(str, o(zzfbVarZzbv.zzaA()));
        this.zzf.zzi().c(str, new ArrayList(zzfbVarZzbv.zze()));
        try {
            zzfbVarZzbv.zzc();
            bArr = zzfbVarZzbv.zzaA().zzbs();
        } catch (RuntimeException e) {
            this.zzs.zzay().zzk().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzel.zzn(str), e);
        }
        zzoy.zzc();
        if (this.zzs.zzf().zzs(null, zzdy.zzaq)) {
            this.zzf.zzi().g(str, bArr, str2);
        } else {
            this.zzf.zzi().g(str, bArr, null);
        }
        this.e.put(str, zzfbVarZzbv.zzaA());
        return true;
    }
}
