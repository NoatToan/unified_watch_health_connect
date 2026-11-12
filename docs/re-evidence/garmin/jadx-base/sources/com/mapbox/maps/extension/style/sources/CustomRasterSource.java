package com.mapbox.maps.extension.style.sources;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.maps.CustomRasterSourceOptions;
import com.mapbox.maps.CustomRasterSourceTileData;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.utils.ExpectedUtilsKt;
import com.mapbox.maps.extension.style.utils.TypeUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.p;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\r\u0010\u0010\u001a\u00020\u0003H\u0010¢\u0006\u0002\b\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bJ\u0014\u0010\u0015\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/mapbox/maps/extension/style/sources/CustomRasterSource;", "Lcom/mapbox/maps/extension/style/sources/Source;", TtmlNode.ATTR_ID, "", "options", "Lcom/mapbox/maps/CustomRasterSourceOptions;", "(Ljava/lang/String;Lcom/mapbox/maps/CustomRasterSourceOptions;)V", "maxOverscaleFactorForParentTiles", "", "getMaxOverscaleFactorForParentTiles", "()Ljava/lang/Long;", "addSource", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/bindgen/None;", TtmlNode.TAG_STYLE, "Lcom/mapbox/maps/MapboxStyleManager;", "getType", "getType$extension_style_release", "setMaxOverscaleFactorForParentTiles", "", "value", "setTileData", "tileData", "", "Lcom/mapbox/maps/CustomRasterSourceTileData;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
public final class CustomRasterSource extends Source {
    private final CustomRasterSourceOptions options;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomRasterSource(String str, CustomRasterSourceOptions customRasterSourceOptions) {
        super(str);
        str.getClass();
        customRasterSourceOptions.getClass();
        this.options = customRasterSourceOptions;
    }

    @Override // com.mapbox.maps.extension.style.sources.Source
    public Expected<String, None> addSource(MapboxStyleManager style) {
        style.getClass();
        return style.addStyleCustomRasterSource(getSourceId(), this.options);
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

    @Override // com.mapbox.maps.extension.style.sources.Source
    public String getType$extension_style_release() {
        return "custom-raster";
    }

    public final void setMaxOverscaleFactorForParentTiles(long value) {
        setVolatileProperty$extension_style_release(new PropertyValue<>("max-overscale-factor-for-parent-tiles", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value))));
    }

    public final void setTileData(List<CustomRasterSourceTileData> tileData) {
        tileData.getClass();
        MapboxStyleManager delegate = getDelegate();
        ExpectedUtilsKt.check(delegate != null ? delegate.setStyleCustomRasterSourceTileData(getSourceId(), tileData) : null);
    }
}
