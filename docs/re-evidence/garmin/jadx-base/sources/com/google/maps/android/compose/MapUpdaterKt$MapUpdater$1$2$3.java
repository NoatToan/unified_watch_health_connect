package com.google.maps.android.compose;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class MapUpdaterKt$MapUpdater$1$2$3 implements e23.p<MapPropertiesNode, String, Unit> {
    public static final MapUpdaterKt$MapUpdater$1$2$3 INSTANCE = new MapUpdaterKt$MapUpdater$1$2$3();

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, String str) {
        invoke2(mapPropertiesNode, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MapPropertiesNode mapPropertiesNode, String str) {
        mapPropertiesNode.getClass();
        mapPropertiesNode.setContentDescription(str);
    }
}
