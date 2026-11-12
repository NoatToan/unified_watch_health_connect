package com.xiaomi.hm.health.device.bind;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/hm/health/device/bind/DeviceBindLogicApi;", "", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface DeviceBindLogicApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/bind/DeviceBindLogicApi$Companion;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "", "isUploadDeviceStatistics", "", "b", "Ljava/util/List;", "UPLOAD_DEVICE_INFO_STATISTICS_ONLY", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final List<HMDeviceSource> UPLOAD_DEVICE_INFO_STATISTICS_ONLY = CollectionsKt__CollectionsKt.arrayListOf(HMDeviceSource.OTHER_MOZART, HMDeviceSource.OTHER_HAYDN, HMDeviceSource.OTHER_LULLABY);

        private Companion() {
        }

        public final boolean isUploadDeviceStatistics(@NotNull HMDeviceSource deviceSource) {
            return UPLOAD_DEVICE_INFO_STATISTICS_ONLY.contains(deviceSource);
        }
    }
}
