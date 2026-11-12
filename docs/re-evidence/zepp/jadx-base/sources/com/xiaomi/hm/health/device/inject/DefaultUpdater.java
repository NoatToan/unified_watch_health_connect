package com.xiaomi.hm.health.device.inject;

import com.huami.device.feature.health.ui.bloodpressure.viewmodel.IBPFlagUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/device/inject/DefaultUpdater;", "Lcom/huami/device/feature/health/ui/bloodpressure/viewmodel/IBPFlagUpdater;", "", "updateFlags", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DefaultUpdater implements IBPFlagUpdater {
    @Override // com.huami.device.feature.health.ui.bloodpressure.viewmodel.IBPFlagUpdater
    @Nullable
    public Object updateFlags(@NotNull Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }
}
