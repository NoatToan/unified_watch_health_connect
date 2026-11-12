package com.huami.device.core.sync.impl.sync.mili;

import com.huami.device.core.sync.api.Cancelable;
import com.huami.device.core.sync.api.SyncApi;
import com.huami.device.core.sync.api.SyncStrategy;
import com.huami.device.core.sync.api.dto.WorkStatusDto;
import com.huami.device.core.sync.api.exception.ConfigException;
import com.huami.device.core.sync.impl.sync.inject.InjectDevice;
import com.huami.device.core.sync.impl.sync.inject.InjectJobStrategy;
import com.huami.tools.log.HMLog;
import com.twitter.sdk.android.tweetcomposer.g;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016R\u0016\u0010\u0013\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/device/core/sync/impl/sync/mili/MiliSyncDelegate;", "Lcom/huami/device/core/sync/api/SyncApi;", "Lcom/huami/device/core/sync/impl/sync/inject/InjectDevice;", "Lcom/huami/device/core/sync/impl/sync/inject/InjectJobStrategy;", "Lcom/huami/device/core/sync/api/Cancelable;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiDevice;", "device", "createMiliDevice", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "", "onInject", "Lcom/huami/device/core/sync/api/SyncStrategy;", "strategy", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "start", "", "isRunning", g.g, "jobStrategy", "Lcom/huami/device/core/sync/api/SyncStrategy;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiDevice;", "realApi", "Lcom/huami/device/core/sync/api/SyncApi;", "<init>", "()V", "Companion", "sync-center_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class MiliSyncDelegate implements SyncApi, InjectDevice, InjectJobStrategy, Cancelable {

    @NotNull
    private static final String tag = "MiliSyncDelegate";
    private HMMiLiDevice device;
    private SyncStrategy jobStrategy;

    @Nullable
    private SyncApi realApi;

    private final synchronized SyncApi createMiliDevice(HMMiLiDevice device) {
        if (this.realApi == null) {
            this.realApi = device instanceof HMMiLiProDevice ? new MiLiProSyncCenterImpl() : new MiliSyncCenterImpl();
        }
        return this.realApi;
    }

    @Override // com.huami.device.core.sync.api.Cancelable
    public void cancel() {
        try {
            SyncApi syncApi = this.realApi;
            if (syncApi != null && (syncApi instanceof Cancelable)) {
                ((Cancelable) syncApi).cancel();
            }
        } catch (Throwable th) {
            HMLog.e(tag, "cal cancel sync error", th);
        }
    }

    @Override // com.huami.device.core.sync.api.SyncApi
    /* JADX INFO: renamed from: isRunning */
    public boolean getIsRunning() {
        SyncApi syncApi = this.realApi;
        if (syncApi == null) {
            return false;
        }
        return syncApi.getIsRunning();
    }

    @Override // com.huami.device.core.sync.impl.sync.inject.InjectDevice
    public void onInject(@NotNull HMBaseDevice device) {
        try {
            if (device instanceof HMMiLiDevice) {
                this.device = (HMMiLiDevice) device;
            }
            HMMiLiDevice hMMiLiDevice = this.device;
            if (hMMiLiDevice == null) {
                hMMiLiDevice = null;
            }
            createMiliDevice(hMMiLiDevice);
            SyncApi syncApi = this.realApi;
            if (syncApi == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.huami.device.core.sync.impl.sync.inject.InjectDevice");
            }
            ((InjectDevice) syncApi).onInject(device);
        } catch (Exception e) {
            e.printStackTrace();
            HMLog.e(tag, Intrinsics.stringPlus("inject target error. ", Unit.INSTANCE), new Object[0]);
        }
    }

    @Override // com.huami.device.core.sync.api.SyncApi
    @NotNull
    public Channel<WorkStatusDto> start() throws ConfigException {
        HMMiLiDevice hMMiLiDevice = this.device;
        if (hMMiLiDevice == null) {
            throw new ConfigException("config error", null, 2, null);
        }
        if (hMMiLiDevice == null) {
            hMMiLiDevice = null;
        }
        return createMiliDevice(hMMiLiDevice).start();
    }

    @Override // com.huami.device.core.sync.impl.sync.inject.InjectJobStrategy
    public void onInject(@NotNull SyncStrategy strategy) {
        this.jobStrategy = strategy;
    }
}
