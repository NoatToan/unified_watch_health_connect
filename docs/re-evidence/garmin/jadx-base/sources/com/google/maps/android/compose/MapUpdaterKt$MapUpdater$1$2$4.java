package com.google.maps.android.compose;

import c2.h2;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.GoogleMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class MapUpdaterKt$MapUpdater$1$2$4 implements e23.p<MapPropertiesNode, h2, Unit> {
    final /* synthetic */ GoogleMap $map;

    public MapUpdaterKt$MapUpdater$1$2$4(GoogleMap googleMap) {
        this.$map = googleMap;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MapPropertiesNode mapPropertiesNode, h2 h2Var) {
        mapPropertiesNode.getClass();
        h2Var.getClass();
        MapUpdaterKt.applyContentPadding(mapPropertiesNode, this.$map, h2Var);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, h2 h2Var) {
        invoke2(mapPropertiesNode, h2Var);
        return Unit.INSTANCE;
    }
}
