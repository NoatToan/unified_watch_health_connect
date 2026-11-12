package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.MainThread;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(14)
@MainThread
final class y1 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ zzia a;

    public /* synthetic */ y1(zzia zziaVar, zzhy zzhyVar) {
        this.a = zziaVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzfv zzfvVar;
        Uri data;
        try {
            try {
                this.a.zzs.zzay().zzj().zza("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null || (data = intent.getData()) == null || !data.isHierarchical()) {
                    zzfvVar = this.a.zzs;
                } else {
                    this.a.zzs.zzv();
                    String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    boolean z = true;
                    String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                    String queryParameter = data.getQueryParameter("referrer");
                    if (bundle != null) {
                        z = false;
                    }
                    this.a.zzs.zzaz().zzp(new x1(this, z, data, str, queryParameter));
                    zzfvVar = this.a.zzs;
                }
            } catch (RuntimeException e) {
                this.a.zzs.zzay().zzd().zzb("Throwable caught in onActivityCreated", e);
                zzfvVar = this.a.zzs;
            }
            zzio zzioVarZzs = zzfvVar.zzs();
        } finally {
            this.a.zzs.zzs().zzr(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.a.zzs.zzs().zzs(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityPaused(Activity activity) {
        this.a.zzs.zzs().zzt(activity);
        zzkd zzkdVarZzu = this.a.zzs.zzu();
        zzkdVarZzu.zzs.zzaz().zzp(new j3(zzkdVarZzu, zzkdVarZzu.zzs.zzav().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityResumed(Activity activity) {
        zzkd zzkdVarZzu = this.a.zzs.zzu();
        zzkdVarZzu.zzs.zzaz().zzp(new i3(zzkdVarZzu, zzkdVarZzu.zzs.zzav().elapsedRealtime()));
        this.a.zzs.zzs().zzu(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.a.zzs.zzs().zzv(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
