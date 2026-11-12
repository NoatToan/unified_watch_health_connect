package com.xiaomi.fitness.sport.route.detail.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.sport.bean.BaseSportItemBean;
import com.xiaomi.fitness.sport_export.data.StrategyRouteInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/model/StrategyRouteListBean;", "Lcom/xiaomi/fitness/sport/bean/BaseSportItemBean;", "strategyRouteInfoList", "", "Lcom/xiaomi/fitness/sport_export/data/StrategyRouteInfo;", "<init>", "(Ljava/util/List;)V", "getStrategyRouteInfoList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StrategyRouteListBean extends BaseSportItemBean {

    @SerializedName("route_list")
    @Nullable
    private final List<StrategyRouteInfo> strategyRouteInfoList;

    public StrategyRouteListBean(@Nullable List<StrategyRouteInfo> list) {
        this.strategyRouteInfoList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StrategyRouteListBean copy$default(StrategyRouteListBean strategyRouteListBean, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = strategyRouteListBean.strategyRouteInfoList;
        }
        return strategyRouteListBean.copy(list);
    }

    @Nullable
    public final List<StrategyRouteInfo> component1() {
        return this.strategyRouteInfoList;
    }

    @NotNull
    public final StrategyRouteListBean copy(@Nullable List<StrategyRouteInfo> strategyRouteInfoList) {
        return new StrategyRouteListBean(strategyRouteInfoList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StrategyRouteListBean) && Intrinsics.areEqual(this.strategyRouteInfoList, ((StrategyRouteListBean) other).strategyRouteInfoList);
    }

    @Nullable
    public final List<StrategyRouteInfo> getStrategyRouteInfoList() {
        return this.strategyRouteInfoList;
    }

    public int hashCode() {
        List<StrategyRouteInfo> list = this.strategyRouteInfoList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "StrategyRouteListBean(strategyRouteInfoList=" + this.strategyRouteInfoList + ")";
    }
}
