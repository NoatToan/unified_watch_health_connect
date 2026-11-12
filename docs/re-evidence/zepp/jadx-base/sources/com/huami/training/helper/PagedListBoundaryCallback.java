package com.huami.training.helper;

import androidx.annotation.MainThread;
import androidx.p008lifecycle.LiveData;
import androidx.paging.PagedList;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.ext.PagingRequestHelperExtKt;
import com.huami.training.helper.PagedListBoundaryCallback;
import com.huami.training.paging.PagingKeyCache;
import com.huami.training.paging.PagingRequestHelper;
import com.huami.training.vo.ApiEmptyResponse;
import com.huami.training.vo.ApiErrorResponse;
import com.huami.training.vo.ApiResponse;
import com.huami.training.vo.ApiSuccessResponse;
import com.huami.training.vo.Resource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0092\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u001e\u0010!\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001dj\b\u0012\u0004\u0012\u00028\u0001`\u001e\u00123\u0010'\u001a/\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u001dj\b\u0012\u0004\u0012\u00028\u0001`%\u0012\u001c\u0010*\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u001dj\b\u0012\u0004\u0012\u00028\u0001`(¢\u0006\u0004\b7\u00108J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\bH\u0017J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR.\u0010!\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001dj\b\u0012\u0004\u0012\u00028\u0001`\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 RC\u0010'\u001a/\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u001dj\b\u0012\u0004\u0012\u00028\u0001`%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010 R,\u0010*\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u001dj\b\u0012\u0004\u0012\u00028\u0001`(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010 R\u0019\u0010/\u001a\u00020+8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010.R%\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b01008\u0006@\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/huami/training/helper/PagedListBoundaryCallback;", "Vo", "WebBean", "Landroidx/paging/PagedList$BoundaryCallback;", "Lcom/huami/training/vo/ApiResponse;", "apiResponse", "Lcom/huami/training/paging/PagingRequestHelper$Request$Callback;", "it", "", "g", "body", "i", "(Ljava/lang/Object;Lcom/huami/training/paging/PagingRequestHelper$Request$Callback;)V", "onZeroItemsLoaded", "itemAtEnd", "onItemAtEndLoaded", "(Ljava/lang/Object;)V", "Lcom/huami/training/helper/AppExecutors;", "a", "Lcom/huami/training/helper/AppExecutors;", "appExecutors", "Lcom/huami/training/paging/PagingKeyCache;", "b", "Lcom/huami/training/paging/PagingKeyCache;", "pagingKeyCache", "", "c", "Ljava/lang/String;", "pagingKey", "Lkotlin/Function1;", "Lcom/huami/training/helper/PagingKeyParser;", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function1;", "pagingKeyParser", "Lkotlin/ParameterName;", "name", "nextPageKey", "Lcom/huami/training/helper/WebRequest;", "e", "webRequest", "Lcom/huami/training/helper/AppendWebDataToDb;", "f", "handleResponse", "Lcom/huami/training/paging/PagingRequestHelper;", "Lcom/huami/training/paging/PagingRequestHelper;", "getHelper", "()Lcom/huami/training/paging/PagingRequestHelper;", "helper", "Landroidx/lifecycle/LiveData;", "Lcom/huami/training/vo/Resource;", "h", "Landroidx/lifecycle/LiveData;", "getNetworkState", "()Landroidx/lifecycle/LiveData;", "networkState", "<init>", "(Lcom/huami/training/helper/AppExecutors;Lcom/huami/training/paging/PagingKeyCache;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PagedListBoundaryCallback<Vo, WebBean> extends PagedList.BoundaryCallback<Vo> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final PagingKeyCache pagingKeyCache;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String pagingKey;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function1<WebBean, String> pagingKeyParser;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Function1<String, ApiResponse<WebBean>> webRequest;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Function1<WebBean, Unit> handleResponse;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final PagingRequestHelper helper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<Unit>> networkState;

    /* JADX WARN: Multi-variable type inference failed */
    public PagedListBoundaryCallback(@NotNull AppExecutors appExecutors, @NotNull PagingKeyCache pagingKeyCache, @NotNull String str, @NotNull Function1<? super WebBean, String> function1, @NotNull Function1<? super String, ? extends ApiResponse<WebBean>> function2, @NotNull Function1<? super WebBean, Unit> function3) {
        this.appExecutors = appExecutors;
        this.pagingKeyCache = pagingKeyCache;
        this.pagingKey = str;
        this.pagingKeyParser = function1;
        this.webRequest = function2;
        this.handleResponse = function3;
        PagingRequestHelper pagingRequestHelper = new PagingRequestHelper(appExecutors.getDiskIO());
        this.helper = pagingRequestHelper;
        this.networkState = PagingRequestHelperExtKt.createStatusLiveData(pagingRequestHelper);
    }

    private final void g(final ApiResponse<WebBean> apiResponse, final PagingRequestHelper.Request.Callback it2) {
        this.appExecutors.getMainThread().execute(new Runnable() { // from class: sp5
            @Override // java.lang.Runnable
            public final void run() {
                PagedListBoundaryCallback.h(apiResponse, this, it2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(ApiResponse apiResponse, PagedListBoundaryCallback pagedListBoundaryCallback, PagingRequestHelper.Request.Callback callback) {
        if (apiResponse instanceof ApiSuccessResponse) {
            ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) apiResponse;
            pagedListBoundaryCallback.pagingKeyCache.saveKey(pagedListBoundaryCallback.pagingKey, pagedListBoundaryCallback.pagingKeyParser.invoke((WebBean) apiSuccessResponse.getBody()));
            pagedListBoundaryCallback.i(apiSuccessResponse.getBody(), callback);
        } else if (apiResponse instanceof ApiEmptyResponse) {
            callback.recordSuccess();
        } else if (apiResponse instanceof ApiErrorResponse) {
            callback.recordFailure(new Throwable(((ApiErrorResponse) apiResponse).getErrorMessage()));
        }
    }

    private final void i(final WebBean body, final PagingRequestHelper.Request.Callback it2) {
        this.appExecutors.getDiskIO().execute(new Runnable() { // from class: rp5
            @Override // java.lang.Runnable
            public final void run() {
                PagedListBoundaryCallback.j(this.a, body, it2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(PagedListBoundaryCallback pagedListBoundaryCallback, Object obj, PagingRequestHelper.Request.Callback callback) {
        pagedListBoundaryCallback.handleResponse.invoke(obj);
        callback.recordSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(final PagedListBoundaryCallback pagedListBoundaryCallback, final PagingRequestHelper.Request.Callback callback) {
        pagedListBoundaryCallback.appExecutors.getNetworkIO().execute(new Runnable() { // from class: qp5
            @Override // java.lang.Runnable
            public final void run() {
                PagedListBoundaryCallback.l(this.a, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(PagedListBoundaryCallback pagedListBoundaryCallback, PagingRequestHelper.Request.Callback callback) {
        String key = pagedListBoundaryCallback.pagingKeyCache.getKey(pagedListBoundaryCallback.pagingKey);
        if (key != null) {
            pagedListBoundaryCallback.g(pagedListBoundaryCallback.webRequest.invoke(key), callback);
        } else {
            callback.recordSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(final PagedListBoundaryCallback pagedListBoundaryCallback, final PagingRequestHelper.Request.Callback callback) {
        pagedListBoundaryCallback.pagingKeyCache.clearKey(pagedListBoundaryCallback.pagingKey);
        pagedListBoundaryCallback.appExecutors.getNetworkIO().execute(new Runnable() { // from class: pp5
            @Override // java.lang.Runnable
            public final void run() {
                PagedListBoundaryCallback.n(this.a, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(PagedListBoundaryCallback pagedListBoundaryCallback, PagingRequestHelper.Request.Callback callback) {
        pagedListBoundaryCallback.g(pagedListBoundaryCallback.webRequest.invoke(null), callback);
    }

    @NotNull
    public final PagingRequestHelper getHelper() {
        return this.helper;
    }

    @NotNull
    public final LiveData<Resource<Unit>> getNetworkState() {
        return this.networkState;
    }

    @Override // androidx.paging.PagedList.BoundaryCallback
    @MainThread
    public void onItemAtEndLoaded(Vo itemAtEnd) {
        this.helper.runIfNotRunning(PagingRequestHelper.RequestType.AFTER, new PagingRequestHelper.Request() { // from class: fq5
            @Override // com.huami.training.paging.PagingRequestHelper.Request
            public final void run(PagingRequestHelper.Request.Callback callback) {
                PagedListBoundaryCallback.k(this.a, callback);
            }
        });
    }

    @Override // androidx.paging.PagedList.BoundaryCallback
    @MainThread
    public void onZeroItemsLoaded() {
        this.helper.runIfNotRunning(PagingRequestHelper.RequestType.INITIAL, new PagingRequestHelper.Request() { // from class: gq5
            @Override // com.huami.training.paging.PagingRequestHelper.Request
            public final void run(PagingRequestHelper.Request.Callback callback) {
                PagedListBoundaryCallback.m(this.a, callback);
            }
        });
    }
}
