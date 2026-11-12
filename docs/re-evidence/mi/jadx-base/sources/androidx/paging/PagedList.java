package androidx.paging;

import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.fitness.parser.schema.EcgReportKey;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "PagedList is deprecated and has been replaced by PagingData")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0018\b'\u0018\u0000 d*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0006abcdefB?\b\u0000\u0012\u0010\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000e\u0010?\u001a\u00020(2\u0006\u0010@\u001a\u00020\u0012J \u0010?\u001a\u00020(2\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010B2\u0006\u0010@\u001a\u00020\u0012H\u0007J \u0010C\u001a\u00020(2\u0018\u0010D\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0%J\b\u0010E\u001a\u00020(H&J\"\u0010F\u001a\u00020(2\u0018\u0010@\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0%H'J\u001d\u0010G\u001a\u00020(2\u0006\u0010H\u001a\u00020&2\u0006\u0010I\u001a\u00020'H\u0000¢\u0006\u0002\bJJ\u0018\u0010K\u001a\u0004\u0018\u00018\u00002\u0006\u0010L\u001a\u00020*H\u0096\u0002¢\u0006\u0002\u0010MJ\u000e\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000OH\u0007J\b\u0010P\u001a\u00020*H\u0007J\u000e\u0010Q\u001a\u00020(2\u0006\u0010L\u001a\u00020*J\u0010\u0010R\u001a\u00020(2\u0006\u0010L\u001a\u00020*H'J\u0018\u0010S\u001a\u00020(2\u0006\u0010T\u001a\u00020*2\u0006\u0010U\u001a\u00020*H\u0007J\u001d\u0010V\u001a\u00020(2\u0006\u0010T\u001a\u00020*2\u0006\u0010U\u001a\u00020*H\u0000¢\u0006\u0002\bWJ\u0018\u0010X\u001a\u00020(2\u0006\u0010T\u001a\u00020*2\u0006\u0010U\u001a\u00020*H\u0007J\u000e\u0010Y\u001a\u00020(2\u0006\u0010@\u001a\u00020\u0012J \u0010Z\u001a\u00020(2\u0018\u0010D\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0%J\b\u0010[\u001a\u00020(H\u0016J\u0018\u0010\\\u001a\u00020(2\u0006\u0010]\u001a\u00020&2\u0006\u0010^\u001a\u00020'H\u0017J\u0012\u0010_\u001a\u00020(2\b\u00103\u001a\u0004\u0018\u000104H\u0007J\f\u0010`\u001a\b\u0012\u0004\u0012\u00028\u00000BR\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00188FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0012\u0010\u001d\u001a\u00020\u001eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u0014\u0010 \u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u0004\u0018\u00010\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R,\u0010$\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0%0\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010)\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R \u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u00101\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b2\u0010,R\u001c\u00103\u001a\u0004\u0018\u000104X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0014\u00109\u001a\u00020*X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010,R\u0014\u0010;\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010,R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>¨\u0006g"}, d2 = {"Landroidx/paging/PagedList;", "T", "", "Ljava/util/AbstractList;", "pagingSource", "Landroidx/paging/PagingSource;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "notifyDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "storage", "Landroidx/paging/PagedStorage;", q.f13857a, "Landroidx/paging/PagedList$Config;", "(Landroidx/paging/PagingSource;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/PagedStorage;Landroidx/paging/PagedList$Config;)V", "callbacks", "", "Ljava/lang/ref/WeakReference;", "Landroidx/paging/PagedList$Callback;", "getConfig", "()Landroidx/paging/PagedList$Config;", "getCoroutineScope$paging_common", "()Lkotlinx/coroutines/CoroutineScope;", EcgReportKey.dataSource, "Landroidx/paging/DataSource;", "getDataSource$annotations", "()V", "getDataSource", "()Landroidx/paging/DataSource;", "isDetached", "", "()Z", "isImmutable", "lastKey", "getLastKey", "()Ljava/lang/Object;", "loadStateListeners", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", "", "loadedCount", "", "getLoadedCount", "()I", "getNotifyDispatcher$paging_common", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getPagingSource", "()Landroidx/paging/PagingSource;", "positionOffset", "getPositionOffset", "refreshRetryCallback", "Ljava/lang/Runnable;", "getRefreshRetryCallback$paging_common", "()Ljava/lang/Runnable;", "setRefreshRetryCallback$paging_common", "(Ljava/lang/Runnable;)V", "requiredRemainder", "getRequiredRemainder$paging_common", MediaStoreUtil.MediaInfo.SIZE, "getSize", "getStorage$paging_common", "()Landroidx/paging/PagedStorage;", "addWeakCallback", "callback", "previousSnapshot", "", "addWeakLoadStateListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "detach", "dispatchCurrentLoadState", "dispatchStateChangeAsync", "type", "state", "dispatchStateChangeAsync$paging_common", "get", "index", "(I)Ljava/lang/Object;", "getNullPaddedList", "Landroidx/paging/NullPaddedList;", "lastLoad", "loadAround", "loadAroundInternal", "notifyChanged", "position", "count", "notifyInserted", "notifyInserted$paging_common", "notifyRemoved", "removeWeakCallback", "removeWeakLoadStateListener", b.M, "setInitialLoadState", "loadType", "loadState", "setRetryCallback", "snapshot", "BoundaryCallback", "Builder", "Callback", "Companion", "Config", "LoadStateManager", "paging-common"}, k = 1, mv = {1, 4, 2})
public abstract class PagedList<T> extends AbstractList<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final List<WeakReference<Callback>> callbacks;

    @NotNull
    private final Config config;

    @NotNull
    private final CoroutineScope coroutineScope;
    private final List<WeakReference<Function2<LoadType, LoadState, Unit>>> loadStateListeners;

    @NotNull
    private final CoroutineDispatcher notifyDispatcher;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    private final PagingSource<?, T> pagingSource;

    @Nullable
    private Runnable refreshRetryCallback;
    private final int requiredRemainder;

    @NotNull
    private final PagedStorage<T> storage;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Landroidx/paging/PagedList$BoundaryCallback;", "T", "", "()V", "onItemAtEndLoaded", "", "itemAtEnd", "(Ljava/lang/Object;)V", "onItemAtFrontLoaded", "itemAtFront", "onZeroItemsLoaded", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static abstract class BoundaryCallback<T> {
        public void onItemAtEndLoaded(@NotNull T itemAtEnd) {
            Intrinsics.checkNotNullParameter(itemAtEnd, "itemAtEnd");
        }

        public void onItemAtFrontLoaded(@NotNull T itemAtFront) {
            Intrinsics.checkNotNullParameter(itemAtFront, "itemAtFront");
        }

        public void onZeroItemsLoaded() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Landroidx/paging/PagedList$Callback;", "", "()V", "onChanged", "", "position", "", "count", "onInserted", "onRemoved", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static abstract class Callback {
        public abstract void onChanged(int position, int count);

        public abstract void onInserted(int position, int count);

        public abstract void onRemoved(int position, int count);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u008b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0001\u0010\u0006*\u00020\u0001\"\b\b\u0002\u0010\u0005*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00050\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u0001H\u0006H\u0007¢\u0006\u0002\u0010\u0015J%\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Landroidx/paging/PagedList$Companion;", "", "()V", "create", "Landroidx/paging/PagedList;", "T", "K", "pagingSource", "Landroidx/paging/PagingSource;", "initialPage", "Landroidx/paging/PagingSource$LoadResult$Page;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "notifyDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "fetchDispatcher", "boundaryCallback", "Landroidx/paging/PagedList$BoundaryCallback;", q.f13857a, "Landroidx/paging/PagedList$Config;", "key", "(Landroidx/paging/PagingSource;Landroidx/paging/PagingSource$LoadResult$Page;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/PagedList$BoundaryCallback;Landroidx/paging/PagedList$Config;Ljava/lang/Object;)Landroidx/paging/PagedList;", "dispatchNaiveUpdatesSinceSnapshot", "", "currentSize", "", "snapshotSize", "callback", "Landroidx/paging/PagedList$Callback;", "dispatchNaiveUpdatesSinceSnapshot$paging_common", "paging-common"}, k = 1, mv = {1, 4, 2})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final <K, T> PagedList<T> create(@NotNull PagingSource<K, T> pagingSource, @Nullable PagingSource.LoadResult.Page<K, T> initialPage, @NotNull CoroutineScope coroutineScope, @NotNull CoroutineDispatcher notifyDispatcher, @NotNull CoroutineDispatcher fetchDispatcher, @Nullable BoundaryCallback<T> boundaryCallback, @NotNull Config config, @Nullable K key) {
            PagingSource.LoadResult.Page<K, T> page;
            Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
            Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
            Intrinsics.checkNotNullParameter(config, "config");
            if (initialPage == null) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = (T) new PagingSource.LoadParams.Refresh(key, config.initialLoadSizeHint, config.enablePlaceholders);
                page = (PagingSource.LoadResult.Page) BuildersKt__BuildersKt.runBlocking$default(null, new PagedList$Companion$create$resolvedInitialPage$1(pagingSource, objectRef, null), 1, null);
            } else {
                page = initialPage;
            }
            return new ContiguousPagedList(pagingSource, coroutineScope, notifyDispatcher, fetchDispatcher, boundaryCallback, config, page, key);
        }

        public final void dispatchNaiveUpdatesSinceSnapshot$paging_common(int currentSize, int snapshotSize, @NotNull Callback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (snapshotSize < currentSize) {
                if (snapshotSize > 0) {
                    callback.onChanged(0, snapshotSize);
                }
                int i = currentSize - snapshotSize;
                if (i > 0) {
                    callback.onInserted(snapshotSize, i);
                    return;
                }
                return;
            }
            if (currentSize > 0) {
                callback.onChanged(0, currentSize);
            }
            int i2 = snapshotSize - currentSize;
            if (i2 != 0) {
                callback.onRemoved(currentSize, i2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0002\n\u000bB/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/paging/PagedList$Config;", "", "pageSize", "", "prefetchDistance", "enablePlaceholders", "", "initialLoadSizeHint", "maxSize", "(IIZII)V", "Builder", "Companion", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class Config {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int MAX_SIZE_UNBOUNDED = Integer.MAX_VALUE;

        @JvmField
        public final boolean enablePlaceholders;

        @JvmField
        public final int initialLoadSizeHint;

        @JvmField
        public final int maxSize;

        @JvmField
        public final int pageSize;

        @JvmField
        public final int prefetchDistance;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\r\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\u0006J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/paging/PagedList$Config$Builder;", "", "()V", "enablePlaceholders", "", "initialLoadSizeHint", "", "maxSize", "pageSize", "prefetchDistance", OneTrack.Param.BUILD, "Landroidx/paging/PagedList$Config;", "setEnablePlaceholders", "setInitialLoadSizeHint", "setMaxSize", "setPageSize", "setPrefetchDistance", "Companion", "paging-common"}, k = 1, mv = {1, 4, 2})
        public static final class Builder {
            public static final int DEFAULT_INITIAL_PAGE_MULTIPLIER = 3;
            private int pageSize = -1;
            private int prefetchDistance = -1;
            private int initialLoadSizeHint = -1;
            private boolean enablePlaceholders = true;
            private int maxSize = Integer.MAX_VALUE;

            @NotNull
            public final Config build() {
                if (this.prefetchDistance < 0) {
                    this.prefetchDistance = this.pageSize;
                }
                if (this.initialLoadSizeHint < 0) {
                    this.initialLoadSizeHint = this.pageSize * 3;
                }
                if (!this.enablePlaceholders && this.prefetchDistance == 0) {
                    throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
                }
                int i = this.maxSize;
                if (i == Integer.MAX_VALUE || i >= this.pageSize + (this.prefetchDistance * 2)) {
                    return new Config(this.pageSize, this.prefetchDistance, this.enablePlaceholders, this.initialLoadSizeHint, this.maxSize);
                }
                throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + this.pageSize + ", prefetchDist=" + this.prefetchDistance + ", maxSize=" + this.maxSize);
            }

            @NotNull
            public final Builder setEnablePlaceholders(boolean enablePlaceholders) {
                this.enablePlaceholders = enablePlaceholders;
                return this;
            }

            @NotNull
            public final Builder setInitialLoadSizeHint(@IntRange(from = 1) int initialLoadSizeHint) {
                this.initialLoadSizeHint = initialLoadSizeHint;
                return this;
            }

            @NotNull
            public final Builder setMaxSize(@IntRange(from = 2) int maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            @NotNull
            public final Builder setPageSize(@IntRange(from = 1) int pageSize) {
                if (pageSize < 1) {
                    throw new IllegalArgumentException("Page size must be a positive number");
                }
                this.pageSize = pageSize;
                return this;
            }

            @NotNull
            public final Builder setPrefetchDistance(@IntRange(from = 0) int prefetchDistance) {
                this.prefetchDistance = prefetchDistance;
                return this;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\u0006"}, d2 = {"Landroidx/paging/PagedList$Config$Companion;", "", "()V", "MAX_SIZE_UNBOUNDED", "", "getMAX_SIZE_UNBOUNDED$annotations", "paging-common"}, k = 1, mv = {1, 4, 2})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ void getMAX_SIZE_UNBOUNDED$annotations() {
            }
        }

        public Config(int i, int i2, boolean z, int i3, int i4) {
            this.pageSize = i;
            this.prefetchDistance = i2;
            this.enablePlaceholders = z;
            this.initialLoadSizeHint = i3;
            this.maxSize = i4;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u000f\u001a\u00020\u00102\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u0012J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0004H'J\u0016\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0018"}, d2 = {"Landroidx/paging/PagedList$LoadStateManager;", "", "()V", "endState", "Landroidx/paging/LoadState;", "getEndState", "()Landroidx/paging/LoadState;", "setEndState", "(Landroidx/paging/LoadState;)V", "refreshState", "getRefreshState", "setRefreshState", "startState", "getStartState", "setStartState", "dispatchCurrentLoadState", "", "callback", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "onStateChanged", "type", "state", "setState", "paging-common"}, k = 1, mv = {1, 4, 2})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static abstract class LoadStateManager {

        @NotNull
        private LoadState endState;

        @NotNull
        private LoadState refreshState;

        @NotNull
        private LoadState startState;

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LoadType.values().length];
                $EnumSwitchMapping$0 = iArr;
                iArr[LoadType.REFRESH.ordinal()] = 1;
                iArr[LoadType.PREPEND.ordinal()] = 2;
                iArr[LoadType.APPEND.ordinal()] = 3;
            }
        }

        public LoadStateManager() {
            LoadState.NotLoading.Companion companion = LoadState.NotLoading.INSTANCE;
            this.refreshState = companion.getIncomplete$paging_common();
            this.startState = companion.getIncomplete$paging_common();
            this.endState = companion.getIncomplete$paging_common();
        }

        public final void dispatchCurrentLoadState(@NotNull Function2<? super LoadType, ? super LoadState, Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            callback.invoke(LoadType.REFRESH, this.refreshState);
            callback.invoke(LoadType.PREPEND, this.startState);
            callback.invoke(LoadType.APPEND, this.endState);
        }

        @NotNull
        public final LoadState getEndState() {
            return this.endState;
        }

        @NotNull
        public final LoadState getRefreshState() {
            return this.refreshState;
        }

        @NotNull
        public final LoadState getStartState() {
            return this.startState;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public abstract void onStateChanged(@NotNull LoadType type, @NotNull LoadState state);

        public final void setEndState(@NotNull LoadState loadState) {
            Intrinsics.checkNotNullParameter(loadState, "<set-?>");
            this.endState = loadState;
        }

        public final void setRefreshState(@NotNull LoadState loadState) {
            Intrinsics.checkNotNullParameter(loadState, "<set-?>");
            this.refreshState = loadState;
        }

        public final void setStartState(@NotNull LoadState loadState) {
            Intrinsics.checkNotNullParameter(loadState, "<set-?>");
            this.startState = loadState;
        }

        public final void setState(@NotNull LoadType type, @NotNull LoadState state) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(state, "state");
            int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (Intrinsics.areEqual(this.endState, state)) {
                            return;
                        } else {
                            this.endState = state;
                        }
                    }
                } else if (Intrinsics.areEqual(this.startState, state)) {
                    return;
                } else {
                    this.startState = state;
                }
            } else if (Intrinsics.areEqual(this.refreshState, state)) {
                return;
            } else {
                this.refreshState = state;
            }
            onStateChanged(type, state);
        }
    }

    public PagedList(@NotNull PagingSource<?, T> pagingSource, @NotNull CoroutineScope coroutineScope, @NotNull CoroutineDispatcher notifyDispatcher, @NotNull PagedStorage<T> storage, @NotNull Config config) {
        Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(config, "config");
        this.pagingSource = pagingSource;
        this.coroutineScope = coroutineScope;
        this.notifyDispatcher = notifyDispatcher;
        this.storage = storage;
        this.config = config;
        this.requiredRemainder = (config.prefetchDistance * 2) + config.pageSize;
        this.callbacks = new ArrayList();
        this.loadStateListeners = new ArrayList();
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final <K, T> PagedList<T> create(@NotNull PagingSource<K, T> pagingSource, @Nullable PagingSource.LoadResult.Page<K, T> page, @NotNull CoroutineScope coroutineScope, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineDispatcher coroutineDispatcher2, @Nullable BoundaryCallback<T> boundaryCallback, @NotNull Config config, @Nullable K k2) {
        return INSTANCE.create(pagingSource, page, coroutineScope, coroutineDispatcher, coroutineDispatcher2, boundaryCallback, config, k2);
    }

    @Deprecated(message = "DataSource is deprecated and has been replaced by PagingSource. PagedList offers indirect ways of controlling fetch ('loadAround()', 'retry()') so that you should not need to access the DataSource/PagingSource.")
    public static /* synthetic */ void getDataSource$annotations() {
    }

    @Deprecated(message = "Dispatching a diff since snapshot created is behavior that can be instead tracked by attaching a Callback to the PagedList that is mutating, and tracking changes since calling PagedList.snapshot().")
    public final void addWeakCallback(@Nullable List<? extends T> previousSnapshot, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (previousSnapshot != null && previousSnapshot != this) {
            INSTANCE.dispatchNaiveUpdatesSinceSnapshot$paging_common(size(), previousSnapshot.size(), callback);
        }
        addWeakCallback(callback);
    }

    public final void addWeakLoadStateListener(@NotNull Function2<? super LoadType, ? super LoadState, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CollectionsKt__MutableCollectionsKt.removeAll((List) this.loadStateListeners, (Function1) new Function1<WeakReference<Function2<? super LoadType, ? super LoadState, ? extends Unit>>, Boolean>() { // from class: androidx.paging.PagedList.addWeakLoadStateListener.1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Boolean invoke2(WeakReference<Function2<? super LoadType, ? super LoadState, ? extends Unit>> weakReference) {
                return Boolean.valueOf(invoke2((WeakReference<Function2<LoadType, LoadState, Unit>>) weakReference));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(@NotNull WeakReference<Function2<LoadType, LoadState, Unit>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.get() == null;
            }
        });
        this.loadStateListeners.add(new WeakReference<>(listener));
        dispatchCurrentLoadState(listener);
    }

    public abstract void detach();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract void dispatchCurrentLoadState(@NotNull Function2<? super LoadType, ? super LoadState, Unit> callback);

    public final void dispatchStateChangeAsync$paging_common(@NotNull LoadType type, @NotNull LoadState state) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.notifyDispatcher, null, new PagedList$dispatchStateChangeAsync$1(this, type, state, null), 2, null);
    }

    @Override // java.util.AbstractList, java.util.List
    @Nullable
    public T get(int index) {
        return this.storage.get(index);
    }

    @NotNull
    public final Config getConfig() {
        return this.config;
    }

    @NotNull
    /* JADX INFO: renamed from: getCoroutineScope$paging_common, reason: from getter */
    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    @NotNull
    public final DataSource<?, T> getDataSource() {
        PagingSource<?, T> pagingSource = getPagingSource();
        if (pagingSource instanceof LegacyPagingSource) {
            DataSource<?, T> dataSource$paging_common = ((LegacyPagingSource) pagingSource).getDataSource$paging_common();
            if (dataSource$paging_common != null) {
                return dataSource$paging_common;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.paging.DataSource<*, T>");
        }
        throw new IllegalStateException("Attempt to access dataSource on a PagedList that was instantiated with a " + pagingSource.getClass().getSimpleName() + " instead of a DataSource");
    }

    @Nullable
    public abstract Object getLastKey();

    public final int getLoadedCount() {
        return this.storage.getStorageCount();
    }

    @NotNull
    /* JADX INFO: renamed from: getNotifyDispatcher$paging_common, reason: from getter */
    public final CoroutineDispatcher getNotifyDispatcher() {
        return this.notifyDispatcher;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final NullPaddedList<T> getNullPaddedList() {
        return this.storage;
    }

    @NotNull
    public PagingSource<?, T> getPagingSource() {
        return this.pagingSource;
    }

    public final int getPositionOffset() {
        return this.storage.getPositionOffset();
    }

    @Nullable
    /* JADX INFO: renamed from: getRefreshRetryCallback$paging_common, reason: from getter */
    public final Runnable getRefreshRetryCallback() {
        return this.refreshRetryCallback;
    }

    /* JADX INFO: renamed from: getRequiredRemainder$paging_common, reason: from getter */
    public final int getRequiredRemainder() {
        return this.requiredRemainder;
    }

    public int getSize() {
        return this.storage.size();
    }

    @NotNull
    public final PagedStorage<T> getStorage$paging_common() {
        return this.storage;
    }

    /* JADX INFO: renamed from: isDetached */
    public abstract boolean getIsDetached();

    /* JADX INFO: renamed from: isImmutable */
    public boolean getIsImmutable() {
        return getIsDetached();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int lastLoad() {
        return this.storage.getLastLoadAroundIndex();
    }

    public final void loadAround(int index) {
        if (index >= 0 && index < size()) {
            this.storage.setLastLoadAroundIndex(index);
            loadAroundInternal(index);
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract void loadAroundInternal(int index);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void notifyChanged(int position, int count) {
        if (count == 0) {
            return;
        }
        Iterator<T> it = CollectionsKt___CollectionsKt.reversed(this.callbacks).iterator();
        while (it.hasNext()) {
            Callback callback = (Callback) ((WeakReference) it.next()).get();
            if (callback != null) {
                callback.onChanged(position, count);
            }
        }
    }

    public final void notifyInserted$paging_common(int position, int count) {
        if (count == 0) {
            return;
        }
        Iterator<T> it = CollectionsKt___CollectionsKt.reversed(this.callbacks).iterator();
        while (it.hasNext()) {
            Callback callback = (Callback) ((WeakReference) it.next()).get();
            if (callback != null) {
                callback.onInserted(position, count);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void notifyRemoved(int position, int count) {
        if (count == 0) {
            return;
        }
        Iterator<T> it = CollectionsKt___CollectionsKt.reversed(this.callbacks).iterator();
        while (it.hasNext()) {
            Callback callback = (Callback) ((WeakReference) it.next()).get();
            if (callback != null) {
                callback.onRemoved(position, count);
            }
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) removeAt(i);
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }

    public final void removeWeakCallback(@NotNull final Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        CollectionsKt__MutableCollectionsKt.removeAll((List) this.callbacks, (Function1) new Function1<WeakReference<Callback>, Boolean>() { // from class: androidx.paging.PagedList.removeWeakCallback.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Boolean invoke2(WeakReference<Callback> weakReference) {
                return Boolean.valueOf(invoke2(weakReference));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(@NotNull WeakReference<Callback> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.get() == null || it.get() == callback;
            }
        });
    }

    public final void removeWeakLoadStateListener(@NotNull final Function2<? super LoadType, ? super LoadState, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CollectionsKt__MutableCollectionsKt.removeAll((List) this.loadStateListeners, (Function1) new Function1<WeakReference<Function2<? super LoadType, ? super LoadState, ? extends Unit>>, Boolean>() { // from class: androidx.paging.PagedList.removeWeakLoadStateListener.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Boolean invoke2(WeakReference<Function2<? super LoadType, ? super LoadState, ? extends Unit>> weakReference) {
                return Boolean.valueOf(invoke2((WeakReference<Function2<LoadType, LoadState, Unit>>) weakReference));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(@NotNull WeakReference<Function2<LoadType, LoadState, Unit>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.get() == null || it.get() == listener;
            }
        });
    }

    public void retry() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setInitialLoadState(@NotNull LoadType loadType, @NotNull LoadState loadState) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(loadState, "loadState");
    }

    public final void setRefreshRetryCallback$paging_common(@Nullable Runnable runnable) {
        this.refreshRetryCallback = runnable;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void setRetryCallback(@Nullable Runnable refreshRetryCallback) {
        this.refreshRetryCallback = refreshRetryCallback;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @NotNull
    public final List<T> snapshot() {
        return getIsImmutable() ? this : new SnapshotPagedList(this);
    }

    public final void addWeakCallback(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        CollectionsKt__MutableCollectionsKt.removeAll((List) this.callbacks, (Function1) new Function1<WeakReference<Callback>, Boolean>() { // from class: androidx.paging.PagedList.addWeakCallback.1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Boolean invoke2(WeakReference<Callback> weakReference) {
                return Boolean.valueOf(invoke2(weakReference));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(@NotNull WeakReference<Callback> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.get() == null;
            }
        });
        this.callbacks.add(new WeakReference<>(callback));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u0002*\b\b\u0002\u0010\u0003*\u00020\u00022\u00020\u0002B#\b\u0016\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB#\b\u0016\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB7\b\u0016\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u0010B7\b\u0016\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u0011J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u001cJ\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0013J\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017J\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010!\u001a\u00020\"H\u0007J!\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010$J\u001a\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0017J\u001c\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010'\u001a\u00020\"H\u0007R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u0004\u0018\u00018\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Landroidx/paging/PagedList$Builder;", "Key", "", "Value", EcgReportKey.dataSource, "Landroidx/paging/DataSource;", q.f13857a, "Landroidx/paging/PagedList$Config;", "(Landroidx/paging/DataSource;Landroidx/paging/PagedList$Config;)V", "pageSize", "", "(Landroidx/paging/DataSource;I)V", "pagingSource", "Landroidx/paging/PagingSource;", "initialPage", "Landroidx/paging/PagingSource$LoadResult$Page;", "(Landroidx/paging/PagingSource;Landroidx/paging/PagingSource$LoadResult$Page;Landroidx/paging/PagedList$Config;)V", "(Landroidx/paging/PagingSource;Landroidx/paging/PagingSource$LoadResult$Page;I)V", "boundaryCallback", "Landroidx/paging/PagedList$BoundaryCallback;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "fetchDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "initialKey", "Ljava/lang/Object;", "notifyDispatcher", OneTrack.Param.BUILD, "Landroidx/paging/PagedList;", "setBoundaryCallback", "setCoroutineScope", "setFetchDispatcher", "setFetchExecutor", "fetchExecutor", "Ljava/util/concurrent/Executor;", "setInitialKey", "(Ljava/lang/Object;)Landroidx/paging/PagedList$Builder;", "setNotifyDispatcher", "setNotifyExecutor", "notifyExecutor", "paging-common"}, k = 1, mv = {1, 4, 2})
    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData, which no longer supports constructing snapshots of loaded data manually.", replaceWith = @ReplaceWith(expression = "Pager.flow", imports = {"androidx.paging.Pager"}))
    public static final class Builder<Key, Value> {
        private BoundaryCallback<Value> boundaryCallback;
        private final Config config;
        private CoroutineScope coroutineScope;
        private DataSource<Key, Value> dataSource;
        private CoroutineDispatcher fetchDispatcher;
        private Key initialKey;
        private final PagingSource.LoadResult.Page<Key, Value> initialPage;
        private CoroutineDispatcher notifyDispatcher;
        private final PagingSource<Key, Value> pagingSource;

        public Builder(@NotNull DataSource<Key, Value> dataSource, @NotNull Config config) {
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            Intrinsics.checkNotNullParameter(config, "config");
            this.coroutineScope = GlobalScope.INSTANCE;
            this.pagingSource = null;
            this.dataSource = dataSource;
            this.initialPage = null;
            this.config = config;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @NotNull
        public final PagedList<Value> build() {
            LegacyPagingSource legacyPagingSource;
            Object obj;
            CoroutineDispatcher io2 = this.fetchDispatcher;
            if (io2 == null) {
                io2 = Dispatchers.getIO();
            }
            CoroutineDispatcher coroutineDispatcher = io2;
            PagingSource<Key, Value> pagingSource = this.pagingSource;
            if (pagingSource != null) {
                obj = pagingSource;
            } else {
                DataSource<Key, Value> dataSource = this.dataSource;
                if (dataSource != null) {
                    legacyPagingSource = new LegacyPagingSource(coroutineDispatcher, dataSource);
                    legacyPagingSource.setPageSize(this.config.pageSize);
                } else {
                    legacyPagingSource = null;
                }
                obj = legacyPagingSource;
            }
            if (!(obj != null)) {
                throw new IllegalStateException("PagedList cannot be built without a PagingSource or DataSource".toString());
            }
            Companion companion = PagedList.INSTANCE;
            PagingSource.LoadResult.Page<Key, Value> page = this.initialPage;
            CoroutineScope coroutineScope = this.coroutineScope;
            CoroutineDispatcher immediate = this.notifyDispatcher;
            if (immediate == null) {
                immediate = Dispatchers.getMain().getImmediate();
            }
            return companion.create(obj, page, coroutineScope, immediate, coroutineDispatcher, this.boundaryCallback, this.config, this.initialKey);
        }

        @NotNull
        public final Builder<Key, Value> setBoundaryCallback(@Nullable BoundaryCallback<Value> boundaryCallback) {
            this.boundaryCallback = boundaryCallback;
            return this;
        }

        @NotNull
        public final Builder<Key, Value> setCoroutineScope(@NotNull CoroutineScope coroutineScope) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            this.coroutineScope = coroutineScope;
            return this;
        }

        @NotNull
        public final Builder<Key, Value> setFetchDispatcher(@NotNull CoroutineDispatcher fetchDispatcher) {
            Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
            this.fetchDispatcher = fetchDispatcher;
            return this;
        }

        @Deprecated(message = "Passing an executor will cause it get wrapped as a CoroutineDispatcher, consider passing a CoroutineDispatcher directly", replaceWith = @ReplaceWith(expression = "setFetchDispatcher(fetchExecutor.asCoroutineDispatcher())", imports = {"kotlinx.coroutines.asCoroutineDispatcher"}))
        @NotNull
        public final Builder<Key, Value> setFetchExecutor(@NotNull Executor fetchExecutor) {
            Intrinsics.checkNotNullParameter(fetchExecutor, "fetchExecutor");
            this.fetchDispatcher = ExecutorsKt.from(fetchExecutor);
            return this;
        }

        @NotNull
        public final Builder<Key, Value> setInitialKey(@Nullable Key initialKey) {
            this.initialKey = initialKey;
            return this;
        }

        @NotNull
        public final Builder<Key, Value> setNotifyDispatcher(@NotNull CoroutineDispatcher notifyDispatcher) {
            Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
            this.notifyDispatcher = notifyDispatcher;
            return this;
        }

        @Deprecated(message = "Passing an executor will cause it get wrapped as a CoroutineDispatcher, consider passing a CoroutineDispatcher directly", replaceWith = @ReplaceWith(expression = "setNotifyDispatcher(fetchExecutor.asCoroutineDispatcher())", imports = {"kotlinx.coroutines.asCoroutineDispatcher"}))
        @NotNull
        public final Builder<Key, Value> setNotifyExecutor(@NotNull Executor notifyExecutor) {
            Intrinsics.checkNotNullParameter(notifyExecutor, "notifyExecutor");
            this.notifyDispatcher = ExecutorsKt.from(notifyExecutor);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull DataSource<Key, Value> dataSource, int i) {
            this(dataSource, PagedListConfigKt.Config$default(i, 0, false, 0, 0, 30, null));
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        }

        public Builder(@NotNull PagingSource<Key, Value> pagingSource, @NotNull PagingSource.LoadResult.Page<Key, Value> initialPage, @NotNull Config config) {
            Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
            Intrinsics.checkNotNullParameter(initialPage, "initialPage");
            Intrinsics.checkNotNullParameter(config, "config");
            this.coroutineScope = GlobalScope.INSTANCE;
            this.pagingSource = pagingSource;
            this.dataSource = null;
            this.initialPage = initialPage;
            this.config = config;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull PagingSource<Key, Value> pagingSource, @NotNull PagingSource.LoadResult.Page<Key, Value> initialPage, int i) {
            this(pagingSource, initialPage, PagedListConfigKt.Config$default(i, 0, false, 0, 0, 30, null));
            Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
            Intrinsics.checkNotNullParameter(initialPage, "initialPage");
        }
    }
}
