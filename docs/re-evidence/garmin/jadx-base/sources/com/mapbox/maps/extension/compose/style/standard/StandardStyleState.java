package com.mapbox.maps.extension.compose.style.standard;

import com.mapbox.maps.TransitionOptions;
import com.mapbox.maps.extension.compose.style.atmosphere.generated.AtmosphereState;
import com.mapbox.maps.extension.compose.style.lights.LightsState;
import com.mapbox.maps.extension.compose.style.precipitations.generated.RainState;
import com.mapbox.maps.extension.compose.style.precipitations.generated.SnowState;
import com.mapbox.maps.extension.compose.style.projection.generated.Projection;
import com.mapbox.maps.extension.compose.style.standard.generated.StandardStyleInteractionsState;
import com.mapbox.maps.extension.compose.style.terrain.generated.TerrainState;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p3.p0;
import p3.p1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001BU\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\t\b\u0016¢\u0006\u0004\b\u0014\u0010\u0016R+\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR+\u0010$\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/standard/StandardStyleState;", "Lcom/mapbox/maps/extension/compose/style/standard/BaseStandardStyleState;", "Lcom/mapbox/maps/extension/compose/style/standard/generated/StandardStyleInteractionsState;", "initialStyleInteractionsState", "Lcom/mapbox/maps/extension/compose/style/projection/generated/Projection;", "initialProjection", "Lcom/mapbox/maps/extension/compose/style/atmosphere/generated/AtmosphereState;", "initialAtmosphereState", "Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState;", "initialRainState", "Lcom/mapbox/maps/extension/compose/style/precipitations/generated/SnowState;", "initialSnowState", "Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState;", "initialTerrainState", "Lcom/mapbox/maps/extension/compose/style/lights/LightsState;", "initialLightsState", "Lcom/mapbox/maps/TransitionOptions;", "initialStyleTransition", "Lcom/mapbox/maps/extension/compose/style/standard/StandardStyleConfigurationState;", "initialConfigurationState", "<init>", "(Lcom/mapbox/maps/extension/compose/style/standard/generated/StandardStyleInteractionsState;Lcom/mapbox/maps/extension/compose/style/projection/generated/Projection;Lcom/mapbox/maps/extension/compose/style/atmosphere/generated/AtmosphereState;Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState;Lcom/mapbox/maps/extension/compose/style/precipitations/generated/SnowState;Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState;Lcom/mapbox/maps/extension/compose/style/lights/LightsState;Lcom/mapbox/maps/TransitionOptions;Lcom/mapbox/maps/extension/compose/style/standard/StandardStyleConfigurationState;)V", "()V", "<set-?>", "interactionsState$delegate", "Lp3/p1;", "getInteractionsState", "()Lcom/mapbox/maps/extension/compose/style/standard/generated/StandardStyleInteractionsState;", "setInteractionsState", "(Lcom/mapbox/maps/extension/compose/style/standard/generated/StandardStyleInteractionsState;)V", "interactionsState", "configurationsState$delegate", "getConfigurationsState", "()Lcom/mapbox/maps/extension/compose/style/standard/StandardStyleConfigurationState;", "setConfigurationsState", "(Lcom/mapbox/maps/extension/compose/style/standard/StandardStyleConfigurationState;)V", "configurationsState", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StandardStyleState extends BaseStandardStyleState {

    /* JADX INFO: renamed from: configurationsState$delegate, reason: from kotlin metadata */
    private final p1 configurationsState;

    /* JADX INFO: renamed from: interactionsState$delegate, reason: from kotlin metadata */
    private final p1 interactionsState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardStyleState(StandardStyleInteractionsState standardStyleInteractionsState, Projection projection, AtmosphereState atmosphereState, RainState rainState, SnowState snowState, TerrainState terrainState, LightsState lightsState, TransitionOptions transitionOptions, StandardStyleConfigurationState standardStyleConfigurationState) {
        super(projection, atmosphereState, rainState, snowState, terrainState, lightsState, transitionOptions);
        standardStyleInteractionsState.getClass();
        projection.getClass();
        atmosphereState.getClass();
        rainState.getClass();
        snowState.getClass();
        terrainState.getClass();
        lightsState.getClass();
        transitionOptions.getClass();
        standardStyleConfigurationState.getClass();
        this.interactionsState = p0.n(standardStyleInteractionsState);
        this.configurationsState = p0.n(standardStyleConfigurationState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final StandardStyleConfigurationState getConfigurationsState() {
        return (StandardStyleConfigurationState) this.configurationsState.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final StandardStyleInteractionsState getInteractionsState() {
        return (StandardStyleInteractionsState) this.interactionsState.getF182175a();
    }

    public final void setConfigurationsState(StandardStyleConfigurationState standardStyleConfigurationState) {
        standardStyleConfigurationState.getClass();
        this.configurationsState.setValue(standardStyleConfigurationState);
    }

    public final void setInteractionsState(StandardStyleInteractionsState standardStyleInteractionsState) {
        standardStyleInteractionsState.getClass();
        this.interactionsState.setValue(standardStyleInteractionsState);
    }

    public /* synthetic */ StandardStyleState(StandardStyleInteractionsState standardStyleInteractionsState, Projection projection, AtmosphereState atmosphereState, RainState rainState, SnowState snowState, TerrainState terrainState, LightsState lightsState, TransitionOptions transitionOptions, StandardStyleConfigurationState standardStyleConfigurationState, int i14, j jVar) {
        this(standardStyleInteractionsState, projection, atmosphereState, rainState, snowState, (i14 & 32) != 0 ? TerrainState.INITIAL : terrainState, (i14 & 64) != 0 ? LightsState.INITIAL : lightsState, transitionOptions, standardStyleConfigurationState);
    }

    public StandardStyleState() {
        StandardStyleInteractionsState standardStyleInteractionsState = new StandardStyleInteractionsState();
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
        this(standardStyleInteractionsState, projection, atmosphereState, rainState, snowState, terrainState, lightsState, transitionOptionsBuild, new StandardStyleConfigurationState());
    }
}
