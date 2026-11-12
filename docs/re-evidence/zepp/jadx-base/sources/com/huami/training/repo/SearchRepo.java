package com.huami.training.repo;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Transformations;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.api.LoadOnActiveLiveData;
import com.huami.training.api.TrainingWebApi;
import com.huami.training.api.pojo.Items;
import com.huami.training.api.pojo.TrainingBean;
import com.huami.training.converter.PoToVoExKt;
import com.huami.training.converter.WebBeanToPoExKt;
import com.huami.training.db.TrainingDb;
import com.huami.training.db.dao.SearchDao;
import com.huami.training.db.dao.TrainingDao;
import com.huami.training.db.po.SearchResult;
import com.huami.training.db.po.Tag;
import com.huami.training.db.po.Training;
import com.huami.training.dto.Trainer;
import com.huami.training.helper.AbsentLiveData;
import com.huami.training.helper.AppExecutors;
import com.huami.training.repo.SearchRepo;
import com.huami.training.vo.ApiResponse;
import com.huami.training.vo.Resource;
import com.huami.training.vo.TagVo;
import com.huami.training.vo.TrainingVo;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b&\u0010'J\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002J(\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\"\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/huami/training/repo/SearchRepo;", "", "Landroidx/lifecycle/LiveData;", "Lcom/huami/training/vo/Resource;", "", "Lcom/huami/training/vo/TagVo;", "loadHotSearchResults", "", "query", "mode", "Lcom/huami/training/vo/TrainingVo;", "search", "", "searchNextPage", "Lcom/huami/training/helper/AppExecutors;", "a", "Lcom/huami/training/helper/AppExecutors;", "appExecutors", "Lcom/huami/training/db/TrainingDb;", "b", "Lcom/huami/training/db/TrainingDb;", "trainingDb", "Lcom/huami/training/api/TrainingWebApi;", "c", "Lcom/huami/training/api/TrainingWebApi;", "trainingWebApi", "Lcom/huami/training/dto/Trainer;", GoogleApiAvailabilityLight.a, "Lcom/huami/training/dto/Trainer;", "trainer", "Lcom/huami/training/db/dao/TrainingDao;", "e", "Lcom/huami/training/db/dao/TrainingDao;", "trainingDao", "Lcom/huami/training/db/dao/SearchDao;", "f", "Lcom/huami/training/db/dao/SearchDao;", "searchDao", "<init>", "(Lcom/huami/training/helper/AppExecutors;Lcom/huami/training/db/TrainingDb;Lcom/huami/training/api/TrainingWebApi;Lcom/huami/training/dto/Trainer;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class SearchRepo {

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
    private final TrainingDao trainingDao;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final SearchDao searchDao;

    /* JADX INFO: renamed from: com.huami.training.repo.SearchRepo$search$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u0001J\u0016\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0014J\u0018\u0010\f\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\rH\u0014J\u001a\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u000f0\rH\u0014J \u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00022\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014¨\u0006\u0013"}, d2 = {"com/huami/training/repo/SearchRepo$search$1", "Lcom/huami/training/repo/NetworkBoundResource;", "", "Lcom/huami/training/db/po/Training;", "Lcom/huami/training/api/pojo/Items;", "Lcom/huami/training/api/pojo/TrainingBean;", "Lcom/huami/training/vo/TrainingVo;", "result", "", "saveCallResult", "data", "", "shouldFetch", "Landroidx/lifecycle/LiveData;", "loadFromDb", "Lcom/huami/training/vo/ApiResponse;", "createCall", "po", "poToVo", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass1 extends NetworkBoundResource<List<? extends Training>, Items<TrainingBean>, List<? extends TrainingVo>> {
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ SearchRepo e;

        /* JADX INFO: renamed from: com.huami.training.repo.SearchRepo$search$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/training/vo/ApiResponse;", "Lcom/huami/training/api/pojo/Items;", "Lcom/huami/training/api/pojo/TrainingBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<ApiResponse<Items<TrainingBean>>> {
            public final /* synthetic */ SearchRepo a;
            public final /* synthetic */ String b;
            public final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SearchRepo searchRepo, String str, String str2) {
                super(0);
                this.a = searchRepo;
                this.b = str;
                this.c = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ApiResponse<Items<TrainingBean>> invoke() {
                return this.a.trainingWebApi.search(this.b, this.c, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, SearchRepo searchRepo, AppExecutors appExecutors) {
            super(appExecutors);
            this.c = str;
            this.d = str2;
            this.e = searchRepo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LiveData F(SearchRepo searchRepo, SearchResult searchResult) {
            return searchResult == null ? AbsentLiveData.INSTANCE.create() : searchRepo.searchDao.loadById(searchResult.getIds());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void G(SearchRepo searchRepo, String str, String str2, SearchResult searchResult, List list) {
            searchRepo.searchDao.deleteSearchResult(str, str2);
            searchRepo.searchDao.insertSearchResult(searchResult);
            searchRepo.trainingDao.insertOrUpdateTrainings(list);
        }

        @Override // com.huami.training.repo.NetworkBoundResource
        @NotNull
        public LiveData<ApiResponse<Items<TrainingBean>>> createCall() {
            return LoadOnActiveLiveData.INSTANCE.create(this.e.appExecutors.getNetworkIO(), new a(this.e, this.c, this.d));
        }

        @Override // com.huami.training.repo.NetworkBoundResource
        @NotNull
        public LiveData<List<? extends Training>> loadFromDb() {
            LiveData<SearchResult> liveDataSearch = this.e.searchDao.search(this.c, this.d);
            final SearchRepo searchRepo = this.e;
            return Transformations.switchMap(liveDataSearch, new Function() { // from class: el6
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return SearchRepo.AnonymousClass1.F(searchRepo, (SearchResult) obj);
                }
            });
        }

        @Override // com.huami.training.repo.NetworkBoundResource
        public /* bridge */ /* synthetic */ List<? extends TrainingVo> poToVo(List<? extends Training> list) {
            return poToVo2((List<Training>) list);
        }

        @Override // com.huami.training.repo.NetworkBoundResource
        public /* bridge */ /* synthetic */ boolean shouldFetch(List<? extends Training> list) {
            return shouldFetch2((List<Training>) list);
        }

        /* JADX INFO: renamed from: shouldFetch, reason: avoid collision after fix types in other method */
        public boolean shouldFetch2(@Nullable List<Training> data) {
            return true;
        }

        @Nullable
        /* JADX INFO: renamed from: poToVo, reason: avoid collision after fix types in other method */
        public List<TrainingVo> poToVo2(@Nullable List<Training> po) {
            if (po == null) {
                return null;
            }
            SearchRepo searchRepo = this.e;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(po, 10));
            Iterator<T> it2 = po.iterator();
            while (it2.hasNext()) {
                arrayList.add(PoToVoExKt.toTrainingVo((Training) it2.next(), searchRepo.trainer.isMale().invoke().booleanValue()));
            }
            return arrayList;
        }

        @Override // com.huami.training.repo.NetworkBoundResource
        public void saveCallResult(@NotNull Items<TrainingBean> result) {
            List<TrainingBean> items = result.getItems();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
            Iterator<T> it2 = items.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(((TrainingBean) it2.next()).getId()));
            }
            List<TrainingBean> items2 = result.getItems();
            final ArrayList arrayList2 = new ArrayList();
            Iterator<T> it3 = items2.iterator();
            while (it3.hasNext()) {
                Training trainingPo = WebBeanToPoExKt.toTrainingPo((TrainingBean) it3.next());
                if (trainingPo != null) {
                    arrayList2.add(trainingPo);
                }
            }
            final SearchResult searchResult = new SearchResult(this.c, this.d, arrayList, result.getNext());
            TrainingDb trainingDb = this.e.trainingDb;
            final SearchRepo searchRepo = this.e;
            final String str = this.c;
            final String str2 = this.d;
            trainingDb.runInTransaction(new Runnable() { // from class: fl6
                @Override // java.lang.Runnable
                public final void run() {
                    SearchRepo.AnonymousClass1.G(searchRepo, str, str2, searchResult, arrayList2);
                }
            });
        }
    }

    public SearchRepo(@NotNull AppExecutors appExecutors, @NotNull TrainingDb trainingDb, @NotNull TrainingWebApi trainingWebApi, @NotNull Trainer trainer) {
        this.appExecutors = appExecutors;
        this.trainingDb = trainingDb;
        this.trainingWebApi = trainingWebApi;
        this.trainer = trainer;
        this.trainingDao = trainingDb.trainingDao();
        this.searchDao = trainingDb.getSearchDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resource b(List list) {
        ArrayList arrayList;
        Resource.Companion companion = Resource.INSTANCE;
        if (list == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(PoToVoExKt.toTodayTagVo((Tag) it2.next()));
            }
            arrayList = arrayList2;
        }
        return companion.success(arrayList);
    }

    @NotNull
    public final LiveData<Resource<List<TagVo>>> loadHotSearchResults() {
        return Transformations.map(this.searchDao.loadHotSearchResults(), new Function() { // from class: dl6
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return SearchRepo.b((List) obj);
            }
        });
    }

    @NotNull
    public final LiveData<Resource<List<TrainingVo>>> search(@NotNull String query, @NotNull String mode) {
        return new AnonymousClass1(query, mode, this, this.appExecutors).asLiveData();
    }

    @NotNull
    public final LiveData<Resource<Boolean>> searchNextPage(@NotNull String query, @NotNull String mode) {
        FetchNextSearchPageTask fetchNextSearchPageTask = new FetchNextSearchPageTask(query, mode, this.trainingWebApi, this.trainingDb);
        this.appExecutors.getNetworkIO().execute(fetchNextSearchPageTask);
        return fetchNextSearchPageTask.getLiveData();
    }
}
