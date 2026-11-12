package com.mapbox.maps.extension.style.types;

import com.mapbox.maps.extension.style.expressions.generated.Expression;
import e23.l;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class Formatted$Companion$fromProperty$1$1$1 extends w implements l<Expression.ExpressionBuilder, Unit> {
    final /* synthetic */ ArrayList<?> $colorExpressionList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Formatted$Companion$fromProperty$1$1$1(ArrayList<?> arrayList) {
        super(1);
        this.$colorExpressionList = arrayList;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Expression.ExpressionBuilder expressionBuilder) {
        expressionBuilder.getClass();
        Object obj = this.$colorExpressionList.get(0);
        obj.getClass();
        expressionBuilder.literal(((Double) obj).doubleValue());
        Object obj2 = this.$colorExpressionList.get(1);
        obj2.getClass();
        expressionBuilder.literal(((Double) obj2).doubleValue());
        Object obj3 = this.$colorExpressionList.get(2);
        obj3.getClass();
        expressionBuilder.literal(((Double) obj3).doubleValue());
        Object obj4 = this.$colorExpressionList.get(3);
        obj4.getClass();
        expressionBuilder.literal(((Double) obj4).doubleValue());
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(Expression.ExpressionBuilder expressionBuilder) {
        invoke2(expressionBuilder);
        return Unit.INSTANCE;
    }
}
