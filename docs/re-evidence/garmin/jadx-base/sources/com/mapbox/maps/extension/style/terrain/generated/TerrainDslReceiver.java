package com.mapbox.maps.extension.style.terrain.generated;

import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.types.TerrainDsl;
import e23.l;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@TerrainDsl
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H&¢\u0006\u0004\b\u0003\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\n\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH&¢\u0006\u0004\b\n\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/mapbox/maps/extension/style/terrain/generated/TerrainDslReceiver;", "", "", "exaggeration", "Lcom/mapbox/maps/extension/style/terrain/generated/Terrain;", "(D)Lcom/mapbox/maps/extension/style/terrain/generated/Terrain;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/terrain/generated/Terrain;", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "exaggerationTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/terrain/generated/Terrain;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/terrain/generated/Terrain;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface TerrainDslReceiver {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Terrain exaggeration$default(TerrainDslReceiver terrainDslReceiver, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: exaggeration");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return terrainDslReceiver.exaggeration(d14);
        }
    }

    Terrain exaggeration(double exaggeration);

    Terrain exaggeration(Expression exaggeration);

    Terrain exaggerationTransition(StyleTransition options);

    Terrain exaggerationTransition(l<? super StyleTransition.Builder, Unit> block);
}
