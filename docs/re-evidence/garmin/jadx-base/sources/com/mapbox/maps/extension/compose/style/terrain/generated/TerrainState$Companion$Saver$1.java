package com.mapbox.maps.extension.compose.style.terrain.generated;

import d4.n;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ld4/n;", "Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState;", "it", "Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState$Holder;", "invoke", "(Ld4/n;Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState;)Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState$Holder;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class TerrainState$Companion$Saver$1 extends w implements p<n, TerrainState, TerrainState.Holder> {
    public static final TerrainState$Companion$Saver$1 INSTANCE = new TerrainState$Companion$Saver$1();

    public TerrainState$Companion$Saver$1() {
        super(2);
    }

    @Override // e23.p
    public final TerrainState.Holder invoke(n nVar, TerrainState terrainState) {
        nVar.getClass();
        terrainState.getClass();
        return terrainState.getApplier().save$extension_compose_release(terrainState.getProperties());
    }
}
