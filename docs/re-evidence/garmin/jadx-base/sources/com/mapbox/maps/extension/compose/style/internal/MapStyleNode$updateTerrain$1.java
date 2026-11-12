package com.mapbox.maps.extension.compose.style.internal;

import com.mapbox.maps.StyleDataLoaded;
import com.mapbox.maps.extension.compose.style.sources.generated.RasterDemSourceState;
import com.mapbox.maps.extension.compose.style.terrain.generated.TerrainState;
import e23.p;
import o13.r;
import o2.c;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.d2;
import r53.j;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 7, 1})
@e(c = "com.mapbox.maps.extension.compose.style.internal.MapStyleNode$updateTerrain$1", f = "MapStyleNode.kt", l = {182}, m = "invokeSuspend")
public final class MapStyleNode$updateTerrain$1 extends i implements p<b0, d<? super Unit>, Object> {
    final /* synthetic */ TerrainState $previousTerrainState;
    final /* synthetic */ TerrainState $terrainState;
    int label;
    final /* synthetic */ MapStyleNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapStyleNode$updateTerrain$1(MapStyleNode mapStyleNode, TerrainState terrainState, TerrainState terrainState2, d<? super MapStyleNode$updateTerrain$1> dVar) {
        super(2, dVar);
        this.this$0 = mapStyleNode;
        this.$previousTerrainState = terrainState;
        this.$terrainState = terrainState2;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MapStyleNode$updateTerrain$1(this.this$0, this.$previousTerrainState, this.$terrainState, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((MapStyleNode$updateTerrain$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            d2<StyleDataLoaded> styleDataLoaded$extension_compose_release = this.this$0.getStyleDataLoaded$extension_compose_release();
            final TerrainState terrainState = this.$previousTerrainState;
            final TerrainState terrainState2 = this.$terrainState;
            final MapStyleNode mapStyleNode = this.this$0;
            j<StyleDataLoaded> jVar = new j<StyleDataLoaded>() { // from class: com.mapbox.maps.extension.compose.style.internal.MapStyleNode$updateTerrain$1.1
                /* JADX INFO: renamed from: emit, reason: avoid collision after fix types in other method */
                public final Object emit2(StyleDataLoaded styleDataLoaded, d<? super Unit> dVar) {
                    RasterDemSourceState rasterDemSourceState = terrainState.getApplier().getRasterDemSourceState();
                    if (rasterDemSourceState != null) {
                        rasterDemSourceState.detachFromLayer$extension_compose_release("mapbox-terrain-" + rasterDemSourceState.getSourceId(), mapStyleNode.getMapboxMap());
                    }
                    RasterDemSourceState rasterDemSourceState2 = terrainState2.getApplier().getRasterDemSourceState();
                    if (rasterDemSourceState2 != null) {
                        rasterDemSourceState2.attachToLayer$extension_compose_release("mapbox-terrain-" + rasterDemSourceState2.getSourceId(), mapStyleNode.getMapboxMap());
                    }
                    terrainState2.getApplier().attachTo$extension_compose_release(mapStyleNode.getMapboxMap());
                    return Unit.INSTANCE;
                }

                @Override // r53.j
                public /* bridge */ /* synthetic */ Object emit(StyleDataLoaded styleDataLoaded, d dVar) {
                    return emit2(styleDataLoaded, (d<? super Unit>) dVar);
                }
            };
            this.label = 1;
            if (styleDataLoaded$extension_compose_release.collect(jVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        c.f();
        return null;
    }
}
