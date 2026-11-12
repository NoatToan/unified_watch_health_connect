package com.xiaomi.hm.health.training.api.paging;

import androidx.annotation.NonNull;
import androidx.p008lifecycle.LiveData;
import androidx.paging.PageKeyedDataSource;
import com.xiaomi.hm.health.training.api.IWebApi;
import com.xiaomi.hm.health.training.api.bean.Items;
import com.xiaomi.hm.health.training.api.bean.TrainingItem;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseListItem;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.entity.User;
import com.xiaomi.hm.health.training.api.helper.DataConverter;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public class PageKeyedFeaturedCourseDataSource extends PageKeyedDataSource<Long, FeaturedCourseListItem> {
    private static final String d = "Train-PageKeyedFeaturedCourseDataSource";

    @NonNull
    private IWebApi a;

    @NonNull
    private Provider<User> b;

    @NonNull
    private PagingDataSourceDelegate<Long, FeaturedCourseListItem> c;

    public PageKeyedFeaturedCourseDataSource(@NonNull IWebApi iWebApi, @NonNull Provider<User> provider, Executor executor) {
        this.a = iWebApi;
        this.b = provider;
        this.c = new PagingDataSourceDelegate<>("精品课程", this, executor, new Function2() { // from class: np5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return this.a.b((Long) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public PagingDataSourceDelegate.ListWithNextKey<Long, FeaturedCourseListItem> b(Long l, int i) {
        Items<TrainingItem> itemsLoadTrainings = this.a.loadTrainings("EXCELLENT_COURSE", TrainingWebConst.Value.DisplayLocation.LIST_PAGE, Boolean.valueOf(this.b.get().isMale()), null, null, null, null, l, Integer.valueOf(i), null, null);
        return new PagingDataSourceDelegate.ListWithNextKey<>(DataConverter.toFeaturedCourseList(itemsLoadTrainings.items), itemsLoadTrainings.next);
    }

    public LiveData<Resource<Void>> getInitialLoad() {
        return this.c.getInitialLoad();
    }

    public LiveData<Resource<Void>> getNetworkState() {
        return this.c.getNetworkState();
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void loadAfter(@NonNull PageKeyedDataSource.LoadParams<Long> loadParams, @NonNull PageKeyedDataSource.LoadCallback<Long, FeaturedCourseListItem> loadCallback) {
        this.c.loadAfter(loadParams, loadCallback);
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void loadBefore(@NonNull PageKeyedDataSource.LoadParams<Long> loadParams, @NonNull PageKeyedDataSource.LoadCallback<Long, FeaturedCourseListItem> loadCallback) {
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void loadInitial(@NonNull PageKeyedDataSource.LoadInitialParams<Long> loadInitialParams, @NonNull PageKeyedDataSource.LoadInitialCallback<Long, FeaturedCourseListItem> loadInitialCallback) {
        this.c.loadInitial(loadInitialParams, loadInitialCallback);
    }

    public void retryAllFailed() {
        this.c.retryAllFailed();
    }
}
