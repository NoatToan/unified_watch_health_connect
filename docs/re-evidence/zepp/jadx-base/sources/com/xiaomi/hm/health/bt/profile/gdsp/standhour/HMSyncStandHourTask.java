package com.xiaomi.hm.health.bt.profile.gdsp.standhour;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B+\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\"\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/standhour/HMSyncStandHourTask;", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseTask;", "", "doWork", "Ljava/util/Calendar;", "b", "Ljava/util/Calendar;", "mStartTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/standhour/StandHourData;", "c", "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "mCallback", "Lcom/xiaomi/hm/health/bt/profile/gdsp/standhour/HMSyncStandHourProfile;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/profile/gdsp/standhour/HMSyncStandHourProfile;", "mProfile", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Ljava/util/Calendar;Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HMSyncStandHourTask extends HMBaseTask {

    @NotNull
    private static final String e = "HMSyncStandHourTask";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Calendar mStartTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final IHMDataCallback<List<StandHourData>> mCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final HMSyncStandHourProfile mProfile;

    public HMSyncStandHourTask(@NotNull GattPeripheral gattPeripheral, @NotNull Calendar calendar, @NotNull IHMDataCallback<List<StandHourData>> iHMDataCallback) {
        this.mStartTime = calendar;
        this.mCallback = iHMDataCallback;
        this.mProfile = new HMSyncStandHourProfile(gattPeripheral);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        this.mCallback.onStart();
        int i = 2;
        if (!this.mProfile.init()) {
            Debug.i(e, "init failed!!!");
            this.mCallback.onStop(null, new HMDeviceError(2));
            return;
        }
        Debug.fi(e, Intrinsics.stringPlus("start sync time : ", this.mStartTime.getTime()));
        ArrayList arrayList = new ArrayList();
        while (true) {
            DataHeader dataHeader = this.mProfile.getDataHeader(this.mStartTime);
            if (dataHeader == null) {
                Debug.fi(e, "get header failed!!!");
                break;
            }
            if (dataHeader.size <= 0) {
                Debug.fi(e, "return as size is 0 !!!");
                i = 0;
                break;
            }
            List<StandHourData> listFetchData = this.mProfile.fetchData(dataHeader.calendar);
            if (listFetchData == null) {
                Debug.fi(e, "return as stand hour data is null!!!");
                i = 100;
                break;
            } else {
                Debug.i(e, Intrinsics.stringPlus("data:", listFetchData));
                arrayList.addAll(listFetchData);
                Debug.fi(e, Intrinsics.stringPlus("data size: ", Integer.valueOf(arrayList.size())));
                this.mStartTime.setTimeInMillis(dataHeader.calendar.getTimeInMillis() + ((long) (listFetchData.size() * 3600000)) + 1);
            }
        }
        this.mProfile.stopTransfer();
        this.mProfile.deInit();
        this.mCallback.onStop(arrayList, new HMDeviceError(i));
    }
}
