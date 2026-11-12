package com.mapbox.maps.extension.style.projection.generated;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.StylePropertyValueKind;
import com.mapbox.maps.extension.style.layers.properties.generated.ProjectionName;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001¨\u0006\u0006"}, d2 = {"getProjection", "Lcom/mapbox/maps/extension/style/projection/generated/Projection;", "Lcom/mapbox/maps/MapboxStyleManager;", "setProjection", "", "projection", "extension-style_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class StyleProjectionUtils {
    public static final Projection getProjection(MapboxStyleManager mapboxStyleManager) {
        mapboxStyleManager.getClass();
        StylePropertyValue styleProjectionProperty = mapboxStyleManager.getStyleProjectionProperty("name");
        if (styleProjectionProperty.getKind() == StylePropertyValueKind.UNDEFINED) {
            return null;
        }
        Value value = styleProjectionProperty.getValue();
        value.getClass();
        Object objUnwrapToAny = TypeUtilsKt.unwrapToAny(value);
        objUnwrapToAny.getClass();
        ProjectionName.Companion companion = ProjectionName.INSTANCE;
        String upperCase = ((String) objUnwrapToAny).toUpperCase(Locale.ROOT);
        upperCase.getClass();
        Projection projection = new Projection(companion.valueOf(upperCase));
        projection.setDelegate$extension_style_release(mapboxStyleManager);
        return projection;
    }

    public static final void setProjection(MapboxStyleManager mapboxStyleManager, Projection projection) {
        mapboxStyleManager.getClass();
        projection.getClass();
        projection.bindTo(mapboxStyleManager);
    }
}
