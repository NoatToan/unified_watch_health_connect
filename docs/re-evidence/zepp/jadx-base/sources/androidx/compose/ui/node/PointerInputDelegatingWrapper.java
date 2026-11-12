package androidx.compose.ui.node;

import androidx.compose.ui.input.pointer.PointerInputFilter;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR$\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/node/PointerInputDelegatingWrapper;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/input/pointer/PointerInputModifier;", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "hitPointerInputFilters", "", "hitTest-3MmeM6k", "(JLjava/util/List;)V", "hitTest", "value", "getModifier", "()Landroidx/compose/ui/input/pointer/PointerInputModifier;", "setModifier", "(Landroidx/compose/ui/input/pointer/PointerInputModifier;)V", "modifier", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "wrapped", "pointerInputModifier", "<init>", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/input/pointer/PointerInputModifier;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class PointerInputDelegatingWrapper extends DelegatingLayoutNodeWrapper<PointerInputModifier> {
    public PointerInputDelegatingWrapper(@NotNull LayoutNodeWrapper layoutNodeWrapper, @NotNull PointerInputModifier pointerInputModifier) {
        super(layoutNodeWrapper, pointerInputModifier);
        pointerInputModifier.getPointerInputFilter().setLayoutCoordinates$ui_release(this);
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.node.LayoutNodeWrapper
    /* JADX INFO: renamed from: hitTest-3MmeM6k */
    public void mo2553hitTest3MmeM6k(long pointerPosition, @NotNull List<PointerInputFilter> hitPointerInputFilters) {
        if (m2572isPointerInBoundsk4lQ0M(pointerPosition) && m2575withinLayerBoundsk4lQ0M(pointerPosition)) {
            hitPointerInputFilters.add(getModifier().getPointerInputFilter());
            getWrapped().mo2553hitTest3MmeM6k(getWrapped().m2570fromParentPositionMKHz9U(pointerPosition), hitPointerInputFilters);
        }
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    @NotNull
    public PointerInputModifier getModifier() {
        return (PointerInputModifier) super.getModifier();
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    public void setModifier(@NotNull PointerInputModifier pointerInputModifier) {
        super.setModifier(pointerInputModifier);
        pointerInputModifier.getPointerInputFilter().setLayoutCoordinates$ui_release(this);
    }
}
