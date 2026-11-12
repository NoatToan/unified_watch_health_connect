package com.mapbox.maps.extension.compose.style.layers.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.compose.style.ColorValue;
import com.mapbox.maps.extension.compose.style.DoubleValue;
import com.mapbox.maps.extension.compose.style.LongValue;
import com.mapbox.maps.extension.compose.style.PropertyTypesKt;
import com.mapbox.maps.extension.compose.style.StringValue;
import com.mapbox.maps.extension.compose.style.Transition;
import com.mapbox.maps.extension.compose.style.layers.Filter;
import com.mapbox.maps.extension.compose.style.layers.LayerInteractionsState;
import com.mapbox.maps.extension.compose.style.layers.internal.LayerNode;
import e23.p;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\bo\b\u0007\u0018\u00002\u00020\u0001B\u0089\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bB\t\b\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R1\u0010+\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00188F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b$\u0010%\u0012\u0004\b*\u0010\u001c\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020,8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b-\u0010%\u0012\u0004\b.\u0010\u001cR \u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040,8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b/\u0010%\u0012\u0004\b0\u0010\u001cR \u00101\u001a\b\u0012\u0004\u0012\u00020\u00020,8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b1\u0010%\u0012\u0004\b2\u0010\u001cR \u00103\u001a\b\u0012\u0004\u0012\u00020\u00070,8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b3\u0010%\u0012\u0004\b4\u0010\u001cR \u00105\u001a\b\u0012\u0004\u0012\u00020\t0,8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b5\u0010%\u0012\u0004\b6\u0010\u001cR \u00107\u001a\b\u0012\u0004\u0012\u00020\u000b0,8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b7\u0010%\u0012\u0004\b8\u0010\u001cR \u00109\u001a\b\u0012\u0004\u0012\u00020\t0,8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b9\u0010%\u0012\u0004\b:\u0010\u001cR \u0010;\u001a\b\u0012\u0004\u0012\u00020\t0,8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b;\u0010%\u0012\u0004\b<\u0010\u001cR \u0010=\u001a\b\u0012\u0004\u0012\u00020\t0,8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b=\u0010%\u0012\u0004\b>\u0010\u001cR \u0010?\u001a\b\u0012\u0004\u0012\u00020\u000b0,8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b?\u0010%\u0012\u0004\b@\u0010\u001cR\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00110,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010%R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00070,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010%R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00070,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010%R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010%R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00160,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010%R1\u0010M\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00028F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bJ\u0010\u001c\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I*\u0004\bK\u0010LR1\u0010T\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bR\u0010\u001c\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q*\u0004\bS\u0010LR1\u0010Y\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00028F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bW\u0010\u001c\u001a\u0004\bU\u0010G\"\u0004\bV\u0010I*\u0004\bX\u0010LR1\u0010`\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00078F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\b^\u0010\u001c\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]*\u0004\b_\u0010LR1\u0010g\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t8F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\be\u0010\u001c\u001a\u0004\ba\u0010b\"\u0004\bc\u0010d*\u0004\bf\u0010LR1\u0010n\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b8F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bl\u0010\u001c\u001a\u0004\bh\u0010i\"\u0004\bj\u0010k*\u0004\bm\u0010LR1\u0010s\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t8F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bq\u0010\u001c\u001a\u0004\bo\u0010b\"\u0004\bp\u0010d*\u0004\br\u0010LR1\u0010x\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t8F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bv\u0010\u001c\u001a\u0004\bt\u0010b\"\u0004\bu\u0010d*\u0004\bw\u0010LR1\u0010}\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t8F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\b{\u0010\u001c\u001a\u0004\by\u0010b\"\u0004\bz\u0010d*\u0004\b|\u0010LR4\u0010\u0082\u0001\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b8F@FX\u0087\u008e\u0002¢\u0006\u001a\u0012\u0005\b\u0080\u0001\u0010\u001c\u001a\u0004\b~\u0010i\"\u0004\b\u007f\u0010k*\u0005\b\u0081\u0001\u0010LR1\u0010\u0088\u0001\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001*\u0005\b\u0087\u0001\u0010LR/\u0010\u008c\u0001\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0089\u0001\u0010[\"\u0005\b\u008a\u0001\u0010]*\u0005\b\u008b\u0001\u0010LR/\u0010\u0090\u0001\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u008d\u0001\u0010[\"\u0005\b\u008e\u0001\u0010]*\u0005\b\u008f\u0001\u0010LR/\u0010\u0094\u0001\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0091\u0001\u0010G\"\u0005\b\u0092\u0001\u0010I*\u0005\b\u0093\u0001\u0010LR1\u0010\u009a\u0001\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00168F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001*\u0005\b\u0099\u0001\u0010L¨\u0006\u009b\u0001"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/layers/generated/RasterParticleLayerState;", "", "Lcom/mapbox/maps/extension/compose/style/StringValue;", "initialRasterParticleArrayBand", "Lcom/mapbox/maps/extension/compose/style/ColorValue;", "initialRasterParticleColor", "initialRasterParticleColorUseTheme", "Lcom/mapbox/maps/extension/compose/style/LongValue;", "initialRasterParticleCount", "Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "initialRasterParticleFadeOpacityFactor", "Lcom/mapbox/maps/extension/compose/style/Transition;", "initialRasterParticleFadeOpacityFactorTransition", "initialRasterParticleMaxSpeed", "initialRasterParticleResetRateFactor", "initialRasterParticleSpeedFactor", "initialRasterParticleSpeedFactorTransition", "Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "initialVisibility", "initialMinZoom", "initialMaxZoom", "initialSourceLayer", "Lcom/mapbox/maps/extension/compose/style/layers/Filter;", "initialFilter", "Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;", "initialInteractionsState", "<init>", "(Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/layers/Filter;Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;)V", "()V", "Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;", "layerNode", "", "UpdateProperties$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;Lp3/m;I)V", "UpdateProperties", "<set-?>", "interactionsState$delegate", "Lp3/p1;", "getInteractionsState", "()Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;", "setInteractionsState", "(Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;)V", "getInteractionsState$annotations", "interactionsState", "Lp3/p1;", "rasterParticleArrayBandState", "getRasterParticleArrayBandState$annotations", "rasterParticleColorState", "getRasterParticleColorState$annotations", "rasterParticleColorUseThemeState", "getRasterParticleColorUseThemeState$annotations", "rasterParticleCountState", "getRasterParticleCountState$annotations", "rasterParticleFadeOpacityFactorState", "getRasterParticleFadeOpacityFactorState$annotations", "rasterParticleFadeOpacityFactorTransitionState", "getRasterParticleFadeOpacityFactorTransitionState$annotations", "rasterParticleMaxSpeedState", "getRasterParticleMaxSpeedState$annotations", "rasterParticleResetRateFactorState", "getRasterParticleResetRateFactorState$annotations", "rasterParticleSpeedFactorState", "getRasterParticleSpeedFactorState$annotations", "rasterParticleSpeedFactorTransitionState", "getRasterParticleSpeedFactorTransitionState$annotations", "visibilityState", "minZoomState", "maxZoomState", "sourceLayerState", "filterState", "getRasterParticleArrayBand", "()Lcom/mapbox/maps/extension/compose/style/StringValue;", "setRasterParticleArrayBand", "(Lcom/mapbox/maps/extension/compose/style/StringValue;)V", "getRasterParticleArrayBand$annotations", "getRasterParticleArrayBand$delegate", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/RasterParticleLayerState;)Ljava/lang/Object;", "rasterParticleArrayBand", "getRasterParticleColor", "()Lcom/mapbox/maps/extension/compose/style/ColorValue;", "setRasterParticleColor", "(Lcom/mapbox/maps/extension/compose/style/ColorValue;)V", "getRasterParticleColor$annotations", "getRasterParticleColor$delegate", "rasterParticleColor", "getRasterParticleColorUseTheme", "setRasterParticleColorUseTheme", "getRasterParticleColorUseTheme$annotations", "getRasterParticleColorUseTheme$delegate", "rasterParticleColorUseTheme", "getRasterParticleCount", "()Lcom/mapbox/maps/extension/compose/style/LongValue;", "setRasterParticleCount", "(Lcom/mapbox/maps/extension/compose/style/LongValue;)V", "getRasterParticleCount$annotations", "getRasterParticleCount$delegate", "rasterParticleCount", "getRasterParticleFadeOpacityFactor", "()Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "setRasterParticleFadeOpacityFactor", "(Lcom/mapbox/maps/extension/compose/style/DoubleValue;)V", "getRasterParticleFadeOpacityFactor$annotations", "getRasterParticleFadeOpacityFactor$delegate", "rasterParticleFadeOpacityFactor", "getRasterParticleFadeOpacityFactorTransition", "()Lcom/mapbox/maps/extension/compose/style/Transition;", "setRasterParticleFadeOpacityFactorTransition", "(Lcom/mapbox/maps/extension/compose/style/Transition;)V", "getRasterParticleFadeOpacityFactorTransition$annotations", "getRasterParticleFadeOpacityFactorTransition$delegate", "rasterParticleFadeOpacityFactorTransition", "getRasterParticleMaxSpeed", "setRasterParticleMaxSpeed", "getRasterParticleMaxSpeed$annotations", "getRasterParticleMaxSpeed$delegate", "rasterParticleMaxSpeed", "getRasterParticleResetRateFactor", "setRasterParticleResetRateFactor", "getRasterParticleResetRateFactor$annotations", "getRasterParticleResetRateFactor$delegate", "rasterParticleResetRateFactor", "getRasterParticleSpeedFactor", "setRasterParticleSpeedFactor", "getRasterParticleSpeedFactor$annotations", "getRasterParticleSpeedFactor$delegate", "rasterParticleSpeedFactor", "getRasterParticleSpeedFactorTransition", "setRasterParticleSpeedFactorTransition", "getRasterParticleSpeedFactorTransition$annotations", "getRasterParticleSpeedFactorTransition$delegate", "rasterParticleSpeedFactorTransition", "getVisibility", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "setVisibility", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;)V", "getVisibility$delegate", "visibility", "getMinZoom", "setMinZoom", "getMinZoom$delegate", "minZoom", "getMaxZoom", "setMaxZoom", "getMaxZoom$delegate", "maxZoom", "getSourceLayer", "setSourceLayer", "getSourceLayer$delegate", "sourceLayer", "getFilter", "()Lcom/mapbox/maps/extension/compose/style/layers/Filter;", "setFilter", "(Lcom/mapbox/maps/extension/compose/style/layers/Filter;)V", "getFilter$delegate", "filter", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
public final class RasterParticleLayerState {
    private final p1<Filter> filterState;

