package com.xiaomi.hm.health.device.fw_upgrade;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.zxing.Intents;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.ecg.core.model.constant.MeasureStateValue;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.firmware.FirmwareOnlineManagerApi;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeInfo;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0006\u0010\u0004\u001a\u00020\u0000\u001a\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0018\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001e\u0010\u0011\u001a\u00020\u00002\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005\u001a&\u0010\u0013\u001a\u00020\u00002\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0018\u0010\u0014\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u0005\u001a \u0010\u0015\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0016\u0010\u0016\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0006\u0010\u0017\u001a\u00020\u0000\u001a\u0006\u0010\u0018\u001a\u00020\u0000\u001a\u0018\u0010\u001b\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0006\u0010\u001c\u001a\u00020\u0000\u001a\u0006\u0010\u001d\u001a\u00020\u0000\u001a\u0006\u0010\u001e\u001a\u00020\u0000\u001a\u0006\u0010\u001f\u001a\u00020\u0000\u001a\u0006\u0010 \u001a\u00020\u0000\u001a\u0006\u0010!\u001a\u00020\u0000\u001a\u0006\u0010\"\u001a\u00020\u0000\u001a\u0006\u0010#\u001a\u00020\u0000\u001a\u0006\u0010$\u001a\u00020\u0000\u001a\u0006\u0010%\u001a\u00020\u0000\u001a\u0018\u0010&\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0012\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010'\u001a\u00020\bH\u0002\u001a\u001c\u0010*\u001a\u0004\u0018\u00010(2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010'\u001a\u00020\bH\u0002\u001a\"\u0010+\u001a\u0004\u0018\u00010(2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f2\u0006\u0010'\u001a\u00020\bH\u0002\u001a\u0012\u0010,\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002\u001a\u0018\u0010-\u001a\u00020\b2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fH\u0002\u001a\u0010\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020.H\u0002\u001a\u001a\u00103\u001a\u00020(2\u0006\u0010'\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u000101H\u0002\u001a\u0010\u00104\u001a\u00020(2\u0006\u0010'\u001a\u00020\bH\u0002\u001a\u0010\u00106\u001a\u0002052\u0006\u00102\u001a\u000201H\u0002\u001a\u0012\u00109\u001a\u00020\b2\b\u00108\u001a\u0004\u0018\u000107H\u0002\"\u0016\u0010:\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010;\"\u0016\u0010<\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010;\"\u0016\u0010=\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010;\"\u0016\u0010>\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010;\"\u0016\u0010?\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010;\"\u0016\u0010@\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010;\"\u0016\u0010A\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010;\"\u0016\u0010B\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010;\"\u0016\u0010C\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010;\"\u0016\u0010D\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010;\"\u0016\u0010E\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bE\u0010;\"\u0016\u0010F\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bF\u0010;\"\u0016\u0010G\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bG\u0010;\"\u0016\u0010H\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bH\u0010;\"\u0016\u0010I\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bI\u0010;\"\u0016\u0010J\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bJ\u0010;\"\u0016\u0010K\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bK\u0010;\"\u0016\u0010L\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bL\u0010;\"\u0016\u0010M\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bM\u0010;\"\u0016\u0010N\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bN\u0010;\"\u0016\u0010O\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bO\u0010;\"\u0016\u0010P\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bP\u0010;\"\u0016\u0010Q\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bQ\u0010;\"\u0016\u0010R\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bR\u0010;\"\u0016\u0010S\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bS\u0010;\"\u0016\u0010T\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bT\u0010;¨\u0006U"}, d2 = {"", "firmwareDownloadV", "firmwareDownloadStopC", "firmwareDownloadContinueC", "firmwareTransferC", "", HMFwOnlineAnalyticsKt.COST, "firmwareUpgradeSuccess", "", "reason", "firmwareUpgradeFail", "firmwareTransferSuccess", "Lcom/xiaomi/hm/health/device/firmware/HMFwOnlineUpgradeInfo;", "info", "firmwareTransferSuccessBatch", "", "infos", "firmwareUpgradeSuccessContinue", "firmwareTransferFailBatch", "firmwareUpgradeFailContinue", "firmwareUpgradeSuccessBatch", "firmwareUpgradeFailBatch", "firmwareTransferFail", "firmwareDownloadWatchLogV", "firmwareDownloadWatchLogC", "Lcom/xiaomi/hm/health/device/fw_upgrade/FwDownloadAnalyticsData;", "data", "firmwareDownloadSuccess", "firmwareUpgradeFailCancelC", "firmwareUpgradeFailRetryC", "firmwareUpgradeRetryC", "firmwareUpgradeRetryV", "firmwareUpgradeRetryCancelC", "systemupdateSetC", "systemupdateOpennightlyupdateC", "systemupdateClosenightlyupdateC", "systemupdatetipsOpennightlyupdateC", "systemupdatetipsClosenightlyupdateC", "firmwareDownloadFail", "event", "Lcom/huami/mifit/analytics/builder/CountEventBuilder;", GoogleApiAvailabilityLight.a, "e", "f", "i", z.j, "", "bool", "c", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "h", "g", "", "b", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareType;", "type", "a", "TAG", "Ljava/lang/String;", "SOURCE", "PREFV", "CURFV", "IS_CHOICE", "BATTERY", Intents.WifiConnect.TYPE, "PREFLAG", "CURFLAG", "REASON", "COST", "PACKAGE", "TYPE_SILENT", "TYPE_PACK", "TYPE_CONTINUE", "FIRMWARE", "RESOURCE", "BASE_RESOURCE", "EXT_RESOURCE", "FONT", "GPS", MeasureStateValue.OTHER, "TIMEOUT", "BLUETOOTH_CLOSED", "BLE_DISCONNECT", "KEY_SESSION_ID", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class HMFwOnlineAnalyticsKt {

    @NotNull
    public static final String BASE_RESOURCE = "bres";

    @NotNull
    public static final String BATTERY = "battery";

    @NotNull
    public static final String BLE_DISCONNECT = "bledisconnect";

    @NotNull
    public static final String BLUETOOTH_CLOSED = "bluclosed";

    @NotNull
    public static final String COST = "cost";

    @NotNull
    public static final String CURFLAG = "curflag";

    @NotNull
    public static final String CURFV = "curfv";

    @NotNull
    public static final String EXT_RESOURCE = "eres";

    @NotNull
    public static final String FIRMWARE = "fw";

    @NotNull
    public static final String FONT = "ft";

    @NotNull
    public static final String GPS = "gps";

    @NotNull
    public static final String IS_CHOICE = "ischoice";

    @NotNull
    public static final String KEY_SESSION_ID = "sessionId";

    @NotNull
    public static final String OTHER = "other";

    @NotNull
    public static final String PACKAGE = "pack";

    @NotNull
    public static final String PREFLAG = "preflag";

    @NotNull
    public static final String PREFV = "prefv";

    @NotNull
    public static final String REASON = "reason";

    @NotNull
    public static final String RESOURCE = "res";

    @NotNull
    public static final String SOURCE = "source";

    @NotNull
    public static final String TAG = "HMFwOnlineAnalytics";

    @NotNull
    public static final String TIMEOUT = "timeout";

    @NotNull
    public static final String TYPE = "tp";

    @NotNull
    public static final String TYPE_CONTINUE = "continue";

    @NotNull
    public static final String TYPE_PACK = "pack";

    @NotNull
    public static final String TYPE_SILENT = "silent";

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMFirmwareType.values().length];
            iArr[HMFirmwareType.FIRMWARE.ordinal()] = 1;
            iArr[HMFirmwareType.FONT.ordinal()] = 2;
            iArr[HMFirmwareType.RESOURCE.ordinal()] = 3;
            iArr[HMFirmwareType.RESOURCE_BASE.ordinal()] = 4;
            iArr[HMFirmwareType.FIRMWARE_GPS.ordinal()] = 5;
            iArr[HMFirmwareType.RESOURCE_COMPRESS.ordinal()] = 6;
            iArr[HMFirmwareType.RESOURCE_EXTERNAL.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final String a(HMFirmwareType hMFirmwareType) {
        if (hMFirmwareType == null) {
            return "other";
        }
        switch (WhenMappings.$EnumSwitchMapping$0[hMFirmwareType.ordinal()]) {
            case 1:
                return "fw";
            case 2:
                return "ft";
            case 3:
            case 6:
                return "res";
            case 4:
                return BASE_RESOURCE;
            case 5:
                return "gps";
            case 7:
                return EXT_RESOURCE;
            default:
                return "other";
        }
    }

    private static final int b(HMDeviceSource hMDeviceSource) {
        HMBaseDevice device;
        BatteryInfo batteryInfo;
        if ((hMDeviceSource.getType() != HMDeviceType.MILI && hMDeviceSource != HMDeviceSource.SHOES_MARS) || (device = ManagerFunctionsKt.getDeviceManagerApi().getDevice(hMDeviceSource.getType())) == null || (batteryInfo = device.getBatteryInfo()) == null) {
            return -1;
        }
        return batteryInfo.getLevel();
    }

    private static final String c(boolean z) {
        return z ? "1" : "0";
    }

    private static final CountEventBuilder d(String str) {
        HMFwOnlineUpgradeInfo fwUpgradeInfo = ((FirmwareOnlineManagerApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(FirmwareOnlineManagerApi.class), null, null)).getFwUpgradeInfo();
        if (fwUpgradeInfo == null) {
            return null;
        }
        return h(str, fwUpgradeInfo.getDeviceSource()).addExtra("source", String.valueOf(fwUpgradeInfo.getDeviceSource().getValue())).addExtra("prefv", fwUpgradeInfo.getLocalVersion()).addExtra("curfv", fwUpgradeInfo.getFwVersionName()).addExtra(IS_CHOICE, c(fwUpgradeInfo.isForceUpgrade())).addExtra("tp", a(fwUpgradeInfo.getFirmwareType())).addExtra(PREFLAG, String.valueOf(fwUpgradeInfo.getLocalFlag())).addExtra(CURFLAG, String.valueOf(fwUpgradeInfo.getFlag())).addExtra(BATTERY, String.valueOf(b(fwUpgradeInfo.getDeviceSource())));
    }

    private static final CountEventBuilder e(HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo, String str) {
        if (hMFwOnlineUpgradeInfo == null) {
            return null;
        }
        return h(str, hMFwOnlineUpgradeInfo.getDeviceSource()).addExtra("source", String.valueOf(hMFwOnlineUpgradeInfo.getDeviceSource().getValue())).addExtra(IS_CHOICE, c(!hMFwOnlineUpgradeInfo.isSilent())).addExtra("tp", hMFwOnlineUpgradeInfo.isSilent() ? "silent" : "pack").addExtra(BATTERY, String.valueOf(b(hMFwOnlineUpgradeInfo.getDeviceSource()))).addExtra("pack", i(hMFwOnlineUpgradeInfo));
    }

    private static final CountEventBuilder f(List<? extends HMFwOnlineUpgradeInfo> list, String str) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo = list.get(0);
        return h(str, hMFwOnlineUpgradeInfo.getDeviceSource()).addExtra("source", String.valueOf(hMFwOnlineUpgradeInfo.getDeviceSource().getValue())).addExtra(IS_CHOICE, c(true ^ hMFwOnlineUpgradeInfo.isSilent())).addExtra("tp", TYPE_CONTINUE).addExtra(BATTERY, String.valueOf(b(hMFwOnlineUpgradeInfo.getDeviceSource()))).addExtra("pack", j(list));
    }

    public static final void firmwareDownloadContinueC() {
        CountEventBuilder countEventBuilderD = d(StatEvent.FIRMWARE_DOWNLOAD_CONTINUE_C);
        if (countEventBuilderD == null) {
            return;
        }
        Analytics.recordEvent(countEventBuilderD);
    }

    public static final void firmwareDownloadFail(@Nullable FwDownloadAnalyticsData fwDownloadAnalyticsData, long j) {
        if (fwDownloadAnalyticsData == null) {
            return;
        }
        Analytics.recordEvent(h(StatEvent.FIRMWARE_DOWNLOAD_FAIL, fwDownloadAnalyticsData.getSource()).addExtra("source", String.valueOf(fwDownloadAnalyticsData.getSource().getValue())).addExtra("prefv", fwDownloadAnalyticsData.getLocalVersion()).addExtra("curfv", fwDownloadAnalyticsData.getCloudVersion()).addExtra(IS_CHOICE, c(fwDownloadAnalyticsData.isForceUpgrade())).addExtra("tp", fwDownloadAnalyticsData.getFirmwareType()).addExtra(PREFLAG, String.valueOf(fwDownloadAnalyticsData.getLocalFlag())).addExtra(CURFLAG, String.valueOf(fwDownloadAnalyticsData.getCloudFlag())).addExtra(BATTERY, String.valueOf(b(fwDownloadAnalyticsData.getSource()))).addExtra("reason", fwDownloadAnalyticsData.getReason()).addExtra(COST, String.valueOf(j)));
    }

    public static final void firmwareDownloadStopC() {
        CountEventBuilder countEventBuilderD = d(StatEvent.FIRMWARE_DOWNLOAD_STOP_C);
        if (countEventBuilderD == null) {
            return;
        }
        Analytics.recordEvent(countEventBuilderD);
    }

    public static final void firmwareDownloadSuccess(@Nullable FwDownloadAnalyticsData fwDownloadAnalyticsData, long j) {
        if (fwDownloadAnalyticsData == null) {
            return;
        }
        Analytics.recordEvent(h(StatEvent.FIRMWARE_DOWNLOAD_SUCCESS, fwDownloadAnalyticsData.getSource()).addExtra("source", String.valueOf(fwDownloadAnalyticsData.getSource().getValue())).addExtra("prefv", fwDownloadAnalyticsData.getLocalVersion()).addExtra("curfv", fwDownloadAnalyticsData.getCloudVersion()).addExtra(IS_CHOICE, c(fwDownloadAnalyticsData.isForceUpgrade())).addExtra("tp", fwDownloadAnalyticsData.getFirmwareType()).addExtra(PREFLAG, String.valueOf(fwDownloadAnalyticsData.getLocalFlag())).addExtra(CURFLAG, String.valueOf(fwDownloadAnalyticsData.getCloudFlag())).addExtra(BATTERY, String.valueOf(b(fwDownloadAnalyticsData.getSource()))).addExtra(COST, String.valueOf(j)));
    }

    public static final void firmwareDownloadV() {
        CountEventBuilder countEventBuilderD = d(StatEvent.FIRMWARE_DOWNLOAD_V);
        if (countEventBuilderD == null) {
            return;
        }
        Analytics.recordEvent(countEventBuilderD);
    }

    public static final void firmwareDownloadWatchLogC() {
        Analytics.recordEvent(g(StatEvent.FIRMWARE_DOWNLOAD_WATCHLOG_C));
    }

    public static final void firmwareDownloadWatchLogV() {
        Analytics.recordEvent(g(StatEvent.FIRMWARE_DOWNLOAD_WATCHLOG_V));
    }

    public static final void firmwareTransferC() {
        CountEventBuilder countEventBuilderD = d(StatEvent.FIRMWARE_TRANSFER_V);
        if (countEventBuilderD == null) {
            return;
        }
        Analytics.recordEvent(countEventBuilderD);
    }

    public static final void firmwareTransferFail(@NotNull String str, long j) {
        CountEventBuilder countEventBuilderD = d(StatEvent.FIRMWARE_TRANSFER_FAIL);
        if (countEventBuilderD == null) {
            return;
        }
        countEventBuilderD.addExtra("reason", str);
        countEventBuilderD.addExtra(COST, String.valueOf(j));
        Analytics.recordEvent(countEventBuilderD);
    }

    public static final void firmwareTransferFailBatch(@NotNull HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo, @NotNull String str, long j) {
        CountEventBuilder countEventBuilderE = e(hMFwOnlineUpgradeInfo, StatEvent.FIRMWARE_TRANSFER_FAIL);
        if (countEventBuilderE == null) {
            return;
        }
        countEventBuilderE.addExtra("reason", str);
        countEventBuilderE.addExtra(COST, String.valueOf(j));
        Analytics.recordEvent(countEventBuilderE);
    }

    public static final void firmwareTransferSuccess(long j) {
        CountEventBuilder countEventBuilderD = d(StatEvent.FIRMWARE_TRANSFER_SUCCESS);
        if (countEventBuilderD == null) {
            return;
        }
        countEventBuilderD.addExtra(COST, String.valueOf(j));
        Analytics.recordEvent(countEventBuilderD);
    }

    public static final void firmwareTransferSuccessBatch(@Nullable HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo, long j) {
        CountEventBuilder countEventBuilderE = e(hMFwOnlineUpgradeInfo, StatEvent.FIRMWARE_TRANSFER_SUCCESS);
        if (countEventBuilderE == null) {
            return;
        }
        countEventBuilderE.addExtra(COST, String.valueOf(j));
        Analytics.recordEvent(countEventBuilderE);
    }

    public static final void firmwareUpgradeFail(@NotNull String str, long j) {
        CountEventBuilder countEventBuilderD = d(StatEvent.FIRMWARE_UPGRADE_FAIL);
        if (countEventBuilderD == null) {
            return;
        }
        countEventBuilderD.addExtra("reason", str);
        countEventBuilderD.addExtra(COST, String.valueOf(j));
        Analytics.recordEvent(countEventBuilderD);
    }

    public static final void firmwareUpgradeFailBatch(@Nullable HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo, @NotNull String str, long j) {
        CountEventBuilder countEventBuilderE = e(hMFwOnlineUpgradeInfo, StatEvent.FIRMWARE_UPGRADE_FAIL);
        if (countEventBuilderE == null) {
            return;
        }
        countEventBuilderE.addExtra("reason", str);
        countEventBuilderE.addExtra(COST, String.valueOf(j));
        Analytics.recordEvent(countEventBuilderE);
    }

    public static final void firmwareUpgradeFailCancelC() {
        CountEventBuilder countEventBuilderD = d(StatEvent.FIRMWARE_UPGRADE_FAIL_CANCEL_C);
        if (countEventBuilderD == null) {
            return;
        }
        Analytics.recordEvent(countEventBuilderD);
    }

    public static final void firmwareUpgradeFailContinue(@Nullable List<? extends HMFwOnlineUpgradeInfo> list, @NotNull String str, long j) {
        CountEventBuilder countEventBuilderF = f(list, StatEvent.FIRMWARE_UPGRADE_FAIL);
        if (countEventBuilderF == null) {
            return;
        }
        countEventBuilderF.addExtra("reason", str);
        countEventBuilderF.addExtra(COST, String.valueOf(j));
        Analytics.recordEvent(countEventBuilderF);
    }

    public static final void firmwareUpgradeFailRetryC() {
        CountEventBuilder countEventBuilderD = d(StatEvent.FIRMWARE_UPGRADE_FAIL_RETRY_C);
        if (countEventBuilderD == null) {
            return;
        }
        Analytics.recordEvent(countEventBuilderD);
    }

    public static final void firmwareUpgradeRetryC() {
        CountEventBuilder countEventBuilderD = d(StatEvent.FIRMWARE_UPGRADE_RETRY_C);
        if (countEventBuilderD == null) {
            return;
        }
        Analytics.recordEvent(countEventBuilderD);
    }

    public static final void firmwareUpgradeRetryCancelC() {
        CountEventBuilder countEventBuilderD = d(StatEvent.FIRMWARE_UPGRADE_RETRY_CANCEL_C);
        if (countEventBuilderD == null) {
            return;
        }
        Analytics.recordEvent(countEventBuilderD);
    }

    public static final void firmwareUpgradeRetryV() {
        CountEventBuilder countEventBuilderD = d(StatEvent.FIRMWARE_UPGRADE_RETRY_V);
        if (countEventBuilderD == null) {
            return;
        }
        Analytics.recordEvent(countEventBuilderD);
    }

    public static final void firmwareUpgradeSuccess(long j) {
        CountEventBuilder countEventBuilderD = d(StatEvent.FIRMWARE_UPGRADE_SUCCESS);
        if (countEventBuilderD == null) {
            return;
        }
        countEventBuilderD.addExtra(COST, String.valueOf(j));
        Analytics.recordEvent(countEventBuilderD);
    }

    public static final void firmwareUpgradeSuccessBatch(@Nullable HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo, long j) {
        CountEventBuilder countEventBuilderE = e(hMFwOnlineUpgradeInfo, StatEvent.FIRMWARE_UPGRADE_SUCCESS);
        if (countEventBuilderE == null) {
            return;
        }
        countEventBuilderE.addExtra(COST, String.valueOf(j));
        Analytics.recordEvent(countEventBuilderE);
    }

    public static final void firmwareUpgradeSuccessContinue(@Nullable List<? extends HMFwOnlineUpgradeInfo> list, long j) {
        CountEventBuilder countEventBuilderF = f(list, StatEvent.FIRMWARE_UPGRADE_SUCCESS);
        if (countEventBuilderF == null) {
            return;
        }
        countEventBuilderF.addExtra(COST, String.valueOf(j));
        Analytics.recordEvent(countEventBuilderF);
    }

    private static final CountEventBuilder g(String str) {
        return new CountEventBuilder(str).setRealTimeRecord(true);
    }

    private static final CountEventBuilder h(String str, HMDeviceSource hMDeviceSource) {
        CountEventBuilder countEventBuilderG = g(str);
        String currentSessionId = HMDeviceManager.getInstance().getCurrentSessionId(hMDeviceSource);
        if (currentSessionId != null) {
            countEventBuilderG.addExtra("sessionId", currentSessionId);
        }
        return countEventBuilderG;
    }

    private static final String i(HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo) {
        if (hMFwOnlineUpgradeInfo == null) {
            return "";
        }
        List<HMFwOnlineUpgradeInfo.FwNode> fwNodes = hMFwOnlineUpgradeInfo.getFwNodes();
        if (fwNodes == null || fwNodes.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        for (Object obj : fwNodes) {
            if (((HMFwOnlineUpgradeInfo.FwNode) obj).fwType != (HMFirmwareType.FIRMWARE_CHANGE_LOG.getValue() & 255)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(a(HMFirmwareType.fromValue(((HMFwOnlineUpgradeInfo.FwNode) it2.next()).fwType)));
        }
        Iterator it3 = CollectionsKt___CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt$getPackForBatch$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Character.valueOf(((String) t).charAt(0)), Character.valueOf(((String) t2).charAt(0)));
            }
        }).iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        }
        return sb.substring(0, sb.length() - 1);
    }

    private static final String j(List<? extends HMFwOnlineUpgradeInfo> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(a(((HMFwOnlineUpgradeInfo) it2.next()).getFirmwareType()));
        }
        Iterator it3 = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt$getPackForContinue$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Character.valueOf(((String) t).charAt(0)), Character.valueOf(((String) t2).charAt(0)));
            }
        }).iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static final void systemupdateClosenightlyupdateC() {
        CountEventBuilder countEventBuilderD = d(StatEvent.EVENT_SYSTEMUPDATE_CLOSENIGHTLYUPDATE_C);
        if (countEventBuilderD == null) {
            return;
        }
        Analytics.recordEvent(countEventBuilderD);
    }

    public static final void systemupdateOpennightlyupdateC() {
        CountEventBuilder countEventBuilderD = d(StatEvent.EVENT_SYSTEMUPDATE_OPENNIGHTLYUPDATE_C);
        if (countEventBuilderD == null) {
            return;
        }
        Analytics.recordEvent(countEventBuilderD);
    }

    public static final void systemupdateSetC() {
        CountEventBuilder countEventBuilderD = d(StatEvent.EVENT_SYSTEMUPDATE_SET_C);
        if (countEventBuilderD == null) {
            return;
        }
        Analytics.recordEvent(countEventBuilderD);
    }

    public static final void systemupdatetipsClosenightlyupdateC() {
        CountEventBuilder countEventBuilderD = d(StatEvent.EVENT_SYSTEMUPDATETIPS_CLOSENIGHTLYUPDATE_C);
        if (countEventBuilderD == null) {
            return;
        }
        Analytics.recordEvent(countEventBuilderD);
    }

    public static final void systemupdatetipsOpennightlyupdateC() {
        CountEventBuilder countEventBuilderD = d(StatEvent.EVENT_SYSTEMUPDATETIPS_OPENNIGHTLYUPDATE_C);
        if (countEventBuilderD == null) {
            return;
        }
        Analytics.recordEvent(countEventBuilderD);
    }
}
