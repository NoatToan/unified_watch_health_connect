package com.huami.training.helper;

import androidx.annotation.MainThread;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.paging.DataSource;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.db.TrainingDb;
import com.huami.training.helper.PagingHelper;
import com.huami.training.paging.PagingKeyCache;
import com.huami.training.vo.ApiEmptyResponse;
import com.huami.training.vo.ApiErrorResponse;
import com.huami.training.vo.ApiResponse;
import com.huami.training.vo.ApiSuccessResponse;
import com.huami.training.vo.Listing;
import com.huami.training.vo.Resource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003BÀ\u0001\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u001e\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u001aj\b\u0012\u0004\u0012\u00028\u0001`\u001b\u00123\u0010$\u001a/\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"0\u001aj\b\u0012\u0004\u0012\u00028\u0001`#\u0012\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00028\u00000%\u0012\u0010\u0010.\u001a\f\u0012\u0004\u0012\u00020\u00060*j\u0002`+\u0012\u001c\u00101\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u001aj\b\u0012\u0004\u0012\u00028\u0001`/¢\u0006\u0004\b2\u00103J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0003J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R.\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u001aj\b\u0012\u0004\u0012\u00028\u0001`\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dRC\u0010$\u001a/\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"0\u001aj\b\u0012\u0004\u0012\u00028\u0001`#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\"\u0010)\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00028\u00000%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010.\u001a\f\u0012\u0004\u0012\u00020\u00060*j\u0002`+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R,\u00101\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u001aj\b\u0012\u0004\u0012\u00028\u0001`/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u001d¨\u00064"}, d2 = {"Lcom/huami/training/helper/PagingHelper;", "Vo", "WebBean", "", "Landroidx/lifecycle/LiveData;", "Lcom/huami/training/vo/Resource;", "", "f", "Lcom/huami/training/vo/Listing;", "getListing", "Lcom/huami/training/helper/AppExecutors;", "a", "Lcom/huami/training/helper/AppExecutors;", "appExecutors", "Lcom/huami/training/db/TrainingDb;", "b", "Lcom/huami/training/db/TrainingDb;", UserDataStore.DATE_OF_BIRTH, "Lcom/huami/training/paging/PagingKeyCache;", "c", "Lcom/huami/training/paging/PagingKeyCache;", "pagingKeyCache", "", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "pagingKey", "Lkotlin/Function1;", "Lcom/huami/training/helper/PagingKeyParser;", "e", "Lkotlin/jvm/functions/Function1;", "pagingKeyParser", "Lkotlin/ParameterName;", "name", "nextPageKey", "Lcom/huami/training/vo/ApiResponse;", "Lcom/huami/training/helper/WebRequest;", "webRequest", "Landroidx/paging/DataSource$Factory;", "", "g", "Landroidx/paging/DataSource$Factory;", "pagingDbSource", "Lkotlin/Function0;", "Lcom/huami/training/helper/ClearDataInDb;", "h", "Lkotlin/jvm/functions/Function0;", "clearDataInDb", "Lcom/huami/training/helper/AppendWebDataToDb;", "i", "appendWebDataToDb", "<init>", "(Lcom/huami/training/helper/AppExecutors;Lcom/huami/training/db/TrainingDb;Lcom/huami/training/paging/PagingKeyCache;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/paging/DataSource$Factory;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PagingHelper<Vo, WebBean> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final TrainingDb db;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final PagingKeyCache pagingKeyCache;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String pagingKey;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Function1<WebBean, String> pagingKeyParser;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Function1<String, ApiResponse<WebBean>> webRequest;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final DataSource.Factory<Integer, Vo> pagingDbSource;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> clearDataInDb;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Function1<WebBean, Unit> appendWebDataToDb;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n"}, d2 = {"Vo", "WebBean", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n"}, d2 = {"Vo", "WebBean", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ PagedListBoundaryCallback<Vo, WebBean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PagedListBoundaryCallback<Vo, WebBean> pagedListBoundaryCallback) {
            super(0);
            this.a = pagedListBoundaryCallback;
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

    /* JADX WARN: Multi-variable type inference failed */
    public PagingHelper(@NotNull AppExecutors appExecutors, @NotNull TrainingDb trainingDb, @NotNull PagingKeyCache pagingKeyCache, @NotNull String str, @NotNull Function1<? super WebBean, String> function1, @NotNull Function1<? super String, ? extends ApiResponse<WebBean>> function2, @NotNull DataSource.Factory<Integer, Vo> factory, @NotNull Function0<Unit> function0, @NotNull Function1<? super WebBean, Unit> function3) {
        this.appExecutors = appExecutors;
        this.db = trainingDb;
        this.pagingKeyCache = pagingKeyCache;
        this.pagingKey = str;
        this.pagingKeyParser = function1;
        this.webRequest = function2;
        this.pagingDbSource = factory;
        this.clearDataInDb = function0;
        this.appendWebDataToDb = function3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData e(PagingHelper pagingHelper, Unit unit) {
        return pagingHelper.f();
    }

    @MainThread
    private final LiveData<Resource<Unit>> f() {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(Resource.INSTANCE.loading(null));
        this.pagingKeyCache.clearKey(this.pagingKey);
        this.appExecutors.getNetworkIO().execute(new Runnable() { // from class: dr5
            @Override // java.lang.Runnable
            public final void run() {
                PagingHelper.g(this.a, mutableLiveData);
            }
        });
        return mutableLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final PagingHelper pagingHelper, MutableLiveData mutableLiveData) {
        final ApiResponse<WebBean> apiResponseInvoke = pagingHelper.webRequest.invoke(null);
        if (apiResponseInvoke instanceof ApiSuccessResponse) {
            pagingHelper.pagingKeyCache.saveKey(pagingHelper.pagingKey, pagingHelper.pagingKeyParser.invoke((WebBean) ((ApiSuccessResponse) apiResponseInvoke).getBody()));
            pagingHelper.appExecutors.getDiskIO().execute(new Runnable() { // from class: tq5
                @Override // java.lang.Runnable
                public final void run() {
                    PagingHelper.h(this.a, apiResponseInvoke);
                }
            });
            mutableLiveData.postValue(Resource.INSTANCE.success(null));
        } else if (apiResponseInvoke instanceof ApiEmptyResponse) {
            mutableLiveData.postValue(Resource.INSTANCE.success(null));
        } else if (apiResponseInvoke instanceof ApiErrorResponse) {
            mutableLiveData.postValue(Resource.INSTANCE.error(((ApiErrorResponse) apiResponseInvoke).getErrorMessage(), null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final PagingHelper pagingHelper, final ApiResponse apiResponse) {
        pagingHelper.db.runInTransaction(new Runnable() { // from class: uq5
            @Override // java.lang.Runnable
            public final void run() {
                PagingHelper.i(this.a, apiResponse);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(PagingHelper pagingHelper, ApiResponse apiResponse) {
        pagingHelper.clearDataInDb.invoke();
        pagingHelper.appendWebDataToDb.invoke((WebBean) ((ApiSuccessResponse) apiResponse).getBody());
    }

    @NotNull
    public final Listing<Vo> getListing() {
        PagedListBoundaryCallback pagedListBoundaryCallback = new PagedListBoundaryCallback(this.appExecutors, this.pagingKeyCache, this.pagingKey, this.pagingKeyParser, this.webRequest, this.appendWebDataToDb);
        MutableLiveData mutableLiveData = new MutableLiveData();
        return new Listing<>(new LivePagedListBuilder(this.pagingDbSource, new PagedList.Config.Builder().setEnablePlaceholders(true).setPageSize(20).setInitialLoadSizeHint(20).setPrefetchDistance(0).build()).setBoundaryCallback(pagedListBoundaryCallback).setFetchExecutor(this.appExecutors.getDiskIO()).build(), pagedListBoundaryCallback.getNetworkState(), Transformations.switchMap(mutableLiveData, new Function() { // from class: cr5
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PagingHelper.e(this.a, (Unit) obj);
            }
        }), new a(mutableLiveData), new b(pagedListBoundaryCallback));
    }
}
