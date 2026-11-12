package com.huami.stress.domain.data.converter;

import com.huami.stress.domain.data.device.bean.StressDeviceBean;
import com.huami.stress.domain.model.Stress;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/stress/domain/model/Stress;", "Lcom/huami/stress/domain/data/device/bean/StressDeviceBean;", "toStressDeviceBean", "domain_release"}, k = 2, mv = {1, 5, 1})
public final class StressExKt {
    @NotNull
    public static final StressDeviceBean toStressDeviceBean(@NotNull Stress stress) {
        return new StressDeviceBean(stress.getTime(), stress.getValue());
    }
}
