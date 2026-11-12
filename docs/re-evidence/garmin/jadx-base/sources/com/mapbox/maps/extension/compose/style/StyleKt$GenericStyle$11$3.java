package com.mapbox.maps.extension.compose.style;

import com.mapbox.maps.extension.compose.style.internal.MapStyleNode;
import com.mapbox.maps.extension.compose.style.precipitations.generated.RainState;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class StyleKt$GenericStyle$11$3 extends w implements p<MapStyleNode, RainState, Unit> {
    final /* synthetic */ StyleState $styleState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyleKt$GenericStyle$11$3(StyleState styleState) {
        super(2);
        this.$styleState = styleState;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MapStyleNode mapStyleNode, RainState rainState) {
        mapStyleNode.getClass();
        rainState.getClass();
        mapStyleNode.updateRain$extension_compose_release(this.$styleState.getRainState());
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(MapStyleNode mapStyleNode, RainState rainState) {
        invoke2(mapStyleNode, rainState);
        return Unit.INSTANCE;
    }
}
