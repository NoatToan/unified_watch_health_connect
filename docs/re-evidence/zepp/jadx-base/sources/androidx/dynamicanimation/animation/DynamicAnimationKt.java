package androidx.dynamicanimation.animation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u001a2\u0010\n\u001a\u00020\t2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0001\u001a&\u0010\u000e\u001a\u00020\t*\u00020\t2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\fH\u0086\b\u001a*\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0002¨\u0006\u0011"}, d2 = {"Lkotlin/Function1;", "", "", "setter", "Lkotlin/Function0;", "getter", "Landroidx/dynamicanimation/animation/FlingAnimation;", "flingAnimationOf", "finalPosition", "Landroidx/dynamicanimation/animation/SpringAnimation;", "springAnimationOf", "Landroidx/dynamicanimation/animation/SpringForce;", "Lkotlin/ExtensionFunctionType;", "func", "withSpringForceProperties", "Landroidx/dynamicanimation/animation/FloatValueHolder;", "createFloatValueHolder", "dynamicanimation-ktx_release"}, k = 2, mv = {1, 4, 0})
public final class DynamicAnimationKt {
    private static final FloatValueHolder createFloatValueHolder(final Function1<? super Float, Unit> function1, final Function0<Float> function0) {
        return new FloatValueHolder() { // from class: androidx.dynamicanimation.animation.DynamicAnimationKt.createFloatValueHolder.1
            @Override // androidx.dynamicanimation.animation.FloatValueHolder
            public float getValue() {
                return ((Number) function0.invoke()).floatValue();
            }

            @Override // androidx.dynamicanimation.animation.FloatValueHolder
            public void setValue(float value) {
                function1.invoke(Float.valueOf(value));
            }
        };
    }

    @NotNull
    public static final FlingAnimation flingAnimationOf(@NotNull Function1<? super Float, Unit> function1, @NotNull Function0<Float> function0) {
        return new FlingAnimation(createFloatValueHolder(function1, function0));
    }

    @NotNull
    public static final SpringAnimation springAnimationOf(@NotNull Function1<? super Float, Unit> function1, @NotNull Function0<Float> function0, float f) {
        FloatValueHolder floatValueHolderCreateFloatValueHolder = createFloatValueHolder(function1, function0);
        return Float.isNaN(f) ? new SpringAnimation(floatValueHolderCreateFloatValueHolder) : new SpringAnimation(floatValueHolderCreateFloatValueHolder, f);
    }

    public static /* synthetic */ SpringAnimation springAnimationOf$default(Function1 function1, Function0 function0, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            f = FloatCompanionObject.INSTANCE.getNaN();
        }
        return springAnimationOf(function1, function0, f);
    }

    @NotNull
    public static final SpringAnimation withSpringForceProperties(@NotNull SpringAnimation springAnimation, @NotNull Function1<? super SpringForce, Unit> function1) {
        if (springAnimation.getSpring() == null) {
            springAnimation.setSpring(new SpringForce());
        }
        function1.invoke(springAnimation.getSpring());
        return springAnimation;
    }
}
