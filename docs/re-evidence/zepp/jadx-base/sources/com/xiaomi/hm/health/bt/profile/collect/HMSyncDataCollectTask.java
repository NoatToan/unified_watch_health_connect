package com.xiaomi.hm.health.bt.profile.collect;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import java.util.Calendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B%\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0014R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/collect/HMSyncDataCollectTask;", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseTask;", "Lcom/xiaomi/hm/health/bt/profile/collect/DataCollect;", "a", "", "doWork", "Ljava/util/Calendar;", "b", "Ljava/util/Calendar;", "mTime", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "c", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "mCallback", "Lcom/xiaomi/hm/health/bt/profile/collect/HMSyncDataCollectProfile;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/profile/collect/HMSyncDataCollectProfile;", "mProfile", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Ljava/util/Calendar;Lcom/xiaomi/hm/health/bt/device/HMCallback;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HMSyncDataCollectTask extends HMBaseTask {

    @NotNull
    private static final String e = "HMSyncDataCollectTask";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Calendar mTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HMCallback<DataCollect> mCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final HMSyncDataCollectProfile mProfile;

    public HMSyncDataCollectTask(@NotNull GattPeripheral gattPeripheral, @NotNull Calendar calendar, @NotNull HMCallback<DataCollect> hMCallback) {
        this.mTime = calendar;
        this.mCallback = hMCallback;
        this.mProfile = new HMSyncDataCollectProfile(gattPeripheral);
    }

    private final DataCollect a() {
        int i = 0;
        do {
            i++;
            DataCollect dataCollect = this.mProfile.getDataCollect(this.mTime);
            if (dataCollect != null) {
                return dataCollect;
            }
        } while (i < 2);
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        this.mCallback.sendOnStartMessage();
        if (this.mProfile.init()) {
            this.mCallback.sendOnFinishMessage(a());
        } else {
            Debug.i(e, "syncDataCollectTask init failed");
            this.mCallback.sendOnFinishMessage((DataCollect) null);
        }
    }
}
