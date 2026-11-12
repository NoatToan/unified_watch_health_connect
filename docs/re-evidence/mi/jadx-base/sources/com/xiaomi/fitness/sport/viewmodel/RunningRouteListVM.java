package com.xiaomi.fitness.sport.viewmodel;

import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.amap.api.services.district.DistrictItem;
import com.xiaomi.fitness.sport.route.detail.model.CityRouteCount;
import com.xiaomi.fitness.sport.route.detail.model.CityRoutesResult;
import com.xiaomi.fitness.sport.route.detail.server.RouteRepository;
import com.xiaomi.fitness.sport.view.route.GeoUtils;
import com.xiaomi.fitness.sport.view.route.RunningRouteListBean;
import com.xiaomi.fitness.sport_export.data.RunningRouteSupportCityBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020!J \u0010(\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020!J\u0006\u0010)\u001a\u00020\u001fJ\u0016\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0+2\u0006\u0010-\u001a\u00020.J\b\u0010/\u001a\u00020\u001fH\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/sport/viewmodel/RunningRouteListVM;", "Lcom/xiaomi/fitness/sport/viewmodel/RouteBaseViewModel;", "<init>", "()V", "nearestRunningRouteListBean", "Lcom/xiaomi/fitness/sport/view/route/RunningRouteListBean;", "highestRunningRouteListBean", "routeListLiveData", "Landroidx/lifecycle/MutableLiveData;", "getRouteListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setRouteListLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "_routeListFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "routeListFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getRouteListFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "cityRoutesList", "", "Lcom/xiaomi/fitness/sport/route/detail/model/CityRouteCount;", "getCityRoutesList", "()Ljava/util/List;", "routeRepository", "Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;", "getRouteRepository", "()Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;", "setRouteRepository", "(Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;)V", "getRouteList", "", "category", "", "longitude", "", "latitude", "resetCache", "", "originType", "getRecommendedRouteList", "getCityRoutes", "recheckSupportCity", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fitness/sport_export/data/RunningRouteSupportCityBean;", "code", "", "onCleared", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RunningRouteListVM extends RouteBaseViewModel {

    @NotNull
    private final MutableStateFlow<RunningRouteListBean> _routeListFlow;

    @NotNull
    private final List<CityRouteCount> cityRoutesList;

    @Nullable
    private RunningRouteListBean highestRunningRouteListBean;

    @Nullable
    private RunningRouteListBean nearestRunningRouteListBean;

    @NotNull
    private final StateFlow<RunningRouteListBean> routeListFlow;

    @Nullable
    private MutableLiveData<RunningRouteListBean> routeListLiveData = new MutableLiveData<>();
    public RouteRepository routeRepository;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.RunningRouteListVM$getCityRoutes$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.RunningRouteListVM$getCityRoutes$1", f = "RunningRouteListVM.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.RunningRouteListVM$getCityRoutes$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/sport/route/detail/model/CityRoutesResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.RunningRouteListVM$getCityRoutes$1$1", f = "RunningRouteListVM.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CityRoutesResult>, Object> {
            int label;
            final /* synthetic */ RunningRouteListVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07821(RunningRouteListVM runningRouteListVM, Continuation<? super C07821> continuation) {
                super(2, continuation);
                this.this$0 = runningRouteListVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07821(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RouteRepository routeRepository = this.this$0.getRouteRepository();
                    this.label = 1;
                    obj = routeRepository.getCityRoutes(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CityRoutesResult> continuation) {
                return ((C07821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2$lambda$1$lambda$0(RunningRouteListVM runningRouteListVM, CityRouteCount cityRouteCount, DistrictItem districtItem) {
            runningRouteListVM.getCityRoutesList().add(new CityRouteCount(cityRouteCount.getCityCode(), cityRouteCount.getRouteNums(), districtItem.getCenter().getLatitude(), districtItem.getCenter().getLongitude()));
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RunningRouteListVM.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C07821 c07821 = new C07821(RunningRouteListVM.this, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, c07821, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CityRoutesResult cityRoutesResult = (CityRoutesResult) obj;
            if (cityRoutesResult != null) {
                final RunningRouteListVM runningRouteListVM = RunningRouteListVM.this;
                List<CityRouteCount> supportCity = cityRoutesResult.getSupportCity();
                if (supportCity != null) {
                    GeoUtils.INSTANCE.convertCityLatlng(supportCity, new Function2() { // from class: com.xiaomi.fitness.sport.viewmodel.b
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return RunningRouteListVM.AnonymousClass1.invokeSuspend$lambda$2$lambda$1$lambda$0(runningRouteListVM, (CityRouteCount) obj2, (DistrictItem) obj3);
                        }
                    });
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.RunningRouteListVM$getRecommendedRouteList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.RunningRouteListVM$getRecommendedRouteList$1", f = "RunningRouteListVM.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ double $latitude;
        final /* synthetic */ double $longitude;
        final /* synthetic */ int $originType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30871(double d, double d2, int i, Continuation<? super C30871> continuation) {
            super(2, continuation);
            this.$longitude = d;
            this.$latitude = d2;
            this.$originType = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RunningRouteListVM.this.new C30871(this.$longitude, this.$latitude, this.$originType, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                RunningRouteListVM$getRecommendedRouteList$1$result$1 runningRouteListVM$getRecommendedRouteList$1$result$1 = new RunningRouteListVM$getRecommendedRouteList$1$result$1(RunningRouteListVM.this, this.$longitude, this.$latitude, this.$originType, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, runningRouteListVM$getRecommendedRouteList$1$result$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            RunningRouteListVM.this._routeListFlow.setValue((RunningRouteListBean) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.RunningRouteListVM$getRouteList$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.RunningRouteListVM$getRouteList$3", f = "RunningRouteListVM.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $category;
        final /* synthetic */ double $latitude;
        final /* synthetic */ double $longitude;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.RunningRouteListVM$getRouteList$3$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/sport/view/route/RunningRouteListBean;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.RunningRouteListVM$getRouteList$3$1", f = "RunningRouteListVM.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RunningRouteListBean>, Object> {
            final /* synthetic */ int $category;
            final /* synthetic */ double $latitude;
            final /* synthetic */ double $longitude;
            int label;
            final /* synthetic */ RunningRouteListVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RunningRouteListVM runningRouteListVM, int i, double d, double d2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = runningRouteListVM;
                this.$category = i;
                this.$longitude = d;
                this.$latitude = d2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$category, this.$longitude, this.$latitude, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RouteRepository routeRepository = this.this$0.getRouteRepository();
                    int i2 = this.$category;
                    float f = (float) this.$longitude;
                    float f2 = (float) this.$latitude;
                    this.label = 1;
                    obj = routeRepository.getRouteList(i2, f, f2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RunningRouteListBean> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i, double d, double d2, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$category = i;
            this.$longitude = d;
            this.$latitude = d2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RunningRouteListVM.this.new AnonymousClass3(this.$category, this.$longitude, this.$latitude, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RunningRouteListVM.this, this.$category, this.$longitude, this.$latitude, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, anonymousClass1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            RunningRouteListBean runningRouteListBean = (RunningRouteListBean) obj;
            if (runningRouteListBean != null) {
                int i2 = this.$category;
                RunningRouteListVM runningRouteListVM = RunningRouteListVM.this;
                if (i2 == 0) {
                    runningRouteListVM.nearestRunningRouteListBean = runningRouteListBean;
                }
                if (i2 == 1) {
                    runningRouteListVM.highestRunningRouteListBean = runningRouteListBean;
                }
                MutableLiveData<RunningRouteListBean> routeListLiveData = runningRouteListVM.getRouteListLiveData();
                if (routeListLiveData != null) {
                    routeListLiveData.postValue(runningRouteListBean);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.RunningRouteListVM$recheckSupportCity$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Lcom/xiaomi/fitness/sport_export/data/RunningRouteSupportCityBean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.RunningRouteListVM$recheckSupportCity$1", f = "RunningRouteListVM.kt", i = {}, l = {121, 121}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30881 extends SuspendLambda implements Function2<LiveDataScope<RunningRouteSupportCityBean>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $code;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30881(String str, Continuation<? super C30881> continuation) {
            super(2, continuation);
            this.$code = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30881 c30881 = RunningRouteListVM.this.new C30881(this.$code, continuation);
            c30881.L$0 = obj;
            return c30881;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<RunningRouteSupportCityBean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C30881) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.L$0;
            RouteRepository routeRepository = RunningRouteListVM.this.getRouteRepository();
            String str = this.$code;
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = routeRepository.getRunningRouteSupportCity(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public RunningRouteListVM() {
        MutableStateFlow<RunningRouteListBean> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._routeListFlow = MutableStateFlow;
        this.routeListFlow = MutableStateFlow;
        this.cityRoutesList = new ArrayList();
    }

    public static /* synthetic */ void getRecommendedRouteList$default(RunningRouteListVM runningRouteListVM, double d, double d2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        runningRouteListVM.getRecommendedRouteList(d, d2, i);
    }

    public final void getCityRoutes() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    @NotNull
    public final List<CityRouteCount> getCityRoutesList() {
        return this.cityRoutesList;
    }

    public final void getRecommendedRouteList(double longitude, double latitude, int originType) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C30871(longitude, latitude, originType, null), 3, null);
    }

    public final void getRouteList(int category, double longitude, double latitude, boolean resetCache, int originType) {
        RunningRouteListBean runningRouteListBean;
        RunningRouteListBean runningRouteListBean2;
        if (resetCache) {
            this.nearestRunningRouteListBean = null;
            this.highestRunningRouteListBean = null;
        }
        if (category == 0 && (runningRouteListBean2 = this.nearestRunningRouteListBean) != null) {
            MutableLiveData<RunningRouteListBean> mutableLiveData = this.routeListLiveData;
            if (mutableLiveData != null) {
                mutableLiveData.postValue(runningRouteListBean2);
                return;
            }
            return;
        }
        if (category != 1 || (runningRouteListBean = this.highestRunningRouteListBean) == null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass3(category, longitude, latitude, null), 3, null);
            return;
        }
        MutableLiveData<RunningRouteListBean> mutableLiveData2 = this.routeListLiveData;
        if (mutableLiveData2 != null) {
            mutableLiveData2.postValue(runningRouteListBean);
        }
    }

    @NotNull
    public final StateFlow<RunningRouteListBean> getRouteListFlow() {
        return this.routeListFlow;
    }

    @Nullable
    public final MutableLiveData<RunningRouteListBean> getRouteListLiveData() {
        return this.routeListLiveData;
    }

    @NotNull
    public final RouteRepository getRouteRepository() {
        RouteRepository routeRepository = this.routeRepository;
        if (routeRepository != null) {
            return routeRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("routeRepository");
        return null;
    }

    @Override // defpackage.dvq
    public void onCleared() {
        super.onCleared();
        this.nearestRunningRouteListBean = null;
        this.highestRunningRouteListBean = null;
    }

    @NotNull
    public final LiveData<RunningRouteSupportCityBean> recheckSupportCity(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C30881(code, null), 3, (Object) null);
    }

    public final void setRouteListLiveData(@Nullable MutableLiveData<RunningRouteListBean> mutableLiveData) {
        this.routeListLiveData = mutableLiveData;
    }

    public final void setRouteRepository(@NotNull RouteRepository routeRepository) {
        Intrinsics.checkNotNullParameter(routeRepository, "<set-?>");
        this.routeRepository = routeRepository;
    }
}
