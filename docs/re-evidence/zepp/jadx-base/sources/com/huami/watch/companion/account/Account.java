package com.huami.watch.companion.account;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.huami.assistant.model.UpdatesManager;
import com.huami.passport.AccountManager;
import com.huami.watch.companion.cloud.api.UserSettingsAPI;
import com.huami.watch.companion.dataflow.FirstbeatData;
import com.huami.watch.companion.dataflow.HealthData;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.config.FeatureConfig;
import com.huami.watch.companion.initial.InitialState;
import com.huami.watch.companion.sport.pb.PBManager;
import com.huami.watch.companion.usersettings.UserSettingsKeys;
import com.huami.watch.companion.usersettings.UserSettingsManager;
import com.huami.watch.companion.util.NumUtil;
import com.huami.watch.dataflow.model.firstbeat.SportLoadManager;
import com.huami.watch.dataflow.model.firstbeat.VO2maxManager;
import com.huami.watch.dataflow.model.health.HRDataManager;
import com.huami.watch.dataflow.model.health.HealthDataManager;
import com.huami.watch.dataflow.model.sport.SportDetailManager;
import com.huami.watch.dataflow.model.sport.SportSummaryManager;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.Box;
import com.huami.watch.util.I18nUtil;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class Account {
    private static final String a = "Account";

    private static void a(Map<String, String> map) {
        String str = map.get("huami.watch.health.config");
        String strB = b(str, HMPersonInfo.getInstance().getMiliConfig().getGoalStepsCount());
        map.put("huami.watch.health.config", strB);
        Log.d(a, "OriginalHealthConfig:" + str + ">>>>> Update:" + strB, new Object[0]);
    }

    private static String b(String str, int i) {
        try {
            JSONObject jSONObject = !TextUtils.isEmpty(str) ? new JSONObject(str) : new JSONObject();
            jSONObject.put("step_target", i);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void clearAccountData(Context context) {
        Log.d(a, "Clear Account Data!!", new Object[0]);
        UserInfoManager.clear();
        DeviceManager.getManager(context).clear();
        UserSettingsManager.getManager(context).clearAll();
        boolean zIsContactTipDisplayed = InitialState.isContactTipDisplayed();
        boolean zIsWhiteListTipDisplayed = InitialState.isWhiteListTipDisplayed();
        boolean testHosts = Box.getTestHosts();
        String watchHost = Box.getWatchHost();
        String amazfitHost = Box.getAmazfitHost();
        String miHost = Box.getMiHost();
        String loginHistory = Box.getLoginHistory();
        String accountUserServer = Box.getAccountUserServer();
        String accountIdServer = Box.getAccountIdServer();
        Box.clearAll();
        Box.putTestHosts(testHosts);
        Box.putWatchHost(watchHost);
        Box.putAmazfitHost(amazfitHost);
        Box.putMiHost(miHost);
        Box.putLoginHistory(loginHistory);
        Box.putAccountUserServer(accountUserServer);
        Box.putAccountIdServer(accountIdServer);
        InitialState.setContactTipDisplayed(zIsContactTipDisplayed);
        InitialState.setWhiteListTipDisplayed(zIsWhiteListTipDisplayed);
        HealthDataManager.getManager().deleteAll();
        HRDataManager.getManager().deleteAll();
        HealthData.clearAllCache();
        SportSummaryManager.getManager().deleteAll();
        SportDetailManager.getManager().deleteAll();
        VO2maxManager.getManager().deleteAll();
        SportLoadManager.getManager().deleteAll();
        FirstbeatData.clearAllCache();
        UpdatesManager.getManager().deleteAll();
        FeatureConfig.get().clear();
        PBManager.get().clear();
    }

    public static String getMIID(Context context) {
        String thirdId;
        if (isLoginByMI(context)) {
            try {
                thirdId = AccountManager.getDefault(context).getUserInfo().getThirdId();
            } catch (Exception e) {
                e.printStackTrace();
                Analytics.exception(context, e);
                thirdId = null;
            }
        } else {
            thirdId = null;
        }
        if (thirdId == null) {
            thirdId = "";
        }
        Log.f().d(a, "MIID : " + thirdId, new Object[0]);
        return thirdId;
    }

    @WorkerThread
    public static String getToken(Context context) {
        return AccountManager.getDefault(context).getToken().getAccessToken();
    }

    public static String getUID(Context context) {
        return AccountManager.getDefault(context).getCurrentUid();
    }

    @NonNull
    public static String getUserCountry(Context context) {
        UserInfo userInfo = UserInfoManager.get();
        String country = userInfo != null ? userInfo.getCountry() : null;
        if (TextUtils.isEmpty(country)) {
            country = I18nUtil.getLocaleCountry(context);
        }
        if (country == null) {
            country = "";
        }
        Log.d(a, "User country is: " + country, new Object[0]);
        return country;
    }

    public static boolean isLoginByMI(Context context) {
        String provider = AccountManager.getDefault(context).getProvider();
        Log.d(a, "Login Provider : " + provider, new Object[0]);
        return "xiaomi".equalsIgnoreCase(provider);
    }

    public static boolean isLoginByWechat(Context context) {
        String provider = AccountManager.getDefault(context).getProvider();
        Log.d(a, "Login Provider : " + provider, new Object[0]);
        return "wechat".equalsIgnoreCase(provider);
    }

    public static boolean isOversea(Context context) {
        String currentRegion = AccountManager.getDefault(context).getCurrentRegion();
        boolean zEqualsIgnoreCase = true;
        if (!NumUtil.isNumInt(currentRegion)) {
            zEqualsIgnoreCase = true ^ "cn".equalsIgnoreCase(currentRegion);
        } else if (NumUtil.toInt(currentRegion) == 1) {
            zEqualsIgnoreCase = false;
        }
        Log.f().d(a, "Is Oversea : " + zEqualsIgnoreCase + ", RegionCode : " + currentRegion, new Object[0]);
        return zEqualsIgnoreCase;
    }

    public static boolean isWatchUserSettingsEmpty(Context context) {
        boolean zIsEmpty = UserSettingsManager.getManager(context).getAllWatch().isEmpty();
        Log.d(a, "Is Watch UserSettings Empty : " + zIsEmpty, new Object[0]);
        return zIsEmpty;
    }

    public static boolean syncUserSettings(Context context) {
        UserSettingsAPI.GetUserSettingsResult userSettings = UserSettingsAPI.getUserSettings(context, UserSettingsKeys.SCOPE_ALL, true);
        if (!userSettings.isSuccess) {
            return false;
        }
        a(userSettings.settings);
        boolean zAddAll = UserSettingsManager.getManager(context).addAll(userSettings.settings);
        UserSettingsManager.getManager(context).updateAllToSynced();
        return zAddAll;
    }
}
