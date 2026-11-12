package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0001ABR\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0015\u0012\b\b\u0002\u0010$\u001a\u00020\u0015\u0012\b\b\u0002\u0010%\u001a\u00020\u0015\u0012\b\b\u0002\u0010&\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\b\u0010\u0002\u001a\u00020\u0000H\u0002J(\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u001b\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u000fH\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0018\u001a\u00020\u0015HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u0015HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0017J\u0019\u0010\u001c\u001a\u00020\u0015HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0017J\u0019\u0010\u001e\u001a\u00020\u0015HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u0017Jf\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00152\b\b\u0002\u0010$\u001a\u00020\u00152\b\b\u0002\u0010%\u001a\u00020\u00152\b\b\u0002\u0010&\u001a\u00020\u0015HÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\t\u0010+\u001a\u00020*HÖ\u0001J\u0013\u0010-\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u001f\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\b/\u00100R\u0019\u0010 \u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b \u0010.\u001a\u0004\b1\u00100R\u0019\u0010!\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b2\u00100R\u0019\u0010\"\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b3\u00100R\"\u0010#\u001a\u00020\u00158\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u00104\u001a\u0004\b5\u0010\u0017R\"\u0010$\u001a\u00020\u00158\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b$\u00104\u001a\u0004\b6\u0010\u0017R\"\u0010%\u001a\u00020\u00158\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u00104\u001a\u0004\b7\u0010\u0017R\"\u0010&\u001a\u00020\u00158\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b&\u00104\u001a\u0004\b8\u0010\u0017R\u0018\u00109\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0013\u0010<\u001a\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b;\u00100R\u0013\u0010>\u001a\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b=\u00100\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect;", "", "scaledRadiiRect", "", "min", "radius1", "radius2", "limit", "minRadius", "Landroidx/compose/ui/geometry/Offset;", "point", "", "contains-k-4lQ0M", "(J)Z", SearchCriteria.CONTAINS, "", "toString", "component1", "component2", "component3", "component4", "Landroidx/compose/ui/geometry/CornerRadius;", "component5-kKHJgLs", "()J", "component5", "component6-kKHJgLs", "component6", "component7-kKHJgLs", "component7", "component8-kKHJgLs", "component8", "left", "top", "right", "bottom", "topLeftCornerRadius", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "copy-MDFrsts", "(FFFFJJJJ)Landroidx/compose/ui/geometry/RoundRect;", "copy", "", "hashCode", "other", "equals", "F", "getLeft", "()F", "getTop", "getRight", "getBottom", "J", "getTopLeftCornerRadius-kKHJgLs", "getTopRightCornerRadius-kKHJgLs", "getBottomRightCornerRadius-kKHJgLs", "getBottomLeftCornerRadius-kKHJgLs", "_scaledRadiiRect", "Landroidx/compose/ui/geometry/RoundRect;", "getWidth", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "getHeight", "height", "<init>", "(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RoundRect {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final RoundRect Zero = RoundRectKt.m1037RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.INSTANCE.m968getZerokKHJgLs());

    @Nullable
    private RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect$Companion;", "", "Landroidx/compose/ui/geometry/RoundRect;", "Zero", "Landroidx/compose/ui/geometry/RoundRect;", "getZero", "()Landroidx/compose/ui/geometry/RoundRect;", "getZero$annotations", "()V", "<init>", "ui-geometry_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getZero$annotations() {
        }

        @NotNull
        public final RoundRect getZero() {
            return RoundRect.Zero;
        }
    }

    private RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
        this.topLeftCornerRadius = j;
        this.topRightCornerRadius = j2;
        this.bottomRightCornerRadius = j3;
        this.bottomLeftCornerRadius = j4;
    }

    public /* synthetic */ RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, j, j2, j3, j4);
    }

    @NotNull
    public static final RoundRect getZero() {
        return INSTANCE.getZero();
    }

    private final float minRadius(float min, float radius1, float radius2, float limit) {
        float f = radius1 + radius2;
        if (f > limit) {
            return !((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0) ? Math.min(min, limit / f) : min;
        }
        return min;
    }

    private final RoundRect scaledRadiiRect() {
        RoundRect roundRect = this._scaledRadiiRect;
        if (roundRect != null) {
            return roundRect;
        }
        float fMinRadius = minRadius(minRadius(minRadius(minRadius(1.0f, CornerRadius.m959getYimpl(m1031getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m959getYimpl(m1033getTopLeftCornerRadiuskKHJgLs()), getHeight()), CornerRadius.m958getXimpl(m1033getTopLeftCornerRadiuskKHJgLs()), CornerRadius.m958getXimpl(m1034getTopRightCornerRadiuskKHJgLs()), getWidth()), CornerRadius.m959getYimpl(m1034getTopRightCornerRadiuskKHJgLs()), CornerRadius.m959getYimpl(m1032getBottomRightCornerRadiuskKHJgLs()), getHeight()), CornerRadius.m958getXimpl(m1032getBottomRightCornerRadiuskKHJgLs()), CornerRadius.m958getXimpl(m1031getBottomLeftCornerRadiuskKHJgLs()), getWidth());
        RoundRect roundRect2 = new RoundRect(getLeft() * fMinRadius, getTop() * fMinRadius, getRight() * fMinRadius, getBottom() * fMinRadius, CornerRadiusKt.CornerRadius(CornerRadius.m958getXimpl(m1033getTopLeftCornerRadiuskKHJgLs()) * fMinRadius, CornerRadius.m959getYimpl(m1033getTopLeftCornerRadiuskKHJgLs()) * fMinRadius), CornerRadiusKt.CornerRadius(CornerRadius.m958getXimpl(m1034getTopRightCornerRadiuskKHJgLs()) * fMinRadius, CornerRadius.m959getYimpl(m1034getTopRightCornerRadiuskKHJgLs()) * fMinRadius), CornerRadiusKt.CornerRadius(CornerRadius.m958getXimpl(m1032getBottomRightCornerRadiuskKHJgLs()) * fMinRadius, CornerRadius.m959getYimpl(m1032getBottomRightCornerRadiuskKHJgLs()) * fMinRadius), CornerRadiusKt.CornerRadius(CornerRadius.m958getXimpl(m1031getBottomLeftCornerRadiuskKHJgLs()) * fMinRadius, CornerRadius.m959getYimpl(m1031getBottomLeftCornerRadiuskKHJgLs()) * fMinRadius), null);
        this._scaledRadiiRect = roundRect2;
        return roundRect2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: component5-kKHJgLs, reason: not valid java name and from getter */
    public final long getTopLeftCornerRadius() {
        return this.topLeftCornerRadius;
    }

    /* JADX INFO: renamed from: component6-kKHJgLs, reason: not valid java name and from getter */
    public final long getTopRightCornerRadius() {
        return this.topRightCornerRadius;
    }

    /* JADX INFO: renamed from: component7-kKHJgLs, reason: not valid java name and from getter */
    public final long getBottomRightCornerRadius() {
        return this.bottomRightCornerRadius;
    }

    /* JADX INFO: renamed from: component8-kKHJgLs, reason: not valid java name and from getter */
    public final long getBottomLeftCornerRadius() {
        return this.bottomLeftCornerRadius;
    }

    /* JADX INFO: renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m1029containsk4lQ0M(long point) {
        float fM983getXimpl;
        float fM984getYimpl;
        float fM958getXimpl;
        float fM959getYimpl;
        if (Offset.m983getXimpl(point) < this.left || Offset.m983getXimpl(point) >= this.right || Offset.m984getYimpl(point) < this.top || Offset.m984getYimpl(point) >= this.bottom) {
            return false;
        }
        RoundRect roundRectScaledRadiiRect = scaledRadiiRect();
        if (Offset.m983getXimpl(point) < this.left + CornerRadius.m958getXimpl(roundRectScaledRadiiRect.m1033getTopLeftCornerRadiuskKHJgLs()) && Offset.m984getYimpl(point) < this.top + CornerRadius.m959getYimpl(roundRectScaledRadiiRect.m1033getTopLeftCornerRadiuskKHJgLs())) {
            fM983getXimpl = (Offset.m983getXimpl(point) - this.left) - CornerRadius.m958getXimpl(roundRectScaledRadiiRect.m1033getTopLeftCornerRadiuskKHJgLs());
            fM984getYimpl = (Offset.m984getYimpl(point) - this.top) - CornerRadius.m959getYimpl(roundRectScaledRadiiRect.m1033getTopLeftCornerRadiuskKHJgLs());
            fM958getXimpl = CornerRadius.m958getXimpl(roundRectScaledRadiiRect.m1033getTopLeftCornerRadiuskKHJgLs());
            fM959getYimpl = CornerRadius.m959getYimpl(roundRectScaledRadiiRect.m1033getTopLeftCornerRadiuskKHJgLs());
        } else if (Offset.m983getXimpl(point) > this.right - CornerRadius.m958getXimpl(roundRectScaledRadiiRect.m1034getTopRightCornerRadiuskKHJgLs()) && Offset.m984getYimpl(point) < this.top + CornerRadius.m959getYimpl(roundRectScaledRadiiRect.m1034getTopRightCornerRadiuskKHJgLs())) {
            fM983getXimpl = (Offset.m983getXimpl(point) - this.right) + CornerRadius.m958getXimpl(roundRectScaledRadiiRect.m1034getTopRightCornerRadiuskKHJgLs());
            fM984getYimpl = (Offset.m984getYimpl(point) - this.top) - CornerRadius.m959getYimpl(roundRectScaledRadiiRect.m1034getTopRightCornerRadiuskKHJgLs());
            fM958getXimpl = CornerRadius.m958getXimpl(roundRectScaledRadiiRect.m1034getTopRightCornerRadiuskKHJgLs());
            fM959getYimpl = CornerRadius.m959getYimpl(roundRectScaledRadiiRect.m1034getTopRightCornerRadiuskKHJgLs());
        } else if (Offset.m983getXimpl(point) > this.right - CornerRadius.m958getXimpl(roundRectScaledRadiiRect.m1032getBottomRightCornerRadiuskKHJgLs()) && Offset.m984getYimpl(point) > this.bottom - CornerRadius.m959getYimpl(roundRectScaledRadiiRect.m1032getBottomRightCornerRadiuskKHJgLs())) {
            fM983getXimpl = (Offset.m983getXimpl(point) - this.right) + CornerRadius.m958getXimpl(roundRectScaledRadiiRect.m1032getBottomRightCornerRadiuskKHJgLs());
            fM984getYimpl = (Offset.m984getYimpl(point) - this.bottom) + CornerRadius.m959getYimpl(roundRectScaledRadiiRect.m1032getBottomRightCornerRadiuskKHJgLs());
            fM958getXimpl = CornerRadius.m958getXimpl(roundRectScaledRadiiRect.m1032getBottomRightCornerRadiuskKHJgLs());
            fM959getYimpl = CornerRadius.m959getYimpl(roundRectScaledRadiiRect.m1032getBottomRightCornerRadiuskKHJgLs());
        } else {
            if (Offset.m983getXimpl(point) >= this.left + CornerRadius.m958getXimpl(roundRectScaledRadiiRect.m1031getBottomLeftCornerRadiuskKHJgLs()) || Offset.m984getYimpl(point) <= this.bottom - CornerRadius.m959getYimpl(roundRectScaledRadiiRect.m1031getBottomLeftCornerRadiuskKHJgLs())) {
                return true;
            }
            fM983getXimpl = (Offset.m983getXimpl(point) - this.left) - CornerRadius.m958getXimpl(roundRectScaledRadiiRect.m1031getBottomLeftCornerRadiuskKHJgLs());
            fM984getYimpl = (Offset.m984getYimpl(point) - this.bottom) + CornerRadius.m959getYimpl(roundRectScaledRadiiRect.m1031getBottomLeftCornerRadiuskKHJgLs());
            fM958getXimpl = CornerRadius.m958getXimpl(roundRectScaledRadiiRect.m1031getBottomLeftCornerRadiuskKHJgLs());
            fM959getYimpl = CornerRadius.m959getYimpl(roundRectScaledRadiiRect.m1031getBottomLeftCornerRadiuskKHJgLs());
        }
        float f = fM983getXimpl / fM958getXimpl;
        float f2 = fM984getYimpl / fM959getYimpl;
        return (f * f) + (f2 * f2) <= 1.0f;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-MDFrsts, reason: not valid java name */
    public final RoundRect m1030copyMDFrsts(float left, float top, float right, float bottom, long topLeftCornerRadius, long topRightCornerRadius, long bottomRightCornerRadius, long bottomLeftCornerRadius) {
        return new RoundRect(left, top, right, bottom, topLeftCornerRadius, topRightCornerRadius, bottomRightCornerRadius, bottomLeftCornerRadius, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.left), (Object) Float.valueOf(roundRect.left)) && Intrinsics.areEqual((Object) Float.valueOf(this.top), (Object) Float.valueOf(roundRect.top)) && Intrinsics.areEqual((Object) Float.valueOf(this.right), (Object) Float.valueOf(roundRect.right)) && Intrinsics.areEqual((Object) Float.valueOf(this.bottom), (Object) Float.valueOf(roundRect.bottom)) && CornerRadius.m957equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && CornerRadius.m957equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && CornerRadius.m957equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && CornerRadius.m957equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: getBottomLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m1031getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* JADX INFO: renamed from: getBottomRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m1032getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: getTopLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m1033getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* JADX INFO: renamed from: getTopRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m1034getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((((((((((Float.floatToIntBits(this.left) * 31) + Float.floatToIntBits(this.top)) * 31) + Float.floatToIntBits(this.right)) * 31) + Float.floatToIntBits(this.bottom)) * 31) + CornerRadius.m960hashCodeimpl(this.topLeftCornerRadius)) * 31) + CornerRadius.m960hashCodeimpl(this.topRightCornerRadius)) * 31) + CornerRadius.m960hashCodeimpl(this.bottomRightCornerRadius)) * 31) + CornerRadius.m960hashCodeimpl(this.bottomLeftCornerRadius);
    }

    @NotNull
    public String toString() {
        long jM1033getTopLeftCornerRadiuskKHJgLs = m1033getTopLeftCornerRadiuskKHJgLs();
        long jM1034getTopRightCornerRadiuskKHJgLs = m1034getTopRightCornerRadiuskKHJgLs();
        long jM1032getBottomRightCornerRadiuskKHJgLs = m1032getBottomRightCornerRadiuskKHJgLs();
        long jM1031getBottomLeftCornerRadiuskKHJgLs = m1031getBottomLeftCornerRadiuskKHJgLs();
        String str = GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
        if (!CornerRadius.m957equalsimpl0(jM1033getTopLeftCornerRadiuskKHJgLs, jM1034getTopRightCornerRadiuskKHJgLs) || !CornerRadius.m957equalsimpl0(jM1034getTopRightCornerRadiuskKHJgLs, jM1032getBottomRightCornerRadiuskKHJgLs) || !CornerRadius.m957equalsimpl0(jM1032getBottomRightCornerRadiuskKHJgLs, jM1031getBottomLeftCornerRadiuskKHJgLs)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) CornerRadius.m964toStringimpl(jM1033getTopLeftCornerRadiuskKHJgLs)) + ", topRight=" + ((Object) CornerRadius.m964toStringimpl(jM1034getTopRightCornerRadiuskKHJgLs)) + ", bottomRight=" + ((Object) CornerRadius.m964toStringimpl(jM1032getBottomRightCornerRadiuskKHJgLs)) + ", bottomLeft=" + ((Object) CornerRadius.m964toStringimpl(jM1031getBottomLeftCornerRadiuskKHJgLs)) + ')';
        }
        if (CornerRadius.m958getXimpl(jM1033getTopLeftCornerRadiuskKHJgLs) == CornerRadius.m959getYimpl(jM1033getTopLeftCornerRadiuskKHJgLs)) {
            return "RoundRect(rect=" + str + ", radius=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m958getXimpl(jM1033getTopLeftCornerRadiuskKHJgLs), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m958getXimpl(jM1033getTopLeftCornerRadiuskKHJgLs), 1) + ", y=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m959getYimpl(jM1033getTopLeftCornerRadiuskKHJgLs), 1) + ')';
    }

    public /* synthetic */ RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, (i & 16) != 0 ? CornerRadius.INSTANCE.m968getZerokKHJgLs() : j, (i & 32) != 0 ? CornerRadius.INSTANCE.m968getZerokKHJgLs() : j2, (i & 64) != 0 ? CornerRadius.INSTANCE.m968getZerokKHJgLs() : j3, (i & 128) != 0 ? CornerRadius.INSTANCE.m968getZerokKHJgLs() : j4, null);
    }
}
