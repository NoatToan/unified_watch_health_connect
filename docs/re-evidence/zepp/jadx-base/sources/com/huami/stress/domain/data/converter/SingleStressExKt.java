package com.huami.stress.domain.data.converter;

import com.huami.stress.domain.data.local.bean.SingleStressDaoBean;
import com.huami.stress.domain.model.SingleStress;
import com.huami.stress.domain.usecase.statistics.bean.StressPoint;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0005"}, d2 = {"Lcom/huami/stress/domain/model/SingleStress;", "Lcom/huami/stress/domain/usecase/statistics/bean/StressPoint;", "toStressPoint", "Lcom/huami/stress/domain/data/local/bean/SingleStressDaoBean;", "toStressDaoBean", "domain_release"}, k = 2, mv = {1, 5, 1})
public final class SingleStressExKt {
    @NotNull
    public static final SingleStressDaoBean toStressDaoBean(@NotNull SingleStress singleStress) {
        return new SingleStressDaoBean(singleStress.getTimestamp(), singleStress.getUserId(), singleStress.getValue(), singleStress.getDeviceSource(), singleStress.getDeviceType(), singleStress.getDeviceId(), singleStress.getDeviceMac(), singleStress.getDeviceSn(), false);
    }

    @NotNull
    public static final StressPoint toStressPoint(@NotNull SingleStress singleStress) {
        return new StressPoint(singleStress.getValue(), singleStress.getTimestamp(), false);
    }
}
