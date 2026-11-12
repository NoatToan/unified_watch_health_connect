package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000b\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/layout/RootMeasurePolicy;", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class RootMeasurePolicy extends LayoutNode.NoIntrinsicsMeasurePolicy {

    @NotNull
    public static final RootMeasurePolicy INSTANCE = new RootMeasurePolicy();

    private RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
        int iMax;
        if (list.isEmpty()) {
            return MeasureScope.DefaultImpls.layout$default(measureScope, Constraints.m2937getMinWidthimpl(j), Constraints.m2936getMinHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                }
            }, 4, null);
        }
        int i = 0;
        if (list.size() == 1) {
            final Placeable placeableMo2468measureBRTryo0 = list.get(0).mo2468measureBRTryo0(j);
            return MeasureScope.DefaultImpls.layout$default(measureScope, ConstraintsKt.m2949constrainWidthK40F9xA(j, placeableMo2468measureBRTryo0.getWidth()), ConstraintsKt.m2948constrainHeightK40F9xA(j, placeableMo2468measureBRTryo0.getHeight()), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$2
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
                    Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeableMo2468measureBRTryo0, 0, 0, 0.0f, null, 12, null);
                }
            }, 4, null);
        }
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                arrayList.add(list.get(i2).mo2468measureBRTryo0(j));
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        }
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int iMax2 = 0;
            iMax = 0;
            while (true) {
                int i4 = i + 1;
                Placeable placeable = (Placeable) arrayList.get(i);
                iMax2 = Math.max(placeable.getWidth(), iMax2);
                iMax = Math.max(placeable.getHeight(), iMax);
                if (i4 > size2) {
                    break;
                }
                i = i4;
            }
            i = iMax2;
        } else {
            iMax = 0;
        }
        return MeasureScope.DefaultImpls.layout$default(measureScope, ConstraintsKt.m2949constrainWidthK40F9xA(j, i), ConstraintsKt.m2948constrainHeightK40F9xA(j, iMax), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                List<Placeable> list2 = arrayList;
                int size3 = list2.size() - 1;
                if (size3 < 0) {
                    return;
                }
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, list2.get(i5), 0, 0, 0.0f, null, 12, null);
                    if (i6 > size3) {
                        return;
                    } else {
                        i5 = i6;
                    }
                }
            }
        }, 4, null);
    }
}
