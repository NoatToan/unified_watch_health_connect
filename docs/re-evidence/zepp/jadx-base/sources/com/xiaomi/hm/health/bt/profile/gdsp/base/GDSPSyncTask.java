package com.xiaomi.hm.health.bt.profile.gdsp.base;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.base.impl.GDSPErrorCodeAdapterImpl;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B3\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0019\u0010\u0011\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPSyncTask;", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseTask;", "", "doWork", "", "b", LogUtil.I, "dataType", "Ljava/util/Calendar;", "c", "Ljava/util/Calendar;", "startTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GeneralDataSensingProcedureApi;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GeneralDataSensingProcedureApi;", "getApi", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GeneralDataSensingProcedureApi;", "api", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPDataHandler;", "e", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPDataHandler;", "dataHandler", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/IDataInterceptor;", "f", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/IDataInterceptor;", "dataInterceptor", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/impl/GDSPErrorCodeAdapterImpl;", "g", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/impl/GDSPErrorCodeAdapterImpl;", "errorCodeAdapter", "<init>", "(ILjava/util/Calendar;Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GeneralDataSensingProcedureApi;Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPDataHandler;Lcom/xiaomi/hm/health/bt/profile/gdsp/base/IDataInterceptor;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GDSPSyncTask extends HMBaseTask {

    @NotNull
    private static final String h = "GDSPSyncTask";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int dataType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Calendar startTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final GeneralDataSensingProcedureApi api;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final GDSPDataHandler dataHandler;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final IDataInterceptor dataInterceptor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final GDSPErrorCodeAdapterImpl errorCodeAdapter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Long, Unit> {
        public final /* synthetic */ DataHeader b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DataHeader dataHeader) {
            super(1);
            this.b = dataHeader;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            GDSPSyncTask.this.dataHandler.onProgress(this.b.size, j);
        }
    }

    public /* synthetic */ GDSPSyncTask(int i, Calendar calendar, GeneralDataSensingProcedureApi generalDataSensingProcedureApi, GDSPDataHandler gDSPDataHandler, IDataInterceptor iDataInterceptor, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, calendar, generalDataSensingProcedureApi, gDSPDataHandler, (i2 & 16) != 0 ? null : iDataInterceptor);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        int code = GDSPErrorCode.SUCCESS.getCode();
        boolean zInit = this.api.init();
        Debug.fi(h, Intrinsics.stringPlus("Init gdsp result: ", Boolean.valueOf(zInit)));
        this.dataHandler.onReady();
        if (!zInit) {
            this.dataHandler.onSubmit(this.errorCodeAdapter.adapter2AppErrorCode(GDSPErrorCode.OPERATION_FAILED.getCode()));
            this.api.deInit();
            return;
        }
        Calendar calendarOnData = this.startTime;
        while (calendarOnData.getTimeInMillis() != 0) {
            DataHeader dateSize = this.api.getDateSize(this.dataType, calendarOnData);
            Debug.fi(h, Intrinsics.stringPlus("GDSP header: ", dateSize));
            if (dateSize == null) {
                code = GDSPErrorCode.OPERATION_FAILED.getCode();
                break;
            }
            if (dateSize.size <= 0) {
                code = GDSPErrorCode.SUCCESS.getCode();
                break;
            }
            DataResultResult data = this.api.getData(new a(dateSize), this.dataInterceptor);
            Debug.fi(h, Intrinsics.stringPlus("GDSP data: ", data));
            if (data.getErrorCode() != GDSPErrorCode.SUCCESS.getCode()) {
                code = data.getErrorCode();
                break;
            }
            try {
                GDSPDataHandler gDSPDataHandler = this.dataHandler;
                byte[] data2 = data.getData();
                if (data2 == null) {
                    data2 = new byte[0];
                }
                calendarOnData = gDSPDataHandler.onData(data2);
                Debug.fi(h, Intrinsics.stringPlus("Update sync time: ", calendarOnData));
            } catch (Exception unused) {
                Debug.fi(h, "Handler data exception");
                code = GDSPErrorCode.OPERATION_FAILED.getCode();
            }
        }
        Debug.fi(h, Intrinsics.stringPlus("Error code:", Integer.valueOf(code)));
        this.dataHandler.onSubmit(this.errorCodeAdapter.adapter2AppErrorCode(code));
        this.api.stopTransfer(code);
        this.api.deInit();
    }

    @NotNull
    public final GeneralDataSensingProcedureApi getApi() {
        return this.api;
    }

    public GDSPSyncTask(int i, @NotNull Calendar calendar, @NotNull GeneralDataSensingProcedureApi generalDataSensingProcedureApi, @NotNull GDSPDataHandler gDSPDataHandler, @Nullable IDataInterceptor iDataInterceptor) {
        this.dataType = i;
        this.startTime = calendar;
        this.api = generalDataSensingProcedureApi;
        this.dataHandler = gDSPDataHandler;
        this.dataInterceptor = iDataInterceptor;
        this.errorCodeAdapter = new GDSPErrorCodeAdapterImpl();
    }
}
