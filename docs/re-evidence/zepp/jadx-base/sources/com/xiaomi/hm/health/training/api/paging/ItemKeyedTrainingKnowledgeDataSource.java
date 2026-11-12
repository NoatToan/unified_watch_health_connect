package com.xiaomi.hm.health.training.api.paging;

import androidx.annotation.NonNull;
import androidx.p008lifecycle.LiveData;
import androidx.paging.ItemKeyedDataSource;
import com.xiaomi.hm.health.training.api.IWebApi;
import com.xiaomi.hm.health.training.api.bean.Items;
import com.xiaomi.hm.health.training.api.bean.Knowledge;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.entity.TrainingKnowledge;
import com.xiaomi.hm.health.training.api.entity.User;
import com.xiaomi.hm.health.training.api.helper.DataConverter;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public class ItemKeyedTrainingKnowledgeDataSource extends ItemKeyedDataSource<Long, TrainingKnowledge> {
    private static final String d = "Train-ItemKeyedTrainingKnowledgeDataSource";
    private IWebApi a;
    private Provider<User> b;

    @NonNull
    private PagingDataSourceDelegate<Long, TrainingKnowledge> c;

    public ItemKeyedTrainingKnowledgeDataSource(IWebApi iWebApi, Provider<User> provider, Executor executor) {
        this.a = iWebApi;
        this.b = provider;
        this.c = new PagingDataSourceDelegate<>("训练资讯", this, executor, new Function2() { // from class: nh4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return this.a.b((Long) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PagingDataSourceDelegate.ListWithNextKey<Long, TrainingKnowledge> b(Long l, int i) {
        Items<Knowledge> itemsLoadTrainingKnowledge = this.a.loadTrainingKnowledge(this.b.get().getUid(), l, Integer.valueOf(i));
        return new PagingDataSourceDelegate.ListWithNextKey<>(DataConverter.toTrainingKnowledgeList(itemsLoadTrainingKnowledge.items), itemsLoadTrainingKnowledge.next);
    }

    public LiveData<Resource<Void>> getInitialLoad() {
        return this.c.getInitialLoad();
    }

    public LiveData<Resource<Void>> getNetworkState() {
        return this.c.getNetworkState();
    }

    @Override // androidx.paging.ItemKeyedDataSource
    public void loadAfter(@NonNull ItemKeyedDataSource.LoadParams<Long> loadParams, @NonNull ItemKeyedDataSource.LoadCallback<TrainingKnowledge> loadCallback) {
        this.c.loadAfter(loadParams, loadCallback);
    }

    @Override // androidx.paging.ItemKeyedDataSource
    public void loadBefore(@NonNull ItemKeyedDataSource.LoadParams<Long> loadParams, @NonNull ItemKeyedDataSource.LoadCallback<TrainingKnowledge> loadCallback) {
    }

    @Override // androidx.paging.ItemKeyedDataSource
    public void loadInitial(@NonNull ItemKeyedDataSource.LoadInitialParams<Long> loadInitialParams, @NonNull ItemKeyedDataSource.LoadInitialCallback<TrainingKnowledge> loadInitialCallback) {
        this.c.loadInitial(loadInitialParams, loadInitialCallback);
    }

    public void retryAllFailed() {
        this.c.retryAllFailed();
    }

    @Override // androidx.paging.ItemKeyedDataSource
    @NonNull
    public Long getKey(@NonNull TrainingKnowledge trainingKnowledge) {
        return trainingKnowledge.sortOrder;
    }
}
