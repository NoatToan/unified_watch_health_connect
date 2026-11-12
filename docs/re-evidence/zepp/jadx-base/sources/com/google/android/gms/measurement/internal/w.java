package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes3.dex */
final class w extends y0 {

    @VisibleForTesting
    public static final Pair<String, Long> w = new Pair<>("", 0L);
    private SharedPreferences b;
    public zzey c;
    public final zzew d;
    public final zzew e;
    public final zzez f;
    private String g;
    private boolean h;
    private long i;
    public final zzew j;
    public final zzeu k;
    public final zzez l;
    public final zzeu m;
    public final zzew n;
    public boolean o;
    public final zzeu p;
    public final zzeu q;
    public final zzew r;
    public final zzez s;
    public final zzez t;
    public final zzew u;
    public final zzev v;

    public w(zzfv zzfvVar) {
        super(zzfvVar);
        this.j = new zzew(this, "session_timeout", BloodPressureCorrectViewModel.NEED_RETURN_TIME);
        this.k = new zzeu(this, "start_new_session", true);
        this.n = new zzew(this, "last_pause_time", 0L);
        this.l = new zzez(this, "non_personalized_ads", null);
        this.m = new zzeu(this, "allow_remote_dynamite", false);
        this.d = new zzew(this, "first_open_time", 0L);
        this.e = new zzew(this, "app_install_time", 0L);
        this.f = new zzez(this, "app_instance_id", null);
        this.p = new zzeu(this, "app_backgrounded", false);
        this.q = new zzeu(this, "deep_link_retrieval_complete", false);
        this.r = new zzew(this, "deep_link_retrieval_attempts", 0L);
        this.s = new zzez(this, "firebase_feature_rollouts", null);
        this.t = new zzez(this, "deferred_attribution_cache", null);
        this.u = new zzew(this, "deferred_attribution_cache_timestamp", 0L);
        this.v = new zzev(this, "default_event_parameters", null);
    }

    @VisibleForTesting
    @WorkerThread
    public final SharedPreferences b() {
        zzg();
        zzu();
        Preconditions.checkNotNull(this.b);
        return this.b;
    }

    @WorkerThread
    public final Pair<String, Boolean> c(String str) {
        zzg();
        long jElapsedRealtime = this.zzs.zzav().elapsedRealtime();
        String str2 = this.g;
        if (str2 != null && jElapsedRealtime < this.i) {
            return new Pair<>(str2, Boolean.valueOf(this.h));
        }
        this.i = jElapsedRealtime + this.zzs.zzf().zzi(str, zzdy.zza);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zzs.zzau());
            this.g = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.g = id;
            }
            this.h = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e) {
            this.zzs.zzay().zzc().zzb("Unable to get advertising id", e);
            this.g = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.g, Boolean.valueOf(this.h));
    }

    @WorkerThread
    public final zzag d() {
        zzg();
        return zzag.zzb(b().getString("consent_settings", "G1"));
    }

    @WorkerThread
    public final Boolean e() {
        zzg();
        if (b().contains("measurement_enabled")) {
            return Boolean.valueOf(b().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    @WorkerThread
    public final void f(Boolean bool) {
        zzg();
        SharedPreferences.Editor editorEdit = b().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    @WorkerThread
    public final void g(boolean z) {
        zzg();
        this.zzs.zzay().zzj().zzb("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = b().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    @WorkerThread
    public final boolean h() {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    public final boolean i(long j) {
        return j - this.j.zza() > this.n.zza();
    }

    @WorkerThread
    public final boolean j(int i) {
        return zzag.zzl(i, b().getInt("consent_source", 100));
    }

    @Override // com.google.android.gms.measurement.internal.y0
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    @WorkerThread
    public final void zzaA() {
        SharedPreferences sharedPreferences = this.zzs.zzau().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.b = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.o = z;
        if (!z) {
            SharedPreferences.Editor editorEdit = this.b.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.zzs.zzf();
        this.c = new zzey(this, "health_monitor", Math.max(0L, zzdy.zzb.zza(null).longValue()), null);
    }

    @Override // com.google.android.gms.measurement.internal.y0
    public final boolean zzf() {
        return true;
    }
}
