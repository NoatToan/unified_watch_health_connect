package com.xiaomi.hm.health.bt.profile.gdsp.ecg;

import com.baidu.ocr.sdk.utils.LogUtil;
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
import com.xiaomi.hm.health.bt.utils.HMHealthDeviceConstant;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b \u0010!J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\n\u001a\u00020\tH\u0014R\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/ecg/HMSyncECGTask;", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseTask;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/ecg/EcgData;", "b", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "", "a", "", "doWork", "Ljava/util/Calendar;", "Ljava/util/Calendar;", "mStartTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/ecg/IHMECGDataCallback;", "c", "Lcom/xiaomi/hm/health/bt/profile/gdsp/ecg/IHMECGDataCallback;", "mCallback", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "mDeviceInfo", "Lcom/xiaomi/hm/health/bt/profile/gdsp/healthsyncprofile/HealthSyncDataProfile;", "e", "Lcom/xiaomi/hm/health/bt/profile/gdsp/healthsyncprofile/HealthSyncDataProfile;", "mProfile", "", "f", LogUtil.I, "mStrip", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Ljava/util/Calendar;Lcom/xiaomi/hm/health/bt/profile/gdsp/ecg/IHMECGDataCallback;Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HMSyncECGTask extends HMBaseTask {
    public static final int SKIP_TIME = 10;

    @NotNull
    private static final String g = "HMSyncECGTask";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Calendar mStartTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final IHMECGDataCallback mCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final DeviceInfo mDeviceInfo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final HealthSyncDataProfile mProfile;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int mStrip;

    public HMSyncECGTask(@NotNull GattPeripheral gattPeripheral, @NotNull Calendar calendar, @NotNull IHMECGDataCallback iHMECGDataCallback, @NotNull DeviceInfo deviceInfo) {
        this.mStartTime = calendar;
        this.mCallback = iHMECGDataCallback;
        this.mDeviceInfo = deviceInfo;
        this.mProfile = new HealthSyncDataProfile(gattPeripheral);
        this.mStrip = HMDeviceFeature.hasFeatureJHS(deviceInfo.getDeviceSource()) ? 4 : 2;
    }

    private final boolean a(DataHeader header) {
        if (header == null || header.size == -1) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (header.calendar.getTimeInMillis() <= jCurrentTimeMillis) {
            return true;
        }
        Debug.fi(g, "sync ecg task check header failed, current time = " + jCurrentTimeMillis + "; and sync require time = " + header.calendar.getTimeInMillis());
        return false;
    }

    private final List<EcgData> b() {
        boolean z;
        final Progress progress = new Progress();
        ArrayList arrayList = new ArrayList();
        while (true) {
            Debug.fi(g, Intrinsics.stringPlus("SyncEcgTask start time = ", this.mStartTime.getTime()));
            DataHeader dataHeader = this.mProfile.getDataHeader(this.mStartTime, (byte) 3);
            z = false;
            if (!a(dataHeader)) {
                Debug.fi(g, Intrinsics.stringPlus("SyncEcgTask get header failed, header size = = ", dataHeader == null ? null : Integer.valueOf(dataHeader.size)));
                break;
            }
            if (dataHeader.size == 0) {
                Debug.fi(g, "SyncEcgTask task header size is 0");
                z = true;
                break;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            int lodSize = this.mProfile.getLodSize(dataHeader);
            int extSize = this.mProfile.getExtSize(dataHeader);
            int i = (dataHeader.size - lodSize) - extSize;
            EcgData ecgData = new EcgData(dataHeader.calendar, i);
            progress.total = dataHeader.size;
            progress.progress = 0;
            final ArrayList arrayList2 = new ArrayList();
            if (!this.mProfile.getLargeOriginData(new IDataCallback() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.ecg.HMSyncECGTask$loadEcg$operateSuccess$1
                @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IDataCallback
                public void onDataMissing() {
                    Debug.fi("HMSyncECGTask", "sync ecg task and data missing!!");
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
                Debug.fi(g, "sync ecg task failed!!");
            }
            if (atomicBoolean.get() || progress.progress != progress.total) {
                Debug.fi(g, "sync ecg task lost package !!mReceivedSize = " + progress.progress + " / " + progress.total + " and header time = " + dataHeader.calendar.getTime() + "; header size = " + dataHeader.size + "; header raw size = " + i + "; lod size = " + lodSize + "; extSize = " + extSize);
                break;
            }
            this.mProfile.stopTransfer();
            this.mProfile.parseECGRaw(dataHeader, arrayList2, ecgData, this.mStrip);
            arrayList.add(ecgData);
            this.mStartTime = (Calendar) dataHeader.calendar.clone();
            int ecgDataSeconds = HMHealthDeviceConstant.INSTANCE.getEcgDataSeconds(i, this.mDeviceInfo.getDeviceSource());
            this.mStartTime.add(13, 10);
            Debug.fi(g, "sync ecg task mReceivedSize = " + progress.progress + "; total size = " + progress.total + "; and dataSec = " + ecgDataSeconds);
        }
        if (z || (!arrayList.isEmpty())) {
            return arrayList;
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        this.mCallback.onStart();
        if (!this.mProfile.init()) {
            Debug.i(g, "HMSyncECGTask init failed");
            this.mCallback.onFinish(false);
            return;
        }
        List<EcgData> listB = b();
        this.mProfile.stopTransfer();
        this.mProfile.deInit();
        if (listB == null) {
            this.mCallback.onFinish(false);
        } else {
            this.mCallback.onData(listB);
            this.mCallback.onFinish(true);
        }
    }
}
