package com.xiaomi.fitness.sport.route.detail.server;

import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import com.xiaomi.fitness.sport.bean.RunningRouteTabBean;
import com.xiaomi.fitness.sport.route.detail.model.CityRoutesResult;
import com.xiaomi.fitness.sport.route.detail.model.ClockInResult;
import com.xiaomi.fitness.sport.route.detail.model.GetRouteDetailResult;
import com.xiaomi.fitness.sport.route.detail.model.GetRouteHistoryResult;
import com.xiaomi.fitness.sport.route.detail.model.GetRouteRankingResult;
import com.xiaomi.fitness.sport.route.detail.model.GetRunningRecordBindStatus;
import com.xiaomi.fitness.sport.route.detail.model.ProgressRouteStatus;
import com.xiaomi.fitness.sport.route.detail.model.RouteStyleListResult;
import com.xiaomi.fitness.sport.route.detail.model.StrategyRouteListBean;
import com.xiaomi.fitness.sport.route.detail.model.UserRouteStyleListResult;
import com.xiaomi.fitness.sport.view.route.RunningRouteListBean;
import com.xiaomi.fitness.sport_export.data.RouteCollectResponse;
import com.xiaomi.fitness.sport_export.data.RouteCollectResult;
import com.xiaomi.fitness.sport_export.data.RunningRouteSupportCityBean;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.uua;
import defpackage.xfi;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "app/v1/")
@Secret(pathPrefix = "")
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 )2\u00020\u0001:\u0001)J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H§@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0003H§@¢\u0006\u0002\u0010\u000eJ\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/server/RouteService;", "", "getRouteDetail", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/sport/route/detail/model/GetRouteDetailResult;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRankingList", "Lcom/xiaomi/fitness/sport/route/detail/model/GetRouteRankingResult;", "getRunningRecordBoundStatus", "Lcom/xiaomi/fitness/sport/route/detail/model/GetRunningRecordBindStatus;", "getRunningRouteInlet", "Lcom/xiaomi/fitness/sport/bean/RunningRouteTabBean;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRunningRouteSupport", "Lcom/xiaomi/fitness/sport_export/data/RunningRouteSupportCityBean;", "getRouteRecommend", "Lcom/xiaomi/fitness/sport/view/route/RunningRouteListBean;", "getRouteList", "postUserRouteStrategy", "Lcom/xiaomi/fitness/sport/route/detail/model/UserRouteStyleListResult;", "getRouteStrategyList", "Lcom/xiaomi/fitness/sport/route/detail/model/StrategyRouteListBean;", "getEmptyLandModeList", "getRouteStyleList", "Lcom/xiaomi/fitness/sport/route/detail/model/RouteStyleListResult;", "cancelCreateRoute", "", "routeClockIn", "Lcom/xiaomi/fitness/sport/route/detail/model/ClockInResult;", "getRouteHistory", "Lcom/xiaomi/fitness/sport/route/detail/model/GetRouteHistoryResult;", "getProgressRoute", "Lcom/xiaomi/fitness/sport/route/detail/model/ProgressRouteStatus;", "getCityRouteCounts", "Lcom/xiaomi/fitness/sport/route/detail/model/CityRoutesResult;", "getCollectList", "Lcom/xiaomi/fitness/sport_export/data/RouteCollectResponse;", "collectRoute", "Lcom/xiaomi/fitness/sport_export/data/RouteCollectResult;", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RouteService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HTTP_HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String HTTP_PATH = "app/v1/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/server/RouteService$Companion;", "", "<init>", "()V", "HTTP_PATH", "", "HTTP_HOST", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HTTP_HOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String HTTP_PATH = "app/v1/";

        private Companion() {
        }
    }

    @u0a
    @ngh("running_route/route_cancel")
    @Nullable
    Object cancelCreateRoute(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull Continuation<? super BaseResult<Boolean>> continuation);

    @Nullable
    @uua("running_route/route_toggle_collect")
    Object collectRoute(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<RouteCollectResult>> continuation);

    @Nullable
    @uua("running_route/route_support_city")
    Object getCityRouteCounts(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<CityRoutesResult>> continuation);

    @Nullable
    @uua("running_route/get_collect_list")
    Object getCollectList(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<RouteCollectResponse>> continuation);

    @Nullable
    @uua("running_route/route_space_list")
    Object getEmptyLandModeList(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<RunningRouteListBean>> continuation);

    @Nullable
    @uua("running_route/get_progress_route")
    Object getProgressRoute(@NotNull Continuation<? super BaseResult<ProgressRouteStatus>> continuation);

    @Nullable
    @uua("running_route/get_rank")
    Object getRankingList(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetRouteRankingResult>> continuation);

    @Nullable
    @uua("running_route/get_route_detail")
    Object getRouteDetail(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetRouteDetailResult>> continuation);

    @Nullable
    @uua("running_route/history")
    Object getRouteHistory(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetRouteHistoryResult>> continuation);

    @Nullable
    @uua("running_route/get_route_list")
    Object getRouteList(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<RunningRouteListBean>> continuation);

    @Nullable
    @uua("running_route/get_route_recommend")
    Object getRouteRecommend(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<RunningRouteListBean>> continuation);

    @Nullable
    @uua("running_route/route_strategy_list")
    Object getRouteStrategyList(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<StrategyRouteListBean>> continuation);

    @Nullable
    @uua("running_route/route_style_list")
    Object getRouteStyleList(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<RouteStyleListResult>> continuation);

    @Nullable
    @uua("running_route/get_status")
    Object getRunningRecordBoundStatus(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetRunningRecordBindStatus>> continuation);

    @Secret(loginPolicy = 3)
    @Nullable
    @uua("running_route/show_banner")
    Object getRunningRouteInlet(@NotNull Continuation<? super BaseResult<RunningRouteTabBean>> continuation);

    @Secret(loginPolicy = 3)
    @Nullable
    @uua("running_route/support_open_city")
    Object getRunningRouteSupport(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<RunningRouteSupportCityBean>> continuation);

    @u0a
    @ngh("running_route/user_route_strategy")
    @Nullable
    Object postUserRouteStrategy(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull Continuation<? super BaseResult<UserRouteStyleListResult>> continuation);

    @Nullable
    @uua("running_route/clock_in")
    Object routeClockIn(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<ClockInResult>> continuation);
}
