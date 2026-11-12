package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznu;
import com.google.android.gms.internal.measurement.zznx;
import com.google.android.gms.internal.measurement.zzod;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzia extends v {
    private zzgv b;
    private final Set<zzgw> c;
    private boolean d;
    private final AtomicReference<String> e;
    private final Object f;

    @GuardedBy("consentLock")
    private zzag g;

    @GuardedBy("consentLock")
    private int h;
    private final AtomicLong i;
    private long j;
    private int k;
    public final zzr l;
    private final c4 m;

    @VisibleForTesting
    public y1 zza;

    @VisibleForTesting
    public boolean zzc;

    public zzia(zzfv zzfvVar) {
        super(zzfvVar);
        this.c = new CopyOnWriteArraySet();
        this.f = new Object();
        this.zzc = true;
        this.m = new o1(this);
        this.e = new AtomicReference<>();
        this.g = new zzag(null, null);
        this.h = 100;
        this.j = -1L;
        this.k = 100;
        this.i = new AtomicLong(0L);
        this.l = new zzr(zzfvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void b(Bundle bundle, long j) {
        zznx.zzc();
        if (!this.zzs.zzf().zzs(null, zzdy.zzar) || TextUtils.isEmpty(this.zzs.zzh().f())) {
            zzR(bundle, 0, j);
        } else {
            this.zzs.zzay().zzl().zza("Using developer consent only; google app id found");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void l(Boolean bool, boolean z) {
        zzg();
        zza();
        this.zzs.zzay().zzc().zzb("Setting app measurement enabled (FE)", bool);
        this.zzs.zzm().f(bool);
        if (z) {
            w wVarZzm = this.zzs.zzm();
            zzfv zzfvVar = wVarZzm.zzs;
            wVarZzm.zzg();
            SharedPreferences.Editor editorEdit = wVarZzm.b().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.zzs.zzK() || !(bool == null || bool.booleanValue())) {
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void m() {
        zzg();
        String strZza = this.zzs.zzm().l.zza();
        if (strZza != null) {
            if ("unset".equals(strZza)) {
                j("app", "_npa", null, this.zzs.zzav().currentTimeMillis());
            } else {
                j("app", "_npa", Long.valueOf(true != "true".equals(strZza) ? 0L : 1L), this.zzs.zzav().currentTimeMillis());
            }
        }
        if (!this.zzs.zzJ() || !this.zzc) {
            this.zzs.zzay().zzc().zza("Updating Scion state (FE)");
            this.zzs.zzt().zzI();
            return;
        }
        this.zzs.zzay().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
        zzy();
        zzod.zzc();
        if (this.zzs.zzf().zzs(null, zzdy.zzai)) {
            this.zzs.zzu().zza.a();
        }
        this.zzs.zzaz().zzp(new d1(this));
    }

    public static /* synthetic */ void n(zzia zziaVar, zzag zzagVar, int i, long j, boolean z, boolean z2) {
        zziaVar.zzg();
        zziaVar.zza();
        if (j <= zziaVar.j && zzag.zzl(zziaVar.k, i)) {
            zziaVar.zzs.zzay().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzagVar);
            return;
        }
        w wVarZzm = zziaVar.zzs.zzm();
        zzfv zzfvVar = wVarZzm.zzs;
        wVarZzm.zzg();
        if (!wVarZzm.j(i)) {
            zziaVar.zzs.zzay().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        SharedPreferences.Editor editorEdit = wVarZzm.b().edit();
        editorEdit.putString("consent_settings", zzagVar.zzi());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        zziaVar.j = j;
        zziaVar.k = i;
        zziaVar.zzs.zzt().zzF(z);
        if (z2) {
            zziaVar.zzs.zzt().zzu(new AtomicReference<>());
        }
    }

    public final /* synthetic */ void c(Bundle bundle) {
        if (bundle == null) {
            this.zzs.zzm().v.zzb(new Bundle());
            return;
        }
        Bundle bundleZza = this.zzs.zzm().v.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.zzs.zzv().v(obj)) {
                    this.zzs.zzv().j(this.m, null, 27, null, null, 0);
                }
                this.zzs.zzay().zzl().zzc("Invalid default event parameter type. Name, value", str, obj);
            } else if (zzkz.x(str)) {
                this.zzs.zzay().zzl().zzb("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                bundleZza.remove(str);
            } else {
                zzkz zzkzVarZzv = this.zzs.zzv();
                this.zzs.zzf();
                if (zzkzVarZzv.p("param", str, 100, obj)) {
                    this.zzs.zzv().k(bundleZza, str, obj);
                }
            }
        }
        this.zzs.zzv();
        int iZzc = this.zzs.zzf().zzc();
        if (bundleZza.size() > iZzc) {
            int i = 0;
            for (String str2 : new TreeSet(bundleZza.keySet())) {
                i++;
                if (i > iZzc) {
                    bundleZza.remove(str2);
                }
            }
            this.zzs.zzv().j(this.m, null, 26, null, null, 0);
            this.zzs.zzay().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.zzs.zzm().v.zzb(bundleZza);
        this.zzs.zzt().zzH(bundleZza);
    }

    @WorkerThread
    public final void d(String str, String str2, Bundle bundle) {
        zzg();
        e(str, str2, this.zzs.zzav().currentTimeMillis(), bundle);
    }

    @WorkerThread
    public final void e(String str, String str2, long j, Bundle bundle) {
        zzg();
        zzI(str, str2, j, bundle, true, this.b == null || zzkz.x(str2), true, null);
    }

    public final void f(long j, boolean z) {
        zzg();
        zza();
        this.zzs.zzay().zzc().zza("Resetting analytics data (FE)");
        zzkd zzkdVarZzu = this.zzs.zzu();
        zzkdVarZzu.zzg();
        zzkdVarZzu.zzb.a();
        boolean zZzJ = this.zzs.zzJ();
        w wVarZzm = this.zzs.zzm();
        wVarZzm.d.zzb(j);
        if (!TextUtils.isEmpty(wVarZzm.zzs.zzm().s.zza())) {
            wVarZzm.s.zzb(null);
        }
        zzod.zzc();
        zzaf zzafVarZzf = wVarZzm.zzs.zzf();
        zzdx<Boolean> zzdxVar = zzdy.zzai;
        if (zzafVarZzf.zzs(null, zzdxVar)) {
            wVarZzm.n.zzb(0L);
        }
        if (!wVarZzm.zzs.zzf().zzv()) {
            wVarZzm.g(!zZzJ);
        }
        wVarZzm.t.zzb(null);
        wVarZzm.u.zzb(0L);
        wVarZzm.v.zzb(null);
        if (z) {
            this.zzs.zzt().zzC();
        }
        zzod.zzc();
        if (this.zzs.zzf().zzs(null, zzdxVar)) {
            this.zzs.zzu().zza.a();
        }
        this.zzc = !zZzJ;
    }

    public final void g(String str, String str2, long j, Object obj) {
        this.zzs.zzaz().zzp(new g1(this, str, str2, obj, j));
    }

    public final void h(String str) {
        this.e.set(str);
    }

    @WorkerThread
    public final void i(zzag zzagVar) {
        zzg();
        boolean z = (zzagVar.zzk() && zzagVar.zzj()) || this.zzs.zzt().c();
        if (z != this.zzs.zzK()) {
            this.zzs.zzG(z);
            w wVarZzm = this.zzs.zzm();
            zzfv zzfvVar = wVarZzm.zzs;
            wVarZzm.zzg();
            Boolean boolValueOf = wVarZzm.b().contains("measurement_enabled_from_api") ? Boolean.valueOf(wVarZzm.b().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                l(Boolean.valueOf(z), false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    @WorkerThread
    public final void j(String str, String str2, Object obj, long j) {
        String str3;
        Object obj2;
        Object obj3;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zza();
        if (FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS.equals(str2)) {
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (!TextUtils.isEmpty(str4)) {
                    Long lValueOf = Long.valueOf(true != "false".equals(str4.toLowerCase(Locale.ENGLISH)) ? 0L : 1L);
                    this.zzs.zzm().l.zzb(lValueOf.longValue() == 1 ? "true" : "false");
                    obj3 = lValueOf;
                } else if (obj == null) {
                    this.zzs.zzm().l.zzb("unset");
                    obj3 = obj;
                } else {
                    str3 = str2;
                    obj2 = obj;
                }
            } else if (obj == null) {
                this.zzs.zzm().l.zzb("unset");
                obj3 = obj;
            } else {
                str3 = str2;
                obj2 = obj;
            }
            obj2 = obj3;
            str3 = "_npa";
        } else {
            str3 = str2;
            obj2 = obj;
        }
        if (!this.zzs.zzJ()) {
            this.zzs.zzay().zzj().zza("User property not set since app measurement is disabled");
        } else if (this.zzs.zzM()) {
            this.zzs.zzt().zzK(new zzkv(str3, j, obj2, str));
        }
    }

    public final void zzA() {
        if (!(this.zzs.zzau().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) this.zzs.zzau().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    public final void zzD(String str, String str2, Bundle bundle) {
        zzE(str, str2, bundle, true, true, this.zzs.zzav().currentTimeMillis());
    }

    public final void zzE(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (zzkz.B(str2, FirebaseAnalytics.Event.SCREEN_VIEW)) {
            this.zzs.zzs().zzx(bundle2, j);
        } else {
            zzM(str3, str2, j, bundle2, z2, !z2 || this.b == null || zzkz.x(str2), z, null);
        }
    }

    public final void zzF(String str, String str2, Bundle bundle, String str3) {
        zzfv.f();
        zzM("auto", str2, this.zzs.zzav().currentTimeMillis(), bundle, false, true, true, str3);
    }

    @WorkerThread
    public final void zzI(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        boolean z4;
        Bundle[] bundleArr;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        zzg();
        zza();
        if (!this.zzs.zzJ()) {
            this.zzs.zzay().zzc().zza("Event not sent since app measurement is disabled");
            return;
        }
        List<String> listG = this.zzs.zzh().g();
        if (listG != null && !listG.contains(str2)) {
            this.zzs.zzay().zzc().zzc("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.d) {
            this.d = true;
            try {
                try {
                    (!this.zzs.zzN() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzs.zzau().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.zzs.zzau());
                } catch (Exception e) {
                    this.zzs.zzay().zzk().zzb("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                this.zzs.zzay().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            this.zzs.zzaw();
            j("auto", "_lgclid", bundle.getString("gclid"), this.zzs.zzav().currentTimeMillis());
        }
        this.zzs.zzaw();
        if (z && zzkz.zzal(str2)) {
            this.zzs.zzv().h(bundle, this.zzs.zzm().v.zza());
        }
        if (!z3) {
            this.zzs.zzaw();
            if (!"_iap".equals(str2)) {
                zzkz zzkzVarZzv = this.zzs.zzv();
                int i = 2;
                if (zzkzVarZzv.s("event", str2)) {
                    if (zzkzVarZzv.o("event", zzgs.zza, zzgs.zzb, str2)) {
                        zzkzVarZzv.zzs.zzf();
                        if (zzkzVarZzv.n("event", 40, str2)) {
                            i = 0;
                        }
                    } else {
                        i = 13;
                    }
                }
                if (i != 0) {
                    this.zzs.zzay().zze().zzb("Invalid public event name. Event will not be logged (FE)", this.zzs.zzj().zzd(str2));
                    zzkz zzkzVarZzv2 = this.zzs.zzv();
                    this.zzs.zzf();
                    this.zzs.zzv().j(this.m, null, i, "_ev", zzkzVarZzv2.zzC(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        zzpn.zzc();
        if (this.zzs.zzf().zzs(null, zzdy.zzaA)) {
            this.zzs.zzaw();
            zzih zzihVarZzj = this.zzs.zzs().zzj(false);
            if (zzihVarZzj != null && !bundle.containsKey("_sc")) {
                zzihVarZzj.a = true;
            }
            zzkz.zzJ(zzihVarZzj, bundle, z && !z3);
        } else {
            this.zzs.zzaw();
            zzih zzihVarZzj2 = this.zzs.zzs().zzj(false);
            if (zzihVarZzj2 != null && !bundle.containsKey("_sc")) {
                zzihVarZzj2.a = true;
            }
            zzkz.zzJ(zzihVarZzj2, bundle, z && !z3);
        }
        boolean zEquals = "am".equals(str);
        boolean zX = zzkz.x(str2);
        if (!z || this.b == null || zX) {
            z4 = zEquals;
        } else {
            if (!zEquals) {
                this.zzs.zzay().zzc().zzc("Passing event to registered event handler (FE)", this.zzs.zzj().zzd(str2), this.zzs.zzj().zzb(bundle));
                Preconditions.checkNotNull(this.b);
                this.b.interceptEvent(str, str2, bundle, j);
                return;
            }
            z4 = true;
        }
        if (this.zzs.zzM()) {
            int iZzh = this.zzs.zzv().zzh(str2);
            if (iZzh != 0) {
                this.zzs.zzay().zze().zzb("Invalid event name. Event will not be logged (FE)", this.zzs.zzj().zzd(str2));
                zzkz zzkzVarZzv3 = this.zzs.zzv();
                this.zzs.zzf();
                this.zzs.zzv().j(this.m, str3, iZzh, "_ev", zzkzVarZzv3.zzC(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleR = this.zzs.zzv().R(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{com.google.firebase.crashlytics.a.c, "_sn", "_sc", "_si"}), z3);
            Preconditions.checkNotNull(bundleR);
            this.zzs.zzaw();
            if (this.zzs.zzs().zzj(false) != null && "_ae".equals(str2)) {
                o3 o3Var = this.zzs.zzu().zzb;
                long jElapsedRealtime = o3Var.d.zzs.zzav().elapsedRealtime();
                long j2 = jElapsedRealtime - o3Var.b;
                o3Var.b = jElapsedRealtime;
                if (j2 > 0) {
                    this.zzs.zzv().f(bundleR, j2);
                }
            }
            zznu.zzc();
            if (this.zzs.zzf().zzs(null, zzdy.zzah)) {
                if (!"auto".equals(str) && "_ssr".equals(str2)) {
                    zzkz zzkzVarZzv4 = this.zzs.zzv();
                    String string = bundleR.getString("_ffr");
                    if (Strings.isEmptyOrWhitespace(string)) {
                        string = null;
                    } else if (string != null) {
                        string = string.trim();
                    }
                    if (zzkz.B(string, zzkzVarZzv4.zzs.zzm().s.zza())) {
                        zzkzVarZzv4.zzs.zzay().zzc().zza("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    zzkzVarZzv4.zzs.zzm().s.zzb(string);
                } else if ("_ae".equals(str2)) {
                    String strZza = this.zzs.zzv().zzs.zzm().s.zza();
                    if (!TextUtils.isEmpty(strZza)) {
                        bundleR.putString("_ffr", strZza);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleR);
            if (this.zzs.zzm().n.zza() > 0 && this.zzs.zzm().i(j) && this.zzs.zzm().p.zzb()) {
                this.zzs.zzay().zzj().zza("Current session is expired, remove the session number, ID, and engagement time");
                j("auto", "_sid", null, this.zzs.zzav().currentTimeMillis());
                j("auto", "_sno", null, this.zzs.zzav().currentTimeMillis());
                j("auto", "_se", null, this.zzs.zzav().currentTimeMillis());
            }
            if (bundleR.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, 0L) == 1) {
                this.zzs.zzay().zzj().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                this.zzs.zzu().zza.b(j, true);
            }
            ArrayList arrayList2 = new ArrayList(bundleR.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str4 = (String) arrayList2.get(i2);
                if (str4 != null) {
                    this.zzs.zzv();
                    Object obj = bundleR.get(str4);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj};
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleR.putParcelableArray(str4, bundleArr);
                    }
                }
            }
            int i3 = 0;
            while (i3 < arrayList.size()) {
                Bundle bundleQ = (Bundle) arrayList.get(i3);
                String str5 = i3 != 0 ? "_ep" : str2;
                bundleQ.putString(com.google.firebase.crashlytics.a.c, str);
                if (z2) {
                    bundleQ = this.zzs.zzv().Q(bundleQ);
                }
                Bundle bundle2 = bundleQ;
                this.zzs.zzt().zzA(new zzat(str5, new zzar(bundle2), str, j), str3);
                if (!z4) {
                    Iterator<zzgw> it2 = this.c.iterator();
                    while (it2.hasNext()) {
                        it2.next().onEvent(str, str2, new Bundle(bundle2), j);
                    }
                }
                i3++;
            }
            this.zzs.zzaw();
            if (this.zzs.zzs().zzj(false) == null || !"_ae".equals(str2)) {
                return;
            }
            this.zzs.zzu().zzb.d(true, true, this.zzs.zzav().elapsedRealtime());
        }
    }

    public final void zzJ(zzgw zzgwVar) {
        zza();
        Preconditions.checkNotNull(zzgwVar);
        if (this.c.add(zzgwVar)) {
            return;
        }
        this.zzs.zzay().zzk().zza("OnEventListener already registered");
    }

    public final void zzK(long j) {
        this.e.set(null);
        this.zzs.zzaz().zzp(new i1(this, j));
    }

    public final void zzM(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.zzs.zzaz().zzp(new f1(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    public final void zzP(Bundle bundle) {
        zzQ(bundle, this.zzs.zzav().currentTimeMillis());
    }

    public final void zzQ(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.zzs.zzay().zzk().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzgr.zza(bundle2, "app_id", String.class, null);
        zzgr.zza(bundle2, "origin", String.class, null);
        zzgr.zza(bundle2, "name", String.class, null);
        zzgr.zza(bundle2, "value", Object.class, null);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.zzs.zzv().N(string) != 0) {
            this.zzs.zzay().zzd().zzb("Invalid conditional user property name", this.zzs.zzj().zzf(string));
            return;
        }
        if (this.zzs.zzv().K(string, obj) != 0) {
            this.zzs.zzay().zzd().zzc("Invalid conditional user property value", this.zzs.zzj().zzf(string), obj);
            return;
        }
        Object objC = this.zzs.zzv().c(string, obj);
        if (objC == null) {
            this.zzs.zzay().zzd().zzc("Unable to normalize conditional user property value", this.zzs.zzj().zzf(string), obj);
            return;
        }
        zzgr.zzb(bundle2, objC);
        long j2 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
            this.zzs.zzf();
            if (j2 > 15552000000L || j2 < 1) {
                this.zzs.zzay().zzd().zzc("Invalid conditional user property timeout", this.zzs.zzj().zzf(string), Long.valueOf(j2));
                return;
            }
        }
        long j3 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        this.zzs.zzf();
        if (j3 > 15552000000L || j3 < 1) {
            this.zzs.zzay().zzd().zzc("Invalid conditional user property time to live", this.zzs.zzj().zzf(string), Long.valueOf(j3));
        } else {
            this.zzs.zzaz().zzp(new j1(this, bundle2));
        }
    }

    public final void zzR(Bundle bundle, int i, long j) {
        zza();
        String strZzh = zzag.zzh(bundle);
        if (strZzh != null) {
            this.zzs.zzay().zzl().zzb("Ignoring invalid consent setting", strZzh);
            this.zzs.zzay().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        zzS(zzag.zza(bundle), i, j);
    }

    public final void zzS(zzag zzagVar, int i, long j) {
        boolean z;
        boolean z2;
        zzag zzagVar2;
        boolean z3;
        zza();
        if (i != -10 && zzagVar.zze() == null && zzagVar.zzf() == null) {
            this.zzs.zzay().zzl().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.f) {
            z = true;
            z2 = false;
            if (zzag.zzl(i, this.h)) {
                boolean zZzm = zzagVar.zzm(this.g);
                if (zzagVar.zzk() && !this.g.zzk()) {
                    z2 = true;
                }
                zzag zzagVarZzd = zzagVar.zzd(this.g);
                this.g = zzagVarZzd;
                this.h = i;
                zzagVar2 = zzagVarZzd;
                z3 = z2;
                z2 = zZzm;
            } else {
                zzagVar2 = zzagVar;
                z3 = false;
                z = false;
            }
        }
        if (!z) {
            this.zzs.zzay().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzagVar2);
            return;
        }
        long andIncrement = this.i.getAndIncrement();
        if (z2) {
            this.e.set(null);
            this.zzs.zzaz().zzq(new u1(this, zzagVar2, j, i, andIncrement, z3));
        } else if (i == 30 || i == -10) {
            this.zzs.zzaz().zzq(new v1(this, zzagVar2, i, andIncrement, z3));
        } else {
            this.zzs.zzaz().zzp(new w1(this, zzagVar2, i, andIncrement, z3));
        }
    }

    public final void zzT(final Bundle bundle, final long j) {
        zznx.zzc();
        if (this.zzs.zzf().zzs(null, zzdy.zzas)) {
            this.zzs.zzaz().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhb
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.b(bundle, j);
                }
            });
        } else {
            b(bundle, j);
        }
    }

    @WorkerThread
    public final void zzU(zzgv zzgvVar) {
        zzgv zzgvVar2;
        zzg();
        zza();
        if (zzgvVar != null && zzgvVar != (zzgvVar2 = this.b)) {
            Preconditions.checkState(zzgvVar2 == null, "EventInterceptor already set.");
        }
        this.b = zzgvVar;
    }

    public final void zzV(Boolean bool) {
        zza();
        this.zzs.zzaz().zzp(new t1(this, bool));
    }

    public final void zzX(String str, String str2, Object obj, boolean z) {
        zzY("auto", "_ldl", obj, true, this.zzs.zzav().currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    public final void zzY(String str, String str2, Object obj, boolean z, long j) {
        int iN;
        String str3 = str == null ? "app" : str;
        if (z) {
            iN = this.zzs.zzv().N(str2);
        } else {
            zzkz zzkzVarZzv = this.zzs.zzv();
            if (!zzkzVarZzv.s("user property", str2)) {
                iN = 6;
            } else if (zzkzVarZzv.o("user property", zzgu.zza, null, str2)) {
                zzkzVarZzv.zzs.zzf();
                if (zzkzVarZzv.n("user property", 24, str2)) {
                    iN = 0;
                } else {
                    iN = 6;
                }
            } else {
                iN = 15;
            }
        }
        if (iN != 0) {
            zzkz zzkzVarZzv2 = this.zzs.zzv();
            this.zzs.zzf();
            this.zzs.zzv().j(this.m, null, iN, "_ev", zzkzVarZzv2.zzC(str2, 24, true), str2 != null ? str2.length() : 0);
        } else {
            if (obj == null) {
                g(str3, str2, j, null);
                return;
            }
            int iK = this.zzs.zzv().K(str2, obj);
            if (iK != 0) {
                zzkz zzkzVarZzv3 = this.zzs.zzv();
                this.zzs.zzf();
                this.zzs.zzv().j(this.m, null, iK, "_ev", zzkzVarZzv3.zzC(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
            } else {
                Object objC = this.zzs.zzv().c(str2, obj);
                if (objC != null) {
                    g(str3, str2, j, objC);
                }
            }
        }
    }

    public final void zzaa(zzgw zzgwVar) {
        zza();
        Preconditions.checkNotNull(zzgwVar);
        if (this.c.remove(zzgwVar)) {
            return;
        }
        this.zzs.zzay().zzk().zza("OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.measurement.internal.v
    public final boolean zzf() {
        return false;
    }

    public final int zzh(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzs.zzf();
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzs.zzaz().e(atomicReference, 15000L, "boolean test flag value", new l1(this, atomicReference));
    }

    public final Double zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzs.zzaz().e(atomicReference, 15000L, "double test flag value", new s1(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzs.zzaz().e(atomicReference, 15000L, "int test flag value", new r1(this, atomicReference));
    }

    public final Long zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzs.zzaz().e(atomicReference, 15000L, "long test flag value", new q1(this, atomicReference));
    }

    public final String zzo() {
        return this.e.get();
    }

    public final String zzp() {
        zzih zzihVarZzi = this.zzs.zzs().zzi();
        if (zzihVarZzi != null) {
            return zzihVarZzi.zzb;
        }
        return null;
    }

    public final String zzq() {
        zzih zzihVarZzi = this.zzs.zzs().zzi();
        if (zzihVarZzi != null) {
            return zzihVarZzi.zza;
        }
        return null;
    }

    public final String zzr() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzs.zzaz().e(atomicReference, 15000L, "String test flag value", new p1(this, atomicReference));
    }

    public final ArrayList<Bundle> zzs(String str, String str2) {
        if (this.zzs.zzaz().zzs()) {
            this.zzs.zzay().zzd().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        this.zzs.zzaw();
        if (zzaa.zza()) {
            this.zzs.zzay().zzd().zza("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaz().e(atomicReference, 5000L, "get conditional user properties", new m1(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzkz.zzG(list);
        }
        this.zzs.zzay().zzd().zzb("Timed out waiting for get conditional user properties", null);
        return new ArrayList<>();
    }

    public final List<zzkv> zzt(boolean z) {
        zza();
        this.zzs.zzay().zzj().zza("Getting user properties (FE)");
        if (this.zzs.zzaz().zzs()) {
            this.zzs.zzay().zzd().zza("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        }
        this.zzs.zzaw();
        if (zzaa.zza()) {
            this.zzs.zzay().zzd().zza("Cannot get all user properties from main thread");
            return Collections.emptyList();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaz().e(atomicReference, 5000L, "get user properties", new h1(this, atomicReference, z));
        List<zzkv> list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        this.zzs.zzay().zzd().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
        return Collections.emptyList();
    }

    public final Map<String, Object> zzu(String str, String str2, boolean z) {
        if (this.zzs.zzaz().zzs()) {
            this.zzs.zzay().zzd().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.zzs.zzaw();
        if (zzaa.zza()) {
            this.zzs.zzay().zzd().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaz().e(atomicReference, 5000L, "get user properties", new n1(this, atomicReference, null, str, str2, z));
        List<zzkv> list = (List) atomicReference.get();
        if (list == null) {
            this.zzs.zzay().zzd().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        ArrayMap arrayMap = new ArrayMap(list.size());
        for (zzkv zzkvVar : list) {
            Object objZza = zzkvVar.zza();
            if (objZza != null) {
                arrayMap.put(zzkvVar.zzb, objZza);
            }
        }
        return arrayMap;
    }

    @WorkerThread
    public final void zzy() {
        zzg();
        zza();
        if (this.zzs.zzM()) {
            if (this.zzs.zzf().zzs(null, zzdy.zzZ)) {
                zzaf zzafVarZzf = this.zzs.zzf();
                zzafVarZzf.zzs.zzaw();
                Boolean boolD = zzafVarZzf.d("google_analytics_deferred_deep_link_enabled");
                if (boolD != null && boolD.booleanValue()) {
                    this.zzs.zzay().zzc().zza("Deferred Deep Link feature enabled.");
                    this.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzgz
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzia zziaVar = this.zza;
                            zziaVar.zzg();
                            if (zziaVar.zzs.zzm().q.zzb()) {
                                zziaVar.zzs.zzay().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long jZza = zziaVar.zzs.zzm().r.zza();
                            zziaVar.zzs.zzm().r.zzb(1 + jZza);
                            zziaVar.zzs.zzf();
                            if (jZza < 5) {
                                zziaVar.zzs.zzE();
                            } else {
                                zziaVar.zzs.zzay().zzk().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                zziaVar.zzs.zzm().q.zza(true);
                            }
                        }
                    });
                }
            }
            this.zzs.zzt().zzq();
            this.zzc = false;
            w wVarZzm = this.zzs.zzm();
            wVarZzm.zzg();
            String string = wVarZzm.b().getString("previous_os_version", null);
            wVarZzm.zzs.zzg().zzu();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = wVarZzm.b().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.zzs.zzg().zzu();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            d("auto", "_ou", bundle);
        }
    }

    public final void zzz(String str, String str2, Bundle bundle) {
        long jCurrentTimeMillis = this.zzs.zzav().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        this.zzs.zzaz().zzp(new k1(this, bundle2));
    }
}
