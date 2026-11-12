package oe2;

import com.mapbox.maps.extension.compose.style.sources.generated.RasterDemSourceState;
import com.mapbox.maps.extension.compose.style.terrain.generated.TerrainState;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class d0 extends p005kotlin.jvm.internal.w implements e23.a<TerrainState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RasterDemSourceState f131470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f131471b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(RasterDemSourceState rasterDemSourceState, e23.l lVar) {
        super(0);
        this.f131470a = rasterDemSourceState;
        this.f131471b = lVar;
    }

    @Override // e23.a
    public final TerrainState invoke() {
        TerrainState terrainState = new TerrainState(this.f131470a);
        this.f131471b.invoke(terrainState);
        return terrainState;
    }
}
