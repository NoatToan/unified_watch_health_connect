package com.xiaomi.hm.health.training.api.paging;

import androidx.annotation.NonNull;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import com.xiaomi.hm.health.training.api.IWebApi;
import com.xiaomi.hm.health.training.api.entity.ActionOrYogaTraining;
import com.xiaomi.hm.health.training.api.entity.User;
import com.xiaomi.hm.health.training.api.function.Supplier;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes21.dex */
public class ActionTrainingDataSourceFactory extends DataSource.Factory<Long, ActionOrYogaTraining> {
    private IWebApi a;
    private Provider<User> b;
    private Executor c;
    private Supplier<String> d;
    private Supplier<String> e;
    private Supplier<String> f;
    private MutableLiveData<PageKeyedActionTrainingDataSource> g = new MutableLiveData<>();

    public ActionTrainingDataSourceFactory(@NonNull IWebApi iWebApi, @NonNull Provider<User> provider, @NonNull Executor executor, @NonNull Supplier<String> supplier, @NonNull Supplier<String> supplier2, @NonNull Supplier<String> supplier3) {
        this.a = iWebApi;
        this.b = provider;
        this.c = executor;
        this.d = supplier;
        this.e = supplier2;
        this.f = supplier3;
    }

    @Override // androidx.paging.DataSource.Factory
    public DataSource<Long, ActionOrYogaTraining> create() {
        PageKeyedActionTrainingDataSource pageKeyedActionTrainingDataSource = new PageKeyedActionTrainingDataSource(this.a, this.b, this.c, this.d, this.e, this.f);
        this.g.postValue(pageKeyedActionTrainingDataSource);
        return pageKeyedActionTrainingDataSource;
    }

    public LiveData<PageKeyedActionTrainingDataSource> getSourceLiveData() {
        return this.g;
    }
}
