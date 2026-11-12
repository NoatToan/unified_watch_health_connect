package com.mapbox.maps.extension.compose.style.standard;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.TransitionOptions;
import com.mapbox.maps.extension.compose.style.atmosphere.generated.AtmosphereState;
import com.mapbox.maps.extension.compose.style.lights.LightsState;
import com.mapbox.maps.extension.compose.style.precipitations.generated.RainState;
import com.mapbox.maps.extension.compose.style.precipitations.generated.SnowState;
import com.mapbox.maps.extension.compose.style.projection.generated.Projection;
import com.mapbox.maps.extension.compose.style.terrain.generated.TerrainState;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p3.p0;
import p3.p1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\b\u0017\u0018\u00002\u00020\u0001BE\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R+\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR1\u0010'\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b \u0010\u0014\u0012\u0004\b%\u0010&\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R1\u0010.\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b(\u0010\u0014\u0012\u0004\b-\u0010&\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R+\u00104\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\u0014\u001a\u0004\b0\u00101\"\u0004\b2\u00103R+\u0010:\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u0014\u001a\u0004\b6\u00107\"\u0004\b8\u00109R+\u0010@\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010\u0014\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/standard/BaseStandardStyleState;", "", "Lcom/mapbox/maps/extension/compose/style/projection/generated/Projection;", "initialProjection", "Lcom/mapbox/maps/extension/compose/style/atmosphere/generated/AtmosphereState;", "initialAtmosphereState", "Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState;", "initialRainState", "Lcom/mapbox/maps/extension/compose/style/precipitations/generated/SnowState;", "initialSnowState", "Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState;", "initialTerrainState", "Lcom/mapbox/maps/extension/compose/style/lights/LightsState;", "initialLightsState", "Lcom/mapbox/maps/TransitionOptions;", "initialStyleTransition", "<init>", "(Lcom/mapbox/maps/extension/compose/style/projection/generated/Projection;Lcom/mapbox/maps/extension/compose/style/atmosphere/generated/AtmosphereState;Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState;Lcom/mapbox/maps/extension/compose/style/precipitations/generated/SnowState;Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState;Lcom/mapbox/maps/extension/compose/style/lights/LightsState;Lcom/mapbox/maps/TransitionOptions;)V", "<set-?>", "projection$delegate", "Lp3/p1;", "getProjection", "()Lcom/mapbox/maps/extension/compose/style/projection/generated/Projection;", "setProjection", "(Lcom/mapbox/maps/extension/compose/style/projection/generated/Projection;)V", "projection", "atmosphereState$delegate", "getAtmosphereState", "()Lcom/mapbox/maps/extension/compose/style/atmosphere/generated/AtmosphereState;", "setAtmosphereState", "(Lcom/mapbox/maps/extension/compose/style/atmosphere/generated/AtmosphereState;)V", "atmosphereState", "snowState$delegate", "getSnowState", "()Lcom/mapbox/maps/extension/compose/style/precipitations/generated/SnowState;", "setSnowState", "(Lcom/mapbox/maps/extension/compose/style/precipitations/generated/SnowState;)V", "getSnowState$annotations", "()V", "snowState", "rainState$delegate", "getRainState", "()Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState;", "setRainState", "(Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState;)V", "getRainState$annotations", "rainState", "terrainState$delegate", "getTerrainState", "()Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState;", "setTerrainState", "(Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState;)V", "terrainState", "lightsState$delegate", "getLightsState", "()Lcom/mapbox/maps/extension/compose/style/lights/LightsState;", "setLightsState", "(Lcom/mapbox/maps/extension/compose/style/lights/LightsState;)V", "lightsState", "styleTransition$delegate", "getStyleTransition", "()Lcom/mapbox/maps/TransitionOptions;", "setStyleTransition", "(Lcom/mapbox/maps/TransitionOptions;)V", "styleTransition", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class BaseStandardStyleState {

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

    /* JADX INFO: renamed from: styleTransition$delegate, reason: from kotlin metadata */
    private final p1 styleTransition;

    /* JADX INFO: renamed from: terrainState$delegate, reason: from kotlin metadata */
    private final p1 terrainState;

    public BaseStandardStyleState(Projection projection, AtmosphereState atmosphereState, RainState rainState, SnowState snowState, TerrainState terrainState, LightsState lightsState, TransitionOptions transitionOptions) {
        projection.getClass();
        atmosphereState.getClass();
        rainState.getClass();
        snowState.getClass();
        terrainState.getClass();
        lightsState.getClass();
        transitionOptions.getClass();
        this.projection = p0.n(projection);
        this.atmosphereState = p0.n(atmosphereState);
        this.snowState = p0.n(snowState);
        this.rainState = p0.n(rainState);
        this.terrainState = p0.n(terrainState);
        this.lightsState = p0.n(lightsState);
        this.styleTransition = p0.n(transitionOptions);
    }

    @MapboxExperimental
    public static /* synthetic */ void getRainState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getSnowState$annotations() {
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

    public final void setStyleTransition(TransitionOptions transitionOptions) {
        transitionOptions.getClass();
        this.styleTransition.setValue(transitionOptions);
    }

    public final void setTerrainState(TerrainState terrainState) {
        terrainState.getClass();
        this.terrainState.setValue(terrainState);
    }

    public /* synthetic */ BaseStandardStyleState(Projection projection, AtmosphereState atmosphereState, RainState rainState, SnowState snowState, TerrainState terrainState, LightsState lightsState, TransitionOptions transitionOptions, int i14, j jVar) {
        this(projection, atmosphereState, rainState, snowState, (i14 & 16) != 0 ? TerrainState.INITIAL : terrainState, (i14 & 32) != 0 ? LightsState.INITIAL : lightsState, transitionOptions);
    }
}
