package com.huawei.operation.h5pro;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.operation.R;
import com.huawei.operation.utils.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public class H5DeepLinkUsePermissionsHelper {
    private static final Set<String> SUPPORT_NO_CLOUD_H5_SET;
    private static volatile String[] sOnlySupportedInChinaUrl;
    private static final List<String> ONLY_SUPPORTED_IN_CHINA_H5_PACKAGE_NAME = new ArrayList();
    private static final String[] SUPPORT_CHILD_RULE_PREFIX = {"com.huawei.health.h5.physical-fitness-test", "com.huawei.health.h5.cycle-calendar", "com.huawei.health.h5.weight", "com.huawei.health.h5.dm-ccbk", "com.huawei.health.h5.health-data-subpage", "com.huawei.health.h5.sleepdetection", "com.huawei.health.h5.health-clovers", "com.huawei.health.h5.breath-training"};
    private static final String[] SUPPORT_CHILD_RULE_INCLUDE = {"isComplaint=true"};

    static {
        HashSet hashSet = new HashSet();
        SUPPORT_NO_CLOUD_H5_SET = hashSet;
        sOnlySupportedInChinaUrl = null;
        hashSet.add("com.huawei.health.h5.dm-ccbk");
        hashSet.add("com.huawei.health.h5.health-data-subpage");
        hashSet.add("com.huawei.health.h5.knowledge?h5pro=true&isImmerse&urlType=4&pName=com.huawei.health&path=Knowledge&knowledgeNo=truSleep5");
        hashSet.add("com.huawei.health.h5.health-clovers");
        hashSet.add("com.huawei.health.h5.sleepdetection");
        hashSet.add("com.huawei.health.h5.breath-training");
        hashSet.add("com.huawei.health.h5.knowledge");
    }

    private H5DeepLinkUsePermissionsHelper() {
    }

    public static boolean isOnlySupportedInChina(String str) {
        String strSubstring;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://") || str.startsWith(Constants.PREFIX_FILE)) {
            return isOnlySupportedInChinaUrl(str);
        }
        if (!str.contains("?")) {
            return ONLY_SUPPORTED_IN_CHINA_H5_PACKAGE_NAME.contains(str);
        }
        int iIndexOf = str.indexOf("?");
        if (iIndexOf <= 0) {
            strSubstring = "";
        } else {
            strSubstring = str.substring(0, iIndexOf);
        }
        return ONLY_SUPPORTED_IN_CHINA_H5_PACKAGE_NAME.contains(strSubstring);
    }

    private static boolean isOnlySupportedInChinaUrl(String str) {
        synchronized (H5DeepLinkUsePermissionsHelper.class) {
            if (sOnlySupportedInChinaUrl == null || sOnlySupportedInChinaUrl.length == 0) {
                sOnlySupportedInChinaUrl = BaseApplication.getContext().getResources().getStringArray(R.array.only_supported_in_china_url);
            }
            for (String str2 : sOnlySupportedInChinaUrl) {
                if (str.startsWith(str2)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean isSupportKid(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : SUPPORT_CHILD_RULE_PREFIX) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        for (String str3 : SUPPORT_CHILD_RULE_INCLUDE) {
            if (str.contains(str3)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSupportNoCloud(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<String> it = SUPPORT_NO_CLOUD_H5_SET.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }
}
