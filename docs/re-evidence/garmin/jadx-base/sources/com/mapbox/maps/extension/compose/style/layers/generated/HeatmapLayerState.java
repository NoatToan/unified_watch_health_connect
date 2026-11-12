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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\bX\b\u0007\u0018\u00002\u00020\u0001B\u0081\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aB\t\b\u0016¢\u0006\u0004\b\u0019\u0010\u001bJ\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R1\u0010*\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00178F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b#\u0010$\u0012\u0004\b)\u0010\u001b\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010$R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040+8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b-\u0010$\u0012\u0004\b.\u0010\u001bR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010$R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\b0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010$R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00060+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010$R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\b0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010$R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010$R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\b0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010$R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00060+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010$R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u000f0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010$R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00110+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010$R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u00110+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010$R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010$R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00150+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010$R+\u0010A\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>*\u0004\b?\u0010@R1\u0010H\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bF\u0010\u001b\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E*\u0004\bG\u0010@R+\u0010N\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L*\u0004\bM\u0010@R+\u0010T\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R*\u0004\bS\u0010@R+\u0010X\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bU\u0010J\"\u0004\bV\u0010L*\u0004\bW\u0010@R+\u0010\\\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bY\u0010P\"\u0004\bZ\u0010R*\u0004\b[\u0010@R+\u0010`\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b]\u0010J\"\u0004\b^\u0010L*\u0004\b_\u0010@R+\u0010d\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\ba\u0010P\"\u0004\bb\u0010R*\u0004\bc\u0010@R+\u0010h\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\be\u0010J\"\u0004\bf\u0010L*\u0004\bg\u0010@R+\u0010n\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bi\u0010j\"\u0004\bk\u0010l*\u0004\bm\u0010@R+\u0010t\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bo\u0010p\"\u0004\bq\u0010r*\u0004\bs\u0010@R+\u0010x\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bu\u0010p\"\u0004\bv\u0010r*\u0004\bw\u0010@R+\u0010|\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\by\u0010C\"\u0004\bz\u0010E*\u0004\b{\u0010@R.\u0010\u0082\u0001\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0014\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001*\u0005\b\u0081\u0001\u0010@¨\u0006\u0083\u0001"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/layers/generated/HeatmapLayerState;", "", "Lcom/mapbox/maps/extension/compose/style/ColorValue;", "initialHeatmapColor", "Lcom/mapbox/maps/extension/compose/style/StringValue;", "initialHeatmapColorUseTheme", "Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "initialHeatmapIntensity", "Lcom/mapbox/maps/extension/compose/style/Transition;", "initialHeatmapIntensityTransition", "initialHeatmapOpacity", "initialHeatmapOpacityTransition", "initialHeatmapRadius", "initialHeatmapRadiusTransition", "initialHeatmapWeight", "Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "initialVisibility", "Lcom/mapbox/maps/extension/compose/style/LongValue;", "initialMinZoom", "initialMaxZoom", "initialSourceLayer", "Lcom/mapbox/maps/extension/compose/style/layers/Filter;", "initialFilter", "Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;", "initialInteractionsState", "<init>", "(Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/layers/Filter;Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;)V", "()V", "Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;", "layerNode", "", "UpdateProperties$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;Lp3/m;I)V", "UpdateProperties", "<set-?>", "interactionsState$delegate", "Lp3/p1;", "getInteractionsState", "()Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;", "setInteractionsState", "(Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;)V", "getInteractionsState$annotations", "interactionsState", "Lp3/p1;", "heatmapColorState", "heatmapColorUseThemeState", "getHeatmapColorUseThemeState$annotations", "heatmapIntensityState", "heatmapIntensityTransitionState", "heatmapOpacityState", "heatmapOpacityTransitionState", "heatmapRadiusState", "heatmapRadiusTransitionState", "heatmapWeightState", "visibilityState", "minZoomState", "maxZoomState", "sourceLayerState", "filterState", "getHeatmapColor", "()Lcom/mapbox/maps/extension/compose/style/ColorValue;", "setHeatmapColor", "(Lcom/mapbox/maps/extension/compose/style/ColorValue;)V", "getHeatmapColor$delegate", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/HeatmapLayerState;)Ljava/lang/Object;", "heatmapColor", "getHeatmapColorUseTheme", "()Lcom/mapbox/maps/extension/compose/style/StringValue;", "setHeatmapColorUseTheme", "(Lcom/mapbox/maps/extension/compose/style/StringValue;)V", "getHeatmapColorUseTheme$annotations", "getHeatmapColorUseTheme$delegate", "heatmapColorUseTheme", "getHeatmapIntensity", "()Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "setHeatmapIntensity", "(Lcom/mapbox/maps/extension/compose/style/DoubleValue;)V", "getHeatmapIntensity$delegate", "heatmapIntensity", "getHeatmapIntensityTransition", "()Lcom/mapbox/maps/extension/compose/style/Transition;", "setHeatmapIntensityTransition", "(Lcom/mapbox/maps/extension/compose/style/Transition;)V", "getHeatmapIntensityTransition$delegate", "heatmapIntensityTransition", "getHeatmapOpacity", "setHeatmapOpacity", "getHeatmapOpacity$delegate", "heatmapOpacity", "getHeatmapOpacityTransition", "setHeatmapOpacityTransition", "getHeatmapOpacityTransition$delegate", "heatmapOpacityTransition", "getHeatmapRadius", "setHeatmapRadius", "getHeatmapRadius$delegate", "heatmapRadius", "getHeatmapRadiusTransition", "setHeatmapRadiusTransition", "getHeatmapRadiusTransition$delegate", "heatmapRadiusTransition", "getHeatmapWeight", "setHeatmapWeight", "getHeatmapWeight$delegate", "heatmapWeight", "getVisibility", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "setVisibility", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;)V", "getVisibility$delegate", "visibility", "getMinZoom", "()Lcom/mapbox/maps/extension/compose/style/LongValue;", "setMinZoom", "(Lcom/mapbox/maps/extension/compose/style/LongValue;)V", "getMinZoom$delegate", "minZoom", "getMaxZoom", "setMaxZoom", "getMaxZoom$delegate", "maxZoom", "getSourceLayer", "setSourceLayer", "getSourceLayer$delegate", "sourceLayer", "getFilter", "()Lcom/mapbox/maps/extension/compose/style/layers/Filter;", "setFilter", "(Lcom/mapbox/maps/extension/compose/style/layers/Filter;)V", "getFilter$delegate", "filter", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class HeatmapLayerState {
    private final p1<Filter> filterState;
    private final p1<ColorValue> heatmapColorState;
    private final p1<StringValue> heatmapColorUseThemeState;
    private final p1<DoubleValue> heatmapIntensityState;
    private final p1<Transition> heatmapIntensityTransitionState;
    private final p1<DoubleValue> heatmapOpacityState;
    private final p1<Transition> heatmapOpacityTransitionState;
    private final p1<DoubleValue> heatmapRadiusState;
    private final p1<Transition> heatmapRadiusTransitionState;
    private final p1<DoubleValue> heatmapWeightState;

    /* JADX INFO: renamed from: interactionsState$delegate, reason: from kotlin metadata */
    private final p1 interactionsState;
    private final p1<LongValue> maxZoomState;
    private final p1<LongValue> minZoomState;
    private final p1<StringValue> sourceLayerState;
    private final p1<VisibilityValue> visibilityState;

    private HeatmapLayerState(ColorValue colorValue, StringValue stringValue, DoubleValue doubleValue, Transition transition, DoubleValue doubleValue2, Transition transition2, DoubleValue doubleValue3, Transition transition3, DoubleValue doubleValue4, VisibilityValue visibilityValue, LongValue longValue, LongValue longValue2, StringValue stringValue2, Filter filter, LayerInteractionsState layerInteractionsState) {
        this.interactionsState = p0.n(layerInteractionsState);
        this.heatmapColorState = p0.n(colorValue);
        this.heatmapColorUseThemeState = p0.n(stringValue);
        this.heatmapIntensityState = p0.n(doubleValue);
        this.heatmapIntensityTransitionState = p0.n(transition);
        this.heatmapOpacityState = p0.n(doubleValue2);
        this.heatmapOpacityTransitionState = p0.n(transition2);
        this.heatmapRadiusState = p0.n(doubleValue3);
        this.heatmapRadiusTransitionState = p0.n(transition3);
        this.heatmapWeightState = p0.n(doubleValue4);
        this.visibilityState = p0.n(visibilityValue);
        this.minZoomState = p0.n(longValue);
        this.maxZoomState = p0.n(longValue2);
        this.sourceLayerState = p0.n(stringValue2);
        this.filterState = p0.n(filter);
    }

    @MapboxExperimental
    public static /* synthetic */ void getHeatmapColorUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getHeatmapColorUseThemeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getInteractionsState$annotations() {
    }

    public final void UpdateProperties$extension_compose_release(LayerNode layerNode, m mVar, int i14) {
        int i15;
        layerNode.getClass();
        o0 o0VarE = mVar.E(1923138189);
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
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.heatmapColorState, "heatmap-color", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.heatmapColorUseThemeState, "heatmap-color-use-theme", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.heatmapIntensityState, "heatmap-intensity", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.heatmapIntensityTransitionState, "heatmap-intensity-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.heatmapOpacityState, "heatmap-opacity", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.heatmapOpacityTransitionState, "heatmap-opacity-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.heatmapRadiusState, "heatmap-radius", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.heatmapRadiusTransitionState, "heatmap-radius-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.heatmapWeightState, "heatmap-weight", o0VarE, 384);
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
        p2VarI0.f135219d = new HeatmapLayerState$UpdateProperties$1(this, layerNode, i14);
    }

    public final Filter getFilter() {
        return this.filterState.getF182175a();
    }

    public final ColorValue getHeatmapColor() {
        return this.heatmapColorState.getF182175a();
    }

    public final StringValue getHeatmapColorUseTheme() {
        return this.heatmapColorUseThemeState.getF182175a();
    }

    public final DoubleValue getHeatmapIntensity() {
        return this.heatmapIntensityState.getF182175a();
    }

    public final Transition getHeatmapIntensityTransition() {
        return this.heatmapIntensityTransitionState.getF182175a();
    }

    public final DoubleValue getHeatmapOpacity() {
        return this.heatmapOpacityState.getF182175a();
    }

    public final Transition getHeatmapOpacityTransition() {
        return this.heatmapOpacityTransitionState.getF182175a();
    }

    public final DoubleValue getHeatmapRadius() {
        return this.heatmapRadiusState.getF182175a();
    }

    public final Transition getHeatmapRadiusTransition() {
        return this.heatmapRadiusTransitionState.getF182175a();
    }

    public final DoubleValue getHeatmapWeight() {
        return this.heatmapWeightState.getF182175a();
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

    public final void setHeatmapColor(ColorValue colorValue) {
        colorValue.getClass();
        this.heatmapColorState.setValue(colorValue);
    }

    public final void setHeatmapColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.heatmapColorUseThemeState.setValue(stringValue);
    }

    public final void setHeatmapIntensity(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.heatmapIntensityState.setValue(doubleValue);
    }

    public final void setHeatmapIntensityTransition(Transition transition) {
        transition.getClass();
        this.heatmapIntensityTransitionState.setValue(transition);
    }

    public final void setHeatmapOpacity(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.heatmapOpacityState.setValue(doubleValue);
    }

    public final void setHeatmapOpacityTransition(Transition transition) {
        transition.getClass();
        this.heatmapOpacityTransitionState.setValue(transition);
    }

    public final void setHeatmapRadius(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.heatmapRadiusState.setValue(doubleValue);
    }

    public final void setHeatmapRadiusTransition(Transition transition) {
        transition.getClass();
        this.heatmapRadiusTransitionState.setValue(transition);
    }

    public final void setHeatmapWeight(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.heatmapWeightState.setValue(doubleValue);
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

    public final void setSourceLayer(StringValue stringValue) {
        stringValue.getClass();
        this.sourceLayerState.setValue(stringValue);
    }

    public final void setVisibility(VisibilityValue visibilityValue) {
        visibilityValue.getClass();
        this.visibilityState.setValue(visibilityValue);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HeatmapLayerState() {
        ColorValue colorValue = ColorValue.INITIAL;
        StringValue stringValue = StringValue.INITIAL;
        DoubleValue doubleValue = DoubleValue.INITIAL;
        Transition transition = Transition.INITIAL;
        VisibilityValue visibilityValue = VisibilityValue.INITIAL;
        LongValue longValue = LongValue.INITIAL;
        this(colorValue, stringValue, doubleValue, transition, doubleValue, transition, doubleValue, transition, doubleValue, visibilityValue, longValue, longValue, stringValue, Filter.INITIAL, new LayerInteractionsState());
    }
}
