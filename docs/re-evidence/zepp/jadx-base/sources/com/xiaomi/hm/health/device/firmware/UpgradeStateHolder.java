package com.xiaomi.hm.health.device.firmware;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.device.event.HMDeviceFwUpgradeEvent;
import com.xiaomi.hm.health.device.service.residentnoti.ResidentNotificationManager;
import com.xiaomi.hm.health.device.service.residentnoti.notify.DfuNotify;
import com.xiaomi.mipush.sdk.MiPushClient;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\u0007J\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0012\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\"\u0010\u0019\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001c\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010$\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0011¨\u0006'"}, d2 = {"Lcom/xiaomi/hm/health/device/firmware/UpgradeStateHolder;", "", "Lcom/xiaomi/hm/health/device/event/HMDeviceFwUpgradeEvent;", "event", "", "c", GoogleApiAvailabilityLight.a, "", "a", "b", "isTransforming", "isNone", "register", MiPushClient.COMMAND_UNREGISTER, "", "leftTime", "onEventMainThread", LogUtil.I, "STATE_NONE", "STATE_TRANSFORMING", "PROGRESS_MAX", "getState", "()I", "setState", "(I)V", "state", "getProgress", "setProgress", "progress", "Lcom/xiaomi/hm/health/device/firmware/UpgradeRecord;", "e", "Lcom/xiaomi/hm/health/device/firmware/UpgradeRecord;", "firstRecord", "f", "transRecord", "g", "lastLeftTime", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class UpgradeStateHolder {
    public static final int STATE_TRANSFORMING = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int STATE_NONE = 0;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int PROGRESS_MAX = 100;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static int state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static int progress;

    @NotNull
    public static final UpgradeStateHolder INSTANCE = new UpgradeStateHolder();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final UpgradeRecord firstRecord = new UpgradeRecord(0, 0, 0, 7, null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final UpgradeRecord transRecord = new UpgradeRecord(0, 0, 0, 7, null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static int lastLeftTime = -1;

    private UpgradeStateHolder() {
    }

    private final void a(HMDeviceFwUpgradeEvent event) {
        if (d(event)) {
            Progress progress2 = event.getProgress();
            UpgradeRecord upgradeRecord = firstRecord;
            if (upgradeRecord.valid()) {
                transRecord.update(event.getEventCreateTime(), progress2.total, progress2.progress);
            } else {
                upgradeRecord.update(event.getEventCreateTime(), progress2.total, progress2.progress);
            }
        }
    }

    private final void b() {
        firstRecord.clear();
        transRecord.clear();
        lastLeftTime = -1;
    }

    private final boolean c(HMDeviceFwUpgradeEvent event) {
        if (event.getDeviceSource().getType() != HMDeviceType.MILI) {
            return false;
        }
        return event.getFirmwareType() == HMFirmwareType.FIRMWARE_BATCH || event.isContinuousUpgrade() || (event.getFirmwareType() == HMFirmwareType.FIRMWARE && event.isSupportPresetFirmwareInformation());
    }

    private final boolean d(HMDeviceFwUpgradeEvent event) {
        Progress progress2 = event.getProgress();
        return progress2.progress > 0 && progress2.total > 0 && event.getEventCreateTime() > 0;
    }

    public final int getProgress() {
        return progress;
    }

    public final int getState() {
        return state;
    }

    public final boolean isNone() {
        return state == 0;
    }

    public final boolean isTransforming() {
        return state == 1;
    }

    public final int leftTime() {
        UpgradeRecord upgradeRecord = firstRecord;
        if (upgradeRecord.valid()) {
            UpgradeRecord upgradeRecord2 = transRecord;
            if (upgradeRecord2.valid() && upgradeRecord.getTime() < upgradeRecord2.getTime() && upgradeRecord.getTotal() == upgradeRecord2.getTotal() && upgradeRecord.getProgress() < upgradeRecord2.getProgress()) {
                int total = (int) (((upgradeRecord.getTotal() - upgradeRecord2.getProgress()) * (upgradeRecord2.getTime() - upgradeRecord.getTime())) / (((upgradeRecord2.getProgress() - upgradeRecord.getProgress()) * 1000) * 60));
                if (total >= 10) {
                    total = (total / 5) * 5;
                }
                int i = lastLeftTime;
                if (i != -1 && i <= total) {
                    return i;
                }
                lastLeftTime = total;
                return total;
            }
        }
        return -1;
    }

    public final void onEventMainThread(@NotNull HMDeviceFwUpgradeEvent event) {
        if (c(event)) {
            if (!event.isStart() && !event.isProgress()) {
                b();
                state = 0;
                ResidentNotificationManager.cancelNotification(DfuNotify.INSTANCE);
                EventBus.getDefault().post(new FwBatchUpgradeEvent(progress, true, event.getResult(), event.getErrorCode()));
                return;
            }
            a(event);
            if (event.getProgress().getPercent() > 100) {
                state = 0;
                return;
            }
            state = 1;
            progress = event.getProgress().getPercent();
            EventBus.getDefault().post(new FwBatchUpgradeEvent(progress, false, false, 0, 12, null));
        }
    }

    public final void register() {
        EventBus.getDefault().register(this);
    }

    public final void setProgress(int i) {
        progress = i;
    }

    public final void setState(int i) {
        state = i;
    }

    public final void unregister() {
        EventBus.getDefault().unregister(this);
    }
}
