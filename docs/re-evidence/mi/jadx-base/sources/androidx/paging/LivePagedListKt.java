package androidx.paging;

import androidx.lifecycle.LiveData;
import com.xiaomi.onetrack.c.q;
import defpackage.bj1;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a}\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u0001H\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a}\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\n\u001a\u0004\u0018\u0001H\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0014\u001am\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u00152\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u0001H\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\f2\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001am\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u00152\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\n\u001a\u0004\u0018\u0001H\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\f2\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, d2 = {"toLiveData", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Value", "Key", "", "Lkotlin/Function0;", "Landroidx/paging/PagingSource;", q.f13857a, "Landroidx/paging/PagedList$Config;", "initialLoadKey", "boundaryCallback", "Landroidx/paging/PagedList$BoundaryCallback;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "fetchDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlin/jvm/functions/Function0;Landroidx/paging/PagedList$Config;Ljava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;)Landroidx/lifecycle/LiveData;", "pageSize", "", "(Lkotlin/jvm/functions/Function0;ILjava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;)Landroidx/lifecycle/LiveData;", "Landroidx/paging/DataSource$Factory;", "fetchExecutor", "Ljava/util/concurrent/Executor;", "(Landroidx/paging/DataSource$Factory;Landroidx/paging/PagedList$Config;Ljava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Ljava/util/concurrent/Executor;)Landroidx/lifecycle/LiveData;", "(Landroidx/paging/DataSource$Factory;ILjava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Ljava/util/concurrent/Executor;)Landroidx/lifecycle/LiveData;", "paging-runtime_release"}, k = 2, mv = {1, 4, 2})
public final class LivePagedListKt {
    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @ReplaceWith(expression = "Pager(\n            PagingConfig(\n                config.pageSize,\n                config.prefetchDistance,\n                config.enablePlaceholders,\n                config.initialLoadSizeHint,\n                config.maxSize\n            ),\n            initialLoadKey,\n            this.asPagingSourceFactory(fetchExecutor.asCoroutineDispatcher())\n        ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData", "kotlinx.coroutines.asCoroutineDispatcher"}))
    @NotNull
    public static final <Key, Value> LiveData<PagedList<Value>> toLiveData(@NotNull DataSource.Factory<Key, Value> toLiveData, @NotNull PagedList.Config config, @Nullable Key key, @Nullable PagedList.BoundaryCallback<Value> boundaryCallback, @NotNull Executor fetchExecutor) {
        Intrinsics.checkNotNullParameter(toLiveData, "$this$toLiveData");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(fetchExecutor, "fetchExecutor");
        return new LivePagedListBuilder(toLiveData, config).setInitialLoadKey(key).setBoundaryCallback(boundaryCallback).setFetchExecutor(fetchExecutor).build();
    }

    public static /* synthetic */ LiveData toLiveData$default(DataSource.Factory factory, PagedList.Config config, Object obj, PagedList.BoundaryCallback boundaryCallback, Executor executor, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        if ((i & 4) != 0) {
            boundaryCallback = null;
        }
        if ((i & 8) != 0) {
            executor = bj1.g();
            Intrinsics.checkNotNullExpressionValue(executor, "ArchTaskExecutor.getIOThreadExecutor()");
        }
        return toLiveData((DataSource.Factory<Object, Value>) factory, config, obj, boundaryCallback, executor);
    }

    public static /* synthetic */ LiveData toLiveData$default(DataSource.Factory factory, int i, Object obj, PagedList.BoundaryCallback boundaryCallback, Executor executor, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            obj = null;
        }
        if ((i2 & 4) != 0) {
            boundaryCallback = null;
        }
        if ((i2 & 8) != 0) {
            executor = bj1.g();
            Intrinsics.checkNotNullExpressionValue(executor, "ArchTaskExecutor.getIOThreadExecutor()");
        }
        return toLiveData((DataSource.Factory<Object, Value>) factory, i, obj, boundaryCallback, executor);
    }

    public static /* synthetic */ LiveData toLiveData$default(Function0 function0, PagedList.Config config, Object obj, PagedList.BoundaryCallback boundaryCallback, CoroutineScope coroutineScope, CoroutineDispatcher coroutineDispatcher, int i, Object obj2) {
        Object obj3 = (i & 2) != 0 ? null : obj;
        PagedList.BoundaryCallback boundaryCallback2 = (i & 4) != 0 ? null : boundaryCallback;
        if ((i & 8) != 0) {
            coroutineScope = GlobalScope.INSTANCE;
        }
        CoroutineScope coroutineScope2 = coroutineScope;
        if ((i & 16) != 0) {
            Executor executorG = bj1.g();
            Intrinsics.checkNotNullExpressionValue(executorG, "ArchTaskExecutor.getIOThreadExecutor()");
            coroutineDispatcher = ExecutorsKt.from(executorG);
        }
        return toLiveData((Function0<? extends PagingSource<Object, Value>>) function0, config, obj3, boundaryCallback2, coroutineScope2, coroutineDispatcher);
    }

    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @ReplaceWith(expression = "Pager(\n            PagingConfig(pageSize),\n            initialLoadKey,\n            this.asPagingSourceFactory(fetchExecutor.asCoroutineDispatcher())\n        ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData", "kotlinx.coroutines.asCoroutineDispatcher"}))
    @NotNull
    public static final <Key, Value> LiveData<PagedList<Value>> toLiveData(@NotNull DataSource.Factory<Key, Value> toLiveData, int i, @Nullable Key key, @Nullable PagedList.BoundaryCallback<Value> boundaryCallback, @NotNull Executor fetchExecutor) {
        Intrinsics.checkNotNullParameter(toLiveData, "$this$toLiveData");
        Intrinsics.checkNotNullParameter(fetchExecutor, "fetchExecutor");
        return new LivePagedListBuilder(toLiveData, PagedListConfigKt.Config$default(i, 0, false, 0, 0, 30, null)).setInitialLoadKey(key).setBoundaryCallback(boundaryCallback).setFetchExecutor(fetchExecutor).build();
    }

    public static /* synthetic */ LiveData toLiveData$default(Function0 function0, int i, Object obj, PagedList.BoundaryCallback boundaryCallback, CoroutineScope coroutineScope, CoroutineDispatcher coroutineDispatcher, int i2, Object obj2) {
        Object obj3 = (i2 & 2) != 0 ? null : obj;
        PagedList.BoundaryCallback boundaryCallback2 = (i2 & 4) != 0 ? null : boundaryCallback;
        if ((i2 & 8) != 0) {
            coroutineScope = GlobalScope.INSTANCE;
        }
        CoroutineScope coroutineScope2 = coroutineScope;
        if ((i2 & 16) != 0) {
            Executor executorG = bj1.g();
            Intrinsics.checkNotNullExpressionValue(executorG, "ArchTaskExecutor.getIOThreadExecutor()");
            coroutineDispatcher = ExecutorsKt.from(executorG);
        }
        return toLiveData((Function0<? extends PagingSource<Object, Value>>) function0, i, obj3, boundaryCallback2, coroutineScope2, coroutineDispatcher);
    }

    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @ReplaceWith(expression = "Pager(\n            PagingConfig(\n                config.pageSize,\n                config.prefetchDistance,\n                config.enablePlaceholders,\n                config.initialLoadSizeHint,\n                config.maxSize\n            ),\n            initialLoadKey,\n            this\n        ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData"}))
    @NotNull
    public static final <Key, Value> LiveData<PagedList<Value>> toLiveData(@NotNull Function0<? extends PagingSource<Key, Value>> toLiveData, @NotNull PagedList.Config config, @Nullable Key key, @Nullable PagedList.BoundaryCallback<Value> boundaryCallback, @NotNull CoroutineScope coroutineScope, @NotNull CoroutineDispatcher fetchDispatcher) {
        Intrinsics.checkNotNullParameter(toLiveData, "$this$toLiveData");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
        Executor executorI = bj1.i();
        Intrinsics.checkNotNullExpressionValue(executorI, "ArchTaskExecutor.getMainThreadExecutor()");
        return new LivePagedList(coroutineScope, key, config, boundaryCallback, toLiveData, ExecutorsKt.from(executorI), fetchDispatcher);
    }

    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @ReplaceWith(expression = "Pager(\n            PagingConfig(pageSize),\n            initialLoadKey,\n            this\n        ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData"}))
    @NotNull
    public static final <Key, Value> LiveData<PagedList<Value>> toLiveData(@NotNull Function0<? extends PagingSource<Key, Value>> toLiveData, int i, @Nullable Key key, @Nullable PagedList.BoundaryCallback<Value> boundaryCallback, @NotNull CoroutineScope coroutineScope, @NotNull CoroutineDispatcher fetchDispatcher) {
        Intrinsics.checkNotNullParameter(toLiveData, "$this$toLiveData");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
        PagedList.Config configBuild = new PagedList.Config.Builder().setPageSize(i).build();
        Executor executorI = bj1.i();
        Intrinsics.checkNotNullExpressionValue(executorI, "ArchTaskExecutor.getMainThreadExecutor()");
        return new LivePagedList(coroutineScope, key, configBuild, boundaryCallback, toLiveData, ExecutorsKt.from(executorI), fetchDispatcher);
    }
}
