package com.huami.devicex.injection.keeper;

import android.content.Context;
import android.content.SharedPreferences;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0013\bf\u0018\u0000 t2\u00020\u0001:\u0001tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H&J\u0012\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH&J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\nH&J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH&J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0010H&J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&J\b\u0010\u0016\u001a\u00020\u0004H&J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002H&J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0002H&J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0002H&J\b\u0010\u001c\u001a\u00020\u0002H&J\b\u0010\u001d\u001a\u00020\u0002H&J\b\u0010\u001f\u001a\u00020\u001eH&J\b\u0010 \u001a\u00020\u001eH&J\b\u0010!\u001a\u00020\u001eH&J\b\u0010\"\u001a\u00020\u0002H&J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H&J\b\u0010$\u001a\u00020\u0002H&J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H&J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H&J\b\u0010'\u001a\u00020\u0002H&J\b\u0010(\u001a\u00020\u0002H&J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H&J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002H&J\b\u0010+\u001a\u00020\u0002H&J\b\u0010,\u001a\u00020\nH&J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\nH&J \u00101\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010.\u001a\u00020\n2\u0006\u00100\u001a\u00020/H&J\u001a\u00102\u001a\u0004\u0018\u00010/2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010.\u001a\u00020\nH&J\u0010\u00106\u001a\u0002052\u0006\u00104\u001a\u000203H&J\u0018\u00108\u001a\u00020\u00042\u0006\u00104\u001a\u0002032\u0006\u00107\u001a\u000205H&J\b\u0010:\u001a\u000209H&J\u0010\u0010<\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020\u0010H&J\u0018\u0010>\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\u0002H&J\b\u0010?\u001a\u00020\u0004H&J\b\u0010@\u001a\u00020\u0002H&J\b\u0010A\u001a\u00020\u0002H&J\b\u0010B\u001a\u00020\u0002H&J\u0010\u0010D\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u0002H&J\u0010\u0010E\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u0002H&J\u001a\u0010H\u001a\u00020\u00022\b\u0010G\u001a\u0004\u0018\u00010F2\u0006\u00104\u001a\u000203H&J\u001a\u0010I\u001a\u00020\u00042\b\u0010G\u001a\u0004\u0018\u00010F2\u0006\u00104\u001a\u000203H&J\u0018\u0010L\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u00102\u0006\u0010K\u001a\u00020\u0002H&J\u0010\u0010N\u001a\u00020\u00022\u0006\u0010M\u001a\u00020\u0010H&J\b\u0010O\u001a\u00020\u0010H&J\b\u0010P\u001a\u00020\u0004H&J\u0010\u0010R\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\u0002H&J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010S\u001a\u00020\u0002H&J\u0010\u0010U\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u0002H&J\b\u0010V\u001a\u00020\u0002H&J\u0018\u0010Y\u001a\u00020\u00022\u0006\u0010W\u001a\u00020\n2\u0006\u0010X\u001a\u00020\u0002H&J\u0018\u0010Z\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0002H&J\u0010\u0010[\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u001eH&J\u0010\u0010\\\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u001eH&J\u0010\u0010]\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u001eH&J\b\u0010^\u001a\u00020\u0002H&J\u0018\u0010`\u001a\u00020\u001e2\u0006\u0010W\u001a\u00020\n2\u0006\u0010_\u001a\u00020\u001eH&J\b\u0010\b\u001a\u00020\u0002H&J\u001c\u0010c\u001a\u0004\u0018\u00010b2\u0006\u0010a\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J\b\u0010d\u001a\u00020\u0014H&J\u0010\u0010f\u001a\u00020\u00042\u0006\u0010e\u001a\u00020\u0002H&J\b\u0010g\u001a\u00020\nH&J\u0010\u0010i\u001a\u00020\u00042\u0006\u0010h\u001a\u00020\nH&J\b\u0010j\u001a\u00020\u0004H&J\b\u0010k\u001a\u00020\u0004H&J\b\u0010l\u001a\u00020\u0004H&J\u0010\u0010n\u001a\u00020\u00042\u0006\u0010m\u001a\u00020\u0002H&J\b\u0010o\u001a\u00020\u001eH&J\b\u0010p\u001a\u00020\u0004H&J\b\u0010q\u001a\u00020\u0002H&J\u0010\u0010r\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0010H&J\b\u0010s\u001a\u00020\u0010H&¨\u0006u"}, d2 = {"Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "", "", "needMaintain", "", "setMaintain", "showMaintainRedDot", "setMaintainRedDotVisible", "needWriteMaintain", "setWriteMaintain", "", "deviceId", "getFwUpgradeRedDotHideVersion", "version", "saveFwUpgradeRedDotHideVersion", "value", "", "getFwUpgradeTime", "time", "saveFwUpgradeTime", "Ljava/util/Calendar;", "getLastFwUpgradeDate", "keepFwUpgradeDate", "isShow", "setShowEarbudDeleteGuide", "need", "setNeedSetAlarm2Device", "setNeedSyncAlarm2Cloud", "needSyncAlarm2Cloud", "needSetAlarm2Device", "", "getEarbudRestTime", "getEarbudTomatoTime", "getEarbudTomatoRestTime", "isShowEarbudRestDialog", "saveIsShowEarbudRestDialog", "isShowEarbudTomatoDialog", "saveIsShowEarbudTomatoDialog", "setShowEarbudAuditionDialog", "isShowEarbudAuditionDialog", "isShowEarbudDownloadTip", "setShowEarbudDeleteTip", "setShowEarbudAlarmDialog", "isShowEarbudAlarmDialog", "getUploadDeviceIds", "setUploadDeviceIds", "setting", "Ljava/util/Date;", "date", "saveMozartSettingUploadDate", "getMozartSettingUploadDate", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "getStatisticDay", "sportDay", "saveStatisticDay", "Landroid/content/SharedPreferences;", "getSp", "crc", "getOtaStatus", "startDirect", "saveOtaCrc", "clearFwUpgradeTime", "hasClosedNotificationByUser", "getShowWatchFaceRedDot", "getShowTempoWatchFaceRedDot", "show", "setShowWatchFaceRedDot", "setShowTempoWatchFaceRedDot", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "shouldShowRedDot", "setClickedVersion", "userId", "isShowInDeviceIntroduce", "setUserHaveBoundDeviceFirstlyShowMiotPermissionInDeviceIntroduceActivity", "id", "isUserHaveBoundDeviceFirstlyShowMiotPermissionInDeviceIntroduceActivity", "getMiotTokenStartTimeStamp", "clearBindBaseStep", "has", "setHasShowSensorhubTips", "maintainRedDotVisibility", "showHKAlipayTips", "setShowHKAlipayTips", "getShowHKAlipayTips", "key", "defaultValue", "getBoolean", "setBoolean", "saveEarbudRestTime", "saveEarbudTomatoTime", "saveEarbudTomatoRestTime", "isShowEarbudDeleteGuide", "defValue", "getInt", "isLeft", "Lcom/xiaomi/hm/health/bt/profile/base/BatteryInfo;", "getEarbudBattery", "getHearingHealthTime", "enable", "setDisturbShowStatusEnable", "getFirmwareGpsVersion", "firmwareGpsVersion", "setFirmwareGpsVersion", "setMasterCardFlagFalse", "offWristLockSaveCloud", "offWristLockSaveDevice", "opened", "saveOffWristLockSaveDeviceOpened", "getOffWristLockSaveState", "clearOffWristLockData", "isOffWristLockSaveDeviceOpened", "putFirstbeatUpdateTime", "getFirstbeatUpdateTime", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface KeeperProxyApi {
    public static final int ACTION_NOT_SHOW = 2;
    public static final int ACTION_SHOW_DIALOG = 0;
    public static final int ACTION_START_DIRECT = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String TOTAL_SHOES_ANALYSIS_MILES = "TOTAL_SHOES_ANALYSIS_MILES";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/huami/devicex/injection/keeper/KeeperProxyApi$Companion;", "", "", "ACTION_SHOW_DIALOG", LogUtil.I, "ACTION_START_DIRECT", "ACTION_NOT_SHOW", "", "TOTAL_SHOES_ANALYSIS_MILES", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final int ACTION_NOT_SHOW = 2;
        public static final int ACTION_SHOW_DIALOG = 0;
        public static final int ACTION_START_DIRECT = 1;

        @NotNull
        public static final String TOTAL_SHOES_ANALYSIS_MILES = "TOTAL_SHOES_ANALYSIS_MILES";
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    void clearBindBaseStep();

    void clearFwUpgradeTime();

    void clearOffWristLockData();

    boolean getBoolean(@NotNull String key, boolean defaultValue);

    @Nullable
    BatteryInfo getEarbudBattery(boolean isLeft, @Nullable String deviceId);

    int getEarbudRestTime();

    int getEarbudTomatoRestTime();

    int getEarbudTomatoTime();

    @NotNull
    String getFirmwareGpsVersion();

    long getFirstbeatUpdateTime();

    @Nullable
    String getFwUpgradeRedDotHideVersion(@NotNull String deviceId);

    long getFwUpgradeTime(@NotNull String value);

    @NotNull
    Calendar getHearingHealthTime();

    int getInt(@NotNull String key, int defValue);

    @Nullable
    Calendar getLastFwUpgradeDate();

    long getMiotTokenStartTimeStamp();

    @Nullable
    Date getMozartSettingUploadDate(@NotNull String deviceId, @NotNull String setting);

    int getOffWristLockSaveState();

    int getOtaStatus(long crc);

    boolean getShowHKAlipayTips();

    boolean getShowTempoWatchFaceRedDot();

    boolean getShowWatchFaceRedDot();

    @NotNull
    SharedPreferences getSp();

    @NotNull
    SportDay getStatisticDay(@NotNull HMDeviceType deviceType);

    @NotNull
    String getUploadDeviceIds();

    boolean hasClosedNotificationByUser();

    boolean isOffWristLockSaveDeviceOpened();

    boolean isShowEarbudAlarmDialog();

    boolean isShowEarbudAuditionDialog();

    boolean isShowEarbudDeleteGuide();

    boolean isShowEarbudDownloadTip();

    boolean isShowEarbudRestDialog();

    boolean isShowEarbudTomatoDialog();

    boolean isUserHaveBoundDeviceFirstlyShowMiotPermissionInDeviceIntroduceActivity(long id);

    void keepFwUpgradeDate();

    boolean maintainRedDotVisibility();

    boolean needMaintain();

    boolean needSetAlarm2Device();

    boolean needSyncAlarm2Cloud();

    boolean needWriteMaintain();

    void offWristLockSaveCloud();

    void offWristLockSaveDevice();

    void putFirstbeatUpdateTime(long time);

    void saveEarbudRestTime(int time);

    void saveEarbudTomatoRestTime(int time);

    void saveEarbudTomatoTime(int time);

    void saveFwUpgradeRedDotHideVersion(@NotNull String deviceId, @Nullable String version);

    void saveFwUpgradeTime(@NotNull String value, long time);

    void saveIsShowEarbudRestDialog(boolean value);

    void saveIsShowEarbudTomatoDialog(boolean value);

    void saveMozartSettingUploadDate(@NotNull String deviceId, @NotNull String setting, @NotNull Date date);

    void saveOffWristLockSaveDeviceOpened(boolean opened);

    void saveOtaCrc(long crc, boolean startDirect);

    void saveStatisticDay(@NotNull HMDeviceType deviceType, @NotNull SportDay sportDay);

    void setBoolean(@NotNull String key, boolean value);

    void setClickedVersion(@Nullable Context context, @NotNull HMDeviceType deviceType);

    void setDisturbShowStatusEnable(boolean enable);

    void setFirmwareGpsVersion(@NotNull String firmwareGpsVersion);

    void setHasShowSensorhubTips(boolean has);

    void setMaintain(boolean needMaintain);

    void setMaintainRedDotVisible(boolean showMaintainRedDot);

    void setMasterCardFlagFalse();

    void setNeedSetAlarm2Device(boolean need);

    void setNeedSyncAlarm2Cloud(boolean need);

    void setShowEarbudAlarmDialog(boolean isShow);

    void setShowEarbudAuditionDialog(boolean value);

    void setShowEarbudDeleteGuide(boolean isShow);

    void setShowEarbudDeleteTip(boolean value);

    void setShowHKAlipayTips(boolean showHKAlipayTips);

    void setShowTempoWatchFaceRedDot(boolean show);

    void setShowWatchFaceRedDot(boolean show);

    void setUploadDeviceIds(@NotNull String value);

    void setUserHaveBoundDeviceFirstlyShowMiotPermissionInDeviceIntroduceActivity(long userId, boolean isShowInDeviceIntroduce);

    void setWriteMaintain(boolean needWriteMaintain);

    boolean shouldShowRedDot(@Nullable Context context, @NotNull HMDeviceType deviceType);
}
