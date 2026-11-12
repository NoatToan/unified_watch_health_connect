package androidx.compose.ui.graphics;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0002\u001a\r\u0010\u0004\u001a\u00020\u0002*\u00020\u0000H\u0086\b¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/Path;", MAPCookie.KEY_PATH, "Landroid/graphics/Path;", "asComposePath", "asAndroidPath", "ui-graphics_release"}, k = 2, mv = {1, 5, 1})
public final class AndroidPath_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final Path Path() {
        return new AndroidPath(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public static final android.graphics.Path asAndroidPath(@NotNull Path path) {
        if (path instanceof AndroidPath) {
            return ((AndroidPath) path).getInternalPath();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @NotNull
    public static final Path asComposePath(@NotNull android.graphics.Path path) {
        return new AndroidPath(path);
    }
}
