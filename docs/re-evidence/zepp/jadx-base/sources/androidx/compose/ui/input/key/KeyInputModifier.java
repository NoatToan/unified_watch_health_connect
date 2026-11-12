package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.node.ModifiedFocusNode;
import androidx.compose.ui.node.ModifiedKeyInputNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B6\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b8\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR*\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b8\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/input/key/KeyEvent;", "keyEvent", "", "processKeyInput-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "processKeyInput", "Lkotlin/Function1;", "onKeyEvent", "Lkotlin/jvm/functions/Function1;", "getOnKeyEvent", "()Lkotlin/jvm/functions/Function1;", "onPreviewKeyEvent", "getOnPreviewKeyEvent", "Landroidx/compose/ui/node/ModifiedKeyInputNode;", "keyInputNode", "Landroidx/compose/ui/node/ModifiedKeyInputNode;", "getKeyInputNode", "()Landroidx/compose/ui/node/ModifiedKeyInputNode;", "setKeyInputNode", "(Landroidx/compose/ui/node/ModifiedKeyInputNode;)V", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class KeyInputModifier implements Modifier.Element {
    public ModifiedKeyInputNode keyInputNode;

    @Nullable
    private final Function1<KeyEvent, Boolean> onKeyEvent;

    @Nullable
    private final Function1<KeyEvent, Boolean> onPreviewKeyEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputModifier(@Nullable Function1<? super KeyEvent, Boolean> function1, @Nullable Function1<? super KeyEvent, Boolean> function2) {
        this.onKeyEvent = function1;
        this.onPreviewKeyEvent = function2;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return Modifier.Element.DefaultImpls.all(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return Modifier.Element.DefaultImpls.any(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldIn(R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
        return (R) Modifier.Element.DefaultImpls.foldIn(this, r, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldOut(R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
        return (R) Modifier.Element.DefaultImpls.foldOut(this, r, function2);
    }

    @NotNull
    public final ModifiedKeyInputNode getKeyInputNode() {
        ModifiedKeyInputNode modifiedKeyInputNode = this.keyInputNode;
        if (modifiedKeyInputNode != null) {
            return modifiedKeyInputNode;
        }
        return null;
    }

    @Nullable
    public final Function1<KeyEvent, Boolean> getOnKeyEvent() {
        return this.onKeyEvent;
    }

    @Nullable
    public final Function1<KeyEvent, Boolean> getOnPreviewKeyEvent() {
        return this.onPreviewKeyEvent;
    }

    /* JADX INFO: renamed from: processKeyInput-ZmokQxo, reason: not valid java name */
    public final boolean m2335processKeyInputZmokQxo(@NotNull android.view.KeyEvent keyEvent) {
        ModifiedFocusNode modifiedFocusNodeFindActiveFocusNode;
        ModifiedFocusNode modifiedFocusNodeFindPreviousFocusWrapper = getKeyInputNode().findPreviousFocusWrapper();
        ModifiedKeyInputNode modifiedKeyInputNodeFindLastKeyInputWrapper = null;
        if (modifiedFocusNodeFindPreviousFocusWrapper != null && (modifiedFocusNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(modifiedFocusNodeFindPreviousFocusWrapper)) != null) {
            modifiedKeyInputNodeFindLastKeyInputWrapper = modifiedFocusNodeFindActiveFocusNode.findLastKeyInputWrapper();
        }
        if (modifiedKeyInputNodeFindLastKeyInputWrapper == null) {
            throw new IllegalStateException("KeyEvent can't be processed because this key input node is not active.".toString());
        }
        if (modifiedKeyInputNodeFindLastKeyInputWrapper.m2581propagatePreviewKeyEventZmokQxo(keyEvent)) {
            return true;
        }
        return modifiedKeyInputNodeFindLastKeyInputWrapper.m2580propagateKeyEventZmokQxo(keyEvent);
    }

    public final void setKeyInputNode(@NotNull ModifiedKeyInputNode modifiedKeyInputNode) {
        this.keyInputNode = modifiedKeyInputNode;
    }

    @Override // androidx.compose.ui.Modifier
    @NotNull
    public Modifier then(@NotNull Modifier modifier) {
        return Modifier.Element.DefaultImpls.then(this, modifier);
    }
}
