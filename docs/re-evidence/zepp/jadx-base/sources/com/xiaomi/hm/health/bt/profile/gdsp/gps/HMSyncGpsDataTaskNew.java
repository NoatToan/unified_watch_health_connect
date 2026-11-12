package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.Scopes;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCode;
import com.xiaomi.hm.health.bt.profile.gdsp.common.GDSPErrorCodeExtKt;
import com.xiaomi.hm.health.bt.profile.gdsp.common.GdspDataSyncUnit;
import com.xiaomi.hm.health.bt.profile.gdsp.common.GdspFactory;
import com.xiaomi.hm.health.bt.profile.gdsp.common.GdspParamFactory;
import com.xiaomi.hm.health.bt.profile.gdsp.common.IGdspCancelApi;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam;
import com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfile;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B;\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016¢\u0006\u0004\b)\u0010*J\b\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010(\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/HMSyncGpsDataTaskNew;", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseTask;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/IGdspCancelApi;", "", "doWork", "stopSync", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "b", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "c", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Ljava/util/Calendar;", GoogleApiAvailabilityLight.a, "Ljava/util/Calendar;", "calendar", "", "e", LogUtil.I, "version", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SyncDataCallback;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsRecord;", "f", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SyncDataCallback;", "mCallback", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/GdspDataSyncUnit;", "g", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/GdspDataSyncUnit;", "syncUnit", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/profile/GdspSyncProfile;", "h", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/profile/GdspSyncProfile;", Scopes.PROFILE, "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPErrorCode;", "i", "Lkotlin/jvm/functions/Function1;", "mErrorCodeTrans", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Ljava/util/Calendar;ILcom/xiaomi/hm/health/bt/profile/gdsp/gps/SyncDataCallback;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HMSyncGpsDataTaskNew extends HMBaseTask implements IGdspCancelApi {

    @NotNull
    private static final String j = "gps.HMSyncGpsDataTask";
    private static final int k = 1000;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final GattPeripheral gattPeripheral;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceSource source;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Calendar calendar;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final SyncDataCallback<List<? extends GpsRecord>> mCallback;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private GdspDataSyncUnit syncUnit;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final GdspSyncProfile profile;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Function1<GDSPErrorCode, GDSPErrorCode> mErrorCodeTrans = a.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPErrorCode;", "errorCode", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<GDSPErrorCode, GDSPErrorCode> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GDSPErrorCode invoke(@NotNull GDSPErrorCode gDSPErrorCode) {
            return gDSPErrorCode;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HMSyncGpsDataTaskNew(@NotNull GattPeripheral gattPeripheral, @NotNull HMDeviceSource hMDeviceSource, @NotNull Calendar calendar, int i, @NotNull SyncDataCallback<? super List<? extends GpsRecord>> syncDataCallback) {
        this.gattPeripheral = gattPeripheral;
        this.source = hMDeviceSource;
        this.calendar = calendar;
        this.version = i;
        this.mCallback = syncDataCallback;
        this.profile = GdspFactory.INSTANCE.getGdspSyncProfile(gattPeripheral, i);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        GDSPErrorCode gDSPErrorCodeSync;
        SportSummary detail;
        this.mCallback.onStart();
        if (!this.profile.init()) {
            Debug.i(j, "init gps data profile failed!!!");
            this.mCallback.onFinish(new HMDeviceError(2));
            return;
        }
        Calendar calendar = (Calendar) this.calendar.clone();
        ArrayList arrayList = new ArrayList();
        Debug.fi(j, Intrinsics.stringPlus("gps startTime:", calendar.getTime()));
        while (true) {
            GdspParamFactory gdspParamFactory = GdspParamFactory.INSTANCE;
            BaseGdspSyncParam<SportSummary> sportSummaryParam = gdspParamFactory.getSportSummaryParam(calendar, this.source, this.version);
            GdspDataSyncUnit gdspDataSyncUnit = new GdspDataSyncUnit(this.profile, sportSummaryParam.getGdspVersion());
            this.syncUnit = gdspDataSyncUnit;
            gDSPErrorCodeSync = gdspDataSyncUnit.sync(sportSummaryParam.getType(), calendar, sportSummaryParam.getDataReceiver2(), CollectionsKt__CollectionsKt.emptyList(), this.mErrorCodeTrans);
            GDSPErrorCode gDSPErrorCode = GDSPErrorCode.SUCCESS;
            if (gDSPErrorCodeSync != gDSPErrorCode || (detail = sportSummaryParam.getDataReceiver2().getDetail()) == null) {
                break;
            }
            GpsRecord gpsRecord = new GpsRecord();
            Debug.fi(j, Intrinsics.stringPlus("gps summary:", detail));
            gpsRecord.setSummary(detail);
            BaseGdspSyncParam<SportDetail> sportDetailParam = gdspParamFactory.getSportDetailParam(calendar, this.source, detail, this.version);
            GdspDataSyncUnit gdspDataSyncUnit2 = new GdspDataSyncUnit(this.profile, sportDetailParam.getGdspVersion());
            this.syncUnit = gdspDataSyncUnit2;
            gDSPErrorCodeSync = gdspDataSyncUnit2.sync(sportDetailParam.getType(), calendar, sportDetailParam.getDataReceiver2(), CollectionsKt__CollectionsKt.emptyList(), this.mErrorCodeTrans);
            if (gDSPErrorCodeSync != gDSPErrorCode) {
                break;
            }
            SportDetail detail2 = sportDetailParam.getDataReceiver2().getDetail();
            Debug.fi(j, Intrinsics.stringPlus("gps detail:", detail2 != null ? detail2.toSimpleString() : null));
            if (detail2 == null) {
                detail2 = new SportDetail();
            }
            gpsRecord.setDetail(detail2);
            arrayList.add(gpsRecord);
            calendar.setTimeInMillis(detail.getStartTime() + ((long) 1000));
            Debug.fi(j, Intrinsics.stringPlus("update gps startTime:", calendar.getTime()));
        }
        this.mCallback.onProgress(new Progress(100, 100));
        this.profile.deInit();
        this.mCallback.onData(arrayList);
        SyncDataCallback<List<? extends GpsRecord>> syncDataCallback = this.mCallback;
        HMDeviceError deviceError = gDSPErrorCodeSync != null ? GDSPErrorCodeExtKt.toDeviceError(gDSPErrorCodeSync) : null;
        if (deviceError == null) {
            deviceError = new HMDeviceError(0);
        }
        syncDataCallback.onFinish(deviceError);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.IGdspCancelApi
    public void stopSync() {
        GdspDataSyncUnit gdspDataSyncUnit = this.syncUnit;
        if (gdspDataSyncUnit == null) {
            return;
        }
        gdspDataSyncUnit.stop();
    }
}
