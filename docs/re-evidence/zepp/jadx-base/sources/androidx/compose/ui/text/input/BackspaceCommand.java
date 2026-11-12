package androidx.compose.ui.text.input;

import androidx.compose.ui.text.JvmCharHelpers_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/input/BackspaceCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/ui/text/input/EditingBuffer;", "buffer", "", "applyTo", "", "other", "", "equals", "", "hashCode", "", "toString", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 5, 1})
public final class BackspaceCommand implements EditCommand {
    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(@NotNull EditingBuffer buffer) {
        if (buffer.hasComposition$ui_text_release()) {
            buffer.delete$ui_text_release(buffer.getCompositionStart(), buffer.getCompositionEnd());
            return;
        }
        if (buffer.getCursor$ui_text_release() != -1) {
            if (buffer.getCursor$ui_text_release() == 0) {
                return;
            }
            buffer.delete$ui_text_release(JvmCharHelpers_androidKt.findPrecedingBreak(buffer.toString(), buffer.getCursor$ui_text_release()), buffer.getCursor$ui_text_release());
        } else {
            int selectionStart = buffer.getSelectionStart();
            int selectionEnd = buffer.getSelectionEnd();
            buffer.setCursor$ui_text_release(buffer.getSelectionStart());
            buffer.delete$ui_text_release(selectionStart, selectionEnd);
        }
    }

    public boolean equals(@Nullable Object other) {
        return other instanceof BackspaceCommand;
    }

    public int hashCode() {
        return Reflection.getOrCreateKotlinClass(BackspaceCommand.class).hashCode();
    }

    @NotNull
    public String toString() {
        return "BackspaceCommand()";
    }
}
