package com.xiaomi.hm.health.training.api.paging;

import androidx.p008lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import com.xiaomi.hm.health.training.api.IWebApi;
import com.xiaomi.hm.health.training.api.entity.TrainingKnowledge;
import com.xiaomi.hm.health.training.api.entity.User;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingKnowledgeDataSourceFactory extends DataSource.Factory<Long, TrainingKnowledge> {
    private IWebApi a;
    private Provider<User> b;
    private Executor c;
    private MutableLiveData<ItemKeyedTrainingKnowledgeDataSource> d = new MutableLiveData<>();

    public TrainingKnowledgeDataSourceFactory(IWebApi iWebApi, Provider<User> provider, Executor executor) {
        this.a = iWebApi;
        this.b = provider;
        this.c = executor;
    }

    @Override // androidx.paging.DataSource.Factory
    public DataSource<Long, TrainingKnowledge> create() {
        ItemKeyedTrainingKnowledgeDataSource itemKeyedTrainingKnowledgeDataSource = new ItemKeyedTrainingKnowledgeDataSource(this.a, this.b, this.c);
        this.d.postValue(itemKeyedTrainingKnowledgeDataSource);
        return itemKeyedTrainingKnowledgeDataSource;
    }

    public MutableLiveData<ItemKeyedTrainingKnowledgeDataSource> getSourceLiveData() {
        return this.d;
    }
}
