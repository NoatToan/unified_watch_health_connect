package com.mapbox.maps.extension.compose.style.layers;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.ClickInteraction;
import com.mapbox.maps.InteractionContext;
import com.mapbox.maps.MapInteraction;
import com.mapbox.maps.extension.compose.style.interactions.generated.FeaturesetFeatureScope;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeaturesetFeature;
import e23.l;
import e23.p;
import e23.q;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/MapInteraction;", "layerId", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class LayerInteractionsState$onClicked$1$1 extends w implements l<String, MapInteraction> {
    final /* synthetic */ Expression $filter;
    final /* synthetic */ q<FeaturesetFeatureScope, FeaturesetFeature<FeatureState>, InteractionContext, Boolean> $onClick;
    final /* synthetic */ Double $radius;
    final /* synthetic */ LayerInteractionsState $this_apply;

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.layers.LayerInteractionsState$onClicked$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "feature", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/FeatureState;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/mapbox/maps/InteractionContext;", "invoke", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/InteractionContext;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements p<FeaturesetFeature<FeatureState>, InteractionContext, Boolean> {
        final /* synthetic */ q<FeaturesetFeatureScope, FeaturesetFeature<FeatureState>, InteractionContext, Boolean> $onClick;
        final /* synthetic */ LayerInteractionsState $this_apply;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(LayerInteractionsState layerInteractionsState, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> qVar) {
            super(2);
            this.$this_apply = layerInteractionsState;
            this.$onClick = qVar;
        }

        @Override // e23.p
        public final Boolean invoke(FeaturesetFeature<FeatureState> featuresetFeature, InteractionContext interactionContext) {
            featuresetFeature.getClass();
            interactionContext.getClass();
            FeaturesetFeatureScope featuresetFeatureScope = this.$this_apply.getFeaturesetFeatureScope();
            return Boolean.valueOf(featuresetFeatureScope != null ? this.$onClick.invoke(featuresetFeatureScope, featuresetFeature, interactionContext).booleanValue() : false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LayerInteractionsState$onClicked$1$1(Expression expression, Double d14, LayerInteractionsState layerInteractionsState, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> qVar) {
        super(1);
        this.$filter = expression;
        this.$radius = d14;
        this.$this_apply = layerInteractionsState;
        this.$onClick = qVar;
    }

    @Override // e23.l
    public final MapInteraction invoke(String str) {
        str.getClass();
        return ClickInteraction.INSTANCE.layer(str, this.$filter, this.$radius, new AnonymousClass1(this.$this_apply, this.$onClick));
    }
}
