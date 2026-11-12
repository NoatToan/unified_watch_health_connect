package com.mapbox.maps.plugin.locationcomponent.animators;

import android.animation.ValueAnimator;
import e23.a;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class PuckAnimator$1$1 extends w implements a<Unit> {
    final /* synthetic */ ValueAnimator $it;
    final /* synthetic */ PuckAnimator<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PuckAnimator$1$1(ValueAnimator valueAnimator, PuckAnimator<T> puckAnimator) {
        super(0);
        this.$it = valueAnimator;
        this.this$0 = puckAnimator;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Object animatedValue = this.$it.getAnimatedValue();
        this.this$0.updateLayer(this.$it.getAnimatedFraction(), animatedValue);
        l updateListener$plugin_locationcomponent_release = this.this$0.getUpdateListener$plugin_locationcomponent_release();
        if (updateListener$plugin_locationcomponent_release != null) {
            updateListener$plugin_locationcomponent_release.invoke(animatedValue);
        }
    }

    @Override // e23.a
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
