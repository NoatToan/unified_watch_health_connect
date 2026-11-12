package com.mapbox.maps.extension.compose.style;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.TransitionOptions;
import com.mapbox.maps.extension.compose.style.atmosphere.generated.AtmosphereState;
import com.mapbox.maps.extension.compose.style.interactions.StyleInteractionsState;
import com.mapbox.maps.extension.compose.style.lights.LightsState;
import com.mapbox.maps.extension.compose.style.precipitations.generated.RainState;
import com.mapbox.maps.extension.compose.style.precipitations.generated.SnowState;
import com.mapbox.maps.extension.compose.style.projection.generated.Projection;
import com.mapbox.maps.extension.compose.style.terrain.generated.TerrainState;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p3.p0;
import p3.p1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bF\b\u0007\u0018\u00002\u00020\u0001B]\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\t\b\u0016¢\u0006\u0004\b\u0016\u0010\u0018R+\u0010 \u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010&\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010,\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R+\u00102\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010\u001b\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R1\u00109\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b3\u0010\u001b\u0012\u0004\b8\u0010\u0018\u001a\u0004\b4\u00105\"\u0004\b6\u00107R1\u0010@\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b:\u0010\u001b\u0012\u0004\b?\u0010\u0018\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R+\u0010F\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010\u001b\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER+\u0010L\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010\u001b\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR+\u0010R\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010\u001b\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR1\u0010Y\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00148F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bS\u0010\u001b\u0012\u0004\bX\u0010\u0018\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006Z"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/StyleState;", "", "Lcom/mapbox/maps/extension/compose/style/StyleImportsConfig;", "initialStyleImportsConfig", "Lcom/mapbox/maps/extension/compose/style/interactions/StyleInteractionsState;", "initialStyleInteractionsState", "Lcom/mapbox/maps/extension/compose/style/projection/generated/Projection;", "initialProjection", "Lcom/mapbox/maps/extension/compose/style/atmosphere/generated/AtmosphereState;", "initialAtmosphereState", "Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState;", "initialRainState", "Lcom/mapbox/maps/extension/compose/style/precipitations/generated/SnowState;", "initialSnowState", "Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState;", "initialTerrainState", "Lcom/mapbox/maps/extension/compose/style/lights/LightsState;", "initialLightsState", "Lcom/mapbox/maps/TransitionOptions;", "initialStyleTransition", "Lcom/mapbox/maps/extension/compose/style/StyleColorTheme;", "initialColorTheme", "<init>", "(Lcom/mapbox/maps/extension/compose/style/StyleImportsConfig;Lcom/mapbox/maps/extension/compose/style/interactions/StyleInteractionsState;Lcom/mapbox/maps/extension/compose/style/projection/generated/Projection;Lcom/mapbox/maps/extension/compose/style/atmosphere/generated/AtmosphereState;Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState;Lcom/mapbox/maps/extension/compose/style/precipitations/generated/SnowState;Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState;Lcom/mapbox/maps/extension/compose/style/lights/LightsState;Lcom/mapbox/maps/TransitionOptions;Lcom/mapbox/maps/extension/compose/style/StyleColorTheme;)V", "()V", "<set-?>", "styleImportsConfig$delegate", "Lp3/p1;", "getStyleImportsConfig", "()Lcom/mapbox/maps/extension/compose/style/StyleImportsConfig;", "setStyleImportsConfig", "(Lcom/mapbox/maps/extension/compose/style/StyleImportsConfig;)V", "styleImportsConfig", "styleInteractionsState$delegate", "getStyleInteractionsState", "()Lcom/mapbox/maps/extension/compose/style/interactions/StyleInteractionsState;", "setStyleInteractionsState", "(Lcom/mapbox/maps/extension/compose/style/interactions/StyleInteractionsState;)V", "styleInteractionsState", "projection$delegate", "getProjection", "()Lcom/mapbox/maps/extension/compose/style/projection/generated/Projection;", "setProjection", "(Lcom/mapbox/maps/extension/compose/style/projection/generated/Projection;)V", "projection", "atmosphereState$delegate", "getAtmosphereState", "()Lcom/mapbox/maps/extension/compose/style/atmosphere/generated/AtmosphereState;", "setAtmosphereState", "(Lcom/mapbox/maps/extension/compose/style/atmosphere/generated/AtmosphereState;)V", "atmosphereState", "snowState$delegate", "getSnowState", "()Lcom/mapbox/maps/extension/compose/style/precipitations/generated/SnowState;", "setSnowState", "(Lcom/mapbox/maps/extension/compose/style/precipitations/generated/SnowState;)V", "getSnowState$annotations", "snowState", "rainState$delegate", "getRainState", "()Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState;", "setRainState", "(Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState;)V", "getRainState$annotations", "rainState", "terrainState$delegate", "getTerrainState", "()Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState;", "setTerrainState", "(Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState;)V", "terrainState", "lightsState$delegate", "getLightsState", "()Lcom/mapbox/maps/extension/compose/style/lights/LightsState;", "setLightsState", "(Lcom/mapbox/maps/extension/compose/style/lights/LightsState;)V", "lightsState", "styleTransition$delegate", "getStyleTransition", "()Lcom/mapbox/maps/TransitionOptions;", "setStyleTransition", "(Lcom/mapbox/maps/TransitionOptions;)V", "styleTransition", "styleColorTheme$delegate", "getStyleColorTheme", "()Lcom/mapbox/maps/extension/compose/style/StyleColorTheme;", "setStyleColorTheme", "(Lcom/mapbox/maps/extension/compose/style/StyleColorTheme;)V", "getStyleColorTheme$annotations", "styleColorTheme", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StyleState {

    /* JADX INFO: renamed from: atmosphereState$delegate, reason: from kotlin metadata */
    private final p1 atmosphereState;

    /* JADX INFO: renamed from: lightsState$delegate, reason: from kotlin metadata */
    private final p1 lightsState;

    /* JADX INFO: renamed from: projection$delegate, reason: from kotlin metadata */
    private final p1 projection;

    /* JADX INFO: renamed from: rainState$delegate, reason: from kotlin metadata */
    private final p1 rainState;

    /* JADX INFO: renamed from: snowState$delegate, reason: from kotlin metadata */
    private final p1 snowState;

    /* JADX INFO: renamed from: styleColorTheme$delegate, reason: from kotlin metadata */
    private final p1 styleColorTheme;

    /* JADX INFO: renamed from: styleImportsConfig$delegate, reason: from kotlin metadata */
    private final p1 styleImportsConfig;

    /* JADX INFO: renamed from: styleInteractionsState$delegate, reason: from kotlin metadata */
    private final p1 styleInteractionsState;

    /* JADX INFO: renamed from: styleTransition$delegate, reason: from kotlin metadata */
    private final p1 styleTransition;

    /* JADX INFO: renamed from: terrainState$delegate, reason: from kotlin metadata */
    private final p1 terrainState;

    public StyleState(StyleImportsConfig styleImportsConfig, StyleInteractionsState styleInteractionsState, Projection projection, AtmosphereState atmosphereState, RainState rainState, SnowState snowState, TerrainState terrainState, LightsState lightsState, TransitionOptions transitionOptions, StyleColorTheme styleColorTheme) {
        styleImportsConfig.getClass();
        styleInteractionsState.getClass();
        projection.getClass();
        atmosphereState.getClass();
        rainState.getClass();
        snowState.getClass();
        terrainState.getClass();
        lightsState.getClass();
        transitionOptions.getClass();
        styleColorTheme.getClass();
        this.styleImportsConfig = p0.n(styleImportsConfig);
        this.styleInteractionsState = p0.n(styleInteractionsState);
        this.projection = p0.n(projection);
        this.atmosphereState = p0.n(atmosphereState);
        this.snowState = p0.n(snowState);
        this.rainState = p0.n(rainState);
        this.terrainState = p0.n(terrainState);
        this.lightsState = p0.n(lightsState);
        this.styleTransition = p0.n(transitionOptions);
        this.styleColorTheme = p0.n(styleColorTheme);
    }

    @MapboxExperimental
    public static /* synthetic */ void getRainState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getSnowState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getStyleColorTheme$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AtmosphereState getAtmosphereState() {
        return (AtmosphereState) this.atmosphereState.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LightsState getLightsState() {
        return (LightsState) this.lightsState.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Projection getProjection() {
        return (Projection) this.projection.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RainState getRainState() {
        return (RainState) this.rainState.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SnowState getSnowState() {
        return (SnowState) this.snowState.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final StyleColorTheme getStyleColorTheme() {
        return (StyleColorTheme) this.styleColorTheme.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final StyleImportsConfig getStyleImportsConfig() {
        return (StyleImportsConfig) this.styleImportsConfig.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final StyleInteractionsState getStyleInteractionsState() {
        return (StyleInteractionsState) this.styleInteractionsState.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TransitionOptions getStyleTransition() {
        return (TransitionOptions) this.styleTransition.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TerrainState getTerrainState() {
        return (TerrainState) this.terrainState.getF182175a();
    }

    public final void setAtmosphereState(AtmosphereState atmosphereState) {
        atmosphereState.getClass();
        this.atmosphereState.setValue(atmosphereState);
    }

    public final void setLightsState(LightsState lightsState) {
        lightsState.getClass();
        this.lightsState.setValue(lightsState);
    }

    public final void setProjection(Projection projection) {
        projection.getClass();
        this.projection.setValue(projection);
    }

    public final void setRainState(RainState rainState) {
        rainState.getClass();
        this.rainState.setValue(rainState);
    }

    public final void setSnowState(SnowState snowState) {
        snowState.getClass();
        this.snowState.setValue(snowState);
    }

    public final void setStyleColorTheme(StyleColorTheme styleColorTheme) {
        styleColorTheme.getClass();
        this.styleColorTheme.setValue(styleColorTheme);
    }

    public final void setStyleImportsConfig(StyleImportsConfig styleImportsConfig) {
        styleImportsConfig.getClass();
        this.styleImportsConfig.setValue(styleImportsConfig);
    }

    public final void setStyleInteractionsState(StyleInteractionsState styleInteractionsState) {
        styleInteractionsState.getClass();
        this.styleInteractionsState.setValue(styleInteractionsState);
    }

    public final void setStyleTransition(TransitionOptions transitionOptions) {
        transitionOptions.getClass();
        this.styleTransition.setValue(transitionOptions);
    }

    public final void setTerrainState(TerrainState terrainState) {
        terrainState.getClass();
        this.terrainState.setValue(terrainState);
    }

    public /* synthetic */ StyleState(StyleImportsConfig styleImportsConfig, StyleInteractionsState styleInteractionsState, Projection projection, AtmosphereState atmosphereState, RainState rainState, SnowState snowState, TerrainState terrainState, LightsState lightsState, TransitionOptions transitionOptions, StyleColorTheme styleColorTheme, int i14, j jVar) {
        this(styleImportsConfig, styleInteractionsState, projection, atmosphereState, rainState, snowState, (i14 & 64) != 0 ? TerrainState.INITIAL : terrainState, (i14 & 128) != 0 ? LightsState.INITIAL : lightsState, transitionOptions, styleColorTheme);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StyleState() {
        StyleImportsConfig styleImportsConfig = new StyleImportsConfig(null, 1, 0 == true ? 1 : 0);
        StyleInteractionsState styleInteractionsState = new StyleInteractionsState();
        Projection projection = Projection.INITIAL;
        AtmosphereState atmosphereState = new AtmosphereState();
        RainState rainState = new RainState();
        SnowState snowState = new SnowState();
        TerrainState terrainState = TerrainState.INITIAL;
        LightsState lightsState = LightsState.INITIAL;
        TransitionOptions.Builder builder = new TransitionOptions.Builder();
        Unit unit = Unit.INSTANCE;
        TransitionOptions transitionOptionsBuild = builder.build();
        transitionOptionsBuild.getClass();
        this(styleImportsConfig, styleInteractionsState, projection, atmosphereState, rainState, snowState, terrainState, lightsState, transitionOptionsBuild, StyleColorTheme.STYLE_DEFAULT);
    }
}
