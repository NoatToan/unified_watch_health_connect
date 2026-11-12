package com.mapbox.maps.plugin.locationcomponent.model;

import com.mapbox.maps.extension.style.expressions.generated.Expression;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class AnimatableModel$getLocationPuck3D$4$1$1$1 extends w implements l<Expression.ExpressionBuilder, Unit> {
    final /* synthetic */ ModelMaterialPart $materialPart;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatableModel$getLocationPuck3D$4$1$1$1(ModelMaterialPart modelMaterialPart) {
        super(1);
        this.$materialPart = modelMaterialPart;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Expression.ExpressionBuilder expressionBuilder) {
        expressionBuilder.getClass();
        expressionBuilder.featureState(new AnonymousClass1(this.$materialPart));
        expressionBuilder.literal(this.$materialPart.getEmissiveStrength());
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(Expression.ExpressionBuilder expressionBuilder) {
        invoke2(expressionBuilder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel$getLocationPuck3D$4$1$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<Expression.ExpressionBuilder, Unit> {
        final /* synthetic */ ModelMaterialPart $materialPart;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ModelMaterialPart modelMaterialPart) {
            super(1);
            this.$materialPart = modelMaterialPart;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Expression.ExpressionBuilder expressionBuilder) {
            expressionBuilder.getClass();
            expressionBuilder.literal(this.$materialPart.getFeatureStateId() + "-emission");
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(Expression.ExpressionBuilder expressionBuilder) {
            invoke2(expressionBuilder);
            return Unit.INSTANCE;
        }
    }
}
