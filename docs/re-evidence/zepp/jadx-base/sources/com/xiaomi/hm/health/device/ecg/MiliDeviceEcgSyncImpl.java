package com.xiaomi.hm.health.device.ecg;

import com.huami.ecg.sync.mili.device.EcgRawDataCallback;
import com.huami.ecg.sync.mili.device.MiliDeviceEcgSync;
import com.huami.ecg.sync.mili.model.EcgSyncInfo;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.gdsp.raw.HmGdspRawData;
import java.util.Calendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/device/ecg/MiliDeviceEcgSyncImpl;", "Lcom/huami/ecg/sync/mili/device/MiliDeviceEcgSync;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "Lcom/huami/ecg/sync/mili/device/EcgRawDataCallback;", "callback", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmGdspRawData;", "a", "Lcom/huami/ecg/sync/mili/model/EcgSyncInfo;", "b", "Ljava/util/Calendar;", "time", "", "syncEcg", "syncPpg", "syncSummary", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MiliDeviceEcgSyncImpl implements MiliDeviceEcgSync {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMMiLiProDevice device;

    public MiliDeviceEcgSyncImpl(@NotNull HMMiLiProDevice hMMiLiProDevice) {
        this.device = hMMiLiProDevice;
    }

    private final HMCallback<HmGdspRawData> a(final HMMiLiProDevice device, final EcgRawDataCallback callback) {
        return new HMCallback<HmGdspRawData>() { // from class: com.xiaomi.hm.health.device.ecg.MiliDeviceEcgSyncImpl$newSyncCallback$1
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                super.onFinish(result);
                callback.onFinish(result);
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onStart() {
                super.onStart();
                callback.onStart();
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onData(@Nullable HmGdspRawData t) {
                super.onData(t);
                callback.onData(this.b(t, device));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EcgSyncInfo b(HmGdspRawData hmGdspRawData, HMMiLiProDevice hMMiLiProDevice) {
        if (hmGdspRawData == null) {
            return null;
        }
        return new EcgSyncInfo(hmGdspRawData.getDataType(), hmGdspRawData.getCal(), hmGdspRawData.getRawData(), hMMiLiProDevice.getMDeviceSource().getValue(), hMMiLiProDevice.getDeviceInfo().getSerialNumber(), hMMiLiProDevice.getDeviceInfo().getDeviceID());
    }

    @Override // com.huami.ecg.sync.mili.device.MiliDeviceEcgSync
    public void syncEcg(@NotNull Calendar time, @NotNull EcgRawDataCallback callback) {
        HMMiLiProDevice hMMiLiProDevice = this.device;
        hMMiLiProDevice.startSyncRawData(time, 3, a(hMMiLiProDevice, callback));
    }

    @Override // com.huami.ecg.sync.mili.device.MiliDeviceEcgSync
    public void syncPpg(@NotNull Calendar time, @NotNull EcgRawDataCallback callback) {
        HMMiLiProDevice hMMiLiProDevice = this.device;
        hMMiLiProDevice.startSyncRawData(time, 16, a(hMMiLiProDevice, callback));
    }

    @Override // com.huami.ecg.sync.mili.device.MiliDeviceEcgSync
    public void syncSummary(@NotNull Calendar time, @NotNull EcgRawDataCallback callback) {
        HMMiLiProDevice hMMiLiProDevice = this.device;
        hMMiLiProDevice.startSyncRawData(time, 42, a(hMMiLiProDevice, callback));
    }
}
