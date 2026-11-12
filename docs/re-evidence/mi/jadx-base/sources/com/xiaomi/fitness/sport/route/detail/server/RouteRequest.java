package com.xiaomi.fitness.sport.route.detail.server;

import com.google.gson.Gson;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.sport.bean.RunningRouteTabBean;
import com.xiaomi.fitness.sport.route.detail.model.CityRoutesResult;
import com.xiaomi.fitness.sport.route.detail.model.ClockInResult;
import com.xiaomi.fitness.sport.route.detail.model.GetRouteDetailResult;
import com.xiaomi.fitness.sport.route.detail.model.GetRouteHistoryResult;
import com.xiaomi.fitness.sport.route.detail.model.GetRouteRankingResult;
import com.xiaomi.fitness.sport.route.detail.model.GetRunningRecordBindStatus;
import com.xiaomi.fitness.sport.route.detail.model.ProgressRouteStatus;
import com.xiaomi.fitness.sport.route.detail.model.RouteListRequestParams;
import com.xiaomi.fitness.sport.route.detail.model.RouteStyleListRequestParams;
import com.xiaomi.fitness.sport.route.detail.model.RouteStyleListResult;
import com.xiaomi.fitness.sport.route.detail.model.StrategyRouteListBean;
import com.xiaomi.fitness.sport.route.detail.model.UserRouteStrategyRequestParams;
import com.xiaomi.fitness.sport.route.detail.model.UserRouteStyleListResult;
import com.xiaomi.fitness.sport.view.route.RunningRouteListBean;
import com.xiaomi.fitness.sport_export.bean.ClockData;
import com.xiaomi.fitness.sport_export.data.RouteCollectResponse;
import com.xiaomi.fitness.sport_export.data.RouteCollectResult;
import com.xiaomi.fitness.sport_export.data.RunningRouteSupportCityBean;
import dagger.hilt.android.EntryPointAccessors;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 U2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001UB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\fJ&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u0011J(\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019J\u000e\u0010\u001a\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0015H\u0086@¢\u0006\u0002\u0010 J(\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010'J&\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\n2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0086@¢\u0006\u0002\u0010*J8\u0010+\u001a\u00020,2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00152\u0006\u00100\u001a\u000201H\u0086@¢\u0006\u0002\u00102J\"\u00103\u001a\u0002042\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u00010\nH\u0086@¢\u0006\u0002\u00106J\u0018\u00107\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020:H\u0086@¢\u0006\u0002\u0010;J\u0018\u0010<\u001a\u0004\u0018\u00010\"2\u0006\u0010=\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010>J\u001a\u0010?\u001a\u0004\u0018\u00010@2\b\b\u0002\u0010A\u001a\u00020BH\u0086@¢\u0006\u0002\u0010CJ\u0018\u0010D\u001a\u0004\u0018\u00010E2\u0006\u0010F\u001a\u00020GH\u0086@¢\u0006\u0002\u0010HJ\u0016\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010>J\u0010\u0010K\u001a\u0004\u0018\u00010LH\u0086@¢\u0006\u0002\u0010\u001cJ\u000e\u0010M\u001a\u00020NH\u0086@¢\u0006\u0002\u0010\u001cJ\u001e\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\fJ\u001e\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006V"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/server/RouteRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/sport/route/detail/server/RouteService;", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "getRouteDetail", "Lcom/xiaomi/fitness/sport/route/detail/model/GetRouteDetailResult;", "routeId", "", "routeType", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRankingList", "Lcom/xiaomi/fitness/sport/route/detail/model/GetRouteRankingResult;", "categoryId", "limit", "(IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRunningRecordBindStatus", "Lcom/xiaomi/fitness/sport/route/detail/model/GetRunningRecordBindStatus;", "sid", "", "key", "time", "", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRunningRouteInlet", "Lcom/xiaomi/fitness/sport/bean/RunningRouteTabBean;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRunningRouteSupport", "Lcom/xiaomi/fitness/sport_export/data/RunningRouteSupportCityBean;", TSMAuthContants.PARAM_CITYCODE, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRouteRecommend", "Lcom/xiaomi/fitness/sport/view/route/RunningRouteListBean;", "longitude", "", "latitude", "originType", "(FFILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRouteList", "category", "(IFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "routeClockIn", "Lcom/xiaomi/fitness/sport/route/detail/model/ClockInResult;", "sportRecordKey", "startTime", "operation", "clockData", "Lcom/xiaomi/fitness/sport_export/bean/ClockData;", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lcom/xiaomi/fitness/sport_export/bean/ClockData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRouteHistory", "Lcom/xiaomi/fitness/sport/route/detail/model/GetRouteHistoryResult;", "nextKey", "(ILjava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRouteStrategyList", "Lcom/xiaomi/fitness/sport/route/detail/model/StrategyRouteListBean;", "userRouteStrategyListParams", "Lcom/xiaomi/fitness/sport/route/detail/model/RouteListRequestParams;", "(Lcom/xiaomi/fitness/sport/route/detail/model/RouteListRequestParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEmptyLandModeList", "strategyId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRouteStyleList", "Lcom/xiaomi/fitness/sport/route/detail/model/RouteStyleListResult;", "routeStyleListRequestParams", "Lcom/xiaomi/fitness/sport/route/detail/model/RouteStyleListRequestParams;", "(Lcom/xiaomi/fitness/sport/route/detail/model/RouteStyleListRequestParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserRouteStyleList", "Lcom/xiaomi/fitness/sport/route/detail/model/UserRouteStyleListResult;", "userRouteStyleListRequestParams", "Lcom/xiaomi/fitness/sport/route/detail/model/UserRouteStrategyRequestParams;", "(Lcom/xiaomi/fitness/sport/route/detail/model/UserRouteStrategyRequestParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelCreateRoute", "", "getProgressRoute", "Lcom/xiaomi/fitness/sport/route/detail/model/ProgressRouteStatus;", "getCityRoutes", "Lcom/xiaomi/fitness/sport/route/detail/model/CityRoutesResult;", "getCollectList", "Lcom/xiaomi/fitness/sport_export/data/RouteCollectResponse;", "page", "collectRoute", "Lcom/xiaomi/fitness/sport_export/data/RouteCollectResult;", "collect", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRouteRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteRequest.kt\ncom/xiaomi/fitness/sport/route/detail/server/RouteRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,273:1\n141#2:274\n141#2:278\n141#2:282\n141#2:286\n141#2:290\n141#2:294\n141#2:298\n141#2:302\n141#2:306\n141#2:310\n141#2:314\n141#2:318\n141#2:322\n141#2:326\n141#2:330\n141#2:334\n141#2:338\n141#2:342\n31#3:275\n28#3,2:276\n31#3:279\n28#3,2:280\n31#3:283\n28#3,2:284\n31#3:287\n28#3,2:288\n31#3:291\n28#3,2:292\n31#3:295\n28#3,2:296\n31#3:299\n28#3,2:300\n31#3:303\n28#3,2:304\n31#3:307\n28#3,2:308\n31#3:311\n28#3,2:312\n31#3:315\n28#3,2:316\n31#3:319\n28#3,2:320\n31#3:323\n28#3,2:324\n31#3:327\n28#3,2:328\n31#3:331\n28#3,2:332\n31#3:335\n28#3,2:336\n31#3:339\n28#3,2:340\n31#3:343\n28#3,2:344\n*S KotlinDebug\n*F\n+ 1 RouteRequest.kt\ncom/xiaomi/fitness/sport/route/detail/server/RouteRequest\n*L\n60#1:274\n69#1:278\n82#1:282\n86#1:286\n103#1:290\n116#1:294\n128#1:298\n144#1:302\n152#1:306\n165#1:310\n180#1:314\n196#1:318\n216#1:322\n236#1:326\n245#1:330\n256#1:334\n263#1:338\n270#1:342\n60#1:275\n60#1:276,2\n69#1:279\n69#1:280,2\n82#1:283\n82#1:284,2\n86#1:287\n86#1:288,2\n103#1:291\n103#1:292,2\n116#1:295\n116#1:296,2\n128#1:299\n128#1:300,2\n144#1:303\n144#1:304,2\n152#1:307\n152#1:308,2\n165#1:311\n165#1:312,2\n180#1:315\n180#1:316,2\n196#1:319\n196#1:320,2\n216#1:323\n216#1:324,2\n236#1:327\n236#1:328,2\n245#1:331\n245#1:332,2\n256#1:335\n256#1:336,2\n263#1:339\n263#1:340,2\n270#1:343\n270#1:344,2\n*E\n"})
public final class RouteRequest extends BaseRequest<RouteService> {

    @NotNull
    public static final String KEY_CATEGORY = "category";

    @NotNull
    public static final String KEY_LATITUDE = "latitude";

    @NotNull
    public static final String KEY_LIMIT = "limit";

    @NotNull
    public static final String KEY_LONGITUDE = "longitude";

    @NotNull
    public static final String KEY_NEXT_KEY = "next_key";

    @NotNull
    public static final String KEY_RANK_CATEGORY = "rank_category";

    @NotNull
    public static final String KEY_ROUTE_DETAIL = "route_detail";

    @NotNull
    public static final String KEY_ROUTE_ID = "route_id";

    @NotNull
    public static final String KEY_ROUTE_TYPE = "route_type";

    @NotNull
    public static final String KEY_SID = "sid";

    @NotNull
    public static final String KEY_SPORT_RECORD_KEY = "key";

    @NotNull
    public static final String KEY_SPORT_TIME = "time";

    @NotNull
    public static final String TAG = "RouteRequest";

    @NotNull
    private final Gson gson = new Gson();

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final RouteRequest instance = new RouteRequest();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/server/RouteRequest$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/sport/route/detail/server/RouteRequest;", "getInstance", "()Lcom/xiaomi/fitness/sport/route/detail/server/RouteRequest;", "KEY_ROUTE_DETAIL", "", "KEY_RANK_CATEGORY", "KEY_ROUTE_ID", "KEY_ROUTE_TYPE", "KEY_LIMIT", "KEY_SID", "KEY_SPORT_RECORD_KEY", "KEY_SPORT_TIME", "KEY_LONGITUDE", "KEY_LATITUDE", "KEY_CATEGORY", "KEY_NEXT_KEY", "TAG", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RouteRequest getInstance() {
            return RouteRequest.instance;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRequest$cancelCreateRoute$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRequest", f = "RouteRequest.kt", i = {0}, l = {236}, m = "cancelCreateRoute", n = {"result"}, s = {"I$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
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
            return RouteRequest.this.cancelCreateRoute(0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRequest$collectRoute$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRequest", f = "RouteRequest.kt", i = {}, l = {270}, m = "collectRoute", n = {}, s = {})
    public static final class C29611 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29611(Continuation<? super C29611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRequest.this.collectRoute(0, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRequest$getCityRoutes$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRequest", f = "RouteRequest.kt", i = {}, l = {256}, m = "getCityRoutes", n = {}, s = {})
    public static final class C29621 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29621(Continuation<? super C29621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRequest.this.getCityRoutes(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRequest$getCollectList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRequest", f = "RouteRequest.kt", i = {}, l = {263}, m = "getCollectList", n = {}, s = {})
    public static final class C29631 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29631(Continuation<? super C29631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRequest.this.getCollectList(0, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRequest$getEmptyLandModeList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRequest", f = "RouteRequest.kt", i = {}, l = {180}, m = "getEmptyLandModeList", n = {}, s = {})
    public static final class C29641 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29641(Continuation<? super C29641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRequest.this.getEmptyLandModeList(0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRequest$getProgressRoute$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRequest", f = "RouteRequest.kt", i = {}, l = {245}, m = "getProgressRoute", n = {}, s = {})
    public static final class C29651 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29651(Continuation<? super C29651> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRequest.this.getProgressRoute(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRequest$getRankingList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRequest", f = "RouteRequest.kt", i = {}, l = {69}, m = "getRankingList", n = {}, s = {})
    public static final class C29661 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29661(Continuation<? super C29661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRequest.this.getRankingList(0, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRequest$getRouteDetail$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRequest", f = "RouteRequest.kt", i = {}, l = {60}, m = "getRouteDetail", n = {}, s = {})
    public static final class C29671 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29671(Continuation<? super C29671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRequest.this.getRouteDetail(0, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRequest$getRouteHistory$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRequest", f = "RouteRequest.kt", i = {}, l = {152}, m = "getRouteHistory", n = {}, s = {})
    public static final class C29681 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29681(Continuation<? super C29681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRequest.this.getRouteHistory(0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRequest$getRouteList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRequest", f = "RouteRequest.kt", i = {}, l = {128}, m = "getRouteList", n = {}, s = {})
    public static final class C29691 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29691(Continuation<? super C29691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRequest.this.getRouteList(0, 0.0f, 0.0f, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRequest$getRouteRecommend$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRequest", f = "RouteRequest.kt", i = {}, l = {116}, m = "getRouteRecommend", n = {}, s = {})
    public static final class C29701 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29701(Continuation<? super C29701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRequest.this.getRouteRecommend(0.0f, 0.0f, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRequest$getRouteStrategyList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRequest", f = "RouteRequest.kt", i = {}, l = {165}, m = "getRouteStrategyList", n = {}, s = {})
    public static final class C29711 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29711(Continuation<? super C29711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRequest.this.getRouteStrategyList(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRequest$getRouteStyleList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRequest", f = "RouteRequest.kt", i = {}, l = {SportReportBaseParser.ReportType.oxygenConcentration}, m = "getRouteStyleList", n = {}, s = {})
    public static final class C29721 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29721(Continuation<? super C29721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRequest.this.getRouteStyleList(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRequest$getRunningRecordBindStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRequest", f = "RouteRequest.kt", i = {}, l = {82}, m = "getRunningRecordBindStatus", n = {}, s = {})
    public static final class C29731 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29731(Continuation<? super C29731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRequest.this.getRunningRecordBindStatus(null, null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRequest$getRunningRouteInlet$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRequest", f = "RouteRequest.kt", i = {}, l = {86}, m = "getRunningRouteInlet", n = {}, s = {})
    public static final class C29741 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29741(Continuation<? super C29741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRequest.this.getRunningRouteInlet(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRequest$getRunningRouteSupport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRequest", f = "RouteRequest.kt", i = {}, l = {103}, m = "getRunningRouteSupport", n = {}, s = {})
    public static final class C29751 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29751(Continuation<? super C29751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRequest.this.getRunningRouteSupport(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRequest$getUserRouteStyleList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRequest", f = "RouteRequest.kt", i = {}, l = {216}, m = "getUserRouteStyleList", n = {}, s = {})
    public static final class C29761 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29761(Continuation<? super C29761> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRequest.this.getUserRouteStyleList(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.server.RouteRequest$routeClockIn$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.server.RouteRequest", f = "RouteRequest.kt", i = {}, l = {144}, m = "routeClockIn", n = {}, s = {})
    public static final class C29771 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29771(Continuation<? super C29771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRequest.this.routeClockIn(null, null, 0L, null, null, this);
        }
    }

    public static /* synthetic */ Object getRouteDetail$default(RouteRequest routeRequest, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return routeRequest.getRouteDetail(i, i2, continuation);
    }

    public static /* synthetic */ Object getRouteHistory$default(RouteRequest routeRequest, int i, Integer num, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 60;
        }
        return routeRequest.getRouteHistory(i, num, continuation);
    }

    public static /* synthetic */ Object getRouteRecommend$default(RouteRequest routeRequest, float f, float f2, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return routeRequest.getRouteRecommend(f, f2, i, continuation);
    }

    public static /* synthetic */ Object getRouteStyleList$default(RouteRequest routeRequest, RouteStyleListRequestParams routeStyleListRequestParams, Continuation continuation, int i, Object obj) throws ApiException {
        if ((i & 1) != 0) {
            routeStyleListRequestParams = new RouteStyleListRequestParams(null, 1, null);
        }
        return routeRequest.getRouteStyleList(routeStyleListRequestParams, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Nullable
    public final Object cancelCreateRoute(int i, @NotNull Continuation<? super Boolean> continuation) {
        AnonymousClass1 anonymousClass1;
        int i2;
        ?? BooleanValue;
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
        Object objCancelCreateRoute = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = anonymousClass1.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objCancelCreateRoute);
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("strategy_id", Boxing.boxInt(i));
                String json = this.gson.toJson(linkedHashMap);
                RouteService mService = getMService();
                Intrinsics.checkNotNull(json);
                anonymousClass1.I$0 = 0;
                anonymousClass1.label = 1;
                objCancelCreateRoute = mService.cancelCreateRoute(json, anonymousClass1);
                if (objCancelCreateRoute == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception e) {
                e = e;
                i2 = 0;
                FitnessLogUtils.i(TAG, "cancelCreateRoute error:" + e);
                BooleanValue = i2;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = anonymousClass1.I$0;
            try {
                ResultKt.throwOnFailure(objCancelCreateRoute);
            } catch (Exception e2) {
                e = e2;
                FitnessLogUtils.i(TAG, "cancelCreateRoute error:" + e);
                BooleanValue = i2;
            }
        }
        BooleanValue = ((Boolean) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objCancelCreateRoute)).booleanValue();
        return Boxing.boxBoolean(BooleanValue != 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object collectRoute(int i, int i2, @NotNull Continuation<? super RouteCollectResult> continuation) {
        C29611 c29611;
        if (continuation instanceof C29611) {
            c29611 = (C29611) continuation;
            int i3 = c29611.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c29611.label = i3 - Integer.MIN_VALUE;
            } else {
                c29611 = new C29611(continuation);
            }
        } else {
            c29611 = new C29611(continuation);
        }
        Object objCollectRoute = c29611.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c29611.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objCollectRoute);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("route_id", Boxing.boxInt(i2));
            linkedHashMap.put("collect_type", Boxing.boxInt(i));
            RouteService mService = getMService();
            String json = getMGson().toJson(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c29611.label = 1;
            objCollectRoute = mService.collectRoute(json, c29611);
            if (objCollectRoute == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCollectRoute);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objCollectRoute);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getCityRoutes(@NotNull Continuation<? super CityRoutesResult> continuation) {
        C29621 c29621;
        if (continuation instanceof C29621) {
            c29621 = (C29621) continuation;
            int i = c29621.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29621.label = i - Integer.MIN_VALUE;
            } else {
                c29621 = new C29621(continuation);
            }
        } else {
            c29621 = new C29621(continuation);
        }
        Object cityRouteCounts = c29621.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c29621.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(cityRouteCounts);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("need_nums", Boxing.boxBoolean(true));
            String json = this.gson.toJson(linkedHashMap);
            RouteService mService = getMService();
            Intrinsics.checkNotNull(json);
            c29621.label = 1;
            cityRouteCounts = mService.getCityRouteCounts(json, c29621);
            if (cityRouteCounts == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(cityRouteCounts);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(cityRouteCounts);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getCollectList(int i, int i2, @NotNull Continuation<? super RouteCollectResponse> continuation) {
        C29631 c29631;
        if (continuation instanceof C29631) {
            c29631 = (C29631) continuation;
            int i3 = c29631.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c29631.label = i3 - Integer.MIN_VALUE;
            } else {
                c29631 = new C29631(continuation);
            }
        } else {
            c29631 = new C29631(continuation);
        }
        Object collectList = c29631.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c29631.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(collectList);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("page", Boxing.boxInt(i));
            linkedHashMap.put("limit", Boxing.boxInt(i2));
            RouteService mService = getMService();
            String json = getMGson().toJson(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c29631.label = 1;
            collectList = mService.getCollectList(json, c29631);
            if (collectList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(collectList);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(collectList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getEmptyLandModeList(int i, @NotNull Continuation<? super RunningRouteListBean> continuation) {
        C29641 c29641;
        if (continuation instanceof C29641) {
            c29641 = (C29641) continuation;
            int i2 = c29641.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29641.label = i2 - Integer.MIN_VALUE;
            } else {
                c29641 = new C29641(continuation);
            }
        } else {
            c29641 = new C29641(continuation);
        }
        Object emptyLandModeList = c29641.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c29641.label;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(emptyLandModeList);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("strategy_id", Boxing.boxInt(i));
                RouteService mService = getMService();
                String json = getMGson().toJson(linkedHashMap);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                c29641.label = 1;
                emptyLandModeList = mService.getEmptyLandModeList(json, c29641);
                if (emptyLandModeList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(emptyLandModeList);
            }
            return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(emptyLandModeList);
        } catch (Exception e) {
            Logger.i(TAG, "getEmptyLandModeList fail. error=" + e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getProgressRoute(@NotNull Continuation<? super ProgressRouteStatus> continuation) {
        C29651 c29651;
        if (continuation instanceof C29651) {
            c29651 = (C29651) continuation;
            int i = c29651.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29651.label = i - Integer.MIN_VALUE;
            } else {
                c29651 = new C29651(continuation);
            }
        } else {
            c29651 = new C29651(continuation);
        }
        Object progressRoute = c29651.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c29651.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(progressRoute);
                RouteService mService = getMService();
                c29651.label = 1;
                progressRoute = mService.getProgressRoute(c29651);
                if (progressRoute == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(progressRoute);
            }
            return (ProgressRouteStatus) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(progressRoute);
        } catch (Exception e) {
            FitnessLogUtils.i(TAG, "getProgressRoute error:" + e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRankingList(int i, int i2, int i3, @NotNull Continuation<? super GetRouteRankingResult> continuation) {
        C29661 c29661;
        if (continuation instanceof C29661) {
            c29661 = (C29661) continuation;
            int i4 = c29661.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c29661.label = i4 - Integer.MIN_VALUE;
            } else {
                c29661 = new C29661(continuation);
            }
        } else {
            c29661 = new C29661(continuation);
        }
        Object rankingList = c29661.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = c29661.label;
        if (i5 == 0) {
            ResultKt.throwOnFailure(rankingList);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("rank_category", Boxing.boxInt(i));
            linkedHashMap.put("route_id", Boxing.boxInt(i2));
            linkedHashMap.put("limit", Boxing.boxInt(i3));
            String json = this.gson.toJson(linkedHashMap);
            RouteService mService = getMService();
            Intrinsics.checkNotNull(json);
            c29661.label = 1;
            rankingList = mService.getRankingList(json, c29661);
            if (rankingList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(rankingList);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(rankingList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRouteDetail(int i, int i2, @NotNull Continuation<? super GetRouteDetailResult> continuation) {
        C29671 c29671;
        if (continuation instanceof C29671) {
            c29671 = (C29671) continuation;
            int i3 = c29671.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c29671.label = i3 - Integer.MIN_VALUE;
            } else {
                c29671 = new C29671(continuation);
            }
        } else {
            c29671 = new C29671(continuation);
        }
        Object routeDetail = c29671.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c29671.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(routeDetail);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("route_id", Boxing.boxInt(i));
            linkedHashMap.put(KEY_ROUTE_TYPE, Boxing.boxInt(i2));
            String json = this.gson.toJson(linkedHashMap);
            RouteService mService = getMService();
            Intrinsics.checkNotNull(json);
            c29671.label = 1;
            routeDetail = mService.getRouteDetail(json, c29671);
            if (routeDetail == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(routeDetail);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(routeDetail);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRouteHistory(int i, @Nullable Integer num, @NotNull Continuation<? super GetRouteHistoryResult> continuation) {
        C29681 c29681;
        if (continuation instanceof C29681) {
            c29681 = (C29681) continuation;
            int i2 = c29681.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29681.label = i2 - Integer.MIN_VALUE;
            } else {
                c29681 = new C29681(continuation);
            }
        } else {
            c29681 = new C29681(continuation);
        }
        Object routeHistory = c29681.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c29681.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(routeHistory);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("limit", Boxing.boxInt(i));
            linkedHashMap.put(KEY_NEXT_KEY, Boxing.boxInt(num != null ? num.intValue() : 0));
            String json = this.gson.toJson(linkedHashMap);
            RouteService mService = getMService();
            Intrinsics.checkNotNull(json);
            c29681.label = 1;
            routeHistory = mService.getRouteHistory(json, c29681);
            if (routeHistory == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(routeHistory);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(routeHistory);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRouteList(int i, float f, float f2, @NotNull Continuation<? super RunningRouteListBean> continuation) {
        C29691 c29691;
        if (continuation instanceof C29691) {
            c29691 = (C29691) continuation;
            int i2 = c29691.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29691.label = i2 - Integer.MIN_VALUE;
            } else {
                c29691 = new C29691(continuation);
            }
        } else {
            c29691 = new C29691(continuation);
        }
        Object routeList = c29691.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c29691.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(routeList);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("longitude", Boxing.boxFloat(f));
            linkedHashMap.put("latitude", Boxing.boxFloat(f2));
            linkedHashMap.put("category", Boxing.boxInt(i));
            RouteService mService = getMService();
            String json = this.gson.toJson(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c29691.label = 1;
            routeList = mService.getRouteList(json, c29691);
            if (routeList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(routeList);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(routeList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRouteRecommend(float f, float f2, int i, @NotNull Continuation<? super RunningRouteListBean> continuation) {
        C29701 c29701;
        if (continuation instanceof C29701) {
            c29701 = (C29701) continuation;
            int i2 = c29701.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29701.label = i2 - Integer.MIN_VALUE;
            } else {
                c29701 = new C29701(continuation);
            }
        } else {
            c29701 = new C29701(continuation);
        }
        Object routeRecommend = c29701.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c29701.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(routeRecommend);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("longitude", Boxing.boxFloat(f));
            linkedHashMap.put("latitude", Boxing.boxFloat(f2));
            linkedHashMap.put("origin_type", Boxing.boxInt(i));
            FitnessLogUtils.d(TAG, "lon:" + f + " , lat:" + f2);
            RouteService mService = getMService();
            String json = this.gson.toJson(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c29701.label = 1;
            routeRecommend = mService.getRouteRecommend(json, c29701);
            if (routeRecommend == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(routeRecommend);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(routeRecommend);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRouteStrategyList(@NotNull RouteListRequestParams routeListRequestParams, @NotNull Continuation<? super StrategyRouteListBean> continuation) {
        C29711 c29711;
        if (continuation instanceof C29711) {
            c29711 = (C29711) continuation;
            int i = c29711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29711.label = i - Integer.MIN_VALUE;
            } else {
                c29711 = new C29711(continuation);
            }
        } else {
            c29711 = new C29711(continuation);
        }
        Object routeStrategyList = c29711.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c29711.label;
        StrategyRouteListBean strategyRouteListBean = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(routeStrategyList);
                String json = this.gson.toJson(routeListRequestParams);
                RouteService mService = getMService();
                Intrinsics.checkNotNull(json);
                c29711.label = 1;
                routeStrategyList = mService.getRouteStrategyList(json, c29711);
                if (routeStrategyList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(routeStrategyList);
            }
            StrategyRouteListBean strategyRouteListBean2 = (StrategyRouteListBean) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(routeStrategyList);
            try {
                Logger.i(TAG, "getRouteStrategyList success. result=" + strategyRouteListBean2);
                return strategyRouteListBean2;
            } catch (Exception e) {
                strategyRouteListBean = strategyRouteListBean2;
                e = e;
                Logger.i(TAG, "getRouteStrategyList fail. error=" + e);
                return strategyRouteListBean;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRouteStyleList(@NotNull RouteStyleListRequestParams routeStyleListRequestParams, @NotNull Continuation<? super RouteStyleListResult> continuation) throws Exception {
        C29721 c29721;
        if (continuation instanceof C29721) {
            c29721 = (C29721) continuation;
            int i = c29721.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29721.label = i - Integer.MIN_VALUE;
            } else {
                c29721 = new C29721(continuation);
            }
        } else {
            c29721 = new C29721(continuation);
        }
        Object routeStyleList = c29721.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c29721.label;
        RouteStyleListResult routeStyleListResult = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(routeStyleList);
                String json = this.gson.toJson(routeStyleListRequestParams);
                RouteService mService = getMService();
                Intrinsics.checkNotNull(json);
                c29721.label = 1;
                routeStyleList = mService.getRouteStyleList(json, c29721);
                if (routeStyleList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(routeStyleList);
            }
            RouteStyleListResult routeStyleListResult2 = (RouteStyleListResult) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(routeStyleList);
            try {
                Logger.i(TAG, "getRouteStyleList success. result=" + routeStyleListResult2);
                return routeStyleListResult2;
            } catch (Exception e) {
                routeStyleListResult = routeStyleListResult2;
                e = e;
                if (e instanceof ApiException) {
                    throw e;
                }
                Logger.i(TAG, "getRouteStyleList fail. error=" + e);
                return routeStyleListResult;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRunningRecordBindStatus(@Nullable String str, @NotNull String str2, long j, @NotNull Continuation<? super GetRunningRecordBindStatus> continuation) {
        C29731 c29731;
        if (continuation instanceof C29731) {
            c29731 = (C29731) continuation;
            int i = c29731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29731.label = i - Integer.MIN_VALUE;
            } else {
                c29731 = new C29731(continuation);
            }
        } else {
            c29731 = new C29731(continuation);
        }
        Object runningRecordBoundStatus = c29731.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c29731.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(runningRecordBoundStatus);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("sid", str);
            linkedHashMap.put("key", str2);
            linkedHashMap.put("time", Boxing.boxLong(j));
            String json = this.gson.toJson(linkedHashMap);
            RouteService mService = getMService();
            Intrinsics.checkNotNull(json);
            c29731.label = 1;
            runningRecordBoundStatus = mService.getRunningRecordBoundStatus(json, c29731);
            if (runningRecordBoundStatus == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(runningRecordBoundStatus);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(runningRecordBoundStatus);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRunningRouteInlet(@NotNull Continuation<? super RunningRouteTabBean> continuation) {
        C29741 c29741;
        if (continuation instanceof C29741) {
            c29741 = (C29741) continuation;
            int i = c29741.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29741.label = i - Integer.MIN_VALUE;
            } else {
                c29741 = new C29741(continuation);
            }
        } else {
            c29741 = new C29741(continuation);
        }
        Object runningRouteInlet = c29741.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c29741.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(runningRouteInlet);
            RouteService mService = getMService();
            c29741.label = 1;
            runningRouteInlet = mService.getRunningRouteInlet(c29741);
            if (runningRouteInlet == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(runningRouteInlet);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(runningRouteInlet);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRunningRouteSupport(@Nullable String str, @NotNull Continuation<? super RunningRouteSupportCityBean> continuation) {
        C29751 c29751;
        if (continuation instanceof C29751) {
            c29751 = (C29751) continuation;
            int i = c29751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29751.label = i - Integer.MIN_VALUE;
            } else {
                c29751 = new C29751(continuation);
            }
        } else {
            c29751 = new C29751(continuation);
        }
        Object runningRouteSupport = c29751.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c29751.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(runningRouteSupport);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("city_code", str);
            FitnessLogUtils.d(TAG, "cityCode:" + str);
            RouteService mService = getMService();
            String json = this.gson.toJson(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c29751.label = 1;
            runningRouteSupport = mService.getRunningRouteSupport(json, c29751);
            if (runningRouteSupport == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(runningRouteSupport);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(runningRouteSupport);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getUserRouteStyleList(@NotNull UserRouteStrategyRequestParams userRouteStrategyRequestParams, @NotNull Continuation<? super UserRouteStyleListResult> continuation) throws Exception {
        C29761 c29761;
        if (continuation instanceof C29761) {
            c29761 = (C29761) continuation;
            int i = c29761.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29761.label = i - Integer.MIN_VALUE;
            } else {
                c29761 = new C29761(continuation);
            }
        } else {
            c29761 = new C29761(continuation);
        }
        Object objPostUserRouteStrategy = c29761.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c29761.label;
        UserRouteStyleListResult userRouteStyleListResult = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objPostUserRouteStrategy);
                String json = this.gson.toJson(userRouteStrategyRequestParams);
                RouteService mService = getMService();
                Intrinsics.checkNotNull(json);
                c29761.label = 1;
                objPostUserRouteStrategy = mService.postUserRouteStrategy(json, c29761);
                if (objPostUserRouteStrategy == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPostUserRouteStrategy);
            }
            UserRouteStyleListResult userRouteStyleListResult2 = (UserRouteStyleListResult) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objPostUserRouteStrategy);
            try {
                Logger.i(TAG, "getRouteStyleList success. result=" + userRouteStyleListResult2);
                return userRouteStyleListResult2;
            } catch (Exception e) {
                userRouteStyleListResult = userRouteStyleListResult2;
                e = e;
                if (e instanceof ApiException) {
                    throw e;
                }
                Logger.i(TAG, "getRouteStyleList fail. error=" + e);
                return userRouteStyleListResult;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object routeClockIn(@Nullable String str, @NotNull String str2, long j, @NotNull String str3, @NotNull ClockData clockData, @NotNull Continuation<? super ClockInResult> continuation) {
        C29771 c29771;
        if (continuation instanceof C29771) {
            c29771 = (C29771) continuation;
            int i = c29771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29771.label = i - Integer.MIN_VALUE;
            } else {
                c29771 = new C29771(continuation);
            }
        } else {
            c29771 = new C29771(continuation);
        }
        Object objRouteClockIn = c29771.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c29771.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRouteClockIn);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("sid", str);
            linkedHashMap.put("key", str2);
            linkedHashMap.put("time", Boxing.boxLong(j));
            linkedHashMap.put("operation", str3);
            linkedHashMap.put("value", clockData);
            RouteService mService = getMService();
            String json = this.gson.toJson(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c29771.label = 1;
            objRouteClockIn = mService.routeClockIn(json, c29771);
            if (objRouteClockIn == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRouteClockIn);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objRouteClockIn);
    }
}
