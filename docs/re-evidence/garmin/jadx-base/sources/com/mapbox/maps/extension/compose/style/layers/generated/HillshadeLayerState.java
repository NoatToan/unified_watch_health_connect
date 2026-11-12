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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b|\b\u0007\u0018\u00002\u00020\u0001B±\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!B\t\b\u0016¢\u0006\u0004\b \u0010\"J\u0017\u0010(\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b&\u0010'R1\u00101\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u001e8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b*\u0010+\u0012\u0004\b0\u0010\"\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010+R \u00104\u001a\b\u0012\u0004\u0012\u00020\u0004028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b4\u0010+\u0012\u0004\b5\u0010\"R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0006028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010+R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\b028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010+R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0006028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010+R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\b028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010+R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0006028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010+R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010+R \u0010<\u001a\b\u0012\u0004\u0012\u00020\u0004028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b<\u0010+\u0012\u0004\b=\u0010\"R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0006028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010+R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u0010028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010+R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\b028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010+R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010+R \u0010B\u001a\b\u0012\u0004\u0012\u00020\u0004028\u0002X\u0083\u0004¢\u0006\f\n\u0004\bB\u0010+\u0012\u0004\bC\u0010\"R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u0006028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010+R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u0016028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010+R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u0018028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010+R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u0018028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010+R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u0004028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010+R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001c028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010+R+\u0010P\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M*\u0004\bN\u0010OR1\u0010W\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bU\u0010\"\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T*\u0004\bV\u0010OR+\u0010]\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[*\u0004\b\\\u0010OR+\u0010c\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b^\u0010_\"\u0004\b`\u0010a*\u0004\bb\u0010OR+\u0010g\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bd\u0010Y\"\u0004\be\u0010[*\u0004\bf\u0010OR+\u0010k\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bh\u0010_\"\u0004\bi\u0010a*\u0004\bj\u0010OR+\u0010o\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bl\u0010Y\"\u0004\bm\u0010[*\u0004\bn\u0010OR+\u0010s\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bp\u0010K\"\u0004\bq\u0010M*\u0004\br\u0010OR1\u0010x\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bv\u0010\"\u001a\u0004\bt\u0010R\"\u0004\bu\u0010T*\u0004\bw\u0010OR+\u0010|\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\by\u0010Y\"\u0004\bz\u0010[*\u0004\b{\u0010OR.\u0010\u0082\u0001\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0014\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001*\u0005\b\u0081\u0001\u0010OR/\u0010\u0086\u0001\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0083\u0001\u0010_\"\u0005\b\u0084\u0001\u0010a*\u0005\b\u0085\u0001\u0010OR/\u0010\u008a\u0001\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0087\u0001\u0010K\"\u0005\b\u0088\u0001\u0010M*\u0005\b\u0089\u0001\u0010OR6\u0010\u008f\u0001\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u001c\u0012\u0005\b\u008d\u0001\u0010\"\u001a\u0005\b\u008b\u0001\u0010R\"\u0005\b\u008c\u0001\u0010T*\u0005\b\u008e\u0001\u0010OR/\u0010\u0093\u0001\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0090\u0001\u0010Y\"\u0005\b\u0091\u0001\u0010[*\u0005\b\u0092\u0001\u0010OR1\u0010\u0099\u0001\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00168F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001*\u0005\b\u0098\u0001\u0010OR1\u0010\u009f\u0001\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00188F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001*\u0005\b\u009e\u0001\u0010OR1\u0010£\u0001\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00188F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b \u0001\u0010\u009b\u0001\"\u0006\b¡\u0001\u0010\u009d\u0001*\u0005\b¢\u0001\u0010OR/\u0010§\u0001\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b¤\u0001\u0010R\"\u0005\b¥\u0001\u0010T*\u0005\b¦\u0001\u0010OR1\u0010\u00ad\u0001\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001*\u0005\b¬\u0001\u0010O¨\u0006®\u0001"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/layers/generated/HillshadeLayerState;", "", "Lcom/mapbox/maps/extension/compose/style/ColorValue;", "initialHillshadeAccentColor", "Lcom/mapbox/maps/extension/compose/style/StringValue;", "initialHillshadeAccentColorUseTheme", "Lcom/mapbox/maps/extension/compose/style/Transition;", "initialHillshadeAccentColorTransition", "Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "initialHillshadeEmissiveStrength", "initialHillshadeEmissiveStrengthTransition", "initialHillshadeExaggeration", "initialHillshadeExaggerationTransition", "initialHillshadeHighlightColor", "initialHillshadeHighlightColorUseTheme", "initialHillshadeHighlightColorTransition", "Lcom/mapbox/maps/extension/compose/style/layers/generated/HillshadeIlluminationAnchorValue;", "initialHillshadeIlluminationAnchor", "initialHillshadeIlluminationDirection", "initialHillshadeShadowColor", "initialHillshadeShadowColorUseTheme", "initialHillshadeShadowColorTransition", "Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "initialVisibility", "Lcom/mapbox/maps/extension/compose/style/LongValue;", "initialMinZoom", "initialMaxZoom", "initialSourceLayer", "Lcom/mapbox/maps/extension/compose/style/layers/Filter;", "initialFilter", "Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;", "initialInteractionsState", "<init>", "(Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/generated/HillshadeIlluminationAnchorValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/layers/Filter;Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;)V", "()V", "Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;", "layerNode", "", "UpdateProperties$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;Lp3/m;I)V", "UpdateProperties", "<set-?>", "interactionsState$delegate", "Lp3/p1;", "getInteractionsState", "()Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;", "setInteractionsState", "(Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;)V", "getInteractionsState$annotations", "interactionsState", "Lp3/p1;", "hillshadeAccentColorState", "hillshadeAccentColorUseThemeState", "getHillshadeAccentColorUseThemeState$annotations", "hillshadeAccentColorTransitionState", "hillshadeEmissiveStrengthState", "hillshadeEmissiveStrengthTransitionState", "hillshadeExaggerationState", "hillshadeExaggerationTransitionState", "hillshadeHighlightColorState", "hillshadeHighlightColorUseThemeState", "getHillshadeHighlightColorUseThemeState$annotations", "hillshadeHighlightColorTransitionState", "hillshadeIlluminationAnchorState", "hillshadeIlluminationDirectionState", "hillshadeShadowColorState", "hillshadeShadowColorUseThemeState", "getHillshadeShadowColorUseThemeState$annotations", "hillshadeShadowColorTransitionState", "visibilityState", "minZoomState", "maxZoomState", "sourceLayerState", "filterState", "getHillshadeAccentColor", "()Lcom/mapbox/maps/extension/compose/style/ColorValue;", "setHillshadeAccentColor", "(Lcom/mapbox/maps/extension/compose/style/ColorValue;)V", "getHillshadeAccentColor$delegate", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/HillshadeLayerState;)Ljava/lang/Object;", "hillshadeAccentColor", "getHillshadeAccentColorUseTheme", "()Lcom/mapbox/maps/extension/compose/style/StringValue;", "setHillshadeAccentColorUseTheme", "(Lcom/mapbox/maps/extension/compose/style/StringValue;)V", "getHillshadeAccentColorUseTheme$annotations", "getHillshadeAccentColorUseTheme$delegate", "hillshadeAccentColorUseTheme", "getHillshadeAccentColorTransition", "()Lcom/mapbox/maps/extension/compose/style/Transition;", "setHillshadeAccentColorTransition", "(Lcom/mapbox/maps/extension/compose/style/Transition;)V", "getHillshadeAccentColorTransition$delegate", "hillshadeAccentColorTransition", "getHillshadeEmissiveStrength", "()Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "setHillshadeEmissiveStrength", "(Lcom/mapbox/maps/extension/compose/style/DoubleValue;)V", "getHillshadeEmissiveStrength$delegate", "hillshadeEmissiveStrength", "getHillshadeEmissiveStrengthTransition", "setHillshadeEmissiveStrengthTransition", "getHillshadeEmissiveStrengthTransition$delegate", "hillshadeEmissiveStrengthTransition", "getHillshadeExaggeration", "setHillshadeExaggeration", "getHillshadeExaggeration$delegate", "hillshadeExaggeration", "getHillshadeExaggerationTransition", "setHillshadeExaggerationTransition", "getHillshadeExaggerationTransition$delegate", "hillshadeExaggerationTransition", "getHillshadeHighlightColor", "setHillshadeHighlightColor", "getHillshadeHighlightColor$delegate", "hillshadeHighlightColor", "getHillshadeHighlightColorUseTheme", "setHillshadeHighlightColorUseTheme", "getHillshadeHighlightColorUseTheme$annotations", "getHillshadeHighlightColorUseTheme$delegate", "hillshadeHighlightColorUseTheme", "getHillshadeHighlightColorTransition", "setHillshadeHighlightColorTransition", "getHillshadeHighlightColorTransition$delegate", "hillshadeHighlightColorTransition", "getHillshadeIlluminationAnchor", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/HillshadeIlluminationAnchorValue;", "setHillshadeIlluminationAnchor", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/HillshadeIlluminationAnchorValue;)V", "getHillshadeIlluminationAnchor$delegate", "hillshadeIlluminationAnchor", "getHillshadeIlluminationDirection", "setHillshadeIlluminationDirection", "getHillshadeIlluminationDirection$delegate", "hillshadeIlluminationDirection", "getHillshadeShadowColor", "setHillshadeShadowColor", "getHillshadeShadowColor$delegate", "hillshadeShadowColor", "getHillshadeShadowColorUseTheme", "setHillshadeShadowColorUseTheme", "getHillshadeShadowColorUseTheme$annotations", "getHillshadeShadowColorUseTheme$delegate", "hillshadeShadowColorUseTheme", "getHillshadeShadowColorTransition", "setHillshadeShadowColorTransition", "getHillshadeShadowColorTransition$delegate", "hillshadeShadowColorTransition", "getVisibility", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "setVisibility", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;)V", "getVisibility$delegate", "visibility", "getMinZoom", "()Lcom/mapbox/maps/extension/compose/style/LongValue;", "setMinZoom", "(Lcom/mapbox/maps/extension/compose/style/LongValue;)V", "getMinZoom$delegate", "minZoom", "getMaxZoom", "setMaxZoom", "getMaxZoom$delegate", "maxZoom", "getSourceLayer", "setSourceLayer", "getSourceLayer$delegate", "sourceLayer", "getFilter", "()Lcom/mapbox/maps/extension/compose/style/layers/Filter;", "setFilter", "(Lcom/mapbox/maps/extension/compose/style/layers/Filter;)V", "getFilter$delegate", "filter", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class HillshadeLayerState {
    private final p1<Filter> filterState;
    private final p1<ColorValue> hillshadeAccentColorState;
    private final p1<Transition> hillshadeAccentColorTransitionState;
    private final p1<StringValue> hillshadeAccentColorUseThemeState;
    private final p1<DoubleValue> hillshadeEmissiveStrengthState;
    private final p1<Transition> hillshadeEmissiveStrengthTransitionState;
    private final p1<DoubleValue> hillshadeExaggerationState;
    private final p1<Transition> hillshadeExaggerationTransitionState;
    private final p1<ColorValue> hillshadeHighlightColorState;
    private final p1<Transition> hillshadeHighlightColorTransitionState;
    private final p1<StringValue> hillshadeHighlightColorUseThemeState;
    private final p1<HillshadeIlluminationAnchorValue> hillshadeIlluminationAnchorState;
    private final p1<DoubleValue> hillshadeIlluminationDirectionState;
    private final p1<ColorValue> hillshadeShadowColorState;
    private final p1<Transition> hillshadeShadowColorTransitionState;
    private final p1<StringValue> hillshadeShadowColorUseThemeState;

    /* JADX INFO: renamed from: interactionsState$delegate, reason: from kotlin metadata */
    private final p1 interactionsState;
    private final p1<LongValue> maxZoomState;
    private final p1<LongValue> minZoomState;
    private final p1<StringValue> sourceLayerState;
    private final p1<VisibilityValue> visibilityState;

    private HillshadeLayerState(ColorValue colorValue, StringValue stringValue, Transition transition, DoubleValue doubleValue, Transition transition2, DoubleValue doubleValue2, Transition transition3, ColorValue colorValue2, StringValue stringValue2, Transition transition4, HillshadeIlluminationAnchorValue hillshadeIlluminationAnchorValue, DoubleValue doubleValue3, ColorValue colorValue3, StringValue stringValue3, Transition transition5, VisibilityValue visibilityValue, LongValue longValue, LongValue longValue2, StringValue stringValue4, Filter filter, LayerInteractionsState layerInteractionsState) {
        this.interactionsState = p0.n(layerInteractionsState);
        this.hillshadeAccentColorState = p0.n(colorValue);
        this.hillshadeAccentColorUseThemeState = p0.n(stringValue);
        this.hillshadeAccentColorTransitionState = p0.n(transition);
        this.hillshadeEmissiveStrengthState = p0.n(doubleValue);
        this.hillshadeEmissiveStrengthTransitionState = p0.n(transition2);
        this.hillshadeExaggerationState = p0.n(doubleValue2);
        this.hillshadeExaggerationTransitionState = p0.n(transition3);
        this.hillshadeHighlightColorState = p0.n(colorValue2);
        this.hillshadeHighlightColorUseThemeState = p0.n(stringValue2);
        this.hillshadeHighlightColorTransitionState = p0.n(transition4);
        this.hillshadeIlluminationAnchorState = p0.n(hillshadeIlluminationAnchorValue);
        this.hillshadeIlluminationDirectionState = p0.n(doubleValue3);
        this.hillshadeShadowColorState = p0.n(colorValue3);
        this.hillshadeShadowColorUseThemeState = p0.n(stringValue3);
        this.hillshadeShadowColorTransitionState = p0.n(transition5);
        this.visibilityState = p0.n(visibilityValue);
        this.minZoomState = p0.n(longValue);
        this.maxZoomState = p0.n(longValue2);
        this.sourceLayerState = p0.n(stringValue4);
        this.filterState = p0.n(filter);
    }

    @MapboxExperimental
    public static /* synthetic */ void getHillshadeAccentColorUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getHillshadeAccentColorUseThemeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getHillshadeHighlightColorUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getHillshadeHighlightColorUseThemeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getHillshadeShadowColorUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getHillshadeShadowColorUseThemeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getInteractionsState$annotations() {
    }

    public final void UpdateProperties$extension_compose_release(LayerNode layerNode, m mVar, int i14) {
        int i15;
        layerNode.getClass();
        o0 o0VarE = mVar.E(713140429);
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
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.hillshadeAccentColorState, "hillshade-accent-color", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.hillshadeAccentColorUseThemeState, "hillshade-accent-color-use-theme", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.hillshadeAccentColorTransitionState, "hillshade-accent-color-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.hillshadeEmissiveStrengthState, "hillshade-emissive-strength", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.hillshadeEmissiveStrengthTransitionState, "hillshade-emissive-strength-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.hillshadeExaggerationState, "hillshade-exaggeration", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.hillshadeExaggerationTransitionState, "hillshade-exaggeration-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.hillshadeHighlightColorState, "hillshade-highlight-color", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.hillshadeHighlightColorUseThemeState, "hillshade-highlight-color-use-theme", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.hillshadeHighlightColorTransitionState, "hillshade-highlight-color-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.hillshadeIlluminationAnchorState, "hillshade-illumination-anchor", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.hillshadeIlluminationDirectionState, "hillshade-illumination-direction", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.hillshadeShadowColorState, "hillshade-shadow-color", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.hillshadeShadowColorUseThemeState, "hillshade-shadow-color-use-theme", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.hillshadeShadowColorTransitionState, "hillshade-shadow-color-transition", o0VarE, 384);
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
        p2VarI0.f135219d = new HillshadeLayerState$UpdateProperties$1(this, layerNode, i14);
    }

    public final Filter getFilter() {
        return this.filterState.getF182175a();
    }

    public final ColorValue getHillshadeAccentColor() {
        return this.hillshadeAccentColorState.getF182175a();
    }

    public final Transition getHillshadeAccentColorTransition() {
        return this.hillshadeAccentColorTransitionState.getF182175a();
    }

    public final StringValue getHillshadeAccentColorUseTheme() {
        return this.hillshadeAccentColorUseThemeState.getF182175a();
    }

    public final DoubleValue getHillshadeEmissiveStrength() {
        return this.hillshadeEmissiveStrengthState.getF182175a();
    }

    public final Transition getHillshadeEmissiveStrengthTransition() {
        return this.hillshadeEmissiveStrengthTransitionState.getF182175a();
    }

    public final DoubleValue getHillshadeExaggeration() {
        return this.hillshadeExaggerationState.getF182175a();
    }

    public final Transition getHillshadeExaggerationTransition() {
        return this.hillshadeExaggerationTransitionState.getF182175a();
    }

    public final ColorValue getHillshadeHighlightColor() {
        return this.hillshadeHighlightColorState.getF182175a();
    }

    public final Transition getHillshadeHighlightColorTransition() {
        return this.hillshadeHighlightColorTransitionState.getF182175a();
    }

    public final StringValue getHillshadeHighlightColorUseTheme() {
        return this.hillshadeHighlightColorUseThemeState.getF182175a();
    }

    public final HillshadeIlluminationAnchorValue getHillshadeIlluminationAnchor() {
        return this.hillshadeIlluminationAnchorState.getF182175a();
    }

    public final DoubleValue getHillshadeIlluminationDirection() {
        return this.hillshadeIlluminationDirectionState.getF182175a();
    }

    public final ColorValue getHillshadeShadowColor() {
        return this.hillshadeShadowColorState.getF182175a();
    }

    public final Transition getHillshadeShadowColorTransition() {
        return this.hillshadeShadowColorTransitionState.getF182175a();
    }

    public final StringValue getHillshadeShadowColorUseTheme() {
        return this.hillshadeShadowColorUseThemeState.getF182175a();
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

    public final void setHillshadeAccentColor(ColorValue colorValue) {
        colorValue.getClass();
        this.hillshadeAccentColorState.setValue(colorValue);
    }

    public final void setHillshadeAccentColorTransition(Transition transition) {
        transition.getClass();
        this.hillshadeAccentColorTransitionState.setValue(transition);
    }

    public final void setHillshadeAccentColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.hillshadeAccentColorUseThemeState.setValue(stringValue);
    }

    public final void setHillshadeEmissiveStrength(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.hillshadeEmissiveStrengthState.setValue(doubleValue);
    }

    public final void setHillshadeEmissiveStrengthTransition(Transition transition) {
        transition.getClass();
        this.hillshadeEmissiveStrengthTransitionState.setValue(transition);
    }

    public final void setHillshadeExaggeration(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.hillshadeExaggerationState.setValue(doubleValue);
    }

    public final void setHillshadeExaggerationTransition(Transition transition) {
        transition.getClass();
        this.hillshadeExaggerationTransitionState.setValue(transition);
    }

    public final void setHillshadeHighlightColor(ColorValue colorValue) {
        colorValue.getClass();
        this.hillshadeHighlightColorState.setValue(colorValue);
    }

    public final void setHillshadeHighlightColorTransition(Transition transition) {
        transition.getClass();
        this.hillshadeHighlightColorTransitionState.setValue(transition);
    }

    public final void setHillshadeHighlightColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.hillshadeHighlightColorUseThemeState.setValue(stringValue);
    }

    public final void setHillshadeIlluminationAnchor(HillshadeIlluminationAnchorValue hillshadeIlluminationAnchorValue) {
        hillshadeIlluminationAnchorValue.getClass();
        this.hillshadeIlluminationAnchorState.setValue(hillshadeIlluminationAnchorValue);
    }

    public final void setHillshadeIlluminationDirection(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.hillshadeIlluminationDirectionState.setValue(doubleValue);
    }

    public final void setHillshadeShadowColor(ColorValue colorValue) {
        colorValue.getClass();
        this.hillshadeShadowColorState.setValue(colorValue);
    }

    public final void setHillshadeShadowColorTransition(Transition transition) {
        transition.getClass();
        this.hillshadeShadowColorTransitionState.setValue(transition);
    }

    public final void setHillshadeShadowColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.hillshadeShadowColorUseThemeState.setValue(stringValue);
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
    public HillshadeLayerState() {
        ColorValue colorValue = ColorValue.INITIAL;
        StringValue stringValue = StringValue.INITIAL;
        Transition transition = Transition.INITIAL;
        DoubleValue doubleValue = DoubleValue.INITIAL;
        HillshadeIlluminationAnchorValue hillshadeIlluminationAnchorValue = HillshadeIlluminationAnchorValue.INITIAL;
        VisibilityValue visibilityValue = VisibilityValue.INITIAL;
        LongValue longValue = LongValue.INITIAL;
        this(colorValue, stringValue, transition, doubleValue, transition, doubleValue, transition, colorValue, stringValue, transition, hillshadeIlluminationAnchorValue, doubleValue, colorValue, stringValue, transition, visibilityValue, longValue, longValue, stringValue, Filter.INITIAL, new LayerInteractionsState());
    }
}
