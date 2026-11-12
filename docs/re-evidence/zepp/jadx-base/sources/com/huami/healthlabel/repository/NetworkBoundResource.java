package com.huami.healthlabel.repository;

import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.Observer;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.healthlabel.repository.NetworkBoundResource;
import com.huami.healthlabel.web.ApiEmptyResponse;
import com.huami.healthlabel.web.ApiErrorResponse;
import com.huami.healthlabel.web.ApiResponse;
import com.huami.healthlabel.web.ApiSuccessResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004B\u0011\b\u0007\u0012\u0006\u0010#\u001a\u00020 ¢\u0006\u0004\b'\u0010(J-\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00002\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0003J\u0016\u0010\u0012\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0007H\u0014J\b\u0010\u0014\u001a\u00020\u0007H\u0015J\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000b0\u0010J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00028\u0001H%¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00018\u0000H%¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H%J\u0014\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001c0\u0010H%J\u001b\u0010\u001e\u001a\u0004\u0018\u00018\u00022\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H%¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000b0$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/huami/healthlabel/repository/NetworkBoundResource;", "DbType", "WebType", "UiType", "", "po", "Lkotlin/Function1;", "", "postCallback", GoogleApiAvailabilityLight.b, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Lcom/huami/healthlabel/repository/Resource;", "newValue", "", "loadFromDb", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroidx/lifecycle/LiveData;", "dbSource", com.google.android.exoplayer2.text.ttml.b.r, "onFetchFailed", "onFetchEmpty", "asLiveData", "result", "saveCallResult", "(Ljava/lang/Object;)V", "data", "shouldFetch", "(Ljava/lang/Object;)Z", "Lcom/huami/healthlabel/web/ApiResponse;", "createCall", "poToVo", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/huami/healthlabel/repository/AppExecutors;", "a", "Lcom/huami/healthlabel/repository/AppExecutors;", "appExecutors", "Landroidx/lifecycle/MediatorLiveData;", "b", "Landroidx/lifecycle/MediatorLiveData;", "<init>", "(Lcom/huami/healthlabel/repository/AppExecutors;)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
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
            this.a.A(Resource.INSTANCE.success(uitype), true);
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
            this.a.A(Resource.INSTANCE.loading(uitype), true);
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
            this.a.A(Resource.INSTANCE.success(uitype), false);
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
            this.a.A(Resource.INSTANCE.success(uitype), false);
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
            this.a.A(Resource.INSTANCE.error(Log.getStackTraceString(((ApiErrorResponse) this.b).getError()), uitype), false);
        }
    }

    @MainThread
    public NetworkBoundResource(@NotNull AppExecutors appExecutors) {
        this.appExecutors = appExecutors;
        MediatorLiveData<Resource<UiType>> mediatorLiveData = new MediatorLiveData<>();
        this.result = mediatorLiveData;
        mediatorLiveData.setValue(Resource.INSTANCE.loading(null));
        final LiveData<DbType> liveDataLoadFromDb = loadFromDb();
        mediatorLiveData.addSource(liveDataLoadFromDb, new Observer() { // from class: rd5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NetworkBoundResource.m(this.a, liveDataLoadFromDb, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void A(Resource<? extends UiType> newValue, boolean loadFromDb) {
        if (Intrinsics.areEqual(this.result.getValue(), newValue)) {
            return;
        }
        MediatorLiveData<Resource<UiType>> mediatorLiveData = this.result;
        newValue.setLoadFromDb(loadFromDb);
        Unit unit = Unit.INSTANCE;
        mediatorLiveData.setValue(newValue);
    }

    public static /* synthetic */ void B(NetworkBoundResource networkBoundResource, Resource resource, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setValue");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        networkBoundResource.A(resource, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(final NetworkBoundResource networkBoundResource, LiveData liveData, Object obj) {
        networkBoundResource.result.removeSource(liveData);
        if (networkBoundResource.shouldFetch(obj)) {
            networkBoundResource.p(liveData);
        } else {
            networkBoundResource.result.addSource(liveData, new Observer() { // from class: id5
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj2) {
                    NetworkBoundResource.z(this.a, obj2);
                }
            });
        }
    }

    private final void n(final DbType po, final Function1<? super UiType, Unit> postCallback) {
        this.appExecutors.mainThread().execute(new Runnable() { // from class: oc5
            @Override // java.lang.Runnable
            public final void run() {
                NetworkBoundResource.o(this.a, po, postCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(NetworkBoundResource networkBoundResource, Object obj, Function1 function1) {
        function1.invoke(networkBoundResource.poToVo(obj));
    }

    private final void p(final LiveData<DbType> dbSource) {
        final LiveData<ApiResponse<WebType>> liveDataCreateCall = createCall();
        this.result.addSource(dbSource, new Observer() { // from class: qd5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NetworkBoundResource.y(this.a, obj);
            }
        });
        this.result.addSource(liveDataCreateCall, new Observer() { // from class: sd5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NetworkBoundResource.q(this.a, liveDataCreateCall, dbSource, (ApiResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(final NetworkBoundResource networkBoundResource, LiveData liveData, LiveData liveData2, final ApiResponse apiResponse) {
        networkBoundResource.result.removeSource(liveData);
        networkBoundResource.result.removeSource(liveData2);
        if (apiResponse instanceof ApiSuccessResponse) {
            networkBoundResource.appExecutors.diskIO().execute(new Runnable() { // from class: nc5
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkBoundResource.v(this.a, apiResponse);
                }
            });
            return;
        }
        if (apiResponse instanceof ApiEmptyResponse) {
            networkBoundResource.appExecutors.diskIO().execute(new Runnable() { // from class: ud5
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkBoundResource.r(this.a);
                }
            });
        } else if (apiResponse instanceof ApiErrorResponse) {
            networkBoundResource.onFetchFailed();
            networkBoundResource.result.addSource(liveData2, new Observer() { // from class: td5
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    NetworkBoundResource.u(this.a, apiResponse, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(final NetworkBoundResource networkBoundResource) {
        networkBoundResource.onFetchEmpty();
        networkBoundResource.appExecutors.mainThread().execute(new Runnable() { // from class: wd5
            @Override // java.lang.Runnable
            public final void run() {
                NetworkBoundResource.s(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(final NetworkBoundResource networkBoundResource) {
        networkBoundResource.result.addSource(networkBoundResource.loadFromDb(), new Observer() { // from class: mc5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NetworkBoundResource.t(this.a, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(NetworkBoundResource networkBoundResource, Object obj) {
        networkBoundResource.n(obj, new d(networkBoundResource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(NetworkBoundResource networkBoundResource, ApiResponse apiResponse, Object obj) {
        networkBoundResource.n(obj, new e(networkBoundResource, apiResponse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void v(final NetworkBoundResource networkBoundResource, ApiResponse apiResponse) {
        networkBoundResource.saveCallResult(((ApiSuccessResponse) apiResponse).getBody());
        networkBoundResource.appExecutors.mainThread().execute(new Runnable() { // from class: vd5
            @Override // java.lang.Runnable
            public final void run() {
                NetworkBoundResource.w(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(final NetworkBoundResource networkBoundResource) {
        networkBoundResource.result.addSource(networkBoundResource.loadFromDb(), new Observer() { // from class: xc5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NetworkBoundResource.x(this.a, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(NetworkBoundResource networkBoundResource, Object obj) {
        networkBoundResource.n(obj, new c(networkBoundResource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(NetworkBoundResource networkBoundResource, Object obj) {
        networkBoundResource.n(obj, new b(networkBoundResource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(NetworkBoundResource networkBoundResource, Object obj) {
        networkBoundResource.n(obj, new a(networkBoundResource));
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
