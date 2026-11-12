package androidx.compose.material;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/material/BottomSheetScaffoldDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "SheetElevation", "F", "getSheetElevation-D9Ej5fM", "()F", "SheetPeekHeight", "getSheetPeekHeight-D9Ej5fM", "<init>", "()V", "material_release"}, k = 1, mv = {1, 5, 1})
public final class BottomSheetScaffoldDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final BottomSheetScaffoldDefaults INSTANCE = new BottomSheetScaffoldDefaults();
    private static final float SheetElevation = Dp.m2965constructorimpl(8);
    private static final float SheetPeekHeight = Dp.m2965constructorimpl(56);

    private BottomSheetScaffoldDefaults() {
    }

    /* JADX INFO: renamed from: getSheetElevation-D9Ej5fM, reason: not valid java name */
    public final float m592getSheetElevationD9Ej5fM() {
        return SheetElevation;
    }

    /* JADX INFO: renamed from: getSheetPeekHeight-D9Ej5fM, reason: not valid java name */
    public final float m593getSheetPeekHeightD9Ej5fM() {
        return SheetPeekHeight;
    }
}
