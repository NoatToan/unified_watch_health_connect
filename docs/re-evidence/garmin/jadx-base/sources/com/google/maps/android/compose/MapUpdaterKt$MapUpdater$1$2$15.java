package com.google.maps.android.compose;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.GoogleMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class MapUpdaterKt$MapUpdater$1$2$15 implements e23.p<MapPropertiesNode, Integer, Unit> {
    final /* synthetic */ GoogleMap $map;

    public MapUpdaterKt$MapUpdater$1$2$15(GoogleMap googleMap) {
        this.$map = googleMap;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MapPropertiesNode mapPropertiesNode, Integer num) {
        mapPropertiesNode.getClass();
        if (num != null) {
            this.$map.setMapColorScheme(num.intValue());
        }
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, Integer num) {
        invoke2(mapPropertiesNode, num);
        return Unit.INSTANCE;
    }
}
