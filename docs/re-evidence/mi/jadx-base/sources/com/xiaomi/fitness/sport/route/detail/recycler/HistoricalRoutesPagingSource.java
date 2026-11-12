package com.xiaomi.fitness.sport.route.detail.recycler;

import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport.route.detail.model.GetRouteHistoryResult;
import com.xiaomi.fitness.sport.route.detail.server.RouteRepository;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\b\u001a\u0004\u0018\u00010\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\nH\u0016¢\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/recycler/HistoricalRoutesPagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "routeRepository", "Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;", "<init>", "(Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;)V", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HistoricalRoutesPagingSource extends PagingSource<Integer, RouteInfo> {

    @NotNull
    public static final String TAG = "HistoricalRoutesPagingSource";

    @NotNull
    private final RouteRepository routeRepository;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.route.detail.recycler.HistoricalRoutesPagingSource$load$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.route.detail.recycler.HistoricalRoutesPagingSource", f = "HistoricalRoutesPagingSource.kt", i = {}, l = {27}, m = "load", n = {}, s = {})
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
            return HistoricalRoutesPagingSource.this.load(null, this);
        }
    }

    public HistoricalRoutesPagingSource(@NotNull RouteRepository routeRepository) {
        Intrinsics.checkNotNullParameter(routeRepository, "routeRepository");
        this.routeRepository = routeRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.paging.PagingSource
    @Nullable
    public Object load(@NotNull PagingSource.LoadParams<Integer> loadParams, @NotNull Continuation<? super PagingSource.LoadResult<Integer, RouteInfo>> continuation) {
        AnonymousClass1 anonymousClass1;
        List<RouteInfo> listEmptyList;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object historyRoutes = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(historyRoutes);
                Logger.d(TAG, "start load key " + loadParams.getKey());
                RouteRepository routeRepository = this.routeRepository;
                Integer num = loadParams instanceof PagingSource.LoadParams.Append ? (Integer) ((PagingSource.LoadParams.Append) loadParams).getKey() : null;
                anonymousClass1.label = 1;
                historyRoutes = routeRepository.getHistoryRoutes(60, num, anonymousClass1);
                if (historyRoutes == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(historyRoutes);
            }
            GetRouteHistoryResult getRouteHistoryResult = (GetRouteHistoryResult) historyRoutes;
            if (getRouteHistoryResult == null || (listEmptyList = getRouteHistoryResult.getRouteList()) == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            return new PagingSource.LoadResult.Page(listEmptyList, null, ((getRouteHistoryResult != null ? Boxing.boxInt(getRouteHistoryResult.getNextKey()) : null) == null || getRouteHistoryResult.getNextKey() <= 0) ? null : Boxing.boxInt(getRouteHistoryResult.getNextKey()));
        } catch (Exception e) {
            Logger.i(TAG, "start load exception:" + e);
            return new PagingSource.LoadResult.Error(e);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.paging.PagingSource
    @Nullable
    public Integer getRefreshKey(@NotNull PagingState<Integer, RouteInfo> state) {
        Integer nextKey;
        int iIntValue;
        Integer prevKey;
        Intrinsics.checkNotNullParameter(state, "state");
        Integer anchorPosition = state.getAnchorPosition();
        Integer numValueOf = null;
        if (anchorPosition != null) {
            PagingSource.LoadResult.Page<Integer, RouteInfo> pageClosestPageToPosition = state.closestPageToPosition(anchorPosition.intValue());
            if (pageClosestPageToPosition != null && (prevKey = pageClosestPageToPosition.getPrevKey()) != null) {
                iIntValue = prevKey.intValue() + 1;
            } else if (pageClosestPageToPosition != null && (nextKey = pageClosestPageToPosition.getNextKey()) != null) {
                iIntValue = nextKey.intValue() - 1;
            }
            numValueOf = Integer.valueOf(iIntValue);
        }
        Logger.d(TAG, "getRefreshKey result " + numValueOf + " , start " + state);
        return numValueOf;
    }
}
