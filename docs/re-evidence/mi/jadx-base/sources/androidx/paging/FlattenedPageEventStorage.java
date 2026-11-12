package androidx.paging;

import androidx.annotation.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u0011J\u0016\u0010\u0012\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002J\u0016\u0010\u0014\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0002J\u0016\u0010\u0016\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/paging/FlattenedPageEventStorage;", "T", "", "()V", "loadStates", "Landroidx/paging/MutableLoadStateCollection;", "pages", "Ljava/util/ArrayDeque;", "Landroidx/paging/TransformablePage;", "placeholdersAfter", "", "placeholdersBefore", "add", "", "event", "Landroidx/paging/PageEvent;", "getAsEvents", "", "handleInsert", "Landroidx/paging/PageEvent$Insert;", "handleLoadStateUpdate", "Landroidx/paging/PageEvent$LoadStateUpdate;", "handlePageDrop", "Landroidx/paging/PageEvent$Drop;", "paging-common"}, k = 1, mv = {1, 4, 2})
@VisibleForTesting(otherwise = 2)
public final class FlattenedPageEventStorage<T> {
    private int placeholdersAfter;
    private int placeholdersBefore;
    private final ArrayDeque<TransformablePage<T>> pages = new ArrayDeque<>();
    private final MutableLoadStateCollection loadStates = new MutableLoadStateCollection();

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LoadType.values().length];
            $EnumSwitchMapping$0 = iArr;
            LoadType loadType = LoadType.PREPEND;
            iArr[loadType.ordinal()] = 1;
            LoadType loadType2 = LoadType.APPEND;
            iArr[loadType2.ordinal()] = 2;
            int[] iArr2 = new int[LoadType.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[LoadType.REFRESH.ordinal()] = 1;
            iArr2[loadType.ordinal()] = 2;
            iArr2[loadType2.ordinal()] = 3;
        }
    }

    private final void handleInsert(PageEvent.Insert<T> event) {
        this.loadStates.set(event.getCombinedLoadStates());
        int i = WhenMappings.$EnumSwitchMapping$1[event.getLoadType().ordinal()];
        if (i == 1) {
            this.pages.clear();
            this.placeholdersAfter = event.getPlaceholdersAfter();
            this.placeholdersBefore = event.getPlaceholdersBefore();
            this.pages.addAll(event.getPages());
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            this.placeholdersAfter = event.getPlaceholdersAfter();
            this.pages.addAll(event.getPages());
            return;
        }
        this.placeholdersBefore = event.getPlaceholdersBefore();
        Iterator<Integer> it = RangesKt___RangesKt.downTo(event.getPages().size() - 1, 0).iterator();
        while (it.hasNext()) {
            this.pages.addFirst(event.getPages().get(((IntIterator) it).nextInt()));
        }
    }

    private final void handleLoadStateUpdate(PageEvent.LoadStateUpdate<T> event) {
        this.loadStates.set(event.getLoadType(), event.getFromMediator(), event.getLoadState());
    }

    private final void handlePageDrop(PageEvent.Drop<T> event) {
        int i = 0;
        this.loadStates.set(event.getLoadType(), false, LoadState.NotLoading.INSTANCE.getIncomplete$paging_common());
        int i2 = WhenMappings.$EnumSwitchMapping$0[event.getLoadType().ordinal()];
        if (i2 == 1) {
            this.placeholdersBefore = event.getPlaceholdersRemaining();
            int pageCount = event.getPageCount();
            while (i < pageCount) {
                this.pages.removeFirst();
                i++;
            }
            return;
        }
        if (i2 != 2) {
            throw new IllegalArgumentException("Page drop type must be prepend or append");
        }
        this.placeholdersAfter = event.getPlaceholdersRemaining();
        int pageCount2 = event.getPageCount();
        while (i < pageCount2) {
            this.pages.removeLast();
            i++;
        }
    }

    public final void add(@NotNull PageEvent<T> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof PageEvent.Insert) {
            handleInsert((PageEvent.Insert) event);
        } else if (event instanceof PageEvent.Drop) {
            handlePageDrop((PageEvent.Drop) event);
        } else if (event instanceof PageEvent.LoadStateUpdate) {
            handleLoadStateUpdate((PageEvent.LoadStateUpdate) event);
        }
    }

    @NotNull
    public final List<PageEvent<T>> getAsEvents() {
        ArrayList arrayList = new ArrayList();
        if (!this.pages.isEmpty()) {
            arrayList.add(PageEvent.Insert.INSTANCE.Refresh(CollectionsKt___CollectionsKt.toList(this.pages), this.placeholdersBefore, this.placeholdersAfter, this.loadStates.snapshot()));
        } else {
            MutableLoadStateCollection mutableLoadStateCollection = this.loadStates;
            LoadStates loadStates = mutableLoadStateCollection.source;
            LoadType loadType = LoadType.REFRESH;
            LoadState refresh = loadStates.getRefresh();
            PageEvent.LoadStateUpdate.Companion companion = PageEvent.LoadStateUpdate.INSTANCE;
            if (companion.canDispatchWithoutInsert$paging_common(refresh, false)) {
                arrayList.add(new PageEvent.LoadStateUpdate(loadType, false, refresh));
            }
            LoadType loadType2 = LoadType.PREPEND;
            LoadState prepend = loadStates.getPrepend();
            if (companion.canDispatchWithoutInsert$paging_common(prepend, false)) {
                arrayList.add(new PageEvent.LoadStateUpdate(loadType2, false, prepend));
            }
            LoadType loadType3 = LoadType.APPEND;
            LoadState append = loadStates.getAppend();
            if (companion.canDispatchWithoutInsert$paging_common(append, false)) {
                arrayList.add(new PageEvent.LoadStateUpdate(loadType3, false, append));
            }
            LoadStates loadStates2 = mutableLoadStateCollection.mediator;
            if (loadStates2 != null) {
                LoadState refresh2 = loadStates2.getRefresh();
                if (companion.canDispatchWithoutInsert$paging_common(refresh2, true)) {
                    arrayList.add(new PageEvent.LoadStateUpdate(loadType, true, refresh2));
                }
                LoadState prepend2 = loadStates2.getPrepend();
                if (companion.canDispatchWithoutInsert$paging_common(prepend2, true)) {
                    arrayList.add(new PageEvent.LoadStateUpdate(loadType2, true, prepend2));
                }
                LoadState append2 = loadStates2.getAppend();
                if (companion.canDispatchWithoutInsert$paging_common(append2, true)) {
                    arrayList.add(new PageEvent.LoadStateUpdate(loadType3, true, append2));
                }
            }
        }
        return arrayList;
    }
}
