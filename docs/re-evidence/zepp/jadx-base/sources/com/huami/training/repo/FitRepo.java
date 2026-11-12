package com.huami.training.repo;

import androidx.p008lifecycle.LiveData;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.api.LoadOnActiveLiveData;
import com.huami.training.api.TrainingWebApi;
import com.huami.training.api.pojo.Items;
import com.huami.training.api.pojo.JoinedTrainingBean;
import com.huami.training.converter.PoToVoExKt;
import com.huami.training.db.TrainingDb;
import com.huami.training.db.TrainingDbExKt;
import com.huami.training.db.dao.ParticipationDao;
import com.huami.training.db.dao.TrainingDao;
import com.huami.training.db.po.JoinedTraining;
import com.huami.training.helper.AppExecutors;
import com.huami.training.vo.ApiResponse;
import com.huami.training.vo.JoinedCourseVo;
import com.huami.training.vo.Resource;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002J\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u0002R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/training/repo/FitRepo;", "", "Landroidx/lifecycle/LiveData;", "Lcom/huami/training/vo/Resource;", "", "Lcom/huami/training/vo/JoinedCourseVo;", "loadLatestTwoJoinedTrainings", "Lcom/huami/training/db/po/JoinedTraining;", "loadAllJoinedTrainings", "Lcom/huami/training/helper/AppExecutors;", "a", "Lcom/huami/training/helper/AppExecutors;", "appExecutors", "Lcom/huami/training/db/TrainingDb;", "b", "Lcom/huami/training/db/TrainingDb;", UserDataStore.DATE_OF_BIRTH, "Lcom/huami/training/api/TrainingWebApi;", "c", "Lcom/huami/training/api/TrainingWebApi;", "webApi", "Lcom/huami/training/db/dao/TrainingDao;", GoogleApiAvailabilityLight.a, "Lcom/huami/training/db/dao/TrainingDao;", "trainingDao", "Lcom/huami/training/db/dao/ParticipationDao;", "e", "Lcom/huami/training/db/dao/ParticipationDao;", "participationDao", "<init>", "(Lcom/huami/training/helper/AppExecutors;Lcom/huami/training/db/TrainingDb;Lcom/huami/training/api/TrainingWebApi;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class FitRepo {

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
    private final TrainingDao trainingDao;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final ParticipationDao participationDao;

    public FitRepo(@NotNull AppExecutors appExecutors, @NotNull TrainingDb trainingDb, @NotNull TrainingWebApi trainingWebApi) {
        this.appExecutors = appExecutors;
        this.db = trainingDb;
        this.webApi = trainingWebApi;
        this.trainingDao = trainingDb.trainingDao();
        this.participationDao = trainingDb.participationDao();
    }

    @NotNull
    public final LiveData<Resource<List<JoinedTraining>>> loadAllJoinedTrainings() {
        return new NetworkBoundResource<List<? extends JoinedTraining>, Items<JoinedTrainingBean>, List<? extends JoinedTraining>>(this.appExecutors) { // from class: com.huami.training.repo.FitRepo.loadAllJoinedTrainings.1

            /* JADX INFO: renamed from: com.huami.training.repo.FitRepo$loadAllJoinedTrainings$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/training/vo/ApiResponse;", "Lcom/huami/training/api/pojo/Items;", "Lcom/huami/training/api/pojo/JoinedTrainingBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<ApiResponse<Items<JoinedTrainingBean>>> {
                public final /* synthetic */ FitRepo a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(FitRepo fitRepo) {
                    super(0);
                    this.a = fitRepo;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ApiResponse<Items<JoinedTrainingBean>> invoke() {
                    return TrainingWebApi.DefaultImpls.loadJoinedTrainings$default(this.a.webApi, null, null, null, 7, null);
                }
            }

            @Override // com.huami.training.repo.NetworkBoundResource
            @NotNull
            public LiveData<ApiResponse<Items<JoinedTrainingBean>>> createCall() {
                return LoadOnActiveLiveData.INSTANCE.create(FitRepo.this.appExecutors.getNetworkIO(), new a(FitRepo.this));
            }

            @Override // com.huami.training.repo.NetworkBoundResource
            @NotNull
            public LiveData<List<? extends JoinedTraining>> loadFromDb() {
                return FitRepo.this.participationDao.queryAllJoinedTrainings();
            }

            @Override // com.huami.training.repo.NetworkBoundResource
            public /* bridge */ /* synthetic */ List<? extends JoinedTraining> poToVo(List<? extends JoinedTraining> list) {
                return poToVo2((List<JoinedTraining>) list);
            }

            @Nullable
            /* JADX INFO: renamed from: poToVo, reason: avoid collision after fix types in other method */
            public List<JoinedTraining> poToVo2(@Nullable List<JoinedTraining> po) {
                return po;
            }

            @Override // com.huami.training.repo.NetworkBoundResource
            public /* bridge */ /* synthetic */ boolean shouldFetch(List<? extends JoinedTraining> list) {
                return shouldFetch2((List<JoinedTraining>) list);
            }

            /* JADX INFO: renamed from: shouldFetch, reason: avoid collision after fix types in other method */
            public boolean shouldFetch2(@Nullable List<JoinedTraining> data) {
                return true;
            }

            @Override // com.huami.training.repo.NetworkBoundResource
            public void saveCallResult(@NotNull Items<JoinedTrainingBean> result) {
                TrainingDbExKt.saveAllJoinedTrainings(FitRepo.this.db, result.getItems());
            }
        }.asLiveData();
    }

    @NotNull
    public final LiveData<Resource<List<JoinedCourseVo>>> loadLatestTwoJoinedTrainings() {
        return new NetworkBoundResource<List<? extends JoinedTraining>, Items<JoinedTrainingBean>, List<? extends JoinedCourseVo>>(this.appExecutors) { // from class: com.huami.training.repo.FitRepo.loadLatestTwoJoinedTrainings.1

            /* JADX INFO: renamed from: com.huami.training.repo.FitRepo$loadLatestTwoJoinedTrainings$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/training/vo/ApiResponse;", "Lcom/huami/training/api/pojo/Items;", "Lcom/huami/training/api/pojo/JoinedTrainingBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<ApiResponse<Items<JoinedTrainingBean>>> {
                public final /* synthetic */ FitRepo a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(FitRepo fitRepo) {
                    super(0);
                    this.a = fitRepo;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ApiResponse<Items<JoinedTrainingBean>> invoke() {
                    return TrainingWebApi.DefaultImpls.loadJoinedTrainings$default(this.a.webApi, null, null, null, 7, null);
                }
            }

            @Override // com.huami.training.repo.NetworkBoundResource
            @NotNull
            public LiveData<ApiResponse<Items<JoinedTrainingBean>>> createCall() {
                return LoadOnActiveLiveData.INSTANCE.create(FitRepo.this.appExecutors.getNetworkIO(), new a(FitRepo.this));
            }

            @Override // com.huami.training.repo.NetworkBoundResource
            @NotNull
            public LiveData<List<? extends JoinedTraining>> loadFromDb() {
                return FitRepo.this.participationDao.queryLatestTwoJoinedTrainings();
            }

            @Override // com.huami.training.repo.NetworkBoundResource
            public /* bridge */ /* synthetic */ List<? extends JoinedCourseVo> poToVo(List<? extends JoinedTraining> list) {
                return poToVo2((List<JoinedTraining>) list);
            }

            @Override // com.huami.training.repo.NetworkBoundResource
            public /* bridge */ /* synthetic */ boolean shouldFetch(List<? extends JoinedTraining> list) {
                return shouldFetch2((List<JoinedTraining>) list);
            }

            /* JADX INFO: renamed from: shouldFetch, reason: avoid collision after fix types in other method */
            public boolean shouldFetch2(@Nullable List<JoinedTraining> data) {
                return true;
            }

            @Nullable
            /* JADX INFO: renamed from: poToVo, reason: avoid collision after fix types in other method */
            public List<JoinedCourseVo> poToVo2(@Nullable List<JoinedTraining> po) {
                if (po == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(po, 10));
                Iterator<T> it2 = po.iterator();
                while (it2.hasNext()) {
                    arrayList.add(PoToVoExKt.toJoinedCourseVo((JoinedTraining) it2.next()));
                }
                return arrayList;
            }

            @Override // com.huami.training.repo.NetworkBoundResource
            public void saveCallResult(@NotNull Items<JoinedTrainingBean> result) {
                TrainingDbExKt.saveAllJoinedTrainings(FitRepo.this.db, result.getItems());
            }
        }.asLiveData();
    }
}
