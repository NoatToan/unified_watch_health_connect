package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J8\u0010\t\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007H\u0002J<\u0010\f\u001a\u00020\u0005*\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u00052\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007H\u0002J/\u0010\u0014\u001a\u00020\u0011*\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0015\u001a\u00020\u0005*\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\"\u0010\u0016\u001a\u00020\u0005*\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\"\u0010\u0017\u001a\u00020\u0005*\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\"\u0010\u0018\u001a\u00020\u0005*\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/material/TextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "measurables", "", "height", "Lkotlin/Function2;", "intrinsicMeasurer", "intrinsicWidth", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "intrinsicHeight", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "maxIntrinsicHeight", "minIntrinsicHeight", "maxIntrinsicWidth", "minIntrinsicWidth", "", "singleLine", "Z", "", "animationProgress", "F", "<init>", "(ZF)V", "material_release"}, k = 1, mv = {1, 5, 1})
final class TextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;
    private final boolean singleLine;

    public TextFieldMeasurePolicy(boolean z, float f) {
        this.singleLine = z;
        this.animationProgress = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        for (Object obj2 : list) {
            if (Intrinsics.areEqual(TextFieldKt.getLayoutId((IntrinsicMeasurable) obj2), TextFieldImplKt.TextFieldId)) {
                int iIntValue = function2.invoke(obj2, Integer.valueOf(i)).intValue();
                Iterator<T> it2 = list.iterator();
                do {
                    obj = null;
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.areEqual(TextFieldKt.getLayoutId((IntrinsicMeasurable) next), TextFieldImplKt.TrailingId));
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) next;
                int iIntValue2 = intrinsicMeasurable == null ? 0 : function2.invoke(intrinsicMeasurable, Integer.valueOf(i)).intValue();
                Iterator<T> it3 = list.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (!Intrinsics.areEqual(TextFieldKt.getLayoutId((IntrinsicMeasurable) next2), TextFieldImplKt.TrailingId));
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) next2;
                int iIntValue3 = intrinsicMeasurable2 == null ? 0 : function2.invoke(intrinsicMeasurable2, Integer.valueOf(i)).intValue();
                Iterator<T> it4 = list.iterator();
                do {
                    if (!it4.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it4.next();
                } while (!Intrinsics.areEqual(TextFieldKt.getLayoutId((IntrinsicMeasurable) next3), TextFieldImplKt.LeadingId));
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) next3;
                int iIntValue4 = intrinsicMeasurable3 == null ? 0 : function2.invoke(intrinsicMeasurable3, Integer.valueOf(i)).intValue();
                for (Object obj3 : list) {
                    if (Intrinsics.areEqual(TextFieldKt.getLayoutId((IntrinsicMeasurable) obj3), TextFieldImplKt.PlaceholderId)) {
                        obj = obj3;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj;
                return TextFieldKt.m862calculateHeightYbqEFUw(iIntValue, iIntValue2 != 0, iIntValue2, iIntValue4, iIntValue3, intrinsicMeasurable4 == null ? 0 : function2.invoke(intrinsicMeasurable4, Integer.valueOf(i)).intValue(), TextFieldKt.ZeroConstraints, intrinsicMeasureScope.getDensity());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int intrinsicWidth(List<? extends IntrinsicMeasurable> measurables, int height, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> intrinsicMeasurer) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        for (Object obj2 : measurables) {
            if (Intrinsics.areEqual(TextFieldKt.getLayoutId((IntrinsicMeasurable) obj2), TextFieldImplKt.TextFieldId)) {
                int iIntValue = intrinsicMeasurer.invoke(obj2, Integer.valueOf(height)).intValue();
                Iterator<T> it2 = measurables.iterator();
                do {
                    obj = null;
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.areEqual(TextFieldKt.getLayoutId((IntrinsicMeasurable) next), TextFieldImplKt.TrailingId));
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) next;
                int iIntValue2 = intrinsicMeasurable == null ? 0 : intrinsicMeasurer.invoke(intrinsicMeasurable, Integer.valueOf(height)).intValue();
                Iterator<T> it3 = measurables.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (!Intrinsics.areEqual(TextFieldKt.getLayoutId((IntrinsicMeasurable) next2), TextFieldImplKt.TrailingId));
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) next2;
                int iIntValue3 = intrinsicMeasurable2 == null ? 0 : intrinsicMeasurer.invoke(intrinsicMeasurable2, Integer.valueOf(height)).intValue();
                Iterator<T> it4 = measurables.iterator();
                do {
                    if (!it4.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it4.next();
                } while (!Intrinsics.areEqual(TextFieldKt.getLayoutId((IntrinsicMeasurable) next3), TextFieldImplKt.LeadingId));
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) next3;
                int iIntValue4 = intrinsicMeasurable3 == null ? 0 : intrinsicMeasurer.invoke(intrinsicMeasurable3, Integer.valueOf(height)).intValue();
                for (Object obj3 : measurables) {
                    if (Intrinsics.areEqual(TextFieldKt.getLayoutId((IntrinsicMeasurable) obj3), TextFieldImplKt.PlaceholderId)) {
                        obj = obj3;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj;
                return TextFieldKt.m863calculateWidthVsPV1Ek(iIntValue4, iIntValue3, iIntValue, iIntValue2, intrinsicMeasurable4 == null ? 0 : intrinsicMeasurer.invoke(intrinsicMeasurable4, Integer.valueOf(height)).intValue(), TextFieldKt.ZeroConstraints);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy.maxIntrinsicHeight.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i2) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i2));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(list, i, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy.maxIntrinsicWidth.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i2) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i2));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo6measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
        Object next;
        Object next2;
        Object next3;
        int height;
        Object next4;
        int iMo188roundToPx0680j_4 = measureScope.mo188roundToPx0680j_4(TextFieldImplKt.getTextFieldPadding());
        final int iMo188roundToPx0680j_5 = measureScope.mo188roundToPx0680j_4(TextFieldKt.FirstBaselineOffset);
        int iMo188roundToPx0680j_6 = measureScope.mo188roundToPx0680j_4(TextFieldKt.LastBaselineOffset);
        final int iMo188roundToPx0680j_7 = measureScope.mo188roundToPx0680j_4(TextFieldKt.TextFieldTopPadding);
        long jM2926copyZbe2FdA$default = Constraints.m2926copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        Iterator<T> it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next), TextFieldImplKt.LeadingId));
        Measurable measurable = (Measurable) next;
        final Placeable placeableMo2468measureBRTryo0 = measurable == null ? null : measurable.mo2468measureBRTryo0(jM2926copyZbe2FdA$default);
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo2468measureBRTryo0) + 0;
        Iterator<T> it3 = list.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next2), TextFieldImplKt.TrailingId));
        Measurable measurable2 = (Measurable) next2;
        Placeable placeableMo2468measureBRTryo1 = measurable2 == null ? null : measurable2.mo2468measureBRTryo0(ConstraintsKt.m2952offsetNN6EwU$default(jM2926copyZbe2FdA$default, -iWidthOrZero, 0, 2, null));
        int i = -iMo188roundToPx0680j_6;
        int i2 = -(iWidthOrZero + TextFieldImplKt.widthOrZero(placeableMo2468measureBRTryo1));
        long jM2951offsetNN6EwU = ConstraintsKt.m2951offsetNN6EwU(jM2926copyZbe2FdA$default, i2, i);
        Iterator<T> it4 = list.iterator();
        do {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it4.next();
        } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next3), TextFieldImplKt.LabelId));
        Measurable measurable3 = (Measurable) next3;
        Placeable placeableMo2468measureBRTryo2 = measurable3 == null ? null : measurable3.mo2468measureBRTryo0(jM2951offsetNN6EwU);
        if (placeableMo2468measureBRTryo2 == null) {
            height = 0;
        } else {
            height = placeableMo2468measureBRTryo2.get(AlignmentLineKt.getLastBaseline());
            if (height == Integer.MIN_VALUE) {
                height = placeableMo2468measureBRTryo2.getHeight();
            }
        }
        final int iMax = Math.max(height, iMo188roundToPx0680j_5);
        long jM2951offsetNN6EwU2 = ConstraintsKt.m2951offsetNN6EwU(Constraints.m2926copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null), i2, placeableMo2468measureBRTryo2 != null ? (i - iMo188roundToPx0680j_7) - iMax : (-iMo188roundToPx0680j_4) * 2);
        for (Measurable measurable4 : list) {
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), TextFieldImplKt.TextFieldId)) {
                final Placeable placeableMo2468measureBRTryo3 = measurable4.mo2468measureBRTryo0(jM2951offsetNN6EwU2);
                long jM2926copyZbe2FdA$default2 = Constraints.m2926copyZbe2FdA$default(jM2951offsetNN6EwU2, 0, 0, 0, 0, 14, null);
                Iterator<T> it5 = list.iterator();
                do {
                    if (!it5.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it5.next();
                } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next4), TextFieldImplKt.PlaceholderId));
                Measurable measurable5 = (Measurable) next4;
                final Placeable placeableMo2468measureBRTryo4 = measurable5 == null ? null : measurable5.mo2468measureBRTryo0(jM2926copyZbe2FdA$default2);
                final int iM863calculateWidthVsPV1Ek = TextFieldKt.m863calculateWidthVsPV1Ek(TextFieldImplKt.widthOrZero(placeableMo2468measureBRTryo0), TextFieldImplKt.widthOrZero(placeableMo2468measureBRTryo1), placeableMo2468measureBRTryo3.getWidth(), TextFieldImplKt.widthOrZero(placeableMo2468measureBRTryo2), TextFieldImplKt.widthOrZero(placeableMo2468measureBRTryo4), j);
                final int iM862calculateHeightYbqEFUw = TextFieldKt.m862calculateHeightYbqEFUw(placeableMo2468measureBRTryo3.getHeight(), placeableMo2468measureBRTryo2 != null, iMax, TextFieldImplKt.heightOrZero(placeableMo2468measureBRTryo0), TextFieldImplKt.heightOrZero(placeableMo2468measureBRTryo1), TextFieldImplKt.heightOrZero(placeableMo2468measureBRTryo4), j, measureScope.getDensity());
                final Placeable placeable = placeableMo2468measureBRTryo2;
                final int i3 = height;
                final Placeable placeable2 = placeableMo2468measureBRTryo1;
                return MeasureScope.DefaultImpls.layout$default(measureScope, iM863calculateWidthVsPV1Ek, iM862calculateHeightYbqEFUw, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$measure$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        if (placeable == null) {
                            TextFieldKt.placeWithoutLabel(placementScope, iM863calculateWidthVsPV1Ek, iM862calculateHeightYbqEFUw, placeableMo2468measureBRTryo3, placeableMo2468measureBRTryo4, placeableMo2468measureBRTryo0, placeable2, this.singleLine, measureScope.getDensity());
                        } else {
                            TextFieldKt.placeWithLabel(placementScope, iM863calculateWidthVsPV1Ek, iM862calculateHeightYbqEFUw, placeableMo2468measureBRTryo3, placeable, placeableMo2468measureBRTryo4, placeableMo2468measureBRTryo0, placeable2, this.singleLine, e.coerceAtLeast(iMo188roundToPx0680j_5 - i3, 0), iMax + iMo188roundToPx0680j_7, this.animationProgress, measureScope.getDensity());
                        }
                    }
                }, 4, null);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy.minIntrinsicHeight.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i2) {
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i2));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(list, i, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy.minIntrinsicWidth.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i2) {
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i2));
            }
        });
    }
}
