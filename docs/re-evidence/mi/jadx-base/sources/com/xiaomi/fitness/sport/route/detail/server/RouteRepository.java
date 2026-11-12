package com.xiaomi.fitness.sport.route.detail.server;

import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport.bean.RunningRouteTabBean;
import com.xiaomi.fitness.sport.route.detail.model.CityRoutesResult;
import com.xiaomi.fitness.sport.route.detail.model.ClockInResult;
import com.xiaomi.fitness.sport.route.detail.model.GetRouteDetailResult;
import com.xiaomi.fitness.sport.route.detail.model.GetRouteHistoryResult;
import com.xiaomi.fitness.sport.route.detail.model.GetRouteRankingResult;
import com.xiaomi.fitness.sport.route.detail.model.GetRunningRecordBindStatus;
import com.xiaomi.fitness.sport.route.detail.model.ProgressRouteStatus;
import com.xiaomi.fitness.sport.route.detail.model.RankInfo;
import com.xiaomi.fitness.sport.sporttab.SupportCityManager;
import com.xiaomi.fitness.sport.view.route.RunningRouteListBean;
import com.xiaomi.fitness.sport_export.bean.ClockData;
import com.xiaomi.fitness.sport_export.data.RouteCollectResponse;
import com.xiaomi.fitness.sport_export.data.RouteCollectResult;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import com.xiaomi.fitness.sport_export.data.RunningRouteSupportCityBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 F2\u00020\u0001:\u0001FB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0011J<\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0013\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0016J*\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010 H\u0086@¢\u0006\u0002\u0010!J\u001a\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010\u001aH\u0086@¢\u0006\u0002\u0010%J*\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010,J(\u0010-\u001a\u0004\u0018\u00010'2\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0086@¢\u0006\u0002\u0010/J\"\u00100\u001a\u0004\u0018\u0001012\u0006\u0010\u0015\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0002\u00103J:\u00104\u001a\u0004\u0018\u0001052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u00106\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u001d2\u0006\u00108\u001a\u00020\u001a2\u0006\u00109\u001a\u00020:H\u0086@¢\u0006\u0002\u0010;J\u0010\u0010<\u001a\u0004\u0018\u00010=H\u0086@¢\u0006\u0002\u0010!J\u0010\u0010>\u001a\u0004\u0018\u00010?H\u0086@¢\u0006\u0002\u0010!J \u0010@\u001a\u0004\u0018\u00010A2\u0006\u0010B\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0011J \u0010C\u001a\u0004\u0018\u00010D2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0011R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006G"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;", "", "<init>", "()V", "routeRequest", "Lcom/xiaomi/fitness/sport/route/detail/server/RouteRequest;", "getRouteRequest", "()Lcom/xiaomi/fitness/sport/route/detail/server/RouteRequest;", "setRouteRequest", "(Lcom/xiaomi/fitness/sport/route/detail/server/RouteRequest;)V", "getRouteDetail", "Lkotlin/Pair;", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "Lcom/xiaomi/fitness/sport/route/detail/model/RankInfo;", "routeId", "", "routeType", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRankingList", "", "categoryId", "limit", "(IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRunningRecordBindStatus", "Lcom/xiaomi/fitness/sport/route/detail/model/GetRunningRecordBindStatus;", "sid", "", "key", "time", "", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRunningRouateInlet", "Lcom/xiaomi/fitness/sport/bean/RunningRouteTabBean;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRunningRouteSupportCity", "Lcom/xiaomi/fitness/sport_export/data/RunningRouteSupportCityBean;", TSMAuthContants.PARAM_CITYCODE, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRouteRecommend", "Lcom/xiaomi/fitness/sport/view/route/RunningRouteListBean;", "longitude", "", "latitude", "originType", "(FFILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRouteList", "category", "(IFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHistoryRoutes", "Lcom/xiaomi/fitness/sport/route/detail/model/GetRouteHistoryResult;", "nextKey", "(ILjava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "routeClockIn", "Lcom/xiaomi/fitness/sport/route/detail/model/ClockInResult;", "sportRecordKey", "startTime", "operation", "clockdata", "Lcom/xiaomi/fitness/sport_export/bean/ClockData;", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lcom/xiaomi/fitness/sport_export/bean/ClockData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProgressRoute", "Lcom/xiaomi/fitness/sport/route/detail/model/ProgressRouteStatus;", "getCityRoutes", "Lcom/xiaomi/fitness/sport/route/detail/model/CityRoutesResult;", "getRouteCollectList", "Lcom/xiaomi/fitness/sport_export/data/RouteCollectResponse;", "page", "collectRoute", "Lcom/xiaomi/fitness/sport_export/data/RouteCollectResult;", "collect", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteRepository {

    @NotNull
    public static final String TAG = "RouteRepository";
    public RouteRequest routeRequest;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRepository$collectRoute$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRepository", f = "RouteRepository.kt", i = {}, l = {SportReportBaseParser.ReportType.avgDescentRate}, m = "collectRoute", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRepository.this.collectRoute(0, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRepository$getCityRoutes$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRepository", f = "RouteRepository.kt", i = {}, l = {170}, m = "getCityRoutes", n = {}, s = {})
    public static final class C29491 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29491(Continuation<? super C29491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRepository.this.getCityRoutes(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRepository$getHistoryRoutes$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRepository", f = "RouteRepository.kt", i = {}, l = {131}, m = "getHistoryRoutes", n = {}, s = {})
    public static final class C29501 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29501(Continuation<? super C29501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRepository.this.getHistoryRoutes(0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRepository$getProgressRoute$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRepository", f = "RouteRepository.kt", i = {}, l = {161}, m = "getProgressRoute", n = {}, s = {})
    public static final class C29511 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29511(Continuation<? super C29511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRepository.this.getProgressRoute(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRepository$getRankingList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRepository", f = "RouteRepository.kt", i = {}, l = {51}, m = "getRankingList", n = {}, s = {})
    public static final class C29521 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29521(Continuation<? super C29521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRepository.this.getRankingList(0, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRepository$getRouteCollectList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRepository", f = "RouteRepository.kt", i = {}, l = {179}, m = "getRouteCollectList", n = {}, s = {})
    public static final class C29531 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29531(Continuation<? super C29531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRepository.this.getRouteCollectList(0, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRepository$getRouteDetail$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRepository", f = "RouteRepository.kt", i = {}, l = {34}, m = "getRouteDetail", n = {}, s = {})
    public static final class C29541 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29541(Continuation<? super C29541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRepository.this.getRouteDetail(0, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRepository$getRouteList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRepository", f = "RouteRepository.kt", i = {}, l = {120}, m = "getRouteList", n = {}, s = {})
    public static final class C29551 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29551(Continuation<? super C29551> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRepository.this.getRouteList(0, 0.0f, 0.0f, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRepository$getRouteRecommend$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRepository", f = "RouteRepository.kt", i = {}, l = {105}, m = "getRouteRecommend", n = {}, s = {})
    public static final class C29561 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29561(Continuation<? super C29561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRepository.this.getRouteRecommend(0.0f, 0.0f, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRepository$getRunningRecordBindStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRepository", f = "RouteRepository.kt", i = {}, l = {67}, m = "getRunningRecordBindStatus", n = {}, s = {})
    public static final class C29571 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29571(Continuation<? super C29571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRepository.this.getRunningRecordBindStatus(null, null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRepository$getRunningRouateInlet$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRepository", f = "RouteRepository.kt", i = {}, l = {78}, m = "getRunningRouateInlet", n = {}, s = {})
    public static final class C29581 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29581(Continuation<? super C29581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRepository.this.getRunningRouateInlet(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRepository$getRunningRouteSupportCity$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRepository", f = "RouteRepository.kt", i = {}, l = {89}, m = "getRunningRouteSupportCity", n = {}, s = {})
    public static final class C29591 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29591(Continuation<? super C29591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRepository.this.getRunningRouteSupportCity(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRepository$routeClockIn$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRepository", f = "RouteRepository.kt", i = {}, l = {151}, m = "routeClockIn", n = {}, s = {})
    public static final class C29601 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29601(Continuation<? super C29601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRepository.this.routeClockIn(null, null, 0L, null, null, this);
        }
    }

    public static /* synthetic */ Object getRouteDetail$default(RouteRepository routeRepository, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return routeRepository.getRouteDetail(i, i2, continuation);
    }

    public static /* synthetic */ Object getRouteRecommend$default(RouteRepository routeRepository, float f, float f2, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return routeRepository.getRouteRecommend(f, f2, i, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object collectRoute(int i, int i2, @NotNull Continuation<? super RouteCollectResult> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objCollectRoute = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = anonymousClass1.label;
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(objCollectRoute);
                RouteRequest routeRequest = getRouteRequest();
                anonymousClass1.label = 1;
                objCollectRoute = routeRequest.collectRoute(i2, i, anonymousClass1);
                if (objCollectRoute == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCollectRoute);
            }
            return objCollectRoute;
        } catch (Exception e) {
            Logger.i(TAG, "collectRoute fail. error=" + e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getCityRoutes(@NotNull Continuation<? super CityRoutesResult> continuation) {
        C29491 c29491;
        if (continuation instanceof C29491) {
            c29491 = (C29491) continuation;
            int i = c29491.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29491.label = i - Integer.MIN_VALUE;
            } else {
                c29491 = new C29491(continuation);
            }
        } else {
            c29491 = new C29491(continuation);
        }
        Object cityRoutes = c29491.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c29491.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(cityRoutes);
                RouteRequest routeRequest = getRouteRequest();
                c29491.label = 1;
                cityRoutes = routeRequest.getCityRoutes(c29491);
                if (cityRoutes == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(cityRoutes);
            }
            return cityRoutes;
        } catch (Exception e) {
            Logger.i(TAG, "getCityRoutes fail error:" + e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getHistoryRoutes(int i, @Nullable Integer num, @NotNull Continuation<? super GetRouteHistoryResult> continuation) {
        C29501 c29501;
        if (continuation instanceof C29501) {
            c29501 = (C29501) continuation;
            int i2 = c29501.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29501.label = i2 - Integer.MIN_VALUE;
            } else {
                c29501 = new C29501(continuation);
            }
        } else {
            c29501 = new C29501(continuation);
        }
        Object routeHistory = c29501.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c29501.label;
        GetRouteHistoryResult getRouteHistoryResult = null;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(routeHistory);
                RouteRequest routeRequest = getRouteRequest();
                c29501.label = 1;
                routeHistory = routeRequest.getRouteHistory(i, num, c29501);
                if (routeHistory == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(routeHistory);
            }
            GetRouteHistoryResult getRouteHistoryResult2 = (GetRouteHistoryResult) routeHistory;
            try {
                Logger.i(TAG, "getHistoryRoutes success. result=" + getRouteHistoryResult2);
                return getRouteHistoryResult2;
            } catch (Exception e) {
                e = e;
                getRouteHistoryResult = getRouteHistoryResult2;
                Logger.i(TAG, "getHistoryRoutes fail. error=" + e);
                return getRouteHistoryResult;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getProgressRoute(@NotNull Continuation<? super ProgressRouteStatus> continuation) {
        C29511 c29511;
        if (continuation instanceof C29511) {
            c29511 = (C29511) continuation;
            int i = c29511.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29511.label = i - Integer.MIN_VALUE;
            } else {
                c29511 = new C29511(continuation);
            }
        } else {
            c29511 = new C29511(continuation);
        }
        Object progressRoute = c29511.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c29511.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(progressRoute);
                RouteRequest routeRequest = getRouteRequest();
                c29511.label = 1;
                progressRoute = routeRequest.getProgressRoute(c29511);
                if (progressRoute == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(progressRoute);
            }
            return progressRoute;
        } catch (Exception e) {
            Logger.i(TAG, "getProgressRoute fail. error=" + e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRankingList(int i, int i2, int i3, @NotNull Continuation<? super Pair<RankInfo, ? extends List<RankInfo>>> continuation) {
        C29521 c29521;
        if (continuation instanceof C29521) {
            c29521 = (C29521) continuation;
            int i4 = c29521.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c29521.label = i4 - Integer.MIN_VALUE;
            } else {
                c29521 = new C29521(continuation);
            }
        } else {
            c29521 = new C29521(continuation);
        }
        Object rankingList = c29521.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = c29521.label;
        Pair pair = null;
        try {
            if (i5 == 0) {
                ResultKt.throwOnFailure(rankingList);
                RouteRequest routeRequest = getRouteRequest();
                c29521.label = 1;
                rankingList = routeRequest.getRankingList(i, i2, i3, c29521);
                if (rankingList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(rankingList);
            }
            GetRouteRankingResult getRouteRankingResult = (GetRouteRankingResult) rankingList;
            Pair pair2 = new Pair(getRouteRankingResult.getUserRankInfo(), getRouteRankingResult.getRankingList());
            try {
                Logger.i(TAG, "getRank success. result=" + pair2);
                return pair2;
            } catch (Exception e) {
                pair = pair2;
                e = e;
                Logger.i(TAG, "getRank failed. error=" + e);
                return pair;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRouteCollectList(int i, int i2, @NotNull Continuation<? super RouteCollectResponse> continuation) {
        C29531 c29531;
        if (continuation instanceof C29531) {
            c29531 = (C29531) continuation;
            int i3 = c29531.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c29531.label = i3 - Integer.MIN_VALUE;
            } else {
                c29531 = new C29531(continuation);
            }
        } else {
            c29531 = new C29531(continuation);
        }
        Object collectList = c29531.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c29531.label;
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(collectList);
                RouteRequest routeRequest = getRouteRequest();
                c29531.label = 1;
                collectList = routeRequest.getCollectList(i, i2, c29531);
                if (collectList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(collectList);
            }
            return collectList;
        } catch (Exception e) {
            Logger.i(TAG, "getRouteCollectList fail. error=" + e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRouteDetail(int i, int i2, @NotNull Continuation<? super Pair<RouteInfo, RankInfo>> continuation) {
        C29541 c29541;
        if (continuation instanceof C29541) {
            c29541 = (C29541) continuation;
            int i3 = c29541.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c29541.label = i3 - Integer.MIN_VALUE;
            } else {
                c29541 = new C29541(continuation);
            }
        } else {
            c29541 = new C29541(continuation);
        }
        Object routeDetail = c29541.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c29541.label;
        Pair pair = null;
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(routeDetail);
                RouteRequest routeRequest = getRouteRequest();
                c29541.label = 1;
                routeDetail = routeRequest.getRouteDetail(i, i2, c29541);
                if (routeDetail == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(routeDetail);
            }
            GetRouteDetailResult getRouteDetailResult = (GetRouteDetailResult) routeDetail;
            if (getRouteDetailResult.getRouteDetail() == null) {
                return null;
            }
            Pair pair2 = new Pair(getRouteDetailResult.getRouteDetail(), getRouteDetailResult.getCreateInfo());
            try {
                Logger.i(TAG, "getRouteDetail success. result=" + pair2);
                return pair2;
            } catch (Exception e) {
                pair = pair2;
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
        }
        Logger.i(TAG, "getRouteDetail fail. error=" + e);
        return pair;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRouteList(int i, float f, float f2, @NotNull Continuation<? super RunningRouteListBean> continuation) {
        C29551 c29551;
        if (continuation instanceof C29551) {
            c29551 = (C29551) continuation;
            int i2 = c29551.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29551.label = i2 - Integer.MIN_VALUE;
            } else {
                c29551 = new C29551(continuation);
            }
        } else {
            c29551 = new C29551(continuation);
        }
        Object routeList = c29551.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c29551.label;
        RunningRouteListBean runningRouteListBean = null;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(routeList);
                RouteRequest routeRequest = getRouteRequest();
                c29551.label = 1;
                routeList = routeRequest.getRouteList(i, f, f2, c29551);
                if (routeList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(routeList);
            }
            RunningRouteListBean runningRouteListBean2 = (RunningRouteListBean) routeList;
            try {
                Logger.i(TAG, "getRouteList result=" + runningRouteListBean2);
                return runningRouteListBean2;
            } catch (Exception e) {
                e = e;
                runningRouteListBean = runningRouteListBean2;
                Logger.i(TAG, "getRouteList failed. err=" + e);
                return runningRouteListBean;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRouteRecommend(float f, float f2, int i, @NotNull Continuation<? super RunningRouteListBean> continuation) {
        C29561 c29561;
        if (continuation instanceof C29561) {
            c29561 = (C29561) continuation;
            int i2 = c29561.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29561.label = i2 - Integer.MIN_VALUE;
            } else {
                c29561 = new C29561(continuation);
            }
        } else {
            c29561 = new C29561(continuation);
        }
        Object routeRecommend = c29561.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c29561.label;
        RunningRouteListBean runningRouteListBean = null;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(routeRecommend);
                RouteRequest routeRequest = getRouteRequest();
                c29561.label = 1;
                routeRecommend = routeRequest.getRouteRecommend(f, f2, i, c29561);
                if (routeRecommend == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(routeRecommend);
            }
            RunningRouteListBean runningRouteListBean2 = (RunningRouteListBean) routeRecommend;
            try {
                Logger.i(TAG, "getRouteRecommend result=" + runningRouteListBean2);
                return runningRouteListBean2;
            } catch (Exception e) {
                e = e;
                runningRouteListBean = runningRouteListBean2;
                Logger.i(TAG, "getRouteRecommend failed. err=" + e);
                return runningRouteListBean;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    @NotNull
    public final RouteRequest getRouteRequest() {
        RouteRequest routeRequest = this.routeRequest;
        if (routeRequest != null) {
            return routeRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("routeRequest");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Object getRunningRecordBindStatus(@Nullable String str, @NotNull String str2, long j, @NotNull Continuation<? super GetRunningRecordBindStatus> continuation) {
        C29571 c29571;
        if (continuation instanceof C29571) {
            c29571 = (C29571) continuation;
            int i = c29571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29571.label = i - Integer.MIN_VALUE;
            } else {
                c29571 = new C29571(continuation);
            }
        } else {
            c29571 = new C29571(continuation);
        }
        C29571 c29572 = c29571;
        Object runningRecordBindStatus = c29572.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c29572.label;
        GetRunningRecordBindStatus getRunningRecordBindStatus = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(runningRecordBindStatus);
                RouteRequest routeRequest = getRouteRequest();
                c29572.label = 1;
                runningRecordBindStatus = routeRequest.getRunningRecordBindStatus(str, str2, j, c29572);
                if (runningRecordBindStatus == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(runningRecordBindStatus);
            }
            GetRunningRecordBindStatus getRunningRecordBindStatus2 = (GetRunningRecordBindStatus) runningRecordBindStatus;
            try {
                Logger.i(TAG, "getRunningRecordBindStatus result=" + getRunningRecordBindStatus2);
                return getRunningRecordBindStatus2;
            } catch (Exception e) {
                e = e;
                getRunningRecordBindStatus = getRunningRecordBindStatus2;
                Logger.i(TAG, "getRunningRecordBindStatus failed. err=" + e);
                return getRunningRecordBindStatus;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRunningRouateInlet(@NotNull Continuation<? super RunningRouteTabBean> continuation) {
        C29581 c29581;
        if (continuation instanceof C29581) {
            c29581 = (C29581) continuation;
            int i = c29581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29581.label = i - Integer.MIN_VALUE;
            } else {
                c29581 = new C29581(continuation);
            }
        } else {
            c29581 = new C29581(continuation);
        }
        Object runningRouteInlet = c29581.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c29581.label;
        RunningRouteTabBean runningRouteTabBean = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(runningRouteInlet);
                RouteRequest routeRequest = getRouteRequest();
                c29581.label = 1;
                runningRouteInlet = routeRequest.getRunningRouteInlet(c29581);
                if (runningRouteInlet == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(runningRouteInlet);
            }
            RunningRouteTabBean runningRouteTabBean2 = (RunningRouteTabBean) runningRouteInlet;
            try {
                Logger.i(TAG, "getRunningRouateInlet result=" + runningRouteTabBean2);
                return runningRouteTabBean2;
            } catch (Exception e) {
                runningRouteTabBean = runningRouteTabBean2;
                e = e;
                Logger.i(TAG, "getRunningRouateInlet failed. err=" + e);
                return runningRouteTabBean;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRunningRouteSupportCity(@Nullable String str, @NotNull Continuation<? super RunningRouteSupportCityBean> continuation) {
        C29591 c29591;
        if (continuation instanceof C29591) {
            c29591 = (C29591) continuation;
            int i = c29591.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29591.label = i - Integer.MIN_VALUE;
            } else {
                c29591 = new C29591(continuation);
            }
        } else {
            c29591 = new C29591(continuation);
        }
        Object runningRouteSupport = c29591.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c29591.label;
        RunningRouteSupportCityBean runningRouteSupportCityBean = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(runningRouteSupport);
                RouteRequest routeRequest = getRouteRequest();
                c29591.label = 1;
                runningRouteSupport = routeRequest.getRunningRouteSupport(str, c29591);
                if (runningRouteSupport == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(runningRouteSupport);
            }
            RunningRouteSupportCityBean runningRouteSupportCityBean2 = (RunningRouteSupportCityBean) runningRouteSupport;
            try {
                SupportCityManager.INSTANCE.initSupportCityData(runningRouteSupportCityBean2);
                Logger.i(TAG, "getRunningRouteSupportCity result=" + runningRouteSupportCityBean2);
                return runningRouteSupportCityBean2;
            } catch (Exception e) {
                e = e;
                runningRouteSupportCityBean = runningRouteSupportCityBean2;
                Logger.i(TAG, "getRunningRouteSupportCity failed. err=" + e);
                return runningRouteSupportCityBean;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Nullable
    public final Object routeClockIn(@Nullable String str, @NotNull String str2, long j, @NotNull String str3, @NotNull ClockData clockData, @NotNull Continuation<? super ClockInResult> continuation) {
        C29601 c29601;
        if (continuation instanceof C29601) {
            c29601 = (C29601) continuation;
            int i = c29601.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29601.label = i - Integer.MIN_VALUE;
            } else {
                c29601 = new C29601(continuation);
            }
        } else {
            c29601 = new C29601(continuation);
        }
        C29601 c29602 = c29601;
        Object objRouteClockIn = c29602.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c29602.label;
        ClockInResult clockInResult = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objRouteClockIn);
                RouteRequest routeRequest = getRouteRequest();
                c29602.label = 1;
                objRouteClockIn = routeRequest.routeClockIn(str, str2, j, str3, clockData, c29602);
                if (objRouteClockIn == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objRouteClockIn);
            }
            ClockInResult clockInResult2 = (ClockInResult) objRouteClockIn;
            try {
                Logger.i(TAG, "routeClockIn success result=" + clockInResult2);
                return clockInResult2;
            } catch (Exception e) {
                e = e;
                clockInResult = clockInResult2;
                Logger.i(TAG, "routeClockIn fail. error=" + e);
                return clockInResult;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final void setRouteRequest(@NotNull RouteRequest routeRequest) {
        Intrinsics.checkNotNullParameter(routeRequest, "<set-?>");
        this.routeRequest = routeRequest;
    }
}
