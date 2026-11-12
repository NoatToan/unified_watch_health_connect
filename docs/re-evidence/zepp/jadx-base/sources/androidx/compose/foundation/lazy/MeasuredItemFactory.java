package androidx.compose.foundation.lazy;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bà\u0080\u0001\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/lazy/MeasuredItemFactory;", "", "Landroidx/compose/foundation/lazy/DataIndex;", "index", "key", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "Landroidx/compose/foundation/lazy/LazyMeasuredItem;", "createItem-HK0c1C0", "(ILjava/lang/Object;[Landroidx/compose/ui/layout/Placeable;)Landroidx/compose/foundation/lazy/LazyMeasuredItem;", "createItem", "foundation_release"}, k = 1, mv = {1, 5, 1})
public interface MeasuredItemFactory {
    @NotNull
    /* JADX INFO: renamed from: createItem-HK0c1C0 */
    LazyMeasuredItem mo355createItemHK0c1C0(int index, @NotNull Object key, @NotNull Placeable[] placeables);
}
