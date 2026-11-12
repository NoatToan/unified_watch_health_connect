package com.xiaomi.hm.health.bt.device.mozart;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.airoha.android.lib.fota.AgentPartnerParam;
import com.airoha.android.lib.fota.AirohaFotaListener;
import com.airoha.android.lib.fota.AirohaFotaMgrEx;
import com.airoha.android.lib.fota.fotaError.ErrorEnum;
import com.airoha.android.lib.fota.stage.FotaStageEnum;
import com.airoha.android.lib.transport.AirohaLink;
import com.airoha.liblogger.AirohaLogger;
import com.airoha.liblogger.printer.FilePrinter;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.core.BluetoothA2dpService;
import com.huami.bluetooth.device.function.upgrade.FirmwareUpgrade;
import com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeCallback;
import com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeResult;
import com.huami.third.wechat.ui.bind.result.WeChatBindSuccessFragment;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 -2\u00020\u0001:\u0003-./B;\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u001d\u0010 \u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u001d\u0010$\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b\u0015\u0010#R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010*\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b\u0011\u0010)¨\u00060"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/mozart/MozartFirmwareUpdater;", "Lcom/huami/bluetooth/device/function/upgrade/FirmwareUpgrade;", "Lcom/huami/bluetooth/device/function/upgrade/FirmwareUpgradeResult;", "result", "", "f", "e", "a", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "firmware", "Lcom/huami/bluetooth/device/function/upgrade/FirmwareUpgradeCallback;", "callback", "upgradeFirmware", "Lcom/airoha/android/lib/transport/AirohaLink;", "Lcom/airoha/android/lib/transport/AirohaLink;", "link", "", "b", "Ljava/lang/String;", "deviceAddress", "Lcom/xiaomi/hm/health/bt/device/mozart/MozartFirmwareUpdater$ConnectMode;", "c", "Lcom/xiaomi/hm/health/bt/device/mozart/MozartFirmwareUpdater$ConnectMode;", "connectMode", "Lkotlin/Function0;", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function0;", "startConnection", "stopConnection", "Lcom/airoha/android/lib/fota/AirohaFotaMgrEx;", "Lkotlin/Lazy;", "()Lcom/airoha/android/lib/fota/AirohaFotaMgrEx;", "otaMgr", "Lcom/xiaomi/hm/health/bt/device/mozart/MozartFirmwareUpdater$OtaListener;", "g", "()Lcom/xiaomi/hm/health/bt/device/mozart/MozartFirmwareUpdater$OtaListener;", "otaListener", "h", "Lcom/huami/bluetooth/device/function/upgrade/FirmwareUpgradeCallback;", "Lcom/airoha/liblogger/printer/FilePrinter;", "i", "()Lcom/airoha/liblogger/printer/FilePrinter;", "loggerPrinter", "<init>", "(Lcom/airoha/android/lib/transport/AirohaLink;Ljava/lang/String;Lcom/xiaomi/hm/health/bt/device/mozart/MozartFirmwareUpdater$ConnectMode;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Companion", "ConnectMode", "OtaListener", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class MozartFirmwareUpdater implements FirmwareUpgrade {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean j = false;

    @NotNull
    private static final String k = "MozartFirmwareUpdater";
    private static final int l = 0;
    private static final boolean m = false;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AirohaLink link;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String deviceAddress;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ConnectMode connectMode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> startConnection;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> stopConnection;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private FirmwareUpgradeCallback callback;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy otaMgr = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy otaListener = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy loggerPrinter = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\nR(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/mozart/MozartFirmwareUpdater$Companion;", "", "", "printSdkLog", "Z", "getPrintSdkLog", "()Z", "setPrintSdkLog", "(Z)V", "getPrintSdkLog$annotations", "()V", "", "BATTERY_THRESHOLD", LogUtil.I, "SILENT_UPGRADE", "", "TAG", "Ljava/lang/String;", "<init>", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getPrintSdkLog$annotations() {
        }

        public final boolean getPrintSdkLog() {
            return MozartFirmwareUpdater.j;
        }

        public final void setPrintSdkLog(boolean z) {
            MozartFirmwareUpdater.j = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/mozart/MozartFirmwareUpdater$ConnectMode;", "", "<init>", "()V", "LeftOnly", "RightOnly", "Tws", "Lcom/xiaomi/hm/health/bt/device/mozart/MozartFirmwareUpdater$ConnectMode$LeftOnly;", "Lcom/xiaomi/hm/health/bt/device/mozart/MozartFirmwareUpdater$ConnectMode$RightOnly;", "Lcom/xiaomi/hm/health/bt/device/mozart/MozartFirmwareUpdater$ConnectMode$Tws;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class ConnectMode {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/mozart/MozartFirmwareUpdater$ConnectMode$LeftOnly;", "Lcom/xiaomi/hm/health/bt/device/mozart/MozartFirmwareUpdater$ConnectMode;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class LeftOnly extends ConnectMode {

            @NotNull
            public static final LeftOnly INSTANCE = new LeftOnly();

            private LeftOnly() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/mozart/MozartFirmwareUpdater$ConnectMode$RightOnly;", "Lcom/xiaomi/hm/health/bt/device/mozart/MozartFirmwareUpdater$ConnectMode;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class RightOnly extends ConnectMode {

            @NotNull
            public static final RightOnly INSTANCE = new RightOnly();

            private RightOnly() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/mozart/MozartFirmwareUpdater$ConnectMode$Tws;", "Lcom/xiaomi/hm/health/bt/device/mozart/MozartFirmwareUpdater$ConnectMode;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Tws extends ConnectMode {

            @NotNull
            public static final Tws INSTANCE = new Tws();

            private Tws() {
                super(null);
            }
        }

        private ConnectMode() {
        }

        public /* synthetic */ ConnectMode(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u0000 ?2\u00020\u0001:\u0001\u001cBi\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00020(\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00020(\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b=\u0010>J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\"\u0010,\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010+R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010$R\u0018\u00102\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0018\u00104\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\"\u00109\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b.\u00107\"\u0004\b5\u00108R\"\u0010;\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00106\u001a\u0004\b/\u00107\"\u0004\b:\u00108R\"\u0010<\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00106\u001a\u0004\b*\u00107\"\u0004\b3\u00108¨\u0006@"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/mozart/MozartFirmwareUpdater$OtaListener;", "Lcom/airoha/android/lib/fota/AirohaFotaListener;", "", "h", "Lkotlin/Function0;", "runnable", "", "delay", "Ljava/util/Timer;", "l", "Lcom/airoha/android/lib/fota/AgentPartnerParam;", "role", "", "progress", "onProgressChanged", "onRhoNotification", "", "isRightSide", "onAgentChannelReceived", "Lcom/airoha/android/lib/fota/stage/FotaStageEnum;", "stageEnum", "Lcom/airoha/android/lib/fota/fotaError/ErrorEnum;", "errorEnum", "onFailed", "onTransferCompleted", "onDeviceRebooted", "onCompleted", "Lcom/airoha/android/lib/fota/AirohaFotaMgrEx;", "a", "Lcom/airoha/android/lib/fota/AirohaFotaMgrEx;", "otaMgr", "Lcom/xiaomi/hm/health/bt/device/mozart/MozartFirmwareUpdater$ConnectMode;", "b", "Lcom/xiaomi/hm/health/bt/device/mozart/MozartFirmwareUpdater$ConnectMode;", "connectMode", "c", "Lkotlin/jvm/functions/Function0;", "startConnection", GoogleApiAvailabilityLight.a, "stopConnection", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "e", "Lkotlin/jvm/functions/Function1;", "onProgress", "Lcom/huami/bluetooth/device/function/upgrade/FirmwareUpgradeResult;", "f", "g", "printA2dpConnectionState", "Ljava/util/Timer;", "switchRoleTimer", "i", "rebootingTimer", z.j, "Z", "()Z", "(Z)V", "halfCompleted", hl.k, "switchRole", "agentIsRightSide", "<init>", "(Lcom/airoha/android/lib/fota/AirohaFotaMgrEx;Lcom/xiaomi/hm/health/bt/device/mozart/MozartFirmwareUpdater$ConnectMode;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "m", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class OtaListener implements AirohaFotaListener {

        @NotNull
        private static final a m = new a(null);

        @Deprecated
        public static final int n = 100;

        @Deprecated
        public static final long o = 600000;

        @Deprecated
        public static final long p = 60000;

        @Deprecated
        public static final long q = 2000;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final AirohaFotaMgrEx otaMgr;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final ConnectMode connectMode;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Function0<Unit> startConnection;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final Function0<Unit> stopConnection;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private final Function1<Progress, Unit> onProgress;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        private final Function1<FirmwareUpgradeResult, Unit> onCompleted;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        private final Function0<Unit> printA2dpConnectionState;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        private Timer switchRoleTimer;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        private Timer rebootingTimer;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private boolean halfCompleted;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private boolean switchRole;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private boolean agentIsRightSide;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ErrorEnum.values().length];
                iArr[ErrorEnum.BATTERY_LOW.ordinal()] = 1;
                iArr[ErrorEnum.RESPONSE_TIMEOUT.ordinal()] = 2;
                iArr[ErrorEnum.ABNORMALLY_DISCONNECTED.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"com/xiaomi/hm/health/bt/device/mozart/MozartFirmwareUpdater$OtaListener$a", "", "", "DELAY_SEND_COMMIT", "J", "", "HALF", LogUtil.I, "TIMEOUT_REBOOTING", "TIMEOUT_SWITCH_ROLE", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Unit> {
            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Debug.fi(MozartFirmwareUpdater.k, "Rebooting timeout");
                OtaListener.this.startConnection.invoke();
                OtaListener.this.otaMgr.cancel();
                OtaListener.this.onCompleted.invoke(FirmwareUpgradeResult.FAILED_NO_RESPONSE);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<Unit> {
            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Debug.fi(MozartFirmwareUpdater.k, "Switch role timeout");
                OtaListener.this.h();
                OtaListener.this.otaMgr.cancel();
                OtaListener.this.onCompleted.invoke(FirmwareUpgradeResult.FAILED);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<Unit> {
            public d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Debug.fi(MozartFirmwareUpdater.k, "Start commit");
                OtaListener.this.otaMgr.startCommitProcess();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OtaListener(@NotNull AirohaFotaMgrEx airohaFotaMgrEx, @NotNull ConnectMode connectMode, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function1, @NotNull Function1<? super Progress, Unit> function2, @NotNull Function1<? super FirmwareUpgradeResult, Unit> function3, @NotNull Function0<Unit> function4) {
            this.otaMgr = airohaFotaMgrEx;
            this.connectMode = connectMode;
            this.startConnection = function0;
            this.stopConnection = function1;
            this.onProgress = function2;
            this.onCompleted = function3;
            this.printA2dpConnectionState = function4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h() {
            this.startConnection.invoke();
            this.switchRole = false;
            Timer timer = this.switchRoleTimer;
            if (timer == null) {
                return;
            }
            timer.cancel();
            this.switchRoleTimer = null;
        }

        private final Timer l(final Function0<Unit> runnable, long delay) {
            Timer timer = new Timer(true);
            timer.schedule(new TimerTask() { // from class: com.xiaomi.hm.health.bt.device.mozart.MozartFirmwareUpdater$OtaListener$startTimer$1$1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    runnable.invoke();
                }
            }, delay);
            return timer;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getAgentIsRightSide() {
            return this.agentIsRightSide;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getHalfCompleted() {
            return this.halfCompleted;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getSwitchRole() {
            return this.switchRole;
        }

        public final void i(boolean z) {
            this.agentIsRightSide = z;
        }

        public final void j(boolean z) {
            this.halfCompleted = z;
        }

        public final void k(boolean z) {
            this.switchRole = z;
        }

        @Override // com.airoha.android.lib.fota.AirohaFotaListener
        public void onAgentChannelReceived(boolean isRightSide) {
            Debug.fi(MozartFirmwareUpdater.k, Intrinsics.stringPlus("onAgentChannelReceived: isRightSide: ", Boolean.valueOf(isRightSide)));
            this.agentIsRightSide = isRightSide;
        }

        @Override // com.airoha.android.lib.fota.AirohaFotaListener
        public void onCompleted() {
            Debug.fi(MozartFirmwareUpdater.k, "onCompleted - Rebooting...");
            this.rebootingTimer = l(new b(), 600000L);
        }

        @Override // com.airoha.android.lib.fota.AirohaFotaListener
        public void onDeviceRebooted() {
            Debug.fi(MozartFirmwareUpdater.k, "onDeviceRebooted");
            Timer timer = this.rebootingTimer;
            if (timer != null) {
                timer.cancel();
                this.rebootingTimer = null;
            }
            this.startConnection.invoke();
            this.onCompleted.invoke(FirmwareUpgradeResult.COMPLETE);
        }

        @Override // com.airoha.android.lib.fota.AirohaFotaListener
        public void onFailed(@NotNull FotaStageEnum stageEnum, @NotNull ErrorEnum errorEnum) {
            boolean z;
            FirmwareUpgradeResult firmwareUpgradeResult;
            Debug.fi(MozartFirmwareUpdater.k, "onFailed: stageEnum: " + stageEnum + ", errorEnum: " + errorEnum);
            if (this.switchRole) {
                h();
            }
            Timer timer = this.rebootingTimer;
            if (timer == null) {
                z = false;
            } else {
                timer.cancel();
                this.rebootingTimer = null;
                this.startConnection.invoke();
                z = true;
            }
            if (z) {
                this.onCompleted.invoke(FirmwareUpgradeResult.COMPLETE);
                return;
            }
            Function1<FirmwareUpgradeResult, Unit> function1 = this.onCompleted;
            int i = WhenMappings.$EnumSwitchMapping$0[errorEnum.ordinal()];
            if (i == 1) {
                firmwareUpgradeResult = FirmwareUpgradeResult.FAILED_LOW_POWER;
            } else if (i != 2) {
                firmwareUpgradeResult = i != 3 ? FirmwareUpgradeResult.FAILED : FirmwareUpgradeResult.FAILED_DISCONNECTED;
            } else {
                firmwareUpgradeResult = FirmwareUpgradeResult.FAILED_NO_RESPONSE;
            }
            function1.invoke(firmwareUpgradeResult);
        }

        @Override // com.airoha.android.lib.fota.AirohaFotaListener
        public void onProgressChanged(@NotNull AgentPartnerParam role, int progress) {
            boolean zAreEqual;
            boolean zAreEqual2 = Intrinsics.areEqual(this.connectMode, ConnectMode.Tws.INSTANCE);
            if (zAreEqual2) {
                boolean z = this.agentIsRightSide;
                zAreEqual = (z && role == AgentPartnerParam.AGENT) || (!z && role == AgentPartnerParam.AGENT);
            } else {
                zAreEqual = Intrinsics.areEqual(this.connectMode, ConnectMode.RightOnly.INSTANCE);
            }
            Debug.fi(MozartFirmwareUpdater.k, "onProgressChanged: role: " + role + '(' + (zAreEqual ? "Right" : "Left") + "), progress: " + progress);
            if (this.switchRole) {
                h();
            }
            int i = zAreEqual2 ? 200 : 100;
            if (zAreEqual2 && this.halfCompleted) {
                progress += 100;
            }
            this.onProgress.invoke(new Progress(i, progress));
        }

        @Override // com.airoha.android.lib.fota.AirohaFotaListener
        public void onRhoNotification() {
            Debug.fi(MozartFirmwareUpdater.k, "onRhoNotification");
            this.printA2dpConnectionState.invoke();
            if (this.switchRole) {
                Debug.fi(MozartFirmwareUpdater.k, "Repeat switch role!");
                h();
                this.onCompleted.invoke(FirmwareUpgradeResult.FAILED);
            } else {
                this.halfCompleted = true;
                this.switchRole = true;
                this.stopConnection.invoke();
                this.switchRoleTimer = l(new c(), 60000L);
            }
        }

        @Override // com.airoha.android.lib.fota.AirohaFotaListener
        public void onTransferCompleted() {
            Debug.fi(MozartFirmwareUpdater.k, "onTransferCompleted");
            this.stopConnection.invoke();
            l(new d(), 2000L);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/airoha/liblogger/printer/FilePrinter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<FilePrinter> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FilePrinter invoke() {
            BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(MozartFirmwareUpdater.this.deviceAddress);
            String name = remoteDevice == null ? null : remoteDevice.getName();
            if (name == null) {
                name = MozartFirmwareUpdater.this.deviceAddress;
            }
            FilePrinter filePrinter = new FilePrinter();
            filePrinter.init(r.hashMapOf(TuplesKt.to(WeChatBindSuccessFragment.DEVICE_NAME, name)));
            return filePrinter;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/mozart/MozartFirmwareUpdater$OtaListener;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<OtaListener> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.device.mozart.MozartFirmwareUpdater$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0791b extends Lambda implements Function0<Unit> {
            public static final C0791b a = new C0791b();

            public C0791b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class c extends FunctionReferenceImpl implements Function1<Progress, Unit> {
            public c(FirmwareUpgradeCallback firmwareUpgradeCallback) {
                super(1, firmwareUpgradeCallback, FirmwareUpgradeCallback.class, "onProgress", "onProgress(Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;)V", 0);
            }

            public final void a(@NotNull Progress progress) {
                ((FirmwareUpgradeCallback) this.receiver).onProgress(progress);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Progress progress) {
                a(progress);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class d extends FunctionReferenceImpl implements Function1<FirmwareUpgradeResult, Unit> {
            public d(MozartFirmwareUpdater mozartFirmwareUpdater) {
                super(1, mozartFirmwareUpdater, MozartFirmwareUpdater.class, "onComplete", "onComplete(Lcom/huami/bluetooth/device/function/upgrade/FirmwareUpgradeResult;)V", 0);
            }

            public final void a(@NotNull FirmwareUpgradeResult firmwareUpgradeResult) {
                ((MozartFirmwareUpdater) this.receiver).f(firmwareUpgradeResult);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FirmwareUpgradeResult firmwareUpgradeResult) {
                a(firmwareUpgradeResult);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function0<Unit> {
            public final /* synthetic */ MozartFirmwareUpdater a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(MozartFirmwareUpdater mozartFirmwareUpdater) {
                super(0);
                this.a = mozartFirmwareUpdater;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                BluetoothA2dpService bluetoothA2dpService = BluetoothA2dpService.INSTANCE.get();
                if (bluetoothA2dpService == null) {
                    return;
                }
                Debug.fi(MozartFirmwareUpdater.k, Intrinsics.stringPlus("A2DP connected: ", Boolean.valueOf(bluetoothA2dpService.isA2dpConnected(this.a.deviceAddress))));
            }
        }

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OtaListener invoke() {
            AirohaFotaMgrEx airohaFotaMgrExD = MozartFirmwareUpdater.this.d();
            ConnectMode connectMode = MozartFirmwareUpdater.this.connectMode;
            a aVar = a.a;
            C0791b c0791b = C0791b.a;
            FirmwareUpgradeCallback firmwareUpgradeCallback = MozartFirmwareUpdater.this.callback;
            Objects.requireNonNull(firmwareUpgradeCallback);
            return new OtaListener(airohaFotaMgrExD, connectMode, aVar, c0791b, new c(firmwareUpgradeCallback), new d(MozartFirmwareUpdater.this), new e(MozartFirmwareUpdater.this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/airoha/android/lib/fota/AirohaFotaMgrEx;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<AirohaFotaMgrEx> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AirohaFotaMgrEx invoke() {
            return new AirohaFotaMgrEx(MozartFirmwareUpdater.this.link);
        }
    }

    public MozartFirmwareUpdater(@NotNull AirohaLink airohaLink, @NotNull String str, @NotNull ConnectMode connectMode, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function1) {
        this.link = airohaLink;
        this.deviceAddress = str;
        this.connectMode = connectMode;
        this.startConnection = function0;
        this.stopConnection = function1;
    }

    private final void a() {
        AirohaLogger.getInstance().removePrinter(b().getPrinterName());
    }

    private final FilePrinter b() {
        return (FilePrinter) this.loggerPrinter.getValue();
    }

    private final OtaListener c() {
        return (OtaListener) this.otaListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AirohaFotaMgrEx d() {
        return (AirohaFotaMgrEx) this.otaMgr.getValue();
    }

    private final void e() {
        AirohaLogger.getInstance().addPrinter(b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(FirmwareUpgradeResult result) {
        d().setFilePath(null);
        d().unregisterAirohaOtaListener(c());
        this.link.unregisterOnConnStateListener("AirohaRaceFotaMgr");
        FirmwareUpgradeCallback firmwareUpgradeCallback = this.callback;
        Objects.requireNonNull(firmwareUpgradeCallback);
        firmwareUpgradeCallback.onComplete(result);
        this.startConnection.invoke();
        if (j) {
            a();
        }
    }

    public static final boolean getPrintSdkLog() {
        return INSTANCE.getPrintSdkLog();
    }

    public static final void setPrintSdkLog(boolean z) {
        INSTANCE.setPrintSdkLog(z);
    }

    @Override // com.huami.bluetooth.device.function.upgrade.FirmwareUpgrade
    public void upgradeFirmware(@NotNull HMFirmwareInfo firmware, @NotNull FirmwareUpgradeCallback callback) {
        this.callback = callback;
        if (j) {
            e();
        }
        d().registerAirohaOtaListener(c());
        c().j(false);
        c().k(false);
        this.stopConnection.invoke();
        callback.onPreLoad();
        callback.onStart();
        d().setBdAdress(this.deviceAddress);
        d().setFilePath(firmware.getFwPath());
        d().start(0, false, Intrinsics.areEqual(this.connectMode, ConnectMode.Tws.INSTANCE), true);
    }
}
