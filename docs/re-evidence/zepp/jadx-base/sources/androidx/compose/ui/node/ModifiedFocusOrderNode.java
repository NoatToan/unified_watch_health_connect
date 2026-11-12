package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusOrder;
import androidx.compose.ui.focus.FocusOrderModifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/ui/node/ModifiedFocusOrderNode;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/focus/FocusOrderModifier;", "Landroidx/compose/ui/focus/FocusOrder;", "focusOrder", "", "populateFocusOrder", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "wrapped", "modifier", "<init>", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/focus/FocusOrderModifier;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class ModifiedFocusOrderNode extends DelegatingLayoutNodeWrapper<FocusOrderModifier> {
    public ModifiedFocusOrderNode(@NotNull LayoutNodeWrapper layoutNodeWrapper, @NotNull FocusOrderModifier focusOrderModifier) {
        super(layoutNodeWrapper, focusOrderModifier);
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void populateFocusOrder(@NotNull FocusOrder focusOrder) {
        getModifier().populateFocusOrder(focusOrder);
        super.populateFocusOrder(focusOrder);
    }
}
