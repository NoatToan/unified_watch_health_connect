package com.xiaomi.hm.health.keeper;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.devicex.single.DevicePreLaunchRepository;
import com.huami.devicex.single.DeviceXKVStore;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.util.AlexaUtils;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bodyfat.utils.BFKeeper;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.device.fw_upgrade.NetFwUpgradeManager;
import com.xiaomi.hm.health.device.model.BindBaseStep;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.lab.utils.LabKeeper;
import com.xiaomi.hm.health.traininglib.util.TrainingKeeper;
import com.xiaomi.hm.health.utils.ScreenUnlockEventRecorder;
import com.xiaomi.hm.health.utils.Utils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class HMKeeper implements DeviceXKVStore {
    private static final String A = "earbud_tomato_rest_time";
    public static final int ACTION_NOT_SHOW = 2;
    public static final int ACTION_SHOW_DIALOG = 0;
    public static final int ACTION_START_DIRECT = 1;
    private static final String B = "earbud_rest_dialog";
    private static final String C = "earbud_tomato_dialog";
    private static final String D = "earbud_show_delete_guide";
    private static final String E = "earbud_show_download_tip";
    private static final String F = "earbud_show_alarm_dialog";
    private static final String G = "earbud_show_autition_dialog";
    private static final String H = "mozart_%s_%s";
    private static final String I = "KEY_NEED_MAINTAIN";
    private static final String J = "KEY_NEED_WRITE_MAINTAIN";
    private static final String K = "KEY_SHOW_MAINTAIN_RED_DOT";
    public static final String KEY_STATUS_SORT_INFO = "KEY_STATUS_SORT_INFO";
    private static SharedPreferences a = null;
    private static final String b = "HeartRateSynced";
    private static final String c = "ManualDataSynced";
    private static final String d = "CLOSE_NOTIFICATION_BY_USER";
    private static final String e = "CLEAN_ALL_COOKIES";
    private static final String f = "KEY_IS_FIRST_SYNC_WATCH_DATA";
    private static final String g = "hasShowSensorhubTips";
    private static final String h = "agps_update_time";
    private static final String i = "exer_stat_data";
    private static final String j = "exer_stat_sub_sport";
    private static final String k = "exer_stat_training";
    private static final String l = "need_req_stat_data";
    private static final String m = "step_compare_rate";
    private static final String n = "sleep_compare_rate";
    private static final String o = "training_keeper";
    private static final String p = "choose_exer_type";
    private static final String q = "device_config";
    private static final String r = "hot_update_curr_version";
    private static final String s = "cold_update_curr_version";
    private static final String t = "disturb_show_status";
    private static final String u = "last_loc_flush_to_gnss";
    private static final String v = "support_injection_loc";
    private static final String w = "earbud_left_battery_";
    private static final String x = "earbud_right_battery";
    private static final String y = "earbud_rest_time";
    private static final String z = "earbud_tomato_time";

    public static void bindBeats() {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(HMKeeperConstant.BEATS_BOUND, true);
        editorEdit.apply();
    }

    public static void clear() {
        a.edit().clear().apply();
    }

    public static void clearBindBaseStep() {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.remove(HMKeeperConstant.BIND_BASE_STEP);
        editorEdit.remove(HMKeeperConstant.BIND_TIMESTAMP);
        editorEdit.remove(HMKeeperConstant.BIND_USER_ID);
        editorEdit.apply();
    }

    public static void clearFwUpgradeDate() {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(NetFwUpgradeManager.LAST_INVOKE_DATA, "");
        editorEdit.apply();
    }

    public static void clearFwUpgradeTime() {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        for (String str : a.getAll().keySet()) {
            if (!TextUtils.isEmpty(str) && str.startsWith(HMKeeperConstant.UPGRADE_FW_TIME_SOURCE)) {
                editorEdit.putLong(str, 0L);
            }
        }
        editorEdit.apply();
    }

    public static void clearWatchMissData() {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.remove(HMKeeperConstant.H);
        editorEdit.remove(HMKeeperConstant.I);
        editorEdit.apply();
    }

    @NonNull
    private static SharedPreferences.Editor d() {
        i();
        return a.edit();
    }

    private static String e(@NotNull HMDeviceType type) {
        if (type == HMDeviceType.MILI) {
            return HMKeeperConstant.x;
        }
        return "KEY_STATISTIC_DAY_" + type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f() {
        return "get battery info fail";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g() {
        return "error key is null";
    }

    public static int getActiveHistory() {
        return a.getInt("active_history_state", 0);
    }

    public static String getAdLoaded(String key) {
        i();
        return a.getString(key, "");
    }

    public static long getAgpsUpdateTime() {
        return a.getLong(h, -1L);
    }

    public static Set<String> getAlertIds() {
        return a.getStringSet("alert_ids", null);
    }

    public static Map<String, ?> getAll() {
        i();
        return a.getAll();
    }

    @Deprecated
    public static boolean getAlreadyBindPhone() {
        i();
        return a.getBoolean("KEY_ALREADY_BIND_PHONE", false);
    }

    @Deprecated
    public static boolean getAppRestart() {
        return a.getBoolean("isRestart", false);
    }

    public static long getAutoAgpsCheckTime() {
        i();
        return a.getLong(HMKeeperConstant.KEY_AGPS_CHECK_TIME, -1L);
    }

    public static int getBeforeRecentReachGoals() {
        return a.getInt(HMKeeperConstant.m, 0);
    }

    public static String getBeforeRecentReachGoalsEndDate() {
        return a.getString(HMKeeperConstant.o, "");
    }

    public static String getBeforeRecentReachGoalsStartDate() {
        return a.getString(HMKeeperConstant.n, "");
    }

    public static BindBaseStep getBindBaseStep() {
        String string;
        int i2 = a.getInt(HMKeeperConstant.BIND_BASE_STEP, 0);
        long j2 = a.getLong(HMKeeperConstant.BIND_TIMESTAMP, -1L);
        try {
            string = a.getString(HMKeeperConstant.BIND_USER_ID, null);
        } catch (Exception unused) {
            string = "" + a.getLong(HMKeeperConstant.BIND_USER_ID, -1L);
        }
        return new BindBaseStep(i2, j2, string);
    }

    public static String getCalendar() {
        i();
        return a.getString(HMKeeperConstant.KEY_CALENDAR, "");
    }

    @Deprecated
    public static String getChaohuSecondaryScreen() {
        i();
        return a.getString(HMKeeperConstant.KEY_CHAOHU_SECONDARY_SCREEN, "");
    }

    @Deprecated
    public static long getCheckUserBirthdayTime() {
        i();
        return a.getLong("KEY_CHECK_USER_BIRTHDAY_TIME_STAMP", 0L);
    }

    public static int getChooseExerciseType() {
        return a.getInt(p, 0);
    }

    public static int getCommonCurrVersion() {
        i();
        return a.getInt(s, 100000);
    }

    public static int getCompareSleepRate() {
        return a.getInt(n, 0);
    }

    public static int getCompareStepRate() {
        return a.getInt(m, 0);
    }

    public static String getContact() {
        return a.getString(HMKeeperConstant.y, "");
    }

    public static String getDeviceConfigString() {
        return a.getString(q, null);
    }

    public static int getDiscoveryCurrVersion() {
        i();
        return a.getInt(r, 100000);
    }

    public static String getDownloadSuccessStr() {
        i();
        return a.getString(HMKeeperConstant.G, null);
    }

    @Nullable
    public static BatteryInfo getEarbudBattery(boolean isLeft, String deviceId) {
        i();
        StringBuilder sb = new StringBuilder();
        sb.append(isLeft ? w : x);
        sb.append(deviceId);
        try {
            JSONObject jSONObject = new JSONObject(a.getString(sb.toString(), ""));
            BatteryInfo batteryInfo = new BatteryInfo();
            batteryInfo.setLevel(jSONObject.optInt(FirebaseAnalytics.Param.LEVEL));
            batteryInfo.setLastChargeLevel(jSONObject.optInt("lastChargeLevel"));
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jSONObject.optLong("lastCharge") * 1000);
            batteryInfo.setLastCharge(calendar);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(jSONObject.optLong("lastChargeFull") * 1000);
            batteryInfo.setLastChargeFull(calendar2);
            return batteryInfo;
        } catch (Exception e2) {
            HMLog.error("EarbudBatteryInfo", "", e2, new Function0() { // from class: b03
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMKeeper.f();
                }
            });
            return null;
        }
    }

    public static int getEarbudRestTime() {
        i();
        return a.getInt(y, 30);
    }

    public static int getEarbudTomatoRestTime() {
        i();
        return a.getInt(A, 5);
    }

    public static int getEarbudTomatoTime() {
        i();
        return a.getInt(z, 25);
    }

    public static String getExerStatData() {
        return a.getString(i, "");
    }

    public static String getExerSubSportList() {
        return a.getString(j, "");
    }

    public static String getExerTrainStatData() {
        return a.getString(k, "");
    }

    public static String getFirmwareGpsVersion() {
        i();
        return a.getString(HMKeeperConstant.g0, "");
    }

    @Nullable
    public static String getFwUpgradeRedDotHideVersion(@NonNull String deviceId) {
        String str = "KEY_FW_UPGRADE_HIDE_RED_DOT_VER_" + deviceId;
        i();
        return a.getString(str, null);
    }

    public static String getFwUpgradeShowRedDotVer(String suffix) {
        i();
        return a.getString(HMKeeperConstant.z + suffix, "");
    }

    public static long getFwUpgradeTime(String value) {
        i();
        return a.getLong(HMKeeperConstant.UPGRADE_FW_TIME_SOURCE + value, 0L);
    }

    public static boolean getKeepAliveIsSetted() {
        i();
        return a.getBoolean(HMKeeperConstant.KEY_KEEP_ALIVE_IS_SETTED, false);
    }

    public static long getKeepAliveTimeEnd(int defaultValue) {
        i();
        return a.getLong(HMKeeperConstant.KEY_KEEP_ALIVE_TIME_END, defaultValue);
    }

    public static long getKeepAliveTimeStart(int defaultValue) {
        i();
        return a.getLong(HMKeeperConstant.KEY_KEEP_ALIVE_TIME_START, defaultValue);
    }

    public static int getLastFwUpgradeAppVersionCode() {
        i();
        return a.getInt(NetFwUpgradeManager.LAST_INVOKE_APP_VERSION, -1);
    }

    public static Calendar getLastFwUpgradeDate() {
        i();
        String string = a.getString(NetFwUpgradeManager.LAST_INVOKE_DATA, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return (Calendar) Utils.getGson().fromJson(string, Calendar.class);
    }

    @Deprecated
    public static String getLastLoginProvider(String def) {
        return a.getString("last_login_provider", def);
    }

    @Deprecated
    public static String getLastLoginUid() {
        i();
        return a.getString("last_login_uid", null);
    }

    public static int getLastPid(int defaultValue) {
        i();
        return a.getInt(HMKeeperConstant.KEY_KEEP_ALIVE_PID, defaultValue);
    }

    @Deprecated
    public static String getLastSelectArea() {
        i();
        return HMWebKeeper.getLastSelectArea();
    }

    @Deprecated
    public static String getLastSelectAreaCode() {
        i();
        return HMWebKeeper.getLastSelectAreaCode();
    }

    public static int getLastShownDailySleepCount() {
        return a.getInt(HMKeeperConstant.v, 0);
    }

    public static long getLastShownDailySleepTime() {
        return a.getLong(HMKeeperConstant.u, 0L);
    }

    public static long getLastShownDailySportTime() {
        return a.getLong(HMKeeperConstant.t, 0L);
    }

    public static int getLastTimeUnit() {
        i();
        return a.getInt(HMKeeperConstant.f0, -1);
    }

    public static boolean getLocReady() {
        i();
        return a.getBoolean(HMKeeperConstant.Y, false);
    }

    public static int getMaxReachGoals() {
        return a.getInt(HMKeeperConstant.k, 0);
    }

    public static int getMaxSteps() {
        return a.getInt(HMKeeperConstant.l, -1);
    }

    @Nullable
    public static Date getMozartSettingUploadDate(@NonNull String deviceId, @NonNull String setting) {
        long j2 = a.getLong(String.format(H, deviceId, setting), -1L);
        if (j2 == -1) {
            return null;
        }
        return new Date(j2);
    }

    @Deprecated
    public static long getMutexTime() {
        return a.getLong("mutexTime", System.currentTimeMillis());
    }

    public static String getOfflineModelInjectResult() {
        return a.getString(HMKeeperConstant.L, null);
    }

    public static int getOtaStatus(long crc) {
        String strValueOf = String.valueOf(crc);
        Set<String> stringSet = a.getStringSet(HMKeeperConstant.e0, null);
        if (stringSet == null) {
            return 0;
        }
        if (stringSet.contains(strValueOf + ",true")) {
            return 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strValueOf);
        sb.append(",");
        sb.append(false);
        return stringSet.contains(sb.toString()) ? 2 : 0;
    }

    public static boolean getPaiGuideRollout() {
        i();
        return a.getBoolean("key_pai_guide_rollout", true);
    }

    public static String getPaiPopShowDailyDate() {
        i();
        return a.getString("pai_daily_date", "");
    }

    public static String getPaiPopShowTotalDate() {
        i();
        return a.getString("pai_total_date", "");
    }

    public static int getPaiPopShowTotalValue() {
        i();
        return a.getInt("pai_total_value", 0);
    }

    public static int getRecentReachGoals() {
        return a.getInt(HMKeeperConstant.g, 0);
    }

    public static String getRecentReachGoalsStart() {
        return a.getString(HMKeeperConstant.h, "");
    }

    public static String getRecentReachGoalsStop() {
        return a.getString(HMKeeperConstant.i, "");
    }

    @Deprecated
    public static int getRingType() {
        i();
        return a.getInt(HMKeeperConstant.KEY_RING_TYPE, 0);
    }

    public static int getServerVersion() {
        i();
        return a.getInt(HMKeeperConstant.E, 0);
    }

    public static SharedPreferences getSharedPref() {
        i();
        return a;
    }

    public static boolean getShowAvoidSpiteBindFlag() {
        i();
        return TimeUtils.isToday(a.getLong(HMKeeperConstant.SPITE_BIND_FLAG, -1L));
    }

    public static boolean getShowHKAlipayTips() {
        i();
        return a.getBoolean(HMKeeperConstant.W, true);
    }

    public static boolean getShowTempoWatchFaceRedDot() {
        i();
        return a.getBoolean(HMKeeperConstant.T, false);
    }

    public static boolean getShowWatchFaceRedDot() {
        i();
        return a.getBoolean(HMKeeperConstant.S, false);
    }

    public static SharedPreferences getSp() {
        i();
        return a;
    }

    public static SportDay getStatisticDay(@NotNull HMDeviceType type) {
        return SportDay.fromString(a.getString(e(type), "2016-01-01"));
    }

    @Deprecated
    public static String getStatusSortInfo() {
        return a.getString(KEY_STATUS_SORT_INFO, "");
    }

    @Deprecated
    public static String getTempoSecondaryScreen() {
        i();
        return a.getString(HMKeeperConstant.KEY_TEMPO_SECONDARY_SCREEN, "");
    }

    @Deprecated
    public static String getTestAccountUrl() {
        return HMWebKeeper.getUrl("test_account_url");
    }

    @Deprecated
    public static List<String> getTestAccountUrlList() {
        List<String> urlList = HMWebKeeper.getUrlList("test_account_url_list");
        return urlList == null ? new ArrayList() : urlList;
    }

    @Deprecated
    public static String getTestUrl() {
        return HMWebKeeper.getUrl("test_url");
    }

    @Deprecated
    public static List<String> getTestUrlList() {
        List<String> urlList = HMWebKeeper.getUrlList("test_url_list");
        return urlList == null ? new ArrayList() : urlList;
    }

    public static String getUploadDeviceIds() {
        i();
        return a.getString(HMKeeperConstant.KEY_UPLOAD_DEVICE_ID, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(boolean z2) {
        return "setUpgradeDialogShowing = " + z2;
    }

    public static boolean hasClosedNotificationByUser() {
        return a.getBoolean(d, false);
    }

    public static boolean hasShowAvoidSpiteBindDialog() {
        i();
        return TimeUtils.isToday(a.getLong(HMKeeperConstant.HAS_SHOW_AVOID_SPITE_BIND_DIALOG, -1L));
    }

    public static boolean hasShowSensorhubTips() {
        return a.getBoolean(g, false);
    }

    public static boolean hasShowSurveyHobbies() {
        i();
        return a.getBoolean(HMKeeperConstant.d0, false);
    }

    private static void i() {
        if (a == null) {
            init(BraceletApp.getContext());
        }
    }

    public static SharedPreferences init(Context c2) {
        SharedPreferences sharedPreferences = c2.getSharedPreferences(HMKeeperConstant.KEEP_XML, 0);
        a = sharedPreferences;
        HMWebKeeper.init(sharedPreferences);
        TrainingKeeper.init(c2.getSharedPreferences(o, 0));
        LabKeeper.init(a);
        BFKeeper.init(a);
        AlexaUtils.init(a);
        ScreenUnlockEventRecorder.init(a);
        DevicePreLaunchRepository.INSTANCE.setDeviceXKVStore(new HMKeeper());
        return a;
    }

    public static boolean isBeatsBound() {
        i();
        return a.getBoolean(HMKeeperConstant.BEATS_BOUND, false);
    }

    public static boolean isDisturbShowd() {
        i();
        return a.getBoolean(t, false);
    }

    public static boolean isFirstSyncWatchDataAfterBand() {
        i();
        return a.getBoolean(f, false);
    }

    @Deprecated
    public static boolean isMutexLogin() {
        return a.getBoolean("isMutexLogin", false);
    }

    public static boolean isNeedCleanAllCookies() {
        i();
        return a.getBoolean(e, true);
    }

    public static boolean isNeedReqStatData() {
        return a.getBoolean(l, false);
    }

    public static boolean isRestoreUnlockScreen() {
        i();
        return a.getBoolean(HMKeeperConstant.B, false);
    }

    public static boolean isShowEarbudAlarmDialog() {
        i();
        return a.getBoolean(F, true);
    }

    public static boolean isShowEarbudAuditionDialog() {
        i();
        return a.getBoolean(G, true);
    }

    public static boolean isShowEarbudDeleteGuide() {
        i();
        return a.getBoolean(D, true);
    }

    public static boolean isShowEarbudDownloadTip() {
        i();
        return a.getBoolean(E, true);
    }

    public static boolean isShowEarbudRestDialog() {
        i();
        return a.getBoolean(B, true);
    }

    public static boolean isShowEarbudTomatoDialog() {
        i();
        return a.getBoolean(C, true);
    }

    public static boolean isSupportInjectionLoc() {
        i();
        return a.getBoolean(v, true);
    }

    public static boolean isSyncedHeartRateData() {
        return a.getBoolean(b, false);
    }

    public static boolean isSyncedManualData() {
        return a.getBoolean(c, false);
    }

    public static boolean isUserHaveBoundDeviceFirstlyShowMiotPermissionInDeviceIntroduceActivity(long userId) {
        i();
        return a.getBoolean(HMKeeperConstant.SPEECH_KEY_FIRSTLY_SHOW_MIOT_PERSSION_PROMPT + userId, false);
    }

    public static void keepDownloadApkId(long id) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putLong("DOWNLOAD_ID_REF", id);
        editorEdit.apply();
    }

    public static void keepFwUpgradeAppVersionCode(int code) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt(NetFwUpgradeManager.LAST_INVOKE_APP_VERSION, code);
        editorEdit.apply();
    }

    public static void keepFwUpgradeDate() {
        i();
        Calendar calendar = Calendar.getInstance();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(NetFwUpgradeManager.LAST_INVOKE_DATA, Utils.getGson().toJson(calendar));
        editorEdit.apply();
    }

    public static void keepScaleSyncedUserInfosFromServer(boolean synced) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean("ScaleSyncedUserInfosFromServer", synced);
        editorEdit.apply();
    }

    public static void keepScaleSyncedWeightInfosFromServer(boolean synced) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean("ScaleSyncedWeightInfosFromServer", synced);
        editorEdit.apply();
    }

    public static void keepServerVersion(int version) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt(HMKeeperConstant.E, version);
        editorEdit.apply();
    }

    public static void keepUUID(String uuid) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(HMKeeperConstant.f, uuid);
        editorEdit.apply();
    }

    public static String lastLocSendToDevice() {
        i();
        return a.getString(u, null);
    }

    public static boolean maintainRedDotVisibility() {
        i();
        return a.getBoolean(K, true);
    }

    public static boolean needMaintain() {
        i();
        return a.getBoolean(I, false);
    }

    public static boolean needSetAlarm2Device() {
        i();
        return a.getBoolean(HMKeeperConstant.NEED_SET_ALARM_2_DEVICE, false);
    }

    public static boolean needSyncAlarm2Cloud() {
        i();
        return a.getBoolean(HMKeeperConstant.NEED_SYNC_ALARM_2_CLOUD, false);
    }

    public static boolean needWriteMaintain() {
        i();
        return a.getBoolean(J, false);
    }

    public static long readDownloadApkId() {
        i();
        return a.getLong("DOWNLOAD_ID_REF", -1L);
    }

    public static String readUUID() {
        return a.getString(HMKeeperConstant.f, null);
    }

    public static boolean recentReachGoalsIsFirst() {
        return a.getBoolean(HMKeeperConstant.j, false);
    }

    public static void saveAlertIds(Set<String> ids) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putStringSet("alert_ids", ids);
        editorEdit.apply();
    }

    @Deprecated
    public static void saveAlreadyBindPhone(boolean bind) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean("KEY_ALREADY_BIND_PHONE", bind);
        editorEdit.apply();
    }

    @Deprecated
    public static void saveAppRestart(boolean isRestart) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean("isRestart", isRestart);
        editorEdit.apply();
    }

    public static void saveBindBaseStep(BindBaseStep bindBaseStep) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt(HMKeeperConstant.BIND_BASE_STEP, bindBaseStep.getBaseStep());
        editorEdit.putLong(HMKeeperConstant.BIND_TIMESTAMP, bindBaseStep.getBindTimestamp());
        editorEdit.putString(HMKeeperConstant.BIND_USER_ID, bindBaseStep.getUid());
        editorEdit.apply();
    }

    public static void saveContact(String str) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(HMKeeperConstant.y, str);
        editorEdit.apply();
    }

    public static void saveDeviceConfigString(String configStr) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(q, configStr);
        editorEdit.apply();
    }

    public static void saveEarbudBattery(boolean isLeft, String deviceId, String batteryInfo) {
        i();
        StringBuilder sb = new StringBuilder();
        sb.append(isLeft ? w : x);
        sb.append(deviceId);
        String string = sb.toString();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(string, batteryInfo);
        editorEdit.apply();
    }

    public static void saveEarbudRestTime(int time) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt(y, time);
        editorEdit.apply();
    }

    public static void saveEarbudTomatoRestTime(int time) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt(A, time);
        editorEdit.apply();
    }

    public static void saveEarbudTomatoTime(int time) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt(z, time);
        editorEdit.apply();
    }

    public static void saveFwUpgradeRedDotHideVersion(@NonNull String deviceId, @Nullable String version) {
        SharedPreferences.Editor editorD = d();
        editorD.putString("KEY_FW_UPGRADE_HIDE_RED_DOT_VER_" + deviceId, version);
        editorD.apply();
    }

    public static void saveFwUpgradeShowRedDotVer(String suffix, String str) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(HMKeeperConstant.z + suffix, str);
        editorEdit.apply();
    }

    public static void saveFwUpgradeTime(String value, long time) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putLong(HMKeeperConstant.UPGRADE_FW_TIME_SOURCE + value, time);
        editorEdit.apply();
    }

    public static void saveIsShowEarbudRestDialog(boolean isShow) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(B, isShow);
        editorEdit.apply();
    }

    public static void saveIsShowEarbudTomatoDialog(boolean isShow) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(C, isShow);
        editorEdit.apply();
    }

    public static void saveLastLocSendToDevice(String loc) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(u, loc);
        editorEdit.apply();
    }

    public static void saveMozartSettingUploadDate(@NonNull String deviceId, @NonNull String setting, @NonNull Date date) {
        String str = String.format(H, deviceId, setting);
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putLong(str, date.getTime());
        editorEdit.apply();
    }

    public static void saveOfflineModelInjectResult(String prov) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(HMKeeperConstant.L, prov);
        editorEdit.apply();
    }

    public static void saveOtaCrc(long crc, boolean startDirect) {
        Set<String> stringSet = a.getStringSet(HMKeeperConstant.e0, null);
        HashSet hashSet = new HashSet();
        if (stringSet != null) {
            hashSet.addAll(stringSet);
        }
        hashSet.add(crc + "," + startDirect);
        saveOtaCrcList(hashSet);
    }

    public static void saveOtaCrcList(Set<String> crcList) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putStringSet(HMKeeperConstant.e0, crcList);
        editorEdit.apply();
    }

    public static void savePaiGuideRollout(boolean isRollout) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean("key_pai_guide_rollout", isRollout);
        editorEdit.apply();
    }

    public static void saveRecentSleepDay(String day) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(HMKeeperConstant.w, day);
        editorEdit.apply();
    }

    public static void saveSleepCompareRate(int rate) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt(n, rate);
        editorEdit.apply();
    }

    public static void saveStatisticDay(@NotNull HMDeviceType type, SportDay day) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(e(type), day.getKey());
        editorEdit.apply();
    }

    public static void saveStepCompareRate(int rate) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt(m, rate);
        editorEdit.apply();
    }

    public static void saveSupportInjectionLoc(boolean supportInjectionLoc) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(v, supportInjectionLoc);
        editorEdit.apply();
    }

    public static void saveWatchMissData(String startDay, String endDay) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(HMKeeperConstant.H, startDay);
        editorEdit.putString(HMKeeperConstant.I, endDay);
        editorEdit.apply();
    }

    public static void setActiveHistory(int status) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt("active_history_state", status);
        editorEdit.apply();
    }

    public static void setAdLoaded(String key, String id) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(key, id);
        editorEdit.apply();
    }

    public static void setAgpsUpdateTime(long time) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putLong(h, time);
        editorEdit.apply();
    }

    public static void setAutoAgpsCheckTime(long ts) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putLong(HMKeeperConstant.KEY_AGPS_CHECK_TIME, ts);
        editorEdit.apply();
    }

    public static void setBeforeRecentReachGoals(int recentReachGoals, String startDate, String endDate) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt(HMKeeperConstant.m, recentReachGoals);
        editorEdit.putString(HMKeeperConstant.n, startDate);
        editorEdit.putString(HMKeeperConstant.o, endDate);
        editorEdit.apply();
    }

    public static void setCalendar(String calendar) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(HMKeeperConstant.KEY_CALENDAR, calendar);
        editorEdit.apply();
    }

    @Deprecated
    public static void setChaohuSecondaryScreen(String config) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(HMKeeperConstant.KEY_CHAOHU_SECONDARY_SCREEN, config);
        editorEdit.apply();
    }

    @Deprecated
    public static void setCheckUserBirthdayTime(long millis) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putLong("KEY_CHECK_USER_BIRTHDAY_TIME_STAMP", millis);
        editorEdit.apply();
    }

    public static void setChooseExerciseType(int type) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt(p, type);
        editorEdit.apply();
    }

    public static void setChooseUserShowing(boolean isShow) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean("showingChooseUserDialog", isShow);
        editorEdit.apply();
    }

    public static void setCleanAllCookies(boolean clean) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(e, clean);
        editorEdit.apply();
    }

    public static void setClosedNotificationState(boolean close) {
        DevicePreLaunchRepository.INSTANCE.getDeviceXKVStore().putBoolean(d, close);
    }

    public static void setCommonCurrVersion(int version) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt(s, version);
        editorEdit.apply();
    }

    public static void setDiscoveryCurrVersion(int version) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt(r, version);
        editorEdit.apply();
    }

    public static void setDisturbShowStatusEnable(boolean enable) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(t, enable);
        editorEdit.apply();
    }

    public static void setDownloadSuccessStr(String str) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(HMKeeperConstant.G, str);
        editorEdit.apply();
    }

    public static void setEnterAppState(int flag) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt("enter_app_state", flag);
        editorEdit.apply();
    }

    public static void setExerStatData(String data) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(i, data);
        editorEdit.apply();
    }

    public static void setExerSubSportList(String data) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(j, data);
        editorEdit.apply();
    }

    public static void setExerTrainStatData(String data) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(k, data);
        editorEdit.apply();
    }

    public static void setFirmwareGpsVersion(String firmwareGpsVersion) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(HMKeeperConstant.g0, firmwareGpsVersion);
        editorEdit.apply();
    }

    public static void setHasShowSensorhubTips(boolean hasShow) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(g, hasShow);
        editorEdit.apply();
    }

    public static void setHeartRateDataSyncState(boolean value) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(b, value);
        editorEdit.apply();
    }

    public static void setIsFirstSyncWatchDataAfterBand(boolean isFirstBand) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(f, isFirstBand);
        editorEdit.apply();
    }

    @Deprecated
    public static void setIsMutexLogin(boolean isMutexLogin) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean("isMutexLogin", isMutexLogin);
        editorEdit.apply();
    }

    public static void setKeepAliveIsSetted(boolean isSetted) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(HMKeeperConstant.KEY_KEEP_ALIVE_IS_SETTED, isSetted);
        editorEdit.apply();
    }

    public static void setKeepAliveTimeEnd(long end) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putLong(HMKeeperConstant.KEY_KEEP_ALIVE_TIME_END, end);
        editorEdit.apply();
    }

    public static void setKeepAliveTimeStart(long start) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putLong(HMKeeperConstant.KEY_KEEP_ALIVE_TIME_START, start);
        editorEdit.apply();
    }

    @Deprecated
    public static void setLastLoginProvider(String provider) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString("last_login_provider", provider);
        editorEdit.apply();
    }

    @Deprecated
    public static void setLastLoginUid(String uid) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString("last_login_uid", uid);
        editorEdit.apply();
    }

    public static void setLastPid(int pid) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt(HMKeeperConstant.KEY_KEEP_ALIVE_PID, pid);
        editorEdit.apply();
    }

    @Deprecated
    public static void setLastSelectArea(String area) {
        i();
        HMWebKeeper.setLastSelectArea(area);
    }

    @Deprecated
    public static void setLastSelectAreaCode(String code) {
        i();
        HMWebKeeper.setLastSelectAreaCode(code);
    }

    public static void setLastShownDailySleepCount(int sleepCount) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt(HMKeeperConstant.v, sleepCount);
        editorEdit.apply();
    }

    public static void setLastShownDailySleepTime(long time) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putLong(HMKeeperConstant.u, time);
        editorEdit.apply();
    }

    public static void setLastShownDailySportTime(long time) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putLong(HMKeeperConstant.t, time);
        editorEdit.apply();
    }

    public static void setLastTimeUnit(int unit) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt(HMKeeperConstant.f0, unit);
        editorEdit.apply();
    }

    public static void setLocReady(boolean isReady) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(HMKeeperConstant.Y, isReady);
        editorEdit.apply();
    }

    public static void setMaintain(boolean needMaintain) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(I, needMaintain);
        editorEdit.apply();
    }

    public static void setMaintainRedDotVisible(boolean showMaintainRedDot) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(K, showMaintainRedDot);
        editorEdit.apply();
    }

    public static void setManualDataSyncState(boolean value) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(c, value);
        editorEdit.apply();
    }

    public static void setMaxReachGoals(int maxReachGoals) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt(HMKeeperConstant.k, maxReachGoals);
        editorEdit.apply();
    }

    public static void setMaxSteps(int maxSteps) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt(HMKeeperConstant.l, maxSteps);
        editorEdit.apply();
    }

    @Deprecated
    public static void setMutexTime(long mutexTime) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putLong("mutexTime", mutexTime);
        editorEdit.apply();
    }

    public static void setNeedSetAlarm2Device(boolean need) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(HMKeeperConstant.NEED_SET_ALARM_2_DEVICE, need);
        editorEdit.apply();
    }

    public static void setNeedSyncAlarm2Cloud(boolean need) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(HMKeeperConstant.NEED_SYNC_ALARM_2_CLOUD, need);
        editorEdit.apply();
    }

    public static void setPaiPopShowDailyDate(String date) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString("pai_daily_date", date);
        editorEdit.apply();
    }

    public static void setPaiPopShowTotalDate(String date) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString("pai_total_date", date);
        editorEdit.apply();
    }

    public static void setPaiPopShowTotalValue(int pai) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt("pai_total_value", pai);
        editorEdit.apply();
    }

    public static void setRecentReachGoals(int recentReachGoals, String startDate, String endDate, boolean isFirst) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt(HMKeeperConstant.g, recentReachGoals);
        editorEdit.putString(HMKeeperConstant.h, startDate);
        editorEdit.putString(HMKeeperConstant.i, endDate);
        editorEdit.putBoolean(HMKeeperConstant.j, isFirst);
        editorEdit.apply();
    }

    public static void setReqStatData(boolean isReq) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(l, isReq);
        editorEdit.apply();
    }

    public static void setRestoreUnlockScreen(boolean isSet) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(HMKeeperConstant.B, isSet);
        editorEdit.apply();
    }

    @Deprecated
    public static void setRingType(int type) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt(HMKeeperConstant.KEY_RING_TYPE, type);
        editorEdit.apply();
    }

    public static void setShowAvoidSpiteBindDialog() {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putLong(HMKeeperConstant.HAS_SHOW_AVOID_SPITE_BIND_DIALOG, System.currentTimeMillis());
        editorEdit.apply();
    }

    public static void setShowEarbudAlarmDialog(boolean isShow) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(F, isShow);
        editorEdit.apply();
    }

    public static void setShowEarbudAuditionDialog(boolean isShow) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(G, isShow);
        editorEdit.apply();
    }

    public static void setShowEarbudDeleteGuide(boolean isShow) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(D, isShow);
        editorEdit.apply();
    }

    public static void setShowEarbudDeleteTip(boolean isShow) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(E, isShow);
        editorEdit.apply();
    }

    public static void setShowHKAlipayTips(boolean showHKAlipayTips) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(HMKeeperConstant.W, showHKAlipayTips);
        editorEdit.apply();
    }

    public static void setShowMedalRedDot(boolean show) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(HMKeeperConstant.KEY_SHOW_MEDAL_RED_DOT, show);
        editorEdit.apply();
    }

    public static void setShowMsgCenterRedDot(boolean show) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(HMKeeperConstant.R, show);
        editorEdit.apply();
    }

    public static void setShowPublicPreView(int flag) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt(HMKeeperConstant.P, flag);
        editorEdit.apply();
    }

    public static void setShowSpiteBindFlag(long timeStamp) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putLong(HMKeeperConstant.SPITE_BIND_FLAG, timeStamp);
        editorEdit.apply();
    }

    public static void setShowSurveyHobbies(boolean show) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(HMKeeperConstant.d0, show);
        editorEdit.apply();
    }

    public static void setShowTempoWatchFaceRedDot(boolean show) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(HMKeeperConstant.T, show);
        editorEdit.apply();
    }

    public static void setShowWatchFaceRedDot(boolean show) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(HMKeeperConstant.S, show);
        editorEdit.apply();
    }

    public static void setShowWeeklyReportRedDot(boolean show) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(HMKeeperConstant.KEY_SHOW_WEEKLY_REPORT_RED_DOT, show);
        editorEdit.apply();
    }

    @Deprecated
    public static void setStatusSortInfo(String statusSortInfo) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(KEY_STATUS_SORT_INFO, statusSortInfo);
        editorEdit.apply();
    }

    @Deprecated
    public static void setTempoSecondaryScreen(String config) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(HMKeeperConstant.KEY_TEMPO_SECONDARY_SCREEN, config);
        editorEdit.apply();
    }

    @Deprecated
    public static void setTestAccountUrl(String url) {
        HMWebKeeper.setUrl("test_account_url", url);
    }

    @Deprecated
    public static void setTestAccountUrlList(List<String> list) {
        HMWebKeeper.setUrlList("test_account_url_list", list);
    }

    @Deprecated
    public static void setTestUrl(String url) {
        HMWebKeeper.setUrl("test_url", url);
    }

    @Deprecated
    public static void setTestUrlList(List<String> list) {
        HMWebKeeper.setUrlList("test_url_list", list);
    }

    public static void setUpgradeDialogShowing(final boolean showing) {
        i();
        HMLog.info("test", new Function0() { // from class: a03
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMKeeper.h(showing);
            }
        });
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean("upgrade_dilog_showing", showing);
        editorEdit.apply();
    }

    public static void setUploadDeviceIds(String ids) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(HMKeeperConstant.KEY_UPLOAD_DEVICE_ID, ids);
        editorEdit.apply();
    }

    public static void setUserHaveBoundDeviceFirstlyShowMiotPermissionInDeviceIntroduceActivity(long userId, boolean isShowInDeviceIntroduce) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(HMKeeperConstant.SPEECH_KEY_FIRSTLY_SHOW_MIOT_PERSSION_PROMPT + userId, isShowInDeviceIntroduce);
        editorEdit.putLong(HMKeeperConstant.SPEECH_KEY_FIRSTLY_SHOW_MIOT_PERSSION_PROMPT_USERID, userId);
        editorEdit.apply();
    }

    public static void setValue(@NonNull String key, @NonNull String value) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putString(key, value);
        editorEdit.apply();
    }

    public static void setWriteMaintain(boolean needWriteMaintain) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(J, needWriteMaintain);
        editorEdit.apply();
    }

    @Nullable
    public static String valueOf(String key) {
        i();
        return a.getString(key, null);
    }

    @Override // com.huami.devicex.single.DeviceXKVStore
    @org.jetbrains.annotations.Nullable
    public String fetchString(@org.jetbrains.annotations.Nullable String key, @org.jetbrains.annotations.Nullable String defaultValue) {
        if (key == null) {
            return defaultValue;
        }
        i();
        return a.getString(key, defaultValue);
    }

    @Override // com.huami.devicex.single.DeviceXKVStore
    public boolean getBoolean(@NotNull String key, boolean defaultValue) {
        return a.getBoolean(key, defaultValue);
    }

    @Override // com.huami.devicex.single.DeviceXKVStore
    public void putBoolean(@NotNull String key, boolean value) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(key, value);
        editorEdit.apply();
    }

    @Override // com.huami.devicex.single.DeviceXKVStore
    public void putString(@org.jetbrains.annotations.Nullable String key, @org.jetbrains.annotations.Nullable String value) {
        i();
        SharedPreferences.Editor editorEdit = a.edit();
        if (key == null) {
            HMLog.warn("DeviceXKVStore", new Function0() { // from class: c03
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMKeeper.g();
                }
            });
        } else {
            editorEdit.putString(key, value);
            editorEdit.apply();
        }
    }
}
