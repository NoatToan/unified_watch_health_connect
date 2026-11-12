package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import defpackage.yi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.math.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B0\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010/\u001a\u00020\b\u0012\u0017\u00107\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020503¢\u0006\u0002\b6¢\u0006\u0004\b8\u00109J\u0019\u0010\u0007\u001a\u00020\u0004*\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000bJ#\u0010\u0010\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ#\u0010\u0012\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ)\u0010\u001a\u001a\u00020\u0017*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001f\u001a\u00020\u001d*\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u001c\u0010 \u001a\u00020\u001d*\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u001c\u0010\"\u001a\u00020\u001d*\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001dH\u0016J\u001c\u0010#\u001a\u00020\u001d*\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001dH\u0016J\u0013\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010'\u001a\u00020\u001dH\u0016J\b\u0010)\u001a\u00020(H\u0016R\u0019\u0010+\u001a\u00020*8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010/\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/IntSize;", "findSize-ToXhtMw", "(J)J", "findSize", "", "enforceConstraints", "tryMaxWidth-JN-0ABg", "(JZ)J", "tryMaxWidth", "tryMaxHeight-JN-0ABg", "tryMaxHeight", "tryMinWidth-JN-0ABg", "tryMinWidth", "tryMinHeight-JN-0ABg", "tryMinHeight", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "maxIntrinsicWidth", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "minIntrinsicHeight", "maxIntrinsicHeight", "", "other", "equals", "hashCode", "", "toString", "", "aspectRatio", "F", "getAspectRatio", "()F", "matchHeightConstraintsFirst", "Z", "getMatchHeightConstraintsFirst", "()Z", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "<init>", "(FZLkotlin/jvm/functions/Function1;)V", "foundation-layout_release"}, k = 1, mv = {1, 5, 1})
final class AspectRatioModifier extends InspectorValueInfo implements LayoutModifier {
    private final float aspectRatio;
    private final boolean matchHeightConstraintsFirst;

    public AspectRatioModifier(float f, boolean z, @NotNull Function1<? super InspectorInfo, Unit> function1) {
        super(function1);
        this.aspectRatio = f;
        this.matchHeightConstraintsFirst = z;
        if (f > 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("aspectRatio " + getAspectRatio() + " must be > 0").toString());
    }

