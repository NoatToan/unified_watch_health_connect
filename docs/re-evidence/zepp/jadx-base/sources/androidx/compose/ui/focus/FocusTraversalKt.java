package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.ModifiedFocusNode;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000\u001a)\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\"\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/ModifiedFocusNode;", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "", "moveFocus-Mxy_nc0", "(Landroidx/compose/ui/node/ModifiedFocusNode;I)Z", "moveFocus", "findActiveFocusNode", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/focus/FocusRequester;", "customFocusSearch--OM-vw8", "(Landroidx/compose/ui/node/ModifiedFocusNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;", "customFocusSearch", "", "invalidFocusDirection", "Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class FocusTraversalKt {

    @NotNull
    private static final String invalidFocusDirection = "Invalid FocusDirection";

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Rtl.ordinal()] = 1;
            iArr[LayoutDirection.Ltr.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            iArr2[FocusStateImpl.Active.ordinal()] = 1;
            iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            iArr2[FocusStateImpl.Disabled.ordinal()] = 5;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: customFocusSearch--OM-vw8, reason: not valid java name */
    private static final FocusRequester m942customFocusSearchOMvw8(ModifiedFocusNode modifiedFocusNode, int i, LayoutDirection layoutDirection) {
        FocusRequester start;
        FocusRequester end;
        FocusOrder focusOrder = new FocusOrder();
        LayoutNodeWrapper wrappedBy = modifiedFocusNode.getWrappedBy();
        if (wrappedBy != null) {
            wrappedBy.populateFocusOrder(focusOrder);
        }
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m927equalsimpl0(i, companion.m936getNextdhqQ8s())) {
            return focusOrder.getNext();
        }
        if (FocusDirection.m927equalsimpl0(i, companion.m938getPreviousdhqQ8s())) {
            return focusOrder.getPrevious();
        }
        if (FocusDirection.m927equalsimpl0(i, companion.m940getUpdhqQ8s())) {
            return focusOrder.getUp();
        }
        if (FocusDirection.m927equalsimpl0(i, companion.m933getDowndhqQ8s())) {
            return focusOrder.getDown();
        }
        if (FocusDirection.m927equalsimpl0(i, companion.m935getLeftdhqQ8s())) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 == 1) {
                end = focusOrder.getEnd();
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                end = focusOrder.getStart();
            }
            if (Intrinsics.areEqual(end, FocusRequester.INSTANCE.getDefault())) {
                end = null;
            }
            return end == null ? focusOrder.getLeft() : end;
        }
        if (!FocusDirection.m927equalsimpl0(i, companion.m939getRightdhqQ8s())) {
            if (FocusDirection.m927equalsimpl0(i, companion.m934getIndhqQ8s())) {
                return FocusRequester.INSTANCE.getDefault();
            }
            if (FocusDirection.m927equalsimpl0(i, companion.m937getOutdhqQ8s())) {
                return FocusRequester.INSTANCE.getDefault();
            }
            throw new IllegalStateException(invalidFocusDirection.toString());
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i3 == 1) {
            start = focusOrder.getStart();
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            start = focusOrder.getEnd();
        }
        if (Intrinsics.areEqual(start, FocusRequester.INSTANCE.getDefault())) {
            start = null;
        }
        return start == null ? focusOrder.getRight() : start;
    }

    @Nullable
    public static final ModifiedFocusNode findActiveFocusNode(@NotNull ModifiedFocusNode modifiedFocusNode) {
        int i = WhenMappings.$EnumSwitchMapping$1[modifiedFocusNode.getFocusState().ordinal()];
        if (i == 1 || i == 2) {
            return modifiedFocusNode;
        }
        if (i == 3) {
            ModifiedFocusNode focusedChild = modifiedFocusNode.getFocusedChild();
            if (focusedChild != null) {
                return findActiveFocusNode(focusedChild);
            }
        } else if (i != 4 && i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    /* JADX INFO: renamed from: moveFocus-Mxy_nc0, reason: not valid java name */
    public static final boolean m943moveFocusMxy_nc0(@NotNull ModifiedFocusNode modifiedFocusNode, int i) {
        ModifiedFocusNode modifiedFocusNodeFindParentFocusNode$ui_release;
        int iM935getLeftdhqQ8s;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        ModifiedFocusNode modifiedFocusNodeFindActiveFocusNode = findActiveFocusNode(modifiedFocusNode);
        if (modifiedFocusNodeFindActiveFocusNode == null) {
            return false;
        }
        FocusRequester focusRequesterM942customFocusSearchOMvw8 = m942customFocusSearchOMvw8(modifiedFocusNodeFindActiveFocusNode, i, layoutDirection);
        if (!Intrinsics.areEqual(focusRequesterM942customFocusSearchOMvw8, FocusRequester.INSTANCE.getDefault())) {
            focusRequesterM942customFocusSearchOMvw8.requestFocus();
            return true;
        }
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m927equalsimpl0(i, companion.m936getNextdhqQ8s()) ? true : FocusDirection.m927equalsimpl0(i, companion.m938getPreviousdhqQ8s())) {
            modifiedFocusNodeFindParentFocusNode$ui_release = null;
        } else {
            if (FocusDirection.m927equalsimpl0(i, companion.m935getLeftdhqQ8s()) ? true : FocusDirection.m927equalsimpl0(i, companion.m939getRightdhqQ8s()) ? true : FocusDirection.m927equalsimpl0(i, companion.m940getUpdhqQ8s()) ? true : FocusDirection.m927equalsimpl0(i, companion.m933getDowndhqQ8s())) {
                modifiedFocusNodeFindParentFocusNode$ui_release = TwoDimensionalFocusSearchKt.m948twoDimensionalFocusSearchMxy_nc0(modifiedFocusNode, i);
            } else if (FocusDirection.m927equalsimpl0(i, companion.m934getIndhqQ8s())) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
                if (i2 == 1) {
                    iM935getLeftdhqQ8s = companion.m935getLeftdhqQ8s();
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iM935getLeftdhqQ8s = companion.m939getRightdhqQ8s();
                }
                modifiedFocusNodeFindParentFocusNode$ui_release = TwoDimensionalFocusSearchKt.m948twoDimensionalFocusSearchMxy_nc0(modifiedFocusNodeFindActiveFocusNode, iM935getLeftdhqQ8s);
            } else {
                if (!FocusDirection.m927equalsimpl0(i, companion.m937getOutdhqQ8s())) {
                    throw new IllegalStateException(invalidFocusDirection.toString());
                }
                modifiedFocusNodeFindParentFocusNode$ui_release = modifiedFocusNodeFindActiveFocusNode.findParentFocusNode$ui_release();
            }
        }
        if (modifiedFocusNodeFindParentFocusNode$ui_release == null) {
            return false;
        }
        FocusTransactionsKt.requestFocus(modifiedFocusNodeFindParentFocusNode$ui_release, false);
        return true;
    }
}
