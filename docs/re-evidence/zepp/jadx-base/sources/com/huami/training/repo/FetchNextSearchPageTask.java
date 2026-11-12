package com.huami.training.repo;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.api.TrainingWebApi;
import com.huami.training.api.pojo.Items;
import com.huami.training.api.pojo.TrainingBean;
import com.huami.training.converter.WebBeanToPoExKt;
import com.huami.training.db.TrainingDb;
import com.huami.training.db.dao.SearchDao;
import com.huami.training.db.dao.TrainingDao;
import com.huami.training.db.po.SearchResult;
import com.huami.training.db.po.Training;
import com.huami.training.repo.FetchNextSearchPageTask;
import com.huami.training.vo.ApiEmptyResponse;
import com.huami.training.vo.ApiErrorResponse;
import com.huami.training.vo.ApiResponse;
import com.huami.training.vo.ApiSuccessResponse;
import com.huami.training.vo.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR%\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0 8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/huami/training/repo/FetchNextSearchPageTask;", "Ljava/lang/Runnable;", "", "run", "", "a", "Ljava/lang/String;", "query", "b", "mode", "Lcom/huami/training/api/TrainingWebApi;", "c", "Lcom/huami/training/api/TrainingWebApi;", "trainingWebApi", "Lcom/huami/training/db/TrainingDb;", GoogleApiAvailabilityLight.a, "Lcom/huami/training/db/TrainingDb;", "trainingDb", "Lcom/huami/training/db/dao/TrainingDao;", "e", "Lcom/huami/training/db/dao/TrainingDao;", "trainingDao", "Lcom/huami/training/db/dao/SearchDao;", "f", "Lcom/huami/training/db/dao/SearchDao;", "searchDao", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/training/vo/Resource;", "", "g", "Landroidx/lifecycle/MutableLiveData;", "_liveData", "Landroidx/lifecycle/LiveData;", "h", "Landroidx/lifecycle/LiveData;", "getLiveData", "()Landroidx/lifecycle/LiveData;", "liveData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huami/training/api/TrainingWebApi;Lcom/huami/training/db/TrainingDb;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class FetchNextSearchPageTask implements Runnable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String query;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String mode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final TrainingWebApi trainingWebApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final TrainingDb trainingDb;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final TrainingDao trainingDao;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final SearchDao searchDao;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<Boolean>> _liveData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<Boolean>> liveData;

    public FetchNextSearchPageTask(@NotNull String str, @NotNull String str2, @NotNull TrainingWebApi trainingWebApi, @NotNull TrainingDb trainingDb) {
        this.query = str;
        this.mode = str2;
        this.trainingWebApi = trainingWebApi;
        this.trainingDb = trainingDb;
        this.trainingDao = trainingDb.trainingDao();
        this.searchDao = trainingDb.getSearchDao();
        MutableLiveData<Resource<Boolean>> mutableLiveData = new MutableLiveData<>();
        this._liveData = mutableLiveData;
        this.liveData = mutableLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(FetchNextSearchPageTask fetchNextSearchPageTask, SearchResult searchResult, List list) {
        fetchNextSearchPageTask.searchDao.insertSearchResult(searchResult);
        TrainingDao trainingDao = fetchNextSearchPageTask.trainingDao;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Training trainingPo = WebBeanToPoExKt.toTrainingPo((TrainingBean) it2.next());
            if (trainingPo != null) {
                arrayList.add(trainingPo);
            }
        }
        trainingDao.insertOrUpdateTrainings(arrayList);
    }

    @NotNull
    public final LiveData<Resource<Boolean>> getLiveData() {
        return this.liveData;
    }

    @Override // java.lang.Runnable
    public void run() {
        Resource<Boolean> resourceError;
        SearchResult searchResultQuerySearchResult = this.searchDao.querySearchResult(this.query, this.mode);
        if (searchResultQuerySearchResult == null) {
            this._liveData.postValue(null);
            return;
        }
        Long next = searchResultQuerySearchResult.getNext();
        if (next == null) {
            this._liveData.postValue(Resource.INSTANCE.success(Boolean.FALSE));
            return;
        }
        try {
            ApiResponse<Items<TrainingBean>> apiResponseSearch = this.trainingWebApi.search(this.query, this.mode, next);
            if (apiResponseSearch instanceof ApiSuccessResponse) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(searchResultQuerySearchResult.getIds());
                final List items = ((Items) ((ApiSuccessResponse) apiResponseSearch).getBody()).getItems();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
                Iterator it2 = items.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Long.valueOf(((TrainingBean) it2.next()).getId()));
                }
                arrayList.addAll(arrayList2);
                final SearchResult searchResult = new SearchResult(this.query, this.mode, arrayList, ((Items) ((ApiSuccessResponse) apiResponseSearch).getBody()).getNext());
                this.trainingDb.runInTransaction(new Runnable() { // from class: z52
                    @Override // java.lang.Runnable
                    public final void run() {
                        FetchNextSearchPageTask.b(this.a, searchResult, items);
                    }
                });
                resourceError = Resource.INSTANCE.success(Boolean.valueOf(((Items) ((ApiSuccessResponse) apiResponseSearch).getBody()).getNext() != null));
            } else if (apiResponseSearch instanceof ApiEmptyResponse) {
                resourceError = Resource.INSTANCE.success(Boolean.FALSE);
            } else {
                if (!(apiResponseSearch instanceof ApiErrorResponse)) {
                    throw new NoWhenBranchMatchedException();
                }
                resourceError = Resource.INSTANCE.error(((ApiErrorResponse) apiResponseSearch).getErrorMessage(), Boolean.TRUE);
            }
        } catch (IOException e) {
            resourceError = Resource.INSTANCE.error(e.getMessage(), Boolean.TRUE);
        }
        this._liveData.postValue(resourceError);
    }
}
