package com.huawei.login.ui.login.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.common.Constant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdataaccessmodel.utils.StorageDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.EnvironmentUtils;
import health.compact.a.KeyStoreUtils;
import health.compact.a.KeyValDbManager;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class SharedPreferenceUtil {
    private static final String ACCESS_TOKEN = "access_token";
    private static final String ACCOUNT_INFO_CACHE = "account_info_cache";
    private static final String ACCOUNT_NAME = "account_name";
    private static final String ACCOUNT_TYPE = "account_type";
    private static final String ACCOUNT_TYPE_HMS = "account_type_hms";
    private static final String AUTH_CODE = "auth_code";
    private static final String BIRTH_DATE = "birth_date";
    private static final String CARD_DATA_INFO_CACHE = "card_data_info_cache";
    private static final String COUNTRY_CODE = "country_code";
    private static final String DEVICE_TYPE = "device_type";
    private static final String EMAIL = "email";
    private static final String GENDER = "gender";
    private static final String GUARDIAN_ACCOUNT = "guardianAccount";
    private static final String GUARDIAN_UID = "guardianUid";
    private static final String HEALTH_LOGIN_CHANNEL = "health_login_channel";
    private static final String IS_LOGINED = "is_logined";
    private static final String IS_NEED_MIGRATE = "is_need_migrate";
    private static final String LITE_ACCESS_TOKEN = "lite_access_token";
    private static final String LITE_ACCESS_TOKEN_EXPIRE_TIME = "accessTokenExpireTime";
    private static final String LITE_REFRESH_TOKEN = "lite_refresh_token";
    private static final String LITE_REFRESH_TOKEN_EXPIRE_TIME = "refreshTokenExpireTime";
    private static final Object LOCK_OBJECT = new Object();
    private static final String LOGIN_DATA = "login_data";
    private static final String LOGIN_TYPE = "login_type";
    private static final String MOBILE = "mobile";
    private static final String PLAINTEXT_ACCOUNT_NAME = "plainTextAccountName";
    private static final String SERVER_COUNTRY_TIME = "server_country_time";
    private static final String SESSION_ID = "session_id";
    private static final String SEVER_TOKEN = "server_token";
    private static final String TAG = "PLGLOGIN_ShPrefUt";
    private static final String USER_ID = "user_id";
    private static Context mContext;
    private static SharedPreferenceUtil mSharedUtil;

    private SharedPreferenceUtil() {
    }

    public static SharedPreferenceUtil getInstance(Context context) {
        SharedPreferenceUtil sharedPreferenceUtil;
        synchronized (LOCK_OBJECT) {
            if (mContext == null) {
                mContext = context.getApplicationContext();
            }
            if (mSharedUtil == null) {
                mSharedUtil = new SharedPreferenceUtil();
            }
            sharedPreferenceUtil = mSharedUtil;
        }
        return sharedPreferenceUtil;
    }

    public void setSeverToken(String str, StorageDataCallback storageDataCallback) {
        String strD;
        LoginCache.configServerToken(str);
        KeyValDbManager.d(mContext).b(SEVER_TOKEN, str, new StorageParams(14));
        if (TextUtils.isEmpty(str)) {
            strD = "";
        } else {
            strD = KeyStoreUtils.d(str);
            LogUtil.a(TAG, "setSeverToken is not null=", Boolean.valueOf(TextUtils.isEmpty(strD)));
        }
        SharedPreferenceManager.b(String.valueOf(20000), SEVER_TOKEN, strD, null, storageDataCallback);
    }

    public void setSiteID(int i, StorageDataCallback storageDataCallback) {
        SharedPreferenceManager.b(String.valueOf(20000), "site_id", String.valueOf(i), new StorageParams(1), storageDataCallback);
        LogUtil.a(TAG, "setSiteID completed");
        LogUtil.d(TAG, " site id:", Integer.valueOf(i));
    }

    public void setMigrateStatus(String str) {
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20000), IS_NEED_MIGRATE, str, new StorageParams(1));
    }

    public String getMigrateStatus() {
        return SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20000), IS_NEED_MIGRATE);
    }

    public void setHuaweiAccountLoginFlag(String str) {
        Context context = mContext;
        if (context == null) {
            LogUtil.e(TAG, "setHuaweiAccountLoginFlag: mContext is null !");
        } else {
            SharedPreferenceManager.e(context, String.valueOf(20000), "huawei_account_login_init", str, new StorageParams(1));
            LogUtil.a(TAG, "setHuaweiAccountLoginFlag:", str);
        }
    }

    public void setUserID(String str) {
        if (mContext == null) {
            LogUtil.e(TAG, "setUserID: mContext is null !");
        } else {
            ReleaseLogUtil.c(TAG, "setAccountLogin Value is :", maskValue(str));
            KeyValDbManager.d(mContext).b("user_id", str);
        }
    }

    public String getUserID() {
        Context context = mContext;
        if (context == null) {
            LogUtil.e(TAG, "getUserID: mContext is null !");
            return "";
        }
        return KeyValDbManager.d(context).c("user_id");
    }

    public String maskValue(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                sb.append(str.charAt(i));
            } else {
                sb.append('*');
            }
        }
        return sb.toString();
    }

    public void setAccountName(String str) {
        if (mContext == null) {
            LogUtil.e(TAG, "setAccountName: mContext is null !");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            SharedPreferenceManager.e(mContext, LOGIN_DATA, ACCOUNT_NAME, "", null);
        } else {
            SharedPreferenceManager.e(mContext, LOGIN_DATA, ACCOUNT_NAME, KeyStoreUtils.d(str), null);
        }
        LogUtil.a(TAG, "setAccountName completed !!!");
        LogUtil.d(TAG, "accountName is : ", str);
    }

    public String getAccountName() {
        Context context = mContext;
        if (context == null) {
            LogUtil.e(TAG, "getAccountName: mContext is null !");
            return "";
        }
        String strE = SharedPreferenceManager.e(context, LOGIN_DATA, ACCOUNT_NAME);
        byte[] bArrB = KeyStoreUtils.b(strE);
        if (bArrB != null) {
            strE = new String(bArrB, StandardCharsets.UTF_8);
        }
        LogUtil.d(TAG, "setAccountName completed !!! accountName is:", strE, ";pid:", Integer.valueOf(Process.myPid()));
        return strE;
    }

    public void setPlainTextAccountName(String str) {
        LogUtil.a(TAG, "setPlainTextAccountName enter.", str);
        setSharedPreference(mContext.getSharedPreferences(LOGIN_DATA, 0), PLAINTEXT_ACCOUNT_NAME, str, true);
    }

    public String getPlainTextAccountName() {
        String sharedPreference = getSharedPreference(mContext.getSharedPreferences(LOGIN_DATA, 0), PLAINTEXT_ACCOUNT_NAME, true);
        LogUtil.a(TAG, "getPlainTextAccountName enter.", sharedPreference);
        return sharedPreference;
    }

    public void setGender(String str) {
        LogUtil.a(TAG, "setGender gender.");
        Context context = mContext;
        if (context == null) {
            LogUtil.e(TAG, "setGender: mContext is null !");
        } else {
            SharedPreferenceManager.e(context, LOGIN_DATA, "gender", str, new StorageParams(2));
        }
    }

    public String getGender() {
        Context context = mContext;
        if (context != null) {
            return SharedPreferenceManager.e(context, LOGIN_DATA, "gender");
        }
        LogUtil.e(TAG, "getGender: mContext is null !");
        return null;
    }

    public String getBirthDate() {
        Context context = mContext;
        if (context != null) {
            byte[] bArrB = KeyStoreUtils.b(SharedPreferenceManager.e(context, LOGIN_DATA, BIRTH_DATE));
            if (bArrB != null) {
                return new String(bArrB, StandardCharsets.UTF_8);
            }
            return null;
        }
        LogUtil.e(TAG, "getBirthDate: mContext is null !");
        return null;
    }

    public void setBirthDate(String str) {
        LogUtil.a(TAG, "setBirthDate birthDate.");
        Context context = mContext;
        if (context == null) {
            LogUtil.e(TAG, "setBirthDate: mContext is null !");
        } else {
            SharedPreferenceManager.e(context, LOGIN_DATA, BIRTH_DATE, KeyStoreUtils.d(str), new StorageParams(2));
        }
    }

    public void setDeviceType(String str) {
        Context context = mContext;
        if (context == null) {
            LogUtil.e(TAG, "setDeviceType: mContext is null !");
        } else {
            context.getSharedPreferences(LOGIN_DATA, 0).edit().putString("device_type", str).commit();
            LogUtil.a(TAG, "setDeviceType completed !!! deviceType is : ", str);
        }
    }

    public String getDeviceType() {
        Context context = mContext;
        if (context == null) {
            LogUtil.e(TAG, "getDeviceType: mContext is null !");
            return "";
        }
        String string = context.getSharedPreferences(LOGIN_DATA, 0).getString("device_type", null);
        LogUtil.d(TAG, "getDeviceType completed !!! deviceType is:", string, ";pid:", Integer.valueOf(Process.myPid()));
        return string;
    }

    public void setLoginType(int i) {
        BaseApplication.getContext().getSharedPreferences(LOGIN_DATA, 0).edit().putInt(LOGIN_TYPE, i).commit();
        LogUtil.a(TAG, "setLoginType completed !!!");
    }

    public int getLoginType() {
        SharedPreferences sharedPreferences = BaseApplication.getContext().getSharedPreferences(LOGIN_DATA, 0);
        LogUtil.a(TAG, "getLoginType completed !!!");
        return sharedPreferences.getInt(LOGIN_TYPE, -1);
    }

    public void setHealthLoginChannel(int i) {
        KeyValDbManager.d(mContext).c(HEALTH_LOGIN_CHANNEL, String.valueOf(i), null);
        BaseApplication.getContext().getSharedPreferences(LOGIN_DATA, 0).edit().putInt(HEALTH_LOGIN_CHANNEL, i).commit();
        LogUtil.a(TAG, "setHealthLoginChannel completed !!!");
    }

    public int getHealthLoginChannel() {
        SharedPreferences sharedPreferences = BaseApplication.getContext().getSharedPreferences(LOGIN_DATA, 0);
        LogUtil.d(TAG, "getHealthLoginChannel completed !!!");
        return sharedPreferences.getInt(HEALTH_LOGIN_CHANNEL, -1);
    }

    public void setSessionID(String str) {
        Context context = mContext;
        if (context == null) {
            LogUtil.e(TAG, "setSessionID: mContext is null !");
        } else {
            context.getSharedPreferences(LOGIN_DATA, 0).edit().putString(SESSION_ID, str).commit();
            LogUtil.a(TAG, "setSessionID completed !!!");
        }
    }

    public String getSessionID() {
        Context context = mContext;
        if (context == null) {
            LogUtil.e(TAG, "getSessionID: mContext is null !");
            return "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(LOGIN_DATA, 0);
        LogUtil.a(TAG, "getSessionID completed !!!");
        return sharedPreferences.getString(SESSION_ID, null);
    }

    public void setAccessToken(String str, StorageDataCallback storageDataCallback) {
        SharedPreferenceManager.b(String.valueOf(20000), "access_token", str, new StorageParams(1), storageDataCallback);
        LogUtil.a(TAG, "setAccessToken completed !!!");
    }

    public String getAccessToken() {
        return SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20000), "access_token");
    }

    public void setIsLogined(boolean z) {
        if (mContext == null) {
            LogUtil.e(TAG, "setIsLogined: mContext is null !");
        } else {
            SharedPreferenceManager.a(LOGIN_DATA, IS_LOGINED, z);
            LogUtil.a(TAG, "setIsLogined isLogined= ", Boolean.valueOf(z));
        }
    }

    public void retrySetIsLogined() {
        if (getIsLogined()) {
            return;
        }
        setIsLogined(true);
        LogUtil.a(TAG, "retrySetIsLogined isLogined true");
    }

    public boolean getIsLogined() {
        if (mContext == null) {
            LogUtil.e(TAG, "getIsLogined: mContext is null !");
            return false;
        }
        return SharedPreferenceManager.b(LOGIN_DATA, IS_LOGINED, false);
    }

    private static void setSharedPreference(SharedPreferences sharedPreferences, String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            sharedPreferences.edit().remove(str).commit();
            return;
        }
        if (z) {
            String strE = KeyStoreUtils.e(str2.getBytes(StandardCharsets.UTF_8));
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            sharedPreferences.edit().putString(str, strE).commit();
            return;
        }
        sharedPreferences.edit().putString(str, str2).commit();
    }

    private static String getSharedPreference(SharedPreferences sharedPreferences, String str, boolean z) {
        String string = sharedPreferences.getString(str, null);
        if (!z || TextUtils.isEmpty(string)) {
            return string;
        }
        byte[] bArrB = KeyStoreUtils.b(string);
        if (bArrB != null) {
            return new String(bArrB, StandardCharsets.UTF_8);
        }
        return null;
    }

    public void setCountryCode(String str) {
        setSharedPreference(mContext.getSharedPreferences(LOGIN_DATA, 0), "country_code", str, true);
        LoginCache.configCountryCode(str);
    }

    public String getCountryCode() {
        String countryCode = LoginCache.getCountryCode();
        if (!TextUtils.isEmpty(countryCode)) {
            return countryCode;
        }
        String sharedPreference = getSharedPreference(mContext.getSharedPreferences(LOGIN_DATA, 0), "country_code", true);
        if (TextUtils.isEmpty(LoginCache.getCountryCode())) {
            LoginCache.configCountryCode(sharedPreference);
        }
        return sharedPreference;
    }

    public void setAccountType(String str) {
        Context context = mContext;
        if (context == null) {
            LogUtil.j(TAG, "setAccountType: mContext is null !");
        } else {
            SharedPreferenceManager.e(context, String.valueOf(20000), ACCOUNT_TYPE, str, new StorageParams(1));
            LogUtil.a(TAG, "setAccountType completed :", str);
        }
    }

    public String getAccountType() {
        LogUtil.d(TAG, "Enter getAccountType");
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20000), ACCOUNT_TYPE);
        LogUtil.a(TAG, "getAcType OK! ", strE);
        return strE;
    }

    public int saveAccountInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            return SharedPreferenceManager.b(mContext, String.valueOf(20000), ACCOUNT_INFO_CACHE);
        }
        return SharedPreferenceManager.e(mContext, String.valueOf(20000), ACCOUNT_INFO_CACHE, str, new StorageParams(1));
    }

    public String restoreAccountInfo() {
        return SharedPreferenceManager.e(mContext, String.valueOf(20000), ACCOUNT_INFO_CACHE);
    }

    public void writeHealthData(String str, String str2) {
        setSharedPreference(mContext.getSharedPreferences(CARD_DATA_INFO_CACHE, 0), str, str2, true);
    }

    public String readHealthData(String str) {
        return getSharedPreference(mContext.getSharedPreferences(CARD_DATA_INFO_CACHE, 0), str, true);
    }

    public void deleteAllHealthData() {
        Set<String> setA = SharedPreferenceManager.a(mContext, CARD_DATA_INFO_CACHE);
        if (!setA.isEmpty()) {
            Iterator<String> it = setA.iterator();
            while (it.hasNext()) {
                writeHealthData(it.next(), null);
            }
        }
        writeHealthData("version", EnvironmentUtils.a());
    }

    public void loadAllHealthData() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a(TAG, "loadAllHealthData, newVersion=", EnvironmentUtils.a(), ", version=", readHealthData("version"), ", times=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public void setAuthCode(String str) {
        Context context = mContext;
        if (context == null) {
            LogUtil.j(TAG, "setAuthCode: mContext is null !");
        } else {
            SharedPreferenceManager.e(context, String.valueOf(20000), AUTH_CODE, str, new StorageParams(1));
        }
    }

    public String getAuthCode() {
        LogUtil.d(TAG, "Enter getAuthCode");
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20000), AUTH_CODE);
        LogUtil.a(TAG, "getAuthCode completed !!!");
        return strE;
    }

    public void setLiteAccessToken(String str) {
        Context context = mContext;
        if (context == null) {
            LogUtil.e(TAG, "setLiteAccessToken: mContext is null !");
        } else {
            SharedPreferenceManager.e(context, String.valueOf(20000), LITE_ACCESS_TOKEN, str, new StorageParams(1));
        }
    }

    public void setAtExpireTime(String str) {
        Context context = mContext;
        if (context == null) {
            LogUtil.e(TAG, "setAtExpireTime: mContext is null !");
        } else {
            SharedPreferenceManager.e(context, String.valueOf(20000), LITE_ACCESS_TOKEN_EXPIRE_TIME, str, new StorageParams(1));
            LogUtil.a(TAG, "setATatExpireTime completed !!! at is : ", str);
        }
    }

    public String getAtExpireTime() {
        LogUtil.d(TAG, "Enter getATatExpireTime");
        return SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20000), LITE_ACCESS_TOKEN_EXPIRE_TIME);
    }

    public void setRefreshTicket(String str) {
        Context context = mContext;
        if (context == null) {
            LogUtil.e(TAG, "setRefreshTicket: mContext is null !");
        } else {
            SharedPreferenceManager.e(context, String.valueOf(20000), LITE_REFRESH_TOKEN, str, new StorageParams(1));
        }
    }

    public String getRefreshTicket() {
        LogUtil.d(TAG, "Enter getRT");
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20000), LITE_REFRESH_TOKEN);
        return TextUtils.isEmpty(strE) ? ThirdLoginDataStorageUtil.getRefreshTokenFromDb() : strE;
    }

    public void setRtExpireTime(String str) {
        Context context = mContext;
        if (context == null) {
            LogUtil.e(TAG, "setRtExpireTime: mContext is null !");
            return;
        }
        SharedPreferenceManager.e(context, String.valueOf(20000), LITE_REFRESH_TOKEN_EXPIRE_TIME, String.valueOf(str), new StorageParams(1));
        LogUtil.a(TAG, "setRTExpireTime completed !!! rtExpireTime is : ", str);
    }

    public String getRtExpireTime() {
        LogUtil.d(TAG, "Enter getRTExpireTime");
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20000), LITE_REFRESH_TOKEN_EXPIRE_TIME);
        LogUtil.a(TAG, "getRTExpireTime completed !!!");
        return strE;
    }

    public String getGuardianAccount() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20000), GUARDIAN_ACCOUNT);
        if (!TextUtils.isEmpty(strE)) {
            return strE;
        }
        LogUtil.j(TAG, "getGuardianAccount from sp is null!");
        return "";
    }

    public void setGuardianAccount(String str) {
        Context context = mContext;
        if (context == null) {
            LogUtil.j(TAG, "setGuardianAccount: mContext is null !");
        } else {
            SharedPreferenceManager.e(context, String.valueOf(20000), GUARDIAN_ACCOUNT, str, new StorageParams(1));
            LogUtil.a(TAG, "setGuardianAccount completed.");
        }
    }

    public String getGuardianUid() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20000), GUARDIAN_UID);
        if (!TextUtils.isEmpty(strE)) {
            return strE;
        }
        LogUtil.j(TAG, "getGuardianUid from sp is null!");
        return "";
    }

    public void setGuardianUid(Long l) {
        Context context = mContext;
        if (context == null) {
            LogUtil.j(TAG, "setGuardianUid: mContext is null !");
            return;
        }
        SharedPreferenceManager.e(context, String.valueOf(20000), GUARDIAN_UID, String.valueOf(l), new StorageParams(1));
        LogUtil.a(TAG, "setGuardianUid completed.");
    }

    public static boolean isSameAsLastLoginSiteId() {
        LogUtil.a(TAG, "enter isSameAsLastLoginCountryCode");
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
        boolean zIsSameCountryCode = isSameCountryCode(accountInfo);
        if (!zIsSameCountryCode) {
            updateLastCountryCode(accountInfo);
        }
        LogUtil.a(TAG, "isSameAsLastLoginCountryCode: ", Boolean.valueOf(zIsSameCountryCode));
        return zIsSameCountryCode;
    }

    public static void updateLastCountryCode(String str) {
        LogUtil.a(TAG, "enter updateLastLoginCountryCode");
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20000), "hw_health_last_login_site_id", str, null);
    }

    public static boolean isSameCountryCode(String str) {
        Context context = BaseApplication.getContext();
        String strE = SharedPreferenceManager.e(context, Integer.toString(20000), "hw_health_last_login_site_id");
        if (TextUtils.isEmpty(strE)) {
            strE = SharedPreferenceManager.e(context, Integer.toString(10000), "agr_first_sign_country");
        }
        ReleaseLogUtil.c(TAG, "isSameCountryCode lastCountryCode:", strE, " newCountryCode:", str);
        return TextUtils.isEmpty(strE) || String.valueOf(str).equals(strE);
    }

    public void setUpdateState() {
        LogUtil.a(TAG, "enter setUpdateState");
        SharedPreferenceManager.a(LOGIN_DATA, Constant.HAS_UPDATE_FROM_ST_TO_AT, true);
    }

    public boolean getUpdateState() {
        return SharedPreferenceManager.b(LOGIN_DATA, Constant.HAS_UPDATE_FROM_ST_TO_AT, false);
    }

    public void setServerCountryTime(long j) {
        LogUtil.a(TAG, "enter setServerCountryTime：", Long.valueOf(j));
        SharedPreferenceManager.c(Integer.toString(20000), SERVER_COUNTRY_TIME, j);
    }

    public long getServerCountryTime() {
        return SharedPreferenceManager.d(Integer.toString(20000), SERVER_COUNTRY_TIME, 0L);
    }

    public void setMobile(String str) {
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20000), "mobile", str, new StorageParams(1));
    }

    public String getMobile() {
        return SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20000), "mobile");
    }

    public void setEmail(String str) {
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20000), "email", str, new StorageParams(1));
    }

    public String getEmail() {
        return SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20000), "email");
    }

    public void setAccountTypeHms(String str) {
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20000), ACCOUNT_TYPE_HMS, str, new StorageParams(1));
    }

    public String getAccountTypeHms() {
        return SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20000), ACCOUNT_TYPE_HMS);
    }
}
