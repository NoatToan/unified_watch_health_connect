package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.PlatformStringDelegate;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/PlatformStringDelegate;", "ActualStringDelegate", "ui-text_release"}, k = 2, mv = {1, 5, 1})
public final class AndroidStringDelegate_androidKt {
    @NotNull
    public static final PlatformStringDelegate ActualStringDelegate() {
        return new AndroidStringDelegate();
    }
}
