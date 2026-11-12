package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.Density;
import com.xiaomi.market.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionHandleCache;", "", "Landroidx/compose/ui/unit/Density;", Constants.JSON_DENSITY, "", "left", "Landroidx/compose/ui/graphics/Path;", "createPath", "path", "Landroidx/compose/ui/graphics/Path;", "Z", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 5, 1})
final class SelectionHandleCache {
    private boolean left;

    @Nullable
    private Path path;

    @NotNull
    public final Path createPath(@NotNull Density density, boolean left) {
        Path Path = this.path;
        if (this.left != left || Path == null) {
            this.left = left;
            if (Path == null) {
                Path = AndroidPath_androidKt.Path();
                this.path = Path;
            }
            Path.reset();
            Path.addRect(new Rect(left ? density.mo193toPx0680j_4(SelectionHandlesKt.getHANDLE_WIDTH()) * 0.5f : 0.0f, 0.0f, left ? density.mo193toPx0680j_4(SelectionHandlesKt.getHANDLE_WIDTH()) : density.mo193toPx0680j_4(SelectionHandlesKt.getHANDLE_WIDTH()) * 0.5f, density.mo193toPx0680j_4(SelectionHandlesKt.getHANDLE_HEIGHT()) * 0.5f));
            Path.addOval(new Rect(0.0f, 0.0f, density.mo193toPx0680j_4(SelectionHandlesKt.getHANDLE_WIDTH()), density.mo193toPx0680j_4(SelectionHandlesKt.getHANDLE_HEIGHT())));
        }
        return Path;
    }
}
