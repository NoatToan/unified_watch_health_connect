package com.google.maps.android.compose;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.GoogleMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class MapUpdaterKt$MapUpdater$1$1$1 implements e23.a<MapPropertiesNode> {
    final /* synthetic */ g6.c $density;
    final /* synthetic */ g6.o $layoutDirection;
    final /* synthetic */ GoogleMap $map;
    final /* synthetic */ MapUpdaterState $this_with;

    public MapUpdaterKt$MapUpdater$1$1$1(MapUpdaterState mapUpdaterState, GoogleMap googleMap, g6.c cVar, g6.o oVar) {
        this.$this_with = mapUpdaterState;
        this.$map = googleMap;
        this.$density = cVar;
        this.$layoutDirection = oVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // e23.a
    public final MapPropertiesNode invoke() {
        String contentDescription = this.$this_with.getContentDescription();
        return new MapPropertiesNode(this.$map, this.$this_with.getCameraPositionState(), contentDescription, this.$density, this.$layoutDirection, this.$this_with.getContentPadding());
    }
}
