package androidx.paging;

import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ai\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Key", "Value", "Landroidx/paging/DataSource;", ParamKey.dataSource, "Landroidx/paging/PagedList$Config;", "config", "Ljava/util/concurrent/Executor;", "notifyExecutor", "fetchExecutor", "Landroidx/paging/PagedList$BoundaryCallback;", "boundaryCallback", "initialKey", "Landroidx/paging/PagedList;", "PagedList", "(Landroidx/paging/DataSource;Landroidx/paging/PagedList$Config;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroidx/paging/PagedList$BoundaryCallback;Ljava/lang/Object;)Landroidx/paging/PagedList;", "paging-common-ktx"}, k = 2, mv = {1, 4, 0})
public final class PagedListKt {
    @NotNull
    public static final <Key, Value> PagedList<Value> PagedList(@NotNull DataSource<Key, Value> dataSource, @NotNull PagedList.Config config, @NotNull Executor executor, @NotNull Executor executor2, @Nullable PagedList.BoundaryCallback<Value> boundaryCallback, @Nullable Key key) {
        return new PagedList.Builder(dataSource, config).setNotifyExecutor(executor).setFetchExecutor(executor2).setBoundaryCallback(boundaryCallback).setInitialKey(key).build();
    }
}
