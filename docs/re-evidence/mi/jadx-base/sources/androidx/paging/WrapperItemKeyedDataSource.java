package androidx.paging;

import androidx.arch.core.util.Function;
import com.xiaomi.onetrack.api.c;
import java.util.IdentityHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0002*\b\b\u0002\u0010\u0004*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00040\u0005B9\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\tJ\u0015\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0011H\u0016J$\u0010\u0019\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00020\u001dH\u0016J$\u0010\u001e\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00020\u001dH\u0016J$\u0010\u001f\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000 2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Landroidx/paging/WrapperItemKeyedDataSource;", "K", "", "A", c.f13755a, "Landroidx/paging/ItemKeyedDataSource;", "source", "listFunction", "Landroidx/arch/core/util/Function;", "", "(Landroidx/paging/ItemKeyedDataSource;Landroidx/arch/core/util/Function;)V", "isInvalid", "", "()Z", "keyMap", "Ljava/util/IdentityHashMap;", "addInvalidatedCallback", "", "onInvalidatedCallback", "Landroidx/paging/DataSource$InvalidatedCallback;", "convertWithStashedKeys", "getKey", "item", "(Ljava/lang/Object;)Ljava/lang/Object;", "invalidate", "loadAfter", "params", "Landroidx/paging/ItemKeyedDataSource$LoadParams;", "callback", "Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "loadBefore", "loadInitial", "Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;", "Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;", "removeInvalidatedCallback", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class WrapperItemKeyedDataSource<K, A, B> extends ItemKeyedDataSource<K, B> {
    private final IdentityHashMap<B, K> keyMap;
    private final Function<List<A>, List<B>> listFunction;
    private final ItemKeyedDataSource<K, A> source;

    public WrapperItemKeyedDataSource(@NotNull ItemKeyedDataSource<K, A> source, @NotNull Function<List<A>, List<B>> listFunction) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(listFunction, "listFunction");
        this.source = source;
        this.listFunction = listFunction;
        this.keyMap = new IdentityHashMap<>();
    }

    @Override // androidx.paging.DataSource
    public void addInvalidatedCallback(@NotNull DataSource.InvalidatedCallback onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.source.addInvalidatedCallback(onInvalidatedCallback);
    }

    @NotNull
    public final List<B> convertWithStashedKeys(@NotNull List<? extends A> source) {
        Intrinsics.checkNotNullParameter(source, "source");
        List<B> listConvert$paging_common = DataSource.INSTANCE.convert$paging_common(this.listFunction, source);
        synchronized (this.keyMap) {
            try {
                int size = listConvert$paging_common.size();
                for (int i = 0; i < size; i++) {
                    this.keyMap.put(listConvert$paging_common.get(i), this.source.getKey(source.get(i)));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return listConvert$paging_common;
    }

    @Override // androidx.paging.ItemKeyedDataSource
    @NotNull
    public K getKey(@NotNull B item) {
        K k2;
        Intrinsics.checkNotNullParameter(item, "item");
        synchronized (this.keyMap) {
            k2 = this.keyMap.get(item);
            Intrinsics.checkNotNull(k2);
        }
        return k2;
    }

    @Override // androidx.paging.DataSource
    public void invalidate() {
        this.source.invalidate();
    }

    @Override // androidx.paging.DataSource
    public boolean isInvalid() {
        return this.source.isInvalid();
    }

    @Override // androidx.paging.ItemKeyedDataSource
    public void loadAfter(@NotNull ItemKeyedDataSource.LoadParams<K> params, @NotNull final ItemKeyedDataSource.LoadCallback<B> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.source.loadAfter(params, new ItemKeyedDataSource.LoadCallback<A>() { // from class: androidx.paging.WrapperItemKeyedDataSource.loadAfter.1
            @Override // androidx.paging.ItemKeyedDataSource.LoadCallback
            public void onResult(@NotNull List<? extends A> data) {
                Intrinsics.checkNotNullParameter(data, "data");
                callback.onResult(WrapperItemKeyedDataSource.this.convertWithStashedKeys(data));
            }
        });
    }

    @Override // androidx.paging.ItemKeyedDataSource
    public void loadBefore(@NotNull ItemKeyedDataSource.LoadParams<K> params, @NotNull final ItemKeyedDataSource.LoadCallback<B> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.source.loadBefore(params, new ItemKeyedDataSource.LoadCallback<A>() { // from class: androidx.paging.WrapperItemKeyedDataSource.loadBefore.1
            @Override // androidx.paging.ItemKeyedDataSource.LoadCallback
            public void onResult(@NotNull List<? extends A> data) {
                Intrinsics.checkNotNullParameter(data, "data");
                callback.onResult(WrapperItemKeyedDataSource.this.convertWithStashedKeys(data));
            }
        });
    }

    @Override // androidx.paging.ItemKeyedDataSource
    public void loadInitial(@NotNull ItemKeyedDataSource.LoadInitialParams<K> params, @NotNull final ItemKeyedDataSource.LoadInitialCallback<B> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.source.loadInitial(params, new ItemKeyedDataSource.LoadInitialCallback<A>() { // from class: androidx.paging.WrapperItemKeyedDataSource.loadInitial.1
            @Override // androidx.paging.ItemKeyedDataSource.LoadInitialCallback
            public void onResult(@NotNull List<? extends A> data, int position, int totalCount) {
                Intrinsics.checkNotNullParameter(data, "data");
                callback.onResult(WrapperItemKeyedDataSource.this.convertWithStashedKeys(data), position, totalCount);
            }

            @Override // androidx.paging.ItemKeyedDataSource.LoadCallback
            public void onResult(@NotNull List<? extends A> data) {
                Intrinsics.checkNotNullParameter(data, "data");
                callback.onResult(WrapperItemKeyedDataSource.this.convertWithStashedKeys(data));
            }
        });
    }

    @Override // androidx.paging.DataSource
    public void removeInvalidatedCallback(@NotNull DataSource.InvalidatedCallback onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.source.removeInvalidatedCallback(onInvalidatedCallback);
    }
}
