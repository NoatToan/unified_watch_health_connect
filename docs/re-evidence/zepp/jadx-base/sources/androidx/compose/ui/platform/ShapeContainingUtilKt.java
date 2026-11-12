package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a8\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000\u001a \u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002\u001a4\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\f\u0010\u0012\u001a\u00020\b*\u00020\u0011H\u0002\u001a=\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a4\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/graphics/Outline;", "outline", "", "x", "y", "Landroidx/compose/ui/graphics/Path;", "tmpTouchPointPath", "tmpOpPath", "", "isInOutline", "Landroidx/compose/ui/geometry/Rect;", "rect", "isInRectangle", "Landroidx/compose/ui/graphics/Outline$Rounded;", "touchPointPath", "opPath", "isInRoundedRect", "Landroidx/compose/ui/geometry/RoundRect;", "cornersFit", "Landroidx/compose/ui/geometry/CornerRadius;", "cornerRadius", "centerX", "centerY", "isWithinEllipse-VE1yxkc", "(FFJFF)Z", "isWithinEllipse", "path", "isInPath", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class ShapeContainingUtilKt {
    private static final boolean cornersFit(RoundRect roundRect) {
        return CornerRadius.m958getXimpl(roundRect.m1033getTopLeftCornerRadiuskKHJgLs()) + CornerRadius.m958getXimpl(roundRect.m1034getTopRightCornerRadiuskKHJgLs()) <= roundRect.getWidth() && CornerRadius.m958getXimpl(roundRect.m1031getBottomLeftCornerRadiuskKHJgLs()) + CornerRadius.m958getXimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs()) <= roundRect.getWidth() && CornerRadius.m959getYimpl(roundRect.m1033getTopLeftCornerRadiuskKHJgLs()) + CornerRadius.m959getYimpl(roundRect.m1031getBottomLeftCornerRadiuskKHJgLs()) <= roundRect.getHeight() && CornerRadius.m959getYimpl(roundRect.m1034getTopRightCornerRadiuskKHJgLs()) + CornerRadius.m959getYimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs()) <= roundRect.getHeight();
    }

    public static final boolean isInOutline(@NotNull Outline outline, float f, float f2, @Nullable Path path, @Nullable Path path2) {
        if (outline instanceof Outline.Rectangle) {
            return isInRectangle(((Outline.Rectangle) outline).getRect(), f, f2);
        }
        if (outline instanceof Outline.Rounded) {
            return isInRoundedRect((Outline.Rounded) outline, f, f2, path, path2);
        }
        if (outline instanceof Outline.Generic) {
            return isInPath(((Outline.Generic) outline).getPath(), f, f2, path, path2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ boolean isInOutline$default(Outline outline, float f, float f2, Path path, Path path2, int i, Object obj) {
        if ((i & 8) != 0) {
            path = null;
        }
        if ((i & 16) != 0) {
            path2 = null;
        }
        return isInOutline(outline, f, f2, path, path2);
    }

    private static final boolean isInPath(Path path, float f, float f2, Path path2, Path path3) {
        Rect rect = new Rect(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        if (path2 == null) {
            path2 = AndroidPath_androidKt.Path();
        }
        path2.addRect(rect);
        if (path3 == null) {
            path3 = AndroidPath_androidKt.Path();
        }
        path3.mo1117opN5in7k0(path, path2, PathOperation.INSTANCE.m1434getIntersectb3I0S0c());
        boolean zIsEmpty = path3.isEmpty();
        path3.reset();
        path2.reset();
        return !zIsEmpty;
    }

    private static final boolean isInRectangle(Rect rect, float f, float f2) {
        return rect.getLeft() <= f && f < rect.getRight() && rect.getTop() <= f2 && f2 < rect.getBottom();
    }

    private static final boolean isInRoundedRect(Outline.Rounded rounded, float f, float f2, Path path, Path path2) {
        RoundRect roundRect = rounded.getRoundRect();
        if (f < roundRect.getLeft() || f >= roundRect.getRight() || f2 < roundRect.getTop() || f2 >= roundRect.getBottom()) {
            return false;
        }
        if (!cornersFit(roundRect)) {
            Path Path = path2 == null ? AndroidPath_androidKt.Path() : path2;
            Path.addRoundRect(roundRect);
            return isInPath(Path, f, f2, path, path2);
        }
        float fM958getXimpl = CornerRadius.m958getXimpl(roundRect.m1033getTopLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
        float fM959getYimpl = CornerRadius.m959getYimpl(roundRect.m1033getTopLeftCornerRadiuskKHJgLs()) + roundRect.getTop();
        float right = roundRect.getRight() - CornerRadius.m958getXimpl(roundRect.m1034getTopRightCornerRadiuskKHJgLs());
        float fM959getYimpl2 = CornerRadius.m959getYimpl(roundRect.m1034getTopRightCornerRadiuskKHJgLs()) + roundRect.getTop();
        float right2 = roundRect.getRight() - CornerRadius.m958getXimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs());
        float bottom = roundRect.getBottom() - CornerRadius.m959getYimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs());
        float bottom2 = roundRect.getBottom() - CornerRadius.m959getYimpl(roundRect.m1031getBottomLeftCornerRadiuskKHJgLs());
        float fM958getXimpl2 = CornerRadius.m958getXimpl(roundRect.m1031getBottomLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
        if (f < fM958getXimpl && f2 < fM959getYimpl) {
            return m2611isWithinEllipseVE1yxkc(f, f2, roundRect.m1033getTopLeftCornerRadiuskKHJgLs(), fM958getXimpl, fM959getYimpl);
        }
        if (f < fM958getXimpl2 && f2 > bottom2) {
            return m2611isWithinEllipseVE1yxkc(f, f2, roundRect.m1031getBottomLeftCornerRadiuskKHJgLs(), fM958getXimpl2, bottom2);
        }
        if (f > right && f2 < fM959getYimpl2) {
            return m2611isWithinEllipseVE1yxkc(f, f2, roundRect.m1034getTopRightCornerRadiuskKHJgLs(), right, fM959getYimpl2);
        }
        if (f <= right2 || f2 <= bottom) {
            return true;
        }
        return m2611isWithinEllipseVE1yxkc(f, f2, roundRect.m1032getBottomRightCornerRadiuskKHJgLs(), right2, bottom);
    }

    /* JADX INFO: renamed from: isWithinEllipse-VE1yxkc, reason: not valid java name */
    private static final boolean m2611isWithinEllipseVE1yxkc(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fM958getXimpl = CornerRadius.m958getXimpl(j);
        float fM959getYimpl = CornerRadius.m959getYimpl(j);
        return ((f5 * f5) / (fM958getXimpl * fM958getXimpl)) + ((f6 * f6) / (fM959getYimpl * fM959getYimpl)) <= 1.0f;
    }
}
