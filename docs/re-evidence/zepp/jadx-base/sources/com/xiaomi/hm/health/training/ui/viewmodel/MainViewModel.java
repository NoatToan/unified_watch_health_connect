package com.xiaomi.hm.health.training.ui.viewmodel;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.ViewModel;
import com.xiaomi.hm.health.training.api.TrainingDataSource;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.entity.SimpleFeaturedCourse;
import java.util.List;
import javax.inject.Inject;

/* JADX INFO: loaded from: classes21.dex */
public class MainViewModel extends ViewModel {
    private final LiveData<Resource<List<SimpleFeaturedCourse>>> a;

    @Inject
    public MainViewModel(TrainingDataSource trainingDataSource) {
        this.a = trainingDataSource.loadFeaturedCoursesForMain();
    }

    public LiveData<Resource<List<SimpleFeaturedCourse>>> getFeaturedCoursesLiveData() {
        return this.a;
    }
}
