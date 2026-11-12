package com.mapbox.maps.extension.style.sources.generated;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.StyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.StylePropertyValueKind;
import com.mapbox.maps.TileCacheBudget;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.sources.Source;
import com.mapbox.maps.extension.style.sources.SourceUtils;
import com.mapbox.maps.extension.style.sources.TileSet;
import com.mapbox.maps.extension.style.types.SourceDsl;
import com.mapbox.maps.extension.style.utils.TypeUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.p;
import e23.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o2.c;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 %2\u00020\u0001:\u0003$%&B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010!\u001a\u00020\u0006H\u0010¢\u0006\u0002\b\"J\u0010\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u000fJ\u0010\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u000fJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0018J\u0014\u0010\u001d\u001a\u00020\u00002\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\nJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0006R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\rR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\rR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b \u0010\b¨\u0006'"}, d2 = {"Lcom/mapbox/maps/extension/style/sources/generated/RasterArraySource;", "Lcom/mapbox/maps/extension/style/sources/Source;", "builder", "Lcom/mapbox/maps/extension/style/sources/generated/RasterArraySource$Builder;", "(Lcom/mapbox/maps/extension/style/sources/generated/RasterArraySource$Builder;)V", "attribution", "", "getAttribution", "()Ljava/lang/String;", "bounds", "", "", "getBounds", "()Ljava/util/List;", "maxzoom", "", "getMaxzoom", "()Ljava/lang/Long;", "minzoom", "getMinzoom", "rasterLayers", "Lcom/mapbox/maps/extension/style/sources/generated/RasterArraySource$RasterDataLayer;", "getRasterLayers", "tileCacheBudget", "Lcom/mapbox/maps/TileCacheBudget;", "getTileCacheBudget", "()Lcom/mapbox/maps/TileCacheBudget;", "tileSize", "getTileSize", "tiles", "getTiles", "url", "getUrl", "getType", "getType$extension_style_release", "value", "Builder", "Companion", "RasterDataLayer", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
public final class RasterArraySource extends Source {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/mapbox/maps/extension/style/sources/generated/RasterArraySource$RasterDataLayer;", "", "layerId", "", "bands", "", "(Ljava/lang/String;Ljava/util/List;)V", "getBands", "()Ljava/util/List;", "getLayerId", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "toString", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class RasterDataLayer {
        private final List<String> bands;
        private final String layerId;

        public RasterDataLayer(String str, List<String> list) {
            str.getClass();
            list.getClass();
            this.layerId = str;
            this.bands = list;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!RasterDataLayer.class.equals(other != null ? other.getClass() : null)) {
                return false;
            }
            other.getClass();
            RasterDataLayer rasterDataLayer = (RasterDataLayer) other;
            return s.g(this.layerId, rasterDataLayer.layerId) && s.g(this.bands, rasterDataLayer.bands);
        }

        public final List<String> getBands() {
            return this.bands;
        }

        public final String getLayerId() {
            return this.layerId;
        }

        public int hashCode() {
            return Objects.hash(this.layerId, this.bands);
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder("RasterDataLayer(layerId=");
            sb3.append(this.layerId);
            sb3.append(", bands:");
            return c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.bands, sb3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RasterArraySource(Builder builder) {
        super(builder.getSourceId());
        builder.getClass();
        getSourceProperties$extension_style_release().putAll(builder.getProperties$extension_style_release());
        getVolatileSourceProperties$extension_style_release().putAll(builder.getVolatileProperties$extension_style_release());
    }

    public static /* synthetic */ RasterArraySource maxzoom$default(RasterArraySource rasterArraySource, long j8, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j8 = 22;
        }
        return rasterArraySource.maxzoom(j8);
    }

    public static /* synthetic */ RasterArraySource minzoom$default(RasterArraySource rasterArraySource, long j8, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j8 = 0;
        }
        return rasterArraySource.minzoom(j8);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList, java.util.Collection] */
    public final List<RasterDataLayer> getRasterLayers() {
        Object objUnwrap;
        ?? arrayList;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            p.n("Couldn't get rasterLayers: source is not added to style yet.");
            return null;
        }
        try {
            StylePropertyValue styleSourceProperty = delegate.getStyleSourceProperty(getSourceId(), "rasterLayers");
            if (styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
                Object contents = styleSourceProperty.getValue().getContents();
                contents.getClass();
                Set setEntrySet = ((HashMap) contents).entrySet();
                setEntrySet.getClass();
                Set<Map.Entry> set = setEntrySet;
                arrayList = new ArrayList(y.r(set, 10));
                for (Map.Entry entry : set) {
                    Object key = entry.getKey();
                    key.getClass();
                    String str = (String) key;
                    Object contents2 = ((Value) entry.getValue()).getContents();
                    contents2.getClass();
                    List list = (List) contents2;
                    ArrayList arrayList2 = new ArrayList(y.r(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Object contents3 = ((Value) it.next()).getContents();
                        contents3.getClass();
                        arrayList2.add((String) contents3);
                    }
                    arrayList.add(new RasterDataLayer(str, arrayList2));
                }
            } else {
                objUnwrap = TypeUtilsKt.unwrap(styleSourceProperty, List.class);
                arrayList = objUnwrap;
            }
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate.getStyleSourceProperty(getSourceId(), "rasterLayers").getValue().toJson();
            objUnwrap = null;
        }
        return (List) arrayList;
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

    public final Long getTileSize() {
        Object objUnwrap;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            p.n("Couldn't get tileSize: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate.getStyleSourceProperty(getSourceId(), "tileSize"), Long.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate.getStyleSourceProperty(getSourceId(), "tileSize").getValue().toJson();
            objUnwrap = null;
        }
        return (Long) objUnwrap;
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
        return "raster-array";
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

    public final RasterArraySource maxzoom(long value) {
        Source.setProperty$extension_style_release$default(this, new PropertyValue("maxzoom", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value))), false, 2, null);
        return this;
    }

    public final RasterArraySource minzoom(long value) {
        Source.setProperty$extension_style_release$default(this, new PropertyValue("minzoom", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value))), false, 2, null);
        return this;
    }

    public final RasterArraySource tileCacheBudget(TileCacheBudget value) {
        value.getClass();
        setVolatileProperty$extension_style_release(new PropertyValue<>("tile-cache-budget", TypeUtils.INSTANCE.wrapToValue(value)));
        return this;
    }

    public final RasterArraySource tiles(List<String> value) {
        value.getClass();
        Source.setProperty$extension_style_release$default(this, new PropertyValue("tiles", TypeUtils.INSTANCE.wrapToValue(value)), false, 2, null);
        return this;
    }

    public final RasterArraySource url(String value) {
        value.getClass();
        Source.setProperty$extension_style_release$default(this, new PropertyValue("url", TypeUtils.INSTANCE.wrapToValue(value)), false, 2, null);
        return this;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/extension/style/sources/generated/RasterArraySource$Companion;", "", "()V", "defaultMaxzoom", "", "getDefaultMaxzoom", "()Ljava/lang/Long;", "defaultMinzoom", "getDefaultMinzoom", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final Long getDefaultMaxzoom() {
            Object objUnwrap;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("raster-array", "maxzoom");
            styleSourcePropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleSourcePropertyDefaultValue, Long.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Long) objUnwrap;
        }

        public final Long getDefaultMinzoom() {
            Object objUnwrap;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("raster-array", "minzoom");
            styleSourcePropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleSourcePropertyDefaultValue, Long.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Long) objUnwrap;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b¢\u0006\u0004\b\u0018\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R*\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030'0&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R*\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030'0&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+¨\u0006."}, d2 = {"Lcom/mapbox/maps/extension/style/sources/generated/RasterArraySource$Builder;", "", "", "sourceId", "<init>", "(Ljava/lang/String;)V", "value", "url", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/sources/generated/RasterArraySource$Builder;", "", "tiles", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/sources/generated/RasterArraySource$Builder;", "", "bounds", "", "minzoom", "(J)Lcom/mapbox/maps/extension/style/sources/generated/RasterArraySource$Builder;", "maxzoom", "tileSize", "attribution", "Lcom/mapbox/maps/TileCacheBudget;", "tileCacheBudget", "(Lcom/mapbox/maps/TileCacheBudget;)Lcom/mapbox/maps/extension/style/sources/generated/RasterArraySource$Builder;", "Lcom/mapbox/maps/extension/style/sources/TileSet;", "tileSet", "(Lcom/mapbox/maps/extension/style/sources/TileSet;)Lcom/mapbox/maps/extension/style/sources/generated/RasterArraySource$Builder;", "tilejson", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/sources/TileSet$Builder;", "", "block", "(Ljava/lang/String;Ljava/util/List;Le23/l;)Lcom/mapbox/maps/extension/style/sources/generated/RasterArraySource$Builder;", "Lcom/mapbox/maps/extension/style/sources/generated/RasterArraySource;", "build", "()Lcom/mapbox/maps/extension/style/sources/generated/RasterArraySource;", "Ljava/lang/String;", "getSourceId", "()Ljava/lang/String;", "Ljava/util/HashMap;", "Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;", "properties", "Ljava/util/HashMap;", "getProperties$extension_style_release", "()Ljava/util/HashMap;", "volatileProperties", "getVolatileProperties$extension_style_release", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
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

        public static /* synthetic */ Builder minzoom$default(Builder builder, long j8, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                j8 = 0;
            }
            return builder.minzoom(j8);
        }

        public static /* synthetic */ Builder tileSize$default(Builder builder, long j8, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                j8 = 512;
            }
            return builder.tileSize(j8);
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

        public final RasterArraySource build() {
            return new RasterArraySource(this);
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

        public final Builder maxzoom(long value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("maxzoom", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value)));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder minzoom(long value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("minzoom", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value)));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder tileCacheBudget(TileCacheBudget value) {
            value.getClass();
            PropertyValue<?> propertyValue = new PropertyValue<>("tile-cache-budget", TypeUtils.INSTANCE.wrapToValue(value));
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

        public final Builder tileSize(long value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("tileSize", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value)));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
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
