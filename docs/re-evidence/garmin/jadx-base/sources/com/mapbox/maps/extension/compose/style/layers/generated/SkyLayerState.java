package com.mapbox.maps.extension.compose.style.layers.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.compose.style.ColorValue;
import com.mapbox.maps.extension.compose.style.DoubleListValue;
import com.mapbox.maps.extension.compose.style.DoubleValue;
import com.mapbox.maps.extension.compose.style.LongValue;
import com.mapbox.maps.extension.compose.style.PropertyTypesKt;
import com.mapbox.maps.extension.compose.style.StringValue;
import com.mapbox.maps.extension.compose.style.Transition;
import com.mapbox.maps.extension.compose.style.layers.Filter;
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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bv\b\u0007\u0018\u00002\u00020\u0001B\u0099\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eB\t\b\u0016¢\u0006\u0004\b\u001d\u0010\u001fJ\u0017\u0010%\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040&8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b)\u0010(\u0012\u0004\b*\u0010\u001fR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010(R \u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040&8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b,\u0010(\u0012\u0004\b-\u0010\u001fR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010(R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010(R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010(R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00040&8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b1\u0010(\u0012\u0004\b2\u0010\u001fR\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\b0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010(R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\n0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010(R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\n0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010(R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00110&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010(R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00130&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010(R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u00150&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010(R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00170&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010(R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00170&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010(R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010(R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001b0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010(R+\u0010D\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A*\u0004\bB\u0010CR1\u0010K\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bI\u0010\u001f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H*\u0004\bJ\u0010CR+\u0010O\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bL\u0010?\"\u0004\bM\u0010A*\u0004\bN\u0010CR1\u0010T\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bR\u0010\u001f\u001a\u0004\bP\u0010F\"\u0004\bQ\u0010H*\u0004\bS\u0010CR+\u0010Z\u001a\u00020\b2\u0006\u0010=\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bU\u0010V\"\u0004\bW\u0010X*\u0004\bY\u0010CR+\u0010`\u001a\u00020\n2\u0006\u0010=\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^*\u0004\b_\u0010CR+\u0010d\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\ba\u0010?\"\u0004\bb\u0010A*\u0004\bc\u0010CR1\u0010i\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bg\u0010\u001f\u001a\u0004\be\u0010F\"\u0004\bf\u0010H*\u0004\bh\u0010CR+\u0010m\u001a\u00020\b2\u0006\u0010=\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bj\u0010V\"\u0004\bk\u0010X*\u0004\bl\u0010CR+\u0010q\u001a\u00020\n2\u0006\u0010=\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bn\u0010\\\"\u0004\bo\u0010^*\u0004\bp\u0010CR+\u0010u\u001a\u00020\n2\u0006\u0010=\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\br\u0010\\\"\u0004\bs\u0010^*\u0004\bt\u0010CR+\u0010{\u001a\u00020\u00112\u0006\u0010=\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bv\u0010w\"\u0004\bx\u0010y*\u0004\bz\u0010CR-\u0010\u0081\u0001\u001a\u00020\u00132\u0006\u0010=\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0013\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007f*\u0005\b\u0080\u0001\u0010CR1\u0010\u0087\u0001\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001*\u0005\b\u0086\u0001\u0010CR1\u0010\u008d\u0001\u001a\u00020\u00172\u0006\u0010=\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001*\u0005\b\u008c\u0001\u0010CR1\u0010\u0091\u0001\u001a\u00020\u00172\u0006\u0010=\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u008e\u0001\u0010\u0089\u0001\"\u0006\b\u008f\u0001\u0010\u008b\u0001*\u0005\b\u0090\u0001\u0010CR/\u0010\u0095\u0001\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0092\u0001\u0010F\"\u0005\b\u0093\u0001\u0010H*\u0005\b\u0094\u0001\u0010CR1\u0010\u009b\u0001\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020\u001b8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001*\u0005\b\u009a\u0001\u0010C¨\u0006\u009c\u0001"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/layers/generated/SkyLayerState;", "", "Lcom/mapbox/maps/extension/compose/style/ColorValue;", "initialSkyAtmosphereColor", "Lcom/mapbox/maps/extension/compose/style/StringValue;", "initialSkyAtmosphereColorUseTheme", "initialSkyAtmosphereHaloColor", "initialSkyAtmosphereHaloColorUseTheme", "Lcom/mapbox/maps/extension/compose/style/DoubleListValue;", "initialSkyAtmosphereSun", "Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "initialSkyAtmosphereSunIntensity", "initialSkyGradient", "initialSkyGradientUseTheme", "initialSkyGradientCenter", "initialSkyGradientRadius", "initialSkyOpacity", "Lcom/mapbox/maps/extension/compose/style/Transition;", "initialSkyOpacityTransition", "Lcom/mapbox/maps/extension/compose/style/layers/generated/SkyTypeValue;", "initialSkyType", "Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "initialVisibility", "Lcom/mapbox/maps/extension/compose/style/LongValue;", "initialMinZoom", "initialMaxZoom", "initialSourceLayer", "Lcom/mapbox/maps/extension/compose/style/layers/Filter;", "initialFilter", "<init>", "(Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/DoubleListValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/DoubleListValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/generated/SkyTypeValue;Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/layers/Filter;)V", "()V", "Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;", "layerNode", "", "UpdateProperties$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;Lp3/m;I)V", "UpdateProperties", "Lp3/p1;", "skyAtmosphereColorState", "Lp3/p1;", "skyAtmosphereColorUseThemeState", "getSkyAtmosphereColorUseThemeState$annotations", "skyAtmosphereHaloColorState", "skyAtmosphereHaloColorUseThemeState", "getSkyAtmosphereHaloColorUseThemeState$annotations", "skyAtmosphereSunState", "skyAtmosphereSunIntensityState", "skyGradientState", "skyGradientUseThemeState", "getSkyGradientUseThemeState$annotations", "skyGradientCenterState", "skyGradientRadiusState", "skyOpacityState", "skyOpacityTransitionState", "skyTypeState", "visibilityState", "minZoomState", "maxZoomState", "sourceLayerState", "filterState", "<set-?>", "getSkyAtmosphereColor", "()Lcom/mapbox/maps/extension/compose/style/ColorValue;", "setSkyAtmosphereColor", "(Lcom/mapbox/maps/extension/compose/style/ColorValue;)V", "getSkyAtmosphereColor$delegate", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/SkyLayerState;)Ljava/lang/Object;", "skyAtmosphereColor", "getSkyAtmosphereColorUseTheme", "()Lcom/mapbox/maps/extension/compose/style/StringValue;", "setSkyAtmosphereColorUseTheme", "(Lcom/mapbox/maps/extension/compose/style/StringValue;)V", "getSkyAtmosphereColorUseTheme$annotations", "getSkyAtmosphereColorUseTheme$delegate", "skyAtmosphereColorUseTheme", "getSkyAtmosphereHaloColor", "setSkyAtmosphereHaloColor", "getSkyAtmosphereHaloColor$delegate", "skyAtmosphereHaloColor", "getSkyAtmosphereHaloColorUseTheme", "setSkyAtmosphereHaloColorUseTheme", "getSkyAtmosphereHaloColorUseTheme$annotations", "getSkyAtmosphereHaloColorUseTheme$delegate", "skyAtmosphereHaloColorUseTheme", "getSkyAtmosphereSun", "()Lcom/mapbox/maps/extension/compose/style/DoubleListValue;", "setSkyAtmosphereSun", "(Lcom/mapbox/maps/extension/compose/style/DoubleListValue;)V", "getSkyAtmosphereSun$delegate", "skyAtmosphereSun", "getSkyAtmosphereSunIntensity", "()Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "setSkyAtmosphereSunIntensity", "(Lcom/mapbox/maps/extension/compose/style/DoubleValue;)V", "getSkyAtmosphereSunIntensity$delegate", "skyAtmosphereSunIntensity", "getSkyGradient", "setSkyGradient", "getSkyGradient$delegate", "skyGradient", "getSkyGradientUseTheme", "setSkyGradientUseTheme", "getSkyGradientUseTheme$annotations", "getSkyGradientUseTheme$delegate", "skyGradientUseTheme", "getSkyGradientCenter", "setSkyGradientCenter", "getSkyGradientCenter$delegate", "skyGradientCenter", "getSkyGradientRadius", "setSkyGradientRadius", "getSkyGradientRadius$delegate", "skyGradientRadius", "getSkyOpacity", "setSkyOpacity", "getSkyOpacity$delegate", "skyOpacity", "getSkyOpacityTransition", "()Lcom/mapbox/maps/extension/compose/style/Transition;", "setSkyOpacityTransition", "(Lcom/mapbox/maps/extension/compose/style/Transition;)V", "getSkyOpacityTransition$delegate", "skyOpacityTransition", "getSkyType", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/SkyTypeValue;", "setSkyType", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/SkyTypeValue;)V", "getSkyType$delegate", "skyType", "getVisibility", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "setVisibility", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;)V", "getVisibility$delegate", "visibility", "getMinZoom", "()Lcom/mapbox/maps/extension/compose/style/LongValue;", "setMinZoom", "(Lcom/mapbox/maps/extension/compose/style/LongValue;)V", "getMinZoom$delegate", "minZoom", "getMaxZoom", "setMaxZoom", "getMaxZoom$delegate", "maxZoom", "getSourceLayer", "setSourceLayer", "getSourceLayer$delegate", "sourceLayer", "getFilter", "()Lcom/mapbox/maps/extension/compose/style/layers/Filter;", "setFilter", "(Lcom/mapbox/maps/extension/compose/style/layers/Filter;)V", "getFilter$delegate", "filter", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SkyLayerState {
    private final p1<Filter> filterState;
    private final p1<LongValue> maxZoomState;
    private final p1<LongValue> minZoomState;
    private final p1<ColorValue> skyAtmosphereColorState;
    private final p1<StringValue> skyAtmosphereColorUseThemeState;
    private final p1<ColorValue> skyAtmosphereHaloColorState;
    private final p1<StringValue> skyAtmosphereHaloColorUseThemeState;
    private final p1<DoubleValue> skyAtmosphereSunIntensityState;
    private final p1<DoubleListValue> skyAtmosphereSunState;
    private final p1<DoubleListValue> skyGradientCenterState;
    private final p1<DoubleValue> skyGradientRadiusState;
    private final p1<ColorValue> skyGradientState;
    private final p1<StringValue> skyGradientUseThemeState;
    private final p1<DoubleValue> skyOpacityState;
    private final p1<Transition> skyOpacityTransitionState;
    private final p1<SkyTypeValue> skyTypeState;
    private final p1<StringValue> sourceLayerState;
    private final p1<VisibilityValue> visibilityState;

    private SkyLayerState(ColorValue colorValue, StringValue stringValue, ColorValue colorValue2, StringValue stringValue2, DoubleListValue doubleListValue, DoubleValue doubleValue, ColorValue colorValue3, StringValue stringValue3, DoubleListValue doubleListValue2, DoubleValue doubleValue2, DoubleValue doubleValue3, Transition transition, SkyTypeValue skyTypeValue, VisibilityValue visibilityValue, LongValue longValue, LongValue longValue2, StringValue stringValue4, Filter filter) {
        this.skyAtmosphereColorState = p0.n(colorValue);
        this.skyAtmosphereColorUseThemeState = p0.n(stringValue);
        this.skyAtmosphereHaloColorState = p0.n(colorValue2);
        this.skyAtmosphereHaloColorUseThemeState = p0.n(stringValue2);
        this.skyAtmosphereSunState = p0.n(doubleListValue);
        this.skyAtmosphereSunIntensityState = p0.n(doubleValue);
        this.skyGradientState = p0.n(colorValue3);
        this.skyGradientUseThemeState = p0.n(stringValue3);
        this.skyGradientCenterState = p0.n(doubleListValue2);
        this.skyGradientRadiusState = p0.n(doubleValue2);
        this.skyOpacityState = p0.n(doubleValue3);
        this.skyOpacityTransitionState = p0.n(transition);
        this.skyTypeState = p0.n(skyTypeValue);
        this.visibilityState = p0.n(visibilityValue);
        this.minZoomState = p0.n(longValue);
        this.maxZoomState = p0.n(longValue2);
        this.sourceLayerState = p0.n(stringValue4);
        this.filterState = p0.n(filter);
    }

    @MapboxExperimental
    public static /* synthetic */ void getSkyAtmosphereColorUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getSkyAtmosphereColorUseThemeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getSkyAtmosphereHaloColorUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getSkyAtmosphereHaloColorUseThemeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getSkyGradientUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getSkyGradientUseThemeState$annotations() {
    }

    public final void UpdateProperties$extension_compose_release(LayerNode layerNode, m mVar, int i14) {
        int i15;
        layerNode.getClass();
        o0 o0VarE = mVar.E(2140606563);
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
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.skyAtmosphereColorState, "sky-atmosphere-color", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.skyAtmosphereColorUseThemeState, "sky-atmosphere-color-use-theme", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.skyAtmosphereHaloColorState, "sky-atmosphere-halo-color", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.skyAtmosphereHaloColorUseThemeState, "sky-atmosphere-halo-color-use-theme", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.skyAtmosphereSunState, "sky-atmosphere-sun", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.skyAtmosphereSunIntensityState, "sky-atmosphere-sun-intensity", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.skyGradientState, "sky-gradient", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.skyGradientUseThemeState, "sky-gradient-use-theme", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.skyGradientCenterState, "sky-gradient-center", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.skyGradientRadiusState, "sky-gradient-radius", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.skyOpacityState, "sky-opacity", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.skyOpacityTransitionState, "sky-opacity-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.skyTypeState, "sky-type", o0VarE, 384);
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
        p2VarI0.f135219d = new SkyLayerState$UpdateProperties$1(this, layerNode, i14);
    }

    public final Filter getFilter() {
        return this.filterState.getF182175a();
    }

    public final LongValue getMaxZoom() {
        return this.maxZoomState.getF182175a();
    }

    public final LongValue getMinZoom() {
        return this.minZoomState.getF182175a();
    }

    public final ColorValue getSkyAtmosphereColor() {
        return this.skyAtmosphereColorState.getF182175a();
    }

    public final StringValue getSkyAtmosphereColorUseTheme() {
        return this.skyAtmosphereColorUseThemeState.getF182175a();
    }

    public final ColorValue getSkyAtmosphereHaloColor() {
        return this.skyAtmosphereHaloColorState.getF182175a();
    }

    public final StringValue getSkyAtmosphereHaloColorUseTheme() {
        return this.skyAtmosphereHaloColorUseThemeState.getF182175a();
    }

    public final DoubleListValue getSkyAtmosphereSun() {
        return this.skyAtmosphereSunState.getF182175a();
    }

    public final DoubleValue getSkyAtmosphereSunIntensity() {
        return this.skyAtmosphereSunIntensityState.getF182175a();
    }

    public final ColorValue getSkyGradient() {
        return this.skyGradientState.getF182175a();
    }

    public final DoubleListValue getSkyGradientCenter() {
        return this.skyGradientCenterState.getF182175a();
    }

    public final DoubleValue getSkyGradientRadius() {
        return this.skyGradientRadiusState.getF182175a();
    }

    public final StringValue getSkyGradientUseTheme() {
        return this.skyGradientUseThemeState.getF182175a();
    }

    public final DoubleValue getSkyOpacity() {
        return this.skyOpacityState.getF182175a();
    }

    public final Transition getSkyOpacityTransition() {
        return this.skyOpacityTransitionState.getF182175a();
    }

    public final SkyTypeValue getSkyType() {
        return this.skyTypeState.getF182175a();
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

    public final void setMaxZoom(LongValue longValue) {
        longValue.getClass();
        this.maxZoomState.setValue(longValue);
    }

    public final void setMinZoom(LongValue longValue) {
        longValue.getClass();
        this.minZoomState.setValue(longValue);
    }

    public final void setSkyAtmosphereColor(ColorValue colorValue) {
        colorValue.getClass();
        this.skyAtmosphereColorState.setValue(colorValue);
    }

    public final void setSkyAtmosphereColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.skyAtmosphereColorUseThemeState.setValue(stringValue);
    }

    public final void setSkyAtmosphereHaloColor(ColorValue colorValue) {
        colorValue.getClass();
        this.skyAtmosphereHaloColorState.setValue(colorValue);
    }

    public final void setSkyAtmosphereHaloColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.skyAtmosphereHaloColorUseThemeState.setValue(stringValue);
    }

    public final void setSkyAtmosphereSun(DoubleListValue doubleListValue) {
        doubleListValue.getClass();
        this.skyAtmosphereSunState.setValue(doubleListValue);
    }

    public final void setSkyAtmosphereSunIntensity(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.skyAtmosphereSunIntensityState.setValue(doubleValue);
    }

    public final void setSkyGradient(ColorValue colorValue) {
        colorValue.getClass();
        this.skyGradientState.setValue(colorValue);
    }

    public final void setSkyGradientCenter(DoubleListValue doubleListValue) {
        doubleListValue.getClass();
        this.skyGradientCenterState.setValue(doubleListValue);
    }

    public final void setSkyGradientRadius(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.skyGradientRadiusState.setValue(doubleValue);
    }

    public final void setSkyGradientUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.skyGradientUseThemeState.setValue(stringValue);
    }

    public final void setSkyOpacity(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.skyOpacityState.setValue(doubleValue);
    }

    public final void setSkyOpacityTransition(Transition transition) {
        transition.getClass();
        this.skyOpacityTransitionState.setValue(transition);
    }

    public final void setSkyType(SkyTypeValue skyTypeValue) {
        skyTypeValue.getClass();
        this.skyTypeState.setValue(skyTypeValue);
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
    public SkyLayerState() {
        ColorValue colorValue = ColorValue.INITIAL;
        StringValue stringValue = StringValue.INITIAL;
        DoubleListValue doubleListValue = DoubleListValue.INITIAL;
        DoubleValue doubleValue = DoubleValue.INITIAL;
        Transition transition = Transition.INITIAL;
        SkyTypeValue skyTypeValue = SkyTypeValue.INITIAL;
        VisibilityValue visibilityValue = VisibilityValue.INITIAL;
        LongValue longValue = LongValue.INITIAL;
        this(colorValue, stringValue, colorValue, stringValue, doubleListValue, doubleValue, colorValue, stringValue, doubleListValue, doubleValue, doubleValue, transition, skyTypeValue, visibilityValue, longValue, longValue, stringValue, Filter.INITIAL);
    }
}
