package com.xiaomi.hm.health.training.ui.viewmodel;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import com.xiaomi.hm.health.training.api.TrainingDataSource;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseItem;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.ui.viewmodel.StatusTrainingViewModel;
import java.util.List;
import javax.inject.Inject;

/* JADX INFO: loaded from: classes21.dex */
public class StatusTrainingViewModel extends ViewModel {
    private final LiveData<Resource<List<FeaturedCourseItem>>> a;
    private final MutableLiveData<Void> b;

    @Inject
    public StatusTrainingViewModel(final TrainingDataSource trainingDataSource) {
        MutableLiveData<Void> mutableLiveData = new MutableLiveData<>();
        this.b = mutableLiveData;
        this.a = Transformations.switchMap(mutableLiveData, new Function() { // from class: bg7
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return StatusTrainingViewModel.b(trainingDataSource, (Void) obj);
            }
        });
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ LiveData b(TrainingDataSource trainingDataSource, Void r1) {
        return trainingDataSource.loadFeaturedCoursesForStatus();
    }

    public LiveData<Resource<List<FeaturedCourseItem>>> getFeaturedCourseLiveData() {
        return this.a;
    }

    public void loadData() {
        this.b.setValue(null);
    }
}
