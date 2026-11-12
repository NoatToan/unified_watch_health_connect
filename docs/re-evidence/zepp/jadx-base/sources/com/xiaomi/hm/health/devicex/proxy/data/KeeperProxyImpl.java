package com.xiaomi.hm.health.devicex.proxy.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.devicex.injection.BuildConfigApi;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.single.DevicePreLaunchRepository;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.healthdata.utils.headset.HeadsetSyncTimeKeeper;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.keeper.SystemUpgradePersistentKt;
import java.util.Calendar;
import java.util.Date;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\by\u0010zJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\u001eH\u0016J\b\u0010\"\u001a\u00020\u0002H\u0016J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010$\u001a\u00020\u0002H\u0016J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010'\u001a\u00020\u0002H\u0016J\b\u0010(\u001a\u00020\u0002H\u0016J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\b\u0010+\u001a\u00020\u0002H\u0016J\b\u0010,\u001a\u00020\nH\u0016J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\nH\u0016J \u00101\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010.\u001a\u00020\n2\u0006\u00100\u001a\u00020/H\u0016J\u001a\u00102\u001a\u0004\u0018\u00010/2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010.\u001a\u00020\nH\u0016J\u0010\u00106\u001a\u0002052\u0006\u00104\u001a\u000203H\u0016J\u0018\u00108\u001a\u00020\u00042\u0006\u00104\u001a\u0002032\u0006\u00107\u001a\u000205H\u0016J\b\u0010:\u001a\u000209H\u0016J\u0010\u0010<\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020\u0010H\u0016J\u0018\u0010>\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\u0002H\u0016J\b\u0010?\u001a\u00020\u0004H\u0016J\b\u0010@\u001a\u00020\u0002H\u0016J\b\u0010A\u001a\u00020\u0002H\u0016J\b\u0010B\u001a\u00020\u0002H\u0016J\u0010\u0010D\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u0002H\u0016J\u0010\u0010E\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u0002H\u0016J\u001a\u0010H\u001a\u00020\u00022\b\u0010G\u001a\u0004\u0018\u00010F2\u0006\u00104\u001a\u000203H\u0016J\u001a\u0010I\u001a\u00020\u00042\b\u0010G\u001a\u0004\u0018\u00010F2\u0006\u00104\u001a\u000203H\u0016J\u0018\u0010L\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u00102\u0006\u0010K\u001a\u00020\u0002H\u0016J\u0010\u0010N\u001a\u00020\u00022\u0006\u0010M\u001a\u00020\u0010H\u0016J\b\u0010O\u001a\u00020\u0010H\u0016J\b\u0010P\u001a\u00020\u0004H\u0016J\u0010\u0010R\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\u0002H\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010S\u001a\u00020\u0002H\u0016J\u0010\u0010U\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u0002H\u0016J\b\u0010V\u001a\u00020\u0002H\u0016J\u0018\u0010Y\u001a\u00020\u00022\u0006\u0010W\u001a\u00020\n2\u0006\u0010X\u001a\u00020\u0002H\u0016J\u0018\u0010Z\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010[\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u001eH\u0016J\u0010\u0010\\\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u001eH\u0016J\u0010\u0010]\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u001eH\u0016J\b\u0010^\u001a\u00020\u0002H\u0016J\u0018\u0010`\u001a\u00020\u001e2\u0006\u0010W\u001a\u00020\n2\u0006\u0010_\u001a\u00020\u001eH\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\u001c\u0010c\u001a\u0004\u0018\u00010b2\u0006\u0010a\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010d\u001a\u00020\u0014H\u0016J\u0010\u0010f\u001a\u00020\u00042\u0006\u0010e\u001a\u00020\u0002H\u0016J\b\u0010g\u001a\u00020\nH\u0016J\u0010\u0010i\u001a\u00020\u00042\u0006\u0010h\u001a\u00020\nH\u0016J\b\u0010j\u001a\u00020\u0004H\u0016J\b\u0010k\u001a\u00020\u0004H\u0016J\u0010\u0010l\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010m\u001a\u00020\u0002H\u0016J\b\u0010n\u001a\u00020\u0004H\u0016J\b\u0010o\u001a\u00020\u001eH\u0016J\u0010\u0010q\u001a\u00020\u00042\u0006\u0010p\u001a\u00020\u0002H\u0016J\b\u0010r\u001a\u00020\u0004H\u0016J\b\u0010s\u001a\u00020\u0010H\u0016R\u001c\u0010x\u001a\b\u0012\u0004\u0012\u00020u0t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010w¨\u0006{"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/data/KeeperProxyImpl;", "Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "", "needMaintain", "", "setMaintain", "showMaintainRedDot", "setMaintainRedDotVisible", "needWriteMaintain", "setWriteMaintain", "", "deviceId", "getFwUpgradeRedDotHideVersion", "version", "saveFwUpgradeRedDotHideVersion", "value", "", "getFwUpgradeTime", "time", "saveFwUpgradeTime", "Ljava/util/Calendar;", "getLastFwUpgradeDate", "keepFwUpgradeDate", "isShow", "setShowEarbudDeleteGuide", "need", "setNeedSetAlarm2Device", "setNeedSyncAlarm2Cloud", "needSyncAlarm2Cloud", "needSetAlarm2Device", "", "getEarbudRestTime", "getEarbudTomatoTime", "getEarbudTomatoRestTime", "isShowEarbudRestDialog", "saveIsShowEarbudRestDialog", "isShowEarbudTomatoDialog", "saveIsShowEarbudTomatoDialog", "setShowEarbudAuditionDialog", "isShowEarbudAuditionDialog", "isShowEarbudDownloadTip", "setShowEarbudDeleteTip", "setShowEarbudAlarmDialog", "isShowEarbudAlarmDialog", "getUploadDeviceIds", "setUploadDeviceIds", "setting", "Ljava/util/Date;", "date", "saveMozartSettingUploadDate", "getMozartSettingUploadDate", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "getStatisticDay", "sportDay", "saveStatisticDay", "Landroid/content/SharedPreferences;", "getSp", "crc", "getOtaStatus", "startDirect", "saveOtaCrc", "clearFwUpgradeTime", "hasClosedNotificationByUser", "getShowWatchFaceRedDot", "getShowTempoWatchFaceRedDot", "show", "setShowWatchFaceRedDot", "setShowTempoWatchFaceRedDot", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "shouldShowRedDot", "setClickedVersion", "userId", "isShowInDeviceIntroduce", "setUserHaveBoundDeviceFirstlyShowMiotPermissionInDeviceIntroduceActivity", "id", "isUserHaveBoundDeviceFirstlyShowMiotPermissionInDeviceIntroduceActivity", "getMiotTokenStartTimeStamp", "clearBindBaseStep", "has", "setHasShowSensorhubTips", "maintainRedDotVisibility", "showHKAlipayTips", "setShowHKAlipayTips", "getShowHKAlipayTips", "key", "defaultValue", "getBoolean", "setBoolean", "saveEarbudRestTime", "saveEarbudTomatoTime", "saveEarbudTomatoRestTime", "isShowEarbudDeleteGuide", "defValue", "getInt", "isLeft", "Lcom/xiaomi/hm/health/bt/profile/base/BatteryInfo;", "getEarbudBattery", "getHearingHealthTime", "enable", "setDisturbShowStatusEnable", "getFirmwareGpsVersion", "firmwareGpsVersion", "setFirmwareGpsVersion", "offWristLockSaveCloud", "offWristLockSaveDevice", "putFirstbeatUpdateTime", "isOffWristLockSaveDeviceOpened", "clearOffWristLockData", "getOffWristLockSaveState", "opened", "saveOffWristLockSaveDeviceOpened", "setMasterCardFlagFalse", "getFirstbeatUpdateTime", "Lkotlin/Lazy;", "Lcom/huami/devicex/injection/BuildConfigApi;", "a", "Lkotlin/Lazy;", "buildConfigApiLazy", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class KeeperProxyImpl implements KeeperProxyApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy<BuildConfigApi> buildConfigApiLazy = KoinJavaComponent.inject$default(BuildConfigApi.class, null, null, 6, null);

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void clearBindBaseStep() {
        HMKeeper.clearBindBaseStep();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void clearFwUpgradeTime() {
        HMKeeper.clearFwUpgradeTime();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void clearOffWristLockData() {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public boolean getBoolean(@NotNull String key, boolean defaultValue) {
        return DevicePreLaunchRepository.INSTANCE.getDeviceXKVStore().getBoolean(key, defaultValue);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    @Nullable
    public BatteryInfo getEarbudBattery(boolean isLeft, @Nullable String deviceId) {
        return HMKeeper.getEarbudBattery(isLeft, deviceId);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public int getEarbudRestTime() {
        return HMKeeper.getEarbudRestTime();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public int getEarbudTomatoRestTime() {
        return HMKeeper.getEarbudTomatoRestTime();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public int getEarbudTomatoTime() {
        return HMKeeper.getEarbudTomatoTime();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    @NotNull
    public String getFirmwareGpsVersion() {
        return HMKeeper.getFirmwareGpsVersion();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public long getFirstbeatUpdateTime() {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    @Nullable
    public String getFwUpgradeRedDotHideVersion(@NotNull String deviceId) {
        return HMKeeper.getFwUpgradeRedDotHideVersion(deviceId);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public long getFwUpgradeTime(@NotNull String value) {
        return HMKeeper.getFwUpgradeTime(value);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    @NotNull
    public Calendar getHearingHealthTime() {
        return HeadsetSyncTimeKeeper.INSTANCE.getHearingHealthTime();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public int getInt(@NotNull String key, int defValue) {
        return HMKeeper.getSharedPref().getInt(key, defValue);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    @Nullable
    public Calendar getLastFwUpgradeDate() {
        return HMKeeper.getLastFwUpgradeDate();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public long getMiotTokenStartTimeStamp() {
        return HMAccountKeeper.INSTANCE.getMiotTokenStartTimeStamp();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    @Nullable
    public Date getMozartSettingUploadDate(@NotNull String deviceId, @NotNull String setting) {
        return HMKeeper.getMozartSettingUploadDate(deviceId, setting);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public int getOffWristLockSaveState() {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public int getOtaStatus(long crc) {
        return HMKeeper.getOtaStatus(crc);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public boolean getShowHKAlipayTips() {
        return HMKeeper.getShowHKAlipayTips();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public boolean getShowTempoWatchFaceRedDot() {
        return HMKeeper.getShowTempoWatchFaceRedDot();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public boolean getShowWatchFaceRedDot() {
        return HMKeeper.getShowWatchFaceRedDot();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    @NotNull
    public SharedPreferences getSp() {
        return HMKeeper.getSp();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    @NotNull
    public SportDay getStatisticDay(@NotNull HMDeviceType deviceType) {
        return HMKeeper.getStatisticDay(deviceType);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    @NotNull
    public String getUploadDeviceIds() {
        return HMKeeper.getUploadDeviceIds();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public boolean hasClosedNotificationByUser() {
        return HMKeeper.hasClosedNotificationByUser();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public boolean isOffWristLockSaveDeviceOpened() {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public boolean isShowEarbudAlarmDialog() {
        return HMKeeper.isShowEarbudAlarmDialog();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public boolean isShowEarbudAuditionDialog() {
        return HMKeeper.isShowEarbudAuditionDialog();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public boolean isShowEarbudDeleteGuide() {
        return HMKeeper.isShowEarbudDeleteGuide();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public boolean isShowEarbudDownloadTip() {
        return HMKeeper.isShowEarbudDownloadTip();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public boolean isShowEarbudRestDialog() {
        return HMKeeper.isShowEarbudRestDialog();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public boolean isShowEarbudTomatoDialog() {
        return HMKeeper.isShowEarbudTomatoDialog();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public boolean isUserHaveBoundDeviceFirstlyShowMiotPermissionInDeviceIntroduceActivity(long id) {
        return HMKeeper.isUserHaveBoundDeviceFirstlyShowMiotPermissionInDeviceIntroduceActivity(id);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void keepFwUpgradeDate() {
        HMKeeper.keepFwUpgradeDate();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public boolean maintainRedDotVisibility() {
        return HMKeeper.maintainRedDotVisibility();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public boolean needMaintain() {
        return HMKeeper.needMaintain();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public boolean needSetAlarm2Device() {
        return HMKeeper.needSetAlarm2Device();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public boolean needSyncAlarm2Cloud() {
        return HMKeeper.needSyncAlarm2Cloud();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public boolean needWriteMaintain() {
        return HMKeeper.needWriteMaintain();
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void offWristLockSaveCloud() {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void offWristLockSaveDevice() {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void putFirstbeatUpdateTime(long time) {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void saveEarbudRestTime(int time) {
        HMKeeper.saveEarbudRestTime(time);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void saveEarbudTomatoRestTime(int time) {
        HMKeeper.saveEarbudTomatoRestTime(time);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void saveEarbudTomatoTime(int time) {
        HMKeeper.saveEarbudTomatoTime(time);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void saveFwUpgradeRedDotHideVersion(@NotNull String deviceId, @Nullable String version) {
        HMKeeper.saveFwUpgradeRedDotHideVersion(deviceId, version);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void saveFwUpgradeTime(@NotNull String value, long time) {
        HMKeeper.saveFwUpgradeTime(value, time);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void saveIsShowEarbudRestDialog(boolean value) {
        HMKeeper.saveIsShowEarbudRestDialog(value);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void saveIsShowEarbudTomatoDialog(boolean value) {
        HMKeeper.saveIsShowEarbudTomatoDialog(value);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void saveMozartSettingUploadDate(@NotNull String deviceId, @NotNull String setting, @NotNull Date date) {
        HMKeeper.saveMozartSettingUploadDate(deviceId, setting, date);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void saveOffWristLockSaveDeviceOpened(boolean opened) {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void saveOtaCrc(long crc, boolean startDirect) {
        HMKeeper.saveOtaCrc(crc, startDirect);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void saveStatisticDay(@NotNull HMDeviceType deviceType, @NotNull SportDay sportDay) {
        HMKeeper.saveStatisticDay(deviceType, sportDay);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void setBoolean(@NotNull String key, boolean value) {
        DevicePreLaunchRepository.INSTANCE.getDeviceXKVStore().putBoolean(key, value);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void setClickedVersion(@Nullable Context context, @NotNull HMDeviceType deviceType) {
        if (context == null) {
            return;
        }
        String boundDeviceAddress = ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceAddress(deviceType);
        String fwUpgradeVer = SystemUpgradePersistentKt.getFwUpgradeVer(context, deviceType);
        if (fwUpgradeVer == null) {
            return;
        }
        HMKeeper.setValue("KEY_CLICKED_VERSION_" + boundDeviceAddress, fwUpgradeVer);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void setDisturbShowStatusEnable(boolean enable) {
        HMKeeper.setDisturbShowStatusEnable(enable);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void setFirmwareGpsVersion(@NotNull String firmwareGpsVersion) {
        HMKeeper.setFirmwareGpsVersion(firmwareGpsVersion);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void setHasShowSensorhubTips(boolean has) {
        HMKeeper.setHasShowSensorhubTips(has);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void setMaintain(boolean needMaintain) {
        HMKeeper.setMaintain(needMaintain);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void setMaintainRedDotVisible(boolean showMaintainRedDot) {
        HMKeeper.setMaintainRedDotVisible(showMaintainRedDot);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void setMasterCardFlagFalse() {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void setNeedSetAlarm2Device(boolean need) {
        HMKeeper.setNeedSetAlarm2Device(need);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void setNeedSyncAlarm2Cloud(boolean need) {
        HMKeeper.setNeedSyncAlarm2Cloud(need);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void setShowEarbudAlarmDialog(boolean isShow) {
        HMKeeper.setShowEarbudAlarmDialog(isShow);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void setShowEarbudAuditionDialog(boolean value) {
        HMKeeper.setShowEarbudAuditionDialog(value);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void setShowEarbudDeleteGuide(boolean isShow) {
        HMKeeper.setShowEarbudDeleteGuide(isShow);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void setShowEarbudDeleteTip(boolean value) {
        HMKeeper.setShowEarbudDeleteTip(value);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void setShowHKAlipayTips(boolean showHKAlipayTips) {
        HMKeeper.setShowHKAlipayTips(showHKAlipayTips);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void setShowTempoWatchFaceRedDot(boolean show) {
        HMKeeper.setShowTempoWatchFaceRedDot(show);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void setShowWatchFaceRedDot(boolean show) {
        HMKeeper.setShowWatchFaceRedDot(show);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void setUploadDeviceIds(@NotNull String value) {
        HMKeeper.setUploadDeviceIds(value);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void setUserHaveBoundDeviceFirstlyShowMiotPermissionInDeviceIntroduceActivity(long userId, boolean isShowInDeviceIntroduce) {
        HMKeeper.setUserHaveBoundDeviceFirstlyShowMiotPermissionInDeviceIntroduceActivity(userId, isShowInDeviceIntroduce);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public void setWriteMaintain(boolean needWriteMaintain) {
        HMKeeper.setWriteMaintain(needWriteMaintain);
    }

    @Override // com.huami.devicex.injection.keeper.KeeperProxyApi
    public boolean shouldShowRedDot(@Nullable Context context, @NotNull HMDeviceType deviceType) {
        String boundDeviceAddress;
        if (context == null) {
            return false;
        }
        if (((this.buildConfigApiLazy.getValue().isSupportCloudFwUpgrade() && HMFwOnlineUpgradeManager.getInstance().useOnline(deviceType)) ? HMFwOnlineUpgradeManager.getInstance().hasFwUpgrade(context, deviceType) : HMFwUpgradeManager.getInstance().hasFwUpgrade(context, deviceType)) && (boundDeviceAddress = ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceAddress(deviceType)) != null) {
            return !TextUtils.equals(SystemUpgradePersistentKt.getFwUpgradeVer(context, deviceType), SystemUpgradePersistentKt.getClickedVersion(boundDeviceAddress));
        }
        return false;
    }
}
