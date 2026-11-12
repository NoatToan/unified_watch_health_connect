package com.xiaomi.fitness.sport_export;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.xiaomi.fitness.sport_export.data.RouteCollectResponse;
import com.xiaomi.fitness.sport_export.data.RouteCollectResult;
import com.xiaomi.fitness.sport_export.data.RunningRouteSupportCityBean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000  2\u00020\u0001:\u0001 J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J8\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H&J \u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019H¦@¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\rH&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u0017¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/sport_export/IRunningRouteApi;", "", "goToRouteDetailActivity", "", "context", "Landroid/content/Context;", "routeId", "", "traceFileUrl", "", "gotoCreateRouteDetailActivity", "getRouteClockInSuccessLiveData", "Landroidx/lifecycle/LiveData;", "", "sid", "sportRecordKey", "startTime", "", "score", "getCollectList", "Lcom/xiaomi/fitness/sport_export/data/RouteCollectResponse;", "page", "limit", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkSupportCity", "Lcom/xiaomi/fitness/sport_export/data/RunningRouteSupportCityBean;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "supportCity", "gotoCreateRunningRouteActivity", "collectRoute", "Lcom/xiaomi/fitness/sport_export/data/RouteCollectResult;", "collect", "Companion", "sport-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IRunningRouteApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_export/IRunningRouteApi$Companion;", "", "<init>", "()V", "sport-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Nullable
    Object checkSupportCity(@NotNull Continuation<? super RunningRouteSupportCityBean> continuation);

    @Nullable
    Object collectRoute(int i, int i2, @NotNull Continuation<? super RouteCollectResult> continuation);

    @Nullable
    Object getCollectList(int i, int i2, @NotNull Continuation<? super RouteCollectResponse> continuation);

    @NotNull
    LiveData<Boolean> getRouteClockInSuccessLiveData(@Nullable String sid, @NotNull String sportRecordKey, long startTime, int routeId, int score);

    void goToRouteDetailActivity(@NotNull Context context, int routeId, @Nullable String traceFileUrl);

    void gotoCreateRouteDetailActivity(@NotNull Context context, int routeId);

    void gotoCreateRunningRouteActivity(@NotNull Context context);

    boolean supportCity();
}
