package com.mapbox.maps.extension.compose.style.terrain.generated;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.compose.style.DoubleValue;
import com.mapbox.maps.extension.compose.style.Transition;
import com.mapbox.maps.extension.compose.style.sources.SourceState;
import com.mapbox.maps.extension.compose.style.sources.generated.RasterDemSourceState;
import com.mapbox.maps.extension.compose.style.terrain.TerrainStateApplier;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState;", "holder", "Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState$Holder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class TerrainState$Companion$Saver$2 extends w implements l<TerrainState.Holder, TerrainState> {
    public static final TerrainState$Companion$Saver$2 INSTANCE = new TerrainState$Companion$Saver$2();

    public TerrainState$Companion$Saver$2() {
        super(1);
    }

    @Override // e23.l
    public final TerrainState invoke(TerrainState.Holder holder) {
        holder.getClass();
        SourceState.Holder rasterDemSourceStateHolder = holder.getRasterDemSourceStateHolder();
        TerrainStateApplier terrainStateApplier = new TerrainStateApplier(rasterDemSourceStateHolder != null ? RasterDemSourceState.INSTANCE.getSaver().a(rasterDemSourceStateHolder) : null, holder.getSavedProperties(), holder.getInitial(), null, 8, null);
        Value value = holder.getSavedProperties().get("exaggeration");
        DoubleValue doubleValue = value != null ? new DoubleValue(value) : DoubleValue.INITIAL;
        Value value2 = holder.getSavedProperties().get("exaggeration-transition");
        return new TerrainState(terrainStateApplier, doubleValue, value2 != null ? new Transition(value2) : Transition.INITIAL, null);
    }
}
