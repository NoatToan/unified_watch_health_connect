package androidx.compose.material;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/material/BottomNavigationDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "Elevation", "F", "getElevation-D9Ej5fM", "()F", "<init>", "()V", "material_release"}, k = 1, mv = {1, 5, 1})
public final class BottomNavigationDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final BottomNavigationDefaults INSTANCE = new BottomNavigationDefaults();
    private static final float Elevation = Dp.m2965constructorimpl(8);

    private BottomNavigationDefaults() {
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m581getElevationD9Ej5fM() {
        return Elevation;
    }
}
