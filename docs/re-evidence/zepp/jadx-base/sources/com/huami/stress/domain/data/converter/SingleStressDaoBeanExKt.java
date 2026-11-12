package com.huami.stress.domain.data.converter;

import com.huami.stress.domain.data.local.bean.SingleStressDaoBean;
import com.huami.stress.domain.data.remote.bean.SingleStressApiBean;
import com.huami.stress.domain.model.SingleStress;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0005"}, d2 = {"Lcom/huami/stress/domain/data/local/bean/SingleStressDaoBean;", "Lcom/huami/stress/domain/model/SingleStress;", "toSingleStress", "Lcom/huami/stress/domain/data/remote/bean/SingleStressApiBean;", "toSingleStressApiBean", "domain_release"}, k = 2, mv = {1, 5, 1})
public final class SingleStressDaoBeanExKt {
    @NotNull
    public static final SingleStress toSingleStress(@NotNull SingleStressDaoBean singleStressDaoBean) {
        return new SingleStress(singleStressDaoBean.getTimestamp(), singleStressDaoBean.getUserId(), singleStressDaoBean.getValue(), singleStressDaoBean.getDeviceSource(), singleStressDaoBean.getDeviceType(), singleStressDaoBean.getDeviceId(), singleStressDaoBean.getDeviceMac(), singleStressDaoBean.getDeviceSn());
    }

    @NotNull
    public static final SingleStressApiBean toSingleStressApiBean(@NotNull SingleStressDaoBean singleStressDaoBean) {
        return new SingleStressApiBean(singleStressDaoBean.getUserId(), singleStressDaoBean.getTimestamp(), singleStressDaoBean.getValue(), singleStressDaoBean.getDeviceType(), singleStressDaoBean.getDeviceId(), singleStressDaoBean.getDeviceSource(), singleStressDaoBean.getDeviceMac(), singleStressDaoBean.getDeviceSn());
    }
}
