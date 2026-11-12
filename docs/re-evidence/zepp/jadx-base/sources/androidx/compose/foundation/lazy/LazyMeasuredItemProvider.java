package androidx.compose.foundation.lazy;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B:\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;", "", "Landroidx/compose/foundation/lazy/DataIndex;", "index", "Landroidx/compose/foundation/lazy/LazyMeasuredItem;", "getAndMeasure-ZjPyQlc", "(I)Landroidx/compose/foundation/lazy/LazyMeasuredItem;", "getAndMeasure", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "scope", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/foundation/lazy/LazyListItemsProvider;", "itemsProvider", "Landroidx/compose/foundation/lazy/LazyListItemsProvider;", "Landroidx/compose/foundation/lazy/LazyListItemContentFactory;", "itemContentFactory", "Landroidx/compose/foundation/lazy/LazyListItemContentFactory;", "Landroidx/compose/foundation/lazy/MeasuredItemFactory;", "measuredItemFactory", "Landroidx/compose/foundation/lazy/MeasuredItemFactory;", "Landroidx/compose/ui/unit/Constraints;", "childConstraints", "J", "getChildConstraints-msEJaDk", "()J", "constraints", "", "isVertical", "<init>", "(JZLandroidx/compose/ui/layout/SubcomposeMeasureScope;Landroidx/compose/foundation/lazy/LazyListItemsProvider;Landroidx/compose/foundation/lazy/LazyListItemContentFactory;Landroidx/compose/foundation/lazy/MeasuredItemFactory;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 5, 1})
public final class LazyMeasuredItemProvider {
    private final long childConstraints;

    @NotNull
    private final LazyListItemContentFactory itemContentFactory;

    @NotNull
    private final LazyListItemsProvider itemsProvider;

    @NotNull
    private final MeasuredItemFactory measuredItemFactory;

    @NotNull
    private final SubcomposeMeasureScope scope;

    private LazyMeasuredItemProvider(long j, boolean z, SubcomposeMeasureScope subcomposeMeasureScope, LazyListItemsProvider lazyListItemsProvider, LazyListItemContentFactory lazyListItemContentFactory, MeasuredItemFactory measuredItemFactory) {
        this.scope = subcomposeMeasureScope;
        this.itemsProvider = lazyListItemsProvider;
        this.itemContentFactory = lazyListItemContentFactory;
        this.measuredItemFactory = measuredItemFactory;
        this.childConstraints = ConstraintsKt.Constraints$default(0, z ? Constraints.m2935getMaxWidthimpl(j) : Integer.MAX_VALUE, 0, !z ? Constraints.m2934getMaxHeightimpl(j) : Integer.MAX_VALUE, 5, null);
    }

    public /* synthetic */ LazyMeasuredItemProvider(long j, boolean z, SubcomposeMeasureScope subcomposeMeasureScope, LazyListItemsProvider lazyListItemsProvider, LazyListItemContentFactory lazyListItemContentFactory, MeasuredItemFactory measuredItemFactory, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, z, subcomposeMeasureScope, lazyListItemsProvider, lazyListItemContentFactory, measuredItemFactory);
    }

    @NotNull
    /* JADX INFO: renamed from: getAndMeasure-ZjPyQlc, reason: not valid java name */
    public final LazyMeasuredItem m364getAndMeasureZjPyQlc(int index) {
        Object key = this.itemsProvider.getKey(index);
        List<Measurable> listSubcompose = this.scope.subcompose(key, this.itemContentFactory.getContent(index, key));
        int size = listSubcompose.size();
        Placeable[] placeableArr = new Placeable[size];
        for (int i = 0; i < size; i++) {
            placeableArr[i] = listSubcompose.get(i).mo2468measureBRTryo0(getChildConstraints());
        }
        return this.measuredItemFactory.mo355createItemHK0c1C0(index, key, placeableArr);
    }

    /* JADX INFO: renamed from: getChildConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getChildConstraints() {
        return this.childConstraints;
    }
}
