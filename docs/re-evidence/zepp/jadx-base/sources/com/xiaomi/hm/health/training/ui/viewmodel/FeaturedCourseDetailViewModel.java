package com.xiaomi.hm.health.training.ui.viewmodel;

import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import com.xiaomi.hm.health.training.api.TrainingDataSource;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseDetail;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseDetailItem;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseIntroductionInfo;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseItem;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.entity.SimpleFeaturedCourse;
import com.xiaomi.hm.health.training.api.entity.SkusItem;
import com.xiaomi.hm.health.training.api.entity.Status;
import com.xiaomi.hm.health.training.api.entity.User;
import com.xiaomi.hm.health.training.api.entity.VideoUrl;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Loggers;
import com.xiaomi.hm.health.training.ui.viewmodel.FeaturedCourseDetailViewModel;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;

/* JADX INFO: loaded from: classes21.dex */
public class FeaturedCourseDetailViewModel extends ViewModel {
    private static final String l = "Train-FeaturedCourseDetailViewModel";
    private final MutableLiveData<String> a;
    private final MediatorLiveData<Resource<FeaturedCourseDetail>> b;
    private final LiveData<Resource<List<FeaturedCourseItem>>> c;
    private final MutableLiveData<a> d;
    private final MutableLiveData<a> e;
    private final LiveData<Resource<SimpleFeaturedCourse>> f;
    private final LiveData<Resource<Boolean>> g;
    private final MutableLiveData<String> h;
    private final LiveData<Resource<VideoUrl>> i;
    private final LiveData<Resource<FeaturedCourseIntroductionInfo>> j;
    private final LiveData<User> k;

