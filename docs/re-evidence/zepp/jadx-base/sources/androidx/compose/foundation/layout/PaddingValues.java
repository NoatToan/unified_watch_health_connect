package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.PaddingValuesImpl, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u0001B2\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b%\u0010&J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\tJ\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016R+\u0010\u0017\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\tR+\u0010\u001c\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u0018\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\tR+\u0010\u001f\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u0012\u0004\b!\u0010\u001b\u001a\u0004\b \u0010\tR+\u0010\"\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0012\n\u0004\b\"\u0010\u0018\u0012\u0004\b$\u0010\u001b\u001a\u0004\b#\u0010\t\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesImpl;", "Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Dp;", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateLeftPadding", "calculateTopPadding-D9Ej5fM", "()F", "calculateTopPadding", "calculateRightPadding-u2uoSUM", "calculateRightPadding", "calculateBottomPadding-D9Ej5fM", "calculateBottomPadding", "", "other", "", "equals", "", "hashCode", "", "toString", "start", "F", "getStart-D9Ej5fM", "getStart-D9Ej5fM$annotations", "()V", "top", "getTop-D9Ej5fM", "getTop-D9Ej5fM$annotations", "end", "getEnd-D9Ej5fM", "getEnd-D9Ej5fM$annotations", "bottom", "getBottom-D9Ej5fM", "getBottom-D9Ej5fM$annotations", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation-layout_release"}, k = 1, mv = {1, 5, 1})
public final class PaddingValues implements androidx.compose.foundation.layout.PaddingValues {
    private final float bottom;
    private final float end;
    private final float start;
    private final float top;

    private PaddingValues(float f, float f2, float f3, float f4) {
        this.start = f;
        this.top = f2;
        this.end = f3;
        this.bottom = f4;
    }

    public /* synthetic */ PaddingValues(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    @Stable
    /* JADX INFO: renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m298getBottomD9Ej5fM$annotations() {
    }

    @Stable
    /* JADX INFO: renamed from: getEnd-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m299getEndD9Ej5fM$annotations() {
    }

    @Stable
    /* JADX INFO: renamed from: getStart-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m300getStartD9Ej5fM$annotations() {
    }

    @Stable
    /* JADX INFO: renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m301getTopD9Ej5fM$annotations() {
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM */
    public float getBottom() {
        return getBottom();
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM */
    public float mo291calculateLeftPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? getStart() : getEnd();
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM */
    public float mo292calculateRightPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? getEnd() : getStart();
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM */
    public float getTop() {
        return getTop();
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof PaddingValues)) {
            return false;
        }
        PaddingValues paddingValues = (PaddingValues) other;
        return Dp.m2970equalsimpl0(getStart(), paddingValues.getStart()) && Dp.m2970equalsimpl0(getTop(), paddingValues.getTop()) && Dp.m2970equalsimpl0(getEnd(), paddingValues.getEnd()) && Dp.m2970equalsimpl0(getBottom(), paddingValues.getBottom());
    }

    /* JADX INFO: renamed from: getBottom-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: getEnd-D9Ej5fM, reason: not valid java name and from getter */
    public final float getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: getStart-D9Ej5fM, reason: not valid java name and from getter */
    public final float getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((Dp.m2971hashCodeimpl(getStart()) * 31) + Dp.m2971hashCodeimpl(getTop())) * 31) + Dp.m2971hashCodeimpl(getEnd())) * 31) + Dp.m2971hashCodeimpl(getBottom());
    }

    @NotNull
    public String toString() {
        return "PaddingValues(start=" + ((Object) Dp.m2976toStringimpl(getStart())) + ", top=" + ((Object) Dp.m2976toStringimpl(getTop())) + ", end=" + ((Object) Dp.m2976toStringimpl(getEnd())) + ", bottom=" + ((Object) Dp.m2976toStringimpl(getBottom()));
    }

    public /* synthetic */ PaddingValues(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dp.m2965constructorimpl(0) : f, (i & 2) != 0 ? Dp.m2965constructorimpl(0) : f2, (i & 4) != 0 ? Dp.m2965constructorimpl(0) : f3, (i & 8) != 0 ? Dp.m2965constructorimpl(0) : f4, null);
    }
}
