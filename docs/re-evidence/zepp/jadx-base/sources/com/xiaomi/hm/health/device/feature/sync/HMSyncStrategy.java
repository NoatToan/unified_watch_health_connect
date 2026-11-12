package com.xiaomi.hm.health.device.feature.sync;

import androidx.annotation.Keep;
import com.huami.device.core.sync.api.SyncStrategy;
import com.huami.device.core.sync.api.exception.ConfigException;
import com.huami.device.core.sync.api.exception.NotSupportException;
import com.huami.device.core.sync.api.type.SyncJob;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.feature.sync.strategy.HeadSetJobLoader;
import com.xiaomi.hm.health.device.feature.sync.strategy.MiliJobLoader;
import com.xiaomi.hm.health.device.feature.sync.strategy.SensorHubJobLoader;
import com.xiaomi.hm.health.device.feature.sync.strategy.ShoesJobLoader;
import com.xiaomi.hm.health.device.feature.sync.strategy.WeightJobLoader;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/HMSyncStrategy;", "Lcom/huami/device/core/sync/api/SyncStrategy;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "Lcom/huami/device/core/sync/api/type/SyncJob;", "loadSyncJobs", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class HMSyncStrategy implements SyncStrategy {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceType.values().length];
            iArr[HMDeviceType.VDevice.ordinal()] = 1;
            iArr[HMDeviceType.SENSORHUB.ordinal()] = 2;
            iArr[HMDeviceType.MILI.ordinal()] = 3;
            iArr[HMDeviceType.WEIGHT.ordinal()] = 4;
            iArr[HMDeviceType.SHOES.ordinal()] = 5;
            iArr[HMDeviceType.WATCH.ordinal()] = 6;
            iArr[HMDeviceType.OTHER.ordinal()] = 7;
            iArr[HMDeviceType.TREADMILL.ordinal()] = 8;
            iArr[HMDeviceType.HEADSET.ordinal()] = 9;
            iArr[HMDeviceType.EARBUD.ordinal()] = 10;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.huami.device.core.sync.api.SyncStrategy
    @NotNull
    public List<SyncJob> loadSyncJobs(@NotNull HMBaseDevice device) throws NotSupportException, ConfigException {
        HMDeviceType deviceType = device.getDeviceType();
        switch (deviceType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[deviceType.ordinal()]) {
            case 1:
            case 2:
                return new SensorHubJobLoader().loadJobs();
            case 3:
                return new MiliJobLoader(device).loadJobs();
            case 4:
                return new WeightJobLoader().loadJobs();
            case 5:
                return new ShoesJobLoader().loadJobs();
            case 6:
                throw new NotSupportException(null, null, 3, null);
            case 7:
                throw new NotSupportException(null, null, 3, null);
            case 8:
                throw new NotSupportException(null, null, 3, null);
            case 9:
                return new HeadSetJobLoader(device).loadJobs();
            case 10:
                throw new NotSupportException(null, null, 3, null);
            default:
                throw new ConfigException("config exception", null, 2, null);
        }
    }
}