    public static class a {
        public String a;
        public String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    @Inject
    public FeaturedCourseDetailViewModel(final TrainingDataSource trainingDataSource) {
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.a = mutableLiveData;
        MutableLiveData<a> mutableLiveData2 = new MutableLiveData<>();
        this.d = mutableLiveData2;
        MutableLiveData<a> mutableLiveData3 = new MutableLiveData<>();
        this.e = mutableLiveData3;
        MutableLiveData<String> mutableLiveData4 = new MutableLiveData<>();
        this.h = mutableLiveData4;
        Objects.requireNonNull(trainingDataSource);
        MediatorLiveData<Resource<FeaturedCourseDetail>> mediatorLiveData = (MediatorLiveData) Transformations.switchMap(mutableLiveData, new Function() { // from class: d12
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return trainingDataSource.loadFeaturedCoursesForDetail((String) obj);
            }
        });
        this.b = mediatorLiveData;
        this.c = Transformations.switchMap(mutableLiveData, new Function() { // from class: g12
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return this.a.j(trainingDataSource, (String) obj);
            }
        });
        this.f = Transformations.switchMap(mutableLiveData2, new Function() { // from class: com.xiaomi.hm.health.training.ui.viewmodel.b
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return FeaturedCourseDetailViewModel.k(trainingDataSource, (FeaturedCourseDetailViewModel.a) obj);
            }
        });
        this.g = Transformations.switchMap(mutableLiveData3, new Function() { // from class: com.xiaomi.hm.health.training.ui.viewmodel.a
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return FeaturedCourseDetailViewModel.m(trainingDataSource, (FeaturedCourseDetailViewModel.a) obj);
            }
        });
        this.i = Transformations.switchMap(mutableLiveData4, new Function() { // from class: f12
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return this.a.n(trainingDataSource, (String) obj);
            }
        });
        this.j = Transformations.map(mediatorLiveData, new Function() { // from class: e12
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return this.a.o((Resource) obj);
            }
        });
        this.k = trainingDataSource.loadUser();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object i() {
        return "未能找到试看样片来播放";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ LiveData j(TrainingDataSource trainingDataSource, String str) {
        return trainingDataSource.loadRecommendedCoursesForDetail(Long.valueOf(q(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ LiveData k(TrainingDataSource trainingDataSource, a aVar) {
        return trainingDataSource.joinTrainings(aVar.a, aVar.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ LiveData m(TrainingDataSource trainingDataSource, a aVar) {
        return trainingDataSource.exitTrainings(aVar.a, aVar.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ LiveData n(TrainingDataSource trainingDataSource, String str) {
        String value = this.a.getValue();
        if (value == null || str == null) {
            return null;
        }
        return trainingDataSource.loadFeaturedCoursesVideoUrl(value, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource o(Resource resource) {
        if (resource == null || resource.getData() == null) {
            return null;
        }
        FeaturedCourseIntroductionInfo featuredCourseIntroductionInfo = new FeaturedCourseIntroductionInfo();
        featuredCourseIntroductionInfo.url = ((FeaturedCourseDetail) resource.getData()).externalLink;
        if (getSkusItem() != null) {
            featuredCourseIntroductionInfo.freePeriodStart = getSkusItem().freeRangeStart;
            featuredCourseIntroductionInfo.freePeriodEnd = getSkusItem().freeRangeEnd;
        }
        return Resource.success(featuredCourseIntroductionInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object p(Exception exc) {
        return "parseLong exception->" + exc.getMessage();
    }

    private long q(String str) {
        try {
            return Long.parseLong(str);
        } catch (Exception e) {
            Loggers.getLogger().w(l, new Supplier() { // from class: h12
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return FeaturedCourseDetailViewModel.p(e);
                }
            });
            return 0L;
        }
    }

    public void exitTrainings() {
        Resource<FeaturedCourseDetail> value = this.b.getValue();
        if (value == null || value.getStatus() != Status.SUCCESS || value.getData() == null || value.getData().skus == null || value.getData().skus.size() == 0) {
            return;
        }
        String str = value.getData().skus.get(0).skuId;
        this.e.setValue(new a(this.a.getValue(), str));
    }

    public void findDemoVideoThenLoadUrl() {
        Resource<FeaturedCourseDetail> value = this.b.getValue();
        if (value == null || value.getStatus() != Status.SUCCESS || value.getData() == null || value.getData().videos == null) {
            return;
        }
        for (FeaturedCourseDetailItem featuredCourseDetailItem : value.getData().videos) {
            Boolean bool = featuredCourseDetailItem.isFree;
            if (bool != null && bool.booleanValue()) {
                loadVideoUrl(featuredCourseDetailItem.id);
                return;
            }
        }
        Loggers.getLogger().w(l, new Supplier() { // from class: i12
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return FeaturedCourseDetailViewModel.i();
            }
        });
    }

    @Nullable
    public String getCourseId() {
        return this.a.getValue();
    }

    public LiveData<Resource<FeaturedCourseDetail>> getDetailLiveData() {
        return this.b;
    }

    public LiveData<Resource<Boolean>> getExitTrainingResultLiveData() {
        return this.g;
    }

    public boolean getFreeStatus() {
        Resource<FeaturedCourseDetail> value = this.b.getValue();
        if (value == null || value.getStatus() != Status.SUCCESS || value.getData() == null) {
            return false;
        }
        return value.getData().isFree;
    }

    public LiveData<Resource<FeaturedCourseIntroductionInfo>> getIntroduceInfoResultLiveData() {
        return this.j;
    }

    public LiveData<Resource<SimpleFeaturedCourse>> getJoinTrainingResultLiveData() {
        return this.f;
    }

    public boolean getParticipateStatus() {
        Resource<FeaturedCourseDetail> value = this.b.getValue();
        if (value == null || value.getStatus() != Status.SUCCESS || value.getData() == null) {
            return false;
        }
        return value.getData().isParticipate;
    }

    public boolean getPurchaseStatus() {
        Resource<FeaturedCourseDetail> value = this.b.getValue();
        if (value == null || value.getStatus() != Status.SUCCESS || value.getData() == null) {
            return false;
        }
        return value.getData().isPurchase;
    }

    public LiveData<Resource<List<FeaturedCourseItem>>> getRecommendedCoursesLiveData() {
        return this.c;
    }

    @Nullable
    public String getSkusId() {
        Resource<FeaturedCourseDetail> value = this.b.getValue();
        if (value == null || value.getStatus() != Status.SUCCESS || value.getData() == null) {
            return null;
        }
        return value.getData().skusItem.skuId;
    }

    @Nullable
    public SkusItem getSkusItem() {
        Resource<FeaturedCourseDetail> value = this.b.getValue();
        if (value == null || value.getStatus() != Status.SUCCESS || value.getData() == null) {
            return null;
        }
        return value.getData().skusItem;
    }

    public LiveData<User> getUserLiveData() {
        return this.k;
    }

    @Nullable
    public String getVideoName(@Nullable String str) {
        Resource<FeaturedCourseDetail> value = this.b.getValue();
        if (str != null && value != null && value.getData() != null && value.getData().videos != null) {
            for (FeaturedCourseDetailItem featuredCourseDetailItem : value.getData().videos) {
                if (str.equals(featuredCourseDetailItem.id)) {
                    return featuredCourseDetailItem.name;
                }
            }
        }
        return null;
    }

    public LiveData<Resource<VideoUrl>> getVideoUrlLoadResultLiveData() {
        return this.i;
    }

    public void joinTraining() {
        Resource<FeaturedCourseDetail> value = this.b.getValue();
        if (value == null || value.getStatus() != Status.SUCCESS || value.getData() == null) {
            return;
        }
        String str = value.getData().skus.get(0).skuId;
        String value2 = this.a.getValue();
        if (value2 == null || str == null) {
            return;
        }
        this.d.setValue(new a(value2, str));
    }

    public void loadVideoUrl(String str) {
        this.h.setValue(str);
    }

    public void refresh() {
        MediatorLiveData<Resource<FeaturedCourseDetail>> mediatorLiveData = this.b;
        mediatorLiveData.setValue(mediatorLiveData.getValue());
    }

    public void setCourseId(String str) {
        if (getCourseId() == null || !(getCourseId() == null || getCourseId().equals(str))) {
            this.a.setValue(str);
        }
    }

    public void updateFreeStatus(boolean z) {
        Resource<FeaturedCourseDetail> value = this.b.getValue();
        if (value == null || value.getStatus() != Status.SUCCESS || value.getData() == null) {
            return;
        }
        FeaturedCourseDetail data = value.getData();
        if (data.isFree != z) {
            data.isFree = z;
        }
    }

    public void updateParticipateStatus(boolean z) {
        Resource<FeaturedCourseDetail> value = this.b.getValue();
        if (value == null || value.getStatus() != Status.SUCCESS || value.getData() == null) {
            return;
        }
        FeaturedCourseDetail data = value.getData();
        if (data.isParticipate != z) {
            data.isParticipate = z;
        }
    }

    public void updatePurchaseStatus(boolean z) {
        Resource<FeaturedCourseDetail> value = this.b.getValue();
        if (value == null || value.getStatus() != Status.SUCCESS || value.getData() == null) {
            return;
        }
        FeaturedCourseDetail data = value.getData();
        if (data.isPurchase != z) {
            data.isPurchase = z;
        }
    }
}
