package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDelegatingWrapper;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/layout/RelocationRequesterModifier;", "Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "", "bringIntoView", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class RelocationRequesterModifier implements OnGloballyPositionedModifier {
    public LayoutCoordinates coordinates;

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return OnGloballyPositionedModifier.DefaultImpls.all(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return OnGloballyPositionedModifier.DefaultImpls.any(this, function1);
    }

    public final void bringIntoView() {
        LayoutCoordinates coordinates = getCoordinates();
        if (!(coordinates instanceof LayoutNodeWrapper)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        LayoutNodeWrapper layoutNodeWrapper = (LayoutNodeWrapper) coordinates;
        NestedScrollDelegatingWrapper nestedScrollDelegatingWrapperFindPreviousNestedScrollWrapper = layoutNodeWrapper.findPreviousNestedScrollWrapper();
        if (nestedScrollDelegatingWrapperFindPreviousNestedScrollWrapper != null) {
            RelocationRequesterModifierKt.bringIntoView(nestedScrollDelegatingWrapperFindPreviousNestedScrollWrapper, getCoordinates());
        }
        Owner owner = layoutNodeWrapper.getLayoutNode().getOwner();
        if (owner == null) {
            return;
        }
        owner.requestRectangleOnScreen(LayoutCoordinatesKt.boundsInRoot(getCoordinates()));
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldIn(R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
        return (R) OnGloballyPositionedModifier.DefaultImpls.foldIn(this, r, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldOut(R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
        return (R) OnGloballyPositionedModifier.DefaultImpls.foldOut(this, r, function2);
    }

    @NotNull
    public final LayoutCoordinates getCoordinates() {
        LayoutCoordinates layoutCoordinates = this.coordinates;
        if (layoutCoordinates != null) {
            return layoutCoordinates;
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(@NotNull LayoutCoordinates coordinates) {
        setCoordinates(coordinates);
    }

    public final void setCoordinates(@NotNull LayoutCoordinates layoutCoordinates) {
        this.coordinates = layoutCoordinates;
    }

    @Override // androidx.compose.ui.Modifier
    @NotNull
    public Modifier then(@NotNull Modifier modifier) {
        return OnGloballyPositionedModifier.DefaultImpls.then(this, modifier);
    }
}
