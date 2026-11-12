package com.huami.training.repo;

import androidx.annotation.MainThread;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.api.TrainingWebApi;
import com.huami.training.api.pojo.Items;
import com.huami.training.api.pojo.JoinedTrainingBean;
import com.huami.training.converter.PoToVoExKt;
import com.huami.training.converter.WebBeanToPoExKt;
import com.huami.training.db.TrainingDb;
import com.huami.training.db.dao.ParticipationDao;
import com.huami.training.db.dao.TrainingDao;
import com.huami.training.db.po.JoinedTraining;
import com.huami.training.db.po.Participation;
import com.huami.training.db.po.Training;
import com.huami.training.dto.Trainer;
import com.huami.training.helper.AppExecutors;
import com.huami.training.paging.PagingKeyHelper;
import com.huami.training.repo.JoinedCourseRepo;
import com.huami.training.vo.ApiEmptyResponse;
import com.huami.training.vo.ApiErrorResponse;
import com.huami.training.vo.ApiResponse;
import com.huami.training.vo.ApiSuccessResponse;
import com.huami.training.vo.JoinedCourseVo;
import com.huami.training.vo.Listing;
import com.huami.training.vo.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b)\u0010*J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\u0003J\b\u0010\n\u001a\u00020\u0005H\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'¨\u0006+"}, d2 = {"Lcom/huami/training/repo/JoinedCourseRepo;", "", "", "Lcom/huami/training/api/pojo/JoinedTrainingBean;", "body", "", "g", "Landroidx/lifecycle/LiveData;", "Lcom/huami/training/vo/Resource;", "l", "o", "Lcom/huami/training/vo/Listing;", "Lcom/huami/training/vo/JoinedCourseVo;", "loadJoinedCourses", "Lcom/huami/training/helper/AppExecutors;", "a", "Lcom/huami/training/helper/AppExecutors;", "appExecutors", "Lcom/huami/training/db/TrainingDb;", "b", "Lcom/huami/training/db/TrainingDb;", "trainingDb", "Lcom/huami/training/api/TrainingWebApi;", "c", "Lcom/huami/training/api/TrainingWebApi;", "trainingWebApi", "Lcom/huami/training/dto/Trainer;", GoogleApiAvailabilityLight.a, "Lcom/huami/training/dto/Trainer;", "trainer", "Lcom/huami/training/paging/PagingKeyHelper;", "e", "Lcom/huami/training/paging/PagingKeyHelper;", "pagingKeyHelper", "Lcom/huami/training/db/dao/TrainingDao;", "f", "Lcom/huami/training/db/dao/TrainingDao;", "trainingDao", "Lcom/huami/training/db/dao/ParticipationDao;", "Lcom/huami/training/db/dao/ParticipationDao;", "participationDao", "<init>", "(Lcom/huami/training/helper/AppExecutors;Lcom/huami/training/db/TrainingDb;Lcom/huami/training/api/TrainingWebApi;Lcom/huami/training/dto/Trainer;Lcom/huami/training/paging/PagingKeyHelper;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class JoinedCourseRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final TrainingDb trainingDb;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final TrainingWebApi trainingWebApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Trainer trainer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final PagingKeyHelper pagingKeyHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final TrainingDao trainingDao;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final ParticipationDao participationDao;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ MutableLiveData<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableLiveData<Unit> mutableLiveData) {
            super(0);
            this.a = mutableLiveData;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setValue(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ JoinedCourseBoundaryCallback a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JoinedCourseBoundaryCallback joinedCourseBoundaryCallback) {
            super(0);
            this.a = joinedCourseBoundaryCallback;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.getHelper().retryAllFailed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function1<List<? extends JoinedTrainingBean>, Unit> {
        public c(JoinedCourseRepo joinedCourseRepo) {
            super(1, joinedCourseRepo, JoinedCourseRepo.class, "insertResultIntoDb", "insertResultIntoDb(Ljava/util/List;)V", 0);
        }

        public final void a(@Nullable List<JoinedTrainingBean> list) {
            ((JoinedCourseRepo) this.receiver).g(list);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends JoinedTrainingBean> list) {
            a(list);
            return Unit.INSTANCE;
        }
    }

    public JoinedCourseRepo(@NotNull AppExecutors appExecutors, @NotNull TrainingDb trainingDb, @NotNull TrainingWebApi trainingWebApi, @NotNull Trainer trainer, @NotNull PagingKeyHelper pagingKeyHelper) {
        this.appExecutors = appExecutors;
        this.trainingDb = trainingDb;
        this.trainingWebApi = trainingWebApi;
        this.trainer = trainer;
        this.pagingKeyHelper = pagingKeyHelper;
        this.trainingDao = trainingDb.trainingDao();
        this.participationDao = trainingDb.participationDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(final List<JoinedTrainingBean> body) {
        if (body == null) {
            return;
        }
        this.appExecutors.getDiskIO().execute(new Runnable() { // from class: ej4
            @Override // java.lang.Runnable
            public final void run() {
                JoinedCourseRepo.h(this.a, body);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final JoinedCourseRepo joinedCourseRepo, final List list) {
        joinedCourseRepo.trainingDb.runInTransaction(new Runnable() { // from class: fj4
            @Override // java.lang.Runnable
            public final void run() {
                JoinedCourseRepo.i(this.a, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(JoinedCourseRepo joinedCourseRepo, List list) {
        TrainingDao trainingDao = joinedCourseRepo.trainingDao;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Training trainingPo = WebBeanToPoExKt.toTrainingPo((JoinedTrainingBean) it2.next());
            if (trainingPo != null) {
                arrayList.add(trainingPo);
            }
        }
        trainingDao.insertOrUpdateTrainings(arrayList);
        ParticipationDao participationDao = joinedCourseRepo.participationDao;
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Participation participationPo = WebBeanToPoExKt.toParticipationPo((JoinedTrainingBean) it3.next());
            if (participationPo != null) {
                arrayList2.add(participationPo);
            }
        }
        participationDao.insertOrUpdateParticipations(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData j(JoinedCourseRepo joinedCourseRepo, Unit unit) {
        return joinedCourseRepo.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JoinedCourseVo k(JoinedTraining joinedTraining) {
        return PoToVoExKt.toJoinedCourseVo(joinedTraining);
    }

    @MainThread
    private final LiveData<Resource<Unit>> l() {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(Resource.INSTANCE.loading(null));
        o();
        this.appExecutors.getNetworkIO().execute(new Runnable() { // from class: dj4
            @Override // java.lang.Runnable
            public final void run() {
                JoinedCourseRepo.m(this.a, mutableLiveData);
            }
        });
        return mutableLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(final JoinedCourseRepo joinedCourseRepo, final MutableLiveData mutableLiveData) {
        final ApiResponse apiResponseLoadJoinedTrainings$default = TrainingWebApi.DefaultImpls.loadJoinedTrainings$default(joinedCourseRepo.trainingWebApi, joinedCourseRepo.trainer.isMale().invoke(), null, 20, 2, null);
        joinedCourseRepo.appExecutors.getMainThread().execute(new Runnable() { // from class: gj4
            @Override // java.lang.Runnable
            public final void run() {
                JoinedCourseRepo.n(apiResponseLoadJoinedTrainings$default, joinedCourseRepo, mutableLiveData);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(ApiResponse apiResponse, JoinedCourseRepo joinedCourseRepo, MutableLiveData mutableLiveData) {
        if (apiResponse instanceof ApiSuccessResponse) {
            ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) apiResponse;
            joinedCourseRepo.pagingKeyHelper.setPagingKey(((Items) apiSuccessResponse.getBody()).getNext());
            joinedCourseRepo.g(((Items) apiSuccessResponse.getBody()).getItems());
            mutableLiveData.setValue(Resource.INSTANCE.success(null));
            return;
        }
        if (apiResponse instanceof ApiEmptyResponse) {
            mutableLiveData.setValue(Resource.INSTANCE.success(null));
        } else if (apiResponse instanceof ApiErrorResponse) {
            mutableLiveData.setValue(Resource.INSTANCE.error(((ApiErrorResponse) apiResponse).getErrorMessage(), null));
        }
    }

    private final void o() {
        this.pagingKeyHelper.resetPagingKey();
    }

    @MainThread
    @NotNull
    public final Listing<JoinedCourseVo> loadJoinedCourses() {
        JoinedCourseBoundaryCallback joinedCourseBoundaryCallback = new JoinedCourseBoundaryCallback(this.trainingWebApi, this.trainer, new c(this), this.appExecutors, this.pagingKeyHelper);
        MutableLiveData mutableLiveData = new MutableLiveData();
        return new Listing<>(new LivePagedListBuilder(this.participationDao.queryJoinedTrainingsForPaging().map(new Function() { // from class: cj4
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return JoinedCourseRepo.k((JoinedTraining) obj);
            }
        }), new PagedList.Config.Builder().setEnablePlaceholders(true).setPageSize(20).setInitialLoadSizeHint(20).setPrefetchDistance(0).build()).setBoundaryCallback(joinedCourseBoundaryCallback).setFetchExecutor(this.appExecutors.getDiskIO()).build(), joinedCourseBoundaryCallback.getNetworkState(), Transformations.switchMap(mutableLiveData, new Function() { // from class: bj4
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return JoinedCourseRepo.j(this.a, (Unit) obj);
            }
        }), new a(mutableLiveData), new b(joinedCourseBoundaryCallback));
    }
}
