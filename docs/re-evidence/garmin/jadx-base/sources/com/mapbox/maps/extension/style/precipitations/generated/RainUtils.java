package com.mapbox.maps.extension.style.precipitations.generated;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.StyleContract;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"getRain", "Lcom/mapbox/maps/extension/style/precipitations/generated/Rain;", "Lcom/mapbox/maps/MapboxStyleManager;", "removeRain", "", "setRain", "rain", "Lcom/mapbox/maps/extension/style/StyleContract$StyleRainExtension;", "extension-style_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class RainUtils {
    @MapboxExperimental
    public static final Rain getRain(MapboxStyleManager mapboxStyleManager) {
        mapboxStyleManager.getClass();
        Rain rain = new Rain();
        rain.setDelegate$extension_style_release(mapboxStyleManager);
        return rain;
    }

    @MapboxExperimental
    public static final void removeRain(MapboxStyleManager mapboxStyleManager) {
        mapboxStyleManager.getClass();
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        mapboxStyleManager.setStyleRain(valueNullValue);
    }

    @MapboxExperimental
    public static final void setRain(MapboxStyleManager mapboxStyleManager, StyleContract.StyleRainExtension styleRainExtension) {
        mapboxStyleManager.getClass();
        styleRainExtension.getClass();
        styleRainExtension.bindTo(mapboxStyleManager);
    }
}
