package com.xiaomi.hm.health.bt.profile.gdsp.common;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.RawData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCode;
import com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam;
import com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfile;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0019*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003:\u0001\u0019B+\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0005\u001a\u00020\u0004H\u0015J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/CommonGdspSyncTask;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseTask;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/IGdspCancelApi;", "", "doWork", "stopSync", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "b", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "c", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "param", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/callback/IGdspSyncCallback;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/callback/IGdspSyncCallback;", "callback", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/GdspDataSyncUnit;", "e", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/GdspDataSyncUnit;", "syncUnit", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;Lcom/xiaomi/hm/health/bt/profile/gdsp/common/callback/IGdspSyncCallback;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class CommonGdspSyncTask<T> extends HMBaseTask implements IGdspCancelApi {

    @NotNull
    private static final String f = "CommonGdspSyncTask";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final GattPeripheral gattPeripheral;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final BaseGdspSyncParam<T> param;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final IGdspSyncCallback<T> callback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private GdspDataSyncUnit syncUnit;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Progress, Unit> {
        public final /* synthetic */ CommonGdspSyncTask<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CommonGdspSyncTask<T> commonGdspSyncTask) {
            super(1);
            this.a = commonGdspSyncTask;
        }

        public final void a(@NotNull Progress progress) {
            ((CommonGdspSyncTask) this.a).callback.onProgress(progress.progress, progress.total);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Progress progress) {
            a(progress);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Calendar a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Calendar calendar) {
            super(0);
            this.a = calendar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "next sync time:" + this.a + " error, abort sync data";
        }
    }

    public CommonGdspSyncTask(@NotNull GattPeripheral gattPeripheral, @NotNull BaseGdspSyncParam<T> baseGdspSyncParam, @NotNull IGdspSyncCallback<T> iGdspSyncCallback) {
        this.gattPeripheral = gattPeripheral;
        this.param = baseGdspSyncParam;
        this.callback = iGdspSyncCallback;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    @ExperimentalCoroutinesApi
    public void doWork() {
        GDSPErrorCode gDSPErrorCodeSync;
        this.callback.onStart();
        Calendar calendar = (Calendar) this.param.getStartTime().clone();
        Calendar calendar2 = (Calendar) calendar.clone();
        int retryCount = this.param.getRetryCount();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        GdspSyncProfile gdspSyncProfile = GdspFactory.INSTANCE.getGdspSyncProfile(this.gattPeripheral, this.param.getGdspVersion());
        if (!gdspSyncProfile.init()) {
            Debug.fi(f, "sync data init fail");
            this.callback.onResult(GDSPErrorCode.OPERATION_FAILED);
            return;
        }
        while (true) {
            ArrayList arrayList3 = new ArrayList();
            this.param.getDataReceiver2().registerProgress(new a(this));
            GdspDataSyncUnit gdspDataSyncUnit = new GdspDataSyncUnit(gdspSyncProfile, this.param.getGdspVersion());
            this.syncUnit = gdspDataSyncUnit;
            gDSPErrorCodeSync = gdspDataSyncUnit.sync(this.param.getType(), calendar2, this.param.getDataReceiver2(), this.param.getHeadFilters(), this.param.getGetErrorCodeTrans());
            GDSPErrorCode gDSPErrorCode = GDSPErrorCode.SUCCESS;
            if (gDSPErrorCodeSync != gDSPErrorCode) {
                retryCount--;
                Debug.fi(f, Intrinsics.stringPlus("sync fail and retryCount:", Integer.valueOf(retryCount)));
            } else {
                DataHeader mDataHeader = this.param.getDataReceiver2().getMDataHeader();
                if (mDataHeader != null) {
                    this.callback.onDataHeader(mDataHeader);
                }
                DataHeader mDataHeader2 = this.param.getDataReceiver2().getMDataHeader();
                Calendar calendar3 = null;
                if ((mDataHeader2 == null ? 0 : mDataHeader2.size) > 0) {
                    T detail = this.param.getDataReceiver2().getDetail();
                    arrayList3.add(detail);
                    byte[] allByteData = this.param.getDataReceiver2().getAllByteData();
                    DataHeader mDataHeader3 = this.param.getDataReceiver2().getMDataHeader();
                    Calendar calendar4 = mDataHeader3 == null ? null : mDataHeader3.calendar;
                    if (calendar4 == null) {
                        calendar4 = Calendar.getInstance();
                    }
                    arrayList2.add(new RawData(allByteData, calendar4));
                    if (this.param.isDataReturnOnLoop()) {
                        this.callback.onData(arrayList3);
                    } else {
                        arrayList.add(detail);
                    }
                    BaseGdspSyncParam<T> baseGdspSyncParam = this.param;
                    Calendar startSyncTime = baseGdspSyncParam.getStartSyncTime(baseGdspSyncParam.getDataReceiver2().getMDataHeader(), detail);
                    if (startSyncTime != null) {
                        calendar = (Calendar) startSyncTime.clone();
                    }
                    if ((startSyncTime == null ? 0L : startSyncTime.getTimeInMillis()) > calendar2.getTimeInMillis()) {
                        calendar3 = startSyncTime;
                    } else {
                        HMLog.info(f, new b(startSyncTime));
                    }
                }
                calendar2 = calendar3;
            }
            if (!this.param.getIsLoop() || calendar2 == null || (gDSPErrorCodeSync != gDSPErrorCode && retryCount <= 0)) {
                break;
            }
        }
        gdspSyncProfile.deInit();
        T dataFooter = this.param.getDataReceiver2().getDataFooter(calendar);
        if (dataFooter != null) {
            arrayList.add(dataFooter);
        }
        if (this.param.isDataReturnOnFinish()) {
            this.callback.onData(arrayList);
        }
        this.callback.onAllRawData(arrayList2);
        this.callback.onResult(gDSPErrorCodeSync);
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
