package androidx.compose.ui.text.input;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "This function is not being used by any APIs. API is now deprecated and will be removed")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u001d\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/input/InputEventCallback;", "", "", "Landroidx/compose/ui/text/input/EditCommand;", "editCommands", "", "onEditCommands", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "onImeAction-KlQnJC8", "(I)V", "onImeAction", "ui-text_release"}, k = 1, mv = {1, 5, 1})
public interface InputEventCallback {
    void onEditCommands(@NotNull List<? extends EditCommand> editCommands);

    /* JADX INFO: renamed from: onImeAction-KlQnJC8, reason: not valid java name */
    void m2802onImeActionKlQnJC8(int imeAction);
}
