package com.xiaomi.hm.health.training.api.paging;

import androidx.annotation.NonNull;
import androidx.p008lifecycle.LiveData;
import androidx.paging.PageKeyedDataSource;
import com.xiaomi.hm.health.training.api.IWebApi;
import com.xiaomi.hm.health.training.api.bean.Items;
import com.xiaomi.hm.health.training.api.bean.TrainingItem;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import com.xiaomi.hm.health.training.api.entity.ActionOrYogaTraining;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.entity.User;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.helper.DataConverter;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public class PageKeyedActionTrainingDataSource extends PageKeyedDataSource<Long, ActionOrYogaTraining> {

    @NonNull
    private IWebApi a;

    @NonNull
    private Provider<User> b;

    @NonNull
    private Supplier<String> c;

    @NonNull
    private Supplier<String> d;

    @NonNull
    private Supplier<String> e;

    @NonNull
    private PagingDataSourceDelegate<Long, ActionOrYogaTraining> f;

    public PageKeyedActionTrainingDataSource(@NonNull IWebApi iWebApi, @NonNull Provider<User> provider, @NonNull Executor executor, @NonNull Supplier<String> supplier, @NonNull Supplier<String> supplier2, @NonNull Supplier<String> supplier3) {
        this.a = iWebApi;
        this.b = provider;
        this.c = supplier;
        this.d = supplier2;
        this.e = supplier3;
        this.f = new PagingDataSourceDelegate<>("动作和瑜伽训练", this, executor, new Function2() { // from class: lp5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return this.a.b((Long) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public PagingDataSourceDelegate.ListWithNextKey<Long, ActionOrYogaTraining> b(Long l, int i) {
        Items<TrainingItem> itemsLoadTrainings = this.a.loadTrainings("SINGLE_TRAINING,YOGA", TrainingWebConst.Value.DisplayLocation.LIST_PAGE, Boolean.valueOf(this.b.get().isMale()), null, this.c.get(), this.d.get(), this.e.get(), l, Integer.valueOf(i), null, null);
        return new PagingDataSourceDelegate.ListWithNextKey<>(DataConverter.toActionOrYogaTrainingList(itemsLoadTrainings.items, this.b.get().isMale()), itemsLoadTrainings.next);
    }

    public LiveData<Resource<Void>> getInitialLoad() {
        return this.f.getInitialLoad();
    }

    public LiveData<Resource<Void>> getNetworkState() {
        return this.f.getNetworkState();
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void loadAfter(@NonNull PageKeyedDataSource.LoadParams<Long> loadParams, @NonNull PageKeyedDataSource.LoadCallback<Long, ActionOrYogaTraining> loadCallback) {
        this.f.loadAfter(loadParams, loadCallback);
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void loadBefore(@NonNull PageKeyedDataSource.LoadParams<Long> loadParams, @NonNull PageKeyedDataSource.LoadCallback<Long, ActionOrYogaTraining> loadCallback) {
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void loadInitial(@NonNull PageKeyedDataSource.LoadInitialParams<Long> loadInitialParams, @NonNull PageKeyedDataSource.LoadInitialCallback<Long, ActionOrYogaTraining> loadInitialCallback) {
        this.f.loadInitial(loadInitialParams, loadInitialCallback);
    }

    public void retryAllFailed() {
        this.f.retryAllFailed();
    }
}
