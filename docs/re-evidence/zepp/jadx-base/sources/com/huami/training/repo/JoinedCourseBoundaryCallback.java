package com.huami.training.repo;

import androidx.annotation.MainThread;
import androidx.p008lifecycle.LiveData;
import androidx.paging.PagedList;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.api.TrainingWebApi;
import com.huami.training.api.pojo.Items;
import com.huami.training.api.pojo.JoinedTrainingBean;
import com.huami.training.dto.Trainer;
import com.huami.training.ext.PagingRequestHelperExtKt;
import com.huami.training.helper.AppExecutors;
import com.huami.training.paging.PagingKeyHelper;
import com.huami.training.paging.PagingRequestHelper;
import com.huami.training.repo.JoinedCourseBoundaryCallback;
import com.huami.training.vo.ApiEmptyResponse;
import com.huami.training.vo.ApiErrorResponse;
import com.huami.training.vo.ApiResponse;
import com.huami.training.vo.ApiSuccessResponse;
import com.huami.training.vo.JoinedCourseVo;
import com.huami.training.vo.Resource;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BR\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012)\u0010\u001f\u001a%\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\b0\u0019\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b4\u00105J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J$\u0010\r\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\bH\u0017J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0017R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R9\u0010\u001f\u001a%\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\b0\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0019\u0010-\u001a\u00020(8\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R%\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0/0.8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/huami/training/repo/JoinedCourseBoundaryCallback;", "Landroidx/paging/PagedList$BoundaryCallback;", "Lcom/huami/training/vo/JoinedCourseVo;", "", "Lcom/huami/training/api/pojo/JoinedTrainingBean;", "items", "Lcom/huami/training/paging/PagingRequestHelper$Request$Callback;", "it", "", "i", "Lcom/huami/training/vo/ApiResponse;", "Lcom/huami/training/api/pojo/Items;", "apiResponse", "g", "onZeroItemsLoaded", "itemAtEnd", "onItemAtEndLoaded", "Lcom/huami/training/api/TrainingWebApi;", "a", "Lcom/huami/training/api/TrainingWebApi;", "webApi", "Lcom/huami/training/dto/Trainer;", "b", "Lcom/huami/training/dto/Trainer;", "trainer", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "body", "c", "Lkotlin/jvm/functions/Function1;", "handleResponse", "Lcom/huami/training/helper/AppExecutors;", GoogleApiAvailabilityLight.a, "Lcom/huami/training/helper/AppExecutors;", "appExecutors", "Lcom/huami/training/paging/PagingKeyHelper;", "e", "Lcom/huami/training/paging/PagingKeyHelper;", "pagingKeyHelper", "Lcom/huami/training/paging/PagingRequestHelper;", "f", "Lcom/huami/training/paging/PagingRequestHelper;", "getHelper", "()Lcom/huami/training/paging/PagingRequestHelper;", "helper", "Landroidx/lifecycle/LiveData;", "Lcom/huami/training/vo/Resource;", "Landroidx/lifecycle/LiveData;", "getNetworkState", "()Landroidx/lifecycle/LiveData;", "networkState", "<init>", "(Lcom/huami/training/api/TrainingWebApi;Lcom/huami/training/dto/Trainer;Lkotlin/jvm/functions/Function1;Lcom/huami/training/helper/AppExecutors;Lcom/huami/training/paging/PagingKeyHelper;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class JoinedCourseBoundaryCallback extends PagedList.BoundaryCallback<JoinedCourseVo> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final TrainingWebApi webApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Trainer trainer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function1<List<JoinedTrainingBean>, Unit> handleResponse;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final PagingKeyHelper pagingKeyHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final PagingRequestHelper helper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<Unit>> networkState;

    /* JADX WARN: Multi-variable type inference failed */
    public JoinedCourseBoundaryCallback(@NotNull TrainingWebApi trainingWebApi, @NotNull Trainer trainer, @NotNull Function1<? super List<JoinedTrainingBean>, Unit> function1, @NotNull AppExecutors appExecutors, @NotNull PagingKeyHelper pagingKeyHelper) {
        this.webApi = trainingWebApi;
        this.trainer = trainer;
        this.handleResponse = function1;
        this.appExecutors = appExecutors;
        this.pagingKeyHelper = pagingKeyHelper;
        PagingRequestHelper pagingRequestHelper = new PagingRequestHelper(appExecutors.getDiskIO());
        this.helper = pagingRequestHelper;
        this.networkState = PagingRequestHelperExtKt.createStatusLiveData(pagingRequestHelper);
    }

    private final void g(final ApiResponse<Items<JoinedTrainingBean>> apiResponse, final PagingRequestHelper.Request.Callback it2) {
        this.appExecutors.getMainThread().execute(new Runnable() { // from class: wi4
            @Override // java.lang.Runnable
            public final void run() {
                JoinedCourseBoundaryCallback.h(apiResponse, this, it2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(ApiResponse apiResponse, JoinedCourseBoundaryCallback joinedCourseBoundaryCallback, PagingRequestHelper.Request.Callback callback) {
        if (apiResponse instanceof ApiSuccessResponse) {
            ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) apiResponse;
            joinedCourseBoundaryCallback.pagingKeyHelper.setPagingKey(((Items) apiSuccessResponse.getBody()).getNext());
            joinedCourseBoundaryCallback.i(((Items) apiSuccessResponse.getBody()).getItems(), callback);
        } else if (apiResponse instanceof ApiEmptyResponse) {
            callback.recordSuccess();
        } else if (apiResponse instanceof ApiErrorResponse) {
            callback.recordFailure(new Throwable(((ApiErrorResponse) apiResponse).getErrorMessage()));
        }
    }

    private final void i(final List<JoinedTrainingBean> items, final PagingRequestHelper.Request.Callback it2) {
        this.appExecutors.getDiskIO().execute(new Runnable() { // from class: vi4
            @Override // java.lang.Runnable
            public final void run() {
                JoinedCourseBoundaryCallback.j(this.a, items, it2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(JoinedCourseBoundaryCallback joinedCourseBoundaryCallback, List list, PagingRequestHelper.Request.Callback callback) {
        joinedCourseBoundaryCallback.handleResponse.invoke(list);
        callback.recordSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(final JoinedCourseBoundaryCallback joinedCourseBoundaryCallback, final PagingRequestHelper.Request.Callback callback) {
        final Long pagingKey = joinedCourseBoundaryCallback.pagingKeyHelper.getPagingKey();
        if (pagingKey != null) {
            joinedCourseBoundaryCallback.appExecutors.getNetworkIO().execute(new Runnable() { // from class: ui4
                @Override // java.lang.Runnable
                public final void run() {
                    JoinedCourseBoundaryCallback.l(this.a, pagingKey, callback);
                }
            });
        } else {
            callback.recordSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(JoinedCourseBoundaryCallback joinedCourseBoundaryCallback, Long l, PagingRequestHelper.Request.Callback callback) {
        joinedCourseBoundaryCallback.g(joinedCourseBoundaryCallback.webApi.loadJoinedTrainings(joinedCourseBoundaryCallback.trainer.isMale().invoke(), l, 20), callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(final JoinedCourseBoundaryCallback joinedCourseBoundaryCallback, final PagingRequestHelper.Request.Callback callback) {
        joinedCourseBoundaryCallback.pagingKeyHelper.resetPagingKey();
        joinedCourseBoundaryCallback.appExecutors.getNetworkIO().execute(new Runnable() { // from class: ti4
            @Override // java.lang.Runnable
            public final void run() {
                JoinedCourseBoundaryCallback.n(this.a, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(JoinedCourseBoundaryCallback joinedCourseBoundaryCallback, PagingRequestHelper.Request.Callback callback) {
        joinedCourseBoundaryCallback.g(TrainingWebApi.DefaultImpls.loadJoinedTrainings$default(joinedCourseBoundaryCallback.webApi, joinedCourseBoundaryCallback.trainer.isMale().invoke(), null, 20, 2, null), callback);
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
        this.helper.runIfNotRunning(PagingRequestHelper.RequestType.INITIAL, new PagingRequestHelper.Request() { // from class: ri4
            @Override // com.huami.training.paging.PagingRequestHelper.Request
            public final void run(PagingRequestHelper.Request.Callback callback) {
                JoinedCourseBoundaryCallback.m(this.a, callback);
            }
        });
    }

    @Override // androidx.paging.PagedList.BoundaryCallback
    @MainThread
    public void onItemAtEndLoaded(@NotNull JoinedCourseVo itemAtEnd) {
        this.helper.runIfNotRunning(PagingRequestHelper.RequestType.AFTER, new PagingRequestHelper.Request() { // from class: si4
            @Override // com.huami.training.paging.PagingRequestHelper.Request
            public final void run(PagingRequestHelper.Request.Callback callback) {
                JoinedCourseBoundaryCallback.k(this.a, callback);
            }
        });
    }
}
