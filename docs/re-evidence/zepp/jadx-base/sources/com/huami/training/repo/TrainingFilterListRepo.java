package com.huami.training.repo;

import androidx.annotation.MainThread;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.api.TrainingWebApi;
import com.huami.training.api.pojo.Items;
import com.huami.training.api.pojo.TrainingBean;
import com.huami.training.converter.PoToVoExKt;
import com.huami.training.converter.WebBeanToPoExKt;
import com.huami.training.db.TrainingDb;
import com.huami.training.db.dao.FilterDao;
import com.huami.training.db.dao.TrainingDao;
import com.huami.training.db.po.FilterMode;
import com.huami.training.db.po.FilterTraining;
import com.huami.training.db.po.Training;
import com.huami.training.dto.Trainer;
import com.huami.training.helper.AppExecutors;
import com.huami.training.paging.PagingKeyHelper;
import com.huami.training.repo.TrainingFilterListRepo;
import com.huami.training.vo.ApiEmptyResponse;
import com.huami.training.vo.ApiErrorResponse;
import com.huami.training.vo.ApiResponse;
import com.huami.training.vo.ApiSuccessResponse;
import com.huami.training.vo.FilterInfo;
import com.huami.training.vo.FilterModeVo;
import com.huami.training.vo.Listing;
import com.huami.training.vo.Resource;
import com.huami.training.vo.TrainingVo;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"¢\u0006\u0004\b3\u00104J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\u0003J\b\u0010\n\u001a\u00020\u0005H\u0002J\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00020\b0\u0007J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\rR\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/huami/training/repo/TrainingFilterListRepo;", "", "", "Lcom/huami/training/api/pojo/TrainingBean;", "body", "", "h", "Landroidx/lifecycle/LiveData;", "Lcom/huami/training/vo/Resource;", "m", DTransferConstants.SEARCH_KEY, "Lcom/huami/training/vo/FilterModeVo;", "loadFilterMode", "Lcom/huami/training/vo/FilterInfo;", "filterInfo", "Lcom/huami/training/vo/Listing;", "Lcom/huami/training/vo/TrainingVo;", "loadTrainingFilterCourses", "Lcom/huami/training/helper/AppExecutors;", "a", "Lcom/huami/training/helper/AppExecutors;", "appExecutors", "Lcom/huami/training/db/TrainingDb;", "b", "Lcom/huami/training/db/TrainingDb;", UserDataStore.DATE_OF_BIRTH, "Lcom/huami/training/api/TrainingWebApi;", "c", "Lcom/huami/training/api/TrainingWebApi;", "webApi", "Lcom/huami/training/dto/Trainer;", GoogleApiAvailabilityLight.a, "Lcom/huami/training/dto/Trainer;", "trainer", "Lcom/huami/training/paging/PagingKeyHelper;", "e", "Lcom/huami/training/paging/PagingKeyHelper;", "pagingKeyHelper", "Lcom/huami/training/db/dao/TrainingDao;", "f", "Lcom/huami/training/db/dao/TrainingDao;", "trainingDao", "Lcom/huami/training/db/dao/FilterDao;", "g", "Lcom/huami/training/db/dao/FilterDao;", "filterDao", "Lcom/huami/training/repo/TrainingFilterBoundaryCallback;", "Lcom/huami/training/repo/TrainingFilterBoundaryCallback;", "boundaryCallback", "i", "Lcom/huami/training/vo/FilterInfo;", "<init>", "(Lcom/huami/training/helper/AppExecutors;Lcom/huami/training/db/TrainingDb;Lcom/huami/training/api/TrainingWebApi;Lcom/huami/training/dto/Trainer;Lcom/huami/training/paging/PagingKeyHelper;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class TrainingFilterListRepo {

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
    private final Trainer trainer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final PagingKeyHelper pagingKeyHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final TrainingDao trainingDao;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final FilterDao filterDao;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private TrainingFilterBoundaryCallback boundaryCallback;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private FilterInfo filterInfo;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<List<? extends TrainingBean>, Unit> {
        public a(TrainingFilterListRepo trainingFilterListRepo) {
            super(1, trainingFilterListRepo, TrainingFilterListRepo.class, "insertTrainingFilterResultIntoDb", "insertTrainingFilterResultIntoDb(Ljava/util/List;)V", 0);
        }

        public final void a(@Nullable List<TrainingBean> list) {
            ((TrainingFilterListRepo) this.receiver).h(list);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TrainingBean> list) {
            a(list);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ MutableLiveData<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MutableLiveData<Unit> mutableLiveData) {
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
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            TrainingFilterBoundaryCallback trainingFilterBoundaryCallback = TrainingFilterListRepo.this.boundaryCallback;
            Objects.requireNonNull(trainingFilterBoundaryCallback);
            trainingFilterBoundaryCallback.getHelper().retryAllFailed();
        }
    }

    public TrainingFilterListRepo(@NotNull AppExecutors appExecutors, @NotNull TrainingDb trainingDb, @NotNull TrainingWebApi trainingWebApi, @NotNull Trainer trainer, @NotNull PagingKeyHelper pagingKeyHelper) {
        this.appExecutors = appExecutors;
        this.db = trainingDb;
        this.webApi = trainingWebApi;
        this.trainer = trainer;
        this.pagingKeyHelper = pagingKeyHelper;
        this.trainingDao = trainingDb.trainingDao();
        this.filterDao = trainingDb.filterDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(final List<TrainingBean> body) {
        if (body == null) {
            return;
        }
        this.db.runInTransaction(new Runnable() { // from class: pv7
            @Override // java.lang.Runnable
            public final void run() {
                TrainingFilterListRepo.i(this.a, body);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(TrainingFilterListRepo trainingFilterListRepo, List list) {
        TrainingDao trainingDao = trainingFilterListRepo.trainingDao;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Training trainingPo = WebBeanToPoExKt.toTrainingPo((TrainingBean) it2.next());
            if (trainingPo != null) {
                arrayList.add(trainingPo);
            }
        }
        trainingDao.insertOrUpdateTrainings(arrayList);
        FilterDao filterDao = trainingFilterListRepo.filterDao;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            TrainingBean trainingBean = (TrainingBean) it3.next();
            FilterInfo filterInfo = trainingFilterListRepo.filterInfo;
            Objects.requireNonNull(filterInfo);
            String filterMode = filterInfo.getFilterMode();
            FilterInfo filterInfo2 = trainingFilterListRepo.filterInfo;
            Objects.requireNonNull(filterInfo2);
            arrayList2.add(new FilterTraining(filterMode, filterInfo2.getOrder(), trainingBean.getId()));
        }
        filterDao.insertFilterTrainings(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resource j(List list) {
        Resource.Companion companion = Resource.INSTANCE;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(PoToVoExKt.toFilterModeVo((FilterMode) it2.next()));
        }
        return companion.success(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData k(TrainingFilterListRepo trainingFilterListRepo, Unit unit) {
        return trainingFilterListRepo.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrainingVo l(boolean z, Training training) {
        return PoToVoExKt.toTrainingVo(training, z);
    }

    @MainThread
    private final LiveData<Resource<Unit>> m() {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(Resource.INSTANCE.loading(null));
        q();
        this.appExecutors.getNetworkIO().execute(new Runnable() { // from class: mv7
            @Override // java.lang.Runnable
            public final void run() {
                TrainingFilterListRepo.n(this.a, mutableLiveData);
            }
        });
        return mutableLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final TrainingFilterListRepo trainingFilterListRepo, MutableLiveData mutableLiveData) {
        TrainingWebApi trainingWebApi = trainingFilterListRepo.webApi;
        Boolean boolInvoke = trainingFilterListRepo.trainer.isMale().invoke();
        FilterInfo filterInfo = trainingFilterListRepo.filterInfo;
        Objects.requireNonNull(filterInfo);
        String filterMode = filterInfo.getFilterMode();
        FilterInfo filterInfo2 = trainingFilterListRepo.filterInfo;
        Objects.requireNonNull(filterInfo2);
        final ApiResponse apiResponseLoadTrainings$default = TrainingWebApi.DefaultImpls.loadTrainings$default(trainingWebApi, null, null, boolInvoke, null, null, null, null, null, null, null, filterMode, filterInfo2.getOrder(), null, null, null, 20, 29691, null);
        if (apiResponseLoadTrainings$default instanceof ApiSuccessResponse) {
            PagingKeyHelper pagingKeyHelper = trainingFilterListRepo.pagingKeyHelper;
            FilterInfo filterInfo3 = trainingFilterListRepo.filterInfo;
            Objects.requireNonNull(filterInfo3);
            pagingKeyHelper.setFilterPagingKey(filterInfo3, ((Items) ((ApiSuccessResponse) apiResponseLoadTrainings$default).getBody()).getNext());
            trainingFilterListRepo.appExecutors.getDiskIO().execute(new Runnable() { // from class: nv7
                @Override // java.lang.Runnable
                public final void run() {
                    TrainingFilterListRepo.o(this.a, apiResponseLoadTrainings$default);
                }
            });
            mutableLiveData.postValue(Resource.INSTANCE.success(null));
            return;
        }
        if (apiResponseLoadTrainings$default instanceof ApiEmptyResponse) {
            mutableLiveData.postValue(Resource.INSTANCE.success(null));
        } else if (apiResponseLoadTrainings$default instanceof ApiErrorResponse) {
            mutableLiveData.postValue(Resource.INSTANCE.error(((ApiErrorResponse) apiResponseLoadTrainings$default).getErrorMessage(), null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(final TrainingFilterListRepo trainingFilterListRepo, final ApiResponse apiResponse) {
        trainingFilterListRepo.db.runInTransaction(new Runnable() { // from class: ov7
            @Override // java.lang.Runnable
            public final void run() {
                TrainingFilterListRepo.p(this.a, apiResponse);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(TrainingFilterListRepo trainingFilterListRepo, ApiResponse apiResponse) {
        FilterDao filterDao = trainingFilterListRepo.filterDao;
        FilterInfo filterInfo = trainingFilterListRepo.filterInfo;
        Objects.requireNonNull(filterInfo);
        String filterMode = filterInfo.getFilterMode();
        FilterInfo filterInfo2 = trainingFilterListRepo.filterInfo;
        Objects.requireNonNull(filterInfo2);
        filterDao.deleteByFilterType(filterMode, filterInfo2.getOrder());
        List<TrainingBean> items = ((Items) ((ApiSuccessResponse) apiResponse).getBody()).getItems();
        TrainingDao trainingDao = trainingFilterListRepo.trainingDao;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = items.iterator();
        while (it2.hasNext()) {
            Training trainingPo = WebBeanToPoExKt.toTrainingPo((TrainingBean) it2.next());
            if (trainingPo != null) {
                arrayList.add(trainingPo);
            }
        }
        trainingDao.insertOrUpdateTrainings(arrayList);
        FilterDao filterDao2 = trainingFilterListRepo.filterDao;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
        for (TrainingBean trainingBean : items) {
            FilterInfo filterInfo3 = trainingFilterListRepo.filterInfo;
            Objects.requireNonNull(filterInfo3);
            String filterMode2 = filterInfo3.getFilterMode();
            FilterInfo filterInfo4 = trainingFilterListRepo.filterInfo;
            Objects.requireNonNull(filterInfo4);
            arrayList2.add(new FilterTraining(filterMode2, filterInfo4.getOrder(), trainingBean.getId()));
        }
        filterDao2.insertFilterTrainings(arrayList2);
    }

    private final void q() {
        PagingKeyHelper pagingKeyHelper = this.pagingKeyHelper;
        FilterInfo filterInfo = this.filterInfo;
        Objects.requireNonNull(filterInfo);
        pagingKeyHelper.resetFilterPagingKey(filterInfo);
    }

    @NotNull
    public final LiveData<Resource<List<FilterModeVo>>> loadFilterMode() {
        return Transformations.map(this.filterDao.queryFilterMode(), new Function() { // from class: lv7
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return TrainingFilterListRepo.j((List) obj);
            }
        });
    }

    @NotNull
    public final Listing<TrainingVo> loadTrainingFilterCourses(@NotNull FilterInfo filterInfo) {
        this.filterInfo = filterInfo;
        TrainingWebApi trainingWebApi = this.webApi;
        Trainer trainer = this.trainer;
        a aVar = new a(this);
        AppExecutors appExecutors = this.appExecutors;
        FilterInfo filterInfo2 = this.filterInfo;
        Objects.requireNonNull(filterInfo2);
        this.boundaryCallback = new TrainingFilterBoundaryCallback(trainingWebApi, trainer, aVar, appExecutors, filterInfo2, this.pagingKeyHelper);
        MutableLiveData mutableLiveData = new MutableLiveData();
        LiveData liveDataSwitchMap = Transformations.switchMap(mutableLiveData, new Function() { // from class: jv7
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return TrainingFilterListRepo.k(this.a, (Unit) obj);
            }
        });
        PagedList.Config configBuild = new PagedList.Config.Builder().setEnablePlaceholders(true).setPageSize(20).setInitialLoadSizeHint(20).setPrefetchDistance(0).build();
        final boolean zBooleanValue = this.trainer.isMale().invoke().booleanValue();
        LivePagedListBuilder livePagedListBuilder = new LivePagedListBuilder(this.filterDao.queryFilterTrainings(filterInfo.getFilterMode(), filterInfo.getOrder()).map(new Function() { // from class: kv7
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return TrainingFilterListRepo.l(zBooleanValue, (Training) obj);
            }
        }), configBuild);
        TrainingFilterBoundaryCallback trainingFilterBoundaryCallback = this.boundaryCallback;
        Objects.requireNonNull(trainingFilterBoundaryCallback);
        LiveData liveDataBuild = livePagedListBuilder.setBoundaryCallback(trainingFilterBoundaryCallback).setFetchExecutor(this.appExecutors.getDiskIO()).build();
        TrainingFilterBoundaryCallback trainingFilterBoundaryCallback2 = this.boundaryCallback;
        Objects.requireNonNull(trainingFilterBoundaryCallback2);
        return new Listing<>(liveDataBuild, trainingFilterBoundaryCallback2.getNetworkState(), liveDataSwitchMap, new b(mutableLiveData), new c());
    }
}
