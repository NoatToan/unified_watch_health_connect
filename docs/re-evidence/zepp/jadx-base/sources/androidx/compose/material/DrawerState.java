package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B%\u0012\u0006\u0010$\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140%¢\u0006\u0004\b'\u0010(J\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J)\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0015\u001a\u00020\u00148F@\u0006¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u00020\u00148F@\u0006¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u001a\u001a\u00020\u00068F@\u0006¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001b\u001a\u00020\u00148F@\u0006¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u001c\u0010\u0007\u001a\u00020\u00068G@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0019R\"\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u001f8G@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001e\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/compose/material/DrawerState;", "", "", "open", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "Landroidx/compose/material/DrawerValue;", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "anim", "animateTo", "(Landroidx/compose/material/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "(Landroidx/compose/material/DrawerValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/material/SwipeableState;", "swipeableState", "Landroidx/compose/material/SwipeableState;", "getSwipeableState$material_release", "()Landroidx/compose/material/SwipeableState;", "", "isOpen", "()Z", "isClosed", "getCurrentValue", "()Landroidx/compose/material/DrawerValue;", "currentValue", "isAnimationRunning", "getTargetValue", "getTargetValue$annotations", "()V", "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", "getOffset$annotations", "offset", "initialValue", "Lkotlin/Function1;", "confirmStateChange", "<init>", "(Landroidx/compose/material/DrawerValue;Lkotlin/jvm/functions/Function1;)V", "Companion", "material_release"}, k = 1, mv = {1, 5, 1})
public final class DrawerState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final SwipeableState<DrawerValue> swipeableState;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u000b"}, d2 = {"Landroidx/compose/material/DrawerState$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/material/DrawerValue;", "", "confirmStateChange", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/DrawerState;", "Saver", "<init>", "()V", "material_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<DrawerState, DrawerValue> Saver(@NotNull final Function1<? super DrawerValue, Boolean> confirmStateChange) {
            return SaverKt.Saver(new Function2<SaverScope, DrawerState, DrawerValue>() { // from class: androidx.compose.material.DrawerState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final DrawerValue invoke(@NotNull SaverScope saverScope, @NotNull DrawerState drawerState) {
                    return drawerState.getCurrentValue();
                }
            }, new Function1<DrawerValue, DrawerState>() { // from class: androidx.compose.material.DrawerState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final DrawerState invoke(@NotNull DrawerValue drawerValue) {
                    return new DrawerState(drawerValue, confirmStateChange);
                }
            });
        }
    }

    public DrawerState(@NotNull DrawerValue drawerValue, @NotNull Function1<? super DrawerValue, Boolean> function1) {
        this.swipeableState = new SwipeableState<>(drawerValue, DrawerKt.AnimationSpec, function1);
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getOffset$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getTargetValue$annotations() {
    }

    @ExperimentalMaterialApi
    @Nullable
    public final Object animateTo(@NotNull DrawerValue drawerValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo = getSwipeableState$material_release().animateTo(drawerValue, animationSpec, continuation);
        return objAnimateTo == a.getCOROUTINE_SUSPENDED() ? objAnimateTo : Unit.INSTANCE;
    }

    @Nullable
    public final Object close(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo = animateTo(DrawerValue.Closed, DrawerKt.AnimationSpec, continuation);
        return objAnimateTo == a.getCOROUTINE_SUSPENDED() ? objAnimateTo : Unit.INSTANCE;
    }

    @NotNull
    public final DrawerValue getCurrentValue() {
        return this.swipeableState.getCurrentValue();
    }

    @ExperimentalMaterialApi
    @NotNull
    public final State<Float> getOffset() {
        return this.swipeableState.getOffset();
    }

    @NotNull
    public final SwipeableState<DrawerValue> getSwipeableState$material_release() {
        return this.swipeableState;
    }

    @ExperimentalMaterialApi
    @NotNull
    public final DrawerValue getTargetValue() {
        return this.swipeableState.getTargetValue();
    }

    public final boolean isAnimationRunning() {
        return this.swipeableState.isAnimationRunning();
    }

    public final boolean isClosed() {
        return getCurrentValue() == DrawerValue.Closed;
    }

    public final boolean isOpen() {
        return getCurrentValue() == DrawerValue.Open;
    }

    @Nullable
    public final Object open(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo = animateTo(DrawerValue.Open, DrawerKt.AnimationSpec, continuation);
        return objAnimateTo == a.getCOROUTINE_SUSPENDED() ? objAnimateTo : Unit.INSTANCE;
    }

    @ExperimentalMaterialApi
    @Nullable
    public final Object snapTo(@NotNull DrawerValue drawerValue, @NotNull Continuation<? super Unit> continuation) {
        Object objSnapTo = getSwipeableState$material_release().snapTo(drawerValue, continuation);
        return objSnapTo == a.getCOROUTINE_SUSPENDED() ? objSnapTo : Unit.INSTANCE;
    }

    public /* synthetic */ DrawerState(DrawerValue drawerValue, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawerValue, (i & 2) != 0 ? new Function1<DrawerValue, Boolean>() { // from class: androidx.compose.material.DrawerState.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull DrawerValue drawerValue2) {
                return Boolean.TRUE;
            }
        } : function1);
    }
}
