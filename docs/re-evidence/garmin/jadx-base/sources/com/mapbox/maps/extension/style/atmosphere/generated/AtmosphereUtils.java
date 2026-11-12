package com.mapbox.maps.extension.style.atmosphere.generated;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.StyleContract;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\u0012\u0010\u0005\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"getAtmosphere", "Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere;", "Lcom/mapbox/maps/MapboxStyleManager;", "removeAtmosphere", "", "setAtmosphere", "atmosphere", "Lcom/mapbox/maps/extension/style/StyleContract$StyleAtmosphereExtension;", "extension-style_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class AtmosphereUtils {
    public static final Atmosphere getAtmosphere(MapboxStyleManager mapboxStyleManager) {
        mapboxStyleManager.getClass();
        Atmosphere atmosphere = new Atmosphere();
        atmosphere.setDelegate$extension_style_release(mapboxStyleManager);
        return atmosphere;
    }

    public static final void removeAtmosphere(MapboxStyleManager mapboxStyleManager) {
        mapboxStyleManager.getClass();
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        mapboxStyleManager.setStyleAtmosphere(valueNullValue);
    }

    public static final void setAtmosphere(MapboxStyleManager mapboxStyleManager, StyleContract.StyleAtmosphereExtension styleAtmosphereExtension) {
        mapboxStyleManager.getClass();
        styleAtmosphereExtension.getClass();
        styleAtmosphereExtension.bindTo(mapboxStyleManager);
    }
}
