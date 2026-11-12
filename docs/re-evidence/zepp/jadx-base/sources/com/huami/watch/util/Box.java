package com.huami.watch.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.huami.watch.companion.transport.CompanionModule;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class Box {
    private static final String b = "Box";
    private static Box c;
    private static Box d;
    private static Map<String, Box> e = new HashMap();
    private SharedPreferences a;

    private Box() {
    }

    public static void clearAll() {
        if (c != null) {
            Log.d(b, "Clear : Default", new Object[0]);
            c.clear();
        }
        for (Map.Entry<String, Box> entry : e.entrySet()) {
            Log.d(b, "Clear : " + entry.getKey(), new Object[0]);
            entry.getValue().clear();
        }
    }

    public static void clearLastSyncCenterTime() {
        putSyncCenterTime(0L);
    }

    public static void clearLastTokenSyncTime() {
        putTokenSyncTime(0L);
    }

    public static void clearUnlockOpenDialogDisplayed() {
        putUnlockOpenDialogDisplayed(true);
    }

    public static Box get() {
        return c;
    }

    public static String getAccountIdServer() {
        return c.getString("account_id_server", "");
    }

    public static String getAccountUserServer() {
        return c.getString("account_user_server", "");
    }

    public static String getAgreementVersion(String str) {
        return c.getString("page_version_" + str, "");
    }

    public static boolean getAlipayBindStatus() {
        return c.getBoolean("AlipayBindStatus");
    }

    public static String getAlipayNickName() {
        return c.getString("AlipayNickName");
    }

    public static String getAlipayUserId() {
        return c.getString("AlipayUserId");
    }

    public static String getAmazfitHost() {
        return c.getString("app_amazfit_host", "");
    }

    public static String getBindingDevice() {
        return c.getString("BindingDevice");
    }

    public static int getBindingState(int i) {
        return c.getInt("BindingState", i);
    }

    public static Box getBox(Context context, String str) {
        Box box = e.get(str);
        if (box != null) {
            return box;
        }
        Box box2 = new Box(context, str);
        e.put(str, box2);
        return box2;
    }

    public static boolean getContactTipDisplayed() {
        return c.getBoolean("ContactTipDisplayed", false);
    }

    public static boolean getDelNotiKeyWordDialogDisplayed() {
        return c.getBoolean("DelNotiKeyWordDialogDisplayed", true);
    }

    public static String getDiscoveryData() {
        return c.getString("user_discovery_ad", "");
    }

    public static String getDiscoveryPopIds() {
        return c.getString("user_discovery_pop_ids", "");
    }

    public static String getFeedbackContact(String str) {
        return c.getString(str + "_FeedbackContact");
    }

    public static long getFirstbeatUpdateTime() {
        return c.getLong("firstbeat_update_time", -1L);
    }

    public static String getGPSInfo() {
        return c.getString("gps_info", "0,0");
    }

    public static boolean getInitCloudSportSynced() {
        return c.getBoolean("InitCloudSportSynced", false);
    }

    public static boolean getInitialCloudHealthDataSynced() {
        return c.getBoolean("InitialCloudHealthDataSynced", false);
    }

    public static boolean getInitialled() {
        return c.getBoolean("Initialled");
    }

    public static String getLNTAppCode() {
        return c.getString("lnt_app_code", "");
    }

    public static String getLNTCityCode() {
        return c.getString("lnt_city_code", "");
    }

    public static int getLastCloudHealthDataSyncTime() {
        return c.getInt("CloudHealthDataSyncTime", -1);
    }

    public static long getLastDownloadId() {
        return c.getLong("last_download_id", -1L);
    }

    public static long getLastHealthDataSyncTime() {
        return c.getLong("HealthDataSyncTime", 0L);
    }

    public static long getLastHealthSignleHRSyncTime() {
        return c.getLong("HealthSingleHRSyncTime", 0L);
    }

    public static long getLastSportDataSyncTime() {
        return c.getLong("SportDataSyncTime", 0L);
    }

    public static long getLastSyncCenterTime() {
        return c.getLong("SyncCenterTime", 0L);
    }

    public static long getLastTokenSyncTime() {
        return c.getLong("TokenSyncTime", 0L);
    }

    public static long getLastUpgradeCheckTime() {
        return c.getLong("lastUpgradeCheckTime");
    }

    public static long getLastWatchHRDataTime() {
        return c.getLong("LocalHRDataTime", 0L);
    }

    public static int getLastWatchHealthDataSyncTime() {
        return c.getInt("LocalHealthDataSyncTime", -1);
    }

    public static String getLoginHistory() {
        return c.getString("login_email_history", "");
    }

    public static boolean getLogined() {
        return c.getBoolean("Logined");
    }

    public static int getMapMileStoneFlag() {
        return c.getInt("MapMileStoneType", 1);
    }

    public static int getMapType() {
        return c.getInt("MapType", 1);
    }

    public static String getMiHost() {
        return c.getString("app_mi_host", "");
    }

    public static boolean getNeedForceUpgrade() {
        return c.getBoolean("needForceUpgrade", false);
    }

    public static boolean getNeedShowNLSTip() {
        return c.getBoolean("NeedShowNLSTip", true);
    }

    public static boolean getNewUserTag() {
        return c.getBoolean("isNewUser", false);
    }

    public static Box getNoClear() {
        return d;
    }

    public static boolean getNotifySmsTipDisplayed() {
        return c.getBoolean("notify_sms_tip", false);
    }

    public static Long getPBImperialUnconfirmedTrackId() {
        return Long.valueOf(c.getLong("pb_imperial_unconfirmed_trackid", -1L));
    }

    public static Long getPBMetricUnconfirmedTrackId() {
        return Long.valueOf(c.getLong("pb_metric_unconfirmed_trackid", -1L));
    }

    public static boolean getPBTipDisplayed() {
        return c.getBoolean("displayed_pb_tip", false);
    }

    public static String getPersonalBestInfo() {
        return c.getString("personal_best_info", "");
    }

    public static String getRunningStat() {
        return c.getString("RunningStatInfo", "");
    }

    public static boolean getSetRssiNeeded() {
        return c.getBoolean("SetRssiNeeded", false);
    }

    public static long getSportSyncSessionId() {
        return c.getLong("sport_sync_first_session_id", -1L);
    }

    public static long getSportSyncTrackId() {
        return c.getLong("sport_sync_first_trackid", -1L);
    }

    public static boolean getTestHosts() {
        return c.getBoolean("TestHosts");
    }

    public static boolean getTestMode() {
        return c.getBoolean("TestMode");
    }

    public static boolean getToMedongNoAuth() {
        return c.getBoolean("to_medong_no_auth", false);
    }

    public static boolean getUnlockOpenDialogDisplayed() {
        return c.getBoolean("UnlockOpenDialogDisplayed", true);
    }

    public static long getUserAgeCheckTime() {
        return c.getLong("UserAgeCheckTime", 0L);
    }

    public static String getUserCancelRomUpdateVersion() {
        return c.getString("UserCancelRomUpdateVersion", "");
    }

    public static String getUserInfo() {
        return c.getString(CompanionModule.KEY_USER_INFO);
    }

    public static boolean getUserSavedWatchFaceSynced() {
        return c.getBoolean("UserSavedWatchFaceSyncedToWatch", false);
    }

    public static String getWatchHost() {
        return c.getString("app_watch_host", "");
    }

    public static String getWatchRandomAddress() {
        return c.getString("WatchRandomAddress", "");
    }

    public static boolean getWatchWidgetCloseDialogDisplayed() {
        return c.getBoolean("WatchWidgetCloseDialogDisplayed", true);
    }

    public static boolean getWhiteListTipDisplayed() {
        return c.getBoolean("WhiteListTipDisplayedNew", false);
    }

    public static void initDefault(Context context) {
        c = new Box(context, b);
        d = new Box(context, "NoClear");
    }

    public static boolean isAgreeDoorPrivacy() {
        return c.getBoolean("agree_door_privacy", false);
    }

    public static boolean isShowEverestHelpCard() {
        return c.getBoolean("EverestHelpCard", true);
    }

    public static boolean isShowEverestHelpDialog() {
        return c.getBoolean("EverestHelpDialog", true);
    }

    public static void putAccountIdServer(String str) {
        c.put("account_id_server", str);
    }

    public static void putAccountUserServer(String str) {
        c.put("account_user_server", str);
    }

    public static void putAgreementVersion(String str, String str2) {
        c.put("page_version_" + str, str2);
    }

    public static void putAmazfitHost(String str) {
        c.put("app_amazfit_host", str);
    }

    public static void putBindingDevice(String str) {
        c.put("BindingDevice", str);
    }

    public static void putBindingState(int i) {
        c.put("BindingState", i);
    }

    public static void putCloudHealthDataSyncTime(int i) {
        c.put("CloudHealthDataSyncTime", i);
    }

    public static void putContactTipDisplayed(boolean z) {
        c.put("ContactTipDisplayed", z);
    }

    public static void putDelNotiKeyWordDialogDisplayed(boolean z) {
        c.put("DelNotiKeyWordDialogDisplayed", z);
    }

    public static void putDiscoveryData(String str) {
        c.put("user_discovery_ad", str);
    }

    public static void putDiscoveryPopIds(String str) {
        c.put("user_discovery_pop_ids", str);
    }

    public static void putFeedbackContact(String str, String str2) {
        c.put(str + "_FeedbackContact", str2);
    }

    public static void putFirstbeatUpdateTime(long j) {
        c.put("firstbeat_update_time", j);
    }

    public static void putGPSInfo(String str) {
        c.put("gps_info", str);
    }

    public static void putHealthDataSyncTime(long j) {
        c.put("HealthDataSyncTime", j);
    }

    public static void putHealthSingleHRSyncTime(long j) {
        c.put("HealthSingleHRSyncTime", j);
    }

    public static void putInitCloudSportSynced() {
        c.put("InitCloudSportSynced", true);
    }

    public static void putInitialCloudHealthDataSynced() {
        c.put("InitialCloudHealthDataSynced", true);
    }

    public static void putInitialled(boolean z) {
        c.put("Initialled", z);
    }

    public static void putLNTAppCode(String str) {
        c.put("lnt_app_code", str);
    }

    public static void putLNTCityCode(String str) {
        c.put("lnt_city_code", str);
    }

    public static void putLastDownloadId(long j) {
        c.put("last_download_id", j);
    }

    public static void putLastUpgradeCheckTime(long j) {
        c.put("lastUpgradeCheckTime", j);
    }

    public static void putLastWatchHRTime(long j) {
        c.put("LocalHRDataTime", j);
    }

    public static void putLoginHistory(String str) {
        c.put("login_email_history", str);
    }

    public static void putLogined(boolean z) {
        c.put("Logined", z);
    }

    public static void putMapMileStoneFlag(int i) {
        c.put("MapMileStoneType", i);
    }

    public static void putMiHost(String str) {
        c.put("app_mi_host", str);
    }

    public static void putNeedForceUpgrade(boolean z) {
        c.put("needForceUpgrade", z);
    }

    public static void putNeedShowNLSTip(boolean z) {
        c.put("NeedShowNLSTip", z);
    }

    public static void putNeedVerifyMail(String str) {
        c.put("AccountNeedVerifyMail", str);
    }

    public static void putNewUserTag(boolean z) {
        c.put("isNewUser", z);
    }

    public static void putNotifySmsTipDisplay(boolean z) {
        c.put("notify_sms_tip", z);
    }

    public static void putPBImperialUnconfirmedTrackId(long j) {
        c.put("pb_imperial_unconfirmed_trackid", j);
    }

    public static void putPBMetricUnconfirmedTrackId(long j) {
        c.put("pb_metric_unconfirmed_trackid", j);
    }

    public static void putPBTipDisplayed(boolean z) {
        c.put("displayed_pb_tip", z);
    }

    public static void putPersonalBestInfo(String str) {
        c.put("personal_best_info", str);
    }

    public static void putRunningStat(String str) {
        c.put("RunningStatInfo", str);
    }

    public static void putSetRssiNeeded(boolean z) {
        c.put("SetRssiNeeded", z);
    }

    public static void putSportDataSyncTime(long j) {
        c.put("SportDataSyncTime", j);
    }

    public static void putSportSyncFirstTrackId(long j) {
        c.put("sport_sync_first_trackid", j);
    }

    public static void putSportSyncSessionId(long j) {
        c.put("sport_sync_first_session_id", j);
    }

    public static void putSyncCenterTime(long j) {
        c.put("SyncCenterTime", j);
    }

    public static void putTestHosts(boolean z) {
        c.put("TestHosts", z);
    }

    public static void putTestMode(boolean z) {
        c.put("TestMode", z);
    }

    public static void putTokenSyncTime(long j) {
        c.put("TokenSyncTime", j);
    }

    public static void putUnlockOpenDialogDisplayed(boolean z) {
        c.put("UnlockOpenDialogDisplayed", z);
    }

    public static void putUserAgeCheckTime(long j) {
        c.put("UserAgeCheckTime", j);
    }

    public static void putUserCancelRomUpdateVersion(String str) {
        c.put("UserCancelRomUpdateVersion", str);
    }

    public static void putUserInfo(String str) {
        c.put(CompanionModule.KEY_USER_INFO, str);
    }

    public static void putUserSavedWatchFaceSynced(boolean z) {
        c.put("UserSavedWatchFaceSyncedToWatch", z);
    }

    public static void putWatchHealthDataSyncTime(int i) {
        c.put("LocalHealthDataSyncTime", i);
    }

    public static void putWatchHost(String str) {
        c.put("app_watch_host", str);
    }

    public static void putWatchRandomAddress(String str) {
        c.put("WatchRandomAddress", str);
    }

    public static void putWatchWidgetCloseDialogDisplayed(boolean z) {
        c.put("WatchWidgetCloseDialogDisplayed", z);
    }

    public static void putWhiteListTipDisplayed(boolean z) {
        c.put("WhiteListTipDisplayedNew", z);
    }

    public static void removeAgreementVersion(String str) {
        c.remove("page_version_" + str);
    }

    public static void setAgreeDoorPrivacy(boolean z) {
        c.put("agree_door_privacy", z);
    }

    public static void setAlipayBindStatus(boolean z) {
        c.put("AlipayBindStatus", z);
    }

    public static void setAlipayNickName(String str) {
        c.put("AlipayNickName", str);
    }

    public static void setAlipayUserId(String str) {
        c.put("AlipayUserId", str);
    }

    public static void setMapType(int i) {
        c.put("MapType", i);
    }

    public static void setShowEverestHelpCard(boolean z) {
        c.put("EverestHelpCard", z);
    }

    public static void setShowEverestHelpDialog(boolean z) {
        c.put("EverestHelpDialog", z);
    }

    public static void setToMedongNoAuth(boolean z) {
        c.put("to_medong_no_auth", z);
    }

    public void clear() {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.clear();
        editorEdit.commit();
    }

    public boolean contains(String str) {
        return this.a.contains(str);
    }

    public boolean getBoolean(String str) {
        return this.a.getBoolean(str, false);
    }

    public int getInt(String str) {
        return this.a.getInt(str, 0);
    }

    public long getLong(String str) {
        return this.a.getLong(str, 0L);
    }

    public String getString(String str) {
        return this.a.getString(str, null);
    }

    public void put(String str, boolean z) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putBoolean(str, z);
        editorEdit.commit();
    }

    public void remove(String str) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.remove(str);
        editorEdit.commit();
    }

    private Box(Context context, String str) {
        this.a = context.getSharedPreferences(str, 0);
    }

    public boolean getBoolean(String str, boolean z) {
        return this.a.getBoolean(str, z);
    }

    public int getInt(String str, int i) {
        return this.a.getInt(str, i);
    }

    public long getLong(String str, long j) {
        return this.a.getLong(str, j);
    }

    public String getString(String str, String str2) {
        return this.a.getString(str, str2);
    }

    public void put(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putString(str, str2);
        editorEdit.commit();
    }

    public void put(String str, int i) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putInt(str, i);
        editorEdit.commit();
    }

    public void put(String str, long j) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putLong(str, j);
        editorEdit.commit();
    }
}
