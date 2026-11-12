package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import androidx.constraintlayout.motion.widget.Key;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0010\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0016J\u0010\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H\u0016J\u0010\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002H\u0016¨\u0006&"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorOverride;", "", "", Key.ROTATION, "obtainRotation", "pivotX", "obtainPivotX", "pivotY", "obtainPivotY", "scaleX", "obtainScaleX", "scaleY", "obtainScaleY", "translateX", "obtainTranslateX", "translateY", "obtainTranslateY", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "pathData", "obtainPathData", "Landroidx/compose/ui/graphics/Brush;", "fill", "obtainFill", "fillAlpha", "obtainFillAlpha", "stroke", "obtainStroke", "strokeWidth", "obtainStrokeWidth", "strokeAlpha", "obtainStrokeAlpha", "trimPathStart", "obtainTrimPathStart", "trimPathEnd", "obtainTrimPathEnd", "trimPathOffset", "obtainTrimPathOffset", "ui_release"}, k = 1, mv = {1, 5, 1})
public interface VectorOverride {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @Nullable
        public static Brush obtainFill(@NotNull VectorOverride vectorOverride, @Nullable Brush brush) {
            return brush;
        }

        public static float obtainFillAlpha(@NotNull VectorOverride vectorOverride, float f) {
            return f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static List<PathNode> obtainPathData(@NotNull VectorOverride vectorOverride, @NotNull List<? extends PathNode> list) {
            return list;
        }

        public static float obtainPivotX(@NotNull VectorOverride vectorOverride, float f) {
            return f;
        }

        public static float obtainPivotY(@NotNull VectorOverride vectorOverride, float f) {
            return f;
        }

        public static float obtainRotation(@NotNull VectorOverride vectorOverride, float f) {
            return f;
        }

        public static float obtainScaleX(@NotNull VectorOverride vectorOverride, float f) {
            return f;
        }

        public static float obtainScaleY(@NotNull VectorOverride vectorOverride, float f) {
            return f;
        }

        @Nullable
        public static Brush obtainStroke(@NotNull VectorOverride vectorOverride, @Nullable Brush brush) {
            return brush;
        }

        public static float obtainStrokeAlpha(@NotNull VectorOverride vectorOverride, float f) {
            return f;
        }

        public static float obtainStrokeWidth(@NotNull VectorOverride vectorOverride, float f) {
            return f;
        }

        public static float obtainTranslateX(@NotNull VectorOverride vectorOverride, float f) {
            return f;
        }

        public static float obtainTranslateY(@NotNull VectorOverride vectorOverride, float f) {
            return f;
        }

        public static float obtainTrimPathEnd(@NotNull VectorOverride vectorOverride, float f) {
            return f;
        }

        public static float obtainTrimPathOffset(@NotNull VectorOverride vectorOverride, float f) {
            return f;
        }

        public static float obtainTrimPathStart(@NotNull VectorOverride vectorOverride, float f) {
            return f;
        }
    }

    @Nullable
    Brush obtainFill(@Nullable Brush fill);

    float obtainFillAlpha(float fillAlpha);

    @NotNull
    List<PathNode> obtainPathData(@NotNull List<? extends PathNode> pathData);

    float obtainPivotX(float pivotX);

    float obtainPivotY(float pivotY);

    float obtainRotation(float rotation);

    float obtainScaleX(float scaleX);

    float obtainScaleY(float scaleY);

    @Nullable
    Brush obtainStroke(@Nullable Brush stroke);

    float obtainStrokeAlpha(float strokeAlpha);

    float obtainStrokeWidth(float strokeWidth);

    float obtainTranslateX(float translateX);

    float obtainTranslateY(float translateY);

    float obtainTrimPathEnd(float trimPathEnd);

    float obtainTrimPathOffset(float trimPathOffset);

    float obtainTrimPathStart(float trimPathStart);
}
