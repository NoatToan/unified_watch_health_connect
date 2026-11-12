package com.xiaomi.hm.health.device.feature.sync.analytic;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.huami.devicex.injection.AppStateApi;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/analytic/SyncApiEventsRecorder;", "Lcom/xiaomi/hm/health/device/feature/sync/analytic/SyncEventsApi;", "", "key", "Lcom/huami/mifit/analytics/builder/CountEventBuilder;", "createEvent", "", "onEvent", "convertAppStatus", "onStart", "onFinish", "status", "onResult", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Lcom/huami/devicex/injection/AppStateApi;", "appStatus", "Lcom/huami/devicex/injection/AppStateApi;", "Ljava/util/UUID;", "sessionId$delegate", "Lkotlin/Lazy;", "getSessionId", "()Ljava/util/UUID;", "sessionId", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Lcom/huami/devicex/injection/AppStateApi;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SyncApiEventsRecorder implements SyncEventsApi {

    @NotNull
    private final AppStateApi appStatus;

    @NotNull
    private final HMDeviceSource deviceSource;

    /* JADX INFO: renamed from: sessionId$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sessionId = LazyKt__LazyJVMKt.lazy(new Function0<UUID>() { // from class: com.xiaomi.hm.health.device.feature.sync.analytic.SyncApiEventsRecorder$sessionId$2
        @Override // kotlin.jvm.functions.Function0
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    });

    public SyncApiEventsRecorder(@NotNull HMDeviceSource hMDeviceSource, @NotNull AppStateApi appStateApi) {
        this.deviceSource = hMDeviceSource;
        this.appStatus = appStateApi;
    }

    private final String convertAppStatus() {
        return this.appStatus.isForeground() ? AppMeasurementSdk.ConditionalUserProperty.ACTIVE : "background";
    }

    private final CountEventBuilder createEvent(String key) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(key);
        countEventBuilder.addExtra("appStatus", convertAppStatus());
        countEventBuilder.addExtra(SDKConstants.PARAM_SESSION_ID, String.valueOf(getSessionId()));
        countEventBuilder.addExtra("sourceID", String.valueOf(this.deviceSource.getValue()));
        return countEventBuilder;
    }

    private final UUID getSessionId() {
        return (UUID) this.sessionId.getValue();
    }

    private final void onEvent(String key) {
        try {
            Analytics.recordEvent(createEvent(key));
        } catch (Exception e) {
            HMLog.error$default(null, null, null, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.analytic.SyncApiEventsRecorder.onEvent.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "record error " + e + " ";
                }
            }, 7, null);
        }
    }

    @Override // com.xiaomi.hm.health.device.feature.sync.analytic.SyncEventsApi
    public void onFinish() {
        HMLog.info$default(null, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.analytic.SyncApiEventsRecorder.onFinish.1
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "sync center finish";
            }
        }, 1, null);
        onEvent("DATA_SYNC_CENTRAL_END");
    }

    @Override // com.xiaomi.hm.health.device.feature.sync.analytic.SyncEventsApi
    public void onResult(@NotNull String status) {
        try {
            CountEventBuilder countEventBuilderCreateEvent = createEvent("DATA_SYNC_CENTRAL_END");
            if (status.length() == 0) {
                countEventBuilderCreateEvent.addExtra("result", "success");
            } else {
                countEventBuilderCreateEvent.addExtra("result", status);
            }
            Analytics.recordEvent(countEventBuilderCreateEvent);
        } catch (Exception unused) {
        }
    }

    @Override // com.xiaomi.hm.health.device.feature.sync.analytic.SyncEventsApi
    public void onStart() {
        HMLog.info$default(null, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.analytic.SyncApiEventsRecorder.onStart.1
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "sync center start";
            }
        }, 1, null);
        onEvent("DATA_SYNC_CENTRAL_START");
    }
}
