package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\bb\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0012\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u001c\u0010\u0014\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u001c\u0010\u0015\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u001c\u0010\u0016\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0010H\u0016R\u0016\u0010\u001a\u001a\u00020\u00178V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicSizeModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "calculateContentConstraints-l58MMJ0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)J", "calculateContentConstraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "", "getEnforceIncoming", "()Z", "enforceIncoming", "foundation-layout_release"}, k = 1, mv = {1, 5, 1})
interface IntrinsicSizeModifier extends LayoutModifier {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static boolean all(@NotNull IntrinsicSizeModifier intrinsicSizeModifier, @NotNull Function1<? super Modifier.Element, Boolean> function1) {
            return LayoutModifier.DefaultImpls.all(intrinsicSizeModifier, function1);
        }

        public static boolean any(@NotNull IntrinsicSizeModifier intrinsicSizeModifier, @NotNull Function1<? super Modifier.Element, Boolean> function1) {
            return LayoutModifier.DefaultImpls.any(intrinsicSizeModifier, function1);
        }

        public static <R> R foldIn(@NotNull IntrinsicSizeModifier intrinsicSizeModifier, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
            return (R) LayoutModifier.DefaultImpls.foldIn(intrinsicSizeModifier, r, function2);
        }

        public static <R> R foldOut(@NotNull IntrinsicSizeModifier intrinsicSizeModifier, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
            return (R) LayoutModifier.DefaultImpls.foldOut(intrinsicSizeModifier, r, function2);
        }

        public static boolean getEnforceIncoming(@NotNull IntrinsicSizeModifier intrinsicSizeModifier) {
            return true;
        }

        public static int maxIntrinsicHeight(@NotNull IntrinsicSizeModifier intrinsicSizeModifier, @NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
            return intrinsicMeasurable.maxIntrinsicHeight(i);
        }

        public static int maxIntrinsicWidth(@NotNull IntrinsicSizeModifier intrinsicSizeModifier, @NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
            return intrinsicMeasurable.maxIntrinsicWidth(i);
        }

        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
        public static MeasureResult m266measure3p2s80s(@NotNull IntrinsicSizeModifier intrinsicSizeModifier, @NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
            long jMo265calculateContentConstraintsl58MMJ0 = intrinsicSizeModifier.mo265calculateContentConstraintsl58MMJ0(measureScope, measurable, j);
            if (intrinsicSizeModifier.getEnforceIncoming()) {
                jMo265calculateContentConstraintsl58MMJ0 = ConstraintsKt.m2947constrainN9IONVI(j, jMo265calculateContentConstraintsl58MMJ0);
            }
            final Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(jMo265calculateContentConstraintsl58MMJ0);
            return MeasureScope.DefaultImpls.layout$default(measureScope, placeableMo2468measureBRTryo0.getWidth(), placeableMo2468measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.IntrinsicSizeModifier$measure$1
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
                    Placeable.PlacementScope.m2507placeRelative70tqf50$default(placementScope, placeableMo2468measureBRTryo0, IntOffset.INSTANCE.m3053getZeronOccac(), 0.0f, 2, null);
                }
            }, 4, null);
        }

        public static int minIntrinsicHeight(@NotNull IntrinsicSizeModifier intrinsicSizeModifier, @NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
            return intrinsicMeasurable.minIntrinsicHeight(i);
        }

        public static int minIntrinsicWidth(@NotNull IntrinsicSizeModifier intrinsicSizeModifier, @NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
            return intrinsicMeasurable.minIntrinsicWidth(i);
        }

        @NotNull
        public static Modifier then(@NotNull IntrinsicSizeModifier intrinsicSizeModifier, @NotNull Modifier modifier) {
            return LayoutModifier.DefaultImpls.then(intrinsicSizeModifier, modifier);
        }
    }

    /* JADX INFO: renamed from: calculateContentConstraints-l58MMJ0, reason: not valid java name */
    long mo265calculateContentConstraintsl58MMJ0(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j);

    boolean getEnforceIncoming();

    @Override // androidx.compose.ui.layout.LayoutModifier
    int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i);

    @Override // androidx.compose.ui.layout.LayoutModifier
    int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i);

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    MeasureResult mo22measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j);

    @Override // androidx.compose.ui.layout.LayoutModifier
    int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i);

    @Override // androidx.compose.ui.layout.LayoutModifier
    int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i);
}
