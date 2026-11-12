package com.xiaomi.fitness.sport_eco.bean;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/bean/RecommendSportListBean;", "Lcom/xiaomi/fitness/sport_eco/bean/BaseSportItemBean;", "data", "", "Lcom/xiaomi/fitness/sport_eco/bean/RecommendSportBean;", "<init>", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecommendSportListBean extends BaseSportItemBean {

    @NotNull
    private final List<RecommendSportBean> data;

    public RecommendSportListBean(@NotNull List<RecommendSportBean> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    @NotNull
    public final List<RecommendSportBean> getData() {
        return this.data;
    }
}
