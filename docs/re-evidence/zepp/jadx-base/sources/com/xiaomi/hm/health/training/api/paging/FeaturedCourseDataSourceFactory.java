package com.xiaomi.hm.health.training.api.paging;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import com.xiaomi.hm.health.training.api.IWebApi;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseListItem;
import com.xiaomi.hm.health.training.api.entity.User;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes21.dex */
public class FeaturedCourseDataSourceFactory extends DataSource.Factory<Long, FeaturedCourseListItem> {
    private IWebApi a;
    private Provider<User> b;
    private Executor c;
    private MutableLiveData<PageKeyedFeaturedCourseDataSource> d = new MutableLiveData<>();

    public FeaturedCourseDataSourceFactory(IWebApi iWebApi, Provider<User> provider, Executor executor) {
        this.a = iWebApi;
        this.b = provider;
        this.c = executor;
    }

    @Override // androidx.paging.DataSource.Factory
    public DataSource<Long, FeaturedCourseListItem> create() {
        PageKeyedFeaturedCourseDataSource pageKeyedFeaturedCourseDataSource = new PageKeyedFeaturedCourseDataSource(this.a, this.b, this.c);
        this.d.postValue(pageKeyedFeaturedCourseDataSource);
        return pageKeyedFeaturedCourseDataSource;
    }

    public LiveData<PageKeyedFeaturedCourseDataSource> getSourceLiveData() {
        return this.d;
    }
}