    /* JADX INFO: renamed from: interactionsState$delegate, reason: from kotlin metadata */
    private final p1 interactionsState;
    private final p1<LongValue> maxZoomState;
    private final p1<LongValue> minZoomState;
    private final p1<StringValue> rasterParticleArrayBandState;
    private final p1<ColorValue> rasterParticleColorState;
    private final p1<StringValue> rasterParticleColorUseThemeState;
    private final p1<LongValue> rasterParticleCountState;
    private final p1<DoubleValue> rasterParticleFadeOpacityFactorState;
    private final p1<Transition> rasterParticleFadeOpacityFactorTransitionState;
    private final p1<DoubleValue> rasterParticleMaxSpeedState;
    private final p1<DoubleValue> rasterParticleResetRateFactorState;
    private final p1<DoubleValue> rasterParticleSpeedFactorState;
    private final p1<Transition> rasterParticleSpeedFactorTransitionState;
    private final p1<StringValue> sourceLayerState;
    private final p1<VisibilityValue> visibilityState;

    private RasterParticleLayerState(StringValue stringValue, ColorValue colorValue, StringValue stringValue2, LongValue longValue, DoubleValue doubleValue, Transition transition, DoubleValue doubleValue2, DoubleValue doubleValue3, DoubleValue doubleValue4, Transition transition2, VisibilityValue visibilityValue, LongValue longValue2, LongValue longValue3, StringValue stringValue3, Filter filter, LayerInteractionsState layerInteractionsState) {
        this.interactionsState = p0.n(layerInteractionsState);
        this.rasterParticleArrayBandState = p0.n(stringValue);
        this.rasterParticleColorState = p0.n(colorValue);
        this.rasterParticleColorUseThemeState = p0.n(stringValue2);
        this.rasterParticleCountState = p0.n(longValue);
        this.rasterParticleFadeOpacityFactorState = p0.n(doubleValue);
        this.rasterParticleFadeOpacityFactorTransitionState = p0.n(transition);
        this.rasterParticleMaxSpeedState = p0.n(doubleValue2);
        this.rasterParticleResetRateFactorState = p0.n(doubleValue3);
        this.rasterParticleSpeedFactorState = p0.n(doubleValue4);
        this.rasterParticleSpeedFactorTransitionState = p0.n(transition2);
        this.visibilityState = p0.n(visibilityValue);
        this.minZoomState = p0.n(longValue2);
        this.maxZoomState = p0.n(longValue3);
        this.sourceLayerState = p0.n(stringValue3);
        this.filterState = p0.n(filter);
    }

