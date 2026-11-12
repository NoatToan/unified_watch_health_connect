package com.huami.treadmill.paging;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.paging.PagedList;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.treadmill.api.ApiResponse;
import com.huami.treadmill.api.ApiResponseKt;
import com.huami.treadmill.api.ApiSuccessResponse;
import com.huami.treadmill.api.Callback;
import com.huami.treadmill.data.Items;
import com.huami.treadmill.data.NetworkState;
import com.huami.treadmill.paging.PagedListBoundaryCallback;
import com.huami.treadmill.paging.PagingRequestHelper;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0084\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\"\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0017j\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011`\u0018\u0012)\u0010#\u001a%\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 0\u001c\u0012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000b0\u001c\u0012\u0006\u0010(\u001a\u00020&¢\u0006\u0004\b6\u00107J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R2\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0017j\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011`\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR9\u0010#\u001a%\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000b0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R\u0019\u0010-\u001a\u00020)8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u001f\u00104\u001a\b\u0012\u0004\u0012\u00020/0.8\u0006@\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0016\u0010\u001f\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u0010\u0013¨\u00068"}, d2 = {"Lcom/huami/treadmill/paging/PagedListBoundaryCallback;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/treadmill/data/Items;", "WebBean", "Landroidx/paging/PagedList$BoundaryCallback;", "Lcom/huami/treadmill/paging/PagingRequestHelper$Request$Callback;", "it", "Lcom/huami/treadmill/api/Callback;", "f", "Lcom/huami/treadmill/api/ApiSuccessResponse;", AbstractJSONTokenResponse.RESPONSE, "", "g", "onZeroItemsLoaded", "itemAtEnd", "onItemAtEndLoaded", "(Ljava/lang/Object;)V", "", "a", "Ljava/lang/String;", "currentkey", "b", "nextKey", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "c", "Ljava/util/HashMap;", "cache", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "nextPageKey", "Lcom/huami/treadmill/api/ApiResponse;", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function1;", "webRequest", "e", "handleResponse", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "ioExecutor", "Lcom/huami/treadmill/paging/PagingRequestHelper;", "Lcom/huami/treadmill/paging/PagingRequestHelper;", "getHelper", "()Lcom/huami/treadmill/paging/PagingRequestHelper;", "helper", "Landroidx/lifecycle/LiveData;", "Lcom/huami/treadmill/data/NetworkState;", "h", "Landroidx/lifecycle/LiveData;", "getNetworkState", "()Landroidx/lifecycle/LiveData;", "networkState", "i", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/util/concurrent/Executor;)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class PagedListBoundaryCallback<T, WebBean extends Items<T>> extends PagedList.BoundaryCallback<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String currentkey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final String nextKey;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HashMap<String, String> cache;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function1<String, ApiResponse<WebBean>> webRequest;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Function1<WebBean, Unit> handleResponse;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Executor ioExecutor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final PagingRequestHelper helper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final LiveData<NetworkState> networkState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private String nextPageKey;

    /* JADX WARN: Multi-variable type inference failed */
    public PagedListBoundaryCallback(@NotNull String str, @Nullable String str2, @NotNull HashMap<String, String> map, @NotNull Function1<? super String, ? extends ApiResponse<WebBean>> function1, @NotNull Function1<? super WebBean, Unit> function2, @NotNull Executor executor) {
        this.currentkey = str;
        this.nextKey = str2;
        this.cache = map;
        this.webRequest = function1;
        this.handleResponse = function2;
        this.ioExecutor = executor;
        PagingRequestHelper pagingRequestHelper = new PagingRequestHelper(executor);
        this.helper = pagingRequestHelper;
        this.networkState = PagingRequestHelperExtKt.createStatusLiveData(pagingRequestHelper);
    }

    private final Callback<WebBean> f(PagingRequestHelper.Request.Callback it2) {
        return new PagedListBoundaryCallback$createWebserviceCallback$1(this, it2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(final ApiSuccessResponse<WebBean> response, final PagingRequestHelper.Request.Callback it2) {
        this.ioExecutor.execute(new Runnable() { // from class: vp5
            @Override // java.lang.Runnable
            public final void run() {
                PagedListBoundaryCallback.h(this.a, response, it2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(PagedListBoundaryCallback pagedListBoundaryCallback, ApiSuccessResponse apiSuccessResponse, PagingRequestHelper.Request.Callback callback) {
        pagedListBoundaryCallback.handleResponse.invoke((WebBean) apiSuccessResponse.getBody());
        callback.recordSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(final PagedListBoundaryCallback pagedListBoundaryCallback, final PagingRequestHelper.Request.Callback callback) {
        if (pagedListBoundaryCallback.nextPageKey == null) {
            String str = pagedListBoundaryCallback.cache.get(pagedListBoundaryCallback.nextKey);
            if (str == null) {
                str = "";
            }
            pagedListBoundaryCallback.nextPageKey = str;
        }
        String str2 = pagedListBoundaryCallback.nextPageKey;
        Objects.requireNonNull(str2);
        if (str2.length() > 0) {
            pagedListBoundaryCallback.ioExecutor.execute(new Runnable() { // from class: xp5
                @Override // java.lang.Runnable
                public final void run() {
                    PagedListBoundaryCallback.j(this.a, callback);
                }
            });
        } else {
            callback.recordSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(PagedListBoundaryCallback pagedListBoundaryCallback, PagingRequestHelper.Request.Callback callback) {
        Function1<String, ApiResponse<WebBean>> function1 = pagedListBoundaryCallback.webRequest;
        String str = pagedListBoundaryCallback.nextPageKey;
        Objects.requireNonNull(str);
        ApiResponseKt.enqueue(function1.invoke(str), pagedListBoundaryCallback.f(callback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(final PagedListBoundaryCallback pagedListBoundaryCallback, final PagingRequestHelper.Request.Callback callback) {
        pagedListBoundaryCallback.ioExecutor.execute(new Runnable() { // from class: wp5
            @Override // java.lang.Runnable
            public final void run() {
                PagedListBoundaryCallback.l(this.a, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(PagedListBoundaryCallback pagedListBoundaryCallback, PagingRequestHelper.Request.Callback callback) {
        ApiResponseKt.enqueue(pagedListBoundaryCallback.webRequest.invoke(pagedListBoundaryCallback.currentkey), pagedListBoundaryCallback.f(callback));
    }

    @NotNull
    public final PagingRequestHelper getHelper() {
        return this.helper;
    }

    @NotNull
    public final LiveData<NetworkState> getNetworkState() {
        return this.networkState;
    }

    @Override // androidx.paging.PagedList.BoundaryCallback
    public void onItemAtEndLoaded(T itemAtEnd) {
        this.helper.runIfNotRunning(PagingRequestHelper.RequestType.AFTER, new PagingRequestHelper.Request() { // from class: up5
            @Override // com.huami.treadmill.paging.PagingRequestHelper.Request
            public final void run(PagingRequestHelper.Request.Callback callback) {
                PagedListBoundaryCallback.i(this.a, callback);
            }
        });
    }

    @Override // androidx.paging.PagedList.BoundaryCallback
    public void onZeroItemsLoaded() {
        this.nextPageKey = "";
        this.helper.runIfNotRunning(PagingRequestHelper.RequestType.INITIAL, new PagingRequestHelper.Request() { // from class: tp5
            @Override // com.huami.treadmill.paging.PagingRequestHelper.Request
            public final void run(PagingRequestHelper.Request.Callback callback) {
                PagedListBoundaryCallback.k(this.a, callback);
            }
        });
    }
}
