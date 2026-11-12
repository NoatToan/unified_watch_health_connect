package com.google.maps.android.compose.streetview;

import ch.qos.logback.core.net.SyslogConstants;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$5 implements p<StreetViewPanoramaPropertiesNode, StreetViewPanoramaEventListeners, Unit> {
    public static final StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$5 INSTANCE = new StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$5();

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(StreetViewPanoramaPropertiesNode streetViewPanoramaPropertiesNode, StreetViewPanoramaEventListeners streetViewPanoramaEventListeners) {
        invoke2(streetViewPanoramaPropertiesNode, streetViewPanoramaEventListeners);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(StreetViewPanoramaPropertiesNode streetViewPanoramaPropertiesNode, StreetViewPanoramaEventListeners streetViewPanoramaEventListeners) {
        streetViewPanoramaPropertiesNode.getClass();
        streetViewPanoramaEventListeners.getClass();
        streetViewPanoramaPropertiesNode.setEventListeners(streetViewPanoramaEventListeners);
    }
}
