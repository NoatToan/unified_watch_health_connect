package ohos.stage.ability.adapter;

import ohos.ace.adapter.ALog;

/* JADX INFO: loaded from: classes46.dex */
public class AbilityLoader {
    private static final String ABILITY_LOADER_INSTANCE_ID = "100000";
    private static final String LOG_TAG = "AbilityLoader";

    private static native void nativeDispatchOnCreate(String str, String str2);

    private static native void nativeDispatchOnDestroy(String str);

    public AbilityLoader() {
        ALog.i(LOG_TAG, "Constructor called.");
    }

    public static void loadAbility(String str, String str2, String str3, String str4) {
        if (str == null || str.isEmpty()) {
            ALog.e(LOG_TAG, "bundleName is invalid.");
            return;
        }
        if (str2 == null || str2.isEmpty()) {
            ALog.e(LOG_TAG, "moduleName is invalid.");
            return;
        }
        if (str3 == null || str3.isEmpty()) {
            ALog.e(LOG_TAG, "abilityName is invalid.");
            return;
        }
        String str5 = str + ":" + str2 + ":" + str3 + ":100000";
        if (str4 == null) {
            str4 = "";
        }
        nativeDispatchOnCreate(str5, str4);
    }

    public static void unloadAbility(String str, String str2, String str3) {
        if (str == null || str.isEmpty()) {
            ALog.e(LOG_TAG, "bundleName is invalid.");
            return;
        }
        if (str2 == null || str2.isEmpty()) {
            ALog.e(LOG_TAG, "moduleName is invalid.");
            return;
        }
        if (str3 == null || str3.isEmpty()) {
            ALog.e(LOG_TAG, "abilityName is invalid.");
            return;
        }
        nativeDispatchOnDestroy(str + ":" + str2 + ":" + str3 + ":100000");
    }
}
