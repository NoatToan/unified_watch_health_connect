package com.xiaomi.hm.health.device.setting.life.feature.bloodpressure;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/bloodpressure/IHealthPlanQuery;", "", "", "getUserBPResearchStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface IHealthPlanQuery {
    @Nullable
    Object getUserBPResearchStatus(@NotNull Continuation<? super Boolean> continuation);
}
