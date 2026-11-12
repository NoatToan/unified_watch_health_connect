package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Landroidx/compose/ui/node/OnGloballyPositionedModifierWrapper;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getProvidedAlignmentLines", "()Ljava/util/Set;", "providedAlignmentLines", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "wrapped", "modifier", "<init>", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/layout/OnGloballyPositionedModifier;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class OnGloballyPositionedModifierWrapper extends DelegatingLayoutNodeWrapper<OnGloballyPositionedModifier> {
    public OnGloballyPositionedModifierWrapper(@NotNull LayoutNodeWrapper layoutNodeWrapper, @NotNull OnGloballyPositionedModifier onGloballyPositionedModifier) {
        super(layoutNodeWrapper, onGloballyPositionedModifier);
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper, androidx.compose.ui.layout.LayoutCoordinates
    @NotNull
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        getLayoutNode();
        for (LayoutNodeWrapper wrapped = getWrapped(); wrapped != null; wrapped = wrapped.getWrapped()) {
            h.addAll(linkedHashSet, wrapped.getProvidedAlignmentLines());
            if (Intrinsics.areEqual(wrapped, getLayoutNode().getInnerLayoutNodeWrapper())) {
                break;
            }
        }
        return linkedHashSet;
    }
}
