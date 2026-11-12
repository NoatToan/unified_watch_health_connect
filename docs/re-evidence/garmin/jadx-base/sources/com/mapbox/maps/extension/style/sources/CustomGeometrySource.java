package com.mapbox.maps.extension.style.sources;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.CanonicalTileID;
import com.mapbox.maps.CoordinateBounds;
import com.mapbox.maps.CustomGeometrySourceOptions;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.StylePropertyValueKind;
import com.mapbox.maps.TileCacheBudget;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.utils.ExpectedUtilsKt;
import com.mapbox.maps.extension.style.utils.TypeUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.p;
import java.util.List;
import o13.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\r\u0010\u0014\u001a\u00020\u0003H\u0010¢\u0006\u0002\b\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\bJ\u000e\u0010!\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\fJ\u001c\u0010\"\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006&"}, d2 = {"Lcom/mapbox/maps/extension/style/sources/CustomGeometrySource;", "Lcom/mapbox/maps/extension/style/sources/Source;", TtmlNode.ATTR_ID, "", "options", "Lcom/mapbox/maps/CustomGeometrySourceOptions;", "(Ljava/lang/String;Lcom/mapbox/maps/CustomGeometrySourceOptions;)V", "maxOverscaleFactorForParentTiles", "", "getMaxOverscaleFactorForParentTiles", "()Ljava/lang/Long;", "tileCacheBudget", "Lcom/mapbox/maps/TileCacheBudget;", "getTileCacheBudget", "()Lcom/mapbox/maps/TileCacheBudget;", "addSource", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/bindgen/None;", TtmlNode.TAG_STYLE, "Lcom/mapbox/maps/MapboxStyleManager;", "getType", "getType$extension_style_release", "invalidRegion", "", "coordinateBounds", "Lcom/mapbox/maps/CoordinateBounds;", "invalidTile", "tileID", "Lcom/mapbox/maps/CanonicalTileID;", "invalidateRegion", "invalidateTile", "setMaxOverscaleFactorForParentTiles", "value", "setTileCacheBudget", "setTileData", "featureCollection", "", "Lcom/mapbox/geojson/Feature;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CustomGeometrySource extends Source {
    private final CustomGeometrySourceOptions options;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomGeometrySource(String str, CustomGeometrySourceOptions customGeometrySourceOptions) {
        super(str);
        str.getClass();
        customGeometrySourceOptions.getClass();
        this.options = customGeometrySourceOptions;
    }

    @Override // com.mapbox.maps.extension.style.sources.Source
    public Expected<String, None> addSource(MapboxStyleManager style) {
        style.getClass();
        return style.addStyleCustomGeometrySource(getSourceId(), this.options);
    }

    public final Long getMaxOverscaleFactorForParentTiles() {
        Object objUnwrap;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            p.n("Couldn't get max-overscale-factor-for-parent-tiles: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate.getStyleSourceProperty(getSourceId(), "max-overscale-factor-for-parent-tiles"), Long.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate.getStyleSourceProperty(getSourceId(), "max-overscale-factor-for-parent-tiles").getValue().toJson();
            objUnwrap = null;
        }
        return (Long) objUnwrap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.mapbox.maps.MapboxStyleManager] */
    public final TileCacheBudget getTileCacheBudget() {
        ?? Unwrap = "tile-cache-budget";
        ?? delegate = getDelegate();
        if (delegate == 0) {
            p.n("Couldn't get tile-cache-budget: source is not added to style yet.");
            return null;
        }
        try {
            StylePropertyValue styleSourceProperty = delegate.getStyleSourceProperty(getSourceId(), "tile-cache-budget");
            if (styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
                Value value = styleSourceProperty.getValue();
                value.getClass();
                Unwrap = SourceUtils.unwrapToTileCacheBudget(value);
            } else {
                Unwrap = TypeUtilsKt.unwrap(styleSourceProperty, TileCacheBudget.class);
            }
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate.getStyleSourceProperty(getSourceId(), Unwrap).getValue().toJson();
            Unwrap = 0;
        }
        return (TileCacheBudget) Unwrap;
    }

    @Override // com.mapbox.maps.extension.style.sources.Source
    public String getType$extension_style_release() {
        return "custom-geometry";
    }

    @e
    public final void invalidRegion(CoordinateBounds coordinateBounds) {
        coordinateBounds.getClass();
        invalidateRegion(coordinateBounds);
    }

    @e
    public final void invalidTile(CanonicalTileID tileID) {
        tileID.getClass();
        invalidateTile(tileID);
    }

    public final void invalidateRegion(CoordinateBounds coordinateBounds) {
        coordinateBounds.getClass();
        MapboxStyleManager delegate = getDelegate();
        ExpectedUtilsKt.check(delegate != null ? delegate.invalidateStyleCustomGeometrySourceRegion(getSourceId(), coordinateBounds) : null);
    }

    public final void invalidateTile(CanonicalTileID tileID) {
        tileID.getClass();
        MapboxStyleManager delegate = getDelegate();
        ExpectedUtilsKt.check(delegate != null ? delegate.invalidateStyleCustomGeometrySourceTile(getSourceId(), tileID) : null);
    }

    public final void setMaxOverscaleFactorForParentTiles(long value) {
        setVolatileProperty$extension_style_release(new PropertyValue<>("max-overscale-factor-for-parent-tiles", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value))));
    }

    public final void setTileCacheBudget(TileCacheBudget value) {
        value.getClass();
        setVolatileProperty$extension_style_release(new PropertyValue<>("tile-cache-budget", TypeUtils.INSTANCE.wrapToValue(value)));
    }

    public final void setTileData(CanonicalTileID tileID, List<Feature> featureCollection) {
        tileID.getClass();
        featureCollection.getClass();
        MapboxStyleManager delegate = getDelegate();
        ExpectedUtilsKt.check(delegate != null ? delegate.setStyleCustomGeometrySourceTileData(getSourceId(), tileID, featureCollection) : null);
    }
}
