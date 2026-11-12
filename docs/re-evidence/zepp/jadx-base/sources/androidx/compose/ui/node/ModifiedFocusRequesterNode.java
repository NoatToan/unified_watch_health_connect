package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.focus.FocusNodeUtilsKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016R(\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/node/ModifiedFocusRequesterNode;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/focus/FocusRequesterModifier;", "Landroidx/compose/ui/node/ModifiedFocusNode;", "findFocusNode$ui_release", "()Landroidx/compose/ui/node/ModifiedFocusNode;", "findFocusNode", "", "onModifierChanged", "attach", "detach", "Landroidx/compose/ui/focus/FocusRequester;", "value", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "wrapped", "modifier", "<init>", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/focus/FocusRequesterModifier;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class ModifiedFocusRequesterNode extends DelegatingLayoutNodeWrapper<FocusRequesterModifier> {

    @Nullable
    private FocusRequester focusRequester;

    public ModifiedFocusRequesterNode(@NotNull LayoutNodeWrapper layoutNodeWrapper, @NotNull FocusRequesterModifier focusRequesterModifier) {
        super(layoutNodeWrapper, focusRequesterModifier);
    }

    private final void setFocusRequester(FocusRequester focusRequester) {
        MutableVector<ModifiedFocusRequesterNode> focusRequesterNodes$ui_release;
        MutableVector<ModifiedFocusRequesterNode> focusRequesterNodes$ui_release2;
        FocusRequester focusRequester2 = this.focusRequester;
        if (focusRequester2 != null && (focusRequesterNodes$ui_release2 = focusRequester2.getFocusRequesterNodes$ui_release()) != null) {
            focusRequesterNodes$ui_release2.remove(this);
        }
        this.focusRequester = focusRequester;
        if (focusRequester == null || (focusRequesterNodes$ui_release = focusRequester.getFocusRequesterNodes$ui_release()) == null) {
            return;
        }
        focusRequesterNodes$ui_release.add(this);
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void attach() {
        super.attach();
        setFocusRequester(getModifier().getFocusRequester());
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void detach() {
        setFocusRequester(null);
        super.detach();
    }

    @Nullable
    public final ModifiedFocusNode findFocusNode$ui_release() {
        ModifiedFocusNode modifiedFocusNodeFindNextFocusWrapper = findNextFocusWrapper();
        return modifiedFocusNodeFindNextFocusWrapper == null ? FocusNodeUtilsKt.searchChildrenForFocusNode$default(getLayoutNode(), null, 1, null) : modifiedFocusNodeFindNextFocusWrapper;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void onModifierChanged() {
        super.onModifierChanged();
        setFocusRequester(getModifier().getFocusRequester());
    }
}