    @MapboxExperimental
    public static /* synthetic */ void getInteractionsState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleArrayBand$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getRasterParticleArrayBandState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleColor$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getRasterParticleColorState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleColorUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getRasterParticleColorUseThemeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleCount$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getRasterParticleCountState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleFadeOpacityFactor$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getRasterParticleFadeOpacityFactorState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleFadeOpacityFactorTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getRasterParticleFadeOpacityFactorTransitionState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleMaxSpeed$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getRasterParticleMaxSpeedState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleResetRateFactor$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getRasterParticleResetRateFactorState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleSpeedFactor$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getRasterParticleSpeedFactorState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleSpeedFactorTransition$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getRasterParticleSpeedFactorTransitionState$annotations() {
    }

    public final void UpdateProperties$extension_compose_release(LayerNode layerNode, m mVar, int i14) {
        int i15;
        layerNode.getClass();
        o0 o0VarE = mVar.E(415585985);
        if ((i14 & 14) == 0) {
            i15 = (o0VarE.B(layerNode) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 112) == 0) {
            i15 |= o0VarE.B(this) ? 32 : 16;
        }
        if ((i15 & 91) == 18 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = n.f135158a;
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterParticleArrayBandState, "raster-particle-array-band", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterParticleColorState, "raster-particle-color", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterParticleColorUseThemeState, "raster-particle-color-use-theme", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterParticleCountState, "raster-particle-count", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterParticleFadeOpacityFactorState, "raster-particle-fade-opacity-factor", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterParticleFadeOpacityFactorTransitionState, "raster-particle-fade-opacity-factor-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterParticleMaxSpeedState, "raster-particle-max-speed", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterParticleResetRateFactorState, "raster-particle-reset-rate-factor", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterParticleSpeedFactorState, "raster-particle-speed-factor", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.rasterParticleSpeedFactorTransitionState, "raster-particle-speed-factor-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.visibilityState, "visibility", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.minZoomState, "minzoom", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.maxZoomState, "maxzoom", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.sourceLayerState, "source-layer", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.filterState, "filter", o0VarE, 384);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new RasterParticleLayerState$UpdateProperties$1(this, layerNode, i14);
    }

