package com.mapbox.maps.extension.style.terrain.generated;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.StyleContract;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\u0012\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"getTerrain", "Lcom/mapbox/maps/extension/style/terrain/generated/Terrain;", "Lcom/mapbox/maps/MapboxStyleManager;", "sourceId", "", "removeTerrain", "", "setTerrain", "terrain", "Lcom/mapbox/maps/extension/style/StyleContract$StyleTerrainExtension;", "extension-style_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class TerrainUtils {
    public static final Terrain getTerrain(MapboxStyleManager mapboxStyleManager, String str) {
        mapboxStyleManager.getClass();
        str.getClass();
        Terrain terrain = new Terrain(str);
        terrain.setDelegate$extension_style_release(mapboxStyleManager);
        return terrain;
    }

    public static final void removeTerrain(MapboxStyleManager mapboxStyleManager) {
        mapboxStyleManager.getClass();
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        mapboxStyleManager.setStyleTerrain(valueNullValue);
    }

    public static final void setTerrain(MapboxStyleManager mapboxStyleManager, StyleContract.StyleTerrainExtension styleTerrainExtension) {
        mapboxStyleManager.getClass();
        styleTerrainExtension.getClass();
        styleTerrainExtension.bindTo(mapboxStyleManager);
    }
}
