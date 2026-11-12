package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
final class x1 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ y1 e;

    public x1(y1 y1Var, boolean z, Uri uri, String str, String str2) {
        this.e = y1Var;
        this.a = z;
        this.b = uri;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleP;
        Bundle bundleP2;
        y1 y1Var = this.e;
        boolean z = this.a;
        Uri uri = this.b;
        String str = this.c;
        String str2 = this.d;
        y1Var.a.zzg();
        try {
            zzkz zzkzVarZzv = y1Var.a.zzs.zzv();
            if (TextUtils.isEmpty(str2)) {
                bundleP = null;
            } else if (str2.contains("gclid") || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium")) {
                bundleP = zzkzVarZzv.P(Uri.parse(str2.length() != 0 ? "https://google.com/search?".concat(str2) : new String("https://google.com/search?")));
                if (bundleP != null) {
                    bundleP.putString("_cis", "referrer");
                }
            } else {
                zzkzVarZzv.zzs.zzay().zzc().zza("Activity created with data 'referrer' without required params");
                bundleP = null;
            }
            if (z && (bundleP2 = y1Var.a.zzs.zzv().P(uri)) != null) {
                bundleP2.putString("_cis", "intent");
                if (!bundleP2.containsKey("gclid") && bundleP != null && bundleP.containsKey("gclid")) {
                    bundleP2.putString("_cer", String.format("gclid=%s", bundleP.getString("gclid")));
                }
                y1Var.a.d(str, "_cmp", bundleP2);
                y1Var.a.l.a(str, bundleP2);
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            y1Var.a.zzs.zzay().zzc().zzb("Activity created with referrer", str2);
            if (y1Var.a.zzs.zzf().zzs(null, zzdy.zzaa)) {
                if (bundleP != null) {
                    y1Var.a.d(str, "_cmp", bundleP);
                    y1Var.a.l.a(str, bundleP);
                } else {
                    y1Var.a.zzs.zzay().zzc().zzb("Referrer does not contain valid parameters", str2);
                }
                y1Var.a.zzX("auto", "_ldl", null, true);
                return;
            }
            if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                y1Var.a.zzs.zzay().zzc().zza("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                y1Var.a.zzX("auto", "_ldl", str2, true);
            }
        } catch (RuntimeException e) {
            y1Var.a.zzs.zzay().zzd().zzb("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }
}
