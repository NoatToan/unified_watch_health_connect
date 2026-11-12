package com.huami.sleepassistant.apilib.utils;

import androidx.annotation.MainThread;
import androidx.p008lifecycle.LiveData;
import androidx.paging.PagedList;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.sleepassistant.apilib.bean.Items;
import com.huami.sleepassistant.apilib.bean.MusicBean;
import com.huami.sleepassistant.apilib.helper.AppExecutors;
import com.huami.sleepassistant.apilib.helper.PagingKey;
import com.huami.sleepassistant.apilib.helper.PagingKeyCache;
import com.huami.sleepassistant.apilib.helper.PagingRequestHelper;
import com.huami.sleepassistant.apilib.repo.SleepAssistantWebApi;
import com.huami.sleepassistant.apilib.utils.MusicControlCallback;
import com.huami.sleepassistant.apilib.utils.ext.PagingRequestHelperExtKt;
import com.huami.sleepassistant.apilib.vo.ApiEmptyResponse;
import com.huami.sleepassistant.apilib.vo.ApiErrorResponse;
import com.huami.sleepassistant.apilib.vo.ApiResponse;
import com.huami.sleepassistant.apilib.vo.ApiSuccessResponse;
import com.huami.sleepassistant.apilib.vo.MusicVo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BJ\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012)\u0010#\u001a%\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\t0\u001d¢\u0006\u0004\b1\u00102J$\u0010\n\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J \u0010\r\u001a\u00020\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000e\u001a\u00020\tH\u0017J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0017R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR9\u0010#\u001a%\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\t0\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0019\u0010)\u001a\u00020$8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R%\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0+0*8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/huami/sleepassistant/apilib/utils/MusicControlCallback;", "Landroidx/paging/PagedList$BoundaryCallback;", "Lcom/huami/sleepassistant/apilib/vo/MusicVo;", "Lcom/huami/sleepassistant/apilib/vo/ApiResponse;", "Lcom/huami/sleepassistant/apilib/bean/Items;", "Lcom/huami/sleepassistant/apilib/bean/MusicBean;", "apiResponse", "Lcom/huami/sleepassistant/apilib/helper/PagingRequestHelper$Request$Callback;", "it", "", "g", "", "items", "i", "onZeroItemsLoaded", "itemAtEnd", "onItemAtEndLoaded", "Lcom/huami/sleepassistant/apilib/helper/AppExecutors;", "a", "Lcom/huami/sleepassistant/apilib/helper/AppExecutors;", "appExecutors", "Lcom/huami/sleepassistant/apilib/repo/SleepAssistantWebApi;", "b", "Lcom/huami/sleepassistant/apilib/repo/SleepAssistantWebApi;", "webApi", "Lcom/huami/sleepassistant/apilib/helper/PagingKeyCache;", "c", "Lcom/huami/sleepassistant/apilib/helper/PagingKeyCache;", "pagingKeyCache", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "body", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function1;", "handleResponse", "Lcom/huami/sleepassistant/apilib/helper/PagingRequestHelper;", "e", "Lcom/huami/sleepassistant/apilib/helper/PagingRequestHelper;", "getHelper", "()Lcom/huami/sleepassistant/apilib/helper/PagingRequestHelper;", "helper", "Landroidx/lifecycle/LiveData;", "Lcom/huami/android/vo/Resource;", "f", "Landroidx/lifecycle/LiveData;", "getNetworkState", "()Landroidx/lifecycle/LiveData;", "networkState", "<init>", "(Lcom/huami/sleepassistant/apilib/helper/AppExecutors;Lcom/huami/sleepassistant/apilib/repo/SleepAssistantWebApi;Lcom/huami/sleepassistant/apilib/helper/PagingKeyCache;Lkotlin/jvm/functions/Function1;)V", "apilib_release"}, k = 1, mv = {1, 5, 1})
public final class MusicControlCallback extends PagedList.BoundaryCallback<MusicVo> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SleepAssistantWebApi webApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final PagingKeyCache pagingKeyCache;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function1<List<MusicBean>, Unit> handleResponse;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final PagingRequestHelper helper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<Unit>> networkState;

    /* JADX WARN: Multi-variable type inference failed */
    public MusicControlCallback(@NotNull AppExecutors appExecutors, @NotNull SleepAssistantWebApi sleepAssistantWebApi, @NotNull PagingKeyCache pagingKeyCache, @NotNull Function1<? super List<MusicBean>, Unit> function1) {
        this.appExecutors = appExecutors;
        this.webApi = sleepAssistantWebApi;
        this.pagingKeyCache = pagingKeyCache;
        this.handleResponse = function1;
        PagingRequestHelper pagingRequestHelper = new PagingRequestHelper(appExecutors.getDiskIO());
        this.helper = pagingRequestHelper;
        this.networkState = PagingRequestHelperExtKt.createStatusLiveData(pagingRequestHelper);
    }

    private final void g(final ApiResponse<Items<MusicBean>> apiResponse, final PagingRequestHelper.Request.Callback it2) {
        this.appExecutors.getMainThread().execute(new Runnable() { // from class: z95
            @Override // java.lang.Runnable
            public final void run() {
                MusicControlCallback.h(apiResponse, this, it2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(ApiResponse apiResponse, MusicControlCallback musicControlCallback, PagingRequestHelper.Request.Callback callback) {
        if (apiResponse instanceof ApiSuccessResponse) {
            ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) apiResponse;
            if (apiSuccessResponse.getBody() == null) {
                callback.recordFailure(new Throwable());
                return;
            } else {
                musicControlCallback.pagingKeyCache.saveKey(PagingKey.MUSIC, ((Items) apiSuccessResponse.getBody()).getNext());
                musicControlCallback.i(((Items) apiSuccessResponse.getBody()).getItems(), callback);
                return;
            }
        }
        if (apiResponse instanceof ApiEmptyResponse) {
            callback.recordSuccess();
        } else if (apiResponse instanceof ApiErrorResponse) {
            callback.recordFailure(new Throwable(((ApiErrorResponse) apiResponse).getErrorMessage()));
        }
    }

    private final void i(final List<MusicBean> items, final PagingRequestHelper.Request.Callback it2) {
        this.appExecutors.getDiskIO().execute(new Runnable() { // from class: y95
            @Override // java.lang.Runnable
            public final void run() {
                MusicControlCallback.j(this.a, items, it2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(MusicControlCallback musicControlCallback, List list, PagingRequestHelper.Request.Callback callback) {
        musicControlCallback.handleResponse.invoke(list);
        callback.recordSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(final MusicControlCallback musicControlCallback, final PagingRequestHelper.Request.Callback callback) {
        final String key = musicControlCallback.pagingKeyCache.getKey(PagingKey.MUSIC);
        if (key != null) {
            musicControlCallback.appExecutors.getNetworkIO().execute(new Runnable() { // from class: x95
                @Override // java.lang.Runnable
                public final void run() {
                    MusicControlCallback.l(this.a, key, callback);
                }
            });
        } else {
            callback.recordSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(MusicControlCallback musicControlCallback, String str, PagingRequestHelper.Request.Callback callback) {
        musicControlCallback.g(musicControlCallback.webApi.loadMusic(str, 1000), callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(final MusicControlCallback musicControlCallback, final PagingRequestHelper.Request.Callback callback) {
        musicControlCallback.pagingKeyCache.clearKey(PagingKey.MUSIC);
        musicControlCallback.appExecutors.getNetworkIO().execute(new Runnable() { // from class: w95
            @Override // java.lang.Runnable
            public final void run() {
                MusicControlCallback.n(this.a, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(MusicControlCallback musicControlCallback, PagingRequestHelper.Request.Callback callback) {
        musicControlCallback.g(SleepAssistantWebApi.DefaultImpls.loadMusic$default(musicControlCallback.webApi, null, 1000, 1, null), callback);
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
    public void onZeroItemsLoaded() {
        this.helper.runIfNotRunning(PagingRequestHelper.RequestType.INITIAL, new PagingRequestHelper.Request() { // from class: v95
            @Override // com.huami.sleepassistant.apilib.helper.PagingRequestHelper.Request
            public final void run(PagingRequestHelper.Request.Callback callback) {
                MusicControlCallback.m(this.a, callback);
            }
        });
    }

    @Override // androidx.paging.PagedList.BoundaryCallback
    @MainThread
    public void onItemAtEndLoaded(@NotNull MusicVo itemAtEnd) {
        this.helper.runIfNotRunning(PagingRequestHelper.RequestType.AFTER, new PagingRequestHelper.Request() { // from class: u95
            @Override // com.huami.sleepassistant.apilib.helper.PagingRequestHelper.Request
            public final void run(PagingRequestHelper.Request.Callback callback) {
                MusicControlCallback.k(this.a, callback);
            }
        });
    }
}
