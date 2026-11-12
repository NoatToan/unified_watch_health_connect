package com.xiaomi.hm.health.training.ui.viewmodel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import com.xiaomi.hm.health.training.api.TrainingDataSource;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseItem;
import com.xiaomi.hm.health.training.api.entity.Resource;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;

/* JADX INFO: loaded from: classes21.dex */
public class FeaturedCoursePartnerViewModel extends ViewModel {
    private MutableLiveData<String> a;
    private MediatorLiveData<Resource<List<FeaturedCourseItem>>> b;

    @Inject
    public FeaturedCoursePartnerViewModel(final TrainingDataSource trainingDataSource) {
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.a = mutableLiveData;
        Objects.requireNonNull(trainingDataSource);
        this.b = (MediatorLiveData) Transformations.switchMap(mutableLiveData, new Function() { // from class: j22
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return trainingDataSource.loadFeaturedCoursesForPartner((String) obj);
            }
        });
    }

    @Nullable
    public String getPartnerCourseId() {
        return this.a.getValue();
    }

    public LiveData<Resource<List<FeaturedCourseItem>>> getPartnerCourses() {
        return this.b;
    }

    public void setPartnerCourseId(@NonNull String str) {
        if (getPartnerCourseId() == null || !(getPartnerCourseId() == null || getPartnerCourseId().equals(str))) {
            this.a.setValue(str);
        }
    }
}
