package com.mapbox.maps.extension.compose.style.interactions;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.InteractionContext;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.extension.compose.style.interactions.generated.FeaturesetFeatureScope;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeaturesetFeature;
import e23.p;
import e23.q;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ_\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2$\u0010\u0017\u001a \u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0011¢\u0006\u0004\b\u0018\u0010\u0019JS\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2$\u0010\u0017\u001a \u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ_\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2$\u0010\u001c\u001a \u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0011¢\u0006\u0004\b\u001d\u0010\u0019JS\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2$\u0010\u001c\u001a \u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0011¢\u0006\u0004\b\u001e\u0010\u001bJ'\u0010 \u001a\u00020\u00002\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u001f¢\u0006\u0004\b \u0010!J'\u0010\"\u001a\u00020\u00002\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u001f¢\u0006\u0004\b\"\u0010!¨\u0006#"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/interactions/StyleInteractionsState;", "Lcom/mapbox/maps/extension/compose/style/interactions/BasicStyleInteractions;", "<init>", "()V", "Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "", "BindTo$extension_compose_release", "(Lcom/mapbox/maps/MapboxMap;Lp3/m;I)V", "BindTo", "", TtmlNode.ATTR_ID, "importId", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "filter", "", "radius", "Lkotlin/Function3;", "Lcom/mapbox/maps/extension/compose/style/interactions/generated/FeaturesetFeatureScope;", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/FeatureState;", "Lcom/mapbox/maps/InteractionContext;", "", "onClick", "onFeaturesetClicked", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Ljava/lang/Double;Le23/q;)Lcom/mapbox/maps/extension/compose/style/interactions/StyleInteractionsState;", "onLayerClicked", "(Ljava/lang/String;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Ljava/lang/Double;Le23/q;)Lcom/mapbox/maps/extension/compose/style/interactions/StyleInteractionsState;", "onLongClick", "onFeaturesetLongClicked", "onLayerLongClicked", "Lkotlin/Function2;", "onMapClicked", "(Le23/p;)Lcom/mapbox/maps/extension/compose/style/interactions/StyleInteractionsState;", "onMapLongClicked", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StyleInteractionsState extends BasicStyleInteractions {
    public static /* synthetic */ StyleInteractionsState onFeaturesetClicked$default(StyleInteractionsState styleInteractionsState, String str, String str2, Expression expression, Double d14, q qVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str2 = null;
        }
        if ((i14 & 4) != 0) {
            expression = null;
        }
        if ((i14 & 8) != 0) {
            d14 = null;
        }
        return styleInteractionsState.onFeaturesetClicked(str, str2, expression, d14, qVar);
    }

    public static /* synthetic */ StyleInteractionsState onFeaturesetLongClicked$default(StyleInteractionsState styleInteractionsState, String str, String str2, Expression expression, Double d14, q qVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str2 = null;
        }
        if ((i14 & 4) != 0) {
            expression = null;
        }
        if ((i14 & 8) != 0) {
            d14 = null;
        }
        return styleInteractionsState.onFeaturesetLongClicked(str, str2, expression, d14, qVar);
    }

    public static /* synthetic */ StyleInteractionsState onLayerClicked$default(StyleInteractionsState styleInteractionsState, String str, Expression expression, Double d14, q qVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            expression = null;
        }
        if ((i14 & 4) != 0) {
            d14 = null;
        }
        return styleInteractionsState.onLayerClicked(str, expression, d14, qVar);
    }

    public static /* synthetic */ StyleInteractionsState onLayerLongClicked$default(StyleInteractionsState styleInteractionsState, String str, Expression expression, Double d14, q qVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            expression = null;
        }
        if ((i14 & 4) != 0) {
            d14 = null;
        }
        return styleInteractionsState.onLayerLongClicked(str, expression, d14, qVar);
    }

    public final void BindTo$extension_compose_release(MapboxMap mapboxMap, m mVar, int i14) {
        mapboxMap.getClass();
        o0 o0VarE = mVar.E(-664598343);
        x1 x1Var = n.f135158a;
        BindToMap(mapboxMap, null, o0VarE, ((i14 << 3) & 896) | 8, 2);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new StyleInteractionsState$BindTo$1(this, mapboxMap, i14);
    }

    public final StyleInteractionsState onFeaturesetClicked(String id3, String importId, Expression filter, Double radius, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onClick) {
        id3.getClass();
        onClick.getClass();
        clickInteractionFeatureset(id3, importId, filter, radius, onClick);
        return this;
    }

    public final StyleInteractionsState onFeaturesetLongClicked(String id3, String importId, Expression filter, Double radius, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onLongClick) {
        id3.getClass();
        onLongClick.getClass();
        longClickInteractionFeatureset(id3, importId, filter, radius, onLongClick);
        return this;
    }

    public final StyleInteractionsState onLayerClicked(String id3, Expression filter, Double radius, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onClick) {
        id3.getClass();
        onClick.getClass();
        clickInteractionLayer(id3, filter, radius, onClick);
        return this;
    }

    public final StyleInteractionsState onLayerLongClicked(String id3, Expression filter, Double radius, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onLongClick) {
        id3.getClass();
        onLongClick.getClass();
        longClickInteractionLayer(id3, filter, radius, onLongClick);
        return this;
    }

    public final StyleInteractionsState onMapClicked(p<? super FeaturesetFeatureScope, ? super InteractionContext, Boolean> onClick) {
        onClick.getClass();
        clickInteractionMap(onClick);
        return this;
    }

    public final StyleInteractionsState onMapLongClicked(p<? super FeaturesetFeatureScope, ? super InteractionContext, Boolean> onLongClick) {
        onLongClick.getClass();
        longClickInteractionMap(onLongClick);
        return this;
    }
}
