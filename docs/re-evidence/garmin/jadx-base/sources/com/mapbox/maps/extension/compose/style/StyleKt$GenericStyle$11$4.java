package com.mapbox.maps.extension.compose.style;

import com.mapbox.maps.extension.compose.style.internal.MapStyleNode;
import com.mapbox.maps.extension.compose.style.precipitations.generated.SnowState;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class StyleKt$GenericStyle$11$4 extends w implements p<MapStyleNode, SnowState, Unit> {
    final /* synthetic */ StyleState $styleState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyleKt$GenericStyle$11$4(StyleState styleState) {
        super(2);
        this.$styleState = styleState;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MapStyleNode mapStyleNode, SnowState snowState) {
        mapStyleNode.getClass();
        snowState.getClass();
        mapStyleNode.updateSnow$extension_compose_release(this.$styleState.getSnowState());
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(MapStyleNode mapStyleNode, SnowState snowState) {
        invoke2(mapStyleNode, snowState);
        return Unit.INSTANCE;
    }
}