    public final Filter getFilter() {
        return this.filterState.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LayerInteractionsState getInteractionsState() {
        return (LayerInteractionsState) this.interactionsState.getF182175a();
    }

    public final LongValue getMaxZoom() {
        return this.maxZoomState.getF182175a();
    }

    public final LongValue getMinZoom() {
        return this.minZoomState.getF182175a();
    }

    public final StringValue getRasterParticleArrayBand() {
        return this.rasterParticleArrayBandState.getF182175a();
    }

    public final ColorValue getRasterParticleColor() {
        return this.rasterParticleColorState.getF182175a();
    }

    public final StringValue getRasterParticleColorUseTheme() {
        return this.rasterParticleColorUseThemeState.getF182175a();
    }

    public final LongValue getRasterParticleCount() {
        return this.rasterParticleCountState.getF182175a();
    }

    public final DoubleValue getRasterParticleFadeOpacityFactor() {
        return this.rasterParticleFadeOpacityFactorState.getF182175a();
    }

    public final Transition getRasterParticleFadeOpacityFactorTransition() {
        return this.rasterParticleFadeOpacityFactorTransitionState.getF182175a();
    }

    public final DoubleValue getRasterParticleMaxSpeed() {
        return this.rasterParticleMaxSpeedState.getF182175a();
    }

    public final DoubleValue getRasterParticleResetRateFactor() {
        return this.rasterParticleResetRateFactorState.getF182175a();
    }

    public final DoubleValue getRasterParticleSpeedFactor() {
        return this.rasterParticleSpeedFactorState.getF182175a();
    }

    public final Transition getRasterParticleSpeedFactorTransition() {
        return this.rasterParticleSpeedFactorTransitionState.getF182175a();
    }

    public final StringValue getSourceLayer() {
        return this.sourceLayerState.getF182175a();
    }

    public final VisibilityValue getVisibility() {
        return this.visibilityState.getF182175a();
    }

    public final void setFilter(Filter filter) {
        filter.getClass();
        this.filterState.setValue(filter);
    }

    public final void setInteractionsState(LayerInteractionsState layerInteractionsState) {
        layerInteractionsState.getClass();
        this.interactionsState.setValue(layerInteractionsState);
    }

    public final void setMaxZoom(LongValue longValue) {
        longValue.getClass();
        this.maxZoomState.setValue(longValue);
    }

    public final void setMinZoom(LongValue longValue) {
        longValue.getClass();
        this.minZoomState.setValue(longValue);
    }

    public final void setRasterParticleArrayBand(StringValue stringValue) {
        stringValue.getClass();
        this.rasterParticleArrayBandState.setValue(stringValue);
    }

    public final void setRasterParticleColor(ColorValue colorValue) {
        colorValue.getClass();
        this.rasterParticleColorState.setValue(colorValue);
    }

    public final void setRasterParticleColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.rasterParticleColorUseThemeState.setValue(stringValue);
    }

