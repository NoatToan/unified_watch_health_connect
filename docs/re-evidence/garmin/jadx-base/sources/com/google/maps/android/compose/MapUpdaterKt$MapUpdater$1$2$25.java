package com.google.maps.android.compose;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.GoogleMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class MapUpdaterKt$MapUpdater$1$2$25 implements e23.p<MapPropertiesNode, Boolean, Unit> {
    final /* synthetic */ GoogleMap $map;

    public MapUpdaterKt$MapUpdater$1$2$25(GoogleMap googleMap) {
        this.$map = googleMap;
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, Boolean bool) {
        invoke(mapPropertiesNode, bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(MapPropertiesNode mapPropertiesNode, boolean z14) {
        mapPropertiesNode.getClass();
        this.$map.getUiSettings().setZoomGesturesEnabled(z14);
    }
}
