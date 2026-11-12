package com.huami.stress.domain.data.converter;

import com.huami.stress.domain.data.local.bean.SingleStressDaoBean;
import com.huami.stress.domain.data.remote.bean.SingleStressApiBean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/stress/domain/data/remote/bean/SingleStressApiBean;", "Lcom/huami/stress/domain/data/local/bean/SingleStressDaoBean;", "toSingleStressDaoBean", "domain_release"}, k = 2, mv = {1, 5, 1})
public final class SingleStressApiBeanExKt {
    @NotNull
    public static final SingleStressDaoBean toSingleStressDaoBean(@NotNull SingleStressApiBean singleStressApiBean) {
        return new SingleStressDaoBean(singleStressApiBean.getTimestamp(), singleStressApiBean.getUserId(), singleStressApiBean.getValue(), singleStressApiBean.getDeviceSource(), singleStressApiBean.getDeviceType(), singleStressApiBean.getDeviceId(), singleStressApiBean.getDeviceMac(), singleStressApiBean.getDeviceSn(), true);
    }
}