    /* JADX INFO: renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m247findSizeToXhtMw(long j) {
        if (this.matchHeightConstraintsFirst) {
            long jM249tryMaxHeightJN0ABg$default = m249tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            IntSize.Companion companion = IntSize.INSTANCE;
            if (!IntSize.m3083equalsimpl0(jM249tryMaxHeightJN0ABg$default, companion.m3090getZeroYbymL2g())) {
                return jM249tryMaxHeightJN0ABg$default;
            }
            long jM251tryMaxWidthJN0ABg$default = m251tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m3083equalsimpl0(jM251tryMaxWidthJN0ABg$default, companion.m3090getZeroYbymL2g())) {
                return jM251tryMaxWidthJN0ABg$default;
            }
            long jM253tryMinHeightJN0ABg$default = m253tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m3083equalsimpl0(jM253tryMinHeightJN0ABg$default, companion.m3090getZeroYbymL2g())) {
                return jM253tryMinHeightJN0ABg$default;
            }
            long jM255tryMinWidthJN0ABg$default = m255tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m3083equalsimpl0(jM255tryMinWidthJN0ABg$default, companion.m3090getZeroYbymL2g())) {
                return jM255tryMinWidthJN0ABg$default;
            }
            long jM248tryMaxHeightJN0ABg = m248tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m3083equalsimpl0(jM248tryMaxHeightJN0ABg, companion.m3090getZeroYbymL2g())) {
                return jM248tryMaxHeightJN0ABg;
            }
            long jM250tryMaxWidthJN0ABg = m250tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m3083equalsimpl0(jM250tryMaxWidthJN0ABg, companion.m3090getZeroYbymL2g())) {
                return jM250tryMaxWidthJN0ABg;
            }
            long jM252tryMinHeightJN0ABg = m252tryMinHeightJN0ABg(j, false);
            if (!IntSize.m3083equalsimpl0(jM252tryMinHeightJN0ABg, companion.m3090getZeroYbymL2g())) {
                return jM252tryMinHeightJN0ABg;
            }
            long jM254tryMinWidthJN0ABg = m254tryMinWidthJN0ABg(j, false);
            if (!IntSize.m3083equalsimpl0(jM254tryMinWidthJN0ABg, companion.m3090getZeroYbymL2g())) {
                return jM254tryMinWidthJN0ABg;
            }
        } else {
            long jM251tryMaxWidthJN0ABg$default2 = m251tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            IntSize.Companion companion2 = IntSize.INSTANCE;
            if (!IntSize.m3083equalsimpl0(jM251tryMaxWidthJN0ABg$default2, companion2.m3090getZeroYbymL2g())) {
                return jM251tryMaxWidthJN0ABg$default2;
            }
            long jM249tryMaxHeightJN0ABg$default2 = m249tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m3083equalsimpl0(jM249tryMaxHeightJN0ABg$default2, companion2.m3090getZeroYbymL2g())) {
                return jM249tryMaxHeightJN0ABg$default2;
            }
            long jM255tryMinWidthJN0ABg$default2 = m255tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m3083equalsimpl0(jM255tryMinWidthJN0ABg$default2, companion2.m3090getZeroYbymL2g())) {
                return jM255tryMinWidthJN0ABg$default2;
            }
            long jM253tryMinHeightJN0ABg$default2 = m253tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m3083equalsimpl0(jM253tryMinHeightJN0ABg$default2, companion2.m3090getZeroYbymL2g())) {
                return jM253tryMinHeightJN0ABg$default2;
            }
            long jM250tryMaxWidthJN0ABg2 = m250tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m3083equalsimpl0(jM250tryMaxWidthJN0ABg2, companion2.m3090getZeroYbymL2g())) {
                return jM250tryMaxWidthJN0ABg2;
            }
            long jM248tryMaxHeightJN0ABg2 = m248tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m3083equalsimpl0(jM248tryMaxHeightJN0ABg2, companion2.m3090getZeroYbymL2g())) {
                return jM248tryMaxHeightJN0ABg2;
            }
            long jM254tryMinWidthJN0ABg2 = m254tryMinWidthJN0ABg(j, false);
            if (!IntSize.m3083equalsimpl0(jM254tryMinWidthJN0ABg2, companion2.m3090getZeroYbymL2g())) {
                return jM254tryMinWidthJN0ABg2;
            }
            long jM252tryMinHeightJN0ABg2 = m252tryMinHeightJN0ABg(j, false);
            if (!IntSize.m3083equalsimpl0(jM252tryMinHeightJN0ABg2, companion2.m3090getZeroYbymL2g())) {
                return jM252tryMinHeightJN0ABg2;
            }
        }
        return IntSize.INSTANCE.m3090getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m248tryMaxHeightJN0ABg(long j, boolean z) {
        int iRoundToInt;
        int iM2934getMaxHeightimpl = Constraints.m2934getMaxHeightimpl(j);
        if (iM2934getMaxHeightimpl != Integer.MAX_VALUE && (iRoundToInt = c.roundToInt(iM2934getMaxHeightimpl * this.aspectRatio)) > 0) {
            long jIntSize = IntSizeKt.IntSize(iRoundToInt, iM2934getMaxHeightimpl);
            if (!z || ConstraintsKt.m2950isSatisfiedBy4WqzIAM(j, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m3090getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMaxHeight-JN-0ABg$default, reason: not valid java name */
    public static /* synthetic */ long m249tryMaxHeightJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m248tryMaxHeightJN0ABg(j, z);
    }

    /* JADX INFO: renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m250tryMaxWidthJN0ABg(long j, boolean z) {
        int iRoundToInt;
        int iM2935getMaxWidthimpl = Constraints.m2935getMaxWidthimpl(j);
        if (iM2935getMaxWidthimpl != Integer.MAX_VALUE && (iRoundToInt = c.roundToInt(iM2935getMaxWidthimpl / this.aspectRatio)) > 0) {
            long jIntSize = IntSizeKt.IntSize(iM2935getMaxWidthimpl, iRoundToInt);
            if (!z || ConstraintsKt.m2950isSatisfiedBy4WqzIAM(j, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m3090getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMaxWidth-JN-0ABg$default, reason: not valid java name */
    public static /* synthetic */ long m251tryMaxWidthJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m250tryMaxWidthJN0ABg(j, z);
    }

    /* JADX INFO: renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m252tryMinHeightJN0ABg(long j, boolean z) {
        int iM2936getMinHeightimpl = Constraints.m2936getMinHeightimpl(j);
        int iRoundToInt = c.roundToInt(iM2936getMinHeightimpl * this.aspectRatio);
        if (iRoundToInt > 0) {
            long jIntSize = IntSizeKt.IntSize(iRoundToInt, iM2936getMinHeightimpl);
            if (!z || ConstraintsKt.m2950isSatisfiedBy4WqzIAM(j, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m3090getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMinHeight-JN-0ABg$default, reason: not valid java name */
    public static /* synthetic */ long m253tryMinHeightJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m252tryMinHeightJN0ABg(j, z);
    }

    /* JADX INFO: renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m254tryMinWidthJN0ABg(long j, boolean z) {
        int iM2937getMinWidthimpl = Constraints.m2937getMinWidthimpl(j);
        int iRoundToInt = c.roundToInt(iM2937getMinWidthimpl / this.aspectRatio);
        if (iRoundToInt > 0) {
            long jIntSize = IntSizeKt.IntSize(iM2937getMinWidthimpl, iRoundToInt);
            if (!z || ConstraintsKt.m2950isSatisfiedBy4WqzIAM(j, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m3090getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMinWidth-JN-0ABg$default, reason: not valid java name */
    public static /* synthetic */ long m255tryMinWidthJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m254tryMinWidthJN0ABg(j, z);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return LayoutModifier.DefaultImpls.all(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return LayoutModifier.DefaultImpls.any(this, function1);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        AspectRatioModifier aspectRatioModifier = other instanceof AspectRatioModifier ? (AspectRatioModifier) other : null;
        if (aspectRatioModifier == null) {
            return false;
        }
        return ((this.aspectRatio > aspectRatioModifier.aspectRatio ? 1 : (this.aspectRatio == aspectRatioModifier.aspectRatio ? 0 : -1)) == 0) && this.matchHeightConstraintsFirst == ((AspectRatioModifier) other).matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldIn(R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
        return (R) LayoutModifier.DefaultImpls.foldIn(this, r, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldOut(R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
        return (R) LayoutModifier.DefaultImpls.foldOut(this, r, function2);
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.aspectRatio) * 31) + yi.a(this.matchHeightConstraintsFirst);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return i != Integer.MAX_VALUE ? c.roundToInt(i / this.aspectRatio) : intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return i != Integer.MAX_VALUE ? c.roundToInt(i * this.aspectRatio) : intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo22measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
        long jM247findSizeToXhtMw = m247findSizeToXhtMw(j);
        if (!IntSize.m3083equalsimpl0(jM247findSizeToXhtMw, IntSize.INSTANCE.m3090getZeroYbymL2g())) {
            j = Constraints.INSTANCE.m2943fixedJhjzzOo(IntSize.m3085getWidthimpl(jM247findSizeToXhtMw), IntSize.m3084getHeightimpl(jM247findSizeToXhtMw));
        }
        final Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(j);
        return MeasureScope.DefaultImpls.layout$default(measureScope, placeableMo2468measureBRTryo0.getWidth(), placeableMo2468measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AspectRatioModifier$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return i != Integer.MAX_VALUE ? c.roundToInt(i / this.aspectRatio) : intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return i != Integer.MAX_VALUE ? c.roundToInt(i * this.aspectRatio) : intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.Modifier
    @NotNull
    public Modifier then(@NotNull Modifier modifier) {
        return LayoutModifier.DefaultImpls.then(this, modifier);
    }

    @NotNull
    public String toString() {
        return "AspectRatioModifier(aspectRatio=" + this.aspectRatio + ')';
    }
}
