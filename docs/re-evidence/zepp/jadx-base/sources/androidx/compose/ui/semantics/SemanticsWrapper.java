package androidx.compose.ui.semantics;

import androidx.compose.ui.node.DelegatingLayoutNodeWrapper;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.Owner;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J+\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsWrapper;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/semantics/SemanticsModifier;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "collapsedSemanticsConfiguration", "", "detach", "onModifierChanged", "", "toString", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "", "hitSemanticsWrappers", "hitTestSemantics-3MmeM6k", "(JLjava/util/List;)V", "hitTestSemantics", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "wrapped", "semanticsModifier", "<init>", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/semantics/SemanticsModifier;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class SemanticsWrapper extends DelegatingLayoutNodeWrapper<SemanticsModifier> {
    public SemanticsWrapper(@NotNull LayoutNodeWrapper layoutNodeWrapper, @NotNull SemanticsModifier semanticsModifier) {
        super(layoutNodeWrapper, semanticsModifier);
    }

    @NotNull
    public final SemanticsConfiguration collapsedSemanticsConfiguration() {
        SemanticsWrapper semanticsWrapper;
        LayoutNodeWrapper wrapped = getWrapped();
        while (true) {
            if (wrapped == null) {
                semanticsWrapper = null;
                break;
            }
            if (wrapped instanceof SemanticsWrapper) {
                semanticsWrapper = (SemanticsWrapper) wrapped;
                break;
            }
            wrapped = wrapped.getWrapped();
        }
        if (semanticsWrapper == null || getModifier().getSemanticsConfiguration().getIsClearingSemantics()) {
            return getModifier().getSemanticsConfiguration();
        }
        SemanticsConfiguration semanticsConfigurationCopy = getModifier().getSemanticsConfiguration().copy();
        semanticsConfigurationCopy.collapsePeer$ui_release(semanticsWrapper.collapsedSemanticsConfiguration());
        return semanticsConfigurationCopy;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void detach() {
        super.detach();
        Owner owner = getLayoutNode().getOwner();
        if (owner == null) {
            return;
        }
        owner.onSemanticsChange();
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.node.LayoutNodeWrapper
    /* JADX INFO: renamed from: hitTestSemantics-3MmeM6k */
    public void mo2554hitTestSemantics3MmeM6k(long pointerPosition, @NotNull List<SemanticsWrapper> hitSemanticsWrappers) {
        if (m2572isPointerInBoundsk4lQ0M(pointerPosition) && m2575withinLayerBoundsk4lQ0M(pointerPosition)) {
            hitSemanticsWrappers.add(this);
            getWrapped().mo2554hitTestSemantics3MmeM6k(getWrapped().m2570fromParentPositionMKHz9U(pointerPosition), hitSemanticsWrappers);
        }
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void onModifierChanged() {
        super.onModifierChanged();
        Owner owner = getLayoutNode().getOwner();
        if (owner == null) {
            return;
        }
        owner.onSemanticsChange();
    }

    @NotNull
    public String toString() {
        return super.toString() + " id: " + getModifier().getId() + " config: " + getModifier().getSemanticsConfiguration();
    }
}
