package com.xiaomi.hm.health.device.feature.sync;

import com.huami.device.core.sync.api.dto.WorkStatusDto;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
public /* synthetic */ class SyncCenterManager$mockApi$1 extends FunctionReferenceImpl implements Function2<HMBaseDevice, WorkStatusDto, Unit> {
    public SyncCenterManager$mockApi$1(SyncCenterManager syncCenterManager) {
        super(2, syncCenterManager, SyncCenterManager.class, "dispatcherStatus", "dispatcherStatus(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lcom/huami/device/core/sync/api/dto/WorkStatusDto;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(HMBaseDevice hMBaseDevice, WorkStatusDto workStatusDto) {
        invoke2(hMBaseDevice, workStatusDto);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull HMBaseDevice hMBaseDevice, @NotNull WorkStatusDto workStatusDto) {
        ((SyncCenterManager) this.receiver).dispatcherStatus(hMBaseDevice, workStatusDto);
    }
}
