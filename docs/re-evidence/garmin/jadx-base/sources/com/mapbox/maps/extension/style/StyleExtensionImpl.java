package com.mapbox.maps.extension.style;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.ColorTheme;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.TransitionOptions;
import com.mapbox.maps.extension.style.atmosphere.generated.Atmosphere;
import com.mapbox.maps.extension.style.image.ImageExtensionImpl;
import com.mapbox.maps.extension.style.image.ImageNinePatchExtensionImpl;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.light.DynamicLight;
import com.mapbox.maps.extension.style.light.generated.FlatLight;
import com.mapbox.maps.extension.style.model.ModelExtensionImpl;
import com.mapbox.maps.extension.style.precipitations.generated.Rain;
import com.mapbox.maps.extension.style.precipitations.generated.Snow;
import com.mapbox.maps.extension.style.projection.generated.Projection;
import com.mapbox.maps.extension.style.sources.Source;
import com.mapbox.maps.extension.style.terrain.generated.Terrain;
import com.mapbox.maps.extension.style.utils.StyleTelemetryEvents;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.util.ArrayList;
import java.util.List;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001KB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0010R,\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00190\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001c\u0010&\u001a\u0004\u0018\u00010%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010+\u001a\u0004\u0018\u00010*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u00100\u001a\u0004\u0018\u00010/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u00105\u001a\u0004\u0018\u0001048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\"\u0010:\u001a\u0004\u0018\u0001098\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u0010\u0018\u001a\u0004\b<\u0010=R\"\u0010@\u001a\u0004\u0018\u00010?8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bD\u0010\u0018\u001a\u0004\bB\u0010CR\"\u0010F\u001a\u0004\u0018\u00010E8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\bF\u0010G\u0012\u0004\bJ\u0010\u0018\u001a\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lcom/mapbox/maps/extension/style/StyleExtensionImpl;", "Lcom/mapbox/maps/extension/style/StyleContract$StyleExtension;", "Lcom/mapbox/maps/extension/style/StyleExtensionImpl$Builder;", "builder", "<init>", "(Lcom/mapbox/maps/extension/style/StyleExtensionImpl$Builder;)V", "", TtmlNode.TAG_STYLE, "Ljava/lang/String;", "getStyle", "()Ljava/lang/String;", "", "Lcom/mapbox/maps/extension/style/sources/Source;", "sources", "Ljava/util/List;", "getSources", "()Ljava/util/List;", "Lcom/mapbox/maps/extension/style/StyleContract$StyleImageExtension;", "images", "getImages", "Lcom/mapbox/maps/extension/style/StyleContract$StyleModelExtension;", ModelSourceWrapper.MODELS, "getModels", "getModels$annotations", "()V", "Lo13/p;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "Lcom/mapbox/maps/LayerPosition;", "layers", "getLayers", "Lcom/mapbox/maps/extension/style/StyleContract$StyleLightExtension;", "flatLight", "Lcom/mapbox/maps/extension/style/StyleContract$StyleLightExtension;", "getFlatLight", "()Lcom/mapbox/maps/extension/style/StyleContract$StyleLightExtension;", "dynamicLight", "getDynamicLight", "Lcom/mapbox/maps/extension/style/terrain/generated/Terrain;", "terrain", "Lcom/mapbox/maps/extension/style/terrain/generated/Terrain;", "getTerrain", "()Lcom/mapbox/maps/extension/style/terrain/generated/Terrain;", "Lcom/mapbox/maps/extension/style/projection/generated/Projection;", "projection", "Lcom/mapbox/maps/extension/style/projection/generated/Projection;", "getProjection", "()Lcom/mapbox/maps/extension/style/projection/generated/Projection;", "Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere;", "atmosphere", "Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere;", "getAtmosphere", "()Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere;", "Lcom/mapbox/maps/TransitionOptions;", "transition", "Lcom/mapbox/maps/TransitionOptions;", "getTransition", "()Lcom/mapbox/maps/TransitionOptions;", "Lcom/mapbox/maps/extension/style/StyleContract$StyleRainExtension;", "rain", "Lcom/mapbox/maps/extension/style/StyleContract$StyleRainExtension;", "getRain", "()Lcom/mapbox/maps/extension/style/StyleContract$StyleRainExtension;", "getRain$annotations", "Lcom/mapbox/maps/extension/style/StyleContract$StyleSnowExtension;", "snow", "Lcom/mapbox/maps/extension/style/StyleContract$StyleSnowExtension;", "getSnow", "()Lcom/mapbox/maps/extension/style/StyleContract$StyleSnowExtension;", "getSnow$annotations", "Lcom/mapbox/maps/ColorTheme;", "colorTheme", "Lcom/mapbox/maps/ColorTheme;", "getColorTheme", "()Lcom/mapbox/maps/ColorTheme;", "getColorTheme$annotations", "Builder", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StyleExtensionImpl implements StyleContract.StyleExtension {
    private final Atmosphere atmosphere;
    private final ColorTheme colorTheme;
    private final StyleContract.StyleLightExtension dynamicLight;
    private final StyleContract.StyleLightExtension flatLight;
    private final List<StyleContract.StyleImageExtension> images;
    private final List<p<Layer, LayerPosition>> layers;
    private final List<StyleContract.StyleModelExtension> models;
    private final Projection projection;
    private final StyleContract.StyleRainExtension rain;
    private final StyleContract.StyleSnowExtension snow;
    private final List<Source> sources;
    private final String style;
    private final Terrain terrain;
    private final TransitionOptions transition;

    private StyleExtensionImpl(Builder builder) {
        this.style = builder.getStyle();
        this.sources = h0.b1(builder.getSources$extension_style_release());
        this.images = h0.b1(builder.getImages$extension_style_release());
        this.models = h0.b1(builder.getModels$extension_style_release());
        this.layers = h0.b1(builder.getLayers$extension_style_release());
        this.flatLight = builder.getFlatLight();
        this.dynamicLight = builder.getDynamicLight();
        this.terrain = builder.getTerrain();
        this.projection = builder.getProjection();
        this.atmosphere = builder.getAtmosphere();
        this.transition = builder.getTransition();
        this.rain = builder.getRain();
        this.snow = builder.getSnow();
        this.colorTheme = builder.getColorTheme();
    }

    @MapboxExperimental
    public static /* synthetic */ void getColorTheme$annotations() {
    }

    public static /* synthetic */ void getModels$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRain$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getSnow$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleExtension
    public ColorTheme getColorTheme() {
        return this.colorTheme;
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleExtension
    public StyleContract.StyleLightExtension getDynamicLight() {
        return this.dynamicLight;
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleExtension
    public StyleContract.StyleLightExtension getFlatLight() {
        return this.flatLight;
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleExtension
    public List<StyleContract.StyleImageExtension> getImages() {
        return this.images;
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleExtension
    public List<p<Layer, LayerPosition>> getLayers() {
        return this.layers;
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleExtension
    public List<StyleContract.StyleModelExtension> getModels() {
        return this.models;
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleExtension
    public StyleContract.StyleRainExtension getRain() {
        return this.rain;
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleExtension
    public StyleContract.StyleSnowExtension getSnow() {
        return this.snow;
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleExtension
    public List<Source> getSources() {
        return this.sources;
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleExtension
    public String getStyle() {
        return this.style;
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleExtension
    public TransitionOptions getTransition() {
        return this.transition;
    }

    @Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b/\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u00020\u0007*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000bH\u0087\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\n\u001a\u00020\u0007*\u00020\u000fH\u0087\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\n\u001a\u00020\u0007*\u00020\u0012H\u0087\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\n\u001a\u00020\u0007*\u00020\u0015H\u0087\u0002¢\u0006\u0004\b\u0013\u0010\u0016J\u0014\u0010\n\u001a\u00020\u0007*\u00020\u0017H\u0087\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010\n\u001a\u00020\u0007*\u00020\u001aH\u0087\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0014\u0010\n\u001a\u00020\u0007*\u00020\u001dH\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010\n\u001a\u00020\u0007*\u00020 H\u0087\u0002¢\u0006\u0004\b!\u0010\"J\u0014\u0010\n\u001a\u00020\u0007*\u00020#H\u0087\u0002¢\u0006\u0004\b$\u0010%J\u0014\u0010\n\u001a\u00020\u0007*\u00020&H\u0087\u0002¢\u0006\u0004\b'\u0010(J\u0014\u0010\n\u001a\u00020\u0007*\u00020)H\u0087\u0002¢\u0006\u0004\b*\u0010+J\u0014\u0010\n\u001a\u00020\u0007*\u00020,H\u0087\u0002¢\u0006\u0004\b-\u0010.J\u0014\u0010\n\u001a\u00020\u0007*\u00020/H\u0087\u0002¢\u0006\u0004\b0\u00101J\u0014\u0010\n\u001a\u00020\u0007*\u000202H\u0087\u0002¢\u0006\u0004\b3\u00104JG\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u00105\u001a\u00020\u00062\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00109\u001a\u0004\u0018\u000108H\u0007¢\u0006\u0004\b:\u0010;J\r\u0010=\u001a\u00020<¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010AR,\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b0B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR \u0010G\u001a\b\u0012\u0004\u0012\u00020\u000f0B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bH\u0010FR \u0010J\u001a\b\u0012\u0004\u0012\u00020I0B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010D\u001a\u0004\bK\u0010FR&\u0010M\u001a\b\u0012\u0004\u0012\u00020L0B8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\bM\u0010D\u0012\u0004\bO\u0010P\u001a\u0004\bN\u0010FR$\u0010R\u001a\u0004\u0018\u00010Q8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010X\u001a\u0004\u0018\u00010Q8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010S\u001a\u0004\bY\u0010U\"\u0004\bZ\u0010WR$\u0010[\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010\u0019R$\u0010`\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010\u001cR$\u0010e\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010\u001fR$\u0010j\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010\"R*\u0010o\u001a\u0004\u0018\u00010#8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\bo\u0010p\u0012\u0004\bt\u0010P\u001a\u0004\bq\u0010r\"\u0004\bs\u0010%R*\u0010u\u001a\u0004\u0018\u00010&8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\bu\u0010v\u0012\u0004\bz\u0010P\u001a\u0004\bw\u0010x\"\u0004\by\u0010(R$\u0010{\u001a\u0004\u0018\u00010)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0004\b\u007f\u0010+¨\u0006\u0080\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/StyleExtensionImpl$Builder;", "", "", TtmlNode.TAG_STYLE, "<init>", "(Ljava/lang/String;)V", "Lcom/mapbox/maps/extension/style/layers/Layer;", "", "addLayer", "(Lcom/mapbox/maps/extension/style/layers/Layer;)V", "unaryPlus", "Lo13/p;", "Lcom/mapbox/maps/LayerPosition;", "addLayerAtPosition", "(Lo13/p;)V", "Lcom/mapbox/maps/extension/style/sources/Source;", "addSource", "(Lcom/mapbox/maps/extension/style/sources/Source;)V", "Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "setLight", "(Lcom/mapbox/maps/extension/style/light/generated/FlatLight;)V", "Lcom/mapbox/maps/extension/style/light/DynamicLight;", "(Lcom/mapbox/maps/extension/style/light/DynamicLight;)V", "Lcom/mapbox/maps/extension/style/terrain/generated/Terrain;", "setTerrain", "(Lcom/mapbox/maps/extension/style/terrain/generated/Terrain;)V", "Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere;", "setAtmosphere", "(Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere;)V", "Lcom/mapbox/maps/extension/style/projection/generated/Projection;", "setProjection", "(Lcom/mapbox/maps/extension/style/projection/generated/Projection;)V", "Lcom/mapbox/maps/TransitionOptions;", "setTransition", "(Lcom/mapbox/maps/TransitionOptions;)V", "Lcom/mapbox/maps/extension/style/precipitations/generated/Snow;", "setSnow", "(Lcom/mapbox/maps/extension/style/precipitations/generated/Snow;)V", "Lcom/mapbox/maps/extension/style/precipitations/generated/Rain;", "setRain", "(Lcom/mapbox/maps/extension/style/precipitations/generated/Rain;)V", "Lcom/mapbox/maps/ColorTheme;", "setColorTheme", "(Lcom/mapbox/maps/ColorTheme;)V", "Lcom/mapbox/maps/extension/style/image/ImageExtensionImpl;", "addImage", "(Lcom/mapbox/maps/extension/style/image/ImageExtensionImpl;)V", "Lcom/mapbox/maps/extension/style/model/ModelExtensionImpl;", "addModel", "(Lcom/mapbox/maps/extension/style/model/ModelExtensionImpl;)V", "Lcom/mapbox/maps/extension/style/image/ImageNinePatchExtensionImpl;", "addImage9Patch", "(Lcom/mapbox/maps/extension/style/image/ImageNinePatchExtensionImpl;)V", "layer", "above", "below", "", "at", "layerAtPosition", "(Lcom/mapbox/maps/extension/style/layers/Layer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo13/p;", "Lcom/mapbox/maps/extension/style/StyleContract$StyleExtension;", "build", "()Lcom/mapbox/maps/extension/style/StyleContract$StyleExtension;", "Ljava/lang/String;", "getStyle", "()Ljava/lang/String;", "", "layers", "Ljava/util/List;", "getLayers$extension_style_release", "()Ljava/util/List;", "sources", "getSources$extension_style_release", "Lcom/mapbox/maps/extension/style/StyleContract$StyleImageExtension;", "images", "getImages$extension_style_release", "Lcom/mapbox/maps/extension/style/StyleContract$StyleModelExtension;", ModelSourceWrapper.MODELS, "getModels$extension_style_release", "getModels$extension_style_release$annotations", "()V", "Lcom/mapbox/maps/extension/style/StyleContract$StyleLightExtension;", "flatLight", "Lcom/mapbox/maps/extension/style/StyleContract$StyleLightExtension;", "getFlatLight$extension_style_release", "()Lcom/mapbox/maps/extension/style/StyleContract$StyleLightExtension;", "setFlatLight$extension_style_release", "(Lcom/mapbox/maps/extension/style/StyleContract$StyleLightExtension;)V", "dynamicLight", "getDynamicLight$extension_style_release", "setDynamicLight$extension_style_release", "terrain", "Lcom/mapbox/maps/extension/style/terrain/generated/Terrain;", "getTerrain$extension_style_release", "()Lcom/mapbox/maps/extension/style/terrain/generated/Terrain;", "setTerrain$extension_style_release", "atmosphere", "Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere;", "getAtmosphere$extension_style_release", "()Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere;", "setAtmosphere$extension_style_release", "projection", "Lcom/mapbox/maps/extension/style/projection/generated/Projection;", "getProjection$extension_style_release", "()Lcom/mapbox/maps/extension/style/projection/generated/Projection;", "setProjection$extension_style_release", "transition", "Lcom/mapbox/maps/TransitionOptions;", "getTransition$extension_style_release", "()Lcom/mapbox/maps/TransitionOptions;", "setTransition$extension_style_release", "snow", "Lcom/mapbox/maps/extension/style/precipitations/generated/Snow;", "getSnow$extension_style_release", "()Lcom/mapbox/maps/extension/style/precipitations/generated/Snow;", "setSnow$extension_style_release", "getSnow$extension_style_release$annotations", "rain", "Lcom/mapbox/maps/extension/style/precipitations/generated/Rain;", "getRain$extension_style_release", "()Lcom/mapbox/maps/extension/style/precipitations/generated/Rain;", "setRain$extension_style_release", "getRain$extension_style_release$annotations", "colorTheme", "Lcom/mapbox/maps/ColorTheme;", "getColorTheme$extension_style_release", "()Lcom/mapbox/maps/ColorTheme;", "setColorTheme$extension_style_release", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private Atmosphere atmosphere;
        private ColorTheme colorTheme;
        private StyleContract.StyleLightExtension dynamicLight;
        private StyleContract.StyleLightExtension flatLight;
        private final List<StyleContract.StyleImageExtension> images;
        private final List<p<Layer, LayerPosition>> layers;
        private final List<StyleContract.StyleModelExtension> models;
        private Projection projection;
        private Rain rain;
        private Snow snow;
        private final List<Source> sources;
        private final String style;
        private Terrain terrain;
        private TransitionOptions transition;

        public Builder(String str) {
            str.getClass();
            this.style = str;
            this.layers = new ArrayList();
            this.sources = new ArrayList();
            this.images = new ArrayList();
            this.models = new ArrayList();
        }

        public static /* synthetic */ void getModels$extension_style_release$annotations() {
        }

        public static /* synthetic */ void getRain$extension_style_release$annotations() {
        }

        public static /* synthetic */ void getSnow$extension_style_release$annotations() {
        }

        public static /* synthetic */ p layerAtPosition$default(Builder builder, Layer layer, String str, String str2, Integer num, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                str = null;
            }
            if ((i14 & 4) != 0) {
                str2 = null;
            }
            if ((i14 & 8) != 0) {
                num = null;
            }
            return builder.layerAtPosition(layer, str, str2, num);
        }

        public final void addImage(ImageExtensionImpl imageExtensionImpl) {
            imageExtensionImpl.getClass();
            this.images.add(imageExtensionImpl);
        }

        public final void addImage9Patch(ImageNinePatchExtensionImpl imageNinePatchExtensionImpl) {
            imageNinePatchExtensionImpl.getClass();
            this.images.add(imageNinePatchExtensionImpl);
        }

        public final void addLayer(Layer layer) {
            layer.getClass();
            this.layers.add(new p<>(layer, new LayerPosition(null, null, null)));
        }

        public final void addLayerAtPosition(p<? extends Layer, LayerPosition> pVar) {
            pVar.getClass();
            this.layers.add(pVar);
        }

        @MapboxExperimental
        public final void addModel(ModelExtensionImpl modelExtensionImpl) {
            modelExtensionImpl.getClass();
            this.models.add(modelExtensionImpl);
        }

        public final void addSource(Source source) {
            source.getClass();
            this.sources.add(source);
        }

        public final StyleContract.StyleExtension build() {
            StyleTelemetryEvents.INSTANCE.getDsl().increment();
            return new StyleExtensionImpl(this, null);
        }

        /* JADX INFO: renamed from: getAtmosphere$extension_style_release, reason: from getter */
        public final Atmosphere getAtmosphere() {
            return this.atmosphere;
        }

        /* JADX INFO: renamed from: getColorTheme$extension_style_release, reason: from getter */
        public final ColorTheme getColorTheme() {
            return this.colorTheme;
        }

        /* JADX INFO: renamed from: getDynamicLight$extension_style_release, reason: from getter */
        public final StyleContract.StyleLightExtension getDynamicLight() {
            return this.dynamicLight;
        }

        /* JADX INFO: renamed from: getFlatLight$extension_style_release, reason: from getter */
        public final StyleContract.StyleLightExtension getFlatLight() {
            return this.flatLight;
        }

        public final List<StyleContract.StyleImageExtension> getImages$extension_style_release() {
            return this.images;
        }

        public final List<p<Layer, LayerPosition>> getLayers$extension_style_release() {
            return this.layers;
        }

        public final List<StyleContract.StyleModelExtension> getModels$extension_style_release() {
            return this.models;
        }

        /* JADX INFO: renamed from: getProjection$extension_style_release, reason: from getter */
        public final Projection getProjection() {
            return this.projection;
        }

        /* JADX INFO: renamed from: getRain$extension_style_release, reason: from getter */
        public final Rain getRain() {
            return this.rain;
        }

        /* JADX INFO: renamed from: getSnow$extension_style_release, reason: from getter */
        public final Snow getSnow() {
            return this.snow;
        }

        public final List<Source> getSources$extension_style_release() {
            return this.sources;
        }

        public final String getStyle() {
            return this.style;
        }

        /* JADX INFO: renamed from: getTerrain$extension_style_release, reason: from getter */
        public final Terrain getTerrain() {
            return this.terrain;
        }

        /* JADX INFO: renamed from: getTransition$extension_style_release, reason: from getter */
        public final TransitionOptions getTransition() {
            return this.transition;
        }

        public final p<Layer, LayerPosition> layerAtPosition(Layer layer) {
            layer.getClass();
            return layerAtPosition$default(this, layer, null, null, null, 14, null);
        }

        public final void setAtmosphere(Atmosphere atmosphere) {
            atmosphere.getClass();
            this.atmosphere = atmosphere;
        }

        public final void setAtmosphere$extension_style_release(Atmosphere atmosphere) {
            this.atmosphere = atmosphere;
        }

        @MapboxExperimental
        public final void setColorTheme(ColorTheme colorTheme) {
            colorTheme.getClass();
            this.colorTheme = colorTheme;
        }

        public final void setColorTheme$extension_style_release(ColorTheme colorTheme) {
            this.colorTheme = colorTheme;
        }

        public final void setDynamicLight$extension_style_release(StyleContract.StyleLightExtension styleLightExtension) {
            this.dynamicLight = styleLightExtension;
        }

        public final void setFlatLight$extension_style_release(StyleContract.StyleLightExtension styleLightExtension) {
            this.flatLight = styleLightExtension;
        }

        public final void setLight(FlatLight flatLight) {
            flatLight.getClass();
            this.flatLight = flatLight;
        }

        public final void setProjection(Projection projection) {
            projection.getClass();
            this.projection = projection;
        }

        public final void setProjection$extension_style_release(Projection projection) {
            this.projection = projection;
        }

        public final void setRain(Rain rain) {
            rain.getClass();
            this.rain = rain;
        }

        public final void setRain$extension_style_release(Rain rain) {
            this.rain = rain;
        }

        public final void setSnow(Snow snow) {
            snow.getClass();
            this.snow = snow;
        }

        public final void setSnow$extension_style_release(Snow snow) {
            this.snow = snow;
        }

        public final void setTerrain(Terrain terrain) {
            terrain.getClass();
            this.terrain = terrain;
        }

        public final void setTerrain$extension_style_release(Terrain terrain) {
            this.terrain = terrain;
        }

        public final void setTransition(TransitionOptions transitionOptions) {
            transitionOptions.getClass();
            this.transition = transitionOptions;
        }

        public final void setTransition$extension_style_release(TransitionOptions transitionOptions) {
            this.transition = transitionOptions;
        }

        public final void setLight(DynamicLight dynamicLight) {
            dynamicLight.getClass();
            this.dynamicLight = dynamicLight;
        }

        public final p<Layer, LayerPosition> layerAtPosition(Layer layer, String str) {
            layer.getClass();
            return layerAtPosition$default(this, layer, str, null, null, 12, null);
        }

        public final p<Layer, LayerPosition> layerAtPosition(Layer layer, String str, String str2) {
            layer.getClass();
            return layerAtPosition$default(this, layer, str, str2, null, 8, null);
        }

        public final p<Layer, LayerPosition> layerAtPosition(Layer layer, String above, String below, Integer at3) {
            layer.getClass();
            return new p<>(layer, new LayerPosition(above, below, at3));
        }
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleExtension
    public Atmosphere getAtmosphere() {
        return this.atmosphere;
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleExtension
    public Projection getProjection() {
        return this.projection;
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleExtension
    public Terrain getTerrain() {
        return this.terrain;
    }

    public /* synthetic */ StyleExtensionImpl(Builder builder, j jVar) {
        this(builder);
    }
}
