package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zze implements zza {
    public final Set<String> a;
    private final AnalyticsConnector.AnalyticsConnectorListener b;
    private final AppMeasurementSdk c;
    private final a d;

    public zze(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.b = analyticsConnectorListener;
        this.c = appMeasurementSdk;
        a aVar = new a(this);
        this.d = aVar;
        appMeasurementSdk.registerOnMeasurementEventListener(aVar);
        this.a = new HashSet();
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.b;
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb(Set<String> set) {
        this.a.clear();
        Set<String> set2 = this.a;
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if (hashSet.size() >= 50) {
                break;
            }
            if (zzc.zzf(str) && zzc.zzg(str)) {
                String strZzd = zzc.zzd(str);
                Preconditions.checkNotNull(strZzd);
                hashSet.add(strZzd);
            }
        }
        set2.addAll(hashSet);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzc() {
        this.a.clear();
    }
}
