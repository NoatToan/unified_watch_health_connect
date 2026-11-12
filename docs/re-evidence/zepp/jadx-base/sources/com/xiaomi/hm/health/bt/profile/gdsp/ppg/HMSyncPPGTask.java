package com.xiaomi.hm.health.bt.profile.gdsp.ppg;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceFeature;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.healthsyncprofile.HealthSyncDataProfile;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB'\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0014R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/ppg/HMSyncPPGTask;", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseTask;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/ppg/PPGData;", "a", "", "doWork", "Ljava/util/Calendar;", "b", "Ljava/util/Calendar;", "mStartTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/ppg/IHMPPGDataCallback;", "c", "Lcom/xiaomi/hm/health/bt/profile/gdsp/ppg/IHMPPGDataCallback;", "mCallback", "Lcom/xiaomi/hm/health/bt/profile/gdsp/healthsyncprofile/HealthSyncDataProfile;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/profile/gdsp/healthsyncprofile/HealthSyncDataProfile;", "mProfile", "", "e", "B", "type", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "deviceInfo", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Ljava/util/Calendar;Lcom/xiaomi/hm/health/bt/profile/gdsp/ppg/IHMPPGDataCallback;Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HMSyncPPGTask extends HMBaseTask {

    @NotNull
    private static final String f = "HMSyncPPGTask";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Calendar mStartTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final IHMPPGDataCallback mCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final HealthSyncDataProfile mProfile;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final byte type;

    public HMSyncPPGTask(@NotNull GattPeripheral gattPeripheral, @NotNull Calendar calendar, @NotNull IHMPPGDataCallback iHMPPGDataCallback, @NotNull DeviceInfo deviceInfo) {
        this.mStartTime = calendar;
        this.mCallback = iHMPPGDataCallback;
        this.mProfile = new HealthSyncDataProfile(gattPeripheral);
        this.type = HMDeviceFeature.hasQinLingFuture(deviceInfo.getDeviceSource()) ? (byte) 5 : (byte) 16;
    }

    private final List<PPGData> a() {
        int i;
        final Progress progress = new Progress();
        ArrayList arrayList = new ArrayList();
        while (true) {
            Debug.fi(f, Intrinsics.stringPlus("SyncPPGTask start time = ", this.mStartTime.getTime()));
            DataHeader dataHeader = this.mProfile.getDataHeader(this.mStartTime, this.type);
            if (dataHeader == null || (i = dataHeader.size) == -1) {
                Debug.fi(f, "SyncPPGTask get header failed");
                break;
            }
            if (i == 0) {
                Debug.fi(f, "SyncPPGTask header size is 0");
                break;
            }
            progress.total = i;
            progress.progress = 0;
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final ArrayList arrayList2 = new ArrayList();
            if (!this.mProfile.getLargeOriginData(new IDataCallback() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.ppg.HMSyncPPGTask$loadPPG$operateSuccess$1
                @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IDataCallback
                public void onDataMissing() {
                    Debug.fi("HMSyncPPGTask", "sync ppg task and data missing!!");
                    atomicBoolean.set(true);
                }

                @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IDataCallback
                public void onDataReceived(@Nullable byte[] data) {
                    if (data == null || data.length <= 1) {
                        return;
                    }
                    List<Byte> listDrop = ArraysKt___ArraysKt.drop(data, 1);
                    arrayList2.addAll(listDrop);
                    progress.progress += listDrop.size();
                    this.mCallback.onProgress(progress);
                }
            })) {
                Debug.fi(f, "sync ppg task failed!!");
            }
            if (atomicBoolean.get()) {
                Debug.fi(f, "sync ppg task lost package!! ReceivedSize = " + progress.progress + " total size = " + progress.total);
                break;
            }
            this.mProfile.stopTransfer();
            arrayList.add(new PPGData(this.mProfile.parsePPGData(arrayList2), dataHeader.calendar));
            Debug.fi(f, ((int) this.type) + " syncTime:" + dataHeader.calendar.getTime() + ", " + progress.progress + '/' + dataHeader.size);
            Calendar calendar = (Calendar) dataHeader.calendar.clone();
            this.mStartTime = calendar;
            calendar.add(13, 10);
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        this.mCallback.onStart();
        if (!this.mProfile.init()) {
            Debug.i(f, "HMSyncPPGTask init failed");
            this.mCallback.onFinish(false);
            return;
        }
        List<PPGData> listA = a();
        this.mProfile.stopTransfer();
        this.mProfile.deInit();
        if (listA == null) {
            this.mCallback.onFinish(false);
        } else {
            this.mCallback.onData(listA);
            this.mCallback.onFinish(true);
        }
    }
}
