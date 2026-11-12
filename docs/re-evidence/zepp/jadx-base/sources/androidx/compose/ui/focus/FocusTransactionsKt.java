package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifiedFocusNode;
import androidx.compose.ui.node.Owner;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0016\u0010\b\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\f\u0010\f\u001a\u00020\u0001*\u00020\u0000H\u0002¨\u0006\r"}, d2 = {"Landroidx/compose/ui/node/ModifiedFocusNode;", "", "propagateFocus", "", "requestFocus", "captureFocus", "freeFocus", "forcedClear", "clearFocus", "grantFocus", "childNode", "requestFocusForChild", "requestFocusForOwner", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class FocusTransactionsKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.Disabled.ordinal()] = 3;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 4;
            iArr[FocusStateImpl.Inactive.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean captureFocus(@NotNull ModifiedFocusNode modifiedFocusNode) {
        int i = WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode.getFocusState().ordinal()];
        if (i != 1) {
            return i == 2;
        }
        modifiedFocusNode.setFocusState(FocusStateImpl.Captured);
        return true;
    }

    public static final boolean clearFocus(@NotNull ModifiedFocusNode modifiedFocusNode, boolean z) {
        int i = WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode.getFocusState().ordinal()];
        if (i == 1) {
            modifiedFocusNode.setFocusState(FocusStateImpl.Inactive);
        } else {
            if (i == 2) {
                if (!z) {
                    return z;
                }
                modifiedFocusNode.setFocusState(FocusStateImpl.Inactive);
                return z;
            }
            if (i != 3) {
                if (i == 4) {
                    ModifiedFocusNode focusedChild = modifiedFocusNode.getFocusedChild();
                    if (focusedChild == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    boolean zClearFocus = clearFocus(focusedChild, z);
                    if (!zClearFocus) {
                        return zClearFocus;
                    }
                    modifiedFocusNode.setFocusState(FocusStateImpl.Inactive);
                    modifiedFocusNode.setFocusedChild(null);
                    return zClearFocus;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return true;
    }

    public static /* synthetic */ boolean clearFocus$default(ModifiedFocusNode modifiedFocusNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return clearFocus(modifiedFocusNode, z);
    }

    public static final boolean freeFocus(@NotNull ModifiedFocusNode modifiedFocusNode) {
        int i = WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode.getFocusState().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        modifiedFocusNode.setFocusState(FocusStateImpl.Active);
        return true;
    }

    private static final void grantFocus(ModifiedFocusNode modifiedFocusNode, boolean z) {
        ModifiedFocusNode modifiedFocusNode2 = (ModifiedFocusNode) CollectionsKt.firstOrNull((List) modifiedFocusNode.focusableChildren());
        if (modifiedFocusNode2 == null || !z) {
            modifiedFocusNode.setFocusState(FocusStateImpl.Active);
            return;
        }
        modifiedFocusNode.setFocusState(FocusStateImpl.ActiveParent);
        modifiedFocusNode.setFocusedChild(modifiedFocusNode2);
        grantFocus(modifiedFocusNode2, z);
    }

    public static final void requestFocus(@NotNull ModifiedFocusNode modifiedFocusNode, boolean z) {
        int i = WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode.getFocusState().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            modifiedFocusNode.sendOnFocusEvent(modifiedFocusNode.getFocusState());
            return;
        }
        if (i != 4) {
            if (i != 5) {
                return;
            }
            ModifiedFocusNode modifiedFocusNodeFindParentFocusNode$ui_release = modifiedFocusNode.findParentFocusNode$ui_release();
            if (modifiedFocusNodeFindParentFocusNode$ui_release != null) {
                requestFocusForChild(modifiedFocusNodeFindParentFocusNode$ui_release, modifiedFocusNode, z);
                return;
            } else {
                if (requestFocusForOwner(modifiedFocusNode)) {
                    grantFocus(modifiedFocusNode, z);
                    return;
                }
                return;
            }
        }
        ModifiedFocusNode focusedChild = modifiedFocusNode.getFocusedChild();
        if (focusedChild == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (z) {
            modifiedFocusNode.sendOnFocusEvent(modifiedFocusNode.getFocusState());
        } else if (clearFocus$default(focusedChild, false, 1, null)) {
            grantFocus(modifiedFocusNode, z);
            modifiedFocusNode.setFocusedChild(null);
        }
    }

    public static /* synthetic */ void requestFocus$default(ModifiedFocusNode modifiedFocusNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        requestFocus(modifiedFocusNode, z);
    }

    private static final boolean requestFocusForChild(ModifiedFocusNode modifiedFocusNode, ModifiedFocusNode modifiedFocusNode2, boolean z) {
        if (!modifiedFocusNode.focusableChildren().contains(modifiedFocusNode2)) {
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        int i = WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode.getFocusState().ordinal()];
        if (i == 1) {
            modifiedFocusNode.setFocusState(FocusStateImpl.ActiveParent);
            modifiedFocusNode.setFocusedChild(modifiedFocusNode2);
            grantFocus(modifiedFocusNode2, z);
            return true;
        }
        if (i != 2) {
            if (i == 3) {
                throw new IllegalStateException("non root FocusNode needs a focusable parent".toString());
            }
            if (i == 4) {
                ModifiedFocusNode focusedChild = modifiedFocusNode.getFocusedChild();
                if (focusedChild == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                if (clearFocus$default(focusedChild, false, 1, null)) {
                    modifiedFocusNode.setFocusedChild(modifiedFocusNode2);
                    grantFocus(modifiedFocusNode2, z);
                    return true;
                }
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                ModifiedFocusNode modifiedFocusNodeFindParentFocusNode$ui_release = modifiedFocusNode.findParentFocusNode$ui_release();
                if (modifiedFocusNodeFindParentFocusNode$ui_release == null) {
                    if (requestFocusForOwner(modifiedFocusNode)) {
                        modifiedFocusNode.setFocusState(FocusStateImpl.Active);
                        return requestFocusForChild(modifiedFocusNode, modifiedFocusNode2, z);
                    }
                } else if (requestFocusForChild(modifiedFocusNodeFindParentFocusNode$ui_release, modifiedFocusNode, false)) {
                    return requestFocusForChild(modifiedFocusNode, modifiedFocusNode2, z);
                }
            }
        }
        return false;
    }

    private static final boolean requestFocusForOwner(ModifiedFocusNode modifiedFocusNode) {
        Owner owner$ui_release = modifiedFocusNode.getLayoutNode().getOwner();
        if (owner$ui_release != null) {
            return owner$ui_release.requestFocus();
        }
        throw new IllegalArgumentException("Owner not initialized.".toString());
    }
}
