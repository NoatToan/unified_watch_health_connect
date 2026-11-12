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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BS\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u0017\u0012\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&¢\u0006\u0002\b)ø\u0001\u0000¢\u0006\u0004\b+\u0010,J)\u0010\u000b\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u0010\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0012\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0014\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0016R\u001f\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001f\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001f\u0010\u001e\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001f\u0010\u001f\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0016\u0010 \u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R#\u0010%\u001a\u00020\u0006*\u00020\"8B@\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/foundation/layout/SizeModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "", "other", "", "equals", "hashCode", "Landroidx/compose/ui/unit/Dp;", "minWidth", "F", "minHeight", "maxWidth", "maxHeight", "enforceIncoming", "Z", "Landroidx/compose/ui/unit/Density;", "getTargetConstraints-OenEA2s", "(Landroidx/compose/ui/unit/Density;)J", "targetConstraints", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "<init>", "(FFFFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation-layout_release"}, k = 1, mv = {1, 5, 1})
final class SizeModifier extends InspectorValueInfo implements LayoutModifier {
    private final boolean enforceIncoming;
    private final float maxHeight;
    private final float maxWidth;
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ SizeModifier(float f, float f2, float f3, float f4, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dp.INSTANCE.m2985getUnspecifiedD9Ej5fM() : f, (i & 2) != 0 ? Dp.INSTANCE.m2985getUnspecifiedD9Ej5fM() : f2, (i & 4) != 0 ? Dp.INSTANCE.m2985getUnspecifiedD9Ej5fM() : f3, (i & 8) != 0 ? Dp.INSTANCE.m2985getUnspecifiedD9Ej5fM() : f4, z, function1, null);
    }

    public /* synthetic */ SizeModifier(float f, float f2, float f3, float f4, boolean z, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z, function1);
    }

    /* JADX INFO: renamed from: getTargetConstraints-OenEA2s, reason: not valid java name */
    private final long m332getTargetConstraintsOenEA2s(Density density) {
        int iCoerceAtLeast;
        int iCoerceAtLeast2;
        float f = this.maxWidth;
        Dp.Companion companion = Dp.INSTANCE;
        int i = 0;
        int iMo188roundToPx0680j_4 = !Dp.m2970equalsimpl0(f, companion.m2985getUnspecifiedD9Ej5fM()) ? density.mo188roundToPx0680j_4(((Dp) RangesKt.coerceAtLeast(Dp.m2963boximpl(this.maxWidth), Dp.m2963boximpl(Dp.m2965constructorimpl(0)))).m2979unboximpl()) : Integer.MAX_VALUE;
        int iMo188roundToPx0680j_5 = !Dp.m2970equalsimpl0(this.maxHeight, companion.m2985getUnspecifiedD9Ej5fM()) ? density.mo188roundToPx0680j_4(((Dp) RangesKt.coerceAtLeast(Dp.m2963boximpl(this.maxHeight), Dp.m2963boximpl(Dp.m2965constructorimpl(0)))).m2979unboximpl()) : Integer.MAX_VALUE;
        if (Dp.m2970equalsimpl0(this.minWidth, companion.m2985getUnspecifiedD9Ej5fM()) || (iCoerceAtLeast = e.coerceAtLeast(e.coerceAtMost(density.mo188roundToPx0680j_4(this.minWidth), iMo188roundToPx0680j_4), 0)) == Integer.MAX_VALUE) {
            iCoerceAtLeast = 0;
        }
        if (!Dp.m2970equalsimpl0(this.minHeight, companion.m2985getUnspecifiedD9Ej5fM()) && (iCoerceAtLeast2 = e.coerceAtLeast(e.coerceAtMost(density.mo188roundToPx0680j_4(this.minHeight), iMo188roundToPx0680j_5), 0)) != Integer.MAX_VALUE) {
            i = iCoerceAtLeast2;
        }
        return ConstraintsKt.Constraints(iCoerceAtLeast, iMo188roundToPx0680j_4, i, iMo188roundToPx0680j_5);
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
        if (!(other instanceof SizeModifier)) {
            return false;
        }
        SizeModifier sizeModifier = (SizeModifier) other;
        return Dp.m2970equalsimpl0(this.minWidth, sizeModifier.minWidth) && Dp.m2970equalsimpl0(this.minHeight, sizeModifier.minHeight) && Dp.m2970equalsimpl0(this.maxWidth, sizeModifier.maxWidth) && Dp.m2970equalsimpl0(this.maxHeight, sizeModifier.maxHeight) && this.enforceIncoming == sizeModifier.enforceIncoming;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldIn(R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
        return (R) LayoutModifier.DefaultImpls.foldIn(this, r, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldOut(R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
        return (R) LayoutModifier.DefaultImpls.foldOut(this, r, function2);
    }

    public int hashCode() {
        return ((((((Dp.m2971hashCodeimpl(this.minWidth) * 31) + Dp.m2971hashCodeimpl(this.minHeight)) * 31) + Dp.m2971hashCodeimpl(this.maxWidth)) * 31) + Dp.m2971hashCodeimpl(this.maxHeight)) * 31;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jM332getTargetConstraintsOenEA2s = m332getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m2932getHasFixedHeightimpl(jM332getTargetConstraintsOenEA2s) ? Constraints.m2934getMaxHeightimpl(jM332getTargetConstraintsOenEA2s) : ConstraintsKt.m2948constrainHeightK40F9xA(jM332getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicHeight(i));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jM332getTargetConstraintsOenEA2s = m332getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m2933getHasFixedWidthimpl(jM332getTargetConstraintsOenEA2s) ? Constraints.m2935getMaxWidthimpl(jM332getTargetConstraintsOenEA2s) : ConstraintsKt.m2949constrainWidthK40F9xA(jM332getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicWidth(i));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo22measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
        long jConstraints;
        long jM332getTargetConstraintsOenEA2s = m332getTargetConstraintsOenEA2s(measureScope);
        if (this.enforceIncoming) {
            jConstraints = ConstraintsKt.m2947constrainN9IONVI(j, jM332getTargetConstraintsOenEA2s);
        } else {
            float f = this.minWidth;
            Dp.Companion companion = Dp.INSTANCE;
            jConstraints = ConstraintsKt.Constraints(!Dp.m2970equalsimpl0(f, companion.m2985getUnspecifiedD9Ej5fM()) ? Constraints.m2937getMinWidthimpl(jM332getTargetConstraintsOenEA2s) : e.coerceAtMost(Constraints.m2937getMinWidthimpl(j), Constraints.m2935getMaxWidthimpl(jM332getTargetConstraintsOenEA2s)), !Dp.m2970equalsimpl0(this.maxWidth, companion.m2985getUnspecifiedD9Ej5fM()) ? Constraints.m2935getMaxWidthimpl(jM332getTargetConstraintsOenEA2s) : e.coerceAtLeast(Constraints.m2935getMaxWidthimpl(j), Constraints.m2937getMinWidthimpl(jM332getTargetConstraintsOenEA2s)), !Dp.m2970equalsimpl0(this.minHeight, companion.m2985getUnspecifiedD9Ej5fM()) ? Constraints.m2936getMinHeightimpl(jM332getTargetConstraintsOenEA2s) : e.coerceAtMost(Constraints.m2936getMinHeightimpl(j), Constraints.m2934getMaxHeightimpl(jM332getTargetConstraintsOenEA2s)), !Dp.m2970equalsimpl0(this.maxHeight, companion.m2985getUnspecifiedD9Ej5fM()) ? Constraints.m2934getMaxHeightimpl(jM332getTargetConstraintsOenEA2s) : e.coerceAtLeast(Constraints.m2934getMaxHeightimpl(j), Constraints.m2936getMinHeightimpl(jM332getTargetConstraintsOenEA2s)));
        }
        final Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(jConstraints);
        return MeasureScope.DefaultImpls.layout$default(measureScope, placeableMo2468measureBRTryo0.getWidth(), placeableMo2468measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.SizeModifier$measure$1
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
        long jM332getTargetConstraintsOenEA2s = m332getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m2932getHasFixedHeightimpl(jM332getTargetConstraintsOenEA2s) ? Constraints.m2934getMaxHeightimpl(jM332getTargetConstraintsOenEA2s) : ConstraintsKt.m2948constrainHeightK40F9xA(jM332getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicHeight(i));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jM332getTargetConstraintsOenEA2s = m332getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m2933getHasFixedWidthimpl(jM332getTargetConstraintsOenEA2s) ? Constraints.m2935getMaxWidthimpl(jM332getTargetConstraintsOenEA2s) : ConstraintsKt.m2949constrainWidthK40F9xA(jM332getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicWidth(i));
    }

    @Override // androidx.compose.ui.Modifier
    @NotNull
    public Modifier then(@NotNull Modifier modifier) {
        return LayoutModifier.DefaultImpls.then(this, modifier);
    }

    private SizeModifier(float f, float f2, float f3, float f4, boolean z, Function1<? super InspectorInfo, Unit> function1) {
        super(function1);
        this.minWidth = f;
        this.minHeight = f2;
        this.maxWidth = f3;
        this.maxHeight = f4;
        this.enforceIncoming = z;
    }
}
