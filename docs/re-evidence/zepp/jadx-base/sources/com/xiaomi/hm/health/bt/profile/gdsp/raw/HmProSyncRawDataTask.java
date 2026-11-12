package com.xiaomi.hm.health.bt.profile.gdsp.raw;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.Scopes;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import java.util.Arrays;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B-\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmProSyncRawDataTask;", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseTask;", "", "doWork", "Ljava/util/Calendar;", "b", "Ljava/util/Calendar;", "startSyncTime", "", "c", LogUtil.I, "dataType", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmGdspRawData;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "callback", "Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HMSyncRawDataProfile;", "e", "Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HMSyncRawDataProfile;", Scopes.PROFILE, "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Ljava/util/Calendar;ILcom/xiaomi/hm/health/bt/device/HMCallback;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HmProSyncRawDataTask extends HMBaseTask {

    @NotNull
    private static final String f = "HmProSyncRawDataTask";
    private static final int g = 3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Calendar startSyncTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int dataType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final HMCallback<HmGdspRawData> callback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final HMSyncRawDataProfile profile;

    public HmProSyncRawDataTask(@NotNull GattPeripheral gattPeripheral, @NotNull Calendar calendar, int i, @NotNull HMCallback<HmGdspRawData> hMCallback) {
        this.startSyncTime = calendar;
        this.dataType = i;
        this.callback = hMCallback;
        this.profile = new HMSyncRawDataProfile(gattPeripheral);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        this.callback.onStart();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        boolean z = true;
        Debug.fi(f, Intrinsics.stringPlus("start sync data type = ", String.format("%02x ", Arrays.copyOf(new Object[]{Integer.valueOf(this.dataType)}, 1))));
        if (!this.profile.init()) {
            Debug.fi(f, "init data profile failed");
            this.callback.onFinish(false);
            return;
        }
        loop0: while (true) {
            int i = 0;
            while (true) {
                DataHeader gpsHeader = this.profile.getGpsHeader(this.startSyncTime, (byte) this.dataType);
                if (gpsHeader == null) {
                    Debug.fi(f, "get header failed");
                    break loop0;
                }
                if (gpsHeader.size != 0) {
                    byte[] bArrFetchData = this.profile.fetchData();
                    if (bArrFetchData != null) {
                        if (!(bArrFetchData.length == 0)) {
                            if (bArrFetchData.length == gpsHeader.size) {
                                this.callback.onData(new HmGdspRawData(this.dataType, gpsHeader.calendar, bArrFetchData, gpsHeader.expansionData));
                                this.startSyncTime.setTimeInMillis(gpsHeader.calendar.getTimeInMillis() + ((long) 1000));
                            } else if (i >= 3) {
                                Debug.fi(f, "Missing package, retry failed!");
                                break loop0;
                            } else {
                                i++;
                                Debug.fi(f, Intrinsics.stringPlus("Missing package, retry ", Integer.valueOf(i)));
                            }
                        }
                    }
                    Debug.fi(f, Intrinsics.stringPlus("return as fetch data error:", bArrFetchData));
                    break loop0;
                }
                Debug.fi(f, "return as size is 0");
                this.callback.onFinish(z);
                this.profile.stopTransfer();
                this.profile.deInit();
            }
        }
        z = false;
        this.callback.onFinish(z);
        this.profile.stopTransfer();
        this.profile.deInit();
    }
}
