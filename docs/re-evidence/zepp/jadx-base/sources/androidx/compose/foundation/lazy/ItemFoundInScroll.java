package androidx.compose.foundation.lazy;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/ItemFoundInScroll;", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "item", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "getItem", "()Landroidx/compose/foundation/lazy/LazyListItemInfo;", "<init>", "(Landroidx/compose/foundation/lazy/LazyListItemInfo;)V", "foundation_release"}, k = 1, mv = {1, 5, 1})
final class ItemFoundInScroll extends CancellationException {

    @NotNull
    private final LazyListItemInfo item;

    public ItemFoundInScroll(@NotNull LazyListItemInfo lazyListItemInfo) {
        this.item = lazyListItemInfo;
    }

    @NotNull
    public final LazyListItemInfo getItem() {
        return this.item;
    }
}
