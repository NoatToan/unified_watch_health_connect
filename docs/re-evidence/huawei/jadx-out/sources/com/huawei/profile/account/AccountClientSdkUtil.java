package com.huawei.profile.account;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hms.mlsdk.common.AgConnectInfo;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.profile.coordinator.exception.ProfileRequestException;
import com.huawei.profile.coordinator.exception.ProfileRequestExceptionType;
import com.huawei.profile.utils.logger.DsLog;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public final class AccountClientSdkUtil {
    private static final int DEFAULT_WRONG_APP_ID = -1;
    private static final String TAG = "AccountClientSdkUtil";

    private AccountClientSdkUtil() {
    }

    public static Map<String, String> generateRequestHeader(Context context, String str, String str2) throws ProfileRequestException {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new ProfileRequestException(ProfileRequestExceptionType.UNEXPECTED_NULL_POINTER, "user id or at is null");
        }
        HashMap map = new HashMap();
        map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + str);
        map.put("x-huid", str2);
        map.put("Content-Type", "application/json");
        map.put(ProfileRequestConstants.X_APPID_KEY, Integer.toString(getAppIdFromMetaData(context)));
        map.put("x-version", ProfileRequestConstants.X_VERSION_VALUE);
        map.put(ProfileRequestConstants.X_LANGUAGE_KEY, ProfileRequestConstants.X_LANGUAGE_VALUE);
        return map;
    }

    private static int getAppIdFromMetaData(Context context) {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            DsLog.et(TAG, "Failed to get packageManager.", new Object[0]);
            return -1;
        }
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            DsLog.et(TAG, "name not found: " + e.getMessage(), new Object[0]);
            applicationInfo = null;
        } catch (RuntimeException unused) {
            DsLog.et(TAG, "runtime for get app info", new Object[0]);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            DsLog.et(TAG, "Failed to get applicationInfo.", new Object[0]);
            return -1;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null) {
            DsLog.et(TAG, "Failed to get bundle.", new Object[0]);
            return -1;
        }
        Object obj = bundle.get("com.huawei.hms.client.appid");
        if (obj instanceof Integer) {
            DsLog.dt(TAG, "get app id from meta data", new Object[0]);
            return ((Integer) obj).intValue();
        }
        AGConnectServicesConfig aGConnectServicesConfigFromContext = AGConnectServicesConfig.fromContext(context);
        if (aGConnectServicesConfigFromContext == null) {
            DsLog.et(TAG, "Failed to get agConnectServicesConfig.", new Object[0]);
            return -1;
        }
        DsLog.dt(TAG, "get app id from AGConnectServiceConfig", new Object[0]);
        return aGConnectServicesConfigFromContext.getInt(AgConnectInfo.AgConnectKey.APPLICATION_ID);
    }
}
