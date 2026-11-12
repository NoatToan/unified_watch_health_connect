package com.huami.sleepassistant.apilib.repo;

import androidx.annotation.MainThread;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.sleepassistant.apilib.db.SleepAssistantDb;
import com.huami.sleepassistant.apilib.db.po.PostLiveMusicSortBean;
import com.huami.sleepassistant.apilib.helper.AppExecutors;
import com.huami.sleepassistant.apilib.helper.PagingKeyCache;
import com.huami.sleepassistant.apilib.repo.SortCollectionRepo;
import com.huami.sleepassistant.apilib.utils.ext.VoToPoExKt;
import com.huami.sleepassistant.apilib.vo.ApiEmptyResponse;
import com.huami.sleepassistant.apilib.vo.ApiErrorResponse;
import com.huami.sleepassistant.apilib.vo.ApiResponse;
import com.huami.sleepassistant.apilib.vo.ApiSuccessResponse;
import com.huami.sleepassistant.apilib.vo.LiveMusicVo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/sleepassistant/apilib/repo/SortCollectionRepo;", "", "Lcom/huami/sleepassistant/apilib/db/po/PostLiveMusicSortBean;", "mPostLiveMusicSortBean", "Landroidx/lifecycle/LiveData;", "Lcom/huami/android/vo/Resource;", "", "sortCollectionParams", "Lcom/huami/sleepassistant/apilib/helper/AppExecutors;", "a", "Lcom/huami/sleepassistant/apilib/helper/AppExecutors;", "appExecutors", "Lcom/huami/sleepassistant/apilib/db/SleepAssistantDb;", "b", "Lcom/huami/sleepassistant/apilib/db/SleepAssistantDb;", UserDataStore.DATE_OF_BIRTH, "Lcom/huami/sleepassistant/apilib/repo/SleepAssistantWebApi;", "c", "Lcom/huami/sleepassistant/apilib/repo/SleepAssistantWebApi;", "webApi", "Lcom/huami/sleepassistant/apilib/helper/PagingKeyCache;", GoogleApiAvailabilityLight.a, "Lcom/huami/sleepassistant/apilib/helper/PagingKeyCache;", "pagingKeyCache", "<init>", "(Lcom/huami/sleepassistant/apilib/helper/AppExecutors;Lcom/huami/sleepassistant/apilib/db/SleepAssistantDb;Lcom/huami/sleepassistant/apilib/repo/SleepAssistantWebApi;Lcom/huami/sleepassistant/apilib/helper/PagingKeyCache;)V", "apilib_release"}, k = 1, mv = {1, 5, 1})
public final class SortCollectionRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SleepAssistantDb db;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final SleepAssistantWebApi webApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final PagingKeyCache pagingKeyCache;

    public SortCollectionRepo(@NotNull AppExecutors appExecutors, @NotNull SleepAssistantDb sleepAssistantDb, @NotNull SleepAssistantWebApi sleepAssistantWebApi, @NotNull PagingKeyCache pagingKeyCache) {
        this.appExecutors = appExecutors;
        this.db = sleepAssistantDb;
        this.webApi = sleepAssistantWebApi;
        this.pagingKeyCache = pagingKeyCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final SortCollectionRepo sortCollectionRepo, final PostLiveMusicSortBean postLiveMusicSortBean, MutableLiveData mutableLiveData) {
        SleepAssistantWebApi sleepAssistantWebApi = sortCollectionRepo.webApi;
        ArrayList<String> ids = postLiveMusicSortBean.getIds();
        if (ids == null) {
            ids = new ArrayList<>();
        }
        ApiResponse<String> apiResponseSortCollection = sleepAssistantWebApi.sortCollection(ids);
        if (apiResponseSortCollection instanceof ApiSuccessResponse) {
            sortCollectionRepo.appExecutors.getDiskIO().execute(new Runnable() { // from class: n67
                @Override // java.lang.Runnable
                public final void run() {
                    SortCollectionRepo.e(this.a, postLiveMusicSortBean);
                }
            });
            mutableLiveData.postValue(Resource.INSTANCE.success(null));
        } else if (apiResponseSortCollection instanceof ApiEmptyResponse) {
            mutableLiveData.postValue(Resource.INSTANCE.success(null));
        } else if (apiResponseSortCollection instanceof ApiErrorResponse) {
            mutableLiveData.postValue(Resource.INSTANCE.error(((ApiErrorResponse) apiResponseSortCollection).getErrorMessage(), null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final SortCollectionRepo sortCollectionRepo, final PostLiveMusicSortBean postLiveMusicSortBean) {
        sortCollectionRepo.db.runInTransaction(new Runnable() { // from class: m67
            @Override // java.lang.Runnable
            public final void run() {
                SortCollectionRepo.f(postLiveMusicSortBean, sortCollectionRepo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(PostLiveMusicSortBean postLiveMusicSortBean, SortCollectionRepo sortCollectionRepo) {
        ArrayList arrayList;
        List<LiveMusicVo> list = postLiveMusicSortBean.getList();
        if (list == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(VoToPoExKt.toLiveMusic((LiveMusicVo) it2.next()));
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            sortCollectionRepo.db.sleepAssistantDao().deleteLiveMusicListItems();
            sortCollectionRepo.db.sleepAssistantDao().insertOrUpdateLiveMusic(arrayList);
        }
    }

    @MainThread
    @NotNull
    public final LiveData<Resource<Integer>> sortCollectionParams(@NotNull final PostLiveMusicSortBean mPostLiveMusicSortBean) {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(Resource.INSTANCE.loading(null));
        this.appExecutors.getNetworkIO().execute(new Runnable() { // from class: o67
            @Override // java.lang.Runnable
            public final void run() {
                SortCollectionRepo.d(this.a, mPostLiveMusicSortBean, mutableLiveData);
            }
        });
        return mutableLiveData;
    }
}
