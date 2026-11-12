package com.amazon.identity.auth.device.appid;

import android.content.Context;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import com.amazon.identity.auth.map.device.utils.MAPLog;

/* JADX INFO: loaded from: classes2.dex */
public final class ThirdPartyAppIdentifier extends AbstractAppIdentifier {
    private static final String LOG_TAG = "com.amazon.identity.auth.device.appid.ThirdPartyAppIdentifier";
    private static final String REDIRECT_URI_PREFIX = "amzn://";

    @Override // com.amazon.identity.auth.device.appid.AppIdentifier
    public String[] getAllowedScopes(String str, Context context) {
        String str2 = LOG_TAG;
        MAPLog.i(str2, "getAllowedScopes : packageName=" + str);
        if (str == null) {
            MAPLog.w(str2, "packageName can't be null!");
            return null;
        }
        AppInfo appInfo = getAppInfo(str, context);
        if (appInfo == null) {
            return null;
        }
        return appInfo.getAllowedScopes();
    }

    @Override // com.amazon.identity.auth.device.appid.AbstractAppIdentifier, com.amazon.identity.auth.device.appid.AppIdentifier
    public String getAppFamilyId(String str, Context context) {
        String str2 = LOG_TAG;
        MAPLog.i(str2, "getAppFamilyId : packageName=" + str);
        if (str == null) {
            MAPLog.w(str2, "packageName can't be null!");
            return null;
        }
        AppInfo appInfo = getAppInfo(str, context);
        if (appInfo == null) {
            return null;
        }
        return appInfo.getAppFamilyId();
    }

    public AppInfo getAppInfoByApiKey(String str, String str2, Context context) {
        String str3 = LOG_TAG;
        MAPLog.i(str3, "getAppInfo : packageName=" + str);
        if (str != null) {
            return APIKeyDecoder.doDecode(str, str2, false, context);
        }
        MAPLog.w(str3, "packageName can't be null!");
        return null;
    }

    @Override // com.amazon.identity.auth.device.appid.AppIdentifier
    public String[] getAppPermissions(String str, Context context) {
        String str2 = LOG_TAG;
        MAPLog.i(str2, "getAppPermissions : packageName=" + str);
        if (str == null) {
            MAPLog.w(str2, "packageName can't be null!");
            return null;
        }
        AppInfo appInfo = getAppInfo(str, context);
        if (appInfo == null) {
            return null;
        }
        return appInfo.getGrantedPermissions();
    }

    @Override // com.amazon.identity.auth.device.appid.AbstractAppIdentifier, com.amazon.identity.auth.device.appid.AppIdentifier
    public String getAppVariantId(String str, Context context) {
        String str2 = LOG_TAG;
        MAPLog.i(str2, "getAppVariantId : packageName=" + str);
        if (str == null) {
            MAPLog.w(str2, "packageName can't be null!");
            return null;
        }
        AppInfo appInfo = getAppInfo(str, context);
        if (appInfo == null) {
            return null;
        }
        return appInfo.getAppVariantId();
    }

    @Override // com.amazon.identity.auth.device.appid.AbstractAppIdentifier, com.amazon.identity.auth.device.appid.AppIdentifier
    public String getPackageName(String str, Context context) {
        return null;
    }

    @Override // com.amazon.identity.auth.device.appid.AbstractAppIdentifier, com.amazon.identity.auth.device.appid.AppIdentifier
    public String getPackageNameByVariant(String str, Context context) {
        return null;
    }

    @Override // com.amazon.identity.auth.device.appid.AbstractAppIdentifier, com.amazon.identity.auth.device.appid.AppIdentifier
    public String[] getPackageNames(String str, Context context) {
        return null;
    }

    public String getRedirectUrl(Context context) {
        return REDIRECT_URI_PREFIX + context.getPackageName();
    }

    public boolean isAPIKeyValidFormat(String str, String str2, Context context) {
        String str3 = LOG_TAG;
        MAPLog.pii(str3, "isAPIKeyValid : packageName=" + str, "apiKey=" + str2);
        if (str == null) {
            MAPLog.w(str3, "packageName can't be null!");
            return false;
        }
        if (str2 != null) {
            return APIKeyDecoder.doDecode(str, str2, false, context) != null;
        }
        MAPLog.w(str3, "apiKey can't be null!");
        return false;
    }
}
