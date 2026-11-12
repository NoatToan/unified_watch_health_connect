package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u00020\u00028G@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0013\u0010\t\u001a\u00020\u00068G@\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\r\u001a\u00020\n8G@\u0006¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/material/MaterialTheme;", "", "Landroidx/compose/material/Colors;", "getColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;", "colors", "Landroidx/compose/material/Typography;", "getTypography", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Typography;", "typography", "Landroidx/compose/material/Shapes;", "getShapes", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Shapes;", "shapes", "<init>", "()V", "material_release"}, k = 1, mv = {1, 5, 1})
public final class MaterialTheme {
    public static final int $stable = 0;

    @NotNull
    public static final MaterialTheme INSTANCE = new MaterialTheme();

    private MaterialTheme() {
    }

    @JvmName(name = "getColors")
    @NotNull
    @Composable
    @ReadOnlyComposable
    public final Colors getColors(@Nullable Composer composer, int i) {
        return (Colors) composer.consume(ColorsKt.getLocalColors());
    }

    @JvmName(name = "getShapes")
    @NotNull
    @Composable
    @ReadOnlyComposable
    public final Shapes getShapes(@Nullable Composer composer, int i) {
        return (Shapes) composer.consume(ShapesKt.getLocalShapes());
    }

    @JvmName(name = "getTypography")
    @NotNull
    @Composable
    @ReadOnlyComposable
    public final Typography getTypography(@Nullable Composer composer, int i) {
        return (Typography) composer.consume(TypographyKt.getLocalTypography());
    }
}
