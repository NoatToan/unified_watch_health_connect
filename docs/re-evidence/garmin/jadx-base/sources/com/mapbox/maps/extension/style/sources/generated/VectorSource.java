package com.mapbox.maps.extension.style.sources.generated;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.StyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.StylePropertyValueKind;
import com.mapbox.maps.TileCacheBudget;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.sources.Source;
import com.mapbox.maps.extension.style.sources.SourceUtils;
import com.mapbox.maps.extension.style.sources.TileSet;
import com.mapbox.maps.extension.style.types.PromoteId;
import com.mapbox.maps.extension.style.types.SourceDsl;
import com.mapbox.maps.extension.style.utils.TypeUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.p;
import e23.l;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 72\u00020\u0001:\u000267B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u00103\u001a\u00020\u0006H\u0010¢\u0006\u0002\b4J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u000fJ\u0010\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u00105\u001a\u00020\u000fJ\u0010\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u00105\u001a\u00020\u000bJ\u0010\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u00105\u001a\u00020\u000fJ\u0010\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u00105\u001a\u00020\u000fJ\u000e\u0010#\u001a\u00020\u00002\u0006\u00105\u001a\u00020$J\u0010\u0010'\u001a\u00020\u00002\b\b\u0002\u00105\u001a\u00020\u000bJ\u0010\u0010)\u001a\u00020\u00002\b\b\u0002\u00105\u001a\u00020\u000bJ\u0014\u0010+\u001a\u00020\u00002\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00060\nJ\u000e\u0010-\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0006J\u0010\u0010/\u001a\u00020\u00002\b\b\u0002\u00105\u001a\u000200R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010#\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010'\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0016R\u0013\u0010)\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0016R\u0019\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b,\u0010\rR\u0013\u0010-\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b.\u0010\bR\u0013\u0010/\u001a\u0004\u0018\u0001008F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00068"}, d2 = {"Lcom/mapbox/maps/extension/style/sources/generated/VectorSource;", "Lcom/mapbox/maps/extension/style/sources/Source;", "builder", "Lcom/mapbox/maps/extension/style/sources/generated/VectorSource$Builder;", "(Lcom/mapbox/maps/extension/style/sources/generated/VectorSource$Builder;)V", "attribution", "", "getAttribution", "()Ljava/lang/String;", "bounds", "", "", "getBounds", "()Ljava/util/List;", "maxOverscaleFactorForParentTiles", "", "getMaxOverscaleFactorForParentTiles", "()Ljava/lang/Long;", "maxzoom", "getMaxzoom", "minimumTileUpdateInterval", "getMinimumTileUpdateInterval", "()Ljava/lang/Double;", "minzoom", "getMinzoom", "prefetchZoomDelta", "getPrefetchZoomDelta", "promoteId", "Lcom/mapbox/maps/extension/style/types/PromoteId;", "getPromoteId", "()Lcom/mapbox/maps/extension/style/types/PromoteId;", "scheme", "Lcom/mapbox/maps/extension/style/sources/generated/Scheme;", "getScheme", "()Lcom/mapbox/maps/extension/style/sources/generated/Scheme;", "tileCacheBudget", "Lcom/mapbox/maps/TileCacheBudget;", "getTileCacheBudget", "()Lcom/mapbox/maps/TileCacheBudget;", "tileNetworkRequestsDelay", "getTileNetworkRequestsDelay", "tileRequestsDelay", "getTileRequestsDelay", "tiles", "getTiles", "url", "getUrl", "volatile", "", "getVolatile", "()Ljava/lang/Boolean;", "getType", "getType$extension_style_release", "value", "Builder", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VectorSource extends Source {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorSource(Builder builder) {
        super(builder.getSourceId());
        builder.getClass();
        getSourceProperties$extension_style_release().putAll(builder.getProperties$extension_style_release());
        getVolatileSourceProperties$extension_style_release().putAll(builder.getVolatileProperties$extension_style_release());
    }

    public static /* synthetic */ VectorSource maxzoom$default(VectorSource vectorSource, long j8, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j8 = 22;
        }
        return vectorSource.maxzoom(j8);
    }

    public static /* synthetic */ VectorSource minimumTileUpdateInterval$default(VectorSource vectorSource, double d14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            d14 = 0.0d;
        }
        return vectorSource.minimumTileUpdateInterval(d14);
    }

    public static /* synthetic */ VectorSource minzoom$default(VectorSource vectorSource, long j8, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j8 = 0;
        }
        return vectorSource.minzoom(j8);
    }

    public static /* synthetic */ VectorSource prefetchZoomDelta$default(VectorSource vectorSource, long j8, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j8 = 4;
        }
        return vectorSource.prefetchZoomDelta(j8);
    }

    public static /* synthetic */ VectorSource tileNetworkRequestsDelay$default(VectorSource vectorSource, double d14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            d14 = 0.0d;
        }
        return vectorSource.tileNetworkRequestsDelay(d14);
    }

    public static /* synthetic */ VectorSource tileRequestsDelay$default(VectorSource vectorSource, double d14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            d14 = 0.0d;
        }
        return vectorSource.tileRequestsDelay(d14);
    }

    public static /* synthetic */ VectorSource volatile$default(VectorSource vectorSource, boolean z14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z14 = false;
        }
        return vectorSource.m232volatile(z14);
    }

    public final String getAttribution() {
        Object objUnwrap;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            p.n("Couldn't get attribution: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate.getStyleSourceProperty(getSourceId(), "attribution"), String.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate.getStyleSourceProperty(getSourceId(), "attribution").getValue().toJson();
            objUnwrap = null;
        }
        return (String) objUnwrap;
    }

    public final List<Double> getBounds() {
        Object objUnwrap;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            p.n("Couldn't get bounds: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate.getStyleSourceProperty(getSourceId(), "bounds"), List.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate.getStyleSourceProperty(getSourceId(), "bounds").getValue().toJson();
            objUnwrap = null;
        }
        return (List) objUnwrap;
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

    public final Long getMaxzoom() {
        Object objUnwrap;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            p.n("Couldn't get maxzoom: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate.getStyleSourceProperty(getSourceId(), "maxzoom"), Long.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate.getStyleSourceProperty(getSourceId(), "maxzoom").getValue().toJson();
            objUnwrap = null;
        }
        return (Long) objUnwrap;
    }

    public final Double getMinimumTileUpdateInterval() {
        Object objUnwrap;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            p.n("Couldn't get minimum-tile-update-interval: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate.getStyleSourceProperty(getSourceId(), "minimum-tile-update-interval"), Double.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate.getStyleSourceProperty(getSourceId(), "minimum-tile-update-interval").getValue().toJson();
            objUnwrap = null;
        }
        return (Double) objUnwrap;
    }

    public final Long getMinzoom() {
        Object objUnwrap;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            p.n("Couldn't get minzoom: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate.getStyleSourceProperty(getSourceId(), "minzoom"), Long.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate.getStyleSourceProperty(getSourceId(), "minzoom").getValue().toJson();
            objUnwrap = null;
        }
        return (Long) objUnwrap;
    }

    public final Long getPrefetchZoomDelta() {
        Object objUnwrap;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            p.n("Couldn't get prefetch-zoom-delta: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate.getStyleSourceProperty(getSourceId(), "prefetch-zoom-delta"), Long.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate.getStyleSourceProperty(getSourceId(), "prefetch-zoom-delta").getValue().toJson();
            objUnwrap = null;
        }
        return (Long) objUnwrap;
    }

    public final PromoteId getPromoteId() {
        Object objUnwrap;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            p.n("Couldn't get promoteId: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate.getStyleSourceProperty(getSourceId(), "promoteId"), Object.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate.getStyleSourceProperty(getSourceId(), "promoteId").getValue().toJson();
            objUnwrap = null;
        }
        if (objUnwrap != null) {
            return PromoteId.INSTANCE.fromProperty$extension_style_release(objUnwrap);
        }
        return null;
    }

    public final Scheme getScheme() {
        Object objUnwrap;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            p.n("Couldn't get scheme: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate.getStyleSourceProperty(getSourceId(), "scheme"), String.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate.getStyleSourceProperty(getSourceId(), "scheme").getValue().toJson();
            objUnwrap = null;
        }
        String str = (String) objUnwrap;
        if (str == null) {
            return null;
        }
        Scheme.Companion companion = Scheme.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
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

    public final Double getTileNetworkRequestsDelay() {
        Object objUnwrap;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            p.n("Couldn't get tile-network-requests-delay: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate.getStyleSourceProperty(getSourceId(), "tile-network-requests-delay"), Double.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate.getStyleSourceProperty(getSourceId(), "tile-network-requests-delay").getValue().toJson();
            objUnwrap = null;
        }
        return (Double) objUnwrap;
    }

    public final Double getTileRequestsDelay() {
        Object objUnwrap;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            p.n("Couldn't get tile-requests-delay: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate.getStyleSourceProperty(getSourceId(), "tile-requests-delay"), Double.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate.getStyleSourceProperty(getSourceId(), "tile-requests-delay").getValue().toJson();
            objUnwrap = null;
        }
        return (Double) objUnwrap;
    }

    public final List<String> getTiles() {
        Object objUnwrap;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            p.n("Couldn't get tiles: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate.getStyleSourceProperty(getSourceId(), "tiles"), List.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate.getStyleSourceProperty(getSourceId(), "tiles").getValue().toJson();
            objUnwrap = null;
        }
        return (List) objUnwrap;
    }

    @Override // com.mapbox.maps.extension.style.sources.Source
    public String getType$extension_style_release() {
        return "vector";
    }

    public final String getUrl() {
        Object objUnwrap;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            p.n("Couldn't get url: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate.getStyleSourceProperty(getSourceId(), "url"), String.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate.getStyleSourceProperty(getSourceId(), "url").getValue().toJson();
            objUnwrap = null;
        }
        return (String) objUnwrap;
    }

    public final Boolean getVolatile() {
        Object objUnwrap;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            p.n("Couldn't get volatile: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate.getStyleSourceProperty(getSourceId(), "volatile"), Boolean.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate.getStyleSourceProperty(getSourceId(), "volatile").getValue().toJson();
            objUnwrap = null;
        }
        return (Boolean) objUnwrap;
    }

    public final VectorSource maxOverscaleFactorForParentTiles(long value) {
        setVolatileProperty$extension_style_release(new PropertyValue<>("max-overscale-factor-for-parent-tiles", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value))));
        return this;
    }

    public final VectorSource maxzoom(long value) {
        Source.setProperty$extension_style_release$default(this, new PropertyValue("maxzoom", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value))), false, 2, null);
        return this;
    }

    public final VectorSource minimumTileUpdateInterval(double value) {
        setVolatileProperty$extension_style_release(new PropertyValue<>("minimum-tile-update-interval", TypeUtils.INSTANCE.wrapToValue(Double.valueOf(value))));
        return this;
    }

    public final VectorSource minzoom(long value) {
        Source.setProperty$extension_style_release$default(this, new PropertyValue("minzoom", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value))), false, 2, null);
        return this;
    }

    public final VectorSource prefetchZoomDelta(long value) {
        setVolatileProperty$extension_style_release(new PropertyValue<>("prefetch-zoom-delta", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value))));
        return this;
    }

    public final VectorSource tileCacheBudget(TileCacheBudget value) {
        value.getClass();
        setVolatileProperty$extension_style_release(new PropertyValue<>("tile-cache-budget", TypeUtils.INSTANCE.wrapToValue(value)));
        return this;
    }

    public final VectorSource tileNetworkRequestsDelay(double value) {
        setVolatileProperty$extension_style_release(new PropertyValue<>("tile-network-requests-delay", TypeUtils.INSTANCE.wrapToValue(Double.valueOf(value))));
        return this;
    }

    public final VectorSource tileRequestsDelay(double value) {
        setVolatileProperty$extension_style_release(new PropertyValue<>("tile-requests-delay", TypeUtils.INSTANCE.wrapToValue(Double.valueOf(value))));
        return this;
    }

    public final VectorSource tiles(List<String> value) {
        value.getClass();
        Source.setProperty$extension_style_release$default(this, new PropertyValue("tiles", TypeUtils.INSTANCE.wrapToValue(value)), false, 2, null);
        return this;
    }

    public final VectorSource url(String value) {
        value.getClass();
        Source.setProperty$extension_style_release$default(this, new PropertyValue("url", TypeUtils.INSTANCE.wrapToValue(value)), false, 2, null);
        return this;
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final VectorSource m232volatile(boolean value) {
        Source.setProperty$extension_style_release$default(this, new PropertyValue("volatile", TypeUtils.INSTANCE.wrapToValue(Boolean.valueOf(value))), false, 2, null);
        return this;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0013\u0010\r\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\nR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/mapbox/maps/extension/style/sources/generated/VectorSource$Companion;", "", "()V", "defaultMaxzoom", "", "getDefaultMaxzoom", "()Ljava/lang/Long;", "defaultMinimumTileUpdateInterval", "", "getDefaultMinimumTileUpdateInterval", "()Ljava/lang/Double;", "defaultMinzoom", "getDefaultMinzoom", "defaultPrefetchZoomDelta", "getDefaultPrefetchZoomDelta", "defaultScheme", "Lcom/mapbox/maps/extension/style/sources/generated/Scheme;", "getDefaultScheme", "()Lcom/mapbox/maps/extension/style/sources/generated/Scheme;", "defaultTileNetworkRequestsDelay", "getDefaultTileNetworkRequestsDelay", "defaultTileRequestsDelay", "getDefaultTileRequestsDelay", "defaultVolatile", "", "getDefaultVolatile", "()Ljava/lang/Boolean;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final Long getDefaultMaxzoom() {
            Object objUnwrap;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("vector", "maxzoom");
            styleSourcePropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleSourcePropertyDefaultValue, Long.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Long) objUnwrap;
        }

        public final Double getDefaultMinimumTileUpdateInterval() {
            Object objUnwrap;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("vector", "minimum-tile-update-interval");
            styleSourcePropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleSourcePropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Long getDefaultMinzoom() {
            Object objUnwrap;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("vector", "minzoom");
            styleSourcePropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleSourcePropertyDefaultValue, Long.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Long) objUnwrap;
        }

        public final Long getDefaultPrefetchZoomDelta() {
            Object objUnwrap;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("vector", "prefetch-zoom-delta");
            styleSourcePropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleSourcePropertyDefaultValue, Long.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Long) objUnwrap;
        }

        public final Scheme getDefaultScheme() {
            Object objUnwrap;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("vector", "scheme");
            styleSourcePropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleSourcePropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            String str = (String) objUnwrap;
            if (str == null) {
                return null;
            }
            Scheme.Companion companion = Scheme.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        public final Double getDefaultTileNetworkRequestsDelay() {
            Object objUnwrap;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("vector", "tile-network-requests-delay");
            styleSourcePropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleSourcePropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Double getDefaultTileRequestsDelay() {
            Object objUnwrap;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("vector", "tile-requests-delay");
            styleSourcePropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleSourcePropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Boolean getDefaultVolatile() {
            Object objUnwrap;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("vector", "volatile");
            styleSourcePropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleSourcePropertyDefaultValue, Boolean.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Boolean) objUnwrap;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u0013J\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\f¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010\u0013J\u0017\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\f¢\u0006\u0004\b#\u0010!J\u0017\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\f¢\u0006\u0004\b$\u0010!J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J7\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)¢\u0006\u0004\b&\u0010-J\r\u0010/\u001a\u00020.¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u00103R*\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u000305048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R*\u0010:\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u000305048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109¨\u0006<"}, d2 = {"Lcom/mapbox/maps/extension/style/sources/generated/VectorSource$Builder;", "", "", "sourceId", "<init>", "(Ljava/lang/String;)V", "value", "url", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/sources/generated/VectorSource$Builder;", "", "tiles", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/sources/generated/VectorSource$Builder;", "", "bounds", "Lcom/mapbox/maps/extension/style/sources/generated/Scheme;", "scheme", "(Lcom/mapbox/maps/extension/style/sources/generated/Scheme;)Lcom/mapbox/maps/extension/style/sources/generated/VectorSource$Builder;", "", "minzoom", "(J)Lcom/mapbox/maps/extension/style/sources/generated/VectorSource$Builder;", "maxzoom", "attribution", "Lcom/mapbox/maps/extension/style/types/PromoteId;", "promoteId", "(Lcom/mapbox/maps/extension/style/types/PromoteId;)Lcom/mapbox/maps/extension/style/sources/generated/VectorSource$Builder;", "", "volatile", "(Z)Lcom/mapbox/maps/extension/style/sources/generated/VectorSource$Builder;", "prefetchZoomDelta", "Lcom/mapbox/maps/TileCacheBudget;", "tileCacheBudget", "(Lcom/mapbox/maps/TileCacheBudget;)Lcom/mapbox/maps/extension/style/sources/generated/VectorSource$Builder;", "minimumTileUpdateInterval", "(D)Lcom/mapbox/maps/extension/style/sources/generated/VectorSource$Builder;", "maxOverscaleFactorForParentTiles", "tileRequestsDelay", "tileNetworkRequestsDelay", "Lcom/mapbox/maps/extension/style/sources/TileSet;", "tileSet", "(Lcom/mapbox/maps/extension/style/sources/TileSet;)Lcom/mapbox/maps/extension/style/sources/generated/VectorSource$Builder;", "tilejson", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/sources/TileSet$Builder;", "", "block", "(Ljava/lang/String;Ljava/util/List;Le23/l;)Lcom/mapbox/maps/extension/style/sources/generated/VectorSource$Builder;", "Lcom/mapbox/maps/extension/style/sources/generated/VectorSource;", "build", "()Lcom/mapbox/maps/extension/style/sources/generated/VectorSource;", "Ljava/lang/String;", "getSourceId", "()Ljava/lang/String;", "Ljava/util/HashMap;", "Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;", "properties", "Ljava/util/HashMap;", "getProperties$extension_style_release", "()Ljava/util/HashMap;", "volatileProperties", "getVolatileProperties$extension_style_release", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @SourceDsl
    public static final class Builder {
        private final HashMap<String, PropertyValue<?>> properties;
        private final String sourceId;
        private final HashMap<String, PropertyValue<?>> volatileProperties;

        public Builder(String str) {
            str.getClass();
            this.sourceId = str;
            this.properties = new HashMap<>();
            this.volatileProperties = new HashMap<>();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder bounds$default(Builder builder, List list, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                list = x.k(Double.valueOf(-180.0d), Double.valueOf(-85.051129d), Double.valueOf(180.0d), Double.valueOf(85.051129d));
            }
            return builder.bounds(list);
        }

        public static /* synthetic */ Builder maxzoom$default(Builder builder, long j8, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                j8 = 22;
            }
            return builder.maxzoom(j8);
        }

        public static /* synthetic */ Builder minimumTileUpdateInterval$default(Builder builder, double d14, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return builder.minimumTileUpdateInterval(d14);
        }

        public static /* synthetic */ Builder minzoom$default(Builder builder, long j8, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                j8 = 0;
            }
            return builder.minzoom(j8);
        }

        public static /* synthetic */ Builder prefetchZoomDelta$default(Builder builder, long j8, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                j8 = 4;
            }
            return builder.prefetchZoomDelta(j8);
        }

        public static /* synthetic */ Builder scheme$default(Builder builder, Scheme scheme, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                scheme = Scheme.XYZ;
            }
            return builder.scheme(scheme);
        }

        public static /* synthetic */ Builder tileNetworkRequestsDelay$default(Builder builder, double d14, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return builder.tileNetworkRequestsDelay(d14);
        }

        public static /* synthetic */ Builder tileRequestsDelay$default(Builder builder, double d14, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return builder.tileRequestsDelay(d14);
        }

        public static /* synthetic */ Builder volatile$default(Builder builder, boolean z14, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                z14 = false;
            }
            return builder.m233volatile(z14);
        }

        public final Builder attribution(String value) {
            value.getClass();
            PropertyValue<?> propertyValue = new PropertyValue<>("attribution", TypeUtils.INSTANCE.wrapToValue(value));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder bounds(List<Double> value) {
            value.getClass();
            PropertyValue<?> propertyValue = new PropertyValue<>("bounds", TypeUtils.INSTANCE.wrapToValue(value));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final VectorSource build() {
            return new VectorSource(this);
        }

        public final HashMap<String, PropertyValue<?>> getProperties$extension_style_release() {
            return this.properties;
        }

        public final String getSourceId() {
            return this.sourceId;
        }

        public final HashMap<String, PropertyValue<?>> getVolatileProperties$extension_style_release() {
            return this.volatileProperties;
        }

        public final Builder maxOverscaleFactorForParentTiles(long value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("max-overscale-factor-for-parent-tiles", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value)));
            this.volatileProperties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder maxzoom(long value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("maxzoom", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value)));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder minimumTileUpdateInterval(double value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("minimum-tile-update-interval", TypeUtils.INSTANCE.wrapToValue(Double.valueOf(value)));
            this.volatileProperties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder minzoom(long value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("minzoom", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value)));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder prefetchZoomDelta(long value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("prefetch-zoom-delta", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value)));
            this.volatileProperties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder promoteId(PromoteId value) {
            value.getClass();
            PropertyValue<?> propertyValue = new PropertyValue<>("promoteId", value.toValue$extension_style_release());
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder scheme(Scheme value) {
            value.getClass();
            PropertyValue<?> propertyValue = new PropertyValue<>("scheme", TypeUtils.INSTANCE.wrapToValue(value.getValue()));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder tileCacheBudget(TileCacheBudget value) {
            value.getClass();
            PropertyValue<?> propertyValue = new PropertyValue<>("tile-cache-budget", TypeUtils.INSTANCE.wrapToValue(value));
            this.volatileProperties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder tileNetworkRequestsDelay(double value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("tile-network-requests-delay", TypeUtils.INSTANCE.wrapToValue(Double.valueOf(value)));
            this.volatileProperties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder tileRequestsDelay(double value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("tile-requests-delay", TypeUtils.INSTANCE.wrapToValue(Double.valueOf(value)));
            this.volatileProperties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder tileSet(String tilejson, List<String> tiles, l<? super TileSet.Builder, Unit> block) {
            tilejson.getClass();
            tiles.getClass();
            block.getClass();
            TileSet.Builder builder = new TileSet.Builder(tilejson, tiles);
            block.invoke(builder);
            for (Map.Entry<String, Value> entry : builder.build().entrySet()) {
                PropertyValue<?> propertyValue = new PropertyValue<>(entry.getKey(), entry.getValue());
                this.properties.put(propertyValue.getPropertyName(), propertyValue);
            }
            return this;
        }

        public final Builder tiles(List<String> value) {
            value.getClass();
            PropertyValue<?> propertyValue = new PropertyValue<>("tiles", TypeUtils.INSTANCE.wrapToValue(value));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder url(String value) {
            value.getClass();
            PropertyValue<?> propertyValue = new PropertyValue<>("url", TypeUtils.INSTANCE.wrapToValue(value));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        /* JADX INFO: renamed from: volatile, reason: not valid java name */
        public final Builder m233volatile(boolean value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("volatile", TypeUtils.INSTANCE.wrapToValue(Boolean.valueOf(value)));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder tileSet(TileSet tileSet) {
            tileSet.getClass();
            for (Map.Entry<String, Value> entry : tileSet.entrySet()) {
                PropertyValue<?> propertyValue = new PropertyValue<>(entry.getKey(), entry.getValue());
                this.properties.put(propertyValue.getPropertyName(), propertyValue);
            }
            return this;
        }
    }
}