    public final void setRasterParticleCount(LongValue longValue) {
        longValue.getClass();
        this.rasterParticleCountState.setValue(longValue);
    }

    public final void setRasterParticleFadeOpacityFactor(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.rasterParticleFadeOpacityFactorState.setValue(doubleValue);
    }

    public final void setRasterParticleFadeOpacityFactorTransition(Transition transition) {
        transition.getClass();
        this.rasterParticleFadeOpacityFactorTransitionState.setValue(transition);
    }

    public final void setRasterParticleMaxSpeed(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.rasterParticleMaxSpeedState.setValue(doubleValue);
    }

    public final void setRasterParticleResetRateFactor(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.rasterParticleResetRateFactorState.setValue(doubleValue);
    }

    public final void setRasterParticleSpeedFactor(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.rasterParticleSpeedFactorState.setValue(doubleValue);
    }

    public final void setRasterParticleSpeedFactorTransition(Transition transition) {
        transition.getClass();
        this.rasterParticleSpeedFactorTransitionState.setValue(transition);
    }

    public final void setSourceLayer(StringValue stringValue) {
        stringValue.getClass();
        this.sourceLayerState.setValue(stringValue);
    }

    public final void setVisibility(VisibilityValue visibilityValue) {
        visibilityValue.getClass();
        this.visibilityState.setValue(visibilityValue);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RasterParticleLayerState() {
        StringValue stringValue = StringValue.INITIAL;
        ColorValue colorValue = ColorValue.INITIAL;
        LongValue longValue = LongValue.INITIAL;
        DoubleValue doubleValue = DoubleValue.INITIAL;
        Transition transition = Transition.INITIAL;
        this(stringValue, colorValue, stringValue, longValue, doubleValue, transition, doubleValue, doubleValue, doubleValue, transition, VisibilityValue.INITIAL, longValue, longValue, stringValue, Filter.INITIAL, new LayerInteractionsState());
    }
}
