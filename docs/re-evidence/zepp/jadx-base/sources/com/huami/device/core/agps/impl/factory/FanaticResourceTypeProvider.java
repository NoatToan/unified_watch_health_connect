package com.huami.device.core.agps.impl.factory;

import com.huami.device.core.agps.api.DownloadResourceType;
import com.huami.device.core.agps.impl.ResourceTypeProvider;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.market.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/device/core/agps/impl/factory/FanaticResourceTypeProvider;", "Lcom/huami/device/core/agps/impl/ResourceTypeProvider;", "Lcom/huami/device/core/agps/api/DownloadResourceType;", "loadResourceType", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "a", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "b", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", Constants.JSON_FEATURE, "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lcom/xiaomi/hm/health/bt/profile/feature/Feature;)V", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public final class FanaticResourceTypeProvider implements ResourceTypeProvider {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HMBaseDevice device;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Feature feature;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[HMDeviceSource.MILI_LONDON.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_LONDON_W.ordinal()] = 2;
        }
    }

    public FanaticResourceTypeProvider(@NotNull HMBaseDevice hMBaseDevice, @NotNull Feature feature) {
        this.device = hMBaseDevice;
        this.feature = feature;
    }

    @Override // com.huami.device.core.agps.impl.ResourceTypeProvider
    @NotNull
    public DownloadResourceType loadResourceType() {
        int i;
        if (this.feature.hasSw(37)) {
            return DownloadResourceType.EPO_GR_3;
        }
        HMDeviceSource deviceSource = this.device.getDeviceSource();
        return (deviceSource != null && ((i = WhenMappings.$EnumSwitchMapping$0[deviceSource.ordinal()]) == 1 || i == 2)) ? DownloadResourceType.EPO_GR_3 : DownloadResourceType.AGPSZIP;
    }
}
