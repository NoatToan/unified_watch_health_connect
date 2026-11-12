package com.xiaomi.hm.health.bt.profile.gdsp.rr;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.healthsyncprofile.HealthSyncDataProfile;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB+\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0014R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/rr/HMProSyncRRDataTask;", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseTask;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/rr/RRData;", "a", "", "doWork", "Ljava/util/Calendar;", "b", "Ljava/util/Calendar;", "mStartTime", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "c", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "mCallback", "Lcom/xiaomi/hm/health/bt/profile/gdsp/healthsyncprofile/HealthSyncDataProfile;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/profile/gdsp/healthsyncprofile/HealthSyncDataProfile;", "mProfile", "", "e", "B", "mType", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Ljava/util/Calendar;Lcom/xiaomi/hm/health/bt/device/HMCallback;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HMProSyncRRDataTask extends HMBaseTask {

    @NotNull
    public static final String TAG = "HMProSyncRRDataTask";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Calendar mStartTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HMCallback<List<RRData>> mCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final HealthSyncDataProfile mProfile;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final byte mType = 8;

    public HMProSyncRRDataTask(@NotNull GattPeripheral gattPeripheral, @NotNull Calendar calendar, @NotNull HMCallback<List<RRData>> hMCallback) {
        this.mStartTime = calendar;
        this.mCallback = hMCallback;
        this.mProfile = new HealthSyncDataProfile(gattPeripheral);
    }

    private final List<RRData> a() {
        boolean z;
        int i;
        Collection collection;
        final Progress progress = new Progress();
        ArrayList arrayList = new ArrayList();
        Calendar calendar = this.mStartTime;
        while (true) {
            Debug.fi(TAG, Intrinsics.stringPlus("rr data sync time = ", calendar.getTime()));
            DataHeader dataHeader = this.mProfile.getDataHeader(calendar, this.mType);
            z = false;
            if (dataHeader == null || (i = dataHeader.size) == -1) {
                Debug.fi(TAG, "rr data sync get header failed");
                break;
            }
            if (i == 0) {
                Debug.fi(TAG, "rr data sync get header size = 0");
                z = true;
                break;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final RRData rRData = new RRData(dataHeader.calendar, dataHeader.size);
            progress.total = dataHeader.size;
            progress.progress = 0;
            boolean largeOriginData = this.mProfile.getLargeOriginData(new IDataCallback() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.rr.HMProSyncRRDataTask$loadRRData$operateSuccess$1
                @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IDataCallback
                public void onDataMissing() {
                    Debug.fi(HMProSyncRRDataTask.TAG, "sync rr task and data missing!!");
                    atomicBoolean.set(true);
                }

                @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IDataCallback
                public void onDataReceived(@Nullable byte[] data) {
                    if (data == null || data.length <= 1) {
                        return;
                    }
                    List<Byte> listDrop = ArraysKt___ArraysKt.drop(data, 1);
                    rRData.addAll(listDrop);
                    progress.progress += listDrop.size();
                    this.mCallback.sendOnProgressMessage(progress);
                }
            });
            this.mProfile.stopTransfer();
            if (!largeOriginData) {
                Debug.fi(TAG, "sync rr data failed!!");
            }
            if (atomicBoolean.get() || progress.progress != progress.total) {
                Debug.fi(TAG, "sync rr data task lost package!! receivedSize = " + progress.progress + " / " + progress.total);
                break;
            }
            int rRCrc16 = this.mProfile.getRRCrc16(dataHeader);
            rRData.setRrHwCRC16(rRCrc16);
            if (rRCrc16 != 0 && (collection = rRData.data) != null) {
                int iCrc16 = GattUtils.crc16(CollectionsKt___CollectionsKt.toByteArray(collection));
                Debug.fi(TAG, "crcCheck:" + dataHeader + ",crc16:" + iCrc16);
                rRData.setRrAppCRC16(iCrc16);
            }
            arrayList.add(rRData);
            Calendar calendar2 = (Calendar) dataHeader.calendar.clone();
            calendar2.add(13, 1);
            Debug.fi(TAG, "RR syncTime:" + calendar2.getTime() + ",s:" + dataHeader.size);
            calendar = calendar2;
        }
        if (z || (!arrayList.isEmpty())) {
            return arrayList;
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        this.mCallback.sendOnStartMessage();
        if (!this.mProfile.init()) {
            Debug.fi(TAG, "HMProSyncRRDataTask init failed");
            this.mCallback.onFinish(false);
            return;
        }
        List<RRData> listA = a();
        this.mProfile.stopTransfer();
        this.mProfile.deInit();
        this.mCallback.onFinish(listA);
        if (listA == null) {
            this.mCallback.onFinish(false);
        } else {
            this.mCallback.onData(listA);
            this.mCallback.onFinish(true);
        }
    }
}
