package com.xiaomi.hm.health.device.feature.sync.strategy;

import com.huami.devicex.injection.keeper.DeviceTimeStoreApi;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/strategy/BindTimeLimit;", "Lcom/xiaomi/hm/health/device/feature/sync/strategy/MockProgressApi;", "", "lastSyncTime", "", "isDoNotNeedSync", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "mockSync", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mock", "Lcom/xiaomi/hm/health/device/feature/sync/strategy/MockProgressApi;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", "deviceTimeStore", "Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", "<init>", "(Lcom/xiaomi/hm/health/device/feature/sync/strategy/MockProgressApi;Lcom/xiaomi/hm/health/bt/device/HMDeviceType;Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BindTimeLimit implements MockProgressApi {

    @NotNull
    private final DeviceTimeStoreApi deviceTimeStore;

    @NotNull
    private final MockProgressApi mock;

    @NotNull
    private final HMDeviceType type;

    public BindTimeLimit(@NotNull MockProgressApi mockProgressApi, @NotNull HMDeviceType hMDeviceType, @NotNull DeviceTimeStoreApi deviceTimeStoreApi) {
        this.mock = mockProgressApi;
        this.type = hMDeviceType;
        this.deviceTimeStore = deviceTimeStoreApi;
    }

    @Override // com.xiaomi.hm.health.device.feature.sync.strategy.MockProgressApi
    public boolean isDoNotNeedSync(long lastSyncTime) {
        return this.deviceTimeStore.getDeviceBoundTime(this.type).getTimeInMillis() + ((long) 3600) > Calendar.getInstance().getTimeInMillis();
    }

    @Override // com.xiaomi.hm.health.device.feature.sync.strategy.MockProgressApi
    @Nullable
    public Object mockSync(@NotNull HMBaseDevice hMBaseDevice, @NotNull Continuation<? super Unit> continuation) {
        Object objMockSync = this.mock.mockSync(hMBaseDevice, continuation);
        return objMockSync == a.getCOROUTINE_SUSPENDED() ? objMockSync : Unit.INSTANCE;
    }
}
