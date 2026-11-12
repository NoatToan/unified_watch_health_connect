package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.xiaomi.market.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 @2\u00020\u0001:\u0001@B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b>\u0010?J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J6\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016J\u001b\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u0016\u0010#\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001f\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u0016\u0010-\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010$R\u0016\u0010.\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010$R\u0016\u0010/\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010$R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00100R\u0018\u00102\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010+R\u0018\u00104\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010+R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0015\u0010:\u001a\u0004\u0018\u00010%8F@\u0006¢\u0006\u0006\u001a\u0004\b8\u00109R\u0015\u0010=\u001a\u0004\u0018\u00010\n8F@\u0006¢\u0006\u0006\u001a\u0004\b;\u0010<\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Landroidx/compose/ui/platform/OutlineResolver;", "", "", "updateCache", "Landroidx/compose/ui/geometry/Rect;", "rect", "updateCacheWithRect", "Landroidx/compose/ui/geometry/RoundRect;", "roundRect", "updateCacheWithRoundRect", "Landroidx/compose/ui/graphics/Path;", "composePath", "updateCacheWithPath", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "alpha", "", "clipToOutline", "elevation", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", Constants.JSON_DENSITY, "update", "Landroidx/compose/ui/geometry/Offset;", "position", "isInOutline-k-4lQ0M", "(J)Z", "isInOutline", "Landroidx/compose/ui/geometry/Size;", "size", "update-uvyYCjk", "(J)V", "Landroidx/compose/ui/unit/Density;", "isSupportedOutline", "Z", "Landroid/graphics/Outline;", "cachedOutline", "Landroid/graphics/Outline;", "J", "Landroidx/compose/ui/graphics/Shape;", "cachedRrectPath", "Landroidx/compose/ui/graphics/Path;", "outlinePath", "cacheIsDirty", "usePathForClip", "outlineNeeded", "Landroidx/compose/ui/unit/LayoutDirection;", "tmpTouchPointPath$1", "tmpTouchPointPath", "tmpOpPath$1", "tmpOpPath", "Landroidx/compose/ui/graphics/Outline;", "calculatedOutline", "Landroidx/compose/ui/graphics/Outline;", "getOutline", "()Landroid/graphics/Outline;", "outline", "getClipPath", "()Landroidx/compose/ui/graphics/Path;", "clipPath", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class OutlineResolver {

    @NotNull
    private static final Path tmpOpPath = AndroidPath_androidKt.Path();

    @NotNull
    private static final Path tmpTouchPointPath = AndroidPath_androidKt.Path();
    private boolean cacheIsDirty;

    @NotNull
    private final Outline cachedOutline;

    @Nullable
    private Path cachedRrectPath;

    @Nullable
    private androidx.compose.ui.graphics.Outline calculatedOutline;

    @NotNull
    private Density density;
    private boolean isSupportedOutline = true;

    @NotNull
    private LayoutDirection layoutDirection;
    private boolean outlineNeeded;

    @Nullable
    private Path outlinePath;

    @NotNull
    private Shape shape;
    private long size;

    /* JADX INFO: renamed from: tmpOpPath$1, reason: from kotlin metadata */
    @Nullable
    private Path tmpOpPath;

    /* JADX INFO: renamed from: tmpTouchPointPath$1, reason: from kotlin metadata */
    @Nullable
    private Path tmpTouchPointPath;
    private boolean usePathForClip;

    public OutlineResolver(@NotNull Density density) {
        this.density = density;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        Unit unit = Unit.INSTANCE;
        this.cachedOutline = outline;
        this.size = Size.INSTANCE.m1061getZeroNHjbRc();
        this.shape = RectangleShapeKt.getRectangleShape();
        this.layoutDirection = LayoutDirection.Ltr;
    }

    private final void updateCache() {
        if (this.cacheIsDirty) {
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            if (!this.outlineNeeded || Size.m1052getWidthimpl(this.size) <= 0.0f || Size.m1049getHeightimpl(this.size) <= 0.0f) {
                this.cachedOutline.setEmpty();
                return;
            }
            this.isSupportedOutline = true;
            androidx.compose.ui.graphics.Outline outlineMo147createOutlinePq9zytI = this.shape.mo147createOutlinePq9zytI(this.size, this.layoutDirection, this.density);
            this.calculatedOutline = outlineMo147createOutlinePq9zytI;
            if (outlineMo147createOutlinePq9zytI instanceof androidx.compose.ui.graphics.Outline.Rectangle) {
                updateCacheWithRect(((androidx.compose.ui.graphics.Outline.Rectangle) outlineMo147createOutlinePq9zytI).getRect());
            } else if (outlineMo147createOutlinePq9zytI instanceof androidx.compose.ui.graphics.Outline.Rounded) {
                updateCacheWithRoundRect(((androidx.compose.ui.graphics.Outline.Rounded) outlineMo147createOutlinePq9zytI).getRoundRect());
            } else if (outlineMo147createOutlinePq9zytI instanceof androidx.compose.ui.graphics.Outline.Generic) {
                updateCacheWithPath(((androidx.compose.ui.graphics.Outline.Generic) outlineMo147createOutlinePq9zytI).getPath());
            }
        }
    }

    private final void updateCacheWithPath(Path composePath) {
        if (Build.VERSION.SDK_INT > 28 || composePath.isConvex()) {
            Outline outline = this.cachedOutline;
            if (!(composePath instanceof AndroidPath)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((AndroidPath) composePath).getInternalPath());
            this.usePathForClip = !this.cachedOutline.canClip();
        } else {
            this.isSupportedOutline = false;
            this.cachedOutline.setEmpty();
            this.usePathForClip = true;
        }
        this.outlinePath = composePath;
    }

    private final void updateCacheWithRect(Rect rect) {
        this.cachedOutline.setRect(c.roundToInt(rect.getLeft()), c.roundToInt(rect.getTop()), c.roundToInt(rect.getRight()), c.roundToInt(rect.getBottom()));
    }

    private final void updateCacheWithRoundRect(RoundRect roundRect) {
        float fM958getXimpl = CornerRadius.m958getXimpl(roundRect.m1033getTopLeftCornerRadiuskKHJgLs());
        if (RoundRectKt.isSimple(roundRect)) {
            this.cachedOutline.setRoundRect(c.roundToInt(roundRect.getLeft()), c.roundToInt(roundRect.getTop()), c.roundToInt(roundRect.getRight()), c.roundToInt(roundRect.getBottom()), fM958getXimpl);
            return;
        }
        Path Path = this.cachedRrectPath;
        if (Path == null) {
            Path = AndroidPath_androidKt.Path();
            this.cachedRrectPath = Path;
        }
        Path.reset();
        Path.addRoundRect(roundRect);
        updateCacheWithPath(Path);
    }

    @Nullable
    public final Path getClipPath() {
        updateCache();
        if (this.usePathForClip) {
            return this.outlinePath;
        }
        return null;
    }

    @Nullable
    public final Outline getOutline() {
        updateCache();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }

    /* JADX INFO: renamed from: isInOutline-k-4lQ0M, reason: not valid java name */
    public final boolean m2607isInOutlinek4lQ0M(long position) {
        androidx.compose.ui.graphics.Outline outline;
        if (this.outlineNeeded && (outline = this.calculatedOutline) != null) {
            return ShapeContainingUtilKt.isInOutline(outline, Offset.m983getXimpl(position), Offset.m984getYimpl(position), this.tmpTouchPointPath, this.tmpOpPath);
        }
        return true;
    }

    public final boolean update(@NotNull Shape shape, float alpha, boolean clipToOutline, float elevation, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        this.cachedOutline.setAlpha(alpha);
        boolean z = !Intrinsics.areEqual(this.shape, shape);
        if (z) {
            this.shape = shape;
            this.cacheIsDirty = true;
        }
        boolean z2 = clipToOutline || elevation > 0.0f;
        if (this.outlineNeeded != z2) {
            this.outlineNeeded = z2;
            this.cacheIsDirty = true;
        }
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            this.cacheIsDirty = true;
        }
        if (!Intrinsics.areEqual(this.density, density)) {
            this.density = density;
            this.cacheIsDirty = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: update-uvyYCjk, reason: not valid java name */
    public final void m2608updateuvyYCjk(long size) {
        if (Size.m1048equalsimpl0(this.size, size)) {
            return;
        }
        this.size = size;
        this.cacheIsDirty = true;
    }
}
