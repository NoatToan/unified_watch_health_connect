package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusNodeUtilsKt;
import androidx.compose.ui.focus.FocusOrder;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\u0006\u0010\u0004\u001a\u00020\u0003J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\u0000H\u0016J\b\u0010\u000f\u001a\u00020\u0000H\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R$\u0010\b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u001e\u001a\u0004\u0018\u00010\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Landroidx/compose/ui/node/ModifiedFocusNode;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/geometry/Rect;", "focusRect", "", "focusableChildren", "Landroidx/compose/ui/focus/FocusState;", "focusState", "", "sendOnFocusEvent", "onModifierChanged", "attach", "detach", "findPreviousFocusWrapper", "findNextFocusWrapper", "propagateFocusEvent", "Landroidx/compose/ui/focus/FocusOrder;", "focusOrder", "populateFocusOrder", "Landroidx/compose/ui/focus/FocusStateImpl;", "value", "getFocusState", "()Landroidx/compose/ui/focus/FocusStateImpl;", "setFocusState", "(Landroidx/compose/ui/focus/FocusStateImpl;)V", "getFocusedChild", "()Landroidx/compose/ui/node/ModifiedFocusNode;", "setFocusedChild", "(Landroidx/compose/ui/node/ModifiedFocusNode;)V", "focusedChild", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "wrapped", "modifier", "<init>", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/focus/FocusModifier;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class ModifiedFocusNode extends DelegatingLayoutNodeWrapper<FocusModifier> {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr[FocusStateImpl.Disabled.ordinal()] = 4;
            iArr[FocusStateImpl.Inactive.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ModifiedFocusNode(@NotNull LayoutNodeWrapper layoutNodeWrapper, @NotNull FocusModifier focusModifier) {
        super(layoutNodeWrapper, focusModifier);
        focusModifier.setFocusNode(this);
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void attach() {
        super.attach();
        sendOnFocusEvent(getFocusState());
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void detach() {
        FocusManager focusManager;
        int i = WhenMappings.$EnumSwitchMapping$0[getFocusState().ordinal()];
        if (i == 1 || i == 2) {
            Owner owner$ui_release = getLayoutNode().getOwner();
            if (owner$ui_release != null && (focusManager = owner$ui_release.getFocusManager()) != null) {
                focusManager.clearFocus(true);
            }
        } else if (i == 3) {
            ModifiedFocusNode modifiedFocusNodeFindNextFocusWrapper = getWrapped().findNextFocusWrapper();
            if (modifiedFocusNodeFindNextFocusWrapper == null) {
                modifiedFocusNodeFindNextFocusWrapper = FocusNodeUtilsKt.searchChildrenForFocusNode$default(getLayoutNode(), null, 1, null);
            }
            if (modifiedFocusNodeFindNextFocusWrapper != null) {
                ModifiedFocusNode modifiedFocusNodeFindParentFocusNode$ui_release = findParentFocusNode$ui_release();
                if (modifiedFocusNodeFindParentFocusNode$ui_release != null) {
                    modifiedFocusNodeFindParentFocusNode$ui_release.getModifier().setFocusedChild(modifiedFocusNodeFindNextFocusWrapper);
                }
                sendOnFocusEvent(modifiedFocusNodeFindNextFocusWrapper.getFocusState());
            } else {
                sendOnFocusEvent(FocusStateImpl.Inactive);
            }
        }
        super.detach();
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.node.LayoutNodeWrapper
    @NotNull
    public ModifiedFocusNode findNextFocusWrapper() {
        return this;
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.node.LayoutNodeWrapper
    @NotNull
    public ModifiedFocusNode findPreviousFocusWrapper() {
        return this;
    }

    @NotNull
    public final Rect focusRect() {
        return LayoutCoordinatesKt.boundsInRoot(this);
    }

    @NotNull
    public final List<ModifiedFocusNode> focusableChildren() {
        ModifiedFocusNode modifiedFocusNodeFindNextFocusWrapper = getWrapped().findNextFocusWrapper();
        if (modifiedFocusNodeFindNextFocusWrapper != null) {
            return e.listOf(modifiedFocusNodeFindNextFocusWrapper);
        }
        ArrayList arrayList = new ArrayList();
        List<LayoutNode> children$ui_release = getLayoutNode().getChildren$ui_release();
        int i = 0;
        int size = children$ui_release.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                FocusNodeUtilsKt.findFocusableChildren(children$ui_release.get(i), arrayList);
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    @NotNull
    public final FocusStateImpl getFocusState() {
        return getModifier().getFocusState();
    }

    @Nullable
    public final ModifiedFocusNode getFocusedChild() {
        return getModifier().getFocusedChild();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void onModifierChanged() {
        super.onModifierChanged();
        sendOnFocusEvent(getFocusState());
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void populateFocusOrder(@NotNull FocusOrder focusOrder) {
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void propagateFocusEvent(@NotNull FocusState focusState) {
    }

    public final void sendOnFocusEvent(@NotNull FocusState focusState) {
        LayoutNodeWrapper wrappedBy$ui_release = getWrappedBy();
        if (wrappedBy$ui_release == null) {
            return;
        }
        wrappedBy$ui_release.propagateFocusEvent(focusState);
    }

    public final void setFocusState(@NotNull FocusStateImpl focusStateImpl) {
        getModifier().setFocusState(focusStateImpl);
        sendOnFocusEvent(focusStateImpl);
    }

    public final void setFocusedChild(@Nullable ModifiedFocusNode modifiedFocusNode) {
        getModifier().setFocusedChild(modifiedFocusNode);
    }
}
