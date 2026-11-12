package com.xiaomi.hm.health.training.api.paging;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import androidx.paging.ItemKeyedDataSource;
import androidx.paging.PageKeyedDataSource;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.function.Consumer;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.helper.ErrorParser;
import com.xiaomi.hm.health.training.api.paging.PagingDataSourceDelegate;
import com.xiaomi.hm.health.training.api.util.Loggers;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public class PagingDataSourceDelegate<Key, Value> {
    private static final String i = "Train-PagingDataSourceDelegate";
    private String a;
    private DataSource<Key, Value> b;
    private Executor c;
    private Function2<Key, Integer, ListWithNextKey<Key, Value>> d;
    private Runnable e;
    private MutableLiveData<Resource<Void>> f = new MutableLiveData<>();
    private MutableLiveData<Resource<Void>> g = new MutableLiveData<>();
    private AtomicInteger h = new AtomicInteger(1);

    public static class ListWithNextKey<Key, Value> {
        private List<Value> a;
        private Key b;

        public ListWithNextKey(List<Value> list, Key key) {
            this.a = list;
            this.b = key;
        }

        public List<Value> getList() {
            return this.a;
        }

        public Key getNext() {
            return this.b;
        }
    }

    public PagingDataSourceDelegate(String str, DataSource<Key, Value> dataSource, Executor executor, Function2<Key, Integer, ListWithNextKey<Key, Value>> function2) {
        this.a = str;
        this.b = dataSource;
        this.c = executor;
        this.d = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k(PageKeyedDataSource.LoadCallback loadCallback, ListWithNextKey listWithNextKey) {
        loadCallback.onResult(listWithNextKey.a, listWithNextKey.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(ItemKeyedDataSource.LoadCallback loadCallback, ListWithNextKey listWithNextKey) {
        loadCallback.onResult(listWithNextKey.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object m(int i2, Object obj, ListWithNextKey listWithNextKey) {
        return String.format(Locale.CHINA, "%s: 加载%s列表第%d页时，检测到本数据源已被弃用，本页加载的数据不反馈给UI了，避免UI错乱, 本页key: %s, 下一页key: %s", Integer.valueOf(hashCode()), this.a, Integer.valueOf(i2), obj, listWithNextKey.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(int i2, int i3, ListWithNextKey listWithNextKey, Object obj) {
        Locale locale = Locale.CHINA;
        Object[] objArr = new Object[7];
        objArr[0] = Integer.valueOf(hashCode());
        objArr[1] = this.a;
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = Integer.valueOf(i3);
        objArr[4] = Integer.valueOf(listWithNextKey.a != null ? listWithNextKey.a.size() : 0);
        objArr[5] = obj;
        objArr[6] = listWithNextKey.b;
        return String.format(locale, "%s: 加载%s列表第%d页 成功, 期望请求 %d 条数据, 实际 %d 条数据, 本页key: %s, 下一页key: %s", objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void p(PageKeyedDataSource.LoadInitialCallback loadInitialCallback, ListWithNextKey listWithNextKey) {
        loadInitialCallback.onResult(listWithNextKey.a, null, listWithNextKey.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(ItemKeyedDataSource.LoadInitialCallback loadInitialCallback, ListWithNextKey listWithNextKey) {
        loadInitialCallback.onResult(listWithNextKey.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(ListWithNextKey listWithNextKey) {
        return String.format(Locale.CHINA, "%s: 加载%s列表第1页时，检测到本数据源已被弃用，本页加载的数据不反馈给UI了，避免UI错乱, 下一页key: %s", Integer.valueOf(hashCode()), this.a, listWithNextKey.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(int i2, ListWithNextKey listWithNextKey) {
        Locale locale = Locale.CHINA;
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(hashCode());
        objArr[1] = this.a;
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = Integer.valueOf(listWithNextKey.a != null ? listWithNextKey.a.size() : 0);
        objArr[4] = listWithNextKey.b;
        return String.format(locale, "%s: 加载%s列表第1页 成功, 期望请求 %d 条数据, 实际 %d 条数据, 下一页key: %s", objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void o(@Nullable final Key key, final int i2, @NonNull final Consumer<ListWithNextKey<Key, Value>> consumer) {
        final int iIncrementAndGet = this.h.incrementAndGet();
        this.f.postValue(Resource.loading(null));
        try {
            final ListWithNextKey<Key, Value> listWithNextKeyInvoke = this.d.invoke(key, Integer.valueOf(i2));
            this.e = null;
            if (this.b.isInvalid()) {
                Loggers.getLogger().v(i, new Supplier() { // from class: oq5
                    @Override // com.xiaomi.hm.health.training.api.function.Supplier
                    public final Object get() {
                        return this.a.m(iIncrementAndGet, key, listWithNextKeyInvoke);
                    }
                });
                return;
            }
            consumer.accept(listWithNextKeyInvoke);
            this.f.postValue(Resource.success(null));
            Loggers.getLogger().v(i, new Supplier() { // from class: mq5
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return this.a.n(iIncrementAndGet, i2, listWithNextKeyInvoke, key);
                }
            });
        } catch (Exception e) {
            this.e = new Runnable() { // from class: rq5
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.o(key, i2, consumer);
                }
            };
            this.f.postValue(ErrorParser.toErrorResource(e, String.format(Locale.CHINA, "加载%s列表第%d页", this.a, Integer.valueOf(iIncrementAndGet))));
            this.h.decrementAndGet();
        }
    }

    public LiveData<Resource<Void>> getInitialLoad() {
        return this.g;
    }

    public LiveData<Resource<Void>> getNetworkState() {
        return this.f;
    }

    public void loadAfter(@NonNull PageKeyedDataSource.LoadParams<Key> loadParams, @NonNull final PageKeyedDataSource.LoadCallback<Key, Value> loadCallback) {
        o(loadParams.key, loadParams.requestedLoadSize, new Consumer() { // from class: kq5
            @Override // com.xiaomi.hm.health.training.api.function.Consumer
            public final void accept(Object obj) {
                PagingDataSourceDelegate.k(loadCallback, (PagingDataSourceDelegate.ListWithNextKey) obj);
            }
        });
    }

    public void loadInitial(@NonNull PageKeyedDataSource.LoadInitialParams<Key> loadInitialParams, @NonNull final PageKeyedDataSource.LoadInitialCallback<Key, Value> loadInitialCallback) {
        t(null, loadInitialParams.requestedLoadSize, new Consumer() { // from class: lq5
            @Override // com.xiaomi.hm.health.training.api.function.Consumer
            public final void accept(Object obj) {
                PagingDataSourceDelegate.p(loadInitialCallback, (PagingDataSourceDelegate.ListWithNextKey) obj);
            }
        });
    }

    public void retryAllFailed() {
        Runnable runnable = this.e;
        this.e = null;
        if (runnable != null) {
            this.c.execute(runnable);
        }
    }

    public void loadAfter(@NonNull ItemKeyedDataSource.LoadParams<Key> loadParams, @NonNull final ItemKeyedDataSource.LoadCallback<Value> loadCallback) {
        o(loadParams.key, loadParams.requestedLoadSize, new Consumer() { // from class: iq5
            @Override // com.xiaomi.hm.health.training.api.function.Consumer
            public final void accept(Object obj) {
                PagingDataSourceDelegate.l(loadCallback, (PagingDataSourceDelegate.ListWithNextKey) obj);
            }
        });
    }

    public void loadInitial(@NonNull ItemKeyedDataSource.LoadInitialParams<Key> loadInitialParams, @NonNull final ItemKeyedDataSource.LoadInitialCallback<Value> loadInitialCallback) {
        t(loadInitialParams.requestedInitialKey, loadInitialParams.requestedLoadSize, new Consumer() { // from class: jq5
            @Override // com.xiaomi.hm.health.training.api.function.Consumer
            public final void accept(Object obj) {
                PagingDataSourceDelegate.q(loadInitialCallback, (PagingDataSourceDelegate.ListWithNextKey) obj);
            }
        });
    }

    /* JADX INFO: renamed from: loadInitial, reason: merged with bridge method [inline-methods] */
    public void t(@Nullable final Key key, final int i2, @NonNull final Consumer<ListWithNextKey<Key, Value>> consumer) {
        this.h.set(1);
        this.g.postValue(Resource.loading(null));
        try {
            final ListWithNextKey<Key, Value> listWithNextKeyInvoke = this.d.invoke(key, Integer.valueOf(i2));
            this.e = null;
            if (this.b.isInvalid()) {
                Loggers.getLogger().v(i, new Supplier() { // from class: pq5
                    @Override // com.xiaomi.hm.health.training.api.function.Supplier
                    public final Object get() {
                        return this.a.r(listWithNextKeyInvoke);
                    }
                });
                return;
            }
            consumer.accept(listWithNextKeyInvoke);
            this.g.postValue(Resource.success(null));
            Loggers.getLogger().v(i, new Supplier() { // from class: nq5
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return this.a.s(i2, listWithNextKeyInvoke);
                }
            });
        } catch (Exception e) {
            this.e = new Runnable() { // from class: qq5
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.t(key, i2, consumer);
                }
            };
            this.g.postValue(ErrorParser.toErrorResource(e, String.format(Locale.CHINA, "加载%s列表第1页", this.a)));
        }
    }
}
