package androidx.compose.ui.graphics;

import android.graphics.Shader;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0004\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/TileMode;", "Landroid/graphics/Shader$TileMode;", "toAndroidTileMode-0vamqd0", "(I)Landroid/graphics/Shader$TileMode;", "toAndroidTileMode", "ui-graphics_release"}, k = 2, mv = {1, 5, 1})
public final class AndroidTileMode_androidKt {
    @NotNull
    /* JADX INFO: renamed from: toAndroidTileMode-0vamqd0, reason: not valid java name */
    public static final Shader.TileMode m1126toAndroidTileMode0vamqd0(int i) {
        TileMode.Companion companion = TileMode.INSTANCE;
        if (TileMode.m1497equalsimpl0(i, companion.m1501getClamp3opZhB0())) {
            return Shader.TileMode.CLAMP;
        }
        if (TileMode.m1497equalsimpl0(i, companion.m1503getRepeated3opZhB0())) {
            return Shader.TileMode.REPEAT;
        }
        return TileMode.m1497equalsimpl0(i, companion.m1502getMirror3opZhB0()) ? Shader.TileMode.MIRROR : Shader.TileMode.CLAMP;
    }
}
