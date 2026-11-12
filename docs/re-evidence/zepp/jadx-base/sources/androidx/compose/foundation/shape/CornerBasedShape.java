package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.xiaomi.market.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u0013\u0012\u0006\u0010\u000e\u001a\u00020\u0013\u0012\u0006\u0010\u000f\u001a\u00020\u0013\u0012\u0006\u0010\u0010\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJE\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00132\b\b\u0002\u0010\u000e\u001a\u00020\u00132\b\b\u0002\u0010\u000f\u001a\u00020\u00132\b\b\u0002\u0010\u0010\u001a\u00020\u0013H&J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0013R\u0019\u0010\r\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000e\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u000f\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0010\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/shape/CornerBasedShape;", "Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", Constants.JSON_DENSITY, "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "createOutline", "", "topStart", "topEnd", "bottomEnd", "bottomStart", "createOutline-LjSzlW0", "(JFFFFLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/Outline;", "Landroidx/compose/foundation/shape/CornerSize;", "copy", "all", "Landroidx/compose/foundation/shape/CornerSize;", "getTopStart", "()Landroidx/compose/foundation/shape/CornerSize;", "getTopEnd", "getBottomEnd", "getBottomStart", "<init>", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)V", "foundation_release"}, k = 1, mv = {1, 5, 1})
public abstract class CornerBasedShape implements Shape {
    public static final int $stable = 0;

    @NotNull
    private final CornerSize bottomEnd;

    @NotNull
    private final CornerSize bottomStart;

    @NotNull
    private final CornerSize topEnd;

    @NotNull
    private final CornerSize topStart;

    public CornerBasedShape(@NotNull CornerSize cornerSize, @NotNull CornerSize cornerSize2, @NotNull CornerSize cornerSize3, @NotNull CornerSize cornerSize4) {
        this.topStart = cornerSize;
        this.topEnd = cornerSize2;
        this.bottomEnd = cornerSize3;
        this.bottomStart = cornerSize4;
    }

    public static /* synthetic */ CornerBasedShape copy$default(CornerBasedShape cornerBasedShape, CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i & 1) != 0) {
            cornerSize = cornerBasedShape.topStart;
        }
        if ((i & 2) != 0) {
            cornerSize2 = cornerBasedShape.topEnd;
        }
        if ((i & 4) != 0) {
            cornerSize3 = cornerBasedShape.bottomEnd;
        }
        if ((i & 8) != 0) {
            cornerSize4 = cornerBasedShape.bottomStart;
        }
        return cornerBasedShape.copy(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @NotNull
    public final CornerBasedShape copy(@NotNull CornerSize all) {
        return copy(all, all, all, all);
    }

    @NotNull
    public abstract CornerBasedShape copy(@NotNull CornerSize topStart, @NotNull CornerSize topEnd, @NotNull CornerSize bottomEnd, @NotNull CornerSize bottomStart);

    @NotNull
    /* JADX INFO: renamed from: createOutline-LjSzlW0 */
    public abstract Outline mo383createOutlineLjSzlW0(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, @NotNull LayoutDirection layoutDirection);

    @Override // androidx.compose.ui.graphics.Shape
    @NotNull
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public final Outline mo147createOutlinePq9zytI(long size, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        float fMo391toPxTmRCtEA = this.topStart.mo391toPxTmRCtEA(size, density);
        float fMo391toPxTmRCtEA2 = this.topEnd.mo391toPxTmRCtEA(size, density);
        float fMo391toPxTmRCtEA3 = this.bottomEnd.mo391toPxTmRCtEA(size, density);
        float fMo391toPxTmRCtEA4 = this.bottomStart.mo391toPxTmRCtEA(size, density);
        float fM1051getMinDimensionimpl = Size.m1051getMinDimensionimpl(size);
        float f = fMo391toPxTmRCtEA + fMo391toPxTmRCtEA4;
        if (f > fM1051getMinDimensionimpl) {
            float f2 = fM1051getMinDimensionimpl / f;
            fMo391toPxTmRCtEA *= f2;
            fMo391toPxTmRCtEA4 *= f2;
        }
        float f3 = fMo391toPxTmRCtEA4;
        float f4 = fMo391toPxTmRCtEA2 + fMo391toPxTmRCtEA3;
        if (f4 > fM1051getMinDimensionimpl) {
            float f5 = fM1051getMinDimensionimpl / f4;
            fMo391toPxTmRCtEA2 *= f5;
            fMo391toPxTmRCtEA3 *= f5;
        }
        if (fMo391toPxTmRCtEA >= 0.0f && fMo391toPxTmRCtEA2 >= 0.0f && fMo391toPxTmRCtEA3 >= 0.0f && f3 >= 0.0f) {
            return mo383createOutlineLjSzlW0(size, fMo391toPxTmRCtEA, fMo391toPxTmRCtEA2, fMo391toPxTmRCtEA3, f3, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fMo391toPxTmRCtEA + ", topEnd = " + fMo391toPxTmRCtEA2 + ", bottomEnd = " + fMo391toPxTmRCtEA3 + ", bottomStart = " + f3 + ")!").toString());
    }

    @NotNull
    public final CornerSize getBottomEnd() {
        return this.bottomEnd;
    }

    @NotNull
    public final CornerSize getBottomStart() {
        return this.bottomStart;
    }

    @NotNull
    public final CornerSize getTopEnd() {
        return this.topEnd;
    }

    @NotNull
    public final CornerSize getTopStart() {
        return this.topStart;
    }
}
