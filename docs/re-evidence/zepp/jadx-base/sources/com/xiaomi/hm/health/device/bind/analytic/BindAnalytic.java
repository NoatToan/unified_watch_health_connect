package com.xiaomi.hm.health.device.bind.analytic;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.hid.takepic.TakePicSettingActivity;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AppAuthError;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthError;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.ProtocolAuthError;
import com.xiaomi.hm.health.device.bind.analytic.events.AuthSuccess;
import com.xiaomi.hm.health.device.bind.analytic.events.BindEvent;
import com.xiaomi.hm.health.device.bind.analytic.events.BindFail;
import com.xiaomi.hm.health.device.bind.analytic.events.BindStart;
import com.xiaomi.hm.health.device.bind.analytic.events.BindSuccess;
import com.xiaomi.hm.health.device.bind.analytic.events.CancelBind;
import com.xiaomi.hm.health.device.bind.analytic.events.GetDeviceInfoSuccess;
import com.xiaomi.hm.health.device.bind.analytic.events.ScanSuccess;
import java.util.HashMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007R\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000fR\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000fR\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000fR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u000fR\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u000fR2\u0010(\u001a\u001e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00060#j\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0006`%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u000f¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/device/bind/analytic/BindAnalytic;", "", "Lcom/xiaomi/hm/health/device/bind/analytic/events/BindEvent;", "event", "", "record", "", "advName", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "parseDeviceSource", "Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/AuthError;", "authError", "Lcom/xiaomi/hm/health/device/bind/analytic/events/BindFail;", "parseAuthError", "a", "Ljava/lang/String;", "sessionId", "b", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "c", TakePicSettingActivity.KEY_ADDRESS, GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/bind/analytic/events/BindEvent;", "lastEvent", "e", "BIND_MODE_DIRECT", "f", "BIND_MODE_FAST_BIND", "g", "BIND_MODE_QRCODE", "h", "BIND_MODE_SCAN", "i", "bindMode", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", z.j, "Ljava/util/HashMap;", "bindModeMap", "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BindAnalytic {

    @NotNull
    public static final String TAG = "BindAnalytic";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private static BindEvent lastEvent = null;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String BIND_MODE_FAST_BIND = "FastBind";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final String BIND_MODE_QRCODE = "QRCode";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final String BIND_MODE_SCAN = "Scan";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private static final HashMap<Integer, String> bindModeMap;

    @NotNull
    public static final BindAnalytic INSTANCE = new BindAnalytic();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static String sessionId = "";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static HMDeviceSource deviceSource = HMDeviceSource.VDEVICE;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static String macAddress = "";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String BIND_MODE_DIRECT = "Direct";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static String bindMode = BIND_MODE_DIRECT;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "analytic done";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ BindEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BindEvent bindEvent) {
            super(0);
            this.a = bindEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "event: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "bind not start";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "not MILI";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "ignore bluetooth off";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ BindEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(BindEvent bindEvent) {
            super(0);
            this.a = bindEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "set info when scan band: " + ((ScanSuccess) this.a).getDeviceSource() + ", " + ((ScanSuccess) this.a).getCom.huami.hid.takepic.TakePicSettingActivity.KEY_ADDRESS java.lang.String();
        }
    }

    static {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, BIND_MODE_FAST_BIND);
        map.put(1, BIND_MODE_DIRECT);
        map.put(2, BIND_MODE_QRCODE);
        map.put(3, "Scan");
        bindModeMap = map;
    }

    private BindAnalytic() {
    }

    @JvmStatic
    @NotNull
    public static final BindFail parseAuthError(@NotNull AuthError authError) {
        int i;
        int code;
        BindFail bindFail = new BindFail(ConstantKt.STAGE_AUTH, ConstantKt.EXTRA_UNKNOWN_AUTH_FAIL);
        if (authError instanceof AppAuthError) {
            i = 2;
            code = authError.getCode();
        } else {
            if (!(authError instanceof ProtocolAuthError)) {
                return bindFail;
            }
            i = 3;
            code = authError.getCode();
        }
        return new BindFail(ConstantKt.STAGE_AUTH, null, Integer.valueOf(i), Integer.valueOf(code));
    }

    @JvmStatic
    @NotNull
    public static final HMDeviceSource parseDeviceSource(@Nullable String advName) {
        if (advName == null) {
            return HMDeviceSource.VDEVICE;
        }
        HMDeviceSource hMDeviceSourceNameToSource = HMMiLiProDevice.nameToSource(advName);
        if (hMDeviceSourceNameToSource == null || hMDeviceSourceNameToSource == HMDeviceSource.VDEVICE) {
            hMDeviceSourceNameToSource = HMMiLiDevice.nameToSource(advName);
        }
        return hMDeviceSourceNameToSource == null ? HMDeviceSource.VDEVICE : hMDeviceSourceNameToSource;
    }

    @JvmStatic
    public static final void record(@NotNull BindEvent event) {
        String string;
        String string2;
        HMLog.info(TAG, new b(event));
        if (m.isBlank(sessionId) && !(event instanceof BindStart)) {
            HMLog.error$default(TAG, null, null, c.a, 6, null);
            return;
        }
        if (event instanceof BindStart) {
            sessionId = UUID.randomUUID().toString();
            BindStart bindStart = (BindStart) event;
            deviceSource = bindStart.getDeviceSource();
            macAddress = bindStart.getCom.huami.hid.takepic.TakePicSettingActivity.KEY_ADDRESS java.lang.String();
        }
        if (deviceSource.getType() != HMDeviceType.MILI) {
            HMLog.error$default(TAG, null, null, d.a, 6, null);
            return;
        }
        if ((lastEvent instanceof AuthSuccess) && (event instanceof BindFail) && Intrinsics.areEqual(((BindFail) event).getFailReason(), ConstantKt.CONNECT_FAIL_REASON_BLUETOOTH_OFF)) {
            HMLog.error$default(TAG, null, null, e.a, 6, null);
            return;
        }
        lastEvent = event;
        CountEventBuilder countEventBuilder = new CountEventBuilder(event.getEvent());
        if (event instanceof BindStart) {
            BindStart bindStart2 = (BindStart) event;
            countEventBuilder.addExtra(ConstantKt.KEY_KNOWN_DEVICE, String.valueOf(bindStart2.getKnownDevice()));
            String str = bindModeMap.get(Integer.valueOf(bindStart2.getBindMode()));
            if (str != null) {
                countEventBuilder.addExtra(ConstantKt.KEY_BIND_MODE, str);
                bindMode = str;
            }
        } else if (event instanceof ScanSuccess) {
            ScanSuccess scanSuccess = (ScanSuccess) event;
            countEventBuilder.addExtra(ConstantKt.KEY_RSSI, String.valueOf(scanSuccess.getRssi()));
            if (Intrinsics.areEqual(bindMode, "Scan")) {
                HMLog.info(TAG, new f(event));
                HMDeviceSource deviceSource2 = scanSuccess.getDeviceSource();
                if (deviceSource2 != null) {
                    deviceSource = deviceSource2;
                }
                String macAddress2 = scanSuccess.getCom.huami.hid.takepic.TakePicSettingActivity.KEY_ADDRESS java.lang.String();
                if (macAddress2 != null) {
                    macAddress = macAddress2;
                }
            }
        } else if (event instanceof GetDeviceInfoSuccess) {
            GetDeviceInfoSuccess getDeviceInfoSuccess = (GetDeviceInfoSuccess) event;
            HMDeviceSource deviceSource3 = getDeviceInfoSuccess.getDeviceSource();
            if (deviceSource3 != null) {
                deviceSource = deviceSource3;
            }
            String sn = getDeviceInfoSuccess.getSn();
            if (sn == null) {
                sn = "";
            }
            CountEventBuilder countEventBuilderAddExtra = countEventBuilder.addExtra("sn", sn);
            String fwVersion = getDeviceInfoSuccess.getFwVersion();
            if (fwVersion == null) {
                fwVersion = "";
            }
            countEventBuilderAddExtra.addExtra("fwVersion", fwVersion);
        } else if (event instanceof BindFail) {
            BindFail bindFail = (BindFail) event;
            CountEventBuilder countEventBuilderAddExtra2 = countEventBuilder.addExtra(ConstantKt.BIND_STAGE, bindFail.getBindStage());
            String failReason = bindFail.getFailReason();
            if (failReason == null) {
                failReason = "";
            }
            CountEventBuilder countEventBuilderAddExtra3 = countEventBuilderAddExtra2.addExtra(ConstantKt.BIND_FAIL_REASON, failReason);
            Integer domain = bindFail.getDomain();
            if (domain == null || (string = domain.toString()) == null) {
                string = "";
            }
            CountEventBuilder countEventBuilderAddExtra4 = countEventBuilderAddExtra3.addExtra("domain", string);
            Integer code = bindFail.getCode();
            if (code == null || (string2 = code.toString()) == null) {
                string2 = "";
            }
            countEventBuilderAddExtra4.addExtra("error_code", string2).addExtra(ConstantKt.NETWORK_ENABLE, String.valueOf(NetUtil.isNetworkConnected(DeviceXFunctionsKt.getContext())));
        } else if (event instanceof CancelBind) {
            countEventBuilder.addExtra(ConstantKt.CANCEL_REASON, ((CancelBind) event).getCancelReason());
        }
        countEventBuilder.addExtra("session_id", sessionId).addExtra(ConstantKt.KEY_MAC_ADDRESS, macAddress).addExtra("device_source", String.valueOf(deviceSource.getValue())).addExtra("app_status", DeviceXFunctionsKt.getAppStateApi().isForeground() ? "front" : "back");
        Analytics.recordEvent(countEventBuilder);
        if ((event instanceof CancelBind) || (event instanceof BindFail) || (event instanceof BindSuccess)) {
            sessionId = "";
            macAddress = "";
            lastEvent = null;
            deviceSource = HMDeviceSource.VDEVICE;
        }
        HMLog.info(TAG, a.a);
    }
}
