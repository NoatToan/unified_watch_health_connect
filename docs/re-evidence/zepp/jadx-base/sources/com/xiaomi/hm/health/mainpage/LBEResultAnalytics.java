package com.xiaomi.hm.health.mainpage;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.module.homepage.sync.status.AGPSUpgradedEvent;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.utils.BraceletForegroundCallBack;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.f;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b1\u00102J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tJ\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fJ\f\u0010\u000f\u001a\u00020\u0002*\u0004\u0018\u00010\fR\u001d\u0010\u0014\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0016\u0010\u001d\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0016\u0010\u001f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016R\u0016\u0010!\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0016R\u0016\u0010\"\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0016R\u0016\u0010#\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0016R\u0016\u0010$\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0016R\u0016\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0016R\u0016\u0010(\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u0016R\u0016\u0010*\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u0016R\u0016\u0010,\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\u0016R\u0016\u0010.\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\u0016R\u0016\u00100\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\u0016¨\u00063"}, d2 = {"Lcom/xiaomi/hm/health/mainpage/LBEResultAnalytics;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "", "front", "", "onFrontBackgroundSwitch", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "event", "onConnectionEvent", "Lcom/huami/module/homepage/sync/status/AGPSUpgradedEvent;", "onAGpsUpgradedEvent", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "onEvent", "valid", "Lcom/huami/devicex/manager/DeviceManagerApi;", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "b", "Ljava/lang/String;", "KEY_SESSION_ID", "c", "KEY_RESULT", GoogleApiAvailabilityLight.a, "KEY_APP_STATUS", "e", "KEY_SOURCE", "f", "BLE_EVT_CONNECTED", "g", "BLE_EVT_CONNECT_FAIL", "BLE_EVT_OFF", "BLE_EVT_SYNC_SUCCESS", "BLE_EVT_SYNC_FAIL", "h", "BLE_EVT_AGPS_UPDATE_SUCCESS", "i", "BLE_EVT_AGPS_UPDATE_FAIL", z.j, "KEY_APPLICATION_STATE", hl.k, "TAG", "l", "FRONT", "m", "BACKGROUND", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class LBEResultAnalytics implements KoinComponentAdapter {

    @NotNull
    public static final String BLE_EVT_OFF = "bluetooth_not_turnon";

    @NotNull
    public static final String BLE_EVT_SYNC_FAIL = "sync_fail";

    @NotNull
    public static final String BLE_EVT_SYNC_SUCCESS = "sync_success";

    @NotNull
    public static final LBEResultAnalytics INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_SESSION_ID = "sessionId";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_RESULT = "result";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_APP_STATUS = "app_status";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_SOURCE = "source";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String BLE_EVT_CONNECTED = "connect_success";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final String BLE_EVT_CONNECT_FAIL = "connect_fail";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final String BLE_EVT_AGPS_UPDATE_SUCCESS = "update_success";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static final String BLE_EVT_AGPS_UPDATE_FAIL = "update_fail";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_APPLICATION_STATE = "BASE_LBE_APPLICATION_STATE";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "BleAnalytics";

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private static final String FRONT = "front";

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private static final String BACKGROUND = "background";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ HMDeviceSource b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, HMDeviceSource hMDeviceSource) {
            super(0);
            this.a = str;
            this.b = hMDeviceSource;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "event: " + this.a + ", source: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Pair<HMDeviceSource, String> a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Pair<? extends HMDeviceSource, String> pair, boolean z) {
            super(0);
            this.a = pair;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            int value = this.a.getFirst().getValue();
            String second = this.a.getSecond();
            return f.trimIndent("\n                    source: " + value + ",\n                    sessionId: " + ((Object) second) + ",\n                    appStatus: " + (this.b ? "front" : "background") + "\n                    ");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final LBEResultAnalytics lBEResultAnalytics = new LBEResultAnalytics();
        INSTANCE = lBEResultAnalytics;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.mainpage.LBEResultAnalytics$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = lBEResultAnalytics;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    private LBEResultAnalytics() {
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) deviceManagerApi.getValue();
    }

    public static /* synthetic */ void onEvent$default(LBEResultAnalytics lBEResultAnalytics, String str, HMDeviceType hMDeviceType, int i, Object obj) {
        if ((i & 2) != 0) {
            hMDeviceType = null;
        }
        lBEResultAnalytics.onEvent(str, hMDeviceType);
    }

    @JvmStatic
    public static final void onFrontBackgroundSwitch(boolean front) {
        HMDeviceType[] hMDeviceTypeArrValues = HMDeviceType.values();
        ArrayList arrayList = new ArrayList(hMDeviceTypeArrValues.length);
        int length = hMDeviceTypeArrValues.length;
        int i = 0;
        while (i < length) {
            HMDeviceType hMDeviceType = hMDeviceTypeArrValues[i];
            i++;
            LBEResultAnalytics lBEResultAnalytics = INSTANCE;
            HMDeviceSource boundDeviceSource = lBEResultAnalytics.a().getBoundDeviceSource(hMDeviceType);
            Pair pair = null;
            if (boundDeviceSource != HMDeviceSource.VDEVICE) {
                String currentSessionId = lBEResultAnalytics.a().getCurrentSessionId(boundDeviceSource);
                if (!(currentSessionId == null || m.isBlank(currentSessionId))) {
                    pair = new Pair(boundDeviceSource, currentSessionId);
                }
            }
            arrayList.add(pair);
        }
        for (Pair pair2 : CollectionsKt___CollectionsKt.filterNotNull(arrayList)) {
            HMLog.info(TAG, new b(pair2, front));
            Analytics.recordEvent(new CountEventBuilder(KEY_APPLICATION_STATE).addExtra("source", String.valueOf(((HMDeviceSource) pair2.getFirst()).getValue())).addExtra("session_id", (String) pair2.getSecond()).addExtra("app_status", front ? "front" : "background"));
        }
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    public final void onAGpsUpgradedEvent(@NotNull AGPSUpgradedEvent event) {
        LBEResultAnalytics lBEResultAnalytics = INSTANCE;
        AGPSUpgradedEvent aGPSUpgradedEvent = lBEResultAnalytics.valid(event.getDeviceType()) ? event : null;
        if (aGPSUpgradedEvent == null) {
            return;
        }
        lBEResultAnalytics.onEvent(aGPSUpgradedEvent.getSuccess() ? BLE_EVT_AGPS_UPDATE_SUCCESS : BLE_EVT_AGPS_UPDATE_FAIL, event.getDeviceType());
    }

    public final void onConnectionEvent(@NotNull HMDeviceConnectionEvent event) {
        LBEResultAnalytics lBEResultAnalytics = INSTANCE;
        String str = null;
        HMDeviceConnectionEvent hMDeviceConnectionEvent = lBEResultAnalytics.valid(event.getDeviceType()) ? event : null;
        if (hMDeviceConnectionEvent == null) {
            return;
        }
        if (hMDeviceConnectionEvent.isConnected()) {
            str = "connect_success";
        } else if (hMDeviceConnectionEvent.isConnectingTimeout()) {
            str = "connect_fail";
        }
        if (str == null) {
            return;
        }
        lBEResultAnalytics.onEvent(str, event.getDeviceType());
    }

    public final void onEvent(@NotNull String event, @Nullable HMDeviceType type) {
        String currentSessionId;
        HMDeviceSource boundDeviceSource = type == null ? null : INSTANCE.a().getBoundDeviceSource(type);
        HMLog.info(TAG, new a(event, boundDeviceSource));
        CountEventBuilder countEventBuilderAddExtra = new CountEventBuilder(StatEvent.BASE_LBE_RESULT_E).addExtra("result", event).addExtra("app_status", BraceletForegroundCallBack.getInstance().appStatus());
        if (boundDeviceSource != null) {
            countEventBuilderAddExtra.addExtra("source", String.valueOf(boundDeviceSource.getValue()));
        }
        if ((Intrinsics.areEqual(event, "connect_success") || Intrinsics.areEqual(event, "connect_fail")) && (currentSessionId = a().getCurrentSessionId(boundDeviceSource)) != null) {
            countEventBuilderAddExtra.addExtra("sessionId", currentSessionId);
        }
        Analytics.recordEvent(countEventBuilderAddExtra);
    }

    public final boolean valid(@Nullable HMDeviceType hMDeviceType) {
        return (hMDeviceType == null || hMDeviceType == HMDeviceType.VDevice || hMDeviceType == HMDeviceType.SENSORHUB) ? false : true;
    }
}
