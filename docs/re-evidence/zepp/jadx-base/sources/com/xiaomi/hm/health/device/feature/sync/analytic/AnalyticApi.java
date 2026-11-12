package com.xiaomi.hm.health.device.feature.sync.analytic;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.profile.gdsp.common.DataTransferSniffApi;
import com.xiaomi.hm.health.bt.profile.gdsp.common.DataTransferSniffApiManager;
import com.xiaomi.hm.health.bt.profile.gdsp.common.GdspFactory;
import com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspAnalyticCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.common.profile.DataTransferRate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00062\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/analytic/AnalyticApi;", "", "Lcom/xiaomi/hm/health/device/feature/sync/analytic/AnalyticApi$SyncStatus;", "eventStatus", "", "onEvent", "Companion", "DefImpl", "SyncStatus", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface AnalyticApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/analytic/AnalyticApi$Companion;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/xiaomi/hm/health/device/feature/sync/analytic/AnalyticApi;", "createApi", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Nullable
        public final AnalyticApi createApi(@NotNull HMBaseDevice device) {
            try {
                return new DefImpl(device);
            } catch (Exception e) {
                HMLog.error$default(null, null, null, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.analytic.AnalyticApi$Companion$createApi$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "create Analytic api error " + e;
                    }
                }, 7, null);
                return null;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/analytic/AnalyticApi$DefImpl;", "Lcom/xiaomi/hm/health/device/feature/sync/analytic/AnalyticApi;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/DataTransferSniffApi;", "", "onStart", "onFinish", "", "", "getBaseEventParam", "Lcom/xiaomi/hm/health/device/feature/sync/analytic/AnalyticApi$SyncStatus;", "eventStatus", "onEvent", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/profile/DataTransferRate;", "rate", "onRate", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "mSessionId", "Ljava/lang/String;", "", "dataRate", "Ljava/util/Map;", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class DefImpl implements AnalyticApi, DataTransferSniffApi {

        @NotNull
        private static final String KEY_ERROR = "BASE_LBE_SYNC_FAIL";

        @NotNull
        private static final String KEY_START = "BASE_LBE_SYNC_START";

        @NotNull
        private static final String KEY_SUCCESS = "BASE_LBE_SYNC_SUCCESS";

        @NotNull
        private final Map<Integer, DataTransferRate> dataRate;

        @NotNull
        private final HMBaseDevice device;

        @NotNull
        private String mSessionId;

        public DefImpl(@NotNull HMBaseDevice hMBaseDevice) {
            this.device = hMBaseDevice;
            DataTransferSniffApiManager.INSTANCE.register("Analysis", this);
            this.mSessionId = UUID.randomUUID().toString();
            this.dataRate = new LinkedHashMap();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, String> getBaseEventParam() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(SDKConstants.PARAM_SESSION_ID, this.mSessionId);
            linkedHashMap.put("sourceID", String.valueOf(this.device.getMDeviceSource().getValue()));
            linkedHashMap.put("appStatus", DeviceXFunctionsKt.getAppStateApi().isForeground() ? "front" : "back");
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onFinish() {
            GdspFactory.INSTANCE.unregisterAnalytic();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onStart() {
            HMLog.debug$default(null, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.analytic.AnalyticApi$DefImpl$onStart$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "start sync -> " + this.this$0.device.getMDeviceSource();
                }
            }, 1, null);
            GdspFactory.INSTANCE.registerAnalytic(new IGdspAnalyticCallback() { // from class: com.xiaomi.hm.health.device.feature.sync.analytic.AnalyticApi$DefImpl$onStart$2
                @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspAnalyticCallback
                public void onError(int dataType, int errorCode, @NotNull String reason) {
                    CountEventBuilder countEventBuilder = new CountEventBuilder("BASE_LBE_SYNC_FAIL");
                    Map<String, String> baseEventParam = this.this$0.getBaseEventParam();
                    baseEventParam.put("dataType", String.valueOf(dataType));
                    baseEventParam.put("errorCode", String.valueOf(errorCode));
                    baseEventParam.put("errorReason", reason);
                    Unit unit = Unit.INSTANCE;
                    Analytics.recordEvent(countEventBuilder.putExtras(baseEventParam));
                }

                @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspAnalyticCallback
                public void onStart(int dataType, int dataSize) {
                    this.this$0.mSessionId = UUID.randomUUID().toString();
                    CountEventBuilder countEventBuilder = new CountEventBuilder("BASE_LBE_SYNC_START");
                    Map<String, String> baseEventParam = this.this$0.getBaseEventParam();
                    baseEventParam.put("dataType", String.valueOf(dataType));
                    baseEventParam.put("dataSize", String.valueOf(dataSize));
                    Unit unit = Unit.INSTANCE;
                    Analytics.recordEvent(countEventBuilder.putExtras(baseEventParam));
                }

                @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspAnalyticCallback
                public void onSuccess(int dataType) {
                    CountEventBuilder countEventBuilder = new CountEventBuilder("BASE_LBE_SYNC_SUCCESS");
                    Map<String, String> baseEventParam = this.this$0.getBaseEventParam();
                    AnalyticApi.DefImpl defImpl = this.this$0;
                    baseEventParam.put("dataType", String.valueOf(dataType));
                    DataTransferRate dataTransferRate = (DataTransferRate) defImpl.dataRate.remove(Integer.valueOf(dataType));
                    if (dataTransferRate != null) {
                        try {
                            Result.Companion companion = Result.Companion;
                            baseEventParam.put("syncSpeed", String.valueOf(dataTransferRate.getDataTransferRate()));
                            Result.m3845constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            Result.m3845constructorimpl(ResultKt.createFailure(th));
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    Analytics.recordEvent(countEventBuilder.putExtras(baseEventParam));
                }
            });
        }

        @Override // com.xiaomi.hm.health.device.feature.sync.analytic.AnalyticApi
        public void onEvent(@NotNull final SyncStatus eventStatus) {
            try {
                ThreadsKt.thread((21 & 1) != 0, (21 & 2) != 0 ? false : false, (21 & 4) != 0 ? null : null, (21 & 8) != 0 ? null : null, (21 & 16) != 0 ? -1 : 0, new Function0<Unit>() { // from class: com.xiaomi.hm.health.device.feature.sync.analytic.AnalyticApi$DefImpl$onEvent$1

                    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[AnalyticApi.SyncStatus.values().length];
                            iArr[AnalyticApi.SyncStatus.START.ordinal()] = 1;
                            iArr[AnalyticApi.SyncStatus.FINISH.ordinal()] = 2;
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        int i = WhenMappings.$EnumSwitchMapping$0[eventStatus.ordinal()];
                        if (i == 1) {
                            this.onStart();
                        } else {
                            if (i != 2) {
                                return;
                            }
                            this.onFinish();
                        }
                    }
                });
            } catch (Throwable th) {
                HMLog.error$default(null, null, null, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.analytic.AnalyticApi$DefImpl$onEvent$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "error of record events " + th;
                    }
                }, 7, null);
            }
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.DataTransferSniffApi
        public void onRate(@NotNull DataTransferRate rate) {
            this.dataRate.put(Integer.valueOf(rate.getType()), rate);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/analytic/AnalyticApi$SyncStatus;", "", "<init>", "(Ljava/lang/String;I)V", "START", "FINISH", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public enum SyncStatus {
        START,
        FINISH
    }

    void onEvent(@NotNull SyncStatus eventStatus);
}
