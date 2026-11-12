package com.huami.treadmill.paging;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.treadmill.api.ApiResponse;
import com.huami.treadmill.api.ApiSuccessResponse;
import com.huami.treadmill.api.Callback;
import com.huami.treadmill.data.Items;
import com.huami.treadmill.paging.PagedListBoundaryCallback$createWebserviceCallback$1;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [WebBean] */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/huami/treadmill/paging/PagedListBoundaryCallback$createWebserviceCallback$1", "Lcom/huami/treadmill/api/Callback;", "Lcom/huami/treadmill/api/ApiResponse;", AbstractJSONTokenResponse.RESPONSE, "", "onResponse", "", "message", "onFailure", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class PagedListBoundaryCallback$createWebserviceCallback$1<WebBean> implements Callback<WebBean> {
    public final /* synthetic */ PagedListBoundaryCallback<T, WebBean> a;
    public final /* synthetic */ PagingRequestHelper.Request.Callback b;

    public PagedListBoundaryCallback$createWebserviceCallback$1(PagedListBoundaryCallback<T, WebBean> pagedListBoundaryCallback, PagingRequestHelper.Request.Callback callback) {
        this.a = pagedListBoundaryCallback;
        this.b = callback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ApiResponse apiResponse, PagedListBoundaryCallback pagedListBoundaryCallback, PagingRequestHelper.Request.Callback callback) {
        if (!(apiResponse instanceof ApiSuccessResponse)) {
            callback.recordSuccess();
            return;
        }
        ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) apiResponse;
        String next = ((Items) apiSuccessResponse.getBody()).getNext();
        if (next == null) {
            next = "";
        }
        pagedListBoundaryCallback.nextPageKey = next;
        pagedListBoundaryCallback.g(apiSuccessResponse, callback);
    }

    @Override // com.huami.treadmill.api.Callback
    public void onFailure(@NotNull String message) {
        this.b.recordFailure(new Throwable(message));
    }

    @Override // com.huami.treadmill.api.Callback
    public void onResponse(@NotNull final ApiResponse<WebBean> response) {
        Executor executor = ((PagedListBoundaryCallback) this.a).ioExecutor;
        final PagedListBoundaryCallback<T, WebBean> pagedListBoundaryCallback = this.a;
        final PagingRequestHelper.Request.Callback callback = this.b;
        executor.execute(new Runnable() { // from class: hq5
            @Override // java.lang.Runnable
            public final void run() {
                PagedListBoundaryCallback$createWebserviceCallback$1.b(response, pagedListBoundaryCallback, callback);
            }
        });
    }
}
