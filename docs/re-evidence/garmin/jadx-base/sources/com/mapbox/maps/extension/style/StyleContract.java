package com.mapbox.maps.extension.style;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.ColorTheme;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.TransitionOptions;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.util.List;
import o13.p;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\bf\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/extension/style/StyleContract;", "", "StyleAtmosphereExtension", "StyleExtension", "StyleImageExtension", "StyleLayerExtension", "StyleLightExtension", "StyleModelExtension", "StyleProjectionExtension", "StyleRainExtension", "StyleSnowExtension", "StyleSourceExtension", "StyleTerrainExtension", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface StyleContract {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/mapbox/maps/extension/style/StyleContract$StyleAtmosphereExtension;", "", "bindTo", "", "delegate", "Lcom/mapbox/maps/MapboxStyleManager;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface StyleAtmosphereExtension {
        void bindTo(MapboxStyleManager delegate);
    }

    @Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\tR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068&X§\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\tR&\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00130\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\tR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u0004\u0018\u00010\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u0004\u0018\u00010&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0016\u0010-\u001a\u0004\u0018\u00010*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001c\u00102\u001a\u0004\u0018\u00010.8&X§\u0004¢\u0006\f\u0012\u0004\b1\u0010\u0011\u001a\u0004\b/\u00100R\u001c\u00107\u001a\u0004\u0018\u0001038&X§\u0004¢\u0006\f\u0012\u0004\b6\u0010\u0011\u001a\u0004\b4\u00105R\u001c\u0010<\u001a\u0004\u0018\u0001088&X§\u0004¢\u0006\f\u0012\u0004\b;\u0010\u0011\u001a\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/mapbox/maps/extension/style/StyleContract$StyleExtension;", "", "", "getStyle", "()Ljava/lang/String;", TtmlNode.TAG_STYLE, "", "Lcom/mapbox/maps/extension/style/StyleContract$StyleSourceExtension;", "getSources", "()Ljava/util/List;", "sources", "Lcom/mapbox/maps/extension/style/StyleContract$StyleImageExtension;", "getImages", "images", "Lcom/mapbox/maps/extension/style/StyleContract$StyleModelExtension;", "getModels", "getModels$annotations", "()V", ModelSourceWrapper.MODELS, "Lo13/p;", "Lcom/mapbox/maps/extension/style/StyleContract$StyleLayerExtension;", "Lcom/mapbox/maps/LayerPosition;", "getLayers", "layers", "Lcom/mapbox/maps/extension/style/StyleContract$StyleLightExtension;", "getFlatLight", "()Lcom/mapbox/maps/extension/style/StyleContract$StyleLightExtension;", "flatLight", "getDynamicLight", "dynamicLight", "Lcom/mapbox/maps/extension/style/StyleContract$StyleTerrainExtension;", "getTerrain", "()Lcom/mapbox/maps/extension/style/StyleContract$StyleTerrainExtension;", "terrain", "Lcom/mapbox/maps/extension/style/StyleContract$StyleAtmosphereExtension;", "getAtmosphere", "()Lcom/mapbox/maps/extension/style/StyleContract$StyleAtmosphereExtension;", "atmosphere", "Lcom/mapbox/maps/extension/style/StyleContract$StyleProjectionExtension;", "getProjection", "()Lcom/mapbox/maps/extension/style/StyleContract$StyleProjectionExtension;", "projection", "Lcom/mapbox/maps/TransitionOptions;", "getTransition", "()Lcom/mapbox/maps/TransitionOptions;", "transition", "Lcom/mapbox/maps/extension/style/StyleContract$StyleRainExtension;", "getRain", "()Lcom/mapbox/maps/extension/style/StyleContract$StyleRainExtension;", "getRain$annotations", "rain", "Lcom/mapbox/maps/extension/style/StyleContract$StyleSnowExtension;", "getSnow", "()Lcom/mapbox/maps/extension/style/StyleContract$StyleSnowExtension;", "getSnow$annotations", "snow", "Lcom/mapbox/maps/ColorTheme;", "getColorTheme", "()Lcom/mapbox/maps/ColorTheme;", "getColorTheme$annotations", "colorTheme", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface StyleExtension {

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class DefaultImpls {
            @MapboxExperimental
            public static /* synthetic */ void getColorTheme$annotations() {
            }

            @MapboxExperimental
            public static /* synthetic */ void getModels$annotations() {
            }

            @MapboxExperimental
            public static /* synthetic */ void getRain$annotations() {
            }

            @MapboxExperimental
            public static /* synthetic */ void getSnow$annotations() {
            }
        }

        StyleAtmosphereExtension getAtmosphere();

        ColorTheme getColorTheme();

        StyleLightExtension getDynamicLight();

        StyleLightExtension getFlatLight();

        List<StyleImageExtension> getImages();

        List<p<StyleLayerExtension, LayerPosition>> getLayers();

        List<StyleModelExtension> getModels();

        StyleProjectionExtension getProjection();

        StyleRainExtension getRain();

        StyleSnowExtension getSnow();

        List<StyleSourceExtension> getSources();

        String getStyle();

        StyleTerrainExtension getTerrain();

        TransitionOptions getTransition();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/mapbox/maps/extension/style/StyleContract$StyleImageExtension;", "", "bindTo", "", "delegate", "Lcom/mapbox/maps/MapboxStyleManager;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface StyleImageExtension {
        void bindTo(MapboxStyleManager delegate);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/mapbox/maps/extension/style/StyleContract$StyleLayerExtension;", "", "bindTo", "", "delegate", "Lcom/mapbox/maps/MapboxStyleManager;", ModelSourceWrapper.POSITION, "Lcom/mapbox/maps/LayerPosition;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface StyleLayerExtension {

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void bindTo$default(StyleLayerExtension styleLayerExtension, MapboxStyleManager mapboxStyleManager, LayerPosition layerPosition, int i14, Object obj) {
                if (obj != null) {
                    e.w("Super calls with default arguments not supported in this target, function: bindTo");
                    return;
                }
                if ((i14 & 2) != 0) {
                    layerPosition = null;
                }
                styleLayerExtension.bindTo(mapboxStyleManager, layerPosition);
            }
        }

        void bindTo(MapboxStyleManager delegate, LayerPosition position);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/mapbox/maps/extension/style/StyleContract$StyleLightExtension;", "", "bindTo", "", "delegate", "Lcom/mapbox/maps/MapboxStyleManager;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface StyleLightExtension {
        void bindTo(MapboxStyleManager delegate);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/mapbox/maps/extension/style/StyleContract$StyleModelExtension;", "", "bindTo", "", "delegate", "Lcom/mapbox/maps/MapboxStyleManager;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @MapboxExperimental
    public interface StyleModelExtension {
        void bindTo(MapboxStyleManager delegate);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/mapbox/maps/extension/style/StyleContract$StyleProjectionExtension;", "", "bindTo", "", "delegate", "Lcom/mapbox/maps/MapboxStyleManager;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface StyleProjectionExtension {
        void bindTo(MapboxStyleManager delegate);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/mapbox/maps/extension/style/StyleContract$StyleRainExtension;", "", "bindTo", "", "delegate", "Lcom/mapbox/maps/MapboxStyleManager;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @MapboxExperimental
    public interface StyleRainExtension {
        void bindTo(MapboxStyleManager delegate);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/mapbox/maps/extension/style/StyleContract$StyleSnowExtension;", "", "bindTo", "", "delegate", "Lcom/mapbox/maps/MapboxStyleManager;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @MapboxExperimental
    public interface StyleSnowExtension {
        void bindTo(MapboxStyleManager delegate);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/mapbox/maps/extension/style/StyleContract$StyleSourceExtension;", "", "bindTo", "", "delegate", "Lcom/mapbox/maps/MapboxStyleManager;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface StyleSourceExtension {
        void bindTo(MapboxStyleManager delegate);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/mapbox/maps/extension/style/StyleContract$StyleTerrainExtension;", "", "bindTo", "", "delegate", "Lcom/mapbox/maps/MapboxStyleManager;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface StyleTerrainExtension {
        void bindTo(MapboxStyleManager delegate);
    }
}
