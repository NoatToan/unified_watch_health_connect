package com.mapbox.maps.extension.compose.style.standard.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.InteractionContext;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.extension.compose.style.interactions.BasicStyleInteractions;
import com.mapbox.maps.extension.compose.style.interactions.generated.FeaturesetFeatureScope;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeaturesetFeature;
import com.mapbox.maps.interactions.standard.generated.StandardBuildingsFeature;
import com.mapbox.maps.interactions.standard.generated.StandardPlaceLabelsFeature;
import com.mapbox.maps.interactions.standard.generated.StandardPoiFeature;
import e23.p;
import e23.q;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJQ\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u001e\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0010¢\u0006\u0004\b\u0016\u0010\u0017JQ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u001e\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0010¢\u0006\u0004\b\u0019\u0010\u0017JQ\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u001e\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0010¢\u0006\u0004\b\u001b\u0010\u0017JQ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u001e\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0010¢\u0006\u0004\b\u001c\u0010\u0017JQ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u001e\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0010¢\u0006\u0004\b\u001e\u0010\u0017JQ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u001e\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0010¢\u0006\u0004\b\u001f\u0010\u0017J_\u0010#\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2$\u0010\u0015\u001a \u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0010¢\u0006\u0004\b#\u0010$JS\u0010%\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2$\u0010\u0015\u001a \u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0010¢\u0006\u0004\b%\u0010\u0017J_\u0010&\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2$\u0010\u0018\u001a \u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0010¢\u0006\u0004\b&\u0010$JS\u0010'\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2$\u0010\u0018\u001a \u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0010¢\u0006\u0004\b'\u0010\u0017J'\u0010)\u001a\u00020\u00002\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140(¢\u0006\u0004\b)\u0010*J'\u0010+\u001a\u00020\u00002\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140(¢\u0006\u0004\b+\u0010*¨\u0006,"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/standard/generated/StandardStyleInteractionsState;", "Lcom/mapbox/maps/extension/compose/style/interactions/BasicStyleInteractions;", "<init>", "()V", "Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "", "BindTo$extension_compose_release", "(Lcom/mapbox/maps/MapboxMap;Lp3/m;I)V", "BindTo", "", "importId", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "filter", "", "radius", "Lkotlin/Function3;", "Lcom/mapbox/maps/extension/compose/style/interactions/generated/FeaturesetFeatureScope;", "Lcom/mapbox/maps/interactions/standard/generated/StandardPoiFeature;", "Lcom/mapbox/maps/InteractionContext;", "", "onClick", "onPoiClicked", "(Ljava/lang/String;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Ljava/lang/Double;Le23/q;)Lcom/mapbox/maps/extension/compose/style/standard/generated/StandardStyleInteractionsState;", "onLongClick", "onPoiLongClicked", "Lcom/mapbox/maps/interactions/standard/generated/StandardPlaceLabelsFeature;", "onPlaceLabelsClicked", "onPlaceLabelsLongClicked", "Lcom/mapbox/maps/interactions/standard/generated/StandardBuildingsFeature;", "onBuildingsClicked", "onBuildingsLongClicked", TtmlNode.ATTR_ID, "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/FeatureState;", "onFeaturesetClicked", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Ljava/lang/Double;Le23/q;)Lcom/mapbox/maps/extension/compose/style/standard/generated/StandardStyleInteractionsState;", "onLayerClicked", "onFeaturesetLongClicked", "onLayerLongClicked", "Lkotlin/Function2;", "onMapClicked", "(Le23/p;)Lcom/mapbox/maps/extension/compose/style/standard/generated/StandardStyleInteractionsState;", "onMapLongClicked", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StandardStyleInteractionsState extends BasicStyleInteractions {
    public static final int $stable = 0;

    public static /* synthetic */ StandardStyleInteractionsState onBuildingsClicked$default(StandardStyleInteractionsState standardStyleInteractionsState, String str, Expression expression, Double d14, q qVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = null;
        }
        if ((i14 & 2) != 0) {
            expression = null;
        }
        if ((i14 & 4) != 0) {
            d14 = null;
        }
        return standardStyleInteractionsState.onBuildingsClicked(str, expression, d14, qVar);
    }

    public static /* synthetic */ StandardStyleInteractionsState onBuildingsLongClicked$default(StandardStyleInteractionsState standardStyleInteractionsState, String str, Expression expression, Double d14, q qVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = null;
        }
        if ((i14 & 2) != 0) {
            expression = null;
        }
        if ((i14 & 4) != 0) {
            d14 = null;
        }
        return standardStyleInteractionsState.onBuildingsLongClicked(str, expression, d14, qVar);
    }

    public static /* synthetic */ StandardStyleInteractionsState onFeaturesetClicked$default(StandardStyleInteractionsState standardStyleInteractionsState, String str, String str2, Expression expression, Double d14, q qVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str2 = null;
        }
        if ((i14 & 4) != 0) {
            expression = null;
        }
        if ((i14 & 8) != 0) {
            d14 = null;
        }
        return standardStyleInteractionsState.onFeaturesetClicked(str, str2, expression, d14, qVar);
    }

    public static /* synthetic */ StandardStyleInteractionsState onFeaturesetLongClicked$default(StandardStyleInteractionsState standardStyleInteractionsState, String str, String str2, Expression expression, Double d14, q qVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str2 = null;
        }
        if ((i14 & 4) != 0) {
            expression = null;
        }
        if ((i14 & 8) != 0) {
            d14 = null;
        }
        return standardStyleInteractionsState.onFeaturesetLongClicked(str, str2, expression, d14, qVar);
    }

    public static /* synthetic */ StandardStyleInteractionsState onLayerClicked$default(StandardStyleInteractionsState standardStyleInteractionsState, String str, Expression expression, Double d14, q qVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            expression = null;
        }
        if ((i14 & 4) != 0) {
            d14 = null;
        }
        return standardStyleInteractionsState.onLayerClicked(str, expression, d14, qVar);
    }

    public static /* synthetic */ StandardStyleInteractionsState onLayerLongClicked$default(StandardStyleInteractionsState standardStyleInteractionsState, String str, Expression expression, Double d14, q qVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            expression = null;
        }
        if ((i14 & 4) != 0) {
            d14 = null;
        }
        return standardStyleInteractionsState.onLayerLongClicked(str, expression, d14, qVar);
    }

    public static /* synthetic */ StandardStyleInteractionsState onPlaceLabelsClicked$default(StandardStyleInteractionsState standardStyleInteractionsState, String str, Expression expression, Double d14, q qVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = null;
        }
        if ((i14 & 2) != 0) {
            expression = null;
        }
        if ((i14 & 4) != 0) {
            d14 = null;
        }
        return standardStyleInteractionsState.onPlaceLabelsClicked(str, expression, d14, qVar);
    }

    public static /* synthetic */ StandardStyleInteractionsState onPlaceLabelsLongClicked$default(StandardStyleInteractionsState standardStyleInteractionsState, String str, Expression expression, Double d14, q qVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = null;
        }
        if ((i14 & 2) != 0) {
            expression = null;
        }
        if ((i14 & 4) != 0) {
            d14 = null;
        }
        return standardStyleInteractionsState.onPlaceLabelsLongClicked(str, expression, d14, qVar);
    }

    public static /* synthetic */ StandardStyleInteractionsState onPoiClicked$default(StandardStyleInteractionsState standardStyleInteractionsState, String str, Expression expression, Double d14, q qVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = null;
        }
        if ((i14 & 2) != 0) {
            expression = null;
        }
        if ((i14 & 4) != 0) {
            d14 = null;
        }
        return standardStyleInteractionsState.onPoiClicked(str, expression, d14, qVar);
    }

    public static /* synthetic */ StandardStyleInteractionsState onPoiLongClicked$default(StandardStyleInteractionsState standardStyleInteractionsState, String str, Expression expression, Double d14, q qVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = null;
        }
        if ((i14 & 2) != 0) {
            expression = null;
        }
        if ((i14 & 4) != 0) {
            d14 = null;
        }
        return standardStyleInteractionsState.onPoiLongClicked(str, expression, d14, qVar);
    }

    public final void BindTo$extension_compose_release(MapboxMap mapboxMap, m mVar, int i14) {
        mapboxMap.getClass();
        o0 o0VarE = mVar.E(1997494844);
        x1 x1Var = n.f135158a;
        BindToMap(mapboxMap, null, o0VarE, ((i14 << 3) & 896) | 8, 2);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new StandardStyleInteractionsState$BindTo$1(this, mapboxMap, i14);
    }

    public final StandardStyleInteractionsState onBuildingsClicked(String importId, Expression filter, Double radius, q<? super FeaturesetFeatureScope, ? super StandardBuildingsFeature, ? super InteractionContext, Boolean> onClick) {
        onClick.getClass();
        getEntries().add(new StandardStyleInteractionsState$onBuildingsClicked$1$1(importId, filter, radius, this, onClick));
        return this;
    }

    public final StandardStyleInteractionsState onBuildingsLongClicked(String importId, Expression filter, Double radius, q<? super FeaturesetFeatureScope, ? super StandardBuildingsFeature, ? super InteractionContext, Boolean> onLongClick) {
        onLongClick.getClass();
        getEntries().add(new StandardStyleInteractionsState$onBuildingsLongClicked$1$1(importId, filter, radius, this, onLongClick));
        return this;
    }

    public final StandardStyleInteractionsState onFeaturesetClicked(String id3, String importId, Expression filter, Double radius, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onClick) {
        id3.getClass();
        onClick.getClass();
        clickInteractionFeatureset(id3, importId, filter, radius, onClick);
        return this;
    }

    public final StandardStyleInteractionsState onFeaturesetLongClicked(String id3, String importId, Expression filter, Double radius, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onLongClick) {
        id3.getClass();
        onLongClick.getClass();
        longClickInteractionFeatureset(id3, importId, filter, radius, onLongClick);
        return this;
    }

    public final StandardStyleInteractionsState onLayerClicked(String id3, Expression filter, Double radius, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onClick) {
        id3.getClass();
        onClick.getClass();
        clickInteractionLayer(id3, filter, radius, onClick);
        return this;
    }

    public final StandardStyleInteractionsState onLayerLongClicked(String id3, Expression filter, Double radius, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onLongClick) {
        id3.getClass();
        onLongClick.getClass();
        longClickInteractionLayer(id3, filter, radius, onLongClick);
        return this;
    }

    public final StandardStyleInteractionsState onMapClicked(p<? super FeaturesetFeatureScope, ? super InteractionContext, Boolean> onClick) {
        onClick.getClass();
        clickInteractionMap(onClick);
        return this;
    }

    public final StandardStyleInteractionsState onMapLongClicked(p<? super FeaturesetFeatureScope, ? super InteractionContext, Boolean> onLongClick) {
        onLongClick.getClass();
        longClickInteractionMap(onLongClick);
        return this;
    }

    public final StandardStyleInteractionsState onPlaceLabelsClicked(String importId, Expression filter, Double radius, q<? super FeaturesetFeatureScope, ? super StandardPlaceLabelsFeature, ? super InteractionContext, Boolean> onClick) {
        onClick.getClass();
        getEntries().add(new StandardStyleInteractionsState$onPlaceLabelsClicked$1$1(importId, filter, radius, this, onClick));
        return this;
    }

    public final StandardStyleInteractionsState onPlaceLabelsLongClicked(String importId, Expression filter, Double radius, q<? super FeaturesetFeatureScope, ? super StandardPlaceLabelsFeature, ? super InteractionContext, Boolean> onLongClick) {
        onLongClick.getClass();
        getEntries().add(new StandardStyleInteractionsState$onPlaceLabelsLongClicked$1$1(importId, filter, radius, this, onLongClick));
        return this;
    }

    public final StandardStyleInteractionsState onPoiClicked(String importId, Expression filter, Double radius, q<? super FeaturesetFeatureScope, ? super StandardPoiFeature, ? super InteractionContext, Boolean> onClick) {
        onClick.getClass();
        getEntries().add(new StandardStyleInteractionsState$onPoiClicked$1$1(importId, filter, radius, this, onClick));
        return this;
    }

    public final StandardStyleInteractionsState onPoiLongClicked(String importId, Expression filter, Double radius, q<? super FeaturesetFeatureScope, ? super StandardPoiFeature, ? super InteractionContext, Boolean> onLongClick) {
        onLongClick.getClass();
        getEntries().add(new StandardStyleInteractionsState$onPoiLongClicked$1$1(importId, filter, radius, this, onLongClick));
        return this;
    }
}
