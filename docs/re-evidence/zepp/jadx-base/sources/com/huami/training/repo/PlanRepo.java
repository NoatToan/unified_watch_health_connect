package com.huami.training.repo;

import androidx.annotation.MainThread;
import androidx.p008lifecycle.LiveData;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.api.LoadOnActiveLiveData;
import com.huami.training.api.TrainingWebApi;
import com.huami.training.api.pojo.PlanTrainingBean;
import com.huami.training.api.pojo.TrainingPlanBean;
import com.huami.training.converter.PoToVoExKt;
import com.huami.training.converter.WebBeanToPoExKt;
import com.huami.training.db.TrainingDb;
import com.huami.training.db.dao.PlanDao;
import com.huami.training.db.po.TrainingPlanWithTrainings;
import com.huami.training.helper.AppExecutors;
import com.huami.training.repo.PlanRepo;
import com.huami.training.vo.ApiResponse;
import com.huami.training.vo.Resource;
import com.huami.training.vo.TrainingPlanVo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0007R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/training/repo/PlanRepo;", "", "Landroidx/lifecycle/LiveData;", "Lcom/huami/training/vo/Resource;", "Lcom/huami/training/vo/TrainingPlanVo;", "loadTrainingPlan", "Lcom/huami/training/helper/AppExecutors;", "a", "Lcom/huami/training/helper/AppExecutors;", "appExecutors", "Lcom/huami/training/db/TrainingDb;", "b", "Lcom/huami/training/db/TrainingDb;", UserDataStore.DATE_OF_BIRTH, "Lcom/huami/training/api/TrainingWebApi;", "c", "Lcom/huami/training/api/TrainingWebApi;", "webApi", "Lcom/huami/training/db/dao/PlanDao;", GoogleApiAvailabilityLight.a, "Lcom/huami/training/db/dao/PlanDao;", "planDao", "<init>", "(Lcom/huami/training/helper/AppExecutors;Lcom/huami/training/db/TrainingDb;Lcom/huami/training/api/TrainingWebApi;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PlanRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final TrainingDb db;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final TrainingWebApi webApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final PlanDao planDao;

    /* JADX INFO: renamed from: com.huami.training.repo.PlanRepo$loadTrainingPlan$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0014J\b\u0010\b\u001a\u00020\u0006H\u0014J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0014J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0014J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000e0\fH\u0014J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0012"}, d2 = {"com/huami/training/repo/PlanRepo$loadTrainingPlan$1", "Lcom/huami/training/repo/NetworkBoundResource;", "Lcom/huami/training/db/po/TrainingPlanWithTrainings;", "Lcom/huami/training/api/pojo/TrainingPlanBean;", "Lcom/huami/training/vo/TrainingPlanVo;", "result", "", "saveCallResult", "onFetchEmpty", "data", "", "shouldFetch", "Landroidx/lifecycle/LiveData;", "loadFromDb", "Lcom/huami/training/vo/ApiResponse;", "createCall", "po", "poToVo", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass1 extends NetworkBoundResource<TrainingPlanWithTrainings, TrainingPlanBean, TrainingPlanVo> {

        /* JADX INFO: renamed from: com.huami.training.repo.PlanRepo$loadTrainingPlan$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/training/vo/ApiResponse;", "Lcom/huami/training/api/pojo/TrainingPlanBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<ApiResponse<TrainingPlanBean>> {
            public final /* synthetic */ PlanRepo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PlanRepo planRepo) {
                super(0);
                this.a = planRepo;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ApiResponse<TrainingPlanBean> invoke() {
                return this.a.webApi.loadTrainingPlan(false);
            }
        }

        public AnonymousClass1(AppExecutors appExecutors) {
            super(appExecutors);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void F(PlanRepo planRepo) {
            planRepo.planDao.clearPlan();
            planRepo.planDao.clearPlanTrainings();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void G(PlanRepo planRepo, TrainingPlanBean trainingPlanBean) {
            planRepo.planDao.clearPlan();
            planRepo.planDao.clearPlanTrainings();
            planRepo.planDao.insertPlan(WebBeanToPoExKt.toTrainingPlanPo(trainingPlanBean));
            List<PlanTrainingBean> dayTrainingItems = trainingPlanBean.getDayTrainingItems();
            if (dayTrainingItems == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(dayTrainingItems, 10));
            Iterator<T> it2 = dayTrainingItems.iterator();
            while (it2.hasNext()) {
                arrayList.add(WebBeanToPoExKt.toPlanTrainingPo((PlanTrainingBean) it2.next(), trainingPlanBean.getPlanId()));
            }
            planRepo.planDao.insertPlanTrainings(arrayList);
        }

        @Override // com.huami.training.repo.NetworkBoundResource
        @NotNull
        public LiveData<ApiResponse<TrainingPlanBean>> createCall() {
            return LoadOnActiveLiveData.INSTANCE.create(PlanRepo.this.appExecutors.getNetworkIO(), new a(PlanRepo.this));
        }

        @Override // com.huami.training.repo.NetworkBoundResource
        @NotNull
        public LiveData<TrainingPlanWithTrainings> loadFromDb() {
            return PlanRepo.this.planDao.queryPlanWithTrainings();
        }

        @Override // com.huami.training.repo.NetworkBoundResource
        public void onFetchEmpty() {
            TrainingDb trainingDb = PlanRepo.this.db;
            final PlanRepo planRepo = PlanRepo.this;
            trainingDb.runInTransaction(new Runnable() { // from class: i06
                @Override // java.lang.Runnable
                public final void run() {
                    PlanRepo.AnonymousClass1.F(planRepo);
                }
            });
        }

        @Override // com.huami.training.repo.NetworkBoundResource
        public boolean shouldFetch(@Nullable TrainingPlanWithTrainings data) {
            return true;
        }

        @Override // com.huami.training.repo.NetworkBoundResource
        @Nullable
        public TrainingPlanVo poToVo(@Nullable TrainingPlanWithTrainings po) {
            if (po == null) {
                return null;
            }
            return PoToVoExKt.toTrainingPlanVo(po);
        }

        @Override // com.huami.training.repo.NetworkBoundResource
        public void saveCallResult(@NotNull final TrainingPlanBean result) {
            TrainingDb trainingDb = PlanRepo.this.db;
            final PlanRepo planRepo = PlanRepo.this;
            trainingDb.runInTransaction(new Runnable() { // from class: j06
                @Override // java.lang.Runnable
                public final void run() {
                    PlanRepo.AnonymousClass1.G(planRepo, result);
                }
            });
        }
    }

    public PlanRepo(@NotNull AppExecutors appExecutors, @NotNull TrainingDb trainingDb, @NotNull TrainingWebApi trainingWebApi) {
        this.appExecutors = appExecutors;
        this.db = trainingDb;
        this.webApi = trainingWebApi;
        this.planDao = trainingDb.planDao();
    }

    @MainThread
    @NotNull
    public final LiveData<Resource<TrainingPlanVo>> loadTrainingPlan() {
        return new AnonymousClass1(this.appExecutors).asLiveData();
    }
}
