package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.Modifier;
import com.huami.watch.companion.esim.AbsEsimOperation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "getDispatcher", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", AbsEsimOperation.HEADER_CONNECTION, "ui_release"}, k = 1, mv = {1, 5, 1})
public interface NestedScrollModifier extends Modifier.Element {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static boolean all(@NotNull NestedScrollModifier nestedScrollModifier, @NotNull Function1<? super Modifier.Element, Boolean> function1) {
            return Modifier.Element.DefaultImpls.all(nestedScrollModifier, function1);
        }

        public static boolean any(@NotNull NestedScrollModifier nestedScrollModifier, @NotNull Function1<? super Modifier.Element, Boolean> function1) {
            return Modifier.Element.DefaultImpls.any(nestedScrollModifier, function1);
        }

        public static <R> R foldIn(@NotNull NestedScrollModifier nestedScrollModifier, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
            return (R) Modifier.Element.DefaultImpls.foldIn(nestedScrollModifier, r, function2);
        }

        public static <R> R foldOut(@NotNull NestedScrollModifier nestedScrollModifier, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
            return (R) Modifier.Element.DefaultImpls.foldOut(nestedScrollModifier, r, function2);
        }

        @NotNull
        public static Modifier then(@NotNull NestedScrollModifier nestedScrollModifier, @NotNull Modifier modifier) {
            return Modifier.Element.DefaultImpls.then(nestedScrollModifier, modifier);
        }
    }

    @NotNull
    NestedScrollConnection getConnection();

    @NotNull
    NestedScrollDispatcher getDispatcher();
}
