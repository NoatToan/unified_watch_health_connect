package com.xiaomi.hm.health.bt.profile.gdsp.af;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.healthsyncprofile.HMHealthDataBaseProfile;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B+\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\"\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\n8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/af/HMProSyncAfTimeStampTask;", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseTask;", "", "doWork", "Ljava/util/Calendar;", "b", "Ljava/util/Calendar;", "mStartTime", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityDataFragment;", "", "c", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "mCallback", GoogleApiAvailabilityLight.a, "B", "type", "Lcom/xiaomi/hm/health/bt/profile/gdsp/healthsyncprofile/HMHealthDataBaseProfile;", "e", "Lcom/xiaomi/hm/health/bt/profile/gdsp/healthsyncprofile/HMHealthDataBaseProfile;", "mProfile", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Ljava/util/Calendar;Lcom/xiaomi/hm/health/bt/device/HMCallback;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HMProSyncAfTimeStampTask extends HMBaseTask {

    @NotNull
    private static final String f = "HMProSyncAfTimeStampTask";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Calendar mStartTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HMCallback<ActivityDataFragment<Byte>> mCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final byte type = 10;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final HMHealthDataBaseProfile mProfile;

    public HMProSyncAfTimeStampTask(@NotNull GattPeripheral gattPeripheral, @NotNull Calendar calendar, @NotNull HMCallback<ActivityDataFragment<Byte>> hMCallback) {
        this.mStartTime = calendar;
        this.mCallback = hMCallback;
        this.mProfile = new HMHealthDataBaseProfile(gattPeripheral);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        int i;
        this.mCallback.sendOnStartMessage();
        if (!this.mProfile.init()) {
            Debug.fi(f, "init sync af time stamp task failed!!");
            this.mCallback.sendOnFinishMessage(false);
            return;
        }
        DataHeader dataHeader = this.mProfile.getDataHeader(this.mStartTime, this.type);
        if (dataHeader == null || (i = dataHeader.size) < 0) {
            Debug.fi(f, "init sync af time stamp get header failed");
            this.mCallback.sendOnFinishMessage(false);
            return;
        }
        if (i == 0) {
            Debug.fi(f, "header size is 0");
            this.mCallback.sendOnFinishMessage(true);
            return;
        }
        byte[] bArrFetchRawData = this.mProfile.fetchRawData();
        StringBuilder sb = new StringBuilder();
        sb.append("sync af time stamp , time = ");
        sb.append(dataHeader.calendar.getTime());
        sb.append(", header size = ");
        sb.append(dataHeader.size);
        sb.append(", received size = ");
        sb.append(bArrFetchRawData == null ? null : Integer.valueOf(bArrFetchRawData.length));
        Debug.fi(f, sb.toString());
        this.mProfile.stopTransfer();
        this.mProfile.deInit();
        if (bArrFetchRawData == null) {
            this.mCallback.sendOnFinishMessage(false);
            return;
        }
        ActivityDataFragment<Byte> activityDataFragment = new ActivityDataFragment<>(dataHeader.calendar, dataHeader.size);
        activityDataFragment.addAll(ArraysKt___ArraysKt.toList(bArrFetchRawData));
        this.mCallback.sendOnFinishMessage(activityDataFragment);
        this.mCallback.sendOnFinishMessage(true);
    }
}
