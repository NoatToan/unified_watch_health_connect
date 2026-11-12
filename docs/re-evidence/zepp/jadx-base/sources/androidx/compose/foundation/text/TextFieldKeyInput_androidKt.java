package androidx.compose.foundation.text;

import android.view.KeyEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u001d\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@@\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/input/key/KeyEvent;", "", "isTypedEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isTypedEvent", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class TextFieldKeyInput_androidKt {
    /* JADX INFO: renamed from: isTypedEvent-ZmokQxo, reason: not valid java name */
    public static final boolean m474isTypedEventZmokQxo(@NotNull KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && keyEvent.getUnicodeChar() != 0;
    }
}
