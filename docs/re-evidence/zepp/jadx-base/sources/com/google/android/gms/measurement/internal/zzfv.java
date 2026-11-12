package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzhu;
import com.google.android.gms.internal.measurement.zznu;
import com.google.android.gms.internal.measurement.zznx;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfv implements z0 {
    private static volatile zzfv F;
    private volatile Boolean A;
    private volatile boolean B;
    private int C;

    @VisibleForTesting
    public final long E;
    private final Context a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final zzaa f;
    private final zzaf g;
    private final w h;
    private final zzel i;
    private final zzfs j;
    private final zzkd k;
    private final zzkz l;
    private final zzeg m;
    private final Clock n;
    private final zzio o;
    private final zzia p;
    private final zzd q;
    private final zzie r;
    private final String s;
    private zzee t;
    private zzjo u;
    private zzan v;
    private zzec w;
    private Boolean y;
    private long z;

    @VisibleForTesting
    public Boolean zza;

    @VisibleForTesting
    public Boolean zzb;
    private boolean x = false;
    private final AtomicInteger D = new AtomicInteger(0);

    public zzfv(zzgy zzgyVar) {
        Bundle bundle;
        Preconditions.checkNotNull(zzgyVar);
        zzaa zzaaVar = new zzaa(zzgyVar.a);
        this.f = zzaaVar;
        l.a = zzaaVar;
        Context context = zzgyVar.a;
        this.a = context;
        this.b = zzgyVar.b;
        this.c = zzgyVar.c;
        this.d = zzgyVar.d;
        this.e = zzgyVar.h;
        this.A = zzgyVar.e;
        this.s = zzgyVar.j;
        this.B = true;
        com.google.android.gms.internal.measurement.zzcl zzclVar = zzgyVar.g;
        if (zzclVar != null && (bundle = zzclVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zza = (Boolean) obj;
            }
            Object obj2 = zzclVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzb = (Boolean) obj2;
            }
        }
        zzhu.zzd(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.n = defaultClock;
        Long l = zzgyVar.i;
        this.E = l != null ? l.longValue() : defaultClock.currentTimeMillis();
        this.g = new zzaf(this);
        w wVar = new w(this);
        wVar.zzv();
        this.h = wVar;
        zzel zzelVar = new zzel(this);
        zzelVar.zzv();
        this.i = zzelVar;
        zzkz zzkzVar = new zzkz(this);
        zzkzVar.zzv();
        this.l = zzkzVar;
        this.m = new zzeg(new a1(zzgyVar, this));
        this.q = new zzd(this);
        zzio zzioVar = new zzio(this);
        zzioVar.zzb();
        this.o = zzioVar;
        zzia zziaVar = new zzia(this);
        zziaVar.zzb();
        this.p = zziaVar;
        zzkd zzkdVar = new zzkd(this);
        zzkdVar.zzb();
        this.k = zzkdVar;
        zzie zzieVar = new zzie(this);
        zzieVar.zzv();
        this.r = zzieVar;
        zzfs zzfsVar = new zzfs(this);
        zzfsVar.zzv();
        this.j = zzfsVar;
        com.google.android.gms.internal.measurement.zzcl zzclVar2 = zzgyVar.g;
        boolean z = zzclVar2 == null || zzclVar2.zzb == 0;
        if (context.getApplicationContext() instanceof Application) {
            zzia zziaVarZzq = zzq();
            if (zziaVarZzq.zzs.a.getApplicationContext() instanceof Application) {
                Application application = (Application) zziaVarZzq.zzs.a.getApplicationContext();
                if (zziaVarZzq.zza == null) {
                    zziaVarZzq.zza = new y1(zziaVarZzq, null);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(zziaVarZzq.zza);
                    application.registerActivityLifecycleCallbacks(zziaVarZzq.zza);
                    zziaVarZzq.zzs.zzay().zzj().zza("Registered activity lifecycle callback");
                }
            }
        } else {
            zzay().zzk().zza("Application context is not an Application");
        }
        zzfsVar.zzp(new f0(this, zzgyVar));
    }

    public static /* bridge */ /* synthetic */ void a(zzfv zzfvVar, zzgy zzgyVar) {
        zzfvVar.zzaz().zzg();
        zzfvVar.g.e();
        zzan zzanVar = new zzan(zzfvVar);
        zzanVar.zzv();
        zzfvVar.v = zzanVar;
        zzec zzecVar = new zzec(zzfvVar, zzgyVar.f);
        zzecVar.zzb();
        zzfvVar.w = zzecVar;
        zzee zzeeVar = new zzee(zzfvVar);
        zzeeVar.zzb();
        zzfvVar.t = zzeeVar;
        zzjo zzjoVar = new zzjo(zzfvVar);
        zzjoVar.zzb();
        zzfvVar.u = zzjoVar;
        zzfvVar.l.zzw();
        zzfvVar.h.zzw();
        zzfvVar.w.zzc();
        zzej zzejVarZzi = zzfvVar.zzay().zzi();
        zzfvVar.g.zzh();
        zzejVarZzi.zzb("App measurement initialized, version", 46000L);
        zzfvVar.zzay().zzi().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strZzl = zzecVar.zzl();
        if (TextUtils.isEmpty(zzfvVar.b)) {
            if (zzfvVar.zzv().u(strZzl)) {
                zzfvVar.zzay().zzi().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzej zzejVarZzi2 = zzfvVar.zzay().zzi();
                String strValueOf = String.valueOf(strZzl);
                zzejVarZzi2.zza(strValueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(strValueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "));
            }
        }
        zzfvVar.zzay().zzc().zza("Debug-level message logging enabled");
        if (zzfvVar.C != zzfvVar.D.get()) {
            zzfvVar.zzay().zzd().zzc("Not all components initialized", Integer.valueOf(zzfvVar.C), Integer.valueOf(zzfvVar.D.get()));
        }
        zzfvVar.x = true;
    }

    public static final void f() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void g(x0 x0Var) {
        if (x0Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void h(v vVar) {
        if (vVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!vVar.a()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(vVar.getClass())));
        }
    }

    private static final void i(y0 y0Var) {
        if (y0Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!y0Var.a()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(y0Var.getClass())));
        }
    }

    public static zzfv zzp(Context context, com.google.android.gms.internal.measurement.zzcl zzclVar, Long l) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.zze == null || zzclVar.zzf == null)) {
            zzclVar = new com.google.android.gms.internal.measurement.zzcl(zzclVar.zza, zzclVar.zzb, zzclVar.zzc, zzclVar.zzd, null, null, zzclVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (F == null) {
            synchronized (zzfv.class) {
                if (F == null) {
                    F = new zzfv(new zzgy(context, zzclVar, l));
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(F);
            F.A = Boolean.valueOf(zzclVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(F);
        return F;
    }

    public final void b() {
        this.D.incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    public final /* synthetic */ void c(String str, int i, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> listQueryIntentActivities;
        if (i == 200 || i == 204) {
            if (th == null) {
                zzm().q.zza(true);
                if (bArr != null || bArr.length == 0) {
                    zzay().zzc().zza("Deferred Deep Link response empty.");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String strOptString = jSONObject.optString(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK, "");
                    String strOptString2 = jSONObject.optString("gclid", "");
                    double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                    if (TextUtils.isEmpty(strOptString)) {
                        zzay().zzc().zza("Deferred Deep Link is empty.");
                        return;
                    }
                    zzkz zzkzVarZzv = zzv();
                    zzfv zzfvVar = zzkzVarZzv.zzs;
                    if (!TextUtils.isEmpty(strOptString) && (listQueryIntentActivities = zzkzVarZzv.zzs.a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0)) != null && !listQueryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", strOptString2);
                        bundle.putString("_cis", "ddp");
                        this.p.d("auto", "_cmp", bundle);
                        zzkz zzkzVarZzv2 = zzv();
                        if (TextUtils.isEmpty(strOptString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor editorEdit = zzkzVarZzv2.zzs.a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            editorEdit.putString(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK, strOptString);
                            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                            if (editorEdit.commit()) {
                                zzkzVarZzv2.zzs.a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                return;
                            }
                            return;
                        } catch (RuntimeException e) {
                            zzkzVarZzv2.zzs.zzay().zzd().zzb("Failed to persist Deferred Deep Link. exception", e);
                            return;
                        }
                    }
                    zzay().zzk().zzc("Deferred Deep Link validation failed. gclid, deep link", strOptString2, strOptString);
                    return;
                } catch (JSONException e2) {
                    zzay().zzd().zzb("Failed to parse the Deferred Deep Link response. exception", e2);
                    return;
                }
            }
        } else if (i == 304) {
            i = 304;
            if (th == null) {
                zzm().q.zza(true);
                if (bArr != null) {
                }
                zzay().zzc().zza("Deferred Deep Link response empty.");
                return;
            }
        }
        zzay().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
    }

    public final void d() {
        this.C++;
    }

    @WorkerThread
    public final void e(boolean z) {
        this.A = Boolean.valueOf(z);
    }

    @SideEffectFree
    public final zzfs j() {
        return this.j;
    }

    @WorkerThread
    public final void zzE() {
        zzaz().zzg();
        i(zzr());
        String strZzl = zzh().zzl();
        Pair<String, Boolean> pairC = zzm().c(strZzl);
        if (!this.g.zzr() || ((Boolean) pairC.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairC.first)) {
            zzay().zzc().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        zzie zzieVarZzr = zzr();
        zzieVarZzr.zzu();
        ConnectivityManager connectivityManager = (ConnectivityManager) zzieVarZzr.zzs.a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            zzay().zzk().zza("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        zzkz zzkzVarZzv = zzv();
        zzh().zzs.g.zzh();
        URL urlZzD = zzkzVarZzv.zzD(46000L, strZzl, (String) pairC.first, zzm().r.zza() - 1);
        if (urlZzD != null) {
            zzie zzieVarZzr2 = zzr();
            zzft zzftVar = new zzft(this);
            zzieVarZzr2.zzg();
            zzieVarZzr2.zzu();
            Preconditions.checkNotNull(urlZzD);
            Preconditions.checkNotNull(zzftVar);
            zzieVarZzr2.zzs.zzaz().zzo(new a2(zzieVarZzr2, strZzl, urlZzD, null, null, zzftVar, null));
        }
    }

    @WorkerThread
    public final void zzG(boolean z) {
        zzaz().zzg();
        this.B = z;
    }

    @WorkerThread
    public final void zzH(com.google.android.gms.internal.measurement.zzcl zzclVar) {
        zzag zzagVar;
        zzaz().zzg();
        zzag zzagVarD = zzm().d();
        w wVarZzm = zzm();
        zzfv zzfvVar = wVarZzm.zzs;
        wVarZzm.zzg();
        int i = 100;
        int i2 = wVarZzm.b().getInt("consent_source", 100);
        zzaf zzafVar = this.g;
        zzfv zzfvVar2 = zzafVar.zzs;
        Boolean boolD = zzafVar.d("google_analytics_default_allow_ad_storage");
        zzaf zzafVar2 = this.g;
        zzfv zzfvVar3 = zzafVar2.zzs;
        Boolean boolD2 = zzafVar2.d("google_analytics_default_allow_analytics_storage");
        if (!(boolD == null && boolD2 == null) && zzm().j(-10)) {
            zzagVar = new zzag(boolD, boolD2);
            i = -10;
        } else {
            if (TextUtils.isEmpty(zzh().f()) || !(i2 == 0 || i2 == 30 || i2 == 10 || i2 == 30 || i2 == 30 || i2 == 40)) {
                zznx.zzc();
                if ((!this.g.zzs(null, zzdy.zzar) || TextUtils.isEmpty(zzh().f())) && zzclVar != null && zzclVar.zzg != null && zzm().j(30)) {
                    zzagVar = zzag.zza(zzclVar.zzg);
                    if (!zzagVar.equals(zzag.zza)) {
                        i = 30;
                    }
                }
            } else {
                zzq().zzS(zzag.zza, -10, this.E);
            }
            zzagVar = null;
        }
        if (zzagVar != null) {
            zzq().zzS(zzagVar, i, this.E);
            zzagVarD = zzagVar;
        }
        zzq().i(zzagVarD);
        if (zzm().d.zza() == 0) {
            zzay().zzj().zzb("Persisting first open", Long.valueOf(this.E));
            zzm().d.zzb(this.E);
        }
        zzq().l.c();
        if (zzM()) {
            if (!TextUtils.isEmpty(zzh().f()) || !TextUtils.isEmpty(zzh().e())) {
                zzkz zzkzVarZzv = zzv();
                String strF = zzh().f();
                w wVarZzm2 = zzm();
                wVarZzm2.zzg();
                String string = wVarZzm2.b().getString("gmp_app_id", null);
                String strE = zzh().e();
                w wVarZzm3 = zzm();
                wVarZzm3.zzg();
                if (zzkzVarZzv.C(strF, string, strE, wVarZzm3.b().getString("admob_app_id", null))) {
                    zzay().zzi().zza("Rechecking which service to use due to a GMP App Id change");
                    w wVarZzm4 = zzm();
                    wVarZzm4.zzg();
                    Boolean boolE = wVarZzm4.e();
                    SharedPreferences.Editor editorEdit = wVarZzm4.b().edit();
                    editorEdit.clear();
                    editorEdit.apply();
                    if (boolE != null) {
                        wVarZzm4.f(boolE);
                    }
                    zzi().zzj();
                    this.u.zzs();
                    this.u.q();
                    zzm().d.zzb(this.E);
                    zzm().f.zzb(null);
                }
                w wVarZzm5 = zzm();
                String strF2 = zzh().f();
                wVarZzm5.zzg();
                SharedPreferences.Editor editorEdit2 = wVarZzm5.b().edit();
                editorEdit2.putString("gmp_app_id", strF2);
                editorEdit2.apply();
                w wVarZzm6 = zzm();
                String strE2 = zzh().e();
                wVarZzm6.zzg();
                SharedPreferences.Editor editorEdit3 = wVarZzm6.b().edit();
                editorEdit3.putString("admob_app_id", strE2);
                editorEdit3.apply();
            }
            if (!zzm().d().zzk()) {
                zzm().f.zzb(null);
            }
            zzq().h(zzm().f.zza());
            zznu.zzc();
            if (this.g.zzs(null, zzdy.zzah)) {
                try {
                    zzv().zzs.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(zzm().s.zza())) {
                        zzay().zzk().zza("Remote config removed with active feature rollouts");
                        zzm().s.zzb(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(zzh().f()) || !TextUtils.isEmpty(zzh().e())) {
                boolean zZzJ = zzJ();
                if (!zzm().h() && !this.g.zzv()) {
                    zzm().g(!zZzJ);
                }
                if (zZzJ) {
                    zzq().zzy();
                }
                zzu().zza.a();
                zzt().zzu(new AtomicReference<>());
                zzt().zzH(zzm().v.zza());
            }
        } else if (zzJ()) {
            if (!zzv().t("android.permission.INTERNET")) {
                zzay().zzd().zza("App is missing INTERNET permission");
            }
            if (!zzv().t("android.permission.ACCESS_NETWORK_STATE")) {
                zzay().zzd().zza("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!Wrappers.packageManager(this.a).isCallerInstantApp() && !this.g.h()) {
                if (!zzkz.z(this.a)) {
                    zzay().zzd().zza("AppMeasurementReceiver not registered/enabled");
                }
                if (!zzkz.A(this.a, false)) {
                    zzay().zzd().zza("AppMeasurementService not registered/enabled");
                }
            }
            zzay().zzd().zza("Uploading is not possible. App measurement disabled");
        }
        zzm().m.zza(true);
    }

    @WorkerThread
    public final boolean zzI() {
        return this.A != null && this.A.booleanValue();
    }

    @WorkerThread
    public final boolean zzJ() {
        return zza() == 0;
    }

    @WorkerThread
    public final boolean zzK() {
        zzaz().zzg();
        return this.B;
    }

    @Pure
    public final boolean zzL() {
        return TextUtils.isEmpty(this.b);
    }

    @WorkerThread
    public final boolean zzM() {
        if (!this.x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        zzaz().zzg();
        Boolean bool = this.y;
        if (bool == null || this.z == 0 || (!bool.booleanValue() && Math.abs(this.n.elapsedRealtime() - this.z) > 1000)) {
            this.z = this.n.elapsedRealtime();
            boolean z = true;
            Boolean boolValueOf = Boolean.valueOf(zzv().t("android.permission.INTERNET") && zzv().t("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.a).isCallerInstantApp() || this.g.h() || (zzkz.z(this.a) && zzkz.A(this.a, false))));
            this.y = boolValueOf;
            if (boolValueOf.booleanValue()) {
                if (!zzv().m(zzh().f(), zzh().e(), zzh().zzm()) && TextUtils.isEmpty(zzh().e())) {
                    z = false;
                }
                this.y = Boolean.valueOf(z);
            }
        }
        return this.y.booleanValue();
    }

    @Pure
    public final boolean zzN() {
        return this.e;
    }

    @WorkerThread
    public final int zza() {
        zzaz().zzg();
        if (this.g.zzv()) {
            return 1;
        }
        Boolean bool = this.zzb;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        zzaz().zzg();
        if (!this.B) {
            return 8;
        }
        Boolean boolE = zzm().e();
        if (boolE != null) {
            return boolE.booleanValue() ? 0 : 3;
        }
        zzaf zzafVar = this.g;
        zzaa zzaaVar = zzafVar.zzs.f;
        Boolean boolD = zzafVar.d("firebase_analytics_collection_enabled");
        if (boolD != null) {
            return boolD.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.zza;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        return (!this.g.zzs(null, zzdy.zzS) || this.A == null || this.A.booleanValue()) ? 0 : 7;
    }

    @Override // com.google.android.gms.measurement.internal.z0
    @Pure
    public final Context zzau() {
        return this.a;
    }

    @Override // com.google.android.gms.measurement.internal.z0
    @Pure
    public final Clock zzav() {
        return this.n;
    }

    @Override // com.google.android.gms.measurement.internal.z0
    @Pure
    public final zzaa zzaw() {
        return this.f;
    }

    @Override // com.google.android.gms.measurement.internal.z0
    @Pure
    public final zzel zzay() {
        i(this.i);
        return this.i;
    }

    @Override // com.google.android.gms.measurement.internal.z0
    @Pure
    public final zzfs zzaz() {
        i(this.j);
        return this.j;
    }

    @Pure
    public final zzd zzd() {
        zzd zzdVar = this.q;
        if (zzdVar != null) {
            return zzdVar;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final zzaf zzf() {
        return this.g;
    }

    @Pure
    public final zzan zzg() {
        i(this.v);
        return this.v;
    }

    @Pure
    public final zzec zzh() {
        h(this.w);
        return this.w;
    }

    @Pure
    public final zzee zzi() {
        h(this.t);
        return this.t;
    }

    @Pure
    public final zzeg zzj() {
        return this.m;
    }

    public final zzel zzl() {
        zzel zzelVar = this.i;
        if (zzelVar == null || !zzelVar.a()) {
            return null;
        }
        return this.i;
    }

    @Pure
    public final w zzm() {
        g(this.h);
        return this.h;
    }

    @Pure
    public final zzia zzq() {
        h(this.p);
        return this.p;
    }

    @Pure
    public final zzie zzr() {
        i(this.r);
        return this.r;
    }

    @Pure
    public final zzio zzs() {
        h(this.o);
        return this.o;
    }

    @Pure
    public final zzjo zzt() {
        h(this.u);
        return this.u;
    }

    @Pure
    public final zzkd zzu() {
        h(this.k);
        return this.k;
    }

    @Pure
    public final zzkz zzv() {
        g(this.l);
        return this.l;
    }

    @Pure
    public final String zzw() {
        return this.b;
    }

    @Pure
    public final String zzx() {
        return this.c;
    }

    @Pure
    public final String zzy() {
        return this.d;
    }

    @Pure
    public final String zzz() {
        return this.s;
    }
}
