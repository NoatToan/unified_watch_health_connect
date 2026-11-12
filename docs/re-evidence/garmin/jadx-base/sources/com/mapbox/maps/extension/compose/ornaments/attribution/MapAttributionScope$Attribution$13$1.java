package com.mapbox.maps.extension.compose.ornaments.attribution;

import com.mapbox.maps.plugin.attribution.Attribution;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p3.p1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapAttributionScope$Attribution$13$1 extends w implements l<Attribution, Unit> {
    final /* synthetic */ p1<String> $mapboxFeedbackUrl$delegate;
    final /* synthetic */ p1<Boolean> $showAttributionDialog$delegate;
    final /* synthetic */ p1<Boolean> $showGeofencingConsentDialog$delegate;
    final /* synthetic */ p1<Boolean> $showTelemetryDialog$delegate;
    final /* synthetic */ MapAttributionScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapAttributionScope$Attribution$13$1(MapAttributionScope mapAttributionScope, p1<Boolean> p1Var, p1<Boolean> p1Var2, p1<Boolean> p1Var3, p1<String> p1Var4) {
        super(1);
        this.this$0 = mapAttributionScope;
        this.$showAttributionDialog$delegate = p1Var;
        this.$showTelemetryDialog$delegate = p1Var2;
        this.$showGeofencingConsentDialog$delegate = p1Var3;
        this.$mapboxFeedbackUrl$delegate = p1Var4;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Attribution attribution) {
        attribution.getClass();
        MapAttributionScope.Attribution_hYmLsZ8$lambda$4(this.$showAttributionDialog$delegate, false);
        String url = attribution.getUrl();
        if (s.g(url, Attribution.ABOUT_TELEMETRY_URL)) {
            MapAttributionScope.Attribution_hYmLsZ8$lambda$7(this.$showTelemetryDialog$delegate, true);
            return;
        }
        if (s.g(url, Attribution.GEOFENCING_URL_MARKER)) {
            MapAttributionScope.Attribution_hYmLsZ8$lambda$10(this.$showGeofencingConsentDialog$delegate, true);
            return;
        }
        String strAttribution_hYmLsZ8$lambda$12 = d53.w.z(attribution.getUrl(), "feedback", false) ? MapAttributionScope.Attribution_hYmLsZ8$lambda$12(this.$mapboxFeedbackUrl$delegate) : attribution.getUrl();
        if (strAttribution_hYmLsZ8$lambda$12.length() > 0) {
            this.this$0.showWebPage(strAttribution_hYmLsZ8$lambda$12);
        }
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(Attribution attribution) {
        invoke2(attribution);
        return Unit.INSTANCE;
    }
}
