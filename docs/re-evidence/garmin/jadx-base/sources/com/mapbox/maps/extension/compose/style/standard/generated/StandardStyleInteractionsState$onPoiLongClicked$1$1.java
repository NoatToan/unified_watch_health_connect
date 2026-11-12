package com.mapbox.maps.extension.compose.style.standard.generated;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.InteractionContext;
import com.mapbox.maps.LongClickInteraction;
import com.mapbox.maps.MapInteraction;
import com.mapbox.maps.extension.compose.style.interactions.generated.FeaturesetFeatureScope;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.interactions.standard.generated.StandardInteractions;
import com.mapbox.maps.interactions.standard.generated.StandardPoiFeature;
import e23.l;
import e23.p;
import e23.q;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/MapInteraction;", "import", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class StandardStyleInteractionsState$onPoiLongClicked$1$1 extends w implements l<String, MapInteraction> {
    final /* synthetic */ Expression $filter;
    final /* synthetic */ String $importId;
    final /* synthetic */ q<FeaturesetFeatureScope, StandardPoiFeature, InteractionContext, Boolean> $onLongClick;
    final /* synthetic */ Double $radius;
    final /* synthetic */ StandardStyleInteractionsState $this_apply;

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.standard.generated.StandardStyleInteractionsState$onPoiLongClicked$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "feature", "Lcom/mapbox/maps/interactions/standard/generated/StandardPoiFeature;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/mapbox/maps/InteractionContext;", "invoke", "(Lcom/mapbox/maps/interactions/standard/generated/StandardPoiFeature;Lcom/mapbox/maps/InteractionContext;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements p<StandardPoiFeature, InteractionContext, Boolean> {
        final /* synthetic */ q<FeaturesetFeatureScope, StandardPoiFeature, InteractionContext, Boolean> $onLongClick;
        final /* synthetic */ StandardStyleInteractionsState $this_apply;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(StandardStyleInteractionsState standardStyleInteractionsState, q<? super FeaturesetFeatureScope, ? super StandardPoiFeature, ? super InteractionContext, Boolean> qVar) {
            super(2);
            this.$this_apply = standardStyleInteractionsState;
            this.$onLongClick = qVar;
        }

        @Override // e23.p
        public final Boolean invoke(StandardPoiFeature standardPoiFeature, InteractionContext interactionContext) {
            standardPoiFeature.getClass();
            interactionContext.getClass();
            FeaturesetFeatureScope featuresetFeatureScope = this.$this_apply.getFeaturesetFeatureScope();
            return Boolean.valueOf(featuresetFeatureScope != null ? this.$onLongClick.invoke(featuresetFeatureScope, standardPoiFeature, interactionContext).booleanValue() : false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StandardStyleInteractionsState$onPoiLongClicked$1$1(String str, Expression expression, Double d14, StandardStyleInteractionsState standardStyleInteractionsState, q<? super FeaturesetFeatureScope, ? super StandardPoiFeature, ? super InteractionContext, Boolean> qVar) {
        super(1);
        this.$importId = str;
        this.$filter = expression;
        this.$radius = d14;
        this.$this_apply = standardStyleInteractionsState;
        this.$onLongClick = qVar;
    }

    @Override // e23.l
    public final MapInteraction invoke(String str) {
        LongClickInteraction.Companion companion = LongClickInteraction.INSTANCE;
        String str2 = this.$importId;
        if (str2 != null) {
            str = str2;
        }
        return StandardInteractions.standardPoi(companion, str, this.$filter, this.$radius, new AnonymousClass1(this.$this_apply, this.$onLongClick));
    }
}
