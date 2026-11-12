package com.huami.sleepassistant.apilib.repo;

import androidx.annotation.MainThread;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.sleepassistant.apilib.bean.Items;
import com.huami.sleepassistant.apilib.bean.MusicBean;
import com.huami.sleepassistant.apilib.db.SleepAssistantDb;
import com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao;
import com.huami.sleepassistant.apilib.db.po.Music;
import com.huami.sleepassistant.apilib.helper.AppExecutors;
import com.huami.sleepassistant.apilib.helper.PagingKey;
import com.huami.sleepassistant.apilib.helper.PagingKeyCache;
import com.huami.sleepassistant.apilib.repo.MusicControlRepo;
import com.huami.sleepassistant.apilib.utils.MusicControlCallback;
import com.huami.sleepassistant.apilib.utils.ext.PoToVoExKt;
import com.huami.sleepassistant.apilib.utils.ext.WebBeanToPoExKt;
import com.huami.sleepassistant.apilib.vo.ApiEmptyResponse;
import com.huami.sleepassistant.apilib.vo.ApiErrorResponse;
import com.huami.sleepassistant.apilib.vo.ApiResponse;
import com.huami.sleepassistant.apilib.vo.ApiSuccessResponse;
import com.huami.sleepassistant.apilib.vo.Listing;
import com.huami.sleepassistant.apilib.vo.MusicVo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b$\u0010%J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0003J\u0018\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0017\u001a\u00020\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/huami/sleepassistant/apilib/repo/MusicControlRepo;", "", "Landroidx/lifecycle/LiveData;", "Lcom/huami/android/vo/Resource;", "", "l", "", "Lcom/huami/sleepassistant/apilib/bean/MusicBean;", "body", "", "h", "Lcom/huami/sleepassistant/apilib/vo/Listing;", "Lcom/huami/sleepassistant/apilib/vo/MusicVo;", "loadMusicList", "Lcom/huami/sleepassistant/apilib/helper/AppExecutors;", "a", "Lcom/huami/sleepassistant/apilib/helper/AppExecutors;", "appExecutors", "Lcom/huami/sleepassistant/apilib/db/SleepAssistantDb;", "b", "Lcom/huami/sleepassistant/apilib/db/SleepAssistantDb;", "getDb", "()Lcom/huami/sleepassistant/apilib/db/SleepAssistantDb;", UserDataStore.DATE_OF_BIRTH, "Lcom/huami/sleepassistant/apilib/repo/SleepAssistantWebApi;", "c", "Lcom/huami/sleepassistant/apilib/repo/SleepAssistantWebApi;", "webApi", "Lcom/huami/sleepassistant/apilib/helper/PagingKeyCache;", GoogleApiAvailabilityLight.a, "Lcom/huami/sleepassistant/apilib/helper/PagingKeyCache;", "pagingKeyCache", "Lcom/huami/sleepassistant/apilib/db/dao/SleepAssistantDao;", "e", "Lcom/huami/sleepassistant/apilib/db/dao/SleepAssistantDao;", "sleepAssistDao", "<init>", "(Lcom/huami/sleepassistant/apilib/helper/AppExecutors;Lcom/huami/sleepassistant/apilib/db/SleepAssistantDb;Lcom/huami/sleepassistant/apilib/repo/SleepAssistantWebApi;Lcom/huami/sleepassistant/apilib/helper/PagingKeyCache;)V", "apilib_release"}, k = 1, mv = {1, 5, 1})
public final class MusicControlRepo {

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

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final SleepAssistantDao sleepAssistDao;

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
        public final /* synthetic */ MusicControlCallback a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MusicControlCallback musicControlCallback) {
            super(0);
            this.a = musicControlCallback;
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
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function1<List<? extends MusicBean>, Unit> {
        public c(MusicControlRepo musicControlRepo) {
            super(1, musicControlRepo, MusicControlRepo.class, "insertMusicResultIntoDb", "insertMusicResultIntoDb(Ljava/util/List;)V", 0);
        }

        public final void a(@Nullable List<MusicBean> list) {
            ((MusicControlRepo) this.receiver).h(list);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends MusicBean> list) {
            a(list);
            return Unit.INSTANCE;
        }
    }

    public MusicControlRepo(@NotNull AppExecutors appExecutors, @NotNull SleepAssistantDb sleepAssistantDb, @NotNull SleepAssistantWebApi sleepAssistantWebApi, @NotNull PagingKeyCache pagingKeyCache) {
        this.appExecutors = appExecutors;
        this.db = sleepAssistantDb;
        this.webApi = sleepAssistantWebApi;
        this.pagingKeyCache = pagingKeyCache;
        this.sleepAssistDao = sleepAssistantDb.sleepAssistantDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(final List<MusicBean> body) {
        if (body == null) {
            return;
        }
        getDb().runInTransaction(new Runnable() { // from class: ga5
            @Override // java.lang.Runnable
            public final void run() {
                MusicControlRepo.i(body, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(List list, MusicControlRepo musicControlRepo) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(WebBeanToPoExKt.toMusic((MusicBean) it2.next()));
        }
        musicControlRepo.sleepAssistDao.insertOrUpdateMusic(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData j(MusicControlRepo musicControlRepo, Unit unit) {
        return musicControlRepo.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MusicVo k(Music music) {
        return PoToVoExKt.toMusicVo(music);
    }

    @MainThread
    private final LiveData<Resource<Integer>> l() {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(Resource.INSTANCE.loading(null));
        this.pagingKeyCache.clearKey(PagingKey.MUSIC);
        this.appExecutors.getNetworkIO().execute(new Runnable() { // from class: ca5
            @Override // java.lang.Runnable
            public final void run() {
                MusicControlRepo.m(this.a, mutableLiveData);
            }
        });
        return mutableLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(final MusicControlRepo musicControlRepo, MutableLiveData mutableLiveData) {
        final ApiResponse apiResponseLoadMusic$default = SleepAssistantWebApi.DefaultImpls.loadMusic$default(musicControlRepo.webApi, null, 1000, 1, null);
        if (!(apiResponseLoadMusic$default instanceof ApiSuccessResponse)) {
            if (apiResponseLoadMusic$default instanceof ApiEmptyResponse) {
                mutableLiveData.postValue(Resource.INSTANCE.success(null));
                return;
            } else {
                if (apiResponseLoadMusic$default instanceof ApiErrorResponse) {
                    mutableLiveData.postValue(Resource.INSTANCE.error(((ApiErrorResponse) apiResponseLoadMusic$default).getErrorMessage(), null));
                    return;
                }
                return;
            }
        }
        ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) apiResponseLoadMusic$default;
        if (apiSuccessResponse.getBody() == null) {
            mutableLiveData.postValue(Resource.INSTANCE.success(null));
            return;
        }
        musicControlRepo.pagingKeyCache.saveKey(PagingKey.MUSIC, ((Items) apiSuccessResponse.getBody()).getNext());
        musicControlRepo.appExecutors.getDiskIO().execute(new Runnable() { // from class: da5
            @Override // java.lang.Runnable
            public final void run() {
                MusicControlRepo.n(this.a, apiResponseLoadMusic$default);
            }
        });
        mutableLiveData.postValue(Resource.INSTANCE.success(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final MusicControlRepo musicControlRepo, final ApiResponse apiResponse) {
        musicControlRepo.getDb().runInTransaction(new Runnable() { // from class: fa5
            @Override // java.lang.Runnable
            public final void run() {
                MusicControlRepo.o(apiResponse, musicControlRepo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(ApiResponse apiResponse, final MusicControlRepo musicControlRepo) {
        final List items = ((Items) ((ApiSuccessResponse) apiResponse).getBody()).getItems();
        musicControlRepo.getDb().runInTransaction(new Runnable() { // from class: ea5
            @Override // java.lang.Runnable
            public final void run() {
                MusicControlRepo.p(this.a, items);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(MusicControlRepo musicControlRepo, List list) {
        List<Music> listQueryMusicList = musicControlRepo.sleepAssistDao.queryMusicList();
        ArrayList arrayList = new ArrayList();
        if (listQueryMusicList.size() >= 3) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                arrayList.add(listQueryMusicList.get(i));
                if (i2 > 2) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        musicControlRepo.sleepAssistDao.deleteMusicListItems();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(WebBeanToPoExKt.toMusic((MusicBean) it2.next()));
        }
        arrayList.addAll(arrayList2);
        musicControlRepo.sleepAssistDao.insertOrUpdateMusic(arrayList);
    }

    @NotNull
    public final SleepAssistantDb getDb() {
        return this.db;
    }

    @NotNull
    public final Listing<MusicVo> loadMusicList() {
        MusicControlCallback musicControlCallback = new MusicControlCallback(this.appExecutors, this.webApi, this.pagingKeyCache, new c(this));
        MutableLiveData mutableLiveData = new MutableLiveData();
        return new Listing<>(new LivePagedListBuilder(this.sleepAssistDao.queryMusicListItemsByPaging().map(new Function() { // from class: ba5
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return MusicControlRepo.k((Music) obj);
            }
        }), new PagedList.Config.Builder().setEnablePlaceholders(true).setPageSize(1000).setInitialLoadSizeHint(1000).setPrefetchDistance(0).build()).setBoundaryCallback(musicControlCallback).setFetchExecutor(this.appExecutors.getDiskIO()).build(), musicControlCallback.getNetworkState(), Transformations.switchMap(mutableLiveData, new Function() { // from class: aa5
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return MusicControlRepo.j(this.a, (Unit) obj);
            }
        }), new a(mutableLiveData), new b(musicControlCallback), null, null, null, 224, null);
    }
}
