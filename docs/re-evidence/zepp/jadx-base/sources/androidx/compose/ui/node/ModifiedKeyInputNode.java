package androidx.compose.ui.node;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0000H\u0016J\b\u0010\u0004\u001a\u00020\u0000H\u0016J\u001b\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/node/ModifiedKeyInputNode;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/input/key/KeyInputModifier;", "findPreviousKeyInputWrapper", "findNextKeyInputWrapper", "Landroidx/compose/ui/input/key/KeyEvent;", "keyEvent", "", "propagatePreviewKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "propagatePreviewKeyEvent", "propagateKeyEvent-ZmokQxo", "propagateKeyEvent", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "wrapped", "modifier", "<init>", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/input/key/KeyInputModifier;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class ModifiedKeyInputNode extends DelegatingLayoutNodeWrapper<KeyInputModifier> {
    public ModifiedKeyInputNode(@NotNull LayoutNodeWrapper layoutNodeWrapper, @NotNull KeyInputModifier keyInputModifier) {
        super(layoutNodeWrapper, keyInputModifier);
        keyInputModifier.setKeyInputNode(this);
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.node.LayoutNodeWrapper
    @NotNull
    public ModifiedKeyInputNode findNextKeyInputWrapper() {
        return this;
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.node.LayoutNodeWrapper
    @NotNull
    public ModifiedKeyInputNode findPreviousKeyInputWrapper() {
        return this;
    }

    /* JADX INFO: renamed from: propagateKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean m2580propagateKeyEventZmokQxo(@NotNull KeyEvent keyEvent) {
        Function1<androidx.compose.ui.input.key.KeyEvent, Boolean> onKeyEvent = getModifier().getOnKeyEvent();
        Boolean boolInvoke = onKeyEvent == null ? null : onKeyEvent.invoke(androidx.compose.ui.input.key.KeyEvent.m2311boximpl(keyEvent));
        if (Intrinsics.areEqual(boolInvoke, Boolean.TRUE)) {
            return boolInvoke.booleanValue();
        }
        ModifiedKeyInputNode modifiedKeyInputNodeFindParentKeyInputNode$ui_release = findParentKeyInputNode$ui_release();
        if (modifiedKeyInputNodeFindParentKeyInputNode$ui_release == null) {
            return false;
        }
        return modifiedKeyInputNodeFindParentKeyInputNode$ui_release.m2580propagateKeyEventZmokQxo(keyEvent);
    }

    /* JADX INFO: renamed from: propagatePreviewKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean m2581propagatePreviewKeyEventZmokQxo(@NotNull KeyEvent keyEvent) {
        Boolean boolInvoke;
        ModifiedKeyInputNode modifiedKeyInputNodeFindParentKeyInputNode$ui_release = findParentKeyInputNode$ui_release();
        Boolean boolValueOf = modifiedKeyInputNodeFindParentKeyInputNode$ui_release == null ? null : Boolean.valueOf(modifiedKeyInputNodeFindParentKeyInputNode$ui_release.m2581propagatePreviewKeyEventZmokQxo(keyEvent));
        if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
            return boolValueOf.booleanValue();
        }
        Function1<androidx.compose.ui.input.key.KeyEvent, Boolean> onPreviewKeyEvent = getModifier().getOnPreviewKeyEvent();
        if (onPreviewKeyEvent == null || (boolInvoke = onPreviewKeyEvent.invoke(androidx.compose.ui.input.key.KeyEvent.m2311boximpl(keyEvent))) == null) {
            return false;
        }
        return boolInvoke.booleanValue();
    }
}
