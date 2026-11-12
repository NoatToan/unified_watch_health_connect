package androidx.paging;

import androidx.arch.core.util.Function;
import com.xiaomi.onetrack.api.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0002*\b\b\u0002\u0010\u0004*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00040\u0005B9\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J*\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0017H\u0016J*\u0010\u0018\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0017H\u0016J*\u0010\u0019\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR&\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/paging/WrapperPageKeyedDataSource;", "K", "", "A", c.f13755a, "Landroidx/paging/PageKeyedDataSource;", "source", "listFunction", "Landroidx/arch/core/util/Function;", "", "(Landroidx/paging/PageKeyedDataSource;Landroidx/arch/core/util/Function;)V", "isInvalid", "", "()Z", "addInvalidatedCallback", "", "onInvalidatedCallback", "Landroidx/paging/DataSource$InvalidatedCallback;", "invalidate", "loadAfter", "params", "Landroidx/paging/PageKeyedDataSource$LoadParams;", "callback", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "loadBefore", "loadInitial", "Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "removeInvalidatedCallback", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class WrapperPageKeyedDataSource<K, A, B> extends PageKeyedDataSource<K, B> {
    private final Function<List<A>, List<B>> listFunction;
    private final PageKeyedDataSource<K, A> source;

    public WrapperPageKeyedDataSource(@NotNull PageKeyedDataSource<K, A> source, @NotNull Function<List<A>, List<B>> listFunction) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(listFunction, "listFunction");
        this.source = source;
        this.listFunction = listFunction;
    }

    @Override // androidx.paging.DataSource
    public void addInvalidatedCallback(@NotNull DataSource.InvalidatedCallback onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.source.addInvalidatedCallback(onInvalidatedCallback);
    }

    @Override // androidx.paging.DataSource
    public void invalidate() {
        this.source.invalidate();
    }

    @Override // androidx.paging.DataSource
    public boolean isInvalid() {
        return this.source.isInvalid();
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void loadAfter(@NotNull PageKeyedDataSource.LoadParams<K> params, @NotNull final PageKeyedDataSource.LoadCallback<K, B> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.source.loadAfter(params, new PageKeyedDataSource.LoadCallback<K, A>() { // from class: androidx.paging.WrapperPageKeyedDataSource.loadAfter.1
            @Override // androidx.paging.PageKeyedDataSource.LoadCallback
            public void onResult(@NotNull List<? extends A> data, @Nullable K adjacentPageKey) {
                Intrinsics.checkNotNullParameter(data, "data");
                callback.onResult(DataSource.INSTANCE.convert$paging_common(WrapperPageKeyedDataSource.this.listFunction, data), adjacentPageKey);
            }
        });
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void loadBefore(@NotNull PageKeyedDataSource.LoadParams<K> params, @NotNull final PageKeyedDataSource.LoadCallback<K, B> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.source.loadBefore(params, new PageKeyedDataSource.LoadCallback<K, A>() { // from class: androidx.paging.WrapperPageKeyedDataSource.loadBefore.1
            @Override // androidx.paging.PageKeyedDataSource.LoadCallback
            public void onResult(@NotNull List<? extends A> data, @Nullable K adjacentPageKey) {
                Intrinsics.checkNotNullParameter(data, "data");
                callback.onResult(DataSource.INSTANCE.convert$paging_common(WrapperPageKeyedDataSource.this.listFunction, data), adjacentPageKey);
            }
        });
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void loadInitial(@NotNull PageKeyedDataSource.LoadInitialParams<K> params, @NotNull final PageKeyedDataSource.LoadInitialCallback<K, B> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.source.loadInitial(params, new PageKeyedDataSource.LoadInitialCallback<K, A>() { // from class: androidx.paging.WrapperPageKeyedDataSource.loadInitial.1
            @Override // androidx.paging.PageKeyedDataSource.LoadInitialCallback
            public void onResult(@NotNull List<? extends A> data, int position, int totalCount, @Nullable K previousPageKey, @Nullable K nextPageKey) {
                Intrinsics.checkNotNullParameter(data, "data");
                callback.onResult(DataSource.INSTANCE.convert$paging_common(WrapperPageKeyedDataSource.this.listFunction, data), position, totalCount, previousPageKey, nextPageKey);
            }

            @Override // androidx.paging.PageKeyedDataSource.LoadInitialCallback
            public void onResult(@NotNull List<? extends A> data, @Nullable K previousPageKey, @Nullable K nextPageKey) {
                Intrinsics.checkNotNullParameter(data, "data");
                callback.onResult(DataSource.INSTANCE.convert$paging_common(WrapperPageKeyedDataSource.this.listFunction, data), previousPageKey, nextPageKey);
            }
        });
    }

    @Override // androidx.paging.DataSource
    public void removeInvalidatedCallback(@NotNull DataSource.InvalidatedCallback onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.source.removeInvalidatedCallback(onInvalidatedCallback);
    }
}
