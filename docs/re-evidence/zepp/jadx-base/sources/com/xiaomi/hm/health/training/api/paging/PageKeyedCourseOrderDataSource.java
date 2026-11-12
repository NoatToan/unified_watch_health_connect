package com.xiaomi.hm.health.training.api.paging;

import androidx.annotation.NonNull;
import androidx.p008lifecycle.LiveData;
import androidx.paging.PageKeyedDataSource;
import com.xiaomi.hm.health.training.api.IWebApi;
import com.xiaomi.hm.health.training.api.bean.Items;
import com.xiaomi.hm.health.training.api.bean.PaidOrder;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import com.xiaomi.hm.health.training.api.entity.PaidOrderListItem;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.entity.User;
import com.xiaomi.hm.health.training.api.helper.DataConverter;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public class PageKeyedCourseOrderDataSource extends PageKeyedDataSource<Long, PaidOrderListItem> {

    @NonNull
    private IWebApi a;

    @NonNull
    private Provider<User> b;

    @NonNull
    private PagingDataSourceDelegate<Long, PaidOrderListItem> c;

    public PageKeyedCourseOrderDataSource(@NonNull IWebApi iWebApi, @NonNull Provider<User> provider, Executor executor) {
        this.a = iWebApi;
        this.b = provider;
        this.c = new PagingDataSourceDelegate<>("我的订单", this, executor, new Function2() { // from class: mp5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return this.a.b((Long) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public PagingDataSourceDelegate.ListWithNextKey<Long, PaidOrderListItem> b(Long l, int i) {
        Items<PaidOrder> itemsLoadPaidOrderList = this.a.loadPaidOrderList(this.b.get().getUid(), l, TrainingWebConst.Value.OrderStatus.DELIVERING, Integer.valueOf(i));
        return new PagingDataSourceDelegate.ListWithNextKey<>(DataConverter.toCourseOrderList(itemsLoadPaidOrderList.items), itemsLoadPaidOrderList.next);
    }

    public LiveData<Resource<Void>> getInitialLoad() {
        return this.c.getInitialLoad();
    }

    public LiveData<Resource<Void>> getNetworkState() {
        return this.c.getNetworkState();
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void loadAfter(@NonNull PageKeyedDataSource.LoadParams<Long> loadParams, @NonNull PageKeyedDataSource.LoadCallback<Long, PaidOrderListItem> loadCallback) {
        this.c.loadAfter(loadParams, loadCallback);
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void loadBefore(@NonNull PageKeyedDataSource.LoadParams<Long> loadParams, @NonNull PageKeyedDataSource.LoadCallback<Long, PaidOrderListItem> loadCallback) {
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void loadInitial(@NonNull PageKeyedDataSource.LoadInitialParams<Long> loadInitialParams, @NonNull PageKeyedDataSource.LoadInitialCallback<Long, PaidOrderListItem> loadInitialCallback) {
        this.c.loadInitial(loadInitialParams, loadInitialCallback);
    }

    public void retryAllFailed() {
        this.c.retryAllFailed();
    }
}
