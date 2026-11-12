package com.mapbox.maps.extension.compose;

import com.mapbox.maps.extension.compose.internal.SettingsUtilsKt;
import com.mapbox.maps.plugin.gestures.GesturesPlugin;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapState$UpdateGesturesSettings$1$1 extends w implements l<GesturesPlugin, Unit> {
    final /* synthetic */ MapState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapState$UpdateGesturesSettings$1$1(MapState mapState) {
        super(1);
        this.this$0 = mapState;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GesturesPlugin gesturesPlugin) {
        gesturesPlugin.getClass();
        SettingsUtilsKt.applySettings(gesturesPlugin, this.this$0.getGesturesSettings());
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(GesturesPlugin gesturesPlugin) {
        invoke2(gesturesPlugin);
        return Unit.INSTANCE;
    }
}
