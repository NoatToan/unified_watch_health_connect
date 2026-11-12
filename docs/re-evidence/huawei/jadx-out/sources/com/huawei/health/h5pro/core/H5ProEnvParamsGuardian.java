package com.huawei.health.h5pro.core;

import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.ext.H5ProResidentExtManager;
import com.huawei.health.h5pro.service.H5ProServiceManager;
import com.huawei.health.h5pro.utils.EnvironmentHelper;
import com.huawei.health.h5pro.utils.GsonUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class H5ProEnvParamsGuardian {
    private H5ProEnvParamsGuardian() {
    }

    public static void restoreFromBundle(Bundle bundle) {
        if (bundle != null) {
            EnvironmentHelper environmentHelper = EnvironmentHelper.getInstance();
            environmentHelper.setBaseUrl(bundle.getString("baseUrl"));
            String string = bundle.getString("specificBaseUrl");
            if (!TextUtils.isEmpty(string)) {
                environmentHelper.setSpecificBaseUrl((Map) GsonUtil.parseJson(string, Map.class));
            }
            H5ProClient.setBuildType(EnvironmentHelper.BuildType.valueOf(bundle.getString("buildType", EnvironmentHelper.BuildType.RELEASE.name())));
            environmentHelper.useHmsLite(bundle.getBoolean("useHmsLite"), bundle.getString("hostAt"));
            environmentHelper.setAccountJsLoginUrl(bundle.getString("accountJsLoginUrl"));
            environmentHelper.setMobileAppEngine(bundle.getBoolean("isMobileAppEngine"));
            environmentHelper.setUserFlag(bundle.getString("userFlag"));
            environmentHelper.setAccountGrsAppName(bundle.getString("ACCOUNT_GRS_APP_NAME_KEY"));
            H5ProServiceManager.getInstance().restoreRegisteredServices(bundle.getStringArray("SERVICE_CLASS"));
            H5ProResidentExtManager.restoreExtApi(bundle.getStringArray("EXT_API_CLASS"));
            H5ProBridgeManager.getInstance().restoreBridgeClasses(bundle.getStringArray("global_bridge_class"));
        }
    }

    public static void saveInBundle(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("IS_TRIGGER_CONFIG_GUARDIAN_KEY", true);
            EnvironmentHelper environmentHelper = EnvironmentHelper.getInstance();
            bundle.putString("baseUrl", environmentHelper.getUrl());
            Map<String, String> specificBaseUrl = environmentHelper.getSpecificBaseUrl();
            if (specificBaseUrl != null && !specificBaseUrl.isEmpty()) {
                bundle.putString("specificBaseUrl", GsonUtil.toJson(specificBaseUrl));
            }
            bundle.putString("buildType", environmentHelper.getBuildType().name());
            bundle.putBoolean("useHmsLite", environmentHelper.isUseHmsLite());
            bundle.putBoolean("isMobileAppEngine", environmentHelper.isMobileAppEngine());
            bundle.putString("hostAt", environmentHelper.getHostAt());
            bundle.putString("accountJsLoginUrl", environmentHelper.getAccountJsLoginUrl());
            bundle.putString("userFlag", environmentHelper.getUserFlag());
            bundle.putString("ACCOUNT_GRS_APP_NAME_KEY", environmentHelper.getAccountGrsAppName());
            bundle.putStringArray("SERVICE_CLASS", H5ProServiceManager.getInstance().getAllRegisteredServices());
            String[] allExtApiClass = H5ProResidentExtManager.getAllExtApiClass();
            if (allExtApiClass != null && allExtApiClass.length > 0) {
                bundle.putStringArray("EXT_API_CLASS", H5ProResidentExtManager.getAllExtApiClass());
            }
            String[] bridgeClassStrings = H5ProBridgeManager.getInstance().getBridgeClassStrings();
            if (bridgeClassStrings == null || bridgeClassStrings.length <= 0) {
                return;
            }
            bundle.putStringArray("global_bridge_class", bridgeClassStrings);
        }
    }
}
