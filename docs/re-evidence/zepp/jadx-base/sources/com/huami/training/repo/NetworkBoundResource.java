package com.huami.training.repo;

import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.Observer;
import com.huami.training.helper.AppExecutors;
import com.huami.training.repo.NetworkBoundResource;
import com.huami.training.vo.ApiEmptyResponse;
import com.huami.training.vo.ApiErrorResponse;
import com.huami.training.vo.ApiResponse;
import com.huami.training.vo.ApiSuccessResponse;
import com.huami.training.vo.Resource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004B\u0011\b\u0007\u0012\u0006\u0010#\u001a\u00020 ¢\u0006\u0004\b'\u0010(J-\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00002\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u000bH\u0003J\u0016\u0010\u0010\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0007H\u0014J\b\u0010\u0012\u001a\u00020\u0007H\u0015J\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000b0\u000eJ\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00028\u0001H%¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00018\u0000H%¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH%J\u0014\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001c0\u000eH%J\u001b\u0010\u001e\u001a\u0004\u0018\u00018\u00022\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H%¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000b0$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/huami/training/repo/NetworkBoundResource;", "DbType", "WebType", "UiType", "", "po", "Lkotlin/Function1;", "", "postCallback", "o", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Lcom/huami/training/vo/Resource;", "newValue", "C", "Landroidx/lifecycle/LiveData;", "dbSource", "r", "onFetchFailed", "onFetchEmpty", "asLiveData", "result", "saveCallResult", "(Ljava/lang/Object;)V", "data", "", "shouldFetch", "(Ljava/lang/Object;)Z", "loadFromDb", "Lcom/huami/training/vo/ApiResponse;", "createCall", "poToVo", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/huami/training/helper/AppExecutors;", "a", "Lcom/huami/training/helper/AppExecutors;", "appExecutors", "Landroidx/lifecycle/MediatorLiveData;", "b", "Landroidx/lifecycle/MediatorLiveData;", "<init>", "(Lcom/huami/training/helper/AppExecutors;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class NetworkBoundResource<DbType, WebType, UiType> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Resource<UiType>> result;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00018\u0002H\n"}, d2 = {"DbType", "WebType", "UiType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<UiType, Unit> {
        public final /* synthetic */ NetworkBoundResource<DbType, WebType, UiType> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NetworkBoundResource<DbType, WebType, UiType> networkBoundResource) {
            super(1);
            this.a = networkBoundResource;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable UiType uitype) {
            this.a.C(Resource.INSTANCE.success(uitype));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00018\u0002H\n"}, d2 = {"DbType", "WebType", "UiType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<UiType, Unit> {
        public final /* synthetic */ NetworkBoundResource<DbType, WebType, UiType> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NetworkBoundResource<DbType, WebType, UiType> networkBoundResource) {
            super(1);
            this.a = networkBoundResource;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable UiType uitype) {
            this.a.C(Resource.INSTANCE.loading(uitype));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00018\u0002H\n"}, d2 = {"DbType", "WebType", "UiType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<UiType, Unit> {
        public final /* synthetic */ NetworkBoundResource<DbType, WebType, UiType> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(NetworkBoundResource<DbType, WebType, UiType> networkBoundResource) {
            super(1);
            this.a = networkBoundResource;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable UiType uitype) {
            this.a.C(Resource.INSTANCE.success(uitype));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00018\u0002H\n"}, d2 = {"DbType", "WebType", "UiType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<UiType, Unit> {
        public final /* synthetic */ NetworkBoundResource<DbType, WebType, UiType> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(NetworkBoundResource<DbType, WebType, UiType> networkBoundResource) {
            super(1);
            this.a = networkBoundResource;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable UiType uitype) {
            this.a.C(Resource.INSTANCE.success(uitype));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00018\u0002H\n"}, d2 = {"DbType", "WebType", "UiType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<UiType, Unit> {
        public final /* synthetic */ NetworkBoundResource<DbType, WebType, UiType> a;
        public final /* synthetic */ ApiResponse<WebType> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(NetworkBoundResource<DbType, WebType, UiType> networkBoundResource, ApiResponse<WebType> apiResponse) {
            super(1);
            this.a = networkBoundResource;
            this.b = apiResponse;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable UiType uitype) {
            this.a.C(Resource.INSTANCE.error(((ApiErrorResponse) this.b).getErrorMessage(), uitype));
        }
    }

    @MainThread
    public NetworkBoundResource(@NotNull AppExecutors appExecutors) {
        this.appExecutors = appExecutors;
        MediatorLiveData<Resource<UiType>> mediatorLiveData = new MediatorLiveData<>();
        this.result = mediatorLiveData;
        mediatorLiveData.setValue(Resource.INSTANCE.loading(null));
        final LiveData<DbType> liveDataLoadFromDb = loadFromDb();
        mediatorLiveData.addSource(liveDataLoadFromDb, new Observer() { // from class: gd5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NetworkBoundResource.n(this.a, liveDataLoadFromDb, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(NetworkBoundResource networkBoundResource, Object obj) {
        networkBoundResource.o(obj, new b(networkBoundResource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(NetworkBoundResource networkBoundResource, Object obj) {
        networkBoundResource.o(obj, new a(networkBoundResource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void C(Resource<? extends UiType> newValue) {
        if (Intrinsics.areEqual(this.result.getValue(), newValue)) {
            return;
        }
        this.result.setValue(newValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final NetworkBoundResource networkBoundResource, LiveData liveData, Object obj) {
        networkBoundResource.result.removeSource(liveData);
        if (networkBoundResource.shouldFetch(obj)) {
            networkBoundResource.r(liveData);
        } else {
            networkBoundResource.result.addSource(liveData, new Observer() { // from class: ed5
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj2) {
                    NetworkBoundResource.B(this.a, obj2);
                }
            });
        }
    }

    private final void o(final DbType po, final Function1<? super UiType, Unit> postCallback) {
        this.appExecutors.getDiskIO().execute(new Runnable() { // from class: od5
            @Override // java.lang.Runnable
            public final void run() {
                NetworkBoundResource.p(this.a, po, postCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(NetworkBoundResource networkBoundResource, Object obj, final Function1 function1) {
        final Object objPoToVo = networkBoundResource.poToVo(obj);
        networkBoundResource.appExecutors.getMainThread().execute(new Runnable() { // from class: pd5
            @Override // java.lang.Runnable
            public final void run() {
                NetworkBoundResource.q(function1, objPoToVo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void r(final LiveData<DbType> dbSource) {
        final LiveData<ApiResponse<WebType>> liveDataCreateCall = createCall();
        this.result.addSource(dbSource, new Observer() { // from class: cd5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NetworkBoundResource.A(this.a, obj);
            }
        });
        this.result.addSource(liveDataCreateCall, new Observer() { // from class: hd5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NetworkBoundResource.s(this.a, liveDataCreateCall, dbSource, (ApiResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(final NetworkBoundResource networkBoundResource, LiveData liveData, LiveData liveData2, final ApiResponse apiResponse) {
        networkBoundResource.result.removeSource(liveData);
        networkBoundResource.result.removeSource(liveData2);
        if (apiResponse instanceof ApiSuccessResponse) {
            networkBoundResource.appExecutors.getDiskIO().execute(new Runnable() { // from class: nd5
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkBoundResource.x(this.a, apiResponse);
                }
            });
            return;
        }
        if (apiResponse instanceof ApiEmptyResponse) {
            networkBoundResource.appExecutors.getDiskIO().execute(new Runnable() { // from class: ld5
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkBoundResource.t(this.a);
                }
            });
        } else if (apiResponse instanceof ApiErrorResponse) {
            networkBoundResource.onFetchFailed();
            networkBoundResource.result.addSource(liveData2, new Observer() { // from class: jd5
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    NetworkBoundResource.w(this.a, apiResponse, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final NetworkBoundResource networkBoundResource) {
        networkBoundResource.onFetchEmpty();
        networkBoundResource.appExecutors.getMainThread().execute(new Runnable() { // from class: md5
            @Override // java.lang.Runnable
            public final void run() {
                NetworkBoundResource.u(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(final NetworkBoundResource networkBoundResource) {
        networkBoundResource.result.addSource(networkBoundResource.loadFromDb(), new Observer() { // from class: dd5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NetworkBoundResource.v(this.a, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(NetworkBoundResource networkBoundResource, Object obj) {
        networkBoundResource.o(obj, new d(networkBoundResource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(NetworkBoundResource networkBoundResource, ApiResponse apiResponse, Object obj) {
        networkBoundResource.o(obj, new e(networkBoundResource, apiResponse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void x(final NetworkBoundResource networkBoundResource, ApiResponse apiResponse) {
        networkBoundResource.saveCallResult(((ApiSuccessResponse) apiResponse).getBody());
        networkBoundResource.appExecutors.getMainThread().execute(new Runnable() { // from class: kd5
            @Override // java.lang.Runnable
            public final void run() {
                NetworkBoundResource.y(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(final NetworkBoundResource networkBoundResource) {
        networkBoundResource.result.addSource(networkBoundResource.loadFromDb(), new Observer() { // from class: fd5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NetworkBoundResource.z(this.a, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(NetworkBoundResource networkBoundResource, Object obj) {
        networkBoundResource.o(obj, new c(networkBoundResource));
    }

    @NotNull
    public final LiveData<Resource<UiType>> asLiveData() {
        return this.result;
    }

    @MainThread
    @NotNull
    public abstract LiveData<ApiResponse<WebType>> createCall();

    @MainThread
    @NotNull
    public abstract LiveData<DbType> loadFromDb();

    @WorkerThread
    public void onFetchEmpty() {
    }

    public void onFetchFailed() {
    }

    @MainThread
    @Nullable
    public abstract UiType poToVo(@Nullable DbType po);

    @WorkerThread
    public abstract void saveCallResult(WebType result);

    @MainThread
    public abstract boolean shouldFetch(@Nullable DbType data);
}
