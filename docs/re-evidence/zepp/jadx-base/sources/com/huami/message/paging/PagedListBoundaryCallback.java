package com.huami.message.paging;

import androidx.annotation.MainThread;
import androidx.p008lifecycle.LiveData;
import androidx.paging.PagedList;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.ApiEmptyResponse;
import com.huami.android.vo.ApiErrorResponse;
import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.huami.android.vo.Resource;
import com.huami.message.paging.PagedListBoundaryCallback;
import com.huami.message.paging.PagingRequestHelper;
import com.huami.message.util.AppExecutors;
import com.loc.z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003Bç\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u001e\u0010*\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00040&j\b\u0012\u0004\u0012\u00028\u0001`'\u00123\u0010-\u001a/\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0&j\b\u0012\u0004\u0012\u00028\u0001`+\u0012H\b\u0002\u0010\u000f\u001aB\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00028\u0001\u0018\u00010\nj\n\u0012\u0004\u0012\u00028\u0001\u0018\u0001`\u000e\u0012\u001c\u00102\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00120&j\b\u0012\u0004\u0012\u00028\u0001`0\u0012\u0018\b\u0002\u00104\u001a\u0012\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010&\u0012'\b\u0002\u00106\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(5\u0012\u0004\u0012\u00020\u0012\u0018\u00010&\u0012\u0016\b\u0002\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u000107j\u0004\u0018\u0001`8\u0012\u0016\b\u0002\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u000107j\u0004\u0018\u0001`<\u0012\u0016\b\u0002\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u000107j\u0004\u0018\u0001`?¢\u0006\u0004\bN\u0010OJz\u0010\u0013\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b2H\b\u0002\u0010\u000f\u001aB\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00028\u0001\u0018\u00010\nj\n\u0012\u0004\u0012\u00028\u0001\u0018\u0001`\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0017J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R.\u0010*\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00040&j\b\u0012\u0004\u0012\u00028\u0001`'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)RC\u0010-\u001a/\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0&j\b\u0012\u0004\u0012\u00028\u0001`+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)RV\u0010\u000f\u001aB\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00028\u0001\u0018\u00010\nj\n\u0012\u0004\u0012\u00028\u0001\u0018\u0001`\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R,\u00102\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00120&j\b\u0012\u0004\u0012\u00028\u0001`08\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010)R&\u00104\u001a\u0012\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010)R5\u00106\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(5\u0012\u0004\u0012\u00020\u0012\u0018\u00010&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010)R$\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u000107j\u0004\u0018\u0001`88\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R$\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u000107j\u0004\u0018\u0001`<8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010:R$\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u000107j\u0004\u0018\u0001`?8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010:R\u0019\u0010F\u001a\u00020B8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010C\u001a\u0004\bD\u0010ER%\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120H0G8\u0006@\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006P"}, d2 = {"Lcom/huami/message/paging/PagedListBoundaryCallback;", "Vo", "WebBean", "Landroidx/paging/PagedList$BoundaryCallback;", "", "nextPageKey", "", "isZeroItemsLoaded", "Lcom/huami/android/vo/ApiResponse;", "apiResponse", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "webBean", "Lcom/huami/message/paging/MapResponse;", "mapResponse", "Lcom/huami/message/paging/PagingRequestHelper$Request$Callback;", "it", "", "i", "body", "m", "(Ljava/lang/Object;Lcom/huami/message/paging/PagingRequestHelper$Request$Callback;)V", "onZeroItemsLoaded", "itemAtEnd", "onItemAtEndLoaded", "(Ljava/lang/Object;)V", "Lcom/huami/message/util/AppExecutors;", "a", "Lcom/huami/message/util/AppExecutors;", "appExecutors", "Lcom/huami/message/paging/PagingKeyCache;", "b", "Lcom/huami/message/paging/PagingKeyCache;", "pagingKeyCache", "c", "Ljava/lang/String;", "pagingKey", "Lkotlin/Function1;", "Lcom/huami/message/paging/PagingKeyParser;", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function1;", "pagingKeyParser", "Lcom/huami/message/paging/WebRequest;", "e", "webRequest", "f", "Lkotlin/jvm/functions/Function2;", "Lcom/huami/message/paging/AppendWebDataToDb;", "g", "handleResponse", "h", "algorithmParser", "algorithm", "onLoadData", "Lkotlin/Function0;", "Lcom/huami/message/paging/LoadEmptyData;", z.j, "Lkotlin/jvm/functions/Function0;", "loadEmptyData", "Lcom/huami/message/paging/LoadMoreFinishedData;", hl.k, "loadMoreFinishedData", "Lcom/huami/message/paging/LoadFirstPagingError;", "l", "loadFirstPagingError", "Lcom/huami/message/paging/PagingRequestHelper;", "Lcom/huami/message/paging/PagingRequestHelper;", "getHelper", "()Lcom/huami/message/paging/PagingRequestHelper;", "helper", "Landroidx/lifecycle/LiveData;", "Lcom/huami/android/vo/Resource;", GoogleApiAvailabilityLight.b, "Landroidx/lifecycle/LiveData;", "getNetworkState", "()Landroidx/lifecycle/LiveData;", "networkState", "<init>", "(Lcom/huami/message/util/AppExecutors;Lcom/huami/message/paging/PagingKeyCache;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "common-message_release"}, k = 1, mv = {1, 5, 1})
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
    @Nullable
    private final Function2<String, WebBean, WebBean> mapResponse;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Function1<WebBean, Unit> handleResponse;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private final Function1<WebBean, String> algorithmParser;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private final Function1<String, Unit> onLoadData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private final Function0<Unit> loadEmptyData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private final Function0<Unit> loadMoreFinishedData;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private final Function0<Unit> loadFirstPagingError;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final PagingRequestHelper helper;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<Unit>> networkState;

    public /* synthetic */ PagedListBoundaryCallback(AppExecutors appExecutors, PagingKeyCache pagingKeyCache, String str, Function1 function1, Function1 function2, Function2 function3, Function1 function4, Function1 function5, Function1 function6, Function0 function0, Function0 function7, Function0 function8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(appExecutors, pagingKeyCache, str, function1, function2, (i & 32) != 0 ? null : function3, function4, (i & 128) != 0 ? null : function5, (i & 256) != 0 ? null : function6, (i & 512) != 0 ? null : function0, (i & 1024) != 0 ? null : function7, (i & 2048) != 0 ? null : function8);
    }

    private final void i(final String nextPageKey, final boolean isZeroItemsLoaded, final ApiResponse<WebBean> apiResponse, final Function2<? super String, ? super WebBean, ? extends WebBean> mapResponse, final PagingRequestHelper.Request.Callback it2) {
        this.appExecutors.getMainThread().execute(new Runnable() { // from class: zp5
            @Override // java.lang.Runnable
            public final void run() {
                PagedListBoundaryCallback.k(apiResponse, this, isZeroItemsLoaded, it2, mapResponse, nextPageKey);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(PagedListBoundaryCallback pagedListBoundaryCallback, String str, boolean z, ApiResponse apiResponse, Function2 function2, PagingRequestHelper.Request.Callback callback, int i, Object obj) {
        if ((i & 8) != 0) {
            function2 = null;
        }
        pagedListBoundaryCallback.i(str, z, apiResponse, function2, callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(final ApiResponse apiResponse, final PagedListBoundaryCallback pagedListBoundaryCallback, boolean z, final PagingRequestHelper.Request.Callback callback, final Function2 function2, final String str) {
        if (apiResponse instanceof ApiSuccessResponse) {
            pagedListBoundaryCallback.appExecutors.getNetworkIO().execute(new Runnable() { // from class: aq5
                @Override // java.lang.Runnable
                public final void run() {
                    PagedListBoundaryCallback.l(apiResponse, function2, str, pagedListBoundaryCallback, callback);
                }
            });
            return;
        }
        if (apiResponse instanceof ApiEmptyResponse) {
            if (z) {
                Function0<Unit> function0 = pagedListBoundaryCallback.loadEmptyData;
                if (function0 != null) {
                    function0.invoke();
                }
                callback.recordSuccess();
                return;
            }
            return;
        }
        if ((apiResponse instanceof ApiErrorResponse) && z) {
            Function0<Unit> function1 = pagedListBoundaryCallback.loadFirstPagingError;
            if (function1 != null) {
                function1.invoke();
            }
            callback.recordFailure(new Throwable(((ApiErrorResponse) apiResponse).getErrorMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(ApiResponse apiResponse, Function2 function2, String str, PagedListBoundaryCallback pagedListBoundaryCallback, PagingRequestHelper.Request.Callback callback) {
        Object body = ((ApiSuccessResponse) apiResponse).getBody();
        if (function2 != null) {
            body = function2.invoke(str, body);
        }
        pagedListBoundaryCallback.pagingKeyCache.saveKey(pagedListBoundaryCallback.pagingKey, pagedListBoundaryCallback.pagingKeyParser.invoke((WebBean) body));
        pagedListBoundaryCallback.m(body, callback);
        Function1<String, Unit> function1 = pagedListBoundaryCallback.onLoadData;
        if (function1 == null) {
            return;
        }
        Function1<WebBean, String> function3 = pagedListBoundaryCallback.algorithmParser;
        function1.invoke(function3 == null ? null : function3.invoke((WebBean) body));
    }

    private final void m(final WebBean body, final PagingRequestHelper.Request.Callback it2) {
        this.appExecutors.getDiskIO().execute(new Runnable() { // from class: eq5
            @Override // java.lang.Runnable
            public final void run() {
                PagedListBoundaryCallback.n(this.a, body, it2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(PagedListBoundaryCallback pagedListBoundaryCallback, Object obj, PagingRequestHelper.Request.Callback callback) {
        pagedListBoundaryCallback.handleResponse.invoke(obj);
        callback.recordSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(final PagedListBoundaryCallback pagedListBoundaryCallback, final PagingRequestHelper.Request.Callback callback) {
        pagedListBoundaryCallback.appExecutors.getNetworkIO().execute(new Runnable() { // from class: dq5
            @Override // java.lang.Runnable
            public final void run() {
                PagedListBoundaryCallback.p(this.a, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(final PagedListBoundaryCallback pagedListBoundaryCallback, final PagingRequestHelper.Request.Callback callback) {
        String key = pagedListBoundaryCallback.pagingKeyCache.getKey(pagedListBoundaryCallback.pagingKey);
        if (key != null) {
            pagedListBoundaryCallback.i(key, false, pagedListBoundaryCallback.webRequest.invoke(key), pagedListBoundaryCallback.mapResponse, callback);
        } else {
            pagedListBoundaryCallback.appExecutors.getMainThread().execute(new Runnable() { // from class: bq5
                @Override // java.lang.Runnable
                public final void run() {
                    PagedListBoundaryCallback.q(this.a, callback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(PagedListBoundaryCallback pagedListBoundaryCallback, PagingRequestHelper.Request.Callback callback) {
        Function0<Unit> function0 = pagedListBoundaryCallback.loadMoreFinishedData;
        if (function0 != null) {
            function0.invoke();
        }
        callback.recordSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(final PagedListBoundaryCallback pagedListBoundaryCallback, final PagingRequestHelper.Request.Callback callback) {
        pagedListBoundaryCallback.pagingKeyCache.clearKey(pagedListBoundaryCallback.pagingKey);
        pagedListBoundaryCallback.appExecutors.getNetworkIO().execute(new Runnable() { // from class: cq5
            @Override // java.lang.Runnable
            public final void run() {
                PagedListBoundaryCallback.s(this.a, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(PagedListBoundaryCallback pagedListBoundaryCallback, PagingRequestHelper.Request.Callback callback) {
        pagedListBoundaryCallback.i(null, true, pagedListBoundaryCallback.webRequest.invoke(null), pagedListBoundaryCallback.mapResponse, callback);
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
        this.helper.runIfNotRunning(PagingRequestHelper.RequestType.AFTER, new PagingRequestHelper.Request() { // from class: yp5
            @Override // com.huami.message.paging.PagingRequestHelper.Request
            public final void run(PagingRequestHelper.Request.Callback callback) {
                PagedListBoundaryCallback.o(this.a, callback);
            }
        });
    }

    @Override // androidx.paging.PagedList.BoundaryCallback
    @MainThread
    public void onZeroItemsLoaded() {
        this.helper.runIfNotRunning(PagingRequestHelper.RequestType.INITIAL, new PagingRequestHelper.Request() { // from class: op5
            @Override // com.huami.message.paging.PagingRequestHelper.Request
            public final void run(PagingRequestHelper.Request.Callback callback) {
                PagedListBoundaryCallback.r(this.a, callback);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PagedListBoundaryCallback(@NotNull AppExecutors appExecutors, @NotNull PagingKeyCache pagingKeyCache, @NotNull String str, @NotNull Function1<? super WebBean, String> function1, @NotNull Function1<? super String, ? extends ApiResponse<WebBean>> function2, @Nullable Function2<? super String, ? super WebBean, ? extends WebBean> function3, @NotNull Function1<? super WebBean, Unit> function4, @Nullable Function1<? super WebBean, String> function5, @Nullable Function1<? super String, Unit> function6, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function7, @Nullable Function0<Unit> function8) {
        this.appExecutors = appExecutors;
        this.pagingKeyCache = pagingKeyCache;
        this.pagingKey = str;
        this.pagingKeyParser = function1;
        this.webRequest = function2;
        this.mapResponse = function3;
        this.handleResponse = function4;
        this.algorithmParser = function5;
        this.onLoadData = function6;
        this.loadEmptyData = function0;
        this.loadMoreFinishedData = function7;
        this.loadFirstPagingError = function8;
        PagingRequestHelper pagingRequestHelper = new PagingRequestHelper(appExecutors.getDiskIO());
        this.helper = pagingRequestHelper;
        this.networkState = PagingRequestHelperExtKt.createStatusLiveData(pagingRequestHelper);
    }
}
