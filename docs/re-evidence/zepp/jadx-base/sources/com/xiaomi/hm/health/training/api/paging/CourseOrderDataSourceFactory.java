package com.xiaomi.hm.health.training.api.paging;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import com.xiaomi.hm.health.training.api.IWebApi;
import com.xiaomi.hm.health.training.api.entity.PaidOrderListItem;
import com.xiaomi.hm.health.training.api.entity.User;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes21.dex */
public class CourseOrderDataSourceFactory extends DataSource.Factory<Long, PaidOrderListItem> {
    private IWebApi a;
    private Provider<User> b;
    private Executor c;
    private MutableLiveData<PageKeyedCourseOrderDataSource> d = new MutableLiveData<>();

    public CourseOrderDataSourceFactory(IWebApi iWebApi, Provider<User> provider, Executor executor) {
        this.a = iWebApi;
        this.b = provider;
        this.c = executor;
    }

    @Override // androidx.paging.DataSource.Factory
    public DataSource<Long, PaidOrderListItem> create() {
        PageKeyedCourseOrderDataSource pageKeyedCourseOrderDataSource = new PageKeyedCourseOrderDataSource(this.a, this.b, this.c);
        this.d.postValue(pageKeyedCourseOrderDataSource);
        return pageKeyedCourseOrderDataSource;
    }

    public LiveData<PageKeyedCourseOrderDataSource> getSourceLiveData() {
        return this.d;
    }
}
