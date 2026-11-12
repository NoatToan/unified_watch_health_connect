package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/DefaultVectorOverride;", "Landroidx/compose/ui/graphics/vector/VectorOverride;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
final class DefaultVectorOverride implements VectorOverride {

    @NotNull
    public static final DefaultVectorOverride INSTANCE = new DefaultVectorOverride();

    private DefaultVectorOverride() {
    }

    @Override // androidx.compose.ui.graphics.vector.VectorOverride
    @Nullable
    public Brush obtainFill(@Nullable Brush brush) {
        return VectorOverride.DefaultImpls.obtainFill(this, brush);
    }

    @Override // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainFillAlpha(float f) {
        return VectorOverride.DefaultImpls.obtainFillAlpha(this, f);
    }

    @Override // androidx.compose.ui.graphics.vector.VectorOverride
    @NotNull
    public List<PathNode> obtainPathData(@NotNull List<? extends PathNode> list) {
        return VectorOverride.DefaultImpls.obtainPathData(this, list);
    }

    @Override // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainPivotX(float f) {
        return VectorOverride.DefaultImpls.obtainPivotX(this, f);
    }

    @Override // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainPivotY(float f) {
        return VectorOverride.DefaultImpls.obtainPivotY(this, f);
    }

    @Override // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainRotation(float f) {
        return VectorOverride.DefaultImpls.obtainRotation(this, f);
    }

    @Override // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainScaleX(float f) {
        return VectorOverride.DefaultImpls.obtainScaleX(this, f);
    }

    @Override // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainScaleY(float f) {
        return VectorOverride.DefaultImpls.obtainScaleY(this, f);
    }

    @Override // androidx.compose.ui.graphics.vector.VectorOverride
    @Nullable
    public Brush obtainStroke(@Nullable Brush brush) {
        return VectorOverride.DefaultImpls.obtainStroke(this, brush);
    }

    @Override // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainStrokeAlpha(float f) {
        return VectorOverride.DefaultImpls.obtainStrokeAlpha(this, f);
    }

    @Override // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainStrokeWidth(float f) {
        return VectorOverride.DefaultImpls.obtainStrokeWidth(this, f);
    }

    @Override // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainTranslateX(float f) {
        return VectorOverride.DefaultImpls.obtainTranslateX(this, f);
    }

    @Override // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainTranslateY(float f) {
        return VectorOverride.DefaultImpls.obtainTranslateY(this, f);
    }

    @Override // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainTrimPathEnd(float f) {
        return VectorOverride.DefaultImpls.obtainTrimPathEnd(this, f);
    }

    @Override // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainTrimPathOffset(float f) {
        return VectorOverride.DefaultImpls.obtainTrimPathOffset(this, f);
    }

    @Override // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainTrimPathStart(float f) {
        return VectorOverride.DefaultImpls.obtainTrimPathStart(this, f);
    }
}
