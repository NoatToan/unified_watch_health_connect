package com.google.maps.android.compose.streetview;

import ch.qos.logback.core.net.SyslogConstants;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$3 implements p<StreetViewPanoramaPropertiesNode, Boolean, Unit> {
    final /* synthetic */ boolean $isUserNavigationEnabled;

    public StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$3(boolean z14) {
        this.$isUserNavigationEnabled = z14;
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(StreetViewPanoramaPropertiesNode streetViewPanoramaPropertiesNode, Boolean bool) {
        invoke(streetViewPanoramaPropertiesNode, bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(StreetViewPanoramaPropertiesNode streetViewPanoramaPropertiesNode, boolean z14) {
        streetViewPanoramaPropertiesNode.getClass();
        streetViewPanoramaPropertiesNode.getPanorama().setUserNavigationEnabled(this.$isUserNavigationEnabled);
    }
}
