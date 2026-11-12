package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusNodeUtilsKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.focus.FocusStateImpl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"Landroidx/compose/ui/node/ModifiedFocusEventNode;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/focus/FocusEventModifier;", "Landroidx/compose/ui/focus/FocusState;", "focusState", "", "propagateFocusEvent", "onModifierChanged", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "wrapped", "modifier", "<init>", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/focus/FocusEventModifier;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class ModifiedFocusEventNode extends DelegatingLayoutNodeWrapper<FocusEventModifier> {
    public ModifiedFocusEventNode(@NotNull LayoutNodeWrapper layoutNodeWrapper, @NotNull FocusEventModifier focusEventModifier) {
        super(layoutNodeWrapper, focusEventModifier);
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void onModifierChanged() {
        FocusModifier modifier;
        super.onModifierChanged();
        ModifiedFocusNode modifiedFocusNodeFindNextFocusWrapper = getWrapped().findNextFocusWrapper();
        FocusStateImpl focusState = null;
        if (modifiedFocusNodeFindNextFocusWrapper == null) {
            modifiedFocusNodeFindNextFocusWrapper = FocusNodeUtilsKt.searchChildrenForFocusNode$default(getLayoutNode(), null, 1, null);
        }
        FocusEventModifier modifier2 = getModifier();
        if (modifiedFocusNodeFindNextFocusWrapper != null && (modifier = modifiedFocusNodeFindNextFocusWrapper.getModifier()) != null) {
            focusState = modifier.getFocusState();
        }
        if (focusState == null) {
            focusState = FocusStateImpl.Inactive;
        }
        modifier2.onFocusEvent(focusState);
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void propagateFocusEvent(@NotNull FocusState focusState) {
        getModifier().onFocusEvent(focusState);
        super.propagateFocusEvent(focusState);
    }
}
