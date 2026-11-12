package com.mapbox.maps.extension.compose.style.imports;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.InteractionContext;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.extension.compose.style.interactions.BasicStyleInteractions;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ_\u0010\u0018\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2$\u0010\u0017\u001a \u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0011¢\u0006\u0004\b\u0018\u0010\u0019J_\u0010\u001b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2$\u0010\u001a\u001a \u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0011¢\u0006\u0004\b\u001b\u0010\u0019J'\u0010\u001d\u001a\u00020\u00002\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u00020\u00002\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u001c¢\u0006\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"Lcom/mapbox/maps/extension/compose/style/imports/StyleImportInteractionsState;", "Lcom/mapbox/maps/extension/compose/style/interactions/BasicStyleInteractions;", "<init>", "()V", "Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "", "importId", "", "BindTo$extension_compose_release", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lp3/m;I)V", "BindTo", TtmlNode.ATTR_ID, "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "filter", "", "radius", "Lkotlin/Function3;", "Lcom/mapbox/maps/extension/compose/style/interactions/generated/FeaturesetFeatureScope;", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/FeatureState;", "Lcom/mapbox/maps/InteractionContext;", "", "onClick", "onFeaturesetClicked", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Ljava/lang/Double;Le23/q;)Lcom/mapbox/maps/extension/compose/style/imports/StyleImportInteractionsState;", "onLongClick", "onFeaturesetLongClicked", "Lkotlin/Function2;", "onMapClicked", "(Le23/p;)Lcom/mapbox/maps/extension/compose/style/imports/StyleImportInteractionsState;", "onMapLongClicked", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StyleImportInteractionsState extends BasicStyleInteractions {
    public static /* synthetic */ StyleImportInteractionsState onFeaturesetClicked$default(StyleImportInteractionsState styleImportInteractionsState, String str, String str2, Expression expression, Double d14, q qVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str2 = null;
        }
        if ((i14 & 4) != 0) {
            expression = null;
        }
        if ((i14 & 8) != 0) {
            d14 = null;
        }
        return styleImportInteractionsState.onFeaturesetClicked(str, str2, expression, d14, qVar);
    }

    public static /* synthetic */ StyleImportInteractionsState onFeaturesetLongClicked$default(StyleImportInteractionsState styleImportInteractionsState, String str, String str2, Expression expression, Double d14, q qVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str2 = null;
        }
        if ((i14 & 4) != 0) {
            expression = null;
        }
        if ((i14 & 8) != 0) {
            d14 = null;
        }
        return styleImportInteractionsState.onFeaturesetLongClicked(str, str2, expression, d14, qVar);
    }

    public final void BindTo$extension_compose_release(MapboxMap mapboxMap, String str, m mVar, int i14) {
        mapboxMap.getClass();
        str.getClass();
        o0 o0VarE = mVar.E(754030023);
        x1 x1Var = n.f135158a;
        BindToMap(mapboxMap, str, o0VarE, (i14 & 112) | 8 | (i14 & 896), 0);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new StyleImportInteractionsState$BindTo$1(this, mapboxMap, str, i14);
    }

    public final StyleImportInteractionsState onFeaturesetClicked(String id3, String importId, Expression filter, Double radius, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onClick) {
        id3.getClass();
        onClick.getClass();
        clickInteractionFeatureset(id3, importId, filter, radius, onClick);
        return this;
    }

    public final StyleImportInteractionsState onFeaturesetLongClicked(String id3, String importId, Expression filter, Double radius, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onLongClick) {
        id3.getClass();
        onLongClick.getClass();
        longClickInteractionFeatureset(id3, importId, filter, radius, onLongClick);
        return this;
    }

    public final StyleImportInteractionsState onMapClicked(p<? super FeaturesetFeatureScope, ? super InteractionContext, Boolean> onClick) {
        onClick.getClass();
        clickInteractionMap(onClick);
        return this;
    }

    public final StyleImportInteractionsState onMapLongClicked(p<? super FeaturesetFeatureScope, ? super InteractionContext, Boolean> onLongClick) {
        onLongClick.getClass();
        longClickInteractionMap(onLongClick);
        return this;
    }
}
