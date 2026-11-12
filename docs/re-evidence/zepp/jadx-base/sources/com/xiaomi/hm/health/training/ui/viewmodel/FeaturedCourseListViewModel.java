package com.xiaomi.hm.health.training.ui.viewmodel;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.paging.PagedList;
import com.xiaomi.hm.health.training.api.TrainingDataSource;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseListItem;
import com.xiaomi.hm.health.training.api.entity.Listing;
import com.xiaomi.hm.health.training.api.entity.Resource;
import javax.inject.Inject;

/* JADX INFO: loaded from: classes21.dex */
public class FeaturedCourseListViewModel extends ViewModel {
    private final Listing<FeaturedCourseListItem> a;
    private final LiveData<PagedList<FeaturedCourseListItem>> b;
    private final LiveData<Resource<Void>> c;
    private final LiveData<Resource<Void>> d;

    @Inject
    public FeaturedCourseListViewModel(TrainingDataSource trainingDataSource) {
        Listing<FeaturedCourseListItem> listingLoadFeaturedCoursesForList = trainingDataSource.loadFeaturedCoursesForList();
        this.a = listingLoadFeaturedCoursesForList;
        this.b = listingLoadFeaturedCoursesForList.getPagedList();
        this.c = listingLoadFeaturedCoursesForList.getNetworkState();
        this.d = listingLoadFeaturedCoursesForList.getRefreshState();
    }

    public LiveData<Resource<Void>> getNetworkState() {
        return this.c;
    }

    public LiveData<PagedList<FeaturedCourseListItem>> getPagedList() {
        return this.b;
    }

    public LiveData<Resource<Void>> getRefreshState() {
        return this.d;
    }

    public void refresh() {
        Runnable refresh = this.a.getRefresh();
        if (refresh != null) {
            refresh.run();
        }
    }

    public void retry() {
        Runnable retry = this.a.getRetry();
        if (retry != null) {
            retry.run();
        }
    }
}
