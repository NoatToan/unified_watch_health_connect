package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes3.dex */
final class x implements Runnable {
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzbr a;
    public final /* synthetic */ ServiceConnection b;
    public final /* synthetic */ zzfc c;

    public x(zzfc zzfcVar, com.google.android.gms.internal.measurement.zzbr zzbrVar, ServiceConnection serviceConnection) {
        this.c = zzfcVar;
        this.a = zzbrVar;
        this.b = serviceConnection;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0118  */
    /* JADX WARN: Code duplicated, block: B:43:0x012f  */
    @Override // java.lang.Runnable
    public final void run() {
        zzfc zzfcVar = this.c;
        zzfd zzfdVar = zzfcVar.b;
        String str = zzfcVar.a;
        com.google.android.gms.internal.measurement.zzbr zzbrVar = this.a;
        ServiceConnection serviceConnection = this.b;
        zzfdVar.a.zzaz().zzg();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        Bundle bundle2 = null;
        try {
            Bundle bundleZzd = zzbrVar.zzd(bundle);
            if (bundleZzd == null) {
                zzfdVar.a.zzay().zzd().zza("Install Referrer Service returned a null response");
            } else {
                bundle2 = bundleZzd;
            }
        } catch (Exception e) {
            zzfdVar.a.zzay().zzd().zzb("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        zzfdVar.a.zzaz().zzg();
        zzfv.f();
        if (bundle2 != null) {
            long j = bundle2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                zzfdVar.a.zzay().zzk().zza("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    zzfdVar.a.zzay().zzd().zza("No referrer defined in Install Referrer response");
                } else {
                    zzfdVar.a.zzay().zzj().zzb("InstallReferrer API result", string);
                    Bundle bundleP = zzfdVar.a.zzv().P(Uri.parse(string.length() != 0 ? "?".concat(string) : new String("?")));
                    if (bundleP == null) {
                        zzfdVar.a.zzay().zzd().zza("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = bundleP.getString(FirebaseAnalytics.Param.MEDIUM);
                        if (string2 == null || "(not set)".equalsIgnoreCase(string2) || "organic".equalsIgnoreCase(string2)) {
                            if (j == zzfdVar.a.zzm().e.zza()) {
                                zzfdVar.a.zzay().zzj().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                            }
                            if (zzfdVar.a.zzJ()) {
                                zzfdVar.a.zzm().e.zzb(j);
                                zzfdVar.a.zzay().zzj().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                                bundleP.putString("_cis", "referrer API v2");
                                zzfdVar.a.zzq().zzF("auto", "_cmp", bundleP, str);
                            }
                        } else {
                            long j2 = bundle2.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                zzfdVar.a.zzay().zzd().zza("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                bundleP.putLong("click_timestamp", j2);
                                if (j == zzfdVar.a.zzm().e.zza()) {
                                    zzfdVar.a.zzay().zzj().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                                }
                                if (zzfdVar.a.zzJ()) {
                                    zzfdVar.a.zzm().e.zzb(j);
                                    zzfdVar.a.zzay().zzj().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                                    bundleP.putString("_cis", "referrer API v2");
                                    zzfdVar.a.zzq().zzF("auto", "_cmp", bundleP, str);
                                }
                            }
                        }
                    }
                }
            }
        }
        ConnectionTracker.getInstance().unbindService(zzfdVar.a.zzau(), serviceConnection);
    }
}
