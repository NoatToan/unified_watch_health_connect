package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzr {
    private final zzfv a;

    public zzr(zzfv zzfvVar) {
        this.a = zzfvVar;
    }

    @WorkerThread
    public final void a(String str, Bundle bundle) {
        String string;
        this.a.zzaz().zzg();
        if (this.a.zzJ()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.a.zzm().t.zzb(string);
        this.a.zzm().u.zzb(this.a.zzav().currentTimeMillis());
    }

    @WorkerThread
    public final void b() {
        this.a.zzaz().zzg();
        if (d()) {
            if (e()) {
                this.a.zzm().t.zzb(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString(FirebaseAnalytics.Param.MEDIUM, "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.a.zzq().d("auto", "_cmpx", bundle);
            } else {
                String strZza = this.a.zzm().t.zza();
                if (TextUtils.isEmpty(strZza)) {
                    this.a.zzay().zzh().zza("Cache still valid but referrer not found");
                } else {
                    long jZza = ((this.a.zzm().u.zza() / 3600000) - 1) * 3600000;
                    Uri uri = Uri.parse(strZza);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", jZza);
                    Object obj = pair.first;
                    this.a.zzq().d(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.a.zzm().t.zzb(null);
            }
            this.a.zzm().u.zzb(0L);
        }
    }

    public final void c() {
        if (d() && e()) {
            this.a.zzm().t.zzb(null);
        }
    }

    public final boolean d() {
        return this.a.zzm().u.zza() > 0;
    }

    public final boolean e() {
        return d() && this.a.zzav().currentTimeMillis() - this.a.zzm().u.zza() > this.a.zzf().zzi(null, zzdy.zzQ);
    }
}
