package com.amazon.identity.auth.device.appid;

import android.content.Context;
import android.content.pm.PackageManager;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import com.amazon.identity.auth.device.utils.ThirdPartyResourceParser;
import com.amazon.identity.auth.map.device.utils.MAPLog;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractAppIdentifier implements AppIdentifier {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String LOG_TAG = "com.amazon.identity.auth.device.appid.AbstractAppIdentifier";

    private String getAPIKey(String str, Context context) {
        MAPLog.i(LOG_TAG, "Finding API Key for " + str);
        return getResourceParser(context, str).getApiKey();
    }

    @Override // com.amazon.identity.auth.device.appid.AppIdentifier
    public abstract String getAppFamilyId(String str, Context context);

    @Override // com.amazon.identity.auth.device.appid.AppIdentifier
    public AppInfo getAppInfo(String str, Context context) {
        MAPLog.i(LOG_TAG, "getAppInfo : packageName=" + str);
        return getAppInfoFromAPIKey(str, context);
    }

    public AppInfo getAppInfoFromAPIKey(String str, Context context) {
        String str2 = LOG_TAG;
        MAPLog.i(str2, "getAppInfoFromAPIKey : packageName=" + str);
        if (str != null) {
            return APIKeyDecoder.decode(str, getAPIKey(str, context), context);
        }
        MAPLog.w(str2, "packageName can't be null!");
        return null;
    }

    @Override // com.amazon.identity.auth.device.appid.AppIdentifier
    public String getAppLabel(String str, Context context) {
        String str2 = LOG_TAG;
        MAPLog.i(str2, "getAppLabel : packageName=" + str);
        if (str == null) {
            MAPLog.w(str2, "packageName can't be null!");
            return null;
        }
        try {
            return (String) context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
        } catch (PackageManager.NameNotFoundException e) {
            MAPLog.e(LOG_TAG, "" + e.getMessage(), e);
            return null;
        }
    }

    @Override // com.amazon.identity.auth.device.appid.AppIdentifier
    public abstract String getAppVariantId(String str, Context context);

    @Override // com.amazon.identity.auth.device.appid.AppIdentifier
    public abstract String getPackageName(String str, Context context);

    @Override // com.amazon.identity.auth.device.appid.AppIdentifier
    public abstract String getPackageNameByVariant(String str, Context context);

    @Override // com.amazon.identity.auth.device.appid.AppIdentifier
    public abstract String[] getPackageNames(String str, Context context);

    public ThirdPartyResourceParser getResourceParser(Context context, String str) {
        return new ThirdPartyResourceParser(context, str);
    }

    @Override // com.amazon.identity.auth.device.appid.AppIdentifier
    public boolean isAPIKeyValid(Context context) {
        if (context != null) {
            return isAPIKeyValid(context.getPackageName(), context);
        }
        MAPLog.w(LOG_TAG, "context can't be null!");
        return false;
    }

    @Override // com.amazon.identity.auth.device.appid.AppIdentifier
    public boolean isAPIKeyValid(String str, Context context) {
        String str2 = LOG_TAG;
        MAPLog.i(str2, "isAPIKeyValid : packageName=" + str);
        if (str != null) {
            return getAppInfo(str, context) != null;
        }
        MAPLog.w(str2, "packageName can't be null!");
        return false;
    }

    @Override // com.amazon.identity.auth.device.appid.AppIdentifier
    public boolean isAPIKeyValid(String str, String str2, Context context) {
        String str3 = LOG_TAG;
        MAPLog.pii(str3, "isAPIKeyValid : packageName=" + str, "apiKey=" + str2);
        if (str == null) {
            MAPLog.w(str3, "packageName can't be null!");
            return false;
        }
        if (str2 != null) {
            return APIKeyDecoder.decode(str, str2, context) != null;
        }
        MAPLog.w(str3, "apiKey can't be null!");
        return false;
    }
}
