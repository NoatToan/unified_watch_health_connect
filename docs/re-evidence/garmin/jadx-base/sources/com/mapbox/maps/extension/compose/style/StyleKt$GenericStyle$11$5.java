package com.mapbox.maps.extension.compose.style;

import com.mapbox.maps.extension.compose.style.internal.MapStyleNode;
import com.mapbox.maps.extension.compose.style.terrain.generated.TerrainState;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class StyleKt$GenericStyle$11$5 extends w implements p<MapStyleNode, TerrainState, Unit> {
    final /* synthetic */ StyleState $styleState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyleKt$GenericStyle$11$5(StyleState styleState) {
        super(2);
        this.$styleState = styleState;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MapStyleNode mapStyleNode, TerrainState terrainState) {
        mapStyleNode.getClass();
        terrainState.getClass();
        mapStyleNode.updateTerrain$extension_compose_release(this.$styleState.getTerrainState());
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(MapStyleNode mapStyleNode, TerrainState terrainState) {
        invoke2(mapStyleNode, terrainState);
        return Unit.INSTANCE;
    }
}
