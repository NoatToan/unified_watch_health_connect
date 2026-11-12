package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzg implements zza {
    private final AnalyticsConnector.AnalyticsConnectorListener a;
    private final AppMeasurementSdk b;
    private final b c;

    public zzg(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.a = analyticsConnectorListener;
        this.b = appMeasurementSdk;
        b bVar = new b(this);
        this.c = bVar;
        appMeasurementSdk.registerOnMeasurementEventListener(bVar);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.a;
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb(Set<String> set) {
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzc() {
    }
}
