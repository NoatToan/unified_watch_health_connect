package com.xiaomi.hm.health.training.ui.viewmodel;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.paging.PagedList;
import com.xiaomi.hm.health.training.api.TrainingDataSource;
import com.xiaomi.hm.health.training.api.entity.Listing;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.entity.TrainingKnowledge;
import javax.inject.Inject;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingKnowledgeListViewModel extends ViewModel {
    private final Listing<TrainingKnowledge> a;
    private final LiveData<PagedList<TrainingKnowledge>> b;
    private final LiveData<Resource<Void>> c;
    private final LiveData<Resource<Void>> d;

    @Inject
    public TrainingKnowledgeListViewModel(TrainingDataSource trainingDataSource) {
        Listing<TrainingKnowledge> listingLoadTrainingKnowledge = trainingDataSource.loadTrainingKnowledge();
        this.a = listingLoadTrainingKnowledge;
        this.b = listingLoadTrainingKnowledge.getPagedList();
        this.c = listingLoadTrainingKnowledge.getNetworkState();
        this.d = listingLoadTrainingKnowledge.getRefreshState();
    }

    public LiveData<Resource<Void>> getNetworkState() {
        return this.c;
    }

    public LiveData<PagedList<TrainingKnowledge>> getPagedList() {
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
