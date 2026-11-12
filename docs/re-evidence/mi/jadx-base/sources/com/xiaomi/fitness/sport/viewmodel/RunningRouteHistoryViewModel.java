package com.xiaomi.fitness.sport.viewmodel;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import androidx.paging.PagingSource;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.sport.route.detail.recycler.HistoricalRoutesPagingSource;
import com.xiaomi.fitness.sport.route.detail.server.RouteRepository;
import com.xiaomi.fitness.sport.viewmodel.RunningRouteHistoryViewModel;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport/viewmodel/RunningRouteHistoryViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "routeRepository", "Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;", "getRouteRepository", "()Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;", "setRouteRepository", "(Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;)V", "getHistoricalRoutesPagingDataLiveData", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RunningRouteHistoryViewModel extends AbsViewModel {
    public RouteRepository routeRepository;

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource getHistoricalRoutesPagingDataLiveData$lambda$0(RunningRouteHistoryViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new HistoricalRoutesPagingSource(this$0.getRouteRepository());
    }

    @NotNull
    public final LiveData<PagingData<RouteInfo>> getHistoricalRoutesPagingDataLiveData() {
        return FlowLiveDataConversions.asLiveData$default(CachedPagingDataKt.cachedIn(new Pager(new PagingConfig(20, 10, false, 0, 0, 0, 56, null), null, new Function0() { // from class: k3l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RunningRouteHistoryViewModel.getHistoricalRoutesPagingDataLiveData$lambda$0(this.f23396a);
            }
        }, 2, null).getFlow(), ViewModelKt.getViewModelScope(this)), (CoroutineContext) null, 0L, 3, (Object) null);
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

    public final void setRouteRepository(@NotNull RouteRepository routeRepository) {
        Intrinsics.checkNotNullParameter(routeRepository, "<set-?>");
        this.routeRepository = routeRepository;
    }
}
