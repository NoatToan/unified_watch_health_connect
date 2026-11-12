package com.google.maps.android.compose;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.GoogleMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class MapUpdaterKt$MapUpdater$1$2$14 implements e23.p<MapPropertiesNode, Float, Unit> {
    final /* synthetic */ GoogleMap $map;

    public MapUpdaterKt$MapUpdater$1$2$14(GoogleMap googleMap) {
        this.$map = googleMap;
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, Float f14) {
        invoke(mapPropertiesNode, f14.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(MapPropertiesNode mapPropertiesNode, float f14) {
        mapPropertiesNode.getClass();
        this.$map.setMinZoomPreference(f14);
    }
}
