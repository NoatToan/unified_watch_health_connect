package com.xiaomi.hm.health.bt.profile.gdsp.hr;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.healthsyncprofile.HMHealthDataBaseProfile;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB1\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0014R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR(\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/hr/HMProSyncHeightLowHrTask;", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseTask;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityDataFragment;", "", "a", "", "doWork", "Ljava/util/Calendar;", "b", "Ljava/util/Calendar;", "mStartTime", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "c", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "mCallback", "Lcom/xiaomi/hm/health/bt/profile/gdsp/healthsyncprofile/HMHealthDataBaseProfile;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/profile/gdsp/healthsyncprofile/HMHealthDataBaseProfile;", "mProfile", "e", "B", "mType", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Ljava/util/Calendar;Lcom/xiaomi/hm/health/bt/device/HMCallback;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HMProSyncHeightLowHrTask extends HMBaseTask {

    @NotNull
    private static final String f = "HMProSyncHeightLowHrTask";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Calendar mStartTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HMCallback<List<ActivityDataFragment<Byte>>> mCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final HMHealthDataBaseProfile mProfile;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final byte mType = 29;

    public HMProSyncHeightLowHrTask(@NotNull GattPeripheral gattPeripheral, @NotNull Calendar calendar, @NotNull HMCallback<List<ActivityDataFragment<Byte>>> hMCallback) {
        this.mStartTime = calendar;
        this.mCallback = hMCallback;
        this.mProfile = new HMHealthDataBaseProfile(gattPeripheral);
    }

    private final List<ActivityDataFragment<Byte>> a() {
        boolean z;
        int i;
        ArrayList arrayList = new ArrayList();
        Calendar calendar = this.mStartTime;
        while (true) {
            Debug.fi(f, Intrinsics.stringPlus("HMProSyncHeightLowHrTask sync time = ", calendar.getTime()));
            DataHeader dataHeader = this.mProfile.getDataHeader(calendar, this.mType);
            z = false;
            if (dataHeader != null && (i = dataHeader.size) >= 0) {
                if (i != 0) {
                    ActivityDataFragment activityDataFragment = new ActivityDataFragment(dataHeader.calendar, i);
                    byte[] bArrFetchRawData = this.mProfile.fetchRawData();
                    if (bArrFetchRawData != null) {
                        if (!(bArrFetchRawData.length == 0)) {
                            activityDataFragment.addAll(ArraysKt___ArraysKt.toList(bArrFetchRawData));
                            arrayList.add(activityDataFragment);
                            Debug.fi(f, "height low hr data received: " + bArrFetchRawData.length + " / " + dataHeader.size);
                            calendar = (Calendar) dataHeader.calendar.clone();
                            calendar.add(13, 1);
                        }
                    }
                    Debug.fi(f, "get empty raw data");
                    break;
                }
                Debug.fi(f, "sync height low hr failed header size is empty");
                z = true;
                break;
            }
            Debug.fi(f, "sync height low hr failed");
            break;
        }
        if (z) {
            return arrayList;
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        this.mCallback.sendOnStartMessage();
        if (!this.mProfile.init()) {
            Debug.fi(f, "HMProSyncHeightLowHrTask init failed");
            this.mCallback.sendOnFinishMessage(false);
            return;
        }
        List<ActivityDataFragment<Byte>> listA = a();
        this.mProfile.stopTransfer();
        this.mProfile.deInit();
        if (listA == null) {
            this.mCallback.sendOnFinishMessage(false);
        } else {
            this.mCallback.sendOnFinishMessage(listA);
            this.mCallback.sendOnFinishMessage(true);
        }
    }
}
