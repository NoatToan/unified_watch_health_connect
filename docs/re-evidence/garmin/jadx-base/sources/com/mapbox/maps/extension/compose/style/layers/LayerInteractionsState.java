package com.mapbox.maps.extension.compose.style.layers;

import com.mapbox.common.Cancelable;
import com.mapbox.maps.InteractionContext;
import com.mapbox.maps.MapInteraction;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.extension.compose.style.interactions.BasicStyleInteractions;
import com.mapbox.maps.extension.compose.style.interactions.generated.FeaturesetFeatureScope;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeaturesetFeature;
import e23.l;
import e23.p;
import e23.q;
import f4.s;
import f4.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.h0;
import p3.i0;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\f\u0010\nJM\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102$\u0010\u0018\u001a \u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0012H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJM\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102$\u0010\u001b\u001a \u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0012H\u0007¢\u0006\u0004\b\u001c\u0010\u001aR&\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;", "Lcom/mapbox/maps/extension/compose/style/interactions/BasicStyleInteractions;", "<init>", "()V", "Lcom/mapbox/maps/MapboxMap;", "map", "", "layerId", "", "UpdateLayerInteractions", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lp3/m;I)V", "mapboxMap", "BindTo$extension_compose_release", "BindTo", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "filter", "", "radius", "Lkotlin/Function3;", "Lcom/mapbox/maps/extension/compose/style/interactions/generated/FeaturesetFeatureScope;", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/FeatureState;", "Lcom/mapbox/maps/InteractionContext;", "", "onClick", "onClicked", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Ljava/lang/Double;Le23/q;)Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;", "onLongClick", "onLongClicked", "", "Lkotlin/Function1;", "Lcom/mapbox/maps/MapInteraction;", "styleLayerEntries", "Ljava/util/List;", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
public final class LayerInteractionsState extends BasicStyleInteractions {
    private final List<l<String, MapInteraction>> styleLayerEntries = new ArrayList();

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.layers.LayerInteractionsState$UpdateLayerInteractions$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<i0, h0> {
        final /* synthetic */ s<Cancelable> $cancelables;
        final /* synthetic */ String $layerId;
        final /* synthetic */ MapboxMap $map;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(s<Cancelable> sVar, MapboxMap mapboxMap, String str) {
            super(1);
            this.$cancelables = sVar;
            this.$map = mapboxMap;
            this.$layerId = str;
        }

        @Override // e23.l
        public final h0 invoke(i0 i0Var) {
            i0Var.getClass();
            List list = LayerInteractionsState.this.styleLayerEntries;
            s<Cancelable> sVar = this.$cancelables;
            MapboxMap mapboxMap = this.$map;
            String str = this.$layerId;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sVar.add(mapboxMap.addInteraction((MapInteraction) ((l) it.next()).invoke(str)));
            }
            final s<Cancelable> sVar2 = this.$cancelables;
            return new h0() { // from class: com.mapbox.maps.extension.compose.style.layers.LayerInteractionsState$UpdateLayerInteractions$1$invoke$$inlined$onDispose$1
                @Override // p3.h0
                public void dispose() {
                    ListIterator listIterator = sVar2.listIterator();
                    while (true) {
                        z zVar = (z) listIterator;
                        if (!zVar.hasNext()) {
                            sVar2.clear();
                            return;
                        }
                        ((Cancelable) zVar.next()).cancel();
                    }
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLayerInteractions(MapboxMap mapboxMap, String str, m mVar, int i14) {
        o0 o0VarE = mVar.E(80087338);
        x1 x1Var = n.f135158a;
        o0VarE.L(-492369756);
        Object objQ = o0VarE.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            objQ = new s();
            o0VarE.K(objQ);
        }
        o0VarE.g0(false);
        l0.a(this.styleLayerEntries, new AnonymousClass1((s) objQ, mapboxMap, str), o0VarE);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass2(mapboxMap, str, i14);
    }

    public static /* synthetic */ LayerInteractionsState onClicked$default(LayerInteractionsState layerInteractionsState, Expression expression, Double d14, q qVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            expression = null;
        }
        if ((i14 & 2) != 0) {
            d14 = null;
        }
        return layerInteractionsState.onClicked(expression, d14, qVar);
    }

    public static /* synthetic */ LayerInteractionsState onLongClicked$default(LayerInteractionsState layerInteractionsState, Expression expression, Double d14, q qVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            expression = null;
        }
        if ((i14 & 2) != 0) {
            d14 = null;
        }
        return layerInteractionsState.onLongClicked(expression, d14, qVar);
    }

    public final void BindTo$extension_compose_release(MapboxMap mapboxMap, String str, m mVar, int i14) {
        mapboxMap.getClass();
        str.getClass();
        o0 o0VarE = mVar.E(-956196705);
        x1 x1Var = n.f135158a;
        int i15 = i14 & 896;
        BindToMap(mapboxMap, null, o0VarE, i15 | 8, 2);
        UpdateLayerInteractions(mapboxMap, str, o0VarE, (i14 & 112) | 8 | i15);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new LayerInteractionsState$BindTo$1(this, mapboxMap, str, i14);
    }

    @MapboxExperimental
    public final LayerInteractionsState onClicked(Expression filter, Double radius, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onClick) {
        onClick.getClass();
        this.styleLayerEntries.add(new LayerInteractionsState$onClicked$1$1(filter, radius, this, onClick));
        return this;
    }

    @MapboxExperimental
    public final LayerInteractionsState onLongClicked(Expression filter, Double radius, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onLongClick) {
        onLongClick.getClass();
        this.styleLayerEntries.add(new LayerInteractionsState$onLongClicked$1$1(filter, radius, this, onLongClick));
        return this;
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.layers.LayerInteractionsState$UpdateLayerInteractions$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ String $layerId;
        final /* synthetic */ MapboxMap $map;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MapboxMap mapboxMap, String str, int i14) {
            super(2);
            this.$map = mapboxMap;
            this.$layerId = str;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            LayerInteractionsState.this.UpdateLayerInteractions(this.$map, this.$layerId, mVar, this.$$changed | 1);
        }
    }
}
