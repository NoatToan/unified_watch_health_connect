package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "", "onGloballyPositioned", "ui_release"}, k = 1, mv = {1, 5, 1})
public interface OnGloballyPositionedModifier extends Modifier.Element {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static boolean all(@NotNull OnGloballyPositionedModifier onGloballyPositionedModifier, @NotNull Function1<? super Modifier.Element, Boolean> function1) {
            return Modifier.Element.DefaultImpls.all(onGloballyPositionedModifier, function1);
        }

        public static boolean any(@NotNull OnGloballyPositionedModifier onGloballyPositionedModifier, @NotNull Function1<? super Modifier.Element, Boolean> function1) {
            return Modifier.Element.DefaultImpls.any(onGloballyPositionedModifier, function1);
        }

        public static <R> R foldIn(@NotNull OnGloballyPositionedModifier onGloballyPositionedModifier, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
            return (R) Modifier.Element.DefaultImpls.foldIn(onGloballyPositionedModifier, r, function2);
        }

        public static <R> R foldOut(@NotNull OnGloballyPositionedModifier onGloballyPositionedModifier, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
            return (R) Modifier.Element.DefaultImpls.foldOut(onGloballyPositionedModifier, r, function2);
        }

        @NotNull
        public static Modifier then(@NotNull OnGloballyPositionedModifier onGloballyPositionedModifier, @NotNull Modifier modifier) {
            return Modifier.Element.DefaultImpls.then(onGloballyPositionedModifier, modifier);
        }
    }

    void onGloballyPositioned(@NotNull LayoutCoordinates coordinates);
}
