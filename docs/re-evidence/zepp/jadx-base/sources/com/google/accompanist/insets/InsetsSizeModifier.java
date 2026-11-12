package com.google.accompanist.insets;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B>\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\"\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b4\u00105J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u0019\u0010\u0007\u001a\u00020\u0006HÂ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÂ\u0003J\u0019\u0010\u000b\u001a\u00020\u0006HÂ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\bJ)\u0010\u0014\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0019\u001a\u00020\u0017*\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u001c\u0010\u001a\u001a\u00020\u0017*\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u001c\u0010\u001c\u001a\u00020\u0017*\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u001c\u0010\u001d\u001a\u00020\u0017*\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0017H\u0016JL\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010 \u001a\u00020\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\"\u001a\u00020\u0006HÆ\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b#\u0010$J\t\u0010&\u001a\u00020%HÖ\u0001J\t\u0010'\u001a\u00020\u0017HÖ\u0001J\u0013\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003R\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u001f\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0018\u0010!\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010/R\u001f\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u0010.R#\u00103\u001a\u00020\u000f*\u0002008B@\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b1\u00102\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"Lcom/google/accompanist/insets/InsetsSizeModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Lcom/google/accompanist/insets/WindowInsets$Type;", "a", "Lcom/google/accompanist/insets/HorizontalSide;", "b", "Landroidx/compose/ui/unit/Dp;", "c", "()F", "Lcom/google/accompanist/insets/VerticalSide;", GoogleApiAvailabilityLight.a, "e", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "maxIntrinsicWidth", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "minIntrinsicHeight", "maxIntrinsicHeight", "insetsType", "widthSide", "additionalWidth", "heightSide", "additionalHeight", "f", "(Lcom/google/accompanist/insets/WindowInsets$Type;Lcom/google/accompanist/insets/HorizontalSide;FLcom/google/accompanist/insets/VerticalSide;F)Lcom/google/accompanist/insets/InsetsSizeModifier;", "", "toString", "hashCode", "", "other", "", "equals", "Lcom/google/accompanist/insets/WindowInsets$Type;", "Lcom/google/accompanist/insets/HorizontalSide;", "F", "Lcom/google/accompanist/insets/VerticalSide;", "Landroidx/compose/ui/unit/Density;", "h", "(Landroidx/compose/ui/unit/Density;)J", "targetConstraints", "<init>", "(Lcom/google/accompanist/insets/WindowInsets$Type;Lcom/google/accompanist/insets/HorizontalSide;FLcom/google/accompanist/insets/VerticalSide;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "insets_release"}, k = 1, mv = {1, 5, 1})
final /* data */ class InsetsSizeModifier implements LayoutModifier {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final WindowInsets.Type insetsType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final HorizontalSide widthSide;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final float additionalWidth;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final VerticalSide heightSide;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final float additionalHeight;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HorizontalSide.values().length];
            iArr[HorizontalSide.Left.ordinal()] = 1;
            iArr[HorizontalSide.Right.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VerticalSide.values().length];
            iArr2[VerticalSide.Top.ordinal()] = 1;
            iArr2[VerticalSide.Bottom.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
        public final /* synthetic */ Placeable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Placeable placeable) {
            super(1);
            this.a = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope.place$default(placementScope, this.a, 0, 0, 0.0f, 4, null);
        }
    }

    private InsetsSizeModifier(WindowInsets.Type type, HorizontalSide horizontalSide, float f, VerticalSide verticalSide, float f2) {
        this.insetsType = type;
        this.widthSide = horizontalSide;
        this.additionalWidth = f;
        this.heightSide = verticalSide;
        this.additionalHeight = f2;
    }

    public /* synthetic */ InsetsSizeModifier(WindowInsets.Type type, HorizontalSide horizontalSide, float f, VerticalSide verticalSide, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, horizontalSide, f, verticalSide, f2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    private final WindowInsets.Type getInsetsType() {
        return this.insetsType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    private final HorizontalSide getWidthSide() {
        return this.widthSide;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    private final float getAdditionalWidth() {
        return this.additionalWidth;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    private final VerticalSide getHeightSide() {
        return this.heightSide;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    private final float getAdditionalHeight() {
        return this.additionalHeight;
    }

    public static /* synthetic */ InsetsSizeModifier g(InsetsSizeModifier insetsSizeModifier, WindowInsets.Type type, HorizontalSide horizontalSide, float f, VerticalSide verticalSide, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            type = insetsSizeModifier.insetsType;
        }
        if ((i & 2) != 0) {
            horizontalSide = insetsSizeModifier.widthSide;
        }
        HorizontalSide horizontalSide2 = horizontalSide;
        if ((i & 4) != 0) {
            f = insetsSizeModifier.additionalWidth;
        }
        float f3 = f;
        if ((i & 8) != 0) {
            verticalSide = insetsSizeModifier.heightSide;
        }
        VerticalSide verticalSide2 = verticalSide;
        if ((i & 16) != 0) {
            f2 = insetsSizeModifier.additionalHeight;
        }
        return insetsSizeModifier.f(type, horizontalSide2, f3, verticalSide2, f2);
    }

    private final long h(Density density) {
        int left;
        int i;
        int top;
        int left2;
        int iMo188roundToPx0680j_4 = density.mo188roundToPx0680j_4(this.additionalWidth);
        int iMo188roundToPx0680j_5 = density.mo188roundToPx0680j_4(this.additionalHeight);
        HorizontalSide horizontalSide = this.widthSide;
        int i2 = horizontalSide == null ? -1 : WhenMappings.$EnumSwitchMapping$0[horizontalSide.ordinal()];
        int top2 = 0;
        if (i2 == -1) {
            left = 0;
        } else if (i2 == 1) {
            left = this.insetsType.getLeft();
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            left = this.insetsType.getRight();
        }
        int i3 = left + iMo188roundToPx0680j_4;
        VerticalSide verticalSide = this.heightSide;
        int i4 = verticalSide == null ? -1 : WhenMappings.$EnumSwitchMapping$1[verticalSide.ordinal()];
        if (i4 != -1) {
            if (i4 == 1) {
                top2 = this.insetsType.getTop();
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                top2 = this.insetsType.getBottom();
            }
        }
        int i5 = top2 + iMo188roundToPx0680j_5;
        HorizontalSide horizontalSide2 = this.widthSide;
        int i6 = horizontalSide2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[horizontalSide2.ordinal()];
        int i7 = Integer.MAX_VALUE;
        if (i6 != -1) {
            if (i6 == 1) {
                left2 = this.insetsType.getLeft();
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                left2 = this.insetsType.getRight();
            }
            i = left2 + iMo188roundToPx0680j_4;
        } else {
            i = Integer.MAX_VALUE;
        }
        VerticalSide verticalSide2 = this.heightSide;
        int i8 = verticalSide2 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[verticalSide2.ordinal()];
        if (i8 != -1) {
            if (i8 == 1) {
                top = this.insetsType.getTop();
            } else {
                if (i8 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                top = this.insetsType.getBottom();
            }
            i7 = top + iMo188roundToPx0680j_5;
        }
        return ConstraintsKt.Constraints(i3, i, i5, i7);
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
        if (!(other instanceof InsetsSizeModifier)) {
            return false;
        }
        InsetsSizeModifier insetsSizeModifier = (InsetsSizeModifier) other;
        return Intrinsics.areEqual(this.insetsType, insetsSizeModifier.insetsType) && this.widthSide == insetsSizeModifier.widthSide && Dp.m2970equalsimpl0(this.additionalWidth, insetsSizeModifier.additionalWidth) && this.heightSide == insetsSizeModifier.heightSide && Dp.m2970equalsimpl0(this.additionalHeight, insetsSizeModifier.additionalHeight);
    }

    @NotNull
    public final InsetsSizeModifier f(@NotNull WindowInsets.Type insetsType, @Nullable HorizontalSide widthSide, float additionalWidth, @Nullable VerticalSide heightSide, float additionalHeight) {
        return new InsetsSizeModifier(insetsType, widthSide, additionalWidth, heightSide, additionalHeight, null);
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
        int iHashCode = this.insetsType.hashCode() * 31;
        HorizontalSide horizontalSide = this.widthSide;
        int iHashCode2 = (((iHashCode + (horizontalSide == null ? 0 : horizontalSide.hashCode())) * 31) + Dp.m2971hashCodeimpl(this.additionalWidth)) * 31;
        VerticalSide verticalSide = this.heightSide;
        return ((iHashCode2 + (verticalSide != null ? verticalSide.hashCode() : 0)) * 31) + Dp.m2971hashCodeimpl(this.additionalHeight);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i);
        long jH = h(intrinsicMeasureScope);
        return e.coerceIn(iMaxIntrinsicHeight, Constraints.m2936getMinHeightimpl(jH), Constraints.m2934getMaxHeightimpl(jH));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i);
        long jH = h(intrinsicMeasureScope);
        return e.coerceIn(iMaxIntrinsicWidth, Constraints.m2937getMinWidthimpl(jH), Constraints.m2935getMaxWidthimpl(jH));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo22measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
        long jH = h(measureScope);
        Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(ConstraintsKt.Constraints(this.widthSide != null ? Constraints.m2937getMinWidthimpl(jH) : e.coerceAtMost(Constraints.m2937getMinWidthimpl(j), Constraints.m2935getMaxWidthimpl(jH)), this.widthSide != null ? Constraints.m2935getMaxWidthimpl(jH) : e.coerceAtLeast(Constraints.m2935getMaxWidthimpl(j), Constraints.m2937getMinWidthimpl(jH)), this.heightSide != null ? Constraints.m2936getMinHeightimpl(jH) : e.coerceAtMost(Constraints.m2936getMinHeightimpl(j), Constraints.m2934getMaxHeightimpl(jH)), this.heightSide != null ? Constraints.m2934getMaxHeightimpl(jH) : e.coerceAtLeast(Constraints.m2934getMaxHeightimpl(j), Constraints.m2936getMinHeightimpl(jH))));
        return MeasureScope.DefaultImpls.layout$default(measureScope, placeableMo2468measureBRTryo0.getWidth(), placeableMo2468measureBRTryo0.getHeight(), null, new a(placeableMo2468measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        int iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(i);
        long jH = h(intrinsicMeasureScope);
        return e.coerceIn(iMinIntrinsicHeight, Constraints.m2936getMinHeightimpl(jH), Constraints.m2934getMaxHeightimpl(jH));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        int iMinIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(i);
        long jH = h(intrinsicMeasureScope);
        return e.coerceIn(iMinIntrinsicWidth, Constraints.m2937getMinWidthimpl(jH), Constraints.m2935getMaxWidthimpl(jH));
    }

    @Override // androidx.compose.ui.Modifier
    @NotNull
    public Modifier then(@NotNull Modifier modifier) {
        return LayoutModifier.DefaultImpls.then(this, modifier);
    }

    @NotNull
    public String toString() {
        return "InsetsSizeModifier(insetsType=" + this.insetsType + ", widthSide=" + this.widthSide + ", additionalWidth=" + ((Object) Dp.m2976toStringimpl(this.additionalWidth)) + ", heightSide=" + this.heightSide + ", additionalHeight=" + ((Object) Dp.m2976toStringimpl(this.additionalHeight)) + ')';
    }

    public /* synthetic */ InsetsSizeModifier(WindowInsets.Type type, HorizontalSide horizontalSide, float f, VerticalSide verticalSide, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, (i & 2) != 0 ? null : horizontalSide, (i & 4) != 0 ? Dp.m2965constructorimpl(0) : f, (i & 8) != 0 ? null : verticalSide, (i & 16) != 0 ? Dp.m2965constructorimpl(0) : f2, null);
    }
}
