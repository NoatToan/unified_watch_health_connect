package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import androidx.compose.ui.text.AnnotatedString;
import com.huami.tools.analytics.DbUtils;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016J\u0006\u0010\f\u001a\u00020\u000bR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/AndroidClipboardManager;", "Landroidx/compose/ui/platform/ClipboardManager;", "", "charSequence", "Landroidx/compose/ui/text/AnnotatedString;", "convertCharSequenceToAnnotatedString", "annotatedString", "convertAnnotatedStringToCharSequence", "", "setText", "getText", "", "hasText", "Landroid/content/ClipboardManager;", "clipboardManager", "Landroid/content/ClipboardManager;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class AndroidClipboardManager implements ClipboardManager {

    @NotNull
    private final android.content.ClipboardManager clipboardManager;

    public AndroidClipboardManager(@NotNull Context context) {
        Object systemService = context.getSystemService("clipboard");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.clipboardManager = (android.content.ClipboardManager) systemService;
    }

    private final CharSequence convertAnnotatedStringToCharSequence(AnnotatedString annotatedString) {
        return annotatedString.getText();
    }

    private final AnnotatedString convertCharSequenceToAnnotatedString(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return new AnnotatedString(charSequence.toString(), null, null, 6, null);
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    @Nullable
    public AnnotatedString getText() {
        if (this.clipboardManager.hasPrimaryClip()) {
            return convertCharSequenceToAnnotatedString(this.clipboardManager.getPrimaryClip().getItemAt(0).getText());
        }
        return null;
    }

    public final boolean hasText() {
        ClipDescription primaryClipDescription = this.clipboardManager.getPrimaryClipDescription();
        if (primaryClipDescription == null) {
            return false;
        }
        return primaryClipDescription.hasMimeType("text/plain");
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public void setText(@NotNull AnnotatedString annotatedString) {
        this.clipboardManager.setPrimaryClip(ClipData.newPlainText("plain text", convertAnnotatedStringToCharSequence(annotatedString)));
    }
}
